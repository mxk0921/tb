package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.wukong.pipe.SyncPipeConfig;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface yb {
    SyncPipeConfig getSyncPipeConfig(List<String> list);

    void registerPipe(Ab ab, List<String> list);

    void resetPipeData(Ab ab);

    void unregisterPipe(Ab ab);

    boolean writeRiskData(Ab ab, String str);
}
