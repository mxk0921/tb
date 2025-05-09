package com.taobao.android.dinamicx.view.richtext.span;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CloneableUnderlineSpan extends UnderlineSpan implements Cloneable {
    private static final int UNDERLINE_WIDTH = 4;
    private int mColor;

    static {
        t2o.a(444597244);
        t2o.a(444597246);
    }

    public CloneableUnderlineSpan(int i) {
        this.mColor = i;
    }

    public Object clone() {
        return null;
    }

    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
    }
}
