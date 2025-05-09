package com.taobao.adaemon;

import android.app.Application;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.atools.Constants;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.hkq;
import tb.pxx;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TriggerInstrumentation extends Instrumentation {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = TriggerInstrumentation.class.getSimpleName();
    public static AtomicBoolean triggered = new AtomicBoolean();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Application f6133a;

        static {
            t2o.a(499122178);
        }

        public a(Application application) {
            this.f6133a = application;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
            } else {
                this.f6133a.unbindService(this);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            } else {
                this.f6133a.unbindService(this);
            }
        }
    }

    static {
        t2o.a(499122177);
    }

    public static /* synthetic */ Object ipc$super(TriggerInstrumentation triggerInstrumentation, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1263725205) {
            super.callApplicationOnCreate((Application) objArr[0]);
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/adaemon/TriggerInstrumentation");
        }
    }

    @Override // android.app.Instrumentation
    public void callApplicationOnCreate(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ad156b", new Object[]{this, application});
            return;
        }
        super.callApplicationOnCreate(application);
        pxx.f26392a.e(TAG, "callApplicationOnCreate", new Object[0]);
    }

    @Override // android.app.Instrumentation
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        pxx.f26392a.e(TAG, "onCreate", new Object[0]);
        triggered.set(true);
        hkq.b("keepalive", Constants.POINT_FULL_VERIFY, "instr", vu3.b.GEO_NOT_SUPPORT);
        if (bundle != null) {
            Intent intent = new Intent(getContext(), TriggerChannelService.class);
            intent.replaceExtras(bundle);
            getContext().getApplicationContext().bindService(intent, new a((Application) getContext().getApplicationContext()), 1);
        }
    }
}
