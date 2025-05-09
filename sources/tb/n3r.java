package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class n3r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Class<?> f24488a;
    public Method b;

    public String a(String str) {
        if (this.f24488a == null || this.b == null) {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                this.f24488a = cls;
                this.b = cls.getMethod("get", String.class);
            } catch (Throwable th) {
                Log.e("SystemPropertiesProxy", "init fail", th);
                return null;
            }
        }
        try {
            return (String) this.b.invoke(this.f24488a, str);
        } catch (Throwable th2) {
            Log.e("SystemPropertiesProxy", "invoke fail", th2);
            return null;
        }
    }
}
