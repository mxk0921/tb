package tb;

import android.content.Context;
import com.alibaba.android.triver.base.api.ITriverRemoteProxy;
import com.alibaba.triver.base.taobao.TriverRemoteManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hkz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(843055267);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8838b25", new Object[]{context})).booleanValue();
        }
        return TriverRemoteManager.getInstance().hasInstalled(ITriverRemoteProxy.DependenceMode.TRIVER_ONLY, context);
    }
}
