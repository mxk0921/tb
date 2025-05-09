package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cm5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HGETSEARCHBARHEIGHT = -1687529246199642529L;

    public static /* synthetic */ Object ipc$super(cm5 cm5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/dx/parser/DXDataParserHGetSearchBarHeight");
    }

    public final int a(e3b e3bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e586ace9", new Object[]{this, e3bVar})).intValue();
        }
        if (e3bVar != null) {
            return e3bVar.h().c();
        }
        vfm.f("DXDataParserHGetSearchBarHeight", "engine == null");
        return -1;
    }

    public final int b(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b9c813", new Object[]{this, context, new Float(f)})).intValue();
        }
        if (context != null) {
            return (int) (f / context.getResources().getDisplayMetrics().density);
        }
        vfm.f("DXDataParserHGetSearchBarHeight", "context == null");
        return 0;
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext == null) {
            vfm.f("DXDataParserHGetSearchBarHeight", "dinamicParams == null,上下文为空");
            return 0;
        }
        int a2 = a(tcm.g(dXRuntimeContext));
        int b = b(dXRuntimeContext.h(), a2);
        vfm.f("DXDataParserHGetSearchBarHeight", "searchBarHeightPx: " + a2 + "px2dip: " + b);
        return Integer.valueOf(b);
    }
}
