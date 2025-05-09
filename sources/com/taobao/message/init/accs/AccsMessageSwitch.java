package com.taobao.message.init.accs;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ConfigUtil;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AccsMessageSwitch {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(529530929);
    }

    public static String degrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c9a08c3", new Object[0]);
        }
        return ConfigUtil.getValue("mpm_data_switch", "msgChannelReceiverDegradeV2", "0");
    }
}
