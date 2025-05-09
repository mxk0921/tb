package com.uc.webview.export.extension;

import android.graphics.Point;
import android.graphics.Rect;
import com.uc.webview.base.IExtender;
import com.uc.webview.internal.interfaces.ITextSelectionExtension;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TextSelectionExtension {
    private ITextSelectionExtension mTextSelectionExtension;

    public TextSelectionExtension(ITextSelectionExtension iTextSelectionExtension) {
        this.mTextSelectionExtension = iTextSelectionExtension;
    }

    public void expandSelection() {
        this.mTextSelectionExtension.expandSelection();
    }

    public String getSelection() {
        return this.mTextSelectionExtension.getSelection();
    }

    public void paste(String str) {
        this.mTextSelectionExtension.paste(str);
    }

    public void selectAll() {
        this.mTextSelectionExtension.selectAll();
    }

    public boolean selectText() {
        return this.mTextSelectionExtension.selectText();
    }

    public void selectionDone() {
        this.mTextSelectionExtension.selectionDone();
    }

    public void setTextSelectionClient(TextSelectionClient textSelectionClient) {
        this.mTextSelectionExtension.setTextSelectionClient(textSelectionClient);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TextSelectionClient implements IExtender {
        @Override // com.uc.webview.base.IExtender
        public Object invoke(int i, Object[] objArr) {
            return null;
        }

        public boolean needCustomMenu() {
            return false;
        }

        public boolean onSearchClicked(String str) {
            return false;
        }

        public boolean onShareClicked(String str) {
            return false;
        }

        public boolean shouldShowSearchItem() {
            return true;
        }

        public boolean shouldShowShareItem() {
            return true;
        }

        public void showSelectionMenu(boolean z) {
        }

        public void onUpdateMenuPosition(Point point, Point point2, Rect rect, Rect rect2) {
        }
    }
}
