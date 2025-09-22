package com.alerty.app;

public class Action {
    public enum ActionType {
        NO_ACTION,
        ALERT_EMAIL
    }

    public ActionType actionType;
    public String actionBody;

    public Action(ActionType actionType, String actionBody) {
        this.actionType = actionType;
        this.actionBody = actionBody;
    }
}
