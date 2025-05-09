package com.taobao.taobao.scancode.huoyan.object;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopEtaoKakaMailtraceResponse extends BaseOutDo {
    private MailTraceWrapper data;

    static {
        t2o.a(760217762);
    }

    public void setData(MailTraceWrapper mailTraceWrapper) {
        this.data = mailTraceWrapper;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MailTraceWrapper getData() {
        return this.data;
    }
}
