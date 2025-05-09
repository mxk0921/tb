package androidx.databinding;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class DataBinderMapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public List<DataBinderMapper> collectDependencies() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("47b2f88d", new Object[]{this});
        }
        return Collections.emptyList();
    }

    public abstract String convertBrIdToString(int i);

    public abstract ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i);

    public abstract ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i);

    public abstract int getLayoutId(String str);
}
