package com.xiaomi.push;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class em {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f895a;

        /* renamed from: b  reason: collision with other field name */
        private boolean f898b;

        /* renamed from: c  reason: collision with other field name */
        private boolean f901c;

        /* renamed from: d  reason: collision with other field name */
        private boolean f903d;

        /* renamed from: e  reason: collision with other field name */
        private boolean f905e;

        /* renamed from: f  reason: collision with other field name */
        private boolean f906f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        private boolean m;

        /* renamed from: a  reason: collision with root package name */
        private int f14853a = 0;

        /* renamed from: a  reason: collision with other field name */
        private long f893a = 0;

        /* renamed from: a  reason: collision with other field name */
        private String f894a = "";

        /* renamed from: b  reason: collision with other field name */
        private String f897b = "";

        /* renamed from: c  reason: collision with other field name */
        private String f900c = "";

        /* renamed from: d  reason: collision with other field name */
        private String f902d = "";

        /* renamed from: e  reason: collision with other field name */
        private String f904e = "";
        private int b = 1;
        private int c = 0;
        private int d = 0;
        private String f = "";

        /* renamed from: b  reason: collision with other field name */
        private long f896b = 0;

        /* renamed from: c  reason: collision with other field name */
        private long f899c = 0;
        private int e = -1;

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo666a() {
            if (this.e < 0) {
                mo668b();
            }
            return this.e;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo668b() {
            int a2 = mo666a() ? com.xiaomi.push.c.a(1, c()) : 0;
            if (mo668b()) {
                a2 += com.xiaomi.push.c.b(2, mo666a());
            }
            if (m620c()) {
                a2 += com.xiaomi.push.c.a(3, mo666a());
            }
            if (m622d()) {
                a2 += com.xiaomi.push.c.a(4, mo668b());
            }
            if (m624e()) {
                a2 += com.xiaomi.push.c.a(5, m619c());
            }
            if (m626f()) {
                a2 += com.xiaomi.push.c.a(6, m621d());
            }
            if (g()) {
                a2 += com.xiaomi.push.c.a(7, m623e());
            }
            if (h()) {
                a2 += com.xiaomi.push.c.a(8, d());
            }
            if (i()) {
                a2 += com.xiaomi.push.c.a(9, e());
            }
            if (j()) {
                a2 += com.xiaomi.push.c.a(10, f());
            }
            if (k()) {
                a2 += com.xiaomi.push.c.a(11, m625f());
            }
            if (l()) {
                a2 += com.xiaomi.push.c.b(12, mo668b());
            }
            if (m()) {
                a2 += com.xiaomi.push.c.b(13, m618c());
            }
            this.e = a2;
            return a2;
        }

        public int c() {
            return this.f14853a;
        }

        public int d() {
            return this.b;
        }

        public int e() {
            return this.c;
        }

        public int f() {
            return this.d;
        }

        public boolean g() {
            return this.g;
        }

        public boolean h() {
            return this.h;
        }

        public boolean i() {
            return this.i;
        }

        public boolean j() {
            return this.j;
        }

        public boolean k() {
            return this.k;
        }

        public boolean l() {
            return this.l;
        }

        public boolean m() {
            return this.m;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public long mo666a() {
            return this.f893a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public long mo668b() {
            return this.f896b;
        }

        /* renamed from: c  reason: collision with other method in class */
        public long m618c() {
            return this.f899c;
        }

        public a d(int i) {
            this.j = true;
            this.d = i;
            return this;
        }

        public a e(String str) {
            this.g = true;
            this.f904e = str;
            return this;
        }

        public a f(String str) {
            this.k = true;
            this.f = str;
            return this;
        }

        public a b(int i) {
            this.h = true;
            this.b = i;
            return this;
        }

        public a c(int i) {
            this.i = true;
            this.c = i;
            return this;
        }

        public a d(String str) {
            this.f906f = true;
            this.f902d = str;
            return this;
        }

        /* renamed from: e  reason: collision with other method in class */
        public String m623e() {
            return this.f904e;
        }

        /* renamed from: f  reason: collision with other method in class */
        public String m625f() {
            return this.f;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public a mo666a() {
            this.f906f = false;
            this.f902d = "";
            return this;
        }

        public a b(long j) {
            this.l = true;
            this.f896b = j;
            return this;
        }

        public a c(long j) {
            this.m = true;
            this.f899c = j;
            return this;
        }

        /* renamed from: d  reason: collision with other method in class */
        public String m621d() {
            return this.f902d;
        }

        /* renamed from: e  reason: collision with other method in class */
        public boolean m624e() {
            return this.f905e;
        }

        /* renamed from: f  reason: collision with other method in class */
        public boolean m626f() {
            return this.f906f;
        }

        public a a(int i) {
            this.f895a = true;
            this.f14853a = i;
            return this;
        }

        public a b(String str) {
            this.f903d = true;
            this.f897b = str;
            return this;
        }

        public a c(String str) {
            this.f905e = true;
            this.f900c = str;
            return this;
        }

        /* renamed from: d  reason: collision with other method in class */
        public boolean m622d() {
            return this.f903d;
        }

        public a a(long j) {
            this.f898b = true;
            this.f893a = j;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public String mo668b() {
            return this.f897b;
        }

        /* renamed from: c  reason: collision with other method in class */
        public String m619c() {
            return this.f900c;
        }

        @Override // com.xiaomi.push.e
        public a a(com.xiaomi.push.b bVar) {
            while (true) {
                int a2 = bVar.m491a();
                switch (a2) {
                    case 0:
                        return this;
                    case 8:
                        a(bVar.m500b());
                        break;
                    case 16:
                        a(bVar.m501b());
                        break;
                    case 26:
                        a(bVar.m494a());
                        break;
                    case 34:
                        b(bVar.m494a());
                        break;
                    case 42:
                        c(bVar.m494a());
                        break;
                    case 50:
                        d(bVar.m494a());
                        break;
                    case 58:
                        e(bVar.m494a());
                        break;
                    case 64:
                        b(bVar.m500b());
                        break;
                    case 72:
                        c(bVar.m500b());
                        break;
                    case 80:
                        d(bVar.m500b());
                        break;
                    case 90:
                        f(bVar.m494a());
                        break;
                    case 96:
                        b(bVar.m501b());
                        break;
                    case 104:
                        c(bVar.m501b());
                        break;
                    default:
                        if (a(bVar, a2)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public boolean mo668b() {
            return this.f898b;
        }

        /* renamed from: c  reason: collision with other method in class */
        public boolean m620c() {
            return this.f901c;
        }

        public a a(String str) {
            this.f901c = true;
            this.f894a = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public String mo666a() {
            return this.f894a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo666a()) {
                cVar.m529a(1, c());
            }
            if (mo668b()) {
                cVar.m543b(2, mo666a());
            }
            if (m620c()) {
                cVar.m533a(3, mo666a());
            }
            if (m622d()) {
                cVar.m533a(4, mo668b());
            }
            if (m624e()) {
                cVar.m533a(5, m619c());
            }
            if (m626f()) {
                cVar.m533a(6, m621d());
            }
            if (g()) {
                cVar.m533a(7, m623e());
            }
            if (h()) {
                cVar.m529a(8, d());
            }
            if (i()) {
                cVar.m529a(9, e());
            }
            if (j()) {
                cVar.m529a(10, f());
            }
            if (k()) {
                cVar.m533a(11, m625f());
            }
            if (l()) {
                cVar.m543b(12, mo668b());
            }
            if (m()) {
                cVar.m543b(13, m618c());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public boolean mo666a() {
            return this.f895a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f907a;

        /* renamed from: c  reason: collision with other field name */
        private boolean f909c;

        /* renamed from: d  reason: collision with other field name */
        private boolean f910d;
        private boolean e;

        /* renamed from: b  reason: collision with other field name */
        private boolean f908b = false;

        /* renamed from: a  reason: collision with root package name */
        private int f14854a = 0;
        private int b = 0;
        private int c = 0;
        private int d = -1;

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo666a() {
            if (this.d < 0) {
                mo668b();
            }
            return this.d;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo668b() {
            int a2 = mo668b() ? com.xiaomi.push.c.a(1, mo666a()) : 0;
            if (m629c()) {
                a2 += com.xiaomi.push.c.a(3, c());
            }
            if (m630d()) {
                a2 += com.xiaomi.push.c.a(4, d());
            }
            if (m631e()) {
                a2 += com.xiaomi.push.c.a(5, e());
            }
            this.d = a2;
            return a2;
        }

        public int c() {
            return this.f14854a;
        }

        public int d() {
            return this.b;
        }

        public int e() {
            return this.c;
        }

        public b b(int i) {
            this.f910d = true;
            this.b = i;
            return this;
        }

        public b c(int i) {
            this.e = true;
            this.c = i;
            return this;
        }

        /* renamed from: d  reason: collision with other method in class */
        public boolean m630d() {
            return this.f910d;
        }

        /* renamed from: e  reason: collision with other method in class */
        public boolean m631e() {
            return this.e;
        }

        public b a(int i) {
            this.f909c = true;
            this.f14854a = i;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public boolean mo668b() {
            return this.f907a;
        }

        /* renamed from: c  reason: collision with other method in class */
        public boolean m629c() {
            return this.f909c;
        }

        @Override // com.xiaomi.push.e
        public b a(com.xiaomi.push.b bVar) {
            while (true) {
                int a2 = bVar.m491a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 8) {
                    a(bVar.m497a());
                } else if (a2 == 24) {
                    a(bVar.m500b());
                } else if (a2 == 32) {
                    b(bVar.m500b());
                } else if (a2 == 40) {
                    c(bVar.m500b());
                } else if (!a(bVar, a2)) {
                    return this;
                }
            }
        }

        public b a(boolean z) {
            this.f907a = true;
            this.f908b = z;
            return this;
        }

        public static b a(byte[] bArr) {
            return (b) new b().a(bArr);
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo668b()) {
                cVar.m534a(1, mo666a());
            }
            if (m629c()) {
                cVar.m529a(3, c());
            }
            if (m630d()) {
                cVar.m529a(4, d());
            }
            if (m631e()) {
                cVar.m529a(5, e());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public boolean mo666a() {
            return this.f908b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f912a;

        /* renamed from: b  reason: collision with other field name */
        private boolean f913b;

        /* renamed from: c  reason: collision with other field name */
        private boolean f914c;

        /* renamed from: d  reason: collision with other field name */
        private boolean f915d;

        /* renamed from: e  reason: collision with other field name */
        private boolean f916e;

        /* renamed from: f  reason: collision with other field name */
        private boolean f917f;

        /* renamed from: a  reason: collision with other field name */
        private String f911a = "";
        private String b = "";
        private String c = "";
        private String d = "";
        private String e = "";
        private String f = "";

        /* renamed from: a  reason: collision with root package name */
        private int f14855a = -1;

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo666a() {
            if (this.f14855a < 0) {
                mo668b();
            }
            return this.f14855a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo668b() {
            int a2 = mo666a() ? com.xiaomi.push.c.a(1, mo666a()) : 0;
            if (mo668b()) {
                a2 += com.xiaomi.push.c.a(2, mo668b());
            }
            if (m634c()) {
                a2 += com.xiaomi.push.c.a(3, c());
            }
            if (m635d()) {
                a2 += com.xiaomi.push.c.a(4, d());
            }
            if (m636e()) {
                a2 += com.xiaomi.push.c.a(5, e());
            }
            if (m637f()) {
                a2 += com.xiaomi.push.c.a(6, f());
            }
            this.f14855a = a2;
            return a2;
        }

        public c c(String str) {
            this.f914c = true;
            this.c = str;
            return this;
        }

        public c d(String str) {
            this.f915d = true;
            this.d = str;
            return this;
        }

        public c e(String str) {
            this.f916e = true;
            this.e = str;
            return this;
        }

        public c f(String str) {
            this.f917f = true;
            this.f = str;
            return this;
        }

        public c b(String str) {
            this.f913b = true;
            this.b = str;
            return this;
        }

        public String c() {
            return this.c;
        }

        public String d() {
            return this.d;
        }

        public String e() {
            return this.e;
        }

        public String f() {
            return this.f;
        }

        @Override // com.xiaomi.push.e
        public c a(com.xiaomi.push.b bVar) {
            while (true) {
                int a2 = bVar.m491a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 10) {
                    a(bVar.m494a());
                } else if (a2 == 18) {
                    b(bVar.m494a());
                } else if (a2 == 26) {
                    c(bVar.m494a());
                } else if (a2 == 34) {
                    d(bVar.m494a());
                } else if (a2 == 42) {
                    e(bVar.m494a());
                } else if (a2 == 50) {
                    f(bVar.m494a());
                } else if (!a(bVar, a2)) {
                    return this;
                }
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public String mo668b() {
            return this.b;
        }

        /* renamed from: c  reason: collision with other method in class */
        public boolean m634c() {
            return this.f914c;
        }

        /* renamed from: d  reason: collision with other method in class */
        public boolean m635d() {
            return this.f915d;
        }

        /* renamed from: e  reason: collision with other method in class */
        public boolean m636e() {
            return this.f916e;
        }

        /* renamed from: f  reason: collision with other method in class */
        public boolean m637f() {
            return this.f917f;
        }

        public c a(String str) {
            this.f912a = true;
            this.f911a = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public boolean mo668b() {
            return this.f913b;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public String mo666a() {
            return this.f911a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo666a()) {
                cVar.m533a(1, mo666a());
            }
            if (mo668b()) {
                cVar.m533a(2, mo668b());
            }
            if (m634c()) {
                cVar.m533a(3, c());
            }
            if (m635d()) {
                cVar.m533a(4, d());
            }
            if (m636e()) {
                cVar.m533a(5, e());
            }
            if (m637f()) {
                cVar.m533a(6, f());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public boolean mo666a() {
            return this.f912a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class d extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f919a;

        /* renamed from: c  reason: collision with other field name */
        private boolean f921c;
        private boolean d;
        private boolean e;

        /* renamed from: b  reason: collision with other field name */
        private boolean f920b = false;

        /* renamed from: a  reason: collision with other field name */
        private String f918a = "";
        private String b = "";
        private String c = "";

        /* renamed from: a  reason: collision with root package name */
        private int f14856a = -1;

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo666a() {
            if (this.f14856a < 0) {
                mo668b();
            }
            return this.f14856a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo668b() {
            int a2 = mo668b() ? com.xiaomi.push.c.a(1, mo666a()) : 0;
            if (m640c()) {
                a2 += com.xiaomi.push.c.a(2, mo666a());
            }
            if (d()) {
                a2 += com.xiaomi.push.c.a(3, mo668b());
            }
            if (e()) {
                a2 += com.xiaomi.push.c.a(4, c());
            }
            this.f14856a = a2;
            return a2;
        }

        public d c(String str) {
            this.e = true;
            this.c = str;
            return this;
        }

        public boolean d() {
            return this.d;
        }

        public boolean e() {
            return this.e;
        }

        public d b(String str) {
            this.d = true;
            this.b = str;
            return this;
        }

        public String c() {
            return this.c;
        }

        @Override // com.xiaomi.push.e
        public d a(com.xiaomi.push.b bVar) {
            while (true) {
                int a2 = bVar.m491a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 8) {
                    a(bVar.m497a());
                } else if (a2 == 18) {
                    a(bVar.m494a());
                } else if (a2 == 26) {
                    b(bVar.m494a());
                } else if (a2 == 34) {
                    c(bVar.m494a());
                } else if (!a(bVar, a2)) {
                    return this;
                }
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public String mo668b() {
            return this.b;
        }

        /* renamed from: c  reason: collision with other method in class */
        public boolean m640c() {
            return this.f921c;
        }

        public d a(String str) {
            this.f921c = true;
            this.f918a = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public boolean mo668b() {
            return this.f919a;
        }

        public d a(boolean z) {
            this.f919a = true;
            this.f920b = z;
            return this;
        }

        public static d a(byte[] bArr) {
            return (d) new d().a(bArr);
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public String mo666a() {
            return this.f918a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo668b()) {
                cVar.m534a(1, mo666a());
            }
            if (m640c()) {
                cVar.m533a(2, mo666a());
            }
            if (d()) {
                cVar.m533a(3, mo668b());
            }
            if (e()) {
                cVar.m533a(4, c());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public boolean mo666a() {
            return this.f920b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class e extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private com.xiaomi.push.a f922a;

        /* renamed from: a  reason: collision with other field name */
        private boolean f925a;

        /* renamed from: b  reason: collision with other field name */
        private com.xiaomi.push.a f926b;

        /* renamed from: b  reason: collision with other field name */
        private boolean f928b;

        /* renamed from: c  reason: collision with other field name */
        private boolean f930c;

        /* renamed from: d  reason: collision with other field name */
        private boolean f932d;

        /* renamed from: e  reason: collision with other field name */
        private boolean f934e;

        /* renamed from: f  reason: collision with other field name */
        private boolean f935f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        private boolean m;

        /* renamed from: a  reason: collision with root package name */
        private int f14857a = 0;

        /* renamed from: a  reason: collision with other field name */
        private String f924a = "";

        /* renamed from: b  reason: collision with other field name */
        private String f927b = "";

        /* renamed from: c  reason: collision with other field name */
        private String f929c = "";
        private int b = 0;

        /* renamed from: d  reason: collision with other field name */
        private String f931d = "";

        /* renamed from: e  reason: collision with other field name */
        private String f933e = "";
        private String f = "";

        /* renamed from: a  reason: collision with other field name */
        private b f923a = null;
        private int c = 0;
        private int d = 0;
        private int e = -1;

        public e() {
            com.xiaomi.push.a aVar = com.xiaomi.push.a.f14746a;
            this.f922a = aVar;
            this.f926b = aVar;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo666a() {
            if (this.e < 0) {
                mo668b();
            }
            return this.e;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo668b() {
            int b = mo666a() ? com.xiaomi.push.c.b(1, c()) : 0;
            if (mo668b()) {
                b += com.xiaomi.push.c.a(2, mo666a());
            }
            if (m646c()) {
                b += com.xiaomi.push.c.a(3, mo668b());
            }
            if (m648d()) {
                b += com.xiaomi.push.c.a(4, m645c());
            }
            if (m650e()) {
                b += com.xiaomi.push.c.a(5, d());
            }
            if (m652f()) {
                b += com.xiaomi.push.c.a(6, m647d());
            }
            if (g()) {
                b += com.xiaomi.push.c.a(7, m649e());
            }
            if (h()) {
                b += com.xiaomi.push.c.a(8, m651f());
            }
            if (i()) {
                b += com.xiaomi.push.c.a(9, (com.xiaomi.push.e) mo666a());
            }
            if (j()) {
                b += com.xiaomi.push.c.a(10, e());
            }
            if (k()) {
                b += com.xiaomi.push.c.a(11, mo666a());
            }
            if (l()) {
                b += com.xiaomi.push.c.a(12, mo668b());
            }
            if (m()) {
                b += com.xiaomi.push.c.a(13, f());
            }
            this.e = b;
            return b;
        }

        public int c() {
            return this.f14857a;
        }

        public int d() {
            return this.b;
        }

        public int e() {
            return this.c;
        }

        public int f() {
            return this.d;
        }

        public boolean g() {
            return this.g;
        }

        public boolean h() {
            return this.h;
        }

        public boolean i() {
            return this.i;
        }

        public boolean j() {
            return this.j;
        }

        public boolean k() {
            return this.k;
        }

        public boolean l() {
            return this.l;
        }

        public boolean m() {
            return this.m;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public com.xiaomi.push.a mo666a() {
            return this.f922a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public com.xiaomi.push.a mo668b() {
            return this.f926b;
        }

        public e c(int i) {
            this.j = true;
            this.c = i;
            return this;
        }

        public e d(int i) {
            this.m = true;
            this.d = i;
            return this;
        }

        public e e(String str) {
            this.g = true;
            this.f933e = str;
            return this;
        }

        public e f(String str) {
            this.h = true;
            this.f = str;
            return this;
        }

        public e b(int i) {
            this.f934e = true;
            this.b = i;
            return this;
        }

        public e c(String str) {
            this.f932d = true;
            this.f929c = str;
            return this;
        }

        public e d(String str) {
            this.f935f = true;
            this.f931d = str;
            return this;
        }

        /* renamed from: e  reason: collision with other method in class */
        public String m649e() {
            return this.f933e;
        }

        /* renamed from: f  reason: collision with other method in class */
        public String m651f() {
            return this.f;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public b mo666a() {
            return this.f923a;
        }

        public e b(com.xiaomi.push.a aVar) {
            this.l = true;
            this.f926b = aVar;
            return this;
        }

        /* renamed from: c  reason: collision with other method in class */
        public String m645c() {
            return this.f929c;
        }

        /* renamed from: d  reason: collision with other method in class */
        public String m647d() {
            return this.f931d;
        }

        /* renamed from: e  reason: collision with other method in class */
        public boolean m650e() {
            return this.f934e;
        }

        /* renamed from: f  reason: collision with other method in class */
        public boolean m652f() {
            return this.f935f;
        }

        public e a(int i) {
            this.f925a = true;
            this.f14857a = i;
            return this;
        }

        public e b(String str) {
            this.f930c = true;
            this.f927b = str;
            return this;
        }

        /* renamed from: c  reason: collision with other method in class */
        public boolean m646c() {
            return this.f930c;
        }

        /* renamed from: d  reason: collision with other method in class */
        public boolean m648d() {
            return this.f932d;
        }

        public e a(com.xiaomi.push.a aVar) {
            this.k = true;
            this.f922a = aVar;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public String mo668b() {
            return this.f927b;
        }

        @Override // com.xiaomi.push.e
        public e a(com.xiaomi.push.b bVar) {
            while (true) {
                int a2 = bVar.m491a();
                switch (a2) {
                    case 0:
                        return this;
                    case 8:
                        a(bVar.c());
                        break;
                    case 18:
                        a(bVar.m494a());
                        break;
                    case 26:
                        b(bVar.m494a());
                        break;
                    case 34:
                        c(bVar.m494a());
                        break;
                    case 40:
                        b(bVar.m500b());
                        break;
                    case 50:
                        d(bVar.m494a());
                        break;
                    case 58:
                        e(bVar.m494a());
                        break;
                    case 66:
                        f(bVar.m494a());
                        break;
                    case 74:
                        b bVar2 = new b();
                        bVar.a(bVar2);
                        a(bVar2);
                        break;
                    case 80:
                        c(bVar.m500b());
                        break;
                    case 90:
                        a(bVar.m493a());
                        break;
                    case 98:
                        b(bVar.m493a());
                        break;
                    case 104:
                        d(bVar.m500b());
                        break;
                    default:
                        if (a(bVar, a2)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public boolean mo668b() {
            return this.f928b;
        }

        public e a(b bVar) {
            bVar.getClass();
            this.i = true;
            this.f923a = bVar;
            return this;
        }

        public e a(String str) {
            this.f928b = true;
            this.f924a = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public String mo666a() {
            return this.f924a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo666a()) {
                cVar.m542b(1, c());
            }
            if (mo668b()) {
                cVar.m533a(2, mo666a());
            }
            if (m646c()) {
                cVar.m533a(3, mo668b());
            }
            if (m648d()) {
                cVar.m533a(4, m645c());
            }
            if (m650e()) {
                cVar.m529a(5, d());
            }
            if (m652f()) {
                cVar.m533a(6, m647d());
            }
            if (g()) {
                cVar.m533a(7, m649e());
            }
            if (h()) {
                cVar.m533a(8, m651f());
            }
            if (i()) {
                cVar.m532a(9, (com.xiaomi.push.e) mo666a());
            }
            if (j()) {
                cVar.m529a(10, e());
            }
            if (k()) {
                cVar.m531a(11, mo666a());
            }
            if (l()) {
                cVar.m531a(12, mo668b());
            }
            if (m()) {
                cVar.m529a(13, f());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public boolean mo666a() {
            return this.f925a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class f extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f938a;

        /* renamed from: b  reason: collision with other field name */
        private boolean f939b;
        private boolean c;

        /* renamed from: a  reason: collision with other field name */
        private String f937a = "";
        private String b = "";

        /* renamed from: a  reason: collision with other field name */
        private b f936a = null;

        /* renamed from: a  reason: collision with root package name */
        private int f14858a = -1;

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo666a() {
            if (this.f14858a < 0) {
                mo668b();
            }
            return this.f14858a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo668b() {
            int a2 = mo666a() ? com.xiaomi.push.c.a(1, mo666a()) : 0;
            if (mo668b()) {
                a2 += com.xiaomi.push.c.a(2, mo668b());
            }
            if (c()) {
                a2 += com.xiaomi.push.c.a(3, (com.xiaomi.push.e) mo666a());
            }
            this.f14858a = a2;
            return a2;
        }

        public boolean c() {
            return this.c;
        }

        public f b(String str) {
            this.f939b = true;
            this.b = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public b mo666a() {
            return this.f936a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public String mo668b() {
            return this.b;
        }

        @Override // com.xiaomi.push.e
        public f a(com.xiaomi.push.b bVar) {
            while (true) {
                int a2 = bVar.m491a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 10) {
                    a(bVar.m494a());
                } else if (a2 == 18) {
                    b(bVar.m494a());
                } else if (a2 == 26) {
                    b bVar2 = new b();
                    bVar.a(bVar2);
                    a(bVar2);
                } else if (!a(bVar, a2)) {
                    return this;
                }
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public boolean mo668b() {
            return this.f939b;
        }

        public f a(b bVar) {
            bVar.getClass();
            this.c = true;
            this.f936a = bVar;
            return this;
        }

        public f a(String str) {
            this.f938a = true;
            this.f937a = str;
            return this;
        }

        public static f a(byte[] bArr) {
            return (f) new f().a(bArr);
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public String mo666a() {
            return this.f937a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo666a()) {
                cVar.m533a(1, mo666a());
            }
            if (mo668b()) {
                cVar.m533a(2, mo668b());
            }
            if (c()) {
                cVar.m532a(3, (com.xiaomi.push.e) mo666a());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public boolean mo666a() {
            return this.f938a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class g extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f941a;

        /* renamed from: b  reason: collision with other field name */
        private boolean f942b;

        /* renamed from: c  reason: collision with other field name */
        private boolean f943c;

        /* renamed from: a  reason: collision with other field name */
        private String f940a = "";
        private String b = "";
        private String c = "";

        /* renamed from: a  reason: collision with root package name */
        private int f14859a = -1;

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo666a() {
            if (this.f14859a < 0) {
                mo668b();
            }
            return this.f14859a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo668b() {
            int a2 = mo666a() ? com.xiaomi.push.c.a(1, mo666a()) : 0;
            if (mo668b()) {
                a2 += com.xiaomi.push.c.a(2, mo668b());
            }
            if (m658c()) {
                a2 += com.xiaomi.push.c.a(3, c());
            }
            this.f14859a = a2;
            return a2;
        }

        public g c(String str) {
            this.f943c = true;
            this.c = str;
            return this;
        }

        public g b(String str) {
            this.f942b = true;
            this.b = str;
            return this;
        }

        public String c() {
            return this.c;
        }

        @Override // com.xiaomi.push.e
        public g a(com.xiaomi.push.b bVar) {
            while (true) {
                int a2 = bVar.m491a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 10) {
                    a(bVar.m494a());
                } else if (a2 == 18) {
                    b(bVar.m494a());
                } else if (a2 == 26) {
                    c(bVar.m494a());
                } else if (!a(bVar, a2)) {
                    return this;
                }
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public String mo668b() {
            return this.b;
        }

        /* renamed from: c  reason: collision with other method in class */
        public boolean m658c() {
            return this.f943c;
        }

        public g a(String str) {
            this.f941a = true;
            this.f940a = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public boolean mo668b() {
            return this.f942b;
        }

        public static g a(byte[] bArr) {
            return (g) new g().a(bArr);
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public String mo666a() {
            return this.f940a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo666a()) {
                cVar.m533a(1, mo666a());
            }
            if (mo668b()) {
                cVar.m533a(2, mo668b());
            }
            if (m658c()) {
                cVar.m533a(3, c());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public boolean mo666a() {
            return this.f941a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class h extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f945a;

        /* renamed from: b  reason: collision with other field name */
        private boolean f946b;

        /* renamed from: a  reason: collision with root package name */
        private int f14860a = 0;

        /* renamed from: a  reason: collision with other field name */
        private String f944a = "";
        private int b = -1;

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo666a() {
            if (this.b < 0) {
                mo668b();
            }
            return this.b;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo668b() {
            int a2 = mo666a() ? com.xiaomi.push.c.a(1, c()) : 0;
            if (mo668b()) {
                a2 += com.xiaomi.push.c.a(2, mo666a());
            }
            this.b = a2;
            return a2;
        }

        public int c() {
            return this.f14860a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public boolean mo668b() {
            return this.f946b;
        }

        public h a(int i) {
            this.f945a = true;
            this.f14860a = i;
            return this;
        }

        @Override // com.xiaomi.push.e
        public h a(com.xiaomi.push.b bVar) {
            while (true) {
                int a2 = bVar.m491a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 8) {
                    a(bVar.m500b());
                } else if (a2 == 18) {
                    a(bVar.m494a());
                } else if (!a(bVar, a2)) {
                    return this;
                }
            }
        }

        public h a(String str) {
            this.f946b = true;
            this.f944a = str;
            return this;
        }

        public static h a(byte[] bArr) {
            return (h) new h().a(bArr);
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public String mo666a() {
            return this.f944a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo666a()) {
                cVar.m529a(1, c());
            }
            if (mo668b()) {
                cVar.m533a(2, mo666a());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public boolean mo666a() {
            return this.f945a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class i extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f948a;

        /* renamed from: a  reason: collision with other field name */
        private com.xiaomi.push.a f947a = com.xiaomi.push.a.f14746a;

        /* renamed from: a  reason: collision with root package name */
        private int f14861a = -1;

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo666a() {
            if (this.f14861a < 0) {
                mo668b();
            }
            return this.f14861a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo668b() {
            int i;
            if (mo666a()) {
                i = com.xiaomi.push.c.a(1, mo666a());
            } else {
                i = 0;
            }
            this.f14861a = i;
            return i;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public com.xiaomi.push.a mo666a() {
            return this.f947a;
        }

        public i a(com.xiaomi.push.a aVar) {
            this.f948a = true;
            this.f947a = aVar;
            return this;
        }

        @Override // com.xiaomi.push.e
        public i a(com.xiaomi.push.b bVar) {
            while (true) {
                int a2 = bVar.m491a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 10) {
                    a(bVar.m493a());
                } else if (!a(bVar, a2)) {
                    return this;
                }
            }
        }

        public static i a(byte[] bArr) {
            return (i) new i().a(bArr);
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo666a()) {
                cVar.m531a(1, mo666a());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public boolean mo666a() {
            return this.f948a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class j extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f951a;
        private boolean b;

        /* renamed from: a  reason: collision with other field name */
        private com.xiaomi.push.a f949a = com.xiaomi.push.a.f14746a;

        /* renamed from: a  reason: collision with other field name */
        private b f950a = null;

        /* renamed from: a  reason: collision with root package name */
        private int f14862a = -1;

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo666a() {
            if (this.f14862a < 0) {
                mo668b();
            }
            return this.f14862a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo668b() {
            int a2 = mo666a() ? com.xiaomi.push.c.a(1, mo666a()) : 0;
            if (mo668b()) {
                a2 += com.xiaomi.push.c.a(2, (com.xiaomi.push.e) mo666a());
            }
            this.f14862a = a2;
            return a2;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public com.xiaomi.push.a mo666a() {
            return this.f949a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public boolean mo668b() {
            return this.b;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public b mo666a() {
            return this.f950a;
        }

        public j a(com.xiaomi.push.a aVar) {
            this.f951a = true;
            this.f949a = aVar;
            return this;
        }

        @Override // com.xiaomi.push.e
        public j a(com.xiaomi.push.b bVar) {
            while (true) {
                int a2 = bVar.m491a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 10) {
                    a(bVar.m493a());
                } else if (a2 == 18) {
                    b bVar2 = new b();
                    bVar.a(bVar2);
                    a(bVar2);
                } else if (!a(bVar, a2)) {
                    return this;
                }
            }
        }

        public j a(b bVar) {
            bVar.getClass();
            this.b = true;
            this.f950a = bVar;
            return this;
        }

        public static j a(byte[] bArr) {
            return (j) new j().a(bArr);
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo666a()) {
                cVar.m531a(1, mo666a());
            }
            if (mo668b()) {
                cVar.m532a(2, (com.xiaomi.push.e) mo666a());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public boolean mo666a() {
            return this.f951a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class k extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f954a;

        /* renamed from: b  reason: collision with other field name */
        private boolean f957b;
        private boolean c;
        private boolean d;
        private boolean e;
        private boolean g;

        /* renamed from: a  reason: collision with other field name */
        private String f953a = "";

        /* renamed from: b  reason: collision with other field name */
        private String f956b = "";

        /* renamed from: a  reason: collision with other field name */
        private long f952a = 0;

        /* renamed from: b  reason: collision with other field name */
        private long f955b = 0;
        private boolean f = false;

        /* renamed from: a  reason: collision with root package name */
        private int f14863a = 0;
        private int b = -1;

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo666a() {
            if (this.b < 0) {
                mo668b();
            }
            return this.b;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo668b() {
            int a2 = mo666a() ? com.xiaomi.push.c.a(1, mo666a()) : 0;
            if (mo668b()) {
                a2 += com.xiaomi.push.c.a(2, mo668b());
            }
            if (m669c()) {
                a2 += com.xiaomi.push.c.a(3, mo666a());
            }
            if (d()) {
                a2 += com.xiaomi.push.c.a(4, mo668b());
            }
            if (f()) {
                a2 += com.xiaomi.push.c.a(5, e());
            }
            if (g()) {
                a2 += com.xiaomi.push.c.a(6, c());
            }
            this.b = a2;
            return a2;
        }

        public int c() {
            return this.f14863a;
        }

        public boolean d() {
            return this.d;
        }

        public boolean e() {
            return this.f;
        }

        public boolean f() {
            return this.e;
        }

        public boolean g() {
            return this.g;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public long mo666a() {
            return this.f952a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public long mo668b() {
            return this.f955b;
        }

        /* renamed from: c  reason: collision with other method in class */
        public boolean m669c() {
            return this.c;
        }

        public k b(long j) {
            this.d = true;
            this.f955b = j;
            return this;
        }

        public k a(int i) {
            this.g = true;
            this.f14863a = i;
            return this;
        }

        public k b(String str) {
            this.f957b = true;
            this.f956b = str;
            return this;
        }

        public k a(long j) {
            this.c = true;
            this.f952a = j;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public String mo668b() {
            return this.f956b;
        }

        @Override // com.xiaomi.push.e
        public k a(com.xiaomi.push.b bVar) {
            while (true) {
                int a2 = bVar.m491a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 10) {
                    a(bVar.m494a());
                } else if (a2 == 18) {
                    b(bVar.m494a());
                } else if (a2 == 24) {
                    a(bVar.m492a());
                } else if (a2 == 32) {
                    b(bVar.m492a());
                } else if (a2 == 40) {
                    a(bVar.m497a());
                } else if (a2 == 48) {
                    a(bVar.m500b());
                } else if (!a(bVar, a2)) {
                    return this;
                }
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public boolean mo668b() {
            return this.f957b;
        }

        public k a(String str) {
            this.f954a = true;
            this.f953a = str;
            return this;
        }

        public k a(boolean z) {
            this.e = true;
            this.f = z;
            return this;
        }

        public static k a(byte[] bArr) {
            return (k) new k().a(bArr);
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public String mo666a() {
            return this.f953a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo666a()) {
                cVar.m533a(1, mo666a());
            }
            if (mo668b()) {
                cVar.m533a(2, mo668b());
            }
            if (m669c()) {
                cVar.m530a(3, mo666a());
            }
            if (d()) {
                cVar.m530a(4, mo668b());
            }
            if (f()) {
                cVar.m534a(5, e());
            }
            if (g()) {
                cVar.m529a(6, c());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public boolean mo666a() {
            return this.f954a;
        }
    }
}
