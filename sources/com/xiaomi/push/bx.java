package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.ah;
import tb.q0j;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bx extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bu f14790a;

    public bx(bu buVar) {
        this.f14790a = buVar;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo607a() {
        return q0j.ERROR_CODE_RECOMMEND_SECTION_DUPLICATE_ID;
    }

    @Override // java.lang.Runnable
    public void run() {
        ck ckVar;
        ck ckVar2;
        Context context;
        ckVar = this.f14790a.f777a;
        if (ckVar != null) {
            ckVar2 = this.f14790a.f777a;
            context = this.f14790a.f774a;
            ckVar2.b(context);
            this.f14790a.b("delete_time");
        }
    }
}
