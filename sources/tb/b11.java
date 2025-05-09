package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class b11 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_INFO = "apiInfo";

    /* renamed from: a  reason: collision with root package name */
    public final String f16122a;
    public final String b;

    static {
        t2o.a(487587842);
    }

    public b11(String str, String str2) {
        this.f16122a = str;
        this.b = str2;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
        }
        return this.f16122a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.b;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f04d5dc", new Object[]{this})).booleanValue();
        }
        if (this.f16122a == null || this.b == null) {
            return true;
        }
        return false;
    }
}
