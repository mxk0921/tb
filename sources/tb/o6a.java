package tb;

import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o6a implements View.OnTouchListener, w6a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<View> f25162a;
    public w6a b;
    public boolean c = true;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public final ArrayList<MotionEvent> g = new ArrayList<>();

    static {
        t2o.a(982516218);
        t2o.a(982516219);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
        }
    }

    @Override // tb.w6a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aeceb46", new Object[]{this, new Boolean(z)});
            return;
        }
        w6a w6aVar = this.b;
        if (w6aVar != null) {
            w6aVar.a(z);
        }
        if (this.f25162a != null) {
            this.e = true;
            throw null;
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.g.clear();
        this.c = true;
        this.d = false;
        this.e = false;
    }

    public void d(WeakReference<View> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32831f3e", new Object[]{this, weakReference});
            return;
        }
        this.f25162a = weakReference;
        c();
    }

    public void e(w6a w6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41769c1", new Object[]{this, w6aVar});
        } else {
            this.b = w6aVar;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (this.f25162a == null) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.e = false;
            this.f = false;
        }
        if (!this.e) {
            this.g.add(MotionEvent.obtain(motionEvent));
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.c = true;
            }
            return this.f;
        }
        if (!this.c) {
            this.c = true;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            this.d = true;
            view.dispatchTouchEvent(obtain);
        }
        if (!this.d || motionEvent.getAction() != 3) {
            throw null;
        }
        this.d = false;
        this.f = true;
        return false;
    }
}
