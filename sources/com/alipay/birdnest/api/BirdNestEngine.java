package com.alipay.birdnest.api;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.alipay.android.app.template.EventHandler;
import com.alipay.android.app.template.FBBridge;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.app.template.FBPluginFactory;
import com.alipay.android.app.template.FBResourceClient;
import com.alipay.android.app.template.JsPluginFactory;
import com.alipay.android.app.template.OnLoadCallback;
import com.alipay.android.app.template.Template;
import com.alipay.android.app.template.TemplateKeyboardService;
import com.alipay.android.app.template.TemplatePasswordService;
import com.alipay.android.app.template.event.TElementEventHandler;
import com.alipay.birdnest.platform.Platform;
import com.alipay.birdnest.store.TemplateStorage;
import com.alipay.birdnest.util.FBImageLoader;
import com.alipay.birdnest.util.FBLogger;
import com.alipay.mobile.common.logging.api.antevent.AntEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import com.flybird.FBDocumentAssistor;
import com.flybird.GlobalCacheForApi;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.f7l;
import tb.g52;
import tb.gwt;
import tb.ks9;
import tb.lse;
import tb.pg1;
import tb.y0a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BirdNestEngine {
    public static int globalPerfRatioOf10000;
    public static boolean m;
    public static boolean rollbackAntEvent;
    public static boolean useDelayedImgLoading;
    public static boolean useDelayedTorchBind;
    public static boolean useLogBatch;
    public static boolean useNoFootprint;
    public static boolean useSimpleActionSplit;
    public static boolean useSkipOldSwitches;
    public static boolean useValueCache;
    @Deprecated
    public final TemplateStorage c;
    public Config config;
    public final FBImageLoader d;
    public int e;
    public ExecutorService f;
    public ExecutorService g;
    public final LogTracer2 h;
    public volatile ExecutorService i;
    public static String optimizationFlag = String.valueOf(0);
    public static g52<AntEvent> eventBatchRunner = new g52<>(48, 10, new y0a<AntEvent, Void, Throwable>() { // from class: com.alipay.birdnest.api.BirdNestEngine.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Void, java.lang.Object] */
        @Override // tb.y0a
        public Void apply(AntEvent antEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("7a74adc1", new Object[]{this, antEvent});
            }
            antEvent.send();
            return null;
        }

        @Override // tb.y0a
        public void error(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25621cab", new Object[]{this, th});
            }
        }
    });

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentMap<String, Set<Integer>> f3812a = null;
    public ConcurrentMap<Integer, Set<FBContext>> b = null;
    public final Handler j = new Handler(Looper.getMainLooper());
    public lse inMemKV = new lse();
    public Object k = null;
    public SampledLogContext l = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Config {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f3816a;
        public Context b;
        public TemplateTransport c;
        public EmbedTemplateProvider d;
        public ResourceProvider e;
        public IdProvider f;
        public SettingProvider g;
        public UiWidgetProvider h;
        public UiVideoProvider i;
        public EmojiProvider j;
        public DevicePropProvider k;
        public LogTracer2 l;
        public ThemeColorProvider m;

        public Config(boolean z, Context context, TemplateTransport templateTransport, EmbedTemplateProvider embedTemplateProvider, ResourceProvider resourceProvider, IdProvider idProvider, SettingProvider settingProvider, LogTracer2 logTracer2, UiWidgetProvider uiWidgetProvider, UiVideoProvider uiVideoProvider, DevicePropProvider devicePropProvider, EmojiProvider emojiProvider, ThemeColorProvider themeColorProvider) {
            this.f3816a = z;
            this.b = context;
            this.c = templateTransport;
            this.d = embedTemplateProvider;
            this.e = resourceProvider;
            this.f = idProvider;
            this.g = settingProvider;
            this.l = logTracer2;
            this.h = uiWidgetProvider;
            this.i = uiVideoProvider;
            this.k = devicePropProvider;
            this.j = emojiProvider;
            this.m = themeColorProvider;
        }

        public Context getApplicationCtx() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("950e78ac", new Object[]{this});
            }
            return this.b;
        }

        public DevicePropProvider getDevicePropProvider() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DevicePropProvider) ipChange.ipc$dispatch("b6a15fb9", new Object[]{this});
            }
            return this.k;
        }

        public EmbedTemplateProvider getEmbedTemplateProvider() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EmbedTemplateProvider) ipChange.ipc$dispatch("1de2bfe1", new Object[]{this});
            }
            return this.d;
        }

        public EmojiProvider getEmojiProvider() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EmojiProvider) ipChange.ipc$dispatch("70b93bfb", new Object[]{this});
            }
            return this.j;
        }

        public IdProvider getIdProvider() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IdProvider) ipChange.ipc$dispatch("3441e079", new Object[]{this});
            }
            return this.f;
        }

        public LogTracer2 getLogTracer() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LogTracer2) ipChange.ipc$dispatch("d0d03dbd", new Object[]{this});
            }
            return this.l;
        }

        public ResourceProvider getResourceProvider() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ResourceProvider) ipChange.ipc$dispatch("3e0a5059", new Object[]{this});
            }
            return this.e;
        }

        public SettingProvider getSettingProvider() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SettingProvider) ipChange.ipc$dispatch("fe916fa7", new Object[]{this});
            }
            return this.g;
        }

        public ThemeColorProvider getThemeColorProvider() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ThemeColorProvider) ipChange.ipc$dispatch("a0251c19", new Object[]{this});
            }
            return this.m;
        }

        public TemplateTransport getTransport() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TemplateTransport) ipChange.ipc$dispatch("604ad171", new Object[]{this});
            }
            return this.c;
        }

        public UiVideoProvider getUiVideoProvider() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UiVideoProvider) ipChange.ipc$dispatch("45ec8e39", new Object[]{this});
            }
            return this.i;
        }

        public UiWidgetProvider getUiWidgetProvider() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UiWidgetProvider) ipChange.ipc$dispatch("17eb8299", new Object[]{this});
            }
            return this.h;
        }

        public boolean isDebuggable() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[]{this})).booleanValue();
            }
            return this.f3816a;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Config{debuggable=" + this.f3816a + ", applicationCtx=" + this.b + ", transport=" + this.c + ", embedTemplateProvider=" + this.d + ", resourceProvider=" + this.e + ", idProvider=" + this.f + ", settingProvider=" + this.g + ", uiWidgetProvider=" + this.h + ", devicePropProvider=" + this.k + ", logTracer=" + this.l + ", themeColorProvider=" + this.m + '}';
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface ContentAdapter {
        Object convert(Object obj, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface DevicePropProvider {
        boolean capableOf(String str);

        String getProperty(String str, Map<String, String> map);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface EmbedTemplateProvider {
        String getTemplate(Context context, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface EmojiProvider {
        String prepareContent(String str);

        int renderEmojiReturncount(Context context, SpannableStringBuilder spannableStringBuilder, int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface IdProvider {
        int getUniqueResId(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface LogTracer {
        public static final int BIZ_BIRDNEST = 2;
        public static final int BIZ_COMM = 0;
        public static final int TYPE_ERROR = 3;
        public static final int TYPE_EXCEPTION = 2;
        public static final int TYPE_FOOTPRINT = 0;
        public static final int TYPE_PERF = 1;

        void trace(int i, int i2, String str, String str2, String str3, String str4, String str5, Map<String, String> map, Throwable th);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface LogTracer2 extends LogTracer {
        public static final LogTracer2 noopLogTracer2 = new LogTracer2() { // from class: com.alipay.birdnest.api.BirdNestEngine.LogTracer2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.birdnest.api.BirdNestEngine.LogTracer2
            public void addCoreSampleLog(int i, long j, long j2, String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4b0cb276", new Object[]{this, new Integer(i), new Long(j), new Long(j2), str, str2});
                }
            }

            @Override // com.alipay.birdnest.api.BirdNestEngine.LogTracer2
            public void addEventLog(String str, String str2, Map<String, String> map, Map<String, String> map2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("79292006", new Object[]{this, str, str2, map, map2});
                }
            }

            @Override // com.alipay.birdnest.api.BirdNestEngine.LogTracer2
            public void addViewLog(Object obj, String str, String str2, Map<String, String> map, Map<String, String> map2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("159fcbd5", new Object[]{this, obj, str, str2, map, map2});
                }
            }

            @Override // com.alipay.birdnest.api.BirdNestEngine.LogTracer2
            public void flushCoreSampleLog() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("95053cbe", new Object[]{this});
                }
            }

            @Override // com.alipay.birdnest.api.BirdNestEngine.LogTracer2, com.alipay.birdnest.api.BirdNestEngine.LogTracer
            public void trace(int i, int i2, String str, String str2, String str3, String str4, String str5, Map<String, String> map, Throwable th) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("463bc02e", new Object[]{this, new Integer(i), new Integer(i2), str, str2, str3, str4, str5, map, th});
                }
            }
        };

        @Deprecated
        void addCoreSampleLog(int i, long j, long j2, String str, String str2);

        void addEventLog(String str, String str2, Map<String, String> map, Map<String, String> map2);

        void addViewLog(Object obj, String str, String str2, Map<String, String> map, Map<String, String> map2);

        @Deprecated
        void flushCoreSampleLog();

        @Override // com.alipay.birdnest.api.BirdNestEngine.LogTracer
        /* synthetic */ void trace(int i, int i2, String str, String str2, String str3, String str4, String str5, Map<String, String> map, Throwable th);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface ResourceProvider {

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public interface Callback {
            void onLoadFailure(int i, int i2, Object obj);

            void onLoadSuccess(int i, int i2, Object obj);
        }

        Object getResource(Context context, String str, String str2, String str3);

        Object getResourceAsync(View view, String str, int i, int i2, Drawable drawable, Drawable drawable2, int i3, boolean z, Callback callback, Bundle bundle);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface SampledLogContext {
        String provideSampleLogIdentity();

        ArrayList<?> provideSampleLogSpace();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface SettingProvider {
        String getLocale();

        String getRawSwitch(String str, String str2);

        boolean getSwitch(String str, boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface TemplateFilter {
        boolean accept(String str, String str2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum TemplateStatus {
        FAIL,
        ADD,
        UPDATE,
        EXIST
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface TemplateTransport {
        List<String> fetchTemplates(Map<String, String> map);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface ThemeColorProvider {
        public static final int THEME_CUSTOM_THEME = 65536;
        public static final int THEME_DARK_MODE = 1;
        public static final int THEME_NORMAL = 0;

        void addThemeChangeListener(FBDocument fBDocument, ks9<Integer, Void> ks9Var);

        int mapHexColor(int i, int i2);

        int mapVarColor(String str, int i);

        int themeBitsForCurrentDocument(FBDocument fBDocument);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface UiVideoProvider {

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public interface VideoCallback {
            void onCompletion();

            void onError(int i, String str, Object obj);

            void onFinish();

            void onPlaying();

            void onStart();

            void onUserAction(String str, String str2);

            void onViewClicked(Point point, Point point2);

            void playerBuffering();

            void playerBufferingEnd();

            void playerPaused();

            void playerSeekComplete(boolean z);

            void playerSeeking();

            void playerStopped();
        }

        View createVideoView(Context context, VideoCallback videoCallback);

        void destroyVideoView(View view);

        Object getAttribute(View view, String str);

        void loadUri(View view, HashMap<String, String> hashMap);

        void pause(View view);

        void play(View view);

        void prepare(View view);

        void resume(View view);

        void setAttribute(View view, String str, Object obj);

        @Deprecated
        void setRollbackWrapper(boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface UiWidgetProvider {

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public interface CreateCallback {
            void onError(String str);

            void onSuccess(View view, Bundle bundle);
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public interface LoadUrlListener {
            boolean onLoadUrl(String str);

            void onPageEvent(String str, String str2);
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public interface YearMounthPickerCallback {
            void onPick(String str, String str2);
        }

        Dialog createDialog(Context context, String str, String str2, String str3, String[] strArr, AdapterView.OnItemClickListener onItemClickListener);

        View createIconView(Context context, String str, String str2, String str3);

        View createLoadingView(Context context);

        FBOverView createOverView(Context context);

        View createViewByTag(Context context, String str, Map<String, String> map);

        View createWebView(Context context, String str, LoadUrlListener loadUrlListener, Map<String, String> map);

        void createWebViewAsync(Context context, String str, LoadUrlListener loadUrlListener, Map<String, String> map, CreateCallback createCallback);

        Dialog createYearMounthPickerDialog(Context context, int i, int i2, int i3, String str, YearMounthPickerCallback yearMounthPickerCallback);

        void destroyWebView(View view);

        void loadData(View view, String str, String str2, String str3);

        void loadUrlWithWebView(View view, String str);

        void openWebPage(String str, String str2, Context context);

        void updateWebViewProperties(View view, String str, String str2);
    }

    static {
        Runtime.getRuntime().availableProcessors();
    }

    public BirdNestEngine(Config config) {
        LogTracer2 logTracer2;
        GlobalCacheForApi.a();
        Platform.h();
        this.config = config;
        if (config.getLogTracer() != null) {
            logTracer2 = config.getLogTracer();
        } else {
            logTracer2 = LogTracer2.noopLogTracer2;
        }
        this.h = logTracer2;
        this.c = new TemplateStorage(getConfig().getApplicationCtx(), this.config.isDebuggable(), logTracer2);
        new TemplateManager();
        this.d = new FBImageLoader(this);
    }

    public static BirdNestEngine create(Config config) throws Exception {
        String str;
        if (!m || config == null || config.getApplicationCtx() == null || config.getEmbedTemplateProvider() == null || config.getResourceProvider() == null || config.getTransport() == null || config.getIdProvider() == null || config.getSettingProvider() == null || config.getUiWidgetProvider() == null) {
            StringBuilder sb = new StringBuilder("The config is invalid(");
            if (config == null) {
                str = pg1.ATOM_EXT_Null;
            } else {
                str = config.toString();
            }
            sb.append(str);
            sb.append(f7l.BRACKET_END_STR);
            throw new RuntimeException(sb.toString());
        }
        BirdNestEngine birdNestEngine = new BirdNestEngine(config);
        birdNestEngine.e = config.getIdProvider().getUniqueResId("alipay_msp_tag_view_holder");
        return birdNestEngine;
    }

    public static String getVersion() {
        return "6.2.2";
    }

    public static void init(Context context) {
        FBDocumentAssistor.a(context);
        m = true;
    }

    public final void a(Context context, FBContext fBContext) {
        Set<FBContext> set;
        int hashCode = context.hashCode();
        if (this.b == null) {
            this.b = new ConcurrentHashMap();
        }
        if (this.b.containsKey(Integer.valueOf(hashCode))) {
            set = this.b.get(Integer.valueOf(hashCode));
        } else {
            HashSet hashSet = new HashSet();
            this.b.put(Integer.valueOf(hashCode), hashSet);
            set = hashSet;
        }
        set.add(fBContext);
    }

    public final void b(Params params, String str) {
        Set<Integer> set;
        if (!TextUtils.isEmpty(str)) {
            if (this.f3812a == null) {
                this.f3812a = new ConcurrentHashMap();
            }
            if (this.f3812a.containsKey(str)) {
                set = this.f3812a.get(str);
            } else {
                HashSet hashSet = new HashSet();
                this.f3812a.put(str, hashSet);
                set = hashSet;
            }
            set.add(Integer.valueOf(params.context.hashCode()));
        }
    }

    @Deprecated
    public String birdParams(String str, Resources resources) {
        IpChange ipChange = Platform.$ipChange;
        return "";
    }

    public void clearCachedElement(int i, boolean z) {
        if (this.f3812a != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : ((ConcurrentHashMap) this.f3812a).keySet()) {
                Set set = (Set) ((ConcurrentHashMap) this.f3812a).get(str);
                if (set != null && set.contains(Integer.valueOf(i))) {
                    set.remove(Integer.valueOf(i));
                    if (set.size() == 0) {
                        arrayList.add(str);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    String str2 = (String) arrayList.get(i2);
                    ((ConcurrentHashMap) this.f3812a).remove(str2);
                    this.c.removeInMemTpl(str2);
                }
                arrayList.clear();
            }
        }
        ConcurrentMap<Integer, Set<FBContext>> concurrentMap = this.b;
        if (concurrentMap != null) {
            Set set2 = (Set) ((ConcurrentHashMap) concurrentMap).remove(Integer.valueOf(i));
            if (set2 != null) {
                if (!z) {
                    for (FBContext fBContext : (FBContext[]) set2.toArray(new FBContext[set2.size()])) {
                        fBContext.destroy(null);
                    }
                }
                set2.clear();
            }
        }
        getImageLoader().clearCache(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void destroyView(android.view.View r6, java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r5.e
            java.lang.Object r0 = r6.getTag(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0066
            java.util.concurrent.ConcurrentMap<java.lang.Integer, java.util.Set<com.alipay.android.app.template.FBContext>> r2 = r5.b
            if (r2 == 0) goto L_0x0066
            boolean r2 = r0 instanceof com.alipay.android.app.template.ITemplateDisposable
            if (r2 == 0) goto L_0x0037
            com.alipay.android.app.template.ITemplateDisposable r0 = (com.alipay.android.app.template.ITemplateDisposable) r0
            boolean r2 = r0.isDestroyed()
            if (r2 != 0) goto L_0x0066
            int r2 = r0.getContextHashCode()
            java.util.concurrent.ConcurrentMap<java.lang.Integer, java.util.Set<com.alipay.android.app.template.FBContext>> r3 = r5.b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            java.lang.Object r3 = r3.get(r4)
            java.util.Set r3 = (java.util.Set) r3
            if (r3 == 0) goto L_0x0033
            r3.remove(r0)
        L_0x0033:
            r0.destroy()
            goto L_0x0067
        L_0x0037:
            boolean r2 = r0 instanceof com.flybird.FBDocument
            if (r2 == 0) goto L_0x0066
            com.flybird.FBDocument r0 = (com.flybird.FBDocument) r0
            com.flybird.FBView r2 = r0.getBodyView()
            boolean r2 = r2.isDestroyed()
            if (r2 != 0) goto L_0x0066
            com.flybird.FBView r2 = r0.getBodyView()
            int r2 = r2.getContextHashCode()
            java.util.concurrent.ConcurrentMap<java.lang.Integer, java.util.Set<com.alipay.android.app.template.FBContext>> r3 = r5.b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            java.lang.Object r3 = r3.get(r4)
            java.util.Set r3 = (java.util.Set) r3
            if (r3 == 0) goto L_0x0062
            r3.remove(r0)
        L_0x0062:
            r0.destroy(r7)
            goto L_0x0067
        L_0x0066:
            r2 = 0
        L_0x0067:
            int r0 = r5.e
            r3 = 0
            r6.setTag(r0, r3)
            if (r7 == 0) goto L_0x0085
            java.lang.String r0 = "destroyOnlySingleView"
            boolean r4 = r7.containsKey(r0)
            if (r4 == 0) goto L_0x0085
            java.lang.Object r0 = r7.get(r0)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0085
            r0 = 1
            goto L_0x0086
        L_0x0085:
            r0 = 0
        L_0x0086:
            if (r2 == 0) goto L_0x008d
            if (r0 != 0) goto L_0x008d
            r5.clearCachedElement(r2, r1)
        L_0x008d:
            if (r7 == 0) goto L_0x00bd
            java.lang.String r0 = "deferDownload"
            boolean r1 = r7.containsKey(r0)
            if (r1 == 0) goto L_0x00bd
            java.lang.Object r0 = r7.get(r0)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = "deferDownloadFilter"
            java.lang.Object r7 = r7.get(r0)
            if (r7 == 0) goto L_0x00b2
            boolean r0 = r7 instanceof com.alipay.birdnest.api.BirdNestEngine.TemplateFilter
            if (r0 == 0) goto L_0x00b2
            r3 = r7
            com.alipay.birdnest.api.BirdNestEngine$TemplateFilter r3 = (com.alipay.birdnest.api.BirdNestEngine.TemplateFilter) r3
        L_0x00b2:
            android.content.Context r6 = r6.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r5.triggerTemplateUpdate(r6, r3)
        L_0x00bd:
            tb.g52<com.alipay.mobile.common.logging.api.antevent.AntEvent> r6 = com.alipay.birdnest.api.BirdNestEngine.eventBatchRunner
            r6.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.birdnest.api.BirdNestEngine.destroyView(android.view.View, java.util.Map):void");
    }

    @Deprecated
    public Map<String, TemplateStatus> downloadTemplate(Map<String, String> map, Resources resources, Map<String, Object> map2) {
        IpChange ipChange = Platform.$ipChange;
        return new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alipay.android.app.template.FBContext generateFBContext(com.alipay.birdnest.api.BirdNestEngine.Params r25, java.lang.String r26, int r27) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.birdnest.api.BirdNestEngine.generateFBContext(com.alipay.birdnest.api.BirdNestEngine$Params, java.lang.String, int):com.alipay.android.app.template.FBContext");
    }

    public LogTracer getBatchLogTracer() {
        return this.h;
    }

    public LogTracer2 getBatchLogTracer2() {
        return this.h;
    }

    public Config getConfig() {
        return this.config;
    }

    public ExecutorService getDetachedExecutorService() {
        if (this.i == null) {
            synchronized (this) {
                this.i = Platform.makeComputeExecutorService(Runtime.getRuntime().availableProcessors(), 128, 60, "FB-Det-Trd");
            }
        }
        return this.i;
    }

    public LogTracer getEngineLogTracer() {
        return this.h;
    }

    @Deprecated
    public ExecutorService getExecutorService() {
        if (this.f == null) {
            IpChange ipChange = Platform.$ipChange;
            this.f = Executors.newCachedThreadPool();
        }
        return this.f;
    }

    public FBImageLoader getImageLoader() {
        return this.d;
    }

    public ExecutorService getInvokeExecutorService() {
        if (this.g == null) {
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            int max = Math.max(2, Math.min(availableProcessors - 1, 4)) + availableProcessors;
            if (getConfig().getSettingProvider().getSwitch("bn_rollback_limitThreadPool", false)) {
                this.g = new ThreadPoolExecutor(max, max, 120L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory(this) { // from class: com.alipay.birdnest.api.BirdNestEngine.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a  reason: collision with root package name */
                    public int f3813a = 0;

                    @Override // java.util.concurrent.ThreadFactory
                    public Thread newThread(Runnable runnable) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                        }
                        this.f3813a = (this.f3813a + 1) % 100;
                        return new Thread(runnable, "FBApiThrd-" + this.f3813a);
                    }
                });
            } else {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, max, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory(this) { // from class: com.alipay.birdnest.api.BirdNestEngine.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a  reason: collision with root package name */
                    public int f3814a = 0;

                    @Override // java.util.concurrent.ThreadFactory
                    public Thread newThread(Runnable runnable) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                        }
                        this.f3814a = (this.f3814a + 1) % 100;
                        return new Thread(runnable, "FBApiThrd-" + this.f3814a);
                    }
                });
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                this.g = threadPoolExecutor;
            }
        }
        return this.g;
    }

    public String getRawSwitch(String str) {
        SettingProvider settingProvider;
        Config config = getConfig();
        if (config == null || (settingProvider = config.getSettingProvider()) == null) {
            return null;
        }
        return settingProvider.getRawSwitch(str, null);
    }

    public SampledLogContext getStandaloneLogCtx() {
        return this.l;
    }

    public Object getStandaloneOptions() {
        return this.k;
    }

    public boolean getSwitch(String str, boolean z) {
        Config config = getConfig();
        if (config == null) {
            return z;
        }
        SettingProvider settingProvider = config.getSettingProvider();
        if (settingProvider == null) {
            return z;
        }
        return settingProvider.getSwitch(str, z);
    }

    public int getTagId() {
        return this.e;
    }

    @Deprecated
    public Template getTemplate(String str, Resources resources) {
        try {
            return this.c.getTemplate(str, resources);
        } catch (SQLException e) {
            FBLogger.e("BirdNestEngine", e);
            return null;
        }
    }

    @Deprecated
    public TemplateStorage getTplStorage() {
        return this.c;
    }

    @Deprecated
    public Map<String, TemplateStatus> handleBirdResponse(Map<String, String> map, Resources resources, Map<String, Object> map2) {
        IpChange ipChange = Platform.$ipChange;
        return new HashMap();
    }

    @Deprecated
    public void preloadTemplateToMem(Resources resources, String str) {
        this.c.getTemplateFromResource(resources, str);
    }

    @Deprecated
    public void removeTemplate(String str) {
        this.c.removeTpl(str);
    }

    public void runOnUiThread(Runnable runnable) {
        this.j.post(runnable);
    }

    @Deprecated
    public void saveTemplate(Template template) throws SQLException {
        this.c.saveTemplate(template);
    }

    public void setParamsEngine(Params params) {
        if (params != null) {
            params.f3817a = this;
        }
    }

    public void setStandaloneOptsGenLogCtx(Object obj, final String str) {
        this.k = obj;
        this.l = new SampledLogContext(this) { // from class: com.alipay.birdnest.api.BirdNestEngine.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<?> f3815a = new ArrayList<>(1);

            @Override // com.alipay.birdnest.api.BirdNestEngine.SampledLogContext
            public String provideSampleLogIdentity() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("68110fe2", new Object[]{this});
                }
                return "std." + str;
            }

            @Override // com.alipay.birdnest.api.BirdNestEngine.SampledLogContext
            public ArrayList<?> provideSampleLogSpace() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ArrayList) ipChange.ipc$dispatch("e3af6cce", new Object[]{this});
                }
                return this.f3815a;
            }
        };
    }

    @Deprecated
    public void triggerTemplateUpdate(Resources resources, TemplateFilter templateFilter) {
        IpChange ipChange = Platform.$ipChange;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Params {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String KEY_INDEX_URL = "indexUrl";
        public static final String KEY_VIRTUAL_HOST = "virtualHost";

        /* renamed from: a  reason: collision with root package name */
        public BirdNestEngine f3817a;
        public int actionBarHeight;
        public Map<String, String> appParams;
        public String bizSource;
        public String bundleName;
        public String businessId;
        public OnLoadCallback callback;
        public Context context;
        public Resources contextResources;
        public boolean createImmediately;
        public DevicePropProvider devicePropProvider;
        public FBResourceClient.Type docType;
        public EventHandler dtmEventListener;
        public FBBridge eventBridge;
        public Object eventTarget;
        public Map<String, Object> extParams;
        public FBPluginFactory factory;
        public boolean inBg;
        public int initialWinHeight;
        public int initialWinWidth;
        public boolean jsDebugger;
        public JsPluginFactory jsPluginFactory;
        public TemplateKeyboardService keyboardService;
        public TElementEventHandler mElementEventObserver;
        public View paramView;
        public TemplatePasswordService passwordService;
        public gwt prepareTiming;
        public int renderOptFlag;
        public FBResourceClient resourceClient;
        public boolean reuse;
        public String tid;
        public boolean tmFlagsPrerenderV2;
        public String tplHtml;
        public String tplJson;
        public String ttime;
        public String tversion;
        public String varJson;

        public Params() {
            this.docType = FBResourceClient.Type.MAIN_FRAME;
            this.createImmediately = true;
            this.ttime = "";
            this.tversion = "";
            this.prepareTiming = gwt.c();
        }

        public String getContent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this});
            }
            String str = this.tplHtml;
            return (TextUtils.isEmpty(str) || TextUtils.equals("{}", str)) ? this.tplJson : str;
        }

        public BirdNestEngine getEngine() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BirdNestEngine) ipChange.ipc$dispatch("66fb5877", new Object[]{this});
            }
            return this.f3817a;
        }

        public Params(Params params) {
            this.docType = FBResourceClient.Type.MAIN_FRAME;
            this.createImmediately = true;
            this.ttime = "";
            this.tversion = "";
            this.f3817a = params.f3817a;
            this.extParams = params.extParams;
            this.docType = params.docType;
            this.createImmediately = params.createImmediately;
            this.tid = params.tid;
            this.ttime = params.ttime;
            this.tversion = params.tversion;
            this.tplHtml = params.tplHtml;
            this.tplJson = params.tplJson;
            this.varJson = params.varJson;
            this.bizSource = null;
            this.dtmEventListener = params.dtmEventListener;
            this.mElementEventObserver = params.mElementEventObserver;
            this.actionBarHeight = params.actionBarHeight;
            this.businessId = params.businessId;
            this.context = params.context;
            this.bundleName = params.bundleName;
            this.paramView = params.paramView;
            this.reuse = false;
            this.inBg = false;
            this.factory = params.factory;
            this.jsPluginFactory = params.jsPluginFactory;
            this.callback = params.callback;
            this.keyboardService = params.keyboardService;
            this.passwordService = params.passwordService;
            this.appParams = params.appParams;
            this.eventTarget = params.eventTarget;
            this.eventBridge = params.eventBridge;
            this.resourceClient = params.resourceClient;
            this.contextResources = null;
            this.devicePropProvider = params.devicePropProvider;
            this.jsDebugger = params.jsDebugger;
            this.initialWinWidth = params.initialWinWidth;
            this.initialWinHeight = params.initialWinHeight;
            this.renderOptFlag = params.renderOptFlag;
            this.tmFlagsPrerenderV2 = params.tmFlagsPrerenderV2;
            this.prepareTiming = gwt.c();
        }
    }

    public FBContext generateFBContext(Params params) {
        int i;
        Map<String, String> map;
        String str = params.tplHtml;
        if (TextUtils.isEmpty(str) || TextUtils.equals("{}", str)) {
            str = params.tplJson;
            i = 1;
        } else {
            i = 0;
        }
        FBResourceClient.Type type = params.docType;
        FBResourceClient.Type type2 = FBResourceClient.Type.MAIN_FRAME;
        if (!(type != type2 || (map = params.appParams) == null || params.resourceClient == null)) {
            Object shouldInterceptResource = params.resourceClient.shouldInterceptResource(map.get(Params.KEY_INDEX_URL), type2);
            if (shouldInterceptResource instanceof String) {
                str = FBDocumentAssistor.a((String) shouldInterceptResource);
                if (str.charAt(0) == '<') {
                    params.tplHtml = str;
                    i = 21;
                } else {
                    params.tplJson = str;
                    i = 22;
                }
            }
        }
        return generateFBContext(params, str, i);
    }
}
