package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ah;
import tb.q0j;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bv extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bu f14788a;

    public bv(bu buVar) {
        this.f14788a = buVar;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo607a() {
        return q0j.ERROR_CODE_RECOMMEND_ITEM_ID_EMPTY;
    }

    @Override // java.lang.Runnable
    public void run() {
        ck ckVar;
        ck ckVar2;
        Context context;
        b.c("exec== mUploadJob");
        ckVar = this.f14788a.f777a;
        if (ckVar != null) {
            ckVar2 = this.f14788a.f777a;
            context = this.f14788a.f774a;
            ckVar2.a(context);
            this.f14788a.b("upload_time");
        }
    }
}
