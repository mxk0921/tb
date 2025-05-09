package com.taobao.taolive.sdk.model.message;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.FansLevelCondition;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class RewardDetailMsg implements INetDataObject {
    public ArrayList<FansLevelCondition> condition;
    public String presentingHierarchy;
    public String scopeId;
    public String subScope;
    public String taskId;

    static {
        t2o.a(806356335);
        t2o.a(806355930);
    }
}
