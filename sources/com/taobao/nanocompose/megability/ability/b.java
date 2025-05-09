package com.taobao.nanocompose.megability.ability;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.ht4;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HTTPRequestError f11358a;
    public final String b;

    static {
        t2o.a(1022361721);
    }

    public b(Map<?, ?> map) {
        ckf.g(map, "data");
        String e = ht4.e(map, "errorCode");
        if (e != null) {
            this.f11358a = HTTPRequestError.Companion.a(e);
        }
        this.b = ht4.e(map, "errorMsg");
    }

    public final HTTPRequestError a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HTTPRequestError) ipChange.ipc$dispatch("f947c829", new Object[]{this});
        }
        return this.f11358a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        return this.b;
    }
}
