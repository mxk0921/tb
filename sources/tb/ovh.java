package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlay;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ovh implements cvu<MUSOverlay> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(986710043);
        t2o.a(982516239);
    }

    /* renamed from: c */
    public MUSOverlay d(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSOverlay) ipChange.ipc$dispatch("3f774146", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
        }
        return new MUSOverlay(i, mUSDKInstance);
    }
}
