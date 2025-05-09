package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class yz1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f32425a;

    static {
        t2o.a(245366961);
    }

    public yz1(View view) {
        this.f32425a = view;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
        } else if (this.f32425a != null) {
            b();
            d();
            c();
        }
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();
}
