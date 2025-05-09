package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.feedback;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FeedbackRequest implements IMTOPDataObject {
    public String anchorIdOrFeedId;
    public String delReason;
    public int recPos;
    public String templateName;
    private String API_NAME = "mtop.mediaplatform.live.follow.broadcasterlist.feedbackList";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    public String channelType = "jingxuan";
    public String channelId = "0";

    static {
        t2o.a(310378767);
        t2o.a(589299906);
    }
}
