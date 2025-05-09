package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface lvd {
    public static final a Companion = a.$$INSTANCE;
    public static final String SOURCE_CARD = "card";
    public static final String SOURCE_OTHER = "other";
    public static final String SOURCE_SLIDE = "slide";
    public static final String SOURCE_TOP_TAB = "default";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final String SOURCE_CARD = "card";
        public static final String SOURCE_OTHER = "other";
        public static final String SOURCE_SLIDE = "slide";
        public static final String SOURCE_TOP_TAB = "default";

        static {
            t2o.a(629145629);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(629145630);
        }

        public static /* synthetic */ void a(lvd lvdVar, String str, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ed11668", new Object[]{lvdVar, str, new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 1) != 0) {
                    str = "other";
                }
                lvdVar.b(str);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appear");
            }
        }
    }

    void a(String str, String str2);

    void b(String str);

    void c(pur purVar);

    void destroy();

    void disappear();

    View getView();

    void init();

    void start();

    void stop();
}
