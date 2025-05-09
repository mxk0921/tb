package tb;

import android.content.Context;
import com.taobao.tao.log.interceptor.RealTimeLogConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface ewd {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void a(int i, String str);
    }

    void a(RealTimeLogConfig realTimeLogConfig);

    void b(Context context, RealTimeLogConfig realTimeLogConfig, a aVar);

    void c(String str);

    void destroy();
}
