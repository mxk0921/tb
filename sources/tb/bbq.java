package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.x2r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bbq implements x2r.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "spdy_close_callback";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f16304a = false;

    static {
        t2o.a(962592822);
        t2o.a(962592825);
    }

    public bbq() {
        c(x2r.f().e(KEY));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc8c8fe9", new Object[0])).booleanValue();
        }
        return f16304a;
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
        nhh.f("SpdyCloseCallbackConfigListener", "parseConfig value", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if ("1".equalsIgnoreCase(str)) {
            f16304a = true;
        } else {
            f16304a = false;
        }
    }
}
