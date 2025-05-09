package tb;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.a;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fq7 extends zt1<uw6, uw6> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final cq7 k;

    static {
        t2o.a(620757041);
    }

    public fq7(eq7 eq7Var, cq7 cq7Var) {
        super(0, 2, eq7Var);
        this.k = cq7Var;
    }

    public static /* synthetic */ Object ipc$super(fq7 fq7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/cache/disk/DiskCacheWriter");
    }

    public final boolean W(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b784194", new Object[]{this, aVar})).booleanValue();
        }
        Map<String, String> I = aVar.I();
        if (this.k == null || I == null || TextUtils.isEmpty(I.get("max-age")) || !this.k.d(aVar.O())) {
            return false;
        }
        return true;
    }

    @Override // tb.oh3
    public boolean c(kk4<uw6, a> kk4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3214a19", new Object[]{this, kk4Var})).booleanValue();
        }
        return false;
    }

    /* renamed from: V */
    public void K(kk4<uw6, a> kk4Var, boolean z, uw6 uw6Var) {
        String str;
        long longValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbaf58dd", new Object[]{this, kk4Var, new Boolean(z), uw6Var});
            return;
        }
        fiv.p("Phenix", "DiskCache Writer Started.", kk4Var.getContext());
        kk4Var.c(uw6Var, z);
        Map<String, String> I = kk4Var.getContext().I();
        if (s0m.B().A() && I != null && I.size() > 0 && HttpHeaderConstant.NO_CACHE.equals(I.get(HttpConstant.CACHE_CONTROL))) {
            fiv.p("Phenix", "skip DiskCache Writer.", kk4Var.getContext());
        } else if (uw6Var == null || uw6Var.d() == null) {
            fiv.p("Phenix", "skip DiskCache Writer. getEncodedImage invalid", kk4Var.getContext());
        } else {
            sz8.b("phenix", "disk_write " + kk4Var.getContext().d());
            U(kk4Var.getContext(), uw6Var.d(), true);
            if (W(kk4Var.getContext())) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (I != null) {
                        str = I.get("max-age");
                    } else {
                        str = "";
                    }
                    if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) {
                        String str2 = kk4Var.getContext().D() + kk4Var.getContext().C();
                        kk4Var.getContext().Y().G = !(this.k.b(Long.valueOf(str).longValue()) ? this.k.c(str2, longValue) : false);
                        kk4Var.getContext().Y().E = System.currentTimeMillis() - currentTimeMillis;
                    }
                    fiv.p("Phenix", "DiskCache Writer Put TTL Time", kk4Var.getContext());
                } catch (Exception e) {
                    xv8.c("TTL", "ttl put error=%s", e);
                }
            }
            sz8.e();
            fiv.p("Phenix", "DiskCache Writer Ended.", kk4Var.getContext());
        }
    }
}
