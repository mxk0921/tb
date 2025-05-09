package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ccq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(677380244);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("baa56280", new Object[]{this})).booleanValue();
        }
        return acq.x();
    }

    public boolean b(Context context, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88378b48", new Object[]{this, context, strArr})).booleanValue();
        }
        return acq.C(context, strArr);
    }
}
