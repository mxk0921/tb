package com.taobao.accs.windvane;

import android.content.Context;
import android.taobao.windvane.extra.jsbridge.WVACCS;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.base.AccsConnectStateListener2;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.utl.ALog;
import com.taobao.aranger.exception.IPCException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import tb.m8l;
import tb.mh1;
import tb.nsw;
import tb.ru1;
import tb.t2o;
import tb.xpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TBACCS extends WVACCS {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBWVACCS";
    private static boolean connListenerRegistered = false;
    public static WeakReference<IWVWebView> mWeb = null;
    private static final String serviceClassName = "com.taobao.accs.windvane.BrowserACCSService";
    private static final String serviceIdDefault = "windvane";
    private AccsConnectStateListener2 connListener = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements AccsConnectStateListener2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.accs.base.AccsConnectStateListener2
        public void onConnectFail(TaoBaseService.ConnectInfo connectInfo) throws IPCException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bfd2647", new Object[]{this, connectInfo});
                return;
            }
            try {
                if (TBACCS.access$000(TBACCS.this) != null && connectInfo != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("connected", false);
                    jSONObject.put("err_code", connectInfo.errorCode);
                    jSONObject.put("err_detail", connectInfo.errordetail);
                    String jSONObject2 = jSONObject.toString();
                    TBACCS.access$100(TBACCS.this).fireEvent("WV.Event.ACCS.OnConnectResult", jSONObject2);
                    ALog.e(TBACCS.TAG, "WV.Event.ACCS.OnConnectResult", "data", jSONObject2);
                }
            } catch (Exception e) {
                ALog.e(TBACCS.TAG, "onConnectFail err", e, new Object[0]);
            }
        }

        @Override // com.taobao.accs.base.AccsConnectStateListener2, com.taobao.accs.base.AccsConnectStateListener
        public void onConnected(TaoBaseService.ConnectInfo connectInfo) throws IPCException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df10c6", new Object[]{this, connectInfo});
                return;
            }
            try {
                if (TBACCS.access$200(TBACCS.this) != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("connected", true);
                    String jSONObject2 = jSONObject.toString();
                    TBACCS.access$300(TBACCS.this).fireEvent("WV.Event.ACCS.OnConnectResult", jSONObject2);
                    ALog.e(TBACCS.TAG, "WV.Event.ACCS.OnConnectResult", "data", jSONObject2);
                }
            } catch (Exception e) {
                ALog.e(TBACCS.TAG, "onConnected err", e, new Object[0]);
            }
        }

        @Override // com.taobao.accs.base.AccsConnectStateListener2, com.taobao.accs.base.AccsConnectStateListener
        public void onDisconnected(TaoBaseService.ConnectInfo connectInfo) throws IPCException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e46188f6", new Object[]{this, connectInfo});
                return;
            }
            try {
                if (TBACCS.access$400(TBACCS.this) != null) {
                    TBACCS.access$500(TBACCS.this).fireEvent("WV.Event.ACCS.OnDisConnected", "{}");
                    ALog.e(TBACCS.TAG, "WV.Event.ACCS.OnDisConnected", new Object[0]);
                }
            } catch (Exception e) {
                ALog.e(TBACCS.TAG, "OnDisConnected err", e, new Object[0]);
            }
        }
    }

    static {
        t2o.a(343933264);
    }

    public static /* synthetic */ IWVWebView access$000(TBACCS tbaccs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWVWebView) ipChange.ipc$dispatch("1de8b4cb", new Object[]{tbaccs});
        }
        return tbaccs.mWebView;
    }

    public static /* synthetic */ IWVWebView access$100(TBACCS tbaccs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWVWebView) ipChange.ipc$dispatch("c5648e8c", new Object[]{tbaccs});
        }
        return tbaccs.mWebView;
    }

    public static /* synthetic */ IWVWebView access$200(TBACCS tbaccs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWVWebView) ipChange.ipc$dispatch("6ce0684d", new Object[]{tbaccs});
        }
        return tbaccs.mWebView;
    }

    public static /* synthetic */ IWVWebView access$300(TBACCS tbaccs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWVWebView) ipChange.ipc$dispatch("145c420e", new Object[]{tbaccs});
        }
        return tbaccs.mWebView;
    }

    public static /* synthetic */ IWVWebView access$400(TBACCS tbaccs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWVWebView) ipChange.ipc$dispatch("bbd81bcf", new Object[]{tbaccs});
        }
        return tbaccs.mWebView;
    }

    public static /* synthetic */ IWVWebView access$500(TBACCS tbaccs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWVWebView) ipChange.ipc$dispatch("6353f590", new Object[]{tbaccs});
        }
        return tbaccs.mWebView;
    }

    public static IWVWebView getWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWVWebView) ipChange.ipc$dispatch("a50a9e10", new Object[0]);
        }
        WeakReference<IWVWebView> weakReference = mWeb;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(TBACCS tbaccs, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        } else if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1126948911) {
            return new Boolean(super.execute((String) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/accs/windvane/TBACCS");
        }
    }

    @Override // android.taobao.windvane.extra.jsbridge.WVACCS, tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        mWeb = new WeakReference<>(iWVWebView);
    }

    @Override // android.taobao.windvane.extra.jsbridge.WVACCS, tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ALog.e(TAG, "onDestroy", new Object[0]);
        super.onDestroy();
        if (connListenerRegistered) {
            try {
                ACCSClient.getAccsClient().unRegisterConnectStateListener(this.connListener);
                connListenerRegistered = false;
            } catch (Exception e) {
                ALog.e(TAG, "onDestroy err", e, new Object[0]);
            }
        }
    }

    private boolean getConnectionUnitInfo(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8145f318", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        nsw nswVar = new nsw();
        try {
            String optString = new JSONObject(str).optString("tag", "");
            if (!TextUtils.isEmpty(optString)) {
                nswVar.b(mh1.PRICE_UNIT, ACCSClient.getAccsClient(optString).getConnectionUnitInfo());
            }
        } catch (Throwable th) {
            ALog.e(TAG, "getConnectionUnitInfo err", th, new Object[0]);
        }
        wVCallBackContext.success(nswVar);
        return true;
    }

    private boolean isFeatureOpened(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe9ccb07", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        nsw nswVar = new nsw();
        try {
            if ("accs_v2".equals(new JSONObject(str).optString(ru1.FEATURE_NAME, ""))) {
                nswVar.a("status", Boolean.valueOf(m8l.C()));
            } else {
                nswVar.a("status", Boolean.TRUE);
            }
        } catch (JSONException e) {
            ALog.e(TAG, "isFeatureOpened err", e, new Object[0]);
        }
        wVCallBackContext.success(nswVar);
        return true;
    }

    private synchronized void registerConnListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d63d4a", new Object[]{this});
            return;
        }
        if (!connListenerRegistered) {
            try {
                ACCSClient.getAccsClient().registerConnectStateListener(this.connListener);
                connListenerRegistered = true;
            } catch (AccsException e) {
                ALog.e(TAG, "registerConnListener err", e, new Object[0]);
            }
        }
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
            ALog.e(TAG, "bindService json err", new Object[0]);
            wVCallBackContext.error(new nsw("HY_PARAM_ERR"));
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            ALog.e(TAG, "bindService id empty", new Object[0]);
            wVCallBackContext.error(new nsw("HY_PARAM_ERR"));
            return;
        }
        ALog.e(TAG, "wv bindService", "serviceId", str2);
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
            ACCSManager.registerSerivce(this.mContext.getApplicationContext(), str2, serviceClassName);
            wVCallBackContext.success();
        } else {
            wVCallBackContext.error();
        }
    }

    private void isConnect(String str, WVCallBackContext wVCallBackContext) {
        String str2 = AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff05f3ae", new Object[]{this, str, wVCallBackContext});
            return;
        }
        ALog.e(TAG, "isConnect()", "params", str);
        try {
            nsw nswVar = new nsw();
            try {
                if (!str2.equals(new JSONObject(str).optString("tag", ""))) {
                    str2 = "default";
                }
            } catch (JSONException unused) {
                ALog.e(TAG, "isConnect json err", new Object[0]);
                str2 = null;
            }
            nswVar.a("status", Boolean.valueOf(ACCSClient.getAccsClient(str2).isAccsConnected()));
            wVCallBackContext.success(nswVar);
        } catch (Exception e) {
            ALog.e(TAG, "isConnect err", e, new Object[0]);
        }
    }

    @Override // android.taobao.windvane.extra.jsbridge.WVACCS, tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        ALog.d(TAG, xpc.RECORD_EXECUTE, "action", str, "params", str2);
        if ("bindService".equals(str)) {
            bindService(wVCallBackContext, str2);
            return true;
        } else if ("isConnect".equals(str)) {
            isConnect(str2, wVCallBackContext);
            return true;
        } else if ("registerConnListener".equals(str)) {
            try {
                registerConnListener();
                wVCallBackContext.success();
            } catch (Exception e) {
                ALog.e(TAG, "registerConnListener err", e, new Object[0]);
            }
            return true;
        } else if ("isFeatureOpened".equals(str)) {
            return isFeatureOpened(str2, wVCallBackContext);
        } else {
            if ("getConnectionUnitInfo".equals(str)) {
                return getConnectionUnitInfo(str2, wVCallBackContext);
            }
            try {
                return super.execute(str, str2, wVCallBackContext);
            } catch (Throwable th) {
                ALog.e(TAG, "super.execute err", th, new Object[0]);
                return true;
            }
        }
    }
}
