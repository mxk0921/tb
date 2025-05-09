package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.mipush.sdk.MessageHandleService;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.fd;
import com.xiaomi.push.fn;
import com.xiaomi.push.ig;
import com.xiaomi.push.jm;
import com.xiaomi.push.r;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PushMessageHandler extends BaseService {

    /* renamed from: a  reason: collision with root package name */
    private static List<MiPushClient.ICallbackResult> f14703a = new ArrayList();
    private static List<MiPushClient.MiPushClientCallback> b = new ArrayList();

    /* renamed from: a  reason: collision with other field name */
    private static ThreadPoolExecutor f668a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a extends Serializable {
    }

    public static void a() {
        synchronized (b) {
            b.clear();
        }
    }

    public static void b() {
        synchronized (f14703a) {
            f14703a.clear();
        }
    }

    private static void c(Context context, Intent intent) {
        String str;
        if (intent == null || f668a.isShutdown()) {
            if (intent == null) {
                str = "0";
            } else {
                str = "1";
            }
            b.c("PushMessageHandler", "-->scheduleJob() fail, case".concat(str));
            return;
        }
        f668a.execute(new al(context, intent));
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        c(getApplicationContext(), intent);
    }

    public static void a(long j, String str, String str2) {
        synchronized (b) {
            try {
                for (MiPushClient.MiPushClientCallback miPushClientCallback : b) {
                    miPushClientCallback.onInitializeResult(j, str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setAction("action_clicked_activity_finish");
            context.sendBroadcast(intent, d.a(context));
        } catch (Exception e) {
            b.m411a("PushMessageHandler", "callback sync error" + e);
        }
    }

    public static void a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, PushMessageHandler.class));
        try {
            context.startService(intent);
        } catch (Exception e) {
            b.m411a("PushMessageHandler", e.getMessage());
        }
    }

    public static void b(Context context, Intent intent) {
        boolean z;
        try {
            z = intent.getBooleanExtra("is_clicked_activity_call", false);
        } catch (Throwable th) {
            b.m411a("PushMessageHandler", "intent unparcel error:" + th);
            z = false;
        }
        try {
            b.m412a("PushMessageHandler", "-->onHandleIntent(): action=", intent.getAction());
            ResolveInfo resolveInfo = null;
            if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
                o.a(context, intent, null);
            } else if ("com.xiaomi.mipush.SEND_TINYDATA".equals(intent.getAction())) {
                ig igVar = new ig();
                jm.a(igVar, intent.getByteArrayExtra("mipush_payload"));
                b.m416b("PushMessageHandler", "PushMessageHandler.onHandleIntent " + igVar.d());
                MiTinyDataClient.upload(context, igVar);
            } else if (1 == PushMessageHelper.getPushMode(context)) {
                if (m430b()) {
                    b.m413a("PushMessageHandler", "receive a message before application calling initialize");
                    if (!z) {
                        return;
                    }
                    return;
                }
                a a2 = am.a(context).a(intent);
                if (a2 != null) {
                    a(context, a2);
                }
            } else if (!"com.xiaomi.mipush.sdk.SYNC_LOG".equals(intent.getAction())) {
                Intent intent2 = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
                intent2.setPackage(context.getPackageName());
                intent2.putExtras(intent);
                try {
                    List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent2, 32);
                    if (queryBroadcastReceivers != null) {
                        Iterator<ResolveInfo> it = queryBroadcastReceivers.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ResolveInfo next = it.next();
                                ActivityInfo activityInfo = next.activityInfo;
                                if (activityInfo != null && activityInfo.packageName.equals(context.getPackageName()) && PushMessageReceiver.class.isAssignableFrom(r.a(context, next.activityInfo.name))) {
                                    resolveInfo = next;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (resolveInfo != null) {
                        a(context, intent2, resolveInfo, z);
                    } else {
                        b.m413a("PushMessageHandler", "cannot find the receiver to handler this message, check your manifest");
                        fd.a(context).a(context.getPackageName(), intent, "11");
                    }
                } catch (Exception e) {
                    b.a("PushMessageHandler", e);
                    fd.a(context).a(context.getPackageName(), intent, "9");
                }
            }
            if (!z) {
                return;
            }
        } catch (Throwable th2) {
            try {
                b.a("PushMessageHandler", th2);
                fd.a(context).a(context.getPackageName(), intent, "10");
                if (!z) {
                    return;
                }
            } finally {
                if (z) {
                    b(context);
                }
            }
        }
        b(context);
    }

    public static void a(Context context, Intent intent) {
        b.m416b("PushMessageHandler", "addjob PushMessageHandler " + intent);
        if (intent != null) {
            c(context, intent);
            a(context);
        }
    }

    public static void b(Context context, String str, long j, String str2, String str3) {
        synchronized (b) {
            try {
                for (MiPushClient.MiPushClientCallback miPushClientCallback : b) {
                    if (a(str, miPushClientCallback.getCategory())) {
                        miPushClientCallback.onUnsubscribeResult(j, str2, str3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void a(Context context, Intent intent, ResolveInfo resolveInfo, boolean z) {
        try {
            MessageHandleService.a aVar = new MessageHandleService.a(intent, (PushMessageReceiver) r.a(context, resolveInfo.activityInfo.name).newInstance());
            if (z) {
                MessageHandleService.a(context.getApplicationContext(), aVar);
            } else {
                MessageHandleService.addJob(context.getApplicationContext(), aVar);
            }
            MessageHandleService.a(context, new Intent(context.getApplicationContext(), MessageHandleService.class));
        } catch (Throwable th) {
            b.a(th);
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public static boolean m430b() {
        return b.isEmpty();
    }

    public static void a(Context context, MiPushCommandMessage miPushCommandMessage) {
        synchronized (f14703a) {
            try {
                for (MiPushClient.ICallbackResult iCallbackResult : f14703a) {
                    if (iCallbackResult instanceof MiPushClient.UPSRegisterCallBack) {
                        MiPushClient.TokenResult tokenResult = new MiPushClient.TokenResult();
                        if (!(miPushCommandMessage == null || miPushCommandMessage.getCommandArguments() == null || miPushCommandMessage.getCommandArguments().size() <= 0)) {
                            tokenResult.setResultCode(miPushCommandMessage.getResultCode());
                            tokenResult.setToken(miPushCommandMessage.getCommandArguments().get(0));
                        }
                        iCallbackResult.onResult(tokenResult);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(Context context, MiPushMessage miPushMessage) {
        synchronized (b) {
            try {
                for (MiPushClient.MiPushClientCallback miPushClientCallback : b) {
                    if (a(miPushMessage.getCategory(), miPushClientCallback.getCategory())) {
                        miPushClientCallback.onReceiveMessage(miPushMessage.getContent(), miPushMessage.getAlias(), miPushMessage.getTopic(), miPushMessage.isNotified());
                        miPushClientCallback.onReceiveMessage(miPushMessage);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(Context context, a aVar) {
        if (aVar instanceof MiPushMessage) {
            a(context, (MiPushMessage) aVar);
        } else if (aVar instanceof MiPushCommandMessage) {
            MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) aVar;
            String command = miPushCommandMessage.getCommand();
            String str = null;
            if (fn.COMMAND_REGISTER.f992a.equals(command)) {
                List<String> commandArguments = miPushCommandMessage.getCommandArguments();
                if (commandArguments != null && !commandArguments.isEmpty()) {
                    str = commandArguments.get(0);
                }
                a(miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
            } else if (fn.COMMAND_SET_ALIAS.f992a.equals(command) || fn.COMMAND_UNSET_ALIAS.f992a.equals(command) || fn.COMMAND_SET_ACCEPT_TIME.f992a.equals(command)) {
                a(context, miPushCommandMessage.getCategory(), command, miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), miPushCommandMessage.getCommandArguments());
            } else if (fn.COMMAND_SUBSCRIBE_TOPIC.f992a.equals(command)) {
                List<String> commandArguments2 = miPushCommandMessage.getCommandArguments();
                if (commandArguments2 != null && !commandArguments2.isEmpty()) {
                    str = commandArguments2.get(0);
                }
                a(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
            } else if (fn.COMMAND_UNSUBSCRIBE_TOPIC.f992a.equals(command)) {
                List<String> commandArguments3 = miPushCommandMessage.getCommandArguments();
                if (commandArguments3 != null && !commandArguments3.isEmpty()) {
                    str = commandArguments3.get(0);
                }
                b(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
            }
        }
    }

    public static void a(Context context, String str, long j, String str2, String str3) {
        synchronized (b) {
            try {
                for (MiPushClient.MiPushClientCallback miPushClientCallback : b) {
                    if (a(str, miPushClientCallback.getCategory())) {
                        miPushClientCallback.onSubscribeResult(j, str2, str3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(Context context, String str, String str2, long j, String str3, List<String> list) {
        synchronized (b) {
            try {
                for (MiPushClient.MiPushClientCallback miPushClientCallback : b) {
                    if (a(str, miPushClientCallback.getCategory())) {
                        miPushClientCallback.onCommandResult(str2, j, str3, list);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(MiPushClient.ICallbackResult iCallbackResult) {
        synchronized (f14703a) {
            try {
                if (!f14703a.contains(iCallbackResult)) {
                    f14703a.add(iCallbackResult);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(MiPushClient.MiPushClientCallback miPushClientCallback) {
        synchronized (b) {
            try {
                if (!b.contains(miPushClientCallback)) {
                    b.add(miPushClientCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.xiaomi.mipush.sdk.BaseService
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo431a() {
        ThreadPoolExecutor threadPoolExecutor = f668a;
        return (threadPoolExecutor == null || threadPoolExecutor.getQueue() == null || f668a.getQueue().size() <= 0) ? false : true;
    }

    public static boolean a(String str, String str2) {
        return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.equals(str, str2);
    }
}
