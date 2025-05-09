package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nm5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HTABSELECTEDINDEX = 4299033137847078065L;

    static {
        t2o.a(729809047);
    }

    public static /* synthetic */ Object ipc$super(nm5 nm5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/parser/DXDataParserHTabSelectedIndex");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        IHomeViewService iHomeViewService = (IHomeViewService) c4b.i().h(IHomeViewService.class);
        if (iHomeViewService != null) {
            return Integer.valueOf(iHomeViewService.getCurrentTabIndex());
        }
        return -1;
    }
}
