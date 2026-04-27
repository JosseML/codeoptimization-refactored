/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.dam.codeoptimization.fantasy;

import es.dam.codeoptimization.PlayerStats;

/**
 * THE CLASS YOU HAVE TO MODIFY
 *
 * @author Jose
 */
public class FantasyPointsCalculator {

    public int calculatePoints(PlayerStats stats) {
        return switch (stats.getPosition()) {
            case "GOALKEEPER" -> calculateGoalkeeperPoints(stats);
            case "DEFENDER" -> calculateDefenderPoints(stats);
            case "MIDFIELDER" -> calculateMidfielderPoints(stats);
            case "FORWARD" -> calculateForwardPoints(stats);
            default -> 0;
        };
    }

    private int calculateGoals(PlayerStats stats) {
        return stats.getGoals() * 5;
    }

    private int calculateAssists(PlayerStats stats) {
        return stats.getAssists() * 6;
    }

    private int calculateGoalkeeperPoints(PlayerStats stats) {
        int points = 0;
        points += calculateGoals(stats);
        points += calculateAssists(stats);
        points += stats.getCleanSheets() * 4;
        return points;
    }

    private int calculateDefenderPoints(PlayerStats stats) {
        int points = 0;
        points += calculateGoals(stats);
        points += calculateAssists(stats);
        points += stats.getCleanSheets() * 4;
        return points;
    }

    private int calculateMidfielderPoints(PlayerStats stats) {
        int points = 0;
        points += calculateGoals(stats);
        points += calculateAssists(stats);
        points += stats.getCleanSheets() * 1;
        return points;
    }

    private int calculateForwardPoints(PlayerStats stats) {
        int points = 0;
        points += calculateGoals(stats);
        points += calculateAssists(stats);
        return points;
    }
}