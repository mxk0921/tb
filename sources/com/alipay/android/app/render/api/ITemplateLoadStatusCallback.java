package com.alipay.android.app.render.api;

import com.alipay.android.app.render.api.ICashierRender;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface ITemplateLoadStatusCallback {
    boolean onNewBnDeployAskingUserShouldContinue();

    void onTemplateLoadResult(ICashierRender.TemplateLoadStatus templateLoadStatus);
}
