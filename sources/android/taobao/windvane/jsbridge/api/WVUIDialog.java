package android.taobao.windvane.jsbridge.api;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.enx;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.v7t;
import tb.wmc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVUIDialog extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVUIDialog";
    private String _index;
    private String identifier;
    private WVCallBackContext mCallback = null;
    private String okBtnText = "";
    private String cancelBtnText = "";
    public DialogInterface.OnClickListener confirmClickListener = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            nsw nswVar = new nsw();
            if (i == -1) {
                str = WVUIDialog.access$000(WVUIDialog.this);
            } else if (i == -2) {
                str = WVUIDialog.access$100(WVUIDialog.this);
            } else {
                str = "";
            }
            nswVar.b("type", str);
            nswVar.b(enx.INDEX_KEY, WVUIDialog.access$200(WVUIDialog.this));
            if (v7t.h()) {
                v7t.a(WVUIDialog.TAG, "click: " + str);
            }
            nswVar.k();
            if (WVUIDialog.access$300(WVUIDialog.this) != null) {
                WVUIDialog.access$300(WVUIDialog.this).fireEvent("wv.dialog", nswVar.m());
                WVUIDialog.access$300(WVUIDialog.this).success(nswVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class b implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(989856306);
        }

        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else if (WVUIDialog.access$300(WVUIDialog.this) != null) {
                nsw nswVar = new nsw();
                if (!TextUtils.isEmpty(WVUIDialog.access$400(WVUIDialog.this))) {
                    nswVar.b("identifier", WVUIDialog.access$400(WVUIDialog.this));
                }
                nswVar.k();
                if (WVUIDialog.access$300(WVUIDialog.this) != null) {
                    WVUIDialog.access$300(WVUIDialog.this).fireEvent("WV.Event.Alert", nswVar.m());
                    WVUIDialog.access$300(WVUIDialog.this).success(nswVar);
                }
            }
        }
    }

    static {
        t2o.a(989856304);
    }

    public static /* synthetic */ String access$000(WVUIDialog wVUIDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e08ced7f", new Object[]{wVUIDialog});
        }
        return wVUIDialog.okBtnText;
    }

    public static /* synthetic */ String access$100(WVUIDialog wVUIDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a798d480", new Object[]{wVUIDialog});
        }
        return wVUIDialog.cancelBtnText;
    }

    public static /* synthetic */ String access$200(WVUIDialog wVUIDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ea4bb81", new Object[]{wVUIDialog});
        }
        return wVUIDialog._index;
    }

    public static /* synthetic */ WVCallBackContext access$300(WVUIDialog wVUIDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("48ccaf75", new Object[]{wVUIDialog});
        }
        return wVUIDialog.mCallback;
    }

    public static /* synthetic */ String access$400(WVUIDialog wVUIDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcbc8983", new Object[]{wVUIDialog});
        }
        return wVUIDialog.identifier;
    }

    public static /* synthetic */ Object ipc$super(WVUIDialog wVUIDialog, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVUIDialog");
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mCallback = null;
        this.cancelBtnText = "";
        this.okBtnText = "";
    }

    public synchronized void alert(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a71cd6a", new Object[]{this, wVCallBackContext, str});
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.mContext);
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                builder.setTitle(jSONObject.optString("title", wmc.TIPS));
                builder.setMessage(jSONObject.optString("message"));
                this.okBtnText = jSONObject.optString("okbutton");
                this.identifier = jSONObject.optString("identifier");
                builder.setPositiveButton(this.okBtnText, new b());
            } catch (JSONException unused) {
                v7t.d(TAG, "WVUIDialog: param parse to JSON error, param=" + str);
                nsw nswVar = new nsw();
                nswVar.j("HY_PARAM_ERR");
                wVCallBackContext.error(nswVar);
                return;
            }
        }
        this.mCallback = wVCallBackContext;
        try {
            AlertDialog create = builder.create();
            create.setCanceledOnTouchOutside(false);
            create.show();
        } catch (Throwable unused2) {
        }
        v7t.a(TAG, "alert: show");
    }

    public synchronized void confirm(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6699dce", new Object[]{this, wVCallBackContext, str});
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.mContext);
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                builder.setTitle(jSONObject.optString("title", ""));
                builder.setMessage(jSONObject.optString("message"));
                String optString = jSONObject.optString("okbutton");
                this.okBtnText = optString;
                builder.setPositiveButton(optString, this.confirmClickListener);
                String optString2 = jSONObject.optString("canclebutton");
                this.cancelBtnText = optString2;
                builder.setNegativeButton(optString2, this.confirmClickListener);
                this._index = jSONObject.optString(enx.INDEX_KEY);
            } catch (JSONException unused) {
                v7t.d(TAG, "WVUIDialog: param parse to JSON error, param=" + str);
                nsw nswVar = new nsw();
                nswVar.j("HY_PARAM_ERR");
                wVCallBackContext.error(nswVar);
                return;
            }
        }
        this.mCallback = wVCallBackContext;
        try {
            AlertDialog create = builder.create();
            create.setCanceledOnTouchOutside(false);
            create.show();
        } catch (Throwable unused2) {
        }
        v7t.a(TAG, "confirm: show");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (this.mContext instanceof Activity) {
            this.mCallback = wVCallBackContext;
            if ("alert".equals(str)) {
                alert(wVCallBackContext, str2);
            } else if (!"confirm".equals(str)) {
                return false;
            } else {
                confirm(wVCallBackContext, str2);
            }
        } else {
            nsw nswVar = new nsw();
            nswVar.b("error", "Context must be Activity!!!");
            wVCallBackContext.error(nswVar);
        }
        return true;
    }
}
