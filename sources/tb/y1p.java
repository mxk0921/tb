package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class y1p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f31790a;

    static {
        t2o.a(815793225);
    }

    public y1p(View view) {
        this.f31790a = view;
    }

    public static y1p a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y1p) ipChange.ipc$dispatch("2ee4961d", new Object[]{view});
        }
        return new y1p(view);
    }
}
