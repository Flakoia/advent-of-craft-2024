import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import workshop.Gift;
import workshop.Status;
import workshop.Workshop;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WorkshopTest {
    private static final String TOY_NAME = "1 Super Nintendo";

    @Test
    void completingAGiftShouldSetItsStatusToProduced() {
        var workshop = new Workshop();
        workshop.addGift(new Gift(TOY_NAME));

        var completedGift =  workshop.completeGift(TOY_NAME);


        assertThat(completedGift)
                .isPresent()
                .get()
                .hasFieldOrPropertyWithValue( "status", Status.PRODUCING);
    }

    @Test
    void completingANonExistingGiftShouldReturnEmpty() {
        var workshop = new Workshop();
        var completedGift = workshop.completeGift("NonExistingToy");

        assertFalse(completedGift.isPresent());
    }
}
