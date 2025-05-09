package tb;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cdv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final UMLinkLogInterface f16997a = hdv.a();

    public static void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ea5e77a", new Object[]{str, str2, str3, str4, str5});
            return;
        }
        cyu c = cyu.c(str5);
        c.d("tag", str);
        f16997a.logError("add_bag", "", str2, null, str3, str4, null, c);
    }
}
