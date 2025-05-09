package com.alipay.mobile.verifyidentity.module.fingerprint;

import android.content.Intent;
import android.os.Bundle;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.PayPwdModule;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.VIFBPluginManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FingerprintModule extends MicroModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FP_IS_IPAY = "isIpay";
    public static final String FP_IS_MSP_USE_PWD = "mspUsePwd";
    public static final String FP_MODULE_DATA_KEY = "fpModuleData";
    public Bundle params = new Bundle();
    public Bundle extParams = new Bundle();

    public static /* synthetic */ Object ipc$super(FingerprintModule fingerprintModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/module/fingerprint/FingerprintModule");
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        VerifyLogCat.i("FingerprintModule", "[FingerprintModule:onStart()]");
        Bundle bundle = new Bundle();
        VerifyLogCat.i("FingerprintModule", "原流程");
        BaseFBPlugin plugin = VIFBPluginManager.getPlugin(getVerifyId(), this.extParams.getString(VIFBPluginManager.KEY_PLUGIN_NAME));
        if (plugin != null) {
            VerifyLogCat.i("FingerprintModule", "FingerprintPlugin Mode!");
            VerifyLogCat.i("DST", "module bind!");
            plugin.bindModule(this, this.params.getString(FP_MODULE_DATA_KEY));
            return;
        }
        Intent intent = new Intent(MicroModuleContext.getInstance().getContext(), FingerprintCheckActivity.class);
        Bundle bundle2 = this.params;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        intent.putExtras(bundle);
        MicroModuleContext.getInstance().setStartActivityMonitor();
        getMicroModuleContext().startActivity(this, intent);
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onCreate(String str, String str2, String str3, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3304cdb4", new Object[]{this, str, str2, str3, bundle});
            return;
        }
        this.params.putString(FP_MODULE_DATA_KEY, str3);
        if (bundle != null) {
            this.params.putBoolean(FP_IS_IPAY, bundle.getBoolean(PayPwdModule.IS_IPAY, false));
        }
        if (bundle != null) {
            this.extParams = bundle;
        }
    }
}
