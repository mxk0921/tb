package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class EmojiEditTextHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final EditText mEditText;
    private int mEmojiReplaceStrategy;
    private int mMaxEmojiCount;
    private final EmojiTextWatcher mTextWatcher;

    public EmojiEditTextHelper(EditText editText) {
        this(editText, true);
    }

    public int getEmojiReplaceStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b54c4691", new Object[]{this})).intValue();
        }
        return this.mEmojiReplaceStrategy;
    }

    public KeyListener getKeyListener(KeyListener keyListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KeyListener) ipChange.ipc$dispatch("29b2f220", new Object[]{this, keyListener});
        }
        if (keyListener instanceof EmojiKeyListener) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        return new EmojiKeyListener(keyListener);
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
        return this.mTextWatcher.isEnabled();
    }

    public InputConnection onCreateInputConnection(InputConnection inputConnection, EditorInfo editorInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputConnection) ipChange.ipc$dispatch("f85773fc", new Object[]{this, inputConnection, editorInfo});
        }
        if (inputConnection == null) {
            return null;
        }
        return inputConnection instanceof EmojiInputConnection ? inputConnection : new EmojiInputConnection(this.mEditText, inputConnection, editorInfo);
    }

    public void setEmojiReplaceStrategy(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e095899", new Object[]{this, new Integer(i)});
            return;
        }
        this.mEmojiReplaceStrategy = i;
        this.mTextWatcher.setEmojiReplaceStrategy(i);
    }

    public void setEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
        } else {
            this.mTextWatcher.setEnabled(z);
        }
    }

    public void setMaxEmojiCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef69be91", new Object[]{this, new Integer(i)});
            return;
        }
        Preconditions.checkArgumentNonnegative(i, "maxEmojiCount should be greater than 0");
        this.mMaxEmojiCount = i;
        this.mTextWatcher.setMaxEmojiCount(i);
    }

    public EmojiEditTextHelper(EditText editText, boolean z) {
        this.mMaxEmojiCount = Integer.MAX_VALUE;
        this.mEmojiReplaceStrategy = 0;
        Preconditions.checkNotNull(editText, "editText cannot be null");
        this.mEditText = editText;
        EmojiTextWatcher emojiTextWatcher = new EmojiTextWatcher(editText, z);
        this.mTextWatcher = emojiTextWatcher;
        editText.addTextChangedListener(emojiTextWatcher);
        editText.setEditableFactory(EmojiEditableFactory.getInstance());
    }
}
