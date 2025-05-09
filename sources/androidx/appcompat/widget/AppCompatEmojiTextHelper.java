package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.emoji2.viewsintegration.EmojiTextViewHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AppCompatEmojiTextHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final EmojiTextViewHelper mEmojiTextViewHelper;
    private final TextView mView;

    public AppCompatEmojiTextHelper(TextView textView) {
        this.mView = textView;
        this.mEmojiTextViewHelper = new EmojiTextViewHelper(textView, false);
    }

    public InputFilter[] getFilters(InputFilter[] inputFilterArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputFilter[]) ipChange.ipc$dispatch("cf5ab12c", new Object[]{this, inputFilterArr});
        }
        return this.mEmojiTextViewHelper.getFilters(inputFilterArr);
    }

    public boolean isEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        return this.mEmojiTextViewHelper.isEnabled();
    }

    /* JADX WARN: Finally extract failed */
    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7423e3e3", new Object[]{this, attributeSet, new Integer(i)});
            return;
        }
        TypedArray obtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, R.styleable.AppCompatTextView, i, 0);
        try {
            int i2 = R.styleable.AppCompatTextView_emojiCompatEnabled;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            setEnabled(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setAllCaps(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d061cd", new Object[]{this, new Boolean(z)});
        } else {
            this.mEmojiTextViewHelper.setAllCaps(z);
        }
    }

    public void setEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
        } else {
            this.mEmojiTextViewHelper.setEnabled(z);
        }
    }

    public TransformationMethod wrapTransformationMethod(TransformationMethod transformationMethod) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransformationMethod) ipChange.ipc$dispatch("5b532e9b", new Object[]{this, transformationMethod});
        }
        return this.mEmojiTextViewHelper.wrapTransformationMethod(transformationMethod);
    }
}
