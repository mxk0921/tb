package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.es;
import com.xiaomi.push.ih;
import com.xiaomi.push.service.az;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q extends az.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f14738a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i, String str, Context context) {
        super(i, str);
        this.f14738a = context;
    }

    @Override // com.xiaomi.push.service.az.a
    public void onCallback() {
        es.a(this.f14738a).a(az.a(this.f14738a).a(ih.AwakeInfoUploadWaySwitch.a(), 0));
    }
}
