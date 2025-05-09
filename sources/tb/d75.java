package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class d75 implements qsb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(451936258);
        t2o.a(452985029);
    }

    public String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f7eefe9", new Object[]{this, context});
        }
        return UTDevice.getUtdid(context);
    }
}
