package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ij5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_PARSER_CARTCURCATEGORYNAME = 2576387535948021638L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(478150723);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(478150722);
    }

    public static /* synthetic */ Object ipc$super(ij5 ij5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/dx/dataParse/DXDataParserCategoryName");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        kmb b;
        IDMComponent c;
        JSONObject fields;
        JSONObject jSONObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!(objArr == null || objArr.length == 0 || (b = yn2.b(dXRuntimeContext)) == null || (c = yn2.c(dXRuntimeContext)) == null || (fields = c.getFields()) == null || (jSONObject = fields.getJSONObject("panel")) == null || (jSONArray = jSONObject.getJSONArray("tabs")) == null)) {
            zxb P = b.d();
            ckf.f(P, "cartPresenter.dataManager");
            String y = P.y();
            if (y != null) {
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        JSONObject jSONObject2 = (JSONObject) next;
                        if (ckf.b(y, jSONObject2.getString("filterItem"))) {
                            return jSONObject2.getString("name");
                        }
                    }
                }
            }
        }
        return null;
    }
}
