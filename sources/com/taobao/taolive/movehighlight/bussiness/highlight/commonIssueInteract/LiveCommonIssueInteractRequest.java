package com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class LiveCommonIssueInteractRequest implements INetDataObject {
    public long anchorId;
    public String asac;
    public ExtendParams extendParams;
    public long liveId;
    public String API_NAME = "mtop.iliad.interact.commonIssueInteract";
    public String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    public String interactType = "highlightCoupon";
    public String rightsType = "lafite";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class ExtendParams implements INetDataObject {
        public String appName = "iliad";
        public String asac;
        public String benefitCode;
        public String channel;
        public String encryptedDynamicInfo;
        public String extraData;
        public String interactEntrance;
        public String selectedBenefitCode;
        public String strategyCode;

        static {
            t2o.a(779092601);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(779092600);
        t2o.a(806355930);
    }
}
