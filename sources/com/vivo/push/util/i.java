package com.vivo.push.util;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.NotifyArriveCallbackByUser;
import java.util.List;
import java.util.Map;
import tb.h1p;
import tb.ya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class i extends b {
    private int e = 0;

    private Intent b(Context context, InsideNotificationItem insideNotificationItem, NotifyArriveCallbackByUser notifyArriveCallbackByUser) {
        String packageName;
        Intent intent;
        int a2;
        try {
            packageName = context.getPackageName();
        } catch (Exception e) {
            u.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient parsing error : " + e.getMessage());
            this.e = 2159;
        }
        if (insideNotificationItem != null && !TextUtils.isEmpty(packageName)) {
            u.d("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient getSkipType ：：" + insideNotificationItem.getSkipType());
            int skipType = insideNotificationItem.getSkipType();
            if (skipType == 1) {
                intent = a(insideNotificationItem.getParams(), packageName, context);
            } else if (skipType == 2) {
                String skipContent = insideNotificationItem.getSkipContent();
                if (!TextUtils.isEmpty(skipContent)) {
                    String lowerCase = skipContent.toLowerCase();
                    if (lowerCase.startsWith(h1p.HTTP_PREFIX) || lowerCase.startsWith(h1p.HTTPS_PREFIX)) {
                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(skipContent));
                        intent2.setFlags(268435456);
                        a(intent2, insideNotificationItem.getParams());
                        u.d("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient url urlAddr ::".concat(String.valueOf(skipContent)));
                        intent = intent2;
                    }
                }
                u.c(context, " 跳转参数不合法，打开网页地址不符合要求 通知未展示 2157");
                u.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient url not legal");
                this.e = 2157;
                intent = null;
            } else if (skipType == 3) {
                String skipContent2 = insideNotificationItem.getSkipContent();
                u.d("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient ：：" + insideNotificationItem.getSkipContent());
                if (notifyArriveCallbackByUser.getIntent() != null) {
                    u.d("AndroidTwelveNotifyClickIntentParam", "notifyArriveCallbackByUser.getIntent()   not null  ");
                    try {
                        intent = notifyArriveCallbackByUser.getIntent();
                        intent.setSelector(null);
                        intent.setFlags(335544320);
                        b(intent, insideNotificationItem.getParams());
                        a2 = a(intent, packageName);
                    } catch (Exception e2) {
                        u.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient open activity error : ".concat(String.valueOf(skipContent2)), e2);
                        this.e = 2158;
                    }
                    if (a2 > 0) {
                        this.e = a2;
                        intent = null;
                    }
                } else {
                    u.d("AndroidTwelveNotifyClickIntentParam", "notifyArriveCallbackByUser.getIntent()   is null 根据skipcontent生成跳转参数 ");
                    intent = a(skipContent2, packageName, insideNotificationItem, context);
                }
            } else if (skipType != 4) {
                u.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient skip type error : intent null");
                this.e = 2159;
                intent = null;
            } else {
                String skipContent3 = insideNotificationItem.getSkipContent();
                u.d("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient ：：" + insideNotificationItem.getSkipContent());
                intent = a(skipContent3, packageName, insideNotificationItem, context);
            }
            if (intent != null) {
                intent.putExtra("vivo_push_messageId", b());
                intent.putExtra("command_type", "reflect_receiver");
                b.a(intent, context);
                this.e = 0;
                return intent;
            }
            u.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient skip type error : " + insideNotificationItem.getSkipType());
            return null;
        }
        u.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient notify == null");
        this.e = 2159;
        return null;
    }

    @Override // com.vivo.push.util.b
    public final int a() {
        return this.e;
    }

    @Override // com.vivo.push.util.b
    public final Intent a(Context context, InsideNotificationItem insideNotificationItem, NotifyArriveCallbackByUser notifyArriveCallbackByUser) {
        return b(context, insideNotificationItem, notifyArriveCallbackByUser);
    }

    @Override // com.vivo.push.util.b
    public final PendingIntent a(Context context, Intent intent) {
        return ya.c(context, (int) SystemClock.uptimeMillis(), intent, 201326592);
    }

    private Intent a(String str, String str2, InsideNotificationItem insideNotificationItem, Context context) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            parseUri.setSelector(null);
            parseUri.setPackage(str2);
            parseUri.setFlags(335544320);
            a(parseUri, insideNotificationItem.getParams());
            int a2 = a(parseUri, str2);
            if (a2 <= 0) {
                return parseUri;
            }
            this.e = a2;
            u.c(context, " 落地页未找到，通知不展示：  " + this.e);
            return null;
        } catch (Exception e) {
            u.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient open activity error : ".concat(String.valueOf(str)), e);
            this.e = 2158;
            return null;
        }
    }

    private static Intent a(Map<String, String> map, String str, Context context) {
        ComponentName componentName;
        Intent intent = new Intent();
        intent.setPackage(str);
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(50);
            if (runningTasks != null) {
                for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
                    componentName = runningTaskInfo.topActivity;
                    if (componentName.getPackageName().equals(str)) {
                        u.d("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient topClassName=" + componentName.getClassName());
                        intent.setComponent(componentName);
                        intent.setFlags(335544320);
                        a(intent, map);
                        return intent;
                    }
                }
            }
        } catch (Exception e) {
            u.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient ActivityManager", e);
        }
        try {
            intent = context.getPackageManager().getLaunchIntentForPackage(str);
            if (intent != null) {
                intent.setFlags(335544320);
                a(intent, map);
            } else {
                u.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient LaunchIntent is null");
            }
        } catch (Exception e2) {
            u.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient LaunchIntent Exception" + e2.getMessage());
        }
        return intent;
    }

    private static Intent a(Intent intent, Map<String, String> map) {
        if (!(map == null || map.entrySet() == null)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!(entry == null || entry.getKey() == null)) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                }
            }
        }
        return intent;
    }

    private int a(Intent intent, String str) {
        int a2 = a(intent);
        u.d("AndroidTwelveNotifyClickIntentParam", "checkSkipContentParameterLegal canfindactivity code : ".concat(String.valueOf(a2)));
        if (a2 != 0) {
            return a2;
        }
        int b = b(intent, str);
        u.d("AndroidTwelveNotifyClickIntentParam", "checkSkipContentParameterLegal packagefit code : ".concat(String.valueOf(b)));
        if (b != 0) {
            return b;
        }
        return 0;
    }

    private int a(Intent intent) {
        if (intent.resolveActivityInfo(this.c.getPackageManager(), 65536) != null) {
            return 0;
        }
        u.a("AndroidTwelveNotifyClickIntentParam", "activity is null  ");
        u.c(this.c, " 跳转参数对应的Activity找不到 通知不展示   2162");
        return 2162;
    }

    private static Intent b(Intent intent, Map<String, String> map) {
        if (!(map == null || map.entrySet() == null)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!(entry == null || entry.getKey() == null || intent.hasExtra(entry.getKey()))) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                }
            }
        }
        return intent;
    }

    private int b(Intent intent, String str) {
        if (intent == null || TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("checkSkipContentPackageFit intent = : ");
            Object obj = intent;
            if (intent == null) {
                obj = "";
            }
            sb.append(obj);
            sb.append(" mPkgName = ");
            sb.append(str);
            u.a("AndroidTwelveNotifyClickIntentParam", sb.toString());
            return 2158;
        }
        try {
            String packageName = intent.getComponent() != null ? intent.getComponent().getPackageName() : intent.getPackage();
            if (TextUtils.isEmpty(packageName) || TextUtils.equals(str, packageName)) {
                return 0;
            }
            u.d("AndroidTwelveNotifyClickIntentParam", "activity component error : local pkgName is " + str + "; but remote pkgName is " + packageName);
            Context context = this.c;
            u.a(context, " 跳转参数对应的包名不是当前应用包名    local pkgName is " + str + "; but remote pkgName is " + packageName + " code =2813");
            return 2813;
        } catch (Exception e) {
            u.a("AndroidTwelveNotifyClickIntentParam", "checkSkipContentPackage open activity error :  error " + e.getMessage());
            return 2158;
        }
    }
}
