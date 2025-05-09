package com.alipay.android.app.render.birdnest.provider;

import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.android.app.safepaybase.util.ResUtils;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CashierIdProvider implements BirdNestEngine.IdProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ICashierProvider mProvider;

    public CashierIdProvider(ICashierProvider iCashierProvider) {
        this.mProvider = iCashierProvider;
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.IdProvider
    public int getUniqueResId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4376e2d8", new Object[]{this, str})).intValue();
        }
        return ResUtils.getStringId(str);
    }
}
