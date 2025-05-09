package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class leq implements zib {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001503);
        t2o.a(993001474);
    }

    @Override // tb.zib
    public kr1 a(String str, View view, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kr1) ipChange.ipc$dispatch("b4f3ad7c", new Object[]{this, str, view, new Boolean(z), new Integer(i)});
        }
        ckf.g(str, "type");
        ckf.g(view, "view");
        if (ckf.b(str, "sceneHeader")) {
            return new ltg(view, z, i, new zwm(1000, 1001, 1000));
        }
        return null;
    }
}
