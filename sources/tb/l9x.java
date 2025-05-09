package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.yes;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class l9x implements yes.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.yes.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8375", new Object[]{this});
        } else {
            npp.Companion.b("WeexV2WidgetGroupContentRender onRenderSuccess");
        }
    }

    @Override // tb.yes.a
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("313409ce", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "errorCode");
        ckf.g(str2, "errorMsg");
        npp.Companion.b("WeexV2WidgetGroupContentRender onRenderError");
    }
}
