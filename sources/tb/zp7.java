package tb;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface zp7 {
    @Deprecated
    public static final int EXTREME_HIGH_PRIORITY = 51;
    @Deprecated
    public static final int HIGH_PRIORITY = 34;
    @Deprecated
    public static final int MEDIUM_PRIORITY = 17;

    boolean a(String str, int i, byte[] bArr, int i2, int i3);

    boolean b(Context context);

    void c(int i);

    void clear();

    boolean d();

    long e(String str, int i);

    int[] f(String str);

    t9o get(String str, int i);

    int getPriority();
}
