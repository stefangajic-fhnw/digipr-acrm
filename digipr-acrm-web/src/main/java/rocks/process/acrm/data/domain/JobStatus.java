package rocks.process.acrm.data.domain;

/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */


import javax.persistence.Entity;
import javax.persistence.Table;



public enum JobStatus {
    OPEN, IN_PROGRESS, DONE;
}
