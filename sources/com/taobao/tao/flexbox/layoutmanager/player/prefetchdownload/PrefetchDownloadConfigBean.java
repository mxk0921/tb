package com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload;

import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class PrefetchDownloadConfigBean implements Serializable {
    public String enable;
    public Integer size;
    public List<TimeRange> timeRanges;
    public int pbid = 99999;
    public boolean enableOpti = false;
    public float limitDeviceScore = -1.0f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class TimeRange implements Serializable {
        public Long end;
        public Long start;

        static {
            t2o.a(502268304);
        }
    }

    static {
        t2o.a(502268303);
    }
}
