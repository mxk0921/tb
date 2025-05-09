package tb;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rsi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public buc f27585a;
    public float b;
    public float c;
    public final int d;
    public boolean e;
    public boolean f;
    public boolean g = false;
    public final MetaLayout h;
    public boolean i;
    public boolean j;
    public guc k;

    static {
        t2o.a(993001861);
    }

    public rsi(Context context, MetaLayout metaLayout) {
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.h = metaLayout;
    }

    public void a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bb68bd1", new Object[]{this, motionEvent});
        } else if (motionEvent.getAction() == 0) {
            this.e = true;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a77449", new Object[]{this});
            return;
        }
        this.f = true;
        this.i = true;
    }

    public boolean c(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        buc bucVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.f27585a == null) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.i = false;
            this.b = motionEvent.getY();
            this.f = false;
            if (motionEvent.getY() < this.h.getCurrentHeaderHeight()) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.g = z3;
            if (z3 && (bucVar = this.f27585a) != null) {
                bucVar.stopScroll();
            }
            this.c = motionEvent.getY();
            z = true;
        } else {
            this.c = motionEvent.getY();
            if (this.f || Math.abs(this.b - motionEvent.getY()) > this.d) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f = z2;
            z = false;
        }
        if (this.i && this.f) {
            return true;
        }
        if (!this.g || !this.f27585a.onInterceptTouchEvent(motionEvent) || z || !this.f) {
            return false;
        }
        return true;
    }

    public boolean d(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        buc bucVar = this.f27585a;
        if (bucVar == null) {
            return false;
        }
        if (this.i) {
            float y = motionEvent.getY() - this.c;
            this.c = motionEvent.getY();
            View view = this.f27585a.getView();
            view.setTranslationY(Math.max(-this.k.e0(), Math.min(view.getTranslationY() + (y * 0.5f), 0.0f)));
            return true;
        }
        if (this.j) {
            motionEvent.offsetLocation(0.0f, this.h.getHiddenHeight());
        } else {
            motionEvent.offsetLocation(0.0f, -bucVar.Y());
        }
        if (this.e) {
            this.e = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(0);
            this.f27585a.onTouchEvent(obtain);
            obtain.recycle();
        }
        return this.f27585a.onTouchEvent(motionEvent);
    }

    public void e(buc bucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85cadc39", new Object[]{this, bucVar});
        } else {
            this.f27585a = bucVar;
        }
    }

    public void f(guc gucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("444846f7", new Object[]{this, gucVar});
        } else {
            this.k = gucVar;
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa6cf5d", new Object[]{this});
        } else {
            this.j = true;
        }
    }
}
