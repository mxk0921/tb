package com.taobao.android.behavir.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.bhxbridge.BHXCXXBaseBridge;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.List;
import tb.f82;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PopStateMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile boolean b = false;
    public static final PopStateMonitor c = new PopStateMonitor();

    /* renamed from: a  reason: collision with root package name */
    public List<Runnable> f6443a = new ArrayList(8);

    static {
        t2o.a(404750424);
    }

    public PopStateMonitor() {
        LocalBroadcastManager.getInstance(f82.d()).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.behavir.util.PopStateMonitor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/util/PopStateMonitor$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else {
                    PopStateMonitor.this.d();
                }
            }
        }, new IntentFilter(PopLayer.ACTION_BROADCAST_ACTION_FIRST_PAGE_READY));
    }

    public static PopStateMonitor a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopStateMonitor) ipChange.ipc$dispatch("2ed1e9be", new Object[0]);
        }
        return c;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9275196f", new Object[]{this})).booleanValue();
        }
        return b;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddd81a3c", new Object[]{this});
            return;
        }
        if (!BHXCXXBaseBridge.checkCXXLib()) {
            UtUtils.e("UCP", UtUtils.g(), TLogTracker.SCENE_EXCEPTION, "PopStateMonitor", "soNotLoad", "");
        }
        b = true;
        NativeBroadcast.sendMessageFromJava(PopLayer.ACTION_BROADCAST_ACTION_FIRST_PAGE_READY, null, null);
        if (this.f6443a != null) {
            synchronized (PopStateMonitor.class) {
                List<Runnable> list = this.f6443a;
                this.f6443a = null;
                for (Runnable runnable : list) {
                    if (runnable != null) {
                        try {
                            runnable.run();
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }
}
