package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class EmojiTextViewHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final HelperInternal mHelper;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class HelperInternal {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public InputFilter[] getFilters(InputFilter[] inputFilterArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (InputFilter[]) ipChange.ipc$dispatch("cf5ab12c", new Object[]{this, inputFilterArr}) : inputFilterArr;
        }

        public boolean isEnabled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public void setAllCaps(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76d061cd", new Object[]{this, new Boolean(z)});
            }
        }

        public void setEnabled(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
            }
        }

        public void updateTransformationMethod() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bae46ba", new Object[]{this});
            }
        }

        public TransformationMethod wrapTransformationMethod(TransformationMethod transformationMethod) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TransformationMethod) ipChange.ipc$dispatch("5b532e9b", new Object[]{this, transformationMethod});
            }
            return transformationMethod;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class HelperInternal19 extends HelperInternal {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final EmojiInputFilter mEmojiInputFilter;
        private boolean mEnabled = true;
        private final TextView mTextView;

        public HelperInternal19(TextView textView) {
            this.mTextView = textView;
            this.mEmojiInputFilter = new EmojiInputFilter(textView);
        }

        private InputFilter[] addEmojiInputFilterIfMissing(InputFilter[] inputFilterArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InputFilter[]) ipChange.ipc$dispatch("a0a21745", new Object[]{this, inputFilterArr});
            }
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.mEmojiInputFilter) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.mEmojiInputFilter;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> getEmojiInputFilterPositionArray(InputFilter[] inputFilterArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SparseArray) ipChange.ipc$dispatch("8bcbceda", new Object[]{this, inputFilterArr});
            }
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof EmojiInputFilter) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        public static /* synthetic */ Object ipc$super(HelperInternal19 helperInternal19, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/viewsintegration/EmojiTextViewHelper$HelperInternal19");
        }

        private InputFilter[] removeEmojiInputFilterIfPresent(InputFilter[] inputFilterArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InputFilter[]) ipChange.ipc$dispatch("744382b3", new Object[]{this, inputFilterArr});
            }
            SparseArray<InputFilter> emojiInputFilterPositionArray = getEmojiInputFilterPositionArray(inputFilterArr);
            if (emojiInputFilterPositionArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - emojiInputFilterPositionArray.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (emojiInputFilterPositionArray.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod unwrapForDisabled(TransformationMethod transformationMethod) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TransformationMethod) ipChange.ipc$dispatch("2443a38d", new Object[]{this, transformationMethod});
            }
            if (transformationMethod instanceof EmojiTransformationMethod) {
                return ((EmojiTransformationMethod) transformationMethod).getOriginalTransformationMethod();
            }
            return transformationMethod;
        }

        private void updateFilters() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87fefa79", new Object[]{this});
            } else {
                this.mTextView.setFilters(getFilters(this.mTextView.getFilters()));
            }
        }

        private TransformationMethod wrapForEnabled(TransformationMethod transformationMethod) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TransformationMethod) ipChange.ipc$dispatch("40ffd96d", new Object[]{this, transformationMethod});
            }
            if (transformationMethod instanceof EmojiTransformationMethod) {
                return transformationMethod;
            }
            if (transformationMethod instanceof PasswordTransformationMethod) {
                return transformationMethod;
            }
            return new EmojiTransformationMethod(transformationMethod);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public InputFilter[] getFilters(InputFilter[] inputFilterArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InputFilter[]) ipChange.ipc$dispatch("cf5ab12c", new Object[]{this, inputFilterArr});
            }
            if (!this.mEnabled) {
                return removeEmojiInputFilterIfPresent(inputFilterArr);
            }
            return addEmojiInputFilterIfMissing(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public boolean isEnabled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
            }
            return this.mEnabled;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public void setAllCaps(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76d061cd", new Object[]{this, new Boolean(z)});
            } else if (z) {
                updateTransformationMethod();
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public void setEnabled(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
                return;
            }
            this.mEnabled = z;
            updateTransformationMethod();
            updateFilters();
        }

        public void setEnabledUnsafe(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("453d1b48", new Object[]{this, new Boolean(z)});
            } else {
                this.mEnabled = z;
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public void updateTransformationMethod() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bae46ba", new Object[]{this});
            } else {
                this.mTextView.setTransformationMethod(wrapTransformationMethod(this.mTextView.getTransformationMethod()));
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public TransformationMethod wrapTransformationMethod(TransformationMethod transformationMethod) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TransformationMethod) ipChange.ipc$dispatch("5b532e9b", new Object[]{this, transformationMethod});
            }
            if (this.mEnabled) {
                return wrapForEnabled(transformationMethod);
            }
            return unwrapForDisabled(transformationMethod);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class SkippingHelper19 extends HelperInternal {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final HelperInternal19 mHelperDelegate;

        public SkippingHelper19(TextView textView) {
            this.mHelperDelegate = new HelperInternal19(textView);
        }

        public static /* synthetic */ Object ipc$super(SkippingHelper19 skippingHelper19, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/viewsintegration/EmojiTextViewHelper$SkippingHelper19");
        }

        private boolean skipBecauseEmojiCompatNotInitialized() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9257b54d", new Object[]{this})).booleanValue();
            }
            return true ^ EmojiCompat.isConfigured();
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public InputFilter[] getFilters(InputFilter[] inputFilterArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InputFilter[]) ipChange.ipc$dispatch("cf5ab12c", new Object[]{this, inputFilterArr});
            }
            return skipBecauseEmojiCompatNotInitialized() ? inputFilterArr : this.mHelperDelegate.getFilters(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public boolean isEnabled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
            }
            return this.mHelperDelegate.isEnabled();
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public void setAllCaps(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76d061cd", new Object[]{this, new Boolean(z)});
            } else if (!skipBecauseEmojiCompatNotInitialized()) {
                this.mHelperDelegate.setAllCaps(z);
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public void setEnabled(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
            } else if (skipBecauseEmojiCompatNotInitialized()) {
                this.mHelperDelegate.setEnabledUnsafe(z);
            } else {
                this.mHelperDelegate.setEnabled(z);
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public void updateTransformationMethod() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bae46ba", new Object[]{this});
            } else if (!skipBecauseEmojiCompatNotInitialized()) {
                this.mHelperDelegate.updateTransformationMethod();
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public TransformationMethod wrapTransformationMethod(TransformationMethod transformationMethod) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TransformationMethod) ipChange.ipc$dispatch("5b532e9b", new Object[]{this, transformationMethod});
            }
            if (skipBecauseEmojiCompatNotInitialized()) {
                return transformationMethod;
            }
            return this.mHelperDelegate.wrapTransformationMethod(transformationMethod);
        }
    }

    public EmojiTextViewHelper(TextView textView) {
        this(textView, true);
    }

    public InputFilter[] getFilters(InputFilter[] inputFilterArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputFilter[]) ipChange.ipc$dispatch("cf5ab12c", new Object[]{this, inputFilterArr});
        }
        return this.mHelper.getFilters(inputFilterArr);
    }

    public boolean isEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        return this.mHelper.isEnabled();
    }

    public void setAllCaps(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d061cd", new Object[]{this, new Boolean(z)});
        } else {
            this.mHelper.setAllCaps(z);
        }
    }

    public void setEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
        } else {
            this.mHelper.setEnabled(z);
        }
    }

    public void updateTransformationMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bae46ba", new Object[]{this});
        } else {
            this.mHelper.updateTransformationMethod();
        }
    }

    public TransformationMethod wrapTransformationMethod(TransformationMethod transformationMethod) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransformationMethod) ipChange.ipc$dispatch("5b532e9b", new Object[]{this, transformationMethod});
        }
        return this.mHelper.wrapTransformationMethod(transformationMethod);
    }

    public EmojiTextViewHelper(TextView textView, boolean z) {
        Preconditions.checkNotNull(textView, "textView cannot be null");
        if (!z) {
            this.mHelper = new SkippingHelper19(textView);
        } else {
            this.mHelper = new HelperInternal19(textView);
        }
    }
}
