using UnityEngine;

public class Restart : MonoBehaviour
{
    public GameObject game;
    // Start is called once before the first execution of Update after the MonoBehaviour is created
    void Start()
    {
       
    }

    // Update is called once per frame
    void Update()
    {
        
    }

    public void restart()
    {
        game.GetComponent<GamePlay>().currentHpCult = game.GetComponent<GamePlay>().cultMaxHp;
        game.GetComponent<GamePlay>().currentHpEnemy = game.GetComponent<GamePlay>().enemyMaxHP;
        game.GetComponent<GamePlay>().startTime = Time.time;

        game.GetComponent<GamePlay>().enemyHPSlider.value = game.GetComponent<GamePlay>().currentHpCult;
        game.GetComponent<GamePlay>().cultHPSlider.value = game.GetComponent<GamePlay>().currentHpEnemy;
            
        game.GetComponent<GamePlay>().gameover.SetActive(false);
        game.GetComponent<GamePlay>().victory.SetActive(false);
        
        game.GetComponent<GamePlay>().enabled = true;
    }
}
