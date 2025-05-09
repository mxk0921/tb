package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class wxd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f30986a;
    public prs c;
    public prs d;
    public Boolean e;
    public boolean b = true;
    public boolean f = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(wxd wxdVar) {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            view.setPivotX(view.getWidth() / 2.0f);
            view.setPivotY(view.getHeight() / 2.0f);
        }
    }

    static {
        t2o.a(815792774);
    }

    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        View d = d(context);
        this.f30986a = d;
        d.addOnLayoutChangeListener(new a(this));
        return this.f30986a;
    }

    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f30986a;
    }

    public abstract void c();

    public abstract View d(Context context);

    public abstract void e(boolean z);

    public abstract void f();

    public void g(float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("829f71e5", new Object[]{this, new Float(f), new Float(f2), new Boolean(z)});
        } else if (!z || !this.f) {
            this.f30986a.setScaleX(f);
            this.f30986a.setScaleY(f2);
        } else {
            this.f30986a.animate().scaleX(f).scaleY(f2);
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4325830", new Object[]{this, new Boolean(z)});
            return;
        }
        Boolean bool = this.e;
        if (bool == null || bool.booleanValue() != z) {
            this.e = Boolean.valueOf(z);
            if (this.b) {
                c();
                this.b = false;
                return;
            }
            e(z);
        }
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bf66921", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void j(prs prsVar, prs prsVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0f7b43", new Object[]{this, prsVar, prsVar2});
            return;
        }
        this.c = prsVar;
        this.d = prsVar2;
        if (!this.b) {
            f();
        }
    }
}
