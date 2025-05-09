package com.vivo.push.b;

import android.text.TextUtils;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.vivo.push.d;
import com.vivo.push.util.u;
import com.vivo.push.v;
import java.util.HashMap;
import tb.f7l;
import tb.vox;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class x extends v {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, String> f14575a;
    private long b;

    public x() {
        super(vox.CLASS_2012);
    }

    public final void a(HashMap<String, String> hashMap) {
        this.f14575a = hashMap;
    }

    @Override // com.vivo.push.v
    public final void c(d dVar) {
        dVar.a("ReporterCommand.EXTRA_PARAMS", this.f14575a);
        dVar.a("ReporterCommand.EXTRA_REPORTER_TYPE", this.b);
    }

    @Override // com.vivo.push.v
    public final void d(d dVar) {
        this.f14575a = (HashMap) dVar.d("ReporterCommand.EXTRA_PARAMS");
        this.b = dVar.b("ReporterCommand.EXTRA_REPORTER_TYPE", this.b);
    }

    @Override // com.vivo.push.v
    public final String toString() {
        return "ReporterCommand（" + this.b + f7l.BRACKET_END_STR;
    }

    public x(long j) {
        this();
        this.b = j;
    }

    public final void d() {
        if (this.f14575a == null) {
            u.d("ReporterCommand", "reportParams is empty");
            return;
        }
        StringBuilder sb = new StringBuilder("report message reportType:");
        sb.append(this.b);
        sb.append(",msgId:");
        String str = this.f14575a.get("messageID");
        if (TextUtils.isEmpty(str)) {
            str = this.f14575a.get(Constant.PROP_MESSAGE_ID);
        }
        sb.append(str);
        u.d("ReporterCommand", sb.toString());
    }
}
