package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mv1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TYPE_IMAGE_TEXT = "imageText";
    public static final String TYPE_IMG = "image";
    public static final String TYPE_TEXT = "text";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815793068);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815793067);
    }

    public mv1() {
        this(null, 1, null);
    }

    public mv1(String str) {
        ckf.g(str, "type");
    }

    public /* synthetic */ mv1(String str, int i, a07 a07Var) {
        this((i & 1) != 0 ? "text" : str);
    }
}
