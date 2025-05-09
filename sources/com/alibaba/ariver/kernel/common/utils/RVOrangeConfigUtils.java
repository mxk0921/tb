package com.alibaba.ariver.kernel.common.utils;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RVOrangeConfigUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(String str, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("870ea00c", new Object[]{str, bool})).booleanValue();
        }
        boolean booleanValue = bool.booleanValue();
        try {
            String config = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig(str, bool.toString());
            if (TextUtils.isEmpty(config)) {
                return booleanValue;
            }
            if (!bool.toString().equals(config)) {
                return !bool.booleanValue();
            }
            return booleanValue;
        } catch (Exception e) {
            e.printStackTrace();
            return booleanValue;
        }
    }

    public static boolean enableCanalDomain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30aa09a7", new Object[0])).booleanValue();
        }
        return a("enableCanalDomain", Boolean.TRUE);
    }

    public static boolean enableIsAddISVHeaderNew() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ccad526", new Object[0])).booleanValue();
        }
        return a("enableIsAddISVHeaderNew", Boolean.TRUE);
    }

    public static boolean enableSkipInstallLocal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fdd94dd", new Object[0])).booleanValue();
        }
        return a("enableSkipInstallLocal", Boolean.TRUE);
    }

    public static boolean fixClearScope() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2fcb887", new Object[0])).booleanValue();
        }
        return a("fixClearScope", Boolean.TRUE);
    }

    public static boolean getSettingNeedAuth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6928c23", new Object[0])).booleanValue();
        }
        return a("getSettingNeedAuth", Boolean.FALSE);
    }
}
