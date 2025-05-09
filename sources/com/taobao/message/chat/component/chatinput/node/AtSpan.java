package com.taobao.message.chat.component.chatinput.node;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AtSpan extends ClickableSpan {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String nick;
    private String targetId;

    static {
        t2o.a(552599558);
    }

    public AtSpan(String str, String str2) {
        this.targetId = str;
        this.nick = str2;
    }

    public static /* synthetic */ Object ipc$super(AtSpan atSpan, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/chat/component/chatinput/node/AtSpan");
    }

    public String getNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[]{this});
        }
        return this.nick;
    }

    public String getTargetId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ee30c37", new Object[]{this});
        }
        return this.targetId;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        }
    }

    public void setNick(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04e97b6", new Object[]{this, str});
        } else {
            this.nick = str;
        }
    }

    public void setTargetId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("385bd51f", new Object[]{this, str});
        } else {
            this.targetId = str;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
            return;
        }
        textPaint.setColor(-12762555);
        textPaint.setUnderlineText(false);
    }
}
