package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.lpm_android.LpmProxy;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class smh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String entryQuery = "entryQuery";
    public static final String liveDetailModel = "liveDetailModel";
    public static final String query = "query";
    public static final String switchModel = "switchModel";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(806355625);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(806355624);
    }

    public final void a(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9502965d", new Object[]{this, str, str2, obj});
            return;
        }
        ckf.h(str, "bizCode");
        ckf.h(str2, "contextKey");
        try {
            qmh f = qmh.f();
            ckf.c(f, "Lpm.instance()");
            if (f.h()) {
                LpmProxy.getInstance().updateContext(str, str2, obj);
            }
        } catch (Exception unused) {
        }
    }

    public final void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e03aca4", new Object[]{this, str, str2, map});
            return;
        }
        ckf.h(str, "bizCode");
        ckf.h(str2, "contextKey");
        try {
            qmh f = qmh.f();
            ckf.c(f, "Lpm.instance()");
            if (f.h()) {
                LpmProxy.getInstance().updateContext(str, str2, map);
            }
        } catch (Exception unused) {
        }
    }
}
