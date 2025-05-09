package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class pqs implements ytc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f26243a;
    public final boolean b;
    public boolean c = true;
    public final sra d;

    static {
        t2o.a(993001512);
        t2o.a(993001865);
    }

    public pqs(View view, boolean z) {
        ckf.g(view, "content");
        this.f26243a = view;
        this.b = z;
        this.d = new sra(view, new zwm(zwm.HALF_STICKY.b - 1, 1001, 2000));
    }

    @Override // tb.kcc
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9c42e6", new Object[]{this, new Integer(i)});
        } else {
            this.d.a(i);
        }
    }

    @Override // tb.kcc
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2da086e", new Object[]{this, new Integer(i)});
        } else {
            this.d.b(i);
        }
    }

    @Override // tb.kcc
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86368875", new Object[]{this})).intValue();
        }
        return this.d.c();
    }

    @Override // tb.kcc
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be8e58d9", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.kcc
    public int e(int i, int i2, int i3) {
        boolean z = true;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b8e4ea6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (this.b || getHeight() == 0) {
            return 0;
        }
        int e = this.d.e(i, i2, i3);
        if (c() <= (-getHeight())) {
            z = false;
        }
        if (z != this.c) {
            this.c = z;
            View view = getView();
            if (!z) {
                i4 = 8;
            }
            view.setVisibility(i4);
        }
        return e;
    }

    @Override // tb.ytc
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af5b5a8a", new Object[]{this})).intValue();
        }
        return this.d.f();
    }

    @Override // tb.kcc
    public void g(MetaLayout metaLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc7c587", new Object[]{this, metaLayout});
        }
    }

    @Override // tb.ytc
    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.d.getHeight();
    }

    @Override // tb.kcc
    public zwm getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zwm) ipChange.ipc$dispatch("2e158f9c", new Object[]{this});
        }
        zwm priority = this.d.getPriority();
        ckf.f(priority, "getPriority(...)");
        return priority;
    }

    @Override // tb.ytc
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        View view = this.d.getView();
        ckf.f(view, "getView(...)");
        return view;
    }

    public final View h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1620350c", new Object[]{this});
        }
        return this.f26243a;
    }

    @Override // tb.ytc
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409b0bc", new Object[]{this})).booleanValue();
        }
        return this.d.p();
    }

    @Override // tb.ytc
    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f2365a4", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
