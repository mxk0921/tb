package com.taobao.message.message_open_api_adapter.api.data.eventchannel.bean;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/taobao/message/message_open_api_adapter/api/data/eventchannel/bean/ChannelEvent;", "", "data", "Lcom/alibaba/fastjson/JSONObject;", "(Lcom/alibaba/fastjson/JSONObject;)V", "getData", "()Lcom/alibaba/fastjson/JSONObject;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ChannelEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final JSONObject data;

    static {
        t2o.a(529531070);
    }

    public ChannelEvent(JSONObject jSONObject) {
        ckf.h(jSONObject, "data");
        this.data = jSONObject;
    }

    public static /* synthetic */ ChannelEvent copy$default(ChannelEvent channelEvent, JSONObject jSONObject, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChannelEvent) ipChange.ipc$dispatch("b74c0a36", new Object[]{channelEvent, jSONObject, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            jSONObject = channelEvent.data;
        }
        return channelEvent.copy(jSONObject);
    }

    public final JSONObject component1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("49befc7b", new Object[]{this});
        }
        return this.data;
    }

    public final ChannelEvent copy(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChannelEvent) ipChange.ipc$dispatch("799db48c", new Object[]{this, jSONObject});
        }
        ckf.h(jSONObject, "data");
        return new ChannelEvent(jSONObject);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj || ((obj instanceof ChannelEvent) && ckf.b(this.data, ((ChannelEvent) obj).data))) {
            return true;
        }
        return false;
    }

    public final JSONObject getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return this.data;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        JSONObject jSONObject = this.data;
        if (jSONObject != null) {
            return jSONObject.hashCode();
        }
        return 0;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ChannelEvent(data=" + this.data + f7l.BRACKET_END_STR;
    }
}
