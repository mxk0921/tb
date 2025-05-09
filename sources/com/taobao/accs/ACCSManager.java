package com.taobao.accs;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.asp.APreferencesManager;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.internal.ACCSManagerImpl;
import com.taobao.accs.utl.ALog;
import java.io.Serializable;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.SymbolExpUtil;
import tb.brt;
import tb.czv;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ACCSManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ACCSManager";
    public static Context mContext;
    public static String mDefaultAppkey;
    public static int mEnv = 0;
    public static String mDefaultConfigTag = "default";
    public static Map<String, a> mAccsInstances = new ConcurrentHashMap(2);

    private ACCSManager() {
    }

    @Deprecated
    public static void bindApp(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73478e79", new Object[]{context, str, str2, str3, iAppReceiver});
        } else if (!TextUtils.isEmpty(mDefaultAppkey)) {
            czv.f();
            getManagerImpl(context).bindApp(context, mDefaultAppkey, str2, str3, iAppReceiver);
        } else {
            throw new RuntimeException("old interface!!, please AccsManager.setAppkey() first!");
        }
    }

    @Deprecated
    public static void bindService(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc166df3", new Object[]{context, str});
        } else {
            getManagerImpl(context).bindService(context, str);
        }
    }

    @Deprecated
    public static void bindUser(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("253f5e03", new Object[]{context, str});
        } else {
            bindUser(context, str, false);
        }
    }

    @Deprecated
    public static void clearLoginInfoImpl(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd7b837", new Object[]{context});
        } else {
            getManagerImpl(context).clearLoginInfo(context);
        }
    }

    public static a createAccsInstance(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9b4ad7c1", new Object[]{context, str});
        }
        return new ACCSManagerImpl(context, str);
    }

    public static void forceDisableService(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("303889a9", new Object[]{context});
        } else {
            getManagerImpl(context).forceDisableService(context);
        }
    }

    public static void forceEnableService(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296f93fa", new Object[]{context});
        } else {
            getManagerImpl(context).forceEnableService(context);
        }
    }

    @Deprecated
    public static Map<String, Boolean> forceReConnectChannel(Context context) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("541d625f", new Object[]{context});
        }
        return getManagerImpl(context).forceReConnectChannel();
    }

    @Deprecated
    public static Map<String, Boolean> getChannelState(Context context) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("41739b52", new Object[]{context});
        }
        return getManagerImpl(context).getChannelState();
    }

    public static String getDefaultConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6edbe40c", new Object[]{context});
        }
        return mDefaultConfigTag;
    }

    private static synchronized a getManagerImpl(Context context) {
        synchronized (ACCSManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("15159d1f", new Object[]{context});
            }
            return getAccsInstance(context, null, getDefaultConfig(context));
        }
    }

    @Deprecated
    public static String getUserUnit(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc834e44", new Object[]{context});
        }
        return null;
    }

    @Deprecated
    public static boolean isAccsConnected(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae800e38", new Object[]{context})).booleanValue();
        }
        return getManagerImpl(context).isAccsConnected();
    }

    @Deprecated
    public static boolean isChannelError(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ea1b6d5", new Object[]{context, new Integer(i)})).booleanValue();
        }
        return getManagerImpl(context).isChannelError(i);
    }

    @Deprecated
    public static boolean isNetworkReachable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("768651bc", new Object[]{context})).booleanValue();
        }
        return getManagerImpl(context).isNetworkReachable(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setAppkey$2(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba9acdba", new Object[]{context, str});
            return;
        }
        czv.j(context, str);
        czv.l(context, Constants.SP_KEY_DEFAULT_APPKEY, str);
    }

    @Deprecated
    public static void registerDataListener(Context context, String str, AccsAbstractDataListener accsAbstractDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13412671", new Object[]{context, str, accsAbstractDataListener});
        } else {
            GlobalClientInfo.getInstance(context).registerListener(str, accsAbstractDataListener);
        }
    }

    @Deprecated
    public static void registerSerivce(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f898bca9", new Object[]{context, str, str2});
        } else {
            GlobalClientInfo.getInstance(context).registerService(str, str2);
        }
    }

    @Deprecated
    public static String sendData(Context context, String str, String str2, byte[] bArr, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("70504f2c", new Object[]{context, str, str2, bArr, str3}) : getManagerImpl(context).sendData(context, str, str2, bArr, str3);
    }

    @Deprecated
    public static String sendPushResponse(Context context, AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e49eb68", new Object[]{context, accsRequest, extraInfo});
        }
        return getManagerImpl(context).sendPushResponse(context, accsRequest, extraInfo);
    }

    @Deprecated
    public static String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8329b758", new Object[]{context, str, str2, bArr, str3, str4, url}) : getManagerImpl(context).sendRequest(context, str, str2, bArr, str3, str4, url);
    }

    @Deprecated
    public static void setAppkey(final Context context, final String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9d2358", new Object[]{context, str, new Integer(i)});
        } else if (mDefaultAppkey == null) {
            brt.d().execute(new Runnable() { // from class: tb.e1
                @Override // java.lang.Runnable
                public final void run() {
                    ACCSManager.lambda$setAppkey$2(context, str);
                }
            });
            mContext = context.getApplicationContext();
            mDefaultAppkey = str;
            mEnv = i;
            AccsClientConfig.mEnv = i;
        }
    }

    @Deprecated
    public static void setLoginInfoImpl(Context context, ILoginInfo iLoginInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca81443", new Object[]{context, iLoginInfo});
        } else {
            getManagerImpl(context).setLoginInfo(context, iLoginInfo);
        }
    }

    @Deprecated
    public static void setMode(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab05467", new Object[]{context, new Integer(i)});
            return;
        }
        mEnv = i;
        getManagerImpl(context).setMode(context, i);
    }

    @Deprecated
    public static void setProxy(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95bdaae4", new Object[]{context, str, new Integer(i)});
        } else {
            getManagerImpl(context).setProxy(context, str, i);
        }
    }

    @Deprecated
    public static void setServiceListener(Context context, String str, IServiceReceiver iServiceReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f681918e", new Object[]{context, str, iServiceReceiver});
        }
    }

    @Deprecated
    public static void startInAppConnection(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87dbbfa5", new Object[]{context, str, str2, str3, iAppReceiver});
            return;
        }
        czv.f();
        getManagerImpl(context).startInAppConnection(context, mDefaultAppkey, str2, str3, iAppReceiver);
    }

    @Deprecated
    public static void unRegisterDataListener(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6cd8471", new Object[]{context, str});
        } else {
            GlobalClientInfo.getInstance(context).unregisterListener(str);
        }
    }

    @Deprecated
    public static void unbindApp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a37ad16", new Object[]{context});
        }
    }

    @Deprecated
    public static void unbindService(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f05b4c", new Object[]{context, str});
        } else {
            getManagerImpl(context).unbindService(context, str);
        }
    }

    @Deprecated
    public static void unbindUser(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4624d80", new Object[]{context});
        } else {
            getManagerImpl(context).unbindUser(context);
        }
    }

    @Deprecated
    public static void unregisterService(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713488b2", new Object[]{context, str});
        } else {
            GlobalClientInfo.getInstance(context).unRegisterService(str);
        }
    }

    @Deprecated
    public static void bindUser(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ad1531", new Object[]{context, str, new Boolean(z)});
        } else if (!TextUtils.isEmpty(mDefaultAppkey)) {
            getManagerImpl(context).bindUser(context, str, z);
        } else {
            throw new RuntimeException("old interface!!, please AccsManager.setAppkey() first!");
        }
    }

    public static String[] getAppkey(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("8ad0389c", new Object[]{context});
        }
        try {
            String string = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).getString("appkey", null);
            ALog.i(TAG, "getAppkey:" + string, new Object[0]);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return string.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Deprecated
    public static String getDefaultAppkey(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93254468", new Object[]{context});
        }
        if (TextUtils.isEmpty(mDefaultAppkey)) {
            ALog.e(TAG, "old interface!!, please AccsManager.setAppkey() first!", new Object[0]);
            String e = czv.e(context, Constants.SP_KEY_DEFAULT_APPKEY, null);
            mDefaultAppkey = e;
            if (TextUtils.isEmpty(e)) {
                try {
                    mDefaultAppkey = SecurityGuardManager.getInstance(context).getStaticDataStoreComp().getAppKeyByIndex(0, null);
                } catch (Throwable th) {
                    ALog.e(TAG, "getDefaultAppkey", th, new Object[0]);
                }
            }
            if (TextUtils.isEmpty(mDefaultAppkey)) {
                mDefaultAppkey = "0";
            }
        }
        return mDefaultAppkey;
    }

    @Deprecated
    public static String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("210d8883", new Object[]{context, str, str2, bArr, str3, str4, url}) : getManagerImpl(context).sendData(context, str, str2, bArr, str3, str4, url);
    }

    @Deprecated
    public static String sendRequest(Context context, String str, String str2, byte[] bArr, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("31751201", new Object[]{context, str, str2, bArr, str3}) : sendRequest(context, str, str2, bArr, str3, null);
    }

    @Deprecated
    public static String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ae89a7a2", new Object[]{context, str, str2, bArr, str3, str4}) : getManagerImpl(context).sendData(context, str, str2, bArr, str3, str4);
    }

    @Deprecated
    public static String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2b853f37", new Object[]{context, str, str2, bArr, str3, str4}) : getManagerImpl(context).sendRequest(context, str, str2, bArr, str3, str4);
    }

    @Deprecated
    public static void startInAppConnection(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd31f89b", new Object[]{context, str, str2, iAppReceiver});
        } else {
            startInAppConnection(context, mDefaultAppkey, "", str2, iAppReceiver);
        }
    }

    static {
        t2o.a(343932930);
    }

    public static a getAccsInstance(Context context, String str, String str2) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("28c95211", new Object[]{context, str, str2});
        }
        if (context == null || TextUtils.isEmpty(str2)) {
            ALog.e(TAG, "getAccsInstance param null", Constants.KEY_CONFIG_TAG, str2);
            return null;
        }
        String str3 = str2 + "|" + AccsClientConfig.mEnv;
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d(TAG, "getAccsInstance", "key", str3);
        }
        synchronized (ACCSManager.class) {
            aVar = mAccsInstances.get(str3);
            if (aVar == null) {
                try {
                    aVar = createAccsInstance(context, str2);
                } catch (Exception e) {
                    ALog.e(TAG, "createAccsInstance error", e.getMessage());
                }
                if (aVar != null) {
                    mAccsInstances.put(str3, aVar);
                }
            }
        }
        return aVar;
    }

    @Deprecated
    public static String sendData(Context context, AccsRequest accsRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("864f5418", new Object[]{context, accsRequest}) : getManagerImpl(context).sendData(context, accsRequest);
    }

    @Deprecated
    public static String sendRequest(Context context, AccsRequest accsRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("97c9e1e3", new Object[]{context, accsRequest}) : getManagerImpl(context).sendRequest(context, accsRequest);
    }

    @Deprecated
    public static void setDefaultConfig(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1b5aea", new Object[]{context, str});
        } else if (!TextUtils.isEmpty(str)) {
            ALog.i(TAG, "setDefaultConfig", Constants.KEY_CONFIG_TAG, str);
            mDefaultConfigTag = str;
        }
    }

    @Deprecated
    public static void bindApp(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6115946f", new Object[]{context, str, str2, iAppReceiver});
        } else {
            bindApp(context, mDefaultAppkey, "", str2, iAppReceiver);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class AccsRequest implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String businessId;
        public byte[] data;
        public String dataId;
        private Map<Integer, String> ext;
        public URL host;
        public boolean isUnitBusiness = false;
        public String serviceId;
        public String tag;
        public String target;
        public String targetServiceName;
        public int timeout;
        public String userId;

        static {
            t2o.a(343932931);
        }

        public AccsRequest(String str, String str2, byte[] bArr, String str3, String str4, URL url, String str5) {
            this.userId = str;
            this.serviceId = str2;
            this.data = bArr;
            this.dataId = str3;
            this.target = str4;
            this.host = url;
            this.businessId = str5;
        }

        public Map<Integer, String> getExt() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("7b9b14a7", new Object[]{this});
            }
            return this.ext;
        }

        public void setBusinessId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9e0dce", new Object[]{this, str});
            } else {
                this.businessId = str;
            }
        }

        public void setExt(Map<Integer, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21ccc35f", new Object[]{this, map});
            } else {
                this.ext = map;
            }
        }

        public void setHost(URL url) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aad27c70", new Object[]{this, url});
            } else {
                this.host = url;
            }
        }

        public void setIsUnitBusiness(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c94c7d", new Object[]{this, new Boolean(z)});
            } else {
                this.isUnitBusiness = z;
            }
        }

        public void setTag(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e9be069", new Object[]{this, str});
            } else {
                this.tag = str;
            }
        }

        public void setTarget(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15b02e4", new Object[]{this, str});
            } else {
                this.target = str;
            }
        }

        public void setTargetServiceName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce587b1e", new Object[]{this, str});
            } else {
                this.targetServiceName = str;
            }
        }

        public void setTimeOut(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac10583d", new Object[]{this, new Integer(i)});
            } else {
                this.timeout = i;
            }
        }

        public AccsRequest(String str, String str2, byte[] bArr, String str3) {
            this.userId = str;
            this.serviceId = str2;
            this.data = bArr;
            this.dataId = str3;
        }
    }
}
