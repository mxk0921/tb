package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.hdy;
import tb.usx;
import tb.vux;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TMNTokenClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static TMNTokenClient b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3784a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface InitResultListener {
        void onResult(String str, int i);
    }

    public TMNTokenClient(Context context) {
        this.f3784a = null;
        if (context != null) {
            this.f3784a = context;
            return;
        }
        throw new IllegalArgumentException("TMNTokenClient initialization error: context is null.");
    }

    public static /* synthetic */ Context a(TMNTokenClient tMNTokenClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("604794eb", new Object[]{tMNTokenClient});
        }
        return tMNTokenClient.f3784a;
    }

    public static TMNTokenClient getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMNTokenClient) ipChange.ipc$dispatch("4ff1922b", new Object[]{context});
        }
        if (b == null) {
            synchronized (TMNTokenClient.class) {
                try {
                    if (b == null) {
                        b = new TMNTokenClient(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void intiToken(final String str, String str2, String str3, final InitResultListener initResultListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be6f94fc", new Object[]{this, str, str2, str3, initResultListener});
            return;
        }
        if (vux.c(str) && initResultListener != null) {
            initResultListener.onResult("", 2);
        }
        if (vux.c(str2) && initResultListener != null) {
            initResultListener.onResult("", 3);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("utdid", UtdidWrapper.getUtdid(this.f3784a));
        hashMap.put("tid", "");
        hashMap.put("userId", "");
        hashMap.put("appName", str);
        hashMap.put("appKeyClient", str2);
        hashMap.put("appchannel", "openapi");
        hashMap.put("sessionId", str3);
        hashMap.put(TransportConstants.KEY_RPC_VERSION, "8");
        hdy.b().c(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.TMNTokenClient.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int a2 = new usx(TMNTokenClient.a(TMNTokenClient.this)).a(hashMap);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 != null) {
                    if (a2 == 0) {
                        initResultListener.onResult(usx.c(TMNTokenClient.a(TMNTokenClient.this), str), 0);
                    } else {
                        initResultListener2.onResult("", a2);
                    }
                }
            }
        });
    }
}
