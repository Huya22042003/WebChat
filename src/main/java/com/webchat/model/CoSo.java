package com.webchat.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Table(name = "co_so")
@Entity
public class CoSo implements Serializable {

    @Id
    @Column(length = 10, nullable = false)
    private String maCoSo;

    @Column(length = 50, nullable = false)
    @Nationalized
    private String value;

    @Column(length = 50, nullable = false)
    @Nationalized
    private String tenCoSo;

}