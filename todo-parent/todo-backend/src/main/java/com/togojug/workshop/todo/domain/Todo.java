package com.togojug.workshop.todo.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@SuperBuilder
@Table(name = "todo")
public class Todo {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "assignee")
    private String assignee;

    @Column(name = "description")
    private String description;

    @Column(name = "target_date")
    private Date targetDate;

    @Column(name = "is_done")
    private boolean isDone;
}
