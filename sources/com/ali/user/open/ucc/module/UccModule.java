package com.ali.user.open.ucc.module;

import android.text.TextUtils;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.util.CommonUtils;
import com.ali.user.open.ucc.UccService;
import com.ali.user.open.ucc.UccServiceImpl;
import com.ali.user.open.ucc.remote.RemoteUccServiceDelegate;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.orange.OrangeConfig;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UccModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(76546154);
    }

    private static boolean handleWebviewDir() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce6af0a7", new Object[0])).booleanValue();
        }
        try {
            return TextUtils.equals("true", OrangeConfig.getInstance().getConfig(LoginSwitch.CONFIG_GROUP_LOGIN, "handleWebviewDir", "true"));
        } catch (Throwable unused) {
            return true;
        }
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        CommonUtils.sendUT("init_step_ucc_init_ucc_module");
        if (ConfigManager.getInstance().isMultiProcessEnable) {
            KernelContext.registerService(new Class[]{UccService.class}, RemoteUccServiceDelegate.getInstance(), null);
        } else {
            KernelContext.registerService(new Class[]{UccService.class}, UccServiceImpl.getInstance(), null);
        }
        ConfigManager.getInstance().handleWebviewDir = handleWebviewDir();
    }
}
