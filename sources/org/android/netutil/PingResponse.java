package org.android.netutil;

import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class PingResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private PingEntry[] results;
    private String localIPStr = null;
    private String lastHopIPStr = null;
    private int errcode = 0;
    private int successCnt = 0;
    private PingTaskWatcher watcher = null;

    public PingResponse(int i) {
        this.results = null;
        this.results = new PingEntry[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.results[i2] = new PingEntry();
        }
    }

    public void appendEntry(int i, int i2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c991a57f", new Object[]{this, new Integer(i), new Integer(i2), new Double(d)});
            return;
        }
        this.results[i].initWith(i, i2, d);
        if (d >= vu3.b.GEO_NOT_SUPPORT) {
            this.successCnt++;
        }
        PingTaskWatcher pingTaskWatcher = this.watcher;
        if (pingTaskWatcher != null) {
            pingTaskWatcher.OnEntry(i, i2, d);
        }
    }

    public int getErrcode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33700f16", new Object[]{this})).intValue();
        }
        return this.errcode;
    }

    public String getLastHopIPStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98f18d0c", new Object[]{this});
        }
        return this.lastHopIPStr;
    }

    public String getLocalIPStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2ebef24", new Object[]{this});
        }
        return this.localIPStr;
    }

    public PingEntry[] getResults() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PingEntry[]) ipChange.ipc$dispatch("883b5a56", new Object[]{this});
        }
        return this.results;
    }

    public int getSuccessCnt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("358cd4d6", new Object[]{this})).intValue();
        }
        return this.successCnt;
    }

    public void registerWatcher(PingTaskWatcher pingTaskWatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6d0797", new Object[]{this, pingTaskWatcher});
        } else {
            this.watcher = pingTaskWatcher;
        }
    }

    public void setEndWithErrcode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686d14e9", new Object[]{this, new Integer(i)});
            return;
        }
        this.errcode = i;
        PingTaskWatcher pingTaskWatcher = this.watcher;
        if (pingTaskWatcher == null) {
            return;
        }
        if (i == 0) {
            pingTaskWatcher.OnFinished();
        } else {
            pingTaskWatcher.OnFailed(i);
        }
    }

    public void setLastHopIPStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15de88ea", new Object[]{this, str});
        } else {
            this.lastHopIPStr = str;
        }
    }

    public void setLocalIPStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("317b7cd2", new Object[]{this, str});
        } else {
            this.localIPStr = str;
        }
    }
}
