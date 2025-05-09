package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.xiaomi.push.ip;
import com.xiaomi.push.jf;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PushMessageHelper {
    public static final String ERROR_MESSAGE = "error_message";
    public static final String ERROR_TYPE = "error_type";
    public static final String ERROR_TYPE_NEED_PERMISSION = "error_lack_of_permission";
    public static final String KEY_COMMAND = "key_command";
    public static final String KEY_MESSAGE = "key_message";
    public static final int MESSAGE_COMMAND = 3;
    public static final int MESSAGE_ERROR = 5;
    public static final int MESSAGE_QUIT = 4;
    public static final int MESSAGE_RAW = 1;
    public static final int MESSAGE_SENDMESSAGE = 2;
    public static final String MESSAGE_TYPE = "message_type";
    public static final int PUSH_MODE_BROADCAST = 2;
    public static final int PUSH_MODE_CALLBACK = 1;
    private static int pushMode;

    public static MiPushCommandMessage generateCommandMessage(String str, List<String> list, long j, String str2, String str3, List<String> list2) {
        MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
        miPushCommandMessage.setCommand(str);
        miPushCommandMessage.setCommandArguments(list);
        miPushCommandMessage.setResultCode(j);
        miPushCommandMessage.setReason(str2);
        miPushCommandMessage.setCategory(str3);
        miPushCommandMessage.setAutoMarkPkgs(list2);
        return miPushCommandMessage;
    }

    public static MiPushMessage generateMessage(jf jfVar, ip ipVar, boolean z) {
        MiPushMessage miPushMessage = new MiPushMessage();
        miPushMessage.setMessageId(jfVar.m902a());
        if (!TextUtils.isEmpty(jfVar.d())) {
            miPushMessage.setMessageType(1);
            miPushMessage.setAlias(jfVar.d());
        } else if (!TextUtils.isEmpty(jfVar.c())) {
            miPushMessage.setMessageType(2);
            miPushMessage.setTopic(jfVar.c());
        } else if (!TextUtils.isEmpty(jfVar.f())) {
            miPushMessage.setMessageType(3);
            miPushMessage.setUserAccount(jfVar.f());
        } else {
            miPushMessage.setMessageType(0);
        }
        miPushMessage.setCategory(jfVar.e());
        if (jfVar.a() != null) {
            miPushMessage.setContent(jfVar.a().c());
        }
        if (ipVar != null) {
            if (TextUtils.isEmpty(miPushMessage.getMessageId())) {
                miPushMessage.setMessageId(ipVar.m819a());
            }
            if (TextUtils.isEmpty(miPushMessage.getTopic())) {
                miPushMessage.setTopic(ipVar.m824b());
            }
            miPushMessage.setDescription(ipVar.d());
            miPushMessage.setTitle(ipVar.m827c());
            miPushMessage.setNotifyType(ipVar.a());
            miPushMessage.setNotifyId(ipVar.c());
            miPushMessage.setPassThrough(ipVar.b());
            miPushMessage.setExtra(ipVar.m820a());
        }
        miPushMessage.setNotified(z);
        return miPushMessage;
    }

    public static int getPushMode(Context context) {
        int i;
        if (pushMode == 0) {
            if (isUseCallbackPushMode(context)) {
                i = 1;
            } else {
                i = 2;
            }
            setPushMode(i);
        }
        return pushMode;
    }

    private static boolean isIntentAvailable(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            if (queryBroadcastReceivers != null) {
                if (!queryBroadcastReceivers.isEmpty()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean isUseCallbackPushMode(Context context) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setClassName(context.getPackageName(), "com.xiaomi.mipush.sdk.PushServiceReceiver");
        return isIntentAvailable(context, intent);
    }

    public static void sendCommandMessageBroadcast(Context context, MiPushCommandMessage miPushCommandMessage) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra("message_type", 3);
        intent.putExtra(KEY_COMMAND, miPushCommandMessage);
        new PushServiceReceiver().onReceive(context, intent);
    }

    public static void sendQuitMessageBroadcast(Context context) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra("message_type", 4);
        new PushServiceReceiver().onReceive(context, intent);
    }

    private static void setPushMode(int i) {
        pushMode = i;
    }

    public static ip generateMessage(MiPushMessage miPushMessage) {
        ip ipVar = new ip();
        ipVar.a(miPushMessage.getMessageId());
        ipVar.b(miPushMessage.getTopic());
        ipVar.d(miPushMessage.getDescription());
        ipVar.c(miPushMessage.getTitle());
        ipVar.c(miPushMessage.getNotifyId());
        ipVar.a(miPushMessage.getNotifyType());
        ipVar.b(miPushMessage.getPassThrough());
        ipVar.a(miPushMessage.getExtra());
        return ipVar;
    }
}
