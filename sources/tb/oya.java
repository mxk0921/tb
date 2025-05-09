package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class oya {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(452985173);
    }

    public static boolean a(DWContext dWContext, boolean z, boolean z2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a8a5a8f", new Object[]{dWContext, new Boolean(z), new Boolean(z2), str})).booleanValue();
        }
        boolean equals = "true".equals(str);
        if (dWContext == null || !equals) {
            return false;
        }
        if (dWContext.screenType() == DWVideoScreenType.NORMAL) {
            return z;
        }
        if (dWContext.screenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN || dWContext.screenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
            return z2;
        }
        return false;
    }
}
