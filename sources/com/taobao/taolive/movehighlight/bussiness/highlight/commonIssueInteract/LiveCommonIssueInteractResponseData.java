package com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class LiveCommonIssueInteractResponseData implements INetDataObject {
    public BenefitVO benefitVO;
    public String rightsType;
    public String winning;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class BenefitVO implements INetDataObject {
        public String rightSubStatus;
        public String rightSubStatusDes;
        public String toastTips;

        static {
            t2o.a(779092604);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(779092603);
        t2o.a(806355930);
    }
}
