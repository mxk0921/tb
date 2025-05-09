package com.alipay.android.app.template;

import android.view.View;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface ITemplateDisposable extends View.OnKeyListener {
    void destroy();

    int getContextHashCode();

    boolean hiddenKeyboardService(boolean z);

    boolean isDestroyed();
}
