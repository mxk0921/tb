package tb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.MtopResponse;
import tb.icu;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbbuy.impl.aspect.error.build")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class t7r extends us {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements icu.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f28550a;

        public a(t7r t7rVar, Context context) {
            this.f28550a = context;
        }

        @Override // tb.icu.d
        public void a(icu icuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d10d10ed", new Object[]{this, icuVar});
                return;
            }
            icuVar.f();
            hh.d(this.f28550a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements icu.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f28551a;
        public final /* synthetic */ y7n b;

        public b(t7r t7rVar, Context context, y7n y7nVar) {
            this.f28551a = context;
            this.b = y7nVar;
        }

        @Override // tb.icu.e
        public void a(icu icuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d10d10ed", new Object[]{this, icuVar});
                return;
            }
            icuVar.f();
            if (this.f28551a != null) {
                Bundle bundle = new Bundle();
                try {
                    bundle.putDouble(k5n.ACTIVITY_ADD_ADDRESS_AUTO_FILL_LAT, Double.parseDouble(this.b.i()));
                    bundle.putDouble(k5n.ACTIVITY_ADD_ADDRESS_AUTO_FILL_LON, Double.parseDouble(this.b.k()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                bundle.putString(k5n.ACTIVITY_ADD_ADDRESS_AUTO_FILL_POI_ID, this.b.l());
                bundle.putBoolean(k5n.ACTIVITY_ADD_ADDRESS_AUTO_FILL, true);
                qf0.b(this.f28551a, bundle, 71);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements icu.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f28552a;

        public c(t7r t7rVar, Context context) {
            this.f28552a = context;
        }

        @Override // tb.icu.d
        public void a(icu icuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d10d10ed", new Object[]{this, icuVar});
                return;
            }
            icuVar.f();
            hh.d(this.f28552a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements icu.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f28553a;
        public final /* synthetic */ y7n b;

        public d(t7r t7rVar, Context context, y7n y7nVar) {
            this.f28553a = context;
            this.b = y7nVar;
        }

        @Override // tb.icu.e
        public void a(icu icuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d10d10ed", new Object[]{this, icuVar});
                return;
            }
            icuVar.f();
            if (this.f28553a != null) {
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(this.b.a())) {
                    bundle.putString(k5n.ACTIVITY_DEFAULT_ADDRESS_ID_KEY, this.b.a());
                }
                if ("BIANLI".equals(this.b.j())) {
                    bundle.putInt(k5n.ACTIVITY_KEY_BIZ_TYPE, 2);
                }
                if ("D2D".equals(this.b.j())) {
                    bundle.putInt(k5n.ACTIVITY_KEY_BIZ_TYPE, 0);
                }
                if (this.b.o()) {
                    bundle.putInt(k5n.ACTIVITY_KEY_BIZ_TYPE, this.b.m());
                }
                if (!TextUtils.isEmpty(this.b.n())) {
                    bundle.putString(k5n.ACTIVITY_MANAGER_ADDRESS_STORE_ID, this.b.n());
                }
                if (!TextUtils.isEmpty(this.b.a())) {
                    bundle.putString(k5n.ACTIVITY_DEFAULT_ADDRESS_ID_KEY, this.b.a());
                }
                qf0.b(this.f28553a, bundle, 54);
            }
        }
    }

    static {
        t2o.a(708837484);
    }

    public static /* synthetic */ Object ipc$super(t7r t7rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/extension/aspect/TBBuyBuildOrderErrorExtension");
    }

    public final boolean J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ace63239", new Object[]{this})).booleanValue();
        }
        AtomicBoolean atomicBoolean = (AtomicBoolean) L().g("aliBuyPreload", AtomicBoolean.class);
        if (atomicBoolean == null || !atomicBoolean.get()) {
            return false;
        }
        return true;
    }

    public final void K0(Context context, String str, String str2, y7n y7nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5c45e67", new Object[]{this, context, str, str2, y7nVar});
            return;
        }
        icu icuVar = new icu(context);
        icuVar.v(k5n.NORMAL_WARNING_TITLE);
        icuVar.q(str);
        icuVar.n(str2);
        icuVar.r(new c(this, context));
        icuVar.s(new d(this, context, y7nVar));
        icuVar.x();
    }

    public final void L0(Context context, String str, String str2, y7n y7nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e51db6", new Object[]{this, context, str, str2, y7nVar});
            return;
        }
        icu icuVar = new icu(context);
        icuVar.v(k5n.NORMAL_WARNING_TITLE);
        icuVar.q(str);
        icuVar.n(str2);
        icuVar.r(new a(this, context));
        icuVar.s(new b(this, context, y7nVar));
        icuVar.x();
    }

    public final void M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bfa78bf", new Object[]{this});
            return;
        }
        j1i j1iVar = (j1i) B().get("aura_parse_global_data_parse", j1i.class);
        if (j1iVar != null) {
            jn b2 = j1iVar.b();
            j1iVar.d(jn.c("generalV2", b2.h(), b2.g(), b2.l(), b2.i(), b2.e(), b2.d(), b2.f()));
            B().update("aura_parse_global_data_parse", j1iVar);
        }
    }

    @Override // tb.wab
    public void b(mi miVar) {
        int i;
        String str;
        y7n y7nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            return;
        }
        miVar.b();
        if ("AURANextRPCServiceDomain".equals(miVar.c())) {
            String str2 = null;
            kk kkVar = (kk) fk.b(miVar.d(), "NextRPCRemoteResponse", kk.class, null);
            if (kkVar == null) {
                ck.g().b("TBBuyBuildOrderErrorExtension", "onError", "remoteResponse is null");
            } else if (!om0.b(L(), kkVar)) {
                String h = kkVar.h();
                String i2 = kkVar.i();
                MtopResponse e = kkVar.e();
                if (e != null) {
                    i = e.getResponseCode();
                    str2 = e.getMappingCode();
                    if (e.isNetworkError()) {
                        str = ds8.NETWORK_ERROR_MSG;
                    } else if (e.isApiLockedResult()) {
                        str = k5n.BUILD_DATA_PARSE_ERROR_MSG_NEW;
                    } else {
                        str = e.getRetMsg();
                    }
                } else {
                    i = 200;
                    str = i2;
                }
                g4o g4oVar = (g4o) L().g("aliBuyRequestHelper", g4o.class);
                if (g4oVar == null) {
                    y7nVar = new y7n(new HashMap());
                } else {
                    y7nVar = g4oVar.h();
                }
                if (y7nVar == null) {
                    y7nVar = new y7n(new HashMap());
                    x().b(new mi(1, us.ERROR_DOMAIN, "emptyQueryKey", "queryKey为空"));
                }
                Context f = L().f();
                if (!"F-10000-00-15-002".equals(h)) {
                    if ("FAIL_SYS_SESSION_EXPIRED".equals(h)) {
                        hh.d(f);
                    } else if (k5n.NEW_NO_ADDRESS_ERROR_CODE.equals(h) || k5n.NO_ADDRESS_RET_CODE.equals(h)) {
                        i2 = gf0.TO_SET_ADDRESS_ERROR_MSG;
                        qf0.a(f, str);
                    } else if (k5n.MTOP_BIZ_USER_ADDRESS_IS_NOT_FULL.equals(h)) {
                        i2 = k5n.NORMAL_WARNING_TITLE;
                        L0(f, str, !TextUtils.isEmpty(str2) ? str2 : h, y7nVar);
                    } else if (k5n.MTOP_BIZ_USER_ADDRESS_IS_FULL.equals(h)) {
                        i2 = k5n.NORMAL_WARNING_TITLE;
                        K0(f, str, !TextUtils.isEmpty(str2) ? str2 : h, y7nVar);
                    } else if (i == 419) {
                        i2 = k5n.BUILD_ORDER_WARNING_TITLE_NEW;
                        hh.d(f);
                    } else {
                        String str3 = TextUtils.isEmpty(str2) ? h : str2;
                        if ("FAIL_SYS_UNIT_PROTECT".equals(h)) {
                            i2 = k5n.FAIL_SYS_UNIT_PROTECT_TIP;
                        } else {
                            i2 = k5n.BUILD_ORDER_WARNING_TITLE_NEW;
                        }
                        boolean J0 = J0();
                        if (J0) {
                            M0();
                        }
                        m0(f, e, i2, str3, str, J0, true);
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str2 = h;
                    }
                    z9r.b(str2, i2);
                    x().b(new mi(1, us.ERROR_DOMAIN, h, i2));
                }
            }
        }
    }
}
