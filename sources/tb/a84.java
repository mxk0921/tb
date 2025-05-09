package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.Calendar;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a84 {
    public static final String EMPTY = "";

    static {
        t2o.a(693108793);
    }

    public static boolean a(ScheduleDTOModule scheduleDTOModule) {
        long j;
        long j2;
        if (scheduleDTOModule == null) {
            return false;
        }
        if (scheduleDTOModule.getStartTime() != null) {
            Calendar a2 = vu6.a(scheduleDTOModule.getStartTime());
            if (a2 == null) {
                return false;
            }
            j = a2.getTimeInMillis();
        } else {
            j = 0;
        }
        if (scheduleDTOModule.getEndTime() != null) {
            Calendar a3 = vu6.a(scheduleDTOModule.getEndTime());
            if (a3 == null) {
                return false;
            }
            j2 = a3.getTimeInMillis();
        } else {
            j2 = 0;
        }
        if (j <= 0 || j2 <= 0) {
            return false;
        }
        return true;
    }

    public static boolean b(ScheduleDTOModule scheduleDTOModule) {
        if (scheduleDTOModule != null && !TextUtils.isEmpty(scheduleDTOModule.getBizId()) && !TextUtils.isEmpty(scheduleDTOModule.getOutId()) && !TextUtils.isEmpty(scheduleDTOModule.getLink())) {
            return true;
        }
        return false;
    }

    public static long c(String str, long j) {
        OrangeConfig instance = OrangeConfig.getInstance();
        String config = instance.getConfig("tbcalendar_switch", str, "" + j);
        TLog.logd("calendar.TAG", "key = " + str + ", value=" + config);
        try {
            return Long.valueOf(config).longValue();
        } catch (Exception unused) {
            return j;
        }
    }

    public static String e(ScheduleDTOModule scheduleDTOModule) {
        if (scheduleDTOModule == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizId", (Object) scheduleDTOModule.getBizId());
        jSONObject.put("bizId", (Object) scheduleDTOModule.getOutId());
        return jSONObject.toJSONString();
    }

    public static ScheduleDTOModule d(JSONObject jSONObject) {
        int i;
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("bizId");
            String string2 = jSONObject.getString("outId");
            String string3 = jSONObject.getString("title");
            String string4 = jSONObject.getString("startTime");
            String string5 = jSONObject.getString("endTime");
            String string6 = jSONObject.getString("link");
            String string7 = jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE);
            String string8 = jSONObject.getString("repeatDays");
            if (!TextUtils.isEmpty(string4) && !TextUtils.isEmpty(string5)) {
                ScheduleDTOModule scheduleDTOModule = new ScheduleDTOModule();
                scheduleDTOModule.setBizId(string);
                scheduleDTOModule.setOutId(string2);
                scheduleDTOModule.setTitle(string3);
                scheduleDTOModule.setSubTitle(string7);
                if (!TextUtils.isEmpty(string8)) {
                    try {
                        i = Integer.parseInt(string8);
                    } catch (Exception unused) {
                        i = 0;
                    }
                    scheduleDTOModule.setRepeatDays(i);
                }
                if (!TextUtils.isEmpty(string4)) {
                    scheduleDTOModule.setStartTime(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    scheduleDTOModule.setEndTime(string5);
                }
                scheduleDTOModule.setLink(string6);
                return scheduleDTOModule;
            }
        } catch (Exception unused2) {
        }
        return null;
    }
}
