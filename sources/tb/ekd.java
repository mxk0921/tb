package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ekd extends t4c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(843055260);
        }

        public static void a(ekd ekdVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbaaf48a", new Object[]{ekdVar, bbsVar});
                return;
            }
            ckf.g(ekdVar, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(ekdVar, bbsVar);
        }

        public static void b(ekd ekdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6719aee7", new Object[]{ekdVar});
                return;
            }
            ckf.g(ekdVar, "this");
            t4c.a.b(ekdVar);
        }
    }

    c7o B(String str);

    Long G();

    void P(String str);

    void X(String str);

    c7o Y(String str);

    String c0();

    String k();

    void l0(s8o s8oVar);

    void m(s8o s8oVar);

    c7o n(String str, String str2);

    c7o o0(String str);

    void r(s8o s8oVar);

    void u(s8o s8oVar);
}
