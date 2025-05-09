package tb;

import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface b9e {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void a(String str, boolean z);

        void onCancel();

        void onError(String str, String str2);

        void onStart();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void a(long j);

        void onStat(String str, Map<String, String> map);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void a(float f);

        void b(boolean z);
    }

    void G(a aVar);

    void J(b bVar);

    void T(tdd tddVar);

    void g(tdd tddVar);

    void i0(float f);

    boolean isPlaying();

    void p(c cVar);

    void pause();

    void q0(c cVar);

    void restart();

    void start();
}
