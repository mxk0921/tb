package androidx.core.os;

import android.os.Environment;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class EnvironmentCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    @Deprecated
    public static final String MEDIA_UNKNOWN = "unknown";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static String getExternalStorageState(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1786dc8b", new Object[]{file});
            }
            return Environment.getExternalStorageState(file);
        }
    }

    private EnvironmentCompat() {
    }

    public static String getStorageState(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab5675d6", new Object[]{file});
        }
        return Api21Impl.getExternalStorageState(file);
    }
}
