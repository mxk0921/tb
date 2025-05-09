package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class hbv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f20533a;
    public final String b;
    public final boolean c;
    public final long d;

    static {
        t2o.a(157286859);
    }

    public hbv(String str, String str2, boolean z, long j) {
        ckf.g(str, "bizName");
        ckf.g(str2, "downloadStage");
        this.f20533a = str;
        this.b = str2;
        this.c = z;
        this.d = j;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.f20533a;
    }

    public final long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee424fb5", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec69d759", new Object[]{this});
        }
        return this.b;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c9124ce", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof hbv) {
                hbv hbvVar = (hbv) obj;
                if (!ckf.b(this.f20533a, hbvVar.f20533a) || !ckf.b(this.b, hbvVar.b) || this.c != hbvVar.c || this.d != hbvVar.d) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f20533a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        boolean z = this.c;
        if (!z) {
            i3 = z ? 1 : 0;
        }
        long j = this.d;
        return ((i5 + i3) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "UltronTradeHybridDXPreDownloadModel(bizName=" + this.f20533a + ", downloadStage=" + this.b + ", onlyOnce=" + this.c + ", delayTime=" + this.d + f7l.BRACKET_END_STR;
    }
}
