package com.alibaba.android.ultron.vfw.weex2.ability;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.TradeHybridTMSFragment;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsTradeHybridAbility;
import com.taobao.android.abilityidl.ability.TradeHybridFailureResult;
import com.taobao.android.abilityidl.ability.TradeHybridSuccessResult;
import com.taobao.android.weex.instance.WeexDOMInstance;
import com.taobao.android.weex_uikit.widget.video.c;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.h6e;
import tb.hav;
import tb.jdb;
import tb.k2e;
import tb.kdb;
import tb.ldb;
import tb.m2e;
import tb.ncu;
import tb.pav;
import tb.pcu;
import tb.qbv;
import tb.qcu;
import tb.qxq;
import tb.rcu;
import tb.rgv;
import tb.ssq;
import tb.t2o;
import tb.tvh;
import tb.v9v;
import tb.wsq;
import tb.xcv;
import tb.xhv;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/alibaba/android/ultron/vfw/weex2/ability/TradeHybridAbility;", "Lcom/taobao/android/abilityidl/ability/AbsTradeHybridAbility;", "<init>", "()V", "Ltb/kdb;", "context", "Ltb/qcu;", "params", "Ltb/jdb;", "callback", "Ltb/xhv;", "notifyStage", "(Ltb/kdb;Ltb/qcu;Ltb/jdb;)V", "Ltb/ncu;", "notifyBizLifecycle", "(Ltb/kdb;Ltb/ncu;Ltb/jdb;)V", "Ltb/pcu;", "Ltb/k2e;", "onBindPreData", "(Ltb/kdb;Ltb/pcu;Ltb/k2e;)V", "Ltb/rcu;", "Ltb/m2e;", "unexpectedReachDone", "(Ltb/kdb;Ltb/rcu;Ltb/m2e;)V", "unexpectedReachMark", "Companion", "a", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TradeHybridAbility extends AbsTradeHybridAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(157286808);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "run", "()V", "com/alibaba/android/ultron/vfw/weex2/ability/TradeHybridAbility$$special$$inlined$let$lambda$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f2367a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public b(JSONObject jSONObject, String str, String str2) {
            this.f2367a = jSONObject;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                qbv.j().a(this.b, this.c, this.f2367a);
            }
        }
    }

    static {
        t2o.a(157286807);
    }

    public static /* synthetic */ Object ipc$super(TradeHybridAbility tradeHybridAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/ability/TradeHybridAbility");
    }

    public final List<Fragment> a(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ec67e5f", new Object[]{this, fragmentActivity});
        }
        try {
            ArrayList arrayList = new ArrayList();
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            ckf.f(supportFragmentManager, "act.supportFragmentManager");
            for (Fragment fragment : supportFragmentManager.getFragments()) {
                if (fragment != null) {
                    arrayList.add(fragment);
                    List<Fragment> b2 = b(fragment);
                    if (!b2.isEmpty()) {
                        arrayList.addAll(b2);
                    }
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return yz3.i();
        }
    }

    public final List<Fragment> b(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d8fc46b", new Object[]{this, fragment});
        }
        try {
            ArrayList arrayList = new ArrayList();
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            ckf.f(childFragmentManager, "f.childFragmentManager");
            for (Fragment fragment2 : childFragmentManager.getFragments()) {
                if (fragment2 != null) {
                    arrayList.add(fragment2);
                    List<Fragment> b2 = b(fragment2);
                    if (!b2.isEmpty()) {
                        arrayList.addAll(b2);
                    }
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return yz3.i();
        }
    }

    public final h6e c(Context context) {
        Fragment fragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6e) ipChange.ipc$dispatch("54c814bb", new Object[]{this, context});
        }
        try {
            if (!(context instanceof FragmentActivity)) {
                return null;
            }
            FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            if (context instanceof UltronTradeHybridActivity) {
                fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer);
            } else {
                fragment = supportFragmentManager.findFragmentByTag(UltronWeex2DialogFragment.FRAGMENT_TAG);
                if (fragment == null) {
                    fragment = supportFragmentManager.findFragmentByTag(TradeHybridTMSFragment.TMS_FRAGMENT_TAG);
                }
            }
            if (fragment instanceof h6e) {
                return (h6e) fragment;
            }
            hav.g("TradeHybridAbility", "getCurrentContainer:", "fragment is not a TradeHybridBaseFragment");
            return null;
        } catch (Throwable th) {
            hav.g("TradeHybridAbility", "getCurrentContainer:", "error:" + th);
            return null;
        }
    }

    public final String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f41ac2", new Object[]{this, str});
        }
        switch (str.hashCode()) {
            case -1958322525:
                if (str.equals("ON_NAV")) {
                    return UltronTradeHybridStage.ON_NAV;
                }
                break;
            case -1946079196:
                if (str.equals("ON_MTOP_END")) {
                    return UltronTradeHybridStage.ON_MTOP_END;
                }
                break;
            case -1858225813:
                if (str.equals("ON_MTOP_START")) {
                    return UltronTradeHybridStage.ON_MTOP_START;
                }
                break;
            case -1751682830:
                if (str.equals("ON_RENDER_END")) {
                    return UltronTradeHybridStage.ON_RENDER_END;
                }
                break;
            case -1746197992:
                if (str.equals("ON_CONTAINER_PAUSE")) {
                    return UltronTradeHybridStage.ON_CONTAINER_PAUSE;
                }
                break;
            case -1461108406:
                if (str.equals("ON_VIEW_SCROLL_START")) {
                    return UltronTradeHybridStage.ON_VIEW_SCROLL_START;
                }
                break;
            case -765779005:
                if (str.equals("ON_VIEW_SCROLL_END")) {
                    return UltronTradeHybridStage.ON_VIEW_SCROLL_END;
                }
                break;
            case -711452772:
                if (str.equals("ON_CONTAINER_DESTROY")) {
                    return UltronTradeHybridStage.ON_CONTAINER_DESTROY;
                }
                break;
            case -412890185:
                if (str.equals("ON_DATA_PRE_LOAD")) {
                    return UltronTradeHybridStage.ON_DATA_PRE_LOAD;
                }
                break;
            case -301818085:
                if (str.equals("ON_VIEW_SCROLLING")) {
                    return UltronTradeHybridStage.ON_VIEW_SCROLLING;
                }
                break;
            case 42599738:
                if (str.equals("ON_CONFIRM_SUCCESS_FLOAT_CLOSE")) {
                    return UltronTradeHybridStage.ON_CONFIRM_SUCCESS_FLOAT_CLOSE;
                }
                break;
            case 273088185:
                if (str.equals("ON_RENDER_START")) {
                    return UltronTradeHybridStage.ON_RENDER_START;
                }
                break;
            case 956533918:
                if (str.equals("ON_MEMORY_WARNING")) {
                    return UltronTradeHybridStage.ON_MEMORY_WARNING;
                }
                break;
            case 1345464570:
                if (str.equals("ON_CONTAINER_CREATE")) {
                    return UltronTradeHybridStage.ON_CONTAINER_CREATE;
                }
                break;
            case 1763332139:
                if (str.equals("ON_CONTAINER_RESUME")) {
                    return UltronTradeHybridStage.ON_CONTAINER_RESUME;
                }
                break;
            case 2021187065:
                if (str.equals("ON_EVENT_CHAIN_AFTER")) {
                    return UltronTradeHybridStage.ON_EVENT_CHAIN_AFTER;
                }
                break;
        }
        return "";
    }

    @Override // com.taobao.android.abilityidl.ability.AbsTradeHybridAbility
    public void notifyBizLifecycle(kdb kdbVar, ncu ncuVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61c256dc", new Object[]{this, kdbVar, ncuVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(ncuVar, "params");
        ckf.g(jdbVar, "callback");
        Object userContext = kdbVar.getUserContext();
        if (userContext != null) {
            try {
                if (!(userContext instanceof HashMap)) {
                    hav.g("TradeHybridAbility", "notifyBizLifecycle:", "context not find");
                    return;
                }
                if (((Map) userContext).containsKey("instance") && (((Map) userContext).get("instance") instanceof WeexDOMInstance)) {
                    Object obj = ((Map) userContext).get("instance");
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex.instance.WeexDOMInstance");
                    } else if (((WeexDOMInstance) obj).getAdapterMUSInstance() instanceof com.taobao.android.weex_framework.a) {
                        Object obj2 = ((Map) userContext).get("instance");
                        if (obj2 != null) {
                            tvh adapterMUSInstance = ((WeexDOMInstance) obj2).getAdapterMUSInstance();
                            if (adapterMUSInstance != null) {
                                Object tag = adapterMUSInstance.getTag("bizLifecycleListener");
                                if (!(tag instanceof xcv)) {
                                    hav.g("TradeHybridAbility", "notifyBizLifecycle:", "listener is not a UltronWeex2BizLifecycleListener");
                                    return;
                                } else {
                                    ((xcv) tag).S();
                                    return;
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_framework.MUSInstance");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex.instance.WeexDOMInstance");
                        }
                    }
                }
                hav.g("TradeHybridAbility", "notifyBizLifecycle:", "MUSInstance not find");
            } catch (Throwable th) {
                hav.g("TradeHybridAbility", "notifyBizLifecycle:", "t: " + th);
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsTradeHybridAbility
    public void notifyStage(kdb kdbVar, qcu qcuVar, jdb jdbVar) {
        Long o;
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdcd6016", new Object[]{this, kdbVar, qcuVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(qcuVar, "params");
        ckf.g(jdbVar, "callback");
        hav.g("TradeHybridAbility", "notifyStage:", "before call uni");
        String f = f(qcuVar.f26673a);
        String str = qcuVar.b;
        if (!wsq.a0(f) && !wsq.a0(str)) {
            JSONObject jSONObject = new JSONObject();
            ldb a2 = kdbVar.a();
            if (!(a2 == null || (context = a2.getContext()) == null)) {
                jSONObject.put("context", (Object) context);
            }
            Map<String, ? extends Object> map = qcuVar.c;
            if (map != null) {
                jSONObject.putAll(map);
                Object obj = map.get(c.ATTR_DELAY_TIME);
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (!(str2 == null || (o = ssq.o(str2)) == null)) {
                    pav.i(new b(jSONObject, f, str), o.longValue());
                    return;
                }
            }
            hav.g("TradeHybridAbility", "notifyStage:", "after call uni");
            qbv.j().a(f, str, jSONObject);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsTradeHybridAbility
    public void onBindPreData(kdb kdbVar, pcu pcuVar, k2e k2eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc6a2807", new Object[]{this, kdbVar, pcuVar, k2eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(pcuVar, "params");
        ckf.g(k2eVar, "callback");
        Object userContext = kdbVar.getUserContext();
        if (userContext != null) {
            try {
                if (!(userContext instanceof HashMap)) {
                    TradeHybridFailureResult tradeHybridFailureResult = new TradeHybridFailureResult();
                    tradeHybridFailureResult.msg = "userContext is invalid";
                    xhv xhvVar = xhv.INSTANCE;
                    k2eVar.e(tradeHybridFailureResult);
                    hav.g("TradeHybridAbility", "onBindPreData:", "context not find");
                    return;
                }
                if (((Map) userContext).containsKey("instance") && (((Map) userContext).get("instance") instanceof WeexDOMInstance)) {
                    Object obj = ((Map) userContext).get("instance");
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex.instance.WeexDOMInstance");
                    } else if (((WeexDOMInstance) obj).getAdapterMUSInstance() instanceof com.taobao.android.weex_framework.a) {
                        Object obj2 = ((Map) userContext).get("instance");
                        if (obj2 != null) {
                            tvh adapterMUSInstance = ((WeexDOMInstance) obj2).getAdapterMUSInstance();
                            if (adapterMUSInstance != null) {
                                qbv j = qbv.j();
                                ckf.f(j, "UltronTradeHybridManager.getInstance()");
                                j.p().f(adapterMUSInstance, pcuVar);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_framework.MUSInstance");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex.instance.WeexDOMInstance");
                    }
                }
                TradeHybridFailureResult tradeHybridFailureResult2 = new TradeHybridFailureResult();
                tradeHybridFailureResult2.msg = "instance is invalid";
                xhv xhvVar2 = xhv.INSTANCE;
                k2eVar.e(tradeHybridFailureResult2);
                hav.g("TradeHybridAbility", "onBindPreData:", "MUSInstance not find");
            } catch (Throwable th) {
                TradeHybridFailureResult tradeHybridFailureResult3 = new TradeHybridFailureResult();
                tradeHybridFailureResult3.msg = "throwable!";
                xhv xhvVar3 = xhv.INSTANCE;
                k2eVar.e(tradeHybridFailureResult3);
                hav.g("TradeHybridAbility", "onBindPreData:", "t: " + th);
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsTradeHybridAbility
    public void unexpectedReachDone(kdb kdbVar, rcu rcuVar, m2e m2eVar) {
        Context context;
        rgv rgvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1565fe3a", new Object[]{this, kdbVar, rcuVar, m2eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(rcuVar, "params");
        ckf.g(m2eVar, "callback");
        try {
            ldb a2 = kdbVar.a();
            if (a2 != null && (context = a2.getContext()) != null) {
                h6e c = c(context);
                if (c == null) {
                    c = d(context);
                }
                if (c == null || (rgvVar = c.M0()) == null) {
                    rgvVar = e(kdbVar);
                }
                if (rgvVar == null) {
                    TradeHybridFailureResult tradeHybridFailureResult = new TradeHybridFailureResult();
                    tradeHybridFailureResult.msg = "unexpectedReachMonitor is null";
                    xhv xhvVar = xhv.INSTANCE;
                    m2eVar.e(tradeHybridFailureResult);
                    return;
                }
                Map<String, ? extends Object> map = rcuVar.f27284a;
                Object obj = null;
                Object obj2 = map != null ? map.get("success") : null;
                if (!(obj2 instanceof Boolean)) {
                    TradeHybridFailureResult tradeHybridFailureResult2 = new TradeHybridFailureResult();
                    tradeHybridFailureResult2.msg = "param_success is error";
                    xhv xhvVar2 = xhv.INSTANCE;
                    m2eVar.e(tradeHybridFailureResult2);
                    return;
                }
                rgvVar.p(((Boolean) obj2).booleanValue());
                if (!((Boolean) obj2).booleanValue()) {
                    Map<String, ? extends Object> map2 = rcuVar.f27284a;
                    if (map2 != null) {
                        obj = map2.get("message");
                    }
                    if ((obj instanceof String) && ((CharSequence) obj).length() != 0) {
                        rgvVar.o((String) obj);
                    }
                    TradeHybridFailureResult tradeHybridFailureResult3 = new TradeHybridFailureResult();
                    tradeHybridFailureResult3.msg = "param_message is error";
                    xhv xhvVar3 = xhv.INSTANCE;
                    m2eVar.e(tradeHybridFailureResult3);
                    return;
                }
                TradeHybridSuccessResult tradeHybridSuccessResult = new TradeHybridSuccessResult();
                tradeHybridSuccessResult.data = new JSONObject();
                xhv xhvVar4 = xhv.INSTANCE;
                m2eVar.h(tradeHybridSuccessResult);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            TradeHybridFailureResult tradeHybridFailureResult4 = new TradeHybridFailureResult();
            tradeHybridFailureResult4.msg = "set message error";
            xhv xhvVar5 = xhv.INSTANCE;
            m2eVar.e(tradeHybridFailureResult4);
        }
    }

    public final h6e d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6e) ipChange.ipc$dispatch("acb3bab9", new Object[]{this, context});
        }
        try {
            if (!(v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_UNEXPECTED_REACH, "enableGetContainerByFm", true) && (context instanceof FragmentActivity))) {
                return null;
            }
            List<Fragment> a2 = a((FragmentActivity) context);
            List<Fragment> list = a2;
            if (list != null && !list.isEmpty()) {
                for (Fragment fragment : a2) {
                    if (fragment instanceof h6e) {
                        return (h6e) fragment;
                    }
                }
                hav.g("TradeHybridAbility", "getExternalContainer:", "fragment not IUnexpectedReachHost");
                return null;
            }
            hav.g("TradeHybridAbility", "getExternalContainer:", "fragment list is empty");
            return null;
        } catch (Throwable th) {
            hav.g("TradeHybridAbility", "getExternalContainer:", "error:" + th);
            return null;
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsTradeHybridAbility
    public void unexpectedReachMark(kdb kdbVar, rcu rcuVar, m2e m2eVar) {
        Context context;
        Map<String, ? extends Object> map;
        rgv rgvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e08eb045", new Object[]{this, kdbVar, rcuVar, m2eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(rcuVar, "params");
        ckf.g(m2eVar, "callback");
        try {
            ldb a2 = kdbVar.a();
            if (!(a2 == null || (context = a2.getContext()) == null || (map = rcuVar.f27284a) == null)) {
                h6e c = c(context);
                if (c == null) {
                    c = d(context);
                }
                if (c == null || (rgvVar = c.M0()) == null) {
                    rgvVar = e(kdbVar);
                }
                if (rgvVar == null) {
                    TradeHybridFailureResult tradeHybridFailureResult = new TradeHybridFailureResult();
                    tradeHybridFailureResult.msg = "unexpectedReachMonitor is null";
                    xhv xhvVar = xhv.INSTANCE;
                    m2eVar.e(tradeHybridFailureResult);
                    return;
                }
                for (int i = 1; i <= 9; i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('c');
                    sb.append(i);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append('d');
                    sb3.append(i);
                    String sb4 = sb3.toString();
                    Object obj = map.get(sb2);
                    Object obj2 = map.get(sb4);
                    if (obj instanceof String) {
                        rgvVar.t(sb2, (String) obj);
                    }
                    if (obj2 instanceof String) {
                        rgvVar.s(sb4, (String) obj2);
                    }
                }
                TradeHybridSuccessResult tradeHybridSuccessResult = new TradeHybridSuccessResult();
                tradeHybridSuccessResult.data = new JSONObject();
                xhv xhvVar2 = xhv.INSTANCE;
                m2eVar.h(tradeHybridSuccessResult);
            }
        } catch (Throwable th) {
            th.toString();
            TradeHybridFailureResult tradeHybridFailureResult2 = new TradeHybridFailureResult();
            tradeHybridFailureResult2.msg = "update indicator error";
            xhv xhvVar3 = xhv.INSTANCE;
            m2eVar.e(tradeHybridFailureResult2);
        }
    }

    public final rgv e(kdb kdbVar) {
        Context context;
        String str;
        rgv rgvVar;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgv) ipChange.ipc$dispatch("1e72c3e4", new Object[]{this, kdbVar});
        }
        if (!v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_UNEXPECTED_REACH, "enableGetSubPageMonitor", true)) {
            return null;
        }
        try {
            ldb a2 = kdbVar.a();
            if (!(a2 == null || (context = a2.getContext()) == null)) {
                ldb a3 = kdbVar.a();
                if (a3 == null || (str = a3.getBusinessID()) == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    return null;
                }
                if (context instanceof h6e) {
                    rgvVar = ((h6e) context).D0(str);
                } else {
                    if (context instanceof FragmentActivity) {
                        ISupportFragment h = qxq.h(((FragmentActivity) context).getSupportFragmentManager());
                        if (h instanceof h6e) {
                            rgvVar = ((h6e) h).D0(str);
                        }
                    }
                    rgvVar = null;
                }
                StringBuilder sb = new StringBuilder("hit branch, valid? ");
                if (rgvVar == null) {
                    z = false;
                }
                sb.append(z);
                hav.g("TradeHybridAbility", "getSubPageUnexpectedReachMonitor:", sb.toString());
                return rgvVar;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
