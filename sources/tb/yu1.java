package tb;

import android.app.Activity;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import tb.afx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class yu1 implements DisplayManager.DisplayListener, afx.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NANOS_PER_MS = 1000000;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Activity> f32352a;
    public final WeakReference<vex> b;
    public final int c;
    public volatile float f;
    public final Map<cll, Long> d = new HashMap();
    public boolean e = false;
    public long g = 0;
    public float h = 0.0f;
    public float i = 0.0f;
    public float j = 0.0f;
    public float k = 0.0f;

    public yu1(Activity activity, vex vexVar) {
        Display defaultDisplay;
        this.f32352a = new WeakReference<>(activity);
        this.b = new WeakReference<>(vexVar);
        this.f = 16.666666f;
        WindowManager windowManager = activity.getWindowManager();
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            this.c = defaultDisplay.getDisplayId();
            if (o48.s) {
                this.f = 1000.0f / defaultDisplay.getRefreshRate();
            }
        }
    }

    public static void c(Activity activity, ey9 ey9Var) {
        Window window;
        View decorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867d234c", new Object[]{activity, ey9Var});
        } else if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && decorView.getViewTreeObserver().isAlive() && Build.VERSION.SDK_INT >= 24 && ey9Var != null) {
            window.addOnFrameMetricsAvailableListener(ey9Var, w9a.g().b());
        }
    }

    public static void e(Activity activity, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        ViewTreeObserver g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63efbb3", new Object[]{activity, onScrollChangedListener});
        } else if (activity != null && onScrollChangedListener != null && (g = g(activity)) != null && g.isAlive()) {
            g.addOnScrollChangedListener(onScrollChangedListener);
        }
    }

    public static ViewTreeObserver g(Activity activity) {
        Window window;
        View decorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewTreeObserver) ipChange.ipc$dispatch("e22af0b6", new Object[]{activity});
        }
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    public static void k(Activity activity, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5c745c", new Object[]{activity, onFrameMetricsAvailableListener});
        } else if (onFrameMetricsAvailableListener != null && activity != null && (window = activity.getWindow()) != null && Build.VERSION.SDK_INT >= 24) {
            window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
    }

    public static void m(Activity activity, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        ViewTreeObserver g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fccde156", new Object[]{activity, onScrollChangedListener});
        } else if (activity != null && onScrollChangedListener != null && (g = g(activity)) != null) {
            g.removeOnScrollChangedListener(onScrollChangedListener);
        }
    }

    public void a(int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6018f9d", new Object[]{this, new Integer(i), new Float(f), new Float(f2), new Long(j)});
        } else if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.j += Math.abs(f - this.h);
                    this.k += Math.abs(f2 - this.i);
                    this.h = f;
                    this.i = f2;
                    return;
                } else if (i != 3) {
                    return;
                }
            }
            this.g = 0L;
        } else {
            this.g = j;
            this.h = f;
            this.i = f2;
            this.j = 0.0f;
            this.k = 0.0f;
        }
    }

    public void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b30cd0e", new Object[]{this, activity});
            return;
        }
        DisplayManager displayManager = (DisplayManager) activity.getSystemService("display");
        if (displayManager != null) {
            displayManager.registerDisplayListener(this, w9a.g().b());
            this.e = true;
        }
    }

    public void d(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea7eb39", new Object[]{this, iPage});
        } else if ((iPage instanceof cll) && !((HashMap) this.d).containsKey(iPage)) {
            ((HashMap) this.d).put((cll) iPage, Long.valueOf(System.nanoTime() / 1000000));
        }
    }

    @Override // tb.afx.a
    public void dispatchKeyEvent(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a534d20", new Object[]{this, keyEvent});
        }
    }

    public float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c41fbbfe", new Object[]{this})).floatValue();
        }
        return this.f;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc72903", new Object[]{this});
            return;
        }
        Activity activity = this.f32352a.get();
        if (activity != null && this.e) {
            j(activity);
        }
        vex vexVar = this.b.get();
        if (vexVar != null) {
            vexVar.f(this);
        }
        if (((HashMap) this.d).size() > 0) {
            Iterator it = new HashSet(((HashMap) this.d).keySet()).iterator();
            while (it.hasNext()) {
                cll cllVar = (cll) it.next();
                if (cllVar != null) {
                    l(cllVar);
                }
            }
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        b(this.f32352a.get());
        vex vexVar = this.b.get();
        if (vexVar != null) {
            vexVar.b(this);
        }
    }

    public void j(Activity activity) {
        DisplayManager displayManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d20488b", new Object[]{this, activity});
        } else if (activity != null && (displayManager = (DisplayManager) activity.getSystemService("display")) != null) {
            displayManager.unregisterDisplayListener(this);
        }
    }

    public void l(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3acf0c5c", new Object[]{this, iPage});
        } else if (iPage instanceof cll) {
            ((HashMap) this.d).remove((cll) iPage);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf36749f", new Object[]{this, new Integer(i)});
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i) {
        Activity activity;
        DisplayManager displayManager;
        Display display;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ed5eab", new Object[]{this, new Integer(i)});
        } else if (!o48.r && this.c == i && (activity = this.f32352a.get()) != null && (displayManager = (DisplayManager) activity.getSystemService("display")) != null && (display = displayManager.getDisplay(i)) != null) {
            this.f = (float) (1000.0d / display.getRefreshRate());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548f547f", new Object[]{this, new Integer(i)});
        }
    }
}
