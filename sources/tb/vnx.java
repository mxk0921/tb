package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.x2r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vnx implements x2r.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "xmodule";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f30133a = true;

    static {
        t2o.a(962592855);
        t2o.a(962592825);
    }

    public vnx() {
        c(x2r.f().e(KEY));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[0])).booleanValue();
        }
        if (!b1v.bXmodule || !f30133a) {
            return false;
        }
        return true;
    }

    @Override // tb.x2r.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4813d18a", new Object[]{this, str, str2});
        } else {
            c(str2);
        }
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f758f4a6", new Object[]{this, str});
            return;
        }
        nhh.f("XmoduleConfigListener", "parseConfig value", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if ("0".equalsIgnoreCase(str)) {
            f30133a = false;
        } else {
            f30133a = true;
        }
    }
}
