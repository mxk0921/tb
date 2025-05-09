package com.alibaba.analytics;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AnalyticsService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IAnalytics f2110a = null;

    static {
        t2o.a(962592798);
    }

    public static /* synthetic */ Object ipc$super(AnalyticsService analyticsService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 1270686685) {
            super.onLowMemory();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/analytics/AnalyticsService");
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        if (this.f2110a == null) {
            this.f2110a = new AnalyticsImp(getApplication());
        }
        return (IBinder) this.f2110a;
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        IAnalytics iAnalytics = this.f2110a;
        if (iAnalytics != null) {
            try {
                iAnalytics.triggerUpload();
            } catch (RemoteException unused) {
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        IAnalytics iAnalytics = this.f2110a;
        if (iAnalytics != null) {
            try {
                iAnalytics.triggerUpload();
            } catch (RemoteException unused) {
            }
        }
        super.onLowMemory();
    }
}
