package br.com.worker.entitie;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "tb_worker")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double dailyIncome;
}
