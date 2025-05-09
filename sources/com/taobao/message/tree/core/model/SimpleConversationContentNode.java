package com.taobao.message.tree.core.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.sp.framework.model.SimpleConversation;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SimpleConversationContentNode extends NodeImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private SimpleConversation mConversation;

    static {
        t2o.a(552599723);
    }

    public SimpleConversationContentNode(SimpleConversation simpleConversation) {
        String str;
        this.mConversation = simpleConversation;
        long sortKey = getSortKey(simpleConversation);
        HashMap hashMap = new HashMap();
        hashMap.put("title", this.mConversation.getConversationContent().getConversationName());
        hashMap.put("headIcon", this.mConversation.getConversationContent().getHeadUrl());
        if ((this.mConversation.getRemindType() & 1) == 0) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("tipType", str);
        hashMap.put("tipNumber", Integer.valueOf(this.mConversation.getConversationContent().getUnReadNumber()));
        hashMap.put("summary", this.mConversation.getConversationContent().getLastMessageSummary().getContent());
        hashMap.put("lastMessageTime", Long.valueOf(this.mConversation.getConversationContent().getLastMessageSummary().getSendTime()));
        hashMap.put("lastMessageType", Integer.valueOf(this.mConversation.getConversationContent().getLastMessageSummary().getMsgType()));
        hashMap.put("stick", Integer.valueOf(this.mConversation.getPosition()));
        hashMap.put("sortPriority", Long.valueOf(this.mConversation.getModifyTime()));
        hashMap.put("targetId", this.mConversation.getConversationIdentifier().getTarget().getTargetId());
        hashMap.put("targetType", this.mConversation.getConversationIdentifier().getTarget().getTargetType());
        hashMap.put("remindType", Integer.valueOf(this.mConversation.getRemindType()));
        hashMap.put("bizType", this.mConversation.getConversationIdentifier().getBizType());
        hashMap.put("sortKey", Long.valueOf(sortKey));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("sort.key", Long.valueOf(sortKey));
        setObject(this.mConversation);
        setComputedData(hashMap);
        setViewMap(hashMap2);
        setOriginalObjectType("conversation");
        setOriginalObjectId(this.mConversation.getConversationCode());
        setNodeId(this.mConversation.getConversationCode());
    }

    private long getSortKey(SimpleConversation simpleConversation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2eafd092", new Object[]{this, simpleConversation})).longValue();
        }
        if (simpleConversation == null) {
            return 0L;
        }
        long sendTime = simpleConversation.getConversationContent().getLastMessageSummary().getSendTime();
        if (sendTime == 0) {
            return simpleConversation.getModifyTime();
        }
        return sendTime;
    }

    public static /* synthetic */ Object ipc$super(SimpleConversationContentNode simpleConversationContentNode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/tree/core/model/SimpleConversationContentNode");
    }
}
