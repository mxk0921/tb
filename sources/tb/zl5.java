package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.login4android.api.Login;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zl5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HGETPARAMS = 6584495743641924598L;

    static {
        t2o.a(491782478);
    }

    public static /* synthetic */ Object ipc$super(zl5 zl5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/overlayservice/impl/feedback/dxview/parser/DXDataParserHGetParams");
    }

    public final String a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9daa4de2", new Object[]{this, dXRuntimeContext});
        }
        cfc c = j18.c(dXRuntimeContext);
        if (c == null) {
            return null;
        }
        return c.getContainerType().getContainerId();
    }

    public final boolean b(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1d2f5b0", new Object[]{this, objArr})).booleanValue();
        }
        if (objArr == null || objArr.length == 0 || !(objArr[0] instanceof String)) {
            return true;
        }
        return false;
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (b(objArr)) {
            return null;
        }
        String str = (String) objArr[0];
        str.hashCode();
        if (str.equals("userId")) {
            return Login.getUserId();
        }
        if (!str.equals("subContainerId")) {
            return null;
        }
        return a(dXRuntimeContext);
    }
}
