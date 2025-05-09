package com.taobao.search.musie.taowise;

import tb.qwc;
import tb.sqc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class TBMarkDown extends MUSMarkDown {
    static {
        t2o.a(815792787);
    }

    public TBMarkDown(int i) {
        super(i);
        qwc a2 = qwc.MuiseViewFactory.a();
        sqc sqcVar = null;
        Object a3 = a2 != null ? a2.a("tb-markdown") : null;
        setMarkdownView(a3 instanceof sqc ? (sqc) a3 : sqcVar);
    }
}
