package com.taobao.android.miniLive.services.mtop;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RedPacketRainRequest implements INetDataObject {
    public String anchorId;
    public String liveId;
    private String API_NAME = "mtop.taobao.livex.right.redpacket.rain.getLiveSendingBenefit";
    private String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public String benefitType = "FAVOR_RED_PACKET_RAIN";
    public String source = "shoutaoSmallWindow";

    static {
        t2o.a(779092054);
        t2o.a(806355930);
    }
}
