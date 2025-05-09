package tb;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.tbelder.TBElder;
import com.taobao.tao.Globals;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class anj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(478151026);
        }

        public a() {
        }

        @JvmStatic
        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f4e0938b", new Object[]{this})).booleanValue();
            }
            return TBElder.b();
        }

        @JvmStatic
        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a6a02bc1", new Object[]{this})).booleanValue();
            }
            return Localization.o();
        }

        @JvmStatic
        public final void c(BroadcastReceiver broadcastReceiver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("389b3b75", new Object[]{this, broadcastReceiver});
                return;
            }
            ckf.g(broadcastReceiver, bmi.KEY_RECEIVER);
            LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(broadcastReceiver, new IntentFilter("taobao.action.ACTION_REVISION_SWITCH_CHANGE"));
        }

        @JvmStatic
        public final void d(Localization.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("999c4842", new Object[]{this, aVar});
                return;
            }
            ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
            Localization.a(aVar);
        }

        @JvmStatic
        public final void e(BroadcastReceiver broadcastReceiver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2402bfce", new Object[]{this, broadcastReceiver});
                return;
            }
            ckf.g(broadcastReceiver, bmi.KEY_RECEIVER);
            LocalBroadcastManager.getInstance(Globals.getApplication()).unregisterReceiver(broadcastReceiver);
        }

        @JvmStatic
        public final void f(Localization.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25f4289b", new Object[]{this, aVar});
                return;
            }
            ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
            Localization.s(aVar);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(478151025);
    }

    @JvmStatic
    public static final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4e0938b", new Object[0])).booleanValue();
        }
        return Companion.a();
    }

    @JvmStatic
    public static final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6a02bc1", new Object[0])).booleanValue();
        }
        return Companion.b();
    }
}
