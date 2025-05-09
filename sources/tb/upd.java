package tb;

import android.content.Context;
import android.view.View;
import com.taobao.android.weex.WeexInstance;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface upd {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void viewCreated(View view);

        void viewReady();

        void weexError(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void a(String str, String str2, Map<String, Object> map, String str3, int i, int i2);

        void destroy();
    }

    void b();

    b c(Context context, a aVar);

    WeexInstance d();

    void e();

    void f();
}
