package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tzo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f29047a = "";
    public String b = "";
    public boolean c = false;
    public boolean d = false;
    public Object e;

    static {
        t2o.a(463470631);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SdkResponse{isSuccess=" + this.c + "isSystemError=" + this.d + ", responseCode='" + this.f29047a + "', responseMsg='" + this.b + "', data=" + this.e + '}';
    }
}
