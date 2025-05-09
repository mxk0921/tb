package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.aa;
import com.xiaomi.push.i;
import com.xiaomi.push.m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private static u f15131a;

    /* renamed from: a  reason: collision with other field name */
    private static a f1659a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface a {
        void a();
    }

    private static int a(Context context) {
        return context.getSharedPreferences("mipush_account", 0).getInt("enc_req_fail_count", 0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static synchronized u m1097a(Context context) {
        synchronized (v.class) {
            try {
                u uVar = f15131a;
                if (uVar != null) {
                    return uVar;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_account", 0);
                String string = sharedPreferences.getString("uuid", null);
                String string2 = sharedPreferences.getString("token", null);
                String string3 = sharedPreferences.getString(Baggage.Amnet.CFG_SSL, null);
                String string4 = sharedPreferences.getString("app_id", null);
                String string5 = sharedPreferences.getString("app_token", null);
                String string6 = sharedPreferences.getString("package_name", null);
                String string7 = sharedPreferences.getString(PushConstants.DEVICE_ID, null);
                int i = sharedPreferences.getInt("env_type", 1);
                if (!TextUtils.isEmpty(string7) && i.a(string7)) {
                    string7 = i.g(context);
                    sharedPreferences.edit().putString(PushConstants.DEVICE_ID, string7).commit();
                }
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                    return null;
                }
                String g = i.g(context);
                if (!"com.xiaomi.xmsf".equals(context.getPackageName()) && !TextUtils.isEmpty(g) && !TextUtils.isEmpty(string7) && !string7.equals(g)) {
                    b.m410a("read_phone_state permission changes.");
                }
                u uVar2 = new u(string, string2, string3, string4, string5, string6, i);
                f15131a = uVar2;
                return uVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:116|4|(2:8|(24:10|14|(1:16)(1:17)|18|(1:20)(1:21)|22|(1:24)(1:25)|26|114|27|30|(1:32)(1:33)|34|(6:36|(1:38)|39|(1:43)|44|(1:46))|47|(1:49)|50|(6:53|112|54|123|122|51)|121|57|(3:62|64|(2:66|67)(9:(1:69)|110|70|(2:77|(4:118|79|120|(7:81|(1:83)|88|89|90|91|92)(6:95|96|(1:104)|105|106|107)))|100|(2:102|104)|105|106|107))|63|64|(0)(0)))|13|14|(0)(0)|18|(0)(0)|22|(0)(0)|26|114|27|30|(0)(0)|34|(0)|47|(0)|50|(1:51)|121|57|(4:59|62|64|(0)(0))|63|64|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
        com.xiaomi.channel.commonutils.logger.b.a(r0);
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0321 A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:4:0x0007, B:6:0x001c, B:8:0x0024, B:10:0x003b, B:14:0x004a, B:18:0x005d, B:22:0x0069, B:26:0x0075, B:27:0x007f, B:29:0x008b, B:32:0x0093, B:34:0x009c, B:36:0x00c7, B:38:0x00d3, B:39:0x00e3, B:41:0x00ed, B:43:0x00f3, B:44:0x0107, B:46:0x010d, B:47:0x0112, B:49:0x0136, B:50:0x0140, B:51:0x0179, B:53:0x017f, B:54:0x0186, B:56:0x0195, B:57:0x01c6, B:59:0x01e7, B:62:0x01ee, B:64:0x0206, B:70:0x0215, B:73:0x021c, B:75:0x0233, B:77:0x0239, B:97:0x02f6, B:98:0x0308, B:99:0x030c, B:102:0x0321, B:104:0x0327, B:105:0x032f), top: B:116:0x0007, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093 A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:4:0x0007, B:6:0x001c, B:8:0x0024, B:10:0x003b, B:14:0x004a, B:18:0x005d, B:22:0x0069, B:26:0x0075, B:27:0x007f, B:29:0x008b, B:32:0x0093, B:34:0x009c, B:36:0x00c7, B:38:0x00d3, B:39:0x00e3, B:41:0x00ed, B:43:0x00f3, B:44:0x0107, B:46:0x010d, B:47:0x0112, B:49:0x0136, B:50:0x0140, B:51:0x0179, B:53:0x017f, B:54:0x0186, B:56:0x0195, B:57:0x01c6, B:59:0x01e7, B:62:0x01ee, B:64:0x0206, B:70:0x0215, B:73:0x021c, B:75:0x0233, B:77:0x0239, B:97:0x02f6, B:98:0x0308, B:99:0x030c, B:102:0x0321, B:104:0x0327, B:105:0x032f), top: B:116:0x0007, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7 A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:4:0x0007, B:6:0x001c, B:8:0x0024, B:10:0x003b, B:14:0x004a, B:18:0x005d, B:22:0x0069, B:26:0x0075, B:27:0x007f, B:29:0x008b, B:32:0x0093, B:34:0x009c, B:36:0x00c7, B:38:0x00d3, B:39:0x00e3, B:41:0x00ed, B:43:0x00f3, B:44:0x0107, B:46:0x010d, B:47:0x0112, B:49:0x0136, B:50:0x0140, B:51:0x0179, B:53:0x017f, B:54:0x0186, B:56:0x0195, B:57:0x01c6, B:59:0x01e7, B:62:0x01ee, B:64:0x0206, B:70:0x0215, B:73:0x021c, B:75:0x0233, B:77:0x0239, B:97:0x02f6, B:98:0x0308, B:99:0x030c, B:102:0x0321, B:104:0x0327, B:105:0x032f), top: B:116:0x0007, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0136 A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:4:0x0007, B:6:0x001c, B:8:0x0024, B:10:0x003b, B:14:0x004a, B:18:0x005d, B:22:0x0069, B:26:0x0075, B:27:0x007f, B:29:0x008b, B:32:0x0093, B:34:0x009c, B:36:0x00c7, B:38:0x00d3, B:39:0x00e3, B:41:0x00ed, B:43:0x00f3, B:44:0x0107, B:46:0x010d, B:47:0x0112, B:49:0x0136, B:50:0x0140, B:51:0x0179, B:53:0x017f, B:54:0x0186, B:56:0x0195, B:57:0x01c6, B:59:0x01e7, B:62:0x01ee, B:64:0x0206, B:70:0x0215, B:73:0x021c, B:75:0x0233, B:77:0x0239, B:97:0x02f6, B:98:0x0308, B:99:0x030c, B:102:0x0321, B:104:0x0327, B:105:0x032f), top: B:116:0x0007, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017f A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #3 {all -> 0x0046, blocks: (B:4:0x0007, B:6:0x001c, B:8:0x0024, B:10:0x003b, B:14:0x004a, B:18:0x005d, B:22:0x0069, B:26:0x0075, B:27:0x007f, B:29:0x008b, B:32:0x0093, B:34:0x009c, B:36:0x00c7, B:38:0x00d3, B:39:0x00e3, B:41:0x00ed, B:43:0x00f3, B:44:0x0107, B:46:0x010d, B:47:0x0112, B:49:0x0136, B:50:0x0140, B:51:0x0179, B:53:0x017f, B:54:0x0186, B:56:0x0195, B:57:0x01c6, B:59:0x01e7, B:62:0x01ee, B:64:0x0206, B:70:0x0215, B:73:0x021c, B:75:0x0233, B:77:0x0239, B:97:0x02f6, B:98:0x0308, B:99:0x030c, B:102:0x0321, B:104:0x0327, B:105:0x032f), top: B:116:0x0007, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0210 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized com.xiaomi.push.service.u a(android.content.Context r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.v.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String):com.xiaomi.push.service.u");
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m1098a(Context context) {
        u a2 = m1097a(context);
        if (a2 != null && !TextUtils.isEmpty(a2.f1658a)) {
            String[] split = a2.f1658a.split("@");
            if (split.length > 0) {
                return split[0];
            }
        }
        return null;
    }

    private static String a(Context context, boolean z) {
        String str;
        String a2 = com.xiaomi.push.service.a.a(context).a();
        String str2 = z ? "/pass/v2/register/encrypt" : "/pass/v2/register";
        if (aa.b()) {
            str = "http://10.38.162.35:9085";
        } else if (!m.China.name().equals(a2)) {
            return null;
        } else {
            str = "https://cn.register.xmpush.xiaomi.com";
        }
        return str.concat(str2);
    }

    public static void a() {
        a aVar = f1659a;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m1099a(Context context) {
        context.getSharedPreferences("mipush_account", 0).edit().clear().commit();
        f15131a = null;
        a();
    }

    private static void a(Context context, int i) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_account", 0).edit();
        edit.putInt("enc_req_fail_count", i);
        edit.commit();
    }

    public static void a(Context context, u uVar) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_account", 0).edit();
        edit.putString("uuid", uVar.f1658a);
        edit.putString(Baggage.Amnet.CFG_SSL, uVar.c);
        edit.putString("token", uVar.b);
        edit.putString("app_id", uVar.d);
        edit.putString("package_name", uVar.f);
        edit.putString("app_token", uVar.e);
        edit.putString(PushConstants.DEVICE_ID, i.g(context));
        edit.putInt("env_type", uVar.f15130a);
        edit.commit();
        a();
    }

    public static void a(a aVar) {
        f1659a = aVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m1100a(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }
}
