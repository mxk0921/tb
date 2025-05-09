package com.taobao.artc.api;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ArtcAttendee {
    public boolean audio;
    public String uid;
    public boolean video;

    static {
        t2o.a(395313169);
    }

    public ArtcAttendee(String str, boolean z, boolean z2) {
        this.uid = str;
        this.video = z;
        this.audio = z2;
    }
}
