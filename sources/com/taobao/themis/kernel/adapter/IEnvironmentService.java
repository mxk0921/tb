package com.taobao.themis.kernel.adapter;

import android.app.Application;
import com.taobao.themis.kernel.basic.DefaultAdapterImpl;
import tb.n8s;

/* compiled from: Taobao */
@DefaultAdapterImpl("com.taobao.themis.taobao.env.TBEnvironmentAdapterImpl")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IEnvironmentService extends n8s {
    String getAppName();

    String getAppVersion();

    Application getApplicationContext();
}
