package tb;

import android.window.OnBackInvokedCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final /* synthetic */ class z1u implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f32473a;

    public /* synthetic */ z1u(Runnable runnable) {
        this.f32473a = runnable;
    }

    public final void onBackInvoked() {
        this.f32473a.run();
    }
}
