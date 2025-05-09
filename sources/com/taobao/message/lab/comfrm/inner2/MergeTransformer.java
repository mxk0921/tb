package com.taobao.message.lab.comfrm.inner2;

import com.taobao.message.lab.comfrm.core.Action;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface MergeTransformer {
    SharedState transform(Action action, SharedState sharedState, List<ItemState> list);
}
