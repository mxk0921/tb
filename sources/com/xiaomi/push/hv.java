package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.xiaomi.channel.commonutils.logger.b;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hv {

    /* renamed from: a  reason: collision with other field name */
    private static ak f1113a = new ak(true);

    /* renamed from: a  reason: collision with root package name */
    private static volatile int f14938a = -1;

    /* renamed from: a  reason: collision with other field name */
    private static long f1112a = System.currentTimeMillis();

    /* renamed from: a  reason: collision with other field name */
    private static final Object f1115a = new Object();

    /* renamed from: a  reason: collision with other field name */
    private static List<a> f1117a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a  reason: collision with other field name */
    private static String f1116a = "";

    /* renamed from: a  reason: collision with other field name */
    private static com.xiaomi.push.providers.a f1114a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f14939a;

        /* renamed from: a  reason: collision with other field name */
        public long f1118a;

        /* renamed from: a  reason: collision with other field name */
        public String f1119a;
        public int b;

        /* renamed from: b  reason: collision with other field name */
        public long f1120b;

        /* renamed from: b  reason: collision with other field name */
        public String f1121b;

        public a(String str, long j, int i, int i2, String str2, long j2) {
            this.f1119a = str;
            this.f1118a = j;
            this.f14939a = i;
            this.b = i2;
            this.f1121b = str2;
            this.f1120b = j2;
        }

        public boolean a(a aVar) {
            if (!TextUtils.equals(aVar.f1119a, this.f1119a) || !TextUtils.equals(aVar.f1121b, this.f1121b) || aVar.f14939a != this.f14939a || aVar.b != this.b || Math.abs(aVar.f1118a - this.f1118a) > 5000) {
                return false;
            }
            return true;
        }
    }

    public static int a(Context context) {
        if (f14938a == -1) {
            f14938a = b(context);
        }
        return f14938a;
    }

    private static int b(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return -1;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return -1;
            }
            return activeNetworkInfo.getType();
        } catch (Exception unused) {
            return -1;
        }
    }

    public static int a(String str) {
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes().length;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, List<a> list) {
        try {
            synchronized (com.xiaomi.push.providers.a.f1485a) {
                SQLiteDatabase writableDatabase = m771a(context).getWritableDatabase();
                writableDatabase.beginTransaction();
                for (a aVar : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("package_name", aVar.f1119a);
                    contentValues.put("message_ts", Long.valueOf(aVar.f1118a));
                    contentValues.put("network_type", Integer.valueOf(aVar.f14939a));
                    contentValues.put("bytes", Long.valueOf(aVar.f1120b));
                    contentValues.put("rcv", Integer.valueOf(aVar.b));
                    contentValues.put("imsi", aVar.f1121b);
                    writableDatabase.insert(Configuration.LOG_TYPE_TRAFFIC, null, contentValues);
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
        } catch (Throwable th) {
            b.a(th);
        }
    }

    private static long a(int i, long j, boolean z, long j2, boolean z2) {
        if (z && z2) {
            long j3 = f1112a;
            f1112a = j2;
            if (j2 - j3 > 30000 && j > 1024) {
                return j * 2;
            }
        }
        return (j * (i == 0 ? 13 : 11)) / 10;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static com.xiaomi.push.providers.a m771a(Context context) {
        com.xiaomi.push.providers.a aVar = f1114a;
        if (aVar != null) {
            return aVar;
        }
        com.xiaomi.push.providers.a aVar2 = new com.xiaomi.push.providers.a(context);
        f1114a = aVar2;
        return aVar2;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static synchronized String m772a(Context context) {
        synchronized (hv.class) {
            if (TextUtils.isEmpty(f1116a)) {
                return "";
            }
            return f1116a;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m773a(Context context) {
        f14938a = b(context);
    }

    private static void a(Context context, String str, long j, boolean z, long j2) {
        int a2;
        boolean isEmpty;
        if (context != null && !TextUtils.isEmpty(str) && "com.xiaomi.xmsf".equals(context.getPackageName()) && !"com.xiaomi.xmsf".equals(str) && -1 != (a2 = a(context))) {
            synchronized (f1115a) {
                try {
                    isEmpty = f1117a.isEmpty();
                    a(new a(str, j2, a2, z ? 1 : 0, a2 == 0 ? m772a(context) : "", j));
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (isEmpty) {
                f1113a.a(new hw(context), 5000L);
            }
        }
    }

    public static void a(Context context, String str, long j, boolean z, boolean z2, long j2) {
        a(context, str, a(a(context), j, z, j2, z2), z, j2);
    }

    private static void a(a aVar) {
        for (a aVar2 : f1117a) {
            if (aVar2.a(aVar)) {
                aVar2.f1120b += aVar.f1120b;
                return;
            }
        }
        f1117a.add(aVar);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static synchronized void m774a(String str) {
        synchronized (hv.class) {
            if (!j.m874d() && !TextUtils.isEmpty(str)) {
                f1116a = str;
            }
        }
    }
}
