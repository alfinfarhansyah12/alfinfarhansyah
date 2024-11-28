/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpl2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Alfin
 */
public class Task {
    private String name;
    private boolean completed;
    private LocalDateTime lastTime;

    public Task(String name) {
        this.name = name;
        this.completed = false;
        this.lastTime = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    public String getLastTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return lastTime.format(formatter);
    }

    public String getStatus() {
        return completed ? "[Selesai]" : "[Belum]";
    }
}