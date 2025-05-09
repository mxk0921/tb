package org.android.agoo.xiaomi;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import java.util.List;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class MiPushBroadcastReceiver extends PushMessageReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MI_TOKEN = "MI_TOKEN";
    private static final String TAG = "MiPushBroadcastReceiver";
    private AgooFactory agooFactory;

    public static /* synthetic */ Object ipc$super(MiPushBroadcastReceiver miPushBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/android/agoo/xiaomi/MiPushBroadcastReceiver");
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91df552e", new Object[]{this, context, miPushMessage});
            return;
        }
        try {
            String content = miPushMessage.getContent();
            ALog.d(TAG, "onReceivePassThroughMessage", "msg", content);
            if (this.agooFactory == null) {
                AgooFactory agooFactory = new AgooFactory();
                this.agooFactory = agooFactory;
                agooFactory.init(context, null, null);
            }
            this.agooFactory.msgRecevie(content.getBytes("UTF-8"), "xiaomi", null);
        } catch (Throwable th) {
            ALog.e(TAG, "onReceivePassThroughMessage", th, new Object[0]);
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceiveRegisterResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71809692", new Object[]{this, context, miPushCommandMessage});
            return;
        }
        String command = miPushCommandMessage.getCommand();
        List<String> commandArguments = miPushCommandMessage.getCommandArguments();
        String str2 = null;
        if (commandArguments == null || commandArguments.size() <= 0) {
            str = null;
        } else {
            str = commandArguments.get(0);
        }
        if (commandArguments != null && commandArguments.size() > 1) {
            commandArguments.get(1);
        }
        if ("register".equals(command) && miPushCommandMessage.getResultCode() == 0) {
            str2 = str;
        }
        ALog.d(TAG, "onReceiveRegisterResult", "regId", str2);
        if (!TextUtils.isEmpty(str2)) {
            NotifManager notifManager = new NotifManager();
            notifManager.init(context.getApplicationContext());
            notifManager.reportThirdPushToken(str2, MI_TOKEN);
            Intent intent = new Intent("com.taobao.android.mipush.token");
            intent.putExtra("token", str2);
            context.sendBroadcast(intent);
        }
    }
}
