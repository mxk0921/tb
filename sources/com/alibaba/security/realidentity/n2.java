package com.alibaba.security.realidentity;

import android.content.Context;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface n2 {
    void getRemoteModel(Context context, RPBizConfig rPBizConfig, o2 o2Var);

    void getRemoteSoAsync(o2 o2Var);

    boolean loadRemoteSo();

    boolean needDownloadModel(RPBizConfig rPBizConfig);

    boolean needLoadRemoteSo();
}
