package com.taobao.message.chat.component.chatinput.node;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chat.component.chatinput.utils.ChatKeyboardHelper;
import com.taobao.message.lab.comfrm.support.dinamic.DxCustemDataEvent;
import com.taobao.message.lab.comfrm.util.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "show", "Ltb/xhv;", "invoke", "(Z)V", "com/taobao/message/chat/component/chatinput/node/DXGrowingTextInputViewWidgetNode$considerInitKeyboardHelper$2$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DXGrowingTextInputViewWidgetNode$considerInitKeyboardHelper$$inlined$apply$lambda$1 extends Lambda implements g1a<Boolean, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ChatKeyboardHelper $this_apply;
    public final /* synthetic */ DXGrowingTextInputViewWidgetNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXGrowingTextInputViewWidgetNode$considerInitKeyboardHelper$$inlined$apply$lambda$1(ChatKeyboardHelper chatKeyboardHelper, DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode) {
        super(1);
        this.$this_apply = chatKeyboardHelper;
        this.this$0 = dXGrowingTextInputViewWidgetNode;
    }

    public static /* synthetic */ Object ipc$super(DXGrowingTextInputViewWidgetNode$considerInitKeyboardHelper$$inlined$apply$lambda$1 dXGrowingTextInputViewWidgetNode$considerInitKeyboardHelper$$inlined$apply$lambda$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/chat/component/chatinput/node/DXGrowingTextInputViewWidgetNode$considerInitKeyboardHelper$$inlined$apply$lambda$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return xhv.INSTANCE;
    }

    public final void invoke(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b985b5", new Object[]{this, new Boolean(z)});
        } else if (DXGrowingTextInputViewWidgetNode.access$getHasFilterFirstHideEvent$p(this.this$0) || z) {
            DXGrowingTextInputViewWidgetNode.access$setHasFilterFirstHideEvent$p(this.this$0, true);
            if (z) {
                Logger.e("DXGrowingTextInputViewWidgetNode", "show");
                DXGrowingTextInputViewWidgetNode.access$postMyEvent(this.this$0, new DxCustemDataEvent(3900591102591836612L));
                return;
            }
            Logger.e("DXGrowingTextInputViewWidgetNode", "hide");
            DXGrowingTextInputViewWidgetNode.access$postMyEvent(this.this$0, new DxCustemDataEvent(-403229045508524899L));
        } else {
            DXGrowingTextInputViewWidgetNode.access$setHasFilterFirstHideEvent$p(this.this$0, true);
        }
    }
}
