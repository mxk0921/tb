package tb;

import android.content.Context;
import android.graphics.SurfaceTexture;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface sce {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface a {
        void a(long j);

        void b(long j, long j2, long j3, int i, int i2, int i3);

        void c(long j, int i, int i2);

        void d(long j, Map<String, Object> map);

        void e(long j);

        void f(long j);

        void g(long j, Map<String, Object> map);
    }

    float a();

    void b(String str);

    void c(long j, long j2, String str, Context context, Map<String, Object> map, SurfaceTexture surfaceTexture, a aVar);

    void destroy();

    void pause();

    void play();

    void setLoop(boolean z);

    void setMuted(boolean z);

    void stop();
}
