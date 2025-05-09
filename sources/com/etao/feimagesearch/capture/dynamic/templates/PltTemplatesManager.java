package com.etao.feimagesearch.capture.dynamic.templates;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ImageSearchMtopUtil;
import com.taobao.android.searchbaseframe.roman.BuiltinFallbackMatcher;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Lambda;
import tb.c8x;
import tb.caa;
import tb.ckf;
import tb.d8m;
import tb.g1a;
import tb.lg4;
import tb.pb1;
import tb.qb1;
import tb.rfo;
import tb.t2o;
import tb.u1a;
import tb.xhv;
import tb.z7m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class PltTemplatesManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CAPTURE_TAB_3 = "plt_camera_page_tab3";
    public static final String KEY_IRP_IDENTIFY = "plt-identifyall-disambiguation-card";
    public static final PltTemplatesManager INSTANCE = new PltTemplatesManager();

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Boolean> f4661a = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4662a;
        public final /* synthetic */ JSONObject b;

        public a(String str, JSONObject jSONObject) {
            this.f4662a = str;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PltTemplatesManager.b(PltTemplatesManager.INSTANCE, this.f4662a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements c8x.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4663a;
        public final /* synthetic */ JSONObject b;

        public b(String str, JSONObject jSONObject) {
            this.f4663a = str;
            this.b = jSONObject;
        }

        @Override // tb.c8x.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb8b0117", new Object[]{this, str, str2});
                return;
            }
            TLogTracker.f("PltTemplateManager", "weex preload failure", "template: " + ((Object) this.f4663a) + ", errCode:" + ((Object) str) + ", errMsg:" + ((Object) str2));
        }

        @Override // tb.c8x.a
        public void b(c8x.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("300d70d8", new Object[]{this, cVar});
                return;
            }
            PltTemplatesManager.a().put(this.f4663a, Boolean.TRUE);
            TLogTracker.f("PltTemplateManager", "weex preload success", ckf.p("template: ", this.f4663a));
            JSONObject jSONObject = this.b;
            if (jSONObject != null) {
                rfo.b().f(jSONObject);
            }
        }
    }

    static {
        t2o.a(481296678);
        rfo.b();
    }

    public static final /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f3d843c0", new Object[0]);
        }
        return f4661a;
    }

    public static final /* synthetic */ void b(PltTemplatesManager pltTemplatesManager, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba5ca3cb", new Object[]{pltTemplatesManager, str, jSONObject});
        } else {
            pltTemplatesManager.i(str, jSONObject);
        }
    }

    @JvmStatic
    public static final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f86fbc4", new Object[0]);
        }
        if (Localization.o()) {
            return BuiltinFallbackMatcher.PLT_CAMERA_I18N;
        }
        return BuiltinFallbackMatcher.PLT_CAMERA;
    }

    @JvmStatic
    public static final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30897de5", new Object[0]);
        }
        if (Localization.o()) {
            return BuiltinFallbackMatcher.PLT_IRP_I18N;
        }
        return BuiltinFallbackMatcher.PLT_IRP;
    }

    @JvmStatic
    public static final String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("193c13f0", new Object[]{str});
        }
        if (str != null && !TextUtils.isEmpty(str)) {
            return rfo.b().c(str, caa.i());
        }
        return null;
    }

    @JvmStatic
    public static final void g(String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4565bb5", new Object[]{str, jSONObject, new Boolean(z)});
        } else if (str == null || ckf.b(((LinkedHashMap) f4661a).get(str), Boolean.TRUE)) {
        } else {
            if (z) {
                VExecutors.defaultSharedThreadPool().submit(new a(str, jSONObject));
            } else {
                INSTANCE.i(str, jSONObject);
            }
        }
    }

    @JvmStatic
    public static final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1157bc1f", new Object[0]);
        } else if (lg4.g0()) {
            TLogTracker.f("PltTemplateManager", "preload trigger", "");
            if (Math.abs(System.currentTimeMillis()) > lg4.U1()) {
                INSTANCE.c(new String[]{d(), "plt_camera_page_tab3", e(), KEY_IRP_IDENTIFY});
            }
        }
    }

    public final void c(final String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48077b3a", new Object[]{this, strArr});
        } else if (strArr != null && strArr.length != 0) {
            z7m.c(new Runnable() { // from class: com.etao.feimagesearch.capture.dynamic.templates.PltTemplatesManager$fetchTemplatesInfoFromCloud$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                /* renamed from: com.etao.feimagesearch.capture.dynamic.templates.PltTemplatesManager$fetchTemplatesInfoFromCloud$1$1  reason: invalid class name */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
                public static final class AnonymousClass1 extends Lambda implements g1a<Map<String, d8m>, xhv> {
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    public AnonymousClass1() {
                        super(1);
                    }

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/templates/PltTemplatesManager$fetchTemplatesInfoFromCloud$1$1");
                    }

                    @Override // tb.g1a
                    public /* bridge */ /* synthetic */ xhv invoke(Map<String, d8m> map) {
                        invoke2(map);
                        return xhv.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(Map<String, d8m> map) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("440b90a6", new Object[]{this, map});
                            return;
                        }
                        ckf.g(map, "templatesMap");
                        for (Map.Entry<String, d8m> entry : map.entrySet()) {
                            d8m value = entry.getValue();
                            if (!TextUtils.isEmpty(value.c())) {
                                TLogTracker.f("PltTemplateManager", "fetch success", "key:" + value.a() + ", template: " + value.c());
                                PltTemplatesManager.b(PltTemplatesManager.INSTANCE, value.c(), value.b());
                            }
                        }
                    }
                }

                /* compiled from: Taobao */
                /* renamed from: com.etao.feimagesearch.capture.dynamic.templates.PltTemplatesManager$fetchTemplatesInfoFromCloud$1$2  reason: invalid class name */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
                public static final class AnonymousClass2 extends Lambda implements u1a<Integer, String, xhv> {
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    public final /* synthetic */ String[] $pageKeys;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(String[] strArr) {
                        super(2);
                        this.$pageKeys = strArr;
                    }

                    public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/templates/PltTemplatesManager$fetchTemplatesInfoFromCloud$1$2");
                    }

                    @Override // tb.u1a
                    public /* bridge */ /* synthetic */ xhv invoke(Integer num, String str) {
                        invoke2(num, str);
                        return xhv.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(Integer num, String str) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("795a6ae2", new Object[]{this, num, str});
                            return;
                        }
                        TLogTracker.f("PltTemplateManager", "fetch failure", "errCode:" + num + ", errMsg: " + ((Object) str));
                        Iterator a2 = qb1.a(this.$pageKeys);
                        while (true) {
                            pb1 pb1Var = (pb1) a2;
                            if (pb1Var.hasNext()) {
                                String str2 = (String) pb1Var.next();
                                if (!TextUtils.isEmpty(str2)) {
                                    PltTemplatesManager.b(PltTemplatesManager.INSTANCE, rfo.b().c(str2, caa.i()), null);
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    pb1 pb1Var;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("sversion", caa.i());
                    linkedHashMap.put("client", "android");
                    Iterator a2 = qb1.a(strArr);
                    String str = "";
                    while (true) {
                        if (((pb1) a2).hasNext()) {
                            str = str + ((String) pb1Var.next()) + ',';
                        } else {
                            linkedHashMap.put("pageKeys", str);
                            TLogTracker.f("PltTemplateManager", "fetch cloud info", ckf.p("page: ", str));
                            ImageSearchMtopUtil.q(linkedHashMap, AnonymousClass1.INSTANCE, new AnonymousClass2(strArr));
                            return;
                        }
                    }
                }
            });
        }
    }

    public final void i(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c46eaac", new Object[]{this, str, jSONObject});
        } else if (str != null && !ckf.b(((LinkedHashMap) f4661a).get(str), Boolean.TRUE)) {
            try {
                TLogTracker.f("PltTemplateManager", "weex preload template", ckf.p("template: ", str));
                com.taobao.android.weex.b.c().a(new c8x.b(str), new b(str, jSONObject));
            } catch (Exception unused) {
            }
        }
    }
}
