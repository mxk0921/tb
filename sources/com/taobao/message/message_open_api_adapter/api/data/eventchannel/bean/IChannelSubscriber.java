package com.taobao.message.message_open_api_adapter.api.data.eventchannel.bean;

import com.alipay.android.msp.constants.MspFlybirdDefine;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/message/message_open_api_adapter/api/data/eventchannel/bean/IChannelSubscriber;", "", "", "Lcom/taobao/message/message_open_api_adapter/api/data/eventchannel/bean/ChannelEvent;", "event", "Ltb/xhv;", MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, "(Ljava/util/List;)V", "", "topic", "()Ljava/lang/String;", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IChannelSubscriber {
    void onEvent(List<ChannelEvent> list);

    String topic();
}
