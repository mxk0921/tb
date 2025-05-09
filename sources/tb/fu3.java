package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.utils.EnvironmentUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fu3 implements meb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1021313040);
        t2o.a(1021313041);
    }

    @Override // tb.meb
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6da3a0e0", new Object[]{this, str});
        }
        if (!EnvironmentUtils.isInTaobao()) {
            return js0.b().c(str, true, true);
        }
        return is0.b().c(str);
    }
}
