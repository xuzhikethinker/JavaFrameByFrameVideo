/*
 * Java port of ffmpeg mpeg1/2 decoder.
 * Copyright (c) 2003 Jonathan Hueber.
 *
 * Copyright (c) 2000,2001 Fabrice Bellard.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * See Credits file and Readme for details
 */
package net.sourceforge.jffmpeg.codecs.video.mpeg12.rltables;

public class Mpeg1RLTable extends RLTable {
    
    public Mpeg1RLTable() {
        super();
        n = 111;
        last = 111;
        vlcCodes = new long[][]  {
             { 0x3, 2 }, { 0x4, 4 }, { 0x5, 5 }, { 0x6, 7 },
             { 0x26, 8 }, { 0x21, 8 }, { 0xa, 10 }, { 0x1d, 12 },
             { 0x18, 12 }, { 0x13, 12 }, { 0x10, 12 }, { 0x1a, 13 },
             { 0x19, 13 }, { 0x18, 13 }, { 0x17, 13 }, { 0x1f, 14 },
             { 0x1e, 14 }, { 0x1d, 14 }, { 0x1c, 14 }, { 0x1b, 14 },
             { 0x1a, 14 }, { 0x19, 14 }, { 0x18, 14 }, { 0x17, 14 },
             { 0x16, 14 }, { 0x15, 14 }, { 0x14, 14 }, { 0x13, 14 },
             { 0x12, 14 }, { 0x11, 14 }, { 0x10, 14 }, { 0x18, 15 },
             { 0x17, 15 }, { 0x16, 15 }, { 0x15, 15 }, { 0x14, 15 },
             { 0x13, 15 }, { 0x12, 15 }, { 0x11, 15 }, { 0x10, 15 },
             { 0x3, 3 }, { 0x6, 6 }, { 0x25, 8 }, { 0xc, 10 },
             { 0x1b, 12 }, { 0x16, 13 }, { 0x15, 13 }, { 0x1f, 15 },
             { 0x1e, 15 }, { 0x1d, 15 }, { 0x1c, 15 }, { 0x1b, 15 },
             { 0x1a, 15 }, { 0x19, 15 }, { 0x13, 16 }, { 0x12, 16 },
             { 0x11, 16 }, { 0x10, 16 }, { 0x5, 4 }, { 0x4, 7 },
             { 0xb, 10 }, { 0x14, 12 }, { 0x14, 13 }, { 0x7, 5 },
             { 0x24, 8 }, { 0x1c, 12 }, { 0x13, 13 }, { 0x6, 5 },
             { 0xf, 10 }, { 0x12, 12 }, { 0x7, 6 }, { 0x9, 10 },
             { 0x12, 13 }, { 0x5, 6 }, { 0x1e, 12 }, { 0x14, 16 },
             { 0x4, 6 }, { 0x15, 12 }, { 0x7, 7 }, { 0x11, 12 },
             { 0x5, 7 }, { 0x11, 13 }, { 0x27, 8 }, { 0x10, 13 },
             { 0x23, 8 }, { 0x1a, 16 }, { 0x22, 8 }, { 0x19, 16 },
             { 0x20, 8 }, { 0x18, 16 }, { 0xe, 10 }, { 0x17, 16 },
             { 0xd, 10 }, { 0x16, 16 }, { 0x8, 10 }, { 0x15, 16 },
             { 0x1f, 12 }, { 0x1a, 12 }, { 0x19, 12 }, { 0x17, 12 },
             { 0x16, 12 }, { 0x1f, 13 }, { 0x1e, 13 }, { 0x1d, 13 },
             { 0x1c, 13 }, { 0x1b, 13 }, { 0x1f, 16 }, { 0x1e, 16 },
             { 0x1d, 16 }, { 0x1c, 16 }, { 0x1b, 16 },
             { 0x1, 6 }, /* escape */
             { 0x2, 2 }, /* EOB */
        };
        table_run = new int[] {
              0,  0,  0,  0,  0,  0,  0,  0,
              0,  0,  0,  0,  0,  0,  0,  0,
              0,  0,  0,  0,  0,  0,  0,  0,
              0,  0,  0,  0,  0,  0,  0,  0,
              0,  0,  0,  0,  0,  0,  0,  0,
              1,  1,  1,  1,  1,  1,  1,  1,
              1,  1,  1,  1,  1,  1,  1,  1,
              1,  1,  2,  2,  2,  2,  2,  3,
              3,  3,  3,  4,  4,  4,  5,  5,
              5,  6,  6,  6,  7,  7,  8,  8,
              9,  9, 10, 10, 11, 11, 12, 12,
             13, 13, 14, 14, 15, 15, 16, 16,
             17, 18, 19, 20, 21, 22, 23, 24,
             25, 26, 27, 28, 29, 30, 31,
              0, /* escape */
              127 /* EOB */
            };
        table_level = new int[] {
              1,  2,  3,  4,  5,  6,  7,  8,
              9, 10, 11, 12, 13, 14, 15, 16,
             17, 18, 19, 20, 21, 22, 23, 24,
             25, 26, 27, 28, 29, 30, 31, 32,
             33, 34, 35, 36, 37, 38, 39, 40,
              1,  2,  3,  4,  5,  6,  7,  8,
              9, 10, 11, 12, 13, 14, 15, 16,
             17, 18,  1,  2,  3,  4,  5,  1,
              2,  3,  4,  1,  2,  3,  1,  2,
              3,  1,  2,  3,  1,  2,  1,  2,
              1,  2,  1,  2,  1,  2,  1,  2,
              1,  2,  1,  2,  1,  2,  1,  2,
              1,  1,  1,  1,  1,  1,  1,  1,
              1,  1,  1,  1,  1,  1,  1,
              0, /* escape */
              127 /* EOB */
            };
        calculateStats();
    }
    
}

