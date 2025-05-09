package com.taobao.accs.init;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.ut.abtest.pipeline.accs.EvoAccsListener;
import com.alibaba.ut.abtest.pipeline.accs.EvoAccsService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.ILoginInfo;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.center.AccsMainCenter;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.init.Launcher_InitAccs;
import com.taobao.accs.internal.ACCSExceptionsReceiver;
import com.taobao.accs.internal.ACCSRestartService;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.ICallback;
import com.taobao.agoo.TaobaoConstants;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.android.agoo.control.NotifManager;
import tb.brt;
import tb.h;
import tb.lef;
import tb.o70;
import tb.s9u;
import tb.t2o;
import tb.t4o;
import tb.tv9;
import tb.va8;
import tb.xd0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Launcher_InitAccs implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Map<String, String> SERVICES;
    private static final String TAG = "Launcher_InitAccs";
    public static String mAppkey;
    public static Context mContext;
    private static t4o mRequestListener;
    public static String mSid;
    public static String mTtid;
    public static volatile String mUserId;
    public static boolean mForceBindUser = false;
    public static boolean mIsInited = false;
    public static volatile boolean mIsIdleTime = false;
    public static String defaultAppkey = "21646297";
    public static IAppReceiver mAppReceiver = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Localization.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Launcher_InitAccs launcher_InitAccs) {
        }

        public static /* synthetic */ void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4fbb62a1", new Object[0]);
                return;
            }
            try {
                ALog.i(Launcher_InitAccs.TAG, "Locale change bindApp", new Object[0]);
                ACCSClient.getAccsClient().bindApp(Launcher_InitAccs.mTtid, Launcher_InitAccs.mAppReceiver);
            } catch (AccsException e) {
                ALog.e(Launcher_InitAccs.TAG, "Locale change bindApp err", e, new Object[0]);
            }
        }

        @Override // com.alibaba.ability.localization.Localization.a
        public void onChange(Language language, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c58b74d", new Object[]{this, language, str});
            } else {
                brt.b(new Runnable() { // from class: tb.vhg
                    @Override // java.lang.Runnable
                    public final void run() {
                        Launcher_InitAccs.a.b();
                    }
                });
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (!Launcher_InitAgooLifecycle.hasConnected && !ACCSClient.getAccsClient().isAccsConnected()) {
                    str = "fail";
                    s9u.u().d("accs", "connect").start().X("status", str).finish();
                }
                str = "success";
                s9u.u().d("accs", "connect").start().X("status", str).finish();
            } catch (Throwable th) {
                ALog.e(Launcher_InitAccs.TAG, "traceAccs error", th, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements IAppReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a extends ICallback {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(c cVar) {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/init/Launcher_InitAccs$3$1");
            }

            @Override // com.taobao.agoo.ICallback
            public void onFailure(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                    return;
                }
                ALog.e(Launcher_InitAccs.TAG, "setAlias fail, errDesc:" + str2 + " errorCode:" + str, new Object[0]);
            }

            @Override // com.taobao.agoo.ICallback
            public void onSuccess() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                } else {
                    ALog.e(Launcher_InitAccs.TAG, "setAlias success", new Object[0]);
                }
            }
        }

        @Override // com.taobao.accs.IAppReceiver
        public Map<String, String> getAllServices() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("4e25da25", new Object[]{this});
            }
            return Launcher_InitAccs.SERVICES;
        }

        @Override // com.taobao.accs.IAppReceiver
        public String getService(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("46264ad0", new Object[]{this, str});
            }
            return Launcher_InitAccs.SERVICES.get(str);
        }

        @Override // com.taobao.accs.IAppReceiver
        public void onBindApp(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1fbb8b7", new Object[]{this, new Integer(i)});
                return;
            }
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.e(Launcher_InitAccs.TAG, "onBindApp,  errorCode:" + i, new Object[0]);
            }
            if (i == 200) {
                if (UtilityImpl.isMainProcess(Launcher_InitAccs.mContext)) {
                    if (Launcher_InitAccs.access$000() == null) {
                        Launcher_InitAccs.access$002(new t4o(Launcher_InitAccs.mContext));
                    }
                    GlobalClientInfo.getInstance(Launcher_InitAccs.mContext).registerListener(NotifManager.getServiceId(Launcher_InitAccs.mContext, TaobaoConstants.SERVICE_ID_DEVICECMD), Launcher_InitAccs.access$000());
                }
                if (TextUtils.isEmpty(Launcher_InitAccs.mUserId) || (!Launcher_InitAccs.mIsIdleTime && !UtilityImpl.needPeriodicReport(Launcher_InitAccs.mContext, Constants.SP_KEY_BIND_USER_TIME))) {
                    ALog.e(Launcher_InitAccs.TAG, "onBindApp return early,", "isUserIdEmpty", Boolean.valueOf(TextUtils.isEmpty(Launcher_InitAccs.mUserId)), "mIsIdleTime", Boolean.valueOf(Launcher_InitAccs.mIsIdleTime));
                    return;
                }
                try {
                    ACCSClient.getAccsClient().bindUser(Launcher_InitAccs.mUserId, Launcher_InitAccs.mForceBindUser);
                    TaobaoRegister.setAlias(Launcher_InitAccs.mContext, Launcher_InitAccs.mUserId, new a(this));
                } catch (AccsException e) {
                    ALog.e(Launcher_InitAccs.TAG, "bindUser", e, new Object[0]);
                }
                Launcher_InitAccs.mForceBindUser = false;
            }
        }

        @Override // com.taobao.accs.IAppReceiver
        public void onBindUser(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2ee7e0b", new Object[]{this, str, new Integer(i)});
                return;
            }
            ALog.e(Launcher_InitAccs.TAG, "onBindUser,", "isUserIdEmpty", Boolean.valueOf(TextUtils.isEmpty(str)), "errorCode", Integer.valueOf(i));
            if (i == 200 && UtilityImpl.isKeepAliveReport()) {
                ALog.e(Launcher_InitAccs.TAG, "onBindUser return success by keepAliveReport", new Object[0]);
                Launcher_InitAccs.mContext.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit().putLong(Constants.SP_KEY_BIND_USER_TIME, System.currentTimeMillis()).apply();
            } else if (i == 300) {
                try {
                    ACCSClient.getAccsClient().bindApp(Launcher_InitAccs.mTtid, this);
                } catch (AccsException e) {
                    ALog.e(Launcher_InitAccs.TAG, "bindApp", e, new Object[0]);
                }
            }
        }

        @Override // com.taobao.accs.IAppReceiver
        public void onData(String str, String str2, byte[] bArr) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20c4430b", new Object[]{this, str, str2, bArr});
            } else if (ALog.isPrintLog(ALog.Level.D)) {
                StringBuilder sb = new StringBuilder("onData,  userId:");
                sb.append(str);
                sb.append("dataId:");
                sb.append(str2);
                sb.append(" dataLen:");
                if (bArr == null) {
                    i = 0;
                } else {
                    i = bArr.length;
                }
                sb.append(i);
                ALog.d(Launcher_InitAccs.TAG, sb.toString(), new Object[0]);
            }
        }

        @Override // com.taobao.accs.IAppReceiver
        public void onSendData(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("46c12d21", new Object[]{this, str, new Integer(i)});
            } else if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d(Launcher_InitAccs.TAG, "onSendData,  dataId:" + str + " errorCode:" + i, new Object[0]);
            }
        }

        @Override // com.taobao.accs.IAppReceiver
        public void onUnbindApp(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1230c610", new Object[]{this, new Integer(i)});
            } else if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d(Launcher_InitAccs.TAG, "onUnbindApp,  errorCode:" + i, new Object[0]);
            }
        }

        @Override // com.taobao.accs.IAppReceiver
        public void onUnbindUser(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f4f2cdc", new Object[]{this, new Integer(i)});
            } else if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d(Launcher_InitAccs.TAG, "onUnbindUser, errorCode:" + i, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d implements ILoginInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(343933118);
            t2o.a(343932955);
        }

        @Override // com.taobao.accs.ILoginInfo
        public boolean getCommentUsed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3fbf9f11", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // com.taobao.accs.ILoginInfo
        public String getEcode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("42b43e5d", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.accs.ILoginInfo
        public String getHeadPicLink() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5ea1ca4b", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.accs.ILoginInfo
        public String getNick() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.accs.ILoginInfo
        public String getSid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("169fb061", new Object[]{this});
            }
            return Launcher_InitAccs.mSid;
        }

        @Override // com.taobao.accs.ILoginInfo
        public String getSsoToken() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d1ac5859", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.accs.ILoginInfo
        public String getUserId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
            }
            return Launcher_InitAccs.mUserId;
        }
    }

    public static /* synthetic */ t4o access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t4o) ipChange.ipc$dispatch("d064c94d", new Object[0]);
        }
        return mRequestListener;
    }

    public static /* synthetic */ t4o access$002(t4o t4oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t4o) ipChange.ipc$dispatch("8ad465a3", new Object[]{t4oVar});
        }
        mRequestListener = t4oVar;
        return t4oVar;
    }

    private void initADaemon(final Application application, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff61620", new Object[]{this, application, new Integer(i)});
        } else if (Launcher_InitAgooLifecycle.mADaemonValid) {
            brt.h().schedule(new Runnable() { // from class: tb.uhg
                @Override // java.lang.Runnable
                public final void run() {
                    Launcher_InitAccs.lambda$initADaemon$12(application);
                }
            }, i, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$dynamicAddMsgReceiver$11() {
        try {
            IpChange ipChange = EvoAccsListener.$ipChange;
            ACCSClient.getAccsClient().registerDataListener(EvoAccsService.SERVICE_ID, (AccsAbstractDataListener) EvoAccsListener.class.newInstance());
            ALog.e(TAG, "dynamicAddReceiver finish", new Object[0]);
        } catch (Throwable th) {
            ALog.e(TAG, "dynamicAddMsgReceiver err", th, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$init$10() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5073a3dd", new Object[0]);
            return;
        }
        try {
            ACCSClient.getAccsClient().bindApp(mTtid, mAppReceiver);
        } catch (AccsException e) {
            ALog.e(TAG, "bindApp", e, new Object[0]);
        }
    }

    private void launchInMain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c492be18", new Object[]{this});
        } else {
            brt.b(new Runnable() { // from class: tb.rhg
                @Override // java.lang.Runnable
                public final void run() {
                    Launcher_InitAccs.this.lambda$launchInMain$14();
                }
            });
        }
    }

    private void traceAccs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("671803fe", new Object[]{this});
        } else {
            brt.h().schedule(new b(), 20L, TimeUnit.SECONDS);
        }
    }

    private void dynamicAddMsgReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6b94d5", new Object[]{this});
            return;
        }
        try {
            Map<String, String> map = SERVICES;
            map.put(o70.SERVICE_ID, "com.taobao.update.datasource.accs.AccsIpService");
            map.put("amp-sync", "com.taobao.message.init.accs.AccsMessageService");
        } catch (Throwable th) {
            ALog.e(TAG, "dynamicSetService err", th, new Object[0]);
        }
        brt.b(new Runnable() { // from class: tb.thg
            @Override // java.lang.Runnable
            public final void run() {
                Launcher_InitAccs.lambda$dynamicAddMsgReceiver$11();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$launchInMain$14() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e614f6c0", new Object[]{this});
            return;
        }
        try {
            if (h.e()) {
                ALog.e(TAG, "init MainBinder in launchInMain", new Object[0]);
                AccsMainCenter.h().i(false);
            }
            ACCSClient.getAccsClient().setLoginInfo(new d());
            ACCSClient.getAccsClient().bindApp(mTtid, mAppReceiver);
            tv9.h().q();
            Localization.a(new a(this));
        } catch (AccsException e) {
            ALog.e(TAG, "bindApp", e, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initADaemon$12(Application application) {
        try {
            Launcher_InitAgooLifecycle.adaemonClazz.getMethod("initialize", Context.class).invoke(null, application);
        } catch (Exception e) {
            ALog.e(TAG, "adaemon initializeLifecycle error", e, new Object[0]);
        }
    }

    private void launchInChannel() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cc10b2", new Object[]{this});
            return;
        }
        GlobalClientInfo.TAG_SERVICES.put("default", mAppReceiver.getAllServices());
        boolean isAppKeepAlive = UtilityImpl.isAppKeepAlive();
        ALog.e(TAG, "launchInChannel", "isAppKeepAlive", Boolean.valueOf(isAppKeepAlive));
        if (isAppKeepAlive) {
            va8.getConnection(mContext, "default", true, -1);
            ACCSRestartService.a(mContext);
            UtilityImpl.enableService(mContext, new ComponentName(mContext, ACCSExceptionsReceiver.class));
            if (UtilityImpl.isReleaseAppVersion(mContext)) {
                UtilityImpl.enableService(mContext);
            }
        } else {
            UtilityImpl.disableComponent(mContext, new ComponentName(mContext, ACCSExceptionsReceiver.class));
        }
        Intent intent = new Intent(Constants.ACTION_START_SERVICE);
        intent.putExtra("appKey", mAppkey);
        intent.putExtra("ttid", mTtid);
        intent.putExtra("packageName", mContext.getPackageName());
        intent.putExtra("app_sercet", "");
        intent.putExtra("mode", AccsClientConfig.mEnv);
        intent.putExtra(Config.PROPERTY_APP_KEY, Config.getAgooAppKey(GlobalClientInfo.getContext()));
        intent.putExtra(Constants.KEY_CONFIG_TAG, "default");
        intent.putExtra("start", true);
        intent.setClassName(mContext.getPackageName(), xd0.channelService);
        lef.f(mContext, intent);
        if (!UtilityImpl.getServiceEnabled(mContext)) {
            ALog.e(TAG, "channelService disabled", new Object[0]);
        }
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        initImpl(application, hashMap, 0);
        mIsIdleTime = true;
        ALog.e(TAG, "bindApp in Launcher_InitAccs init", new Object[0]);
        brt.b(new Runnable() { // from class: tb.shg
            @Override // java.lang.Runnable
            public final void run() {
                Launcher_InitAccs.lambda$init$10();
            }
        });
        if (UtilityImpl.isMainProcess(application)) {
            traceAccs();
        }
    }

    public void initImpl(Application application, HashMap<String, Object> hashMap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af54a98", new Object[]{this, application, hashMap, new Integer(i)});
            return;
        }
        ALog.e(TAG, "initImpl", new Object[0]);
        Log.e("NAccs", "Launcher_InitAccs initImpl");
        try {
            if (mIsInited) {
                ALog.e(TAG, "initImpl return", new Object[0]);
                return;
            }
            Context applicationContext = application.getApplicationContext();
            mContext = applicationContext;
            UtilityImpl.debug(applicationContext);
            initAccs(application, hashMap);
            initADaemon(application, i);
            dynamicAddMsgReceiver();
            if (UtilityImpl.isMainProcess(mContext)) {
                mIsInited = true;
                launchInMain();
            } else if (UtilityImpl.isChannelProcess(mContext)) {
                launchInChannel();
            }
            UtilityImpl.asyncGetOAID(application, null);
        } catch (Throwable th) {
            ALog.e(TAG, "init", th, new Object[0]);
        }
    }

    static {
        t2o.a(343933113);
        HashMap hashMap = new HashMap();
        SERVICES = hashMap;
        hashMap.put("im", "com.taobao.tao.amp.remote.AccsReceiverCallback");
        hashMap.put("powermsg", "com.taobao.appfrmbundle.mkt.AccsReceiverService");
        hashMap.put("pmmonitor", "com.taobao.appfrmbundle.mkt.AccsReceiverService");
        hashMap.put("cloudsync", "com.taobao.datasync.network.accs.AccsCloudSyncService");
        hashMap.put("acds", "com.taobao.acds.compact.AccsACDSService");
        hashMap.put(GlobalClientInfo.AGOO_SERVICE_ID, "org.android.agoo.accs.AgooService");
        hashMap.put(AgooConstants.AGOO_SERVICE_AGOOACK, "org.android.agoo.accs.AgooService");
        hashMap.put("agooTokenReport", "org.android.agoo.accs.AgooService");
        hashMap.put("AliLive", "com.taobao.playbudyy.gameplugin.danmu.DanmuCallbackService");
        hashMap.put("orange", "com.taobao.orange.accssupport.OrangeAccsService");
        hashMap.put("tsla", "com.taobao.android.festival.accs.HomepageAccsMassService");
        hashMap.put("taobaoWaimaiAccsService", "com.taobao.takeout.order.detail.service.TakeoutOrderDetailACCSService");
        hashMap.put("login", "com.taobao.android.sso.v2.service.LoginAccsService");
        hashMap.put("ranger_abtest", "com.taobao.ranger3.RangerACCSService");
        hashMap.put("accs_poplayer", "com.taobao.tbpoplayer.AccsPopLayerService");
        hashMap.put("dm_abtest", "com.tmall.wireless.ant.accs.AntAccsService");
        hashMap.put("family", "com.taobao.family.FamilyAccsService");
        hashMap.put("adaemon", "com.taobao.adaemon.AdaemonMessageService");
        hashMap.put("taobao-dingtalk", "com.laiwang.protocol.android.LwpAccsService");
        hashMap.put("amp-sync", "com.taobao.message.init.accs.AccsReceiverCallback");
        hashMap.put("friend_invite_msg", "com.taobao.message.init.accs.TaoFriendAccsReceiverCallback");
        hashMap.put(WXBasicComponentType.SLIDER, "com.taobao.slide.accs.SlideAccsService");
        hashMap.put("mtl_bypass", "com.android.taobao.safeclean.AccsBypassService");
        hashMap.put("desktop_service", "com.taobao.desktop.channel.desktoplinktask.trigger.DesktopTaskTriggerService");
        hashMap.put("metaserver", "com.taobao.android.artry.MetaServerAccsService");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void initAccs(android.app.Application r9, java.util.HashMap<java.lang.String, java.lang.Object> r10) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.init.Launcher_InitAccs.initAccs(android.app.Application, java.util.HashMap):void");
    }
}
