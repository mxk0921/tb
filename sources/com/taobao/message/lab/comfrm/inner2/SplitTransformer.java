package com.taobao.message.lab.comfrm.inner2;

import com.taobao.message.lab.comfrm.core.Action;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface SplitTransformer {
    List<SplitPart> transform(Action action, SharedState sharedState, Diff diff, Object obj);
}
