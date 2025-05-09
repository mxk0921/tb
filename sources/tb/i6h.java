package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class i6h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String R_EXT_LOAD_MORE_ERROR_TITLE = "loadingErrorTitle";
    public static final String R_EXT_LOAD_MORE_TITLE = "loadingTitle";

    /* renamed from: a  reason: collision with root package name */
    public final String f21126a;
    public final String b;

    static {
        t2o.a(486539507);
    }

    public i6h(String str, String str2) {
        this.f21126a = str;
        this.b = str2;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb7fa1e3", new Object[]{this});
        }
        return this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39f85147", new Object[]{this});
        }
        return this.f21126a;
    }
}
