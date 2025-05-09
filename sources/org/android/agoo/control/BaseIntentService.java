package org.android.agoo.control;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.utl.ALog;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.android.agoo.control.BaseIntentService;
import org.android.agoo.honor.HonorRegister;
import org.android.agoo.intent.IntentUtil;
import org.android.agoo.message.MessageService;
import tb.brt;
import tb.m8l;
import tb.rd0;
import tb.t2o;
import tb.xd0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class BaseIntentService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BaseIntentService";
    private static boolean isBinded = false;
    private static final String msgStatus = "4";
    private AgooFactory agooFactory;
    private MessageService messageService;
    private NotifManager notifyManager;
    private Context mContext = null;
    private Messenger messenger = new Messenger(new Handler() { // from class: org.android.agoo.control.BaseIntentService.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/android/agoo/control/BaseIntentService$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message != null) {
                ALog.i(BaseIntentService.TAG, "handleMessage on receive msg", "msg", message.toString());
                final Intent intent = (Intent) message.getData().getParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                if (intent != null) {
                    ALog.i(BaseIntentService.TAG, "handleMessage get intent success", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent.toString());
                    brt.b(new Runnable() { // from class: org.android.agoo.control.BaseIntentService.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                BaseIntentService.this.onHandleIntent(intent);
                            }
                        }
                    });
                }
            }
        }
    });

    static {
        t2o.a(343933334);
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb A[Catch: all -> 0x0135, TryCatch #13 {all -> 0x0135, blocks: (B:11:0x0081, B:33:0x00cb, B:34:0x00e3, B:36:0x00eb, B:40:0x013e, B:43:0x016f, B:45:0x0175, B:47:0x0188, B:49:0x0192, B:51:0x0198, B:52:0x01a2, B:55:0x01b5, B:58:0x01c4, B:60:0x01ce), top: B:148:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016f A[Catch: all -> 0x0135, TRY_ENTER, TryCatch #13 {all -> 0x0135, blocks: (B:11:0x0081, B:33:0x00cb, B:34:0x00e3, B:36:0x00eb, B:40:0x013e, B:43:0x016f, B:45:0x0175, B:47:0x0188, B:49:0x0192, B:51:0x0198, B:52:0x01a2, B:55:0x01b5, B:58:0x01c4, B:60:0x01ce), top: B:148:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ce A[Catch: all -> 0x0135, TRY_LEAVE, TryCatch #13 {all -> 0x0135, blocks: (B:11:0x0081, B:33:0x00cb, B:34:0x00e3, B:36:0x00eb, B:40:0x013e, B:43:0x016f, B:45:0x0175, B:47:0x0188, B:49:0x0192, B:51:0x0198, B:52:0x01a2, B:55:0x01b5, B:58:0x01c4, B:60:0x01ce), top: B:148:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0214 A[Catch: all -> 0x023d, TryCatch #16 {all -> 0x023d, blocks: (B:67:0x01f4, B:68:0x020c, B:70:0x0214, B:72:0x021c, B:75:0x0240, B:77:0x0248, B:79:0x0250, B:93:0x02a2, B:95:0x02aa, B:109:0x0300, B:110:0x0310, B:112:0x031f, B:113:0x0328), top: B:153:0x01f4, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0248 A[Catch: all -> 0x023d, TryCatch #16 {all -> 0x023d, blocks: (B:67:0x01f4, B:68:0x020c, B:70:0x0214, B:72:0x021c, B:75:0x0240, B:77:0x0248, B:79:0x0250, B:93:0x02a2, B:95:0x02aa, B:109:0x0300, B:110:0x0310, B:112:0x031f, B:113:0x0328), top: B:153:0x01f4, inners: #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void handleRemoteMessage(android.content.Context r33, android.content.Intent r34) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.control.BaseIntentService.handleRemoteMessage(android.content.Context, android.content.Intent):void");
    }

    public static /* synthetic */ Object ipc$super(BaseIntentService baseIntentService, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/android/agoo/control/BaseIntentService");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$7() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63d92", new Object[]{this});
            return;
        }
        rd0.f.incrementAndGet();
        NotifManager notifManager = new NotifManager();
        this.notifyManager = notifManager;
        notifManager.init(getApplicationContext());
        MessageService messageService = new MessageService();
        this.messageService = messageService;
        messageService.init(getApplicationContext());
        AgooFactory agooFactory = new AgooFactory();
        this.agooFactory = agooFactory;
        agooFactory.init(getApplicationContext(), this.notifyManager, this.messageService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartCommand$8(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b705f19d", new Object[]{this, intent});
        } else {
            onHandleIntent(intent);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        if (!isBinded) {
            isBinded = true;
            if (!m8l.n()) {
                getApplicationContext().bindService(new Intent(getApplication(), getClass()), new ServiceConnection() { // from class: org.android.agoo.control.BaseIntentService.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.ServiceConnection
                    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                        }
                    }

                    @Override // android.content.ServiceConnection
                    public void onServiceDisconnected(ComponentName componentName) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                        }
                    }
                }, 1);
            }
        }
        return this.messenger.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        brt.b(new Runnable() { // from class: tb.yv1
            @Override // java.lang.Runnable
            public final void run() {
                BaseIntentService.this.lambda$onCreate$7();
            }
        });
    }

    public abstract void onError(Context context, String str);

    public abstract void onMessage(Context context, Intent intent);

    public abstract void onRegistered(Context context, String str);

    @Override // android.app.Service
    public int onStartCommand(final Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        brt.b(new Runnable() { // from class: tb.zv1
            @Override // java.lang.Runnable
            public final void run() {
                BaseIntentService.this.lambda$onStartCommand$8(intent);
            }
        });
        return 2;
    }

    public void onUserCommand(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba4ecadd", new Object[]{this, context, intent});
        }
    }

    public static final void runIntentInService(Context context, Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9992cf7f", new Object[]{context, intent, str});
            return;
        }
        try {
            intent.setClassName(context, str);
            context.startService(intent);
        } catch (Throwable th) {
            ALog.w(TAG, "runIntentInService", th, new Object[0]);
        }
    }

    public void onHandleIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1253e327", new Object[]{this, intent});
            return;
        }
        this.mContext = getApplicationContext();
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                String agooCommand = IntentUtil.getAgooCommand(this.mContext);
                String thirdPushCommand = IntentUtil.getThirdPushCommand(this.mContext);
                ALog.i(TAG, "onHandleIntent,action=" + action + ",agooCommand=" + agooCommand + ",mipushCommand=" + thirdPushCommand, new Object[0]);
                try {
                    if (TextUtils.equals(action, agooCommand)) {
                        String stringExtra = intent.getStringExtra("command");
                        ALog.d(TAG, "actionCommand --->[" + stringExtra + "]", new Object[0]);
                        if (!TextUtils.equals(stringExtra, AgooConstants.AGOO_COMMAND_MESSAGE_READED)) {
                            if (TextUtils.equals(stringExtra, AgooConstants.AGOO_COMMAND_MESSAGE_DELETED)) {
                            }
                        }
                        onUserCommand(this.mContext, intent);
                    } else if (TextUtils.equals(action, thirdPushCommand)) {
                        String stringExtra2 = intent.getStringExtra("command");
                        String stringExtra3 = intent.getStringExtra(AgooConstants.THIRD_PUSH_ID);
                        if (TextUtils.equals(stringExtra2, AgooConstants.AGOO_COMMAND_MIPUSHID_REPORT)) {
                            this.notifyManager.reportThirdPushToken(stringExtra3, "MI_TOKEN", false);
                        } else if (TextUtils.equals(stringExtra2, AgooConstants.AGOO_COMMAND_HUAWEIPUSHID_REPORT)) {
                            ALog.d(TAG, "HW_TOKEN report begin..regid=" + stringExtra3, new Object[0]);
                            this.notifyManager.reportThirdPushToken(stringExtra3, "HW_TOKEN", false);
                        } else if (TextUtils.equals(stringExtra2, AgooConstants.AGOO_COMMAND_GCMIPUSHID_REPORT)) {
                            ALog.i(TAG, "GCM_TOKEN report begin..regid=" + stringExtra3, new Object[0]);
                            this.notifyManager.reportThirdPushToken(stringExtra3, "gcm", false);
                        } else if (TextUtils.equals(stringExtra2, AgooConstants.AGOO_COMMAND_HONORPUSHID_REPORT)) {
                            ALog.i(TAG, "HONOR_TOKEN report begin..regid=" + stringExtra3, new Object[0]);
                            this.notifyManager.reportThirdPushToken(stringExtra3, HonorRegister.HONOR_TOKEN, false);
                        }
                    } else if (action.equals(AgooConstants.INTENT_FROM_AGOO_MESSAGE)) {
                        handleRemoteMessage(this.mContext, intent);
                    } else if (TextUtils.equals(action, AgooConstants.INTENT_FROM_AGOO_REPORT) || TextUtils.equals(action, "android.net.conn.CONNECTIVITY_CHANGE") || TextUtils.equals(action, "android.intent.action.USER_PRESENT") || TextUtils.equals(action, "android.intent.action.ACTION_POWER_CONNECTED") || TextUtils.equals(action, "android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        ALog.i(TAG, "is report cache msg,Config.isReportCacheMsg(mContext)=" + Config.isReportCacheMsg(this.mContext), new Object[0]);
                        if (Config.isReportCacheMsg(this.mContext) && xd0.i(this.mContext)) {
                            Config.clearReportTimes(this.mContext);
                            this.agooFactory.reportCacheMsg();
                            this.messageService.deleteCacheMessage();
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        if (ALog.isPrintLog(ALog.Level.I)) {
                            ALog.i(TAG, "is clear all msg=" + Config.isClearTime(this.mContext, currentTimeMillis), new Object[0]);
                        }
                        if (Config.isClearTime(this.mContext, currentTimeMillis)) {
                            Config.setClearTimes(this.mContext, currentTimeMillis);
                            this.messageService.deleteCacheMessage();
                        }
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
    }
}
