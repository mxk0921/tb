package com.uc.webview.internal.interfaces;

import com.uc.webview.base.IExtender;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IWebSettingsExtension extends IExtender {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface IExtenderID {
        public static final int SET_BUSINESS_MODE = 2;
        public static final int SET_DISABLE_HISTORY_CORS_LIMIT = 1037774376;
        public static final int SET_RENDER_PROC_STRATEGY = 1;
        public static final int SET_TRACING_INFO = 1104114440;
    }

    boolean getKeywordHyperlinkEnabled();

    void setBlockNavigationPattern(int i, String str);

    void setDisableBlinkFeatureStopInBackground(boolean z);

    void setExportWebViewHashCode(int i);

    void setExposeMainFrameCallingStack(boolean z);

    void setForceUserSelect(boolean z);

    void setKeywordHyperlinkEnabled(boolean z);

    void setWebCompassInfo(boolean z, String str);
}
