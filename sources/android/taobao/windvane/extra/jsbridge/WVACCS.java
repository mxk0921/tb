package android.taobao.windvane.extra.jsbridge;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import tb.iqw;
import tb.jqw;
import tb.kpw;
import tb.kqw;
import tb.lqw;
import tb.nsw;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVACCS extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String serviceClassName = "android.taobao.windvane.extra.jsbridge.WVACCSService";
    private static final String serviceIdDefault = "windvane";
    public ArrayList<String> serviceIdList = new ArrayList<>();

    static {
        t2o.a(989855952);
    }

    private void bindService(WVCallBackContext wVCallBackContext, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58028cc6", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            str2 = new JSONObject(str).optString("serviceId", "");
        } catch (JSONException unused) {
            wVCallBackContext.error(new nsw("HY_PARAM_ERR"));
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            wVCallBackContext.error(new nsw("HY_PARAM_ERR"));
            return;
        }
        if (this.serviceIdList == null) {
            try {
                ArrayList<String> arrayList = new ArrayList<>();
                this.serviceIdList = arrayList;
                arrayList.add("windvane");
                ACCSManager.registerSerivce(this.mContext.getApplicationContext(), "windvane", serviceClassName);
            } catch (Exception unused2) {
            }
        }
        if (this.serviceIdList.contains(str2)) {
            wVCallBackContext.success();
        } else if (this.mContext != null) {
            this.serviceIdList.add(str2);
            ACCSManager.registerSerivce(this.mContext.getApplicationContext(), "windvane", serviceClassName);
            wVCallBackContext.success();
        } else {
            wVCallBackContext.error();
        }
    }

    private void connectionState(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af1f3a1", new Object[]{this, wVCallBackContext, str});
            return;
        }
        nsw nswVar = new nsw();
        try {
            if (ACCSManager.getChannelState(this.mContext) == null) {
                nswVar.b("status", "false");
                wVCallBackContext.error();
            }
        } catch (Exception unused) {
            nswVar.b("status", "false");
            wVCallBackContext.error();
        }
        nswVar.b("status", "true");
        wVCallBackContext.success(nswVar);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            lqw.d().b(new ACCSWVEventListener(this.mWebView));
        }
    }

    public static /* synthetic */ Object ipc$super(WVACCS wvaccs, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        } else if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in android/taobao/windvane/extra/jsbridge/WVACCS");
        }
    }

    private void unBindService(WVCallBackContext wVCallBackContext, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97a5fad", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            str2 = new JSONObject(str).optString("serviceId", "");
        } catch (JSONException unused) {
            wVCallBackContext.error(new nsw("HY_PARAM_ERR"));
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            wVCallBackContext.error(new nsw("HY_PARAM_ERR"));
            return;
        }
        if (this.serviceIdList == null) {
            this.serviceIdList = new ArrayList<>();
        }
        if (!this.serviceIdList.contains(str2)) {
            wVCallBackContext.success();
        } else if (this.mContext != null) {
            this.serviceIdList.remove(str2);
            ACCSManager.unregisterService(this.mContext.getApplicationContext(), str2);
            wVCallBackContext.success();
        } else {
            wVCallBackContext.error();
        }
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        init(context);
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (!(this.mContext == null || this.serviceIdList == null)) {
            for (int i = 0; i < this.serviceIdList.size(); i++) {
                ACCSManager.unregisterService(this.mContext.getApplicationContext(), this.serviceIdList.get(i));
            }
            this.serviceIdList.clear();
            this.serviceIdList = null;
        }
        super.onDestroy();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ACCSWVEventListener implements jqw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<IWVWebView> webview;

        static {
            t2o.a(989855953);
            t2o.a(989856388);
        }

        public ACCSWVEventListener(IWVWebView iWVWebView) {
            this.webview = new WeakReference<>(iWVWebView);
        }

        @Override // tb.jqw
        public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
            }
            IWVWebView iWVWebView = this.webview.get();
            if (iWVWebView == null) {
                if (v7t.h()) {
                    v7t.d("ACCS", "webview is recycled");
                }
                return null;
            }
            switch (i) {
                case 5001:
                    String str = (String) objArr[0];
                    String str2 = new String((byte[]) objArr[1]);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("serviceId", str);
                        jSONObject.put("resultData", str2);
                        String jSONObject2 = jSONObject.toString();
                        iWVWebView.fireEvent("WV.Event.ACCS.OnData", jSONObject2);
                        if (v7t.h()) {
                            v7t.i("ACCS", jSONObject2);
                            break;
                        }
                    } catch (Throwable unused) {
                        break;
                    }
                    break;
                case 5002:
                    iWVWebView.fireEvent("WV.Event.ACCS.OnConnected", "{}");
                    if (v7t.h()) {
                        v7t.d("ACCS", "ACCS connect");
                        break;
                    }
                    break;
                case 5003:
                    iWVWebView.fireEvent("WV.Event.ACCS.OnDisConnected", "{}");
                    if (v7t.h()) {
                        v7t.d("ACCS", "ACCS disconnect");
                        break;
                    }
                    break;
            }
            return null;
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("bindService".equals(str)) {
            bindService(wVCallBackContext, str2);
        } else if ("unBindService".equals(str)) {
            unBindService(wVCallBackContext, str2);
        } else if ("setData".equals(str)) {
            setData(wVCallBackContext, str2);
        } else if (!"connectionState".equals(str)) {
            return false;
        } else {
            connectionState(wVCallBackContext, str2);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setData(android.taobao.windvane.jsbridge.WVCallBackContext r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.jsbridge.WVACCS.setData(android.taobao.windvane.jsbridge.WVCallBackContext, java.lang.String):void");
    }
}
