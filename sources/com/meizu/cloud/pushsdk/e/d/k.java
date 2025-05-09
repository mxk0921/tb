package com.meizu.cloud.pushsdk.e.d;

import com.meizu.cloud.pushsdk.e.d.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final i f5831a;
    private final int b;
    private final String c;
    private final c d;
    private final l e;
    private final k f;
    private final k g;
    private final k h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private i f5832a;
        private String c;
        private l e;
        private k f;
        private k g;
        private k h;
        private int b = -1;
        private c.b d = new c.b();

        public b a(int i) {
            this.b = i;
            return this;
        }

        public b a(c cVar) {
            this.d = cVar.b();
            return this;
        }

        public b a(i iVar) {
            this.f5832a = iVar;
            return this;
        }

        public b a(l lVar) {
            this.e = lVar;
            return this;
        }

        public b a(String str) {
            this.c = str;
            return this;
        }

        public k a() {
            if (this.f5832a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.b >= 0) {
                return new k(this);
            } else {
                throw new IllegalStateException("code < 0: " + this.b);
            }
        }
    }

    private k(b bVar) {
        this.f5831a = bVar.f5832a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d.a();
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
    }

    public l a() {
        return this.e;
    }

    public int b() {
        return this.b;
    }

    public String toString() {
        return "Response{protocol=, code=" + this.b + ", message=" + this.c + ", url=" + this.f5831a.e() + '}';
    }
}
