/*
 * Java port of parts of the ffmpeg Mpeg4 base decoder.
 * Copyright (c) 2003 Jonathan Hueber.
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
package net.sourceforge.jffmpeg.codecs.video.mpeg4.div3.rltables;

/** Intra EL Table
 *
 */
public class IntraRLTableAic extends RLTable {
    
    public IntraRLTableAic() {
        super();
        n    = 102;
        last = 58;
        vlcCodes = new long[][] {
            {  0x2,  2 }, {  0x6,  3 }, {  0xe,  4 }, {  0xc,  5 },
            {  0xd,  5 }, { 0x10,  6 }, { 0x11,  6 }, { 0x12,  6 },
            { 0x16,  7 }, { 0x1b,  8 }, { 0x20,  9 }, { 0x21,  9 },
            { 0x1a,  9 }, { 0x1b,  9 }, { 0x1c,  9 }, { 0x1d,  9 },
            { 0x1e,  9 }, { 0x1f,  9 }, { 0x23, 11 }, { 0x22, 11 },
            { 0x57, 12 }, { 0x56, 12 }, { 0x55, 12 }, { 0x54, 12 },
            { 0x53, 12 }, {  0xf,  4 }, { 0x14,  6 }, { 0x14,  7 },
            { 0x1e,  8 }, {  0xf, 10 }, { 0x21, 11 }, { 0x50, 12 },
            {  0xb,  5 }, { 0x15,  7 }, {  0xe, 10 }, {  0x9, 10 },
            { 0x15,  6 }, { 0x1d,  8 }, {  0xd, 10 }, { 0x51, 12 },
            { 0x13,  6 }, { 0x23,  9 }, {  0x7, 11 }, { 0x17,  7 },
            { 0x22,  9 }, { 0x52, 12 }, { 0x1c,  8 }, {  0xc, 10 },
            { 0x1f,  8 }, {  0xb, 10 }, { 0x25,  9 }, {  0xa, 10 },
            { 0x24,  9 }, {  0x6, 11 }, { 0x21, 10 }, { 0x20, 10 },
            {  0x8, 10 }, { 0x20, 11 }, {  0x7,  4 }, {  0xc,  6 },
            { 0x10,  7 }, { 0x13,  8 }, { 0x11,  9 }, { 0x12,  9 },
            {  0x4, 10 }, { 0x27, 11 }, { 0x26, 11 }, { 0x5f, 12 },
            {  0xf,  6 }, { 0x13,  9 }, {  0x5, 10 }, { 0x25, 11 },
            {  0xe,  6 }, { 0x14,  9 }, { 0x24, 11 }, {  0xd,  6 },
            {  0x6, 10 }, { 0x5e, 12 }, { 0x11,  7 }, {  0x7, 10 },
            { 0x13,  7 }, { 0x5d, 12 }, { 0x12,  7 }, { 0x5c, 12 },
            { 0x14,  8 }, { 0x5b, 12 }, { 0x15,  8 }, { 0x1a,  8 },
            { 0x19,  8 }, { 0x18,  8 }, { 0x17,  8 }, { 0x16,  8 },
            { 0x19,  9 }, { 0x15,  9 }, { 0x16,  9 }, { 0x18,  9 },
            { 0x17,  9 }, {  0x4, 11 }, {  0x5, 11 }, { 0x58, 12 },
            { 0x59, 12 }, { 0x5a, 12 }, {  0x3,  7 },
        };
        table_run = new int[] {
            0,  0,  0,  0,  0,  0,  0,  0,
            0,  0,  0,  0,  0,  0,  0,  0,
            0,  0,  0,  0,  0,  0,  0,  0,
            0,  1,  1,  1,  1,  1,  1,  1,
            2,  2,  2,  2,  3,  3,  3,  3,
            4,  4,  4,  5,  5,  5,  6,  6,
            7,  7,  8,  8,  9,  9, 10, 11,
            12, 13,  0,  0,  0,  0,  0,  0,
            0,  0,  0,  0,  1,  1,  1,  1,
            2,  2,  2,  3,  3,  3,  4,  4,
            5,  5,  6,  6,  7,  7,  8,  9,
            10, 11, 12, 13, 14, 15, 16, 17,
            18, 19, 20, 21, 22, 23,
        };
        table_level = new int[] {
            1,  2,  3,  4,  5,  6,  7,  8,
            9, 10, 11, 12, 13, 14, 15, 16,
            17, 18, 19, 20, 21, 22, 23, 24,
            25,  1,  2,  3,  4,  5,  6,  7,
            1,  2,  3,  4,  1,  2,  3,  4,
            1,  2,  3,  1,  2,  3,  1,  2,
            1,  2,  1,  2,  1,  2,  1,  1,
            1,  1,  1,  2,  3,  4,  5,  6,
            7,  8,  9, 10,  1,  2,  3,  4,
            1,  2,  3,  1,  2,  3,  1,  2,
            1,  2,  1,  2,  1,  2,  1,  1,
            1,  1,  1,  1,  1,  1,  1,  1,
            1,  1,  1,  1,  1,  1,
        };
        calculateStats();
    }
    
}

