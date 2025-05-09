package com.network.diagnosis;

import android.content.Context;
import anet.channel.util.ALog;
import anetwork.channel.config.NetworkConfigCenter;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.toolchain.WVNetworkDiagnosisPlugin;
import com.network.diagnosis.toolchain.WVNetworkQualityPlugin;
import com.taobao.uikit.extend.component.TBErrorView;
import tb.a8e;
import tb.ewc;
import tb.ocp;
import tb.pod;
import tb.qxn;
import tb.z4j;
import tb.zuv;
import tb.zzc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NetworkDiagnosisCenter implements zzc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f5926a = false;

    @Override // tb.zzc
    public pod a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pod) ipChange.ipc$dispatch("80c6b5f2", new Object[]{this});
        }
        return ocp.d();
    }

    @Override // tb.zzc
    public ewc b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewc) ipChange.ipc$dispatch("1623b312", new Object[]{this});
        }
        return z4j.n();
    }

    @Override // tb.zzc
    public a8e c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a8e) ipChange.ipc$dispatch("7ab8e1b2", new Object[]{this});
        }
        return zuv.b();
    }

    @Override // tb.zzc
    public void initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
        } else if (!this.f5926a) {
            synchronized (this) {
                try {
                    if (this.f5926a) {
                        ALog.e("NPM.NetworkDiagnosisCenter", "already initialize.", null, new Object[0]);
                        return;
                    }
                    ALog.e("NPM.NetworkDiagnosisCenter", "initialize", null, new Object[0]);
                    WVNetworkDiagnosisPlugin.register();
                    WVNetworkQualityPlugin.register();
                    qxn.d(context);
                    zuv.b().d(context);
                    try {
                        TBErrorView.setNetworkDiagnosisEnable(NetworkConfigCenter.isNetworkDiagnosisOpened());
                    } catch (Exception e) {
                        ALog.e("NPM.NetworkDiagnosisCenter", "init TBErrorView error", null, e, new Object[0]);
                    }
                    this.f5926a = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
