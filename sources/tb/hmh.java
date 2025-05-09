package tb;

import android.view.Choreographer;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hmh implements lpi, Runnable, Choreographer.FrameCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String c = "LowEndMessageLoopPreparer";
    private static final int d = -1;
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 2;
    private static final int h = 3;
    private static final int i = 4;

    /* renamed from: a  reason: collision with root package name */
    private final dft f20744a;
    private int b = -1;

    public hmh(dft dftVar) {
        this.f20744a = dftVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
        } else if (this.f20744a.getState() == 10) {
            whh.a(c, "LAUNCH.doFrameCallback, interrupted before, do nothing here");
        } else {
            int i2 = this.b;
            if (i2 == 0) {
                w35.a("LAUNCH.doFrameCallback.beforeAction");
                this.f20744a.i().run();
                w35.c();
                this.f20744a.o(this);
                this.b = 1;
            } else if (i2 == 3) {
                this.f20744a.m().run();
                this.b = 4;
                whh.a(c, "finished prepare");
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.f20744a.getState() == 10) {
            whh.a(c, "LAUNCH.mainHandlerCallback, interrupted before, do nothing here");
        } else {
            int i2 = this.b;
            if (i2 == 1) {
                w35.a("LAUNCH.mainHandlerCallback");
                w35.c();
                this.b = 2;
                this.f20744a.o(this);
            } else if (i2 == 2) {
                w35.a("LAUNCH.mainHandlerCallback once again");
                w35.c();
                this.b = 3;
                Choreographer.getInstance().postFrameCallback(this);
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
        int i2 = this.b;
        if (i2 == -1) {
            this.b = 0;
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        sto.d(c, "prepare", i2);
    }
}
