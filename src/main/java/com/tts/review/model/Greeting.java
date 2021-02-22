package com.tts.review.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//this model will allow us to send a greeting to a user
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Greeting {

    public Greeting(String salutation){
        this.salutation = salutation;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "greeting_id")
    private Long id;
    private String salutation;
}
