package com.taobao.message.sp.category;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chat.component.chatinput.view.KeyBoardPanelSwitch;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.inner2.Container;
import com.taobao.message.sp.category.transformer.UpdateDownloadProgressTransformer;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "progress", "Ltb/xhv;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SimpleMessageTabHostV2$downloadBundle$3 extends Lambda implements g1a<Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ SimpleMessageTabHostV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleMessageTabHostV2$downloadBundle$3(SimpleMessageTabHostV2 simpleMessageTabHostV2) {
        super(1);
        this.this$0 = simpleMessageTabHostV2;
    }

    public static /* synthetic */ Object ipc$super(SimpleMessageTabHostV2$downloadBundle$3 simpleMessageTabHostV2$downloadBundle$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/sp/category/SimpleMessageTabHostV2$downloadBundle$3");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num) {
        invoke(num.intValue());
        return xhv.INSTANCE;
    }

    public final void invoke(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b945e4", new Object[]{this, new Integer(i)});
        } else if (!KeyBoardPanelSwitch.isFastDoubleClick(500)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("progress", Integer.valueOf(i));
            linkedHashMap.put("complete", Boolean.FALSE);
            Event build = new Event.Build(UpdateDownloadProgressTransformer.NAME).data(linkedHashMap).build();
            Container access$getMContainer$p = SimpleMessageTabHostV2.access$getMContainer$p(this.this$0);
            if (access$getMContainer$p != null) {
                access$getMContainer$p.postEvent(build);
            }
        }
    }
}
