package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.huoyan.object.KakaLibImageWrapper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class nss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f24930a;
    public final Bitmap b;
    public final KakaLibImageWrapper c;
    public final boolean d;

    static {
        t2o.a(481296506);
    }

    public nss(int i, Bitmap bitmap, KakaLibImageWrapper kakaLibImageWrapper, boolean z) {
        ckf.g(bitmap, "snapshot");
        ckf.g(kakaLibImageWrapper, "imageWrapper");
        this.f24930a = i;
        this.b = bitmap;
        this.c = kakaLibImageWrapper;
        this.d = z;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8908f29f", new Object[]{this})).intValue();
        }
        return this.f24930a;
    }

    public final KakaLibImageWrapper b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KakaLibImageWrapper) ipChange.ipc$dispatch("93fe8e5b", new Object[]{this});
        }
        return this.c;
    }

    public final Bitmap c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a92c69f", new Object[]{this});
        }
        return this.b;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c08c79af", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nss)) {
            return false;
        }
        nss nssVar = (nss) obj;
        if (this.f24930a == nssVar.f24930a && ckf.b(this.b, nssVar.b) && ckf.b(this.c, nssVar.c) && this.d == nssVar.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int hashCode = ((((this.f24930a * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        boolean z = this.d;
        if (!z) {
            i = z ? 1 : 0;
        }
        return hashCode + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TakePhotoCache(detectFlag=" + this.f24930a + ", snapshot=" + this.b + ", imageWrapper=" + this.c + ", isFrontCamera=" + this.d + ')';
    }
}
