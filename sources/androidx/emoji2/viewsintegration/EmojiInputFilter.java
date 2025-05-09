package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class EmojiInputFilter implements InputFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private EmojiCompat.InitCallback mInitCallback;
    private final TextView mTextView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class InitCallbackImpl extends EmojiCompat.InitCallback implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Reference<EmojiInputFilter> mEmojiInputFilterReference;
        private final Reference<TextView> mViewRef;

        public InitCallbackImpl(TextView textView, EmojiInputFilter emojiInputFilter) {
            this.mViewRef = new WeakReference(textView);
            this.mEmojiInputFilterReference = new WeakReference(emojiInputFilter);
        }

        public static /* synthetic */ Object ipc$super(InitCallbackImpl initCallbackImpl, String str, Object... objArr) {
            if (str.hashCode() == -1796017796) {
                super.onInitialized();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/viewsintegration/EmojiInputFilter$InitCallbackImpl");
        }

        private boolean isInputFilterCurrentlyRegisteredOnTextView(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bd5a4daf", new Object[]{this, textView, inputFilter})).booleanValue();
            }
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onInitialized() {
            Handler handler;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
                return;
            }
            super.onInitialized();
            TextView textView = this.mViewRef.get();
            if (textView != null && (handler = textView.getHandler()) != null) {
                handler.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            CharSequence text;
            CharSequence process;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TextView textView = this.mViewRef.get();
            if (isInputFilterCurrentlyRegisteredOnTextView(textView, this.mEmojiInputFilterReference.get()) && textView.isAttachedToWindow() && text != (process = EmojiCompat.get().process((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(process);
                int selectionEnd = Selection.getSelectionEnd(process);
                textView.setText(process);
                if (process instanceof Spannable) {
                    EmojiInputFilter.updateSelection((Spannable) process, selectionStart, selectionEnd);
                }
            }
        }
    }

    public EmojiInputFilter(TextView textView) {
        this.mTextView = textView;
    }

    public static void updateSelection(Spannable spannable, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ea83e3d", new Object[]{spannable, new Integer(i), new Integer(i2)});
        } else if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    public EmojiCompat.InitCallback getInitCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmojiCompat.InitCallback) ipChange.ipc$dispatch("ea85ab8d", new Object[]{this});
        }
        if (this.mInitCallback == null) {
            this.mInitCallback = new InitCallbackImpl(this.mTextView, this);
        }
        return this.mInitCallback;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("cf65d449", new Object[]{this, charSequence, new Integer(i), new Integer(i2), spanned, new Integer(i3), new Integer(i4)});
        }
        if (this.mTextView.isInEditMode()) {
            return charSequence;
        }
        int loadState = EmojiCompat.get().getLoadState();
        if (loadState != 0) {
            if (loadState != 1) {
                if (loadState != 3) {
                    return charSequence;
                }
            } else if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.mTextView.getText()) || charSequence == null) {
                return charSequence;
            } else {
                if (!(i == 0 && i2 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return EmojiCompat.get().process(charSequence, 0, charSequence.length());
            }
        }
        EmojiCompat.get().registerInitCallback(getInitCallback());
        return charSequence;
    }
}
