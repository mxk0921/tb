package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import tb.t5j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class m0r extends t5j.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f23700a = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                RemoteConfig.getInstance().updateRemoteConfig();
                n0r a2 = n0r.a();
                a2.i();
                a2.e();
                a2.g();
                a2.o();
                a2.c();
                a2.d();
                a2.l();
                a2.j();
                a2.k();
                a2.n();
                a2.m();
                a2.f();
                RemoteConfig.getInstance().updateGlobalParamsConfig();
                a2.h();
            } catch (Exception e) {
                TBSdkLog.e("mtopsdk.SwitchConfigListener", "[onConfigUpdate] parse SdkSwitchConfigBroadcast error.", e);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(m0r m0rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/config/baseswitch/SwitchConfigListener");
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (this.f23700a.compareAndSet(false, true)) {
            RemoteConfig.getInstance().loadLocalConfig(context);
            n0r a2 = n0r.a();
            a2.o();
            a2.c();
            a2.d();
            a2.l();
            a2.j();
            a2.k();
            a2.n();
            a2.m();
            a2.f();
            a2.h();
        }
    }

    @Override // tb.t5j.a, tb.z8l
    public void onConfigUpdate(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            return;
        }
        TBSdkLog.LogEnable logEnable = TBSdkLog.LogEnable.InfoEnable;
        if (TBSdkLog.isLogEnable(logEnable)) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("[onConfigUpdate] groupName=");
            sb.append(str);
            sb.append(",fromCache=");
            sb.append(z);
            TBSdkLog.i("mtopsdk.SwitchConfigListener", sb.toString());
        }
        MtopSDKThreadPoolExecutorFactory.submit(new a());
        if (TBSdkLog.isLogEnable(logEnable)) {
            TBSdkLog.i("mtopsdk.SwitchConfigListener", "[onConfigUpdate]submit parseSdkSwitchConfigBroadcast task to ThreadPool");
        }
    }
}
