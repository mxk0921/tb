package tb;

import com.alipay.android.msp.framework.okio.SegmentPool;
import javax.annotation.Nullable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class y8p {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public static u8p f31912a;
    public static long b;

    public static void a(u8p u8pVar) {
        if (u8pVar.f != null || u8pVar.g != null) {
            throw new IllegalArgumentException();
        } else if (!u8pVar.d) {
            synchronized (y8p.class) {
                try {
                    long j = b;
                    if (j + 8192 <= SegmentPool.MAX_SIZE) {
                        b = j + 8192;
                        u8pVar.f = f31912a;
                        u8pVar.c = 0;
                        u8pVar.b = 0;
                        f31912a = u8pVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static u8p b() {
        synchronized (y8p.class) {
            try {
                u8p u8pVar = f31912a;
                if (u8pVar == null) {
                    return new u8p();
                }
                f31912a = u8pVar.f;
                u8pVar.f = null;
                b -= 8192;
                return u8pVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
