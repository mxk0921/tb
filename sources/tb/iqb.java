package tb;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface iqb<V extends ViewGroup> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void a();

        void b(Context context);

        void c();
    }

    V createContainer(Context context);

    void destroyContainer();
}
