package android.taobao.windvane.jsbridge.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.view.PopupWindowController;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.enx;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVUIActionSheet extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVUIActionSheet";
    private String _index;
    private PopupWindowController mPopupWindowController;
    private WVCallBackContext mCallback = null;
    private View.OnClickListener popupClickListener = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            nsw nswVar = new nsw();
            nswVar.b("type", (String) view.getTag());
            nswVar.b(enx.INDEX_KEY, WVUIActionSheet.access$000(WVUIActionSheet.this));
            if (v7t.h()) {
                v7t.a(WVUIActionSheet.TAG, "ActionSheet: click: 8.5.0");
            }
            WVUIActionSheet.access$100(WVUIActionSheet.this).f(true);
            nswVar.k();
            if (WVUIActionSheet.access$200(WVUIActionSheet.this) != null) {
                WVUIActionSheet.access$200(WVUIActionSheet.this).success(nswVar);
                WVUIActionSheet.access$200(WVUIActionSheet.this).fireEvent("wv.actionsheet", nswVar.m());
            }
        }
    }

    static {
        t2o.a(989856302);
    }

    public static /* synthetic */ String access$000(WVUIActionSheet wVUIActionSheet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11abb722", new Object[]{wVUIActionSheet});
        }
        return wVUIActionSheet._index;
    }

    public static /* synthetic */ PopupWindowController access$100(WVUIActionSheet wVUIActionSheet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindowController) ipChange.ipc$dispatch("26ad8f74", new Object[]{wVUIActionSheet});
        }
        return wVUIActionSheet.mPopupWindowController;
    }

    public static /* synthetic */ WVCallBackContext access$200(WVUIActionSheet wVUIActionSheet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("b892efd3", new Object[]{wVUIActionSheet});
        }
        return wVUIActionSheet.mCallback;
    }

    public static /* synthetic */ Object ipc$super(WVUIActionSheet wVUIActionSheet, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVUIActionSheet");
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.mCallback = null;
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"show".equals(str)) {
            return false;
        }
        show(wVCallBackContext, str2);
        return true;
    }

    public synchronized void show(WVCallBackContext wVCallBackContext, String str) {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a2dc1cb", new Object[]{this, wVCallBackContext, str});
                return;
            }
            String[] strArr = null;
            String str2 = null;
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString("title");
                    this._index = jSONObject.optString(enx.INDEX_KEY);
                    JSONArray optJSONArray = jSONObject.optJSONArray("buttons");
                    if (optJSONArray != null) {
                        if (optJSONArray.length() > 8) {
                            v7t.n(TAG, "WVUIDialog: ActionSheet is too long, limit 8");
                            nsw nswVar = new nsw();
                            nswVar.j("HY_PARAM_ERR");
                            nswVar.b("msg", "ActionSheet is too long. limit 8");
                            wVCallBackContext.error(nswVar);
                            return;
                        }
                        strArr = new String[optJSONArray.length()];
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            strArr[i] = optJSONArray.optString(i);
                        }
                    }
                    str2 = optString;
                } catch (JSONException unused) {
                    v7t.d(TAG, "WVUIDialog: param parse to JSON error, param=" + str);
                    nsw nswVar2 = new nsw();
                    nswVar2.j("HY_PARAM_ERR");
                    wVCallBackContext.error(nswVar2);
                    return;
                }
            } else {
                strArr = null;
            }
            this.mCallback = wVCallBackContext;
            try {
                PopupWindowController popupWindowController = new PopupWindowController(this.mContext, this.mWebView.getView(), str2, strArr, this.popupClickListener);
                this.mPopupWindowController = popupWindowController;
                popupWindowController.i();
                v7t.a(TAG, "ActionSheet: show");
            } catch (Exception e) {
                v7t.n(TAG, e.getMessage());
                nsw nswVar3 = new nsw();
                nswVar3.b("errMsg", e.getMessage());
                wVCallBackContext.error(nswVar3);
            }
        }
    }
}
