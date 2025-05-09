package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782402);
    }

    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a7fdb", new Object[]{dinamicXEngine});
            return;
        }
        dinamicXEngine.W0(lz5.DX_EVENT_HREFRESHWIDGETNODE, new g18(new lz5()));
        dinamicXEngine.V0(gm5.DX_PARSER_HICONOVERLAYGETDATA, new h18(new gm5()));
    }
}
