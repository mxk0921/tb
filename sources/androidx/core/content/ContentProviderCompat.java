package androidx.core.content;

import android.content.ContentProvider;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ContentProviderCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private ContentProviderCompat() {
    }

    public static Context requireContext(ContentProvider contentProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("61ed9c14", new Object[]{contentProvider});
        }
        Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}
