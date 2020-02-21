package ru.server.integration.application.domain;

import lombok.*;

import java.io.Serializable;

/**
 * @author Alvin
 **/

@Data
@Builder
@ToString(of = {"id", "price", "status", "thread",
                "refusalReason", "clientIP", "userName",
                "userPhone", "question", "fromURL"})
@NoArgsConstructor
@AllArgsConstructor
public class Lead implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String thread;
    private String clientIP;
    private String userName;
    private String userPhone;
    private String question;
    private String fromURL;
    private long price;
    private String status;
    private String refusalReason;

}
