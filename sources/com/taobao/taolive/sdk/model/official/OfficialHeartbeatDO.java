package com.taobao.taolive.sdk.model.official;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class OfficialHeartbeatDO implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public HeartBeatConfig heartBeatConfig;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class HeartBeatConfig implements INetDataObject {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final long DEFAULT_INTERVAL = 15000;
        public long interval;

        static {
            t2o.a(806356352);
            t2o.a(806355930);
        }

        public HeartBeatConfig() {
        }

        public long getInterval() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("34e1136", new Object[]{this})).longValue();
            }
            long j = this.interval;
            if (j <= 0) {
                return 15000L;
            }
            return j * 1000;
        }
    }

    static {
        t2o.a(806356351);
        t2o.a(806355930);
    }

    public HeartBeatConfig getHeartBeatConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HeartBeatConfig) ipChange.ipc$dispatch("9ebc5c1f", new Object[]{this});
        }
        return this.heartBeatConfig;
    }

    public void setHeartBeatConfig(HeartBeatConfig heartBeatConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c87fd", new Object[]{this, heartBeatConfig});
        } else {
            this.heartBeatConfig = heartBeatConfig;
        }
    }
}
