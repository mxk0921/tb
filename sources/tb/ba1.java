package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ba1 implements had {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f16272a;

    static {
        t2o.a(491782591);
        t2o.a(477102089);
    }

    @Override // tb.pad
    public boolean l(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed0191b3", new Object[]{this, view})).booleanValue();
        }
        this.f16272a = view;
        return true;
    }
}
