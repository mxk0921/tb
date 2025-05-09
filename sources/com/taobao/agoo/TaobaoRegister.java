package com.taobao.agoo;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.IAgooAppReceiver;
import com.taobao.accs.a;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.init.Launcher_InitPush;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.CallBack;
import org.android.agoo.common.Config;
import org.android.agoo.common.MsgDO;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;
import tb.c71;
import tb.hi0;
import tb.j8l;
import tb.qvn;
import tb.rd0;
import tb.rr0;
import tb.t2o;
import tb.t4o;
import tb.tv9;
import tb.xd0;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class TaobaoRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFERENCES = "Agoo_AppStore";
    public static final String PROPERTY_APP_NOTIFICATION_CUSTOM_SOUND = "app_notification_custom_sound";
    public static final String PROPERTY_APP_NOTIFICATION_ICON = "app_notification_icon";
    public static final String PROPERTY_APP_NOTIFICATION_SOUND = "app_notification_sound";
    public static final String PROPERTY_APP_NOTIFICATION_VIBRATE = "app_notification_vibrate";
    public static final String TAG = "TaobaoRegister";

    /* renamed from: a  reason: collision with root package name */
    public static t4o f6170a;
    public static boolean b;
    public static final List<CallBack> pushListeners = new CopyOnWriteArrayList();
    public static final AtomicBoolean c = new AtomicBoolean(false);

    static {
        t2o.a(343933284);
    }

    public TaobaoRegister() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ t4o access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t4o) ipChange.ipc$dispatch("d064c94d", new Object[0]);
        }
        return f6170a;
    }

    public static /* synthetic */ t4o access$002(t4o t4oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t4o) ipChange.ipc$dispatch("8ad465a3", new Object[]{t4oVar});
        }
        f6170a = t4oVar;
        return t4oVar;
    }

    @Deprecated
    public static void bindAgoo(Context context, String str, String str2, CallBack callBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01cc8b6", new Object[]{context, str, str2, callBack});
        } else {
            bindAgoo(context, null);
        }
    }

    public static void clickMessage(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfb1f036", new Object[]{context, str, str2});
        } else {
            clickMessage(context, str, str2, 0, 0L);
        }
    }

    public static void enableNotification(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd87e9c6", new Object[]{context, str, new Integer(i)});
        } else if (xd0.m(context)) {
            hi0.d(context, str, i);
        }
    }

    public static boolean isNotificationEnabled(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8217fe59", new Object[]{context})).booleanValue();
        }
        return hi0.g(context);
    }

    public static boolean isRegisterSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f459d6e1", new Object[0])).booleanValue();
        }
        return b;
    }

    public static void pingApp(Context context, String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eba9c73", new Object[]{context, str, str2, str3, new Integer(i)});
            return;
        }
        NotifManager notifManager = new NotifManager();
        notifManager.init(context);
        notifManager.pingApp(str, str2, str3, i);
    }

    @Deprecated
    public static synchronized void register(Context context, String str, String str2, String str3, IRegister iRegister) throws AccsException {
        synchronized (TaobaoRegister.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb4e93cf", new Object[]{context, str, str2, str3, iRegister});
            } else {
                register(context, "default", str, str2, str3, iRegister);
            }
        }
    }

    public static void registerManuMonitor(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a5b2c5", new Object[]{context});
        } else if (!c.getAndSet(true) && !xd0.m(context)) {
            Launcher_InitPush.initPushChannel(context);
        }
    }

    public static synchronized void removeAlias(Context context, String str, ICallback iCallback) {
        synchronized (TaobaoRegister.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67b906ca", new Object[]{context, str, iCallback});
                return;
            }
            RemoveAliasCallback removeAliasCallback = new RemoveAliasCallback(iCallback);
            ALog.i(TAG, rr0.JSON_CMD_REMOVEALIAS, new Object[0]);
            String deviceToken = Config.getDeviceToken(context);
            String agooAppKey = Config.getAgooAppKey(context);
            if (!TextUtils.isEmpty(agooAppKey) && !TextUtils.isEmpty(deviceToken) && context != null && !TextUtils.isEmpty(str)) {
                a accsInstance = ACCSManager.getAccsInstance(context, agooAppKey, Config.getAccsConfigTag(context));
                if (f6170a == null) {
                    f6170a = new t4o(context.getApplicationContext());
                }
                String serviceId = NotifManager.getServiceId(context, TaobaoConstants.SERVICE_ID_DEVICECMD);
                GlobalClientInfo.getInstance(context).registerListener(serviceId, f6170a);
                String sendRequest = accsInstance.sendRequest(context, new ACCSManager.AccsRequest(null, serviceId, rr0.d(agooAppKey, deviceToken, str), null));
                if (TextUtils.isEmpty(sendRequest)) {
                    removeAliasCallback.onFailure(TaobaoConstants.ALIAS_ERROR, "accs channel disabled!");
                } else {
                    ((HashMap) f6170a.f28490a).put(sendRequest, removeAliasCallback);
                }
                return;
            }
            removeAliasCallback.onFailure(TaobaoConstants.ALIAS_ERROR, "input params null!!");
            ALog.e(TAG, "setAlias param null", "appkey", agooAppKey, "deviceId", deviceToken, "alias", str, "context", context);
        }
    }

    public static void setAgooMsgReceiveService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16ccbd5c", new Object[]{str});
        } else {
            rd0.b = str;
        }
    }

    @Deprecated
    public static void setBuilderSound(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51421635", new Object[]{context, str});
        }
    }

    public static void setEnv(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cad7fded", new Object[]{context, new Integer(i)});
        } else {
            ACCSClient.setEnvironment(context, i);
        }
    }

    public static void setIsRegisterSuccess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f3ca99", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    @Deprecated
    public static void setNotificationIcon(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52c45408", new Object[]{context, new Integer(i)});
        }
    }

    @Deprecated
    public static void setNotificationSound(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cf7f0f5", new Object[]{context, new Boolean(z)});
        }
    }

    @Deprecated
    public static void setNotificationVibrate(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e86c95", new Object[]{context, new Boolean(z)});
        }
    }

    @Deprecated
    public static void unBindAgoo(Context context, String str, String str2, CallBack callBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cc645d", new Object[]{context, str, str2, callBack});
        } else {
            unbindAgoo(context, null);
        }
    }

    @Deprecated
    public static void unregister(Context context, CallBack callBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8cd7ea9", new Object[]{context, callBack});
        } else {
            unbindAgoo(context, null);
        }
    }

    public static void bindAgoo(Context context, ICallback iCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d60ccb", new Object[]{context, iCallback});
        } else {
            a(context, iCallback, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0148 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void clickMessage(android.content.Context r28, java.lang.String r29, java.lang.String r30, int r31, long r32) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.agoo.TaobaoRegister.clickMessage(android.content.Context, java.lang.String, java.lang.String, int, long):void");
    }

    public static void registerPushListener(Context context, CallBack callBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1712414", new Object[]{context, callBack});
        } else if (!UtilityImpl.isChannelProcess(context)) {
            ALog.e(TAG, "registerPushListener not in channel", new Object[0]);
        } else {
            pushListeners.add(callBack);
        }
    }

    public static void unbindAgoo(Context context, ICallback iCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d4d364", new Object[]{context, iCallback});
        } else {
            a(context, iCallback, false);
        }
    }

    public static void unregisterPushListener(Context context, CallBack callBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e039bcdb", new Object[]{context, callBack});
        } else if (!UtilityImpl.isChannelProcess(context)) {
            ALog.e(TAG, "unregisterPushListener not in channel", new Object[0]);
        } else {
            pushListeners.remove(callBack);
        }
    }

    public static synchronized void register(final Context context, String str, final String str2, String str3, final String str4, final IRegister iRegister) throws AccsException {
        synchronized (TaobaoRegister.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db8b32c5", new Object[]{context, str, str2, str3, str4, iRegister});
                return;
            }
            if (context != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    ALog.isUseTlog = false;
                    anet.channel.util.ALog.setUseTlog(false);
                }
                ALog.i(TAG, "register", "appKey", str2, Constants.KEY_CONFIG_TAG, str);
                final Context applicationContext = context.getApplicationContext();
                Config.mAccsConfigTag = str;
                Config.setAgooAppKey(context, str2);
                xd0.f31309a = str3;
                if (!TextUtils.isEmpty(str3)) {
                    rd0.f27290a = 2;
                }
                AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
                if (configByTag == null) {
                    new AccsClientConfig.Builder().setAppKey(str2).setAppSecret(str3).setTag(str).build();
                } else {
                    rd0.c = configByTag.getAuthCode();
                }
                final a accsInstance = ACCSManager.getAccsInstance(context, str2, str);
                accsInstance.bindApp(applicationContext, str2, str3, str4, new IAgooAppReceiver() { // from class: com.taobao.agoo.TaobaoRegister.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.accs.IAppReceiver
                    public Map<String, String> getAllServices() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Map) ipChange2.ipc$dispatch("4e25da25", new Object[]{this});
                        }
                        return null;
                    }

                    @Override // com.taobao.accs.IAgooAppReceiver
                    public String getAppkey() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (String) ipChange2.ipc$dispatch("c9396be5", new Object[]{this});
                        }
                        return str2;
                    }

                    @Override // com.taobao.accs.IAppReceiver
                    public String getService(String str5) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (String) ipChange2.ipc$dispatch("46264ad0", new Object[]{this, str5});
                        }
                        return null;
                    }

                    @Override // com.taobao.accs.IAppReceiver
                    public void onBindApp(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a1fbb8b7", new Object[]{this, new Integer(i)});
                        }
                    }

                    @Override // com.taobao.accs.IAppReceiver
                    public void onBindUser(String str5, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d2ee7e0b", new Object[]{this, str5, new Integer(i)});
                        }
                    }

                    @Override // com.taobao.accs.IAppReceiver
                    public void onData(String str5, String str6, byte[] bArr) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("20c4430b", new Object[]{this, str5, str6, bArr});
                        }
                    }

                    @Override // com.taobao.accs.IAppReceiver
                    public void onSendData(String str5, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("46c12d21", new Object[]{this, str5, new Integer(i)});
                        }
                    }

                    @Override // com.taobao.accs.IAppReceiver
                    public void onUnbindApp(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("1230c610", new Object[]{this, new Integer(i)});
                        }
                    }

                    @Override // com.taobao.accs.IAppReceiver
                    public void onUnbindUser(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2f4f2cdc", new Object[]{this, new Integer(i)});
                        }
                    }

                    @Override // com.taobao.accs.IAgooAppReceiver, com.taobao.accs.IAppReceiverV1
                    public void onBindApp(int i, String str5) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("370ec2c1", new Object[]{this, new Integer(i), str5});
                            return;
                        }
                        try {
                            ALog.i(TaobaoRegister.TAG, "onBindApp", "errorCode", Integer.valueOf(i));
                            if (i == 200) {
                                if (TaobaoRegister.access$000() == null) {
                                    TaobaoRegister.access$002(new t4o(applicationContext));
                                }
                                GlobalClientInfo.getInstance(context).registerListener(NotifManager.getServiceId(context, TaobaoConstants.SERVICE_ID_DEVICECMD), TaobaoRegister.access$000());
                                if (j8l.y(context)) {
                                    if (TextUtils.isEmpty(str5)) {
                                        iRegister.onFailure(TaobaoConstants.REGISTER_ERROR, "agoo server error deviceid null");
                                        return;
                                    }
                                    TaobaoRegister.setIsRegisterSuccess(true);
                                    tv9.h().q();
                                    UtilityImpl.saveUtdid("Agoo_AppStore", GlobalClientInfo.getContext());
                                    iRegister.onSuccess(str5);
                                } else if (!t4o.b.b(applicationContext.getPackageName()) || UtilityImpl.notificationStateChanged(Constants.SP_CHANNEL_FILE_NAME, context)) {
                                    byte[] b2 = qvn.b(applicationContext, str2, str4);
                                    if (b2 == null) {
                                        IRegister iRegister2 = iRegister;
                                        if (iRegister2 != null) {
                                            iRegister2.onFailure(TaobaoConstants.REGISTER_ERROR, "req data null");
                                            return;
                                        }
                                        return;
                                    }
                                    String sendRequest = accsInstance.sendRequest(applicationContext, new ACCSManager.AccsRequest(null, TaobaoConstants.SERVICE_ID_DEVICECMD, b2, null));
                                    if (TextUtils.isEmpty(sendRequest)) {
                                        IRegister iRegister3 = iRegister;
                                        if (iRegister3 != null) {
                                            iRegister3.onFailure(TaobaoConstants.REGISTER_ERROR, "accs channel disabled!");
                                        }
                                    } else if (iRegister != null) {
                                        ((HashMap) TaobaoRegister.access$000().f28490a).put(sendRequest, iRegister);
                                    }
                                } else {
                                    TaobaoRegister.setIsRegisterSuccess(true);
                                    tv9.h().q();
                                    ALog.i(TaobaoRegister.TAG, "agoo already Registered return ", new Object[0]);
                                    IRegister iRegister4 = iRegister;
                                    if (iRegister4 != null) {
                                        iRegister4.onSuccess(Config.getDeviceToken(applicationContext));
                                    }
                                }
                            } else {
                                IRegister iRegister5 = iRegister;
                                if (iRegister5 != null) {
                                    iRegister5.onFailure(String.valueOf(i), "accs bindapp error!");
                                }
                            }
                        } catch (Throwable th) {
                            ALog.e(TaobaoRegister.TAG, "register onBindApp", th, new Object[0]);
                        }
                    }
                });
                return;
            }
            ALog.e(TAG, "register params null", "appkey", str2, Constants.KEY_CONFIG_TAG, str);
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class RemoveAliasCallback extends ICallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final ICallback b;

        static {
            t2o.a(343933286);
        }

        public RemoveAliasCallback(ICallback iCallback) {
            this.b = iCallback;
            this.f6169a = iCallback.f6169a;
        }

        public static /* synthetic */ Object ipc$super(RemoveAliasCallback removeAliasCallback, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/agoo/TaobaoRegister$RemoveAliasCallback");
        }

        @Override // com.taobao.agoo.ICallback
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            ICallback iCallback = this.b;
            if (iCallback != null) {
                iCallback.onSuccess();
            }
            c71.b("accs", BaseMonitor.ALARM_REMOVE_ALIAS, "");
        }

        @Override // com.taobao.agoo.ICallback
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            ICallback iCallback = this.b;
            if (iCallback != null) {
                iCallback.onFailure(str, str2);
            }
            ALog.e(TaobaoRegister.TAG, "setAlias onFailure", "errCode", str, "errDesc", str2, "extra", this.f6169a);
            c71.a("accs", BaseMonitor.ALARM_REMOVE_ALIAS, "", str, str2);
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class SetAliasCallback extends ICallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final ICallback b;

        static {
            t2o.a(343933287);
        }

        public SetAliasCallback(ICallback iCallback) {
            this.b = iCallback;
            this.f6169a = iCallback.f6169a;
        }

        public static /* synthetic */ Object ipc$super(SetAliasCallback setAliasCallback, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/agoo/TaobaoRegister$SetAliasCallback");
        }

        @Override // com.taobao.agoo.ICallback
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            ICallback iCallback = this.b;
            if (iCallback != null) {
                iCallback.onSuccess();
            }
            c71.b("accs", BaseMonitor.ALARM_SET_ALIAS, "");
        }

        @Override // com.taobao.agoo.ICallback
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            ICallback iCallback = this.b;
            if (iCallback != null) {
                iCallback.onFailure(str, str2);
            }
            ALog.e(TaobaoRegister.TAG, "setAlias onFailure", "errCode", str, "errDesc", str2, "extra", this.f6169a);
            c71.a("accs", BaseMonitor.ALARM_SET_ALIAS, "", str, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
        r11.onFailure(com.taobao.agoo.TaobaoConstants.ALIAS_ERROR, "input params null!!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void removeAllAlias(android.content.Context r10, com.taobao.agoo.ICallback r11) {
        /*
            r0 = 1
            r1 = 2
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.agoo.TaobaoRegister.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0016
            java.lang.String r4 = "eb1dc43b"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r10
            r1[r0] = r11
            r3.ipc$dispatch(r4, r1)
            return
        L_0x0016:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "TaobaoRegister"
            java.lang.String r5 = "removeAllAlias"
            com.taobao.accs.utl.ALog.i(r4, r5, r3)
            java.lang.String r3 = org.android.agoo.common.Config.getDeviceToken(r10)     // Catch: all -> 0x0051
            java.lang.String r6 = org.android.agoo.common.Config.getAgooAppKey(r10)     // Catch: all -> 0x0051
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: all -> 0x0051
            java.lang.String r8 = "504.1"
            if (r7 != 0) goto L_0x008a
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch: all -> 0x0051
            if (r7 != 0) goto L_0x008a
            if (r10 != 0) goto L_0x0039
            goto L_0x008a
        L_0x0039:
            java.lang.String r0 = org.android.agoo.common.Config.getAccsConfigTag(r10)     // Catch: all -> 0x0051
            com.taobao.accs.a r0 = com.taobao.accs.ACCSManager.getAccsInstance(r10, r6, r0)     // Catch: all -> 0x0051
            tb.t4o r1 = com.taobao.agoo.TaobaoRegister.f6170a     // Catch: all -> 0x0051
            if (r1 != 0) goto L_0x0053
            tb.t4o r1 = new tb.t4o     // Catch: all -> 0x0051
            android.content.Context r7 = r10.getApplicationContext()     // Catch: all -> 0x0051
            r1.<init>(r7)     // Catch: all -> 0x0051
            com.taobao.agoo.TaobaoRegister.f6170a = r1     // Catch: all -> 0x0051
            goto L_0x0053
        L_0x0051:
            r10 = move-exception
            goto L_0x00b3
        L_0x0053:
            java.lang.String r1 = "AgooDeviceCmd"
            java.lang.String r1 = org.android.agoo.control.NotifManager.getServiceId(r10, r1)     // Catch: all -> 0x0051
            com.taobao.accs.client.GlobalClientInfo r7 = com.taobao.accs.client.GlobalClientInfo.getInstance(r10)     // Catch: all -> 0x0051
            tb.t4o r9 = com.taobao.agoo.TaobaoRegister.f6170a     // Catch: all -> 0x0051
            r7.registerListener(r1, r9)     // Catch: all -> 0x0051
            byte[] r3 = tb.rr0.b(r6, r3)     // Catch: all -> 0x0051
            com.taobao.accs.ACCSManager$AccsRequest r6 = new com.taobao.accs.ACCSManager$AccsRequest     // Catch: all -> 0x0051
            r7 = 0
            r6.<init>(r7, r1, r3, r7)     // Catch: all -> 0x0051
            java.lang.String r10 = r0.sendRequest(r10, r6)     // Catch: all -> 0x0051
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch: all -> 0x0051
            if (r0 == 0) goto L_0x007e
            if (r11 == 0) goto L_0x00b8
            java.lang.String r10 = "accs channel disabled!"
            r11.onFailure(r8, r10)     // Catch: all -> 0x0051
            goto L_0x00b8
        L_0x007e:
            if (r11 == 0) goto L_0x00b8
            tb.t4o r0 = com.taobao.agoo.TaobaoRegister.f6170a     // Catch: all -> 0x0051
            java.util.Map<java.lang.String, com.taobao.agoo.ICallback> r0 = r0.f28490a     // Catch: all -> 0x0051
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: all -> 0x0051
            r0.put(r10, r11)     // Catch: all -> 0x0051
            goto L_0x00b8
        L_0x008a:
            if (r11 == 0) goto L_0x0092
            java.lang.String r7 = "input params null!!"
            r11.onFailure(r8, r7)     // Catch: all -> 0x0051
        L_0x0092:
            java.lang.String r11 = "removeAllAlias param null"
            r7 = 6
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: all -> 0x0051
            java.lang.String r8 = "appkey"
            r7[r2] = r8     // Catch: all -> 0x0051
            r7[r0] = r6     // Catch: all -> 0x0051
            java.lang.String r0 = "deviceId"
            r7[r1] = r0     // Catch: all -> 0x0051
            r0 = 3
            r7[r0] = r3     // Catch: all -> 0x0051
            java.lang.String r0 = "context"
            r1 = 4
            r7[r1] = r0     // Catch: all -> 0x0051
            r0 = 5
            r7[r0] = r10     // Catch: all -> 0x0051
            com.taobao.accs.utl.ALog.e(r4, r11, r7)     // Catch: all -> 0x0051
            return
        L_0x00b3:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            com.taobao.accs.utl.ALog.e(r4, r5, r10, r11)
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.agoo.TaobaoRegister.removeAllAlias(android.content.Context, com.taobao.agoo.ICallback):void");
    }

    public static synchronized void setAccsConfigTag(Context context, String str) {
        synchronized (TaobaoRegister.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51ebec67", new Object[]{context, str});
                return;
            }
            Config.mAccsConfigTag = str;
            AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
            if (configByTag != null) {
                ALog.i(TAG, "setAccsConfigTag", "config", configByTag.toString());
                rd0.c = configByTag.getAuthCode();
                Config.setAgooAppKey(context, configByTag.getAppKey());
                String appSecret = configByTag.getAppSecret();
                xd0.f31309a = appSecret;
                if (!TextUtils.isEmpty(appSecret)) {
                    rd0.f27290a = 2;
                }
                return;
            }
            throw new RuntimeException("accs config not exist!! please set accs config first!!");
        }
    }

    public static void dismissMessage(Context context, String str, String str2) {
        Object th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba2ab38", new Object[]{context, str, str2});
            return;
        }
        NotifManager notifManager = new NotifManager();
        MsgDO msgDO = null;
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.i(TAG, "dismissMessage", "msgid", str, AgooConstants.MESSAGE_EXT, str2);
            }
            if (TextUtils.isEmpty(str)) {
                ALog.d(TAG, "messageId == null", new Object[0]);
                return;
            }
            notifManager.init(context);
            MsgDO msgDO2 = new MsgDO();
            try {
                msgDO2.msgIds = str;
                msgDO2.extData = str2;
                msgDO2.messageSource = "accs";
                msgDO2.msgStatus = "9";
                AgooFactory agooFactory = new AgooFactory();
                agooFactory.init(context, notifManager, null);
                agooFactory.updateNotifyMsg(str, "9");
                notifManager.reportNotifyMessage(msgDO2);
            } catch (Throwable th2) {
                th = th2;
                msgDO = msgDO2;
                try {
                    ALog.e(TAG, "dismissMessage,error=" + th, new Object[0]);
                } finally {
                    if (msgDO != null) {
                        notifManager.reportNotifyMessage(msgDO);
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void exposureMessage(Context context, String str, String str2) {
        Object th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c34840b5", new Object[]{context, str, str2});
            return;
        }
        NotifManager notifManager = new NotifManager();
        MsgDO msgDO = null;
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.i(TAG, "exposureMessage", "msgid", str, AgooConstants.MESSAGE_EXT, str2);
            }
            if (TextUtils.isEmpty(str)) {
                ALog.d(TAG, "messageId == null", new Object[0]);
                return;
            }
            notifManager.init(context);
            MsgDO msgDO2 = new MsgDO();
            try {
                msgDO2.msgIds = str;
                msgDO2.extData = str2;
                msgDO2.messageSource = "accs";
                msgDO2.msgStatus = "10";
                new AgooFactory().init(context, notifManager, null);
                notifManager.reportNotifyMessage(msgDO2);
            } catch (Throwable th2) {
                th = th2;
                msgDO = msgDO2;
                try {
                    ALog.e(TAG, "exposureMessage,error=" + th, new Object[0]);
                } finally {
                    if (msgDO != null) {
                        notifManager.reportNotifyMessage(msgDO);
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static synchronized void setAlias(Context context, String str, ICallback iCallback) {
        synchronized (TaobaoRegister.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cee3b2c", new Object[]{context, str, iCallback});
                return;
            }
            SetAliasCallback setAliasCallback = new SetAliasCallback(iCallback);
            ALog.i(TAG, rr0.JSON_CMD_SETALIAS, "alias", str);
            String deviceToken = Config.getDeviceToken(context);
            String agooAppKey = Config.getAgooAppKey(context);
            if (TextUtils.isEmpty(agooAppKey) || TextUtils.isEmpty(deviceToken) || context == null || TextUtils.isEmpty(str)) {
                setAliasCallback.onFailure(TaobaoConstants.ALIAS_ERROR, "input params null!!");
                ALog.e(TAG, "setAlias param null", "appkey", agooAppKey, "deviceId", deviceToken, "alias", str, "context", context);
                return;
            }
            if (f6170a == null) {
                f6170a = new t4o(context.getApplicationContext());
            }
            if (t4o.b.a(str)) {
                ALog.i(TAG, "setAlias already set", "alias", str);
                setAliasCallback.onSuccess();
                return;
            }
            a accsInstance = ACCSManager.getAccsInstance(context, agooAppKey, Config.getAccsConfigTag(context));
            if (!j8l.y(context) && !t4o.b.b(context.getPackageName())) {
                setAliasCallback.onFailure(TaobaoConstants.ALIAS_ERROR, "bindApp first!!");
            }
            String serviceId = NotifManager.getServiceId(context, TaobaoConstants.SERVICE_ID_DEVICECMD);
            GlobalClientInfo.getInstance(context).registerListener(serviceId, f6170a);
            String sendRequest = accsInstance.sendRequest(context, new ACCSManager.AccsRequest(null, NotifManager.getServiceId(context, serviceId), rr0.e(agooAppKey, deviceToken, str), null));
            if (TextUtils.isEmpty(sendRequest)) {
                setAliasCallback.onFailure(TaobaoConstants.ALIAS_ERROR, "accs channel disabled!");
            } else {
                setAliasCallback.f6169a = str;
                ((HashMap) f6170a.f28490a).put(sendRequest, setAliasCallback);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b7, code lost:
        r14.onFailure(com.taobao.agoo.TaobaoConstants.UNBINDAGOO_ERROR, "input params null!!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void a(android.content.Context r13, com.taobao.agoo.ICallback r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.agoo.TaobaoRegister.a(android.content.Context, com.taobao.agoo.ICallback, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
        r11.onFailure(com.taobao.agoo.TaobaoConstants.ALIAS_ERROR, "input params null!!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void removeAlias(android.content.Context r10, com.taobao.agoo.ICallback r11) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.agoo.TaobaoRegister.removeAlias(android.content.Context, com.taobao.agoo.ICallback):void");
    }
}
