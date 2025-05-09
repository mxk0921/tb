package com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.app.template.FBPlugin;
import com.alipay.android.app.template.FBPluginCtx;
import com.alipay.android.app.template.FBPluginFactory;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class VIFBPluginFactory implements FBPluginFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FingerprintPluginClassName = "com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin";
    public static final String PasswordInputUnifiedPluginClassName = "com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordInputUnifiedPlugin";
    public static final String PasswordPluginWithoutUIClassName = "com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordPluginWithoutUI";
    public static final String PasswordUnifiedPluginNewClassName = "com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew";

    @Override // com.alipay.android.app.template.FBPluginFactory
    public FBPlugin createPluginInstance(Context context, FBPluginCtx fBPluginCtx, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBPlugin) ipChange.ipc$dispatch("aeba1b1d", new Object[]{this, context, fBPluginCtx, map});
        }
        String str = map.get("type");
        if (TextUtils.equals("VIPayPwdView", str)) {
            return getFBPluginByClassName(PasswordInputUnifiedPluginClassName, context, fBPluginCtx, 1);
        }
        if (TextUtils.equals("VIFpView", str)) {
            return getFBPluginByClassName(FingerprintPluginClassName, context, fBPluginCtx, 2);
        }
        if (TextUtils.equals("VIPayPluginView", str)) {
            return getFBPluginByClassName("com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.VIFBUnitedView", context, fBPluginCtx, 3);
        }
        return null;
    }

    public static FBPlugin getFBPluginByClassName(String str, Context context, FBPluginCtx fBPluginCtx, int i) {
        try {
            Object newInstance = Class.forName(str).getConstructor(Context.class, FBPluginCtx.class, Integer.TYPE).newInstance(context, fBPluginCtx, Integer.valueOf(i));
            if (newInstance != null) {
                return (FBPlugin) newInstance;
            }
            return null;
        } catch (Throwable th) {
            VerifyLogCat.w("VIFBPluginFactory", "获取实例失败[" + str + "]", th);
            return null;
        }
    }
}
