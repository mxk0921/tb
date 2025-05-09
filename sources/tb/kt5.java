package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kt5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ULTRONDATAREFERENCE = -8384149384111219008L;

    static {
        t2o.a(478150726);
    }

    public static /* synthetic */ Object ipc$super(kt5 kt5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/dx/dataParse/DXDataParserUltronDataReference");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        kmb b;
        zxb P;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || !(objArr[0] instanceof JSONArray) || (b = yn2.b(dXRuntimeContext)) == null || (P = b.d()) == null) {
            return null;
        }
        fsb c = P.c();
        IDMComponent c2 = yn2.c(dXRuntimeContext);
        if (c2 != null) {
            tcv.a(c2.getKey());
        }
        JSONArray jSONArray = (JSONArray) objArr[0];
        JSONArray jSONArray2 = new JSONArray(jSONArray.size());
        for (int i = 0; i < jSONArray.size(); i++) {
            String str = (String) jSONArray.get(i);
            IDMComponent componentByName = c.getComponentByName(str);
            if (componentByName != null) {
                jSONArray2.add(componentByName.getData());
            } else {
                jSONArray2.add(str);
            }
        }
        return jSONArray2;
    }
}
