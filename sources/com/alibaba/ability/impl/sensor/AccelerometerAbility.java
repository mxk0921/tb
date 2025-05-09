package com.alibaba.ability.impl.sensor;

import android.content.Context;
import com.alibaba.ability.impl.sensor.listener.ShakeListener;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsAccelerometerAbility;
import com.taobao.android.abilityidl.ability.AccelerometerShakeRet;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.h40;
import tb.hbl;
import tb.jdb;
import tb.kdb;
import tb.rdb;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AccelerometerAbility extends AbsAccelerometerAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ShakeListener f2024a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a extends ShakeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ rdb o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rdb rdbVar, Context context, h40 h40Var, double d, int i, Context context2, String str, double d2, int i2, int i3, boolean z) {
            super(context2, str, d2, i2, i3, z);
            this.o = rdbVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/sensor/AccelerometerAbility$setShakeListener$1");
        }

        @Override // com.alibaba.ability.impl.sensor.listener.ShakeListener
        public void e(ShakeListener.Error error) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5daa30b0", new Object[]{this, error});
                return;
            }
            ckf.g(error, "error");
            this.o.O(new ErrorResult("ACCELEROMETER_NOT_AVAILABLE", "register shake listener fail", (Map) null, 4, (a07) null));
        }

        @Override // com.alibaba.ability.impl.sensor.listener.ShakeListener
        public void f(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e769f090", new Object[]{this, new Double(d)});
                return;
            }
            rdb rdbVar = this.o;
            AccelerometerShakeRet accelerometerShakeRet = new AccelerometerShakeRet();
            accelerometerShakeRet.result = Double.valueOf(d);
            xhv xhvVar = xhv.INSTANCE;
            rdbVar.U(accelerometerShakeRet);
        }
    }

    static {
        t2o.a(91226113);
    }

    public static /* synthetic */ Object ipc$super(AccelerometerAbility accelerometerAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/sensor/AccelerometerAbility");
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ShakeListener shakeListener = this.f2024a;
        if (shakeListener != null) {
            shakeListener.k();
        }
        this.f2024a = null;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAccelerometerAbility
    public void unsetShakeListener(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942a88e3", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(jdbVar, "callback");
        ShakeListener shakeListener = this.f2024a;
        if (shakeListener != null) {
            shakeListener.k();
        }
        this.f2024a = null;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAccelerometerAbility
    public void setShakeListener(kdb kdbVar, h40 h40Var, rdb rdbVar) {
        Float h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("513aa36e", new Object[]{this, kdbVar, h40Var, rdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(h40Var, "params");
        ckf.g(rdbVar, "events");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            double d = h40Var.b;
            Double valueOf = Double.valueOf(d);
            Integer num = null;
            if (d < 2) {
                valueOf = null;
            }
            double doubleValue = valueOf != null ? valueOf.doubleValue() : 2.0d;
            int i = h40Var.d;
            Integer valueOf2 = Integer.valueOf(i);
            if (i >= 3) {
                num = valueOf2;
            }
            int intValue = num != null ? num.intValue() : 3;
            ShakeListener shakeListener = this.f2024a;
            if (shakeListener != null) {
                shakeListener.k();
            }
            String str = h40Var.f20400a;
            ckf.f(str, "params.axis");
            a aVar = new a(rdbVar, context, h40Var, doubleValue, intValue, context, str, doubleValue - (hbl.h() != null ? h.floatValue() : 1.2f), h40Var.c, intValue, h40Var.e);
            aVar.j();
            xhv xhvVar = xhv.INSTANCE;
            this.f2024a = aVar;
            return;
        }
        rdbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
    }
}
