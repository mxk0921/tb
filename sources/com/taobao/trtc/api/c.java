package com.taobao.trtc.api;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.impl.TrtcEngineImpl;
import com.taobao.trtc.utils.TrtcLog;
import tb.amu;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f13894a;

    static {
        t2o.a(395313447);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b58ee47c", new Object[0])).booleanValue();
        }
        boolean n = amu.h().n();
        TrtcLog.j("TrtcEngine", "RemoteSo checkIsReady: " + n);
        return n;
    }

    public static c c(Context context) throws TrtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("1d5fe48d", new Object[]{context});
        }
        return new TrtcEngineImpl(context);
    }

    public abstract void a(String str, String str2, String str3);

    public abstract String d(String str);

    public abstract ITrtcInputStream e(String str, TrtcStreamConfig trtcStreamConfig, ITrtcInputStream.a aVar);

    public abstract ITrtcOutputStream f(String str);

    public abstract TrtcAudioDevice g();

    public abstract TrtcVideoDevice h();

    public abstract boolean i(TrtcConfig trtcConfig) throws TrtcException;

    public abstract void j(TrtcDefines.g gVar);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, int i);

    public abstract void m(TrtcDefines.m mVar);

    public abstract void n(String str);

    public abstract void o(String str);

    public abstract void p() throws TrtcException;

    public abstract void q() throws TrtcException;

    public abstract void r(TrtcDefines.g gVar);
}
