package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class FragmentContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Deprecated
    public Fragment instantiate(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("7afc34fb", new Object[]{this, context, str, bundle});
        }
        return Fragment.instantiate(context, str, bundle);
    }

    public abstract View onFindViewById(int i);

    public abstract boolean onHasView();
}
