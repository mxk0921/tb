package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.service.build.W;
import com.alibaba.security.client.smart.core.core.remote.OnRemoteSoLoadListener;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class W {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2573a = "BaseNativeManager";
    public static final String b = "lrc_core";
    public static final String c = "cro_python_kit";
    public static C1150ca d;

    public W() {
        d = new C1150ca();
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : d.a("cro_python_kit");
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : d.a(b);
    }

    public void a(final OnRemoteSoLoadListener onRemoteSoLoadListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac56d11", new Object[]{this, onRemoteSoLoadListener});
        } else {
            d.a("cro_python_kit", new OnRemoteSoLoadListener() { // from class: tb.ktz
                @Override // com.alibaba.security.client.smart.core.core.remote.OnRemoteSoLoadListener
                public final void onResult(String str, boolean z, String str2) {
                    W.this.a(onRemoteSoLoadListener, str, z, str2);
                }
            });
        }
    }

    public void b(final OnRemoteSoLoadListener onRemoteSoLoadListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b8d2f0", new Object[]{this, onRemoteSoLoadListener});
        } else {
            d.a(b, new OnRemoteSoLoadListener() { // from class: tb.jtz
                @Override // com.alibaba.security.client.smart.core.core.remote.OnRemoteSoLoadListener
                public final void onResult(String str, boolean z, String str2) {
                    W.this.b(onRemoteSoLoadListener, str, z, str2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(OnRemoteSoLoadListener onRemoteSoLoadListener, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a180c723", new Object[]{this, onRemoteSoLoadListener, str, new Boolean(z), str2});
            return;
        }
        if (!z) {
            Logging.w(f2573a, "load cro_python_kit so fail: " + str2);
            a(str, str2);
        } else {
            Logging.d(f2573a, "load cro_python_kit so success");
        }
        onRemoteSoLoadListener.onResult(str, z, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(OnRemoteSoLoadListener onRemoteSoLoadListener, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2ef0a4", new Object[]{this, onRemoteSoLoadListener, str, new Boolean(z), str2});
            return;
        }
        if (!z) {
            Logging.w(f2573a, "load wukong so fail: " + str2);
            a(str, str2);
        } else {
            Logging.d(f2573a, "load wukong so success");
        }
        onRemoteSoLoadListener.onResult(str, z, str2);
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            TrackManager.track(TrackLog.newBuilder().setPhase("error").setOperation("error").addParam("subModule", str).addParam("errorMsg", str2).build());
        }
    }
}
