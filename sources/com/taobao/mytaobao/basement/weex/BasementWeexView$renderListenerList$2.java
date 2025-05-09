package com.taobao.mytaobao.basement.weex;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.npc;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ltb/npc;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class BasementWeexView$renderListenerList$2 extends Lambda implements d1a<List<npc>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BasementWeexView$renderListenerList$2 INSTANCE = new BasementWeexView$renderListenerList$2();

    public BasementWeexView$renderListenerList$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(BasementWeexView$renderListenerList$2 basementWeexView$renderListenerList$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/basement/weex/BasementWeexView$renderListenerList$2");
    }

    @Override // tb.d1a
    public final List<npc> invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4c3f8768", new Object[]{this}) : new ArrayList();
    }
}
