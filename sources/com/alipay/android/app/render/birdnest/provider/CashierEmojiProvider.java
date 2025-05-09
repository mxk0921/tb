package com.alipay.android.app.render.birdnest.provider;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CashierEmojiProvider implements BirdNestEngine.EmojiProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ICashierProvider mProvider;

    public CashierEmojiProvider(ICashierProvider iCashierProvider) {
        this.mProvider = iCashierProvider;
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.EmojiProvider
    public String prepareContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ef4d87d", new Object[]{this, str});
        }
        return str;
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.EmojiProvider
    public int renderEmojiReturncount(Context context, SpannableStringBuilder spannableStringBuilder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b923fc35", new Object[]{this, context, spannableStringBuilder, new Integer(i)})).intValue();
        }
        return 0;
    }
}
