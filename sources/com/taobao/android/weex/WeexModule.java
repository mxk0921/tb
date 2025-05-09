package com.taobao.android.weex;

import java.io.Serializable;
import tb.d7x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface WeexModule extends Serializable {
    void onInit(String str, d7x d7xVar);

    void onJSThreadDestroy();

    void onMainThreadDestroy();
}
