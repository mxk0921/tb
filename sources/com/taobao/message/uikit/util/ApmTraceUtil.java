package com.taobao.message.uikit.util;

import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import tb.snl;
import tb.t2o;
import tb.vxm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ApmTraceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean isClose = "1".equals(OrangeConfig.getInstance().getConfig("mpm_data_switch", "messageApmTrace", "0"));

    public static String getPageSession(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87b5ddd0", new Object[]{fragment});
        }
        return snl.f28161a.i(fragment).b();
    }

    public static void onSubTaskBegin(Fragment fragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe9408c", new Object[]{fragment, str});
        } else if (!isClose) {
            vxm.b.j(fragment).v(str);
        }
    }

    public static void onSubTaskSuccess(Fragment fragment, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c0b0df", new Object[]{fragment, str, map});
        } else if (!isClose) {
            vxm.b.j(fragment).e(str, map);
        }
    }

    public static void onSubTaskBegin(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5191765e", new Object[]{str, str2});
        } else if (!isClose) {
            vxm.b.b(str).v(str2);
        }
    }

    public static void onSubTaskSuccess(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d292274d", new Object[]{str, str2, map});
        } else if (!isClose) {
            vxm.b.b(str).e(str2, map);
        }
    }

    static {
        t2o.a(529531091);
    }
}
