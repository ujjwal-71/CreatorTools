package me.kokostrike.creatortools.config;

import lombok.Data;
import me.kokostrike.creatortools.enums.SafeTimeUnit;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
@Data
public class ConfigSettings {

    private List<String> reminderList;
    private SafeTimeUnit selectedTimeUnit;
    private boolean streamerMode;
    private boolean enableReminders;
    private String splitCharacter;

    private int timeInterval;

    public ConfigSettings(List<String> reminderList, SafeTimeUnit selectedTimeUnit, boolean streamerMode, boolean enableReminders, String splitCharacter, int timeInterval) {
        this.reminderList = reminderList;
        this.selectedTimeUnit = selectedTimeUnit;
        this.streamerMode = streamerMode;
        this.enableReminders = enableReminders;
        this.splitCharacter = splitCharacter;
        this.timeInterval = timeInterval;
    }

    public ConfigSettings() {
        this.reminderList = new ArrayList<>();
        this.selectedTimeUnit = SafeTimeUnit.SECONDS;
        this.streamerMode = false;
        this.enableReminders = false;
        this.splitCharacter = "/";
    }
}
