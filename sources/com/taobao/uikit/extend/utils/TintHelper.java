package com.taobao.uikit.extend.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatEditText;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TintHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(932184200);
    }

    private static ColorStateList createEditTextColorStateList(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("b4692733", new Object[]{context, new Integer(i)});
        }
        int i2 = R.attr.colorControlNormal;
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842919, -16842908}, new int[0]}, new int[]{ResourceUtils.resolveColor(context, i2), ResourceUtils.resolveColor(context, i2), i});
    }

    public static void setTint(RadioButton radioButton, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931c36f2", new Object[]{radioButton, new Integer(i)});
        } else {
            radioButton.setButtonTintList(new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{ResourceUtils.resolveColor(radioButton.getContext(), R.attr.colorControlNormal), i}));
        }
    }

    public static void setTint(SeekBar seekBar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eafbf860", new Object[]{seekBar, new Integer(i)});
            return;
        }
        ColorStateList valueOf = ColorStateList.valueOf(i);
        seekBar.setThumbTintList(valueOf);
        seekBar.setProgressTintList(valueOf);
    }

    public static void setTint(ProgressBar progressBar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37093a0b", new Object[]{progressBar, new Integer(i)});
        } else {
            setTint(progressBar, i, false);
        }
    }

    public static void setTint(ProgressBar progressBar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1eba29", new Object[]{progressBar, new Integer(i), new Boolean(z)});
            return;
        }
        ColorStateList valueOf = ColorStateList.valueOf(i);
        progressBar.setProgressTintList(valueOf);
        progressBar.setSecondaryProgressTintList(valueOf);
        if (!z) {
            progressBar.setIndeterminateTintList(valueOf);
        }
    }

    public static void setTint(EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3d7b28", new Object[]{editText, new Integer(i)});
            return;
        }
        ColorStateList createEditTextColorStateList = createEditTextColorStateList(editText.getContext(), i);
        if (editText instanceof AppCompatEditText) {
            ((AppCompatEditText) editText).setSupportBackgroundTintList(createEditTextColorStateList);
        } else {
            editText.setBackgroundTintList(createEditTextColorStateList);
        }
    }

    public static void setTint(CheckBox checkBox, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f598674", new Object[]{checkBox, new Integer(i)});
        } else {
            checkBox.setButtonTintList(new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{ResourceUtils.resolveColor(checkBox.getContext(), R.attr.colorControlNormal), i}));
        }
    }
}
