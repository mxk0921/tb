package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class po2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static List<String> c;
    public static int d = 10;
    public static int e = 1024;
    public static boolean f = false;

    /* renamed from: a  reason: collision with root package name */
    public final String f26209a;
    public final ro2 b;

    static {
        t2o.a(729808961);
    }

    public po2(ro2 ro2Var) {
        this.b = ro2Var;
        this.f26209a = ro2Var.g();
        f();
    }

    public final void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c05f68", new Object[]{this, new Long(j)});
        } else if (j > d) {
            HashMap hashMap = new HashMap(8);
            hashMap.put("sMaxTime", d + "");
            hashMap.put(iiz.PERF_STAG_TOTAL, j + "");
            hrg.a("getBxFeature", "BxFeatureGetter", "1.0", this.b.d(), "BxFeatureGetter", hashMap, "getBxFeatureTimeOut", "接口调用超时");
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70814e2f", new Object[]{this});
        }
        if (TextUtils.equals(this.f26209a, "coldStart")) {
            return null;
        }
        ro2 ro2Var = this.b;
        if (ro2Var == null) {
            uqa.b("CreateCommonParams", "getBxFeature", "mBxFeatureParam 为空");
            return null;
        } else if ((ro2Var.f() && !c.contains(this.f26209a)) || e <= 0) {
            return null;
        } else {
            if (!this.b.h()) {
                uqa.b("CreateCommonParams", "getBxFeature", "mBxFeatureParam 异常 " + this.b.toString());
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            try {
                String feature = BUFS.getFeature(new BUFS.QueryArgs(), this.b.e(), this.b.c(), this.b.d());
                b(System.currentTimeMillis() - currentTimeMillis);
                return !a(feature) ? "" : feature;
            } catch (Throwable th) {
                uqa.b("CreateCommonParams", "getBxFeature", "getBxFeature调用异常，" + th.getMessage());
                return null;
            }
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc346ed3", new Object[]{this});
        } else {
            e = f4b.i("behaviorXDataLimitedSize", 1024);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9362a1fa", new Object[]{this});
        } else {
            d = f4b.i("bxFeatureMaxTime", 10);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!f && !TextUtils.equals(this.f26209a, "coldStart")) {
            d();
            e();
            c = new uo2().a();
            f = true;
        }
    }

    public final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3ad019", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int length = str.toCharArray().length;
        if (length <= e) {
            return true;
        }
        hrg.e("getBxFeature", "BxFeatureGetter", "数据长度超过最大长度, 数据长度为 : " + length);
        return false;
    }
}
