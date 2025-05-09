package com.alipay.android.app.render.api;

import com.alipay.android.app.render.api.ext.BirdNestRender;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CashierRenderFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static BirdNestRender create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestRender) ipChange.ipc$dispatch("c4cc73c4", new Object[0]);
        }
        return new BirdNestRender();
    }
}
