package rest.rest2.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ToDoDTO {

    private String _id;

    private String text;

    @JsonProperty("isCompleted")
    private Boolean isCompleted;

    public ToDoDTO() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("isCompleted")
    public Boolean getIsCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }
}
