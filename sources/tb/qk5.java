package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qk5 extends ix {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETARROWSPOINT = -212266085137631274L;

    public static /* synthetic */ Object ipc$super(qk5 qk5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/dx/parser/DXDataParserGetArrowsPoint");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        e3b g = tcm.g(dXRuntimeContext);
        IPopData f = tcm.f(dXRuntimeContext);
        if (g == null || f == null) {
            vfm.f("DXDataParserGetArrowsPoint ", "engine or popData is null");
            return 0;
        }
        IPopAnchorViewInfo c = g.f().c(f);
        if (c == null) {
            vfm.f("DXDataParserGetArrowsPoint ", "anchorViewInfo is null");
            return 0;
        }
        int screenX = c.getScreenX() + (c.getWidth() / 2) + c.getOffsetX();
        vfm.c("DXDataParserGetArrowsPoint ", "centerPx=" + screenX + ", iconOffset=" + c.getOffsetX());
        return Integer.valueOf(pb6.A(dXRuntimeContext.r(), dXRuntimeContext.h(), screenX));
    }
}
