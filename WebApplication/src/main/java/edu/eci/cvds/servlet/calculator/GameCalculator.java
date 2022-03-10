package edu.eci.cvds.servlet.calculator;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;


import java.util.ArrayList;
import java.util.Random;


@ManagedBean(name = "gameCalculator")
@ApplicationScoped
public class GameCalculator {
    private int numIntentos;
    private boolean gameState;
    private int premio = 100000;
    private int numberGuessing;
    private ArrayList<Integer> intentos;

    public void load(){
        Random r = new Random();
        numberGuessing = r.nextInt(100);
    }
    public void intento(String number){
        try {
            int numero = Integer.parseInt(number);
            intentos.add(numero);
            numIntentos++;
            checkState(numero);
        }
        catch (Exception e){

        }
    }

    private void restart() {

    }

    public void checkState(int check){
        if (check == numberGuessing) gameState = true;
        else {
            gameState = false;
            premio -= 10000;
        }
    }

    public int getNumIntentos() {
        return numIntentos;
    }

    public void setNumIntentos(int numIntentos) {
        this.numIntentos = numIntentos;
    }

    public boolean isGameState() {
        return gameState;
    }

    public void setGameState(boolean gameState) {
        this.gameState = gameState;
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }

    public void CalculadoraBean (String number) {
        try {
            Integer.parseInt(number);
        }
        catch(Exception e) {
            //restart();
        }
    }

}