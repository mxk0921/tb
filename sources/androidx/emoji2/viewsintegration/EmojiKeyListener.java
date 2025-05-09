package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.EmojiCompat;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class EmojiKeyListener implements KeyListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final EmojiCompatHandleKeyDownHelper mEmojiCompatHandleKeyDownHelper;
    private final KeyListener mKeyListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class EmojiCompatHandleKeyDownHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public boolean handleKeyDown(Editable editable, int i, KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c7c36cb8", new Object[]{this, editable, new Integer(i), keyEvent})).booleanValue();
            }
            return EmojiCompat.handleOnKeyDown(editable, i, keyEvent);
        }
    }

    public EmojiKeyListener(KeyListener keyListener) {
        this(keyListener, new EmojiCompatHandleKeyDownHelper());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8983c8f", new Object[]{this, view, editable, new Integer(i)});
        } else {
            this.mKeyListener.clearMetaKeyState(view, editable, i);
        }
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b38bf4e8", new Object[]{this})).intValue();
        }
        return this.mKeyListener.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de6cb760", new Object[]{this, view, editable, keyEvent})).booleanValue();
        }
        return this.mKeyListener.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec6cef48", new Object[]{this, view, editable, new Integer(i), keyEvent})).booleanValue();
        }
        return this.mKeyListener.onKeyUp(view, editable, i, keyEvent);
    }

    public EmojiKeyListener(KeyListener keyListener, EmojiCompatHandleKeyDownHelper emojiCompatHandleKeyDownHelper) {
        this.mKeyListener = keyListener;
        this.mEmojiCompatHandleKeyDownHelper = emojiCompatHandleKeyDownHelper;
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7b6e40f", new Object[]{this, view, editable, new Integer(i), keyEvent})).booleanValue();
        }
        return this.mEmojiCompatHandleKeyDownHelper.handleKeyDown(editable, i, keyEvent) || this.mKeyListener.onKeyDown(view, editable, i, keyEvent);
    }
}
