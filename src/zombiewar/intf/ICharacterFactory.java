package zombiewar.intf;

public interface ICharacterFactory{
 
  //Make a character. If type is soldier, return a Solider object.
  public ICharacter make(String type);

}
