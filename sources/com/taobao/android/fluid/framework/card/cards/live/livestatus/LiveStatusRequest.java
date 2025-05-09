package com.taobao.android.fluid.framework.card.cards.live.livestatus;

import java.io.Serializable;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class LiveStatusRequest implements IMTOPDataObject, Serializable {
    private final boolean NEED_ECODE;
    private Map<String, ? extends Object> extParams;
    private String liveId;
    private final String API_NAME = "mtop.taobao.tab.two.guang.live.status";
    private final String VERSION = "1.0";
    private final boolean NEED_SESSION = true;

    static {
        t2o.a(468713969);
        t2o.a(589299906);
    }

    public final Map<String, Object> getExtParams() {
        return this.extParams;
    }

    public final String getLiveId() {
        return this.liveId;
    }

    public final void setExtParams(Map<String, ? extends Object> map) {
        this.extParams = map;
    }

    public final void setLiveId(String str) {
        this.liveId = str;
    }
}
