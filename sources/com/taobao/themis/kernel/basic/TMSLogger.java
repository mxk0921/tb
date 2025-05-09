package com.taobao.themis.kernel.basic;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.n8s;
import tb.p8s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Adapter f13565a = new Adapter() { // from class: com.taobao.themis.kernel.basic.TMSLogger.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.themis.kernel.basic.TMSLogger.Adapter
        public void d(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
            }
        }

        @Override // com.taobao.themis.kernel.basic.TMSLogger.Adapter
        public void e(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("152aaa75", new Object[]{this, str, str2, th});
            } else {
                Log.e(str, str2, th);
            }
        }

        @Override // com.taobao.themis.kernel.basic.TMSLogger.Adapter
        public void i(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e38e584", new Object[]{this, str, str2});
            }
        }

        @Override // com.taobao.themis.kernel.basic.TMSLogger.Adapter
        public void v(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("625b1491", new Object[]{this, str, str2});
            }
        }

        @Override // com.taobao.themis.kernel.basic.TMSLogger.Adapter
        public void w(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("818e83a3", new Object[]{this, str, str2, th});
            }
        }
    };

    /* compiled from: Taobao */
    @DefaultAdapterImpl("com.taobao.themis.taobao.tlog.TLogAdapterImpl")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface Adapter extends n8s {
        void d(String str, String str2);

        void e(String str, String str2, Throwable th);

        void i(String str, String str2);

        void v(String str, String str2);

        void w(String str, String str2, Throwable th);
    }

    static {
        t2o.a(839909495);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else {
            e().d(str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else {
            e().e(str, str2, null);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
        } else {
            e().e(str, str2, th);
        }
    }

    public static void d(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9407f", new Object[]{str, th});
        } else {
            e().e(str, "", th);
        }
    }

    public static Adapter e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Adapter) ipChange.ipc$dispatch("d86969f0", new Object[0]);
        }
        Adapter f = p8s.f();
        if (f != null) {
            return f;
        }
        return f13565a;
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
        } else {
            e().i(str, str2);
        }
    }

    public static void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
        } else {
            e().w(str, str2, null);
        }
    }

    public static void h(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818e83a3", new Object[]{str, str2, th});
        } else {
            e().w(str, str2, th);
        }
    }
}
