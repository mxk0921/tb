package com.alipay.mobile.monitor.track.spm;

import android.view.View;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface IAutoTrackIntegrator {
    void addPageInfo(String str, PageInfo pageInfo);

    void removePageInfo(String str);

    void tagViewEntityContentId(View view, String str);

    void updatePageInfo(String str, PageInfo pageInfo);
}
