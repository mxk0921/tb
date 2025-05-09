package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.message.kit.util.TimeUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import tb.nb5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DXDataParserMpLongFormatTime extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MPLONGFORMATTIME = -2296656905112788107L;

    static {
        t2o.a(529531117);
    }

    public static /* synthetic */ Object ipc$super(DXDataParserMpLongFormatTime dXDataParserMpLongFormatTime, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/dataParse/DXDataParserMpLongFormatTime");
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
        String str = "" + objArr[0];
        long j = -1;
        try {
            if (str instanceof String) {
                j = Long.parseLong(str);
            }
        } catch (Throwable th) {
            TLog.loge("DataParserMpFormatTime", th.toString());
        }
        if (!DisplayUtil.isSimplifiedChinese()) {
            return TimeUtil.formatForeignTime(j, false);
        }
        String format = new SimpleDateFormat(DisplayUtil.localizedString(R.string.mp_yyyy_year_mm_month_dd)).format(new Date(j));
        try {
            int isToday = TimeUtil.isToday(j);
            if (isToday == -2) {
                format = TimeUtil.getWeekOfTime(j) + format.substring(11);
            } else if (isToday == -1) {
                format = DisplayUtil.localizedString(R.string.mp_yesterday) + " " + format.substring(11);
            } else if (isToday == 0) {
                format = "" + format.substring(11);
            }
        } catch (ParseException unused) {
        }
        return format;
    }
}
