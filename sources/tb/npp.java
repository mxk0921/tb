package tb;

import com.alibaba.triver.triver_shop.newShop.view.ShopView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class npp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766509586);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            } else {
                TLog.logd("shop", ShopView.SP_NAMESPACE, str);
            }
        }

        @JvmStatic
        public final void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            } else {
                TLog.loge("shop", ShopView.SP_NAMESPACE, str);
            }
        }

        @JvmStatic
        public final void c(String str, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c9407f", new Object[]{this, str, th});
            } else {
                TLog.loge("shop", ShopView.SP_NAMESPACE, str, th);
            }
        }

        @JvmStatic
        public final void d(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3002509", new Object[]{this, th});
            } else {
                TLog.loge("shop", ShopView.SP_NAMESPACE, "exception happened : ", th);
            }
        }

        @JvmStatic
        public final void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
            } else {
                TLog.logi("shop", ShopView.SP_NAMESPACE, str);
            }
        }

        @JvmStatic
        public final void f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            } else {
                TLog.logd("shop", ShopView.SP_NAMESPACE, str);
            }
        }

        @JvmStatic
        public final void g(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e98ddcbc", new Object[]{this, str, obj});
                return;
            }
            ckf.g(str, "name");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" = ");
            sb.append((Object) (obj == null ? null : obj.toString()));
            b(sb.toString());
        }

        public a() {
        }
    }

    static {
        t2o.a(766509585);
    }

    @JvmStatic
    public static final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        } else {
            Companion.b(str);
        }
    }

    @JvmStatic
    public static final void b(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3002509", new Object[]{th});
        } else {
            Companion.d(th);
        }
    }

    @JvmStatic
    public static final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{str});
        } else {
            Companion.f(str);
        }
    }
}
