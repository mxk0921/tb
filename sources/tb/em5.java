package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class em5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HGETVALUE = 1466861815985736590L;

    static {
        t2o.a(729809043);
    }

    public static /* synthetic */ Object ipc$super(em5 em5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/parser/DXDataParserHGetValue");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object obj2 = null;
        if (objArr == null || objArr.length < 1) {
            return null;
        }
        if (objArr.length > 1) {
            obj2 = objArr[1];
        }
        Object obj3 = objArr[0];
        if (!(obj3 instanceof String) || (obj = ((ConcurrentHashMap) tz5.f29041a).get((String) obj3)) == null) {
            return obj2;
        }
        return obj;
    }
}
