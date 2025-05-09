package com.uc.webview.export;

import android.webkit.WebHistoryItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WebBackForwardList {
    protected android.webkit.WebBackForwardList mList = null;

    public WebHistoryItem createItem(WebHistoryItem webHistoryItem) {
        return null;
    }

    public synchronized int getCurrentIndex() {
        return this.mList.getCurrentIndex();
    }

    public synchronized WebHistoryItem getCurrentItem() {
        WebHistoryItem currentItem = this.mList.getCurrentItem();
        if (currentItem == null) {
            return null;
        }
        return createItem(currentItem);
    }

    public synchronized WebHistoryItem getItemAtIndex(int i) {
        WebHistoryItem itemAtIndex = this.mList.getItemAtIndex(i);
        if (itemAtIndex == null) {
            return null;
        }
        return createItem(itemAtIndex);
    }

    public synchronized int getSize() {
        return this.mList.getSize();
    }

    public synchronized WebBackForwardList clone() {
        return null;
    }
}
