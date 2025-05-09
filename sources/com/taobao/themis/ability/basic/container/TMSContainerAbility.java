package com.taobao.themis.ability.basic.container;

import android.net.Uri;
import android.os.Looper;
import android.taobao.windvane.export.cache.memory.MemoryResWarmupManager;
import android.taobao.windvane.export.cache.memory.model.ResourceItemModel;
import android.view.View;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsContainerAbility;
import com.taobao.android.abilityidl.ability.ContainerPosition;
import com.taobao.android.abilityidl.ability.ContainerSwiperSwitchDetail;
import com.taobao.android.abilityidl.ability.ContainerTabSwitchDetail;
import com.taobao.android.abilityidl.ability.ContainerWindowSize;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.QueryPass;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import tb.a7d;
import tb.an4;
import tb.aud;
import tb.bbs;
import tb.ckf;
import tb.cqc;
import tb.dn4;
import tb.dyd;
import tb.eas;
import tb.en4;
import tb.ges;
import tb.hl4;
import tb.i04;
import tb.il4;
import tb.jdb;
import tb.jn4;
import tb.kab;
import tb.kdb;
import tb.kn4;
import tb.ln4;
import tb.ml4;
import tb.mm4;
import tb.mn4;
import tb.pm4;
import tb.pn4;
import tb.q9s;
import tb.qbs;
import tb.qml;
import tb.rn4;
import tb.rqb;
import tb.s7d;
import tb.sm4;
import tb.sn4;
import tb.sqb;
import tb.t2o;
import tb.tll;
import tb.tn4;
import tb.tqb;
import tb.un4;
import tb.unl;
import tb.vm4;
import tb.vn4;
import tb.vu3;
import tb.w5d;
import tb.wn4;
import tb.wsq;
import tb.x5d;
import tb.xcs;
import tb.xqb;
import tb.xqs;
import tb.yqb;
import tb.ytd;
import tb.zbd;
import tb.zm4;
import tb.zqb;
import tb.ztd;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\rJ'\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010\"\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010#J'\u0010%\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010&J'\u0010(\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b(\u0010)J'\u0010+\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010,J'\u0010.\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020-2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010/J'\u00101\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u0002002\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b1\u00102J'\u00104\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u0002032\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J'\u0010:\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u0002092\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b:\u0010;J'\u0010=\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020<2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b=\u0010>J'\u0010@\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020?2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b@\u0010AJ'\u0010C\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020B2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010F\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GJ'\u0010I\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020H2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\bK\u0010\rJ'\u0010M\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020L2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\bM\u0010NJ'\u0010P\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020O2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\bP\u0010QJ'\u0010S\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020R2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\bS\u0010TJ'\u0010V\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020U2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\bV\u0010WJ'\u0010Y\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020X2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\bY\u0010ZJ'\u0010\\\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020[2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\\\u0010]J\u001f\u0010^\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b^\u0010\rJ'\u0010a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020_2\u0006\u0010\u0007\u001a\u00020`H\u0016¢\u0006\u0004\ba\u0010bJ\u001f\u0010c\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\bc\u0010\rJ\u001f\u0010e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020dH\u0016¢\u0006\u0004\be\u0010f¨\u0006g"}, d2 = {"Lcom/taobao/themis/ability/basic/container/TMSContainerAbility;", "Lcom/taobao/android/abilityidl/ability/AbsContainerAbility;", "<init>", "()V", "Ltb/kdb;", "context", "Ltb/sqb;", "callback", "Ltb/xhv;", "addPageResizeListener", "(Ltb/kdb;Ltb/sqb;)V", "Ltb/jdb;", "removePageResizeListener", "(Ltb/kdb;Ltb/jdb;)V", "hideErrorPage", "hideSwiperHeader", MUSMonitor.MODULE_DIM_ABILITY, "Ltb/zqb;", "addTabSwitchListener", "(Ltb/kdb;Ltb/zqb;)V", "removeTabSwitchListener", "Ltb/sn4;", "config", "showTab", "(Ltb/kdb;Ltb/sn4;Ltb/jdb;)V", "hideTab", "Ltb/wn4;", "params", "switchTab", "(Ltb/kdb;Ltb/wn4;Ltb/jdb;)V", "Ltb/sm4;", "preRenderSubPage", "(Ltb/kdb;Ltb/sm4;Ltb/jdb;)V", "Ltb/dn4;", "prewarmMultiResource", "(Ltb/kdb;Ltb/dn4;Ltb/jdb;)V", "Ltb/en4;", "prewarmResource", "(Ltb/kdb;Ltb/en4;Ltb/jdb;)V", "Ltb/pn4;", "reportSubPagePreRenderStatus", "(Ltb/kdb;Ltb/pn4;Ltb/jdb;)V", "Ltb/in4;", "setOrientation", "(Ltb/kdb;Ltb/in4;Ltb/jdb;)V", "Ltb/vn4;", "setTabBarMode", "(Ltb/kdb;Ltb/vn4;Ltb/jdb;)V", "Ltb/kn4;", "setTabBarItem", "(Ltb/kdb;Ltb/kn4;Ltb/jdb;)V", "Ltb/rn4;", "swizzleTab", "(Ltb/kdb;Ltb/rn4;Ltb/jdb;)V", "Ltb/yqb;", "interceptTabBarClick", "(Ltb/kdb;Ltb/yqb;)V", "Ltb/un4;", "setTabBarBadge", "(Ltb/kdb;Ltb/un4;Ltb/jdb;)V", "Ltb/tn4;", "removeTabBarBadge", "(Ltb/kdb;Ltb/tn4;Ltb/jdb;)V", "Ltb/an4;", "removeTabItem", "(Ltb/kdb;Ltb/an4;Ltb/jdb;)V", "Ltb/ym4;", "registerPage", "(Ltb/kdb;Ltb/ym4;Ltb/jdb;)V", "Ltb/xqb;", "addSwiperSwitchListener", "(Ltb/kdb;Ltb/xqb;)V", "Ltb/il4;", "addTabItem", "(Ltb/kdb;Ltb/il4;Ltb/jdb;)V", "removeSwiperSwitchListener", "Ltb/mn4;", "slideTo", "(Ltb/kdb;Ltb/mn4;Ltb/jdb;)V", "Ltb/ln4;", "showSwiperHeader", "(Ltb/kdb;Ltb/ln4;Ltb/jdb;)V", "Ltb/jn4;", "setSwiperEnable", "(Ltb/kdb;Ltb/jn4;Ltb/jdb;)V", "Ltb/hl4;", "addSwiperItem", "(Ltb/kdb;Ltb/hl4;Ltb/jdb;)V", "Ltb/zm4;", "removeSwiperItem", "(Ltb/kdb;Ltb/zm4;Ltb/jdb;)V", "Ltb/ml4;", "setPageBgColor", "(Ltb/kdb;Ltb/ml4;Ltb/jdb;)V", "showErrorPage", "Ltb/pm4;", "Ltb/rqb;", "interceptPageClose", "(Ltb/kdb;Ltb/pm4;Ltb/rqb;)V", "disableInterceptPageClose", "Ltb/tqb;", "requestContainerPosition", "(Ltb/kdb;Ltb/tqb;)V", "themis_ability_basic_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSContainerAbility extends AbsContainerAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArraySet<a7d.b> f13436a = new CopyOnWriteArraySet<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements qbs.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ sqb f13437a;

        public a(sqb sqbVar) {
            this.f13437a = sqbVar;
        }

        @Override // tb.qbs.a
        public void a(String str, JSON json) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f786e023", new Object[]{this, str, json});
                return;
            }
            ckf.g(str, "event");
            if (!(json instanceof JSONObject)) {
                this.f13437a.O(ErrorResult.a.e(null));
                return;
            }
            sqb sqbVar = this.f13437a;
            ContainerWindowSize containerWindowSize = new ContainerWindowSize();
            JSONObject jSONObject = (JSONObject) json;
            Double d = jSONObject.getDouble("windowWidth");
            if (d == null) {
                d = Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
            }
            containerWindowSize.width = d;
            Double d2 = jSONObject.getDouble("windowHeight");
            if (d2 == null) {
                d2 = Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
            }
            containerWindowSize.height = d2;
            sqbVar.R0(containerWindowSize);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements a7d.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ sqb f13438a;

        public b(sqb sqbVar) {
            this.f13438a = sqbVar;
        }

        @Override // tb.a7d.b
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db0f3109", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            sqb sqbVar = this.f13438a;
            ContainerWindowSize containerWindowSize = new ContainerWindowSize();
            containerWindowSize.width = Double.valueOf(i);
            containerWindowSize.height = Double.valueOf(i2);
            sqbVar.R0(containerWindowSize);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements aud {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xqb f13439a;

        public c(xqb xqbVar) {
            this.f13439a = xqbVar;
        }

        @Override // tb.aud
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40cb1832", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            ContainerSwiperSwitchDetail containerSwiperSwitchDetail = new ContainerSwiperSwitchDetail();
            containerSwiperSwitchDetail.tabIndex = Integer.valueOf(i);
            containerSwiperSwitchDetail.swiperIndex = Integer.valueOf(i2);
            this.f13439a.b0(containerSwiperSwitchDetail);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements xqs {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ yqb f13440a;

        public d(yqb yqbVar) {
            this.f13440a = yqbVar;
        }

        @Override // tb.xqs
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19ec391d", new Object[]{this, new Integer(i), str});
                return;
            }
            ContainerTabSwitchDetail containerTabSwitchDetail = new ContainerTabSwitchDetail();
            containerTabSwitchDetail.index = Integer.valueOf(i);
            containerTabSwitchDetail.result = Integer.valueOf(i);
            containerTabSwitchDetail.fromURL = str;
            this.f13440a.D0(containerTabSwitchDetail);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements jdb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f13441a;
        public final /* synthetic */ jdb b;

        public e(AtomicBoolean atomicBoolean, jdb jdbVar) {
            this.f13441a = atomicBoolean;
            this.b = jdbVar;
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
                return;
            }
            ckf.g(errorResult, "error");
            if (this.f13441a.compareAndSet(false, true)) {
                this.b.O(errorResult);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class f implements MemoryResWarmupManager.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jdb f13442a;

        public f(jdb jdbVar) {
            this.f13442a = jdbVar;
        }

        @Override // android.taobao.windvane.export.cache.memory.MemoryResWarmupManager.d
        public void a(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c845825", new Object[]{this, new Boolean(z), str});
            } else if (!z) {
                this.f13442a.O(ErrorResult.a.g(str));
            }
        }
    }

    static {
        t2o.a(830472203);
    }

    public static /* synthetic */ Object ipc$super(TMSContainerAbility tMSContainerAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/ability/basic/container/TMSContainerAbility");
    }

    public final bbs a(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("4dd79d5", new Object[]{this, kdbVar, jdbVar});
        }
        bbs g = CommonExtKt.g(kdbVar);
        if (g == null) {
            if (jdbVar != null) {
                jdbVar.O(ErrorResult.a.c("容器实例未找到"));
            }
            return null;
        } else if (g.O() != TMSContainerType.EMBEDDED) {
            return g;
        } else {
            if (jdbVar != null) {
                jdbVar.O(ErrorResult.a.b("容器能力未实现"));
            }
            return null;
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void addPageResizeListener(kdb kdbVar, sqb sqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("737b683d", new Object[]{this, kdbVar, sqbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(sqbVar, "callback");
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            sqbVar.O(ErrorResult.a.d(null));
            return;
        }
        a7d a7dVar = (a7d) h.getExtension(a7d.class);
        if (a7dVar == null) {
            sqbVar.O(ErrorResult.a.b(null));
        } else if (q9s.h0()) {
            b bVar = new b(sqbVar);
            a7dVar.r0(bVar);
            this.f13436a.add(bVar);
        } else {
            qbs.c(RVEvents.WINDOW_RESIZE, new a(sqbVar));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void addSwiperItem(kdb kdbVar, hl4 hl4Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f678da", new Object[]{this, kdbVar, hl4Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(hl4Var, "params");
        ckf.g(jdbVar, "callback");
        if (a(kdbVar, jdbVar) != null) {
            ITMSPage d2 = CommonExtKt.d(kdbVar, hl4Var.c);
            if (d2 == null) {
                jdbVar.O(ErrorResult.a.d("tab 页面没找到"));
                return;
            }
            ztd ztdVar = (ztd) d2.getExtension(ztd.class);
            if (ztdVar == null) {
                jdbVar.O(ErrorResult.a.b("swiper 页面没找到"));
            } else if (!ztdVar.v(hl4Var.f20718a, hl4Var.b)) {
                jdbVar.O(ErrorResult.a.g("add swiper item failed"));
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void addSwiperSwitchListener(kdb kdbVar, xqb xqbVar) {
        ytd ytdVar;
        List<aud> h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51e19b2b", new Object[]{this, kdbVar, xqbVar});
            return;
        }
        ckf.g(kdbVar, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(xqbVar, "params");
        bbs a2 = a(kdbVar, null);
        if (a2 != null && (ytdVar = (ytd) a2.getExtension(ytd.class)) != null && (h = ytdVar.h()) != null) {
            h.add(new c(xqbVar));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void addTabItem(kdb kdbVar, il4 il4Var, jdb jdbVar) {
        QueryPass queryPass;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79922569", new Object[]{this, kdbVar, il4Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(il4Var, "params");
        ckf.g(jdbVar, "callback");
        if (a(kdbVar, jdbVar) != null) {
            ITMSPage h = CommonExtKt.h(kdbVar);
            if (h == null) {
                jdbVar.O(ErrorResult.a.d(null));
                return;
            }
            dyd x = qml.x(h);
            if (x == null) {
                jdbVar.O(ErrorResult.a.e(null));
                return;
            }
            TabBarItem tabBarItem = new TabBarItem();
            tabBarItem.setPageId(il4Var.b);
            tabBarItem.setIconNormal(il4Var.c);
            tabBarItem.setIconSelected(il4Var.d);
            tabBarItem.setLabel(il4Var.f);
            vm4 vm4Var = il4Var.e;
            if (vm4Var == null) {
                queryPass = null;
            } else {
                queryPass = new QueryPass();
                queryPass.setAllow(vm4Var.f30098a);
                queryPass.setIgnore(vm4Var.b);
            }
            tabBarItem.setQueryPass(queryPass);
            if (!x.m(il4Var.f21375a, tabBarItem)) {
                jdbVar.O(ErrorResult.a.e(null));
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void addTabSwitchListener(kdb kdbVar, zqb zqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c85699", new Object[]{this, kdbVar, zqbVar});
            return;
        }
        ckf.g(kdbVar, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(zqbVar, "callback");
        if (a(kdbVar, zqbVar) != null) {
            ITMSPage h = CommonExtKt.h(kdbVar);
            if (h == null) {
                zqbVar.O(ErrorResult.a.d(null));
                return;
            }
            dyd x = qml.x(h);
            if (x == null) {
                zqbVar.O(ErrorResult.a.e(null));
            } else {
                x.C(new TMSContainerAbility$addTabSwitchListener$1(zqbVar));
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void disableInterceptPageClose(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff60cc41", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            jdbVar.O(ErrorResult.a.d(null));
        } else if (h.getExtension(w5d.class) == null) {
            jdbVar.O(ErrorResult.a.b("不支持回退拦截"));
        } else {
            kab kabVar = (kab) h.getExtension(kab.class);
            if (kabVar == null) {
                jdbVar.O(ErrorResult.a.b("不支持回退拦截"));
            } else {
                kabVar.H();
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void hideErrorPage(kdb kdbVar, jdb jdbVar) {
        x5d pageContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab17e47", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        bbs a2 = a(kdbVar, jdbVar);
        if (a2 != null) {
            a2.f0();
            ITMSPage h = CommonExtKt.h(kdbVar);
            if (h == null) {
                jdbVar.O(ErrorResult.a.d(null));
                return;
            }
            tll pageContext = h.getPageContext();
            if (pageContext != null && (pageContainer = pageContext.getPageContainer()) != null) {
                pageContainer.hideErrorView();
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void hideSwiperHeader(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("636012b9", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        if (a(kdbVar, jdbVar) != null) {
            ITMSPage h = CommonExtKt.h(kdbVar);
            if (h == null) {
                jdbVar.O(ErrorResult.a.d(null));
                return;
            }
            while (h != null) {
                ztd ztdVar = (ztd) h.getExtension(ztd.class);
                if (ztdVar != null) {
                    ztdVar.y0();
                    return;
                }
                s7d s7dVar = (s7d) h.getExtension(s7d.class);
                if (s7dVar == null) {
                    h = null;
                } else {
                    h = s7dVar.L0();
                }
            }
            jdbVar.O(ErrorResult.a.b(null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void hideTab(kdb kdbVar, sn4 sn4Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2f98697", new Object[]{this, kdbVar, sn4Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(sn4Var, "config");
        ckf.g(jdbVar, "callback");
        if (a(kdbVar, jdbVar) != null) {
            ITMSPage h = CommonExtKt.h(kdbVar);
            if (h == null) {
                jdbVar.O(ErrorResult.a.d(null));
                return;
            }
            dyd x = qml.x(h);
            if (x == null) {
                jdbVar.O(ErrorResult.a.e(null));
            } else {
                x.o();
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void interceptPageClose(kdb kdbVar, pm4 pm4Var, rqb rqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4383cbfd", new Object[]{this, kdbVar, pm4Var, rqbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(pm4Var, "params");
        ckf.g(rqbVar, "callback");
        ITMSPage h = CommonExtKt.h(kdbVar);
        TMSBackPressedType tMSBackPressedType = null;
        if (h == null) {
            rqbVar.O(ErrorResult.a.d(null));
            return;
        }
        if (q9s.N0()) {
            if (h.getInstance().a0() == TMSSolutionType.UNIAPP) {
                String d0 = h.getInstance().d0();
                ckf.f(d0, "page.getInstance().uniAppId");
                if (!q9s.Y3(d0)) {
                    rqbVar.O(ErrorResult.a.e("无权调用回退拦截"));
                    return;
                }
            } else if (!q9s.X3(h.c())) {
                rqbVar.O(ErrorResult.a.e("无权调用回退拦截"));
                return;
            }
        }
        if (h.getExtension(w5d.class) == null) {
            rqbVar.O(ErrorResult.a.b("不支持回退拦截"));
            return;
        }
        kab kabVar = (kab) h.getExtension(kab.class);
        if (kabVar == null) {
            rqbVar.O(ErrorResult.a.b("不支持回退拦截"));
            return;
        }
        String str = pm4Var.f26179a;
        if (ckf.b(str, "NAVBAR_BACK_BUTTON")) {
            tMSBackPressedType = TMSBackPressedType.TITLE_BAR_BACK_ACTION;
        } else if (ckf.b(str, "GESTURE")) {
            tMSBackPressedType = TMSBackPressedType.ON_KEY_DOWN;
        }
        kabVar.Y0(tMSBackPressedType, rqbVar);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void interceptTabBarClick(kdb kdbVar, yqb yqbVar) {
        dyd dydVar;
        dyd x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d02e4b78", new Object[]{this, kdbVar, yqbVar});
            return;
        }
        ckf.g(kdbVar, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(yqbVar, "params");
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h != null) {
            d dVar = new d(yqbVar);
            s7d s7dVar = (s7d) h.getExtension(s7d.class);
            ITMSPage L0 = s7dVar == null ? null : s7dVar.L0();
            if (L0 != null && (x = qml.x(L0)) != null) {
                x.m0(dVar);
                return;
            } else if (!(L0 == null || (dydVar = (dyd) L0.getExtension(dyd.class)) == null)) {
                dydVar.m0(dVar);
                return;
            }
        }
        yqbVar.O(ErrorResult.a.b("未找到 TabExtension"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void prewarmResource(kdb kdbVar, en4 en4Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c31d512", new Object[]{this, kdbVar, en4Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(en4Var, "params");
        ckf.g(jdbVar, "callback");
        ResourceItemModel resourceItemModel = new ResourceItemModel();
        resourceItemModel.src = en4Var.f18691a;
        resourceItemModel.mode = en4Var.c;
        resourceItemModel.type = en4Var.b;
        MemoryResWarmupManager.j(resourceItemModel, new f(jdbVar));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void removePageResizeListener(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de739dcd", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            jdbVar.O(ErrorResult.a.d(null));
            return;
        }
        a7d a7dVar = (a7d) h.getExtension(a7d.class);
        if (a7dVar == null) {
            jdbVar.O(ErrorResult.a.b(null));
        } else if (q9s.h0()) {
            for (a7d.b bVar : this.f13436a) {
                ckf.f(bVar, "item");
                a7dVar.Z0(bVar);
            }
            this.f13436a.clear();
        } else {
            qbs.d(RVEvents.WINDOW_RESIZE);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void removeSwiperItem(kdb kdbVar, zm4 zm4Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("844b28a6", new Object[]{this, kdbVar, zm4Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(zm4Var, "params");
        ckf.g(jdbVar, "callback");
        if (a(kdbVar, jdbVar) != null) {
            ITMSPage d2 = CommonExtKt.d(kdbVar, zm4Var.f32861a);
            if (d2 == null) {
                jdbVar.O(ErrorResult.a.d("tab 页面没找到"));
                return;
            }
            ztd ztdVar = (ztd) d2.getExtension(ztd.class);
            if (ztdVar == null) {
                jdbVar.O(ErrorResult.a.b("swiper 页面没找到"));
            } else if (!ztdVar.b0(zm4Var.b)) {
                jdbVar.O(ErrorResult.a.g("remove swiper item failed"));
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void removeSwiperSwitchListener(kdb kdbVar, jdb jdbVar) {
        List<aud> h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e784ab6", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(jdbVar, "callback");
        bbs a2 = a(kdbVar, jdbVar);
        if (a2 != null) {
            ytd ytdVar = (ytd) a2.getExtension(ytd.class);
            if (ytdVar == null || (h = ytdVar.h()) == null) {
                jdbVar.O(ErrorResult.a.b("容器能力未实现"));
            } else {
                h.clear();
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void removeTabBarBadge(kdb kdbVar, tn4 tn4Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e64b4c", new Object[]{this, kdbVar, tn4Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(tn4Var, "params");
        ckf.g(jdbVar, "callback");
        if (a(kdbVar, jdbVar) != null) {
            ITMSPage h = CommonExtKt.h(kdbVar);
            if (h == null) {
                jdbVar.O(ErrorResult.a.d(null));
                return;
            }
            dyd x = qml.x(h);
            if (x == null) {
                jdbVar.O(ErrorResult.a.e(null));
            } else if (!ckf.b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
                jdbVar.O(ErrorResult.a.f("this api must be called in the main thread"));
            } else if (!x.removeTabBarBadge(tn4Var.f28821a)) {
                jdbVar.O(ErrorResult.a.b("容器能力未实现"));
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void removeTabItem(kdb kdbVar, an4 an4Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7682cca", new Object[]{this, kdbVar, an4Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(an4Var, "params");
        ckf.g(jdbVar, "callback");
        if (a(kdbVar, jdbVar) != null) {
            ITMSPage h = CommonExtKt.h(kdbVar);
            if (h == null) {
                jdbVar.O(ErrorResult.a.d(null));
                return;
            }
            dyd x = qml.x(h);
            if (x == null) {
                jdbVar.O(ErrorResult.a.e(null));
            } else if (!x.removeTabItem(an4Var.f15864a)) {
                jdbVar.O(ErrorResult.a.e(null));
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void removeTabSwitchListener(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b4488b", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(jdbVar, "callback");
        if (a(kdbVar, jdbVar) != null) {
            ITMSPage h = CommonExtKt.h(kdbVar);
            if (h == null) {
                jdbVar.O(ErrorResult.a.d(null));
                return;
            }
            dyd x = qml.x(h);
            if (x == null) {
                jdbVar.O(ErrorResult.a.e(null));
            } else {
                x.Q0();
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void reportSubPagePreRenderStatus(kdb kdbVar, pn4 pn4Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef3e9f32", new Object[]{this, kdbVar, pn4Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(pn4Var, "params");
        ckf.g(jdbVar, "callback");
        bbs a2 = a(kdbVar, jdbVar);
        if (a2 != null) {
            if (TMSSolutionType.getType(a2) != TMSSolutionType.UNIAPP) {
                jdbVar.O(new ErrorResult("PRERENDER_UNKNOWN_SYSTEM_ERROR", "该 API 仅 UniApp 支持"));
                return;
            }
            zbd zbdVar = (zbd) a2.getExtension(zbd.class);
            if (zbdVar == null) {
                jdbVar.O(ErrorResult.a.b("仅UniApp支持预渲染"));
                return;
            }
            ITMSPage h = CommonExtKt.h(kdbVar);
            if (h == null) {
                jdbVar.O(ErrorResult.a.d(null));
            } else if (pn4Var.f26193a) {
                zbdVar.s(h);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        if (r6.equals("unknown") == false) goto L_0x008c;
     */
    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setOrientation(tb.kdb r5, tb.in4 r6, tb.jdb r7) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.themis.ability.basic.container.TMSContainerAbility.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "6e378c46"
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r5 = 2
            r2[r5] = r6
            r5 = 3
            r2[r5] = r7
            r0.ipc$dispatch(r1, r2)
            return
        L_0x001b:
            java.lang.String r0 = "context"
            tb.ckf.g(r5, r0)
            java.lang.String r0 = "params"
            tb.ckf.g(r6, r0)
            java.lang.String r0 = "callback"
            tb.ckf.g(r7, r0)
            com.taobao.themis.kernel.page.ITMSPage r5 = com.taobao.themis.kernel.utils.CommonExtKt.h(r5)
            r0 = 0
            if (r5 != 0) goto L_0x003a
            com.alibaba.ability.result.ErrorResult r5 = com.alibaba.ability.result.ErrorResult.a.d(r0)
            r7.O(r5)
            return
        L_0x003a:
            java.lang.Class<tb.l4d> r1 = tb.l4d.class
            java.lang.Object r5 = r5.getExtension(r1)
            tb.l4d r5 = (tb.l4d) r5
            if (r5 != 0) goto L_0x004c
            com.alibaba.ability.result.ErrorResult r5 = com.alibaba.ability.result.ErrorResult.a.b(r0)
            r7.O(r5)
            return
        L_0x004c:
            java.lang.String r6 = r6.f21444a
            if (r6 == 0) goto L_0x008c
            int r1 = r6.hashCode()
            switch(r1) {
                case -1626174665: goto L_0x007c;
                case -284840886: goto L_0x0072;
                case 729267099: goto L_0x0065;
                case 1430647483: goto L_0x0058;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x008c
        L_0x0058:
            java.lang.String r0 = "landscape"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0062
            goto L_0x008c
        L_0x0062:
            com.taobao.themis.kernel.container.Window$Orientation r0 = com.taobao.themis.kernel.container.Window.Orientation.LANDSCAPE
            goto L_0x0088
        L_0x0065:
            java.lang.String r0 = "portrait"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x006f
            goto L_0x008c
        L_0x006f:
            com.taobao.themis.kernel.container.Window$Orientation r0 = com.taobao.themis.kernel.container.Window.Orientation.PORTRAIT
            goto L_0x0088
        L_0x0072:
            java.lang.String r1 = "unknown"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0088
            goto L_0x008c
        L_0x007c:
            java.lang.String r0 = "unspecified"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0086
            goto L_0x008c
        L_0x0086:
            com.taobao.themis.kernel.container.Window$Orientation r0 = com.taobao.themis.kernel.container.Window.Orientation.UNSPECIFIED
        L_0x0088:
            r5.J0(r0)
            return
        L_0x008c:
            java.lang.String r5 = "orientation参数无法识别"
            com.alibaba.ability.result.ErrorResult r5 = com.alibaba.ability.result.ErrorResult.a.g(r5)
            r7.O(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.ability.basic.container.TMSContainerAbility.setOrientation(tb.kdb, tb.in4, tb.jdb):void");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void setPageBgColor(kdb kdbVar, ml4 ml4Var, jdb jdbVar) {
        x5d pageContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dbb7a8c", new Object[]{this, kdbVar, ml4Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(ml4Var, "params");
        ckf.g(jdbVar, "callback");
        if (a(kdbVar, jdbVar) != null) {
            ITMSPage h = CommonExtKt.h(kdbVar);
            if (h == null) {
                jdbVar.O(ErrorResult.a.d("容器页面未找到"));
                return;
            }
            String str = ml4Var.f24117a;
            tll pageContext = h.getPageContext();
            if (pageContext != null && (pageContainer = pageContext.getPageContainer()) != null) {
                pageContainer.setBgColor(str);
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void setSwiperEnable(kdb kdbVar, jn4 jn4Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee716d7c", new Object[]{this, kdbVar, jn4Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(jn4Var, "params");
        ckf.g(jdbVar, "callback");
        if (a(kdbVar, jdbVar) != null) {
            ITMSPage d2 = CommonExtKt.d(kdbVar, jn4Var.b);
            if (d2 == null) {
                jdbVar.O(ErrorResult.a.d("tab 页面没找到"));
                return;
            }
            ztd ztdVar = (ztd) d2.getExtension(ztd.class);
            if (ztdVar == null) {
                jdbVar.O(ErrorResult.a.b("swiper 页面没找到"));
            } else {
                ztdVar.k1(jn4Var.f22088a);
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void setTabBarBadge(kdb kdbVar, un4 un4Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37f1f940", new Object[]{this, kdbVar, un4Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(un4Var, "params");
        ckf.g(jdbVar, "callback");
        if (a(kdbVar, jdbVar) != null) {
            ITMSPage h = CommonExtKt.h(kdbVar);
            if (h == null) {
                jdbVar.O(ErrorResult.a.d(null));
                return;
            }
            dyd x = qml.x(h);
            if (x == null) {
                jdbVar.O(ErrorResult.a.e(null));
            } else if (!ckf.b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
                jdbVar.O(ErrorResult.a.f("this api must be called in the main thread"));
            } else if (!x.q(un4Var.f29508a, un4Var.b)) {
                jdbVar.O(ErrorResult.a.b("容器能力未实现"));
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void setTabBarItem(kdb kdbVar, kn4 kn4Var, jdb jdbVar) {
        QueryPass queryPass;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d5a9bc", new Object[]{this, kdbVar, kn4Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(kn4Var, "params");
        ckf.g(jdbVar, "callback");
        if (a(kdbVar, jdbVar) != null) {
            ITMSPage h = CommonExtKt.h(kdbVar);
            if (h == null) {
                jdbVar.O(ErrorResult.a.d(null));
                return;
            }
            dyd x = qml.x(h);
            if (x == null) {
                jdbVar.O(ErrorResult.a.e(null));
                return;
            }
            vm4 vm4Var = kn4Var.e;
            if (vm4Var == null) {
                queryPass = null;
            } else {
                queryPass = new QueryPass();
                queryPass.setAllow(vm4Var.f30098a);
                queryPass.setIgnore(vm4Var.b);
            }
            TabBarItem tabBarItem = new TabBarItem();
            tabBarItem.setPageId(kn4Var.b);
            tabBarItem.setIconNormal(kn4Var.c);
            tabBarItem.setIconSelected(kn4Var.d);
            tabBarItem.setLabel(kn4Var.f);
            tabBarItem.setQueryPass(queryPass);
            if (!x.j(kn4Var.f22775a, tabBarItem)) {
                jdbVar.O(ErrorResult.a.e(null));
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void setTabBarMode(kdb kdbVar, vn4 vn4Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31621d58", new Object[]{this, kdbVar, vn4Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(vn4Var, "params");
        ckf.g(jdbVar, "callback");
        if (a(kdbVar, jdbVar) != null) {
            ITMSPage h = CommonExtKt.h(kdbVar);
            if (h == null) {
                jdbVar.O(ErrorResult.a.d(null));
                return;
            }
            dyd x = qml.x(h);
            if (x == null) {
                jdbVar.O(ErrorResult.a.e(null));
            } else if (!x.i(vn4Var.f30120a)) {
                jdbVar.O(ErrorResult.a.c(null));
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void showErrorPage(kdb kdbVar, jdb jdbVar) {
        x5d pageContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a71772c", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        bbs a2 = a(kdbVar, jdbVar);
        if (a2 != null) {
            if (q9s.V1()) {
                ITMSPage h = CommonExtKt.h(kdbVar);
                if (h == null) {
                    jdbVar.O(ErrorResult.a.d("容器页面未找到"));
                    return;
                }
                tll pageContext = h.getPageContext();
                if (pageContext != null && (pageContainer = pageContext.getPageContainer()) != null) {
                    pageContainer.e(new eas("TMS_ERR_CUSTOM", ckf.p(a2.L(), ", show Error"), "对不起，加载失败，请尝试重新打开当前页面"));
                    return;
                }
                return;
            }
            a2.x0(new eas("TMS_ERR_CUSTOM", ckf.p(a2.L(), ", show Error"), "对不起，加载失败，请尝试重新打开当前页面"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void showSwiperHeader(kdb kdbVar, ln4 ln4Var, jdb jdbVar) {
        s7d s7dVar;
        ITMSPage L0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4226ec6", new Object[]{this, kdbVar, ln4Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(ln4Var, "params");
        ckf.g(jdbVar, "callback");
        if (a(kdbVar, jdbVar) != null) {
            ITMSPage h = CommonExtKt.h(kdbVar);
            ztd ztdVar = null;
            if (!(h == null || (s7dVar = (s7d) h.getExtension(s7d.class)) == null || (L0 = s7dVar.L0()) == null)) {
                ztdVar = (ztd) L0.getExtension(ztd.class);
            }
            if (ztdVar == null) {
                jdbVar.O(ErrorResult.a.b("swiperExtension not found"));
            } else if (!ztdVar.a0(ln4Var.f23434a, ln4Var.b)) {
                jdbVar.O(ErrorResult.a.g("show swiper header failed"));
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void showTab(kdb kdbVar, sn4 sn4Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("533fd77c", new Object[]{this, kdbVar, sn4Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(sn4Var, "config");
        ckf.g(jdbVar, "callback");
        if (a(kdbVar, jdbVar) != null) {
            ITMSPage h = CommonExtKt.h(kdbVar);
            if (h == null) {
                jdbVar.O(ErrorResult.a.d(null));
                return;
            }
            dyd x = qml.x(h);
            if (x == null) {
                jdbVar.O(ErrorResult.a.e(null));
            } else {
                x.e();
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void slideTo(kdb kdbVar, mn4 mn4Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a342a1a", new Object[]{this, kdbVar, mn4Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(mn4Var, "params");
        ckf.g(jdbVar, "callback");
        if (a(kdbVar, jdbVar) != null) {
            ITMSPage d2 = CommonExtKt.d(kdbVar, mn4Var.b);
            if (d2 == null) {
                jdbVar.O(ErrorResult.a.d("tab 页面没找到"));
                return;
            }
            ztd ztdVar = (ztd) d2.getExtension(ztd.class);
            if (ztdVar == null) {
                jdbVar.O(ErrorResult.a.b("swiper 页面没找到"));
            } else if (!ztdVar.x0(mn4Var.f24160a)) {
                jdbVar.O(ErrorResult.a.g("slide to swiper failed"));
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void swizzleTab(kdb kdbVar, rn4 rn4Var, jdb jdbVar) {
        dyd dydVar;
        dyd x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fffc3e6", new Object[]{this, kdbVar, rn4Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(rn4Var, "params");
        ckf.g(jdbVar, "callback");
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h != null) {
            s7d s7dVar = (s7d) h.getExtension(s7d.class);
            ITMSPage L0 = s7dVar == null ? null : s7dVar.L0();
            if (L0 != null && (x = qml.x(L0)) != null) {
                x.k(rn4Var.f27481a, rn4Var.b);
                return;
            } else if (!(L0 == null || (dydVar = (dyd) L0.getExtension(dyd.class)) == null)) {
                dydVar.k(rn4Var.f27481a, rn4Var.b);
                return;
            }
        }
        jdbVar.O(ErrorResult.a.b("未找到 TabExtension"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void prewarmMultiResource(kdb kdbVar, dn4 dn4Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc461b64", new Object[]{this, kdbVar, dn4Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(dn4Var, "params");
        ckf.g(jdbVar, "callback");
        List<en4> list = dn4Var.f17958a;
        if (list != null) {
            if (list.size() >= 20) {
                jdbVar.O(ErrorResult.a.g("exceed resources size limit"));
                return;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (en4 en4Var : list) {
                prewarmResource(kdbVar, en4Var, new e(atomicBoolean, jdbVar));
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void switchTab(kdb kdbVar, wn4 wn4Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf95ef6c", new Object[]{this, kdbVar, wn4Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(wn4Var, "params");
        ckf.g(jdbVar, "callback");
        if (a(kdbVar, jdbVar) != null) {
            ITMSPage h = CommonExtKt.h(kdbVar);
            if (h == null) {
                jdbVar.O(ErrorResult.a.d(null));
                return;
            }
            dyd x = qml.x(h);
            if (x == null) {
                jdbVar.O(ErrorResult.a.e(null));
                return;
            }
            Integer num = wn4Var.f30789a;
            if (num != null) {
                dyd.a.a(x, num.intValue(), null, 2, null);
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void requestContainerPosition(kdb kdbVar, tqb tqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce98d94", new Object[]{this, kdbVar, tqbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(tqbVar, "callback");
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            tqbVar.O(ErrorResult.a.d("容器页面未找到"));
            return;
        }
        int[] iArr = new int[2];
        View view = h.getView();
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        ContainerPosition containerPosition = new ContainerPosition();
        containerPosition.x = Integer.valueOf(xcs.f(h.getInstance().I(), iArr[0]));
        containerPosition.y = Integer.valueOf(xcs.f(h.getInstance().I(), iArr[1]));
        tqbVar.C(containerPosition);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
        if (r6.equals(tb.pg1.ATOM_EXT_white) == false) goto L_0x00db;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
        if (r6.equals("light") == false) goto L_0x00db;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
        r6 = com.taobao.themis.kernel.container.Window.Theme.LIGHT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c4, code lost:
        if (r6.equals(tb.pg1.ATOM_EXT_black) == false) goto L_0x00db;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cd, code lost:
        if (r6.equals(com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils.COLOR_SCHEME_DARK) == false) goto L_0x00db;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d0, code lost:
        r6 = com.taobao.themis.kernel.container.Window.Theme.DARK;
     */
    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void registerPage(tb.kdb r36, tb.ym4 r37, tb.jdb r38) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.ability.basic.container.TMSContainerAbility.registerPage(tb.kdb, tb.ym4, tb.jdb):void");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void preRenderSubPage(kdb kdbVar, sm4 sm4Var, jdb jdbVar) {
        AppManifest.Performance d2;
        List<String> prerenderSubPageWhiteList;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70909246", new Object[]{this, kdbVar, sm4Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(sm4Var, "params");
        ckf.g(jdbVar, "callback");
        bbs a2 = a(kdbVar, jdbVar);
        if (a2 != null) {
            if (TMSSolutionType.getType(a2) != TMSSolutionType.UNIAPP) {
                jdbVar.O(new ErrorResult("PRERENDER_UNKNOWN_SYSTEM_ERROR", "该 API 仅 UniApp 支持"));
                return;
            }
            zbd zbdVar = (zbd) a2.getExtension(zbd.class);
            if (zbdVar == null) {
                jdbVar.O(ErrorResult.a.b("仅UniApp支持预渲染"));
                return;
            }
            mm4 N = a2.N();
            if (N == null || (d2 = N.d()) == null || (prerenderSubPageWhiteList = d2.getPrerenderSubPageWhiteList()) == null || !i04.R(prerenderSubPageWhiteList, Uri.parse(sm4Var.f28143a).getPath())) {
                jdbVar.O(new ErrorResult("PRERENDER_PERMISSION_INVALID", "未申请预渲染权限"));
            } else if (!zbdVar.e()) {
                jdbVar.O(new ErrorResult("PRERENDER_POOL_FULL", "预渲染池中已存在页面实例"));
            } else {
                String str2 = sm4Var.f28143a;
                List z0 = wsq.z0(str2, new String[]{"?"}, false, 0, 6, null);
                if (z0.size() == 2) {
                    str2 = (String) z0.get(0);
                    str = (String) z0.get(1);
                } else {
                    str = null;
                }
                unl k = TMSInstanceExtKt.k(a2, str2);
                String k2 = k == null ? null : k.k();
                if (k2 == null) {
                    jdbVar.O(new ErrorResult("PRERENDER_UNKNOWN_SYSTEM_ERROR", "预渲染出现预期外的系统异常"));
                    return;
                }
                String c2 = ges.c(k2, str, null, null, 12, null);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "isPreRender", (String) Boolean.TRUE);
                ITMSPage b2 = a2.V().b(str2, null, c2, jSONObject);
                if (b2 == null) {
                    jdbVar.O(new ErrorResult("PRERENDER_UNKNOWN_SYSTEM_ERROR", "预渲染出现预期外的系统异常"));
                    return;
                }
                cqc cqcVar = (cqc) b2.getExtension(cqc.class);
                if (cqcVar != null) {
                    cqc.a.b(cqcVar, null, null, null, null, null, null, 63, null);
                }
                b2.s();
                zbdVar.f0(b2);
            }
        }
    }
}
