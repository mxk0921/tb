package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.manager.ClientReportClient;
import com.xiaomi.clientreport.manager.a;
import com.xiaomi.mipush.sdk.MiTinyDataClient;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.ah;
import com.xiaomi.push.ax;
import com.xiaomi.push.bm;
import com.xiaomi.push.ds;
import com.xiaomi.push.ec;
import com.xiaomi.push.ed;
import com.xiaomi.push.fa;
import com.xiaomi.push.fb;
import com.xiaomi.push.fc;
import com.xiaomi.push.fn;
import com.xiaomi.push.g;
import com.xiaomi.push.i;
import com.xiaomi.push.ic;
import com.xiaomi.push.ig;
import com.xiaomi.push.ih;
import com.xiaomi.push.im;
import com.xiaomi.push.ip;
import com.xiaomi.push.iq;
import com.xiaomi.push.iw;
import com.xiaomi.push.j;
import com.xiaomi.push.jb;
import com.xiaomi.push.jc;
import com.xiaomi.push.jg;
import com.xiaomi.push.ji;
import com.xiaomi.push.jk;
import com.xiaomi.push.k;
import com.xiaomi.push.l;
import com.xiaomi.push.p;
import com.xiaomi.push.r;
import com.xiaomi.push.service.az;
import com.xiaomi.push.service.bc;
import com.xiaomi.push.service.receivers.NetworkStatusReceiver;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class MiPushClient {
    public static final String COMMAND_REGISTER = "register";
    public static final String COMMAND_SET_ACCEPT_TIME = "accept-time";
    public static final String COMMAND_SET_ACCOUNT = "set-account";
    public static final String COMMAND_SET_ALIAS = "set-alias";
    public static final String COMMAND_SUBSCRIBE_TOPIC = "subscribe-topic";
    public static final String COMMAND_UNREGISTER = "unregister";
    public static final String COMMAND_UNSET_ACCOUNT = "unset-account";
    public static final String COMMAND_UNSET_ALIAS = "unset-alias";
    public static final String COMMAND_UNSUBSCRIBE_TOPIC = "unsubscibe-topic";
    public static final String PREF_EXTRA = "mipush_extra";
    private static Context sContext;
    private static long sCurMsgId = System.currentTimeMillis();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class CodeResult {
        private long resultCode = -1;

        public long getResultCode() {
            return this.resultCode;
        }

        public void setResultCode(long j) {
            this.resultCode = j;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface ICallbackResult<R> {
        void onResult(R r);
    }

    /* compiled from: Taobao */
    @Deprecated
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static abstract class MiPushClientCallback {
        private String category;

        public String getCategory() {
            return this.category;
        }

        public void onReceiveMessage(MiPushMessage miPushMessage) {
        }

        public void setCategory(String str) {
            this.category = str;
        }

        public void onReceiveMessage(String str, String str2, String str3, boolean z) {
        }

        public void onInitializeResult(long j, String str, String str2) {
        }

        public void onSubscribeResult(long j, String str, String str2) {
        }

        public void onUnsubscribeResult(long j, String str, String str2) {
        }

        public void onCommandResult(String str, long j, String str2, List<String> list) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class TokenResult {
        private String token = null;
        private long resultCode = -1;

        public long getResultCode() {
            return this.resultCode;
        }

        public String getToken() {
            return this.token;
        }

        public void setResultCode(long j) {
            this.resultCode = j;
        }

        public void setToken(String str) {
            this.token = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface UPSRegisterCallBack extends ICallbackResult<TokenResult> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface UPSTurnCallBack extends ICallbackResult<CodeResult> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface UPSUnRegisterCallBack extends ICallbackResult<TokenResult> {
    }

    private static boolean acceptTimeSet(Context context, String str, String str2) {
        String acceptTime = getAcceptTime(context);
        return TextUtils.equals(acceptTime, str + "," + str2);
    }

    public static long accountSetTime(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        return sharedPreferences.getLong("account_" + str, -1L);
    }

    public static synchronized void addAcceptTime(Context context, String str, String str2) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putString(Constants.EXTRA_KEY_ACCEPT_TIME, str + "," + str2);
            p.a(edit);
        }
    }

    public static synchronized void addAccount(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putLong("account_" + str, System.currentTimeMillis()).commit();
        }
    }

    public static synchronized void addAlias(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putLong("alias_" + str, System.currentTimeMillis()).commit();
        }
    }

    private static void addPullNotificationTime(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        edit.putLong("last_pull_notification", System.currentTimeMillis());
        p.a(edit);
    }

    private static void addRegRequestTime(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        edit.putLong("last_reg_request", System.currentTimeMillis());
        p.a(edit);
    }

    public static synchronized void addTopic(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putLong("topic_" + str, System.currentTimeMillis()).commit();
        }
    }

    public static long aliasSetTime(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        return sharedPreferences.getLong("alias_" + str, -1L);
    }

    public static void awakeApps(final Context context, final String[] strArr) {
        ah.a(context).a(new Runnable() { // from class: com.xiaomi.mipush.sdk.MiPushClient.4
            @Override // java.lang.Runnable
            public void run() {
                String[] strArr2;
                PackageInfo packageInfo;
                try {
                    for (String str : strArr) {
                        if (!TextUtils.isEmpty(str) && (packageInfo = context.getPackageManager().getPackageInfo(str, 4)) != null) {
                            MiPushClient.awakePushServiceByPackageInfo(context, packageInfo);
                        }
                    }
                } catch (Throwable th) {
                    b.a(th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void awakePushServiceByPackageInfo(Context context, PackageInfo packageInfo) {
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (serviceInfo.exported && serviceInfo.enabled && "com.xiaomi.mipush.sdk.PushMessageHandler".equals(serviceInfo.name) && !context.getPackageName().equals(serviceInfo.packageName)) {
                    try {
                        Thread.sleep(((long) ((Math.random() * 2.0d) + 1.0d)) * 1000);
                        Intent intent = new Intent();
                        intent.setClassName(serviceInfo.packageName, serviceInfo.name);
                        intent.setAction("com.xiaomi.mipush.sdk.WAKEUP");
                        intent.putExtra("waker_pkgname", context.getPackageName());
                        PushMessageHandler.a(context, intent);
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
            }
        }
    }

    public static void clearExtras(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        edit.clear();
        edit.commit();
    }

    private static void clearExtrasForInitialize(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        Iterator<String> it = getAllAlias(context).iterator();
        while (it.hasNext()) {
            edit.remove("alias_" + it.next());
        }
        Iterator<String> it2 = getAllUserAccount(context).iterator();
        while (it2.hasNext()) {
            edit.remove("account_" + it2.next());
        }
        Iterator<String> it3 = getAllTopic(context).iterator();
        while (it3.hasNext()) {
            edit.remove("topic_" + it3.next());
        }
        edit.remove(Constants.EXTRA_KEY_ACCEPT_TIME);
        edit.commit();
    }

    public static void clearLocalNotificationType(Context context) {
        ao.a(context).f();
    }

    public static void clearNotification(Context context) {
        ao.a(context).a(-1);
    }

    public static void disablePush(Context context) {
        ao.a(context).a(true);
    }

    public static void enablePush(Context context) {
        ao.a(context).a(false);
    }

    public static String getAcceptTime(Context context) {
        return context.getSharedPreferences("mipush_extra", 0).getString(Constants.EXTRA_KEY_ACCEPT_TIME, "00:00-23:59");
    }

    public static List<String> getAllAlias(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("alias_")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> getAllTopic(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("topic_") && !str.contains("**ALL**")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> getAllUserAccount(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("account_")) {
                arrayList.add(str.substring(8));
            }
        }
        return arrayList;
    }

    public static String getAppRegion(Context context) {
        if (b.m452a(context).m461c()) {
            return b.m452a(context).f();
        }
        return null;
    }

    private static boolean getDefaultSwitch() {
        return j.m872b();
    }

    public static boolean getOpenFCMPush(Context context) {
        checkNotNull(context, "context");
        return f.a(context).b(e.ASSEMBLE_PUSH_FCM);
    }

    public static boolean getOpenHmsPush(Context context) {
        checkNotNull(context, "context");
        return f.a(context).b(e.ASSEMBLE_PUSH_HUAWEI);
    }

    public static boolean getOpenOPPOPush(Context context) {
        checkNotNull(context, "context");
        return f.a(context).b(e.ASSEMBLE_PUSH_COS);
    }

    public static boolean getOpenVIVOPush(Context context) {
        return f.a(context).b(e.ASSEMBLE_PUSH_FTOS);
    }

    public static String getRegId(Context context) {
        if (b.m452a(context).m461c()) {
            return b.m452a(context).m460c();
        }
        return null;
    }

    private static void initEventPerfLogic(final Context context) {
        fc.a(new fc.a() { // from class: com.xiaomi.mipush.sdk.MiPushClient.5
            @Override // com.xiaomi.push.fc.a
            public void uploader(Context context2, ig igVar) {
                MiTinyDataClient.upload(context2, igVar);
            }
        });
        Config a2 = fc.a(context);
        a.a(context).a(BuildConfig.VERSION_NAME);
        ClientReportClient.init(context, a2, new fa(context), new fb(context));
        a.a(context);
        t.a(context, a2);
        az.a(context).a(new az.a(100, "perf event job update") { // from class: com.xiaomi.mipush.sdk.MiPushClient.6
            @Override // com.xiaomi.push.service.az.a
            public void onCallback() {
                fc.m676a(context);
            }
        });
    }

    @Deprecated
    public static void initialize(Context context, String str, String str2, MiPushClientCallback miPushClientCallback) {
        initialize(context, str, str2, miPushClientCallback, null, null);
    }

    private static void operateSyncAction(Context context) {
        if ("syncing".equals(af.a(sContext).a(au.DISABLE_PUSH))) {
            disablePush(sContext);
        }
        if ("syncing".equals(af.a(sContext).a(au.ENABLE_PUSH))) {
            enablePush(sContext);
        }
        af a2 = af.a(sContext);
        au auVar = au.UPLOAD_HUAWEI_TOKEN;
        if ("syncing".equals(a2.a(auVar))) {
            ao.a(sContext).a((String) null, auVar, e.ASSEMBLE_PUSH_HUAWEI, "init");
        }
        if ("syncing".equals(af.a(sContext).a(au.UPLOAD_FCM_TOKEN))) {
            syncAssembleFCMPushToken(sContext);
        }
        af a3 = af.a(sContext);
        au auVar2 = au.UPLOAD_COS_TOKEN;
        if ("syncing".equals(a3.a(auVar2))) {
            ao.a(sContext).a((String) null, auVar2, e.ASSEMBLE_PUSH_COS, "init");
        }
        af a4 = af.a(sContext);
        au auVar3 = au.UPLOAD_FTOS_TOKEN;
        if ("syncing".equals(a4.a(auVar3))) {
            ao.a(context).a((String) null, auVar3, e.ASSEMBLE_PUSH_FTOS, "init");
        }
    }

    public static void pausePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 0, 0, str);
    }

    public static void reInitialize(Context context, iq iqVar) {
        b.e("re-register reason: " + iqVar);
        String a2 = bm.a(6);
        String a3 = b.m452a(context).m453a();
        String b = b.m452a(context).b();
        b.m452a(context).m454a();
        clearExtrasForInitialize(context);
        clearNotification(context);
        b.m452a(context).a(Constants.a());
        b.m452a(context).a(a3, b, a2);
        jc jcVar = new jc();
        jcVar.a(bc.b());
        jcVar.b(a3);
        jcVar.e(b);
        jcVar.f(a2);
        jcVar.d(context.getPackageName());
        jcVar.c(g.m702a(context, context.getPackageName()));
        jcVar.b(g.a(context, context.getPackageName()));
        jcVar.h(BuildConfig.VERSION_NAME);
        jcVar.a(BuildConfig.VERSION_CODE);
        jcVar.a(iqVar);
        int a4 = i.a();
        if (a4 >= 0) {
            jcVar.c(a4);
        }
        ao.a(context).a(jcVar, false);
    }

    @Deprecated
    public static void registerCrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
    }

    private static void registerNetworkReceiver(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            l.a(context.getApplicationContext(), new NetworkStatusReceiver(null), intentFilter, 2);
        } catch (Throwable th) {
            b.m410a("dynamic register network status receiver failed:" + th);
        }
    }

    public static void registerPush(Context context, String str, String str2) {
        registerPush(context, str, str2, new PushConfiguration());
    }

    public static void registerToken(Context context, String str, String str2, String str3, UPSRegisterCallBack uPSRegisterCallBack) {
        registerPush(context, str, str2, new PushConfiguration(), null, uPSRegisterCallBack);
    }

    public static synchronized void removeAcceptTime(Context context) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove(Constants.EXTRA_KEY_ACCEPT_TIME);
            p.a(edit);
        }
    }

    public static synchronized void removeAccount(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove("account_" + str).commit();
        }
    }

    public static synchronized void removeAlias(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove("alias_" + str).commit();
        }
    }

    public static synchronized void removeAllAccounts(Context context) {
        synchronized (MiPushClient.class) {
            for (String str : getAllUserAccount(context)) {
                removeAccount(context, str);
            }
        }
    }

    public static synchronized void removeAllAliases(Context context) {
        synchronized (MiPushClient.class) {
            for (String str : getAllAlias(context)) {
                removeAlias(context, str);
            }
        }
    }

    public static synchronized void removeAllTopics(Context context) {
        synchronized (MiPushClient.class) {
            for (String str : getAllTopic(context)) {
                removeTopic(context, str);
            }
        }
    }

    public static synchronized void removeTopic(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove("topic_" + str).commit();
        }
    }

    public static void removeWindow(Context context) {
        ao.a(context).m451e();
    }

    public static void reportAppRunInBackground(Context context, boolean z) {
        im imVar;
        if (b.m452a(context).m459b()) {
            if (z) {
                imVar = im.APP_SLEEP;
            } else {
                imVar = im.APP_WAKEUP;
            }
            jb jbVar = new jb();
            jbVar.b(b.m452a(context).m453a());
            jbVar.c(imVar.f1168a);
            jbVar.d(context.getPackageName());
            jbVar.a(bc.a());
            jbVar.a(false);
            ao.a(context).a((ao) jbVar, ic.Notification, false, (ip) null, false);
        }
    }

    public static void reportIgnoreRegMessageClicked(Context context, String str, ip ipVar, String str2, String str3) {
        jb jbVar = new jb();
        if (TextUtils.isEmpty(str3)) {
            b.d("do not report clicked message");
            return;
        }
        jbVar.b(str3);
        jbVar.c("bar:click");
        jbVar.a(str);
        jbVar.a(false);
        ao.a(context).a(jbVar, ic.Notification, false, true, ipVar, true, str2, str3);
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
        ip ipVar = new ip();
        ipVar.a(miPushMessage.getMessageId());
        ipVar.b(miPushMessage.getTopic());
        ipVar.d(miPushMessage.getDescription());
        ipVar.c(miPushMessage.getTitle());
        ipVar.c(miPushMessage.getNotifyId());
        ipVar.a(miPushMessage.getNotifyType());
        ipVar.b(miPushMessage.getPassThrough());
        ipVar.a(miPushMessage.getExtra());
        reportMessageClicked(context, miPushMessage.getMessageId(), ipVar, null);
    }

    public static void resumePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 23, 59, str);
    }

    private static void scheduleDataCollectionJobs(Context context) {
        if (az.a(sContext).a(ih.DataCollectionSwitch.a(), getDefaultSwitch())) {
            ec.a().a(new r(context));
            ah.a(sContext).a(new Runnable() { // from class: com.xiaomi.mipush.sdk.MiPushClient.2
                @Override // java.lang.Runnable
                public void run() {
                    ed.a(MiPushClient.sContext);
                }
            }, 10);
        }
    }

    private static void scheduleOcVersionCheckJob() {
        ah.a(sContext).a(new ae(sContext), az.a(sContext).a(ih.OcVersionCheckFrequency.a(), RemoteMessageConst.DEFAULT_TTL), 5);
    }

    public static void setAlias(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            setCommand(context, fn.COMMAND_SET_ALIAS.f992a, str, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (1 == com.xiaomi.mipush.sdk.PushMessageHelper.getPushMode(r12)) goto L_0x0033;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        com.xiaomi.mipush.sdk.PushMessageHandler.a(r12, r15, r13, 0, null, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
        com.xiaomi.mipush.sdk.PushMessageHelper.sendCommandMessageBroadcast(r12, com.xiaomi.mipush.sdk.PushMessageHelper.generateCommandMessage(r0.f992a, r6, 0, null, r15, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a6, code lost:
        if (1 == com.xiaomi.mipush.sdk.PushMessageHelper.getPushMode(r12)) goto L_0x0033;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void setCommand(android.content.Context r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x000e
            r6.add(r14)
        L_0x000e:
            com.xiaomi.push.fn r0 = com.xiaomi.push.fn.COMMAND_SET_ALIAS
            java.lang.String r1 = r0.f992a
            boolean r1 = r1.equalsIgnoreCase(r13)
            r2 = 1
            if (r1 == 0) goto L_0x0050
            long r3 = java.lang.System.currentTimeMillis()
            long r7 = aliasSetTime(r12, r14)
            long r3 = r3 - r7
            long r3 = java.lang.Math.abs(r3)
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0050
            int r14 = com.xiaomi.mipush.sdk.PushMessageHelper.getPushMode(r12)
            if (r2 != r14) goto L_0x003e
        L_0x0033:
            r3 = 0
            r5 = 0
            r0 = r12
            r1 = r15
            r2 = r13
            com.xiaomi.mipush.sdk.PushMessageHandler.a(r0, r1, r2, r3, r5, r6)
            goto L_0x00c6
        L_0x003e:
            java.lang.String r0 = r0.f992a
            r4 = 0
            r13 = 0
            r2 = 0
            r1 = r6
            r5 = r15
            r6 = r13
            com.xiaomi.mipush.sdk.MiPushCommandMessage r13 = com.xiaomi.mipush.sdk.PushMessageHelper.generateCommandMessage(r0, r1, r2, r4, r5, r6)
            com.xiaomi.mipush.sdk.PushMessageHelper.sendCommandMessageBroadcast(r12, r13)
            goto L_0x00c6
        L_0x0050:
            com.xiaomi.push.fn r0 = com.xiaomi.push.fn.COMMAND_UNSET_ALIAS
            java.lang.String r0 = r0.f992a
            boolean r0 = r0.equalsIgnoreCase(r13)
            java.lang.String r1 = " is unseted"
            r3 = 3
            r4 = 0
            if (r0 == 0) goto L_0x0084
            long r7 = aliasSetTime(r12, r14)
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0084
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Don't cancel alias for "
            r12.<init>(r13)
        L_0x006e:
            java.lang.String r13 = r6.toString()
            java.lang.String r13 = com.xiaomi.push.bm.a(r13, r3)
            r12.append(r13)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            com.xiaomi.channel.commonutils.logger.b.m410a(r12)
            goto L_0x00c6
        L_0x0084:
            com.xiaomi.push.fn r0 = com.xiaomi.push.fn.COMMAND_SET_ACCOUNT
            java.lang.String r7 = r0.f992a
            boolean r7 = r7.equalsIgnoreCase(r13)
            if (r7 == 0) goto L_0x00a9
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = accountSetTime(r12, r14)
            long r7 = r7 - r9
            long r7 = java.lang.Math.abs(r7)
            r9 = 3600000(0x36ee80, double:1.7786363E-317)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x00a9
            int r14 = com.xiaomi.mipush.sdk.PushMessageHelper.getPushMode(r12)
            if (r2 != r14) goto L_0x003e
            goto L_0x0033
        L_0x00a9:
            com.xiaomi.push.fn r0 = com.xiaomi.push.fn.COMMAND_UNSET_ACCOUNT
            java.lang.String r0 = r0.f992a
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x00c3
            long r7 = accountSetTime(r12, r14)
            int r14 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x00c3
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Don't cancel account for "
            r12.<init>(r13)
            goto L_0x006e
        L_0x00c3:
            setCommand(r12, r13, r6, r15)
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.MiPushClient.setCommand(android.content.Context, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void setLocalNotificationType(Context context, int i) {
        ao.a(context).b(i);
    }

    public static void setUserAccount(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            setCommand(context, fn.COMMAND_SET_ACCOUNT.f992a, str, str2);
        }
    }

    private static boolean shouldPullNotification(Context context) {
        if (Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_pull_notification", -1L)) > 300000) {
            return true;
        }
        return false;
    }

    private static boolean shouldSendRegRequest(Context context) {
        if (Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_reg_request", -1L)) > 5000) {
            return true;
        }
        return false;
    }

    public static boolean shouldUseMIUIPush(Context context) {
        return ao.a(context).m445a();
    }

    public static void subscribe(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(b.m452a(context).m453a()) && !TextUtils.isEmpty(str)) {
            if (Math.abs(System.currentTimeMillis() - topicSubscribedTime(context, str)) > 86400000) {
                jg jgVar = new jg();
                String a2 = bc.a();
                jgVar.a(a2);
                jgVar.b(b.m452a(context).m453a());
                jgVar.c(str);
                jgVar.d(context.getPackageName());
                jgVar.e(str2);
                b.e("cmd:" + fn.COMMAND_SUBSCRIBE_TOPIC + ", " + a2);
                ao.a(context).a((ao) jgVar, ic.Subscription, (ip) null);
            } else if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.a(context, str2, 0L, null, str);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(fn.COMMAND_SUBSCRIBE_TOPIC.f992a, arrayList, 0L, null, null, null));
            }
        }
    }

    public static void syncAssembleFCMPushToken(Context context) {
        ao.a(context).a((String) null, au.UPLOAD_FCM_TOKEN, e.ASSEMBLE_PUSH_FCM, "");
    }

    public static long topicSubscribedTime(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        return sharedPreferences.getLong("topic_" + str, -1L);
    }

    public static void turnOffPush(Context context, UPSTurnCallBack uPSTurnCallBack) {
        disablePush(context);
        if (uPSTurnCallBack != null) {
            CodeResult codeResult = new CodeResult();
            codeResult.setResultCode(0L);
            codeResult.getResultCode();
            uPSTurnCallBack.onResult(codeResult);
        }
    }

    public static void turnOnPush(Context context, UPSTurnCallBack uPSTurnCallBack) {
        enablePush(context);
        if (uPSTurnCallBack != null) {
            CodeResult codeResult = new CodeResult();
            codeResult.setResultCode(0L);
            codeResult.getResultCode();
            uPSTurnCallBack.onResult(codeResult);
        }
    }

    public static void unRegisterToken(Context context, UPSUnRegisterCallBack uPSUnRegisterCallBack) {
        unregisterPush(context);
        if (uPSUnRegisterCallBack != null) {
            TokenResult tokenResult = new TokenResult();
            tokenResult.setToken(null);
            tokenResult.getToken();
            tokenResult.setResultCode(0L);
            tokenResult.getResultCode();
            uPSUnRegisterCallBack.onResult(tokenResult);
        }
    }

    public static void unregisterPush(Context context) {
        i.c(context);
        az.a(context).a();
        if (b.m452a(context).m459b()) {
            ji jiVar = new ji();
            jiVar.a(bc.a());
            jiVar.b(b.m452a(context).m453a());
            jiVar.c(b.m452a(context).m460c());
            jiVar.e(b.m452a(context).b());
            jiVar.d(context.getPackageName());
            ao.a(context).a(jiVar);
            PushMessageHandler.a();
            PushMessageHandler.b();
            b.m452a(context).m458b();
            clearLocalNotificationType(context);
            clearNotification(context);
            clearExtras(context);
        }
    }

    public static void unsetAlias(Context context, String str, String str2) {
        setCommand(context, fn.COMMAND_UNSET_ALIAS.f992a, str, str2);
    }

    public static void unsetUserAccount(Context context, String str, String str2) {
        setCommand(context, fn.COMMAND_UNSET_ACCOUNT.f992a, str, str2);
    }

    public static void unsubscribe(Context context, String str, String str2) {
        if (b.m452a(context).m459b()) {
            if (topicSubscribedTime(context, str) < 0) {
                b.m410a("Don't cancel subscribe for " + bm.a(str, 3) + " is unsubscribed");
                return;
            }
            jk jkVar = new jk();
            String a2 = bc.a();
            jkVar.a(a2);
            jkVar.b(b.m452a(context).m453a());
            jkVar.c(str);
            jkVar.d(context.getPackageName());
            jkVar.e(str2);
            b.e("cmd:" + fn.COMMAND_UNSUBSCRIBE_TOPIC + ", " + a2);
            ao.a(context).a((ao) jkVar, ic.UnSubscription, (ip) null);
        }
    }

    private static void updateImeiOrOaid() {
        new Thread(new Runnable() { // from class: com.xiaomi.mipush.sdk.MiPushClient.3
            @Override // java.lang.Runnable
            public void run() {
                String c;
                if (j.m874d()) {
                    return;
                }
                if (i.c(MiPushClient.sContext) != null || ax.a(MiPushClient.sContext).mo506a()) {
                    jb jbVar = new jb();
                    jbVar.b(b.m452a(MiPushClient.sContext).m453a());
                    jbVar.c(im.ClientInfoUpdate.f1168a);
                    jbVar.a(bc.a());
                    jbVar.a(new HashMap());
                    String str = "";
                    if (!TextUtils.isEmpty(i.c(MiPushClient.sContext))) {
                        str = str + bm.a(c);
                    }
                    String e = i.e(MiPushClient.sContext);
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(e)) {
                        str = str + "," + e;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        jbVar.m880a().put(Constants.EXTRA_KEY_IMEI_MD5, str);
                    }
                    ax.a(MiPushClient.sContext).a(jbVar.m880a());
                    int a2 = i.a();
                    if (a2 >= 0) {
                        jbVar.m880a().put("space_id", Integer.toString(a2));
                    }
                    ao.a(MiPushClient.sContext).a((ao) jbVar, ic.Notification, false, (ip) null);
                }
            }
        }).start();
    }

    public static void clearNotification(Context context, int i) {
        ao.a(context).a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initialize(Context context, String str, String str2, MiPushClientCallback miPushClientCallback, String str3, ICallbackResult iCallbackResult) {
        try {
            b.a(context.getApplicationContext());
            b.e("sdk_version = 5_3_0-C");
            ax.a(context).mo506a();
            ds.a(context);
            if (miPushClientCallback != null) {
                PushMessageHandler.a(miPushClientCallback);
            }
            if (iCallbackResult != null) {
                PushMessageHandler.a(iCallbackResult);
            }
            if (r.m966a(sContext)) {
                v.a(sContext);
            }
            boolean z = b.m452a(sContext).a() != Constants.a();
            if (z || shouldSendRegRequest(sContext)) {
                if (z || !b.m452a(sContext).a(str, str2) || b.m452a(sContext).m464f()) {
                    String a2 = bm.a(6);
                    b.m452a(sContext).m454a();
                    b.m452a(sContext).a(Constants.a());
                    b.m452a(sContext).a(str, str2, a2);
                    MiTinyDataClient.a.a().b(MiTinyDataClient.PENDING_REASON_APPID);
                    clearExtras(sContext);
                    clearNotification(context);
                    jc jcVar = new jc();
                    jcVar.a(bc.b());
                    jcVar.b(str);
                    jcVar.e(str2);
                    jcVar.d(sContext.getPackageName());
                    jcVar.f(a2);
                    Context context2 = sContext;
                    jcVar.c(g.m702a(context2, context2.getPackageName()));
                    Context context3 = sContext;
                    jcVar.b(g.a(context3, context3.getPackageName()));
                    jcVar.h(BuildConfig.VERSION_NAME);
                    jcVar.a(BuildConfig.VERSION_CODE);
                    jcVar.a(iq.Init);
                    if (!TextUtils.isEmpty(str3)) {
                        jcVar.g(str3);
                    }
                    if (!j.m874d()) {
                        String d = i.d(sContext);
                        if (!TextUtils.isEmpty(d)) {
                            jcVar.i(bm.a(d) + "," + i.f(sContext));
                        }
                    }
                    int a3 = i.a();
                    if (a3 >= 0) {
                        jcVar.c(a3);
                    }
                    ao.a(sContext).a(jcVar, z);
                    sContext.getSharedPreferences("mipush_extra", 4).getBoolean("mipush_registed", true);
                } else {
                    if (1 == PushMessageHelper.getPushMode(sContext)) {
                        checkNotNull(miPushClientCallback, "callback");
                        miPushClientCallback.onInitializeResult(0L, null, b.m452a(sContext).m460c());
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(b.m452a(sContext).m460c());
                        PushMessageHelper.sendCommandMessageBroadcast(sContext, PushMessageHelper.generateCommandMessage(fn.COMMAND_REGISTER.f992a, arrayList, 0L, null, null, null));
                    }
                    ao.a(sContext).m442a();
                    if (b.m452a(sContext).m456a()) {
                        jb jbVar = new jb();
                        jbVar.b(b.m452a(sContext).m453a());
                        jbVar.c(im.ClientInfoUpdate.f1168a);
                        jbVar.a(bc.a());
                        HashMap hashMap = new HashMap();
                        jbVar.f1308a = hashMap;
                        Context context4 = sContext;
                        hashMap.put("app_version", g.m702a(context4, context4.getPackageName()));
                        Map<String, String> map = jbVar.f1308a;
                        Context context5 = sContext;
                        map.put(Constants.EXTRA_KEY_APP_VERSION_CODE, Integer.toString(g.a(context5, context5.getPackageName())));
                        jbVar.f1308a.put("push_sdk_vn", BuildConfig.VERSION_NAME);
                        jbVar.f1308a.put("push_sdk_vc", Integer.toString(BuildConfig.VERSION_CODE));
                        String e = b.m452a(sContext).e();
                        if (!TextUtils.isEmpty(e)) {
                            jbVar.f1308a.put("deviceid", e);
                        }
                        ao.a(sContext).a((ao) jbVar, ic.Notification, false, (ip) null);
                        ao.a(sContext).m443a(sContext);
                    }
                    if (!k.m955a(sContext, "update_devId", false)) {
                        updateImeiOrOaid();
                        k.a(sContext, "update_devId", true);
                    }
                    if (shouldUseMIUIPush(sContext) && shouldPullNotification(sContext)) {
                        jb jbVar2 = new jb();
                        jbVar2.b(b.m452a(sContext).m453a());
                        jbVar2.c(im.PullOfflineMessage.f1168a);
                        jbVar2.a(bc.a());
                        jbVar2.a(false);
                        ao.a(sContext).a((ao) jbVar2, ic.Notification, false, (ip) null, false);
                        addPullNotificationTime(sContext);
                    }
                }
                addRegRequestTime(sContext);
                scheduleOcVersionCheckJob();
                scheduleDataCollectionJobs(sContext);
                initEventPerfLogic(sContext);
                av.a(sContext);
                if (!sContext.getPackageName().equals("com.xiaomi.xmsf")) {
                    if (Logger.getUserLogger() != null) {
                        Logger.setLogger(sContext, Logger.getUserLogger());
                    }
                    b.a(2);
                }
                operateSyncAction(context);
                return;
            }
            ao.a(sContext).m442a();
            b.m410a("Could not send  register message within 5s repeatly .");
        } catch (Throwable th) {
            b.a(th);
        }
    }

    public static void registerPush(Context context, String str, String str2, PushConfiguration pushConfiguration) {
        registerPush(context, str, str2, pushConfiguration, null, null);
    }

    @Deprecated
    public static void reportMessageClicked(Context context, String str) {
        reportMessageClicked(context, str, null, null);
    }

    public static void setCommand(Context context, String str, ArrayList<String> arrayList, String str2) {
        if (!TextUtils.isEmpty(b.m452a(context).m453a())) {
            iw iwVar = new iw();
            String a2 = bc.a();
            iwVar.a(a2);
            iwVar.b(b.m452a(context).m453a());
            iwVar.c(str);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                iwVar.m844a(it.next());
            }
            iwVar.e(str2);
            iwVar.d(context.getPackageName());
            b.e("cmd:" + str + ", " + a2);
            ao.a(context).a((ao) iwVar, ic.Command, (ip) null);
        }
    }

    public static void clearNotification(Context context, String str, String str2) {
        ao.a(context).a(str, str2);
    }

    private static void registerPush(Context context, final String str, final String str2, PushConfiguration pushConfiguration, final String str3, final ICallbackResult iCallbackResult) {
        checkNotNull(context, "context");
        checkNotNull(str, LogContext.STORAGE_APPID);
        checkNotNull(str2, "appToken");
        Context applicationContext = context.getApplicationContext();
        sContext = applicationContext;
        if (applicationContext == null) {
            sContext = context;
        }
        Context context2 = sContext;
        r.a(context2);
        if (!NetworkStatusReceiver.a()) {
            registerNetworkReceiver(sContext);
        }
        f.a(sContext).a(pushConfiguration);
        ah.a(context2).a(new Runnable() { // from class: com.xiaomi.mipush.sdk.MiPushClient.1
            @Override // java.lang.Runnable
            public void run() {
                MiPushClient.initialize(MiPushClient.sContext, str, str2, null, str3, iCallbackResult);
            }
        });
    }

    public static void reportMessageClicked(Context context, String str, ip ipVar, String str2) {
        jb jbVar = new jb();
        if (TextUtils.isEmpty(str2)) {
            if (b.m452a(context).m459b()) {
                str2 = b.m452a(context).m453a();
            } else {
                b.d("do not report clicked message");
                return;
            }
        }
        jbVar.b(str2);
        jbVar.c("bar:click");
        jbVar.a(str);
        jbVar.a(false);
        ao.a(context).a((ao) jbVar, ic.Notification, false, ipVar);
    }

    private static void checkNotNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException("param " + str + " is not nullable");
        }
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
        registerPush(context, str, str2, new PushConfiguration(), str3, null);
    }

    @Deprecated
    public static void syncAssembleCOSPushToken(Context context) {
    }

    @Deprecated
    public static void syncAssembleFTOSPushToken(Context context) {
    }

    @Deprecated
    public static void syncAssemblePushToken(Context context) {
    }

    public static void setAcceptTime(Context context, int i, int i2, int i3, int i4, String str) {
        if (i < 0 || i >= 24 || i3 < 0 || i3 >= 24 || i2 < 0 || i2 >= 60 || i4 < 0 || i4 >= 60) {
            throw new IllegalArgumentException("the input parameter is not valid.");
        }
        long rawOffset = ((TimeZone.getTimeZone("GMT+08").getRawOffset() - TimeZone.getDefault().getRawOffset()) / 1000) / 60;
        long j = ((((i * 60) + i2) + rawOffset) + 1440) % 1440;
        long j2 = ((((i3 * 60) + i4) + rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j / 60), Long.valueOf(j % 60)));
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(String.format("%1$02d:%2$02d", Integer.valueOf(i), Integer.valueOf(i2)));
        arrayList2.add(String.format("%1$02d:%2$02d", Integer.valueOf(i3), Integer.valueOf(i4)));
        if (!acceptTimeSet(context, (String) arrayList.get(0), (String) arrayList.get(1))) {
            setCommand(context, fn.COMMAND_SET_ACCEPT_TIME.f992a, arrayList, str);
        } else if (1 == PushMessageHelper.getPushMode(context)) {
            PushMessageHandler.a(context, str, fn.COMMAND_SET_ACCEPT_TIME.f992a, 0L, null, arrayList2);
        } else {
            PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(fn.COMMAND_SET_ACCEPT_TIME.f992a, arrayList2, 0L, null, null, null));
        }
    }
}
