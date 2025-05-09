package com.taobao.android.fluid.business.intelligence;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.tmall.android.dai.DAI;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ief;
import tb.ir9;
import tb.o6d;
import tb.t2o;
import tb.vrp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SmartMobileBroadcastHandler implements o6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String[] i = {"g2_dynamic_rec_boradcast"};
    public final FluidContext c;
    public IMessageService d;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f7675a = new AtomicBoolean(false);
    public final HashMap<String, Integer> b = new HashMap<>();
    public Boolean e = Boolean.FALSE;
    public Boolean f = Boolean.TRUE;
    public int g = 1000;
    public final BroadcastReceiver h = new BroadcastReceiver() { // from class: com.taobao.android.fluid.business.intelligence.SmartMobileBroadcastHandler.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/intelligence/SmartMobileBroadcastHandler$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            try {
                a.d a2 = SmartMobileBroadcastHandler.a(SmartMobileBroadcastHandler.this);
                if (!(a2 == null || (f = a2.f()) == null)) {
                    if (!SmartMobileBroadcastHandler.b(SmartMobileBroadcastHandler.this).containsKey(f)) {
                        SmartMobileBroadcastHandler.b(SmartMobileBroadcastHandler.this).put(f, 1);
                    } else if (((Integer) SmartMobileBroadcastHandler.b(SmartMobileBroadcastHandler.this).get(f)).intValue() < SmartMobileBroadcastHandler.j(SmartMobileBroadcastHandler.this)) {
                        SmartMobileBroadcastHandler.b(SmartMobileBroadcastHandler.this).put(f, Integer.valueOf(((Integer) SmartMobileBroadcastHandler.b(SmartMobileBroadcastHandler.this).get(f)).intValue() + 1));
                    } else {
                        return;
                    }
                }
                String stringExtra = intent.getStringExtra("com.tmall.android.dai.intent.extra.MODEL_NAME");
                if (stringExtra != null) {
                    ir9.b("SmartMobileBroadcastHandler", "接收到广播".concat(stringExtra));
                    if (stringExtra.hashCode() == 1096405756 && stringExtra.equals("g2_dynamic_rec")) {
                        HashMap hashMap = new HashMap();
                        Serializable serializableExtra = intent.getSerializableExtra("com.tmall.android.dai.intent.extra.OUTPUT_DATA");
                        if (serializableExtra != null) {
                            hashMap.put("bxClientSignal", serializableExtra);
                        }
                        hashMap.put("triggerFromModel", Boolean.TRUE);
                        if (a2 != null && SmartMobileBroadcastHandler.k(SmartMobileBroadcastHandler.this) != null) {
                            SmartMobileBroadcastHandler.k(SmartMobileBroadcastHandler.this).sendMessage(new vrp("VSMSG_positiveFeedBack", a2.c, hashMap));
                            return;
                        }
                        return;
                    }
                    ir9.b("SmartMobileBroadcastHandler", stringExtra.concat("模型的广播未处理"));
                    return;
                }
                ir9.b("SmartMobileBroadcastHandler", "空广播");
            } catch (Exception e) {
                ir9.b("SmartMobileBroadcastHandler", e.getMessage());
            }
        }
    };

    static {
        t2o.a(468713516);
        t2o.a(468714445);
    }

    public SmartMobileBroadcastHandler(FluidContext fluidContext) {
        this.c = fluidContext;
    }

    public static /* synthetic */ a.d a(SmartMobileBroadcastHandler smartMobileBroadcastHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.d) ipChange.ipc$dispatch("30424d15", new Object[]{smartMobileBroadcastHandler});
        }
        return smartMobileBroadcastHandler.l();
    }

    public static /* synthetic */ HashMap b(SmartMobileBroadcastHandler smartMobileBroadcastHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("af73a96f", new Object[]{smartMobileBroadcastHandler});
        }
        return smartMobileBroadcastHandler.b;
    }

    public static /* synthetic */ int j(SmartMobileBroadcastHandler smartMobileBroadcastHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81e178c0", new Object[]{smartMobileBroadcastHandler})).intValue();
        }
        return smartMobileBroadcastHandler.g;
    }

    public static /* synthetic */ IMessageService k(SmartMobileBroadcastHandler smartMobileBroadcastHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMessageService) ipChange.ipc$dispatch("ed36a63", new Object[]{smartMobileBroadcastHandler});
        }
        return smartMobileBroadcastHandler.d;
    }

    public final a.d l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.d) ipChange.ipc$dispatch("6b07fa98", new Object[]{this});
        }
        a currentMediaSetData = ((IDataService) this.c.getService(IDataService.class)).getCurrentMediaSetData();
        if (currentMediaSetData == null) {
            return null;
        }
        return currentMediaSetData.e();
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee46371b", new Object[]{this});
            return;
        }
        this.d = (IMessageService) this.c.getService(IMessageService.class);
        if (!this.e.booleanValue()) {
            this.f = Boolean.valueOf(ief.d());
            this.g = ief.g();
            this.e = Boolean.TRUE;
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
            return;
        }
        this.d = null;
        ir9.a("SmartMobileBroadcastHandler", "onDestroy");
    }

    @Override // tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            n();
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
            return;
        }
        o();
        m();
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

    public void m() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee6943e", new Object[]{this});
            return;
        }
        ir9.a("SmartMobileBroadcastHandler", "registerSmartMobileReceiver");
        if (this.f.booleanValue()) {
            try {
                this.b.clear();
                if (this.f7675a.compareAndSet(false, true)) {
                    IntentFilter intentFilter = new IntentFilter(DAI.ACTION_COMPUTE_COMPLETE);
                    for (String str : i) {
                        intentFilter.addDataScheme("DAI_" + str);
                    }
                    intentFilter.addDataSchemeSpecificPart("com.tmall.android.dai", 0);
                    this.c.getContext().registerReceiver(this.h, intentFilter);
                    ir9.a("SmartMobileBroadcastHandler", "registerSmartMobileReceiverDone");
                }
            } catch (Throwable th) {
                ir9.b("SmartMobileBroadcastHandler", "注册端智能广播:" + th.getMessage());
            }
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f73af285", new Object[]{this});
            return;
        }
        ir9.a("SmartMobileBroadcastHandler", "unregisterSmartMobileReceiver");
        if (this.f.booleanValue()) {
            try {
                if (this.f7675a.compareAndSet(true, false)) {
                    this.c.getContext().unregisterReceiver(this.h);
                    ir9.a("SmartMobileBroadcastHandler", "unregisterSmartMobileReceiverDone");
                }
            } catch (Throwable th) {
                ir9.b("SmartMobileBroadcastHandler", "解注册:" + th.getMessage());
            }
        }
    }
}
