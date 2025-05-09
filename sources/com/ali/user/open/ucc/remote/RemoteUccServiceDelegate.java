package com.ali.user.open.ucc.remote;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.core.util.CommonUtils;
import com.ali.user.open.session.Session;
import com.ali.user.open.ucc.IRemoteUccService;
import com.ali.user.open.ucc.UccCallback;
import com.ali.user.open.ucc.UccService;
import com.ali.user.open.ucc.UccServiceImpl;
import com.ali.user.open.ucc.UccServiceProviderFactory;
import com.ali.user.open.ucc.remote.broadcast.UccBroadcastHelper;
import com.ali.user.open.ucc.remote.broadcast.UccBroadcastReceiver;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import tb.obk;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RemoteUccServiceDelegate extends UccServiceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "UccServiceImpl";
    private static volatile RemoteUccServiceDelegate sInstance = null;
    private IRemoteUccService mIRemoteUccService;
    private IBinder.DeathRecipient mDeathRecipient = new IBinder.DeathRecipient() { // from class: com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25f12e35", new Object[]{this});
                return;
            }
            if (RemoteUccServiceDelegate.access$000(RemoteUccServiceDelegate.this) != null) {
                RemoteUccServiceDelegate.access$000(RemoteUccServiceDelegate.this).asBinder().unlinkToDeath(RemoteUccServiceDelegate.access$100(RemoteUccServiceDelegate.this), 0);
                RemoteUccServiceDelegate.access$002(RemoteUccServiceDelegate.this, null);
            }
            OrangeConfig.getInstance().registerListener(new String[]{LoginSwitch.CONFIG_GROUP_LOGIN}, new obk() { // from class: com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.obk
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                        return;
                    }
                    try {
                        if (TextUtils.equals(OrangeConfig.getInstance().getConfig(LoginSwitch.CONFIG_GROUP_LOGIN, "rebind_ucc_service_when_death", "false"), "true")) {
                            RemoteUccServiceDelegate.access$200(RemoteUccServiceDelegate.this);
                        }
                        OrangeConfig.getInstance().unregisterListener(new String[]{LoginSwitch.CONFIG_GROUP_LOGIN}, this);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }, true);
        }
    };
    private ServiceConnection conn = new ServiceConnection() { // from class: com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            synchronized (RemoteUccServiceDelegate.access$300(RemoteUccServiceDelegate.this)) {
                RemoteUccServiceDelegate.access$002(RemoteUccServiceDelegate.this, IRemoteUccService.Stub.asInterface(iBinder));
                RemoteUccServiceDelegate.access$300(RemoteUccServiceDelegate.this).notifyAll();
            }
            try {
                iBinder.linkToDeath(RemoteUccServiceDelegate.access$100(RemoteUccServiceDelegate.this), 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            RemoteUccServiceDelegate.access$002(RemoteUccServiceDelegate.this, null);
            SDKLogger.d("UccServiceImpl", "binder died");
        }
    };
    private final Object mLock = new Object();

    static {
        t2o.a(76546162);
    }

    public RemoteUccServiceDelegate() {
        if (ConfigManager.getInstance().isMultiProcessEnable && !TextUtils.equals(CommonUtils.getProcessName(KernelContext.getApplicationContext()), KernelContext.getApplicationContext().getPackageName())) {
            bindService();
            UccBroadcastHelper.registerLoginReceiver(KernelContext.getApplicationContext(), new UccBroadcastReceiver());
        }
    }

    public static /* synthetic */ IRemoteUccService access$000(RemoteUccServiceDelegate remoteUccServiceDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRemoteUccService) ipChange.ipc$dispatch("a32fe0cc", new Object[]{remoteUccServiceDelegate});
        }
        return remoteUccServiceDelegate.mIRemoteUccService;
    }

    public static /* synthetic */ IRemoteUccService access$002(RemoteUccServiceDelegate remoteUccServiceDelegate, IRemoteUccService iRemoteUccService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRemoteUccService) ipChange.ipc$dispatch("f7be61a", new Object[]{remoteUccServiceDelegate, iRemoteUccService});
        }
        remoteUccServiceDelegate.mIRemoteUccService = iRemoteUccService;
        return iRemoteUccService;
    }

    public static /* synthetic */ IBinder.DeathRecipient access$100(RemoteUccServiceDelegate remoteUccServiceDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder.DeathRecipient) ipChange.ipc$dispatch("1455439f", new Object[]{remoteUccServiceDelegate});
        }
        return remoteUccServiceDelegate.mDeathRecipient;
    }

    public static /* synthetic */ void access$200(RemoteUccServiceDelegate remoteUccServiceDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1b7cae", new Object[]{remoteUccServiceDelegate});
        } else {
            remoteUccServiceDelegate.bindService();
        }
    }

    public static /* synthetic */ Object access$300(RemoteUccServiceDelegate remoteUccServiceDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8c93ae85", new Object[]{remoteUccServiceDelegate});
        }
        return remoteUccServiceDelegate.mLock;
    }

    private void bindService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("780e543f", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(KernelContext.getApplicationContext().getPackageName(), "com.ali.user.open.ucc.remote.RemoteUccService"));
        KernelContext.getApplicationContext().bindService(intent, this.conn, 1);
    }

    public static RemoteUccServiceDelegate getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteUccServiceDelegate) ipChange.ipc$dispatch("e573489", new Object[0]);
        }
        if (sInstance == null) {
            synchronized (RemoteUccServiceDelegate.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new RemoteUccServiceDelegate();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public static /* synthetic */ Object ipc$super(RemoteUccServiceDelegate remoteUccServiceDelegate, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/ucc/remote/RemoteUccServiceDelegate");
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void bind(Activity activity, String str, String str2, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("826e4477", new Object[]{this, activity, str, str2, uccCallback});
        } else {
            bind(activity, str, str2, new HashMap(4), uccCallback);
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void cleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0f7d54b", new Object[]{this});
        } else {
            UccServiceProviderFactory.getInstance().cleanUp();
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public Session getSession(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("a5d69a45", new Object[]{this, str});
        }
        if (!ConfigManager.getInstance().isMultiProcessEnable || TextUtils.equals(CommonUtils.getProcessName(KernelContext.getApplicationContext()), KernelContext.getApplicationContext().getPackageName())) {
            return UccServiceImpl.getInstance().getSession(str);
        }
        try {
            IRemoteUccService iRemoteUccService = this.mIRemoteUccService;
            if (iRemoteUccService == null) {
                bindService();
                return null;
            }
            String session = iRemoteUccService.getSession(str);
            if (TextUtils.isEmpty(session)) {
                return null;
            }
            return (Session) JSON.parseObject(session, Session.class);
        } catch (Throwable th) {
            th.printStackTrace();
            SDKLogger.e("UccServiceImpl", "remote unbind exception = " + th.getMessage());
            return null;
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void logout(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d96de1", new Object[]{this, context, str});
        } else if (!ConfigManager.getInstance().isMultiProcessEnable || TextUtils.equals(CommonUtils.getProcessName(context.getApplicationContext()), context.getPackageName())) {
            UccServiceImpl.getInstance().logout(context, str);
        } else {
            try {
                IRemoteUccService iRemoteUccService = this.mIRemoteUccService;
                if (iRemoteUccService == null) {
                    bindService();
                } else {
                    iRemoteUccService.logout(str);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                SDKLogger.e("UccServiceImpl", "remote unbind exception = " + th.getMessage());
            }
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void logoutAll(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34ce4ca", new Object[]{this, context});
        } else if (!ConfigManager.getInstance().isMultiProcessEnable || TextUtils.equals(CommonUtils.getProcessName(context.getApplicationContext()), context.getPackageName())) {
            UccServiceImpl.getInstance().logoutAll(context);
        } else {
            try {
                IRemoteUccService iRemoteUccService = this.mIRemoteUccService;
                if (iRemoteUccService == null) {
                    bindService();
                } else {
                    iRemoteUccService.logoutAll();
                }
            } catch (Throwable th) {
                th.printStackTrace();
                SDKLogger.e("UccServiceImpl", "remote unbind exception = " + th.getMessage());
            }
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void trustLogin(Activity activity, String str, Map<String, String> map, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("353a9b50", new Object[]{this, activity, str, map, uccCallback});
        } else if (activity == null) {
            trustLogin(str, map, uccCallback);
        } else {
            if (map != null) {
                map.remove("site");
            }
            if (!ConfigManager.getInstance().isMultiProcessEnable || TextUtils.equals(CommonUtils.getProcessName(KernelContext.getApplicationContext()), KernelContext.getApplicationContext().getPackageName())) {
                UccServiceImpl.getInstance().setUccDataProvider(((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider());
                UccServiceImpl.getInstance().trustLogin(activity, str, map, uccCallback);
                return;
            }
            trustLogin(str, map, uccCallback);
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void unbind(String str, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c699f9a", new Object[]{this, str, uccCallback});
        } else {
            unbind(str, null, uccCallback);
        }
    }

    public boolean waitUntilConnected(long j) throws InterruptedException, TimeoutException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("766ead01", new Object[]{this, new Long(j)})).booleanValue();
        }
        try {
            IRemoteUccService iRemoteUccService = this.mIRemoteUccService;
            if (iRemoteUccService != null && iRemoteUccService.asBinder() != null) {
                return true;
            }
            synchronized (this.mLock) {
                this.mLock.wait(j);
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void bind(Activity activity, String str, String str2, Map<String, String> map, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f945e6", new Object[]{this, activity, str, str2, map, uccCallback});
        } else if (activity == null) {
            bind(str, str2, map, uccCallback);
        } else {
            if (map != null) {
                map.remove("site");
            }
            if (!ConfigManager.getInstance().isMultiProcessEnable || TextUtils.equals(CommonUtils.getProcessName(activity.getApplicationContext()), activity.getPackageName())) {
                UccServiceImpl.getInstance().setUccDataProvider(((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider());
                UccServiceImpl.getInstance().bind(activity, str, str2, map, uccCallback);
                return;
            }
            bind(str, str2, map, uccCallback);
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void unbind(final String str, final Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("636de063", new Object[]{this, str, map, uccCallback});
            return;
        }
        if (map != null) {
            map.remove("site");
        }
        if (!ConfigManager.getInstance().isMultiProcessEnable || TextUtils.equals(CommonUtils.getProcessName(KernelContext.getApplicationContext()), KernelContext.getApplicationContext().getPackageName())) {
            UccServiceImpl.getInstance().setUccDataProvider(((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider());
            UccServiceImpl.getInstance().unbind(str, map, uccCallback);
            return;
        }
        if (map == null) {
            try {
                map = new HashMap<>();
            } catch (Throwable th) {
                th.printStackTrace();
                SDKLogger.e("UccServiceImpl", "remote unbind exception = " + th.getMessage());
                if (uccCallback != null) {
                    uccCallback.onFail(str, 1999, "");
                    return;
                }
                return;
            }
        }
        map.put("process", CommonUtils.getProcessName(KernelContext.getApplicationContext()));
        ((ExecutorService) AliMemberSDK.getService(ExecutorService.class)).execute(new Runnable() { // from class: com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:6:0x0012, B:8:0x001a, B:10:0x0026, B:15:0x0039, B:16:0x0045, B:19:0x004e), top: B:24:0x0012 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r4 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.AnonymousClass4.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r1 == 0) goto L_0x0012
                    java.lang.String r1 = "5c510192"
                    r2 = 1
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r3 = 0
                    r2[r3] = r4
                    r0.ipc$dispatch(r1, r2)
                    return
                L_0x0012:
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.this     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.IRemoteUccService r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.access$000(r0)     // Catch: all -> 0x0037
                    if (r0 == 0) goto L_0x0039
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.this     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.IRemoteUccService r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.access$000(r0)     // Catch: all -> 0x0037
                    android.os.IBinder r0 = r0.asBinder()     // Catch: all -> 0x0037
                    if (r0 == 0) goto L_0x0039
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.this     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.IRemoteUccService r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.access$000(r0)     // Catch: all -> 0x0037
                    android.os.IBinder r0 = r0.asBinder()     // Catch: all -> 0x0037
                    boolean r0 = r0.isBinderAlive()     // Catch: all -> 0x0037
                    if (r0 != 0) goto L_0x0045
                    goto L_0x0039
                L_0x0037:
                    r0 = move-exception
                    goto L_0x0061
                L_0x0039:
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.this     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.access$200(r0)     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.this     // Catch: all -> 0x0037
                    r1 = 5000(0x1388, double:2.4703E-320)
                    r0.waitUntilConnected(r1)     // Catch: all -> 0x0037
                L_0x0045:
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.this     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.IRemoteUccService r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.access$000(r0)     // Catch: all -> 0x0037
                    if (r0 != 0) goto L_0x004e
                    return
                L_0x004e:
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.this     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.IRemoteUccService r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.access$000(r0)     // Catch: all -> 0x0037
                    java.lang.String r1 = r2     // Catch: all -> 0x0037
                    java.util.Map r2 = r3     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate$4$1 r3 = new com.ali.user.open.ucc.remote.RemoteUccServiceDelegate$4$1     // Catch: all -> 0x0037
                    r3.<init>()     // Catch: all -> 0x0037
                    r0.unbind(r1, r2, r3)     // Catch: all -> 0x0037
                    goto L_0x0071
                L_0x0061:
                    r0.printStackTrace()
                    com.ali.user.open.ucc.UccCallback r0 = r4
                    if (r0 == 0) goto L_0x0071
                    java.lang.String r1 = r2
                    r2 = 1999(0x7cf, float:2.801E-42)
                    java.lang.String r3 = ""
                    r0.onFail(r1, r2, r3)
                L_0x0071:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.AnonymousClass4.run():void");
            }
        });
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void trustLogin(final String str, final Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b1a76fe", new Object[]{this, str, map, uccCallback});
            return;
        }
        if (map != null) {
            map.remove("site");
        }
        if (!ConfigManager.getInstance().isMultiProcessEnable || TextUtils.equals(CommonUtils.getProcessName(KernelContext.getApplicationContext()), KernelContext.getApplicationContext().getPackageName())) {
            UccServiceImpl.getInstance().setUccDataProvider(((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider());
            UccServiceImpl.getInstance().trustLogin(str, map, uccCallback);
            return;
        }
        if (map == null) {
            try {
                map = new HashMap<>();
            } catch (Throwable th) {
                th.printStackTrace();
                SDKLogger.e("UccServiceImpl", "remote unbind exception = " + th.getMessage());
                return;
            }
        }
        map.put("process", CommonUtils.getProcessName(KernelContext.getApplicationContext()));
        ((ExecutorService) AliMemberSDK.getService(ExecutorService.class)).execute(new Runnable() { // from class: com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:6:0x0012, B:8:0x001a, B:10:0x0026, B:15:0x0039, B:16:0x0045, B:19:0x004e), top: B:24:0x0012 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r4 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.AnonymousClass5.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r1 == 0) goto L_0x0012
                    java.lang.String r1 = "5c510192"
                    r2 = 1
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r3 = 0
                    r2[r3] = r4
                    r0.ipc$dispatch(r1, r2)
                    return
                L_0x0012:
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.this     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.IRemoteUccService r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.access$000(r0)     // Catch: all -> 0x0037
                    if (r0 == 0) goto L_0x0039
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.this     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.IRemoteUccService r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.access$000(r0)     // Catch: all -> 0x0037
                    android.os.IBinder r0 = r0.asBinder()     // Catch: all -> 0x0037
                    if (r0 == 0) goto L_0x0039
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.this     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.IRemoteUccService r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.access$000(r0)     // Catch: all -> 0x0037
                    android.os.IBinder r0 = r0.asBinder()     // Catch: all -> 0x0037
                    boolean r0 = r0.isBinderAlive()     // Catch: all -> 0x0037
                    if (r0 != 0) goto L_0x0045
                    goto L_0x0039
                L_0x0037:
                    r0 = move-exception
                    goto L_0x0061
                L_0x0039:
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.this     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.access$200(r0)     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.this     // Catch: all -> 0x0037
                    r1 = 5000(0x1388, double:2.4703E-320)
                    r0.waitUntilConnected(r1)     // Catch: all -> 0x0037
                L_0x0045:
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.this     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.IRemoteUccService r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.access$000(r0)     // Catch: all -> 0x0037
                    if (r0 != 0) goto L_0x004e
                    return
                L_0x004e:
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.this     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.IRemoteUccService r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.access$000(r0)     // Catch: all -> 0x0037
                    java.lang.String r1 = r2     // Catch: all -> 0x0037
                    java.util.Map r2 = r3     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate$5$1 r3 = new com.ali.user.open.ucc.remote.RemoteUccServiceDelegate$5$1     // Catch: all -> 0x0037
                    r3.<init>()     // Catch: all -> 0x0037
                    r0.trustLogin(r1, r2, r3)     // Catch: all -> 0x0037
                    goto L_0x0071
                L_0x0061:
                    r0.printStackTrace()
                    com.ali.user.open.ucc.UccCallback r0 = r4
                    if (r0 == 0) goto L_0x0071
                    java.lang.String r1 = r2
                    r2 = 1999(0x7cf, float:2.801E-42)
                    java.lang.String r3 = ""
                    r0.onFail(r1, r2, r3)
                L_0x0071:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.AnonymousClass5.run():void");
            }
        });
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void bind(String str, String str2, Map<String, String> map, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("741f1314", new Object[]{this, str, str2, map, uccCallback});
            return;
        }
        SDKLogger.d("UccServiceImpl", "bind goUccActivity");
        if (map != null) {
            map.remove("site");
        }
        if (!ConfigManager.getInstance().isMultiProcessEnable || TextUtils.equals(CommonUtils.getProcessName(KernelContext.getApplicationContext()), KernelContext.getApplicationContext().getPackageName())) {
            UccServiceImpl.getInstance().setUccDataProvider(((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider());
            UccServiceImpl.getInstance().bind(str, str2, map, uccCallback);
            return;
        }
        bind(str2, map, uccCallback);
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void bind(Activity activity, String str, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10009a81", new Object[]{this, activity, str, uccCallback});
        } else {
            bind(activity, str, new HashMap(4), uccCallback);
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void bind(Activity activity, String str, Map<String, String> map, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e62da9c", new Object[]{this, activity, str, map, uccCallback});
        } else if (activity == null) {
            bind(str, map, uccCallback);
        } else {
            if (map != null) {
                map.remove("site");
            }
            if (!ConfigManager.getInstance().isMultiProcessEnable || TextUtils.equals(CommonUtils.getProcessName(activity.getApplicationContext()), activity.getPackageName())) {
                UccServiceImpl.getInstance().setUccDataProvider(((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider());
                UccServiceImpl.getInstance().bind(activity, str, map, uccCallback);
                return;
            }
            bind(str, map, uccCallback);
        }
    }

    @Override // com.ali.user.open.ucc.UccServiceImpl, com.ali.user.open.ucc.UccService
    public void bind(final String str, final Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d19374a", new Object[]{this, str, map, uccCallback});
            return;
        }
        if (map != null) {
            map.remove("site");
        }
        if (!ConfigManager.getInstance().isMultiProcessEnable || TextUtils.equals(CommonUtils.getProcessName(KernelContext.getApplicationContext()), KernelContext.getApplicationContext().getPackageName())) {
            UccServiceImpl.getInstance().setUccDataProvider(((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider());
            UccServiceImpl.getInstance().bind(str, map, uccCallback);
            return;
        }
        if (map == null) {
            try {
                map = new HashMap<>();
            } catch (Throwable th) {
                th.printStackTrace();
                SDKLogger.e("UccServiceImpl", "remote bind exception = " + th.getMessage());
                return;
            }
        }
        map.put("process", CommonUtils.getProcessName(KernelContext.getApplicationContext()));
        ((ExecutorService) AliMemberSDK.getService(ExecutorService.class)).execute(new Runnable() { // from class: com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:6:0x0012, B:8:0x001a, B:10:0x0026, B:15:0x0039, B:16:0x0045, B:19:0x004e), top: B:22:0x0012 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r4 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.AnonymousClass3.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r1 == 0) goto L_0x0012
                    java.lang.String r1 = "5c510192"
                    r2 = 1
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r3 = 0
                    r2[r3] = r4
                    r0.ipc$dispatch(r1, r2)
                    return
                L_0x0012:
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.this     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.IRemoteUccService r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.access$000(r0)     // Catch: all -> 0x0037
                    if (r0 == 0) goto L_0x0039
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.this     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.IRemoteUccService r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.access$000(r0)     // Catch: all -> 0x0037
                    android.os.IBinder r0 = r0.asBinder()     // Catch: all -> 0x0037
                    if (r0 == 0) goto L_0x0039
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.this     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.IRemoteUccService r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.access$000(r0)     // Catch: all -> 0x0037
                    android.os.IBinder r0 = r0.asBinder()     // Catch: all -> 0x0037
                    boolean r0 = r0.isBinderAlive()     // Catch: all -> 0x0037
                    if (r0 != 0) goto L_0x0045
                    goto L_0x0039
                L_0x0037:
                    r0 = move-exception
                    goto L_0x0061
                L_0x0039:
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.this     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.access$200(r0)     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.this     // Catch: all -> 0x0037
                    r1 = 5000(0x1388, double:2.4703E-320)
                    r0.waitUntilConnected(r1)     // Catch: all -> 0x0037
                L_0x0045:
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.this     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.IRemoteUccService r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.access$000(r0)     // Catch: all -> 0x0037
                    if (r0 != 0) goto L_0x004e
                    return
                L_0x004e:
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.this     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.IRemoteUccService r0 = com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.access$000(r0)     // Catch: all -> 0x0037
                    java.lang.String r1 = r2     // Catch: all -> 0x0037
                    java.util.Map r2 = r3     // Catch: all -> 0x0037
                    com.ali.user.open.ucc.remote.RemoteUccServiceDelegate$3$1 r3 = new com.ali.user.open.ucc.remote.RemoteUccServiceDelegate$3$1     // Catch: all -> 0x0037
                    r3.<init>()     // Catch: all -> 0x0037
                    r0.bind(r1, r2, r3)     // Catch: all -> 0x0037
                    goto L_0x007c
                L_0x0061:
                    r0.printStackTrace()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "remote bind exception = "
                    r1.<init>(r2)
                    java.lang.String r0 = r0.getMessage()
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    java.lang.String r1 = "UccServiceImpl"
                    com.ali.user.open.core.trace.SDKLogger.e(r1, r0)
                L_0x007c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ali.user.open.ucc.remote.RemoteUccServiceDelegate.AnonymousClass3.run():void");
            }
        });
    }
}
