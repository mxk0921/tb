package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f7t implements q4e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092404);
        t2o.a(806356474);
    }

    @Override // tb.q4e
    public String getUtdid(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f7eefe9", new Object[]{this, context});
        }
        return UTDevice.getUtdid(context);
    }
}
