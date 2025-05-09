package tb;

import android.content.Context;
import com.taobao.android.weex.WeexEventTarget;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexValue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface b6x {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        WeexInstance b(Context context);

        void c(String str, Object obj);

        void d(WeexEventTarget weexEventTarget, String str, WeexValue weexValue);

        void destroy();

        void dispatchEvent(WeexEventTarget weexEventTarget, String str, WeexValue weexValue);

        void execute(byte[] bArr, String str);

        void render(WeexValue weexValue);

        void updateInstanceEnv(String str, WeexValue weexValue);
    }

    void a(a aVar);
}
