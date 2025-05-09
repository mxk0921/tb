package android.taobao.windvane.embed;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Bitmap;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.extension.EmbedViewConfig;
import com.uc.webview.export.extension.IEmbedView;
import com.uc.webview.export.extension.IEmbedViewContainer;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class BaseEmbedView extends kpw implements IEmbedView, IEmbedViewContainer.OnParamChangedListener, IEmbedViewContainer.OnStateChangedListener, IEmbedViewContainer.OnVisibilityChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context context;
    public IWVWebView webView;
    public View view = null;
    public EmbedViewConfig params = null;
    public String id = "";

    static {
        t2o.a(989855824);
    }

    public static /* synthetic */ Object ipc$super(BaseEmbedView baseEmbedView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/embed/BaseEmbedView");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        return false;
    }

    public abstract View generateView(Context context);

    @Override // com.uc.webview.export.extension.IEmbedView
    public Bitmap getSnapShot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("48acabf", new Object[]{this});
        }
        return null;
    }

    @Override // com.uc.webview.export.extension.IEmbedView
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        View view = this.view;
        if (view != null) {
            return view;
        }
        Context context = this.context;
        if (context == null) {
            return null;
        }
        View generateView = generateView(context);
        this.view = generateView;
        return generateView;
    }

    public abstract String getViewType();

    @Deprecated
    public boolean init(String str, String str2, IWVWebView iWVWebView, EmbedViewConfig embedViewConfig) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba9b2af8", new Object[]{this, str, str2, iWVWebView, embedViewConfig})).booleanValue();
        }
        if (!str2.equals(getViewType()) || iWVWebView == null) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            str3 = "WVEmbedView";
        } else {
            str3 = "WVEmbedView_" + str;
        }
        this.id = str;
        iWVWebView.addJsObject(str3, this);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bridgeId", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        iWVWebView.evaluateJavascript("javascript:window.WindVane&&window.WindVane.fireEvent('WVEmbed.Ready'," + jSONObject.toString() + ");");
        this.context = iWVWebView.getContext();
        if (iWVWebView.getContext() instanceof MutableContextWrapper) {
            this.context = ((MutableContextWrapper) iWVWebView.getContext()).getBaseContext();
        }
        if (!(this.context instanceof Activity)) {
            this.context = null;
        }
        this.webView = iWVWebView;
        this.params = embedViewConfig;
        return true;
    }

    @Override // com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
        }
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.view = null;
        this.context = null;
    }

    @Override // com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDetachedFromWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ebb65", new Object[]{this});
        }
    }

    @Override // com.uc.webview.export.extension.IEmbedViewContainer.OnParamChangedListener
    public void onParamChanged(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddb624d", new Object[]{this, strArr, strArr2});
        }
    }

    @Override // com.uc.webview.export.extension.IEmbedViewContainer.OnVisibilityChangedListener
    public void onVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7606d219", new Object[]{this, new Integer(i)});
        }
    }

    public boolean init(String str, String str2, IWVWebView iWVWebView, EmbedViewConfig embedViewConfig, IEmbedViewContainer iEmbedViewContainer) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb3ca6a7", new Object[]{this, str, str2, iWVWebView, embedViewConfig, iEmbedViewContainer})).booleanValue();
        }
        if (!str2.equals(getViewType()) || iWVWebView == null) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            str3 = "WVEmbedView";
        } else {
            str3 = "WVEmbedView_" + str;
        }
        iWVWebView.addJsObject(str3, this);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bridgeId", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        iWVWebView.evaluateJavascript("javascript:window.WindVane&&window.WindVane.fireEvent('WVEmbed.Ready'," + jSONObject.toString() + ");");
        this.context = iWVWebView.getContext();
        if (iWVWebView.getContext() instanceof MutableContextWrapper) {
            this.context = ((MutableContextWrapper) iWVWebView.getContext()).getBaseContext();
        }
        if (!(this.context instanceof Activity)) {
            this.context = null;
        }
        this.webView = iWVWebView;
        this.params = embedViewConfig;
        this.id = str;
        return true;
    }
}
