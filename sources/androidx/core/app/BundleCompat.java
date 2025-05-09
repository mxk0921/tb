package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class BundleCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private BundleCompat() {
    }

    public static IBinder getBinder(Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("a84b586", new Object[]{bundle, str});
        }
        return bundle.getBinder(str);
    }

    public static void putBinder(Bundle bundle, String str, IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ffb765", new Object[]{bundle, str, iBinder});
        } else {
            bundle.putBinder(str, iBinder);
        }
    }
}
