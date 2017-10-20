package com.example.sri.chatbot;

/**
 * Created by sridhar on 12/10/17.
 */

class ChatMessage {
    private boolean isImage,isMine;
    private String message;

    public ChatMessage(String content,boolean mine,boolean image)
    {
        message = content;
        isMine = mine;
        isImage = image;
    }
    public String getMessage()
    {
        return message;
    }
    public void setMessage(String message)
    {
        this.message = message;
    }
    public boolean getIsMine()
    {
        return isMine;
    }
    public void setIsMine(boolean isMine)
    {
        this.isMine = isMine;
    }
    public boolean getIsImage()
    {
        return isImage;
    }
    public void setIsImage(boolean isImage)
    {
        this.isImage = isImage;
    }
}
