package com.taobao.message.lab.comfrm.inner2;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.kit.provider.IErrorReportProvider;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.config.SourceInfo;
import com.taobao.message.lab.comfrm.inner2.config.SourceItem;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SourceManager implements CommandHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SourceManager";
    private final ActionDispatcher mActionDispatcher;
    private final String mClassNamespace;
    private final String mContainerKey;
    private final String mIdentifier;
    private List<CI<SourceItem, Source>> mList;
    private final Plugin mPlugin;
    private final Map<String, Object> mProps;
    private final SourceInfo mSourceInfo;
    private final boolean mUseRemote;
    private long useSourceStartTime;
    private volatile boolean timeoutFlag = false;
    private volatile boolean isDispose = false;
    private final MergeActionDispatcher mergeFinishActionDispatcher = new MergeActionDispatcher(null, null) { // from class: com.taobao.message.lab.comfrm.inner2.SourceManager.4
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final AtomicInteger mAtomicInteger = new AtomicInteger(0);
        private final AtomicBoolean isFinish = new AtomicBoolean(true);

        public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/inner2/SourceManager$4");
        }

        @Override // com.taobao.message.lab.comfrm.inner2.SourceManager.MergeActionDispatcher, com.taobao.message.lab.comfrm.core.ActionDispatcher
        public void dispatch(Action action) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("865d606c", new Object[]{this, action});
            } else if (this.mAtomicInteger.addAndGet(1) >= this.maxCount && this.isFinish.getAndSet(false) && SourceManager.access$800(SourceManager.this) != null) {
                SourceManager.access$800(SourceManager.this).onSourceEnd(action);
            }
        }
    };
    private final Set<SourceItem> mUsedSet = new HashSet();
    private final Map<String, Object> originalData = new ConcurrentHashMap();
    private final Map<String, DeltaItem> deltaItemMap = new ConcurrentHashMap();
    private final Map<String, SourceRuntimeInfo> runtimeInfoMap = new ConcurrentHashMap();
    private final List<Source> mSubscribeSource = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class MergeActionDispatcher implements ActionDispatcher, ErrorDispatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ActionDispatcher finishActionDispatcher;
        private Command initCommand;
        public int maxCount = 0;
        private final CI<SourceItem, Source> source;
        private Action startAction;

        static {
            t2o.a(537919653);
            t2o.a(537919547);
            t2o.a(537919600);
        }

        public MergeActionDispatcher(CI<SourceItem, Source> ci, Command command) {
            this.source = ci;
            this.initCommand = command;
        }

        public static /* synthetic */ CI access$2200(MergeActionDispatcher mergeActionDispatcher) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CI) ipChange.ipc$dispatch("9bd5f6fe", new Object[]{mergeActionDispatcher});
            }
            return mergeActionDispatcher.source;
        }

        @Override // com.taobao.message.lab.comfrm.inner2.ErrorDispatcher
        public void error(Object obj, Error error) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8325e4b3", new Object[]{this, obj, error});
                return;
            }
            SourceManager.access$2300(SourceManager.this, this.source.getConfig(), error);
            dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(obj).build());
        }

        public void setMaxCount(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9ccb6ef", new Object[]{this, new Integer(i)});
            } else {
                this.maxCount = i;
            }
        }

        @Override // com.taobao.message.lab.comfrm.core.ActionDispatcher
        public void dispatch(final Action action) {
            String str;
            CI<SourceItem, Source> ci;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("865d606c", new Object[]{this, action});
                return;
            }
            if (!(this.finishActionDispatcher == null || (ci = this.source) == null || !ci.getConfig().defaultLoad)) {
                this.finishActionDispatcher.dispatch(this.startAction);
            }
            SourceManager.access$1800(SourceManager.this, this.source.getConfig());
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (SourceManager.class) {
                try {
                    if (SourceManager.access$800(SourceManager.this) != null) {
                        Plugin access$800 = SourceManager.access$800(SourceManager.this);
                        CI<SourceItem, Source> ci2 = this.source;
                        access$800.onSourceEnd(ci2 == null ? null : ci2.getConfig(), this.initCommand, action);
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    Logger.FormatLog.Builder point = new Logger.FormatLog.Builder().type(0).module(16).point(1005);
                    String access$000 = SourceManager.access$000(SourceManager.this);
                    String name = action.getName();
                    CI<SourceItem, Source> ci3 = this.source;
                    if (ci3 == null || ci3.getConfig() == null) {
                        str = "";
                    } else {
                        str = this.source.getConfig().name;
                    }
                    Logger.ftl(point.ext("containerKey", access$000, "action", name, "sourceName", str, HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, String.valueOf(currentTimeMillis2)).build());
                    final String access$1900 = SourceManager.access$1900(SourceManager.this, this.source.getConfig());
                    if (StdActions.UPDATE_ORIGINAL_DATA.equals(action.getName())) {
                        SourceManager.access$2000(SourceManager.this).add(this.source.getConfig());
                        SourceManager.access$1500(SourceManager.this).put(access$1900, action.getData());
                        Diff.mergeDeltaItem(SourceManager.access$2100(SourceManager.this), SourceManager.access$1900(SourceManager.this, this.source.getConfig()), new DeltaItem(ValueUtil.getInteger(action.getContext().get(StdActions.SOURCE_CONTEXT_KEY_DELTA_TYPE), 0), action.getContext().get("delta"), action.getContext().get("reasons")), SourceManager.access$400(SourceManager.this), SourceManager.access$500(SourceManager.this));
                        if (SourceManager.access$1200(SourceManager.this) || SourceManager.access$1300(SourceManager.this)) {
                            HashMap hashMap = new HashMap(action.getContext());
                            hashMap.put("source", this.source.getConfig().name);
                            SourceManager.access$1400(SourceManager.this, hashMap);
                        }
                    } else if (StdActions.UPDATE_ORIGINAL_DATA_PARTIAL.equals(action.getName()) && SourceManager.access$2000(SourceManager.this).contains(this.source.getConfig())) {
                        Schedules.logic(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.SourceManager.MergeActionDispatcher.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                Object obj = SourceManager.access$1500(SourceManager.this).get(access$1900);
                                Object updateOriginalData = ((Source) MergeActionDispatcher.access$2200(MergeActionDispatcher.this).getInstance()).updateOriginalData(action, obj);
                                if (obj != updateOriginalData) {
                                    HashMap hashMap2 = new HashMap(action.getContext());
                                    hashMap2.put("source", ((SourceItem) MergeActionDispatcher.access$2200(MergeActionDispatcher.this).getConfig()).name);
                                    SourceManager.access$1500(SourceManager.this).put(access$1900, updateOriginalData);
                                    Diff.mergeDeltaItem(SourceManager.access$2100(SourceManager.this), ((SourceItem) MergeActionDispatcher.access$2200(MergeActionDispatcher.this).getConfig()).name, new DeltaItem(ValueUtil.getInteger(action.getContext().get(StdActions.SOURCE_CONTEXT_KEY_DELTA_TYPE), 0), action.getContext().get("delta"), action.getContext().get("reasons")), SourceManager.access$400(SourceManager.this), SourceManager.access$500(SourceManager.this));
                                    SourceManager.access$1400(SourceManager.this, hashMap2);
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public MergeActionDispatcher(CI<SourceItem, Source> ci, ActionDispatcher actionDispatcher, Command command, Action action) {
            this.source = ci;
            this.finishActionDispatcher = actionDispatcher;
            this.initCommand = command;
            this.startAction = action;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class PropsProxy extends HashMap<String, Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Map<String, Object> dist;
        private SourceItem sourceItem;

        static {
            t2o.a(537919655);
        }

        public PropsProxy(Map<String, Object> map, SourceItem sourceItem) {
            this.dist = Collections.unmodifiableMap(map);
            this.sourceItem = sourceItem;
        }

        public static /* synthetic */ Object ipc$super(PropsProxy propsProxy, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/inner2/SourceManager$PropsProxy");
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a5a3b867", new Object[]{this, obj})).booleanValue();
            }
            if (!TextUtils.isEmpty(this.sourceItem.instance)) {
                return this.dist.containsKey(SharedState.getKey(this.sourceItem.instance, (String) obj));
            }
            return this.dist.containsKey(obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e4ff0db9", new Object[]{this, obj})).booleanValue();
            }
            if (!ApplicationUtil.isDebug()) {
                return this.dist.containsValue(obj);
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<String, Object>> entrySet() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("b3acf2c6", new Object[]{this});
            }
            if (!ApplicationUtil.isDebug()) {
                return this.dist.entrySet();
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, obj});
            }
            if (!TextUtils.isEmpty(this.sourceItem.instance)) {
                return this.dist.get(SharedState.getKey(this.sourceItem.instance, (String) obj));
            }
            return this.dist.get(obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
            }
            return this.dist.isEmpty();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Set<String> keySet() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("8b9b42f9", new Object[]{this});
            }
            if (!ApplicationUtil.isDebug()) {
                return this.dist.keySet();
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public int size() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
            }
            return this.dist.size();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public Collection<Object> values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Collection) ipChange.ipc$dispatch("26a6afbe", new Object[]{this});
            }
            if (!ApplicationUtil.isDebug()) {
                return this.dist.values();
            }
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SourceRuntimeInfo {
        public List<Error> errors = new ArrayList();
        public long firstUseWaitTime = -1;
        public long firstDispatcherDurTime = -1;
        public int dispatcherCount = 0;

        static {
            t2o.a(537919656);
        }
    }

    static {
        t2o.a(537919647);
        t2o.a(537919581);
    }

    public SourceManager(String str, String str2, SourceInfo sourceInfo, Map<String, Object> map, ActionDispatcher actionDispatcher, boolean z, String str3, Plugin plugin) {
        this.mIdentifier = str;
        this.mContainerKey = str2;
        this.mProps = map;
        this.mClassNamespace = str3;
        this.mUseRemote = z;
        this.mSourceInfo = sourceInfo;
        this.mActionDispatcher = actionDispatcher;
        this.mPlugin = plugin;
    }

    public static /* synthetic */ String access$000(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9057840b", new Object[]{sourceManager});
        }
        return sourceManager.mContainerKey;
    }

    public static /* synthetic */ List access$1000(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ff4788e3", new Object[]{sourceManager});
        }
        return sourceManager.mSubscribeSource;
    }

    public static /* synthetic */ long access$102(SourceManager sourceManager, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("662635c0", new Object[]{sourceManager, new Long(j)})).longValue();
        }
        sourceManager.useSourceStartTime = j;
        return j;
    }

    public static /* synthetic */ Map access$1100(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("21dcff1a", new Object[]{sourceManager});
        }
        return sourceManager.mProps;
    }

    public static /* synthetic */ boolean access$1200(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4edefe6a", new Object[]{sourceManager})).booleanValue();
        }
        return sourceManager.isReadyDefaultSource();
    }

    public static /* synthetic */ boolean access$1300(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f94cb2b", new Object[]{sourceManager})).booleanValue();
        }
        return sourceManager.timeoutFlag;
    }

    public static /* synthetic */ boolean access$1302(SourceManager sourceManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acdf7acf", new Object[]{sourceManager, new Boolean(z)})).booleanValue();
        }
        sourceManager.timeoutFlag = z;
        return z;
    }

    public static /* synthetic */ void access$1400(SourceManager sourceManager, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60d7769d", new Object[]{sourceManager, map});
        } else {
            sourceManager.dispatchUpdateAction(map);
        }
    }

    public static /* synthetic */ Map access$1500(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3e0c9b1e", new Object[]{sourceManager});
        }
        return sourceManager.originalData;
    }

    public static /* synthetic */ void access$1600(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91b6316a", new Object[]{sourceManager});
        } else {
            sourceManager.checkSourceError();
        }
    }

    public static /* synthetic */ boolean access$1702(SourceManager sourceManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4eea84b", new Object[]{sourceManager, new Boolean(z)})).booleanValue();
        }
        sourceManager.isDispose = z;
        return z;
    }

    public static /* synthetic */ void access$1800(SourceManager sourceManager, SourceItem sourceItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6151a1", new Object[]{sourceManager, sourceItem});
        } else {
            sourceManager.updateFirstDispatcherDurTime(sourceItem);
        }
    }

    public static /* synthetic */ String access$1900(SourceManager sourceManager, SourceItem sourceItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79df7d7e", new Object[]{sourceManager, sourceItem});
        }
        return sourceManager.getKey(sourceItem);
    }

    public static /* synthetic */ List access$200(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1ae832b0", new Object[]{sourceManager});
        }
        return sourceManager.mList;
    }

    public static /* synthetic */ Set access$2000(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("7544daf2", new Object[]{sourceManager});
        }
        return sourceManager.mUsedSet;
    }

    public static /* synthetic */ List access$202(SourceManager sourceManager, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1f84415d", new Object[]{sourceManager, list});
        }
        sourceManager.mList = list;
        return list;
    }

    public static /* synthetic */ Map access$2100(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3c4df839", new Object[]{sourceManager});
        }
        return sourceManager.deltaItemMap;
    }

    public static /* synthetic */ void access$2300(SourceManager sourceManager, SourceItem sourceItem, Error error) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc2b743", new Object[]{sourceManager, sourceItem, error});
        } else {
            sourceManager.updateErrors(sourceItem, error);
        }
    }

    public static /* synthetic */ SourceInfo access$300(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SourceInfo) ipChange.ipc$dispatch("f96dfd58", new Object[]{sourceManager});
        }
        return sourceManager.mSourceInfo;
    }

    public static /* synthetic */ String access$400(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98b43987", new Object[]{sourceManager});
        }
        return sourceManager.mIdentifier;
    }

    public static /* synthetic */ boolean access$500(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55d160fe", new Object[]{sourceManager})).booleanValue();
        }
        return sourceManager.mUseRemote;
    }

    public static /* synthetic */ String access$600(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ce29445", new Object[]{sourceManager});
        }
        return sourceManager.mClassNamespace;
    }

    public static /* synthetic */ MergeActionDispatcher access$700(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MergeActionDispatcher) ipChange.ipc$dispatch("1d30b0a7", new Object[]{sourceManager});
        }
        return sourceManager.mergeFinishActionDispatcher;
    }

    public static /* synthetic */ Plugin access$800(SourceManager sourceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Plugin) ipChange.ipc$dispatch("6b28aa9a", new Object[]{sourceManager});
        }
        return sourceManager.mPlugin;
    }

    public static /* synthetic */ void access$900(SourceManager sourceManager, SourceItem sourceItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8961bcb3", new Object[]{sourceManager, sourceItem});
        } else {
            sourceManager.updateFirstUseWaitTime(sourceItem);
        }
    }

    private void dispatchUpdateAction(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e91e185", new Object[]{this, map});
        } else if (!this.isDispose) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            hashMap.put("__originalDelta", new HashMap(this.deltaItemMap));
            this.deltaItemMap.clear();
            hashMap.remove("delta");
            hashMap.remove(StdActions.SOURCE_CONTEXT_KEY_DELTA_TYPE);
            hashMap.remove("reasons");
            this.mActionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(new HashMap(this.originalData)).context(hashMap).build());
        }
    }

    private String getKey(SourceItem sourceItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4fd595b", new Object[]{this, sourceItem});
        }
        return SharedState.getKey(sourceItem.instance, sourceItem.name);
    }

    private boolean isReadyDefaultSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f049aae", new Object[]{this})).booleanValue();
        }
        if (this.mUsedSet.size() >= this.mList.size()) {
            return true;
        }
        for (CI<SourceItem, Source> ci : this.mList) {
            if (ci.getConfig().defaultLoad && !this.mUsedSet.contains(ci.getConfig())) {
                return false;
            }
        }
        return true;
    }

    private void updateErrors(SourceItem sourceItem, Error error) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac64658", new Object[]{this, sourceItem, error});
        } else if (ApplicationUtil.isDebug()) {
            synchronized (this.runtimeInfoMap) {
                try {
                    getSourceRuntimeInfo(sourceItem).errors.add(error);
                    Plugin plugin = this.mPlugin;
                    if (plugin != null) {
                        plugin.onSourceRuntimeChanged(this.runtimeInfoMap);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            Plugin plugin2 = this.mPlugin;
            if (plugin2 != null) {
                plugin2.onSourceRuntimeChanged(this.runtimeInfoMap);
            }
        }
    }

    private void updateFirstDispatcherDurTime(SourceItem sourceItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6a2515c", new Object[]{this, sourceItem});
        } else if (ApplicationUtil.isDebug()) {
            synchronized (this.runtimeInfoMap) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    SourceRuntimeInfo sourceRuntimeInfo = getSourceRuntimeInfo(sourceItem);
                    sourceRuntimeInfo.dispatcherCount++;
                    if (sourceRuntimeInfo.firstDispatcherDurTime < 0) {
                        sourceRuntimeInfo.firstDispatcherDurTime = currentTimeMillis - this.useSourceStartTime;
                    }
                    Plugin plugin = this.mPlugin;
                    if (plugin != null) {
                        plugin.onSourceRuntimeChanged(this.runtimeInfoMap);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            Plugin plugin2 = this.mPlugin;
            if (plugin2 != null) {
                plugin2.onSourceRuntimeChanged(this.runtimeInfoMap);
            }
        }
    }

    private void updateFirstUseWaitTime(SourceItem sourceItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eaa69de", new Object[]{this, sourceItem});
        } else if (ApplicationUtil.isDebug()) {
            synchronized (this.runtimeInfoMap) {
                try {
                    getSourceRuntimeInfo(sourceItem).firstUseWaitTime = System.currentTimeMillis() - this.useSourceStartTime;
                    Plugin plugin = this.mPlugin;
                    if (plugin != null) {
                        plugin.onSourceRuntimeChanged(this.runtimeInfoMap);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            Plugin plugin2 = this.mPlugin;
            if (plugin2 != null) {
                plugin2.onSourceRuntimeChanged(this.runtimeInfoMap);
            }
        }
    }

    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            Schedules.logic(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.SourceManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    for (Source source : SourceManager.access$1000(SourceManager.this)) {
                        source.dispose();
                    }
                    SourceManager.access$1702(SourceManager.this, true);
                    Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1901).ext("containerKey", SourceManager.access$000(SourceManager.this)).build());
                }
            });
        }
    }

    public SourceRuntimeInfo getSourceRuntimeInfo(SourceItem sourceItem) {
        SourceRuntimeInfo sourceRuntimeInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SourceRuntimeInfo) ipChange.ipc$dispatch("71501e3c", new Object[]{this, sourceItem});
        }
        synchronized (this.runtimeInfoMap) {
            try {
                sourceRuntimeInfo = this.runtimeInfoMap.get(sourceItem.name);
                if (sourceRuntimeInfo == null) {
                    sourceRuntimeInfo = new SourceRuntimeInfo();
                    this.runtimeInfoMap.put(sourceItem.name, sourceRuntimeInfo);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sourceRuntimeInfo;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.CommandHandler
    public void handle(final Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6b56d4", new Object[]{this, command});
        } else {
            Schedules.logicTryKeep(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.SourceManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (SourceManager.access$200(SourceManager.this) == null) {
                        Logger.ftl(new Logger.FormatLog.Builder().type(1).module(16).point(-1001).ext("errMsg", "丢弃command", "commandName", command.getName(), "sourceName", command.getSourceName(), "sourceInstance", command.getSourceInstance()).build());
                    } else {
                        for (CI ci : SourceManager.access$200(SourceManager.this)) {
                            if (((SourceItem) ci.getConfig()).name.equals(command.getSourceName()) && TextUtils.equals(((SourceItem) ci.getConfig()).instance, command.getSourceInstance())) {
                                Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1004).ext("commandName", command.getName(), "sourceName", command.getSourceName(), "sourceInstance", command.getSourceInstance(), "first", "0").build());
                                ((Source) ci.getInstance()).use(command, SourceManager.access$1100(SourceManager.this), new MergeActionDispatcher(ci, command));
                            }
                        }
                    }
                }
            });
        }
    }

    public void useSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("696a0c09", new Object[]{this});
        } else {
            Schedules.logic(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.SourceManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    int i;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1003).ext("containerKey", SourceManager.access$000(SourceManager.this)).build());
                    SourceManager.access$102(SourceManager.this, System.currentTimeMillis());
                    SourceManager.access$202(SourceManager.this, new ArrayList());
                    if (SourceManager.access$300(SourceManager.this).sourceList != null) {
                        i = 0;
                        for (SourceItem sourceItem : SourceManager.access$300(SourceManager.this).sourceList) {
                            if (sourceItem.defaultLoad) {
                                i++;
                            }
                            Source source = (Source) ClassPool.instance().getInstance(sourceItem.type, Source.class, SourceManager.access$400(SourceManager.this), SourceManager.access$500(SourceManager.this), SourceManager.access$600(SourceManager.this));
                            if (source != null) {
                                SourceManager.access$200(SourceManager.this).add(new CI(sourceItem, source));
                            } else {
                                AppMonitor.Alarm.commitFail("MsgSourceManager", "useSourceInit", "100", SourceManager.access$600(SourceManager.this));
                                TLog.loge("MPMSGS", SourceManager.TAG, "useSource source is null, name = " + SourceManager.access$600(SourceManager.this));
                                if (ApplicationUtil.isDebug()) {
                                    throw new NullPointerException("useSource|source is null = " + SourceManager.access$600(SourceManager.this));
                                }
                            }
                        }
                    } else {
                        i = 0;
                    }
                    SourceManager.access$700(SourceManager.this).setMaxCount(i);
                    Action build = new Action.Build(StdActions.COMMAND_INIT_SOURCE).build();
                    if (SourceManager.access$800(SourceManager.this) != null) {
                        SourceManager.access$800(SourceManager.this).onSourceStart(build);
                    }
                    for (CI ci : SourceManager.access$200(SourceManager.this)) {
                        if (ci != null) {
                            Command build2 = new Command.Build(((SourceItem) ci.getConfig()).name, StdActions.COMMAND_INIT_SOURCE).build();
                            SourceManager sourceManager = SourceManager.this;
                            MergeActionDispatcher mergeActionDispatcher = new MergeActionDispatcher(ci, SourceManager.access$700(sourceManager), build2, build);
                            SourceManager.access$900(SourceManager.this, (SourceItem) ci.getConfig());
                            ((Source) ci.getInstance()).subscribe(mergeActionDispatcher);
                            SourceManager.access$1000(SourceManager.this).add(ci.getInstance());
                            Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1004).ext("containerKey", SourceManager.access$000(SourceManager.this), "commandName", build2.getName(), "sourceName", build2.getSourceName(), "first", "1").build());
                            if (SourceManager.access$800(SourceManager.this) != null) {
                                SourceManager.access$800(SourceManager.this).onSourceStart((SourceItem) ci.getConfig(), build2);
                            }
                            ((Source) ci.getInstance()).use(build2, new PropsProxy(SourceManager.access$1100(SourceManager.this), (SourceItem) ci.getConfig()), mergeActionDispatcher);
                        } else {
                            throw new NullPointerException("useSource|" + ((SourceItem) ci.getConfig()).name);
                        }
                    }
                    Schedules.getLogic().schedule(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.SourceManager.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            synchronized (SourceManager.class) {
                                try {
                                    if (!SourceManager.access$1200(SourceManager.this)) {
                                        SourceManager.access$1302(SourceManager.this, true);
                                        SourceManager.access$1400(SourceManager.this, null);
                                        AppMonitor.Counter.commit(Constants.Monitor.MODULE_MONITOR, "timeout", JSON.toJSONString(SourceManager.access$1500(SourceManager.this).keySet()), 1.0d);
                                        SourceManager.access$1600(SourceManager.this);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }, SourceManager.access$300(SourceManager.this).initTimeout, TimeUnit.MILLISECONDS);
                }
            });
        }
    }

    private void checkSourceError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28beda8c", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(">>timeout source is :");
        for (CI<SourceItem, Source> ci : this.mList) {
            if (ci.getConfig().defaultLoad && !this.originalData.containsKey(getKey(ci.getConfig()))) {
                arrayList.add(ci.getConfig().name);
                sb.append(ci.getConfig().name);
                sb.append("--");
            }
        }
        Logger.ftl(new Logger.FormatLog.Builder().type(1).module(16).point(-1001).errCode("-1").errMsg(sb.toString()).build());
        IErrorReportProvider iErrorReportProvider = (IErrorReportProvider) GlobalContainer.getInstance().get(IErrorReportProvider.class);
        if (iErrorReportProvider != null) {
            iErrorReportProvider.report("dojo", "sourceCheck", Constant.CODE_ERROR_NO_SIM_FAIL, sb.toString(), null);
        }
        Plugin plugin = this.mPlugin;
        if (plugin != null) {
            plugin.onSourceTimeout(arrayList);
        }
    }
}
