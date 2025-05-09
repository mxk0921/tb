package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ah;
import com.xiaomi.push.bg;
import com.xiaomi.push.bh;
import com.xiaomi.push.bl;
import com.xiaomi.push.iy;
import com.xiaomi.push.p;
import com.xiaomi.push.r;
import com.xiaomi.push.service.az;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class i {
    public static int a() {
        Integer num = (Integer) bh.a("com.xiaomi.assemble.control.AssembleConstants", "ASSEMBLE_VERSION_CODE");
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static String b(e eVar) {
        return a(eVar) + "_version";
    }

    public static String c(e eVar) {
        int i = k.f14732a[eVar.ordinal()];
        if (i == 1) {
            return "hms_push_error";
        }
        if (i == 2) {
            return "fcm_push_error";
        }
        if (i == 3) {
            return "cos_push_error";
        }
        if (i != 4) {
            return null;
        }
        return "ftos_push_error";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void d(Context context, e eVar, String str) {
        synchronized (i.class) {
            String a2 = a(eVar);
            if (TextUtils.isEmpty(a2)) {
                b.m410a("ASSEMBLE_PUSH : can not find the key of token used in sp file");
                return;
            }
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putString(a2, str).putString("last_check_token", b.m452a(context).m460c());
            if (m476a(eVar)) {
                edit.putInt(b(eVar), a());
            }
            edit.putString("syncingToken", "");
            p.a(edit);
            b.m410a("ASSEMBLE_PUSH : update sp file success!  " + str);
        }
    }

    private static int a(Context context, e eVar, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        String a2 = a(eVar);
        String string = sharedPreferences.getString(a2, "");
        String c = b.m452a(context).m460c();
        String string2 = sharedPreferences.getString("last_check_token", "");
        if (TextUtils.isEmpty(a2)) {
            b.m410a("ASSEMBLE_PUSH : can not find the key of token used in sp file");
            return 0;
        } else if (TextUtils.isEmpty(string)) {
            return 1;
        } else {
            if (!string.equals(str)) {
                return 2;
            }
            if (!TextUtils.equals(c, string2)) {
                return 3;
            }
            if (m476a(eVar)) {
                if (a() != sharedPreferences.getInt(b(eVar), 0)) {
                    return 4;
                }
            }
            return 0;
        }
    }

    public static void b(Context context) {
        f.a(context).register();
    }

    public static void c(Context context) {
        f.a(context).unregister();
    }

    public static MiPushMessage a(String str) {
        MiPushMessage miPushMessage = new MiPushMessage();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("messageId")) {
                    miPushMessage.setMessageId(jSONObject.getString("messageId"));
                }
                if (jSONObject.has("description")) {
                    miPushMessage.setDescription(jSONObject.getString("description"));
                }
                if (jSONObject.has("title")) {
                    miPushMessage.setTitle(jSONObject.getString("title"));
                }
                if (jSONObject.has("content")) {
                    miPushMessage.setContent(jSONObject.getString("content"));
                }
                if (jSONObject.has("passThrough")) {
                    miPushMessage.setPassThrough(jSONObject.getInt("passThrough"));
                }
                if (jSONObject.has("notifyType")) {
                    miPushMessage.setNotifyType(jSONObject.getInt("notifyType"));
                }
                if (jSONObject.has("messageType")) {
                    miPushMessage.setMessageType(jSONObject.getInt("messageType"));
                }
                if (jSONObject.has("alias")) {
                    miPushMessage.setAlias(jSONObject.getString("alias"));
                }
                if (jSONObject.has("topic")) {
                    miPushMessage.setTopic(jSONObject.getString("topic"));
                }
                if (jSONObject.has("user_account")) {
                    miPushMessage.setUserAccount(jSONObject.getString("user_account"));
                }
                if (jSONObject.has("notifyId")) {
                    miPushMessage.setNotifyId(jSONObject.getInt("notifyId"));
                }
                if (jSONObject.has("category")) {
                    miPushMessage.setCategory(jSONObject.getString("category"));
                }
                if (jSONObject.has("isNotified")) {
                    miPushMessage.setNotified(jSONObject.getBoolean("isNotified"));
                }
                if (jSONObject.has("extra")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("extra");
                    Iterator<String> keys = jSONObject2.keys();
                    HashMap hashMap = new HashMap();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject2.getString(next));
                    }
                    if (hashMap.size() > 0) {
                        miPushMessage.setExtra(hashMap);
                    }
                }
            } catch (Exception e) {
                b.d(e.toString());
            }
        }
        return miPushMessage;
    }

    public static void b(Context context, e eVar, String str) {
        ah.a(context).a(new j(str, context, eVar));
    }

    public static PushMessageReceiver a(Context context) {
        ResolveInfo resolveInfo;
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            if (queryBroadcastReceivers != null) {
                Iterator<ResolveInfo> it = queryBroadcastReceivers.iterator();
                while (it.hasNext()) {
                    resolveInfo = it.next();
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    if (activityInfo != null && activityInfo.packageName.equals(context.getPackageName())) {
                        break;
                    }
                }
            }
            resolveInfo = null;
            if (resolveInfo != null) {
                return (PushMessageReceiver) r.a(context, resolveInfo.activityInfo.name).newInstance();
            }
            return null;
        } catch (Exception e) {
            b.d(e.toString());
            return null;
        }
    }

    public static String a(Context context, e eVar) {
        return a(context, eVar, false);
    }

    public static synchronized String a(Context context, e eVar, boolean z) {
        synchronized (i.class) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
            if (z) {
                String string = sharedPreferences.getString("syncingToken", "");
                if (!TextUtils.isEmpty(string)) {
                    return string;
                }
            }
            String a2 = a(eVar);
            if (TextUtils.isEmpty(a2)) {
                return "";
            }
            return sharedPreferences.getString(a2, "");
        }
    }

    public static String a(e eVar) {
        int i = k.f14732a[eVar.ordinal()];
        if (i == 1) {
            return "hms_push_token";
        }
        if (i == 2) {
            return "fcm_push_token_v2";
        }
        if (i == 3) {
            return "cos_push_token";
        }
        if (i != 4) {
            return null;
        }
        return "ftos_push_token";
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
        if (r12 != 0) goto L_0x0051;
     */
    /* renamed from: a  reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashMap<java.lang.String, java.lang.String> m470a(android.content.Context r11, com.xiaomi.mipush.sdk.e r12) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int[] r1 = com.xiaomi.mipush.sdk.k.f14732a
            int r2 = r12.ordinal()
            r1 = r1[r2]
            java.lang.String r2 = "package_name"
            java.lang.String r3 = "token"
            java.lang.String r4 = "brand"
            java.lang.String r5 = "~"
            java.lang.String r6 = ":"
            r7 = 1
            r8 = 0
            if (r1 == r7) goto L_0x00a9
            r9 = 2
            java.lang.String r10 = "version"
            if (r1 == r9) goto L_0x007e
            r9 = 3
            if (r1 == r9) goto L_0x005e
            r9 = 4
            if (r1 == r9) goto L_0x002c
            goto L_0x00f7
        L_0x002c:
            com.xiaomi.push.s$a r1 = new com.xiaomi.push.s$a
            r1.<init>(r6, r5)
            com.xiaomi.mipush.sdk.ag r5 = com.xiaomi.mipush.sdk.ag.VIVO
            java.lang.String r5 = r5.name()
            com.xiaomi.push.s$a r1 = r1.a(r4, r5)
            java.lang.String r12 = a(r11, r12, r7)
            com.xiaomi.push.s$a r12 = r1.a(r3, r12)
            java.lang.String r11 = r11.getPackageName()
            com.xiaomi.push.s$a r11 = r12.a(r2, r11)
            int r12 = a()
            if (r12 == 0) goto L_0x0058
        L_0x0051:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.a(r10, r12)
        L_0x0058:
            java.lang.String r8 = r11.toString()
            goto L_0x00f7
        L_0x005e:
            com.xiaomi.push.s$a r1 = new com.xiaomi.push.s$a
            r1.<init>(r6, r5)
            com.xiaomi.mipush.sdk.ag r5 = com.xiaomi.mipush.sdk.ag.OPPO
            java.lang.String r5 = r5.name()
            com.xiaomi.push.s$a r1 = r1.a(r4, r5)
            java.lang.String r12 = a(r11, r12, r7)
            com.xiaomi.push.s$a r12 = r1.a(r3, r12)
            java.lang.String r11 = r11.getPackageName()
            com.xiaomi.push.s$a r11 = r12.a(r2, r11)
            goto L_0x0058
        L_0x007e:
            com.xiaomi.push.s$a r1 = new com.xiaomi.push.s$a
            r1.<init>(r6, r5)
            com.xiaomi.mipush.sdk.ag r5 = com.xiaomi.mipush.sdk.ag.FCM
            java.lang.String r5 = r5.name()
            com.xiaomi.push.s$a r1 = r1.a(r4, r5)
            r4 = 0
            java.lang.String r12 = a(r11, r12, r4)
            com.xiaomi.push.s$a r12 = r1.a(r3, r12)
            java.lang.String r11 = r11.getPackageName()
            com.xiaomi.push.s$a r11 = r12.a(r2, r11)
            int r12 = a()
            if (r12 == 0) goto L_0x00a5
        L_0x00a4:
            goto L_0x0051
        L_0x00a5:
            r12 = 50300(0xc47c, float:7.0485E-41)
            goto L_0x00a4
        L_0x00a9:
            android.content.pm.PackageManager r1 = r11.getPackageManager()     // Catch: Exception -> 0x00b8
            java.lang.String r9 = r11.getPackageName()     // Catch: Exception -> 0x00b8
            r10 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r8 = r1.getApplicationInfo(r9, r10)     // Catch: Exception -> 0x00b8
            goto L_0x00c0
        L_0x00b8:
            r1 = move-exception
            java.lang.String r1 = r1.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r1)
        L_0x00c0:
            if (r8 == 0) goto L_0x00cb
            android.os.Bundle r1 = r8.metaData
            java.lang.String r8 = "com.huawei.hms.client.appid"
            int r1 = r1.getInt(r8)
            goto L_0x00cc
        L_0x00cb:
            r1 = -1
        L_0x00cc:
            com.xiaomi.push.s$a r8 = new com.xiaomi.push.s$a
            r8.<init>(r6, r5)
            com.xiaomi.mipush.sdk.ag r5 = com.xiaomi.mipush.sdk.ag.HUAWEI
            java.lang.String r5 = r5.name()
            com.xiaomi.push.s$a r4 = r8.a(r4, r5)
            java.lang.String r12 = a(r11, r12, r7)
            com.xiaomi.push.s$a r12 = r4.a(r3, r12)
            java.lang.String r11 = r11.getPackageName()
            com.xiaomi.push.s$a r11 = r12.a(r2, r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "app_id"
            com.xiaomi.push.s$a r11 = r11.a(r1, r12)
            goto L_0x0058
        L_0x00f7:
            java.lang.String r11 = "RegInfo"
            r0.put(r11, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.i.m470a(android.content.Context, com.xiaomi.mipush.sdk.e):java.util.HashMap");
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m471a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        String a2 = a(e.ASSEMBLE_PUSH_HUAWEI);
        String a3 = a(e.ASSEMBLE_PUSH_FCM);
        if (!TextUtils.isEmpty(sharedPreferences.getString(a2, "")) && TextUtils.isEmpty(sharedPreferences.getString(a3, ""))) {
            ao.a(context).a(2, a2);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m472a(Context context, e eVar) {
        String a2 = a(eVar);
        if (!TextUtils.isEmpty(a2)) {
            p.a(context.getSharedPreferences("mipush_extra", 0).edit().putString(a2, ""));
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m473a(Context context, e eVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            int a2 = a(context, eVar, str);
            if (a2 != 0) {
                b.m410a("ASSEMBLE_PUSH : send token upload, check:" + a2);
                a(context, str);
                au a3 = l.a(eVar);
                if (a3 != null) {
                    ao.a(context).a((String) null, a3, eVar, "upload");
                    return;
                }
                return;
            }
            b.m410a("ASSEMBLE_PUSH : do not need to send token");
        }
    }

    private static synchronized void a(Context context, String str) {
        synchronized (i.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putString("syncingToken", str);
            edit.apply();
        }
    }

    public static void a(Intent intent) {
        Bundle extras;
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("pushMsg")) {
            intent.putExtra(PushMessageHelper.KEY_MESSAGE, a(extras.getString("pushMsg")));
        }
    }

    public static void a(String str, int i) {
        MiTinyDataClient.upload("hms_push_error", str, 1L, "error code = " + i);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m474a(Context context) {
        if (context == null) {
            return false;
        }
        return bg.b(context);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m475a(Context context, e eVar) {
        if (l.m478a(eVar) != null) {
            return az.a(context).a(l.m478a(eVar).a(), true);
        }
        return false;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m476a(e eVar) {
        return eVar == e.ASSEMBLE_PUSH_FTOS || eVar == e.ASSEMBLE_PUSH_FCM;
    }

    public static boolean a(iy iyVar, e eVar) {
        if (iyVar == null || iyVar.m853a() == null || iyVar.m853a().m820a() == null) {
            return false;
        }
        return (eVar == e.ASSEMBLE_PUSH_FCM ? "FCM" : "").equalsIgnoreCase(iyVar.m853a().m820a().get("assemble_push_type"));
    }

    public static byte[] a(Context context, iy iyVar, e eVar) {
        if (a(iyVar, eVar)) {
            return bl.m517a(a(context, eVar));
        }
        return null;
    }
}
