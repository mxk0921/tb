package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class imh implements lpi, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String c = "LowEndSkiMessageLoopPreparer";
    private static final int d = -1;
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 2;

    /* renamed from: a  reason: collision with root package name */
    private final dft f21426a;
    private int b = -1;

    public imh(dft dftVar) {
        this.f21426a = dftVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.f21426a.getState() == 10) {
            whh.a(c, "LAUNCH.mainHandlerCallback, interrupted before, do nothing here");
        } else {
            int i = this.b;
            if (i == 0) {
                w35.a("LAUNCH.mainHandlerIdleCallback");
                w35.c();
                this.b = 1;
                this.f21426a.d(this);
            } else if (i == 1) {
                w35.a("LAUNCH.mainHandlerIdleCallback.main.action");
                this.f21426a.i().run();
                this.f21426a.m().run();
                w35.c();
                this.b = 2;
                whh.a(c, "finished prepare");
            }
        }
    }

    @Override // tb.lpi
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1afb60e", new Object[]{this});
            return;
        }
        int i = this.b;
        if (i == -1) {
            this.b = 0;
            mhe.b(c, this, 2000L);
            return;
        }
        sto.d(c, "prepare", i);
    }
}
