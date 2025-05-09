package com.alipay.android.app.render.birdnest.provider;

import com.alipay.android.app.cctemplate.utils.DrmUtil;
import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.android.app.render.api.RenderEnv;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CashierSettingProvider implements BirdNestEngine.SettingProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ICashierProvider mProvider;

    public CashierSettingProvider(ICashierProvider iCashierProvider) {
        this.mProvider = iCashierProvider;
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.SettingProvider
    public String getLocale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3440efa9", new Object[]{this});
        }
        return RenderEnv.getLocal();
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.SettingProvider
    public String getRawSwitch(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5265fdf", new Object[]{this, str, str2});
        }
        try {
            return DrmUtil.getRawDrmValueFromKey(this.mProvider.getContext(), str, str2);
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
            return str2;
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.SettingProvider
    public boolean getSwitch(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c2620fd", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        try {
            return DrmUtil.isDrmDegraded(this.mProvider.getContext(), str, z, z);
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
            return z;
        }
    }
}
