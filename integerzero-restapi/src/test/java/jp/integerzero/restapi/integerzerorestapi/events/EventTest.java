package jp.integerzero.restapi.integerzerorestapi.events;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EventTest {
    @Test
    public void builder() {
        Event event = Event.builder().build();
        assertThat(event).isNotNull();
    }

    @Test
    public void javaBean() {
        // Given
        String event1 = "Event";
        String spring = "Spring";

        // When
        Event event = new Event();
        event.setName(event1);
        event.setDescription(spring);

        // Then
        assertThat(event.getName()).isEqualTo(event1);
        assertThat(event.getDescription()).isEqualTo(spring);
    }
}