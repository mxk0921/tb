package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class fv {
    private static fv f;
    private static long i;
    private File d;
    private String e;
    private Context g;
    private boolean h;
    private LinkedHashMap<String, Long> c = new LinkedHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    String f5711a = "";
    String b = null;

    private fv(Context context) {
        this.e = null;
        Context applicationContext = context.getApplicationContext();
        this.g = applicationContext;
        String path = applicationContext.getFilesDir().getPath();
        if (this.e == null) {
            this.e = fy.l(this.g);
        }
        try {
            this.d = new File(path, "reportRecorder");
        } catch (Throwable th) {
            ej.a(th);
        }
        c();
    }

    public static synchronized fv a(Context context) {
        fv fvVar;
        synchronized (fv.class) {
            try {
                if (f == null) {
                    f = new fv(context);
                }
                fvVar = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fvVar;
    }

    private synchronized void c() {
        LinkedHashMap<String, Long> linkedHashMap = this.c;
        if (linkedHashMap == null || linkedHashMap.size() <= 0) {
            this.f5711a = new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis()));
            for (String str : fy.a(this.d)) {
                try {
                    String[] split = new String(fg.b(p.b(str), this.e), "UTF-8").split(",");
                    if (split != null && split.length > 1) {
                        this.c.put(split[0], Long.valueOf(Long.parseLong(split[1])));
                    }
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void d() {
        try {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Long> entry : this.c.entrySet()) {
                try {
                    String str = entry.getKey() + "," + entry.getValue();
                    sb.append(p.b(fg.a(str.getBytes("UTF-8"), this.e)) + "\n");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                fy.a(this.d, sb2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final synchronized void b() {
        try {
            if (b(this.g)) {
                for (Map.Entry<String, Long> entry : this.c.entrySet()) {
                    if (!this.f5711a.equals(entry.getKey())) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("param_long_first", entry.getKey());
                        jSONObject.put("param_long_second", entry.getValue());
                        fw.a(this.g, "O023", jSONObject);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private boolean b(Context context) {
        if (this.b == null) {
            this.b = fx.a(context, "pref", "lastavedate", "0");
        }
        if (this.b.equals(this.f5711a)) {
            return false;
        }
        SharedPreferences.Editor a2 = fx.a(context, "pref");
        fx.a(a2, "lastavedate", this.f5711a);
        fx.a(a2);
        this.b = this.f5711a;
        return true;
    }

    public final synchronized void a() {
        if (this.h) {
            d();
            this.h = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r6.c.size() >= 9) goto L_0x002d;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081 A[Catch: all -> 0x0016, TRY_ENTER, TryCatch #1 {all -> 0x0016, blocks: (B:3:0x0001, B:5:0x000b, B:10:0x0019, B:12:0x0023, B:14:0x002d, B:15:0x003c, B:17:0x0042, B:21:0x0063, B:22:0x0067, B:24:0x006d, B:25:0x0079, B:29:0x0081, B:31:0x0088, B:34:0x0090, B:36:0x009c, B:37:0x00b9, B:38:0x00c6, B:40:0x00ce, B:42:0x00d5, B:43:0x00d8, B:18:0x0048), top: B:53:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(com.amap.api.location.AMapLocation r7) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fv.a(com.amap.api.location.AMapLocation):void");
    }
}
