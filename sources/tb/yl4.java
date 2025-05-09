package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yl4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782320);
    }

    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a7fdb", new Object[]{dinamicXEngine});
            return;
        }
        dinamicXEngine.W0(ec6.DX_EVENT_SETCONTAINERLEVELFLAG, new g18(new ec6()));
        dinamicXEngine.W0(we0.DX_EVENT_ADDPARAMTONDTARGETURL, new g18(new we0()));
        dinamicXEngine.V0(sk5.DX_PARSER_GETCONTAINERLEVELFLAG, new h18(new sk5()));
    }
}
