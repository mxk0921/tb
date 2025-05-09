package android.taobao.windvane.extra.uc;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVJsBridge;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.widget.EditText;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.GeolocationPermissions;
import com.uc.webview.export.JsPromptResult;
import com.uc.webview.export.JsResult;
import com.uc.webview.export.WebChromeClient;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.StorageUtils;
import org.json.JSONException;
import tb.gtw;
import tb.hzl;
import tb.jpw;
import tb.jrw;
import tb.mrt;
import tb.og8;
import tb.t2o;
import tb.t4p;
import tb.trw;
import tb.v7t;
import tb.vpw;
import tb.wmc;
import tb.x74;
import tb.xee;
import tb.xpw;
import tb.xyl;
import tb.y71;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVUCWebChromeClient extends WebChromeClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FilePathCallbackID = 15;
    private static final String KEY_CANCEL;
    private static final String KEY_CONFIRM;
    private static final String KEY_FROM;
    private static final String TAG = "WVUCWebChromeClient";
    public Context mContext;
    public IWVWebView mWebView = null;
    public ValueCallback<Uri[]> mFilePathCallback = null;

    /* compiled from: Taobao */
    /* renamed from: android.taobao.windvane.extra.uc.WVUCWebChromeClient$12  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static /* synthetic */ class AnonymousClass12 {
        public static final /* synthetic */ int[] $SwitchMap$android$webkit$ConsoleMessage$MessageLevel;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            $SwitchMap$android$webkit$ConsoleMessage$MessageLevel = iArr;
            try {
                iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.LOG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.TIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public WVUCWebChromeClient() {
    }

    public static /* synthetic */ void access$001(WVUCWebChromeClient wVUCWebChromeClient, ValueCallback valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb4ff1f", new Object[]{wVUCWebChromeClient, valueCallback});
        } else {
            super.openFileChooser(valueCallback);
        }
    }

    private void clearCache(WVUCWebView wVUCWebView, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21d6331", new Object[]{this, wVUCWebView, str, str2});
            return;
        }
        final xee xeeVar = (xee) jpw.c().a(xee.class);
        if (xeeVar != null) {
            mrt.a().submit(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebChromeClient.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        xeeVar.clearResource(str, "WindVane", str2);
                    }
                }
            });
        }
        if (wVUCWebView.isCurrentU4()) {
            StorageUtils.removeResourcesFromHttpCache(new String[]{str}, null);
        }
    }

    public static /* synthetic */ Object ipc$super(WVUCWebChromeClient wVUCWebChromeClient, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2015964955:
                super.onReceivedTitle((WebView) objArr[0], (String) objArr[1]);
                return null;
            case -1625848766:
                super.openFileChooser((ValueCallback) objArr[0]);
                return null;
            case -1540056808:
                super.onProgressChanged((WebView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -634514222:
                return new Boolean(super.onConsoleMessage((ConsoleMessage) objArr[0]));
            case 1295923417:
                super.onGeolocationPermissionsShowPrompt((String) objArr[0], (GeolocationPermissions.Callback) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/uc/WVUCWebChromeClient");
        }
    }

    private void reportRuntimeUnexpectedError(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e89d2ae", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        jSONObject.put("errorMessage", (Object) str2);
        y71.commitSuccess("wv_runtime_unexpected_error", jSONObject);
    }

    @Override // com.uc.webview.export.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d3e38d9", new Object[]{this, str, callback});
            return;
        }
        callback.invoke(str, true, false);
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // com.uc.webview.export.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16bdf0ae", new Object[]{this, webView, str, str2, jsResult})).booleanValue();
        }
        if (webView.isDestroied()) {
            v7t.d(TAG, "cannot call [onJsAlert], for webview has been destroyed");
            return true;
        }
        Context a2 = xpw.a(webView.getContext());
        if (!(a2 instanceof Activity) || !((Activity) a2).isFinishing()) {
            try {
                AlertDialog.Builder builder = new AlertDialog.Builder(a2);
                String host = Uri.parse(str).getHost();
                builder.setTitle(KEY_FROM + host).setMessage(str2).setPositiveButton(KEY_CONFIRM, new DialogInterface.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebChromeClient.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        } else {
                            jsResult.confirm();
                        }
                    }
                });
                builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebChromeClient.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        } else {
                            jsResult.cancel();
                        }
                    }
                });
                AlertDialog create = builder.create();
                create.setCanceledOnTouchOutside(false);
                create.show();
            } catch (Throwable th) {
                v7t.d(TAG, th.getMessage());
                jsResult.confirm();
            }
            return true;
        }
        jsResult.confirm();
        return true;
    }

    @Override // com.uc.webview.export.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af8e0ca", new Object[]{this, webView, str, str2, jsResult})).booleanValue();
        }
        if (webView.isDestroied()) {
            v7t.d(TAG, "cannot call [onJsConfirm], for webview has been destroyed");
            return true;
        }
        Context a2 = xpw.a(webView.getContext());
        if (!(a2 instanceof Activity) || !((Activity) a2).isFinishing()) {
            try {
                AlertDialog.Builder builder = new AlertDialog.Builder(a2);
                String host = Uri.parse(str).getHost();
                builder.setTitle(KEY_FROM + host).setMessage(str2).setPositiveButton(KEY_CONFIRM, new DialogInterface.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebChromeClient.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        } else {
                            jsResult.confirm();
                        }
                    }
                }).setNeutralButton(KEY_CANCEL, new DialogInterface.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebChromeClient.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        } else {
                            jsResult.cancel();
                        }
                    }
                });
                builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebChromeClient.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        } else {
                            jsResult.cancel();
                        }
                    }
                });
                AlertDialog create = builder.create();
                create.setCanceledOnTouchOutside(false);
                create.show();
            } catch (Throwable th) {
                v7t.d(TAG, th.getMessage());
                jsResult.confirm();
            }
            return true;
        }
        jsResult.confirm();
        return true;
    }

    @Override // com.uc.webview.export.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4349918", new Object[]{this, webView, new Integer(i)});
        } else {
            super.onProgressChanged(webView, i);
        }
    }

    @Override // com.uc.webview.export.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87d6d0e5", new Object[]{this, webView, str});
        } else if (!gtw.g(str)) {
            super.onReceivedTitle(webView, str);
        } else {
            v7t.i(TAG, "ignore default title : " + str);
        }
    }

    @Override // com.uc.webview.export.WebChromeClient
    public void openFileChooser(final ValueCallback<Uri> valueCallback) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f178442", new Object[]{this, valueCallback});
            return;
        }
        v7t.a(TAG, " openFileChooser");
        if (this.mWebView == null) {
            v7t.d(TAG, "context is null");
            return;
        }
        Context a2 = xpw.a(this.mContext);
        if (a2 instanceof Application) {
            v7t.d(TAG, "context can not be application");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 33) {
                strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE", t4p.CAMERA};
            } else {
                strArr = new String[]{xyl.READ_MEDIA_IMAGES, xyl.READ_MEDIA_VIDEO, t4p.CAMERA};
            }
            hzl.b(a2, strArr).i(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebChromeClient.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    v7t.a(WVUCWebChromeClient.TAG, " openFileChooser permission granted");
                    WVUCWebChromeClient.access$001(WVUCWebChromeClient.this, valueCallback);
                }
            }).h(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebChromeClient.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        v7t.a(WVUCWebChromeClient.TAG, " openFileChooser permission denied");
                    }
                }
            }).d();
        } catch (Exception e) {
            v7t.d(TAG, e.getMessage());
        }
    }

    private boolean tryToUploadTimeout(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("772acd3f", new Object[]{this, str})).booleanValue();
        }
        if (str.startsWith("{\"WVReport.HY_TIMEOUT\":\"")) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (trw.getJsBridgeMonitor() != null) {
                    trw.getJsBridgeMonitor().onJsBridgeReturn(jSONObject.optString("name"), jSONObject.optString("WVReport.HY_TIMEOUT"), "WVReport.HY_TIMEOUT", jSONObject.optString("param"), jSONObject.optString("url"));
                }
                v7t.d(TAG, jSONObject.toString());
                return true;
            } catch (JSONException e) {
                v7t.d(TAG, x74.i(e));
            }
        }
        return false;
    }

    @Override // com.uc.webview.export.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d21149c", new Object[]{this, webView, str, str2, str3, jsPromptResult})).booleanValue();
        }
        if (webView.isDestroied()) {
            v7t.d(TAG, "cannot call [onJsPrompt], for webview has been destroyed");
            return true;
        }
        Context a2 = xpw.a(webView.getContext());
        if ((a2 instanceof Activity) && ((Activity) a2).isFinishing()) {
            jsPromptResult.confirm();
            return true;
        } else if (str3 == null || !str3.equals("wv_hybrid:")) {
            try {
                final EditText editText = new EditText(a2);
                editText.setText(str3);
                String host = Uri.parse(str).getHost();
                AlertDialog.Builder builder = new AlertDialog.Builder(a2);
                AlertDialog create = builder.setTitle(KEY_FROM + host).setView(editText).setMessage(str2).setPositiveButton(KEY_CONFIRM, new DialogInterface.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebChromeClient.10
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        } else if (editText.getText() != null) {
                            jsPromptResult.confirm(editText.getText().toString());
                        } else {
                            jsPromptResult.confirm();
                        }
                    }
                }).setNegativeButton(KEY_CANCEL, new DialogInterface.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebChromeClient.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        } else {
                            jsPromptResult.cancel();
                        }
                    }
                }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebChromeClient.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        } else {
                            jsPromptResult.cancel();
                        }
                    }
                }).create();
                create.setCanceledOnTouchOutside(false);
                create.show();
            } catch (Throwable th) {
                v7t.d(TAG, th.getMessage());
                jsPromptResult.confirm();
            }
            return true;
        } else {
            v7t.d(TAG, "Call from console.prompt");
            WVJsBridge.g().d((IWVWebView) webView, str2, (WVUCWebView) webView);
            jsPromptResult.confirm("");
            return true;
        }
    }

    @Override // com.uc.webview.export.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7acfd427", new Object[]{this, webView, valueCallback, fileChooserParams})).booleanValue();
        }
        v7t.a(TAG, " onShowFileChooser");
        if (!(fileChooserParams == null || valueCallback == null)) {
            this.mFilePathCallback = valueCallback;
            try {
                Intent createIntent = fileChooserParams.createIntent();
                Context a2 = xpw.a(webView.getContext());
                if (a2 instanceof Activity) {
                    ((Activity) a2).startActivityForResult(Intent.createChooser(createIntent, "choose"), 15);
                }
                return true;
            } catch (Throwable th) {
                v7t.d(TAG, th.getMessage());
                th.printStackTrace();
            }
        }
        return false;
    }

    static {
        String str;
        t2o.a(989856109);
        if (og8.c()) {
            str = "来自于：";
        } else {
            str = "From: ";
        }
        KEY_FROM = str;
        KEY_CONFIRM = jrw.a(wmc.CONFIRM);
        KEY_CANCEL = jrw.a(wmc.CANCEL);
    }

    public WVUCWebChromeClient(Context context) {
        this.mContext = context;
    }

    private void clearCorruptedCacheFromConsole(WVUCWebView wVUCWebView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f21366", new Object[]{this, wVUCWebView, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && str2.endsWith(".js") && str.contains("Uncaught SyntaxError:")) {
            int i = vpw.commonConfig.G2;
            v7t.d(TAG, "clearCorruptedCacheFromConsole, clearMode=" + i + ", url = " + str2);
            if (i == 1) {
                reportRuntimeUnexpectedError(str2, str);
            } else if (i == 2) {
                clearCache(wVUCWebView, str2, str);
            } else if (i == 3) {
                reportRuntimeUnexpectedError(str2, str);
                clearCache(wVUCWebView, str2, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x016f  */
    @Override // com.uc.webview.export.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onConsoleMessage(android.webkit.ConsoleMessage r14) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.WVUCWebChromeClient.onConsoleMessage(android.webkit.ConsoleMessage):boolean");
    }
}
