package com.taobao.accs.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import tb.bxf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MessageBizAck extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MessageBizAck";
    private String mStepId = "accs";
    private AckExtraData mExtData = new AckExtraData("-1");
    private AtomicInteger mIndex = new AtomicInteger(0);

    static {
        t2o.a(343933087);
    }

    public static MessageBizAck buildBizAck(String str, String str2, String str3, String str4, String str5, boolean z, short s, String str6, Map<Integer, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageBizAck) ipChange.ipc$dispatch("46ca887e", new Object[]{str, str2, str3, str4, str5, new Boolean(z), new Short(s), str6, map});
        }
        MessageBizAck messageBizAck = new MessageBizAck();
        Message.buildPushAckCommon(str, str2, str3, str4, str5, z, s, str6, map, messageBizAck);
        return messageBizAck;
    }

    public static /* synthetic */ Object ipc$super(MessageBizAck messageBizAck, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/data/MessageBizAck");
    }

    public void update(String str, AckExtraData ackExtraData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b601383b", new Object[]{this, str, ackExtraData});
            return;
        }
        this.mStepId = str;
        this.mExtData = ackExtraData;
        this.mIndex.incrementAndGet();
    }

    public void updateExtHeader(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b385b741", new Object[]{this, new Integer(i), str});
        } else {
            this.extHeader.put(Integer.valueOf(i), str);
        }
    }

    @Override // com.taobao.accs.data.Message
    public void buildData() throws JSONException, UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c486bbf", new Object[]{this});
            return;
        }
        bxf.a d = new bxf.a().d(Constants.KEY_STEPID, this.mStepId).d("index", String.valueOf(this.mIndex));
        AckExtraData ackExtraData = this.mExtData;
        String str = "";
        bxf.a d2 = d.d("time", ackExtraData == null ? str : ackExtraData.getTime());
        AckExtraData ackExtraData2 = this.mExtData;
        if (ackExtraData2 != null) {
            str = ackExtraData2.getErrCode();
        }
        String jSONObject = d2.d("errCode", str).a().toString();
        ALog.i(TAG, "after buildData, ", "data", jSONObject, "dataId", this.dataId, "extHeader", this.extHeader);
        this.data = jSONObject.getBytes(StandardCharsets.UTF_8);
    }
}
