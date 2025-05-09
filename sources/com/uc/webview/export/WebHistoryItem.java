package com.uc.webview.export;

import android.graphics.Bitmap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WebHistoryItem {
    protected android.webkit.WebHistoryItem mItem = null;

    public Bitmap getFavicon() {
        return this.mItem.getFavicon();
    }

    public String getOriginalUrl() {
        return this.mItem.getOriginalUrl();
    }

    public String getTitle() {
        return this.mItem.getTitle();
    }

    public String getUrl() {
        return this.mItem.getUrl();
    }

    public synchronized WebHistoryItem clone() {
        return null;
    }
}
