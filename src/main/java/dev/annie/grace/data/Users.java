package dev.annie.grace.data;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    private String name;
    private String password;
    private String email;
    private String address;
    private String phoneNumber;
    private LocalDateTime createdAt;}
