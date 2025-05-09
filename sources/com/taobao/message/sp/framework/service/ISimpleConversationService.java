package com.taobao.message.sp.framework.service;

import com.taobao.message.kit.core.IObserver;
import com.taobao.message.sp.framework.model.SimpleConversation;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0004H&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/taobao/message/sp/framework/service/ISimpleConversationService;", "Lcom/taobao/message/sp/framework/service/ISimpleDataService;", "", "targetId", "Lcom/taobao/message/kit/core/IObserver;", "", "observer", "Ltb/xhv;", "createConversation", "(Ljava/lang/String;Lcom/taobao/message/kit/core/IObserver;)V", "", "count", "", "Lcom/taobao/message/sp/framework/model/SimpleConversation;", "listConversations", "(ILcom/taobao/message/kit/core/IObserver;)V", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ISimpleConversationService extends ISimpleDataService {
    void createConversation(String str, IObserver<Boolean> iObserver);

    void listConversations(int i, IObserver<List<SimpleConversation>> iObserver);
}
