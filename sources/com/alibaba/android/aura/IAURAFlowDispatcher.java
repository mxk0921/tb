package com.alibaba.android.aura;

import com.alibaba.android.aura.nodemodel.workflow.AURAFlowNodeModel;
import java.io.Serializable;
import tb.ek;
import tb.lo;
import tb.pt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IAURAFlowDispatcher {
    <DATA extends Serializable> void executeFlow(AURAFlowNodeModel aURAFlowNodeModel, DATA data, pt ptVar);

    String getIdentifier(String str, String str2);

    void onCreate(lo loVar, ek ekVar);

    void onDestroy();

    void preload(AURAFlowNodeModel aURAFlowNodeModel);

    void registerPluginCenter(IAURAPluginCenter... iAURAPluginCenterArr);

    void setCallback(pt ptVar);
}
