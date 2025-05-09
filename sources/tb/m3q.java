package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class m3q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_CUSTOM = 4;
    public static final int TYPE_DEFAULT = 1;
    public static final int TYPE_FAILED = 3;
    public static final int TYPE_SUCCESS = 2;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements msc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            } else {
                f9v.q(xh8.a(c9x.CART_BIZ_NAME).c("showToastError").message(errorResult.getMsg()));
            }
        }
    }

    public static void a(Context context, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39188c76", new Object[]{context, new Integer(i), str});
        } else {
            b(context, i, str, null);
        }
    }

    public static void b(Context context, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdbc4c0", new Object[]{context, new Integer(i), str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                g0u a2 = g0u.a(str);
                a2.b = 2000.0d;
                if (i == 1) {
                    a2.d = "텪";
                } else if (i == 2) {
                    a2.e = "https://gw.alicdn.com/imgextra/i3/O1CN01jGbZS61RZkzF4hLoJ_!!6000000002126-2-tps-48-48.png";
                } else if (i == 4) {
                    a2.d = str2;
                }
                hji.a().c(a2, new a());
            } catch (Throwable th) {
                f9v.q(xh8.a(c9x.CART_BIZ_NAME).c("showToastError").message(th.getMessage()));
            }
        }
    }
}
