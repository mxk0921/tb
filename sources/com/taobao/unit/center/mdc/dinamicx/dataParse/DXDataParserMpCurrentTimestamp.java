package com.taobao.unit.center.mdc.dinamicx.dataParse;

import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.message.launcher.server_time.AmpTimeStampManager;
import com.taobao.tao.log.TLog;
import tb.nb5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DXDataParserMpCurrentTimestamp extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MPCURRENTTIMESTAMP = 111335565854380422L;
    public static final int TYPE_MS = 0;
    public static final int TYPE_S = 1;
    private String TAG = "MpCurrentTimestamp";

    static {
        t2o.a(529531113);
    }

    public static /* synthetic */ Object ipc$super(DXDataParserMpCurrentTimestamp dXDataParserMpCurrentTimestamp, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/dataParse/DXDataParserMpCurrentTimestamp");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null) {
            try {
                if (objArr.length > 0) {
                    Object obj = objArr[0];
                    if ((obj instanceof String) && "s".equals((String) obj)) {
                        return Long.valueOf(AmpTimeStampManager.instance().getCurrentTimeStamp() / 1000);
                    }
                }
            } catch (Throwable th) {
                TLog.loge(this.TAG, Log.getStackTraceString(th));
                return Long.valueOf(AmpTimeStampManager.instance().getCurrentTimeStamp());
            }
        }
        return Long.valueOf(AmpTimeStampManager.instance().getCurrentTimeStamp());
    }
}
