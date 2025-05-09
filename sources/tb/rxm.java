package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rxm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(mdd mddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e32d45d", new Object[]{mddVar});
        }
        return uxm.e(ProcedureGlobal.PROCEDURE_MANAGER.v(mddVar));
    }
}
