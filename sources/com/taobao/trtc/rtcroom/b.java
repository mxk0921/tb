package com.taobao.trtc.rtcroom;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.rtcroom.a;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f13962a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public a.f j;

    static {
        t2o.a(395313608);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("572a47ed", new Object[]{this});
        }
        return "{ serviceName: " + this.f13962a + ", appKey: " + this.b + ", userId: " + this.d + ", roomId: " + this.c + ", bizId: " + this.e + ", fps: " + this.f + ", resulution: " + this.g + ", enableCamera: " + this.h + ", mute: " + this.i + " }";
    }
}
