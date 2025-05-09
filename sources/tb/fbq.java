package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fbq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f19174a;
    public final String b;

    static {
        t2o.a(815793263);
    }

    public fbq(String str, String str2) {
        this.f19174a = str;
        this.b = str2;
    }

    public static fbq a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fbq) ipChange.ipc$dispatch("42640919", new Object[]{str, str2});
        }
        return new fbq(str, str2);
    }
}
