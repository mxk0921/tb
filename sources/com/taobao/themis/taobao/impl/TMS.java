package com.taobao.themis.taobao.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.NotificationCompat;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.nav.Nav;
import com.taobao.android.nav.jump.JumpAbility;
import com.taobao.taobao.R;
import com.taobao.themis.container.app.TMSActivity;
import com.taobao.themis.external.embed.CardPreviewActivity;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.manager.TMSInstanceManager;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.appinfo.AppInfoPrefetchJob;
import com.taobao.themis.kernel.metaInfo.appinfo.core.AppInfoStrategy;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifestManager;
import com.taobao.themis.kernel.metaInfo.manifest.storage.AppManifestDao;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.widget.group.WidgetPreviewActivity;
import com.ut.device.UTDevice;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.abs;
import tb.bbs;
import tb.ckf;
import tb.ges;
import tb.h8s;
import tb.ies;
import tb.n51;
import tb.nj7;
import tb.no8;
import tb.o9s;
import tb.p8s;
import tb.p9s;
import tb.q9s;
import tb.qxq;
import tb.r51;
import tb.t2o;
import tb.t8s;
import tb.u9h;
import tb.vbs;
import tb.vxm;
import tb.wsq;
import tb.xhv;
import tb.zgv;
import tb.zmj;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\nJ\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\nJ'\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010&J\u001f\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010,J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010&J\u001f\u0010.\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u0015¢\u0006\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/taobao/themis/taobao/impl/TMS;", "", "<init>", "()V", "Landroid/net/Uri;", NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "Landroid/content/Context;", "context", "Ltb/xhv;", "asyncExecuteDoPrefetch", "(Landroid/net/Uri;Landroid/content/Context;)V", "prefetchUniApp", "(Landroid/net/Uri;)V", "asyncExecuteSDK", "(Landroid/content/Context;)V", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Ltb/zmj;", "navContext", "Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "solutionType", "", "startApp", "(Landroid/content/Intent;Ltb/zmj;Lcom/taobao/themis/kernel/solution/TMSSolutionType;)Z", "type", "pauseTask", "(Lcom/taobao/themis/kernel/solution/TMSSolutionType;Landroid/content/Context;)V", "startClearCache", "startAppByTBFragment", "(Landroid/content/Intent;Ltb/zmj;)V", "startAppByActivity", "startAppByNavActivity", "(Landroid/net/Uri;Landroid/content/Intent;Ltb/zmj;)Z", "Landroid/app/Activity;", "activity", "moveKeepAliveActivityToFront", "(Landroid/app/Activity;)Z", "previewWidgetGroup", "(Landroid/net/Uri;Landroid/content/Context;)Z", "previewEmbed", "Landroid/app/Application;", "application", "Ltb/bbs;", "preCreateWeexInstance", "(Landroid/app/Application;Landroid/net/Uri;)Ltb/bbs;", "ssrPrerender", "prefetch", "(Landroid/net/Uri;Z)V", "", RPCDataItems.SWITCH_TAG_LOG, "Ljava/lang/String;", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMS {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final TMS INSTANCE = new TMS();
    private static final String TAG = "TMS";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(847249487);
            int[] iArr = new int[TMSSolutionType.values().length];
            iArr[TMSSolutionType.WEB_SINGLE_PAGE.ordinal()] = 1;
            iArr[TMSSolutionType.MIX.ordinal()] = 2;
            iArr[TMSSolutionType.MINIGAME.ordinal()] = 3;
            iArr[TMSSolutionType.WEEX.ordinal()] = 4;
            iArr[TMSSolutionType.WIDGET.ordinal()] = 5;
            iArr[TMSSolutionType.CLUSTER_WIDGET.ordinal()] = 6;
            iArr[TMSSolutionType.UNIAPP.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Uri f13768a;

        public b(Uri uri) {
            this.f13768a = uri;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TMS.access$prefetchUniApp(TMS.INSTANCE, this.f13768a);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f13769a;

        public c(Context context) {
            this.f13769a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBTMSSDK.initTBTMS(this.f13769a);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bbs f13770a;

        public d(bbs bbsVar) {
            this.f13770a = bbsVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f13770a.A0(null);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13771a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ TMSSolutionType c;
        public final /* synthetic */ String d;

        public e(String str, boolean z, TMSSolutionType tMSSolutionType, String str2) {
            this.f13771a = str;
            this.b = z;
            this.c = tMSSolutionType;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            r51 appInfoSync = AppInfoPrefetchJob.getAppInfoSync(this.f13771a);
            if (appInfoSync != null) {
                boolean z = this.b;
                TMSSolutionType tMSSolutionType = this.c;
                String str = this.d;
                if (!appInfoSync.f() || appInfoSync.a() == null) {
                    TMSLogger.b(TMS.TAG, "Nav not prefetch HTML (AppInfo remote)");
                } else if (q9s.O2() || z || appInfoSync.e() == AppInfoStrategy.LOCAL_LOAD) {
                    AppModel a2 = appInfoSync.a();
                    if (tMSSolutionType == TMSSolutionType.MIX) {
                        ckf.f(a2, RVConstants.EXTRA_APPINFO);
                        TBTMSColdLaunchTask.preloadHTMLResource(tMSSolutionType, new TMSMetaInfoWrapper(a2), str, z);
                    }
                } else {
                    TMSLogger.b(TMS.TAG, "AppInfo.strategy != LOCAL_LOAD");
                }
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f13772a;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Context f13773a;

            public a(Context context) {
                this.f13773a = context;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Toast.makeText(this.f13773a, R.string.triver_clear_cache, 0).show();
                }
            }
        }

        public f(Context context) {
            this.f13772a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            n51.i().g();
            AppManifestManager.INSTANCE.c();
            ((IExecutorService) p8s.g(IExecutorService.class)).getExecutor(ExecutorType.UI).execute(new a(this.f13772a));
        }
    }

    static {
        t2o.a(847249486);
    }

    private TMS() {
    }

    public static final /* synthetic */ void access$prefetchUniApp(TMS tms, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18f6478b", new Object[]{tms, uri});
        } else {
            tms.prefetchUniApp(uri);
        }
    }

    @JvmStatic
    private static final void asyncExecuteDoPrefetch(Uri uri, Context context) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafb8ac3", new Object[]{uri, context});
        } else if (h8s.f(context, "enableAsyncInitTask").a()) {
            IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
            if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) != null) {
                executor.execute(new b(uri));
            }
        } else {
            INSTANCE.prefetchUniApp(uri);
        }
    }

    @JvmStatic
    private static final void asyncExecuteSDK(Context context) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942cf0a0", new Object[]{context});
        } else if (h8s.f(context, "enableAsyncInitTask").a()) {
            abs.c(context);
            IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
            if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) != null) {
                executor.execute(new c(context));
            }
        } else {
            TBTMSSDK.initTBTMS(context);
        }
    }

    private final bbs preCreateWeexInstance(Application application, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("f0efce4e", new Object[]{this, application, uri});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "is_tms_launcher_ng", (String) Boolean.TRUE);
        xhv xhvVar = xhv.INSTANCE;
        bbs c2 = TMSInstanceManager.c(application, uri, null, jSONObject, 4, null);
        CommonExtKt.b().post(new d(c2));
        return c2;
    }

    public static /* synthetic */ void prefetch$default(TMS tms, Uri uri, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0081842", new Object[]{tms, uri, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        tms.prefetch(uri, z);
    }

    public static /* synthetic */ boolean startApp$default(Intent intent, zmj zmjVar, TMSSolutionType tMSSolutionType, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec0c520b", new Object[]{intent, zmjVar, tMSSolutionType, new Integer(i), obj})).booleanValue();
        }
        if ((i & 4) != 0) {
            tMSSolutionType = null;
        }
        return startApp(intent, zmjVar, tMSSolutionType);
    }

    private final void startAppByTBFragment(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82a25be", new Object[]{this, intent, zmjVar});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(qxq.KEY_FRAGMENT_JUMP, "true");
        bundle.putString(qxq.KEY_FRAGMENT_NAME, "com.taobao.themis.taobao.container.fragment.TMSTBHomeFragment");
        intent.putExtra(qxq.KEY_FRAGMENT_BUNDLE, bundle);
        String a2 = u9h.a();
        if (!(a2 == null || a2.length() == 0)) {
            intent.setData(ies.g(a2));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) UTDevice.getUtdid(zmjVar.d()));
        sb.append('_');
        sb.append(System.currentTimeMillis());
        String sb2 = sb.toString();
        intent.putExtra("oriUrl", String.valueOf(intent.getData()));
        intent.putExtra("traceId", sb2);
        zmjVar.x(zmjVar.d().getPackageName());
        zmjVar.r(TMSActivity.class.getName());
        zmjVar.v(JumpAbility.NAV_JUMP_ABILITY_FRAGMENT);
        vbs.p(String.valueOf(intent.getData()), sb2);
    }

    private final void startClearCache(Uri uri, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d871f", new Object[]{this, uri, context});
        } else {
            ((IExecutorService) p8s.g(IExecutorService.class)).getExecutor(ExecutorType.IO).execute(new f(context));
        }
    }

    public final boolean startApp(Uri uri, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9618c4b", new Object[]{this, uri, context})).booleanValue();
        }
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        ckf.g(context, "context");
        try {
            TMSLogger.b(TAG, ckf.p("startApp: ", uri));
            Context applicationContext = context.getApplicationContext();
            ckf.f(applicationContext, "context.applicationContext");
            asyncExecuteSDK(applicationContext);
            if (uri.getBooleanQueryParameter("isWidgetGroup", false)) {
                Intent intent = new Intent(context, WidgetPreviewActivity.class);
                intent.putExtra("oriUrl", uri.toString());
                context.startActivity(intent);
                return true;
            } else if (uri.getBooleanQueryParameter("tms_embed_preview", false)) {
                Intent intent2 = new Intent(context, CardPreviewActivity.class);
                intent2.putExtra("oriUrl", uri.toString());
                context.startActivity(intent2);
                return true;
            } else if (t8s.h(uri)) {
                startClearCache(uri, context);
                return true;
            } else {
                prefetch$default(this, uri, false, 2, null);
                startAppByActivity(uri, context);
                return true;
            }
        } catch (Throwable th) {
            TMSLogger.c(TAG, "themis container start fail", th);
            return false;
        }
    }

    private final boolean startAppByNavActivity(Uri uri, Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c260859", new Object[]{this, uri, intent, zmjVar})).booleanValue();
        }
        if (intent.getStringExtra("oriUrl") == null) {
            intent.putExtra("oriUrl", uri.toString());
        }
        zmjVar.x(zmjVar.d().getPackageName());
        zmjVar.r(TMSActivity.class.getName());
        intent.setPackage(zmjVar.d().getPackageName());
        intent.setClassName(zmjVar.d(), TMSActivity.class.getName());
        return true;
    }

    public final void prefetch(Uri uri, boolean z) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292875eb", new Object[]{this, uri, new Boolean(z)});
            return;
        }
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        TMSSolutionType type = TMSSolutionType.getType(uri);
        String queryParameter = uri.getQueryParameter("_ariver_appid");
        if (queryParameter != null) {
            String uri2 = uri.toString();
            ckf.f(uri2, "uri.toString()");
            TMSLogger.f(TAG, ckf.p("Nav prefetch AppInfo ", queryParameter));
            AppInfoPrefetchJob.prefetchAppInfo$default(queryParameter, uri2, false, 4, null);
            IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
            if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) != null) {
                executor.execute(new e(queryParameter, z, type, uri2));
            }
        }
    }

    private final boolean moveKeepAliveActivityToFront(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76d6c885", new Object[]{this, activity})).booleanValue();
        }
        Object systemService = activity.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null) {
            TMSLogger.b(TAG, "moveKeepAliveActivityToFront failed, activityManager is null");
            return false;
        }
        activityManager.moveTaskToFront(activity.getTaskId(), 0, ActivityOptionsCompat.makeCustomAnimation(activity, R.anim.tms_fragment_translate_in_left, R.anim.tms_fragment_translate_out_left).toBundle());
        return true;
    }

    private final void pauseTask(TMSSolutionType tMSSolutionType, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4625f1c", new Object[]{this, tMSSolutionType, context});
            return;
        }
        no8 f2 = h8s.f(context, "pauseAndRestartInitTask");
        vxm.b.e().a("pauseAndRestartInitTask", f2.b());
        if (f2.d()) {
            TMSSolutionType tMSSolutionType2 = TMSSolutionType.WEEX;
            if (!(tMSSolutionType == tMSSolutionType2 || p9s.g().get() == 1)) {
                p9s.g().set(0);
            }
            if (!(tMSSolutionType == tMSSolutionType2 || p9s.f().get() == 1)) {
                p9s.f().set(0);
            }
            if (p9s.e().get() != 1) {
                p9s.e().set(0);
            }
            if (p9s.h().get() != 1) {
                p9s.h().set(0);
            }
        }
    }

    private final void prefetchUniApp(Uri uri) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8de1a0b8", new Object[]{this, uri});
            return;
        }
        String uri2 = uri.toString();
        ckf.f(uri2, "uri.toString()");
        ges.a o = ges.INSTANCE.o(uri2);
        if (o != null) {
            AppManifestDao h = AppManifestManager.INSTANCE.h(o);
            TMSMetaInfoWrapper tMSMetaInfoWrapper = null;
            if ((h == null ? null : h.getAppManifest()) != null) {
                AppManifest appManifest = h.getAppManifest();
                ckf.d(appManifest);
                tMSMetaInfoWrapper = new TMSMetaInfoWrapper(appManifest, o);
            }
            if (!q9s.INSTANCE.y2() || !o.g() || tMSMetaInfoWrapper != null) {
                z = false;
            }
            boolean o1 = q9s.o1();
            if (o1) {
                zgv.INSTANCE.h(o, tMSMetaInfoWrapper, z);
            }
            if (tMSMetaInfoWrapper != null) {
                zgv zgvVar = zgv.INSTANCE;
                zgvVar.f(o, tMSMetaInfoWrapper);
                if (!o1) {
                    zgvVar.g(o, tMSMetaInfoWrapper);
                }
            } else if (h == null && !z) {
                zgv.INSTANCE.i(o);
            }
        }
    }

    private final boolean previewEmbed(Uri uri, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1a5ea5d", new Object[]{this, uri, context})).booleanValue();
        }
        if (!uri.getBooleanQueryParameter("tms_embed_preview", false)) {
            return false;
        }
        Intent intent = new Intent(context, CardPreviewActivity.class);
        intent.putExtra("oriUrl", uri.toString());
        context.startActivity(intent);
        return true;
    }

    private final boolean previewWidgetGroup(Uri uri, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aaf31c9f", new Object[]{this, uri, context})).booleanValue();
        }
        if (!uri.getBooleanQueryParameter("isWidgetGroup", false)) {
            return false;
        }
        Intent intent = new Intent(context, WidgetPreviewActivity.class);
        intent.putExtra("oriUrl", uri.toString());
        context.startActivity(intent);
        return true;
    }

    private final void startAppByActivity(Uri uri, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f78f7ad", new Object[]{this, uri, context});
        } else if (o9s.j(context)) {
            TMSSolutionType type = TMSSolutionType.getType(uri);
            Uri.Builder buildUpon = uri.buildUpon();
            if (type == TMSSolutionType.MINIGAME) {
                String uri2 = uri.toString();
                ckf.f(uri2, "uri.toString()");
                if (!wsq.O(uri2, nj7.LARGE_SCREEN_STYLE_KEY, false, 2, null)) {
                    buildUpon.appendQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen");
                }
            }
            Bundle bundle = new Bundle();
            bundle.putString("oriUrl", uri.toString());
            bundle.putBoolean("disableHook", true);
            Nav.from(context).withClassName(context.getPackageName(), TMSActivity.class.getName()).withExtras(bundle).toUri(buildUpon.build());
        } else {
            Intent intent = new Intent(context, TMSActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setData(uri);
            intent.putExtra("oriUrl", uri.toString());
            context.startActivity(intent);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(1:30)(1:31)|32|(2:34|(4:141|70|73|(2:75|76)(2:77|(1:79)(2:80|(2:85|(3:87|(2:89|(1:91))|92))(1:84))))(2:37|(4:137|60|63|(1:65)(2:66|(2:68|69)))(1:(2:42|(2:44|45)(4:46|(1:50)|51|(3:56|(1:58)|59)(1:55))))))(1:93)|(1:95)(1:96)|(4:99|(1:(1:102))(2:103|(4:105|(1:107)|(2:109|(1:111)(2:112|113))|114))|122|(2:130|(1:132)(2:133|134))(2:128|129))|139|115|(1:117)|120|122|(1:124)|130|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x022b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0233, code lost:
        kotlin.Result.m1108constructorimpl(kotlin.b.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0261 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean startApp(android.content.Intent r16, tb.zmj r17, com.taobao.themis.kernel.solution.TMSSolutionType r18) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.taobao.impl.TMS.startApp(android.content.Intent, tb.zmj, com.taobao.themis.kernel.solution.TMSSolutionType):boolean");
    }
}
