package com.alibaba.wireless.security.middletierplugin.open.fc.strategy;

/* renamed from: com.alibaba.wireless.security.middletierplugin.open.fc.strategy.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0129 {

    /* renamed from: com.alibaba.wireless.security.middletierplugin.open.fc.strategy.а$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    public enum EnumC0130 {
        SUCCESS(0),
        FAIL(1),
        CANCEL(2),
        RETRY(4),
        TIMEOUT(8);
        

        /* renamed from: а  reason: contains not printable characters */
        private int f124;

        EnumC0130(int i) {
            this.f124 = 0;
            this.f124 = i;
        }

        /* renamed from: а  reason: contains not printable characters */
        public int m92() {
            return this.f124;
        }
    }

    /* renamed from: com.alibaba.wireless.security.middletierplugin.open.fc.strategy.а$б  reason: contains not printable characters */
    /* loaded from: classes.dex */
    enum EnumC0131 {
        WUA(1),
        NC(2),
        FL(4),
        LOGIN(8),
        DENY(16);
        

        /* renamed from: а  reason: contains not printable characters */
        private long f131;

        EnumC0131(long j) {
            this.f131 = 0L;
            this.f131 = j;
        }

        /* renamed from: а  reason: contains not printable characters */
        public long m93() {
            return this.f131;
        }
    }
}
