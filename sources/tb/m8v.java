package tb;

import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import tb.nbv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class m8v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286669);
    }

    public static final void a(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79dba31e", new Object[]{exc});
            return;
        }
        ckf.g(exc, "e");
        if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enableReportTryError", true)) {
            nbv.a a2 = nbv.a.a("CatchError");
            nbv.a(a2.message(exc.getMessage() + "___" + JSON.toJSONString(exc.getStackTrace())).sampling(1.0f));
        }
    }
}
