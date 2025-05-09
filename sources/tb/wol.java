package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavServiceInterface;
import com.taobao.tao.alipay.export.CashdeskConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wol {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(714080279);
    }

    public static void a(Context context) {
        AliNavServiceInterface c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5326c0cf", new Object[]{context});
        } else if (context != null && (c = xq0.c()) != null) {
            c.a(context).c(CashdeskConstants.ORDER_LIST_URL);
            hh.d(context);
        }
    }
}
