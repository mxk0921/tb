package androidx.databinding.adapters;

import android.view.ViewStub;
import androidx.databinding.ViewStubProxy;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ViewStubBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void setOnInflateListener(ViewStubProxy viewStubProxy, ViewStub.OnInflateListener onInflateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c2a39d", new Object[]{viewStubProxy, onInflateListener});
        } else {
            viewStubProxy.setOnInflateListener(onInflateListener);
        }
    }
}
