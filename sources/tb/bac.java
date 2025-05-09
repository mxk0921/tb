package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.List;
import kotlin.jvm.JvmInline;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface bac extends z5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909519);
        }

        public static void a(bac bacVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c254d9f", new Object[]{bacVar});
                return;
            }
            ckf.g(bacVar, "this");
            z5d.a.a(bacVar);
        }

        public static void b(bac bacVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6cd68d5b", new Object[]{bacVar, iTMSPage});
                return;
            }
            ckf.g(bacVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(bacVar, iTMSPage);
        }

        public static void c(bac bacVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db8bce57", new Object[]{bacVar});
                return;
            }
            ckf.g(bacVar, "this");
            z5d.a.c(bacVar);
        }
    }

    /* compiled from: Taobao */
    @JvmInline
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909520);
        }

        public static String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("327656bc", new Object[]{str});
            }
            ckf.g(str, "value");
            return str;
        }

        public static final boolean b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b26382a1", new Object[]{str, str2})).booleanValue();
            }
            return ckf.b(str, str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ITMSPage f16277a;
        public final bbs b;

        static {
            t2o.a(839909521);
        }

        public c(ITMSPage iTMSPage) {
            ckf.g(iTMSPage, "mPage");
            this.f16277a = iTMSPage;
            this.b = iTMSPage.getInstance();
        }

        public abstract int a();

        public final bbs b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bbs) ipChange.ipc$dispatch("f3197ddf", new Object[]{this});
            }
            return this.b;
        }

        public final ITMSPage c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITMSPage) ipChange.ipc$dispatch("26554f74", new Object[]{this});
            }
            return this.f16277a;
        }

        public abstract Object d();

        public abstract void e();
    }

    void addItems(List<? extends c> list);

    void show();
}
