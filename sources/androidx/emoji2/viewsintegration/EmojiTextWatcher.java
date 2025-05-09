package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.EmojiCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class EmojiTextWatcher implements TextWatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final EditText mEditText;
    private final boolean mExpectInitializedEmojiCompat;
    private EmojiCompat.InitCallback mInitCallback;
    private int mLastEditLength;
    private int mLastEditPosition;
    private int mMaxEmojiCount = Integer.MAX_VALUE;
    private int mEmojiReplaceStrategy = 0;
    private boolean mEnabled = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class InitCallbackImpl extends EmojiCompat.InitCallback implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Reference<EditText> mViewRef;

        public InitCallbackImpl(EditText editText) {
            this.mViewRef = new WeakReference(editText);
        }

        public static /* synthetic */ Object ipc$super(InitCallbackImpl initCallbackImpl, String str, Object... objArr) {
            if (str.hashCode() == -1796017796) {
                super.onInitialized();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/viewsintegration/EmojiTextWatcher$InitCallbackImpl");
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
            EditText editText = this.mViewRef.get();
            if (editText != null && (handler = editText.getHandler()) != null) {
                handler.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                EmojiTextWatcher.processTextOnEnablingEvent(this.mViewRef.get(), 1);
            }
        }
    }

    public EmojiTextWatcher(EditText editText, boolean z) {
        this.mEditText = editText;
        this.mExpectInitializedEmojiCompat = z;
    }

    private boolean shouldSkipForDisabledOrNotConfigured() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3efb45a6", new Object[]{this})).booleanValue();
        }
        if (!this.mEnabled || (!this.mExpectInitializedEmojiCompat && !EmojiCompat.isConfigured())) {
            return true;
        }
        return false;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
        } else if (!this.mEditText.isInEditMode() && !shouldSkipForDisabledOrNotConfigured()) {
            int i = this.mLastEditPosition;
            int i2 = this.mLastEditLength;
            if (i2 > 0) {
                int loadState = EmojiCompat.get().getLoadState();
                if (loadState != 0) {
                    if (loadState == 1) {
                        EmojiCompat.get().process(editable, i, i + i2, this.mMaxEmojiCount, this.mEmojiReplaceStrategy);
                        return;
                    } else if (loadState != 3) {
                        return;
                    }
                }
                EmojiCompat.get().registerInitCallback(getInitCallback());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    public int getEmojiReplaceStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b54c4691", new Object[]{this})).intValue();
        }
        return this.mEmojiReplaceStrategy;
    }

    public EmojiCompat.InitCallback getInitCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmojiCompat.InitCallback) ipChange.ipc$dispatch("ea85ab8d", new Object[]{this});
        }
        if (this.mInitCallback == null) {
            this.mInitCallback = new InitCallbackImpl(this.mEditText);
        }
        return this.mInitCallback;
    }

    public int getMaxEmojiCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a801fe31", new Object[]{this})).intValue();
        }
        return this.mMaxEmojiCount;
    }

    public boolean isEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        return this.mEnabled;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.mLastEditPosition = i;
        this.mLastEditLength = i3;
    }

    public void setEmojiReplaceStrategy(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e095899", new Object[]{this, new Integer(i)});
        } else {
            this.mEmojiReplaceStrategy = i;
        }
    }

    public void setEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
        } else if (this.mEnabled != z) {
            if (this.mInitCallback != null) {
                EmojiCompat.get().unregisterInitCallback(this.mInitCallback);
            }
            this.mEnabled = z;
            if (z) {
                processTextOnEnablingEvent(this.mEditText, EmojiCompat.get().getLoadState());
            }
        }
    }

    public void setMaxEmojiCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef69be91", new Object[]{this, new Integer(i)});
        } else {
            this.mMaxEmojiCount = i;
        }
    }

    public static void processTextOnEnablingEvent(EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde4e2aa", new Object[]{editText, new Integer(i)});
        } else if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            EmojiCompat.get().process(editableText);
            EmojiInputFilter.updateSelection(editableText, selectionStart, selectionEnd);
        }
    }
}
