package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d9b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(668991521);
    }

    public boolean a(String str, Context context) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d114e37", new Object[]{this, str, context})).booleanValue();
        }
        if (gqp.a() && !TextUtils.isEmpty(str)) {
            OrangeConfig instance = OrangeConfig.getInstance();
            String str2 = o7r.b;
            String config = instance.getConfig(str2, "startTimeMSec1", null);
            String config2 = OrangeConfig.getInstance().getConfig(str2, "endTimeMSec1", null);
            if (!TextUtils.isEmpty(config) && !TextUtils.isEmpty(config2)) {
                long j2 = -1;
                try {
                    j = Long.parseLong(config);
                    try {
                        j2 = Long.parseLong(config2);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    j = -1;
                }
                if (j >= 0 && j2 >= 0) {
                    long b = iio.b();
                    if (j <= b && j2 >= b) {
                        return jts.b().e(o7r.b, str, lvr.b);
                    }
                }
            }
        }
        return false;
    }
}
