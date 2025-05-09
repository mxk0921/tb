package com.xiaomi.push;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.mj4;
import tb.pod;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cs {

    /* renamed from: a  reason: collision with root package name */
    protected static Context f14810a;

    /* renamed from: a  reason: collision with other field name */
    private static a f811a;

    /* renamed from: a  reason: collision with other field name */
    private static cs f812a;
    private static String c;
    private static String d;

    /* renamed from: a  reason: collision with other field name */
    private long f814a;

    /* renamed from: a  reason: collision with other field name */
    private cr f815a;

    /* renamed from: a  reason: collision with other field name */
    protected b f816a;

    /* renamed from: a  reason: collision with other field name */
    private String f817a;

    /* renamed from: a  reason: collision with other field name */
    protected final Map<String, cp> f818a;

    /* renamed from: b  reason: collision with other field name */
    private final long f819b;

    /* renamed from: b  reason: collision with other field name */
    private String f820b;

    /* renamed from: c  reason: collision with other field name */
    private long f821c;
    protected static final Map<String, co> b = new HashMap();

    /* renamed from: a  reason: collision with other field name */
    protected static boolean f813a = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        cs a(Context context, cr crVar, b bVar, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        String a(String str);
    }

    public cs(Context context, cr crVar, b bVar, String str) {
        this(context, crVar, bVar, str, null, null);
    }

    private String f() {
        return "host_fallbacks";
    }

    private String g() {
        try {
            PackageInfo packageInfo = f14810a.getPackageManager().getPackageInfo(f14810a.getPackageName(), 16384);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return "0";
        } catch (Exception unused) {
            return "0";
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public co m564a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return a(new URL(str).getHost(), true);
        }
        throw new IllegalArgumentException("the url is empty");
    }

    public co b(String str) {
        return a(str, true);
    }

    public co c(String str) {
        cp cpVar;
        co a2;
        synchronized (this.f818a) {
            m568a();
            cpVar = this.f818a.get(str);
        }
        if (cpVar == null || (a2 = cpVar.a()) == null) {
            return null;
        }
        return a2;
    }

    public co d(String str) {
        co coVar;
        Map<String, co> map = b;
        synchronized (map) {
            coVar = map.get(str);
        }
        return coVar;
    }

    public co e(String str) {
        if (System.currentTimeMillis() - this.f821c <= this.f814a * 60000) {
            return null;
        }
        this.f821c = System.currentTimeMillis();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        co coVar = a(arrayList).get(0);
        if (coVar != null) {
            this.f814a = 0L;
            return coVar;
        }
        long j = this.f814a;
        if (j >= 15) {
            return null;
        }
        this.f814a = j + 1;
        return null;
    }

    public cs(Context context, cr crVar, b bVar, String str, String str2, String str3) {
        this.f818a = new HashMap();
        this.f817a = "0";
        this.f814a = 0L;
        this.f819b = 15L;
        this.f821c = 0L;
        this.f820b = "isp_prov_city_country_ip";
        this.f816a = bVar;
        this.f815a = crVar == null ? new ct(this) : crVar;
        this.f817a = str;
        c = str2 == null ? context.getPackageName() : str2;
        d = str3 == null ? g() : str3;
    }

    public co a(String str, boolean z) {
        co e;
        com.xiaomi.channel.commonutils.logger.b.b("HostManager", "-->getFallbacksByHost(): host=", str, ", fetchRemoteIfNeed=", Boolean.valueOf(z));
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        } else if (!this.f815a.a(str)) {
            return null;
        } else {
            co c2 = c(str);
            return (c2 == null || !c2.b()) ? (!z || !bg.b(f14810a) || (e = e(str)) == null) ? new cu(this, str, c2) : e : c2;
        }
    }

    public String b() {
        return "resolver.msg.xiaomi.net";
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        synchronized (this.f818a) {
            try {
                for (Map.Entry<String, cp> entry : this.f818a.entrySet()) {
                    sb.append(entry.getKey());
                    sb.append(":\n");
                    sb.append(entry.getValue().toString());
                    sb.append("\n");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.Closeable, java.lang.String] */
    public String d() {
        InputStream inputStream;
        Throwable th;
        File file;
        InputStream inputStream2 = 0;
        try {
            file = new File(f14810a.getFilesDir(), f());
        } catch (Throwable th2) {
            th = th2;
            inputStream = inputStream2;
            inputStream2 = inputStream;
        }
        if (!file.isFile()) {
            return inputStream2;
        }
        inputStream2 = new FileInputStream(file);
        try {
            inputStream = new BufferedInputStream(inputStream2);
            try {
                String str = new String(h.a(m563a(), x.a(inputStream)), StandardCharsets.UTF_8);
                com.xiaomi.channel.commonutils.logger.b.b("load host fallbacks = ".concat(str));
                return str;
            } catch (Throwable th3) {
                th = th3;
                try {
                    com.xiaomi.channel.commonutils.logger.b.m410a("load host exception " + th.getMessage());
                    return inputStream2;
                } finally {
                    x.a((Closeable) inputStream);
                    x.a((Closeable) inputStream2);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = inputStream2;
        }
    }

    public String e() {
        if ("com.xiaomi.xmsf".equals(c)) {
            return c;
        }
        return c + ":pushservice";
    }

    public static synchronized cs a() {
        cs csVar;
        synchronized (cs.class) {
            csVar = f812a;
            if (csVar == null) {
                throw new IllegalStateException("the host manager is not initialized yet.");
            }
        }
        return csVar;
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m569b() {
        ArrayList<String> arrayList;
        synchronized (this.f818a) {
            try {
                m568a();
                arrayList = new ArrayList<>(this.f818a.keySet());
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    cp cpVar = this.f818a.get(arrayList.get(size));
                    if (!(cpVar == null || cpVar.a() == null)) {
                        arrayList.remove(size);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList<co> a2 = a(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (a2.get(i) != null) {
                a(arrayList.get(i), a2.get(i));
            }
        }
    }

    /* renamed from: c  reason: collision with other method in class */
    public void m571c() {
        FileOutputStream fileOutputStream;
        Throwable th;
        Exception e;
        synchronized (this.f818a) {
            BufferedOutputStream bufferedOutputStream = null;
            try {
                String jSONObject = m565a().toString();
                com.xiaomi.channel.commonutils.logger.b.b("persist host fallbacks = " + jSONObject);
                if (!TextUtils.isEmpty(jSONObject)) {
                    fileOutputStream = f14810a.openFileOutput(f(), 0);
                    try {
                        bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                        try {
                            try {
                                bufferedOutputStream.write(h.b(m563a(), jSONObject.getBytes(StandardCharsets.UTF_8)));
                                bufferedOutputStream.flush();
                                bufferedOutputStream = bufferedOutputStream;
                            } catch (Exception e2) {
                                e = e2;
                                com.xiaomi.channel.commonutils.logger.b.m410a("persist bucket failure: " + e.getMessage());
                                x.a(bufferedOutputStream);
                                x.a(fileOutputStream);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            x.a(bufferedOutputStream);
                            x.a(fileOutputStream);
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        bufferedOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        x.a(bufferedOutputStream);
                        x.a(fileOutputStream);
                        throw th;
                    }
                } else {
                    fileOutputStream = null;
                }
                x.a(bufferedOutputStream);
            } catch (Exception e4) {
                e = e4;
                bufferedOutputStream = null;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
            x.a(fileOutputStream);
        }
    }

    /* renamed from: d  reason: collision with other method in class */
    public void m572d() {
        String e = e();
        try {
            File file = new File(f14810a.getFilesDir(), e);
            if (file.exists()) {
                boolean delete = file.delete();
                StringBuilder sb = new StringBuilder("Delete old host fallbacks file ");
                sb.append(e);
                sb.append(delete ? " successful." : " failed.");
                com.xiaomi.channel.commonutils.logger.b.m410a(sb.toString());
            } else {
                com.xiaomi.channel.commonutils.logger.b.b("Old host fallbacks file " + e + " does not exist.");
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.m410a("Delete old host fallbacks file " + e + " error: " + e2.getMessage());
        }
    }

    /* renamed from: e  reason: collision with other method in class */
    public void m573e() {
        String next;
        synchronized (this.f818a) {
            try {
                for (cp cpVar : this.f818a.values()) {
                    cpVar.a(true);
                }
                while (true) {
                    Iterator<String> it = this.f818a.keySet().iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        if (this.f818a.get(next).m558a().isEmpty()) {
                            break;
                        }
                    }
                    this.f818a.remove(next);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m562a() {
        NetworkInfo activeNetworkInfo;
        Context context = f14810a;
        if (context == null) {
            return "unknown";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return "unknown";
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI-UNKNOWN";
            }
            return activeNetworkInfo.getTypeName() + "-" + activeNetworkInfo.getSubtypeName();
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m570b(String str) {
        synchronized (this.f818a) {
            try {
                this.f818a.clear();
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optInt(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION) == 2) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("data");
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            cp a2 = new cp().a(optJSONArray.getJSONObject(i));
                            this.f818a.put(a2.m557a(), a2);
                        }
                    }
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("reserved");
                    if (optJSONArray2 != null) {
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            JSONObject jSONObject2 = optJSONArray2.getJSONObject(i2);
                            String optString = jSONObject2.optString("host");
                            if (!TextUtils.isEmpty(optString)) {
                                try {
                                    co a3 = new co(optString).a(jSONObject2);
                                    b.put(a3.f808b, a3);
                                    com.xiaomi.channel.commonutils.logger.b.m410a("load local reserved host for " + a3.f808b);
                                } catch (JSONException unused) {
                                    com.xiaomi.channel.commonutils.logger.b.m410a("parse reserved host fail.");
                                }
                            }
                        }
                    }
                } else {
                    throw new JSONException("Bad version");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String a(String str) {
        try {
            int length = str.length();
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                byte b2 = bytes[i];
                int i2 = b2 & 240;
                if (i2 != 240) {
                    bytes[i] = (byte) (((b2 & 15) ^ ((byte) (((b2 >> 4) + length) & 15))) | i2);
                }
            }
            return new String(bytes);
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public String a(ArrayList<String> arrayList, String str, String str2, boolean z) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new bd("type", str));
        if (str.equals("wap")) {
            arrayList3.add(new bd("conpt", a(bg.m508a(f14810a))));
        }
        if (z) {
            arrayList3.add(new bd("reserved", "1"));
        }
        arrayList3.add(new bd("uuid", str2));
        arrayList3.add(new bd("list", bm.a(arrayList, ",")));
        arrayList3.add(new bd("countrycode", com.xiaomi.push.service.a.a(f14810a).b()));
        arrayList3.add(new bd("push_sdk_vc", String.valueOf((int) BuildConfig.VERSION_CODE)));
        String b2 = b();
        co c2 = c(b2);
        String format = String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", b2);
        if (c2 == null) {
            arrayList2.add(format);
            Map<String, co> map = b;
            synchronized (map) {
                try {
                    co coVar = map.get(b2);
                    if (coVar != null) {
                        Iterator<String> it = coVar.a(true).iterator();
                        while (it.hasNext()) {
                            arrayList2.add(String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", it.next()));
                        }
                    }
                } finally {
                }
            }
        } else {
            arrayList2 = c2.a(format);
        }
        Iterator<String> it2 = arrayList2.iterator();
        IOException e = null;
        while (it2.hasNext()) {
            Uri.Builder buildUpon = Uri.parse(it2.next()).buildUpon();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                bf bfVar = (bf) it3.next();
                buildUpon.appendQueryParameter(bfVar.a(), bfVar.b());
            }
            try {
                b bVar = this.f816a;
                return bVar == null ? bg.a(f14810a, new URL(buildUpon.toString())) : bVar.a(buildUpon.toString());
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        com.xiaomi.channel.commonutils.logger.b.m410a("network exception: " + e.getMessage());
        throw e;
    }

    private ArrayList<co> a(ArrayList<String> arrayList) {
        m573e();
        synchronized (this.f818a) {
            try {
                m568a();
                for (String str : this.f818a.keySet()) {
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                }
            } finally {
            }
        }
        Map<String, co> map = b;
        synchronized (map) {
            try {
                for (Object obj : map.values().toArray()) {
                    co coVar = (co) obj;
                    if (!coVar.b()) {
                        b.remove(coVar.f808b);
                    }
                }
            } finally {
            }
        }
        if (!arrayList.contains(b())) {
            arrayList.add(b());
        }
        ArrayList<co> arrayList2 = new ArrayList<>(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(null);
        }
        try {
            String str2 = bg.e(f14810a) ? "wifi" : "wap";
            String a2 = a(arrayList, str2, this.f817a, true);
            if (!TextUtils.isEmpty(a2)) {
                JSONObject jSONObject = new JSONObject(a2);
                com.xiaomi.channel.commonutils.logger.b.b(a2);
                if (mj4.CONTROL_NAME_OK.equalsIgnoreCase(jSONObject.getString(ExifInterface.LATITUDE_SOUTH))) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("R");
                    String string = jSONObject2.getString("province");
                    String string2 = jSONObject2.getString("city");
                    String string3 = jSONObject2.getString("isp");
                    String string4 = jSONObject2.getString(pod.IP);
                    String string5 = jSONObject2.getString("country");
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(str2);
                    com.xiaomi.channel.commonutils.logger.b.c("get bucket: net=" + string3 + ", hosts=" + jSONObject3.toString());
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        String str3 = arrayList.get(i2);
                        JSONArray optJSONArray = jSONObject3.optJSONArray(str3);
                        if (optJSONArray == null) {
                            com.xiaomi.channel.commonutils.logger.b.m410a("no bucket found for " + str3);
                            jSONObject3 = jSONObject3;
                        } else {
                            co coVar2 = new co(str3);
                            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                String string6 = optJSONArray.getString(i3);
                                if (!TextUtils.isEmpty(string6)) {
                                    jSONObject3 = jSONObject3;
                                    coVar2.a(new cx(string6, optJSONArray.length() - i3));
                                } else {
                                    jSONObject3 = jSONObject3;
                                }
                            }
                            jSONObject3 = jSONObject3;
                            arrayList2.set(i2, coVar2);
                            coVar2.g = string5;
                            coVar2.c = string;
                            coVar2.e = string3;
                            coVar2.f = string4;
                            coVar2.d = string2;
                            if (jSONObject2.has("stat-percent")) {
                                coVar2.a(jSONObject2.getDouble("stat-percent"));
                            }
                            if (jSONObject2.has("stat-domain")) {
                                coVar2.b(jSONObject2.getString("stat-domain"));
                            }
                            if (jSONObject2.has(RemoteMessageConst.TTL)) {
                                coVar2.a(jSONObject2.getInt(RemoteMessageConst.TTL) * 1000);
                            }
                            m567a(coVar2.a());
                        }
                    }
                    JSONObject optJSONObject = jSONObject2.optJSONObject("reserved");
                    if (optJSONObject != null) {
                        long j = jSONObject2.has("reserved-ttl") ? jSONObject2.getInt("reserved-ttl") * 1000 : 604800000L;
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray(next);
                            if (optJSONArray2 == null) {
                                com.xiaomi.channel.commonutils.logger.b.m410a("no bucket found for " + next);
                            } else {
                                co coVar3 = new co(next);
                                coVar3.a(j);
                                for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                                    String string7 = optJSONArray2.getString(i4);
                                    if (!TextUtils.isEmpty(string7)) {
                                        coVar3.a(new cx(string7, optJSONArray2.length() - i4));
                                    }
                                }
                                Map<String, co> map2 = b;
                                synchronized (map2) {
                                    if (this.f815a.a(next)) {
                                        map2.put(next, coVar3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m410a("failed to get bucket " + e.getMessage());
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            co coVar4 = arrayList2.get(i5);
            if (coVar4 != null) {
                a(arrayList.get(i5), coVar4);
            }
        }
        m571c();
        return arrayList2;
    }

    /* renamed from: a  reason: collision with other method in class */
    public JSONObject m565a() {
        JSONObject jSONObject;
        synchronized (this.f818a) {
            try {
                jSONObject = new JSONObject();
                jSONObject.put(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, 2);
                JSONArray jSONArray = new JSONArray();
                for (cp cpVar : this.f818a.values()) {
                    jSONArray.put(cpVar.m559a());
                }
                jSONObject.put("data", jSONArray);
                JSONArray jSONArray2 = new JSONArray();
                for (co coVar : b.values()) {
                    jSONArray2.put(coVar.m554a());
                }
                jSONObject.put("reserved", jSONArray2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m566a() {
        synchronized (this.f818a) {
            this.f818a.clear();
        }
    }

    public static synchronized void a(Context context, cr crVar, b bVar, String str, String str2, String str3) {
        synchronized (cs.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                f14810a = applicationContext;
                if (applicationContext == null) {
                    f14810a = context;
                }
                if (f812a == null) {
                    a aVar = f811a;
                    if (aVar == null) {
                        f812a = new cs(context, crVar, bVar, str, str2, str3);
                    } else {
                        f812a = aVar.a(context, crVar, bVar, str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void a(a aVar) {
        synchronized (cs.class) {
            f811a = aVar;
            f812a = null;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m567a(String str) {
        this.f820b = str;
    }

    public void a(String str, co coVar) {
        if (TextUtils.isEmpty(str) || coVar == null) {
            throw new IllegalArgumentException("the argument is invalid " + str + ", " + coVar);
        } else if (this.f815a.a(str)) {
            synchronized (this.f818a) {
                try {
                    m568a();
                    if (this.f818a.containsKey(str)) {
                        this.f818a.get(str).a(coVar);
                    } else {
                        cp cpVar = new cp(str);
                        cpVar.a(coVar);
                        this.f818a.put(str, cpVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void a(String str, String str2) {
        Map<String, co> map = b;
        co coVar = map.get(str);
        synchronized (map) {
            try {
                if (coVar == null) {
                    co coVar2 = new co(str);
                    coVar2.a(604800000L);
                    coVar2.m555a(str2);
                    map.put(str, coVar2);
                } else {
                    coVar.m555a(str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m568a() {
        synchronized (this.f818a) {
            try {
                if (f813a) {
                    return true;
                }
                f813a = true;
                this.f818a.clear();
                String d2 = d();
                if (TextUtils.isEmpty(d2)) {
                    return false;
                }
                m570b(d2);
                com.xiaomi.channel.commonutils.logger.b.b("loading the new hosts succeed");
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private byte[] m563a() {
        return bl.m517a(f14810a.getPackageName() + "_key_salt");
    }
}
