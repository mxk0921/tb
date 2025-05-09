package com.taobao.message.lab.comfrm.support.trace;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.FrameMetrics;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.MonitorUtil;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.PluginAdapter;
import com.taobao.message.lab.comfrm.inner2.config.SourceItem;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import com.taobao.message.lab.comfrm.render.WidgetRenderImpl;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import tb.mdd;
import tb.qnl;
import tb.snl;
import tb.t2o;
import tb.vxm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class PageLoadPlugin extends PluginAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PageTracePlugin";
    private boolean isCheckListener;
    private final WeakReference<Activity> mActivityRef;
    public final Data mData;
    private WeakReference<Window.OnFrameMetricsAvailableListener> mOnFrameMetricsListenerRef;
    private WeakReference<ViewTreeObserver.OnGlobalLayoutListener> mOnGlobalLayoutListenerRef;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class Data {
        public String apmPageSession;
        public volatile String bizConfigCode;
        public volatile String bizConfigKey;
        public volatile long checkRealDataFinishTime;
        public volatile long checkRealViewFinishTime;
        public volatile long checkSnapshotDataFinishTime;
        public volatile long checkSnapshotViewFinishTime;
        public volatile long containerStartTime;
        public boolean isAddBizTag;
        public boolean isReportSourceUseTime;
        public volatile long originStartTime;
        public volatile long pageEndTime;
        public volatile long pageStartTime;
        public volatile Map<String, Long> sourceEndTimeMap;
        public volatile Map<String, Long> sourceStartTimeMap;
        public volatile List<String> sourceTimeoutList;
        public volatile String version;

        static {
            t2o.a(537919863);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SourceReportRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Data mData;
        private final PageLoadPlugin mPageLoadPlugin;

        static {
            t2o.a(537919865);
        }

        public SourceReportRunnable(Data data, PageLoadPlugin pageLoadPlugin) {
            this.mData = data;
            this.mPageLoadPlugin = pageLoadPlugin;
        }

        @Override // java.lang.Runnable
        public void run() {
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.mData.sourceStartTimeMap != null && this.mData.sourceEndTimeMap != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add("duration");
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("containerKey");
                arrayList2.add("sourceName");
                AppMonitor.register("messageDojo", "source", MeasureSet.create(arrayList), DimensionSet.create(arrayList2));
                String str = this.mData.bizConfigCode;
                if (!TextUtils.isEmpty(this.mData.version)) {
                    str = str + "_" + this.mData.version;
                }
                for (String str2 : this.mData.sourceStartTimeMap.keySet()) {
                    HashMap hashMap = new HashMap(1);
                    if (ValueUtil.getLong(this.mData.sourceEndTimeMap, str2) > 0) {
                        hashMap.put("duration", Double.valueOf(j - this.mData.sourceStartTimeMap.get(str2).longValue()));
                        HashMap hashMap2 = new HashMap(2);
                        hashMap2.put("containerKey", str);
                        hashMap2.put("sourceName", str2);
                        MonitorUtil.commitStat("messageDojo", "source", hashMap2, hashMap);
                    }
                }
            }
        }
    }

    static {
        t2o.a(537919857);
    }

    public PageLoadPlugin(Activity activity, long j, long j2, String str) {
        Data data = new Data();
        this.mData = data;
        data.apmPageSession = str;
        data.originStartTime = j;
        data.pageStartTime = j2;
        this.mActivityRef = new WeakReference<>(activity);
        Schedules.getLowBackground().schedule(new ReportRunnable(data, this), 5000L, TimeUnit.MILLISECONDS);
    }

    public static /* synthetic */ boolean access$000(PageLoadPlugin pageLoadPlugin, WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86abf6e0", new Object[]{pageLoadPlugin, weakReference})).booleanValue();
        }
        return pageLoadPlugin.checkViewImpl(weakReference);
    }

    public static /* synthetic */ void access$100(PageLoadPlugin pageLoadPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4012bec3", new Object[]{pageLoadPlugin});
        } else {
            pageLoadPlugin.releaseViewListener();
        }
    }

    public static /* synthetic */ WeakReference access$200(PageLoadPlugin pageLoadPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("6d227952", new Object[]{pageLoadPlugin});
        }
        return pageLoadPlugin.mActivityRef;
    }

    public static /* synthetic */ WeakReference access$300(PageLoadPlugin pageLoadPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("9568b993", new Object[]{pageLoadPlugin});
        }
        return pageLoadPlugin.mOnFrameMetricsListenerRef;
    }

    public static /* synthetic */ WeakReference access$302(PageLoadPlugin pageLoadPlugin, WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("7933fa05", new Object[]{pageLoadPlugin, weakReference});
        }
        pageLoadPlugin.mOnFrameMetricsListenerRef = weakReference;
        return weakReference;
    }

    public static /* synthetic */ WeakReference access$400(PageLoadPlugin pageLoadPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("bdaef9d4", new Object[]{pageLoadPlugin});
        }
        return pageLoadPlugin.mOnGlobalLayoutListenerRef;
    }

    public static /* synthetic */ WeakReference access$402(PageLoadPlugin pageLoadPlugin, WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("956d4d64", new Object[]{pageLoadPlugin, weakReference});
        }
        pageLoadPlugin.mOnGlobalLayoutListenerRef = weakReference;
        return weakReference;
    }

    private boolean checkViewImpl(WeakReference<ViewGroup> weakReference) {
        Activity activity;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9fb6d8e", new Object[]{this, weakReference})).booleanValue();
        }
        if (this.mData.checkRealViewFinishTime > 0 || (activity = this.mActivityRef.get()) == null || (viewGroup = weakReference.get()) == null) {
            return false;
        }
        if (checkView(this.mActivityRef)) {
            ApplicationUtil.isDebug();
            if (WidgetRenderImpl.isSnapshot(viewGroup)) {
                if (this.mData.checkSnapshotViewFinishTime <= 0) {
                    activity.getWindow().getDecorView().post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.trace.PageLoadPlugin.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            ApplicationUtil.isDebug();
                            if (PageLoadPlugin.this.mData.checkSnapshotViewFinishTime <= 0) {
                                PageLoadPlugin.this.mData.checkSnapshotViewFinishTime = SystemClock.uptimeMillis();
                            }
                        }
                    });
                }
            } else if (this.mData.checkRealViewFinishTime <= 0) {
                activity.getWindow().getDecorView().post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.trace.PageLoadPlugin.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ApplicationUtil.isDebug();
                        if (PageLoadPlugin.this.mData.checkRealViewFinishTime <= 0) {
                            PageLoadPlugin.this.mData.checkRealViewFinishTime = SystemClock.uptimeMillis();
                        }
                    }
                });
            }
            return true;
        }
        ApplicationUtil.isDebug();
        return false;
    }

    public static /* synthetic */ Object ipc$super(PageLoadPlugin pageLoadPlugin, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1006013493:
                super.onSourceEnd((SourceItem) objArr[0], (Command) objArr[1], (Action) objArr[2]);
                return null;
            case 232276581:
                super.onSourceEnd((Action) objArr[0]);
                return null;
            case 739701755:
                super.onContainerStepStart((String) objArr[0], (String) objArr[1], (String) objArr[2], ((Number) objArr[3]).intValue(), (Map) objArr[4]);
                return null;
            case 958399305:
                super.onSourceStart((SourceItem) objArr[0], (Command) objArr[1]);
                return null;
            case 1113031332:
                super.onRenderBefore((ViewObject) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/trace/PageLoadPlugin");
        }
    }

    private void releaseViewListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bc20ca7", new Object[]{this});
        } else {
            Schedules.ui(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.trace.PageLoadPlugin.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Activity activity = (Activity) PageLoadPlugin.access$200(PageLoadPlugin.this).get();
                    if (activity != null) {
                        if (PageLoadPlugin.access$300(PageLoadPlugin.this) != null) {
                            Window.OnFrameMetricsAvailableListener a2 = qnl.a(PageLoadPlugin.access$300(PageLoadPlugin.this).get());
                            if (a2 != null && Build.VERSION.SDK_INT >= 24) {
                                activity.getWindow().removeOnFrameMetricsAvailableListener(a2);
                            }
                            PageLoadPlugin.access$302(PageLoadPlugin.this, null);
                        }
                        if (PageLoadPlugin.access$400(PageLoadPlugin.this) != null) {
                            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) PageLoadPlugin.access$400(PageLoadPlugin.this).get();
                            if (onGlobalLayoutListener != null) {
                                activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
                            }
                            PageLoadPlugin.access$402(PageLoadPlugin.this, null);
                        }
                    }
                }
            });
        }
    }

    public abstract boolean checkVO(ViewObject viewObject);

    public abstract boolean checkView(WeakReference<Activity> weakReference);

    public Map<String, String> getCustomDimension() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a302f7b", new Object[]{this});
        }
        return null;
    }

    public String getCustomerBizStage(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84ee6fe7", new Object[]{this, viewObject});
        }
        return null;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerDisposeFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f56faef6", new Object[]{this});
            return;
        }
        if (this.mData.pageEndTime <= 0) {
            this.mData.pageEndTime = SystemClock.uptimeMillis();
        }
        releaseViewListener();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStartStart(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ee7cc7", new Object[]{this, str, str2, str3});
            return;
        }
        this.mData.bizConfigKey = str;
        this.mData.version = str3;
        this.mData.bizConfigCode = str2;
        this.mData.containerStartTime = SystemClock.uptimeMillis();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStepStart(String str, String str2, String str3, int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c16f3fb", new Object[]{this, str, str2, str3, new Integer(i), map});
            return;
        }
        super.onContainerStepStart(str, str2, str3, i, map);
        this.mData.bizConfigKey = str;
        this.mData.version = str3;
        this.mData.bizConfigCode = str2;
        this.mData.containerStartTime = SystemClock.uptimeMillis();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onEventReceived(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e5ba16", new Object[]{this, event});
        } else if (event != null && "onDisappear".equals(event.getName()) && this.mData.pageEndTime <= 0) {
            this.mData.pageEndTime = SystemClock.uptimeMillis();
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderAfter(ViewObject viewObject, final ViewGroup viewGroup, WidgetInstance widgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59558731", new Object[]{this, viewObject, viewGroup, widgetInstance});
        } else if (viewObject != null && this.mData.checkRealDataFinishTime <= 0 && checkVO(viewObject)) {
            if (viewObject.isSnapshot) {
                if (this.mData.checkSnapshotDataFinishTime <= 0) {
                    this.mData.checkSnapshotDataFinishTime = SystemClock.uptimeMillis();
                }
            } else if (this.mData.checkRealDataFinishTime <= 0) {
                this.mData.checkRealDataFinishTime = SystemClock.uptimeMillis();
            }
            if (!this.isCheckListener) {
                this.isCheckListener = true;
                Activity activity = this.mActivityRef.get();
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = new Window.OnFrameMetricsAvailableListener() { // from class: com.taobao.message.lab.comfrm.support.trace.PageLoadPlugin.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.Window.OnFrameMetricsAvailableListener
                        public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("e6a75cee", new Object[]{this, window, frameMetrics, new Integer(i)});
                            } else if (PageLoadPlugin.access$000(PageLoadPlugin.this, new WeakReference(viewGroup))) {
                                PageLoadPlugin.access$100(PageLoadPlugin.this);
                            }
                        }
                    };
                    activity.getWindow().addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, new Handler(Looper.getMainLooper()));
                    this.mOnFrameMetricsListenerRef = new WeakReference<>(onFrameMetricsAvailableListener);
                    return;
                }
                activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.message.lab.comfrm.support.trace.PageLoadPlugin.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                        } else if (PageLoadPlugin.access$000(PageLoadPlugin.this, new WeakReference(viewGroup))) {
                            PageLoadPlugin.access$100(PageLoadPlugin.this);
                        }
                    }
                });
            }
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceEnd(SourceItem sourceItem, Command command, Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40973cb", new Object[]{this, sourceItem, command, action});
            return;
        }
        super.onSourceEnd(sourceItem, command, action);
        if (TextUtils.equals(command.getName(), StdActions.COMMAND_INIT_SOURCE)) {
            if (this.mData.sourceEndTimeMap == null) {
                this.mData.sourceEndTimeMap = new ConcurrentHashMap();
            }
            this.mData.sourceEndTimeMap.put(sourceItem.name, Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceStart(SourceItem sourceItem, Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39200349", new Object[]{this, sourceItem, command});
            return;
        }
        super.onSourceStart(sourceItem, command);
        if (TextUtils.equals(command.getName(), StdActions.COMMAND_INIT_SOURCE)) {
            if (this.mData.sourceStartTimeMap == null) {
                this.mData.sourceStartTimeMap = new ConcurrentHashMap();
            }
            this.mData.sourceStartTimeMap.put(sourceItem.name, Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceTimeout(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300e271f", new Object[]{this, list});
        } else {
            this.mData.sourceTimeoutList = list;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class ReportRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String DIMENSION_APP_FULL_NEW_INSTALL = "isFullNewInstall";
        private static final String DIMENSION_APP_LAUNCH_TYPE = "appLaunchType";
        private static final String DIMENSION_BIZ_CONFIG_KEY = "bizConfigKey";
        private static final String DIMENSION_BIZ_VERSION = "version";
        private static final String DIMENSION_CUSTOM_ARGS = "customArgs";
        private static final String DIMENSION_HIT_SNAPSHOT = "hitSnapshot";
        private static final String DIMENSION_IN_APP_START_8_SECOND = "inAppStart8Second";
        private static final String DIMENSION_IS_SUCCESS = "isSuccess";
        private static final String DIMENSION_REAL_LOAD_FINISH = "realLoadFinish";
        private static final String DIMENSION_SOURCE_TIMEOUT = "sourceTimeout";
        private static final String DIMENSION_VALID_STAY = "validStay";
        private static final String MEASURE_CHECK_REAL_DATA_FINISH_TIME = "checkRealDataFinishTime";
        private static final String MEASURE_CHECK_REAL_VIEW_FINISH_TIME = "checkRealViewFinishTime";
        private static final String MEASURE_CHECK_SNAPSHOT_DATA_FINISH_TIME = "checkSnapshotDataFinishTime";
        private static final String MEASURE_CHECK_SNAPSHOT_VIEW_FINISH_TIME = "checkSnapshotViewFinishTime";
        private static final String MEASURE_CONTAINER_START_TIME = "containerStartTime";
        private static final String MEASURE_CONTAINER_TOTAL = "containerTotal";
        private static final String MEASURE_FAIL_COUNT = "failCount";
        private static final String MEASURE_HIT_SNAPSHOT_COUNT = "hitSnapshotCount";
        private static final String MEASURE_ORIGIN_START_TIME = "originStartTime";
        private static final String MEASURE_ORIGIN_TOTAL = "originTotal";
        private static final String MEASURE_PAGE_END_TIME = "pageEndTime";
        private static final String MEASURE_PAGE_START_TIME = "pageStartTime";
        private static final String MEASURE_PAGE_TOTAL = "pageTotal";
        private static final String MEASURE_REAL_CONTAINER_TOTAL = "realContainerTotal";
        private static final String MEASURE_REAL_LOAD_FINISH_COUNT = "realLoadFinishCount";
        private static final String MEASURE_REAL_ORIGIN_TOTAL = "realOriginTotal";
        private static final String MEASURE_REAL_PAGE_TOTAL = "realPageTotal";
        private static final String MEASURE_SNAPSHOT_CONTAINER_TOTAL = "snapshotContainerTotal";
        private static final String MEASURE_SNAPSHOT_ORIGIN_TOTAL = "snapshotOriginTotal";
        private static final String MEASURE_SNAPSHOT_PAGE_TOTAL = "snapshotPageTotal";
        private static final String MEASURE_SUCCESS_COUNT = "successCount";
        private static final String MODULE = "BricksDojo";
        private static final String POINT = "pageLoadStat";
        private final Data mData;
        private final PageLoadPlugin pageLoadPlugin;

        static {
            t2o.a(537919864);
        }

        public ReportRunnable(Data data, PageLoadPlugin pageLoadPlugin) {
            this.mData = data;
            this.pageLoadPlugin = pageLoadPlugin;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x025c  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x029d  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x02c4  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x02c6  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x02cc  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x02ce  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x02d4  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x02d6  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x02df  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x02e2  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x02e9  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x02ed  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0301  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x037e  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0380  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x038c  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x038e  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x039a  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x039c  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x03a9  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 1103
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.lab.comfrm.support.trace.PageLoadPlugin.ReportRunnable.run():void");
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderBefore(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425782a4", new Object[]{this, viewObject});
            return;
        }
        super.onRenderBefore(viewObject);
        String customerBizStage = getCustomerBizStage(viewObject);
        if (!TextUtils.isEmpty(customerBizStage)) {
            Data data = this.mData;
            if (!data.isAddBizTag) {
                data.isAddBizTag = true;
                try {
                    String str = data.apmPageSession;
                    if (TextUtils.isEmpty(str)) {
                        str = snl.f28161a.f(this.mActivityRef.get()).b();
                    }
                    mdd b = vxm.b.b(str);
                    if (viewObject != null && b != null) {
                        b.a("containerKey", this.mData.bizConfigKey);
                        b.a("snapshot", Boolean.valueOf(viewObject.isSnapshot));
                        b.a("bizStage", customerBizStage);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceEnd(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd84265", new Object[]{this, action});
            return;
        }
        super.onSourceEnd(action);
        Data data = this.mData;
        if (!data.isReportSourceUseTime) {
            data.isReportSourceUseTime = true;
            Schedules.getLowBackground().schedule(new SourceReportRunnable(this.mData, this), 3000L, TimeUnit.MILLISECONDS);
        }
    }

    public PageLoadPlugin(Activity activity) {
        this.mData = new Data();
        this.mActivityRef = new WeakReference<>(activity);
    }
}
