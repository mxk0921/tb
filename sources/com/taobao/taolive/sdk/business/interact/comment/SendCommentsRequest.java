package com.taobao.taolive.sdk.business.interact.comment;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class SendCommentsRequest implements INetDataObject {
    public String accountId;
    public String commodityList;
    public String content;
    public String extraFlag;
    public HashMap<String, String> renders;
    public String topic;
    private String API_NAME = "mtop.taobao.iliad.comment.publish";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    public String relatedTopic = null;

    static {
        t2o.a(806356011);
        t2o.a(806355930);
    }
}
