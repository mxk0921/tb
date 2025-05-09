package com.vivo.push.restructure.request;

import android.content.Intent;
import android.os.Bundle;
import com.vivo.push.restructure.request.a.a.b;
import com.vivo.push.restructure.request.a.c;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class a<I extends b, O extends b> {

    /* renamed from: a  reason: collision with root package name */
    private int f14636a = IMediaPlayer.MEDIA_INFO_PLAYER_INIT_FAILED_ERROR;
    private I b;

    public a(I i) {
        this.b = i;
    }

    public final Intent a(int i) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("client_pkgname", com.vivo.push.restructure.a.a().b().getPackageName());
        bundle.putBoolean("support_rf", true);
        c cVar = new c(this.f14636a, i);
        com.vivo.push.restructure.request.a.a.a aVar = new com.vivo.push.restructure.request.a.a.a();
        cVar.a(aVar);
        bundle.putString("cf_content", aVar.d());
        com.vivo.push.restructure.request.a.a.a aVar2 = new com.vivo.push.restructure.request.a.a.a();
        this.b.a(aVar2);
        bundle.putString("content", aVar2.d());
        intent.putExtras(bundle);
        return intent;
    }

    public abstract O a(com.vivo.push.restructure.request.a.a.a aVar);
}
