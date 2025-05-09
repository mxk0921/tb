package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.alipay.edge.observer.receiver.EdgeCashierReceiver;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.bcy;
import tb.cby;
import tb.fcy;
import tb.hdy;
import tb.pyx;
import tb.sby;
import tb.usx;
import tb.vux;
import tb.wcy;
import tb.y9y;
import tb.yby;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class APSecuritySdk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static APSecuritySdk f3779a;
    public static APSecBgCheckerInterface bgChecker;
    private static Object c = new Object();
    private static IDeviceInfo d;
    public static APSecDirInterface dirInterface;
    private static IPermissionInfo e;
    private Context b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface InitResultListener {
        void onResult(TokenResult tokenResult);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class TokenResult {
        public String apdid;
        public String apdidToken;
        public String clientKey;
        public String umidToken;

        public TokenResult() {
        }
    }

    private APSecuritySdk(Context context) {
        this.b = context;
    }

    public static /* synthetic */ Context a(APSecuritySdk aPSecuritySdk) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e0f402fb", new Object[]{aPSecuritySdk});
        }
        return aPSecuritySdk.b;
    }

    public static IDeviceInfo getDeviceInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDeviceInfo) ipChange.ipc$dispatch("8d14489a", new Object[0]);
        }
        return d;
    }

    public static APSecuritySdk getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (APSecuritySdk) ipChange.ipc$dispatch("1ecd7191", new Object[]{context});
        }
        if (f3779a == null) {
            synchronized (c) {
                if (f3779a == null) {
                    f3779a = new APSecuritySdk(context);
                    wcy.a(context);
                    fcy.a(context);
                    EdgeCashierReceiver a2 = EdgeCashierReceiver.a();
                    if (!EdgeCashierReceiver.f3839a) {
                        try {
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction("KEnterMiniPayViewNotification");
                            LocalBroadcastManager.getInstance(context).registerReceiver(a2, intentFilter);
                            EdgeCashierReceiver.f3839a = true;
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return f3779a;
    }

    public static IPermissionInfo getPermissionInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPermissionInfo) ipChange.ipc$dispatch("5cd9c43a", new Object[0]);
        }
        return e;
    }

    public static String getUtdid(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f7eefe9", new Object[]{context});
        }
        return UtdidWrapper.getUtdid(context);
    }

    public static void registerBgChecker(APSecBgCheckerInterface aPSecBgCheckerInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2466af97", new Object[]{aPSecBgCheckerInterface});
        } else {
            bgChecker = aPSecBgCheckerInterface;
        }
    }

    public static void registerDeviceInfo(IDeviceInfo iDeviceInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e5941b", new Object[]{iDeviceInfo});
        } else {
            d = iDeviceInfo;
        }
    }

    public static void registerDirGetter(APSecDirInterface aPSecDirInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5989ac", new Object[]{aPSecDirInterface});
        } else {
            dirInterface = aPSecDirInterface;
        }
    }

    public static void registerPermissionInfo(IPermissionInfo iPermissionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("768b73a9", new Object[]{iPermissionInfo});
        } else {
            e = iPermissionInfo;
        }
    }

    public String getApdidToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e63dfe7a", new Object[]{this});
        }
        String c2 = usx.c(this.b, "");
        if (vux.c(c2)) {
            initToken(0, new HashMap(), null);
        }
        return c2;
    }

    public String getSdkName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7bc28aa", new Object[]{this});
        }
        return "APPSecuritySDK-TAOBAO";
    }

    public String getSdkVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a69c45", new Object[]{this});
        }
        return "3.5.0.20240702";
    }

    public void initToken(int i, Map<String, String> map, final InitResultListener initResultListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d0c332", new Object[]{this, new Integer(i), map, initResultListener});
            return;
        }
        pyx.a().f26406a = i;
        String f = yby.f(this.b);
        String b = pyx.a().b();
        if (vux.f(f) && !vux.d(f, b)) {
            y9y.b(this.b);
            cby.b(this.b);
            sby.b(this.b);
            bcy.r();
        }
        if (!vux.d(f, b)) {
            yby.h(this.b, b);
        }
        String b2 = vux.b(map, "utdid", "");
        String b3 = vux.b(map, "tid", "");
        String b4 = vux.b(map, "userId", "");
        if (vux.c(b2)) {
            b2 = UtdidWrapper.getUtdid(this.b);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("utdid", b2);
        hashMap.put("tid", b3);
        hashMap.put("userId", b4);
        hashMap.put("appName", "");
        hashMap.put("appKeyClient", "");
        hashMap.put("appchannel", "");
        hashMap.put(TransportConstants.KEY_RPC_VERSION, "8");
        hdy.b().c(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.APSecuritySdk.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                new usx(APSecuritySdk.a(APSecuritySdk.this)).a(hashMap);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 != null) {
                    initResultListener2.onResult(APSecuritySdk.this.getTokenResult());
                }
            }
        });
    }

    public boolean isBackgroundRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a678db2", new Object[]{this})).booleanValue();
        }
        APSecBgCheckerInterface aPSecBgCheckerInterface = bgChecker;
        if (aPSecBgCheckerInterface != null) {
            return aPSecBgCheckerInterface.isBackgroundRunning();
        }
        return false;
    }

    public synchronized TokenResult getTokenResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TokenResult) ipChange.ipc$dispatch("130f8630", new Object[]{this});
        }
        TokenResult tokenResult = new TokenResult();
        try {
            tokenResult.apdidToken = usx.c(this.b, "");
            tokenResult.clientKey = yby.n(this.b);
            tokenResult.apdid = usx.b(this.b);
            tokenResult.umidToken = UmidSdkWrapper.getSecurityToken(this.b);
            if (vux.c(tokenResult.apdid) || vux.c(tokenResult.apdidToken) || vux.c(tokenResult.clientKey)) {
                initToken(0, new HashMap(), null);
            }
        } catch (Throwable unused) {
        }
        new StringBuilder("getTokenResult: ").append(tokenResult.apdidToken);
        return tokenResult;
    }
}
