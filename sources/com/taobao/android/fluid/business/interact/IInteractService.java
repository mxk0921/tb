package com.taobao.android.fluid.business.interact;

import com.taobao.android.fluid.core.FluidService;
import tb.sv2;
import tb.v7c;
import tb.yao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IInteractService extends FluidService {
    void addFollowStateChangeListener(v7c v7cVar);

    void cancelFollow(String str, String str2, String str3, sv2<yao> sv2Var);

    void follow(String str, String str2, String str3, sv2<yao> sv2Var);

    void removeFollowStateChangeListener(v7c v7cVar);
}
