package com.taobao.accs.windvane;

import android.content.Intent;
import android.taobao.windvane.extra.jsbridge.WVACCSService;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.utl.ALog;
import org.json.JSONObject;
import tb.j8l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BrowserACCSService extends WVACCSService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BrowserACCSService";

    static {
        t2o.a(343933263);
    }

    public static /* synthetic */ Object ipc$super(BrowserACCSService browserACCSService, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -463369994:
                super.onDisconnected((TaoBaseService.ConnectInfo) objArr[0]);
                return null;
            case 14618822:
                super.onConnected((TaoBaseService.ConnectInfo) objArr[0]);
                return null;
            case 413640386:
                super.onCreate();
                return null;
            case 1765955068:
                super.onData((String) objArr[0], (String) objArr[1], (String) objArr[2], (byte[]) objArr[3], (TaoBaseService.ExtraInfo) objArr[4]);
                return null;
            case 1992651935:
                return new Integer(super.onStartCommand((Intent) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/windvane/BrowserACCSService");
        }
    }

    @Override // android.taobao.windvane.extra.jsbridge.WVACCSService, com.taobao.accs.base.TaoBaseService, com.taobao.accs.base.AccsDataListener
    public void onConnected(TaoBaseService.ConnectInfo connectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df10c6", new Object[]{this, connectInfo});
            return;
        }
        ALog.e(TAG, "onConnected()", new Object[0]);
        super.onConnected(connectInfo);
    }

    @Override // android.taobao.windvane.extra.jsbridge.WVACCSService, com.taobao.accs.base.TaoBaseService, android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            super.onCreate();
        }
    }

    @Override // android.taobao.windvane.extra.jsbridge.WVACCSService, com.taobao.accs.base.TaoBaseService, com.taobao.accs.base.AccsDataListener
    public void onDisconnected(TaoBaseService.ConnectInfo connectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46188f6", new Object[]{this, connectInfo});
            return;
        }
        ALog.e(TAG, "onDisconnected()", new Object[0]);
        super.onDisconnected(connectInfo);
    }

    @Override // com.taobao.accs.base.TaoBaseService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.taobao.windvane.extra.jsbridge.WVACCSService, com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
        } else if (TextUtils.isEmpty(str) || !j8l.z(this, 1, str)) {
            super.onData(str, str2, str3, bArr, extraInfo);
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("serviceId", str);
                jSONObject.put("userId", str2);
                jSONObject.put("dataId", str3);
                jSONObject.put("resultData", new String(bArr));
                String jSONObject2 = jSONObject.toString();
                IWVWebView webView = TBACCS.getWebView();
                if (webView != null) {
                    webView.fireEvent("WV.Event.ACCS.OnData", jSONObject2);
                }
                ALog.e(TAG, "onData fireEvent:", "view not null?", Boolean.valueOf(webView != null), "serviceId", str, "dataId", str3);
            } catch (Exception e) {
                ALog.e(TAG, "onData error:", e, "serviceId", str, "dataId", str3);
            }
        }
    }
}
