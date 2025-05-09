package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pgi extends sx1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static pgi f;
    public static volatile int g;
    public static volatile int h;

    static {
        t2o.a(774897929);
    }

    public pgi() {
        int i;
        int i2 = 4;
        try {
            i = ew0.u(OrangeConfig.getInstance().getConfig("DWInteractive", "maxPlayerNums", "4"));
        } catch (Throwable unused) {
            i = 4;
        }
        if (i <= 4 && i >= 0) {
            i2 = i;
        }
        g = i2;
        h = g;
    }

    public static /* synthetic */ Object ipc$super(pgi pgiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobaoavsdk/recycle/MediaPlayerManager");
    }

    public static synchronized pgi n() {
        synchronized (pgi.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (pgi) ipChange.ipc$dispatch("a7907674", new Object[0]);
            }
            if (f == null) {
                pgi pgiVar = new pgi();
                f = pgiVar;
                pgiVar.h();
            }
            return f;
        }
    }

    @Override // tb.sx1
    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e19417e", new Object[]{this})).intValue();
        }
        return g;
    }

    @Override // tb.sx1
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af1249c", new Object[]{this});
        } else if (this.f28332a == null) {
            this.f28332a = new ngi(g);
        }
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6faf8bc4", new Object[]{this})).intValue();
        }
        return h;
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c997b328", new Object[]{this, new Integer(i)});
        } else if (g != i) {
            g = i;
            this.f28332a.resize(i);
        }
    }
}
