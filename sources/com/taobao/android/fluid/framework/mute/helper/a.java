package com.taobao.android.fluid.framework.mute.helper;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.mute.helper.VolumeChangeHelper;
import java.util.HashMap;
import tb.akt;
import tb.ir9;
import tb.o6d;
import tb.t2o;
import tb.vrp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a implements o6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f7878a;
    public final VolumeChangeHelper b;
    public VolumeChangeHelper.b c;
    public Handler d;
    public long e = 0;
    public long f = 0;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.fluid.framework.mute.helper.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class HandlerC0422a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public HandlerC0422a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(HandlerC0422a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/mute/helper/VolumeChangeForMuteHelper$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a.d e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) a.a(a.this).getService(IDataService.class)).getCurrentMediaSetData();
            if (currentMediaSetData != null && (e = currentMediaSetData.e()) != null) {
                HashMap hashMap = (HashMap) message.obj;
                a.b(a.this).removeCallbacksAndMessages(null);
                ((IMessageService) a.a(a.this).getService(IMessageService.class)).sendMessage(new vrp("VSMSG_volumeChanged", e.c, hashMap));
                ir9.b("VolumeChangeForMuteHelper", "成功发送了消息，内容为 = " + hashMap.get("old"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements VolumeChangeHelper.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.fluid.framework.mute.helper.VolumeChangeHelper.b
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11e28350", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            HashMap hashMap = new HashMap();
            Message obtain = Message.obtain();
            hashMap.put("old", Integer.valueOf(i));
            hashMap.put("new", Integer.valueOf(i2));
            a.k(a.this, System.currentTimeMillis());
            obtain.obj = hashMap;
            if (Math.abs(a.j(a.this) - a.l(a.this)) >= 200) {
                a.b(a.this).sendMessage(obtain);
                a.m(a.this, System.currentTimeMillis());
            }
        }
    }

    static {
        t2o.a(468714579);
        t2o.a(468714445);
    }

    public a(FluidContext fluidContext) {
        this.f7878a = fluidContext;
        ((ILifecycleService) fluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(this);
        if (akt.p2("ShortVideo.enableVolumeChangeObserver", true)) {
            this.b = new VolumeChangeHelper(fluidContext.getContext());
        }
    }

    public static /* synthetic */ FluidContext a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("6cc08b54", new Object[]{aVar});
        }
        return aVar.f7878a;
    }

    public static /* synthetic */ Handler b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("f63be831", new Object[]{aVar});
        }
        return aVar.d;
    }

    public static /* synthetic */ long j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c910166a", new Object[]{aVar})).longValue();
        }
        return aVar.f;
    }

    public static /* synthetic */ long k(a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14d9fac0", new Object[]{aVar, new Long(j)})).longValue();
        }
        aVar.f = j;
        return j;
    }

    public static /* synthetic */ long l(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9896c6b", new Object[]{aVar})).longValue();
        }
        return aVar.e;
    }

    public static /* synthetic */ long m(a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("438b64df", new Object[]{aVar, new Long(j)})).longValue();
        }
        aVar.e = j;
        return j;
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca75fdf1", new Object[]{this});
        } else if (this.b != null) {
            this.d = new HandlerC0422a(Looper.getMainLooper());
            this.c = new b();
            ir9.b("VolumeChangeForMuteHelper", "音频广播注册");
            this.b.e(this.c);
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        ir9.b("VolumeChangeForMuteHelper", "解注册的VolumeChangeForMuteHelper = " + this);
        VolumeChangeHelper volumeChangeHelper = this.b;
        if (volumeChangeHelper != null) {
            volumeChangeHelper.f();
        }
    }

    @Override // tb.o6d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            o();
        }
    }

    @Override // tb.o6d
    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            n();
        }
    }

    @Override // tb.o6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }
}
