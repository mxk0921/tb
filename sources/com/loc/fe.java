package com.loc;

import android.content.Context;
import android.os.Handler;
import com.uc.webview.base.cyclone.BSError;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class fe extends ex<eg> {
    public fe(Context context, String str, Handler handler) {
        super(context, str, handler);
    }

    private static String a(eg egVar) {
        return egVar == null ? "" : egVar.a();
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static int b2(eg egVar) {
        return egVar == null ? BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA : egVar.c;
    }

    @Override // com.loc.ex
    public final /* synthetic */ int c(eg egVar) {
        return b2(egVar);
    }

    @Override // com.loc.ex
    public final /* synthetic */ long d(eg egVar) {
        return c2(egVar);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(eg egVar, long j) {
        if (egVar != null) {
            egVar.f = j;
        }
    }

    @Override // com.loc.ex
    public final long b() {
        return eu.e;
    }

    @Override // com.loc.ex
    public final long c() {
        return eu.f;
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    private static long c2(eg egVar) {
        if (egVar == null) {
            return 0L;
        }
        return egVar.f;
    }

    @Override // com.loc.ex
    public final /* bridge */ /* synthetic */ void a(eg egVar, long j) {
        a2(egVar, j);
    }

    @Override // com.loc.ex
    public final /* synthetic */ String b(eg egVar) {
        return a(egVar);
    }
}
