package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.business.musicdetail.MusicItemBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class sdj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f27978a = 4;

    static {
        t2o.a(782237831);
    }

    public static void a(String str, String str2, int i, MusicItemBean musicItemBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af59ef79", new Object[]{str, str2, new Integer(i), musicItemBean});
        } else {
            g(str, str2, i, musicItemBean, "101");
        }
    }

    public static void b(String str, String str2, MusicItemBean musicItemBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5d7ad84", new Object[]{str, str2, musicItemBean});
        } else {
            a(str, str2, f27978a, musicItemBean);
        }
    }

    public static void c(String str, String str2, int i, MusicItemBean musicItemBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8788301a", new Object[]{str, str2, new Integer(i), musicItemBean});
        } else {
            g(str, str2, i, musicItemBean, "100");
        }
    }

    public static void d(String str, String str2, MusicItemBean musicItemBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a27e54c3", new Object[]{str, str2, musicItemBean});
        } else {
            c(str, str2, f27978a, musicItemBean);
        }
    }

    public static void e(String str, String str2, int i, MusicItemBean musicItemBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31316f1", new Object[]{str, str2, new Integer(i), musicItemBean});
        } else {
            g(str, str2, i, musicItemBean, "102");
        }
    }

    public static void f(String str, String str2, MusicItemBean musicItemBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b1fb70c", new Object[]{str, str2, musicItemBean});
        } else {
            e(str, str2, f27978a, musicItemBean);
        }
    }

    public static void g(String str, String str2, int i, MusicItemBean musicItemBean, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a560c6e", new Object[]{str, str2, new Integer(i), musicItemBean, str3});
        } else if (musicItemBean.vendorType != 10) {
            tdj tdjVar = new tdj(musicItemBean.id, musicItemBean.audioId, musicItemBean.vendorType);
            if (str != null) {
                tdjVar.d(str);
            }
            if (str2 != null) {
                tdjVar.e(str2);
            }
            tdjVar.o(i);
            tdjVar.n(str3, String.valueOf(System.currentTimeMillis() / 1000));
            new k7i().o0(tdjVar);
        }
    }

    public static void h(String str, String str2, int i, MusicItemBean musicItemBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9abaefa", new Object[]{str, str2, new Integer(i), musicItemBean});
        } else {
            g(str, str2, i, musicItemBean, "103");
        }
    }

    public static void i(String str, String str2, MusicItemBean musicItemBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107f79e3", new Object[]{str, str2, musicItemBean});
        } else {
            h(str, str2, f27978a, musicItemBean);
        }
    }
}
