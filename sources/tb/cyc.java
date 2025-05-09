package tb;

import android.content.Context;
import android.content.res.Configuration;
import com.alibaba.android.umf.taobao.adapter.widget.floatview.NUTFloatViewManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface cyc {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        boolean onClose();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
        void onDismiss(boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface c {
        void a();

        void b(mi miVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface d {
        void onShow();
    }

    boolean C1();

    void L1(dyc dycVar);

    boolean U(Context context);

    void c0(NUTFloatViewManager.Builder builder, hij hijVar);

    void destroy();

    void j1(ayc aycVar);

    void n(a aVar);

    void onScreenChanged(int i, Configuration configuration);
}
