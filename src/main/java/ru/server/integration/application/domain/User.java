package ru.server.integration.application.domain;

import lombok.*;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Set;

/**
 * @author Alvin
 **/

@Data
@Builder
@ToString(of = {"id", "token", "projects"})
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 2L;
    @Id
    private String id;
    private String token;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "project_id")
    private Set<Project> projects;
}
