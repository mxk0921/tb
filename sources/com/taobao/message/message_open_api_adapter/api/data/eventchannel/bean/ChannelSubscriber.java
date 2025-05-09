package com.taobao.message.message_open_api_adapter.api.data.eventchannel.bean;

import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import java.util.List;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\nJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\nR#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/taobao/message/message_open_api_adapter/api/data/eventchannel/bean/ChannelSubscriber;", "Lcom/taobao/message/message_open_api_adapter/api/data/eventchannel/bean/IChannelSubscriber;", "", "topic", "Lcom/taobao/message/kit/core/IObserver;", "", "Lcom/taobao/message/message_open_api_adapter/api/data/eventchannel/bean/ChannelEvent;", "observer", "<init>", "(Ljava/lang/String;Lcom/taobao/message/kit/core/IObserver;)V", "()Ljava/lang/String;", "events", "Ltb/xhv;", MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, "(Ljava/util/List;)V", "Ljava/lang/String;", "getTopic", "Lcom/taobao/message/kit/core/IObserver;", "getObserver", "()Lcom/taobao/message/kit/core/IObserver;", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ChannelSubscriber implements IChannelSubscriber {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final IObserver<List<ChannelEvent>> observer;
    private final String topic;

    static {
        t2o.a(529531071);
        t2o.a(529531072);
    }

    public ChannelSubscriber(String str, IObserver<List<ChannelEvent>> iObserver) {
        ckf.h(str, "topic");
        ckf.h(iObserver, "observer");
        this.topic = str;
        this.observer = iObserver;
    }

    public final IObserver<List<ChannelEvent>> getObserver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IObserver) ipChange.ipc$dispatch("4683f901", new Object[]{this});
        }
        return this.observer;
    }

    public final String getTopic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this});
        }
        return this.topic;
    }

    @Override // com.taobao.message.message_open_api_adapter.api.data.eventchannel.bean.IChannelSubscriber
    public void onEvent(List<ChannelEvent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ab9ff3", new Object[]{this, list});
            return;
        }
        ckf.h(list, "events");
        this.observer.onNext(list);
    }

    @Override // com.taobao.message.message_open_api_adapter.api.data.eventchannel.bean.IChannelSubscriber
    public String topic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9373c52a", new Object[]{this});
        }
        return this.topic;
    }
}
