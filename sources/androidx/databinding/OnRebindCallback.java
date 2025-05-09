package androidx.databinding;

import androidx.databinding.ViewDataBinding;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class OnRebindCallback<T extends ViewDataBinding> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void onBound(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd32d779", new Object[]{this, t});
        }
    }

    public void onCanceled(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5e178f2", new Object[]{this, t});
        }
    }

    public boolean onPreBind(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("291138bf", new Object[]{this, t})).booleanValue();
        }
        return true;
    }
}
