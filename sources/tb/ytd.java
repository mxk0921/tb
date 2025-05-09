package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ytd extends t4c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909577);
        }

        public static void a(ytd ytdVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf9d6ffc", new Object[]{ytdVar, bbsVar});
                return;
            }
            ckf.g(ytdVar, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(ytdVar, bbsVar);
        }
    }

    List<aud> h();
}
