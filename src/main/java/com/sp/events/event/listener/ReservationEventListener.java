package com.sp.events.event.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ReservationEventListener {

    @EventListener
    public void reservationEventHandler(final ReservationEventListener reservationEventListener){

        System.out.println("Event Dinleniyor  : "+reservationEventListener);
    }
}