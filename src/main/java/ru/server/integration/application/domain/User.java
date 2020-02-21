package ru.server.integration.application.domain;

import lombok.*;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * @author Alvin
 **/

@Data
@Builder
@ToString(of = {"id", "token", "tokenUpdatedAt", "idAgency", "units"})
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 4L;
    @Id
    private Long id;
    private String token;
    private LocalDateTime tokenUpdatedAt;
    private Boolean idAgency;
    private Integer units;
}
