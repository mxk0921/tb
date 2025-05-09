package com.taobao.taolive.movehighlight.bussiness.highlight.newModel;

import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HighlightRowResponseData implements INetDataObject {
    public HighlightRow model;
    public String selectedItemId;
    public int selectedItemIndex;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class HighlightRow implements INetDataObject {
        public String liveId;
        public String liveRoomStatus;
        public List<LiveTimemovingModel> timeMovingList;
        public String traceId;

        static {
            t2o.a(779092613);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(779092612);
        t2o.a(806355930);
    }
}
