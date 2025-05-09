package tb;

import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class zbx implements TRWidgetInstance.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.e
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94bdd8e2", new Object[]{this, str, str2});
        } else {
            npp.Companion.b(ckf.p("on widget js error : ", str2));
        }
    }
}
