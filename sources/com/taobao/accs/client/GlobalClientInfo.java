package com.taobao.accs.client;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsIPCProvider;
import com.taobao.accs.IAgooAppReceiver;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.IGlobalClientInfoService;
import com.taobao.accs.ILoginInfo;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.MessageFilter;
import com.taobao.accs.center.AccsMainCenter;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.connection.ConnectionServiceManager;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.aranger.exception.IPCException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.android.agoo.common.AgooConstants;
import tb.brt;
import tb.j8l;
import tb.m8l;
import tb.o41;
import tb.re;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class GlobalClientInfo implements IGlobalClientInfoService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AGOO_SERVICE_ID = "agooSend";
    public static IAgooAppReceiver mAgooAppReceiver;
    public static volatile Context mContext;
    public static String mCookieSec;
    private static volatile GlobalClientInfo mInstance;
    private Map<String, AccsDataListener> LISTENERS = new ConcurrentHashMap();
    private volatile IBinder mAccsMainBinder;
    private ActivityManager mActivityManager;
    private ConcurrentHashMap<String, IAppReceiver> mAppReceiver;
    private ConnectivityManager mConnectivityManager;
    private ConcurrentHashMap<String, ILoginInfo> mILoginInfoImpl;
    private PackageInfo mPackageInfo;
    private static final String TAG = GlobalClientInfo.class.getName();
    private static Map<String, String> SERVICES = new ConcurrentHashMap();
    private static Map<String, ArrayList<AccsConnectStateListener>> connListenerMap = new ConcurrentHashMap();
    public static Map<String, Map<String, String>> TAG_SERVICES = new ConcurrentHashMap();
    public static final Map<String, MessageFilter> FILTERS = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                GlobalClientInfo.mCookieSec = UtilityImpl.restoreCookie(GlobalClientInfo.mContext);
            }
        }
    }

    private GlobalClientInfo(Context context) {
        if (mContext == null) {
            mContext = getContext();
        }
        if (mContext == null && context != null) {
            mContext = context.getApplicationContext();
        }
        brt.b(new a());
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return TAG;
    }

    public static Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        if (mContext == null) {
            mContext = o41.a();
        }
        return mContext;
    }

    public static GlobalClientInfo getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlobalClientInfo) ipChange.ipc$dispatch("68045031", new Object[]{context});
        }
        if (mInstance == null) {
            synchronized (GlobalClientInfo.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new GlobalClientInfo(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mInstance;
    }

    private void notifyMainBinderHeld(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb687e80", new Object[]{this, context});
        } else {
            com.taobao.accs.connection.state.a.v().E(context);
        }
    }

    private void registerAllService(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e79a3e5d", new Object[]{this, str, map});
        } else if (map != null) {
            if (!j8l.u() || UtilityImpl.isMainProcess(mContext)) {
                if (TAG_SERVICES.get(str) == null) {
                    TAG_SERVICES.put(str, new ConcurrentHashMap());
                }
                TAG_SERVICES.get(str).putAll(map);
                brt.d().execute(new g(str, map));
            }
        }
    }

    public static void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{context});
        } else if (mContext == null && context != null) {
            mContext = context;
        }
    }

    public void clearLoginInfoImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed16ccb1", new Object[]{this});
        } else {
            this.mILoginInfoImpl = null;
        }
    }

    public ActivityManager getActivityManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityManager) ipChange.ipc$dispatch("14fd76b0", new Object[]{this});
        }
        if (this.mActivityManager == null) {
            this.mActivityManager = (ActivityManager) mContext.getSystemService("activity");
        }
        return this.mActivityManager;
    }

    public Map<String, String> getAllService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("900c13d0", new Object[]{this, str});
        }
        if (TAG_SERVICES.get(str) == null || TAG_SERVICES.get(str).isEmpty()) {
            return null;
        }
        return TAG_SERVICES.get(str);
    }

    public Map<String, IAppReceiver> getAppReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("652231f6", new Object[]{this});
        }
        return this.mAppReceiver;
    }

    public ConnectivityManager getConnectivityManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnectivityManager) ipChange.ipc$dispatch("30cb7534", new Object[]{this});
        }
        if (this.mConnectivityManager == null) {
            this.mConnectivityManager = (ConnectivityManager) mContext.getSystemService("connectivity");
        }
        return this.mConnectivityManager;
    }

    public AccsDataListener getListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccsDataListener) ipChange.ipc$dispatch("7dd04fa8", new Object[]{this, str});
        }
        return this.LISTENERS.get(str);
    }

    public IBinder getMainBinder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("ae7f32fd", new Object[]{this});
        }
        return this.mAccsMainBinder;
    }

    public String getNick(String str) {
        ILoginInfo iLoginInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9285c36", new Object[]{this, str});
        }
        ConcurrentHashMap<String, ILoginInfo> concurrentHashMap = this.mILoginInfoImpl;
        if (concurrentHashMap == null || (iLoginInfo = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return iLoginInfo.getNick();
    }

    public String getService(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("46264ad0", new Object[]{this, str}) : SERVICES.get(str);
    }

    public String getSid(String str) {
        ILoginInfo iLoginInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22690597", new Object[]{this, str});
        }
        ConcurrentHashMap<String, ILoginInfo> concurrentHashMap = this.mILoginInfoImpl;
        if (concurrentHashMap == null || (iLoginInfo = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return iLoginInfo.getSid();
    }

    public String getUserId(String str) {
        ILoginInfo iLoginInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72541173", new Object[]{this, str});
        }
        ConcurrentHashMap<String, ILoginInfo> concurrentHashMap = this.mILoginInfoImpl;
        if (concurrentHashMap == null || (iLoginInfo = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return iLoginInfo.getUserId();
    }

    @Override // com.taobao.accs.IGlobalClientInfoService
    public void registerAllRemoteService(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abebeb43", new Object[]{this, str, map});
            return;
        }
        if (TAG_SERVICES.get(str) == null) {
            TAG_SERVICES.put(str, new ConcurrentHashMap());
        }
        TAG_SERVICES.get(str).putAll(map);
    }

    public void registerListener(String str, AccsAbstractDataListener accsAbstractDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d49cb3", new Object[]{this, str, accsAbstractDataListener});
        } else {
            registerListener(str, (AccsDataListener) accsAbstractDataListener);
        }
    }

    public void setLoginInfoImpl(String str, ILoginInfo iLoginInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d63cb3d", new Object[]{this, str, iLoginInfo});
            return;
        }
        if (this.mILoginInfoImpl == null) {
            this.mILoginInfoImpl = new ConcurrentHashMap<>(1);
        }
        if (iLoginInfo != null) {
            this.mILoginInfoImpl.put(str, iLoginInfo);
        }
    }

    public void setMainBinder(IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4367533", new Object[]{this, iBinder});
        } else {
            this.mAccsMainBinder = iBinder;
        }
    }

    @Override // com.taobao.accs.IGlobalClientInfoService
    public void setRemoteAgooAppReceiver(IAgooAppReceiver iAgooAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa53f56d", new Object[]{this, iAgooAppReceiver});
        } else {
            mAgooAppReceiver = iAgooAppReceiver;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IAppReceiver f6030a;
        public final /* synthetic */ String b;

        public b(IAppReceiver iAppReceiver, String str) {
            this.f6030a = iAppReceiver;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                IGlobalClientInfoService iGlobalClientInfoService = (IGlobalClientInfoService) re.q(new ComponentName(GlobalClientInfo.mContext, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, GlobalClientInfo.mContext));
                IAppReceiver iAppReceiver = this.f6030a;
                if (iAppReceiver instanceof IAgooAppReceiver) {
                    iGlobalClientInfoService.setRemoteAgooAppReceiver((IAgooAppReceiver) iAppReceiver);
                } else {
                    iGlobalClientInfoService.setRemoteAppReceiver(this.b, iAppReceiver);
                }
            } catch (IPCException e) {
                ALog.e(GlobalClientInfo.access$000(), "setAppReceiver exception", e, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6031a;
        public final /* synthetic */ String b;

        public c(String str, String str2) {
            this.f6031a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                IGlobalClientInfoService iGlobalClientInfoService = (IGlobalClientInfoService) re.q(new ComponentName(GlobalClientInfo.mContext, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, GlobalClientInfo.mContext));
                AccsMainCenter.h().m(iGlobalClientInfoService);
                iGlobalClientInfoService.registerRemoteService(this.f6031a, this.b);
            } catch (IPCException e) {
                ALog.e(GlobalClientInfo.access$000(), "registerService exception", e, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6032a;

        public d(String str) {
            this.f6032a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ((IGlobalClientInfoService) re.q(new ComponentName(GlobalClientInfo.mContext, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, GlobalClientInfo.mContext))).unregisterRemoteService(this.f6032a);
            } catch (IPCException e) {
                ALog.e(GlobalClientInfo.access$000(), "unRegisterService exception", e, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6033a;
        public final /* synthetic */ AccsDataListener b;

        public e(String str, AccsDataListener accsDataListener) {
            this.f6033a = str;
            this.b = accsDataListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ((IGlobalClientInfoService) re.q(new ComponentName(GlobalClientInfo.mContext, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, GlobalClientInfo.mContext))).registerRemoteListener(this.f6033a, this.b);
            } catch (IPCException e) {
                ALog.e(GlobalClientInfo.access$000(), "registerListener exception", e, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6034a;

        public f(String str) {
            this.f6034a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ((IGlobalClientInfoService) re.q(new ComponentName(GlobalClientInfo.mContext, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, GlobalClientInfo.mContext))).unregisterRemoteListener(this.f6034a);
            } catch (IPCException e) {
                ALog.e(GlobalClientInfo.access$000(), "unregisterListener exception", e, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6035a;
        public final /* synthetic */ Map b;

        public g(String str, Map map) {
            this.f6035a = str;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (j8l.u() && re.u(new ComponentName(GlobalClientInfo.mContext, AccsIPCProvider.class))) {
                try {
                    ((IGlobalClientInfoService) re.q(new ComponentName(GlobalClientInfo.mContext, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, GlobalClientInfo.mContext))).registerAllRemoteService(this.f6035a, this.b);
                } catch (IPCException e) {
                    ALog.e(GlobalClientInfo.access$000(), "registerAllService exception", e, new Object[0]);
                }
            }
        }
    }

    public PackageInfo getPackageInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PackageInfo) ipChange.ipc$dispatch("4454a4a8", new Object[]{this});
        }
        try {
            if (this.mPackageInfo == null) {
                this.mPackageInfo = mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 0);
            }
        } catch (Throwable th) {
            ALog.e("GlobalClientInfo", "getPackageInfo", th, new Object[0]);
        }
        return this.mPackageInfo;
    }

    public String getService(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("681d8246", new Object[]{this, str, str2});
        }
        if (TAG_SERVICES.get(str) != null) {
            return TAG_SERVICES.get(str).get(str2);
        }
        return null;
    }

    public void registerListener(String str, AccsDataListener accsDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38f03835", new Object[]{this, str, accsDataListener});
        } else if ((!j8l.u() || UtilityImpl.isMainProcess(mContext)) && !TextUtils.isEmpty(str) && accsDataListener != null) {
            ALog.e(TAG, "registerListener info", "serviceId", str);
            this.LISTENERS.put(str, accsDataListener);
            if (j8l.u() && re.u(new ComponentName(mContext, AccsIPCProvider.class))) {
                brt.d().execute(new e(str, accsDataListener));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$registerConnectionListener$33(Context context, String str, AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f68677c7", new Object[]{context, str, accsConnectStateListener});
            return;
        }
        try {
            ((IGlobalClientInfoService) re.q(new ComponentName(context, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, context))).registerRemoteConnectionListener(str, accsConnectStateListener.getClass().getName(), accsConnectStateListener);
        } catch (IPCException e2) {
            ALog.e(TAG, "registerConnectionListener err", e2, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$unRegisterConnectStateListener$34(Context context, String str, AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2392ae66", new Object[]{context, str, accsConnectStateListener});
            return;
        }
        try {
            ((IGlobalClientInfoService) re.q(new ComponentName(context, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, context))).unregisterRemoteConnectionListener(str, accsConnectStateListener.getClass().getName(), accsConnectStateListener);
        } catch (IPCException e2) {
            ALog.e(TAG, "unRegisterService exception", e2, new Object[0]);
        }
    }

    public void recoverConnectionListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d1d047", new Object[]{this, str});
            return;
        }
        try {
            ArrayList<AccsConnectStateListener> arrayList = connListenerMap.get(str);
            if (!(arrayList == null || arrayList.isEmpty() || !m8l.w())) {
                IGlobalClientInfoService iGlobalClientInfoService = (IGlobalClientInfoService) re.q(new ComponentName(mContext, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, mContext));
                for (AccsConnectStateListener accsConnectStateListener : arrayList) {
                    iGlobalClientInfoService.registerRemoteConnectionListener(str, accsConnectStateListener.getClass().getName(), accsConnectStateListener);
                }
            }
        } catch (Throwable th) {
            ALog.e(TAG, "recoverConnectionListener error", th, new Object[0]);
        }
    }

    public void recoverListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111ff2c9", new Object[]{this, str});
            return;
        }
        try {
            IGlobalClientInfoService iGlobalClientInfoService = (IGlobalClientInfoService) re.q(new ComponentName(mContext, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, mContext));
            if (!this.LISTENERS.isEmpty()) {
                for (Map.Entry<String, AccsDataListener> entry : this.LISTENERS.entrySet()) {
                    iGlobalClientInfoService.registerRemoteListener(entry.getKey(), entry.getValue());
                }
            }
            if (getAllService(str) != null) {
                iGlobalClientInfoService.registerAllRemoteService(str, getAllService(str));
            }
            if (!SERVICES.isEmpty()) {
                for (Map.Entry<String, String> entry2 : SERVICES.entrySet()) {
                    iGlobalClientInfoService.registerRemoteService(entry2.getKey(), entry2.getValue());
                }
            }
        } catch (IPCException e2) {
            ALog.e(TAG, "recoverListener error", e2, new Object[0]);
        }
    }

    public void setAppReceiver(String str, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f333dd", new Object[]{this, str, iAppReceiver});
        } else if ((!j8l.u() || UtilityImpl.isMainProcess(mContext)) && iAppReceiver != null) {
            if (iAppReceiver instanceof IAgooAppReceiver) {
                mAgooAppReceiver = (IAgooAppReceiver) iAppReceiver;
            } else {
                if (this.mAppReceiver == null) {
                    this.mAppReceiver = new ConcurrentHashMap<>(2);
                }
                this.mAppReceiver.put(str, iAppReceiver);
                try {
                    registerAllService(str, iAppReceiver.getAllServices());
                } catch (IPCException e2) {
                    ALog.e(TAG, "setAppReceiver getAllServices", e2, new Object[0]);
                }
            }
            if (j8l.u() && re.u(new ComponentName(mContext, AccsIPCProvider.class))) {
                brt.d().execute(new b(iAppReceiver, str));
            }
        }
    }

    @Override // com.taobao.accs.IGlobalClientInfoService
    public void setRemoteAppReceiver(String str, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("451cdc37", new Object[]{this, str, iAppReceiver});
            return;
        }
        if (this.mAppReceiver == null) {
            this.mAppReceiver = new ConcurrentHashMap<>(2);
        }
        this.mAppReceiver.put(str, iAppReceiver);
        try {
            registerAllService(str, iAppReceiver.getAllServices());
        } catch (IPCException e2) {
            ALog.e(TAG, "setRemoteAppReceiver registerAllService", e2, new Object[0]);
        }
    }

    static {
        t2o.a(343933033);
        t2o.a(343932953);
        SERVICES.put(AGOO_SERVICE_ID, "org.android.agoo.accs.AgooService");
        SERVICES.put(AgooConstants.AGOO_SERVICE_AGOOACK, "org.android.agoo.accs.AgooService");
        SERVICES.put("agooTokenReport", "org.android.agoo.accs.AgooService");
    }

    public ArrayList<AccsConnectStateListener> getConnectionListenerList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("11dfa8d1", new Object[]{this, str});
        }
        ArrayList<AccsConnectStateListener> arrayList = connListenerMap.get(str);
        ALog.e(TAG, "getConnectionListenerList", Constants.KEY_CONFIG_TAG, str, "list size", Integer.valueOf(arrayList == null ? 0 : arrayList.size()));
        return arrayList;
    }

    @Override // com.taobao.accs.IGlobalClientInfoService
    public void registerRemoteListener(String str, AccsDataListener accsDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc431cf", new Object[]{this, str, accsDataListener});
            return;
        }
        ALog.e(TAG, "registerRemoteListener", "serviceId", str);
        this.LISTENERS.put(str, accsDataListener);
    }

    @Override // com.taobao.accs.IGlobalClientInfoService
    public void registerRemoteMainBinder(IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("304f2bda", new Object[]{this, iBinder});
            return;
        }
        ALog.e(TAG, "registerRemoteMainBinder success", "MainBinder", iBinder);
        this.mAccsMainBinder = iBinder;
        notifyMainBinderHeld(mContext);
    }

    public void unRegisterConnectStateListener(final String str, final AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a5bd58", new Object[]{this, str, accsConnectStateListener});
        } else if (accsConnectStateListener != null) {
            String str2 = TAG;
            ALog.e(str2, "unRegisterConnectStateListener", Constants.KEY_CONFIG_TAG, str);
            ArrayList<AccsConnectStateListener> arrayList = connListenerMap.get(str);
            if (arrayList != null) {
                arrayList.remove(accsConnectStateListener);
            }
            final Context context = getContext();
            if (UtilityImpl.isMainProcess(context) && ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(str)) {
                ALog.e(str2, "unRegisterConnectStateListener return", new Object[0]);
            } else if (j8l.u() && UtilityImpl.isMainProcess(context) && re.u(new ComponentName(context, AccsIPCProvider.class))) {
                brt.d().execute(new Runnable() { // from class: tb.vaa
                    @Override // java.lang.Runnable
                    public final void run() {
                        GlobalClientInfo.lambda$unRegisterConnectStateListener$34(context, str, accsConnectStateListener);
                    }
                });
            }
        }
    }

    public void unRegisterService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5dd008a", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            ALog.e(TAG, "unRegisterService", "serviceId", str);
            SERVICES.remove(str);
            if (j8l.u() && UtilityImpl.isMainProcess(mContext) && re.u(new ComponentName(mContext, AccsIPCProvider.class))) {
                brt.d().execute(new d(str));
            }
        }
    }

    public void unregisterListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dfcfa1", new Object[]{this, str});
        } else if (!j8l.u() || UtilityImpl.isMainProcess(mContext)) {
            ALog.e(TAG, "unregisterListener info", "serviceId", str);
            this.LISTENERS.remove(str);
            if (j8l.u() && re.u(new ComponentName(mContext, AccsIPCProvider.class))) {
                brt.d().execute(new f(str));
            }
        }
    }

    @Override // com.taobao.accs.IGlobalClientInfoService
    public void unregisterRemoteListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b02087", new Object[]{this, str});
            return;
        }
        ALog.e(TAG, "unregisterRemoteListener", "serviceId", str);
        this.LISTENERS.remove(str);
    }

    @Override // com.taobao.accs.IGlobalClientInfoService
    public void unregisterRemoteService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7e66b04", new Object[]{this, str});
            return;
        }
        ALog.e(TAG, "unregisterRemoteService", "serviceId", str);
        SERVICES.remove(str);
    }

    public void registerConnectionListener(final String str, final AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e0e47a", new Object[]{this, str, accsConnectStateListener});
        } else if (accsConnectStateListener != null) {
            String str2 = TAG;
            ALog.e(str2, "registerConnectionListener", Constants.KEY_CONFIG_TAG, str, DataReceiveMonitor.CB_LISTENER, accsConnectStateListener);
            ArrayList<AccsConnectStateListener> arrayList = connListenerMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                connListenerMap.put(str, arrayList);
            }
            if (!arrayList.contains(accsConnectStateListener)) {
                arrayList.add(accsConnectStateListener);
            }
            final Context context = getContext();
            if (UtilityImpl.isMainProcess(context) && ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(str)) {
                ALog.e(str2, "registerConnectionListener return", new Object[0]);
            } else if (j8l.u() && UtilityImpl.isMainProcess(context) && re.u(new ComponentName(context, AccsIPCProvider.class))) {
                brt.d().execute(new Runnable() { // from class: tb.waa
                    @Override // java.lang.Runnable
                    public final void run() {
                        GlobalClientInfo.lambda$registerConnectionListener$33(context, str, accsConnectStateListener);
                    }
                });
            }
        }
    }

    @Override // com.taobao.accs.IGlobalClientInfoService
    public void registerRemoteService(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a744f3c7", new Object[]{this, str, str2});
            return;
        }
        ALog.e(TAG, "registerRemoteService info", "serviceId", str, "serviceClassName", str2);
        SERVICES.put(str, str2);
    }

    public void registerService(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c5caad", new Object[]{this, str, str2});
            return;
        }
        ALog.e(TAG, "registerService info", "serviceId", str, "serviceClassName", str2);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            SERVICES.put(str, str2);
            if (j8l.u() && UtilityImpl.isMainProcess(mContext) && re.u(new ComponentName(mContext, AccsIPCProvider.class))) {
                brt.d().execute(new c(str, str2));
            }
        }
    }

    @Override // com.taobao.accs.IGlobalClientInfoService
    public void registerRemoteConnectionListener(String str, String str2, AccsConnectStateListener accsConnectStateListener) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56db0f8a", new Object[]{this, str, str2, accsConnectStateListener});
            return;
        }
        ALog.e(TAG, "registerRemoteConnectionListener", Constants.KEY_CONFIG_TAG, str, "listenerName", str2);
        ArrayList<AccsConnectStateListener> arrayList = connListenerMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            connListenerMap.put(str, arrayList);
        }
        if (!arrayList.contains(accsConnectStateListener)) {
            arrayList.add(accsConnectStateListener);
        }
    }

    @Override // com.taobao.accs.IGlobalClientInfoService
    public void unregisterRemoteConnectionListener(String str, String str2, AccsConnectStateListener accsConnectStateListener) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ead10d1", new Object[]{this, str, str2, accsConnectStateListener});
            return;
        }
        ALog.e(TAG, "unregisterRemoteConnectionListener", Constants.KEY_CONFIG_TAG, str, "listenerName", str2);
        ArrayList<AccsConnectStateListener> arrayList = connListenerMap.get(str);
        if (arrayList != null) {
            arrayList.remove(accsConnectStateListener);
        }
    }
}
