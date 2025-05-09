package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class wir {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static wir b;

    /* renamed from: a  reason: collision with root package name */
    public g7c f30724a;

    static {
        t2o.a(779093390);
    }

    public static wir a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wir) ipChange.ipc$dispatch("ed0dca27", new Object[0]);
        }
        synchronized (wir.class) {
            try {
                if (b == null) {
                    synchronized (wir.class) {
                        b = new wir();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public g7c b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g7c) ipChange.ipc$dispatch("2def17c5", new Object[]{this});
        }
        return this.f30724a;
    }

    public void c(g7c g7cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4794473f", new Object[]{this, g7cVar});
        } else {
            this.f30724a = g7cVar;
        }
    }
}
