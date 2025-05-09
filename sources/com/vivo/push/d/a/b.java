package com.vivo.push.d.a;

import android.text.TextUtils;
import com.vivo.push.restructure.request.a.a.a;
import com.vivo.push.restructure.request.a.a.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class b implements com.vivo.push.restructure.request.a.a.b {

    /* renamed from: a  reason: collision with root package name */
    public static final b.a<b> f14583a = new c();
    private String b;
    private List<com.vivo.push.d.b> c;
    private int d;

    public b(String str, List<com.vivo.push.d.b> list, int i) {
        new ArrayList();
        this.b = str;
        this.d = i;
        this.c = list;
    }

    @Override // com.vivo.push.restructure.request.a.a.b
    public final void a(a aVar) {
        aVar.a(this.b);
        aVar.a(this.d);
        aVar.a(this.c);
    }

    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        for (com.vivo.push.d.b bVar : this.c) {
            String b = bVar.b();
            if (!TextUtils.isEmpty(b)) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    public b(a aVar) throws JSONException {
        this.c = new ArrayList();
        this.b = aVar.c();
        this.d = aVar.a();
        aVar.a(com.vivo.push.d.b.f14584a, this.c);
    }
}
