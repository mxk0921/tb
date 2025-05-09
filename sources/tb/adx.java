package tb;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class adx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f15688a = true;
    public double b;
    public double c;
    public WeakReference<bbs> d;

    static {
        t2o.a(852492331);
    }

    public final void a(MotionEvent motionEvent) {
        bbs bbsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ad3b64", new Object[]{this, motionEvent});
        } else if (!this.f15688a) {
            WeakReference<bbs> weakReference = this.d;
            if (!(weakReference == null || (bbsVar = weakReference.get()) == null)) {
                ddx.INSTANCE.c(bbsVar);
            }
            this.f15688a = true;
        }
    }

    public final void b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8aab07c", new Object[]{this, motionEvent});
        } else if (motionEvent != null) {
            double x = motionEvent.getX();
            double y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f15688a = false;
                this.b = x;
                this.c = y;
            } else if ((action == 1 || action == 3) && Math.abs(this.b - x) < 2.0d && Math.abs(this.c - y) < 2.0d) {
                a(motionEvent);
            }
        }
    }

    public final void c(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43873ba", new Object[]{this, bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        this.d = new WeakReference<>(bbsVar);
    }
}
