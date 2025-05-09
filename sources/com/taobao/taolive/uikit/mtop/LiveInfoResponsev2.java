package com.taobao.taolive.uikit.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LiveInfoResponsev2 extends BaseOutDo {
    private VideoInfo data;
    private TBLiveCardTemplate template;

    static {
        t2o.a(779093629);
    }

    public TBLiveCardTemplate getTemplate() {
        return this.template;
    }

    public void setData(VideoInfo videoInfo) {
        this.data = videoInfo;
    }

    public void setTemplate(TBLiveCardTemplate tBLiveCardTemplate) {
        this.template = this.template;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public VideoInfo getData() {
        return this.data;
    }
}
