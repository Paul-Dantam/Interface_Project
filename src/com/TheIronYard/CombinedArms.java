package com.TheIronYard;

public interface CombinedArms extends OffensiveDoctrine {

  Bomb bomber();




  class Bomb{

      @Override
      public String toString() {
          System.out.println("Incoming!");
      }
  }
}
