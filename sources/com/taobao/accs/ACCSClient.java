package com.taobao.accs;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import anet.channel.SessionCenter;
import anet.channel.entity.ENV;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.MessageFilter;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.connection.ConnectionServiceManager;
import com.taobao.accs.connection.state.StateMachine;
import com.taobao.accs.connection.state.a;
import com.taobao.accs.data.AccsStreamConfig;
import com.taobao.accs.data.AckExtraData;
import com.taobao.accs.init.Launcher_InitAccs;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.brt;
import tb.czv;
import tb.h;
import tb.h5d;
import tb.j8l;
import tb.re;
import tb.t2o;
import tb.tv9;
import tb.xaa;
import tb.xd0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ACCSClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String TAG = "ACCSClient";
    public static Map<String, ACCSClient> mACCSClients = new ConcurrentHashMap(2);
    private static Context mContext;
    private String OTAG = TAG;
    public a mAccsManager;
    private AccsClientConfig mConfig;

    static {
        t2o.a(343932929);
    }

    public ACCSClient(AccsClientConfig accsClientConfig) {
        this.mConfig = accsClientConfig;
        this.OTAG += accsClientConfig.getTag();
        if (mContext == null) {
            Context context = GlobalClientInfo.mContext;
            mContext = context;
            if (context == null) {
                try {
                    mContext = re.r();
                } catch (Exception e) {
                    ALog.e(TAG, "[getContext]", e, new Object[0]);
                }
            }
        }
        this.mAccsManager = ACCSManager.getAccsInstance(mContext, accsClientConfig.getAppKey(), accsClientConfig.getTag());
    }

    public static ACCSClient getAccsClient() throws AccsException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ACCSClient) ipChange.ipc$dispatch("74b5d7a4", new Object[0]) : getAccsClient(null);
    }

    public static String getRegId(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61356cf8", new Object[]{context});
        }
        return j8l.p(context);
    }

    public static synchronized String init(Context context, String str) throws AccsException {
        synchronized (ACCSClient.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b8da0465", new Object[]{context, str});
            } else if (context == null || TextUtils.isEmpty(str)) {
                throw new AccsException("params error");
            } else {
                AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
                if (!AccsClientConfig.loadedStaticConfig) {
                    configByTag = new AccsClientConfig.Builder().setAppKey(str).build();
                    ALog.i(TAG, "init", "create config, appkey as tag");
                }
                return init(context, configByTag);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getAccsClient$0(ACCSClient aCCSClient, AccsClientConfig accsClientConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdb631f7", new Object[]{aCCSClient, accsClientConfig});
        } else {
            aCCSClient.updateConfig(accsClientConfig);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getAccsClient$1(ACCSClient aCCSClient, AccsClientConfig accsClientConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9977adb8", new Object[]{aCCSClient, accsClientConfig});
        } else {
            aCCSClient.updateConfig(accsClientConfig);
        }
    }

    public static void onApplicationCreate(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8056250b", new Object[]{application});
            return;
        }
        if (UtilityImpl.isMainProcess(application)) {
            tv9.h().j(application);
        }
        if (h5d.g(application, 3)) {
            ConnectionServiceManager.getInstance().coldLaunch();
        }
        if (UtilityImpl.isMainProcess(application)) {
            if (UtilityImpl.isChannelProcessAlive(application)) {
                a.v().c(StateMachine.Event.obtain(104));
            } else {
                a.v().c(StateMachine.Event.obtain(100));
            }
        } else if (UtilityImpl.isMainProcessAlive(application)) {
            a.v().c(StateMachine.Event.obtain(104));
        } else {
            a.v().c(StateMachine.Event.obtain(102));
        }
    }

    private void updateConfig(AccsClientConfig accsClientConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec2d53f8", new Object[]{this, accsClientConfig});
            return;
        }
        this.mConfig = accsClientConfig;
        a accsInstance = ACCSManager.getAccsInstance(mContext, accsClientConfig.getAppKey(), accsClientConfig.getTag());
        this.mAccsManager = accsInstance;
        if (accsInstance != null) {
            accsInstance.updateConfig(accsClientConfig);
        }
    }

    public boolean addBizAckInfo(String str, String str2, AckExtraData ackExtraData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c67adc39", new Object[]{this, str, str2, ackExtraData})).booleanValue();
        }
        a aVar = this.mAccsManager;
        if (aVar != null) {
            return aVar.addBizAckInfo(str, str2, ackExtraData);
        }
        ALog.e(this.OTAG, "addBizAckInfo mAccsManager null", new Object[0]);
        return false;
    }

    public void bindApp(String str, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7f6c13", new Object[]{this, str, iAppReceiver});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "bindApp mAccsManager null", new Object[0]);
        } else {
            aVar.bindApp(mContext, this.mConfig.getAppKey(), this.mConfig.getAppSecret(), str, iAppReceiver);
        }
    }

    public void bindUser(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dc42a39", new Object[]{this, str});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "bindUser mAccsManager null", new Object[0]);
        } else {
            aVar.bindUser(mContext, str);
        }
    }

    public boolean cancel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5301f18f", new Object[]{this, str})).booleanValue();
        }
        a aVar = this.mAccsManager;
        if (aVar != null) {
            return aVar.cancel(mContext, str);
        }
        ALog.e(this.OTAG, "cancel mAccsManager null", new Object[0]);
        return false;
    }

    public String getConnectionUnitInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4d9bf73", new Object[]{this});
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            return null;
        }
        return aVar.getConnectionUnitInfo();
    }

    @Deprecated
    public String getUserUnit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f59ed6b4", new Object[]{this});
        }
        return null;
    }

    public boolean isAccsConnected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eec7c18", new Object[]{this})).booleanValue();
        }
        a aVar = this.mAccsManager;
        if (aVar == null || !aVar.isAccsConnected()) {
            return false;
        }
        return true;
    }

    public static synchronized ACCSClient getAccsClient(String str) throws AccsException {
        synchronized (ACCSClient.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ACCSClient) ipChange.ipc$dispatch("56b41a1a", new Object[]{str});
            }
            if (TextUtils.isEmpty(str)) {
                str = "default";
                ALog.w(TAG, "getAccsClient", "configTag is null, use default!");
            }
            ALog.i(TAG, "getAccsClient", Constants.KEY_CONFIG_TAG, str);
            final AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
            if (configByTag == null && AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG.equals(str)) {
                xaa.f31247a = true;
                ALog.e(TAG, "v2Launched = true", new Object[0]);
                if (xd0.m(GlobalClientInfo.getContext())) {
                    initV2ConnectionConfig();
                    configByTag = AccsClientConfig.getConfigByTag(str);
                }
            }
            if (configByTag != null) {
                final ACCSClient aCCSClient = mACCSClients.get(str);
                if (aCCSClient == null) {
                    ALog.d(TAG, "getAccsClient create client", new Object[0]);
                    final ACCSClient aCCSClient2 = new ACCSClient(configByTag);
                    mACCSClients.put(str, aCCSClient2);
                    if (h.b()) {
                        brt.b(new Runnable() { // from class: tb.b1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ACCSClient.lambda$getAccsClient$0(ACCSClient.this, configByTag);
                            }
                        });
                    } else {
                        aCCSClient2.updateConfig(configByTag);
                    }
                    return aCCSClient2;
                }
                if (configByTag.equals(aCCSClient.mConfig)) {
                    ALog.i(TAG, "getAccsClient exists", new Object[0]);
                } else {
                    ALog.i(TAG, "getAccsClient update config", "old config", aCCSClient.mConfig.getTag(), "new config", configByTag.getTag());
                    if (h.b()) {
                        brt.b(new Runnable() { // from class: tb.c1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ACCSClient.lambda$getAccsClient$1(ACCSClient.this, configByTag);
                            }
                        });
                    } else {
                        aCCSClient.updateConfig(configByTag);
                    }
                }
                return aCCSClient;
            }
            ALog.e(TAG, "getAccsClient", "configTag not exist, please init first!!");
            throw new AccsException("configTag not exist");
        }
    }

    private static void initV2ConnectionConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff48613", new Object[0]);
            return;
        }
        Context context = GlobalClientInfo.getContext();
        try {
            AccsClientConfig.Builder connType = new AccsClientConfig.Builder().setAppKey(ACCSManager.getDefaultAppkey(context)).setConfigEnv(AccsClientConfig.mEnv).setTag(AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG).setVersion(2).setConnType("4");
            if (AccsClientConfig.mEnv == 0) {
                connType.setInappHost("umsgacs.m.taobao.com");
            } else {
                connType.setInappHost("umsgacs.wapa.taobao.com");
            }
            AccsClientConfig build = connType.build();
            ALog.e(TAG, "Build v2 connection", "appkey", build.getAppKey(), "env", Integer.valueOf(build.getConfigEnv()), "host", build.getInappHost());
            GlobalClientInfo.getInstance(context).setAppReceiver(AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG, Launcher_InitAccs.mAppReceiver);
        } catch (Throwable th) {
            ALog.e(TAG, "v2 construct err", th, new Object[0]);
        }
    }

    public void bindService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8548c49", new Object[]{this, str});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "bindService mAccsManager null", new Object[0]);
        } else {
            aVar.bindService(mContext, str);
        }
    }

    public void clearLoginInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae629b71", new Object[]{this});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "clearLoginInfo mAccsManager null", new Object[0]);
        } else {
            aVar.clearLoginInfo(mContext);
        }
    }

    public void forceDisableService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46b8eff", new Object[]{this});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "forceDisableService mAccsManager null", new Object[0]);
        } else {
            aVar.forceDisableService(mContext);
        }
    }

    public void forceEnableService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1262738e", new Object[]{this});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "forceEnableService mAccsManager null", new Object[0]);
        } else {
            aVar.forceEnableService(mContext);
        }
    }

    public Map<String, Boolean> forceReConnectChannel() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b612f593", new Object[]{this});
        }
        a aVar = this.mAccsManager;
        if (aVar != null) {
            return aVar.forceReConnectChannel();
        }
        ALog.e(this.OTAG, "forceReConnectChannel mAccsManager null", new Object[0]);
        return null;
    }

    public Map<String, Boolean> getChannelState() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("83cd4940", new Object[]{this});
        }
        a aVar = this.mAccsManager;
        if (aVar != null) {
            return aVar.getChannelState();
        }
        ALog.e(this.OTAG, "getChannelState mAccsManager null", new Object[0]);
        return null;
    }

    public long getServerTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cda1621", new Object[]{this})).longValue();
        }
        a aVar = this.mAccsManager;
        if (aVar != null) {
            return aVar.getServerTime();
        }
        ALog.e(this.OTAG, "getServerTime mAccsManager null", new Object[0]);
        return 0L;
    }

    public boolean isNetworkReachable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("401eec14", new Object[]{this})).booleanValue();
        }
        a aVar = this.mAccsManager;
        if (aVar != null) {
            return aVar.isNetworkReachable(mContext);
        }
        ALog.e(this.OTAG, "isNetworkReachable mAccsManager null", new Object[0]);
        return false;
    }

    public boolean notifyMsgDelivery(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dd9b921", new Object[]{this, str})).booleanValue();
        }
        a aVar = this.mAccsManager;
        if (aVar != null) {
            return aVar.notifyMsgDelivery(str);
        }
        ALog.e(this.OTAG, "notifyMsgDelivery mAccsManager null", new Object[0]);
        return false;
    }

    public void queryStream(AccsStreamConfig accsStreamConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8467ea3", new Object[]{this, accsStreamConfig});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "queryStream mAccsManager null", new Object[0]);
        } else {
            aVar.queryStream(accsStreamConfig);
        }
    }

    public void registerConnectStateListener(AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb59c4bb", new Object[]{this, accsConnectStateListener});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "registerConnectStateListener mAccsManager null", new Object[0]);
        } else {
            aVar.registerConnectStateListener(accsConnectStateListener);
        }
    }

    public void registerDataListener(String str, AccsAbstractDataListener accsAbstractDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d61aa9", new Object[]{this, str, accsAbstractDataListener});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "registerDataListener mAccsManager null", new Object[0]);
        } else {
            aVar.registerDataListener(mContext, str, accsAbstractDataListener);
        }
    }

    public void registerHeartBeatListener(IHeartBeat iHeartBeat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf7e846", new Object[]{this, iHeartBeat});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "registerHeartBeatListener mAccsManager null", new Object[0]);
        } else {
            aVar.registerHeartBeatListener(iHeartBeat);
        }
    }

    public void registerSerivce(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("601710a7", new Object[]{this, str, str2});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "registerSerivce mAccsManager null", new Object[0]);
        } else {
            aVar.registerSerivce(mContext, str, str2);
        }
    }

    public String sendData(ACCSManager.AccsRequest accsRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79bb5762", new Object[]{this, accsRequest});
        }
        a aVar = this.mAccsManager;
        if (aVar != null) {
            return aVar.sendData(mContext, accsRequest);
        }
        ALog.e(this.OTAG, "sendData mAccsManager null", new Object[0]);
        return null;
    }

    public String sendPushResponse(ACCSManager.AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a15df9c", new Object[]{this, accsRequest, extraInfo});
        }
        a aVar = this.mAccsManager;
        if (aVar != null) {
            return aVar.sendPushResponse(mContext, accsRequest, extraInfo);
        }
        ALog.e(this.OTAG, "sendPushResponse mAccsManager null", new Object[0]);
        return null;
    }

    public String sendRequest(ACCSManager.AccsRequest accsRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72735337", new Object[]{this, accsRequest});
        }
        a aVar = this.mAccsManager;
        if (aVar != null) {
            return aVar.sendRequest(mContext, accsRequest);
        }
        ALog.e(this.OTAG, "sendRequest mAccsManager null", new Object[0]);
        return null;
    }

    public void setLoginInfo(ILoginInfo iLoginInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a57517b3", new Object[]{this, iLoginInfo});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "setLoginInfo mAccsManager null", new Object[0]);
        } else {
            aVar.setLoginInfo(mContext, iLoginInfo);
        }
    }

    public void startInAppConnection(String str, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea3b67", new Object[]{this, str, iAppReceiver});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "startInAppConnection mAccsManager null", new Object[0]);
        } else {
            aVar.startInAppConnection(mContext, this.mConfig.getAppKey(), this.mConfig.getAppSecret(), str, iAppReceiver);
        }
    }

    public void subscribeStream(AccsStreamConfig accsStreamConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c35c9661", new Object[]{this, accsStreamConfig});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "subscribeStream mAccsManager null", new Object[0]);
        } else {
            aVar.subscribeStream(accsStreamConfig);
        }
    }

    public void unRegisterConnectStateListener(AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4790e2", new Object[]{this, accsConnectStateListener});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "unRegisterConnectStateListener mAccsManager null", new Object[0]);
        } else {
            aVar.unRegisterConnectStateListener(accsConnectStateListener);
        }
    }

    public void unRegisterDataListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cc540b", new Object[]{this, str});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "unRegisterDataListener mAccsManager null", new Object[0]);
        } else {
            aVar.unRegisterDataListener(mContext, str);
        }
    }

    public void unRegisterSerivce(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447b104", new Object[]{this, str});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "unRegisterSerivce mAccsManager null", new Object[0]);
        } else {
            aVar.unRegisterSerivce(mContext, str);
        }
    }

    public void unSubscribeStream(AccsStreamConfig accsStreamConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13939fda", new Object[]{this, accsStreamConfig});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "unSubscribeStream mAccsManager null", new Object[0]);
        } else {
            aVar.unSubscribeStream(accsStreamConfig);
        }
    }

    public void unbindService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0a74d0", new Object[]{this, str});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "unbindService mAccsManager null", new Object[0]);
        } else {
            aVar.unbindService(mContext, str);
        }
    }

    public void unbindUser() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a87f48", new Object[]{this});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "unbindUser mAccsManager null", new Object[0]);
        } else {
            aVar.unbindUser(mContext);
        }
    }

    public void unregisterHeartBeatListener(IHeartBeat iHeartBeat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bee6bcd", new Object[]{this, iHeartBeat});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "unregisterHeartBeatListener mAccsManager null", new Object[0]);
        } else {
            aVar.unregisterHeartBeatListener(iHeartBeat);
        }
    }

    public boolean isChannelError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acf2cfb1", new Object[]{this, new Integer(i)})).booleanValue();
        }
        a aVar = this.mAccsManager;
        if (aVar != null) {
            return aVar.isChannelError(i);
        }
        ALog.e(this.OTAG, "isChannelError mAccsManager null", new Object[0]);
        return true;
    }

    public static synchronized void setEnvironment(Context context, int i) {
        synchronized (ACCSClient.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81bb0293", new Object[]{context, new Integer(i)});
                return;
            }
            if (!(context == null || (context.getApplicationInfo().flags & 2) == 0)) {
                ALog.isUseTlog = false;
                anet.channel.util.ALog.setUseTlog(false);
            }
            if (i < 0 || i > 2) {
                ALog.e(TAG, "env error", "env", Integer.valueOf(i));
                i = 0;
            }
            int i2 = AccsClientConfig.mEnv;
            AccsClientConfig.mEnv = i;
            if (i2 != i && czv.g(context)) {
                ALog.i(TAG, "setEnvironment", "preEnv", Integer.valueOf(i2), "toEnv", Integer.valueOf(i));
                czv.b(context);
                czv.a(context);
                czv.i(context);
                if (i == 2) {
                    SessionCenter.switchEnvironment(ENV.TEST);
                } else if (i == 1) {
                    SessionCenter.switchEnvironment(ENV.PREPARE);
                }
                for (Map.Entry<String, ACCSClient> entry : mACCSClients.entrySet()) {
                    try {
                        getAccsClient(entry.getKey());
                    } catch (AccsException e) {
                        ALog.e(TAG, "setEnvironment update client", e, new Object[0]);
                    }
                }
            }
            czv.k(context, i);
        }
    }

    public void bindUser(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac1cfbb", new Object[]{this, str, new Boolean(z)});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "bindUser mAccsManager null", new Object[0]);
        } else {
            aVar.bindUser(mContext, str, z);
        }
    }

    public boolean unRegisterMessageFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97f141b8", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            ALog.e(TAG, "unRegisterMessageFilter param err", "serviceId", str);
            return false;
        }
        boolean z = GlobalClientInfo.FILTERS.remove(str) != null;
        ALog.e(TAG, "unRegisterMessageFilter", "serviceId", str, "result", Boolean.valueOf(z));
        return z;
    }

    public boolean registerMessageFilter(String str, MessageFilter messageFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d72ea9d5", new Object[]{this, str, messageFilter})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || messageFilter == null) {
            ALog.e(TAG, "registerMessageFilter param err", "serviceId", str, "filter", Boolean.valueOf(messageFilter == null));
            return false;
        }
        GlobalClientInfo.FILTERS.put(str, messageFilter);
        ALog.e(TAG, "registerMessageFilter", "serviceId", str, "filter", messageFilter);
        return true;
    }

    public static synchronized String init(Context context, AccsClientConfig accsClientConfig) throws AccsException {
        synchronized (ACCSClient.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("67b103a9", new Object[]{context, accsClientConfig});
            } else if (context == null || accsClientConfig == null) {
                throw new AccsException("init AccsClient params error");
            } else {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    ALog.isUseTlog = false;
                    anet.channel.util.ALog.setUseTlog(false);
                }
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    mContext = applicationContext;
                    GlobalClientInfo.mContext = applicationContext;
                }
                ALog.d(TAG, "init", "config", accsClientConfig);
                return accsClientConfig.getTag();
            }
        }
    }
}
