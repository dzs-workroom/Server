package com.shzsoft.model;

import java.util.Objects;


/**
 * Generic configuration settings for a TRANSPORT@Web export wizard.
 **/
public class Element {

    protected Long wizardID = null;
    protected Boolean isAvailable = false;
    protected String wizardName = null;
    protected String wizardType = null;
    protected String code=null;

    protected String targetSystem = null;
    protected String sourceSystem = null;
    protected int optimisticLock;


    
}

