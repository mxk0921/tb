package com.uc.webview.export.extension;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.webkit.ValueCallback;
import com.uc.webview.base.Log;
import com.uc.webview.export.WebChromeClient;
import com.uc.webview.export.devtools.DevTools;
import com.uc.webview.internal.interfaces.IWebView;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import com.uc.webview.internal.stats.b;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UCExtension {
    public static final int COORDINATE_BASE_MAIN_DOCUMENT = 1;
    public static final int COORDINATE_BASE_WEBVIEW = 0;
    @Deprecated(forRemoval = true, since = "u4 5.0")
    public static final int CORE_STATUS_CHILD_PROCESS_INFO = 2;
    @Deprecated(forRemoval = true, since = "u4 5.0")
    public static final int CORE_STATUS_PROCESS_MODE = 1;
    public static final int EXTEND_INPUT_TYPE_DIGIT = 16777216;
    public static final int EXTEND_INPUT_TYPE_IDCARD = 33554432;
    public static final int EXTEND_INPUT_TYPE_MASK = -16777216;
    public static final int LAYOUT_STYLE_ADAPT_SCREEN = 2;
    public static final int LAYOUT_STYLE_MOBILE_OPTIMUM = 4;
    public static final int LAYOUT_STYLE_ZOOM_OPTIMUM = 1;
    public static final String MOVE_CURSOR_KEY_NEXT_ENABLE = "next_enable";
    public static final String MOVE_CURSOR_KEY_PREVIOUS_ENABLE = "previous_enable";
    public static final String MOVE_CURSOR_KEY_SUCCEED = "succeed";
    public static final int PERFORMANCE_TIMINGS_DATAFORMAT_JSON = 1;
    public static final int PERFORMANCE_TIMINGS_DATAFORMAT_KEY_VALUE = 0;
    public static final int PERFORMANCE_TIMINGS_TYPE_FIRST_SCREEN = 2;
    public static final int PERFORMANCE_TIMINGS_TYPE_STARTUP = 1;
    private static final String TAG = "UCExtension";
    public static final int TYPE_PAGE_STORAGE_ALL = 2;
    public static final int TYPE_PAGE_STORAGE_MHTML = 3;
    public static final int TYPE_PAGE_STORAGE_ONLY_HTML = 0;
    public static final int TYPE_PAGE_STORAGE_PDF = 4;
    public static final int TYPE_PAGE_STORAGE_TEXT = 1;
    public static final int WEB_VIEW_TYPE_EMBEDDED = 1;
    public static final int WEB_VIEW_TYPE_HIDDEN = 5;
    public static final int WEB_VIEW_TYPE_HOME_PAGE = 2;
    public static final int WEB_VIEW_TYPE_NORMAL = 0;
    public static final int WEB_VIEW_TYPE_POPLAYER = 6;
    public static final int WEB_VIEW_TYPE_WEB_WINDOW_PAGE = 4;
    private IWebViewExtension mImpl;
    private PrerenderHandler mPrerenderHandler;
    private TextSelectionExtension mTextSelectionExtension;
    private UCSettings mUCSettings;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface InjectJSProvider {
        public static final int TYPE_HEAD_START = 1;
        public static final int TYPE_HEAD_START_NODES = 16;

        String getJS(int i, String str);
    }

    /* compiled from: Taobao */
    @Deprecated
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnSoftKeyboardListener {
        boolean displaySoftKeyboard(String str, int i, ValueCallback<String> valueCallback);

        boolean hideSoftKeyboard();

        boolean onFinishComposingText();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface TnOptions {
        public static final int BIZ_COMMIT_PRERENDER = 8;
        public static final int BIZ_IS_PRERENDERING = 4;
        public static final int BIZ_NORMAL_LOADING = 16;
        public static final int FIX_START = 32;
        public static final int FIX_T1 = 1;
        public static final int FIX_URL = 2;
        public static final int NONE = 0;
    }

    public UCExtension(IWebView iWebView) {
        IWebViewExtension extension = iWebView.getExtension();
        this.mImpl = extension;
        this.mUCSettings = new UCSettings(extension.getSettingsExtension());
        this.mTextSelectionExtension = new TextSelectionExtension(this.mImpl);
        this.mPrerenderHandler = new PrerenderHandler(this.mImpl);
    }

    public void evaluateJavascriptInAllFrame(String str, ValueCallback<String> valueCallback) {
        this.mImpl.evaluateJavascriptInAllFrame(str, valueCallback);
    }

    public boolean getCurrentPageFullSnapshot(Bitmap.Config config, int i, int i2, ValueCallback<Bitmap> valueCallback) {
        return this.mImpl.getCurrentPageFullSnapshot(config, i, i2, valueCallback);
    }

    public int getCurrentPageId() {
        try {
            Integer num = (Integer) this.mImpl.invoke(IWebViewExtension.IExtenderID.GET_CURRENT_PAGE_ID, null);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public boolean getCurrentPageSnapshot(Rect rect, Rect rect2, Bitmap bitmap, boolean z, int i) {
        return this.mImpl.getCurrentPageSnapshot(rect, rect2, bitmap, z, i);
    }

    public DevTools getDevTools() {
        try {
            return (DevTools) this.mImpl.invoke(2, new Object[0]);
        } catch (Exception e) {
            Log.e("u4 devtools", "getDevTools", e);
            return null;
        }
    }

    public boolean getDomSnapshot(String str, Bitmap.Config config, ValueCallback<Bitmap> valueCallback) {
        return this.mImpl.getDomSnapshot(str, config, valueCallback);
    }

    public int getPageBizMode() {
        try {
            Integer num = (Integer) this.mImpl.invoke(IWebViewExtension.IExtenderID.GET_PAGE_BIZ_MODE, null);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public PrerenderHandler getPrerenderHandler() {
        return this.mPrerenderHandler;
    }

    @Deprecated
    public void getStartupPerformanceStatistics(ValueCallback<String> valueCallback) {
        serializePerformanceTimings(3, 0, valueCallback);
    }

    public TextSelectionExtension getTextSelectionExtension() {
        return this.mTextSelectionExtension;
    }

    public UCSettings getUCSettings() {
        return this.mUCSettings;
    }

    public WebChromeClient getWebChromeClient() {
        return this.mImpl.getWebChromeClient();
    }

    public IWebViewExtension impl() {
        return this.mImpl;
    }

    public boolean isLoadFromCachedPage() {
        return this.mImpl.isLoadFromCachedPage();
    }

    public void markTnStart(long j, int i) {
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i2 >= 0 && i >= 0) {
            HashMap hashMap = new HashMap();
            if (i2 > 0) {
                hashMap.put("FIX_START", String.valueOf(j));
            }
            setStatOptions(i, hashMap);
        }
    }

    public void notifyPreRenderLoadStart() {
        this.mImpl.notifyPreRenderLoadStart();
    }

    public boolean saveWebPage(int i, boolean z, int i2, int i3, ValueCallback<byte[]> valueCallback) {
        if (i == 4) {
            return this.mImpl.saveWebPage(i, z, i2, i3, valueCallback);
        }
        return false;
    }

    public void serializePerformanceTimings(int i, int i2, ValueCallback<String> valueCallback) {
        if (valueCallback != null) {
            b.a(i, i2, valueCallback, this);
        }
    }

    public void setClient(UCClient uCClient) {
        this.mImpl.setClient(uCClient);
    }

    public void setInjectJSProvider(InjectJSProvider injectJSProvider, int i) {
        int i2;
        StringBuilder sb = new StringBuilder("UCExtension#setInjectJSProvider, type=");
        sb.append(i);
        sb.append(", provider=");
        if (injectJSProvider != null) {
            i2 = injectJSProvider.hashCode();
        } else {
            i2 = -1;
        }
        sb.append(i2);
        Log.i("U4_INJECT_JS", sb.toString());
        this.mImpl.setInjectJSProvider(injectJSProvider, i);
    }

    public void setIsPreRender(boolean z) {
        this.mImpl.setIsPreRender(z);
    }

    public void setPageBizMode(int i, int i2) {
        this.mImpl.invoke(IWebViewExtension.IExtenderID.SET_PAGE_BIZ_MODE, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
    }

    public void setSoftKeyboardListener(ISoftKeyboardListener iSoftKeyboardListener) {
        this.mImpl.setSoftKeyboardListener(iSoftKeyboardListener);
    }

    public void setStatOptions(int i, Map<String, String> map) {
        long j;
        if (i >= 0) {
            if (map == null) {
                try {
                    map = new HashMap<>();
                } catch (Exception e) {
                    Log.e("stat", "setStatOptions", e);
                    return;
                }
            }
            if (this.mImpl.invoke(4, new Object[]{Integer.valueOf(i), map}) == null) {
                if (map.containsKey("FIX_START")) {
                    try {
                        j = Long.parseLong(map.get("FIX_START"));
                    } catch (NumberFormatException unused) {
                    }
                    if ((i & 16) != 0 && (i & 8) == 0) {
                        i |= 8;
                    }
                    this.mImpl.markTnStart(j, i);
                }
                j = System.currentTimeMillis();
                if ((i & 16) != 0) {
                    i |= 8;
                }
                this.mImpl.markTnStart(j, i);
            }
        }
    }

    public void createContextSnapshot(ValueCallback<Boolean> valueCallback) {
        try {
            this.mImpl.invoke(1, new Object[]{valueCallback});
        } catch (Exception e) {
            Log.e("v8snapshot", "createContextSnapshot", e);
        }
    }

    public boolean getCurrentPageFullSnapshot(Bitmap.Config config, ValueCallback<Bitmap> valueCallback) {
        return this.mImpl.getCurrentPageFullSnapshot(config, -1, 20000, valueCallback);
    }

    @Deprecated
    public void setSoftKeyboardListener(final OnSoftKeyboardListener onSoftKeyboardListener) {
        setSoftKeyboardListener(new ISoftKeyboardListener() { // from class: com.uc.webview.export.extension.UCExtension.1
            @Override // com.uc.webview.export.extension.ISoftKeyboardListener
            public final boolean displaySoftKeyboard(String str, int i, ValueCallback<String> valueCallback) {
                return onSoftKeyboardListener.displaySoftKeyboard(str, i, valueCallback);
            }

            @Override // com.uc.webview.export.extension.ISoftKeyboardListener
            public final boolean hideSoftKeyboard() {
                return onSoftKeyboardListener.hideSoftKeyboard();
            }

            @Override // com.uc.webview.export.extension.ISoftKeyboardListener
            public final boolean onFinishComposingText() {
                return onSoftKeyboardListener.onFinishComposingText();
            }
        });
    }

    @Deprecated
    public void setSoftKeyboardListener(final com.uc.webview.export.extension.OnSoftKeyboardListener onSoftKeyboardListener) {
        setSoftKeyboardListener(new ISoftKeyboardListener() { // from class: com.uc.webview.export.extension.UCExtension.2
            @Override // com.uc.webview.export.extension.ISoftKeyboardListener
            public final boolean displaySoftKeyboard(String str, int i, ValueCallback<String> valueCallback) {
                return onSoftKeyboardListener.displaySoftKeyboard(str, i, valueCallback);
            }

            @Override // com.uc.webview.export.extension.ISoftKeyboardListener
            public final boolean hideSoftKeyboard() {
                return onSoftKeyboardListener.hideSoftKeyboard();
            }

            @Override // com.uc.webview.export.extension.ISoftKeyboardListener
            public final boolean onFinishComposingText() {
                return onSoftKeyboardListener.onFinishComposingText();
            }
        });
    }

    @Deprecated(forRemoval = true, since = "u4 5.0")
    public void getCoreStatus(int i, ValueCallback<Object> valueCallback) {
    }
}
