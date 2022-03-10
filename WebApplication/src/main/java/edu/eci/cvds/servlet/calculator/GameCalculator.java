package edu.eci.cvds.servlet.calculator;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.swing.JOptionPane;

import java.lang.Math;
import java.util.ArrayList;

import static java.lang.Math.sqrt;


@ManagedBean(name = "gameCalculator")
@ApplicationScoped
public class GameCalculator {
    private int numIntentos;
    private boolean gameState;
    private int premio;
    private ArrayList<Integer> intentos;


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
    /*
    public void guess {

    }

    public void restart{

    }
    */
    public void CalculadoraBean (String number) {
        try {
            Integer.parseInt(number);
        }
        catch(Exception e) {
            //restart();
        }
    }

}