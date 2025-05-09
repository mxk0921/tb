package android.taobao.util;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CalledFromWrongThreadException extends RuntimeException {
    static {
        t2o.a(775946257);
    }

    public CalledFromWrongThreadException() {
        super("Only the original thread that created a view hierarchy can touch its views.");
    }
}
