package ru.server.integration.application.domain;

import lombok.*;

import java.io.Serializable;

/**
 * @author Alvin
 **/

@Data
@Builder
@ToString(of = {"id", "price", "status", "thread", "refusalReason"})
@NoArgsConstructor
@AllArgsConstructor
public class Lead implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private long price;
    private String status;
    private String thread;
    private String refusalReason;

}
