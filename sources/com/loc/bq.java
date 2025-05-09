package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.alipay.mobile.common.logging.api.LogContext;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.pg1;
import tb.vu3;
import tb.xxl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class bq {

    /* renamed from: a  reason: collision with root package name */
    public static volatile ConcurrentHashMap<String, c> f5599a = new ConcurrentHashMap<>(8);
    public static volatile List<String> b = Collections.synchronizedList(new ArrayList(8));
    private static volatile ConcurrentHashMap<String, b> c = new ConcurrentHashMap<>(8);
    private static Random d = new Random();
    private static ConcurrentHashMap<String, String> e = new ConcurrentHashMap<>(8);
    private static List<bz> f = Collections.synchronizedList(new ArrayList(16));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f5600a;
        int b;
        double c;

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        bu f5601a;
        long b;

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        Map<String, List<a>> f5602a;
        Map<String, String> b;

        private c() {
            this.f5602a = new HashMap(8);
            this.b = new HashMap(8);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f5602a.equals(cVar.f5602a) && this.b.equals(cVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i;
            Map<String, List<a>> map = this.f5602a;
            int i2 = 0;
            if (map != null) {
                i = map.hashCode();
            } else {
                i = 0;
            }
            Map<String, String> map2 = this.b;
            if (map2 != null) {
                i2 = map2.hashCode();
            }
            return i + i2;
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    public static synchronized String a(String str, String str2) throws k {
        synchronized (bq.class) {
            try {
                try {
                    System.currentTimeMillis();
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                        Context context = m.c;
                        try {
                            if (b == null) {
                                b = Collections.synchronizedList(new ArrayList(8));
                            }
                            if (context != null && !b.contains(str2)) {
                                b.add(str2);
                                String a2 = bd.a(context, "Yb3Blbl9odHRwX2NvbnRyb2w", str2);
                                if (!TextUtils.isEmpty(a2)) {
                                    a(str2, new JSONObject(a2));
                                }
                            }
                        } catch (Throwable th) {
                            as.a(th, "hlUtil", "llhl");
                        }
                        if (f5599a != null && f5599a.size() > 0) {
                            if (!f5599a.containsKey(str2)) {
                                return str;
                            }
                            c cVar = f5599a.get(str2);
                            if (cVar == null) {
                                return str;
                            }
                            if (!a(str, cVar, str2)) {
                                return b(str, cVar, str2);
                            }
                            throw new k("服务QPS超限");
                        }
                        return str;
                    }
                    return str;
                } catch (k e2) {
                    throw e2;
                }
            }
        }
    }

    public static bu b(String str, String str2) {
        Uri parse;
        String str3 = "app";
        if (c == null) {
            return null;
        }
        if (c.containsKey(str3)) {
            b bVar = c.get(str3);
            if (SystemClock.elapsedRealtime() <= bVar.b) {
                bu buVar = bVar.f5601a;
                if (buVar != null) {
                    buVar.e = false;
                }
                a(true, str2, str, 1);
                return buVar;
            }
        } else {
            if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null) {
                str3 = parse.getPath();
                if (c.containsKey(str3)) {
                    b bVar2 = c.get(str3);
                    if (SystemClock.elapsedRealtime() <= bVar2.b) {
                        bu buVar2 = bVar2.f5601a;
                        if (buVar2 != null) {
                            buVar2.e = false;
                        }
                        a(true, str2, str, 2);
                        return buVar2;
                    }
                }
            }
            return null;
        }
        c.remove(str3);
        return null;
    }

    public static void a() {
        try {
            Context context = m.c;
            if (context != null) {
                ca.a(b(), context);
            }
        } catch (Throwable unused) {
        }
    }

    private static String b(String str, c cVar, String str2) {
        try {
            Map<String, String> map = cVar.b;
            if (map != null && map.size() > 0) {
                Uri parse = Uri.parse(str);
                String authority = parse.getAuthority();
                if (!map.containsKey(authority)) {
                    return str;
                }
                String str3 = map.get(authority);
                str = parse.buildUpon().authority(str3).toString();
                a(str2, authority, str3);
                return str;
            }
            return str;
        } catch (Throwable th) {
            as.a(th, "hlUtil", "pdr");
            return str;
        }
    }

    private static void a(c cVar, JSONObject jSONObject) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(pg1.ATOM_EXT_block);
            if (optJSONArray != null) {
                HashMap hashMap = new HashMap(8);
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("api");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!optString.startsWith("/")) {
                                optString = "/".concat(optString);
                            }
                            if (optString.endsWith("/")) {
                                optString = optString.substring(0, optString.length() - 1);
                            }
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("periods");
                            ArrayList arrayList = new ArrayList();
                            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                                if (optJSONObject2 != null) {
                                    a aVar = new a((byte) 0);
                                    aVar.f5600a = optJSONObject2.optString("begin");
                                    aVar.b = optJSONObject2.optInt("duration");
                                    aVar.c = optJSONObject2.optDouble(xxl.PERCENT);
                                    arrayList.add(aVar);
                                }
                            }
                            hashMap.put(optString, arrayList);
                        }
                    }
                }
                cVar.f5602a = hashMap;
            }
        } catch (Throwable th) {
            as.a(th, "hlUtil", "pbr");
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x001f -> B:16:0x0028). Please submit an issue!!! */
    public static List<bz> b() {
        Throwable th;
        ArrayList arrayList = null;
        try {
            synchronized (f) {
                try {
                    List<bz> list = f;
                    if (list != null && list.size() > 0) {
                        arrayList = new ArrayList();
                        try {
                            arrayList.addAll(f);
                            f.clear();
                            arrayList = arrayList;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    return arrayList;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            try {
                throw th;
            } catch (Throwable unused) {
                return arrayList;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static synchronized void a(w wVar, JSONObject jSONObject) {
        synchronized (bq.class) {
            if (wVar != null) {
                try {
                    String a2 = wVar.a();
                    if (!TextUtils.isEmpty(a2)) {
                        if (jSONObject == null) {
                            a(a2);
                        }
                        if (!m.a(jSONObject.optString("able", null), false)) {
                            a(a2);
                            return;
                        }
                        bd.a(m.c, "Yb3Blbl9odHRwX2NvbnRyb2w", a2, jSONObject.toString());
                        a(a2, jSONObject);
                    }
                } catch (Throwable th) {
                    as.a(th, "hlUtil", "par");
                }
            }
        }
    }

    private static void b(c cVar, JSONObject jSONObject) {
        JSONArray names;
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("domainMap");
            if (!(optJSONObject == null || (names = optJSONObject.names()) == null)) {
                HashMap hashMap = new HashMap(8);
                int length = names.length();
                for (int i = 0; i < length; i++) {
                    String optString = names.optString(i);
                    hashMap.put(optString, optJSONObject.optString(optString));
                }
                cVar.b = hashMap;
            }
        } catch (Throwable th) {
            as.a(th, "hlUtil", "pdr");
        }
    }

    private static synchronized void a(String str) {
        synchronized (bq.class) {
            try {
                if (f5599a.containsKey(str)) {
                    f5599a.remove(str);
                }
                SharedPreferences.Editor a2 = bd.a(m.c, "Yb3Blbl9odHRwX2NvbnRyb2w");
                bd.a(a2, str);
                bd.a(a2);
            } catch (Throwable th) {
                as.a(th, "hlUtil", LogContext.RELEASETYPE_RC);
            }
        }
    }

    private static void a(String str, c cVar) {
        try {
            if (f5599a == null) {
                f5599a = new ConcurrentHashMap<>(8);
            }
            f5599a.put(str, cVar);
        } catch (Throwable th) {
            as.a(th, "hlUtil", "ucr");
        }
    }

    private static void a(String str, String str2, String str3) {
        try {
            Context context = m.c;
            if (context != null && !TextUtils.isEmpty(str)) {
                if (e == null) {
                    e = new ConcurrentHashMap<>(8);
                }
                synchronized (e) {
                    if (!e.containsKey(str2)) {
                        e.put(str2, str3);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("timestamp", System.currentTimeMillis());
                        jSONObject.put("type", ag.j);
                        jSONObject.put("name", str);
                        jSONObject.put("version", ag.a(str));
                        jSONObject.put("hostname", str2 + "#" + str3);
                        String jSONObject2 = jSONObject.toString();
                        if (!TextUtils.isEmpty(jSONObject2)) {
                            bz bzVar = new bz(context, "core", "2.0", "O005");
                            bzVar.a(jSONObject2);
                            ca.a(bzVar, context);
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(String str, JSONObject jSONObject) {
        try {
            c cVar = new c((byte) 0);
            a(cVar, jSONObject);
            b(cVar, jSONObject);
            if (cVar.b == null && cVar.f5602a == null) {
                a(str);
            } else {
                a(str, cVar);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(URL url, bu buVar) {
        List<String> list;
        try {
            if (c == null) {
                c = new ConcurrentHashMap<>(8);
            }
            Map<String, List<String>> map = buVar.b;
            if (map != null && map.containsKey("nb") && (list = buVar.b.get("nb")) != null && list.size() > 0) {
                String[] split = list.get(0).split("#");
                if (split.length >= 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    long parseInt2 = Integer.parseInt(split[1]);
                    b bVar = new b((byte) 0);
                    bVar.f5601a = buVar;
                    if (parseInt2 <= 0) {
                        parseInt2 = 30;
                    }
                    bVar.b = SystemClock.elapsedRealtime() + (parseInt2 * 1000);
                    if (parseInt == 1) {
                        c.put("app", bVar);
                    } else if (parseInt == 2 && url != null) {
                        c.put(url.getPath(), bVar);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(boolean z, String str) {
        try {
            Context context = m.c;
            if (context != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                jSONObject.put("type", z ? ag.g : ag.f);
                jSONObject.put("name", str);
                jSONObject.put("version", ag.a(str));
                String jSONObject2 = jSONObject.toString();
                bz bzVar = new bz(context, "core", "2.0", "O005");
                bzVar.a(jSONObject2);
                ca.a(bzVar, context);
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(boolean z, String str, String str2, int i) {
        String str3;
        Integer num;
        try {
            Context context = m.c;
            if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timestamp", System.currentTimeMillis());
                String a2 = ag.a(str);
                if (z) {
                    str3 = "type";
                    num = ag.i;
                } else {
                    str3 = "type";
                    num = ag.h;
                }
                jSONObject.put(str3, num);
                jSONObject.put("name", str);
                jSONObject.put("version", a2);
                jSONObject.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, Uri.parse(str2).getPath());
                jSONObject.put("blockLevel", i);
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    bz bzVar = new bz(context, "core", "2.0", "O005");
                    bzVar.a(jSONObject2);
                    if (f == null) {
                        f = Collections.synchronizedList(new ArrayList(16));
                    }
                    synchronized (f) {
                        f.add(bzVar);
                        if (f.size() >= 15) {
                            a();
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean a(a aVar) {
        if (aVar == null || aVar.c == 1.0d) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty(aVar.f5600a) && aVar.b > 0) {
            long timeInMillis = currentTimeMillis - x.a(aVar.f5600a, "HH:mm:ss").getTimeInMillis();
            if (timeInMillis > 0 && timeInMillis < aVar.b * 1000) {
                if (aVar.c == vu3.b.GEO_NOT_SUPPORT) {
                    return true;
                }
                if (d == null) {
                    d = new Random();
                }
                d.setSeed(UUID.randomUUID().hashCode() + currentTimeMillis);
                if (d.nextDouble() > aVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(String str, c cVar, String str2) {
        Map<String, List<a>> map;
        try {
            map = cVar.f5602a;
        } catch (Throwable th) {
            as.a(th, "hlUtil", "inb");
        }
        if (map != null && map.size() > 0) {
            if (map.containsKey("*")) {
                for (Map.Entry<String, List<a>> entry : map.entrySet()) {
                    if (a(entry.getValue())) {
                        a(false, str2, str, 1);
                        return true;
                    }
                }
            } else {
                String path = Uri.parse(str).getPath();
                if (map.containsKey(path) && a(map.get(path))) {
                    a(false, str2, str, 2);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private static boolean a(List<a> list) {
        if (list != null && list.size() > 0) {
            for (a aVar : list) {
                if (a(aVar)) {
                    return true;
                }
            }
        }
        return false;
    }
}
