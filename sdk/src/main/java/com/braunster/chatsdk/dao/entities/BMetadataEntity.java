package com.braunster.chatsdk.dao.entities;

import com.braunster.chatsdk.dao.BMetadata;

/**
 * Created by braunster on 25/06/14.
 */
public class BMetadataEntity extends Entity<BMetadata>{

    public static class Type{
        public static final int NONE = 0;
        public static final int STRING = 1;
        public static final int DATA = 2;
        public static final int IMAGE = 3;
    }


}