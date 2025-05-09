package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface nde {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(993002007);
        }

        public abstract void a();

        public abstract void b();

        public abstract boolean c(nde ndeVar);
    }

    void destroyAndRemoveFromParent();

    ude getParent();

    String getScopeTag();

    hj8 obtainScopeEventBus();

    void onCtxDestroyInternal();

    void onCtxPauseInternal();

    void onCtxResumeInternal();

    void onCtxStopInternal();

    void printTree(StringBuilder sb, int i);

    <T> T searchWidgetInSubTree(Class<T> cls);

    boolean travel(a aVar);
}
