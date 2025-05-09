package com.alipay.android.app.smartpays.api;

import android.content.Context;
import android.content.res.Resources;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface IResourceProvider {
    Context getContext();

    String getPackageName();

    Resources getResources();
}
