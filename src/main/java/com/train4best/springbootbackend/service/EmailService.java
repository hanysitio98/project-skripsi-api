package com.train4best.springbootbackend.service;

import com.train4best.springbootbackend.entity.EmailDetails;
public interface EmailService {

    // Method
    // To send a simple email
    String sendSimpleMail(EmailDetails details);

}
