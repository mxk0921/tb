package com.taobao.android.icart.widget.richtext;

import android.content.Context;
import android.graphics.Canvas;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.neo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RichTextView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private neo mRichTextRender;

    static {
        t2o.a(478151128);
    }

    public RichTextView(Context context) {
        super(context);
    }

    private boolean handleSpanTouchEvent(MotionEvent motionEvent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba22d4ed", new Object[]{this, motionEvent})).booleanValue();
        }
        int g = this.mRichTextRender.g(motionEvent.getX(), motionEvent.getY());
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.mRichTextRender.f(g, g, ClickableSpan.class);
        if (clickableSpanArr != null) {
            z = false;
            for (ClickableSpan clickableSpan : clickableSpanArr) {
                if (z || clickableSpan != null) {
                    z = true;
                } else {
                    z = false;
                }
            }
        } else {
            z = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            return z;
        }
        if (!(action == 1 && z)) {
            return false;
        }
        for (ClickableSpan clickableSpan2 : clickableSpanArr) {
            clickableSpan2.onClick(this);
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(RichTextView richTextView, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/richtext/RichTextView");
    }

    public neo getRichTextRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (neo) ipChange.ipc$dispatch("399fca5a", new Object[]{this});
        }
        return this.mRichTextRender;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        neo neoVar = this.mRichTextRender;
        if (neoVar != null) {
            neoVar.b(canvas);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (handleSpanTouchEvent(motionEvent) || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setRichTextRender(neo neoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e57a9466", new Object[]{this, neoVar});
        } else {
            this.mRichTextRender = neoVar;
        }
    }

    public RichTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RichTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
