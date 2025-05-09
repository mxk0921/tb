package com.uc.webview.export.extension;

import com.uc.webview.export.WebHistoryItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IBackForwardListListener {
    void onIndexChanged(WebHistoryItem webHistoryItem, int i);

    void onNewHistoryItem(WebHistoryItem webHistoryItem);
}
