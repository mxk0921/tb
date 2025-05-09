package com.taobao.message.lab.comfrm.inner2.plugin;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.inner2.Snapshot;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SnapshotCenter implements ISnapshotCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, Snapshot> mSnapshotMap = new ConcurrentHashMap();

    static {
        t2o.a(537919726);
        t2o.a(537919725);
    }

    private String getKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ed510dc", new Object[]{this, str, str2});
        }
        return str + "_" + str2;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.plugin.ISnapshotCenter
    public Snapshot getSnapshot(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Snapshot) ipChange.ipc$dispatch("4ec3e837", new Object[]{this, str}) : getSnapshot(str, null);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.plugin.ISnapshotCenter
    public void putSnapshot(String str, Snapshot snapshot) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33027f8", new Object[]{this, str, snapshot});
        } else {
            putSnapshot(str, null, snapshot);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.plugin.ISnapshotCenter
    public Snapshot getSnapshot(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Snapshot) ipChange.ipc$dispatch("f1d4f3c1", new Object[]{this, str, str2}) : this.mSnapshotMap.get(getKey(str, str2));
    }

    @Override // com.taobao.message.lab.comfrm.inner2.plugin.ISnapshotCenter
    public void putSnapshot(String str, String str2, Snapshot snapshot) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e40c1ee", new Object[]{this, str, str2, snapshot});
        } else {
            this.mSnapshotMap.put(getKey(str, str2), snapshot);
        }
    }
}
