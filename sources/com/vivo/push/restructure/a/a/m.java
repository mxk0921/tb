package com.vivo.push.restructure.a.a;

import android.text.TextUtils;
import com.vivo.push.b.h;
import com.vivo.push.restructure.a.a;
import com.vivo.push.util.u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class m {

    /* renamed from: a  reason: collision with root package name */
    private String f14629a;
    private String b;

    public m(a aVar, String str) {
        if (aVar != null) {
            this.f14629a = aVar.a();
        }
        this.b = str;
    }

    public final h a() {
        if (!TextUtils.isEmpty(this.f14629a) && !TextUtils.isEmpty(this.b)) {
            return new h(this.f14629a, this.b);
        }
        u.a("convertOffLineMsg() error, mMessageID = " + this.f14629a + ", mNodeArrayInfo = " + this.b);
        return null;
    }
}
