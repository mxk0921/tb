package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface hpc {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void c(Drawable drawable);

        void e();

        void g(Object obj);

        int getHeight();

        Object getTag();

        int getWidth();
    }

    void a(String str, a aVar);

    void b(Context context, String str, a aVar, MUSImageQuality mUSImageQuality);

    void c(Drawable drawable, a aVar);
}
