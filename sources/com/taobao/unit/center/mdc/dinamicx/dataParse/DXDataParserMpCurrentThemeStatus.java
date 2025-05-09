package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.festival.FestivalMgr;
import tb.nb5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DXDataParserMpCurrentThemeStatus extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MPCURRENTTHEMESTATUS = -8436613677671194293L;

    static {
        t2o.a(529531111);
    }

    public static /* synthetic */ Object ipc$super(DXDataParserMpCurrentThemeStatus dXDataParserMpCurrentThemeStatus, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/dataParse/DXDataParserMpCurrentThemeStatus");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        try {
            if (FestivalMgr.i().t()) {
                return 2;
            }
            if (FestivalMgr.i().x()) {
                return 1;
            }
            return 0;
        } catch (Throwable unused) {
            return null;
        }
    }
}
