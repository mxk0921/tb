package com.taobao.taolive.sdk.monitor.bean;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.HashMap;
import java.util.List;
import tb.qvc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LiveAPMBean implements INetDataObject {
    public PerformanceData dataDelay1s;
    public PerformanceData dataDelay5s;
    public PerformanceData endPerformanceData;
    public HashMap<String, String> extParams;
    public boolean isColdStart;
    public boolean isEnd;
    public boolean isWholeSession;
    public qvc.a monitorListener;
    public String originSessionId;
    public float refreshRate;
    public List<SceneData> sceneDataList;
    public long startSessionTime;
    public PerformanceData totalPerformanceData;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class PerformanceData implements INetDataObject {
        public long allFrameNums;
        public long costTime;
        public String cpu;
        public long currentTime;
        public long f0_t1;
        public long fps = -1;
        public long frameNums100_150;
        public long frameNums100_300;
        public long frameNums150_300;
        public long frameNums300_500;
        public long frameNums500_700;
        public long frameNumsNormal_100;
        public long freezeFrameNums;
        public long ft1_t2;
        public long ft2_x;
        public long hitchTotal;
        public String memory;
        public long seriousFrames;
        public long startTime;
        public long stuckFrames;

        static {
            t2o.a(806356360);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class SceneData implements INetDataObject {
        public PerformanceData performanceData;
        public String scenePoint;

        static {
            t2o.a(806356361);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(806356359);
        t2o.a(806355930);
    }
}
