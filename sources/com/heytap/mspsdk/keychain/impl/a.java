package com.heytap.mspsdk.keychain.impl;

import android.os.Bundle;
import com.heytap.msp.keychain.a;
import com.heytap.msp.keychain.b;
import java.util.HashMap;
import tb.t2o;
import tb.vao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a extends a.AbstractBinderC0263a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OnResultListener f5211a;

    static {
        t2o.a(253755425);
    }

    public a(OnResultListener onResultListener) {
        this.f5211a = onResultListener;
    }

    public void a(b bVar) {
        vao vaoVar = new vao();
        vaoVar.d(bVar.f5210a);
        vaoVar.f(bVar.b);
        Bundle bundle = bVar.c;
        if (bundle != null) {
            vaoVar.e((HashMap) bundle.getSerializable("result_map"));
        }
        this.f5211a.onResult(vaoVar);
    }
}
