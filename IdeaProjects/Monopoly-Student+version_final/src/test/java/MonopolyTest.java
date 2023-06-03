import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;

class MonopolyTest {
    Monopoly player = new Monopoly(0);

    @Test
    public void when_die_rolls_are_1_and_2_current_position_should_advance_to_3(){
        //WRITE CODE HERE
        //calls advance
        //calls throwsDice


 Monopoly player1= Mockito.spy(Monopoly.class);
 Mockito.when(player1.throwDie()).thenReturn(1,2);
int advanceposition=player1.advance();
Mockito.verify(player1,times(4)).throwDie();
assertThat(advanceposition,equalTo(3));
    }
    @Test
    public void when_die_rolls_are_3_and_3_advance_should_be_called_again_and_when_1_and_3_are_rolled_current_position_should_be_updated_to_10()
    {
        // WRITE CODE HERE
        Monopoly player1= Mockito.spy(Monopoly.class);
        Mockito.when(player1.throwDie()).thenReturn(3,3,1,3);
        int advanceposition=player1.advance();
        Mockito.verify(player1,times(4)).throwDie();
        assertThat(advanceposition,equalTo(10));
    }

}