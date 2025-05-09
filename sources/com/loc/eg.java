package com.loc;

import com.uc.webview.base.cyclone.BSError;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class eg {

    /* renamed from: a  reason: collision with root package name */
    public long f5665a;
    public String b;
    public int d;
    public long e;
    public short g;
    public boolean h;
    public int c = BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA;
    public long f = 0;

    public eg(boolean z) {
        this.h = z;
    }

    public static long a(String str) {
        if (str == null || str.length() == 0) {
            return 0L;
        }
        int i = 0;
        long j = 0;
        for (int length = str.length() - 1; length >= 0; length--) {
            long charAt = str.charAt(length);
            long j2 = 48;
            if (charAt < 48 || charAt > 57) {
                if (charAt >= 97 && charAt <= 102) {
                    j2 = 87;
                } else if (charAt < 65 || charAt > 70) {
                    if (!(charAt == 58 || charAt == 124)) {
                        return 0L;
                    }
                } else {
                    j2 = 55;
                }
            }
            j += (charAt - j2) << i;
            i += 4;
        }
        if (i != 48) {
            return 0L;
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public eg clone() {
        eg egVar = new eg(this.h);
        egVar.f5665a = this.f5665a;
        egVar.b = this.b;
        egVar.c = this.c;
        egVar.d = this.d;
        egVar.e = this.e;
        egVar.f = this.f;
        egVar.g = this.g;
        egVar.h = this.h;
        return egVar;
    }

    public final String toString() {
        return "AmapWifi{mac=" + this.f5665a + ", ssid='" + this.b + "', rssi=" + this.c + ", frequency=" + this.d + ", timestamp=" + this.e + ", lastUpdateUtcMills=" + this.f + ", freshness=" + ((int) this.g) + ", connected=" + this.h + '}';
    }

    public final String a() {
        return this.h + "#" + this.f5665a;
    }

    public static String a(long j) {
        if (j < 0 || j > 281474976710655L) {
            return null;
        }
        return eo.a(eo.a(j), ":");
    }
}
