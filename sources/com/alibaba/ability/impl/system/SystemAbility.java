package com.alibaba.ability.impl.system;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.app.NotificationManagerCompat;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.abilityidl.ability.AbsSystemAbility;
import com.taobao.android.abilityidl.ability.SystemNotificationStatusResult;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.d3k;
import tb.h1p;
import tb.hud;
import tb.iih;
import tb.j3r;
import tb.jdb;
import tb.kdb;
import tb.t2o;
import tb.tao;
import tb.tsq;
import tb.u2r;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class SystemAbility extends AbsSystemAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(135266307);
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
        public final /* synthetic */ Context f2052a;
        public final /* synthetic */ Intent b;
        public final /* synthetic */ jdb c;

        public b(Context context, Intent intent, jdb jdbVar) {
            this.f2052a = context;
            this.b = intent;
            this.c = jdbVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f2052a.startActivity(this.b);
            } catch (Exception e) {
                iih iihVar = iih.INSTANCE;
                iihVar.a("SystemAbility", "openAppSettings error: " + e);
                this.c.O(new ErrorResult(String.valueOf(e.getMessage()), (String) null, (Map) null, 6, (a07) null));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f2053a;
        public final /* synthetic */ String b;
        public final /* synthetic */ jdb c;

        public c(Context context, String str, jdb jdbVar) {
            this.f2053a = context;
            this.b = str;
            this.c = jdbVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Context context = this.f2053a;
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.addFlags(268435456);
                intent.setData(Uri.parse(this.b));
                xhv xhvVar = xhv.INSTANCE;
                context.startActivity(intent);
            } catch (Exception unused) {
                this.c.O(new ErrorResult("OPEN_BROWSER_ERROR", (String) null, (Map) null, 6, (a07) null));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f2054a;
        public final /* synthetic */ jdb b;

        public d(Context context, jdb jdbVar) {
            this.f2054a = context;
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
                Context context = this.f2054a;
                Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                intent.addFlags(268435456);
                xhv xhvVar = xhv.INSTANCE;
                context.startActivity(intent);
            } catch (Exception e) {
                iih iihVar = iih.INSTANCE;
                iihVar.a("SystemAbility", "openLocationSettings error: " + e);
                this.b.O(new ErrorResult(String.valueOf(e.getMessage()), (String) null, (Map) null, 6, (a07) null));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;
        public final /* synthetic */ jdb c;

        public e(Context context, jdb jdbVar) {
            this.b = context;
            this.c = jdbVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent.addFlags(268435456);
                    intent.putExtra("android.provider.extra.APP_PACKAGE", this.b.getPackageName());
                    this.b.startActivity(intent);
                    return;
                }
                Intent intent2 = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                intent2.addFlags(268435456);
                intent2.putExtra("app_package", this.b.getPackageName());
                ApplicationInfo applicationInfo = this.b.getApplicationInfo();
                intent2.putExtra("app_uid", applicationInfo != null ? Integer.valueOf(applicationInfo.uid) : null);
                this.b.startActivity(intent2);
            } catch (Exception e) {
                iih iihVar = iih.INSTANCE;
                iihVar.a("SystemAbility", "openNotificationSettings error: " + e);
                this.c.O(new ErrorResult(String.valueOf(e.getMessage()), (String) null, (Map) null, 6, (a07) null));
            }
        }
    }

    static {
        t2o.a(135266306);
    }

    public static final /* synthetic */ Intent access$getDefaultIntent(SystemAbility systemAbility, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("8fb9765a", new Object[]{systemAbility, context});
        }
        return systemAbility.b(context);
    }

    public static /* synthetic */ Object ipc$super(SystemAbility systemAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/system/SystemAbility");
    }

    public final boolean a(Context context) {
        boolean areNotificationsEnabled;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79168298", new Object[]{this, context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 26) {
            return NotificationManagerCompat.from(context).areNotificationsEnabled();
        }
        Object systemService = context.getSystemService(RemoteMessageConst.NOTIFICATION);
        if (systemService != null) {
            areNotificationsEnabled = ((NotificationManager) systemService).areNotificationsEnabled();
            return areNotificationsEnabled;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    public final Intent b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("f38105d9", new Object[]{this, context});
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        return intent;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSystemAbility
    public tao<Boolean, ErrorResult> isNFCReadingSupported(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("4aa418b9", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "abilityContext");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            return new tao<>(Boolean.valueOf(d3k.INSTANCE.c(context)), null, 2, null);
        }
        return new tao<>(null, ErrorResult.a.Companion.g("Context 为空"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSystemAbility
    public tao<Boolean, ErrorResult> isVoiceOverOn(kdb kdbVar) {
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("a1ea3d61", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "abilityContext");
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("Context 为空"));
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "accessibility_enabled") != 1) {
                z = false;
            }
            z2 = z;
        } catch (Exception unused) {
        }
        return new tao<>(Boolean.valueOf(z2), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSystemAbility
    public void openAppSettings(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8159ac", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(jdbVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            MegaUtils.A(new b(context, b(context), jdbVar), 0L, 2, null);
        } else {
            jdbVar.O(ErrorResult.a.Companion.g("Context 为空"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSystemAbility
    public void openLocationSettings(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4cb454", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(jdbVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            MegaUtils.A(new d(context, jdbVar), 0L, 2, null);
        } else {
            jdbVar.O(ErrorResult.a.Companion.g("Context 为空"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSystemAbility
    public void openNotificationSettings(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c39ba0a", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(jdbVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            MegaUtils.A(new e(context, jdbVar), 0L, 2, null);
        } else {
            jdbVar.O(ErrorResult.a.Companion.g("Context 为空"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSystemAbility
    public void requestNotificationSettings(kdb kdbVar, hud hudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8d30708", new Object[]{this, kdbVar, hudVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(hudVar, "events");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            SystemNotificationStatusResult systemNotificationStatusResult = new SystemNotificationStatusResult();
            try {
                if (a(context)) {
                    systemNotificationStatusResult.status = "AUTHORIZED";
                } else {
                    systemNotificationStatusResult.status = "DENIED";
                }
            } catch (Exception unused) {
                systemNotificationStatusResult.status = "UNKNOWN";
            }
            hudVar.J0(systemNotificationStatusResult);
            return;
        }
        hudVar.O(ErrorResult.a.Companion.g("Context 为空"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSystemAbility
    public tao<String, ErrorResult> checkLocation(kdb kdbVar) {
        String str;
        Object systemService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("be846e5f", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "abilityContext");
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("Context 为空"));
        }
        try {
            systemService = context.getSystemService("location");
        } catch (Throwable unused) {
            str = "unknown";
        }
        if (systemService != null) {
            if (((LocationManager) systemService).isProviderEnabled("gps")) {
                str = "enable";
            } else {
                str = "disable";
            }
            return new tao<>(str, null, 2, null);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSystemAbility
    public tao<String, ErrorResult> checkAppInstallStatus(kdb kdbVar, u2r u2rVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("891afb18", new Object[]{this, kdbVar, u2rVar});
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(u2rVar, "params");
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("Context 为空"));
        }
        String str2 = u2rVar.f29092a;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        if (str2 == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("参数不能为空 为空"));
        }
        try {
            if (context.getPackageManager().getPackageInfo(str2, 0) != null) {
                str = "install";
            } else {
                str = "uninstall";
            }
        } catch (Throwable unused) {
            str = "unknown";
        }
        return new tao<>(str, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSystemAbility
    public void openBrowser(kdb kdbVar, j3r j3rVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1154bbf6", new Object[]{this, kdbVar, j3rVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(j3rVar, "params");
        ckf.g(jdbVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            String str = j3rVar.f21744a;
            ckf.f(str, AdvanceSetting.NETWORK_TYPE);
            if (!tsq.I(str, h1p.HTTP_PREFIX, false, 2, null) && !tsq.I(str, h1p.HTTPS_PREFIX, false, 2, null)) {
                str = null;
            }
            if (str != null) {
                MegaUtils.A(new c(context, str, jdbVar), 0L, 2, null);
            } else {
                jdbVar.O(ErrorResult.a.Companion.g("url must start with https:// or http://"));
            }
        } else {
            jdbVar.O(ErrorResult.a.Companion.g("Context 为空"));
        }
    }
}
