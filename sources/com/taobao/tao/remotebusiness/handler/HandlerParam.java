package com.taobao.tao.remotebusiness.handler;

import com.taobao.tao.remotebusiness.MtopBusiness;
import java.io.Serializable;
import mtopsdk.mtop.common.MtopEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HandlerParam implements Serializable {
    private static final long serialVersionUID = 9196408638670689787L;
    public MtopEvent event;
    public MtopListener listener;
    public MtopBusiness mtopBusiness;
    public MtopResponse mtopResponse;
    public BaseOutDo pojo;

    static {
        t2o.a(589299746);
    }

    public HandlerParam(MtopListener mtopListener, MtopEvent mtopEvent, MtopBusiness mtopBusiness) {
        this.listener = mtopListener;
        this.event = mtopEvent;
        this.mtopBusiness = mtopBusiness;
    }
}
