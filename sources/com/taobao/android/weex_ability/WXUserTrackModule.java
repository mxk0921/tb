package com.taobao.android.weex_ability;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.module.WeexInnerModule;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.a1v;
import tb.f4x;
import tb.t2o;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class WXUserTrackModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CLICK = "click";
    private static final String CLICK_WITH_PAGENAME = "clickWithPageName";
    public static final String CUSTOM = "other";
    private static final String ENTER = "enter";
    private static final String EXPOSE = "expose";
    public static final String[] METHODS = {"commit", "commitut", "commitEvent", a1v.CUSTOM_ADVANCE, a1v.PAGE_APPEAR, "pageDisAppear", "updateNextPageUtparam", a1v.UPDATE_PAGE_UTPARAM, a1v.SKIP_PAGE, a1v.GET_PAGE_SPM_URL, a1v.GET_PAGE_SPM_PRE, a1v.UPDATE_PAGE_PROPERTIES};
    public static final String NAME = "userTrack";
    private static final String UPDATE_NEXT_PROP = "updateNextProp";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ f4x d;

        public a(f4x f4xVar) {
            this.d = f4xVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/WXUserTrackModule$10");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WXUserTrackModule.access$900(WXUserTrackModule.this, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ f4x d;

        public b(f4x f4xVar) {
            this.d = f4xVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/WXUserTrackModule$11");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WXUserTrackModule.access$1000(WXUserTrackModule.this, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject d;

        public c(JSONObject jSONObject) {
            this.d = jSONObject;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/WXUserTrackModule$12");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WXUserTrackModule.access$1100(WXUserTrackModule.this, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ JSONObject g;

        public d(String str, String str2, String str3, JSONObject jSONObject) {
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = jSONObject;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/WXUserTrackModule$1");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WXUserTrackModule.access$000(WXUserTrackModule.this, this.d, this.e, this.f, this.g);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;
        public final /* synthetic */ JSONObject k;

        public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONObject jSONObject) {
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = str5;
            this.i = str6;
            this.j = str7;
            this.k = jSONObject;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/WXUserTrackModule$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WXUserTrackModule.access$100(WXUserTrackModule.this, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;
        public final /* synthetic */ JSONObject i;

        public f(String str, int i, String str2, String str3, String str4, JSONObject jSONObject) {
            this.d = str;
            this.e = i;
            this.f = str2;
            this.g = str3;
            this.h = str4;
            this.i = jSONObject;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/WXUserTrackModule$3");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WXUserTrackModule.access$200(WXUserTrackModule.this, this.d, this.e, this.f, this.g, this.h, this.i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;
        public final /* synthetic */ JSONObject i;

        public g(String str, int i, String str2, String str3, String str4, JSONObject jSONObject) {
            this.d = str;
            this.e = i;
            this.f = str2;
            this.g = str3;
            this.h = str4;
            this.i = jSONObject;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/WXUserTrackModule$4");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WXUserTrackModule.access$300(WXUserTrackModule.this, this.d, this.e, this.f, this.g, this.h, this.i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/WXUserTrackModule$5");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WXUserTrackModule.access$400(WXUserTrackModule.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class i extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/WXUserTrackModule$6");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WXUserTrackModule.access$500(WXUserTrackModule.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class j extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;

        public j(String str) {
            this.d = str;
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/WXUserTrackModule$7");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WXUserTrackModule.access$600(WXUserTrackModule.this, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class k extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;

        public k(String str) {
            this.d = str;
        }

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/WXUserTrackModule$8");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WXUserTrackModule.access$700(WXUserTrackModule.this, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class l extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/WXUserTrackModule$9");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WXUserTrackModule.access$800(WXUserTrackModule.this);
            }
        }
    }

    public static /* synthetic */ void access$000(WXUserTrackModule wXUserTrackModule, String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fcca003", new Object[]{wXUserTrackModule, str, str2, str3, jSONObject});
        } else {
            wXUserTrackModule.commit(str, str2, str3, jSONObject);
        }
    }

    public static /* synthetic */ void access$100(WXUserTrackModule wXUserTrackModule, String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea60aedc", new Object[]{wXUserTrackModule, str, str2, str3, str4, str5, str6, str7, jSONObject});
        } else {
            wXUserTrackModule.commitut(str, str2, str3, str4, str5, str6, str7, jSONObject);
        }
    }

    public static /* synthetic */ void access$1000(WXUserTrackModule wXUserTrackModule, f4x f4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb287ce", new Object[]{wXUserTrackModule, f4xVar});
        } else {
            wXUserTrackModule.getPageSpmPre(f4xVar);
        }
    }

    public static /* synthetic */ void access$1100(WXUserTrackModule wXUserTrackModule, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39abd51", new Object[]{wXUserTrackModule, jSONObject});
        } else {
            wXUserTrackModule.updatePageProperties(jSONObject);
        }
    }

    public static /* synthetic */ void access$200(WXUserTrackModule wXUserTrackModule, String str, int i2, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ad8026", new Object[]{wXUserTrackModule, str, new Integer(i2), str2, str3, str4, jSONObject});
        } else {
            wXUserTrackModule.commitEvent(str, i2, str2, str3, str4, jSONObject);
        }
    }

    public static /* synthetic */ void access$300(WXUserTrackModule wXUserTrackModule, String str, int i2, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4647c885", new Object[]{wXUserTrackModule, str, new Integer(i2), str2, str3, str4, jSONObject});
        } else {
            wXUserTrackModule.customAdvance(str, i2, str2, str3, str4, jSONObject);
        }
    }

    public static /* synthetic */ void access$400(WXUserTrackModule wXUserTrackModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c3e46b", new Object[]{wXUserTrackModule});
        } else {
            wXUserTrackModule.pageAppear();
        }
    }

    public static /* synthetic */ void access$500(WXUserTrackModule wXUserTrackModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4db0fb8a", new Object[]{wXUserTrackModule});
        } else {
            wXUserTrackModule.pageDisAppear();
        }
    }

    public static /* synthetic */ void access$600(WXUserTrackModule wXUserTrackModule, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23d4433", new Object[]{wXUserTrackModule, str});
        } else {
            wXUserTrackModule.updateNextPageUtparam(str);
        }
    }

    public static /* synthetic */ void access$700(WXUserTrackModule wXUserTrackModule, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34547192", new Object[]{wXUserTrackModule, str});
        } else {
            wXUserTrackModule.updatePageUtparam(str);
        }
    }

    public static /* synthetic */ void access$800(WXUserTrackModule wXUserTrackModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47840e7", new Object[]{wXUserTrackModule});
        } else {
            wXUserTrackModule.skipPage();
        }
    }

    public static /* synthetic */ void access$900(WXUserTrackModule wXUserTrackModule, f4x f4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dc2a0f4", new Object[]{wXUserTrackModule, f4xVar});
        } else {
            wXUserTrackModule.getPageSpmUrl(f4xVar);
        }
    }

    private void click(String str, String str2, Map<String, String> map) {
        UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45dd6182", new Object[]{this, str, str2, map});
        } else if (!TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(str)) {
                uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder(str, str2);
            } else {
                uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder(str2);
            }
            uTHitBuilders$UTControlHitBuilder.setProperties(map);
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
        }
    }

    private void clickWithPageName(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca0eb478", new Object[]{this, str, str2, str3, map});
        } else if (str != null && str2 != null && str3 != null && map != null) {
            try {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                    sb.append(",");
                }
                TBS.Adv.ctrlClickedOnPage(str, CT.Button, str3, sb.toString());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void commit(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2760bcd4", new Object[]{this, str, str2, str3, jSONObject});
        } else {
            commitut(str, "-1", str2, str3, "", "", "", jSONObject);
        }
    }

    private void commitEvent(String str, int i2, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d201f463", new Object[]{this, str, new Integer(i2), str2, str3, str4, jSONObject});
        } else {
            custom(str, str2, toStringMap(jSONObject));
        }
    }

    private void custom(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16246979", new Object[]{this, str, str2, map});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder(str2);
        uTHitBuilders$UTCustomHitBuilder.setEventPage(str);
        uTHitBuilders$UTCustomHitBuilder.setProperties(map);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    private void customAdvance(String str, int i2, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("214a0411", new Object[]{this, str, new Integer(i2), str2, str3, str4, jSONObject});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i2, str2, str3, str4, toStringMap(jSONObject)).build());
        }
    }

    private void enter(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d524e632", new Object[]{this, str, str2, map});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(getWeexInstance().getContext(), str);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getWeexInstance().getContext(), map);
        if (!TextUtils.isEmpty(str2)) {
            UTAnalytics.getInstance().getDefaultTracker().updatePageUrl(getWeexInstance().getContext(), Uri.parse(str2));
        }
    }

    private void expose(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf5beb68", new Object[]{this, str, str2, str3, str4, str5, map});
            return;
        }
        int i3 = 2201;
        try {
            int parseInt = Integer.parseInt(str2);
            if (parseInt > 0) {
                i3 = parseInt;
            }
            i2 = i3;
        } catch (NumberFormatException unused) {
            i2 = 2201;
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i2, str3, str4, str5, map).build());
    }

    private boolean instanceIllegal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a441c12c", new Object[]{this})).booleanValue();
        }
        return true ^ (getWeexInstance().getContext() instanceof Activity);
    }

    public static /* synthetic */ Object ipc$super(WXUserTrackModule wXUserTrackModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/WXUserTrackModule");
    }

    private void pageAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e933178b", new Object[]{this});
        } else if (!instanceIllegal()) {
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(getWeexInstance().getContext());
        }
    }

    private void pageDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d96b47b", new Object[]{this});
        } else if (!instanceIllegal()) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(getWeexInstance().getContext());
        }
    }

    private void skipPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7766235", new Object[]{this});
        } else if (!instanceIllegal()) {
            UTAnalytics.getInstance().getDefaultTracker().skipPage(getWeexInstance().getContext());
        }
    }

    private Map<String, String> toStringMap(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("15026c6e", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    private void updateNextPageUtparam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ce5d14", new Object[]{this, str});
        } else if (!instanceIllegal()) {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(str);
        }
    }

    private void updateNextProp(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a260df", new Object[]{this, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(map);
        }
    }

    private void updatePageProperties(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c6afde", new Object[]{this, jSONObject});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getWeexInstance().getContext(), toStringMap(jSONObject));
        }
    }

    private void updatePageUtparam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e373f147", new Object[]{this, str});
        } else if (!instanceIllegal()) {
            UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(getWeexInstance().getContext(), str);
        }
    }

    private void getPageSpmPre(f4x f4xVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d1f1ced", new Object[]{this, f4xVar});
            return;
        }
        if (getWeexInstance().getContext() instanceof Activity) {
            str = UTAnalytics.getInstance().getDefaultTracker().getPageSpmPre((Activity) getWeexInstance().getContext());
        } else {
            str = "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("spmPre", (Object) str);
        f4xVar.b(jSONObject);
    }

    private void getPageSpmUrl(f4x f4xVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70cf0b9", new Object[]{this, f4xVar});
            return;
        }
        if (getWeexInstance().getContext() instanceof Activity) {
            str = UTAnalytics.getInstance().getDefaultTracker().getPageSpmUrl((Activity) getWeexInstance().getContext());
        } else {
            str = "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("spmUrl", (Object) str);
        f4xVar.b(jSONObject);
    }

    static {
        t2o.a(980418587);
    }

    private void commitut(String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13de9c6d", new Object[]{this, str, str2, str3, str4, str5, str6, str7, jSONObject});
        } else if (!instanceIllegal()) {
            Map<String, String> stringMap = toStringMap(jSONObject);
            if ("click".equals(str)) {
                click(str3, str4, stringMap);
            } else if ("expose".equals(str)) {
                expose(str3, str2, str5, str6, str7, stringMap);
            } else if ("enter".equals(str)) {
                enter(str3, str4, stringMap);
            } else if ("other".equals(str)) {
                custom(str3, str5, stringMap);
            } else if (UPDATE_NEXT_PROP.equals(str)) {
                updateNextProp(stringMap);
            } else if (CLICK_WITH_PAGENAME.equals(str)) {
                clickWithPageName(str3, "click", str4, toStringMap(jSONObject));
            }
        }
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule
    public WeexValue callModuleMethod(WeexInstanceImpl weexInstanceImpl, String str, String str2, WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("ffafd8f7", new Object[]{this, weexInstanceImpl, str, str2, weexValueArr});
        }
        str2.hashCode();
        char c2 = 65535;
        switch (str2.hashCode()) {
            case -1354815177:
                if (str2.equals("commit")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1025553932:
                if (str2.equals("pageDisAppear")) {
                    c2 = 1;
                    break;
                }
                break;
            case -602290666:
                if (str2.equals("commitut")) {
                    c2 = 2;
                    break;
                }
                break;
            case -439577013:
                if (str2.equals(a1v.UPDATE_PAGE_PROPERTIES)) {
                    c2 = 3;
                    break;
                }
                break;
            case -114154543:
                if (str2.equals(a1v.CUSTOM_ADVANCE)) {
                    c2 = 4;
                    break;
                }
                break;
            case 768062724:
                if (str2.equals(a1v.PAGE_APPEAR)) {
                    c2 = 5;
                    break;
                }
                break;
            case 985529912:
                if (str2.equals(a1v.GET_PAGE_SPM_PRE)) {
                    c2 = 6;
                    break;
                }
                break;
            case 985534724:
                if (str2.equals(a1v.GET_PAGE_SPM_URL)) {
                    c2 = 7;
                    break;
                }
                break;
            case 1421600451:
                if (str2.equals("updateNextPageUtparam")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1487963043:
                if (str2.equals("commitEvent")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1880007478:
                if (str2.equals(a1v.UPDATE_PAGE_UTPARAM)) {
                    c2 = '\n';
                    break;
                }
                break;
            case 2145313966:
                if (str2.equals(a1v.SKIP_PAGE)) {
                    c2 = 11;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                argCount(weexValueArr, 4);
                executeInMain(new d(getArg(weexValueArr, 0).toStringValueOrNull(), getArg(weexValueArr, 1).toStringValueOrNull(), getArg(weexValueArr, 2).toStringValueOrNull(), getArg(weexValueArr, 3).toJSONObjectOrNull()));
                return null;
            case 1:
                argCount(weexValueArr, 0);
                executeInMain(new i());
                return null;
            case 2:
                argCount(weexValueArr, 8);
                executeInMain(new e(getArg(weexValueArr, 0).toStringValueOrNull(), getArg(weexValueArr, 1).toStringValueOrNull(), getArg(weexValueArr, 2).toStringValueOrNull(), getArg(weexValueArr, 3).toStringValueOrNull(), getArg(weexValueArr, 4).toStringValueOrNull(), getArg(weexValueArr, 5).toStringValueOrNull(), getArg(weexValueArr, 6).toStringValueOrNull(), getArg(weexValueArr, 7).toJSONObjectOrNull()));
                return null;
            case 3:
                argCount(weexValueArr, 1);
                executeInMain(new c(getArg(weexValueArr, 0).toJSONObjectOrNull()));
                return null;
            case 4:
                argCount(weexValueArr, 6);
                executeInMain(new g(getArg(weexValueArr, 0).toStringValueOrNull(), getArg(weexValueArr, 1).toIntValue(), getArg(weexValueArr, 2).toStringValueOrNull(), getArg(weexValueArr, 3).toStringValueOrNull(), getArg(weexValueArr, 4).toStringValueOrNull(), getArg(weexValueArr, 5).toJSONObjectOrNull()));
                return null;
            case 5:
                argCount(weexValueArr, 0);
                executeInMain(new h());
                return null;
            case 6:
                argCount(weexValueArr, 1);
                executeInMain(new b(getCallback(weexValueArr, 0)));
                return null;
            case 7:
                argCount(weexValueArr, 1);
                executeInMain(new a(getCallback(weexValueArr, 0)));
                return null;
            case '\b':
                argCount(weexValueArr, 1);
                executeInMain(new j(getArg(weexValueArr, 0).toStringValueOrNull()));
                return null;
            case '\t':
                argCount(weexValueArr, 6);
                executeInMain(new f(getArg(weexValueArr, 0).toStringValueOrNull(), getArg(weexValueArr, 1).toIntValue(), getArg(weexValueArr, 2).toStringValueOrNull(), getArg(weexValueArr, 3).toStringValueOrNull(), getArg(weexValueArr, 4).toStringValueOrNull(), getArg(weexValueArr, 5).toJSONObjectOrNull()));
                return null;
            case '\n':
                argCount(weexValueArr, 1);
                executeInMain(new k(getArg(weexValueArr, 0).toStringValueOrNull()));
                return null;
            case 11:
                argCount(weexValueArr, 0);
                executeInMain(new l());
                return null;
            default:
                return null;
        }
    }
}
