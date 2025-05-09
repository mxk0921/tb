package androidx.databinding.adapters;

import android.widget.AutoCompleteTextView;
import androidx.databinding.adapters.AdapterViewBindingAdapter;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AutoCompleteTextViewBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface FixText {
        CharSequence fixText(CharSequence charSequence);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface IsValid {
        boolean isValid(CharSequence charSequence);
    }

    public static void setOnItemSelectedListener(AutoCompleteTextView autoCompleteTextView, AdapterViewBindingAdapter.OnItemSelected onItemSelected, AdapterViewBindingAdapter.OnNothingSelected onNothingSelected) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8dd82b2", new Object[]{autoCompleteTextView, onItemSelected, onNothingSelected});
        } else if (onItemSelected == null && onNothingSelected == null) {
            autoCompleteTextView.setOnItemSelectedListener(null);
        } else {
            autoCompleteTextView.setOnItemSelectedListener(new AdapterViewBindingAdapter.OnItemSelectedComponentListener(onItemSelected, onNothingSelected, null));
        }
    }

    public static void setValidator(AutoCompleteTextView autoCompleteTextView, final FixText fixText, final IsValid isValid) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0862dcd", new Object[]{autoCompleteTextView, fixText, isValid});
        } else if (fixText == null && isValid == null) {
            autoCompleteTextView.setValidator(null);
        } else {
            autoCompleteTextView.setValidator(new AutoCompleteTextView.Validator() { // from class: androidx.databinding.adapters.AutoCompleteTextViewBindingAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.AutoCompleteTextView.Validator
                public CharSequence fixText(CharSequence charSequence) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (CharSequence) ipChange2.ipc$dispatch("8f81790d", new Object[]{this, charSequence});
                    }
                    FixText fixText2 = fixText;
                    if (fixText2 != null) {
                        return fixText2.fixText(charSequence);
                    }
                    return charSequence;
                }

                @Override // android.widget.AutoCompleteTextView.Validator
                public boolean isValid(CharSequence charSequence) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("7d734221", new Object[]{this, charSequence})).booleanValue();
                    }
                    IsValid isValid2 = IsValid.this;
                    if (isValid2 != null) {
                        return isValid2.isValid(charSequence);
                    }
                    return true;
                }
            });
        }
    }
}
