package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class szh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f28371a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;

    public szh(int i, String str, String str2, int i2, String str3) {
        ckf.g(str, jk.KEY_RET_CODE);
        ckf.g(str2, jk.KEY_RET_MSG);
        ckf.g(str3, jk.KEY_MAPPING_CODE);
        this.f28371a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = str3;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d754d74", new Object[]{this});
        }
        return this.e;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("baa782be", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f243c01", new Object[]{this});
        }
        return this.b;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a526aea3", new Object[]{this});
        }
        return this.c;
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f085b797", new Object[]{this})).intValue();
        }
        return this.f28371a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof szh) {
                szh szhVar = (szh) obj;
                if (this.f28371a != szhVar.f28371a || !ckf.b(this.b, szhVar.b) || !ckf.b(this.c, szhVar.c) || this.d != szhVar.d || !ckf.b(this.e, szhVar.e)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i4 = this.f28371a * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i4 + i) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (((i5 + i2) * 31) + this.d) * 31;
        String str3 = this.e;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i6 + i3;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MainErrorResponse(seqNum=" + this.f28371a + ", retCode=" + this.b + ", retMsg=" + this.c + ", responseCode=" + this.d + ", mappingCode=" + this.e + f7l.BRACKET_END_STR;
    }
}
