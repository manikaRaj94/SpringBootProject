package com.bugtracking.service.impl;

import com.bugtracking.eniity.Ticket;
import com.bugtracking.repository.TicketRepository;
import com.bugtracking.service.TicketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TicketServiceImpl implements TicketService {
    public static final Logger LOGGER = LoggerFactory.getLogger(TicketServiceImpl.class);

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public List<Ticket> listTicket() {

        LOGGER.info("Get all Ticket ");
        return ticketRepository.findAll();
    }

    @Override
    public Ticket findTicket(long id) {

        LOGGER.info("Get Ticket using id : ", id);
        Optional<Ticket> ticket = ticketRepository.findById(id);
        if(ticket.isPresent())
        {
            Ticket ticket1 = ticket.get();
            return ticket1;
        }
        return null;
    }

    @Override
    public List<Ticket> findTicketByName(String name) {
        LOGGER.info("Get Ticket using Name : ", name);
        return null;
    }

    @Override
    public Ticket save(Ticket ticket) throws Exception{

        LOGGER.info("Save ticket : ", ticket);
        Ticket ticket1 = null;
        ticket1 = ticketRepository.save(ticket);
        return ticket1;

    }

    @Override
    public void delete(long id) {
        LOGGER.info("Delete Ticket using id : ", id);
        ticketRepository.deleteById(id);

    }
}
