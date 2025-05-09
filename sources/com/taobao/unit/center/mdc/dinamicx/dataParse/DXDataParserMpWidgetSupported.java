package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.nb5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DXDataParserMpWidgetSupported extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MPWIDGETSUPPORTED = -6683306849755808744L;

    static {
        t2o.a(529531119);
    }

    public static /* synthetic */ Object ipc$super(DXDataParserMpWidgetSupported dXDataParserMpWidgetSupported, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/dataParse/DXDataParserMpWidgetSupported");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String) || !"MsgVideoPlayer".equals((String) obj)) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
