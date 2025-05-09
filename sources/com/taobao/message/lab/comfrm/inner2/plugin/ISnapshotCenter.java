package com.taobao.message.lab.comfrm.inner2.plugin;

import com.taobao.message.lab.comfrm.inner2.Snapshot;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ISnapshotCenter {
    Snapshot getSnapshot(String str);

    Snapshot getSnapshot(String str, String str2);

    void putSnapshot(String str, Snapshot snapshot);

    void putSnapshot(String str, String str2, Snapshot snapshot);
}
