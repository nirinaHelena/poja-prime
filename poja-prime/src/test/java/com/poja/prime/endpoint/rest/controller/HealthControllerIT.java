package com.poja.prime.endpoint.rest.controller;

import static com.poja.prime.endpoint.rest.controller.HealthController.OK;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.poja.prime.PojaGenerated;
import com.poja.prime.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@PojaGenerated
class HealthControllerIT extends FacadeIT {

  @Autowired HealthController healthController;

  @Test
  void ping() {
    assertEquals("pong", healthController.ping());
  }

  @Test
  void can_read_from_dummy_table() {
    var responseEntity = healthController.dummyTable_should_not_be_empty();
    assertEquals(OK, responseEntity);
  }
}
