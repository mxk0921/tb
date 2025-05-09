package tb;

import android.content.Context;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.a;
import java.util.HashMap;
import java.util.Map;
import tb.nbv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qbv implements t5e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final qbv d = new qbv();

    /* renamed from: a  reason: collision with root package name */
    public final cbv f26662a;
    public final Map<Class<?>, Object> c = new HashMap();
    public final mcv b = new mcv();

    static {
        t2o.a(157286833);
        t2o.a(157286824);
    }

    public qbv() {
        cbv a2 = cbv.a();
        this.f26662a = a2;
        s(wbv.class, new wbv(a2));
        s(ecv.class, new ecv(a2));
        s(acv.class, new acv(a2));
        s(ccv.class, new ccv(a2));
        s(icv.class, new icv(a2));
        s(bbv.class, new bbv());
        s(fbv.class, new fbv());
        s(gbv.class, new gbv(a2));
    }

    public static qbv j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qbv) ipChange.ipc$dispatch("a5dc0c27", new Object[0]);
        }
        return d;
    }

    @Override // tb.t5e
    public void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb77c2b6", new Object[]{this, str, str2, jSONObject});
        } else if (!UltronTradeHybridSwitcherHelper.m()) {
            hav.g("UltronTradeHybridManager", "onStage", "enableTradeHybrid false");
        } else {
            for (Object obj : ((HashMap) this.c).values()) {
                if (obj instanceof t5e) {
                    ((t5e) obj).a(str, str2, jSONObject);
                }
            }
        }
    }

    public void b(Object obj, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b2aa71e", new Object[]{this, obj, jSONObject});
        } else {
            n().c(obj, jSONObject);
        }
    }

    public void c(Object obj, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66dfe6a1", new Object[]{this, obj, jSONObject});
        } else {
            n().d(obj, jSONObject);
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b146b2", new Object[]{this, str});
        } else {
            n().i(str);
        }
    }

    public void e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4db18ab2", new Object[]{this, context, str});
        } else {
            n().m(context, str);
        }
    }

    public Object f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4abef077", new Object[]{this, str});
        }
        return n().p(str);
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        super.finalize();
        this.b.a();
    }

    public bbv g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbv) ipChange.ipc$dispatch("70ffea2d", new Object[]{this});
        }
        bbv bbvVar = (bbv) i(bbv.class);
        if (bbvVar != null) {
            return bbvVar;
        }
        return new bbv();
    }

    public cbv h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cbv) ipChange.ipc$dispatch("5fb12eae", new Object[]{this});
        }
        return this.f26662a;
    }

    public JSONObject k(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d311c019", new Object[]{this, aVar});
        }
        return n().q(aVar);
    }

    public JSONObject l(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2b8e79b8", new Object[]{this, aVar});
        }
        return n().r(aVar);
    }

    public Object m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("976334a9", new Object[]{this, str});
        }
        return n().u(str);
    }

    public wbv n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wbv) ipChange.ipc$dispatch("d6fd030d", new Object[]{this});
        }
        wbv wbvVar = (wbv) i(wbv.class);
        if (wbvVar != null) {
            return wbvVar;
        }
        return new wbv(this.f26662a);
    }

    public ccv o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ccv) ipChange.ipc$dispatch("4292a84d", new Object[]{this});
        }
        ccv ccvVar = (ccv) i(ccv.class);
        if (ccvVar != null) {
            return ccvVar;
        }
        return new ccv(this.f26662a);
    }

    public ecv p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ecv) ipChange.ipc$dispatch("1b31ee93", new Object[]{this});
        }
        ecv ecvVar = (ecv) i(ecv.class);
        if (ecvVar != null) {
            return ecvVar;
        }
        return new ecv(this.f26662a);
    }

    public icv q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icv) ipChange.ipc$dispatch("f1453ecd", new Object[]{this});
        }
        icv icvVar = (icv) i(icv.class);
        if (icvVar != null) {
            return icvVar;
        }
        return new icv(this.f26662a);
    }

    public mcv r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mcv) ipChange.ipc$dispatch("e88d8ce5", new Object[]{this});
        }
        return this.b;
    }

    public final <T> void s(Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d16f7f8", new Object[]{this, cls, t});
        } else {
            this.c.put(cls, t);
        }
    }

    public final <T> T i(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("5a7c989", new Object[]{this, cls});
        }
        try {
            Object obj = ((HashMap) this.c).get(cls);
            if (obj != null) {
                return cls.cast(obj);
            }
            nbv.a(nbv.a.a("InnerManagerState").success(false).message("service is null").sampling(1.0f));
            return null;
        } catch (Throwable th) {
            h15 success = nbv.a.a("InnerManagerState").success(false);
            nbv.a(success.message("on error" + th.toString()).sampling(1.0f));
            return null;
        }
    }
}
