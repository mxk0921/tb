package com.taobao.themis.kernel.metaInfo.manifest;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.io.Serializable;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import tb.a07;
import tb.arf;
import tb.ckf;
import tb.q9s;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class AppManifest implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AppInfo appInfo;
    private Cache cache;
    private Container container;
    private boolean preset;
    private Object variables;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class AppInfo implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String appId;
        private JSONObject bizInfo;
        private String bizType;
        private String logo;
        private String name;
        private String version;

        static {
            t2o.a(839909803);
        }

        public final String getAppId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("94038553", new Object[]{this});
            }
            return this.appId;
        }

        public final JSONObject getBizInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("9c07aa52", new Object[]{this});
            }
            return this.bizInfo;
        }

        public final String getBizType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
            }
            return this.bizType;
        }

        public final String getLogo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bfcecf78", new Object[]{this});
            }
            return this.logo;
        }

        public final String getName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
            }
            return this.name;
        }

        public final String getVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
            }
            return this.version;
        }

        public final void setAppId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9945baeb", new Object[]{this, str});
            } else {
                this.appId = str;
            }
        }

        public final void setBizInfo(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5beed0a", new Object[]{this, jSONObject});
            } else {
                this.bizInfo = jSONObject;
            }
        }

        public final void setBizType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebf7407c", new Object[]{this, str});
            } else {
                this.bizType = str;
            }
        }

        public final void setLogo(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce8a5ffe", new Object[]{this, str});
            } else {
                this.logo = str;
            }
        }

        public final void setName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
            } else {
                this.name = str;
            }
        }

        public final void setVersion(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
            } else {
                this.version = str;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Container implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean enableFallback;
        private PageFallbackStrategy fallbackStrategy;
        private InstanceControl instanceControl;
        private List<Page> pages;
        private Performance performance;
        private Solution solution;
        private TabBar tabBar;
        private JSONObject window;

        static {
            t2o.a(839909804);
        }

        public final boolean getEnableFallback() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2adc9986", new Object[]{this})).booleanValue();
            }
            return this.enableFallback;
        }

        public final PageFallbackStrategy getFallbackStrategy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PageFallbackStrategy) ipChange.ipc$dispatch("9f423e2b", new Object[]{this});
            }
            return this.fallbackStrategy;
        }

        public final InstanceControl getInstanceControl() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceControl) ipChange.ipc$dispatch("85fdcbd8", new Object[]{this});
            }
            return this.instanceControl;
        }

        public final List<Page> getPages() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("51843212", new Object[]{this});
            }
            return this.pages;
        }

        public final Performance getPerformance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Performance) ipChange.ipc$dispatch("23078708", new Object[]{this});
            }
            return this.performance;
        }

        public final Solution getSolution() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Solution) ipChange.ipc$dispatch("c837c37a", new Object[]{this});
            }
            return this.solution;
        }

        public final TabBar getTabBar() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TabBar) ipChange.ipc$dispatch("9b9cb12e", new Object[]{this});
            }
            return this.tabBar;
        }

        public final JSONObject getWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("77cc578d", new Object[]{this});
            }
            return this.window;
        }

        public final void setEnableFallback(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7efc0906", new Object[]{this, new Boolean(z)});
            } else {
                this.enableFallback = z;
            }
        }

        public final void setFallbackStrategy(PageFallbackStrategy pageFallbackStrategy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e75e760b", new Object[]{this, pageFallbackStrategy});
            } else {
                this.fallbackStrategy = pageFallbackStrategy;
            }
        }

        public final void setInstanceControl(InstanceControl instanceControl) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f425248", new Object[]{this, instanceControl});
            } else {
                this.instanceControl = instanceControl;
            }
        }

        public final void setPages(List<Page> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3887efa", new Object[]{this, list});
            } else {
                this.pages = list;
            }
        }

        public final void setPerformance(Performance performance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d28a4c48", new Object[]{this, performance});
            } else {
                this.performance = performance;
            }
        }

        public final void setSolution(Solution solution) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d91c2392", new Object[]{this, solution});
            } else {
                this.solution = solution;
            }
        }

        public final void setTabBar(TabBar tabBar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("445e095c", new Object[]{this, tabBar});
            } else {
                this.tabBar = tabBar;
            }
        }

        public final void setWindow(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9270bf97", new Object[]{this, jSONObject});
            } else {
                this.window = jSONObject;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class InstanceControl implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Boolean singletonApp = Boolean.FALSE;

        static {
            t2o.a(839909805);
        }

        public final Boolean getSingletonApp() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("9bcc0dd0", new Object[]{this});
            }
            return this.singletonApp;
        }

        public final void setSingletonApp(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("142bb4ce", new Object[]{this, bool});
            } else {
                this.singletonApp = bool;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class MatchRule implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final a Companion = new a(null);
        public static final String PREFIX_TYPE = "prefix";
        private String type;
        private String value;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a {
            static {
                t2o.a(839909807);
            }

            public /* synthetic */ a(a07 a07Var) {
                this();
            }

            public a() {
            }
        }

        static {
            t2o.a(839909806);
        }

        public final String getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
            }
            return this.type;
        }

        public final String getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
            }
            return this.value;
        }

        public final void setType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
            } else {
                this.type = str;
            }
        }

        public final void setValue(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bae52f80", new Object[]{this, str});
            } else {
                this.value = str;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class OfflineResource implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final a Companion = new a(null);
        public static final String PRELOAD_STRATEGY = "preload";
        private List<MatchRule> matchRules;
        private String resourceManifestUrl;
        private String strategy;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a {
            static {
                t2o.a(839909809);
            }

            public /* synthetic */ a(a07 a07Var) {
                this();
            }

            public a() {
            }
        }

        static {
            t2o.a(839909808);
        }

        public final List<MatchRule> getMatchRules() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("6ee583b8", new Object[]{this});
            }
            return this.matchRules;
        }

        public final String getResourceManifestUrl() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2244dfdd", new Object[]{this});
            }
            return this.resourceManifestUrl;
        }

        public final String getStrategy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8f8429b0", new Object[]{this});
            }
            return this.strategy;
        }

        public final void setMatchRules(List<MatchRule> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ea1d9ac", new Object[]{this, list});
            } else {
                this.matchRules = list;
            }
        }

        public final void setResourceManifestUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee2c96a1", new Object[]{this, str});
            } else {
                this.resourceManifestUrl = str;
            }
        }

        public final void setStrategy(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebde66c6", new Object[]{this, str});
            } else {
                this.strategy = str;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Page implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean autofocus;
        private List<String> children;
        private boolean external;
        private JSONObject fallbackStrategy;
        private JSONObject groupConfig;
        private String id;
        private String pageType;
        private QueryPass queryPass;
        private String renderer;
        private String url;
        private String version;
        private JSONObject window;

        static {
            t2o.a(839909810);
        }

        public final boolean getAutofocus() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("65af80de", new Object[]{this})).booleanValue();
            }
            return this.autofocus;
        }

        public final List<String> getChildren() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("faa24d4b", new Object[]{this});
            }
            return this.children;
        }

        public final boolean getExternal() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e449d4c", new Object[]{this})).booleanValue();
            }
            return this.external;
        }

        public final JSONObject getFallbackStrategy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("abd00e12", new Object[]{this});
            }
            return this.fallbackStrategy;
        }

        public final JSONObject getGroupConfig() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("167bcb92", new Object[]{this});
            }
            return this.groupConfig;
        }

        public final String getId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
            }
            return this.id;
        }

        public final String getPageType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("85bdc7a", new Object[]{this});
            }
            return this.pageType;
        }

        public final QueryPass getQueryPass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (QueryPass) ipChange.ipc$dispatch("41878722", new Object[]{this});
            }
            return this.queryPass;
        }

        public final String getRenderer() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3570fe60", new Object[]{this});
            }
            return this.renderer;
        }

        public final String getUrl() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
            }
            return this.url;
        }

        public final String getVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
            }
            return this.version;
        }

        public final JSONObject getWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("77cc578d", new Object[]{this});
            }
            return this.window;
        }

        public final void setAutofocus(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1837b546", new Object[]{this, new Boolean(z)});
            } else {
                this.autofocus = z;
            }
        }

        public final void setChildren(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f4ad579", new Object[]{this, list});
            } else {
                this.children = list;
            }
        }

        public final void setExternal(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d262500", new Object[]{this, new Boolean(z)});
            } else {
                this.external = z;
            }
        }

        public final void setFallbackStrategy(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bd518b2", new Object[]{this, jSONObject});
            } else {
                this.fallbackStrategy = jSONObject;
            }
        }

        public final void setGroupConfig(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("429a8dca", new Object[]{this, jSONObject});
            } else {
                this.groupConfig = jSONObject;
            }
        }

        public final void setId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
            } else {
                this.id = str;
            }
        }

        public final void setPageType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfd0d3c", new Object[]{this, str});
            } else {
                this.pageType = str;
            }
        }

        public final void setQueryPass(QueryPass queryPass) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda3a314", new Object[]{this, queryPass});
            } else {
                this.queryPass = queryPass;
            }
        }

        public final void setRenderer(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38c2816", new Object[]{this, str});
            } else {
                this.renderer = str;
            }
        }

        public final void setUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
            } else {
                this.url = str;
            }
        }

        public final void setVersion(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
            } else {
                this.version = str;
            }
        }

        public final void setWindow(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9270bf97", new Object[]{this, jSONObject});
            } else {
                this.window = jSONObject;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class PageFallbackStrategy implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a Companion = new a(null);
        private static final PageFallbackStrategy DEFAULT_PAGE_STRATEGY = new PageFallbackStrategy();
        private String fallbackPage;
        private int minDocumentSize = q9s.f3();
        private List<String> requiredElementsDetection = q9s.g3();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(839909812);
            }

            public /* synthetic */ a(a07 a07Var) {
                this();
            }

            public final PageFallbackStrategy a(JSONObject jSONObject, PageFallbackStrategy pageFallbackStrategy) {
                Integer c;
                Object obj;
                int i;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (PageFallbackStrategy) ipChange.ipc$dispatch("cc6e6d0b", new Object[]{this, jSONObject, pageFallbackStrategy});
                }
                ckf.g(pageFallbackStrategy, "fallbackStrategy");
                PageFallbackStrategy pageFallbackStrategy2 = new PageFallbackStrategy();
                String str = null;
                if (jSONObject == null) {
                    c = null;
                } else {
                    try {
                        c = arf.INSTANCE.c(jSONObject, "minDocumentSize");
                    } catch (Throwable th) {
                        obj = Result.m1108constructorimpl(b.a(th));
                    }
                }
                if (c == null) {
                    i = pageFallbackStrategy.getMinDocumentSize();
                } else {
                    i = c.intValue();
                }
                pageFallbackStrategy2.setMinDocumentSize(i);
                List<String> f = jSONObject == null ? null : arf.INSTANCE.f(jSONObject, "requiredElementsDetection");
                if (f == null) {
                    f = pageFallbackStrategy.getRequiredElementsDetection();
                }
                pageFallbackStrategy2.setRequiredElementsDetection(f);
                if (jSONObject != null) {
                    str = jSONObject.getString("fallbackPage");
                }
                if (str == null) {
                    str = pageFallbackStrategy.getFallbackPage();
                }
                pageFallbackStrategy2.setFallbackPage(str);
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
                Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
                if (th2 != null) {
                    TMSLogger.c("PageFallbackStrategy", "parse fallbackStrategy error", th2);
                }
                return pageFallbackStrategy2;
            }

            public final PageFallbackStrategy b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (PageFallbackStrategy) ipChange.ipc$dispatch("4cf462f", new Object[]{this});
                }
                return PageFallbackStrategy.access$getDEFAULT_PAGE_STRATEGY$cp();
            }

            public a() {
            }
        }

        static {
            t2o.a(839909811);
        }

        public static final /* synthetic */ PageFallbackStrategy access$getDEFAULT_PAGE_STRATEGY$cp() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PageFallbackStrategy) ipChange.ipc$dispatch("8003fa42", new Object[0]);
            }
            return DEFAULT_PAGE_STRATEGY;
        }

        public final String getFallbackPage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9954da52", new Object[]{this});
            }
            return this.fallbackPage;
        }

        public final int getMinDocumentSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cfca4972", new Object[]{this})).intValue();
            }
            return this.minDocumentSize;
        }

        public final List<String> getRequiredElementsDetection() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("aa75a787", new Object[]{this});
            }
            return this.requiredElementsDetection;
        }

        public final void setFallbackPage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21e4e464", new Object[]{this, str});
            } else {
                this.fallbackPage = str;
            }
        }

        public final void setMinDocumentSize(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3d28870", new Object[]{this, new Integer(i)});
            } else {
                this.minDocumentSize = i;
            }
        }

        public final void setRequiredElementsDetection(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3478f625", new Object[]{this, list});
                return;
            }
            ckf.g(list, "<set-?>");
            this.requiredElementsDetection = list;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Performance implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private List<DataPrefetch> dataPrefetch;
        private OfflineResource offlineResource;
        private List<String> prerenderSubPageWhiteList;
        private List<ResourcePrefetch> resourcePrefetch;

        static {
            t2o.a(839909813);
        }

        public final List<DataPrefetch> getDataPrefetch() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("d768ff49", new Object[]{this});
            }
            return this.dataPrefetch;
        }

        public final OfflineResource getOfflineResource() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OfflineResource) ipChange.ipc$dispatch("80292d46", new Object[]{this});
            }
            return this.offlineResource;
        }

        public final List<String> getPrerenderSubPageWhiteList() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("794f8165", new Object[]{this});
            }
            return this.prerenderSubPageWhiteList;
        }

        public final List<ResourcePrefetch> getResourcePrefetch() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("2e869765", new Object[]{this});
            }
            return this.resourcePrefetch;
        }

        public final void setDataPrefetch(List<DataPrefetch> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c299fd3b", new Object[]{this, list});
            } else {
                this.dataPrefetch = list;
            }
        }

        public final void setOfflineResource(OfflineResource offlineResource) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d1a95c28", new Object[]{this, offlineResource});
            } else {
                this.offlineResource = offlineResource;
            }
        }

        public final void setPrerenderSubPageWhiteList(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40da5807", new Object[]{this, list});
            } else {
                this.prerenderSubPageWhiteList = list;
            }
        }

        public final void setResourcePrefetch(List<ResourcePrefetch> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e912029f", new Object[]{this, list});
            } else {
                this.resourcePrefetch = list;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Solution implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String type;

        static {
            t2o.a(839909814);
        }

        public final String getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
            }
            return this.type;
        }

        public final void setType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
            } else {
                this.type = str;
            }
        }
    }

    static {
        t2o.a(839909802);
    }

    public final AppInfo getAppInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfo) ipChange.ipc$dispatch("8ade078a", new Object[]{this});
        }
        return this.appInfo;
    }

    public final Cache getCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cache) ipChange.ipc$dispatch("2c3861d0", new Object[]{this});
        }
        return this.cache;
    }

    public final Container getContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Container) ipChange.ipc$dispatch("e842be6", new Object[]{this});
        }
        return this.container;
    }

    public final boolean getPreset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46f097e0", new Object[]{this})).booleanValue();
        }
        return this.preset;
    }

    public final Object getVariables() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8d97d56a", new Object[]{this});
        }
        return this.variables;
    }

    public final void setAppInfo(AppInfo appInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15aaa768", new Object[]{this, appInfo});
        } else {
            this.appInfo = appInfo;
        }
    }

    public final void setCache(Cache cache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f47d334", new Object[]{this, cache});
        } else {
            this.cache = cache;
        }
    }

    public final void setContainer(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e45968", new Object[]{this, container});
        } else {
            this.container = container;
        }
    }

    public final void setPreset(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8889ec", new Object[]{this, new Boolean(z)});
        } else {
            this.preset = z;
        }
    }

    public final void setVariables(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfb82a18", new Object[]{this, obj});
        } else {
            this.variables = obj;
        }
    }
}
