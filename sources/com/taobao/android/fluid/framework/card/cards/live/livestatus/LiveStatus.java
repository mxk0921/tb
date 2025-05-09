package com.taobao.android.fluid.framework.card.cards.live.livestatus;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.a07;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class LiveStatus implements IMTOPDataObject {
    public static final a Companion = new a(null);
    public static final String LIVE_STATUS_OFFLINE = "2";
    private String roomStatus = "";
    private String id = "";
    private final String anchorId = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(468713964);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(468713963);
        t2o.a(589299906);
    }

    public final String getAnchorId() {
        return this.anchorId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getRoomStatus() {
        return this.roomStatus;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setRoomStatus(String str) {
        this.roomStatus = str;
    }

    public String toString() {
        return "LiveStatus(roomStatus=" + this.roomStatus + ", id=" + this.id + ", anchorId=" + this.anchorId + ')';
    }
}
