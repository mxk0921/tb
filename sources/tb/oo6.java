package tb;

import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.Util;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oo6 extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DAMUPDATECOMPONENT = "-4159790982239500966";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f25524a;
        public final /* synthetic */ ViewEngine b;

        public a(Object obj, ViewEngine viewEngine) {
            this.f25524a = obj;
            this.b = viewEngine;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f25524a);
            try {
                this.b.K0(arrayList);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(350224426);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public oo6 build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (oo6) ipChange.ipc$dispatch("4433a33", new Object[]{this, obj});
            }
            return new oo6();
        }
    }

    static {
        t2o.a(350224424);
    }

    public static /* synthetic */ Object ipc$super(oo6 oo6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/adam/ultronExt/ability/DamUpdateCompoAbility");
    }

    /* renamed from: i */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        DXRuntimeContext p;
        ViewEngine k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        f8 f8Var = new f8();
        if (tk6Var == null || n8Var == null || !(n8Var.a("updateFields") instanceof JSONObject) || (k = Util.k((p = tk6Var.p()))) == null) {
            return f8Var;
        }
        Object q = p.q();
        if (q instanceof Map) {
            Object obj = ((Map) q).get(xo7.TAG_DINAMICX_VIEW_COMPONENT);
            if (obj instanceof IDMComponent) {
                if ("false".equals(n8Var.i(fjv.FIELD_KEY_NEED_MERGE))) {
                    ((IDMComponent) obj).getFields().clear();
                }
                if (p.L() == null) {
                    return f8Var;
                }
                Util.l(((IDMComponent) obj).getFields(), (JSONObject) n8Var.a("updateFields"));
                p.L().post(new a(obj, k));
            }
        }
        return f8Var;
    }
}
