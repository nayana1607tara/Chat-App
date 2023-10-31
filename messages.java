package com.example.chatapp;

public class messages {

    String senderID;
    String receiverID;
    long sent_time;
    long delivery_time;
    long seen_time;
    String type;
    String text;

    messages(){
        this.text = "Hi";
    }

    messages(String senderID, String receiverID, long sent_time, long delivery_time, long seen_time, String type, String text){
        this.senderID = senderID;
        this.receiverID = receiverID;
        this.sent_time = sent_time;
        this.delivery_time = delivery_time;
        this.seen_time = seen_time;
        this.type = type;
        this.text = text;
    }

    public String getSenderID() {
        return this.senderID;
    }

    public void setSenderID(String senderID){
        this.senderID = senderID;
    }

    public String getReceiverID(){
        return this.receiverID;
    }

    public void setReceiverID(String receiverID){
        this.receiverID = receiverID;
    }

    public long getSent_time(){
        return this.sent_time;
    }

    public void setSent_time(long sent_time){
        this.sent_time = sent_time;
    }

    public long getDelivery_time(){
        return this.delivery_time;
    }

    public void setDelivery_time(long delivery_time){
        this.delivery_time = delivery_time;
    }

    public long getSeen_time(){
        return this.seen_time;
    }

    public void setSeen_time(long seen_time){
        this.seen_time = seen_time;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getText(){
        return this.text;
    }

    public void setText(String text){
        this.text = text;
    }
    messages mesg1 = new messages();
    // default constructor
    messages mesg2 = new messages("1", "2", 10, 11, 12, "text", "How are you?");
    // parameterized constructor
}
//NayanaTara
