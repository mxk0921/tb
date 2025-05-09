package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tfs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f28692a = "TNode";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f28693a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(int i, String str, String str2) {
            this.f28693a = i;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Iterator it = new ArrayList(o.S()).iterator();
                while (it.hasNext()) {
                    ((o) it.next()).h0().appendTNodeLog(this.f28693a, this.b, this.c);
                }
            } catch (Exception unused) {
            }
        }
    }

    static {
        t2o.a(503317266);
    }

    public static void a(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d265368", new Object[]{new Integer(i), str, str2});
            return;
        }
        Context context = o.O;
        if (context != null && nwv.R(context)) {
            nwv.A0(new a(i, str, str2), 500L);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
            return;
        }
        od0.D().p().logd(f28692a, str);
        a(3, null, str);
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
            return;
        }
        od0.D().p().logd(str, str2);
        a(3, str, str2);
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
            return;
        }
        od0.D().p().loge(f28692a, str);
        a(6, null, str);
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
            return;
        }
        od0.D().p().loge(str, str2);
        a(6, str, str2);
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{str});
            return;
        }
        od0.D().p().logi(f28692a, str);
        a(4, null, str);
    }

    public static void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
            return;
        }
        od0.D().p().logi(str, str2);
        a(4, str, str2);
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e977c8", new Object[]{str});
            return;
        }
        od0.D().p().logw(f28692a, str);
        a(5, null, str);
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
            return;
        }
        od0.D().p().logw(str, str2);
        a(5, str, str2);
    }
}
