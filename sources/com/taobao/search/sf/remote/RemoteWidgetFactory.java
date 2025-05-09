package com.taobao.search.sf.remote;

import android.view.View;
import tb.mzn;
import tb.phw;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface RemoteWidgetFactory {
    phw<?, ? extends View, ?> createRemoteWidget(String str, mzn mznVar);

    void registerRemoteWidget(yko ykoVar);
}
