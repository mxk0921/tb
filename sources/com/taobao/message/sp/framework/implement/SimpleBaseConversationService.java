package com.taobao.message.sp.framework.implement;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.kit.util.TraceUtil;
import com.taobao.message.sp.framework.model.SimpleConversation;
import com.taobao.message.sp.framework.model.SimpleConversationContent;
import com.taobao.message.sp.framework.model.SimpleConversationIdentifier;
import com.taobao.message.sp.framework.model.SimpleMessageSummary;
import com.taobao.message.sp.framework.model.SimpleMsgCode;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.message.sp.framework.model.SimpleTarget;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmpConversationListRequest;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmpConversationListResponse;
import com.taobao.message.sp.framework.service.ISimpleConversationService;
import com.taobao.message.sp.framework.service.SimpleConversationCache;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\rH&¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 ¨\u0006!"}, d2 = {"Lcom/taobao/message/sp/framework/implement/SimpleBaseConversationService;", "Lcom/taobao/message/sp/framework/service/ISimpleConversationService;", "", "mIdentifier", "mChannelType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/alibaba/fastjson/JSONObject;", "conversationObject", "Lcom/taobao/message/sp/framework/model/SimpleConversation;", "parseConversation", "(Lcom/alibaba/fastjson/JSONObject;)Lcom/taobao/message/sp/framework/model/SimpleConversation;", "jsonData", "", "parseConversationList", "(Ljava/lang/String;)Ljava/util/List;", "targetId", "Lcom/taobao/message/kit/core/IObserver;", "", "observer", "Ltb/xhv;", "createConversation", "(Ljava/lang/String;Lcom/taobao/message/kit/core/IObserver;)V", "getListConversationsChannelList", "()Ljava/util/List;", "", "count", "listConversations", "(ILcom/taobao/message/kit/core/IObserver;)V", "getIdentifier", "()Ljava/lang/String;", "getChannelType", "Ljava/lang/String;", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class SimpleBaseConversationService implements ISimpleConversationService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mChannelType;
    private final String mIdentifier;

    static {
        t2o.a(552599650);
        t2o.a(552599703);
    }

    public SimpleBaseConversationService(String str, String str2) {
        ckf.h(str, "mIdentifier");
        ckf.h(str2, "mChannelType");
        this.mIdentifier = str;
        this.mChannelType = str2;
    }

    public static final /* synthetic */ List access$parseConversationList(SimpleBaseConversationService simpleBaseConversationService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1bf0a3b2", new Object[]{simpleBaseConversationService, str});
        }
        return simpleBaseConversationService.parseConversationList(str);
    }

    private final SimpleConversation parseConversation(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleConversation) ipChange.ipc$dispatch("f350a9ef", new Object[]{this, jSONObject});
        }
        SimpleConversation simpleConversation = new SimpleConversation();
        simpleConversation.setConversationContent(new SimpleConversationContent());
        SimpleConversationContent conversationContent = simpleConversation.getConversationContent();
        ckf.c(conversationContent, "conversation.conversationContent");
        conversationContent.setLastMessageSummary(new SimpleMessageSummary());
        simpleConversation.setConversationIdentifier(new SimpleConversationIdentifier());
        SimpleConversationIdentifier conversationIdentifier = simpleConversation.getConversationIdentifier();
        ckf.c(conversationIdentifier, "conversation.conversationIdentifier");
        conversationIdentifier.setTarget(new SimpleTarget());
        JSONObject jSONObject2 = jSONObject.getJSONObject("conversation");
        if (jSONObject2 != null) {
            SimpleConversationIdentifier conversationIdentifier2 = simpleConversation.getConversationIdentifier();
            ckf.c(conversationIdentifier2, "conversation.conversationIdentifier");
            conversationIdentifier2.setBizType(jSONObject2.getString("bizType"));
            simpleConversation.setConversationCode(jSONObject2.getString("conversationId"));
            simpleConversation.setModifyTime(jSONObject2.getLongValue(SimpleProfile.KEY_MODIFY_TIME));
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("lastMessage");
        if (jSONObject3 != null) {
            SimpleConversationContent conversationContent2 = simpleConversation.getConversationContent();
            ckf.c(conversationContent2, "conversation.conversationContent");
            SimpleMessageSummary lastMessageSummary = conversationContent2.getLastMessageSummary();
            ckf.c(lastMessageSummary, "conversation.conversatio…ontent.lastMessageSummary");
            lastMessageSummary.setSendTime(jSONObject3.getLongValue(RemoteMessageConst.SEND_TIME));
            SimpleConversationContent conversationContent3 = simpleConversation.getConversationContent();
            ckf.c(conversationContent3, "conversation.conversationContent");
            SimpleMessageSummary lastMessageSummary2 = conversationContent3.getLastMessageSummary();
            ckf.c(lastMessageSummary2, "conversation.conversatio…ontent.lastMessageSummary");
            lastMessageSummary2.setContent(jSONObject3.getString("content"));
            SimpleConversationContent conversationContent4 = simpleConversation.getConversationContent();
            ckf.c(conversationContent4, "conversation.conversationContent");
            SimpleMessageSummary lastMessageSummary3 = conversationContent4.getLastMessageSummary();
            ckf.c(lastMessageSummary3, "conversation.conversatio…ontent.lastMessageSummary");
            if (TextUtils.isEmpty(lastMessageSummary3.getContent())) {
                SimpleConversationContent conversationContent5 = simpleConversation.getConversationContent();
                ckf.c(conversationContent5, "conversation.conversationContent");
                SimpleMessageSummary lastMessageSummary4 = conversationContent5.getLastMessageSummary();
                ckf.c(lastMessageSummary4, "conversation.conversatio…ontent.lastMessageSummary");
                lastMessageSummary4.setContent(DisplayUtil.localizedString(R.string.mp_click_to_view_details));
            }
            SimpleConversationContent conversationContent6 = simpleConversation.getConversationContent();
            ckf.c(conversationContent6, "conversation.conversationContent");
            SimpleMessageSummary lastMessageSummary5 = conversationContent6.getLastMessageSummary();
            ckf.c(lastMessageSummary5, "conversation.conversatio…ontent.lastMessageSummary");
            lastMessageSummary5.setCode(new SimpleMsgCode(jSONObject3.getString(RemoteMessageConst.MSGID)));
        }
        simpleConversation.setChannelType(jSONObject.getString("msgChannelType"));
        simpleConversation.setRemindType(jSONObject.getIntValue("remindType"));
        simpleConversation.setPosition(jSONObject.getIntValue("position"));
        JSONObject jSONObject4 = jSONObject.getJSONObject("targetUser");
        if (jSONObject4 != null) {
            SimpleConversationIdentifier conversationIdentifier3 = simpleConversation.getConversationIdentifier();
            ckf.c(conversationIdentifier3, "conversation.conversationIdentifier");
            conversationIdentifier3.setTarget(SimpleTarget.obtain("3", jSONObject4.getString("userId")));
            SimpleConversationContent conversationContent7 = simpleConversation.getConversationContent();
            ckf.c(conversationContent7, "conversation.conversationContent");
            conversationContent7.setConversationName(jSONObject4.getString(SimpleProfile.KEY_DISPLAYNAME));
            SimpleConversationContent conversationContent8 = simpleConversation.getConversationContent();
            ckf.c(conversationContent8, "conversation.conversationContent");
            conversationContent8.setHeadUrl(jSONObject4.getString("headUrl"));
        }
        SimpleConversationContent conversationContent9 = simpleConversation.getConversationContent();
        ckf.c(conversationContent9, "conversation.conversationContent");
        conversationContent9.setUnReadNumber(jSONObject.getIntValue("unReadNum"));
        return simpleConversation;
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleConversationService
    public void createConversation(String str, IObserver<Boolean> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd5d578e", new Object[]{this, str, iObserver});
            return;
        }
        ckf.h(str, "targetId");
        ckf.h(iObserver, "observer");
        iObserver.onError(new IllegalAccessException("not implement"));
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleDataService
    public String getChannelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44447fb2", new Object[]{this});
        }
        return this.mChannelType;
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleDataService
    public String getIdentifier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this});
        }
        return this.mIdentifier;
    }

    public abstract List<String> getListConversationsChannelList();

    @Override // com.taobao.message.sp.framework.service.ISimpleConversationService
    public void listConversations(int i, IObserver<List<SimpleConversation>> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b008f4", new Object[]{this, new Integer(i), iObserver});
            return;
        }
        ckf.h(iObserver, "observer");
        TraceUtil.asyncTraceBegin("simpleTab", "listConversations", 1111111);
        MtopTaobaoWirelessAmpConversationListRequest mtopTaobaoWirelessAmpConversationListRequest = new MtopTaobaoWirelessAmpConversationListRequest();
        mtopTaobaoWirelessAmpConversationListRequest.setFetchCount(i);
        mtopTaobaoWirelessAmpConversationListRequest.setStartTime("0");
        mtopTaobaoWirelessAmpConversationListRequest.setMsgChannelTypeList(JSON.toJSONString(getListConversationsChannelList()));
        mtopTaobaoWirelessAmpConversationListRequest.setSource("mtop");
        mtopTaobaoWirelessAmpConversationListRequest.setAppName("bentley");
        long currentTimeMillis = System.currentTimeMillis();
        String stringSharedPreference = SharedPreferencesUtil.getStringSharedPreference("msgSimpleTab");
        if (!TextUtils.isEmpty(stringSharedPreference)) {
            ckf.c(stringSharedPreference, "msgSimpleTab");
            List<SimpleConversation> parseConversationList = parseConversationList(stringSharedPreference);
            StringBuilder sb = new StringBuilder("listConversations cache");
            sb.append((parseConversationList != null ? Integer.valueOf(parseConversationList.size()) : null).intValue());
            TLog.loge("SimpleConversationService", sb.toString());
            SimpleConversationCache.INSTANCE.addData(parseConversationList);
            iObserver.onNext(parseConversationList);
        }
        RemoteBusiness.build((IMTOPDataObject) mtopTaobaoWirelessAmpConversationListRequest).registerListener((IRemoteListener) new SimpleBaseConversationService$listConversations$1(this, currentTimeMillis, iObserver)).startRequest(MtopTaobaoWirelessAmpConversationListResponse.class);
    }

    private final List<SimpleConversation> parseConversationList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e83bef82", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray parseArray = JSON.parseArray(str);
                if (parseArray != null && parseArray.size() > 0) {
                    int size = parseArray.size();
                    for (int i = 0; i < size; i++) {
                        JSONObject jSONObject = parseArray.getJSONObject(i);
                        ckf.c(jSONObject, "jsonArray.getJSONObject(i)");
                        SimpleConversation parseConversation = parseConversation(jSONObject);
                        if (parseConversation != null) {
                            arrayList.add(parseConversation);
                        }
                    }
                }
            } catch (JSONException e) {
                TLog.loge("SimpleConversationService", "parse error " + e.getMessage() + ", " + str);
            }
        }
        return arrayList;
    }
}
