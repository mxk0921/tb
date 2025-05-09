package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qr5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TAOLIVEDXAB = -2270310021871231170L;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f26893a = new HashMap();

    static {
        t2o.a(295698933);
    }

    public static /* synthetic */ Object ipc$super(qr5 qr5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXDataParserTaoliveDxAB");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length <= 3) {
            return null;
        }
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object obj3 = objArr[2];
        Object obj4 = objArr[3];
        if ((obj instanceof String) && (obj2 instanceof String) && (obj3 instanceof String) && (obj4 instanceof String)) {
            String str = "" + obj + obj2 + obj3;
            Map<String, String> map = f26893a;
            String str2 = (String) ((HashMap) map).get(str);
            if (!TextUtils.isEmpty(str2)) {
                hha.c("TaoliveDxAB", "evalWithArgs | has cache, key=" + str + " value=" + str2);
                return str2;
            }
            String b = v2s.o().c().b((String) obj, (String) obj2, (String) obj3, (String) obj4);
            if (!TextUtils.isEmpty(b)) {
                hha.c("TaoliveDxAB", "evalWithArgs |  activate, key=" + str + " value=" + b);
                ((HashMap) map).put(str, b);
            }
            return b;
        } else if (obj4 instanceof String) {
            return obj4;
        } else {
            return "";
        }
    }
}
