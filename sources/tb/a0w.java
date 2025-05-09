package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.vpm.adapter.IConfigAdapter;
import com.taobao.vpm.utils.VPMConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a0w implements IConfigAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.vpm.adapter.IConfigAdapter
    public String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        if (TextUtils.isEmpty(str)) {
            return OrangeConfig.getInstance().getConfig(VPMConstant.VPM_ORANGE_GROUP_NAME, str2, str3);
        }
        return OrangeConfig.getInstance().getConfig(str, str2, str3);
    }
}
