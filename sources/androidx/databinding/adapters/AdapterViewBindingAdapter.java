package androidx.databinding.adapters;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import androidx.databinding.InverseBindingListener;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AdapterViewBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnItemSelected {
        void onItemSelected(AdapterView<?> adapterView, View view, int i, long j);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class OnItemSelectedComponentListener implements AdapterView.OnItemSelectedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final InverseBindingListener mAttrChanged;
        private final OnNothingSelected mNothingSelected;
        private final OnItemSelected mSelected;

        public OnItemSelectedComponentListener(OnItemSelected onItemSelected, OnNothingSelected onNothingSelected, InverseBindingListener inverseBindingListener) {
            this.mSelected = onItemSelected;
            this.mNothingSelected = onNothingSelected;
            this.mAttrChanged = inverseBindingListener;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb0d7f99", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
                return;
            }
            OnItemSelected onItemSelected = this.mSelected;
            if (onItemSelected != null) {
                onItemSelected.onItemSelected(adapterView, view, i, j);
            }
            InverseBindingListener inverseBindingListener = this.mAttrChanged;
            if (inverseBindingListener != null) {
                inverseBindingListener.onChange();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3d2c76", new Object[]{this, adapterView});
                return;
            }
            OnNothingSelected onNothingSelected = this.mNothingSelected;
            if (onNothingSelected != null) {
                onNothingSelected.onNothingSelected(adapterView);
            }
            InverseBindingListener inverseBindingListener = this.mAttrChanged;
            if (inverseBindingListener != null) {
                inverseBindingListener.onChange();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnNothingSelected {
        void onNothingSelected(AdapterView<?> adapterView);
    }

    public static void setOnItemSelectedListener(AdapterView adapterView, OnItemSelected onItemSelected, OnNothingSelected onNothingSelected, InverseBindingListener inverseBindingListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef16e1aa", new Object[]{adapterView, onItemSelected, onNothingSelected, inverseBindingListener});
        } else if (onItemSelected == null && onNothingSelected == null && inverseBindingListener == null) {
            adapterView.setOnItemSelectedListener(null);
        } else {
            adapterView.setOnItemSelectedListener(new OnItemSelectedComponentListener(onItemSelected, onNothingSelected, inverseBindingListener));
        }
    }

    public static void setSelectedItemPosition(AdapterView adapterView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c385dddd", new Object[]{adapterView, new Integer(i)});
        } else if (adapterView.getSelectedItemPosition() != i) {
            adapterView.setSelection(i);
        }
    }

    public static void setSelection(AdapterView adapterView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3c1bcc", new Object[]{adapterView, new Integer(i)});
        } else {
            setSelectedItemPosition(adapterView, i);
        }
    }

    public static void setSelection(AdapterView adapterView, int i, Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1150dcf7", new Object[]{adapterView, new Integer(i), adapter});
        } else {
            setSelectedItemPosition(adapterView, i, adapter);
        }
    }

    public static void setSelectedItemPosition(AdapterView adapterView, int i, Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc29bc08", new Object[]{adapterView, new Integer(i), adapter});
        } else if (adapter != adapterView.getAdapter()) {
            adapterView.setAdapter(adapter);
            adapterView.setSelection(i);
        } else if (adapterView.getSelectedItemPosition() != i) {
            adapterView.setSelection(i);
        }
    }
}
