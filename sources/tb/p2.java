package tb;

import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class p2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f25825a;
    public static final p2 UNKNOWN = new p2(0);
    public static final p2 CHINA = new p2(1);
    public static final p2 GERMANY = new p2(2);
    public static final p2 RUSSIA = new p2(3);
    public static final p2 SINGAPORE = new p2(4);

    public p2(int i) {
        this.f25825a = i;
    }

    public final int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p2.class == obj.getClass() && this.f25825a == ((p2) obj).f25825a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return a(Integer.valueOf(this.f25825a));
    }
}
