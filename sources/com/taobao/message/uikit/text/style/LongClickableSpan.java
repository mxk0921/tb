package com.taobao.message.uikit.text.style;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class LongClickableSpan extends ClickableSpan {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int end;
    private int start;

    static {
        t2o.a(552599734);
    }

    public static /* synthetic */ Object ipc$super(LongClickableSpan longClickableSpan, String str, Object... objArr) {
        if (str.hashCode() == -1038128277) {
            super.updateDrawState((TextPaint) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/uikit/text/style/LongClickableSpan");
    }

    public int getEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ddee639f", new Object[]{this})).intValue();
        }
        return this.end;
    }

    public int getStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8070b926", new Object[]{this})).intValue();
        }
        return this.start;
    }

    public abstract void onDoubleClick(View view);

    public abstract void onLongClick(View view);

    public void setEnd(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da96e5e3", new Object[]{this, new Integer(i)});
        } else {
            this.end = i;
        }
    }

    public void setStart(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbcb2e3c", new Object[]{this, new Integer(i)});
        } else {
            this.start = i;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
            return;
        }
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(ApplicationUtil.getApplication().getResources().getBoolean(R.bool.mp_chat_msg_link_underline));
    }
}
