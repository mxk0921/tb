package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zvs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355802);
    }

    public static DXEngineConfig.b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEngineConfig.b) ipChange.ipc$dispatch("d75fff0b", new Object[]{str});
        }
        if (d4s.e(d4s.SWITCH_ENABLE_T_DX_CONFIG, true)) {
            return new DXEngineConfig.b(str).H(true, true);
        }
        return new DXEngineConfig.b(str);
    }
}
