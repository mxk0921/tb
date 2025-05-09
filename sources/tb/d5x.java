package tb;

import android.app.Application;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexModule;
import com.taobao.android.weex.config.WeexDarkMode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface d5x {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a();
    }

    void a(WeexInstanceMode weexInstanceMode, Application application);

    boolean b(String str);

    @Deprecated
    void c(Application application);

    void d(Application application, String str);

    WeexDarkMode e();

    void f(String str);

    void g();

    String getHttpAcceptHeader();

    String getUserAgent();

    void h(String str, Class<?> cls);

    @Deprecated
    void i(Application application, a aVar);

    void j(WeexInstanceMode weexInstanceMode, Application application, a aVar);

    boolean k(WeexInstanceMode weexInstanceMode);

    void registerModule(String str, Class<? extends WeexModule> cls);
}
