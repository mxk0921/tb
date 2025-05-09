package com.taobao.taolive.movehighlight.bussiness.highlight.contentListModel;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HighlightContentRequest implements INetDataObject {
    public String entryLiveSource;
    public String keyPointId;
    public String liveId;
    public String liveSource;
    public String transParams;
    public String API_NAME = "mtop.tblive.timemoving.content.query.list";
    public String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    public int s = 0;
    public int n = 10;

    static {
        t2o.a(779092606);
        t2o.a(806355930);
    }
}
