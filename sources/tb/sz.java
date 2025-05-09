package tb;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class sz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ViewEngine f28365a;
    public View b;
    public IDMComponent c;

    static {
        t2o.a(157286746);
    }

    public sz(ViewEngine viewEngine) {
        this.f28365a = viewEngine;
    }

    public final void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7099d586", new Object[]{this, iDMComponent});
        } else {
            d(iDMComponent);
        }
    }

    public final View b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("faf2c689", new Object[]{this, viewGroup});
        }
        View e = e(viewGroup);
        this.b = e;
        return e;
    }

    public final View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        return this.b;
    }

    public abstract void d(IDMComponent iDMComponent);

    public abstract View e(ViewGroup viewGroup);

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }
}
