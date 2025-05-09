package com.uc.webview.internal.interfaces;

import android.webkit.ValueCallback;
import com.uc.webview.base.IExtender;
import com.uc.webview.export.JsPromptResult;
import com.uc.webview.export.JsResult;
import com.uc.webview.export.WebView;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CrExtensionsDelegate implements IExtender {
    public static final int INSTALL_FAILED_BLACK_LISTED = 4;
    public static final int INSTALL_FAILED_DECLINED = 1;
    public static final int INSTALL_FAILED_NONE = 0;
    public static final int INSTALL_FAILED_OTHER = 3;
    public static final int INSTALL_FAILED_UNPACKED = 2;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface ExtenderID {
        public static final int DOWNLOAD_URL = -867324648;
        public static final int HANDLE_EXTENSION_JS_ALERT = -2110423459;
        public static final int HANDLE_EXTENSION_JS_CONFIRM = 976460673;
        public static final int HANDLE_EXTENSION_JS_PROMPT = -563346333;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Instance {
        private static volatile CrExtensionsDelegate sInstance;

        public static CrExtensionsDelegate get() {
            return sInstance;
        }

        public static void set(CrExtensionsDelegate crExtensionsDelegate) {
            sInstance = crExtensionsDelegate;
        }
    }

    public boolean activateWebView(WebView webView, Map<String, Object> map) {
        return false;
    }

    public boolean closePopupPage(Map<String, Object> map) {
        return false;
    }

    public boolean closeSidePanel(Map<String, Object> map) {
        return false;
    }

    public boolean closeWebView(WebView webView, Map<String, Object> map) {
        return false;
    }

    public WebView createWeView(String str, boolean z, Map<String, Object> map) {
        return null;
    }

    public boolean downloadUrl(Map<String, Object> map) {
        return false;
    }

    public boolean handleExtensionJsAlert(String str, String str2, String str3, String str4, JsResult jsResult) {
        return false;
    }

    public boolean handleExtensionJsConfirm(String str, String str2, String str3, String str4, JsResult jsResult) {
        return false;
    }

    public boolean handleExtensionJsPrompt(String str, String str2, String str3, String str4, String str5, JsPromptResult jsPromptResult) {
        return false;
    }

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        switch (i) {
            case ExtenderID.HANDLE_EXTENSION_JS_ALERT /* -2110423459 */:
                if (objArr == null || objArr.length < 5) {
                    return null;
                }
                return Boolean.valueOf(handleExtensionJsAlert((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (JsResult) objArr[4]));
            case ExtenderID.DOWNLOAD_URL /* -867324648 */:
                return Boolean.valueOf(downloadUrl((Map) objArr[0]));
            case ExtenderID.HANDLE_EXTENSION_JS_PROMPT /* -563346333 */:
                if (objArr == null || objArr.length < 6) {
                    return null;
                }
                return Boolean.valueOf(handleExtensionJsPrompt((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (String) objArr[4], (JsPromptResult) objArr[5]));
            case ExtenderID.HANDLE_EXTENSION_JS_CONFIRM /* 976460673 */:
                if (objArr == null || objArr.length < 5) {
                    return null;
                }
                return Boolean.valueOf(handleExtensionJsConfirm((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (JsResult) objArr[4]));
            default:
                return null;
        }
    }

    public boolean openOptionsPage(String str, String str2, String str3, Map<String, Object> map) {
        return false;
    }

    public boolean openPopupPage(String str, String str2, String str3, Map<String, Object> map) {
        return false;
    }

    public boolean openSidePanel(String str, String str2, String str3, WebView webView, boolean z, Map<String, Object> map) {
        return false;
    }

    public boolean openUninstallUrl(String str, Map<String, Object> map) {
        return false;
    }

    public boolean showInstallConfirmDialog(String str, String str2, String[] strArr, String[] strArr2, ValueCallback<Boolean> valueCallback, Map<String, Object> map) {
        return false;
    }

    public boolean showUninstallConfirmDialog(String str, String str2, ValueCallback<Boolean> valueCallback, Map<String, Object> map) {
        return false;
    }

    public void onExtensionInfoChanged(CrExtensionInfo crExtensionInfo) {
    }

    public void onExtensionInstalled(CrExtensionInfo crExtensionInfo) {
    }

    public void onExtensionUninstalled(CrExtensionInfo crExtensionInfo) {
    }

    public void onExtensionUpdated(CrExtensionInfo crExtensionInfo) {
    }

    public void onExtensionInstallFailed(String str, String str2, int i, int i2, String str3, Map<String, Object> map) {
    }
}
