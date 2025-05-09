package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vpm.VPMAdapterManager;
import com.taobao.vpm.adapter.IConfigAdapter;
import com.taobao.vpm.utils.VPMConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mow {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba05f321", new Object[0])).booleanValue();
        }
        IConfigAdapter iConfigAdapter = VPMAdapterManager.mConfigAdapter;
        return iConfigAdapter != null && c(iConfigAdapter.getConfig(VPMConstant.VPM_ORANGE_GROUP_NAME, VPMConstant.ORANGE_PUBLISH_ENABLE, "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8989d4d7", new Object[0])).booleanValue();
        }
        IConfigAdapter iConfigAdapter = VPMAdapterManager.mConfigAdapter;
        return iConfigAdapter != null && c(iConfigAdapter.getConfig(VPMConstant.VPM_ORANGE_GROUP_NAME, VPMConstant.ORANGE_ENABLE_VPM, "true"));
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9b32eca", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception unused) {
            return false;
        }
    }
}
