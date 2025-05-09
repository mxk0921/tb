package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.message.kit.util.TimeUtil;
import com.taobao.tao.log.TLog;
import tb.evb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DataParserMpFormatTime implements evb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MPFORMATTIME = 1008841344536034785L;

    static {
        t2o.a(529531128);
        t2o.a(444596865);
    }

    @Override // tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length == 1) {
            String str = "" + objArr[0];
            long j = -1;
            try {
                if (str instanceof String) {
                    j = Long.parseLong(str);
                }
            } catch (Throwable th) {
                TLog.loge("DataParserMpFormatTime", th.toString());
            }
            if (j > 0) {
                return TimeUtil.formatTimeForMsgCenterCategory(j);
            }
        }
        return null;
    }
}
