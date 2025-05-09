package com.taobao.message.message_open_api_adapter.api.data.eventchannel;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.message_open_api_adapter.api.data.eventchannel.bean.ChannelEvent;
import com.taobao.message.message_open_api_adapter.api.data.eventchannel.bean.IChannelSubscriber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;
import tb.xhv;
import tb.xz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\bR0\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0011j\b\u0012\u0004\u0012\u00020\u0004`\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/taobao/message/message_open_api_adapter/api/data/eventchannel/ChannelEventManager;", "", "<init>", "()V", "Lcom/taobao/message/message_open_api_adapter/api/data/eventchannel/bean/IChannelSubscriber;", "subscriber", "Ltb/xhv;", "addSubscriber", "(Lcom/taobao/message/message_open_api_adapter/api/data/eventchannel/bean/IChannelSubscriber;)V", "", "topicName", "Lcom/taobao/message/message_open_api_adapter/api/data/eventchannel/bean/ChannelEvent;", "event", "postEvent", "(Ljava/lang/String;Lcom/taobao/message/message_open_api_adapter/api/data/eventchannel/bean/ChannelEvent;)V", "removeSubscriber", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "subscriberLists", "Ljava/util/Map;", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ChannelEventManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ChannelEventManager INSTANCE = new ChannelEventManager();
    private static final Map<String, ArrayList<IChannelSubscriber>> subscriberLists = new ConcurrentHashMap();

    static {
        t2o.a(529531069);
    }

    private ChannelEventManager() {
    }

    public final void addSubscriber(IChannelSubscriber iChannelSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3a0bfcd", new Object[]{this, iChannelSubscriber});
            return;
        }
        ckf.h(iChannelSubscriber, "subscriber");
        Map<String, ArrayList<IChannelSubscriber>> map = subscriberLists;
        synchronized (map) {
            try {
                String str = iChannelSubscriber.topic();
                if (!map.containsKey(str)) {
                    map.put(str, new ArrayList<>());
                }
                ArrayList<IChannelSubscriber> arrayList = map.get(str);
                if (arrayList != null) {
                    arrayList.add(iChannelSubscriber);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void postEvent(String str, ChannelEvent channelEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f7f3dd", new Object[]{this, str, channelEvent});
            return;
        }
        ckf.h(str, "topicName");
        ckf.h(channelEvent, "event");
        Map<String, ArrayList<IChannelSubscriber>> map = subscriberLists;
        synchronized (map) {
            try {
                for (Map.Entry<String, ArrayList<IChannelSubscriber>> entry : map.entrySet()) {
                    if (ckf.b(entry.getKey(), str)) {
                        Iterator<IChannelSubscriber> it = entry.getValue().iterator();
                        while (it.hasNext()) {
                            it.next().onEvent(xz3.e(channelEvent));
                        }
                    }
                }
                xhv xhvVar = xhv.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void removeSubscriber(IChannelSubscriber iChannelSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b5d34a", new Object[]{this, iChannelSubscriber});
            return;
        }
        ckf.h(iChannelSubscriber, "subscriber");
        Map<String, ArrayList<IChannelSubscriber>> map = subscriberLists;
        synchronized (map) {
            try {
                String str = iChannelSubscriber.topic();
                if (map.containsKey(str)) {
                    ArrayList<IChannelSubscriber> arrayList = map.get(str);
                    if (arrayList != null) {
                        arrayList.remove(iChannelSubscriber);
                    }
                    ArrayList<IChannelSubscriber> arrayList2 = map.get(str);
                    if (arrayList2 == null) {
                        ckf.s();
                        throw null;
                    } else if (arrayList2.isEmpty()) {
                        map.remove(str);
                    }
                }
                xhv xhvVar = xhv.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
