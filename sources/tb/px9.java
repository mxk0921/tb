package tb;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class px9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f26373a = {"android:fragments", "android:support:fragments", "androidx:fragments"};

    static {
        t2o.a(619708651);
    }

    public static void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ff0d9c4", new Object[]{bundle});
        } else if (bundle != null) {
            for (String str : f26373a) {
                bundle.remove(str);
            }
            Object obj = bundle.get("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (obj instanceof Bundle) {
                Bundle bundle2 = (Bundle) obj;
                for (String str2 : f26373a) {
                    bundle2.remove(str2);
                }
            }
        }
    }
}
