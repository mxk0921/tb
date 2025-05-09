package com.taobao.mediaplay.model;

import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MediaLiveWarmupConfig implements Serializable {
    public static final int MEDIA_DECODER_WARMUP_LEVEL_BUFFER = 2;
    public static final int MEDIA_DECODER_WARMUP_LEVEL_SETUP = 1;
    public int mWarmupLevel = 1;
    public boolean mWarmupFlag = true;

    static {
        t2o.a(774897777);
    }
}
