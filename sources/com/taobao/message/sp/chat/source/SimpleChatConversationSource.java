package com.taobao.message.sp.chat.source;

import com.alibaba.security.realidentity.p1;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.datasdk.facade.model.ResultData;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.Source;
import com.taobao.message.lab.comfrm.support.UserIdentifier;
import com.taobao.message.sp.framework.model.SimpleConversation;
import com.taobao.message.sp.framework.model.SimpleConversationContent;
import com.taobao.message.sp.framework.model.SimpleMessageListData;
import com.taobao.message.sp.framework.model.SimpleProfile;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0005J7\u0010\u0013\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001d\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lcom/taobao/message/sp/chat/source/SimpleChatConversationSource;", "Lcom/taobao/message/lab/comfrm/inner2/Source;", "Lcom/taobao/message/sp/framework/model/SimpleMessageListData;", "Lcom/taobao/message/lab/comfrm/support/UserIdentifier;", "<init>", "()V", "Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;", "p0", "Ltb/xhv;", "subscribe", "(Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;)V", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "Lcom/taobao/message/lab/comfrm/inner2/Command;", "command", "", "", "", "props", "dispatcher", "use", "(Lcom/taobao/message/lab/comfrm/inner2/Command;Ljava/util/Map;Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;)V", "Lcom/taobao/message/sp/framework/model/SimpleConversation;", "data", "dispatchConversation", "(Lcom/taobao/message/sp/framework/model/SimpleConversation;Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;)V", "Lcom/taobao/message/lab/comfrm/core/Action;", p1.d, "updateOriginalData", "(Lcom/taobao/message/lab/comfrm/core/Action;Lcom/taobao/message/sp/framework/model/SimpleMessageListData;)Lcom/taobao/message/sp/framework/model/SimpleMessageListData;", "identifier", "(Ljava/lang/String;)V", "Ljava/lang/String;", "message_sp_chat_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SimpleChatConversationSource implements Source<SimpleMessageListData>, UserIdentifier {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String identifier;

    static {
        t2o.a(551550995);
        t2o.a(537919645);
        t2o.a(537919771);
    }

    public final void dispatchConversation(SimpleConversation simpleConversation, ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16ad716", new Object[]{this, simpleConversation, actionDispatcher});
            return;
        }
        ckf.h(simpleConversation, "data");
        ckf.h(actionDispatcher, "dispatcher");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SimpleProfile simpleProfile = new SimpleProfile();
        SimpleConversationContent conversationContent = simpleConversation.getConversationContent();
        ckf.c(conversationContent, "data.conversationContent");
        simpleProfile.setAvatarURL(conversationContent.getHeadUrl());
        SimpleConversationContent conversationContent2 = simpleConversation.getConversationContent();
        ckf.c(conversationContent2, "data.conversationContent");
        simpleProfile.setDisplayName(conversationContent2.getConversationName());
        linkedHashMap.put("profile", simpleProfile);
        actionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(new ResultData(simpleConversation, linkedHashMap)).build());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        }
    }

    @Override // com.taobao.message.lab.comfrm.support.UserIdentifier
    public void identifier(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee19127a", new Object[]{this, str});
            return;
        }
        ckf.h(str, "p0");
        this.identifier = str;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void subscribe(ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c519475", new Object[]{this, actionDispatcher});
        }
    }

    public SimpleMessageListData updateOriginalData(Action action, SimpleMessageListData simpleMessageListData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleMessageListData) ipChange.ipc$dispatch("a9837232", new Object[]{this, action, simpleMessageListData}) : simpleMessageListData;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void use(Command command, Map<String, Object> map, ActionDispatcher actionDispatcher) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c59d34", new Object[]{this, command, map, actionDispatcher});
            return;
        }
        ckf.h(actionDispatcher, "dispatcher");
        if (map != null) {
            obj = map.get("conversation");
        } else {
            obj = null;
        }
        if (obj instanceof SimpleConversation) {
            dispatchConversation((SimpleConversation) obj, actionDispatcher);
        }
    }
}
