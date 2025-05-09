package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jft implements Comparable<jft> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public byte[] f21972a;
    public int b;
    public long c;
    public String d = "";
    public String e = "_";
    public long f = -1;
    public long g = -1;
    public long h = -1;
    public long i = -1;
    public boolean j = false;
    public long k = -1;

    /* renamed from: a */
    public int compareTo(jft jftVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd52a286", new Object[]{this, jftVar})).intValue();
        }
        long j = this.k;
        long j2 = jftVar.k;
        if (j > j2) {
            return -1;
        }
        if (j == j2) {
            return 0;
        }
        return 1;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ed5a37d", new Object[]{this})).longValue();
        }
        return this.f + this.g + this.h + this.i;
    }
}
