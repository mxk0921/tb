package com.alibaba.android.umf.node.service;

import com.alibaba.android.umf.datamodel.UMFBaseIO;
import tb.hz;
import tb.txu;
import tb.v3e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IUMFService<INPUT extends UMFBaseIO, OUTPUT extends UMFBaseIO> {
    void onAfterExecute(OUTPUT output, txu txuVar);

    void onBeforeExecute(INPUT input, txu txuVar);

    void onCreate();

    void onDestroy();

    void onExecute(INPUT input, txu txuVar, hz<OUTPUT> hzVar);

    @Deprecated
    void registerExtension(String str, String str2, int i, v3e v3eVar, Class<? extends v3e> cls);
}
