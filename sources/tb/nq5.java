package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.tao.Globals;
import com.taobao.tao.util.SystemBarDecorator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nq5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_STATUSBARHEIGHT = -2517623531547489759L;

    /* renamed from: a  reason: collision with root package name */
    public static String f24887a = null;

    static {
        t2o.a(745538093);
    }

    public static /* synthetic */ Object ipc$super(nq5 nq5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/dinamicX/dataParser/DXDataParserStatusBarHeight");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (f24887a == null) {
            int statusBarHeight = SystemBarDecorator.getStatusBarHeight(Globals.getApplication());
            f24887a = pb6.z(Globals.getApplication(), statusBarHeight) + "ap";
            new StringBuilder("statusBarHeightAp = ").append(f24887a);
        }
        return f24887a;
    }
}
