package com.emse.spring.faircorp.model;
import javax.persistence.*;

//1
//2
@Entity
@Table(name = "RWINDOW")
public class Window {
    //3
    @Id
    @GeneratedValue
    private Long id;

    //4
    @Column(nullable = false, length = 255)
    private String name;

    //5
    @Enumerated(EnumType.STRING)
    private WindowStatus windowStatus;

    @ManyToOne
    private Room room;

    public Window(){
    }

    public Window(String name, WindowStatus status, Room room){
        this.windowStatus = status;
        this.name = name;
        this.room = room;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Room getRoom() {return this.room;}

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public WindowStatus getWindowStatus(){
        return windowStatus;
    }
    public void setWindowStatus(WindowStatus windowStatus){
        this.windowStatus = windowStatus;
    }
}
