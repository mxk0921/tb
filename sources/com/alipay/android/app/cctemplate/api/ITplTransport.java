package com.alipay.android.app.cctemplate.api;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface ITplTransport {
    List<String> fetchTemplates(Map<String, String> map);

    List<String> querySyncTpls(String str);
}
