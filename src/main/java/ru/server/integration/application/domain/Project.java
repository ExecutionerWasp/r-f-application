package ru.server.integration.application.domain;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * @author Alvin
 **/
@Entity
@Table(name = "projects")
@Data
@Builder
@ToString(of = {"id", "creator", "serviceTypes", "request"})
@NoArgsConstructor
@AllArgsConstructor
public class Project implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User creator;

    @ElementCollection(targetClass = ServiceType.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "service_type", joinColumns = @JoinColumn(name = "project_id"))
    @Enumerated(EnumType.STRING)
    private Set<ServiceType> serviceTypes;
    @Column(length = 5000)
    private String request;

    private LocalDateTime created;
    @Column(length = 1000)
    private String title;
}
