package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gj5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CARTSHOWSUBMITCHECK = 3311639052408616880L;

    static {
        t2o.a(479199352);
    }

    public static /* synthetic */ Object ipc$super(gj5 gj5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/dinamicX/parser/DXDataParserCartShowSubmitCheck");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        kmb b = yn2.b(dXRuntimeContext);
        if (b == null) {
            return Boolean.FALSE;
        }
        zxb P = b.d();
        oc3 i = mc3.i(b.T().getInstanceId());
        if (i != null && i.c()) {
            return Boolean.FALSE;
        }
        if (b.d().L()) {
            for (IDMComponent iDMComponent : b.e().h0().getComponents()) {
                if (iDMComponent == null || !"item".equals(iDMComponent.getTag())) {
                }
            }
            return Boolean.FALSE;
        }
        if (!sca.x(P) && !P.J()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
