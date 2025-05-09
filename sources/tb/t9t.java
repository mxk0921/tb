package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import tb.kbn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class t9t implements kbn.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a(gk4<kbn.c, Void> gk4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc0c664", new Object[]{this, gk4Var});
        } else {
            RSoLog.d("TaobaoPreSettleDataProvider,register, no-op");
        }
    }
}
