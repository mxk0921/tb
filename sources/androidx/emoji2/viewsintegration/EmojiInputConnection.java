package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class EmojiInputConnection extends InputConnectionWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final EmojiCompatDeleteHelper mEmojiCompatDeleteHelper;
    private final TextView mTextView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class EmojiCompatDeleteHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public boolean handleDeleteSurroundingText(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8bf81197", new Object[]{this, inputConnection, editable, new Integer(i), new Integer(i2), new Boolean(z)})).booleanValue();
            }
            return EmojiCompat.handleDeleteSurroundingText(inputConnection, editable, i, i2, z);
        }

        public void updateEditorInfoAttrs(EditorInfo editorInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73b6ac53", new Object[]{this, editorInfo});
            } else if (EmojiCompat.isConfigured()) {
                EmojiCompat.get().updateEditorInfo(editorInfo);
            }
        }
    }

    public EmojiInputConnection(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new EmojiCompatDeleteHelper());
    }

    private Editable getEditable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Editable) ipChange.ipc$dispatch("c514fb8c", new Object[]{this});
        }
        return this.mTextView.getEditableText();
    }

    public static /* synthetic */ Object ipc$super(EmojiInputConnection emojiInputConnection, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1507364175) {
            return new Boolean(super.deleteSurroundingText(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
        }
        if (hashCode == 240970310) {
            return new Boolean(super.deleteSurroundingTextInCodePoints(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/emoji2/viewsintegration/EmojiInputConnection");
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a62772b1", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (this.mEmojiCompatDeleteHelper.handleDeleteSurroundingText(this, getEditable(), i, i2, false) || super.deleteSurroundingText(i, i2)) {
            return true;
        }
        return false;
    }

    public EmojiInputConnection(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, EmojiCompatDeleteHelper emojiCompatDeleteHelper) {
        super(inputConnection, false);
        this.mTextView = textView;
        this.mEmojiCompatDeleteHelper = emojiCompatDeleteHelper;
        emojiCompatDeleteHelper.updateEditorInfoAttrs(editorInfo);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5cea46", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return this.mEmojiCompatDeleteHelper.handleDeleteSurroundingText(this, getEditable(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
