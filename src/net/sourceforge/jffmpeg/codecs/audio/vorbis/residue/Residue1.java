/*
 * Java port of ogg demultiplexer.
 * Copyright (c) 2004 Jonathan Hueber.
 *
 * License conditions are the same as OggVorbis.  See README.
 * 1a39e335700bec46ae31a38e2156a898
 */
/********************************************************************
 *                                                                  *
 * THIS FILE IS PART OF THE OggVorbis SOFTWARE CODEC SOURCE CODE.   *
 * USE, DISTRIBUTION AND REPRODUCTION OF THIS LIBRARY SOURCE IS     *
 * GOVERNED BY A BSD-STYLE SOURCE LICENSE INCLUDED WITH THIS SOURCE *
 * IN 'COPYING'. PLEASE READ THESE TERMS BEFORE DISTRIBUTING.       *
 *                                                                  *
 * THE OggVorbis SOURCE CODE IS (C) COPYRIGHT 1994-2002             *
 * by the XIPHOPHORUS Company http://www.xiph.org/                  *
 *                                                                  *
 ********************************************************************/

package net.sourceforge.jffmpeg.codecs.audio.vorbis.residue;

import net.sourceforge.jffmpeg.codecs.audio.vorbis.OggReader;
import net.sourceforge.jffmpeg.codecs.audio.vorbis.CodeBook;

public class Residue1 extends Residue0 {
//    public abstract void look();
//    public abstract void forward();
//    public abstract void inverse();
    /**
     * Overrriden in Residue 1
     */
    protected void decodepart( OggReader oggRead, CodeBook b, 
                               float[] in, int offset, int spp ) {
        b.decodev_add( in, offset, oggRead, spp );
    }
}
