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
public class DeviceTokenClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static DeviceTokenClient b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3782a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface InitResultListener {
        void onResult(String str, int i);
    }

    public DeviceTokenClient(Context context) {
        this.f3782a = null;
        if (context != null) {
            this.f3782a = context;
            return;
        }
        throw new IllegalArgumentException("DeviceTokenClient initialization error: context is null.");
    }

    public static /* synthetic */ Context a(DeviceTokenClient deviceTokenClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("5c227078", new Object[]{deviceTokenClient});
        }
        return deviceTokenClient.f3782a;
    }

    public static DeviceTokenClient getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTokenClient) ipChange.ipc$dispatch("4979bce", new Object[]{context});
        }
        if (b == null) {
            synchronized (DeviceTokenClient.class) {
                try {
                    if (b == null) {
                        b = new DeviceTokenClient(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void initToken(final String str, String str2, final InitResultListener initResultListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f087b07", new Object[]{this, str, str2, initResultListener});
        } else if (vux.c(str)) {
            if (initResultListener != null) {
                initResultListener.onResult("", 2);
            }
        } else if (!vux.c(str2)) {
            final HashMap hashMap = new HashMap();
            hashMap.put("utdid", UtdidWrapper.getUtdid(this.f3782a));
            hashMap.put("tid", "");
            hashMap.put("userId", "");
            hashMap.put("appName", str);
            hashMap.put("appKeyClient", str2);
            hashMap.put("appchannel", "openapi");
            hashMap.put(TransportConstants.KEY_RPC_VERSION, "8");
            hdy.b().c(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.DeviceTokenClient.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int a2 = new usx(DeviceTokenClient.a(DeviceTokenClient.this)).a(hashMap);
                    InitResultListener initResultListener2 = initResultListener;
                    if (initResultListener2 != null) {
                        if (a2 == 0) {
                            initResultListener.onResult(usx.c(DeviceTokenClient.a(DeviceTokenClient.this), str), 0);
                        } else {
                            initResultListener2.onResult("", a2);
                        }
                    }
                }
            });
        } else if (initResultListener != null) {
            initResultListener.onResult("", 3);
        }
    }
}
