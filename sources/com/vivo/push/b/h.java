package com.vivo.push.b;

import android.text.TextUtils;
import com.vivo.push.d;
import com.vivo.push.v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class h extends v {

    /* renamed from: a  reason: collision with root package name */
    private String f14561a;
    private String b;

    public h() {
        super(2013);
    }

    @Override // com.vivo.push.v
    public final void c(d dVar) {
        dVar.a("MsgArriveCommand.MSG_TAG", this.f14561a);
        if (!TextUtils.isEmpty(this.b)) {
            dVar.a("MsgArriveCommand.NODE_INFO", this.b);
        }
    }

    @Override // com.vivo.push.v
    public final void d(d dVar) {
        this.f14561a = dVar.a("MsgArriveCommand.MSG_TAG");
        this.b = dVar.a("MsgArriveCommand.NODE_INFO");
    }

    public h(String str) {
        this();
        this.f14561a = str;
    }

    public h(String str, String str2) {
        this(str);
        this.b = str2;
    }
}
