package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.perf.MnnOnceDetectRecord;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ol1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f25455a;
    public static volatile boolean b;
    public static volatile boolean c;
    public static volatile long d;
    public static volatile int e;
    public static volatile long f;
    public static volatile long g;
    public static volatile int h;
    public static volatile int i;
    public static volatile boolean j;
    public static volatile long k;
    public static volatile int l;
    public static volatile long m;
    public static final ol1 INSTANCE = new ol1();
    public static volatile List<MnnOnceDetectRecord> n = new ArrayList();

    static {
        t2o.a(481296684);
    }

    @JvmStatic
    public static final void l(boolean z, boolean z2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b737b76", new Object[]{new Boolean(z), new Boolean(z2), new Long(j2)});
            return;
        }
        if (z) {
            if (z2) {
                l = 0;
                m = 0L;
                k = j2;
            }
        } else if (z2 && !j) {
            m = j2 - d;
            k = j2;
        }
        j = z2;
        f = j2;
        h++;
        if (z2) {
            i++;
        } else {
            l++;
        }
    }

    @JvmStatic
    public static final void p(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("783cba7d", new Object[]{l2});
        } else if (l2 != null) {
            INSTANCE.s();
            d = l2.longValue();
        }
    }

    @JvmStatic
    public static final void q(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df04eca", new Object[]{num});
        } else if (num != null) {
            e = num.intValue();
        }
    }

    @JvmStatic
    public static final void r(boolean z, boolean z2, boolean z3, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57bc4790", new Object[]{new Boolean(z), new Boolean(z2), new Boolean(z3), new Long(j2)});
        } else if (lg4.D()) {
            f25455a = z;
            b = z2;
            c = z3;
            g = j2;
            if (d > 0 && g - d > 0) {
                l43 l43Var = l43.INSTANCE;
                ol1 ol1Var = INSTANCE;
                l43Var.g(ol1Var);
                l43Var.h(ol1Var);
                ol1Var.s();
                return;
            }
            INSTANCE.s();
        }
    }

    public final void a(MnnOnceDetectRecord mnnOnceDetectRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9799c17", new Object[]{this, mnnOnceDetectRecord});
            return;
        }
        ckf.g(mnnOnceDetectRecord, "timeRecord");
        if (mnnOnceDetectRecord.getCostTime() < 5000 && mnnOnceDetectRecord.getCostTime() > 0) {
            ((ArrayList) n).add(mnnOnceDetectRecord);
        }
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ade05a15", new Object[]{this})).intValue();
        }
        return l;
    }

    public final long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("785135fd", new Object[]{this})).longValue();
        }
        return m;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1250bc6", new Object[]{this})).intValue();
        }
        return h;
    }

    public final long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bdff967b", new Object[]{this})).longValue();
        }
        return d;
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f221917", new Object[]{this})).intValue();
        }
        return e;
    }

    public final long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0251cc6", new Object[]{this})).longValue();
        }
        return f;
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd6cd9a7", new Object[]{this})).intValue();
        }
        return i;
    }

    public final long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75bc720f", new Object[]{this})).longValue();
        }
        if (k <= 0) {
            return 0L;
        }
        long j2 = g - k;
        if (j2 <= 0) {
            return 0L;
        }
        return j2;
    }

    public final List<MnnOnceDetectRecord> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("38a29095", new Object[]{this});
        }
        return n;
    }

    public final long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cefb6aca", new Object[]{this})).longValue();
        }
        return g;
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77539b94", new Object[]{this})).booleanValue();
        }
        return b;
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6eaee68", new Object[]{this})).booleanValue();
        }
        return c;
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10dddfd3", new Object[]{this})).booleanValue();
        }
        return f25455a;
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        f25455a = false;
        b = false;
        c = false;
        e = 0;
        d = 0L;
        f = 0L;
        g = 0L;
        h = 0;
        i = 0;
        j = false;
        k = 0L;
        m = 0L;
        l = 0;
        n = new ArrayList();
    }
}
