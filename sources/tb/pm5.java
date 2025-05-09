package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pm5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HIGHLIGHTABCONFIG = 6406211530535040674L;

    static {
        t2o.a(779092637);
    }

    public static /* synthetic */ Object ipc$super(pm5 pm5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/dx/widget/DXDataParserHighlightABConfig");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        if (objArr.length > 2) {
            String obj = objArr[0].toString();
            String obj2 = objArr[1].toString();
            String obj3 = objArr[2].toString();
            if (!(v2s.o().p() == null || !zqq.c(v2s.o().p().b("tblive", obj, "true")) || v2s.o().c() == null)) {
                return Boolean.valueOf(zqq.c(v2s.o().c().b("taolive", obj, obj2, obj3)));
            }
        }
        return Boolean.FALSE;
    }
}
