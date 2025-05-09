package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.IInfoFlowDarkMode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class egt implements IInfoFlowDarkMode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782151);
        t2o.a(486539299);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.IInfoFlowDarkMode
    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8b94ae1", new Object[]{this, context})).booleanValue();
        }
        return war.b(context);
    }
}
