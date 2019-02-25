using System;

public class Player {
   private string _name;

   public Player(string name) {
      this._name = name;
   }

   public string Name {
       get { return this._name; }
       set {
           if (value == null) throw new Exception();
           this._name = value;
       }
   }
}

public class PropertyExample {
   public static void Main() {
      var player = new Player("Commander Keen");
      Console.WriteLine(player.Name);
   }
}