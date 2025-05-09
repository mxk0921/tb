package com.alibaba.wireless.security.securitybody;

/* renamed from: com.alibaba.wireless.security.securitybody.е  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0191 {

    /* renamed from: а  reason: contains not printable characters */
    private int f490;

    /* renamed from: б  reason: contains not printable characters */
    private String f491;

    /* renamed from: в  reason: contains not printable characters */
    private String f492;

    /* renamed from: г  reason: contains not printable characters */
    private long f493;

    /* renamed from: д  reason: contains not printable characters */
    private String f494;

    /* renamed from: е  reason: contains not printable characters */
    private String f495;

    /* renamed from: ё  reason: contains not printable characters */
    private long f496;

    /* renamed from: com.alibaba.wireless.security.securitybody.е$б  reason: contains not printable characters */
    /* loaded from: classes.dex */
    public static class C0193 {

        /* renamed from: а  reason: contains not printable characters */
        private int f497;

        /* renamed from: б  reason: contains not printable characters */
        String f498;

        /* renamed from: в  reason: contains not printable characters */
        private String f499;

        /* renamed from: г  reason: contains not printable characters */
        String f500;

        /* renamed from: д  reason: contains not printable characters */
        String f501;

        /* renamed from: е  reason: contains not printable characters */
        long f502;

        /* renamed from: ё  reason: contains not printable characters */
        private long f503;

        /* renamed from: г  reason: contains not printable characters */
        public C0191 m309() {
            return new C0191(this);
        }

        /* renamed from: д  reason: contains not printable characters */
        public C0193 m310(long j) {
            this.f503 = j;
            return this;
        }

        /* renamed from: е  reason: contains not printable characters */
        public C0193 m311(String str) {
            this.f499 = str;
            return this;
        }

        /* renamed from: ж  reason: contains not printable characters */
        public C0193 m312(C0191 r3) {
            if (r3 == null) {
                return this;
            }
            this.f500 = r3.f492;
            this.f501 = r3.f491;
            this.f502 = r3.f493;
            return this;
        }

        /* renamed from: з  reason: contains not printable characters */
        public C0193 m313(String str) {
            this.f498 = str;
            return this;
        }

        /* renamed from: ё  reason: contains not printable characters */
        public C0193 m314(int i) {
            this.f497 = i;
            return this;
        }
    }

    private C0191(C0193 r4) {
        this.f490 = -1;
        this.f491 = "";
        this.f492 = "";
        this.f493 = -1L;
        this.f494 = "";
        this.f495 = "";
        this.f496 = -1L;
        this.f490 = r4.f497;
        this.f491 = r4.f499;
        this.f494 = r4.f500;
        this.f495 = r4.f501;
        this.f496 = r4.f502;
        this.f493 = r4.f503;
        this.f492 = r4.f498;
    }

    public String toString() {
        return this.f490 + "_" + this.f491 + "_" + this.f495 + "_" + this.f494 + "_" + this.f496;
    }
}
