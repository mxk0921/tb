package tb;

import android.graphics.PointF;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nc6 implements sb6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public PointF f24635a;
    public sb6 b;
    public boolean c = true;

    static {
        t2o.a(444597650);
        t2o.a(444597644);
    }

    @Override // tb.sb6
    public boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7cd05744", new Object[]{this, view})).booleanValue();
        }
        sb6 sb6Var = this.b;
        if (sb6Var != null) {
            return sb6Var.a(view);
        }
        return ha6.a(view, this.f24635a, this.c);
    }

    @Override // tb.sb6
    public boolean b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d36fa7a4", new Object[]{this, view})).booleanValue();
        }
        sb6 sb6Var = this.b;
        if (sb6Var != null) {
            return sb6Var.b(view);
        }
        return ha6.b(view, this.f24635a);
    }
}
