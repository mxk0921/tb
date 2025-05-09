package tb;

import android.content.Context;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.media.miniwindow.FloatWindow;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jo9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FloatWindow f22110a;
    public WindowManager.LayoutParams b;
    public int c;
    public int d;

    static {
        t2o.a(468714545);
    }

    public jo9(Context context) {
        this.f22110a = new FloatWindow(context);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        FloatWindow floatWindow = this.f22110a;
        if (floatWindow != null) {
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) floatWindow.getLayoutParams();
            if (layoutParams != null && this.f22110a.userHasMoved()) {
                ono.h(p91.a(), ip9.SP_KEY_FLOAT_WINDOW_X, layoutParams.x);
                ono.h(p91.a(), ip9.SP_KEY_FLOAT_WINDOW_Y, layoutParams.y);
            }
            this.f22110a.destroy();
        }
    }

    public FloatWindow b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatWindow) ipChange.ipc$dispatch("fe761376", new Object[]{this});
        }
        return this.f22110a;
    }

    public WindowManager.LayoutParams c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager.LayoutParams) ipChange.ipc$dispatch("ecbb7b5d", new Object[]{this});
        }
        if (this.b == null) {
            WindowManager.LayoutParams a2 = ip9.a();
            this.b = a2;
            a2.width = this.c;
            a2.height = this.d;
            int h = pr9.h(p91.a());
            int i = ip9.FLOAT_WINDOW_PADDING;
            int i2 = ip9.FLOAT_WINDOW_BOTTOM_PADDING;
            int min = Math.min(pr9.e(), pr9.f());
            int max = Math.max(pr9.e(), pr9.f());
            int b = ono.b(p91.a(), ip9.SP_KEY_FLOAT_WINDOW_X, 0);
            int b2 = ono.b(p91.a(), ip9.SP_KEY_FLOAT_WINDOW_Y, 0);
            if (b == 0 && b2 == 0) {
                WindowManager.LayoutParams layoutParams = this.b;
                layoutParams.x = (min - this.c) - i;
                layoutParams.y = ((max - h) - this.d) - i2;
            } else {
                WindowManager.LayoutParams layoutParams2 = this.b;
                layoutParams2.x = b;
                layoutParams2.y = b2;
            }
        }
        return this.b;
    }

    public void d(atb atbVar, r8e r8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1b968c1", new Object[]{this, atbVar, r8eVar});
        } else if (atbVar != null) {
            int i = r8eVar.b;
            int i2 = r8eVar.f27190a;
            if (i == 0 || i2 == 0) {
                i = pr9.f();
                i2 = pr9.e();
            }
            int f = (pr9.f() * 4) / 15;
            float f2 = i / i2;
            if (Math.abs(f2 - 0.5625f) < 0.1f) {
                this.c = f;
                this.d = (f / 9) * 16;
            }
            if (Math.abs(f2 - 1.7777778f) < 0.1d) {
                this.c = (f / 9) * 16;
                this.d = f;
            } else if (Math.abs(f2 - 1.0f) < 0.1d) {
                int i3 = (f * 6) / 5;
                this.c = i3;
                this.d = i3;
            } else if (Math.abs(f2 - 0.75f) < 0.1d) {
                this.d = (f / 3) * 4;
                this.c = f;
            }
            atbVar.f(this.c, this.d);
            ViewGroup view = atbVar.getView();
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            FloatWindow floatWindow = this.f22110a;
            if (floatWindow != null) {
                floatWindow.getContentView().addView(view, 0, new ViewGroup.LayoutParams(-2, -2));
            }
        }
    }
}
