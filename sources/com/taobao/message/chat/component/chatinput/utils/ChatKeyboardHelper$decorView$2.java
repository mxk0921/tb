package com.taobao.message.chat.component.chatinput.utils;

import android.view.View;
import android.view.Window;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ChatKeyboardHelper$decorView$2 extends Lambda implements d1a<View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ChatKeyboardHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatKeyboardHelper$decorView$2(ChatKeyboardHelper chatKeyboardHelper) {
        super(0);
        this.this$0 = chatKeyboardHelper;
    }

    public static /* synthetic */ Object ipc$super(ChatKeyboardHelper$decorView$2 chatKeyboardHelper$decorView$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/chat/component/chatinput/utils/ChatKeyboardHelper$decorView$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final View invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("287bc381", new Object[]{this});
        }
        Window window = ChatKeyboardHelper.access$getAty$p(this.this$0).getWindow();
        ckf.c(window, "aty.window");
        return window.getDecorView();
    }
}
