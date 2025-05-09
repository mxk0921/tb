package tb;

import android.content.Context;
import com.alibaba.android.bindingx.core.a;
import com.alibaba.android.bindingx.core.internal.AbstractEventHandler;
import com.alibaba.android.bindingx.core.internal.JSMath;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class j30 extends AbstractEventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int n;
    public int o;
    public boolean p = false;

    static {
        t2o.a(87031840);
    }

    public j30(Context context, a aVar, Object... objArr) {
        super(context, aVar, objArr);
    }

    public static /* synthetic */ Object ipc$super(j30 j30Var, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/bindingx/core/internal/AbstractScrollEventHandler");
    }

    public void B(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be541eac", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        } else {
            C(i, i2, i3, i4, i5, i6, "scroll");
        }
    }

    @Override // tb.i3c
    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2778e928", new Object[]{this, str, str2})).booleanValue();
        }
        r();
        this.p = false;
        A("end", this.n, this.o, vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, new Object[0]);
        return true;
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, tb.i3c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.p = false;
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void v(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dac3d61", new Object[]{this, map});
        } else {
            A("exit", ((Double) map.get("internal_x")).doubleValue(), ((Double) map.get("internal_y")).doubleValue(), vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, new Object[0]);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void w(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7befde3c", new Object[]{this, str, map});
        } else {
            A("interceptor", ((Double) map.get("internal_x")).doubleValue(), ((Double) map.get("internal_y")).doubleValue(), ((Double) map.get("dx")).doubleValue(), ((Double) map.get("dy")).doubleValue(), ((Double) map.get("tdx")).doubleValue(), ((Double) map.get("tdy")).doubleValue(), Collections.singletonMap("interceptor", str));
        }
    }

    public void A(String str, double d, double d2, double d3, double d4, double d5, double d6, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0893ea", new Object[]{this, str, new Double(d), new Double(d2), new Double(d3), new Double(d4), new Double(d5), new Double(d6), objArr});
        } else if (this.c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("state", str);
            double b = this.h.e().b(d, new Object[0]);
            double b2 = this.h.e().b(d2, new Object[0]);
            hashMap.put("x", Double.valueOf(b));
            hashMap.put("y", Double.valueOf(b2));
            double b3 = this.h.e().b(d3, new Object[0]);
            double b4 = this.h.e().b(d4, new Object[0]);
            hashMap.put("dx", Double.valueOf(b3));
            hashMap.put("dy", Double.valueOf(b4));
            double b5 = this.h.e().b(d5, new Object[0]);
            double b6 = this.h.e().b(d6, new Object[0]);
            hashMap.put("tdx", Double.valueOf(b5));
            hashMap.put("tdy", Double.valueOf(b6));
            hashMap.put("token", this.g);
            if (objArr != null && objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof Map) {
                    hashMap.putAll((Map) obj);
                }
            }
            this.c.callback(hashMap);
            gfh.a(">>>>>>>>>>>fire event:(" + str + "," + b + "," + b2 + "," + b3 + "," + b4 + "," + b5 + "," + b6 + f7l.BRACKET_END_STR);
        }
    }

    public void C(int i, int i2, int i3, int i4, int i5, int i6, String str) {
        j30 j30Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa077576", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), str});
            return;
        }
        if (gfh.f19951a) {
            gfh.a(String.format(Locale.getDefault(), "[ScrollHandler] scroll changed. (contentOffsetX:%d,contentOffsetY:%d,dx:%d,dy:%d,tdx:%d,tdy:%d)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
        }
        this.n = i;
        this.o = i2;
        if (!this.p) {
            this.p = true;
            j30Var = this;
            j30Var.A("start", i, i2, i3, i4, i5, i6, new Object[0]);
        } else {
            j30Var = this;
        }
        try {
            JSMath.applyScrollValuesToScope(j30Var.d, i, i2, i3, i4, i5, i6, j30Var.h.e());
            if (!j30Var.t(j30Var.j, j30Var.d)) {
                j30Var.s(j30Var.f2170a, j30Var.d, str);
            }
        } catch (Exception e) {
            gfh.c("runtime error", e);
        }
    }
}
