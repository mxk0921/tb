package com.alipay.module.face;

import android.os.Bundle;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.utils.DynamicBundleHelper;
import com.alipay.module.face.helper.FaceCertHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BaseFaceCertModule extends MicroModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public FaceCertHelper mFaceCertHelper;

    public static /* synthetic */ Object ipc$super(BaseFaceCertModule baseFaceCertModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/module/face/BaseFaceCertModule");
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onCreate(String str, String str2, String str3, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3304cdb4", new Object[]{this, str, str2, str3, bundle});
            return;
        }
        VerifyLogCat.d("BaseFaceCertModule", "onCreate" + getModuleName());
        this.mFaceCertHelper = new FaceCertHelper(this, str, str2, str3, bundle);
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        VerifyLogCat.d("BaseFaceCertModule", "onDestroy" + getModuleName());
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        VerifyLogCat.d("BaseFaceCertModule", "onStart" + getModuleName());
        DynamicBundleHelper.injectBundle(getMicroModuleContext().getContext(), DynamicBundleHelper.BUNDLE_KEY_ZFACE);
        this.mFaceCertHelper.a();
    }
}
