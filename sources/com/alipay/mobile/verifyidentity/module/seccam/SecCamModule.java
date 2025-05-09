package com.alipay.mobile.verifyidentity.module.seccam;

import android.content.Intent;
import android.os.Bundle;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SecCamModule extends MicroModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_DATA_KEY = "moduleData";
    public final Bundle k = new Bundle();

    public static /* synthetic */ Object ipc$super(SecCamModule secCamModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/module/seccam/SecCamModule");
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onCreate(String str, String str2, String str3, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3304cdb4", new Object[]{this, str, str2, str3, bundle});
            return;
        }
        VerifyLogCat.d("SecCamTAG", "onCreate moduleData: " + str3);
        this.k.putString("moduleData", str3);
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
        VerifyLogCat.d("SecCamTAG", "onStart");
        Bundle bundle = new Bundle();
        Intent intent = new Intent(MicroModuleContext.getInstance().getContext(), SecCamActivity.class);
        Bundle bundle2 = this.k;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        intent.putExtras(bundle);
        getMicroModuleContext().startActivity(this, intent);
    }
}
