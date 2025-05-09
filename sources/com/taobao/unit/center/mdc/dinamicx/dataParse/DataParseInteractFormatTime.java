package com.taobao.unit.center.mdc.dinamicx.dataParse;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.message.launcher.server_time.AmpTimeStampManager;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import tb.evb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DataParseInteractFormatTime implements evb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MPFORMATTIME = 1008841344536034785L;

    static {
        t2o.a(529531125);
        t2o.a(444596865);
    }

    private String formatTime(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85671e45", new Object[]{this, new Long(j), new Boolean(z)});
        }
        if (j == 0) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YY.MM.dd", Locale.getDefault());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM.dd", Locale.getDefault());
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("HH:mm", Locale.getDefault());
        long currentTimeStamp = AmpTimeStampManager.instance().getCurrentTimeStamp() + 3000;
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        if (currentTimeStamp - j < 0) {
            return simpleDateFormat.format(instance.getTime());
        }
        long offset = currentTimeStamp - ((TimeZone.getDefault().getOffset(currentTimeStamp) + currentTimeStamp) % 86400000);
        long offset2 = currentTimeStamp - ((TimeZone.getDefault().getOffset(currentTimeStamp) + currentTimeStamp) % 31536000000L);
        if (!z) {
            if (j - offset >= 0) {
                return simpleDateFormat3.format(instance.getTime());
            }
            if (offset - j < 86400000) {
                return DisplayUtil.localizedString(R.string.mp_yesterday) + " " + simpleDateFormat3.format(instance.getTime());
            }
        } else if (j - offset >= 0) {
            return simpleDateFormat3.format(instance.getTime());
        } else {
            if (offset - j < 86400000) {
                return DisplayUtil.localizedString(R.string.mp_yesterday) + " " + simpleDateFormat3.format(instance.getTime());
            } else if (offset2 - j < 31536000000L) {
                return simpleDateFormat2.format(instance.getTime());
            }
        }
        return simpleDateFormat.format(instance.getTime());
    }

    @Override // tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!(objArr == null || objArr.length == 0)) {
            String str = "";
            String str2 = str + objArr[0];
            if (objArr.length > 1) {
                str = String.valueOf(objArr[1]);
            }
            long j = -1;
            try {
                if (str2 instanceof String) {
                    j = Long.parseLong(str2);
                }
            } catch (Throwable th) {
                TLog.loge("DataParserMpFormatTime", th.toString());
            }
            if (j > 0) {
                return formatTime(j, TextUtils.equals(str, "newFormatRule"));
            }
        }
        return null;
    }
}
