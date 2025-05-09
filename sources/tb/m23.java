package tb;

import android.graphics.Typeface;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class m23 extends ikt {

    /* renamed from: a  reason: collision with root package name */
    public final Typeface f23730a;
    public final a b;
    public boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        void a(Typeface typeface);
    }

    public m23(a aVar, Typeface typeface) {
        this.f23730a = typeface;
        this.b = aVar;
    }

    @Override // tb.ikt
    public void a(int i) {
        d(this.f23730a);
    }

    @Override // tb.ikt
    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.c = true;
    }

    public final void d(Typeface typeface) {
        if (!this.c) {
            this.b.a(typeface);
        }
    }
}
