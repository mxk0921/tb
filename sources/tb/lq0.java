package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lq0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_ICON_TYPE = "icon only supports http(s) or base64";
    public static final String ERROR_NAVIGATION_ADAPTER = "navigation adapter is not set";
    public static final String RESULT_ERROR = "MUS_FAILED";

    /* renamed from: a  reason: collision with root package name */
    public final String f23506a;
    public final String b;

    static {
        t2o.a(980418653);
    }

    public lq0(String str, String str2) {
        this.f23506a = str;
        this.b = str2;
    }

    public Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9fb6b656", new Object[]{this});
        }
        return null;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
        }
        return this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ea3fdc6", new Object[]{this});
        }
        return this.f23506a;
    }

    public lq0() {
        this("MUS_FAILED", "");
    }
}
