package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class qhh {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1029701660);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9757c96e", new Object[]{this, str, str2});
            } else {
                gih.a(str, str2);
            }
        }

        public final void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
            } else {
                gih.b(str, str2);
            }
        }

        public final void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f161e0c9", new Object[]{this, str, str2});
            } else {
                gih.c(str, str2);
            }
        }

        public a() {
        }
    }

    static {
        t2o.a(1029701659);
    }
}
