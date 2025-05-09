package tb;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class gmr implements rvd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static dgl f20094a;

    static {
        t2o.a(779093226);
        t2o.a(806355781);
    }

    public static void a(cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1381908a", new Object[]{cbaVar});
            return;
        }
        xca.f31296a = iba.v(cbaVar);
        xca.b = iba.f(cbaVar);
        iba.E(cbaVar);
    }

    public ViewGroup b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("ad711da", new Object[]{this, context});
        }
        if (context instanceof Activity) {
            return (ViewGroup) ((Activity) context).findViewById(R.id.taolive_global_layout);
        }
        return null;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[]{this})).intValue();
        }
        if (f20094a == null && gq0.e() != null) {
            f20094a = gq0.e().a();
        }
        dgl dglVar = f20094a;
        if (dglVar != null) {
            return dglVar.f17798a;
        }
        return -1;
    }
}
