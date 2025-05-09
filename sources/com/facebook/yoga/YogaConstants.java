package com.facebook.yoga;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class YogaConstants {
    public static final float UNDEFINED = Float.NaN;

    static {
        t2o.a(503316493);
    }

    public static float getUndefined() {
        return Float.NaN;
    }

    public static boolean isUndefined(float f) {
        return Float.compare(f, Float.NaN) == 0;
    }

    public static boolean isUndefined(YogaValue yogaValue) {
        return yogaValue.unit == YogaUnit.UNDEFINED;
    }
}
