package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class xu1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f31608a;
    public final Context b;
    public View c;

    static {
        t2o.a(468713488);
    }

    public xu1(FluidContext fluidContext, Context context) {
        this.f31608a = fluidContext;
        this.b = context;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7f02506", new Object[]{this})).booleanValue();
        }
        View view = this.c;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
