package com.alibaba.ability.impl.app;

import android.content.Context;
import android.content.Intent;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsAppAbility;
import com.taobao.android.abilityidl.ability.AppGetInfoResult;
import java.util.Map;
import tb.a07;
import tb.cjf;
import tb.ckf;
import tb.iih;
import tb.jdb;
import tb.jgb;
import tb.kdb;
import tb.sm8;
import tb.t2o;
import tb.tao;
import tb.xhv;
import tb.ywo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AppAbility extends AbsAppAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(96468994);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f1899a;
        public final /* synthetic */ jdb b;

        public b(Context context, jdb jdbVar) {
            this.f1899a = context;
            this.b = jdbVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Context context = this.f1899a;
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addFlags(268435456);
                intent.addCategory("android.intent.category.HOME");
                xhv xhvVar = xhv.INSTANCE;
                context.startActivity(intent);
            } catch (Exception e) {
                iih.INSTANCE.a("AppAbility", "suspend error: ".concat(sm8.b(e)));
                this.b.O(new ErrorResult(String.valueOf(e.getMessage()), (String) null, (Map) null, 6, (a07) null));
            }
        }
    }

    static {
        t2o.a(96468993);
    }

    public static /* synthetic */ Object ipc$super(AppAbility appAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/app/AppAbility");
    }

    public final String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e616e24c", new Object[]{this, context});
        }
        String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        ckf.f(str, "info.versionName");
        return str;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppAbility
    public tao<Double, ErrorResult> getBottomBarHeight(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("ca7f3cc3", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "abilityContext");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            return new tao<>(Double.valueOf(ywo.a(context, 48.0f)), null, 2, null);
        }
        return new tao<>(null, ErrorResult.a.Companion.g("Context 为空"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppAbility
    public tao<String, ErrorResult> getEnv(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("c2125645", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "abilityContext");
        return new tao<>(b(), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppAbility
    public tao<AppGetInfoResult, ErrorResult> getInfo(kdb kdbVar) {
        String str;
        String str2;
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("d13bc338", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "abilityContext");
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("Context 为空"));
        }
        AppGetInfoResult appGetInfoResult = new AppGetInfoResult();
        appGetInfoResult.version = a(context);
        cjf cjfVar = cjf.INSTANCE;
        jgb a2 = cjfVar.a();
        if (a2 != null) {
            str = a2.getUTDID();
        } else {
            str = null;
        }
        appGetInfoResult.utdid = str;
        jgb a3 = cjfVar.a();
        if (a3 != null) {
            str2 = a3.getTTID();
        } else {
            str2 = null;
        }
        appGetInfoResult.ttid = str2;
        jgb a4 = cjfVar.a();
        if (a4 != null) {
            bool = Boolean.valueOf(a4.isForeground());
        } else {
            bool = null;
        }
        appGetInfoResult.isForeground = bool;
        appGetInfoResult.navBarHeight = Double.valueOf(ywo.a(context, 44.0f));
        appGetInfoResult.bottomBarHeight = Double.valueOf(ywo.a(context, 48.0f));
        appGetInfoResult.targetSDKVersion = Integer.valueOf(context.getApplicationInfo().targetSdkVersion);
        appGetInfoResult.env = b();
        xhv xhvVar = xhv.INSTANCE;
        return new tao<>(appGetInfoResult, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppAbility
    public tao<Double, ErrorResult> getNavBarHeight(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("8a9fd58f", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "abilityContext");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            return new tao<>(Double.valueOf(ywo.a(context, 44.0f)), null, 2, null);
        }
        return new tao<>(null, ErrorResult.a.Companion.g("Context 为空"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppAbility
    public tao<String, ErrorResult> getTTID(kdb kdbVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("8fe87ccb", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "abilityContext");
        jgb a2 = cjf.INSTANCE.a();
        if (a2 != null) {
            str = a2.getTTID();
        } else {
            str = null;
        }
        return new tao<>(str, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppAbility
    public tao<String, ErrorResult> getUTDID(kdb kdbVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("a0d543d2", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "abilityContext");
        jgb a2 = cjf.INSTANCE.a();
        if (a2 != null) {
            str = a2.getUTDID();
        } else {
            str = null;
        }
        return new tao<>(str, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppAbility
    public tao<String, ErrorResult> getVersion(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("ddf6fbfa", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "abilityContext");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            return new tao<>(a(context), null, 2, null);
        }
        return new tao<>(null, ErrorResult.a.Companion.g("Context 为空"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppAbility
    public tao<Boolean, ErrorResult> isForeground(kdb kdbVar) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("c1cde32f", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "abilityContext");
        jgb a2 = cjf.INSTANCE.a();
        if (a2 != null) {
            bool = Boolean.valueOf(a2.isForeground());
        } else {
            bool = null;
        }
        return new tao<>(bool, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAppAbility
    public void suspend(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e2bfae", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(jdbVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            MegaUtils.A(new b(context, jdbVar), 0L, 2, null);
        } else {
            jdbVar.O(ErrorResult.a.Companion.g("Context 为空"));
        }
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9be0d23c", new Object[]{this});
        }
        jgb a2 = cjf.INSTANCE.a();
        if (a2 == null) {
            return "daily";
        }
        int appEnv = a2.getAppEnv();
        if (appEnv == 0) {
            return "release";
        }
        if (appEnv != 1) {
            return "daily";
        }
        return "pre";
    }
}
