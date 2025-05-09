package com.uc.webview.internal.android;

import com.uc.webview.export.WebBackForwardList;
import com.uc.webview.export.WebHistoryItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class g extends WebBackForwardList {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends WebHistoryItem {
        public a(android.webkit.WebHistoryItem webHistoryItem) {
            this.mItem = webHistoryItem;
        }
    }

    public g(android.webkit.WebBackForwardList webBackForwardList) {
        this.mList = webBackForwardList;
    }

    @Override // com.uc.webview.export.WebBackForwardList
    public final WebHistoryItem createItem(android.webkit.WebHistoryItem webHistoryItem) {
        return new a(webHistoryItem);
    }
}
