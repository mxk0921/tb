package androidx.core.content.res;

import android.content.res.Resources;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ConfigurationHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private ConfigurationHelper() {
    }

    public static int getDensityDpi(Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ac494c2", new Object[]{resources})).intValue();
        }
        return resources.getConfiguration().densityDpi;
    }
}
