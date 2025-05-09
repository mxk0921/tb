package com.alipay.mobile.verifyidentity.module.menu;

import android.content.Intent;
import android.os.Bundle;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.PayPwdModule;
import com.alipay.mobile.verifyidentity.module.menu.ui.MenuActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MenuModule extends MicroModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String ModuleData = "moduleData";
    public Bundle k;
    public boolean l;

    public static /* synthetic */ Object ipc$super(MenuModule menuModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/module/menu/MenuModule");
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            VerifyLogCat.d("MenuModule", "MenuModule onDestroy");
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        VerifyLogCat.d("MenuModule", "MenuModule onStart");
        Intent intent = new Intent(getMicroModuleContext().getContext(), MenuActivity.class);
        intent.putExtras(this.k);
        intent.putExtra(PayPwdModule.IS_IPAY, this.l);
        getMicroModuleContext().startActivity(this, intent);
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onCreate(String str, String str2, String str3, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3304cdb4", new Object[]{this, str, str2, str3, bundle});
            return;
        }
        VerifyLogCat.d("MenuModule", "MenuModule onCreate");
        if (bundle != null) {
            this.l = bundle.getBoolean(PayPwdModule.IS_IPAY, false);
            VerifyLogCat.i("MenuModule", "isPay:" + this.l);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.k = bundle;
        bundle.putString(ModuleData, str3);
    }
}
