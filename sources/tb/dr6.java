package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.LinkageUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.heytap.mcssdk.constant.McsEventConstant$EventId;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.msp.push.mode.DataMessage;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dr6 extends vpi {
    static {
        t2o.a(612368413);
    }

    public String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new JSONObject(str).optString("msg_command");
        } catch (JSONException e) {
            dgh.a(e.getMessage());
            return "";
        }
    }

    public BaseMode d(Intent intent, int i) {
        try {
            DataMessage dataMessage = new DataMessage();
            dataMessage.setMessageID(ty4.e(intent.getStringExtra("messageID")));
            dataMessage.setTaskID(ty4.e(intent.getStringExtra(v4s.PARAM_TASK_ID)));
            dataMessage.setGlobalId(ty4.e(intent.getStringExtra("globalID")));
            dataMessage.setAppPackage(ty4.e(intent.getStringExtra("appPackage")));
            dataMessage.setTitle(ty4.e(intent.getStringExtra("title")));
            dataMessage.setContent(ty4.e(intent.getStringExtra("content")));
            dataMessage.setDescription(ty4.e(intent.getStringExtra("description")));
            String e = ty4.e(intent.getStringExtra("notifyID"));
            int i2 = 0;
            dataMessage.setNotifyID(TextUtils.isEmpty(e) ? 0 : Integer.parseInt(e));
            dataMessage.setMiniProgramPkg(ty4.e(intent.getStringExtra("miniProgramPkg")));
            dataMessage.setMessageType(i);
            dataMessage.setEventId(ty4.e(intent.getStringExtra("eventId")));
            dataMessage.setStatisticsExtra(ty4.e(intent.getStringExtra("statistics_extra")));
            String e2 = ty4.e(intent.getStringExtra("data_extra"));
            dataMessage.setDataExtra(e2);
            String c = c(e2);
            if (!TextUtils.isEmpty(c)) {
                i2 = Integer.parseInt(c);
            }
            dataMessage.setMsgCommand(i2);
            dataMessage.setBalanceTime(ty4.e(intent.getStringExtra("balanceTime")));
            dataMessage.setStartDate(ty4.e(intent.getStringExtra("startDate")));
            dataMessage.setEndDate(ty4.e(intent.getStringExtra("endDate")));
            dataMessage.setTimeRanges(ty4.e(intent.getStringExtra("timeRanges")));
            dataMessage.setRule(ty4.e(intent.getStringExtra(LinkageUtils.PolicyType.RULE)));
            dataMessage.setForcedDelivery(ty4.e(intent.getStringExtra("forcedDelivery")));
            dataMessage.setDistinctContent(ty4.e(intent.getStringExtra("distinctBycontent")));
            dataMessage.setAppId(ty4.e(intent.getStringExtra(LogContext.STORAGE_APPID)));
            return dataMessage;
        } catch (Exception e3) {
            dgh.a("OnHandleIntent--" + e3.getMessage());
            return null;
        }
    }

    @Override // tb.csl
    public BaseMode a(Context context, int i, Intent intent) {
        if (4103 != i && 4098 != i && 4108 != i) {
            return null;
        }
        BaseMode d = d(intent, i);
        xai.a(context, McsEventConstant$EventId.EVENT_ID_PUSH_TRANSMIT, (DataMessage) d);
        return d;
    }
}
