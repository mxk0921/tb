package com.alibaba.ut.abtest.track;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TrackId {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String abTrackId;

    static {
        t2o.a(961544432);
    }

    public String getAbTrackId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("efc748aa", new Object[]{this});
        }
        return this.abTrackId;
    }

    public void setAbTrackId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b5f8874", new Object[]{this, str});
        } else {
            this.abTrackId = str;
        }
    }
}
