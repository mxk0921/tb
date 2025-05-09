package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.utils.Global;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class liz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321700);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96f0a036", new Object[]{str})).booleanValue();
        }
        return ABGlobal.isFeatureOpened(Global.getApplication(), "NdTest." + str);
    }
}
