package com.taobao.message.sp.framework.model;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SimpleMessageListOriginal {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean hasMore;
    public long nextCursor;
    public List<SimpleMessageIMBAObject> userIMBAMessages;
    public List<SimpleMessageObject> userMessages;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SimpleMessageIMBAObject {
        public SimpleMessageIMBAObjectBody body;

        static {
            t2o.a(552599668);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SimpleMessageIMBAObjectBody {
        public String templateData;
        public SimpleMessageIMBAObjectTypeData typeData;

        static {
            t2o.a(552599669);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SimpleMessageIMBAObjectExt {
        public String oriMsgTypeId;
        public String oriTemplateId;

        static {
            t2o.a(552599670);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SimpleMessageIMBAObjectTypeData {
        public String entityType;
        public SimpleMessageIMBAObjectExt ext;
        public String from;
        public String mid;
        public int read;
        public long sendTime;
        public String sid;
        public int status;
        public String summary;
        public SimpleTarget target;
        public String tempId;
        public String to;
        public String toType;

        static {
            t2o.a(552599671);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SimpleMessageObject {
        public String content;
        public String messageId;
        public int msgStatus;
        public int readStatus;
        public long sendTime;
        public SimpleSenderInfo senderId;
        public String senderName;
        public String templateId;

        static {
            t2o.a(552599672);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SimpleSenderInfo {
        public long appUid;
        public String domain;

        static {
            t2o.a(552599673);
        }
    }

    static {
        t2o.a(552599667);
    }

    public static SimpleMessage convert(SimpleMessageObject simpleMessageObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleMessage) ipChange.ipc$dispatch("dc8d647d", new Object[]{simpleMessageObject, new Boolean(z)});
        }
        if (simpleMessageObject == null) {
            return null;
        }
        SimpleMessage simpleMessage = new SimpleMessage();
        String str = simpleMessageObject.messageId;
        simpleMessage.setCode(new SimpleMsgCode(str, str));
        try {
            simpleMessage.setMsgType(Integer.parseInt(simpleMessageObject.templateId));
            JSONObject parseObject = JSON.parseObject(simpleMessageObject.content);
            if (parseObject != null) {
                if (parseObject.containsKey("data") && parseObject.getJSONObject("data") != null) {
                    parseObject = parseObject.getJSONObject("data");
                }
                simpleMessage.setOriginalData(parseObject.getInnerMap());
            } else {
                simpleMessage.setOriginalData(new HashMap());
                TLog.loge("SimpleMessageListResult", "lack msg body:" + simpleMessageObject.messageId + ";" + simpleMessageObject.templateId);
            }
        } catch (Throwable th) {
            TLog.loge("SimpleMessageListResult", Log.getStackTraceString(th));
        }
        if (!z) {
            simpleMessage.setSender(SimpleTarget.obtain(String.valueOf(simpleMessageObject.senderId.appUid)));
        } else if (TextUtils.isEmpty(simpleMessageObject.senderName)) {
            simpleMessage.setSender(SimpleTarget.obtain(Login.getNick()));
        } else {
            simpleMessage.setSender(SimpleTarget.obtain(simpleMessageObject.senderName));
        }
        simpleMessage.setModifyTime(simpleMessageObject.sendTime);
        simpleMessage.setSendTime(simpleMessageObject.sendTime);
        simpleMessage.setStatus(simpleMessageObject.readStatus);
        simpleMessage.setSelfState(simpleMessageObject.msgStatus);
        return simpleMessage;
    }

    public static SimpleMessage convertIMBA(SimpleMessageIMBAObject simpleMessageIMBAObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleMessage) ipChange.ipc$dispatch("e2e826c5", new Object[]{simpleMessageIMBAObject});
        }
        if (simpleMessageIMBAObject == null) {
            return null;
        }
        SimpleMessage simpleMessage = new SimpleMessage();
        try {
            String str = simpleMessageIMBAObject.body.typeData.mid;
            simpleMessage.setCode(new SimpleMsgCode(str, str));
            JSONObject parseObject = JSON.parseObject(simpleMessageIMBAObject.body.templateData);
            if (parseObject != null) {
                simpleMessage.setOriginalData(parseObject.getInnerMap());
            }
            simpleMessage.setMsgType(Integer.parseInt(simpleMessageIMBAObject.body.typeData.tempId));
            simpleMessage.setSender(SimpleTarget.obtain(simpleMessageIMBAObject.body.typeData.ext.oriMsgTypeId));
            simpleMessage.setModifyTime(simpleMessageIMBAObject.body.typeData.sendTime);
            simpleMessage.setSendTime(simpleMessageIMBAObject.body.typeData.sendTime);
            simpleMessage.setStatus(simpleMessageIMBAObject.body.typeData.status);
            simpleMessage.setSelfState(simpleMessageIMBAObject.body.typeData.read);
            simpleMessage.setExt(JSON.parseObject(JSON.toJSONString(simpleMessageIMBAObject.body.typeData.ext)).getInnerMap());
            return simpleMessage;
        } catch (Throwable th) {
            TLog.loge("SimpleMessageListResult", Log.getStackTraceString(th));
            return null;
        }
    }

    public static List<SimpleMessage> parse(List<SimpleMessageObject> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e7cccd9e", new Object[]{list, new Boolean(z)});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (SimpleMessageObject simpleMessageObject : list) {
                arrayList.add(convert(simpleMessageObject, z));
            }
        }
        return arrayList;
    }

    public static List<SimpleMessage> parseIMBA(List<SimpleMessageIMBAObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d2aad679", new Object[]{list});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (SimpleMessageIMBAObject simpleMessageIMBAObject : list) {
                SimpleMessage convertIMBA = convertIMBA(simpleMessageIMBAObject);
                if (convertIMBA != null) {
                    arrayList.add(convertIMBA);
                }
            }
        }
        return arrayList;
    }
}
