package tb;

import com.alibaba.fastjson2.util.DateUtils;
import java.util.Arrays;
import java.util.Calendar;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class xqx {

    /* renamed from: a  reason: collision with root package name */
    public final q7h f31549a;
    public final int b;
    public final wqx c;

    public xqx(q7h q7hVar, int i, wqx wqxVar) {
        this.f31549a = q7hVar;
        this.b = i;
        this.c = wqxVar;
    }

    public static xqx a(long j, int i, wqx wqxVar) {
        int a2 = wqxVar.a(vcf.e(j, i));
        return new xqx(q7h.g(j, i, a2), a2, wqxVar);
    }

    public static xqx b(p7h p7hVar, x9h x9hVar, wqx wqxVar) {
        return e(q7h.f(p7hVar, x9hVar), wqxVar);
    }

    public static xqx c(q7h q7hVar, wqx wqxVar) {
        return e(q7hVar, wqxVar);
    }

    public static xqx d(vcf vcfVar, wqx wqxVar) {
        return a(vcfVar.f29921a, vcfVar.b, wqxVar);
    }

    public static xqx e(q7h q7hVar, wqx wqxVar) {
        return new xqx(q7hVar, wqxVar.a(q7hVar.i(wqxVar)), wqxVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xqx.class != obj.getClass()) {
            return false;
        }
        xqx xqxVar = (xqx) obj;
        q7h q7hVar = this.f31549a;
        q7h q7hVar2 = xqxVar.f31549a;
        if (q7hVar == q7hVar2) {
            return true;
        }
        wqx wqxVar = this.c;
        wqx wqxVar2 = xqxVar.c;
        if (q7hVar != null && q7hVar.equals(q7hVar2) && this.b == xqxVar.b && wqxVar == wqxVar2) {
            return true;
        }
        if (wqxVar == null || !wqxVar.equals(wqxVar2)) {
            return false;
        }
        return true;
    }

    public long f() {
        int i;
        q7h q7hVar = this.f31549a;
        p7h p7hVar = q7hVar.f26561a;
        wqx wqxVar = wqx.SHANGHAI_ZONE_ID;
        x9h x9hVar = q7hVar.b;
        wqx wqxVar2 = this.c;
        if (wqxVar2 == wqxVar || wqxVar2.b.equals(wqx.SHANGHAI_ZONE_ID_NAME)) {
            long w0 = DateUtils.w0(p7hVar.f25919a, p7hVar.b, p7hVar.c, x9hVar.f31233a, x9hVar.b, x9hVar.c);
            if (w0 >= 684900000) {
                i = 28800;
            } else {
                i = DateUtils.m(w0);
            }
            return ((w0 - i) * 1000) + (x9hVar.d / 1000000);
        }
        Calendar instance = Calendar.getInstance(wqxVar2.f30862a);
        instance.set(p7hVar.f25919a, p7hVar.b - 1, p7hVar.c, x9hVar.f31233a, x9hVar.b, x9hVar.c);
        instance.set(14, x9hVar.d / 1000000);
        return instance.getTimeInMillis();
    }

    public long g() {
        return f() / 1000;
    }

    public vcf h() {
        return vcf.e(f() / 1000, this.f31549a.b.d);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31549a, Integer.valueOf(this.b), this.c});
    }
}
