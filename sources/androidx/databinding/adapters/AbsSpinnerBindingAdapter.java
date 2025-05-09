package androidx.databinding.adapters;

import android.widget.AbsSpinner;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AbsSpinnerBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static <T extends CharSequence> void setEntries(AbsSpinner absSpinner, T[] tArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d64ff1f", new Object[]{absSpinner, tArr});
        } else if (tArr != null) {
            SpinnerAdapter adapter = absSpinner.getAdapter();
            if (adapter != null && adapter.getCount() == tArr.length) {
                for (int i = 0; i < tArr.length; i++) {
                    if (tArr[i].equals(adapter.getItem(i))) {
                    }
                }
                return;
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(absSpinner.getContext(), 17367048, tArr);
            arrayAdapter.setDropDownViewResource(17367049);
            absSpinner.setAdapter((SpinnerAdapter) arrayAdapter);
        } else {
            absSpinner.setAdapter((SpinnerAdapter) null);
        }
    }

    public static <T> void setEntries(AbsSpinner absSpinner, List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe9eff4b", new Object[]{absSpinner, list});
        } else if (list != null) {
            SpinnerAdapter adapter = absSpinner.getAdapter();
            if (adapter instanceof ObservableListAdapter) {
                ((ObservableListAdapter) adapter).setList(list);
            } else {
                absSpinner.setAdapter((SpinnerAdapter) new ObservableListAdapter(absSpinner.getContext(), list, 17367048, 17367049, 0));
            }
        } else {
            absSpinner.setAdapter((SpinnerAdapter) null);
        }
    }
}
