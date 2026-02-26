using UnityEngine;
using UnityEngine.InputSystem;
using TMPro;
using UnityEngine.UI;


public class gamePlay : MonoBehaviour
{
     public Slider cultHPSlider;

     public Slider enemyHPSlider;

    public int currentHpCult;

    public int currentHpEnemy;

    public int cultMaxHp= 100;

    public int enemyMaxHP = 100;

    public float startTime;

     public TMP_Text playerHp;
     public TMP_Text enemyHP;

    public GameObject gameover;

    public GameObject victory;

    public AudioSource enemyDie;

    public AudioSource cultDie;

    public GameObject audioSoucy;

    // Start is called once before the first execution of Update after the MonoBehaviour is created
    void Start()
    {
        //enemyDie = GameObject.FindGameObjectWithTag("MainCamera").GetComponent<AudioSource>()[1];
        //cultDie = GameObject.FindGameObjectWithTag("MainCamera").GetComponent<AudioSource>()[2];
        startTime = 0.0f;
        currentHpCult = cultMaxHp;
        currentHpEnemy = enemyMaxHP;

playerHp.text = "HP: " + currentHpCult;
enemyHP.text = "HP: " + currentHpEnemy;
        currentHpEnemy = enemyMaxHP;
         cultHPSlider.maxValue = cultMaxHp;

         cultHPSlider.value = cultMaxHp;

         enemyHPSlider.maxValue = enemyMaxHP;

         enemyHPSlider.value = currentHpEnemy;
    }

    // Update is called once per frame
    void Update()
    {
        if(Time.time-startTime >2){
            currentHpCult -= 5;
            cultHPSlider.value = currentHpCult;
            startTime = Time.time;
            playerHp.text = "HP: " + currentHpCult;
            if(currentHpCult <= 0){
                gameover.SetActive(true);
                //cultDie.Play();
                this.enabled = false;
            }
        }

        if(Keyboard.current.spaceKey.wasPressedThisFrame){
            currentHpEnemy -= 10;
            enemyHPSlider.value = currentHpEnemy;
            enemyHP.text = "HP: " + currentHpEnemy;
            if(currentHpEnemy <=0){
                victory.SetActive(true);
                //enemyDie.Play();
                this.enabled = false;
            }
        }
    }
}
