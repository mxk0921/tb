package com.xiaomi.push.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.RemoteViews;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.xiaomi.push.ah;
import com.xiaomi.push.bh;
import com.xiaomi.push.fd;
import com.xiaomi.push.fe;
import com.xiaomi.push.ff;
import com.xiaomi.push.fg;
import com.xiaomi.push.g;
import com.xiaomi.push.ic;
import com.xiaomi.push.ip;
import com.xiaomi.push.iy;
import com.xiaomi.push.j;
import com.xiaomi.push.s;
import com.xiaomi.push.service.av;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import tb.ya;
import tb.zk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class al {

    /* renamed from: a  reason: collision with root package name */
    public static long f15042a;

    /* renamed from: a  reason: collision with other field name */
    private static volatile ar f1547a;

    /* renamed from: a  reason: collision with other field name */
    private static final LinkedList<Pair<Integer, iy>> f1548a = new LinkedList<>();

    /* renamed from: a  reason: collision with other field name */
    private static ExecutorService f1549a = Executors.newCachedThreadPool();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a implements Callable<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        private Context f15043a;

        /* renamed from: a  reason: collision with other field name */
        private String f1550a;

        /* renamed from: a  reason: collision with other field name */
        private boolean f1551a;

        public a(String str, Context context, boolean z) {
            this.f15043a = context;
            this.f1550a = str;
            this.f1551a = z;
        }

        /* renamed from: a */
        public Bitmap call() {
            Bitmap bitmap = null;
            if (!TextUtils.isEmpty(this.f1550a)) {
                if (this.f1550a.startsWith("http")) {
                    av.b a2 = av.a(this.f15043a, this.f1550a, this.f1551a);
                    if (a2 != null) {
                        return a2.f1565a;
                    }
                } else {
                    bitmap = av.a(this.f15043a, this.f1550a);
                    if (bitmap != null) {
                        return bitmap;
                    }
                }
                com.xiaomi.channel.commonutils.logger.b.m410a("Failed get online picture/icon resource");
                return bitmap;
            }
            com.xiaomi.channel.commonutils.logger.b.m410a("Failed get online picture/icon resource cause picUrl is empty");
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        long f15044a = 0;

        /* renamed from: a  reason: collision with other field name */
        Notification f1552a;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class c {

        /* renamed from: a  reason: collision with other field name */
        public String f1553a;

        /* renamed from: a  reason: collision with root package name */
        public long f15045a = 0;

        /* renamed from: a  reason: collision with other field name */
        public boolean f1554a = false;
    }

    public static int a(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).getInt(str, Integer.MAX_VALUE);
    }

    private static int b(Context context, String str) {
        int a2 = a(context, str, "mipush_notification");
        int a3 = a(context, str, "mipush_small_notification");
        if (a2 <= 0) {
            a2 = a3 > 0 ? a3 : context.getApplicationInfo().icon;
        }
        return a2 == 0 ? context.getApplicationInfo().logo : a2;
    }

    private static int c(Map<String, String> map) {
        if (map == null) {
            return 0;
        }
        String str = map.get("notification_priority");
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            com.xiaomi.channel.commonutils.logger.b.c("priority=" + str);
            return Integer.parseInt(str);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.d("parsing notification priority error: " + e);
            return 0;
        }
    }

    public static boolean d(iy iyVar) {
        if (iyVar.a() == ic.Registration) {
            return true;
        }
        return false;
    }

    public static boolean e(iy iyVar) {
        if (m1019a(iyVar) || c(iyVar) || m1023b(iyVar)) {
            return true;
        }
        return false;
    }

    private static int a(Context context, String str, String str2) {
        if (str.equals(context.getPackageName())) {
            return context.getResources().getIdentifier(str2, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, str);
        }
        return 0;
    }

    private static int b(Map<String, String> map) {
        if (map == null) {
            return 3;
        }
        String str = map.get("channel_importance");
        if (TextUtils.isEmpty(str)) {
            return 3;
        }
        try {
            com.xiaomi.channel.commonutils.logger.b.c("importance=" + str);
            return Integer.parseInt(str);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.d("parsing channel importance error: " + e);
            return 3;
        }
    }

    public static void c(Context context, String str) {
        context.getSharedPreferences("pref_notify_type", 0).edit().remove(str).commit();
    }

    private static int a(Context context, String str, Map<String, String> map, int i) {
        ComponentName a2;
        Intent b2 = b(context, str, map, i);
        if (b2 == null || (a2 = m.a(context, b2)) == null) {
            return 0;
        }
        return a2.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.Intent b(android.content.Context r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.al.b(android.content.Context, java.lang.String, java.util.Map, int):android.content.Intent");
    }

    public static boolean c(iy iyVar) {
        ip a2 = iyVar.m853a();
        return a(a2) && a2.f1205b == 0 && !m1019a(iyVar);
    }

    private static int a(Map<String, String> map) {
        String str = map == null ? null : map.get("timeout");
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String b(iy iyVar) {
        return m1019a(iyVar) ? "E100002" : c(iyVar) ? "E100000" : m1023b(iyVar) ? "E100001" : d(iyVar) ? "E100003" : "";
    }

    private static Notification a(Notification notification) {
        Object a2 = bh.a(notification, "extraNotification");
        if (a2 != null) {
            bh.a(a2, "setCustomizedIcon", Boolean.TRUE);
        }
        return notification;
    }

    /* renamed from: b  reason: collision with other method in class */
    public static void m1021b(Context context, String str) {
        if (j.m869a(context) && f1547a != null && !TextUtils.isEmpty(str)) {
            f1547a.a(str);
        }
    }

    private static PendingIntent a(Context context, iy iyVar, String str, byte[] bArr, int i) {
        return a(context, iyVar, str, bArr, i, 0, a(context, iyVar, str));
    }

    public static void b(Context context, String str, int i) {
        context.getSharedPreferences("pref_notify_type", 0).edit().putInt(str, i).commit();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.app.PendingIntent a(android.content.Context r16, com.xiaomi.push.iy r17, java.lang.String r18, byte[] r19, int r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.al.a(android.content.Context, com.xiaomi.push.iy, java.lang.String, byte[], int, int, boolean):android.app.PendingIntent");
    }

    private static void b(Context context, String str, ff ffVar, Map<String, String> map) {
        Icon createWithResource;
        int a2;
        if (!j.m869a(context)) {
            String a3 = a(map, "fcm_icon_uri");
            String a4 = a(map, "fcm_icon_color");
            if (!TextUtils.isEmpty(a3) && !TextUtils.isEmpty(a4) && (a2 = a(context, str, a3)) > 0) {
                ffVar.setSmallIcon(a2);
                ffVar.m680a(a4);
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            createWithResource = Icon.createWithResource(str, ax.a(context, str));
            ffVar.setSmallIcon(createWithResource);
            return;
        }
        ffVar.setSmallIcon(b(context, str));
    }

    private static PendingIntent a(Context context, String str, iy iyVar, byte[] bArr, int i, int i2) {
        Map<String, String> a2 = iyVar.m853a().m820a();
        if (a2 == null) {
            return null;
        }
        boolean a3 = a(context, iyVar, str);
        if (a3) {
            return a(context, iyVar, str, bArr, i, i2, a3);
        }
        Intent a4 = m1014a(context, str, a2, i2);
        if (a4 == null) {
            return null;
        }
        return ya.c(context, 0, a4, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }

    /* renamed from: b  reason: collision with other method in class */
    public static boolean m1022b(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).contains(str);
    }

    public static ComponentName a(String str) {
        return new ComponentName(str, "com.xiaomi.mipush.sdk.NotificationClickedActivity");
    }

    /* renamed from: b  reason: collision with other method in class */
    public static boolean m1023b(iy iyVar) {
        ip a2 = iyVar.m853a();
        return a(a2) && a2.f1205b == 1 && !m1019a(iyVar);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static Intent m1014a(Context context, String str, Map<String, String> map, int i) {
        if (m1024b(map)) {
            return a(context, str, map, "cust_btn_" + i + "_ne", "cust_btn_" + i + "_iu", "cust_btn_" + i + "_ic", "cust_btn_" + i + "_wu");
        } else if (i == 1) {
            return a(context, str, map, "notification_style_button_left_notify_effect", "notification_style_button_left_intent_uri", "notification_style_button_left_intent_class", "notification_style_button_left_web_uri");
        } else {
            if (i == 2) {
                return a(context, str, map, "notification_style_button_mid_notify_effect", "notification_style_button_mid_intent_uri", "notification_style_button_mid_intent_class", "notification_style_button_mid_web_uri");
            }
            if (i == 3) {
                return a(context, str, map, "notification_style_button_right_notify_effect", "notification_style_button_right_intent_uri", "notification_style_button_right_intent_class", "notification_style_button_right_web_uri");
            }
            if (i != 4) {
                return null;
            }
            return a(context, str, map, "notification_colorful_button_notify_effect", "notification_colorful_button_intent_uri", "notification_colorful_button_intent_class", "notification_colorful_button_web_uri");
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    private static boolean m1024b(Map<String, String> map) {
        if (map != null) {
            return "6".equals(map.get("notification_style_type"));
        }
        com.xiaomi.channel.commonutils.logger.b.m410a("meta extra is null");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.Intent a(android.content.Context r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.al.a(android.content.Context, java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.lang.String, java.lang.String):android.content.Intent");
    }

    private static Bitmap a(Context context, int i) {
        return a(context.getResources().getDrawable(i));
    }

    private static Bitmap a(Context context, String str, boolean z) {
        Future submit = f1549a.submit(new a(str, context, z));
        try {
            try {
                Bitmap bitmap = (Bitmap) submit.get(180L, TimeUnit.SECONDS);
                return bitmap == null ? bitmap : bitmap;
            } finally {
                submit.cancel(true);
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            submit.cancel(true);
            return null;
        }
    }

    public static Bitmap a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int i = 1;
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 1;
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight > 0) {
            i = intrinsicHeight;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private static RemoteViews a(Context context, iy iyVar, byte[] bArr) {
        ip a2 = iyVar.m853a();
        String a3 = a(iyVar);
        if (!(a2 == null || a2.m820a() == null)) {
            Map<String, String> a4 = a2.m820a();
            String str = a4.get("layout_name");
            String str2 = a4.get("layout_value");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                try {
                    Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(a3);
                    int identifier = resourcesForApplication.getIdentifier(str, "layout", a3);
                    if (identifier == 0) {
                        return null;
                    }
                    RemoteViews remoteViews = new RemoteViews(a3, identifier);
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        if (jSONObject.has("text")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("text");
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                String string = jSONObject2.getString(next);
                                int identifier2 = resourcesForApplication.getIdentifier(next, "id", a3);
                                if (identifier2 > 0) {
                                    remoteViews.setTextViewText(identifier2, string);
                                }
                            }
                        }
                        if (jSONObject.has("image")) {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("image");
                            Iterator<String> keys2 = jSONObject3.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                String string2 = jSONObject3.getString(next2);
                                int identifier3 = resourcesForApplication.getIdentifier(next2, "id", a3);
                                int identifier4 = resourcesForApplication.getIdentifier(string2, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, a3);
                                if (identifier3 > 0) {
                                    remoteViews.setImageViewResource(identifier3, identifier4);
                                }
                            }
                        }
                        if (jSONObject.has("time")) {
                            JSONObject jSONObject4 = jSONObject.getJSONObject("time");
                            Iterator<String> keys3 = jSONObject4.keys();
                            while (keys3.hasNext()) {
                                String next3 = keys3.next();
                                String string3 = jSONObject4.getString(next3);
                                if (string3.length() == 0) {
                                    string3 = "yy-MM-dd hh:mm";
                                }
                                int identifier5 = resourcesForApplication.getIdentifier(next3, "id", a3);
                                if (identifier5 > 0) {
                                    remoteViews.setTextViewText(identifier5, new SimpleDateFormat(string3).format(new Date(System.currentTimeMillis())));
                                }
                            }
                        }
                        return remoteViews;
                    } catch (JSONException e) {
                        com.xiaomi.channel.commonutils.logger.b.a(e);
                        return null;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    com.xiaomi.channel.commonutils.logger.b.a(e2);
                }
            }
        }
        return null;
    }

    private static ff a(Context context, iy iyVar, byte[] bArr, String str, int i) {
        PendingIntent a2;
        String a3 = a(iyVar);
        Map<String, String> a4 = iyVar.m853a().m820a();
        String str2 = a4.get("notification_style_type");
        ff a5 = (!j.m869a(context) || f1547a == null) ? null : f1547a.a(context, i, a3, a4);
        if (a5 != null) {
            a5.a(a4);
            return a5;
        } else if ("2".equals(str2)) {
            ff ffVar = new ff(context);
            Bitmap a6 = TextUtils.isEmpty(a4.get("notification_bigPic_uri")) ? null : a(context, a4.get("notification_bigPic_uri"), false);
            if (a6 == null) {
                com.xiaomi.channel.commonutils.logger.b.m410a("can not get big picture.");
                return ffVar;
            }
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle(ffVar);
            bigPictureStyle.bigPicture(a6);
            bigPictureStyle.setSummaryText(str);
            bigPictureStyle.bigLargeIcon((Bitmap) null);
            ffVar.setStyle(bigPictureStyle);
            return ffVar;
        } else if ("1".equals(str2)) {
            ff ffVar2 = new ff(context);
            ffVar2.setStyle(new Notification.BigTextStyle().bigText(str));
            return ffVar2;
        } else if ("4".equals(str2) && j.m868a()) {
            fe feVar = new fe(context, a3);
            if (!TextUtils.isEmpty(a4.get("notification_banner_image_uri"))) {
                feVar.mo678a(a(context, a4.get("notification_banner_image_uri"), false));
            }
            if (!TextUtils.isEmpty(a4.get("notification_banner_icon_uri"))) {
                feVar.b(a(context, a4.get("notification_banner_icon_uri"), false));
            }
            feVar.a(a4);
            return feVar;
        } else if (!"3".equals(str2) || !j.m868a()) {
            return new ff(context);
        } else {
            fg fgVar = new fg(context, i, a3);
            if (!TextUtils.isEmpty(a4.get("notification_colorful_button_text")) && (a2 = a(context, a3, iyVar, bArr, i, 4)) != null) {
                fgVar.a(a4.get("notification_colorful_button_text"), a2).a(a4.get("notification_colorful_button_bg_color"));
            }
            if (!TextUtils.isEmpty(a4.get("notification_colorful_bg_color"))) {
                fgVar.b(a4.get("notification_colorful_bg_color"));
            } else if (!TextUtils.isEmpty(a4.get("notification_colorful_bg_image_uri"))) {
                fgVar.mo678a(a(context, a4.get("notification_colorful_bg_image_uri"), false));
            }
            fgVar.a(a4);
            return fgVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0290 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0282  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.xiaomi.push.service.al.b a(android.content.Context r31, com.xiaomi.push.iy r32, byte[] r33, android.widget.RemoteViews r34, android.app.PendingIntent r35, int r36) {
        /*
            Method dump skipped, instructions count: 1151
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.al.a(android.content.Context, com.xiaomi.push.iy, byte[], android.widget.RemoteViews, android.app.PendingIntent, int):com.xiaomi.push.service.al$b");
    }

    /* renamed from: a  reason: collision with other method in class */
    public static c m1015a(Context context, iy iyVar, byte[] bArr) {
        Map<String, String> map;
        int i;
        String str;
        c cVar = new c();
        g.b a2 = g.a(context, a(iyVar), true);
        ip a3 = iyVar.m853a();
        String str2 = null;
        if (a3 != null) {
            i = a3.c();
            map = a3.m820a();
        } else {
            i = 0;
            map = null;
        }
        int b2 = s.b(a(iyVar), i);
        if (j.m869a(context) && a2 == g.b.NOT_ALLOWED) {
            if (a3 != null) {
                fd.a(context.getApplicationContext()).a(iyVar.b(), b(iyVar), a3.m819a(), "10:" + a(iyVar));
            }
            str = "Do not notify because user block " + a(iyVar) + "‘s notification";
        } else if (!j.m869a(context) || f1547a == null || !f1547a.m1025a(context, b2, a(iyVar), map)) {
            RemoteViews a4 = a(context, iyVar, bArr);
            PendingIntent a5 = a(context, iyVar, iyVar.b(), bArr, b2);
            if (a5 == null) {
                if (a3 != null) {
                    fd.a(context.getApplicationContext()).a(iyVar.b(), b(iyVar), a3.m819a(), "11");
                }
                str = "The click PendingIntent is null. ";
            } else {
                b a6 = a(context, iyVar, bArr, a4, a5, b2);
                cVar.f15045a = a6.f15044a;
                cVar.f1553a = a(iyVar);
                Notification notification = a6.f1552a;
                if (j.m868a()) {
                    if (!TextUtils.isEmpty(a3.m819a())) {
                        notification.extras.putString(Constant.PROP_MESSAGE_ID, a3.m819a());
                    }
                    notification.extras.putString("local_paid", iyVar.m854a());
                    ax.a(map, notification.extras, "msg_busi_type");
                    ax.a(map, notification.extras, "disable_notification_flags");
                    String str3 = a3.m825b() == null ? null : a3.m825b().get("score_info");
                    if (!TextUtils.isEmpty(str3)) {
                        notification.extras.putString("score_info", str3);
                    }
                    notification.extras.putString("pushUid", a(a3.f1203a, "n_stats_expose"));
                    notification.extras.putString("eventMessageType", String.valueOf(c(iyVar) ? 1000 : m1019a(iyVar) ? 3000 : -1));
                    notification.extras.putString(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE, a(iyVar));
                }
                if (a3.m820a() != null) {
                    str2 = a3.m820a().get("message_count");
                }
                if (j.m868a() && str2 != null) {
                    try {
                        ax.a(notification, Integer.parseInt(str2));
                    } catch (NumberFormatException e) {
                        fd.a(context.getApplicationContext()).b(iyVar.b(), b(iyVar), a3.m819a(), "8");
                        com.xiaomi.channel.commonutils.logger.b.d("fail to set message count. " + e);
                    }
                }
                String a7 = a(iyVar);
                ax.m1041a(notification, a7);
                aw a8 = aw.a(context, a7);
                if (j.m869a(context) && f1547a != null) {
                    f1547a.a(iyVar, a3.m820a(), b2, notification);
                }
                if (!j.m869a(context) || f1547a == null || !f1547a.a(a3.m820a(), b2, notification)) {
                    a8.a(b2, notification);
                    cVar.f1554a = true;
                    com.xiaomi.channel.commonutils.logger.b.m410a("notification: " + a3.m819a() + " is notifyied");
                } else {
                    com.xiaomi.channel.commonutils.logger.b.b("consume this notificaiton by agent");
                }
                if (j.m868a() && j.m869a(context)) {
                    at.a().a(context, b2, notification);
                    cd.m1067a(context, a7, b2, a3.m819a(), notification);
                }
                if (m1019a(iyVar)) {
                    fd.a(context.getApplicationContext()).a(iyVar.b(), b(iyVar), a3.m819a(), 3002, null);
                }
                if (c(iyVar)) {
                    fd.a(context.getApplicationContext()).a(iyVar.b(), b(iyVar), a3.m819a(), 1002, null);
                }
                if (Build.VERSION.SDK_INT < 26) {
                    String a9 = a3.m819a();
                    ah a10 = ah.a(context);
                    int a11 = a(a3.m820a());
                    if (a11 > 0 && !TextUtils.isEmpty(a9)) {
                        String str4 = "n_timeout_" + a9;
                        a10.m483a(str4);
                        a10.b(new am(str4, a8, b2), a11);
                    }
                }
                Pair<Integer, iy> pair = new Pair<>(Integer.valueOf(b2), iyVar);
                LinkedList<Pair<Integer, iy>> linkedList = f1548a;
                synchronized (linkedList) {
                    try {
                        linkedList.add(pair);
                        if (linkedList.size() > 100) {
                            linkedList.remove();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return cVar;
            }
        } else {
            if (a3 != null) {
                fd.a(context.getApplicationContext()).a(iyVar.b(), b(iyVar), a3.m819a(), "14:" + a(iyVar));
            }
            str = "Do not notify because card notification is canceled or sequence incorrect";
        }
        com.xiaomi.channel.commonutils.logger.b.m410a(str);
        return cVar;
    }

    private static String a(Context context, String str, Map<String, String> map) {
        return (map == null || TextUtils.isEmpty(map.get("channel_name"))) ? g.m706b(context, str) : map.get("channel_name");
    }

    public static String a(iy iyVar) {
        ip a2;
        if (!(!"com.xiaomi.xmsf".equals(iyVar.f1295b) || (a2 = iyVar.m853a()) == null || a2.m820a() == null)) {
            String str = a2.m820a().get("miui_package_name");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return iyVar.f1295b;
    }

    public static String a(Map<String, String> map, int i) {
        String str;
        if (i == 0) {
            str = "notify_effect";
        } else if (m1024b(map)) {
            str = "cust_btn_" + i + "_ne";
        } else {
            str = i == 1 ? "notification_style_button_left_notify_effect" : i == 2 ? "notification_style_button_mid_notify_effect" : i == 3 ? "notification_style_button_right_notify_effect" : i == 4 ? "notification_colorful_button_notify_effect" : null;
        }
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    private static String a(Map<String, String> map, String str) {
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    private static void a(Context context, Intent intent, iy iyVar, ip ipVar, String str, int i) {
        if (iyVar != null && ipVar != null && !TextUtils.isEmpty(str)) {
            String a2 = a(ipVar.m820a(), i);
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            if (bj.f15074a.equals(a2) || bj.b.equals(a2) || bj.c.equals(a2)) {
                intent.putExtra("messageId", str);
                intent.putExtra("local_paid", iyVar.f1291a);
                if (!TextUtils.isEmpty(iyVar.f1295b)) {
                    intent.putExtra(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE, iyVar.f1295b);
                }
                intent.putExtra("job_key", a(ipVar.m820a(), "jobkey"));
                intent.putExtra(i + "_target_component", a(context, iyVar.f1295b, ipVar.m820a(), i));
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m1016a(Context context, String str) {
        a(context, str, -1);
    }

    public static void a(Context context, String str, int i) {
        a(context, str, i, -1);
    }

    public static void a(Context context, String str, int i, int i2) {
        int i3;
        if (context != null && !TextUtils.isEmpty(str) && i >= -1) {
            aw a2 = aw.a(context, str);
            List<StatusBarNotification> b2 = a2.m1040b();
            if (!s.a(b2)) {
                LinkedList linkedList = new LinkedList();
                boolean z = false;
                if (i == -1) {
                    i3 = 0;
                    z = true;
                } else {
                    i3 = ((str.hashCode() / 10) * 10) + i;
                }
                Iterator<StatusBarNotification> it = b2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    StatusBarNotification next = it.next();
                    if (!TextUtils.isEmpty(String.valueOf(next.getId()))) {
                        int id = next.getId();
                        if (z) {
                            linkedList.add(next);
                            a2.a(id);
                        } else if (i3 == id) {
                            d.a(context, next, i2);
                            linkedList.add(next);
                            a2.a(id);
                            break;
                        }
                    }
                }
                a(context, linkedList);
            }
        }
    }

    private static void a(Context context, String str, ff ffVar, Map<String, String> map) {
        int a2 = a(context, str, "mipush_small_notification");
        int a3 = a(context, str, "mipush_notification");
        if (!j.m869a(context)) {
            if (a2 > 0) {
                ffVar.setSmallIcon(a2);
            } else {
                b(context, str, ffVar, map);
            }
            if (a3 <= 0) {
                return;
            }
        } else if (a2 <= 0 || a3 <= 0) {
            b(context, str, ffVar, map);
            return;
        } else {
            ffVar.setSmallIcon(a2);
        }
        ffVar.setLargeIcon(a(context, a3));
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (!(context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3))) {
            aw a2 = aw.a(context, str);
            List<StatusBarNotification> b2 = a2.m1040b();
            if (!s.a(b2)) {
                LinkedList linkedList = new LinkedList();
                for (StatusBarNotification statusBarNotification : b2) {
                    Notification notification = statusBarNotification.getNotification();
                    if (notification != null && !TextUtils.isEmpty(String.valueOf(statusBarNotification.getId()))) {
                        int id = statusBarNotification.getId();
                        String a3 = ax.a(notification);
                        String b3 = ax.b(notification);
                        if (!TextUtils.isEmpty(a3) && !TextUtils.isEmpty(b3) && a(a3, str2) && a(b3, str3)) {
                            linkedList.add(statusBarNotification);
                            a2.a(id);
                        }
                    }
                }
                a(context, linkedList);
            }
        }
    }

    public static void a(Context context, LinkedList<? extends Object> linkedList) {
        if (linkedList != null && linkedList.size() > 0) {
            ca.a(context, "category_clear_notification", "clear_notification", linkedList.size(), "");
        }
    }

    private static void a(Intent intent) {
        if (intent != null) {
            intent.setFlags(intent.getFlags() & (-196));
        }
    }

    private static void a(ff ffVar, Context context, String str, iy iyVar, byte[] bArr, int i) {
        PendingIntent a2;
        PendingIntent a3;
        PendingIntent a4;
        PendingIntent a5;
        Map<String, String> a6 = iyVar.m853a().m820a();
        if (!(TextUtils.equals("3", a6.get("notification_style_type")) || TextUtils.equals("4", a6.get("notification_style_type")))) {
            if (m1024b(a6)) {
                for (int i2 = 1; i2 <= 3; i2++) {
                    String str2 = a6.get("cust_btn_" + i2 + "_n");
                    if (!TextUtils.isEmpty(str2) && (a5 = a(context, str, iyVar, bArr, i, i2)) != null) {
                        ffVar.addAction(0, str2, a5);
                    }
                }
                return;
            }
            if (!TextUtils.isEmpty(a6.get("notification_style_button_left_name")) && (a4 = a(context, str, iyVar, bArr, i, 1)) != null) {
                ffVar.addAction(0, a6.get("notification_style_button_left_name"), a4);
            }
            if (!TextUtils.isEmpty(a6.get("notification_style_button_mid_name")) && (a3 = a(context, str, iyVar, bArr, i, 2)) != null) {
                ffVar.addAction(0, a6.get("notification_style_button_mid_name"), a3);
            }
            if (!(TextUtils.isEmpty(a6.get("notification_style_button_right_name")) || (a2 = a(context, str, iyVar, bArr, i, 3)) == null)) {
                ffVar.addAction(0, a6.get("notification_style_button_right_name"), a2);
            }
        }
    }

    private static boolean a(Context context, iy iyVar, String str) {
        if (iyVar != null && iyVar.m853a() != null && iyVar.m853a().m820a() != null && !TextUtils.isEmpty(str)) {
            return Boolean.parseBoolean(iyVar.m853a().m820a().get("use_clicked_activity")) && m.a(context, a(str));
        }
        com.xiaomi.channel.commonutils.logger.b.m410a("should clicked activity params are null.");
        return false;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m1017a(Context context, String str) {
        return g.m707b(context, str);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m1018a(Context context, String str, boolean z) {
        return j.m868a() && !z && m1017a(context, str);
    }

    private static boolean a(ip ipVar) {
        if (ipVar == null) {
            return false;
        }
        String a2 = ipVar.m819a();
        return !TextUtils.isEmpty(a2) && a2.length() == 22 && "satuigmo".indexOf(a2.charAt(0)) >= 0;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m1019a(iy iyVar) {
        ip a2 = iyVar.m853a();
        return a(a2) && a2.l();
    }

    private static boolean a(String str, String str2) {
        return TextUtils.isEmpty(str) || str2.contains(str);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m1020a(Map<String, String> map) {
        if (map == null || !map.containsKey("notify_foreground")) {
            return true;
        }
        return "1".equals(map.get("notify_foreground"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x0074;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x0074;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String[] a(android.content.Context r3, com.xiaomi.push.ip r4) {
        /*
            java.lang.String r0 = r4.m827c()
            java.lang.String r1 = r4.d()
            java.util.Map r4 = r4.m820a()
            if (r4 == 0) goto L_0x0075
            android.content.res.Resources r2 = r3.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = (float) r2
            float r2 = r2 / r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            java.lang.Float r3 = java.lang.Float.valueOf(r2)
            int r3 = r3.intValue()
            r2 = 320(0x140, float:4.48E-43)
            if (r3 > r2) goto L_0x0052
            java.lang.String r3 = "title_short"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x0043
            r0 = r3
        L_0x0043:
            java.lang.String r3 = "description_short"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0075
            goto L_0x0074
        L_0x0052:
            r2 = 360(0x168, float:5.04E-43)
            if (r3 <= r2) goto L_0x0075
            java.lang.String r3 = "title_long"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x0066
            r0 = r3
        L_0x0066:
            java.lang.String r3 = "description_long"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0075
        L_0x0074:
            r1 = r3
        L_0x0075:
            java.lang.String[] r3 = new java.lang.String[]{r0, r1}
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.al.a(android.content.Context, com.xiaomi.push.ip):java.lang.String[]");
    }
}
