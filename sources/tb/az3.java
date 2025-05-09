package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class az3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782305);
    }

    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a7fdb", new Object[]{dinamicXEngine});
            return;
        }
        dinamicXEngine.W0(qte.DX_EVENT_INFLOWCOLLECTTAP, new g18(new qte()));
        dinamicXEngine.V0(d7a.DX_PARSER_GETCOLLECTINFO, new h18(new d7a()));
    }
}
