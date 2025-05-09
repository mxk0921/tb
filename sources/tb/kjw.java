package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kjw implements izb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(147849244);
        t2o.a(147849225);
    }

    @Override // tb.izb
    public String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e11ddb22", new Object[]{this, context});
        }
        if (context == null) {
            return null;
        }
        boolean b = che.b(context);
        shh.a("getOAID", "isSupported", Boolean.valueOf(b));
        if (!b) {
            return null;
        }
        return che.a(context);
    }
}
