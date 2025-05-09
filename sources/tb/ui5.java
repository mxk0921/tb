package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ui5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CARTCURRENTFILTERITEM = 2725036461527485047L;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f29393a = v9v.i("cart_switch", "enablePreHeatPopFilterItem", true);

    static {
        t2o.a(479199345);
    }

    public static /* synthetic */ Object ipc$super(ui5 ui5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/dinamicX/parser/DXDataParserCartCurrentFilterItem");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        try {
            kmb kmbVar = (kmb) ((Map) dXRuntimeContext.q()).get(kz1.DINAMIC_CONTEXT_KEY_PRESENTER);
            if (kmbVar != null) {
                String y = kmbVar.d().y();
                boolean u = kmbVar.W().u();
                boolean L = kmbVar.d().L();
                if ("".equals(y)) {
                    y = null;
                }
                return this.f29393a ? (!u || L) ? y : "preHeat" : kmbVar.W().u() ? "preHeat" : y;
            }
        } catch (Exception unused) {
        }
        return "";
    }
}
