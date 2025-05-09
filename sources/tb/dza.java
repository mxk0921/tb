package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBottomH5Fragment;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dza implements zdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public dza(HomeBottomH5Fragment homeBottomH5Fragment) {
    }

    @Override // tb.zdb
    public String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86036ea6", new Object[]{this, str, str2, str3});
        }
        return OrangeConfig.getInstance().getConfig(str, str2, str3);
    }
}
