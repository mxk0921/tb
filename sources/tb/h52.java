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
public class h52 extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DAMBATCHUPDATECOMPONENT = "132066586199278145";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewEngine f20414a;
        public final /* synthetic */ ArrayList b;

        public a(ViewEngine viewEngine, ArrayList arrayList) {
            this.f20414a = viewEngine;
            this.b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f20414a.K0(this.b);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(350224421);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public h52 build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h52) ipChange.ipc$dispatch("31a8af89", new Object[]{this, obj});
            }
            return new h52();
        }
    }

    static {
        t2o.a(350224419);
    }

    public static /* synthetic */ Object ipc$super(h52 h52Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/adam/ultronExt/ability/BatchUpdateCompoAbility");
    }

    /* renamed from: i */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        DXRuntimeContext p;
        ViewEngine k;
        JSONObject g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        f8 f8Var = new f8();
        if (tk6Var == null || n8Var == null || (k = Util.k((p = tk6Var.p()))) == null) {
            return f8Var;
        }
        try {
            g = n8Var.g("updateFields");
        } catch (Throwable unused) {
        }
        if (g == null) {
            return f8Var;
        }
        JSONObject g2 = n8Var.g("updatePrefixFields");
        if (g2 != null) {
            for (Map.Entry<String, Object> entry : g2.entrySet()) {
                for (IDMComponent iDMComponent : k.N().d().getComponents()) {
                    if (iDMComponent.getKey().startsWith(entry.getKey())) {
                        g.put(iDMComponent.getKey(), entry.getValue());
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry2 : g.entrySet()) {
            String key = entry2.getKey();
            JSONObject jSONObject = g.getJSONObject(key);
            IDMComponent componentByName = k.N().d().getComponentByName(key);
            Util.l(componentByName.getFields(), jSONObject);
            arrayList.add(componentByName);
        }
        p.L().post(new a(k, arrayList));
        return f8Var;
    }
}
