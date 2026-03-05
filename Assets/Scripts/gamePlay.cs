using UnityEngine;
using UnityEngine.InputSystem;
using UnityEngine.UI;


public class GamePlay : MonoBehaviour
{
     public Slider cultHPSlider;

     public Slider enemyHPSlider;

    public int currentHpCult;

    public int currentHpEnemy;

    public int cultMaxHp= 100;

    public int enemyMaxHP = 100;

    public float startTime;

    public GameObject gameover;

    public GameObject victory;

    public AudioSource enemyDie;

    public AudioSource cultDie;

    // Start is called once before the first execution of Update after the MonoBehaviour is created
    void Start()
    {
        startTime = 0.0f;
        currentHpCult = cultMaxHp;
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
            currentHpCult -= 10;
            cultHPSlider.value = currentHpCult;
            startTime = Time.time;
            if(currentHpCult <= 0){
                gameover.SetActive(true);
                //cultDie.Play();
                this.enabled = false;
            }
        }

        if(Keyboard.current.spaceKey.wasPressedThisFrame){
            currentHpEnemy -= 10;
            enemyHPSlider.value = currentHpEnemy;
            if(currentHpEnemy <=0){
                victory.SetActive(true);
                //enemyDie.Play();
                this.enabled = false;
            }
        }
    }
}
