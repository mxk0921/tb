package com.uploader.implement;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.strategy.HttpDnsAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.IUploaderEnvironment;
import java.util.ArrayList;
import java.util.List;
import tb.cwx;
import tb.dzx;
import tb.o7y;
import tb.qmv;
import tb.rtx;
import tb.w6e;
import tb.xg8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f14547a;
    public final qmv b;
    public final Context c;
    public final IUploaderEnvironment d;

    /* compiled from: Taobao */
    /* renamed from: com.uploader.implement.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class C0848a extends qmv {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0848a(int i) {
            super(i);
        }

        public static /* synthetic */ Object ipc$super(C0848a aVar, String str, Object... objArr) {
            if (str.hashCode() == -39327052) {
                return super.a();
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/uploader/implement/d$1");
        }

        @Override // tb.qmv
        public synchronized xg8 a() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xg8) ipChange.ipc$dispatch("fda7eab4", new Object[]{this});
            }
            xg8 a2 = super.a();
            if (a2.f31379a == a.this.d.getEnvironment() && a2.b.equals(a.this.d.getAppKey())) {
                return a2;
            }
            int environment = a.this.d.getEnvironment();
            String appKey = a.this.d.getAppKey();
            if (TextUtils.isEmpty(a.this.d.getDomain())) {
                str = a2.c;
            } else {
                str = a.this.d.getDomain();
            }
            return new xg8(environment, appKey, str, a2.d);
        }

        @Override // com.uploader.export.IUploaderEnvironment
        public byte[] decrypt(Context context, String str, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("6cd37cb8", new Object[]{this, context, str, bArr});
            }
            return a.this.d.decrypt(context, str, bArr);
        }

        @Override // com.uploader.export.IUploaderEnvironment
        public boolean enableFlowControl() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8a8f2d57", new Object[]{this})).booleanValue();
            }
            return a.this.d.enableFlowControl();
        }

        @Override // com.uploader.export.IUploaderEnvironment
        public String getAppVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
            }
            return a.this.d.getAppVersion();
        }

        @Override // com.uploader.export.IUploaderEnvironment
        public int getEnvironment() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("487b46d7", new Object[]{this})).intValue();
            }
            return a.this.d.getEnvironment();
        }

        @Override // com.uploader.export.IUploaderEnvironment
        public byte[] getSslTicket(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("a0e03714", new Object[]{this, context, str});
            }
            return a.this.d.getSslTicket(context, str);
        }

        @Override // com.uploader.export.IUploaderEnvironment
        public String getUserId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
            }
            return a.this.d.getUserId();
        }

        @Override // com.uploader.export.IUploaderEnvironment
        public String getUtdid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this});
            }
            return a.this.d.getUtdid();
        }

        @Override // com.uploader.export.IUploaderEnvironment
        public int putSslTicket(Context context, String str, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("699c5fdc", new Object[]{this, context, str, bArr})).intValue();
            }
            return a.this.d.putSslTicket(context, str, bArr);
        }

        @Override // com.uploader.export.IUploaderEnvironment
        public String signature(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("59879677", new Object[]{this, str});
            }
            return a.this.d.signature(str);
        }
    }

    public a(Context context, w6e w6eVar) {
        this.c = context;
        IUploaderEnvironment environment = w6eVar.getEnvironment();
        if (environment instanceof qmv) {
            this.b = (qmv) environment;
        } else {
            this.d = w6eVar.getEnvironment();
            this.b = new C0848a(0);
        }
        b bVar = new b(this.b, context);
        this.f14547a = bVar;
        bVar.o();
        dzx.c(w6eVar.a());
        rtx.c(w6eVar.getLog());
        cwx.c(context);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final qmv d;
        public final Context f;
        public boolean g = true;

        /* renamed from: a  reason: collision with root package name */
        public final C0849a f14548a = new C0849a();
        public final C0849a b = new C0849a();
        public final C0849a c = new C0849a();
        public boolean e = true;

        /* compiled from: Taobao */
        /* renamed from: com.uploader.implement.a$b$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class C0849a {

            /* renamed from: a  reason: collision with root package name */
            public String f14549a;
            public String b;
            public Pair<String, Long> h;
            public final List<Pair<String, Integer>> c = new ArrayList();
            public int d = 0;
            public final List<C0850b> e = new ArrayList();
            public final List<C0850b> f = new ArrayList();
            public int g = 0;
            public long i = 0;
            public long j = 604800;
        }

        /* compiled from: Taobao */
        /* renamed from: com.uploader.implement.a$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class C0850b {

            /* renamed from: a  reason: collision with root package name */
            public String f14550a;
            public int b;
            public String c;
            public boolean d;
        }

        public b(qmv qmvVar, Context context) {
            this.d = qmvVar;
            this.f = context;
        }

        public Pair<String, Long> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("dd4f14b2", new Object[]{this});
            }
            xg8 a2 = this.d.a();
            Pair<C0849a, Integer> b = b(a2);
            C0849a aVar = (C0849a) b.first;
            String str = a2.c;
            String str2 = a2.d;
            if (str.equals(aVar.f14549a) && str2.equals(aVar.b)) {
                return ((C0849a) b.first).h;
            }
            ((ArrayList) aVar.c).clear();
            ((ArrayList) aVar.e).clear();
            ((ArrayList) aVar.f).clear();
            aVar.g = 0;
            aVar.d = 0;
            aVar.f14549a = "";
            aVar.b = "";
            aVar.i = 0L;
            aVar.h = null;
            return null;
        }

        public Pair<C0849a, Integer> b(xg8 xg8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("17e2fc90", new Object[]{this, xg8Var});
            }
            int i = xg8Var.f31379a;
            if (i == 1) {
                return new Pair<>(this.b, 80);
            }
            if (i != 2) {
                return new Pair<>(this.f14548a, 443);
            }
            return new Pair<>(this.c, 80);
        }

        public void c(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
                return;
            }
            xg8 a2 = this.d.a();
            Pair<C0849a, Integer> b = b(a2);
            ((C0849a) b.first).i = j - (System.currentTimeMillis() / 1000);
            if (rtx.d(4)) {
                rtx.a(4, "UploaderConfig", "[updateTimestampOffset] update timestamp succeed.,environment:" + a2.f31379a + ", offset=" + ((C0849a) b.first).i + " seconds");
            }
        }

        public void e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.e = z;
            }
        }

        public Pair<String, Integer> f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("2780adf3", new Object[]{this});
            }
            xg8 a2 = this.d.a();
            Pair<C0849a, Integer> b = b(a2);
            if (((ArrayList) ((C0849a) b.first).c).size() == 0) {
                ((ArrayList) ((C0849a) b.first).c).add(new Pair(a2.c, b.second));
                List<String> g = g(a2);
                for (int i = 0; i < g.size(); i++) {
                    ((ArrayList) ((C0849a) b.first).c).add(new Pair(g.get(i), b.second));
                }
            }
            C0849a aVar = (C0849a) b.first;
            if (aVar.d >= ((ArrayList) aVar.c).size()) {
                ((C0849a) b.first).d = 0;
            }
            C0849a aVar2 = (C0849a) b.first;
            return (Pair) ((ArrayList) aVar2.c).get(aVar2.d);
        }

        public final List<String> g(xg8 xg8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("53c2920", new Object[]{this, xg8Var});
            }
            ArrayList arrayList = new ArrayList();
            try {
                ArrayList<HttpDnsAdapter.HttpDnsOrigin> originsByHttpDnsNoWait = HttpDnsAdapter.getOriginsByHttpDnsNoWait(xg8Var.c, false);
                if (originsByHttpDnsNoWait != null && !originsByHttpDnsNoWait.isEmpty()) {
                    for (int i = 0; i < originsByHttpDnsNoWait.size(); i++) {
                        HttpDnsAdapter.HttpDnsOrigin httpDnsOrigin = originsByHttpDnsNoWait.get(i);
                        if (httpDnsOrigin != null) {
                            String originIP = httpDnsOrigin.getOriginIP();
                            if (!TextUtils.isEmpty(originIP)) {
                                arrayList.add(originIP);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return arrayList;
                    }
                }
            } catch (Throwable unused) {
            }
            List<String> b = cwx.b(xg8Var.c);
            if (!(b == null || b.isEmpty())) {
                return b;
            }
            arrayList.add(xg8Var.d);
            return arrayList;
        }

        public void h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            } else {
                this.g = z;
            }
        }

        public void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            ((C0849a) b(this.d.a()).first).d++;
        }

        public C0850b j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0850b) ipChange.ipc$dispatch("aeea151a", new Object[]{this});
            }
            Pair<C0849a, Integer> b = b(this.d.a());
            if (((ArrayList) ((C0849a) b.first).e).size() == 0) {
                return null;
            }
            Object obj = b.first;
            if (((C0849a) obj).g >= ((ArrayList) ((C0849a) obj).e).size()) {
                ((C0849a) b.first).g = 0;
            }
            Object obj2 = b.first;
            return (C0850b) ((ArrayList) ((C0849a) obj2).e).get(((C0849a) obj2).g);
        }

        public void k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
                return;
            }
            ((C0849a) b(this.d.a()).first).g++;
        }

        public List<C0850b> l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this});
            }
            return ((C0849a) b(this.d.a()).first).f;
        }

        public long m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue();
            }
            return ((C0849a) b(this.d.a()).first).i;
        }

        public long n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[]{this})).longValue();
            }
            return ((C0849a) b(this.d.a()).first).j;
        }

        public void o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            } else {
                ((C0849a) b(this.d.a()).first).j = PreferenceManager.getDefaultSharedPreferences(this.f).getLong("aus_upload_file_ttl", 604800L);
            }
        }

        public String p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this});
            }
            return this.d.a().c;
        }

        public boolean q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
            }
            return this.e;
        }

        public void d(String str, long j, long j2, List<Pair<String, Integer>> list, List<C0850b> list2) {
            long j3 = j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c324b014", new Object[]{this, str, new Long(j3), new Long(j2), list, list2});
                return;
            }
            xg8 a2 = this.d.a();
            Pair<C0849a, Integer> b = b(a2);
            if (j3 <= 0) {
                j3 = 300;
            }
            ((C0849a) b.first).h = new Pair<>(str, Long.valueOf(System.currentTimeMillis() + (j3 * 1000)));
            long j4 = j2 <= 0 ? 604800L : j2;
            ((C0849a) b.first).j = j4;
            PreferenceManager.getDefaultSharedPreferences(this.f).edit().putLong("aus_upload_file_ttl", j4).apply();
            Object obj = b.first;
            ((C0849a) obj).f14549a = a2.c;
            ((C0849a) obj).b = a2.d;
            if (list2 != null && list2.size() > 0) {
                ((ArrayList) ((C0849a) b.first).e).clear();
                ((ArrayList) ((C0849a) b.first).f).clear();
                for (C0850b bVar : list2) {
                    if ("xquic".equalsIgnoreCase(bVar.c)) {
                        ((ArrayList) ((C0849a) b.first).f).add(bVar);
                        if (this.g && cwx.l() && o7y.i()) {
                        }
                    }
                    ((ArrayList) ((C0849a) b.first).e).add(bVar);
                }
                ((C0849a) b.first).g = 0;
            }
            if (list != null && list.size() > 0) {
                ((ArrayList) ((C0849a) b.first).c).clear();
                Pair pair = new Pair(a2.c, b.second);
                Pair pair2 = new Pair(a2.d, b.second);
                for (Pair<String, Integer> pair3 : list) {
                    if (!pair.equals(pair3) && !pair2.equals(pair3)) {
                        ((ArrayList) ((C0849a) b.first).c).add(pair3);
                    }
                }
                ((ArrayList) ((C0849a) b.first).c).add(pair);
                ((ArrayList) ((C0849a) b.first).c).add(pair2);
                ((C0849a) b.first).d = 0;
            }
            e(true);
        }
    }
}
