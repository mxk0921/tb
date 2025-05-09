package tb;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface h6c<V extends ViewGroup> extends sgc, b6c, lgc {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a<V extends ViewGroup> {
        void a(int i);

        void b(Canvas canvas, V v);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void c();

        void d();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface c<V extends ViewGroup> {
        void n(boolean z, boolean z2);

        void onScrollStateChanged(V v, int i);

        void onScrolled(V v, int i, int i2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface d {
        void a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface e {
        void b(boolean z);
    }

    void F(a<V> aVar);

    void L(View.OnAttachStateChangeListener onAttachStateChangeListener);

    void M(b bVar);

    void Q(e eVar);

    void destroy();

    void g(View.OnAttachStateChangeListener onAttachStateChangeListener);

    void h(c<V> cVar);

    void i(d dVar);

    void k(b bVar);

    void m(a<V> aVar);

    void o(e eVar);

    void s(d dVar);

    void v(c<V> cVar);
}
