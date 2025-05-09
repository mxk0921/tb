package tb;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class vba implements ViewTreeObserver.OnGlobalLayoutListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<View> f29906a;
    public boolean b = false;

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("243b1540", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public abstract void b(int i);

    public abstract void c(int i);

    public synchronized void d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a4f257c", new Object[]{this, activity});
        } else if (activity != null) {
            WeakReference<View> weakReference = new WeakReference<>(activity.getWindow().getDecorView());
            this.f29906a = weakReference;
            if (weakReference.get() != null) {
                this.f29906a.get().getViewTreeObserver().addOnGlobalLayoutListener(this);
            }
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5148450", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public synchronized void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a98eee3", new Object[]{this});
            return;
        }
        WeakReference<View> weakReference = this.f29906a;
        if (!(weakReference == null || weakReference.get() == null)) {
            this.f29906a.get().getViewTreeObserver().removeGlobalOnLayoutListener(this);
            this.f29906a = null;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
            return;
        }
        Rect rect = new Rect();
        try {
            this.f29906a.get().getWindowVisibleDisplayFrame(rect);
            int height = this.f29906a.get().getRootView().getHeight() - (rect.bottom - rect.top);
            if (height - 400 > 0) {
                if (!a()) {
                    e(true);
                    c(height);
                }
            } else if (a()) {
                e(false);
                b(height);
            }
        } catch (Throwable unused) {
        }
    }
}
