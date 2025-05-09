package tb;

import com.alibaba.fastjson.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface iwd {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void fireEvent(String str, JSONObject jSONObject);
    }

    float a();

    int b();

    boolean c(int i);

    void d(a aVar);

    void destroy();

    boolean e(String str);

    boolean f(boolean z);

    boolean g();

    float getDuration();

    boolean h(boolean z);

    boolean i(boolean z);

    boolean pause();

    boolean play();

    boolean seek(int i);

    boolean setLoop(boolean z);

    boolean setVolume(float f);

    boolean stop();
}
