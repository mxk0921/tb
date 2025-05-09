package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class el {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f890a;

        /* renamed from: b  reason: collision with other field name */
        private boolean f891b;
        private boolean d;
        private boolean e;

        /* renamed from: a  reason: collision with root package name */
        private int f14852a = 0;

        /* renamed from: c  reason: collision with other field name */
        private boolean f892c = false;
        private int b = 0;
        private boolean f = false;

        /* renamed from: a  reason: collision with other field name */
        private List<String> f889a = Collections.emptyList();
        private int c = -1;

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo666a() {
            if (this.c < 0) {
                mo668b();
            }
            return this.c;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo668b() {
            int i = 0;
            int b = mo666a() ? c.b(1, c()) : 0;
            if (m611c()) {
                b += c.a(2, mo668b());
            }
            if (m612d()) {
                b += c.a(3, d());
            }
            if (f()) {
                b += c.a(4, m613e());
            }
            for (String str : mo666a()) {
                i += c.a(str);
            }
            int size = b + i + mo666a().size();
            this.c = size;
            return size;
        }

        public int c() {
            return this.f14852a;
        }

        public int d() {
            return this.b;
        }

        public int e() {
            return this.f889a.size();
        }

        public boolean f() {
            return this.e;
        }

        public a b(int i) {
            this.d = true;
            this.b = i;
            return this;
        }

        /* renamed from: c  reason: collision with other method in class */
        public boolean m611c() {
            return this.f891b;
        }

        /* renamed from: d  reason: collision with other method in class */
        public boolean m612d() {
            return this.d;
        }

        /* renamed from: e  reason: collision with other method in class */
        public boolean m613e() {
            return this.f;
        }

        public static a b(b bVar) {
            return new a().a(bVar);
        }

        public a a(int i) {
            this.f890a = true;
            this.f14852a = i;
            return this;
        }

        @Override // com.xiaomi.push.e
        public a a(b bVar) {
            while (true) {
                int a2 = bVar.m491a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 8) {
                    a(bVar.c());
                } else if (a2 == 16) {
                    a(bVar.m497a());
                } else if (a2 == 24) {
                    b(bVar.m500b());
                } else if (a2 == 32) {
                    b(bVar.m497a());
                } else if (a2 == 42) {
                    a(bVar.m494a());
                } else if (!a(bVar, a2)) {
                    return this;
                }
            }
        }

        public a b(boolean z) {
            this.e = true;
            this.f = z;
            return this;
        }

        public a a(String str) {
            str.getClass();
            if (this.f889a.isEmpty()) {
                this.f889a = new ArrayList();
            }
            this.f889a.add(str);
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public boolean mo668b() {
            return this.f892c;
        }

        public a a(boolean z) {
            this.f891b = true;
            this.f892c = z;
            return this;
        }

        public static a a(byte[] bArr) {
            return (a) new a().a(bArr);
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public List<String> mo666a() {
            return this.f889a;
        }

        @Override // com.xiaomi.push.e
        public void a(c cVar) {
            if (mo666a()) {
                cVar.m542b(1, c());
            }
            if (m611c()) {
                cVar.m534a(2, mo668b());
            }
            if (m612d()) {
                cVar.m529a(3, d());
            }
            if (f()) {
                cVar.m534a(4, m613e());
            }
            for (String str : mo666a()) {
                cVar.m533a(5, str);
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public boolean mo666a() {
            return this.f890a;
        }
    }
}
