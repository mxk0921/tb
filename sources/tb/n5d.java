package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface n5d extends t4c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a(String str, boolean z);

        void b(int i, String str);

        void onDownloadProgress(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(843055256);
        }

        public static void a(n5d n5dVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ffc8d4c6", new Object[]{n5dVar, bbsVar});
                return;
            }
            ckf.g(n5dVar, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(n5dVar, bbsVar);
        }

        public static void b(n5d n5dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a17bd11", new Object[]{n5dVar});
                return;
            }
            ckf.g(n5dVar, "this");
            t4c.a.b(n5dVar);
        }
    }

    void d0(jkl jklVar, jkl jklVar2, List<jkl> list, a aVar);

    void k0(jkl jklVar, b bVar);
}
