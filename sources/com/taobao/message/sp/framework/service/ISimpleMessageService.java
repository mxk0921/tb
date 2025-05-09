package com.taobao.message.sp.framework.service;

import com.taobao.message.kit.core.IObserver;
import com.taobao.message.sp.framework.model.SimpleMessageListResult;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\t\u0010\nJ-\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\f\u0010\nJ=\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005H&¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005H&¢\u0006\u0004\b\u0017\u0010\u0015J=\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005H&¢\u0006\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/taobao/message/sp/framework/service/ISimpleMessageService;", "Lcom/taobao/message/sp/framework/service/ISimpleDataService;", "", "receiverId", "msgBody", "Lcom/taobao/message/kit/core/IObserver;", "", "observer", "Ltb/xhv;", "sendMessage", "(Ljava/lang/String;Ljava/lang/String;Lcom/taobao/message/kit/core/IObserver;)V", "receiverNick", "sendMessageByNick", "targetId", "", "cursor", "forward", "", "count", "Lcom/taobao/message/sp/framework/model/SimpleMessageListResult;", "listMessages", "(Ljava/lang/String;JZILcom/taobao/message/kit/core/IObserver;)V", "nick", "listMessagesByNick", "ccode", "listMessagesByCCode", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ISimpleMessageService extends ISimpleDataService {
    void listMessages(String str, long j, boolean z, int i, IObserver<SimpleMessageListResult> iObserver);

    void listMessagesByCCode(String str, long j, boolean z, int i, IObserver<SimpleMessageListResult> iObserver);

    void listMessagesByNick(String str, long j, boolean z, int i, IObserver<SimpleMessageListResult> iObserver);

    void sendMessage(String str, String str2, IObserver<Boolean> iObserver);

    void sendMessageByNick(String str, String str2, IObserver<Boolean> iObserver);
}
