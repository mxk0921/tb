package com.taobao.android.nav;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.nav.jump.JumpAbility;
import com.taobao.tao.InitNav;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import tb.enj;
import tb.gzm;
import tb.hzm;
import tb.jzm;
import tb.poj;
import tb.qoj;
import tb.roj;
import tb.sxf;
import tb.t2o;
import tb.ueu;
import tb.y09;
import tb.zmj;
import tb.zxf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Nav {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EXTRA_INTENT_FILTER_LABEL = "INTENT_FILTER_LABEL";
    public static final String KExtraReferrer = "referrer";
    public static final String NAV_START_ACTIVITY_TIME = "NAV_START_ACTIVITY_TIME";
    public static final String NAV_START_ACTIVITY_UPTIME = "NAV_START_ACTIVITY_UPTIME";
    public static final String NAV_TO_URL_START_TIME = "NAV_TO_URL_START_TIME";
    public static final String NAV_TO_URL_START_UPTIME = "NAV_TO_URL_START_UPTIME";
    private static final String TAG = "Nav";
    private static final h sDefaultResolver;
    private static int[] sDefaultTransition;
    private static e sExceptionHandler;
    private static volatile h sNavResolver;
    @Deprecated
    private static int[] sTempTransition;
    private final Context mContext;
    private final Intent mIntent;
    private final zmj mNavContext;
    private final String mSessionId;
    private static i sNavMonitor = null;
    private static jzm sProcessorMonitor = null;
    private static boolean sUseWelcome = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class EscapeResolveInfo extends ResolveInfo {
        static {
            t2o.a(578814035);
        }

        @Override // android.content.pm.ResolveInfo
        public String toString() {
            return "EscapeResolveInfo";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class NavHookIntent extends Intent {
        static {
            t2o.a(578814038);
        }

        private NavHookIntent() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class NavigationCanceledException extends Exception {
        private static final long serialVersionUID = 5015146091187397488L;

        static {
            t2o.a(578814043);
        }

        public NavigationCanceledException(String str) {
            super(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void onResult(boolean z, Intent intent);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(578814034);
            t2o.a(578814042);
        }

        public c() {
        }

        @Override // com.taobao.android.nav.Nav.h
        public ResolveInfo a(PackageManager packageManager, Intent intent, int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ResolveInfo) ipChange.ipc$dispatch("2d1306dd", new Object[]{this, packageManager, intent, new Integer(i), new Boolean(z)});
            }
            return packageManager.resolveActivity(intent, i);
        }

        @Override // com.taobao.android.nav.Nav.h
        public List<ResolveInfo> b(PackageManager packageManager, Intent intent, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("a4749067", new Object[]{this, packageManager, intent, new Integer(i)});
            }
            return packageManager.queryIntentActivities(intent, i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface d {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface e {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface f {
        public static final int NAVHOOKER_HIGH_PRIORITY = 3;
        public static final int NAVHOOKER_LAST_PRORITY = 0;
        public static final int NAVHOOKER_LOW_PRIORITY = 1;
        public static final int NAVHOOKER_NORMAL_PRIORITY = 2;
        public static final int NAVHOOKER_STICKMAX_PRIORITY = 4;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface g {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface h {
        ResolveInfo a(PackageManager packageManager, Intent intent, int i, boolean z);

        List<ResolveInfo> b(PackageManager packageManager, Intent intent, int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface i {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class j implements Comparable<j> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final ResolveInfo f9031a;
        private int b;
        private int c;

        static {
            t2o.a(578814046);
        }

        public j(ResolveInfo resolveInfo, int i, int i2) {
            this.f9031a = resolveInfo;
            this.b = i;
            this.c = i2;
        }

        public static /* synthetic */ ResolveInfo a(j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ResolveInfo) ipChange.ipc$dispatch("15a38b5d", new Object[]{jVar});
            }
            return jVar.f9031a;
        }

        /* renamed from: b */
        public int compareTo(j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2679f2ec", new Object[]{this, jVar})).intValue();
            }
            if (this == jVar) {
                return 0;
            }
            int i = jVar.b;
            int i2 = this.b;
            if (i != i2) {
                return i - i2;
            }
            int i3 = jVar.c;
            int i4 = this.c;
            if (i3 != i4) {
                return i3 - i4;
            }
            if (System.identityHashCode(this) < System.identityHashCode(jVar)) {
                return -1;
            }
            return 1;
        }
    }

    static {
        t2o.a(578814031);
        c cVar = new c();
        sDefaultResolver = cVar;
        sNavResolver = cVar;
    }

    private Nav(Context context) {
        this.mContext = context;
        this.mNavContext = new zmj(context);
        this.mIntent = new Intent("android.intent.action.VIEW");
        this.mSessionId = String.valueOf(System.currentTimeMillis());
        sTempTransition = null;
    }

    public static Nav from(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Nav) ipChange.ipc$dispatch("fb9e170a", new Object[]{context}) : new Nav(context);
    }

    public static jzm getProcessorMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzm) ipChange.ipc$dispatch("4e81b82f", new Object[0]);
        }
        return sProcessorMonitor;
    }

    public static boolean hasWelcome() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9aaeff3", new Object[0])).booleanValue();
        }
        return sUseWelcome;
    }

    public static void initSwitch(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9eeb3d", new Object[]{context});
        } else {
            poj.b(context);
        }
    }

    private boolean isDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[]{this})).booleanValue();
        }
        if ((this.mContext.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    private void jump(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f94aa72", new Object[]{this, intent});
        } else if (!tryJumpAbility(intent)) {
            if (this.mNavContext.i() >= 0) {
                int i2 = this.mNavContext.i();
                Fragment e2 = this.mNavContext.e();
                if (e2 != null) {
                    e2.startActivityForResult(intent, i2, this.mNavContext.g());
                } else {
                    Context context = this.mContext;
                    if (context instanceof Activity) {
                        ((Activity) context).startActivityForResult(intent, i2, this.mNavContext.g());
                    } else {
                        context.startActivity(intent, this.mNavContext.g());
                    }
                }
            } else {
                if (!(this.mContext instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                this.mContext.startActivity(intent, this.mNavContext.g());
            }
            dealWithTransition();
        }
    }

    public static ResolveInfo optimum(Context context, List<ResolveInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResolveInfo) ipChange.ipc$dispatch("500f30e4", new Object[]{context, list});
        }
        if (context == null || list == null) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : list) {
            if (!TextUtils.isEmpty(resolveInfo.activityInfo.packageName)) {
                if (resolveInfo.activityInfo.packageName.endsWith(context.getPackageName())) {
                    arrayList.add(new j(resolveInfo, resolveInfo.priority, 1));
                } else {
                    String str = resolveInfo.activityInfo.packageName;
                    String packageName = context.getPackageName();
                    String[] split = str.split("\\.");
                    String[] split2 = packageName.split("\\.");
                    if (split.length >= 2 && split2.length >= 2 && split[0].equals(split2[0]) && split[1].equals(split2[1])) {
                        arrayList.add(new j(resolveInfo, resolveInfo.priority, 0));
                    }
                }
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ResolveInfo a2 = j.a((j) arrayList.get(0));
        arrayList.clear();
        return a2;
    }

    public static void registerAfterProcessor(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e251236", new Object[]{dVar});
        }
    }

    @Deprecated
    public static void registerHooker(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3229676", new Object[]{fVar});
        }
    }

    @Deprecated
    public static void registerLastPreprocessor(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("374c438c", new Object[]{gVar});
        }
    }

    public static void registerNavMonitor(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93fead17", new Object[]{iVar});
        } else {
            sNavMonitor = iVar;
        }
    }

    @Deprecated
    public static void registerPreprocessor(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1507eb56", new Object[]{gVar});
        }
    }

    @Deprecated
    public static void registerPriorHooker(f fVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cfe1889", new Object[]{fVar, new Integer(i2)});
        }
    }

    @Deprecated
    public static void registerStickPreprocessor(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2202f160", new Object[]{gVar});
        }
    }

    private void resolveAndQueryActivity(Intent intent) throws ActivityNotFoundException, SecurityException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e5cceb0", new Object[]{this, intent});
            return;
        }
        String h2 = this.mNavContext.h();
        String c2 = this.mNavContext.c();
        if (h2 == null || c2 == null) {
            long currentTimeMillis = System.currentTimeMillis();
            ResolveInfo a2 = sNavResolver.a(this.mContext.getPackageManager(), intent, 65536, this.mNavContext.j());
            jzm jzmVar = sProcessorMonitor;
            if (jzmVar != null) {
                jzmVar.e(this.mContext, "resolveActivity", System.currentTimeMillis() - currentTimeMillis);
            }
            if (a2 == null) {
                long currentTimeMillis2 = System.currentTimeMillis();
                List<ResolveInfo> b2 = sNavResolver.b(this.mContext.getPackageManager(), intent, 65536);
                jzm jzmVar2 = sProcessorMonitor;
                if (jzmVar2 != null) {
                    jzmVar2.e(this.mContext, "queryIntentActivities", System.currentTimeMillis() - currentTimeMillis2);
                }
                ResolveInfo optimum = optimum(getContext(), b2);
                if (optimum != null) {
                    int i2 = optimum.labelRes;
                    if (i2 != 0) {
                        intent.putExtra(EXTRA_INTENT_FILTER_LABEL, i2);
                    }
                    ActivityInfo activityInfo = optimum.activityInfo;
                    intent.setClassName(activityInfo.packageName, activityInfo.name);
                    return;
                }
                throw new ActivityNotFoundException("No Activity found to handle " + intent);
            } else if (!(a2 instanceof EscapeResolveInfo)) {
                int i3 = a2.labelRes;
                if (i3 != 0) {
                    intent.putExtra(EXTRA_INTENT_FILTER_LABEL, i3);
                }
                String str = a2.activityInfo.targetActivity;
                if (!TextUtils.isEmpty(str)) {
                    intent.putExtra(enj.EXTRA_INTENT_TARGET_ACTIVITY, str);
                }
                ActivityInfo activityInfo2 = a2.activityInfo;
                intent.setClassName(activityInfo2.packageName, activityInfo2.name);
            }
        } else {
            intent.setClassName(h2, c2);
        }
    }

    public static void setExceptionHandler(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fffa3c15", new Object[]{eVar});
        }
    }

    public static void setGlobalTransition(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0fded81", new Object[]{new Integer(i2), new Integer(i3)});
        } else {
            sDefaultTransition = new int[]{i2, i3};
        }
    }

    public static void setNavResolver(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d98f534", new Object[]{hVar});
        } else {
            sNavResolver = hVar;
        }
    }

    public static void setProcessorMonitor(jzm jzmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645f84c9", new Object[]{jzmVar});
        } else {
            sProcessorMonitor = jzmVar;
        }
    }

    @Deprecated
    public static void setTransition(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b551353e", new Object[]{new Integer(i2), new Integer(i3)});
        } else if (poj.c()) {
            sTempTransition = new int[]{i2, i3};
        } else {
            sDefaultTransition = new int[]{i2, i3};
        }
    }

    private void startActivities(Intent[] intentArr, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4238c638", new Object[]{this, intentArr, bundle});
        } else {
            this.mContext.startActivities(intentArr, bundle);
        }
    }

    private Intent toNew(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("5ad94318", new Object[]{this, uri});
        }
        this.mIntent.setData(uri);
        if (this.mNavContext.m()) {
            return this.mIntent;
        }
        gzm a2 = hzm.a(0);
        if (a2 != null && !a2.e((Intent) this.mIntent.clone()).b(this.mNavContext)) {
            return null;
        }
        gzm a3 = hzm.a(1);
        if (a3 != null && !a3.e(this.mIntent).f(this.mSessionId).b(this.mNavContext)) {
            return null;
        }
        gzm a4 = hzm.a(2);
        if (a4 == null || this.mNavContext.p() || a4.e(this.mIntent).f(this.mSessionId).b(this.mNavContext)) {
            return this.mIntent;
        }
        return null;
    }

    private boolean toUriNew(Uri uri, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5aff326f", new Object[]{this, uri, bVar})).booleanValue() : toUriNew(uri, bVar, false);
    }

    private boolean tryJumpAbility(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23be3829", new Object[]{this, intent})).booleanValue();
        }
        JumpAbility a2 = sxf.b().a(this.mNavContext.f());
        if (a2 == null) {
            return false;
        }
        return a2.a(new zxf(intent, this.mNavContext));
    }

    public static void unregisterAfterProcessor(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae42fcf", new Object[]{dVar});
        }
    }

    @Deprecated
    public static void unregisterPreprocessor(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49fbd6f", new Object[]{gVar});
        }
    }

    @Deprecated
    public static void unregisterStickPreprocessor(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d2786e7", new Object[]{gVar});
        }
    }

    public static void useWelcome(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a245f832", new Object[]{new Boolean(z)});
        } else {
            sUseWelcome = z;
        }
    }

    public Nav allowEscape() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("be7c93d0", new Object[]{this});
        }
        this.mNavContext.q(true);
        return this;
    }

    public Nav allowLoopback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("c496e7c6", new Object[]{this});
        }
        this.mNavContext.t(false);
        return this;
    }

    public Nav disableTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("54b3783d", new Object[]{this});
        }
        this.mNavContext.s(true);
        return this;
    }

    public Nav disallowLoopback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("308e4f54", new Object[]{this});
        }
        this.mNavContext.t(true);
        return this;
    }

    public Nav forResult(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("9332848b", new Object[]{this, new Integer(i2)});
        }
        if (this.mContext instanceof Activity) {
            this.mNavContext.y(i2);
            return this;
        }
        throw new IllegalStateException("Only valid from Activity, but from " + this.mContext);
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.mContext;
    }

    public Intent intentForUri(roj rojVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("97a1c900", new Object[]{this, rojVar});
        }
        throw null;
    }

    public boolean isForesultSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b76585d", new Object[]{this})).booleanValue();
        }
        if (this.mNavContext.i() >= 0) {
            return true;
        }
        return false;
    }

    public Nav skipAllProcessors() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("c53b0a77", new Object[]{this});
        }
        this.mNavContext.z(true);
        return this;
    }

    public boolean toUri(roj rojVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98dbbe25", new Object[]{this, rojVar})).booleanValue();
        }
        throw null;
    }

    public boolean toUriSimple(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("24c17181", new Object[]{this, uri})).booleanValue() : toUriNew(uri, null, true);
    }

    public Nav witJumpAbility(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("b66a3556", new Object[]{this, str});
        }
        this.mNavContext.v(str);
        return this;
    }

    public Nav withAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("ef504ed4", new Object[]{this, str});
        }
        this.mIntent.setAction(str);
        return this;
    }

    public Nav withCategory(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("9eb3ea8c", new Object[]{this, str});
        }
        this.mIntent.addCategory(str);
        return this;
    }

    public Nav withClassName(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("87879509", new Object[]{this, str, str2});
        }
        this.mNavContext.x(str);
        this.mNavContext.r(str2);
        return this;
    }

    public Nav withDisableTransition(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("b9687e0b", new Object[]{this, new Boolean(z)});
        }
        this.mNavContext.I(z);
        return this;
    }

    public Nav withExtras(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("4b0eb09d", new Object[]{this, bundle});
        }
        if (bundle == null) {
            return this;
        }
        this.mIntent.putExtras(bundle);
        return this;
    }

    public Nav withFlags(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("86ca6ba6", new Object[]{this, new Integer(i2)});
        }
        this.mIntent.addFlags(i2);
        return this;
    }

    public Nav withFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("be68224c", new Object[]{this, fragment});
        }
        this.mNavContext.u(fragment);
        return this;
    }

    public Nav withOptions(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("30b4eb0c", new Object[]{this, bundle});
        }
        Bundle g2 = this.mNavContext.g();
        if (g2 != null) {
            g2.putAll(bundle);
        } else {
            this.mNavContext.w(bundle);
        }
        return this;
    }

    public Nav withSharedElement(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("2b4a14c7", new Object[]{this, view});
        }
        this.mNavContext.H(view, true);
        return this;
    }

    public Nav withSourceViewDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("f6e18012", new Object[]{this, drawable});
        }
        this.mNavContext.D(drawable);
        return this;
    }

    public Nav withSourceViewLocation(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("a63fd331", new Object[]{this, view});
        }
        this.mNavContext.E(view);
        return this;
    }

    public Nav withTransition(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("3d09b83f", new Object[]{this, new Integer(i2), new Integer(i3)});
        }
        this.mNavContext.F(i2, i3);
        return this;
    }

    public Nav withTransitionParams(ueu ueuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("5f1574ed", new Object[]{this, ueuVar});
        }
        this.mNavContext.G(ueuVar);
        return this;
    }

    public static Nav from(zmj zmjVar, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Nav) ipChange.ipc$dispatch("8232fd7f", new Object[]{zmjVar, intent}) : new Nav(zmjVar, intent);
    }

    private Intent intentForUriNew(Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("e1f34d7e", new Object[]{this, uri, new Boolean(z)});
        }
        if (uri != null) {
            uri.toString();
        }
        Intent intent = toNew(uri);
        if (intent == null) {
            return null;
        }
        try {
            if (!this.mNavContext.j()) {
                intent.setPackage(this.mContext.getPackageName());
            }
            resolveAndQueryActivity(intent);
            return intent;
        } catch (ActivityNotFoundException e2) {
            if (isDebug()) {
                Context context = this.mContext;
                Toast.makeText(context, uri.toString() + " CANN'T FOUND RESOLVED ACTIVITY", 1).show();
            }
            TLog.loge(TAG, this.mSessionId, "uri is: ", uri.toString(), "; ActivityNotFoundException:", e2.toString());
            if (z) {
                throw e2;
            }
            return intent;
        } catch (SecurityException e3) {
            if (isDebug()) {
                Context context2 = this.mContext;
                Toast.makeText(context2, uri.toString() + "SecurityException", 1).show();
            }
            TLog.loge(TAG, this.mSessionId, "uri is: ", uri.toString(), "; ActivityNotFoundException:", e3.toString());
            if (z) {
                throw e3;
            }
            return intent;
        }
    }

    private boolean toUriNew(Uri uri, b bVar, boolean z) {
        String str;
        String str2;
        String str3;
        int i2;
        Intent d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e7cdcd", new Object[]{this, uri, bVar, new Boolean(z)})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        TLog.loge(TAG, this.mSessionId, "origin uri is: ", uri.toString());
        long uptimeMillis = SystemClock.uptimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        this.mIntent.putExtra(NAV_TO_URL_START_UPTIME, uptimeMillis);
        this.mIntent.putExtra("NAV_TO_URL_START_TIME", currentTimeMillis);
        if (sProcessorMonitor == null || uri.isOpaque()) {
            str2 = "; NullPointerException: ";
            str = " Loopback disallowed: ";
            str3 = null;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = "; NullPointerException: ";
            sb.append(uri.getHost());
            sb.append(uri.getPath());
            str3 = sb.toString();
            str = " Loopback disallowed: ";
            sProcessorMonitor.c(this.mContext, str3);
        }
        try {
            if (this.mContext == null) {
                TLog.loge(TAG, this.mSessionId, "origin uri is: ", uri.toString(), "; Nav context was null");
                i iVar = sNavMonitor;
                if (iVar == null) {
                    return false;
                }
                ((InitNav.e) iVar).a(this.mContext, uri.toString(), new Exception("Nav context was null!"), false);
                return false;
            }
            try {
                qoj.b("toUri " + uri);
                d2 = y09.d(uri, this.mIntent, this.mNavContext, z, sProcessorMonitor);
                if (d2 == null) {
                    d2 = intentForUriNew(uri, true);
                } else {
                    d2.setPackage(this.mContext.getPackageName());
                    resolveAndQueryActivity(d2);
                }
            } catch (ActivityNotFoundException e2) {
                i iVar2 = sNavMonitor;
                if (iVar2 != null) {
                    ((InitNav.e) iVar2).a(this.mContext, uri.toString(), e2, false);
                }
                TLog.loge(TAG, this.mSessionId, "origin uri:", uri.toString(), "; ActivityNotFound: ", e2.toString());
            } catch (NullPointerException e3) {
                i iVar3 = sNavMonitor;
                if (iVar3 != null) {
                    ((InitNav.e) iVar3).a(this.mContext, uri.toString(), e3, false);
                }
                String str4 = Build.BRAND;
                if ((!str4.equalsIgnoreCase("xiaomi") && !str4.equalsIgnoreCase(TBDeviceUtils.REDMI_MANUFACTURE_LOWER_CASE)) || !(29 == (i2 = Build.VERSION.SDK_INT) || 30 == i2)) {
                    throw e3;
                }
                String str5 = this.mSessionId;
                String uri2 = uri.toString();
                TLog.loge(TAG, str5, "origin uri: ", uri2, str2 + e3);
            } catch (SecurityException e4) {
                i iVar4 = sNavMonitor;
                if (iVar4 != null) {
                    ((InitNav.e) iVar4).a(this.mContext, uri.toString(), e4, false);
                }
                String str6 = this.mSessionId;
                String uri3 = uri.toString();
                TLog.loge(TAG, str6, "origin uri: ", uri3, "; SecurityException: " + e4.toString());
            }
            if (d2 == null) {
                i iVar5 = sNavMonitor;
                if (iVar5 != null) {
                    ((InitNav.e) iVar5).a(this.mContext, uri.toString(), new Exception("Intent resolve was null"), false);
                }
                TLog.loge(TAG, this.mSessionId, "origin uri is: ", uri.toString(), "; Intent resolve was null");
                qoj.a();
                return true;
            }
            if (!this.mNavContext.m()) {
                gzm a2 = hzm.a(4);
                if (a2 == null || a2.e(this.mIntent).f(this.mSessionId).b(this.mNavContext)) {
                    gzm a3 = hzm.a(5);
                    if (a3 != null && !a3.e((Intent) this.mIntent.clone()).b(this.mNavContext)) {
                        qoj.a();
                        return true;
                    }
                } else {
                    qoj.a();
                    return true;
                }
            }
            d2.putExtra(NAV_TO_URL_START_UPTIME, uptimeMillis);
            d2.putExtra("NAV_TO_URL_START_TIME", currentTimeMillis);
            ComponentName component = d2.getComponent();
            if (this.mNavContext.l()) {
                Context context = this.mContext;
                if ((context instanceof Activity) && component != null && component.equals(((Activity) context).getComponentName())) {
                    uri.toString();
                    if (bVar != null) {
                        bVar.onResult(false, d2);
                    }
                    String str7 = this.mSessionId;
                    String uri4 = uri.toString();
                    TLog.loge(TAG, str7, "origin uri is: ", uri4, str + uri);
                    qoj.a();
                    return false;
                }
            }
            long uptimeMillis2 = SystemClock.uptimeMillis();
            long currentTimeMillis2 = System.currentTimeMillis();
            d2.putExtra(NAV_START_ACTIVITY_UPTIME, uptimeMillis2);
            d2.putExtra("NAV_START_ACTIVITY_TIME", currentTimeMillis2);
            long j2 = currentTimeMillis2 - currentTimeMillis;
            TLog.loge(TAG, this.mSessionId, "nav cost:", String.valueOf(j2));
            jzm jzmVar = sProcessorMonitor;
            if (jzmVar != null) {
                jzmVar.e(this.mContext, "navCost", j2);
            }
            if (!this.mNavContext.o()) {
                Bundle a4 = this.mNavContext.a();
                if (a4 != null) {
                    d2.putExtra("nav_animation_extra", a4);
                }
                jump(d2);
            }
            jzm jzmVar2 = sProcessorMonitor;
            if (jzmVar2 != null) {
                jzmVar2.b(this.mContext, str3);
            }
            TLog.loge(TAG, this.mSessionId, "final intent is: ", intent2String(d2));
            qoj.a();
            return true;
        } catch (Throwable th) {
            qoj.a();
            throw th;
        }
    }

    public Intent intentForUri(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("17d4e823", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return intentForUri(Uri.parse(str));
    }

    public Nav skipPreprocess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("ce58978f", new Object[]{this});
        }
        this.mNavContext.C(true);
        return this;
    }

    public boolean toUri(roj rojVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30b5f25f", new Object[]{this, rojVar, bVar})).booleanValue();
        }
        throw null;
    }

    public boolean toUriSimple(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e464d458", new Object[]{this, str})).booleanValue() : toUriNew(Uri.parse(str), null, true);
    }

    public Nav withSharedElement(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("6ac3e6e7", new Object[]{this, view, new Boolean(z)});
        }
        this.mNavContext.H(view, z);
        return this;
    }

    private void dealWithTransition() {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f40bdf4e", new Object[]{this});
            return;
        }
        Context context = this.mContext;
        if (context instanceof Activity) {
            zmj zmjVar = this.mNavContext;
            if (zmjVar.q) {
                ((Activity) context).overridePendingTransition(0, 0);
                TLog.loge(TAG, this.mSessionId, "mWithoutTransition is true");
                return;
            }
            int[] iArr2 = sTempTransition;
            if (iArr2 != null) {
                ((Activity) context).overridePendingTransition(iArr2[0], iArr2[1]);
                sTempTransition = null;
                TLog.loge(TAG, this.mSessionId, " set transition with sTempTransition");
                return;
            }
            int[] iArr3 = zmjVar.p;
            if (iArr3 != null) {
                ((Activity) context).overridePendingTransition(iArr3[0], iArr3[1]);
                TLog.loge(TAG, this.mSessionId, " set transition with mTransition");
            } else if (!zmjVar.k() && (iArr = sDefaultTransition) != null) {
                ((Activity) this.mContext).overridePendingTransition(iArr[0], iArr[1]);
                TLog.loge(TAG, this.mSessionId, " set transition with sDefaultTransition");
            }
        }
    }

    private String intent2String(Intent intent) {
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63c71475", new Object[]{this, intent});
        }
        StringBuilder sb = new StringBuilder("Intent { ");
        String action = intent.getAction();
        if (action != null) {
            sb.append("act=");
            sb.append(action);
            z = false;
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("cat=[");
            for (String str : categories) {
                sb.append(str);
                sb.append(',');
            }
            sb.append("]");
            z = false;
        }
        Uri data = intent.getData();
        if (data != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("dat=");
            sb.append(data);
            z = false;
        }
        String type = intent.getType();
        if (type != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("typ=");
            sb.append(type);
            z = false;
        }
        int flags = intent.getFlags();
        if (flags != 0) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("flg=0x");
            sb.append(Integer.toHexString(flags));
            z = false;
        }
        String str2 = intent.getPackage();
        if (str2 != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("pkg=");
            sb.append(str2);
        } else {
            z2 = z;
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            if (!z2) {
                sb.append(' ');
            }
            sb.append("cmp=");
            sb.append(component.flattenToShortString());
        }
        sb.append(" }");
        return sb.toString();
    }

    public boolean toUri(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27e4e8c6", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return toUri(Uri.parse(str));
    }

    public Intent intentForUri(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("67c90492", new Object[]{this, uri}) : intentForUri(uri, false);
    }

    public Intent intentForUri(Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("87dac420", new Object[]{this, uri, new Boolean(z)});
        }
        if (uri != null) {
            uri.toString();
        }
        if (uri == null) {
            Log.e(TAG, "Nav uri was null");
            return null;
        } else if (this.mContext != null) {
            return intentForUriNew(uri, z);
        } else {
            Log.e(TAG, "Nav context was null");
            return null;
        }
    }

    public boolean toUri(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45f3885e", new Object[]{this, str, bVar})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return toUri(Uri.parse(str), bVar);
    }

    private Nav(zmj zmjVar, Intent intent) {
        this.mContext = zmjVar.d();
        this.mNavContext = zmjVar;
        this.mIntent = intent;
        this.mSessionId = String.valueOf(System.currentTimeMillis());
        sTempTransition = null;
    }

    public boolean toUri(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c3d61753", new Object[]{this, uri})).booleanValue() : toUri(uri, (b) null);
    }

    public boolean toUri(Uri uri, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f475df1", new Object[]{this, uri, bVar})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        return toUriNew(uri, bVar);
    }
}
