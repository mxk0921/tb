package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.purchase.aura.annotation.TBBuyPageMode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x7r extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ID = 242700904017916597L;

    static {
        t2o.a(708837460);
    }

    public static /* synthetic */ Object ipc$super(x7r x7rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/dinamicx/parse/TBBuyDXDataParserIsWhiteNavText");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object q = dXRuntimeContext.q();
        if (!(q instanceof qh)) {
            return Boolean.FALSE;
        }
        qh qhVar = (qh) q;
        if (TBBuyPageMode.halfPageMode.equals((String) qhVar.l().g("pageType", String.class))) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!x14.c(x69.a(qhVar.l().f())));
    }
}
