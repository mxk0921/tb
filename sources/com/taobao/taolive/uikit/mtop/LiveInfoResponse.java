package com.taobao.taolive.uikit.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LiveInfoResponse extends BaseOutDo {
    private VideoInfo data;

    static {
        t2o.a(779093628);
    }

    public void setData(VideoInfo videoInfo) {
        this.data = videoInfo;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public VideoInfo getData() {
        return this.data;
    }
}
