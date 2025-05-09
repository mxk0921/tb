package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class jrr extends u1<uhc> implements uhc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final njg f22176a = a.a(LazyThreadSafetyMode.NONE, new d1a() { // from class: tb.irr
        @Override // tb.d1a
        public final Object invoke() {
            bal W;
            W = jrr.W();
            return W;
        }
    });

    static {
        t2o.a(1002438772);
        t2o.a(1002438816);
    }

    public jrr(asb asbVar) {
        super(asbVar);
    }

    public static final bal W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bal) ipChange.ipc$dispatch("afc1cc92", new Object[0]);
        }
        return bal.Companion.a();
    }

    public static /* synthetic */ Object ipc$super(jrr jrrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceimp/TBOrangeService");
    }

    @Override // tb.zrb
    public ewe B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewe) ipChange.ipc$dispatch("cc717fdf", new Object[]{this});
        }
        return ewe.Companion.n();
    }

    @Override // tb.uhc
    public String F(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5f588a", new Object[]{this, str, str2});
        }
        ckf.g(str, "group");
        ckf.g(str2, "key");
        String a2 = h8l.INSTANCE.a(str, str2);
        if (a2 == null || a2.length() == 0) {
            return null;
        }
        return a2;
    }

    @Override // tb.uhc
    public boolean I(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f0d246b", new Object[]{this, str, str2, new Boolean(z)})).booleanValue();
        }
        ckf.g(str, "group");
        ckf.g(str2, "key");
        String F = F(str, str2);
        iqu iquVar = iqu.INSTANCE;
        Boolean valueOf = Boolean.valueOf(z);
        Object obj = null;
        if (F != null) {
            wyf b = dun.b(Boolean.class);
            if (ckf.b(b, dun.b(Integer.TYPE))) {
                obj = ssq.m(F.toString());
            } else if (ckf.b(b, dun.b(Boolean.TYPE))) {
                obj = Boolean.valueOf(iquVar.a(F.toString()));
            } else if (ckf.b(b, dun.b(Double.TYPE))) {
                obj = rsq.k(F.toString());
            } else if (ckf.b(b, dun.b(Float.TYPE))) {
                obj = rsq.l(F.toString());
            } else if (ckf.b(b, dun.b(Long.TYPE))) {
                obj = ssq.o(F.toString());
            } else if (ckf.b(b, dun.b(String.class))) {
                obj = F.toString();
            }
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            valueOf = bool;
        }
        return valueOf.booleanValue();
    }

    @Override // tb.uhc
    public String b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a22a2b4", new Object[]{this, str, str2, str3});
        }
        ckf.g(str, "group");
        ckf.g(str2, "key");
        ckf.g(str3, "default");
        String F = F(str, str2);
        if (F == null) {
            return str3;
        }
        return F;
    }

    @Override // tb.uhc
    public boolean getBoolean(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        ckf.g(str, "key");
        return I(vhc.b(this), str, z);
    }

    @Override // tb.uhc
    public int getInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{this, str, new Integer(i)})).intValue();
        }
        ckf.g(str, "key");
        return o(vhc.b(this), str, i);
    }

    @Override // tb.uhc
    public int o(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72ed8fa2", new Object[]{this, str, str2, new Integer(i)})).intValue();
        }
        ckf.g(str, "group");
        ckf.g(str2, "key");
        String F = F(str, str2);
        iqu iquVar = iqu.INSTANCE;
        Integer valueOf = Integer.valueOf(i);
        Object obj = null;
        if (F != null) {
            wyf b = dun.b(Integer.class);
            if (ckf.b(b, dun.b(Integer.TYPE))) {
                obj = ssq.m(F.toString());
            } else if (ckf.b(b, dun.b(Boolean.TYPE))) {
                obj = Boolean.valueOf(iquVar.a(F.toString()));
            } else if (ckf.b(b, dun.b(Double.TYPE))) {
                obj = rsq.k(F.toString());
            } else if (ckf.b(b, dun.b(Float.TYPE))) {
                obj = rsq.l(F.toString());
            } else if (ckf.b(b, dun.b(Long.TYPE))) {
                obj = ssq.o(F.toString());
            } else if (ckf.b(b, dun.b(String.class))) {
                obj = F.toString();
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            valueOf = num;
        }
        return valueOf.intValue();
    }
}
