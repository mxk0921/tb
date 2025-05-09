package tb;

import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class nkl implements ls3 {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f24794a;

    public nkl(Class<?> cls, String str) {
        ckf.g(cls, "jClass");
        ckf.g(str, AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        this.f24794a = cls;
    }

    @Override // tb.ls3
    public Class<?> b() {
        return this.f24794a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof nkl) || !ckf.b(b(), ((nkl) obj).b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b() + " (Kotlin reflection is not available)";
    }
}
