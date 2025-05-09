package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fi5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ARRAY_CONCAT = 6742876832553239298L;

    /* renamed from: a  reason: collision with root package name */
    public final JSONArray f19307a = new JSONArray(0);

    static {
        t2o.a(479199342);
    }

    public static /* synthetic */ Object ipc$super(fi5 fi5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/dinamicX/parser/DXDataParserArrayConcat");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 2) {
            return this.f19307a;
        }
        JSONArray jSONArray = (JSONArray) objArr[0];
        Object obj = objArr[1];
        int size = jSONArray.size();
        boolean z = obj instanceof Object[];
        if (z) {
            i = ((Object[]) obj).length;
        } else if (obj instanceof JSONArray) {
            i = ((JSONArray) obj).size();
        } else {
            i = 1;
        }
        JSONArray jSONArray2 = new JSONArray(i + size);
        jSONArray2.addAll(jSONArray);
        if (z) {
            for (Object obj2 : (Object[]) obj) {
                jSONArray2.add(obj2);
            }
        } else if (obj instanceof JSONArray) {
            jSONArray2.addAll((JSONArray) obj);
        } else {
            jSONArray2.add(obj);
        }
        return jSONArray2;
    }
}
