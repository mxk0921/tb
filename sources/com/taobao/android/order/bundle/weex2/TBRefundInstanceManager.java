package com.taobao.android.order.bundle.weex2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.android.ultron.vfw.storage.TradeCache;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.custom.TradeHybridCustomAnnotation;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.HybridPreRenderHelper;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.alibaba.security.realidentity.p1;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexEventTarget;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceStatus;
import com.taobao.android.weex.config.WeexApmCustomData;
import com.taobao.falco.u;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ae2;
import tb.bbv;
import tb.ccv;
import tb.ckf;
import tb.f7l;
import tb.fsb;
import tb.hav;
import tb.j6x;
import tb.jpu;
import tb.lbv;
import tb.m8v;
import tb.mf6;
import tb.njg;
import tb.o9x;
import tb.p9b;
import tb.pav;
import tb.pbv;
import tb.qbv;
import tb.qho;
import tb.s0j;
import tb.s5e;
import tb.ssq;
import tb.t2o;
import tb.tz8;
import tb.u3o;
import tb.u55;
import tb.ux;
import tb.v4s;
import tb.v9v;
import tb.xcv;
import tb.xhv;
import tb.z1x;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b<\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001_B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0010\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010\u0003J\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b!\u0010\u001aJ!\u0010%\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"2\b\u0010\u0011\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0004\b%\u0010&J!\u0010)\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u00152\u0006\u0010(\u001a\u00020\"H\u0007¢\u0006\u0004\b)\u0010*J!\u0010,\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u00152\u0006\u0010+\u001a\u00020\"H\u0007¢\u0006\u0004\b,\u0010*J#\u0010/\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u00152\b\u0010.\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b/\u00100J'\u00101\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010-\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010-\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00106R\u001b\u0010<\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010=\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\bA\u0010\u0003\u001a\u0004\b?\u0010@R$\u0010B\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010\u001eR$\u0010G\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR(\u0010M\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bM\u0010>\u0012\u0004\bP\u0010\u0003\u001a\u0004\bM\u0010@\"\u0004\bN\u0010OR$\u0010Q\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u00106\u001a\u0004\bR\u0010;\"\u0004\bS\u0010TR!\u0010X\u001a\u00020\"8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bU\u00109\u0012\u0004\bW\u0010\u0003\u001a\u0004\bV\u0010@R\u001b\u0010[\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u00109\u001a\u0004\bZ\u0010@R\u001b\u0010^\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u00109\u001a\u0004\b]\u0010@¨\u0006`"}, d2 = {"Lcom/taobao/android/order/bundle/weex2/TBRefundInstanceManager;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", v4s.PARAM_UPLOAD_STAGE, "sceneName", "", "params", "Ltb/xhv;", "hybridStage", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "rootView", "refundUrl", "Lcom/taobao/android/order/bundle/weex2/TBRefundInstanceManager$b;", "refundParams", "Lcom/taobao/android/weex/WeexInstance;", "refundWeex2PreRender", "(Landroid/content/Context;Landroid/view/ViewGroup;Ljava/lang/String;Lcom/taobao/android/order/bundle/weex2/TBRefundInstanceManager$b;)Lcom/taobao/android/weex/WeexInstance;", "createNewInstance", "startPreRequestOnIdle", "(Landroid/content/Context;)V", "Lcom/alibaba/fastjson/JSONObject;", "responseData", "onNetSuccess", "(Lcom/alibaba/fastjson/JSONObject;)V", "onNetFail", "startNormalRequest", "startRPCRequest", "", g4.b.i, "Landroid/view/View;", "reportRumInRefundList", "(ZLandroid/view/View;)V", "refundWeexInstance", mf6.TYPE_SELECTED, "onTabSelectedRefundList", "(Lcom/taobao/android/weex/WeexInstance;Z)V", "visible", "dispatchVisibilityState", "instance", s0j.MTS_TAG_CLICK_TIME, "setCustomStartTime", "(Lcom/taobao/android/weex/WeexInstance;Ljava/lang/String;)V", "addInstanceView", "(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/taobao/android/weex/WeexInstance;)V", "prepareReloadInstance", "(Lcom/taobao/android/order/bundle/weex2/TBRefundInstanceManager$b;Lcom/taobao/android/weex/WeexInstance;)V", RPCDataItems.SWITCH_TAG_LOG, "Ljava/lang/String;", "PREFETCH_CODE", "defaultRefundUrl$delegate", "Ltb/njg;", "getDefaultRefundUrl", "()Ljava/lang/String;", "defaultRefundUrl", "useSurfaceView", "Z", "getUseSurfaceView", "()Z", "getUseSurfaceView$annotations", "refundResponseData", "Lcom/alibaba/fastjson/JSONObject;", "getRefundResponseData", "()Lcom/alibaba/fastjson/JSONObject;", "setRefundResponseData", "temporaryInstance", "Lcom/taobao/android/weex/WeexInstance;", "getTemporaryInstance", "()Lcom/taobao/android/weex/WeexInstance;", "setTemporaryInstance", "(Lcom/taobao/android/weex/WeexInstance;)V", "isNetStart", "setNetStart", "(Z)V", "isNetStart$annotations", "netStartTime", "getNetStartTime", "setNetStartTime", "(Ljava/lang/String;)V", "enablePreRequest$delegate", "getEnablePreRequest", "getEnablePreRequest$annotations", "enablePreRequest", "enableReportRumInRefundList$delegate", "getEnableReportRumInRefundList", "enableReportRumInRefundList", "enableDispatchVisibilityState$delegate", "getEnableDispatchVisibilityState", "enableDispatchVisibilityState", TplMsg.VALUE_T_NATIVE_RETURN, "taobao-order-bundle_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class TBRefundInstanceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PREFETCH_CODE = "refundPrefetch";
    private static final String TAG = "TBRefundInstanceManager";
    private static final njg enableDispatchVisibilityState$delegate;
    private static final njg enablePreRequest$delegate;
    private static final njg enableReportRumInRefundList$delegate;
    private static boolean isNetStart;
    private static String netStartTime;
    private static JSONObject refundResponseData;
    private static WeexInstance temporaryInstance;
    private static final boolean useSurfaceView;
    public static final TBRefundInstanceManager INSTANCE = new TBRefundInstanceManager();
    private static final njg defaultRefundUrl$delegate = kotlin.a.b(TBRefundInstanceManager$defaultRefundUrl$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements s5e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.s5e
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb8b0117", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "p0");
            ckf.g(str2, p1.d);
        }

        @Override // tb.s5e
        public void b(boolean z, JSONObject jSONObject, MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0c15975", new Object[]{this, new Boolean(z), jSONObject, mtopResponse});
            }
        }

        @Override // tb.s5e
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                return;
            }
            ckf.g(jSONObject, "p0");
            if (ckf.b("mtop.com.alibaba.refundface2.disputeservice.renderlist.noultron", jSONObject.getString("url"))) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(ccv.PARAM_ASYNC_DATA_SOURCE, (Object) "true");
                qbv.j().a(UltronTradeHybridStage.ON_DATA_CHANGED, "refundList", jSONObject2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f9112a;
        public final String b;
        public final boolean c;

        static {
            t2o.a(713031952);
        }

        public b(String str, String str2, boolean z) {
            this.f9112a = str;
            this.b = str2;
            this.c = z;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("44ca129a", new Object[]{this});
            }
            return this.f9112a;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("649a4eaf", new Object[]{this});
            }
            return this.b;
        }

        public final boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("447db125", new Object[]{this})).booleanValue();
            }
            return this.c;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (!ckf.b(this.f9112a, bVar.f9112a) || !ckf.b(this.b, bVar.b) || this.c != bVar.c) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            int i3 = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.f9112a;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            String str2 = this.b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            int i5 = (i4 + i2) * 31;
            boolean z = this.c;
            if (!z) {
                i3 = z ? 1 : 0;
            }
            return i5 + i3;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "RefundParams(clickTime=" + this.f9112a + ", openFrom=" + this.b + ", isFragment=" + this.c + f7l.BRACKET_END_STR;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c implements j6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f9113a;

        public c(ViewGroup viewGroup) {
            this.f9113a = viewGroup;
        }

        @Override // tb.j6x
        public void E1(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
            }
        }

        @Override // tb.j6x
        public void H0(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void I1(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
            }
        }

        @Override // tb.j6x
        public void K0(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
            }
        }

        @Override // tb.j6x
        public void K1(WeexInstance weexInstance, boolean z) {
            View view;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
                return;
            }
            ViewGroup viewGroup = this.f9113a;
            if (weexInstance != null) {
                view = weexInstance.getRootView();
            } else {
                view = null;
            }
            viewGroup.addView(view);
        }

        @Override // tb.j6x
        public void d2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void e2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void l2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void z1(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class d implements xcv {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeexInstance f9114a;

        public d(WeexInstance weexInstance) {
            this.f9114a = weexInstance;
        }

        @Override // tb.xcv
        public void n0(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1435fd2c", new Object[]{this, str, str2});
            }
        }

        @Override // tb.xcv
        public void S() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a730856", new Object[]{this});
            } else if (TBRefundInstanceManager.getEnablePreRequest()) {
                JSONObject jSONObject = new JSONObject();
                TBRefundInstanceManager tBRefundInstanceManager = TBRefundInstanceManager.INSTANCE;
                String netStartTime = tBRefundInstanceManager.getNetStartTime();
                if (netStartTime != null) {
                    jSONObject.put((JSONObject) "netStartTime", netStartTime);
                }
                if (tBRefundInstanceManager.getRefundResponseData() != null) {
                    TBRefundInstanceManager.setNetStart(false);
                    jSONObject.put((JSONObject) "dataType", "net");
                    jSONObject.put((JSONObject) "responseData", (String) tBRefundInstanceManager.getRefundResponseData());
                    WeexInstance weexInstance = this.f9114a;
                    if (weexInstance != null) {
                        weexInstance.dispatchEvent(WeexEventTarget.DOCUMENT_TARGET, "preload.background", o9x.c().b(jSONObject));
                    }
                } else if (!TBRefundInstanceManager.isNetStart()) {
                    jSONObject.put((JSONObject) "dataType", "net");
                    WeexInstance weexInstance2 = this.f9114a;
                    if (weexInstance2 != null) {
                        weexInstance2.dispatchEvent(WeexEventTarget.DOCUMENT_TARGET, "preload.background", o9x.c().b(jSONObject));
                    }
                } else {
                    tBRefundInstanceManager.setTemporaryInstance(this.f9114a);
                }
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final e INSTANCE = new e();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TradeCache.INSTANCE.i("first_data", ae2.BizKeyRefund);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f9115a;

        public f(JSONObject jSONObject) {
            this.f9115a = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            qbv j = qbv.j();
            ckf.f(j, "UltronTradeHybridManager.getInstance()");
            bbv g = j.g();
            String jSONString = this.f9115a.toJSONString();
            ckf.f(jSONString, "responseData.toJSONString()");
            bbv.f(g, "first_data", jSONString, ae2.BizKeyRefund, null, 8, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class g implements s5e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.s5e
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb8b0117", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "p0");
            ckf.g(str2, p1.d);
            TBRefundInstanceManager.access$onNetFail(TBRefundInstanceManager.INSTANCE);
        }

        @Override // tb.s5e
        public void b(boolean z, JSONObject jSONObject, MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0c15975", new Object[]{this, new Boolean(z), jSONObject, mtopResponse});
            }
        }

        @Override // tb.s5e
        public void onSuccess(JSONObject jSONObject) {
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                return;
            }
            ckf.g(jSONObject, "data");
            try {
                jSONObject2 = jSONObject.getJSONObject("data");
            } catch (Exception e) {
                e.printStackTrace();
                m8v.a(e);
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                TBRefundInstanceManager.access$onNetSuccess(TBRefundInstanceManager.INSTANCE, jSONObject2);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f9116a;

        public h(Context context) {
            this.f9116a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "isEnableRefundNextRPC", true)) {
                TBRefundInstanceManager.startRPCRequest(this.f9116a);
            } else {
                TBRefundInstanceManager.access$startNormalRequest(TBRefundInstanceManager.INSTANCE);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class i extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ MtopResponse f9117a;

            /* compiled from: Taobao */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            /* renamed from: com.taobao.android.order.bundle.weex2.TBRefundInstanceManager$i$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
            public static final class RunnableC0471a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ JSONObject f9118a;

                public RunnableC0471a(JSONObject jSONObject) {
                    this.f9118a = jSONObject;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TBRefundInstanceManager tBRefundInstanceManager = TBRefundInstanceManager.INSTANCE;
                    JSONObject jSONObject = this.f9118a;
                    ckf.f(jSONObject, "retObj");
                    TBRefundInstanceManager.access$onNetSuccess(tBRefundInstanceManager, jSONObject);
                }
            }

            /* compiled from: Taobao */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
            public static final class b implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public static final b INSTANCE = new b();

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TBRefundInstanceManager.access$onNetFail(TBRefundInstanceManager.INSTANCE);
                    }
                }
            }

            public a(MtopResponse mtopResponse) {
                this.f9117a = mtopResponse;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    pav.i(new RunnableC0471a(JSON.parseObject(this.f9117a.getDataJsonObject().toString())), 0L);
                } catch (Exception e) {
                    e.printStackTrace();
                    m8v.a(e);
                    pav.i(b.INSTANCE, 0L);
                }
            }
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/weex2/TBRefundInstanceManager$startRPCRequest$2");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
            }
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
            }
        }

        @Override // tb.ux
        public boolean e(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c4610746", new Object[]{this, new Integer(i), mtopResponse, obj})).booleanValue();
            }
            return true;
        }

        @Override // tb.ux
        public void f(int i, MtopResponse mtopResponse, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0da171b", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            if (mtopResponse != null) {
                str = mtopResponse.getRetCode();
            } else {
                str = null;
            }
            if (ckf.b(str, "SUCCESS")) {
                pav.k(new a(mtopResponse));
            } else {
                TBRefundInstanceManager.access$onNetFail(TBRefundInstanceManager.INSTANCE);
            }
        }
    }

    private TBRefundInstanceManager() {
    }

    public static final /* synthetic */ void access$onNetFail(TBRefundInstanceManager tBRefundInstanceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d87f63", new Object[]{tBRefundInstanceManager});
        } else {
            tBRefundInstanceManager.onNetFail();
        }
    }

    public static final /* synthetic */ void access$onNetSuccess(TBRefundInstanceManager tBRefundInstanceManager, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9935a556", new Object[]{tBRefundInstanceManager, jSONObject});
        } else {
            tBRefundInstanceManager.onNetSuccess(jSONObject);
        }
    }

    public static final /* synthetic */ void access$startNormalRequest(TBRefundInstanceManager tBRefundInstanceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("448b61b9", new Object[]{tBRefundInstanceManager});
        } else {
            tBRefundInstanceManager.startNormalRequest();
        }
    }

    private final WeexInstance createNewInstance(Context context, ViewGroup viewGroup, String str, b bVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("da20431b", new Object[]{this, context, viewGroup, str, bVar});
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        String b2 = bVar.b();
        if (b2 == null || b2.length() == 0) {
            buildUpon.appendQueryParameter("openFrom", "other");
        } else {
            buildUpon.appendQueryParameter("openFrom", bVar.b());
        }
        String str3 = "true";
        buildUpon.appendQueryParameter("prefetch", str3);
        buildUpon.appendQueryParameter("jt_pt_navStartTime", bVar.a());
        buildUpon.appendQueryParameter("isFragment", String.valueOf(bVar.c()));
        if (getEnablePreRequest() && isNetStart) {
            buildUpon.appendQueryParameter(z1x.PRE_REQUEST, str3);
        }
        if (UltronTradeHybridSwitcherHelper.n()) {
            buildUpon.appendQueryParameter("hitRefundDetailHybridContainer", str3);
        }
        if (UltronTradeHybridSwitcherHelper.l()) {
            buildUpon.appendQueryParameter("hitAserver", str3);
        }
        if (!HybridPreRenderHelper.Companion.e()) {
            str3 = "false";
        }
        buildUpon.appendQueryParameter("wx_use_native_jsx", str3);
        String uri = buildUpon.build().toString();
        ckf.f(uri, "uriBuilder.build().toString()");
        com.alibaba.android.ultron.vfw.weex2.a g2 = com.alibaba.android.ultron.vfw.weex2.a.g();
        if (useSurfaceView) {
            str2 = UltronTradeHybridInstanceRenderMode.SURFACE;
        } else {
            str2 = UltronTradeHybridInstanceRenderMode.TEXTURE;
        }
        WeexInstance f2 = g2.f(context, uri, str2);
        setCustomStartTime(f2, bVar.a());
        f2.setTag("bizLifecycleListener", new d(f2));
        f2.addInstanceListener(new c(viewGroup));
        f2.render(null);
        hav.d(PREFETCH_CODE, "refundPrefetch success");
        return f2;
    }

    @JvmStatic
    public static final void dispatchVisibilityState(WeexInstance weexInstance, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("364b0b2a", new Object[]{weexInstance, new Boolean(z)});
        } else if (INSTANCE.getEnableDispatchVisibilityState() && weexInstance != null) {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "visible";
            } else {
                str = "hidden";
            }
            jSONObject.put((JSONObject) "visibilityState", str);
            weexInstance.dispatchEvent(WeexEventTarget.DOCUMENT_TARGET, "visibilitychange", o9x.c().b(jSONObject));
        }
    }

    private final boolean getEnableDispatchVisibilityState() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("f4bbf297", new Object[]{this});
        } else {
            value = enableDispatchVisibilityState$delegate.getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    public static final boolean getEnablePreRequest() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("e5e5e5d0", new Object[0]);
        } else {
            value = enablePreRequest$delegate.getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    @JvmStatic
    public static /* synthetic */ void getEnablePreRequest$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a3a2cc", new Object[0]);
        }
    }

    private final boolean getEnableReportRumInRefundList() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("84e860a3", new Object[]{this});
        } else {
            value = enableReportRumInRefundList$delegate.getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    public static final boolean getUseSurfaceView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75a2edec", new Object[0])).booleanValue();
        }
        return useSurfaceView;
    }

    @JvmStatic
    public static /* synthetic */ void getUseSurfaceView$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf6960e8", new Object[0]);
        }
    }

    public static final boolean isNetStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88eb311a", new Object[0])).booleanValue();
        }
        return isNetStart;
    }

    @JvmStatic
    public static /* synthetic */ void isNetStart$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf04f16", new Object[0]);
        }
    }

    @JvmStatic
    public static final void onTabSelectedRefundList(WeexInstance weexInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a7cda8", new Object[]{weexInstance, new Boolean(z)});
        } else if (INSTANCE.getEnableReportRumInRefundList() && weexInstance != null) {
            if (z) {
                weexInstance.onViewAppear();
            } else {
                weexInstance.onViewDisappear();
            }
        }
    }

    @JvmStatic
    public static final WeexInstance refundWeex2PreRender(Context context, ViewGroup viewGroup, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("c13dbcc2", new Object[]{context, viewGroup, str, bVar});
        }
        ckf.g(context, "context");
        ckf.g(viewGroup, "rootView");
        ckf.g(bVar, "refundParams");
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        TBRefundInstanceManager tBRefundInstanceManager = INSTANCE;
        if (str == null) {
            str = tBRefundInstanceManager.getDefaultRefundUrl();
        }
        return tBRefundInstanceManager.createNewInstance(context, viewGroup, str, bVar);
    }

    @JvmStatic
    public static final void reportRumInRefundList(boolean z, View view) {
        tz8 tz8Var;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db8d096", new Object[]{new Boolean(z), view});
            return;
        }
        TBRefundInstanceManager tBRefundInstanceManager = INSTANCE;
        if (tBRefundInstanceManager.getEnableReportRumInRefundList() && view != null && (tz8Var = FalcoGlobalTracer.get()) != null) {
            u h2 = tz8Var.h();
            u.a aVar = new u.a();
            aVar.f10480a = view.hashCode();
            aVar.b = "refundList";
            aVar.c = tBRefundInstanceManager.getDefaultRefundUrl();
            if (z) {
                str = "popOver";
            } else {
                str = "back";
            }
            aVar.d = str;
            h2.e(aVar);
            h2.b(aVar);
        }
    }

    private final void setCustomStartTime(WeexInstance weexInstance, String str) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8644f00b", new Object[]{this, weexInstance, str});
            return;
        }
        if (!(weexInstance == null || str == null || str.length() == 0)) {
            try {
                WeexApmCustomData weexApmCustomData = new WeexApmCustomData();
                Long o = ssq.o(str);
                if (o != null) {
                    j = o.longValue();
                } else {
                    j = System.currentTimeMillis();
                }
                weexApmCustomData.setWxCustomStartTimeStamp(j);
                weexInstance.setWeexApmCustomData(weexApmCustomData);
            } catch (Throwable unused) {
            }
        }
    }

    public static final void setNetStart(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63727046", new Object[]{new Boolean(z)});
        } else {
            isNetStart = z;
        }
    }

    public final void addInstanceView(Context context, ViewGroup viewGroup, WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a8ae083", new Object[]{this, context, viewGroup, weexInstance});
            return;
        }
        ckf.g(context, "context");
        ckf.g(viewGroup, "rootView");
        if (weexInstance != null) {
            try {
                weexInstance.resetContext(context);
                View rootView = weexInstance.getRootView();
                ckf.f(rootView, "instance.rootView");
                if (rootView.getParent() != null) {
                    View rootView2 = weexInstance.getRootView();
                    ckf.f(rootView2, "instance.rootView");
                    ViewParent parent = rootView2.getParent();
                    if (!(parent instanceof ViewGroup)) {
                        parent = null;
                    }
                    ViewGroup viewGroup2 = (ViewGroup) parent;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(weexInstance.getRootView());
                    }
                }
                viewGroup.addView(weexInstance.getRootView());
            } catch (Exception e2) {
                e2.printStackTrace();
                m8v.a(e2);
            }
        }
    }

    public final String getDefaultRefundUrl() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("63f0496d", new Object[]{this});
        } else {
            value = defaultRefundUrl$delegate.getValue();
        }
        return (String) value;
    }

    public final String getNetStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41367451", new Object[]{this});
        }
        return netStartTime;
    }

    public final JSONObject getRefundResponseData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b27d0c40", new Object[]{this});
        }
        return refundResponseData;
    }

    public final WeexInstance getTemporaryInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("c99e57fd", new Object[]{this});
        }
        return temporaryInstance;
    }

    public final void setNetStartTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76368a45", new Object[]{this, str});
        } else {
            netStartTime = str;
        }
    }

    public final void setRefundResponseData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97591344", new Object[]{this, jSONObject});
        } else {
            refundResponseData = jSONObject;
        }
    }

    public final void setTemporaryInstance(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("489e8329", new Object[]{this, weexInstance});
        } else {
            temporaryInstance = weexInstance;
        }
    }

    @TradeHybridCustomAnnotation
    @JvmStatic
    public static final void hybridStage(Activity activity, String str, String str2, Map<?, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85f70396", new Object[]{activity, str, str2, map});
        } else if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enableHybridStage", true) && lbv.a(str, str2)) {
            hav.d(TAG, "hybridStage: " + str2 + '_' + str);
            if (activity != null && str2 != null && str != null && str2.hashCode() == 120528346 && str2.equals("mytaobao") && ckf.b(str, UltronTradeHybridStage.ON_CONTAINER_RESUME)) {
                pav.k(e.INSTANCE);
            }
        }
    }

    private final void onNetFail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2d24603", new Object[]{this});
            return;
        }
        isNetStart = false;
        hav.d(TAG, "step3 : 请求失败了，不处理");
        if (temporaryInstance != null) {
            try {
                WeexInstanceStatus weexInstanceStatus = WeexInstanceStatus.DESTROYED;
                WeexInstance weexInstance = temporaryInstance;
                if (weexInstanceStatus.equals(weexInstance != null ? weexInstance.getInstanceStatus() : null)) {
                    hav.d(TAG, "step4 : 实例已经被销毁了");
                } else {
                    hav.d(TAG, "step4 : 请求在实例创建之后回来了,且失败了");
                    WeexInstance weexInstance2 = temporaryInstance;
                    if (weexInstance2 != null) {
                        WeexEventTarget weexEventTarget = WeexEventTarget.DOCUMENT_TARGET;
                        o9x c2 = o9x.c();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put((JSONObject) "dataType", "net");
                        xhv xhvVar = xhv.INSTANCE;
                        weexInstance2.dispatchEvent(weexEventTarget, "preload.background", c2.b(jSONObject));
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                m8v.a(e2);
            }
            temporaryInstance = null;
        }
    }

    private final void onNetSuccess(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("660d0b84", new Object[]{this, jSONObject});
            return;
        }
        if (temporaryInstance != null) {
            isNetStart = false;
            try {
                WeexInstanceStatus weexInstanceStatus = WeexInstanceStatus.DESTROYED;
                WeexInstance weexInstance = temporaryInstance;
                if (weexInstanceStatus.equals(weexInstance != null ? weexInstance.getInstanceStatus() : null)) {
                    hav.d(TAG, "step3 : 实例已经被销毁了");
                } else {
                    hav.d(TAG, "step3 : 请求在实例创建之后回来了,且数据不相同，再传一次");
                    WeexInstance weexInstance2 = temporaryInstance;
                    if (weexInstance2 != null) {
                        WeexEventTarget weexEventTarget = WeexEventTarget.DOCUMENT_TARGET;
                        o9x c2 = o9x.c();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put((JSONObject) "dataType", "net");
                        jSONObject2.put((JSONObject) "responseData", (String) jSONObject);
                        jSONObject2.put((JSONObject) "netStartTime", netStartTime);
                        xhv xhvVar = xhv.INSTANCE;
                        weexInstance2.dispatchEvent(weexEventTarget, "preload.background", c2.b(jSONObject2));
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                m8v.a(e2);
            }
            temporaryInstance = null;
        } else {
            hav.d(TAG, "step3 : 实例还未获取，暂存网络数据");
            refundResponseData = jSONObject;
        }
        pav.k(new f(jSONObject));
    }

    @JvmStatic
    public static final void startPreRequestOnIdle(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c70d9060", new Object[]{context});
        } else if (getEnablePreRequest() && context != null) {
            netStartTime = String.valueOf(System.currentTimeMillis());
            isNetStart = true;
            hav.d(TAG, "step1 : 导航阶段发起预请求: ");
            temporaryInstance = null;
            refundResponseData = null;
            pav.k(new h(context));
        }
    }

    public final void prepareReloadInstance(b bVar, WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea06182", new Object[]{this, bVar, weexInstance});
            return;
        }
        ckf.g(bVar, "refundParams");
        if (weexInstance != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (getEnablePreRequest()) {
                    String str = netStartTime;
                    if (str != null) {
                        jSONObject.put((JSONObject) "netStartTime", str);
                    }
                    if (refundResponseData != null) {
                        isNetStart = false;
                        hav.d(TAG, "step2 : 网络请求已经开始，有预热实例存在的情况，路由请求已经回来了，传真实数据");
                        jSONObject.put((JSONObject) "dataType", "net");
                        jSONObject.put((JSONObject) "responseData", (String) refundResponseData);
                    } else {
                        hav.d(TAG, "step2 : 网络请求已经开始，有预热实例存在的情况，路由请求没有回来，并且临时实例存起来");
                        if (!isNetStart) {
                            jSONObject.put((JSONObject) "dataType", "net");
                        } else {
                            temporaryInstance = weexInstance;
                        }
                    }
                }
                jSONObject.put((JSONObject) "jt_pt_navStartTime", bVar.a());
                jSONObject.put((JSONObject) "isFragment", String.valueOf(bVar.c()));
                String b2 = bVar.b();
                if (!(b2 == null || b2.length() == 0)) {
                    jSONObject.put((JSONObject) "openFrom", bVar.b());
                    weexInstance.dispatchEvent(WeexEventTarget.DOCUMENT_TARGET, "preload.update", o9x.c().b(jSONObject));
                }
                jSONObject.put((JSONObject) "openFrom", "other");
                weexInstance.dispatchEvent(WeexEventTarget.DOCUMENT_TARGET, "preload.update", o9x.c().b(jSONObject));
            } catch (Exception e2) {
                e2.printStackTrace();
                m8v.a(e2);
            }
        }
    }

    private final void startNormalRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("674ec7ed", new Object[]{this});
            return;
        }
        p9b.a aVar = p9b.Companion;
        pbv a2 = new pbv.b().c("mtop.com.alibaba.refundface2.disputeservice.renderlist.noultron").d("1.0").i(true).j(false).f(true).g(true).h("UNIT_TRADE").e(JSON.parseObject("{'curPage':'1','inThirtyDays':'false','pageSize':'10','terminal':'wireless'}")).a();
        ckf.f(a2, "UltronTradeHybridMTopMod…l':'wireless'}\")).build()");
        aVar.p(a2, null, "refundList", false, new g());
    }

    @JvmStatic
    public static final void startRPCRequest(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620eedb5", new Object[]{context});
            return;
        }
        ckf.g(context, "context");
        if (getEnablePreRequest()) {
            qho qhoVar = new qho(context, "nextrpc-TM2");
            u55 u55Var = new u55(false, context);
            u3o u3oVar = new u3o(context);
            u3oVar.a("mtop.com.alibaba.refundface2.disputeservice.renderlist.noultron");
            u3oVar.I("1.0");
            u3oVar.H(false);
            u3oVar.B(true);
            u3oVar.w(true);
            u3oVar.x(true);
            u3oVar.b("refundList-nextRpc");
            u3oVar.G("UNIT_TRADE");
            u3oVar.A(kotlin.collections.a.i(jpu.a("curPage", "1"), jpu.a("inThirtyDays", "false"), jpu.a("pageSize", "10"), jpu.a("terminal", "wireless")));
            xhv xhvVar = xhv.INSTANCE;
            qhoVar.b(qhoVar.a(context, u55Var, u3oVar), context, new i());
        }
    }

    static {
        t2o.a(713031950);
        if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enableRegisterPreRequestCallback", true)) {
            qbv j = qbv.j();
            ckf.f(j, "UltronTradeHybridManager.getInstance()");
            j.p().g(new a());
        }
        useSurfaceView = HybridPreRenderHelper.Companion.i();
        enablePreRequest$delegate = kotlin.a.b(TBRefundInstanceManager$enablePreRequest$2.INSTANCE);
        enableReportRumInRefundList$delegate = kotlin.a.b(TBRefundInstanceManager$enableReportRumInRefundList$2.INSTANCE);
        enableDispatchVisibilityState$delegate = kotlin.a.b(TBRefundInstanceManager$enableDispatchVisibilityState$2.INSTANCE);
    }
}
