package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface qvb {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f26952a;
        public final String b;
        public final uw5 c;

        static {
            t2o.a(444598018);
        }

        public a(boolean z, String str, uw5 uw5Var) {
            this.f26952a = z;
            this.b = str;
            this.c = uw5Var;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "EngineResult{success=" + this.f26952a + ", errorMsg='" + this.b + "', result=" + this.c + '}';
        }
    }

    void a(xwb xwbVar);

    uw5 b(DXRuntimeContext dXRuntimeContext, String str, uw5 uw5Var, int i, uw5[] uw5VarArr, Map map) throws DXExprFunctionError;

    a c(DXRuntimeContext dXRuntimeContext, int i, zwb zwbVar, Map map);
}
