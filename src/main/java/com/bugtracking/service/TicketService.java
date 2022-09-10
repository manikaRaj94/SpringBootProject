package com.bugtracking.service;

import com.bugtracking.eniity.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> listTicket(); // select * from Ticket

     Ticket findTicket(long id);  // select * from Ticket where id = ?

    List<Ticket> findTicketByName(String name);

    Ticket save(Ticket ticket) throws Exception; // insert into ticket value

    void delete(long id); // delete from ticket where id =?
}
