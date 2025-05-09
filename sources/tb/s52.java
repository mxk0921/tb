package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class s52 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String b;
    public long d;
    public jft e;
    public long[] f;

    /* renamed from: a  reason: collision with root package name */
    public final ysg f27804a = new ysg(w9a.g().a().getPackageName());
    public long c = nca.i;

    public s52(boolean z, String str) {
        this.b = str;
    }

    public final boolean a(long[] jArr, long[] jArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12df8dbe", new Object[]{this, jArr, jArr2})).booleanValue();
        }
        if (jArr == null || jArr.length != 2 || jArr[0] <= 0 || jArr[1] <= 0 || jArr2 == null || jArr2.length != 2 || jArr2[0] <= 0 || jArr2[1] <= 0) {
            return false;
        }
        return true;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f346090", new Object[]{this})).longValue();
        }
        long j = this.d;
        if (j == 0) {
            return this.c;
        }
        return j;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        long a2 = out.a();
        this.d = a2;
        this.c = a2;
        this.e = this.f27804a.e();
        this.f = ldu.a();
    }

    public void c(String str) {
        long[] jArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c18a42", new Object[]{this, str});
            return;
        }
        long a2 = out.a();
        jft e = this.f27804a.e();
        Intent a3 = l52.a(w9a.g().a());
        long[] a4 = ldu.a();
        if (e != null) {
            p52 j = p52.a().g(str).j(this.b);
            long j2 = this.d;
            if (j2 == 0) {
                j2 = nca.i;
            }
            p52 e2 = j.f(a2 - j2).h(ysg.b(this.e, e)).e(a3 == null ? -1.0f : a3.getIntExtra("temperature", -1) / 10.0f);
            if (a(this.f, a4)) {
                long j3 = a4[0];
                long[] jArr2 = this.f;
                jArr = new long[]{j3 - jArr2[0], a4[1] - jArr2[1]};
            } else {
                jArr = a4;
            }
            e2.i(jArr).d();
        }
        this.d = a2;
        this.e = e;
        this.f = a4;
    }
}
