package com.example.bestcrmintheuniverse.entities;
public class Notes {
    private Long id;
    private String content;
    private Deal deal;

    public Notes() {
        // Default constructor
    }

    public Notes(Long id, String content, Deal deal) {
        this.id = id;
        this.content = content;
        this.deal = deal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }
}