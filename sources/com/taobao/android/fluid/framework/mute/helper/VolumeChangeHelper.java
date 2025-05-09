package com.taobao.android.fluid.framework.mute.helper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.AsyncTask;
import com.alibaba.ability.impl.device.VolumeChangeListener;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ir9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class VolumeChangeHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int d = -1;

    /* renamed from: a  reason: collision with root package name */
    public BroadcastReceiver f7875a;
    public b b;
    public final Context c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
                VolumeChangeHelper.b(((AudioManager) VolumeChangeHelper.d(VolumeChangeHelper.this).getSystemService("audio")).getStreamVolume(3));
            } catch (Throwable th) {
                ir9.c("VolumeChangeHelper", "", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void a(int i, int i2);
    }

    static {
        t2o.a(468714582);
    }

    public VolumeChangeHelper(Context context) {
        if (context != null) {
            this.c = context;
        }
    }

    public static /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue();
        }
        return d;
    }

    public static /* synthetic */ int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1550b9d", new Object[]{new Integer(i)})).intValue();
        }
        d = i;
        return i;
    }

    public static /* synthetic */ b c(VolumeChangeHelper volumeChangeHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b2911cf2", new Object[]{volumeChangeHelper});
        }
        return volumeChangeHelper.b;
    }

    public static /* synthetic */ Context d(VolumeChangeHelper volumeChangeHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("1ab70a94", new Object[]{volumeChangeHelper});
        }
        return volumeChangeHelper.c;
    }

    public void e(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a90103fc", new Object[]{this, bVar});
        } else if (bVar != null && this.c != null) {
            this.b = bVar;
            this.f7875a = new BroadcastReceiver() { // from class: com.taobao.android.fluid.framework.mute.helper.VolumeChangeHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/mute/helper/VolumeChangeHelper$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent.getIntExtra(VolumeChangeListener.EXTRA_VOLUME_STREAM_TYPE, -1) == 3) {
                        int intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
                        if (intExtra != VolumeChangeHelper.a()) {
                            VolumeChangeHelper.c(VolumeChangeHelper.this).a(VolumeChangeHelper.a(), intExtra);
                        }
                        VolumeChangeHelper.b(intExtra);
                    }
                }
            };
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(VolumeChangeListener.VOLUME_CHANGED_ACTION);
                this.c.registerReceiver(this.f7875a, intentFilter);
            } catch (Throwable th) {
                ir9.c("VolumeChangeHelper", "", th);
            }
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new a());
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a88d3dc", new Object[]{this});
            return;
        }
        BroadcastReceiver broadcastReceiver = this.f7875a;
        if (broadcastReceiver != null) {
            try {
                this.c.unregisterReceiver(broadcastReceiver);
                this.f7875a = null;
            } catch (Throwable th) {
                ir9.c("VolumeChangeHelper", "", th);
            }
        }
    }
}
