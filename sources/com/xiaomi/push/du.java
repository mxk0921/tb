package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import com.alipay.security.mobile.cache.AuthenticatorCache;
import com.taobao.accs.common.Constants;
import com.xiaomi.push.ak;
import com.xiaomi.push.service.bw;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class du {

    /* renamed from: a  reason: collision with root package name */
    private static volatile du f14836a;

    /* renamed from: a  reason: collision with other field name */
    private Context f860a;

    /* renamed from: a  reason: collision with other field name */
    private final ConcurrentLinkedQueue<b> f861a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends b {
        public a() {
            super();
        }

        @Override // com.xiaomi.push.du.b, com.xiaomi.push.ak.b
        /* renamed from: b */
        public void mo598b() {
            du.this.b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends ak.b {

        /* renamed from: a  reason: collision with root package name */
        long f14838a = System.currentTimeMillis();

        public b() {
        }

        @Override // com.xiaomi.push.ak.b
        public boolean a() {
            return true;
        }

        @Override // com.xiaomi.push.ak.b
        /* renamed from: b */
        public void mo598b() {
        }

        @Override // com.xiaomi.push.ak.b
        /* renamed from: b  reason: collision with other method in class */
        public final boolean mo598b() {
            return System.currentTimeMillis() - this.f14838a > AuthenticatorCache.MAX_CACHE_TIME;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c extends b {

        /* renamed from: a  reason: collision with root package name */
        int f14839a;

        /* renamed from: a  reason: collision with other field name */
        File f863a;

        /* renamed from: a  reason: collision with other field name */
        String f864a;

        /* renamed from: a  reason: collision with other field name */
        boolean f865a;
        String b;

        /* renamed from: b  reason: collision with other field name */
        boolean f866b;

        public c(String str, String str2, File file, boolean z) {
            super();
            this.f864a = str;
            this.b = str2;
            this.f863a = file;
            this.f866b = z;
        }

        @Override // com.xiaomi.push.du.b, com.xiaomi.push.ak.b
        public boolean a() {
            if (bg.e(du.this.f860a) || (this.f866b && bg.b(du.this.f860a))) {
                return true;
            }
            return false;
        }

        @Override // com.xiaomi.push.du.b, com.xiaomi.push.ak.b
        /* renamed from: b */
        public void mo598b() {
            try {
                if (c()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("uid", bw.m1062a());
                    hashMap.put("token", this.b);
                    hashMap.put("net", bg.m508a(du.this.f860a));
                    bg.a(this.f864a, hashMap, this.f863a, "file");
                }
                this.f865a = true;
            } catch (IOException unused) {
            }
        }

        @Override // com.xiaomi.push.ak.b
        /* renamed from: c  reason: collision with other method in class */
        public void mo599c() {
            if (!this.f865a) {
                int i = this.f14839a + 1;
                this.f14839a = i;
                if (i < 3) {
                    du.this.f861a.add(this);
                }
            }
            if (this.f865a || this.f14839a >= 3) {
                this.f863a.delete();
            }
            du.this.a((1 << this.f14839a) * 1000);
        }

        private boolean c() {
            int i;
            int i2 = 0;
            SharedPreferences sharedPreferences = du.this.f860a.getSharedPreferences("log.timestamp", 0);
            String string = sharedPreferences.getString("log.requst", "");
            long currentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject = new JSONObject(string);
                currentTimeMillis = jSONObject.getLong("time");
                i = jSONObject.getInt(Constants.KEY_TIMES);
            } catch (JSONException unused) {
                i = 0;
            }
            if (System.currentTimeMillis() - currentTimeMillis >= 86400000) {
                currentTimeMillis = System.currentTimeMillis();
            } else if (i > 10) {
                return false;
            } else {
                i2 = i;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("time", currentTimeMillis);
                jSONObject2.put(Constants.KEY_TIMES, i2 + 1);
                sharedPreferences.edit().putString("log.requst", jSONObject2.toString()).commit();
            } catch (JSONException e) {
                com.xiaomi.channel.commonutils.logger.b.c("JSONException on put " + e.getMessage());
            }
            return true;
        }
    }

    private du(Context context) {
        ConcurrentLinkedQueue<b> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        this.f861a = concurrentLinkedQueue;
        this.f860a = context;
        concurrentLinkedQueue.add(new a());
        b(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (!z.b() && !z.m1106a()) {
            try {
                File file = new File(this.f860a.getExternalFilesDir(null) + "/.logcache");
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        file2.delete();
                    }
                }
            } catch (NullPointerException unused) {
            }
        }
    }

    private void c() {
        while (!this.f861a.isEmpty()) {
            b peek = this.f861a.peek();
            if (peek != null) {
                if (peek.mo598b() || this.f861a.size() > 6) {
                    com.xiaomi.channel.commonutils.logger.b.c("remove Expired task");
                    this.f861a.remove(peek);
                } else {
                    return;
                }
            }
        }
    }

    public static du a(Context context) {
        if (f14836a == null) {
            synchronized (du.class) {
                try {
                    if (f14836a == null) {
                        f14836a = new du(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f14836a.f860a = context;
        return f14836a;
    }

    private void b(long j) {
        if (!this.f861a.isEmpty()) {
            ht.a(new dw(this), j);
        }
    }

    public void a() {
        c();
        a(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        b peek = this.f861a.peek();
        if (peek != null && peek.a()) {
            b(j);
        }
    }

    public void a(String str, String str2, Date date, Date date2, int i, boolean z) {
        this.f861a.add(new dv(this, i, date, date2, str, str2, z));
        b(0L);
    }
}
