package com.taobao.android.dinamicx.widget.recycler.event;

import com.taobao.android.dinamicx.expression.event.DXScrollLayoutBaseExposeEvent;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXRecyclerLayoutOnExposeEvent extends DXRecyclerLayoutExposeEventBase {
    static {
        t2o.a(444597542);
    }

    public DXRecyclerLayoutOnExposeEvent(long j, int i, Object obj) {
        super(j, i, obj, -1L);
    }

    public DXRecyclerLayoutOnExposeEvent(int i, Object obj) {
        super(DXScrollLayoutBaseExposeEvent.DXSCROLLLAYOUTBASE_ONEXPOSURE, i, obj, -1L);
    }
}
