package Coworking.Coworkingspace.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

  @Getter
  @Setter
  @ToString
  @Entity
  @Table (name= "Seat")
public class Seat  implements Serializable {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private long seatId;

    @OneToOne
    @JoinColumn(name = "userId")
    private User userId;

   //@Column(name = "SeatNumber")
   //private String SeatNumber;

    @Column(name = "avaiable")
    private Boolean avaiable;

    public Seat(){

    }

  }
