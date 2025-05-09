package tb;

import android.view.MotionEvent;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.triver.cannal_engine.event.IWidgetTouchEventBridge;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bdx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f16338a = true;
    public double b = vu3.b.GEO_NOT_SUPPORT;
    public double c = vu3.b.GEO_NOT_SUPPORT;
    public WeakReference<App> d;

    public final void a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ad3b64", new Object[]{this, motionEvent});
        } else if (!this.f16338a) {
            if (this.d != null) {
                ((IWidgetTouchEventBridge) RVProxy.get(IWidgetTouchEventBridge.class)).onClick(motionEvent, this.d.get());
            }
            this.f16338a = true;
        }
    }

    public void b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8aab07c", new Object[]{this, motionEvent});
        } else if (motionEvent != null) {
            double x = motionEvent.getX();
            double y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (this.d != null) {
                ((IWidgetTouchEventBridge) RVProxy.get(IWidgetTouchEventBridge.class)).onTouch(motionEvent, this.d.get());
            }
            if (action == 0) {
                this.f16338a = false;
                this.b = x;
                this.c = y;
            } else if ((action == 1 || action == 3) && Math.abs(this.b - x) < 2.0d && Math.abs(this.c - y) < 2.0d) {
                a(motionEvent);
            }
        }
    }

    public void c(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa27c87a", new Object[]{this, app});
        } else {
            this.d = new WeakReference<>(app);
        }
    }
}
