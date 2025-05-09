package com.uc.webview.internal.android;

import android.os.Build;
import com.uc.webview.base.f;
import com.uc.webview.export.WebSettings;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class l extends WebSettings {
    public l(android.webkit.WebSettings webSettings) {
        this.mSettings = webSettings;
    }

    @Override // com.uc.webview.export.WebSettings
    public final int getForceDark() {
        Integer num;
        if (Build.VERSION.SDK_INT < 29 || (num = (Integer) f.a(this.mSettings, "getForceDark")) == null) {
            return 1;
        }
        return num.intValue();
    }

    @Override // com.uc.webview.export.WebSettings
    public final synchronized int getTextZoom() {
        return this.mSettings.getTextZoom();
    }

    @Override // com.uc.webview.export.WebSettings
    public final synchronized void setTextZoom(int i) {
        this.mSettings.setTextZoom(i);
    }

    @Override // com.uc.webview.export.WebSettings
    public final void setForceDark(int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            f.a(this.mSettings, "setForceDark", new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(i)});
        }
    }
}
