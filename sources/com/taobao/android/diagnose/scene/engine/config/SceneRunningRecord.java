package com.taobao.android.diagnose.scene.engine.config;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SceneRunningRecord {
    public long sceneLastUpdateTime;
    public long tlogUploadLastTime = 0;
    public long tlogUploadFirstTime = 0;
    public int tlogUploadCount = 0;
    public Map<String, List<ActionsExecuteRecord>> rulesRecordList = new ConcurrentHashMap();

    static {
        t2o.a(615514198);
    }
}
