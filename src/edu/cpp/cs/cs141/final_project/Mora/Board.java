/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodríguez
 *
 * Final Project: Spy Game
 *
 * Create a small, yet interesting, text-based game involving a spy
 * and ninjas.
 *
 * Team Magic!~<3
 * Diana Choi, William Hang, Logan Carichner, Robert Delfin, Mora Labisi
 */
package edu.cpp.cs.cs141.final_project.Mora;

import edu.cpp.cs.cs141.final_project.Hallway;
import edu.cpp.cs.cs141.final_project.Room;
import edu.cpp.cs.cs141.final_project.Square;

/**
 * This class represents the board that the game takes place on. It is
 * composed of the {@link Square} class and its extended classes,
 * {@link Room} and {@link Hallway}.
 *
 * @author Mora Labisi
 */
public class Board {
    /**
     * This is a 2D array that represents {@code this} game {@link Board}.
     * It can be filled with the {@link #fillBoard()} method.
     */
    private Square[][] board;

    /**
     * This {@code final int} holds the size of the {@link #board}.
     */
    final public int SIZE = 9;

    /**
     * This is the constructor for the board.
     */
    public Board(){
        board = new Square[SIZE][SIZE];
    }

    /**
     * This method will fill the {@link #board} with the appropriate
     * {@link Square}s.
     */
    public void fillBoard(){
        for (int i = 0; i < SIZE; ++i){
            for (int j = 0; i < SIZE; ++j){
                if((j == 1 || j == 4 || j == 7) && (i == 1 || i == 4 || i == 7))
                    board[i][j] = new Room();
                board[i][j] = new Hallway();
            }
        }
    }

    /**
     * @return The game {@link #board}
     */
    public Square[][] getBoard(){
        return board;
    }
}