package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.kernel.serviceinterface.KSDeviceType;
import com.taobao.nanocompose.megability.ability.DeviceType;
import com.taobao.nanocompose.megability.ability.d;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class kbr extends u1<ohc> implements ohc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final njg f22548a;
    public final njg b;

    static {
        t2o.a(1002438759);
        t2o.a(1002438797);
    }

    public kbr(asb asbVar) {
        super(asbVar);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f22548a = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.ibr
            @Override // tb.d1a
            public final Object invoke() {
                com.taobao.nanocompose.megability.ability.a X;
                X = kbr.X();
                return X;
            }
        });
        this.b = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.jbr
            @Override // tb.d1a
            public final Object invoke() {
                d Y;
                Y = kbr.Y();
                return Y;
            }
        });
    }

    public static final com.taobao.nanocompose.megability.ability.a X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.nanocompose.megability.ability.a) ipChange.ipc$dispatch("d5ed9eea", new Object[0]);
        }
        return com.taobao.nanocompose.megability.ability.a.Companion.a();
    }

    public static final d Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("7809675d", new Object[0]);
        }
        return d.Companion.a();
    }

    public static /* synthetic */ Object ipc$super(kbr kbrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceimp/TBDeviceService");
    }

    @Override // tb.zrb
    public ewe B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewe) ipChange.ipc$dispatch("cc717fdf", new Object[]{this});
        }
        return ewe.Companion.e();
    }

    @Override // tb.ohc
    public KSDeviceType getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSDeviceType) ipChange.ipc$dispatch("88e8d543", new Object[]{this});
        }
        DeviceType b = com.taobao.nanocompose.megability.ability.a.Companion.b();
        if (b != null) {
            return KSDeviceType.Companion.a(b.getRawValue());
        }
        return null;
    }
}
