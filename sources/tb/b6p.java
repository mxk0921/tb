package tb;

import android.app.Activity;
import android.content.DialogInterface;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.view.View;
import android.webkit.ConsoleMessage;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.TBDialog;
import com.taobao.taobao.R;
import com.uc.webview.export.JsResult;
import com.uc.webview.export.WebView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b6p extends WVUCWebChromeClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JsResult f16213a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements DialogInterface.OnCancelListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                return;
            }
            b4p.a(y7t.TAOBAO_TAG, "Alert cancel");
            b6p.a(b6p.this).confirm();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                b6p.a(b6p.this).confirm();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements DialogInterface.OnCancelListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                return;
            }
            b4p.a(y7t.TAOBAO_TAG, "Alert cancel");
            b6p.a(b6p.this).cancel();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                b6p.a(b6p.this).cancel();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                b6p.a(b6p.this).confirm();
            }
        }
    }

    static {
        t2o.a(815792537);
    }

    public static /* synthetic */ JsResult a(b6p b6pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsResult) ipChange.ipc$dispatch("a9c71966", new Object[]{b6pVar});
        }
        return b6pVar.f16213a;
    }

    public static /* synthetic */ Object ipc$super(b6p b6pVar, String str, Object... objArr) {
        if (str.hashCode() == -634514222) {
            return new Boolean(super.onConsoleMessage((ConsoleMessage) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/mmd/onesearch/SearchUCWebChromeClient");
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da2e14d2", new Object[]{this, consoleMessage})).booleanValue();
        }
        b4p.a("onConsoleMessage", consoleMessage.message() + " line:" + consoleMessage.lineNumber() + " id:" + consoleMessage.sourceId());
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16bdf0ae", new Object[]{this, webView, str, str2, jsResult})).booleanValue();
        }
        this.f16213a = jsResult;
        if (webView.getRootView().getContext() instanceof Activity) {
            new TBDialog.Builder((Activity) webView.getRootView().getContext()).setTitle(Localization.q(R.string.app_prompt)).setMessage(str2).setPositiveButton(Localization.q(R.string.taobao_app_1005_1_16665), new b()).setOnCancelListener(new a()).show();
        } else {
            this.f16213a.confirm();
            b4p.b(y7t.TAOBAO_TAG, "chrome client error : dialog context not an activity!");
        }
        return true;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af8e0ca", new Object[]{this, webView, str, str2, jsResult})).booleanValue();
        }
        this.f16213a = jsResult;
        if (webView.getRootView().getContext() instanceof Activity) {
            new TBDialog.Builder((Activity) webView.getRootView().getContext()).setTitle(Localization.q(R.string.app_prompt)).setMessage(str2).setPositiveButton(Localization.q(R.string.taobao_app_1005_1_16665), new e()).setNegativeButton(Localization.q(R.string.taobao_app_1005_1_16664), new d()).setOnCancelListener(new c()).show();
        } else {
            this.f16213a.cancel();
            b4p.b(y7t.TAOBAO_TAG, "chrome client error : dialog context not an activity!");
        }
        return true;
    }
}
