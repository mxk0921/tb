package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class tpu {
    public static final a Companion = new a(null);
    public static final String TAG = "TurboEngine";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601442);
        }

        public a() {
        }

        public static /* synthetic */ void b(a aVar, String str, String str2, Throwable th, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bfbce0a", new Object[]{aVar, str, str2, th, new Integer(i), obj});
                return;
            }
            if ((i & 4) != 0) {
                th = null;
            }
            aVar.a(str, str2, th);
        }

        public final void a(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acc02eb9", new Object[]{this, str, str2, th});
                return;
            }
            ckf.g(str, "tag");
            if (th == null) {
                TLog.loge(tpu.TAG, str, str2);
            } else {
                TLog.loge(tpu.TAG, str, str2, th);
            }
        }

        public final void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db0cbec0", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "tag");
            ckf.g(str2, "msg");
            TLog.logi(tpu.TAG, str, str2);
        }

        public final void d(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bcf18ce", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "tag");
            ckf.g(str2, "msg");
            TLog.logw(tpu.TAG, str, str2);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601441);
    }
}
