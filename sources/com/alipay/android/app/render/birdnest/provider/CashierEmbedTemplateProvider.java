package com.alipay.android.app.render.birdnest.provider;

import android.content.Context;
import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CashierEmbedTemplateProvider implements BirdNestEngine.EmbedTemplateProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ICashierProvider mProvider;

    public CashierEmbedTemplateProvider(ICashierProvider iCashierProvider) {
        this.mProvider = iCashierProvider;
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.EmbedTemplateProvider
    public String getTemplate(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe26a945", new Object[]{this, context, str});
        }
        return null;
    }
}
