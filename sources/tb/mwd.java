package tb;

import com.taobao.themis.kernel.executor.ExecutorType;
import java.util.Set;
import tb.jbs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface mwd {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a(int i, eas easVar);

        void onSuccess();
    }

    Set<jbs.a> a();

    Set<Class<? extends mwd>> b();

    void c(jbs jbsVar, a aVar);

    ExecutorType d();

    String getName();
}
