package com.alibaba.ariver.app.api.ui;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ariver.app.api.Page;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface PageContainer {
    void addRenderView(View view);

    void attachPage(Page page);

    ViewGroup getView();
}
