package com.alipay.android.msp.framework.certpay;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CertPayManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static CertPayManager c;
    public static Context d;
    public static final CertSdkPayReceiver e = new CertSdkPayReceiver();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, String> f3593a = new HashMap<>();
    public final HashMap<String, String> b = new HashMap<>();

    public CertPayManager(Context context) {
        d = context;
    }

    public static void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[0]);
            return;
        }
        try {
            Context context = d;
            if (context != null) {
                context.unregisterReceiver(e);
            }
        } catch (Exception e2) {
            LogUtil.printExceptionStackTrace(e2);
        }
        d = null;
        c = null;
    }

    public static CertPayManager getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CertPayManager) ipChange.ipc$dispatch("6a049bc6", new Object[]{context});
        }
        if (c == null) {
            c = new CertPayManager(context);
        }
        return c;
    }

    public String getCallBackUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff56c61b", new Object[]{this, str});
        }
        return this.b.get(str);
    }

    public String getNewSession(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c46be3", new Object[]{this, str});
        }
        for (Map.Entry<String, String> entry : this.f3593a.entrySet()) {
            String key = entry.getKey();
            if (TextUtils.equals(str, entry.getValue())) {
                return key;
            }
        }
        return "";
    }

    public String getOldSession(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1c79c2a", new Object[]{this, str});
        }
        return this.f3593a.get(str);
    }

    public void initCallBack(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c7a96b0", new Object[]{this, str, str2});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alipay.android.app.certpayresult");
        d.registerReceiver(e, intentFilter);
        this.b.put(str, str2);
    }

    public void updateCertPaySession(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e58256", new Object[]{this, str, str2});
            return;
        }
        this.f3593a.put(str2, str);
        HashMap<String, String> hashMap = this.b;
        hashMap.put(str2, hashMap.get(str));
    }
}
