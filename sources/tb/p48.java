package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.service.controller.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class p48 implements arb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.arb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a4bacea", new Object[]{this});
        }
        return "Page_TMGDynamic";
    }

    @Override // tb.arb
    public String getContainerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94b5b673", new Object[]{this});
        }
        return a.HOME_TAB_ID_DYNAMIC;
    }

    @Override // tb.arb
    public String getPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c740e914", new Object[]{this});
        }
        return a.HOME_TAB_ID_DYNAMIC;
    }
}
