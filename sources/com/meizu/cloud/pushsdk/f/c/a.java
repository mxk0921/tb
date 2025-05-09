package com.meizu.cloud.pushsdk.f.c;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import anet.channel.Constants;
import com.meizu.cloud.pushsdk.e.d.e;
import com.meizu.cloud.pushsdk.e.d.g;
import com.meizu.cloud.pushsdk.e.d.i;
import com.meizu.cloud.pushsdk.e.d.j;
import com.meizu.cloud.pushsdk.e.d.k;
import com.meizu.cloud.pushsdk.f.b.b;
import com.meizu.cloud.pushsdk.f.g.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import tb.bmv;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f5857a;
    protected final Context c;
    private Uri.Builder d;
    protected final f e;
    private d f;
    private b g;
    private final SSLSocketFactory h;
    private final HostnameVerifier i;
    private String j;
    protected final int k;
    protected final int l;
    protected final int m;
    private final long n;
    private final long o;
    protected final TimeUnit p;
    private final com.meizu.cloud.pushsdk.e.d.a q;
    private final g b = g.a("application/json; charset=utf-8");
    protected final AtomicBoolean r = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* renamed from: com.meizu.cloud.pushsdk.f.c.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class C0283a {

        /* renamed from: a  reason: collision with root package name */
        protected final String f5858a;
        protected final Context b;
        protected SSLSocketFactory l;
        protected HostnameVerifier m;
        protected f c = null;
        protected d d = d.POST;
        protected b e = b.Single;
        protected int f = 5;
        protected int g = 250;
        protected int h = 5;
        protected long i = Constants.RECV_TIMEOUT;
        protected long j = Constants.RECV_TIMEOUT;
        protected TimeUnit k = TimeUnit.SECONDS;
        protected com.meizu.cloud.pushsdk.e.d.a n = new e();

        public C0283a(String str, Context context, Class<? extends a> cls) {
            this.f5858a = str;
            this.b = context;
        }

        public C0283a a(int i) {
            this.h = i;
            return this;
        }

        public C0283a b(int i) {
            this.g = i;
            return this;
        }

        public C0283a c(int i) {
            this.f = i;
            return this;
        }

        public C0283a a(com.meizu.cloud.pushsdk.e.d.a aVar) {
            if (aVar != null) {
                this.n = aVar;
                String simpleName = C0283a.class.getSimpleName();
                c.c(simpleName, "set new call " + aVar, new Object[0]);
            }
            return this;
        }

        public C0283a a(b bVar) {
            this.e = bVar;
            return this;
        }

        public C0283a a(f fVar) {
            this.c = fVar;
            return this;
        }
    }

    public a(C0283a aVar) {
        String simpleName = a.class.getSimpleName();
        this.f5857a = simpleName;
        this.f = aVar.d;
        this.e = aVar.c;
        this.c = aVar.b;
        this.g = aVar.e;
        this.h = aVar.l;
        this.i = aVar.m;
        this.k = aVar.f;
        this.l = aVar.h;
        this.m = aVar.g;
        this.n = aVar.i;
        this.o = aVar.j;
        this.j = aVar.f5858a;
        this.p = aVar.k;
        this.q = aVar.n;
        a();
        c.c(simpleName, "Emitter created successfully!", new Object[0]);
    }

    /* JADX WARN: Finally extract failed */
    public int a(i iVar) {
        k kVar = null;
        try {
            try {
                c.a(this.f5857a, "Sending request: %s", iVar);
                kVar = this.q.a(iVar);
                int b = kVar.b();
                a(kVar);
                return b;
            } catch (IOException e) {
                c.b(this.f5857a, "Request sending failed: %s", Log.getStackTraceString(e));
                a(kVar);
                return -1;
            }
        } catch (Throwable th) {
            a(kVar);
            throw th;
        }
    }

    public abstract void a(com.meizu.cloud.pushsdk.f.b.a aVar, boolean z);

    public abstract void b();

    public String c() {
        return this.d.clearQuery().build().toString();
    }

    private i a(com.meizu.cloud.pushsdk.f.b.a aVar) {
        a(aVar, "");
        this.d.clearQuery();
        HashMap hashMap = (HashMap) aVar.a();
        for (String str : hashMap.keySet()) {
            this.d.appendQueryParameter(str, (String) hashMap.get(str));
        }
        return new i.b().a(this.d.build().toString()).b().a();
    }

    private i a(ArrayList<com.meizu.cloud.pushsdk.f.b.a> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<com.meizu.cloud.pushsdk.f.b.a> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().a());
        }
        b bVar = new b("push_group_data", arrayList2);
        String str = this.f5857a;
        c.a(str, "final SelfDescribingJson " + bVar, new Object[0]);
        String uri = this.d.build().toString();
        return new i.b().a(uri).c(j.a(this.b, bVar.toString())).a();
    }

    public LinkedList<e> a(c cVar) {
        int size = cVar.b().size();
        LinkedList<Long> a2 = cVar.a();
        LinkedList<e> linkedList = new LinkedList<>();
        long j = 22;
        boolean z = true;
        if (this.f == d.GET) {
            for (int i = 0; i < size; i++) {
                LinkedList linkedList2 = new LinkedList();
                linkedList2.add(a2.get(i));
                com.meizu.cloud.pushsdk.f.b.a aVar = cVar.b().get(i);
                linkedList.add(new e(aVar.b() + 22 > this.n, a(aVar), linkedList2));
            }
        } else {
            int i2 = 0;
            while (i2 < size) {
                LinkedList linkedList3 = new LinkedList();
                ArrayList<com.meizu.cloud.pushsdk.f.b.a> arrayList = new ArrayList<>();
                long j2 = 0;
                int i3 = i2;
                while (i3 < this.g.a() + i2 && i3 < size) {
                    com.meizu.cloud.pushsdk.f.b.a aVar2 = cVar.b().get(i3);
                    long b = aVar2.b();
                    long j3 = b + j;
                    if (b + 110 > this.o) {
                        ArrayList<com.meizu.cloud.pushsdk.f.b.a> arrayList2 = new ArrayList<>();
                        LinkedList linkedList4 = new LinkedList();
                        arrayList2.add(aVar2);
                        linkedList4.add(a2.get(i3));
                        linkedList.add(new e(z, a(arrayList2), linkedList4));
                    } else {
                        j2 += j3;
                        int size2 = arrayList.size();
                        int i4 = z ? 1 : 0;
                        int i5 = z ? 1 : 0;
                        int i6 = z ? 1 : 0;
                        if (88 + j2 + (size2 - i4) > this.o) {
                            linkedList.add(new e(false, a(arrayList), linkedList3));
                            ArrayList<com.meizu.cloud.pushsdk.f.b.a> arrayList3 = new ArrayList<>();
                            LinkedList linkedList5 = new LinkedList();
                            arrayList3.add(aVar2);
                            linkedList5.add(a2.get(i3));
                            arrayList = arrayList3;
                            linkedList3 = linkedList5;
                            j2 = j3;
                        } else {
                            arrayList.add(aVar2);
                            linkedList3.add(a2.get(i3));
                        }
                    }
                    i3++;
                    j = 22;
                    z = true;
                }
                if (!arrayList.isEmpty()) {
                    linkedList.add(new e(false, a(arrayList), linkedList3));
                }
                i2 += this.g.a();
                j = 22;
                z = true;
            }
        }
        return linkedList;
    }

    private void a() {
        Uri.Builder buildUpon = Uri.parse(h1p.HTTPS_PREFIX + this.j).buildUpon();
        this.d = buildUpon;
        if (this.f == d.GET) {
            buildUpon.appendPath(bmv.MSGTYPE_INTERVAL);
        } else {
            buildUpon.appendEncodedPath("push_data_report/mobile");
        }
    }

    private void a(k kVar) {
        if (kVar != null) {
            try {
                if (kVar.a() != null) {
                    kVar.a().close();
                }
            } catch (Exception unused) {
                c.a(this.f5857a, "Unable to close source data", new Object[0]);
            }
        }
    }

    private void a(com.meizu.cloud.pushsdk.f.b.a aVar, String str) {
        if ("".equals(str)) {
            str = com.meizu.cloud.pushsdk.f.g.e.b();
        }
        aVar.a("stm", str);
    }

    public boolean a(int i) {
        return i >= 200 && i < 300;
    }
}
