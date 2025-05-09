package com.taobao.message.kit.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.util.Log;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.android.tools.bundleInfo.BundleListing;
import com.taobao.appbundle.a;
import com.taobao.message.uikit.util.ActivityUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Ref$BooleanRef;
import tb.acq;
import tb.bcq;
import tb.bdq;
import tb.ceq;
import tb.ckf;
import tb.d1a;
import tb.edq;
import tb.g1a;
import tb.hdq;
import tb.kfp;
import tb.q17;
import tb.rqk;
import tb.ru1;
import tb.t2o;
import tb.ucq;
import tb.vcq;
import tb.x49;
import tb.xcq;
import tb.xhv;
import tb.zk9;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ`\u0010\u001a\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00130\u0015H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\"\u0010!J\u0015\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f¢\u0006\u0004\b$\u0010%J\u0081\u0001\u0010,\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00072\b\b\u0002\u0010(\u001a\u00020'2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00130\u00152\b\b\u0002\u0010)\u001a\u00020\f2%\b\u0002\u0010+\u001a\u001f\u0012\u0013\u0012\u00110'¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0015¢\u0006\u0004\b,\u0010-Jg\u00101\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\f2%\u0010\u0014\u001a!\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030/¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00130\u00152!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00130\u0015¢\u0006\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00106\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u00104R\u0014\u00107\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0011\u00109\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010;\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b;\u0010:R\u0011\u0010$\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b$\u0010:¨\u0006<"}, d2 = {"Lcom/taobao/message/kit/util/BundleSplitUtil;", "", "<init>", "()V", "Lcom/android/tools/bundleInfo/BundleListing$a;", "bundleInfo", "", "", "getFeatureNames", "(Lcom/android/tools/bundleInfo/BundleListing$a;)Ljava/util/Set;", "bundleName", ru1.FEATURE_NAME, "", "isTargetBundleReady", "(Ljava/lang/String;Ljava/lang/String;)Z", "showLoading", "Landroid/app/Activity;", "context", "Lkotlin/Function0;", "Ltb/xhv;", "onSuccess", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "errorMsg", "onFailure", "checkTargetBundleReady", "(Ljava/lang/String;Ljava/lang/String;ZLandroid/app/Activity;Ltb/d1a;Ltb/g1a;)V", "Landroid/content/Context;", "ctx", "injectResource", "(Landroid/content/Context;)V", "getMsgFeatureVersion", "()Ljava/lang/String;", "getWrapperFeatureVersion", "autoLoadModule", "isMsgBundleReady", "(Z)Z", "source", "", "withRetry", "withInit", "a", "onProgress", "checkMsgBundleReady", "(Ljava/lang/String;ILtb/d1a;Ltb/g1a;ZLtb/g1a;)V", "clazzName", "Ljava/lang/Class;", "clazz", "checkClazzReady", "(Ljava/lang/String;ZLtb/g1a;Ltb/g1a;)V", RPCDataItems.SWITCH_TAG_LOG, "Ljava/lang/String;", "FEATURE_NAME", "ACTIVITY_NAME", "hasFlexa", "Z", "isDynamicFeature", "()Z", "isMsgBundleDownloaded", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class BundleSplitUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTIVITY_NAME = "com.taobao.message.activity.ChatActivity";
    public static final String FEATURE_NAME = "taobao_wangxin";
    public static final BundleSplitUtil INSTANCE = new BundleSplitUtil();
    public static final String TAG = "BundleSplitUtil";
    private static final boolean hasFlexa;

    static {
        boolean z;
        t2o.a(529530976);
        try {
            Class.forName(ucq.class.getName());
            Class.forName(a.class.getName());
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        hasFlexa = z;
    }

    private BundleSplitUtil() {
    }

    public static /* synthetic */ void checkMsgBundleReady$default(BundleSplitUtil bundleSplitUtil, String str, int i, d1a d1aVar, g1a g1aVar, boolean z, g1a g1aVar2, int i2, Object obj) {
        boolean z2;
        g1a g1aVar3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fb95e97", new Object[]{bundleSplitUtil, str, new Integer(i), d1aVar, g1aVar, new Boolean(z), g1aVar2, new Integer(i2), obj});
            return;
        }
        int i3 = i;
        if ((2 & i2) != 0) {
            i3 = 0;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i2 & 32) != 0) {
            g1aVar3 = null;
        } else {
            g1aVar3 = g1aVar2;
        }
        bundleSplitUtil.checkMsgBundleReady(str, i3, d1aVar, g1aVar, z2, g1aVar3);
    }

    private final Set<String> getFeatureNames(BundleListing.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("747df8b2", new Object[]{this, aVar});
        }
        Set<String> f = kfp.f(aVar.c);
        List<String> list = aVar.m;
        ckf.c(list, "bundleInfo.dependencies");
        f.addAll(list);
        return f;
    }

    @JvmStatic
    public static final boolean isTargetBundleReady(String str, String str2) {
        ucq h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8adacc05", new Object[]{str, str2})).booleanValue();
        }
        ckf.h(str, "bundleName");
        ckf.h(str2, ru1.FEATURE_NAME);
        if (!hasFlexa || (h = a.Companion.a().h()) == null) {
            return true;
        }
        BundleListing.a bundleInfo = BundleInfoManager.instance().getBundleInfo(str);
        if (bundleInfo != null && !bundleInfo.f4604a.booleanValue()) {
            return true;
        }
        Set<String> f = h.f();
        List singletonList = Collections.singletonList(str2);
        ckf.c(singletonList, "Collections.singletonList(featureName)");
        return f.containsAll(singletonList);
    }

    public final void checkClazzReady(String str, boolean z, g1a<? super Class<?>, xhv> g1aVar, g1a<? super String, xhv> g1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4419f33c", new Object[]{this, str, new Boolean(z), g1aVar, g1aVar2});
            return;
        }
        ckf.h(str, "clazzName");
        ckf.h(g1aVar, "onSuccess");
        ckf.h(g1aVar2, "onFailure");
        long currentTimeMillis = System.currentTimeMillis();
        if (isMsgBundleReady()) {
            g1aVar.invoke(Class.forName(str));
        }
        zk9.b(str, new BundleSplitUtil$checkClazzReady$1(currentTimeMillis, str, z, g1aVar, g1aVar2));
    }

    public final String getMsgFeatureVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75275eec", new Object[]{this});
        }
        if (!hasFlexa) {
            return null;
        }
        return x49.c().b("taobao_wangxin");
    }

    public final String getWrapperFeatureVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc61ed9a", new Object[]{this});
        }
        if (!hasFlexa) {
            return null;
        }
        return x49.c().b("messagesdkwrapper");
    }

    public final void injectResource(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6005b8c2", new Object[]{this, context});
            return;
        }
        ckf.h(context, "ctx");
        if (hasFlexa) {
            acq.B(context);
        }
    }

    public final boolean isDynamicFeature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa84218c", new Object[]{this})).booleanValue();
        }
        if (!hasFlexa || a.Companion.a().h() == null) {
            return false;
        }
        Boolean bool = BundleInfoManager.instance().getBundleInfoFromActivity(ACTIVITY_NAME).f4604a;
        ckf.c(bool, "bundleInfo.dynamicFeature");
        return bool.booleanValue();
    }

    public final boolean isMsgBundleReady() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cd41c755", new Object[]{this})).booleanValue() : isMsgBundleReady(true);
    }

    @JvmStatic
    public static final void checkTargetBundleReady(String str, final String str2, boolean z, Activity activity, final d1a<xhv> d1aVar, final g1a<? super String, xhv> g1aVar) {
        final ucq ucqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("863d7510", new Object[]{str, str2, new Boolean(z), activity, d1aVar, g1aVar});
            return;
        }
        ckf.h(str, "bundleName");
        ckf.h(str2, ru1.FEATURE_NAME);
        ckf.h(activity, "context");
        ckf.h(d1aVar, "onSuccess");
        ckf.h(g1aVar, "onFailure");
        if (isTargetBundleReady(str, str2)) {
            d1aVar.invoke();
            return;
        }
        if (ApplicationUtil.getApplication() == null) {
            ucqVar = a.Companion.a().h();
        } else {
            ucqVar = vcq.a(ApplicationUtil.getApplication());
        }
        if (ucqVar != null) {
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.element = false;
            System.currentTimeMillis();
            ucqVar.g(new edq() { // from class: com.taobao.message.kit.util.BundleSplitUtil$checkTargetBundleReady$listener$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onStateUpdate(bdq bdqVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93485c61", new Object[]{this, bdqVar});
                        return;
                    }
                    ckf.h(bdqVar, "state");
                    if (bdqVar.f().contains(str2)) {
                        int i = bdqVar.i();
                        if (i == 5) {
                            ucqVar.e(this);
                            if (!ref$BooleanRef.element) {
                                d1aVar.invoke();
                            } else {
                                TLog.loge(BundleSplitUtil.TAG, ":cancel");
                            }
                        } else if (i == 6) {
                            TLog.loge(BundleSplitUtil.TAG, ":failed");
                            ucqVar.e(this);
                            g1aVar.invoke("msg init failed");
                        }
                    }
                }
            });
            ucqVar.c(xcq.c().p(z).i(new q17(activity, new DialogInterface.OnCancelListener() { // from class: com.taobao.message.kit.util.BundleSplitUtil$checkTargetBundleReady$request$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                    } else {
                        Ref$BooleanRef.this.element = true;
                    }
                }
            }, BundleSplitUtil$checkTargetBundleReady$request$2.INSTANCE, BundleSplitUtil$checkTargetBundleReady$request$3.INSTANCE)).l(str2).n()).c(BundleSplitUtil$checkTargetBundleReady$task$1.INSTANCE).b(new rqk() { // from class: com.taobao.message.kit.util.BundleSplitUtil$checkTargetBundleReady$task$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rqk
                public final void onFailure(Exception exc) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                    } else {
                        g1a.this.invoke("install feature failed");
                    }
                }
            });
            return;
        }
        TLog.loge(TAG, "manager is null");
        g1aVar.invoke("manager is null");
    }

    public final boolean isMsgBundleReady(boolean z) {
        ucq h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("daf7d5a7", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!hasFlexa || (h = a.Companion.a().h()) == null) {
            return true;
        }
        BundleListing.a bundleInfoFromActivity = BundleInfoManager.instance().getBundleInfoFromActivity(ACTIVITY_NAME);
        if (!bundleInfoFromActivity.f4604a.booleanValue()) {
            return true;
        }
        if (z && !h.f().containsAll(getFeatureNames(bundleInfoFromActivity))) {
            long currentTimeMillis = System.currentTimeMillis();
            TraceUtil.beginSection("SplitCompatHolder load");
            boolean b = ckf.b("1", ConfigUtil.getValue("mpm_data_switch", "degradeLoadBeforeTen", "0"));
            boolean onlyOneActivity = ActivityUtil.onlyOneActivity(ApplicationUtil.getApplication());
            if (b || Build.VERSION.SDK_INT > 29 || onlyOneActivity) {
                hdq a2 = bcq.a();
                Application application = ApplicationUtil.getApplication();
                ceq ceqVar = new ceq(2);
                ceqVar.a(bundleInfoFromActivity.c);
                Collection collection = bundleInfoFromActivity.m;
                if (collection == null) {
                    collection = new ArrayList();
                }
                Object[] array = collection.toArray(new String[0]);
                if (array != null) {
                    ceqVar.b(array);
                    a2.g(application, false, (String[]) ceqVar.d(new String[ceqVar.c()]));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            TLog.loge(TAG, "SplitCompatHolder load time: " + currentTimeMillis2);
            RemoteMonitorUtil.INSTANCE.remoteAssembleStat(currentTimeMillis2);
            TraceUtil.endTrace();
        }
        return h.f().containsAll(getFeatureNames(bundleInfoFromActivity));
    }

    public final boolean isMsgBundleDownloaded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("923309eb", new Object[]{this})).booleanValue();
        }
        try {
            if (!isDynamicFeature()) {
                return true;
            }
            hdq a2 = bcq.a();
            ckf.c(a2, "SplitCompatHolder.get()");
            return a2.e().E("taobao_wangxin").exists();
        } catch (Throwable th) {
            TLog.loge(TAG, Log.getStackTraceString(th));
            return false;
        }
    }

    public final void checkMsgBundleReady(String str, int i, d1a<xhv> d1aVar, final g1a<? super String, xhv> g1aVar, boolean z, g1a<? super Integer, xhv> g1aVar2) {
        ucq a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50c979e3", new Object[]{this, str, new Integer(i), d1aVar, g1aVar, new Boolean(z), g1aVar2});
            return;
        }
        ckf.h(str, "source");
        ckf.h(d1aVar, "onSuccess");
        ckf.h(g1aVar, "onFailure");
        TLog.loge(TAG, "checkMsgBundleReady: ".concat(str));
        if (isMsgBundleReady()) {
            d1aVar.invoke();
            return;
        }
        if (ApplicationUtil.getApplication() == null) {
            a2 = a.Companion.a().h();
        } else {
            a2 = vcq.a(ApplicationUtil.getApplication());
        }
        if (a2 != null) {
            a2.g(new BundleSplitUtil$checkMsgBundleReady$listener$1(BundleInfoManager.instance().getBundleInfoFromActivity(ACTIVITY_NAME), g1aVar2, System.currentTimeMillis(), str, a2, z, d1aVar, g1aVar));
            a2.c(xcq.c().l("taobao_wangxin").n()).c(BundleSplitUtil$checkMsgBundleReady$task$1.INSTANCE).b(new rqk() { // from class: com.taobao.message.kit.util.BundleSplitUtil$checkMsgBundleReady$task$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rqk
                public final void onFailure(Exception exc) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                    } else {
                        g1a.this.invoke("install feature failed");
                    }
                }
            });
            return;
        }
        TLog.loge(TAG, "manager is null");
        g1aVar.invoke("manager is null");
    }
}
