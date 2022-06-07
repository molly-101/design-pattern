package designpatterns._02_structural_patterns._12_proxy._02_after;

public class DefaultGameService implements GameService{
    @Override
    public void startGame() {
        System.out.println("Game is start!!!");
    }
}
