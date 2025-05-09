package tb;

import android.taobao.windvane.export.network.Request;
import android.taobao.windvane.export.network.b;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class muj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(850395149);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccddc333", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            b.i(new Request.b().l(str).i("GET").f());
        }
    }
}
