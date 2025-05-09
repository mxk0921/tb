package com.meizu.cloud.pushsdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class MzPushMessageReceiver extends BroadcastReceiver {
    private static final String TAG = "MzPushMessageReceiver";
    private static boolean bInitLog;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f5767a;
        final /* synthetic */ Intent b;

        public a(Context context, Intent intent) {
            this.f5767a = context;
            this.b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!MzPushMessageReceiver.bInitLog) {
                boolean unused = MzPushMessageReceiver.bInitLog = true;
                DebugLogger.init(this.f5767a);
            }
            MzPushMessageReceiver.this.onHandleIntent(this.f5767a, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends com.meizu.cloud.pushsdk.handler.a {
        public b() {
        }

        @Override // com.meizu.cloud.pushsdk.handler.a
        public void a(Context context, Intent intent) {
            DebugLogger.i(MzPushMessageReceiver.TAG, "onMessage Flyme3 " + intent);
            MzPushMessageReceiver.this.onMessage(context, intent);
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void b(Context context, MzPushMessage mzPushMessage) {
            DebugLogger.i(MzPushMessageReceiver.TAG, "onNotificationArrived title " + mzPushMessage.getTitle() + "content " + mzPushMessage.getContent() + " selfDefineContentString " + mzPushMessage.getSelfDefineContentString());
            MzPushMessageReceiver.this.onNotificationArrived(context, mzPushMessage);
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void c(Context context, MzPushMessage mzPushMessage) {
            DebugLogger.i(MzPushMessageReceiver.TAG, "onNotificationDeleted title " + mzPushMessage.getTitle() + "content " + mzPushMessage.getContent() + " selfDefineContentString " + mzPushMessage.getSelfDefineContentString());
            MzPushMessageReceiver.this.onNotificationDeleted(context, mzPushMessage);
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, MzPushMessage mzPushMessage) {
            DebugLogger.i(MzPushMessageReceiver.TAG, "onNotificationClicked title " + mzPushMessage.getTitle() + "content " + mzPushMessage.getContent() + " selfDefineContentString " + mzPushMessage.getSelfDefineContentString());
            MzPushMessageReceiver.this.onNotificationClicked(context, mzPushMessage);
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void b(Context context, String str) {
            DebugLogger.i(MzPushMessageReceiver.TAG, "onRegister " + str);
            MzPushMessageReceiver.this.onRegister(context, str);
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void c(Context context, String str) {
            DebugLogger.i(MzPushMessageReceiver.TAG, "onNotifyMessageArrived " + str);
            MzPushMessageReceiver.this.onNotifyMessageArrived(context, str);
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, PushSwitchStatus pushSwitchStatus) {
            DebugLogger.i(MzPushMessageReceiver.TAG, "onPushStatus " + pushSwitchStatus);
            MzPushMessageReceiver.this.onPushStatus(context, pushSwitchStatus);
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, RegisterStatus registerStatus) {
            DebugLogger.i(MzPushMessageReceiver.TAG, "onRegisterStatus " + registerStatus);
            MzPushMessageReceiver.this.onRegisterStatus(context, registerStatus);
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, SubAliasStatus subAliasStatus) {
            DebugLogger.i(MzPushMessageReceiver.TAG, "onSubAliasStatus " + subAliasStatus);
            MzPushMessageReceiver.this.onSubAliasStatus(context, subAliasStatus);
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, SubTagsStatus subTagsStatus) {
            DebugLogger.i(MzPushMessageReceiver.TAG, "onSubTagsStatus " + subTagsStatus);
            MzPushMessageReceiver.this.onSubTagsStatus(context, subTagsStatus);
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, UnRegisterStatus unRegisterStatus) {
            DebugLogger.i(MzPushMessageReceiver.TAG, "onUnRegisterStatus " + unRegisterStatus);
            MzPushMessageReceiver.this.onUnRegisterStatus(context, unRegisterStatus);
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, String str) {
            MzPushMessageReceiver.this.onMessage(context, str);
            DebugLogger.i(MzPushMessageReceiver.TAG, "receive message " + str);
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, String str, String str2) {
            MzPushMessageReceiver.this.onMessage(context, str, str2);
            DebugLogger.i(MzPushMessageReceiver.TAG, "receive message " + str + " platformExtra " + str2);
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, boolean z) {
            DebugLogger.i(MzPushMessageReceiver.TAG, "onUnRegister " + z);
            MzPushMessageReceiver.this.onUnRegister(context, z);
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(PushNotificationBuilder pushNotificationBuilder) {
            MzPushMessageReceiver.this.onUpdateNotificationBuilder(pushNotificationBuilder);
        }
    }

    private com.meizu.cloud.pushsdk.handler.a getAbstractAppLogicListener() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onHandleIntent(Context context, Intent intent) {
        com.meizu.cloud.pushsdk.b.a(context).a(TAG, getAbstractAppLogicListener()).a(intent);
    }

    public void onMessage(Context context, Intent intent) {
    }

    public abstract void onPushStatus(Context context, PushSwitchStatus pushSwitchStatus);

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com.meizu.cloud.pushsdk.d.m.b.a().execute(new a(context.getApplicationContext(), intent));
    }

    public abstract void onRegisterStatus(Context context, RegisterStatus registerStatus);

    public abstract void onSubAliasStatus(Context context, SubAliasStatus subAliasStatus);

    public abstract void onSubTagsStatus(Context context, SubTagsStatus subTagsStatus);

    public abstract void onUnRegisterStatus(Context context, UnRegisterStatus unRegisterStatus);

    public void onUpdateNotificationBuilder(PushNotificationBuilder pushNotificationBuilder) {
        pushNotificationBuilder.setStatusBarIcon(R.drawable.stat_sys_third_app_notify);
    }

    public void onMessage(Context context, String str) {
    }

    public void onMessage(Context context, String str, String str2) {
    }

    public void onNotificationArrived(Context context, MzPushMessage mzPushMessage) {
    }

    public void onNotificationClicked(Context context, MzPushMessage mzPushMessage) {
    }

    public void onNotificationDeleted(Context context, MzPushMessage mzPushMessage) {
    }

    public void onNotifyMessageArrived(Context context, String str) {
    }

    @Deprecated
    public void onRegister(Context context, String str) {
    }

    @Deprecated
    public void onUnRegister(Context context, boolean z) {
    }
}
