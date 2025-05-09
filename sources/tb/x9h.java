package tb;

import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class x9h {
    public static final x9h MIDNIGHT;
    public static final x9h MIN;
    public static final x9h[] e = new x9h[24];

    /* renamed from: a  reason: collision with root package name */
    public final byte f31233a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            x9h[] x9hVarArr = e;
            if (i < x9hVarArr.length) {
                x9hVarArr[i] = new x9h(i, 0, 0, 0);
                i++;
            } else {
                x9h x9hVar = x9hVarArr[0];
                MIDNIGHT = x9hVar;
                MIN = x9hVar;
                return;
            }
        }
    }

    public x9h(int i, int i2, int i3, int i4) {
        this.f31233a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    public static x9h a(int i, int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return e[i];
        }
        return new x9h(i, i2, i3, i4);
    }

    public static x9h b(int i, int i2, int i3) {
        return new x9h(i, i2, i3, 0);
    }

    public static x9h c(int i, int i2, int i3, int i4) {
        return new x9h(i, i2, i3, i4);
    }

    public static x9h d(long j) {
        q7h.b(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return a(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x9h.class != obj.getClass()) {
            return false;
        }
        x9h x9hVar = (x9h) obj;
        if (this.f31233a == x9hVar.f31233a && this.b == x9hVar.b && this.c == x9hVar.c && this.d == x9hVar.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Byte.valueOf(this.f31233a), Byte.valueOf(this.b), Byte.valueOf(this.c), Integer.valueOf(this.d)});
    }
}
