package com.meizu.cloud.pushsdk.platform;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PlatformMessageSender {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PushSwitchStatus f5913a;

        public a(PushSwitchStatus pushSwitchStatus) {
            this.f5913a = pushSwitchStatus;
        }

        @Override // com.meizu.cloud.pushsdk.platform.PlatformMessageSender.f
        public BasicPushStatus a() {
            return this.f5913a;
        }

        @Override // com.meizu.cloud.pushsdk.platform.PlatformMessageSender.f
        public String b() {
            return PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PUSH_STATUS;
        }

        @Override // com.meizu.cloud.pushsdk.platform.PlatformMessageSender.f
        public String c() {
            return PushConstants.EXTRA_APP_PUSH_SWITCH_STATUS;
        }

        @Override // com.meizu.cloud.pushsdk.platform.PlatformMessageSender.f
        public String d() {
            return com.meizu.cloud.pushsdk.platform.message.a.a(this.f5913a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RegisterStatus f5914a;

        public b(RegisterStatus registerStatus) {
            this.f5914a = registerStatus;
        }

        @Override // com.meizu.cloud.pushsdk.platform.PlatformMessageSender.f
        public BasicPushStatus a() {
            return this.f5914a;
        }

        @Override // com.meizu.cloud.pushsdk.platform.PlatformMessageSender.f
        public String b() {
            return PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_REGISTER_STATUS;
        }

        @Override // com.meizu.cloud.pushsdk.platform.PlatformMessageSender.f
        public String c() {
            return PushConstants.EXTRA_APP_PUSH_REGISTER_STATUS;
        }

        @Override // com.meizu.cloud.pushsdk.platform.PlatformMessageSender.f
        public String d() {
            return com.meizu.cloud.pushsdk.platform.message.a.a(this.f5914a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UnRegisterStatus f5915a;

        public c(UnRegisterStatus unRegisterStatus) {
            this.f5915a = unRegisterStatus;
        }

        @Override // com.meizu.cloud.pushsdk.platform.PlatformMessageSender.f
        public BasicPushStatus a() {
            return this.f5915a;
        }

        @Override // com.meizu.cloud.pushsdk.platform.PlatformMessageSender.f
        public String b() {
            return PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_UNREGISTER_STATUS;
        }

        @Override // com.meizu.cloud.pushsdk.platform.PlatformMessageSender.f
        public String c() {
            return PushConstants.EXTRA_APP_PUSH_UNREGISTER_STATUS;
        }

        @Override // com.meizu.cloud.pushsdk.platform.PlatformMessageSender.f
        public String d() {
            return com.meizu.cloud.pushsdk.platform.message.a.a(this.f5915a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SubTagsStatus f5916a;

        public d(SubTagsStatus subTagsStatus) {
            this.f5916a = subTagsStatus;
        }

        @Override // com.meizu.cloud.pushsdk.platform.PlatformMessageSender.f
        public BasicPushStatus a() {
            return this.f5916a;
        }

        @Override // com.meizu.cloud.pushsdk.platform.PlatformMessageSender.f
        public String b() {
            return PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_SUBTAGS_STATUS;
        }

        @Override // com.meizu.cloud.pushsdk.platform.PlatformMessageSender.f
        public String c() {
            return PushConstants.EXTRA_APP_PUSH_SUBTAGS_STATUS;
        }

        @Override // com.meizu.cloud.pushsdk.platform.PlatformMessageSender.f
        public String d() {
            return com.meizu.cloud.pushsdk.platform.message.a.a(this.f5916a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SubAliasStatus f5917a;

        public e(SubAliasStatus subAliasStatus) {
            this.f5917a = subAliasStatus;
        }

        @Override // com.meizu.cloud.pushsdk.platform.PlatformMessageSender.f
        public BasicPushStatus a() {
            return this.f5917a;
        }

        @Override // com.meizu.cloud.pushsdk.platform.PlatformMessageSender.f
        public String b() {
            return PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_SUBALIAS_STATUS;
        }

        @Override // com.meizu.cloud.pushsdk.platform.PlatformMessageSender.f
        public String c() {
            return PushConstants.EXTRA_APP_PUSH_SUBALIAS_STATUS;
        }

        @Override // com.meizu.cloud.pushsdk.platform.PlatformMessageSender.f
        public String d() {
            return com.meizu.cloud.pushsdk.platform.message.a.a(this.f5917a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface f {
        BasicPushStatus a();

        String b();

        String c();

        String d();
    }

    public static void a(Context context, int i, boolean z, String str) {
        String appVersionName = MzSystemUtils.getAppVersionName(context, PushConstants.PUSH_PACKAGE_NAME);
        DebugLogger.i("PlatformMessageSender", context.getPackageName() + " switchPushMessageSetting cloudVersion_name " + appVersionName);
        if (!TextUtils.isEmpty(appVersionName) && Integer.parseInt(appVersionName.substring(0, 1)) >= 6) {
            Intent intent = new Intent(PushConstants.MZ_PUSH_ON_MESSAGE_SWITCH_SETTING);
            intent.putExtra(PushConstants.EXTRA_APP_PUSH_SWITCH_SETTING_TYPE, i);
            intent.putExtra(PushConstants.EXTRA_APP_PUSH_SWITCH_SETTING_STATUS, z);
            intent.putExtra(PushConstants.EXTRA_APP_PUSH_SWITCH_SETTING_PACKAGE_NAME, str);
            intent.setClassName(PushConstants.PUSH_PACKAGE_NAME, PushConstants.MZ_PUSH_SERVICE_NAME);
            try {
                context.startService(intent);
            } catch (Exception e2) {
                DebugLogger.e("PlatformMessageSender", "start switch push message setting service error " + e2.getMessage());
            }
        }
    }

    public static void launchStartActivity(Context context, String str, String str2, String str3) {
        com.meizu.cloud.pushsdk.handler.e.j.d a2 = com.meizu.cloud.pushsdk.util.d.a(str3);
        MessageV3 parse = MessageV3.parse(str, str, a2.c(), a2.b(), a2.e(), a2.d(), str2);
        Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, parse);
        intent.putExtra("method", "private");
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
            intent.setClassName(str, "com.meizu.cloud.pushsdk.NotificationService");
        }
        intent.putExtra("command_type", "reflect_receiver");
        DebugLogger.i("PlatformMessageSender", "start notification service " + parse);
        try {
            context.startService(intent);
        } catch (Exception e2) {
            DebugLogger.e("PlatformMessageSender", "launchStartActivity error " + e2.getMessage());
        }
    }

    public static void showQuickNotification(Context context, String str, String str2) {
        com.meizu.cloud.pushsdk.handler.e.j.d a2 = com.meizu.cloud.pushsdk.util.d.a(str2);
        Intent intent = new Intent();
        intent.putExtra(PushConstants.EXTRA_APP_PUSH_SEQ_ID, a2.d());
        intent.putExtra(PushConstants.EXTRA_APP_PUSH_TASK_ID, a2.e());
        intent.putExtra(PushConstants.EXTRA_APP_PUSH_TASK_TIMES_TAMP, a2.c());
        intent.putExtra(PushConstants.EXTRA_APP_PUSH_SERVICE_DEFAULT_PACKAGE_NAME, context.getPackageName());
        intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, str);
        intent.putExtra(PushConstants.MZ_PUSH_MESSAGE_STATISTICS_IMEI_KEY, a2.b());
        intent.putExtra("method", PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_SHOW_V3);
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        intent.setClassName(context.getPackageName(), "com.meizu.cloud.pushsdk.NotificationService");
        intent.putExtra("command_type", "reflect_receiver");
        try {
            DebugLogger.e("PlatformMessageSender", "start notification service to show notification");
            context.startService(intent);
        } catch (Exception e2) {
            DebugLogger.e("PlatformMessageSender", "showNotification error " + e2.getMessage());
        }
    }

    private static void a(Context context, String str, f fVar) {
        Intent intent = new Intent();
        intent.addCategory(str);
        intent.setPackage(str);
        intent.putExtra("method", fVar.b());
        if (MinSdkChecker.isSupportTransmitMessageValue(context, str)) {
            intent.putExtra(PushConstants.MZ_MESSAGE_VALUE, fVar.d());
        } else {
            intent.putExtra(fVar.c(), fVar.a());
        }
        MzSystemUtils.sendMessageFromBroadcast(context, intent, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, str);
        com.meizu.cloud.pushsdk.a.a(context);
    }

    public static void a(Context context, String str, PushSwitchStatus pushSwitchStatus) {
        a(context, str, new a(pushSwitchStatus));
    }

    public static void a(Context context, String str, RegisterStatus registerStatus) {
        a(context, str, new b(registerStatus));
    }

    public static void a(Context context, String str, SubAliasStatus subAliasStatus) {
        a(context, str, new e(subAliasStatus));
    }

    public static void a(Context context, String str, SubTagsStatus subTagsStatus) {
        a(context, str, new d(subTagsStatus));
    }

    public static void a(Context context, String str, UnRegisterStatus unRegisterStatus) {
        a(context, str, new c(unRegisterStatus));
    }
}
