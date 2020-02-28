package ru.server.integration.application.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * @author Alvin
 **/
@Entity
@Table(name = "users")
@Data
@Builder
@ToString(of = {"id", "token", "tokenUpdatedAt", "idAgency", "units", "login"})
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 5L;
    @Id
    private Long id;
    private String token;
    private LocalDateTime tokenUpdatedAt;
    private Boolean idAgency;
    private Integer units;

    private String login;
    private String password;
}
