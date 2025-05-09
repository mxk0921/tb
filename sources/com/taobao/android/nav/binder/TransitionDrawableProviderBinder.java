package com.taobao.android.nav.binder;

import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.t2o;
import tb.u2e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TransitionDrawableProviderBinder extends BitmapBinder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final WeakReference<u2e> drawableProvider;

    static {
        t2o.a(578814075);
    }

    public TransitionDrawableProviderBinder(u2e u2eVar) {
        this.drawableProvider = new WeakReference<>(u2eVar);
    }

    public static /* synthetic */ Object ipc$super(TransitionDrawableProviderBinder transitionDrawableProviderBinder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nav/binder/TransitionDrawableProviderBinder");
    }

    @Override // com.taobao.android.nav.binder.BitmapBinder
    public Drawable getDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("bbe7333f", new Object[]{this});
        }
        u2e u2eVar = this.drawableProvider.get();
        if (u2eVar != null) {
            return u2eVar.a();
        }
        return null;
    }
}
