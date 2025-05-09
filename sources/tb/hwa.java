package tb;

import android.content.Context;
import android.view.Choreographer;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hwa implements lpi, Runnable, Choreographer.FrameCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String c = "HighEndMessageLoopPreparer";
    private static final int d = -1;
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 2;
    private static final int h = 3;

    /* renamed from: a  reason: collision with root package name */
    private final dft f20926a;
    private int b = -1;

    public hwa(dft dftVar) {
        this.f20926a = dftVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.f20926a.getState() == 10) {
            whh.a(c, "LAUNCH.mainHandlerCallback, interrupted before, do nothing here");
        } else if (this.b == 1) {
            w35.a("LAUNCH.mainHandlerCallback");
            w35.c();
            this.b = 2;
            Choreographer.getInstance().postFrameCallback(this);
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
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        sto.d(c, "prepare", i);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
        } else if (this.f20926a.getState() == 10) {
            whh.a(c, "LAUNCH.doFrameCallback, interrupted before, do nothing here");
        } else {
            int i = this.b;
            if (i == 0) {
                w35.a("LAUNCH.doFrameCallback");
                this.f20926a.i().run();
                w35.c();
                this.f20926a.o(this);
                this.b = 1;
            } else if (i == 2) {
                Context context = this.f20926a.getContext();
                Runnable m = this.f20926a.m();
                if (t.a(context, "ngNextHighEndDuration")) {
                    this.f20926a.k(m, 50L);
                } else if (t.a(context, "ngNextHighEndDuration100")) {
                    this.f20926a.k(m, 100L);
                } else if (t.a(context, "ngNextHighEndDuration200")) {
                    this.f20926a.k(m, 200L);
                } else if (t.a(context, "ngNextHighEndDuration300")) {
                    this.f20926a.k(m, 300L);
                } else {
                    m.run();
                }
                this.b = 3;
                whh.a(c, "finished prepare");
            }
        }
    }
}
