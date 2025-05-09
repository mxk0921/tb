package com.taobao.taobao.scancode.huoyan.object;

import com.etao.kakalib.express.ExpressResult;
import java.io.Serializable;
import java.util.ArrayList;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MailTraceWrapper implements Serializable, IMTOPDataObject {
    private static final long serialVersionUID = 2618578177710871925L;
    private ArrayList<ExpressResult> traces;

    static {
        t2o.a(760217760);
        t2o.a(589299906);
    }

    public ArrayList<ExpressResult> getTraces() {
        return this.traces;
    }

    public void setTraces(ArrayList<ExpressResult> arrayList) {
        this.traces = arrayList;
    }
}
