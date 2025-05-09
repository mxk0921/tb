package com.facebook.yoga;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class YogaMeasureOutput {
    static {
        t2o.a(503316505);
    }

    public static float getHeight(long j) {
        return Float.intBitsToFloat((int) j);
    }

    public static float getWidth(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static long make(float f, float f2) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        return Float.floatToRawIntBits(f2) | (floatToRawIntBits << 32);
    }

    public static long make(int i, int i2) {
        return make(i, i2);
    }
}
