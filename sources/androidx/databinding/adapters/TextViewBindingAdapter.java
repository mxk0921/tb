package androidx.databinding.adapters;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.DialerKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TextKeyListener;
import android.util.Log;
import android.widget.TextView;
import androidx.databinding.InverseBindingListener;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TextViewBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DECIMAL = 5;
    public static final int INTEGER = 1;
    public static final int SIGNED = 3;
    private static final String TAG = "TextViewBindingAdapters";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface AfterTextChanged {
        void afterTextChanged(Editable editable);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface BeforeTextChanged {
        void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnTextChanged {
        void onTextChanged(CharSequence charSequence, int i, int i2, int i3);
    }

    public static String getTextString(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86551b37", new Object[]{textView});
        }
        return textView.getText().toString();
    }

    private static boolean haveContentsChanged(CharSequence charSequence, CharSequence charSequence2) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5d8a85", new Object[]{charSequence, charSequence2})).booleanValue();
        }
        if (charSequence == null) {
            z = true;
        } else {
            z = false;
        }
        if (charSequence2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static void setAutoText(TextView textView, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a6b2455", new Object[]{textView, new Boolean(z)});
            return;
        }
        KeyListener keyListener = textView.getKeyListener();
        TextKeyListener.Capitalize capitalize = TextKeyListener.Capitalize.NONE;
        if (keyListener != null) {
            i = keyListener.getInputType();
        }
        if ((i & 4096) != 0) {
            capitalize = TextKeyListener.Capitalize.CHARACTERS;
        } else if ((i & 8192) != 0) {
            capitalize = TextKeyListener.Capitalize.WORDS;
        } else if ((i & 16384) != 0) {
            capitalize = TextKeyListener.Capitalize.SENTENCES;
        }
        textView.setKeyListener(TextKeyListener.getInstance(z, capitalize));
    }

    public static void setBufferType(TextView textView, TextView.BufferType bufferType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c05d12f", new Object[]{textView, bufferType});
        } else {
            textView.setText(textView.getText(), bufferType);
        }
    }

    public static void setCapitalize(TextView textView, TextKeyListener.Capitalize capitalize) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd1e968", new Object[]{textView, capitalize});
            return;
        }
        if ((textView.getKeyListener().getInputType() & 32768) == 0) {
            z = false;
        }
        textView.setKeyListener(TextKeyListener.getInstance(z, capitalize));
    }

    public static void setDigits(TextView textView, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a0ff259", new Object[]{textView, charSequence});
        } else if (charSequence != null) {
            textView.setKeyListener(DigitsKeyListener.getInstance(charSequence.toString()));
        } else if (textView.getKeyListener() instanceof DigitsKeyListener) {
            textView.setKeyListener(null);
        }
    }

    public static void setDrawableBottom(TextView textView, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd64836", new Object[]{textView, drawable});
            return;
        }
        setIntrinsicBounds(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], drawable);
    }

    public static void setDrawableEnd(TextView textView, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22077e06", new Object[]{textView, drawable});
            return;
        }
        setIntrinsicBounds(drawable);
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], drawable, compoundDrawablesRelative[3]);
    }

    public static void setDrawableRight(TextView textView, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e24e5", new Object[]{textView, drawable});
            return;
        }
        setIntrinsicBounds(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], drawable, compoundDrawables[3]);
    }

    public static void setDrawableStart(TextView textView, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("879a9b5f", new Object[]{textView, drawable});
            return;
        }
        setIntrinsicBounds(drawable);
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(drawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    public static void setDrawableTop(TextView textView, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("227524cc", new Object[]{textView, drawable});
            return;
        }
        setIntrinsicBounds(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], drawable, compoundDrawables[2], compoundDrawables[3]);
    }

    public static void setImeActionLabel(TextView textView, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c490dc2", new Object[]{textView, charSequence});
        } else {
            textView.setImeActionLabel(charSequence, textView.getImeActionId());
        }
    }

    public static void setInputMethod(TextView textView, CharSequence charSequence) {
        try {
            textView.setKeyListener((KeyListener) Class.forName(charSequence.toString()).newInstance());
        } catch (ClassNotFoundException e) {
            Log.e(TAG, "Could not create input method: " + ((Object) charSequence), e);
        } catch (IllegalAccessException e2) {
            Log.e(TAG, "Could not create input method: " + ((Object) charSequence), e2);
        } catch (InstantiationException e3) {
            Log.e(TAG, "Could not create input method: " + ((Object) charSequence), e3);
        }
    }

    private static void setIntrinsicBounds(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a90e2f83", new Object[]{drawable});
        } else if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    public static void setLineSpacingExtra(TextView textView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d60128a6", new Object[]{textView, new Float(f)});
        } else {
            textView.setLineSpacing(f, textView.getLineSpacingMultiplier());
        }
    }

    public static void setLineSpacingMultiplier(TextView textView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b295f8d1", new Object[]{textView, new Float(f)});
        } else {
            textView.setLineSpacing(textView.getLineSpacingExtra(), f);
        }
    }

    public static void setMaxLength(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ec9c2e", new Object[]{textView, new Integer(i)});
            return;
        }
        InputFilter[] filters = textView.getFilters();
        if (filters != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= filters.length) {
                    int length = filters.length;
                    InputFilter[] inputFilterArr = new InputFilter[1 + length];
                    System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                    inputFilterArr[length] = new InputFilter.LengthFilter(i);
                    filters = inputFilterArr;
                    break;
                }
                InputFilter inputFilter = filters[i2];
                if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                    i2++;
                } else if (((InputFilter.LengthFilter) inputFilter).getMax() != i) {
                    filters[i2] = new InputFilter.LengthFilter(i);
                }
            }
        } else {
            filters = new InputFilter[]{new InputFilter.LengthFilter(i)};
        }
        textView.setFilters(filters);
    }

    public static void setNumeric(TextView textView, int i) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b457e11", new Object[]{textView, new Integer(i)});
            return;
        }
        if ((i & 3) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 5) == 0) {
            z2 = false;
        }
        textView.setKeyListener(DigitsKeyListener.getInstance(z, z2));
    }

    public static void setPassword(TextView textView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4260b734", new Object[]{textView, new Boolean(z)});
        } else if (z) {
            textView.setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textView.setTransformationMethod(null);
        }
    }

    public static void setPhoneNumber(TextView textView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a170ac", new Object[]{textView, new Boolean(z)});
        } else if (z) {
            textView.setKeyListener(DialerKeyListener.getInstance());
        } else if (textView.getKeyListener() instanceof DialerKeyListener) {
            textView.setKeyListener(null);
        }
    }

    public static void setShadowColor(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("852243a7", new Object[]{textView, new Integer(i)});
        } else {
            textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), textView.getShadowDy(), i);
        }
    }

    public static void setShadowDx(TextView textView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0dc199", new Object[]{textView, new Float(f)});
            return;
        }
        textView.setShadowLayer(textView.getShadowRadius(), f, textView.getShadowDy(), textView.getShadowColor());
    }

    public static void setShadowDy(TextView textView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f689da", new Object[]{textView, new Float(f)});
            return;
        }
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), f, textView.getShadowColor());
    }

    public static void setShadowRadius(TextView textView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87bea017", new Object[]{textView, new Float(f)});
        } else {
            textView.setShadowLayer(f, textView.getShadowDx(), textView.getShadowDy(), textView.getShadowColor());
        }
    }

    public static void setText(TextView textView, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cdeff2", new Object[]{textView, charSequence});
            return;
        }
        CharSequence text = textView.getText();
        if (charSequence == text) {
            return;
        }
        if (charSequence != null || text.length() != 0) {
            if (charSequence instanceof Spanned) {
                if (charSequence.equals(text)) {
                    return;
                }
            } else if (!haveContentsChanged(charSequence, text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    public static void setTextSize(TextView textView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d43d113", new Object[]{textView, new Float(f)});
        } else {
            textView.setTextSize(0, f);
        }
    }

    public static void setTextWatcher(TextView textView, final BeforeTextChanged beforeTextChanged, final OnTextChanged onTextChanged, final AfterTextChanged afterTextChanged, final InverseBindingListener inverseBindingListener) {
        TextWatcher textWatcher;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d276dab", new Object[]{textView, beforeTextChanged, onTextChanged, afterTextChanged, inverseBindingListener});
            return;
        }
        if (beforeTextChanged == null && afterTextChanged == null && onTextChanged == null && inverseBindingListener == null) {
            textWatcher = null;
        } else {
            textWatcher = new TextWatcher() { // from class: androidx.databinding.adapters.TextViewBindingAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                        return;
                    }
                    AfterTextChanged afterTextChanged2 = afterTextChanged;
                    if (afterTextChanged2 != null) {
                        afterTextChanged2.afterTextChanged(editable);
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                        return;
                    }
                    BeforeTextChanged beforeTextChanged2 = BeforeTextChanged.this;
                    if (beforeTextChanged2 != null) {
                        beforeTextChanged2.beforeTextChanged(charSequence, i, i2, i3);
                    }
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                        return;
                    }
                    OnTextChanged onTextChanged2 = onTextChanged;
                    if (onTextChanged2 != null) {
                        onTextChanged2.onTextChanged(charSequence, i, i2, i3);
                    }
                    InverseBindingListener inverseBindingListener2 = inverseBindingListener;
                    if (inverseBindingListener2 != null) {
                        inverseBindingListener2.onChange();
                    }
                }
            };
        }
        TextWatcher textWatcher2 = (TextWatcher) ListenerUtil.trackListener(textView, textWatcher, R.id.textWatcher);
        if (textWatcher2 != null) {
            textView.removeTextChangedListener(textWatcher2);
        }
        if (textWatcher != null) {
            textView.addTextChangedListener(textWatcher);
        }
    }

    public static void setImeActionLabel(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f913b3a5", new Object[]{textView, new Integer(i)});
        } else {
            textView.setImeActionLabel(textView.getImeActionLabel(), i);
        }
    }

    public static void setDrawableLeft(TextView textView, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4590dda", new Object[]{textView, drawable});
            return;
        }
        setIntrinsicBounds(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(drawable, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }
}
