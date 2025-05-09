package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.message.uikit.util.DisplayUtil;
import tb.nb5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DXDataParserMpGetStatusBarHeight extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MPGETSTATUSBARHEIGHT = -884601719778523901L;

    static {
        t2o.a(529531115);
    }

    public static /* synthetic */ Object ipc$super(DXDataParserMpGetStatusBarHeight dXDataParserMpGetStatusBarHeight, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/dataParse/DXDataParserMpGetStatusBarHeight");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        try {
            i = DisplayUtil.px2dip(dXRuntimeContext.h(), DisplayUtil.getStatusBarHeight(dXRuntimeContext.h()));
        } catch (Throwable unused) {
        }
        return Integer.valueOf(i);
    }
}
