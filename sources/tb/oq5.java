package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class oq5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_PARSER_STRIMPLODE = 8051816564676100653L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public static /* synthetic */ Object ipc$super(oq5 oq5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserStrImplode");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || objArr.length < 2) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Object obj = objArr[0];
        if (obj instanceof ArrayList) {
            Object obj2 = objArr[1];
            if (obj2 instanceof String) {
                if (obj2 != null) {
                    String str = (String) obj2;
                    if (obj != null) {
                        ArrayList arrayList = (ArrayList) obj;
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            sb.append(arrayList.get(i));
                            sb.append(str);
                        }
                        sb.deleteCharAt(sb.length() - 1);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<*> /* = java.util.ArrayList<*> */");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
        }
        return sb.toString();
    }
}
