package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class is2 {
    public static final a Companion = new a(null);
    public static final String SPLIT_BIZ_CODE = "_SPLIT_BIZ_CODE_";
    public static final String SPLIT_KEY_LIST = ",";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(157286708);
        }

        public a() {
        }

        public final String a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("dad3d9b2", new Object[]{this, str, str2});
            }
            ckf.g(str, "bizCode");
            ckf.g(str2, "key");
            return str + is2.SPLIT_BIZ_CODE + str2;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(157286707);
    }
}
