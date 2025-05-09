package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.IAbilityResult;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.t2o;
import tb.zz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class PowerMsgMessageHeader implements IAbilityResult {
    public Map<String, ? extends Object> attributes;
    public Long delay;
    public String from;
    public String messageID;
    public Boolean needACK;
    public Integer priority;
    public Integer qosLevel;
    public Boolean sendFullTags;
    public List<String> tags;
    public String timestamp;
    public String to;
    public String topic;
    public Integer type;
    public String userID;

    static {
        t2o.a(525337429);
        t2o.a(144703597);
    }

    public PowerMsgMessageHeader() {
    }

    public PowerMsgMessageHeader(Map<String, ? extends Object> map) {
        this();
        ArrayList arrayList = null;
        this.type = MegaUtils.m(map, "type", null);
        this.priority = MegaUtils.m(map, "priority", null);
        this.delay = MegaUtils.q(map, "delay", null);
        this.attributes = MegaUtils.s(map, "attributes");
        this.qosLevel = MegaUtils.m(map, "qosLevel", null);
        this.needACK = MegaUtils.h(map, "needACK", null);
        this.sendFullTags = MegaUtils.h(map, "sendFullTags", null);
        this.timestamp = MegaUtils.x(map, "timestamp", null);
        this.messageID = MegaUtils.x(map, "messageID", null);
        this.userID = MegaUtils.x(map, LoggingSPCache.STORAGE_USERID, null);
        this.topic = MegaUtils.x(map, "topic", null);
        this.from = MegaUtils.x(map, "from", null);
        this.to = MegaUtils.x(map, "to", null);
        List<Object> o = MegaUtils.o(map, "tags");
        if (o != null) {
            List<Object> list = o;
            arrayList = new ArrayList(zz3.q(list, 10));
            for (Object obj : list) {
                if (obj != null) {
                    try {
                        arrayList.add((String) obj);
                    } catch (Exception e) {
                        throw new RuntimeException("tags 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                throw new RuntimeException("tags 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
            }
        }
        this.tags = arrayList;
    }
}
