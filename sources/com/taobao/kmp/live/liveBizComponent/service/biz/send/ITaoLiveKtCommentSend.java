package com.taobao.kmp.live.liveBizComponent.service.biz.send;

import com.taobao.kmp.live.liveBizComponent.model.leftBottom.send.TaoLiveKtCommentSendModel;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.send.TaoLiveKtCommentSendResponse;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import tb.g1a;
import tb.xhv;
import tb.yj4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J'\u0010\b\u001a\u00020\u00072\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003H&¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u000b\u0010\fJF\u0010\u0015\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\u00042+\b\u0002\u0010\u0014\u001a%\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rj\u0004\u0018\u0001`\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016JF\u0010\u0018\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072+\b\u0002\u0010\u0014\u001a%\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rj\u0004\u0018\u0001`\u0013H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ5\u0010\u001d\u001a\u00020\u00122$\u0010\u0014\u001a \u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001aH&¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/service/biz/send/ITaoLiveKtCommentSend;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "", "", "", "params", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendModel;", "fetchCommentSend", "(Ljava/util/Map;)Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendModel;", yj4.PARAM_CHAT_RENDERS_ENHANCE, "fetchCommentActionSend", "(Ljava/lang/String;)Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendModel;", "Lkotlin/Function1;", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendResponse;", "Lkotlin/ParameterName;", "name", "response", "Ltb/xhv;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/send/TaoLiveCommentSendCallback;", "callback", "sendCommentAction", "(Ljava/lang/String;Ltb/g1a;)V", "data", "sendComment", "(Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendModel;Ltb/g1a;)V", "", "canShowHighLightSwith", "()Z", "fetchHighLightCommentSwitch", "(Ltb/g1a;)V", "open", "updateHighLightCommentSwitch", "(Z)V", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoLiveKtCommentSend extends Serializable {
    boolean canShowHighLightSwith();

    TaoLiveKtCommentSendModel fetchCommentActionSend(String str);

    TaoLiveKtCommentSendModel fetchCommentSend(Map<String, ? extends Object> map);

    void fetchHighLightCommentSwitch(g1a<? super Map<String, ? extends Object>, xhv> g1aVar);

    void sendComment(TaoLiveKtCommentSendModel taoLiveKtCommentSendModel, g1a<? super TaoLiveKtCommentSendResponse, xhv> g1aVar);

    void sendCommentAction(String str, g1a<? super TaoLiveKtCommentSendResponse, xhv> g1aVar);

    void updateHighLightCommentSwitch(boolean z);
}
