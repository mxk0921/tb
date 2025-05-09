package com.taobao.message.lab.comfrm.inner2;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import anet.channel.Constants;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.virtual_thread.annotation.IgnoreVirtualThread;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.message.kit.threadpool.Coordinator;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.inner2.config.TransformerInfo;
import com.taobao.message.lab.comfrm.inner2.config.TransformerItem;
import com.taobao.message.lab.comfrm.inner2.resource.IResourceManager;
import com.taobao.message.lab.comfrm.inner2.transformer.dispatcher.cache.JSTransTransformerDispatcherCacheMap;
import com.taobao.message.lab.comfrm.support.TransformerItemAware;
import com.taobao.message.lab.comfrm.support.model.Function2;
import com.taobao.message.lab.comfrm.util.ExecuteLimiter;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class StateManager implements ActionDispatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FIRST_DISPATCH_MODE_ALL = 0;
    public static final int FIRST_DISPATCH_MODE_ONLY_IMM = 1;
    private int firstDispatchMode;
    private boolean immediateOpt;
    private final String mClassNamespace;
    private final String mContainerKey;
    private TransformDispatcher mFinalTransformDispatcher;
    private final String mIdentifier;
    private volatile SharedState mImmediateState;
    private TransformDispatcher mImmediateTransformDispatcher;
    private volatile JSTransformDispatcher mJSTransformDispatcher;
    private final ExecuteLimiter<Action> mLimiter;
    private TransformDispatcher mNativeTransformDispatcher;
    private final Plugin mPlugin;
    private volatile SharedState mState;
    private StateListener mStateListener;
    private final ExecutorService mTrans;
    private final TransformerInfo mTransformerInfo;
    private final boolean mUseRemote;
    private volatile boolean mIsFirst = true;
    private boolean strictMerge = false;
    private boolean strictImmediate = false;
    private final StateRuntimeInfo mStateRuntimeInfo = new StateRuntimeInfo();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class AsyncTransRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Action action;
        private final ExecuteLimiter limiter;
        private final List<Action> mergeBeforeActionList;

        static {
            t2o.a(537919664);
        }

        public AsyncTransRunnable(Action action, ExecuteLimiter executeLimiter, List<Action> list) {
            this.action = action;
            this.limiter = executeLimiter;
            this.mergeBeforeActionList = list;
        }

        public static /* synthetic */ List access$700(AsyncTransRunnable asyncTransRunnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("92d8d1aa", new Object[]{asyncTransRunnable});
            }
            return asyncTransRunnable.mergeBeforeActionList;
        }

        public static /* synthetic */ ExecuteLimiter access$800(AsyncTransRunnable asyncTransRunnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExecuteLimiter) ipChange.ipc$dispatch("c9b4f801", new Object[]{asyncTransRunnable});
            }
            return asyncTransRunnable.limiter;
        }

        @Override // java.lang.Runnable
        public void run() {
            String valueOf;
            ExecuteLimiter executeLimiter;
            ExecuteLimiter executeLimiter2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Logger.FormatLog.Builder point = new Logger.FormatLog.Builder().type(0).module(16).point(1006);
            String access$200 = StateManager.access$200(StateManager.this);
            String name = this.action.getName();
            List<Action> list = this.mergeBeforeActionList;
            if (list == null) {
                valueOf = "0";
            } else {
                valueOf = String.valueOf(list.size());
            }
            Logger.ftl(point.ext("containerKey", access$200, "action", name, "mergeSize", valueOf).build());
            try {
                TraceUtil.beginSection(this.action.getName());
                if (StateManager.access$000(StateManager.this) != null && !StateManager.access$000(StateManager.this).hasInit()) {
                    StateManager.access$000(StateManager.this).init();
                }
                long currentTimeMillis = System.currentTimeMillis();
                HashMap hashMap = new HashMap(this.action.getContext());
                hashMap.put("stateSubTraceId", hashMap.get("traceId"));
                final Action build = new Action.Build(this.action.getName()).data(this.action.getData()).context(hashMap).build();
                final boolean access$500 = StateManager.access$500(StateManager.this, this.action);
                TraceUtil.endTrace();
                final long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1007).ext("containerKey", StateManager.access$200(StateManager.this), "action", build.getName(), "time", String.valueOf(currentTimeMillis2), StdActions.ACTION_OPT_IMMEDIATE, "0").build());
                if (StateManager.access$600(StateManager.this)) {
                    Schedules.ui(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.StateManager.AsyncTransRunnable.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            AsyncTransRunnable asyncTransRunnable = AsyncTransRunnable.this;
                            StateManager.access$400(StateManager.this, build, AsyncTransRunnable.access$700(asyncTransRunnable), false, false, access$500, currentTimeMillis2);
                            if (AsyncTransRunnable.access$800(AsyncTransRunnable.this) != null) {
                                AsyncTransRunnable.access$800(AsyncTransRunnable.this).notifyExecuteFinish();
                            }
                        }
                    });
                } else {
                    StateManager.access$400(StateManager.this, build, this.mergeBeforeActionList, false, false, access$500, currentTimeMillis2);
                }
                if (!StateManager.access$600(StateManager.this) && (executeLimiter2 = this.limiter) != null) {
                    executeLimiter2.notifyExecuteFinish();
                }
            } catch (Throwable th) {
                if (!StateManager.access$600(StateManager.this) && (executeLimiter = this.limiter) != null) {
                    executeLimiter.notifyExecuteFinish();
                }
                throw th;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface StateListener {
        void onChanged(Action action, SharedState sharedState);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class StateRuntimeInfo {
        public int callOnChangedCount = 0;
        public int silentCount = 0;
        public int immCallOnChangedCount = 0;
        public int asyncCallOnChangedCount = 0;

        static {
            t2o.a(537919668);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class StateTraceSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Action cutAction;
        public long cutDurTime;
        public boolean cutImmediate;
        public List<Action> cutMergeBeforeActionList;
        public boolean cutSilent;
        public SharedState immediateState;
        public SharedState sharedState;

        static {
            t2o.a(537919669);
        }

        public JSONObject toJSON() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("b0ef9c0a", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("immediateState", (Object) this.immediateState.toJSON());
            jSONObject.put("immediateStateDiff", (Object) this.immediateState.getDiff().toJSON());
            jSONObject.put("sharedState", (Object) this.sharedState.toJSON());
            jSONObject.put("sharedStateDiff", (Object) this.sharedState.getDiff().toJSON());
            jSONObject.put("cutAction", (Object) this.cutAction.toJSON());
            JSONArray jSONArray = new JSONArray();
            List<Action> list = this.cutMergeBeforeActionList;
            if (list != null) {
                for (Action action : list) {
                    jSONArray.add(action.toJSON());
                }
            }
            jSONObject.put("cutMergeBeforeActionList", (Object) jSONArray);
            jSONObject.put("cutDurTime", (Object) Long.valueOf(this.cutDurTime));
            jSONObject.put("cutSilent", (Object) Boolean.valueOf(this.cutSilent));
            jSONObject.put("cutImmediate", (Object) Boolean.valueOf(this.cutImmediate));
            return jSONObject;
        }
    }

    static {
        t2o.a(537919659);
        t2o.a(537919547);
    }

    @IgnoreVirtualThread
    public StateManager(final String str, String str2, TransformerInfo transformerInfo, Map<String, Object> map, final boolean z, Plugin plugin, String str3) {
        this.immediateOpt = false;
        this.firstDispatchMode = 0;
        this.mIdentifier = str;
        this.mContainerKey = str2;
        this.mUseRemote = z;
        this.mPlugin = plugin;
        this.mClassNamespace = str3;
        ExecutorService createSaturateExecutorService = Coordinator.createSaturateExecutorService(1, 1, "MessageS-trans");
        this.mTrans = createSaturateExecutorService;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) createSaturateExecutorService;
        threadPoolExecutor.setKeepAliveTime(Constants.RECV_TIMEOUT, TimeUnit.MILLISECONDS);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.setThreadFactory(new Schedules.HighThreadNameFactory("MessageS-trans"));
        this.mImmediateState = new SharedState(map);
        this.mState = new SharedState(map);
        this.immediateOpt = "1".equals(transformerInfo.immediateOpt);
        this.firstDispatchMode = ValueUtil.getInteger(transformerInfo.firstDispatchMode, 0);
        this.mTransformerInfo = transformerInfo;
        this.mLimiter = new ExecuteLimiter<>(3000, new ExecuteLimiter.DataListCollectFunction(), new ExecuteLimiter.Executor<Action>() { // from class: com.taobao.message.lab.comfrm.inner2.StateManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.util.ExecuteLimiter.Executor
            public void execute(List<Action> list, ExecuteLimiter executeLimiter) {
                ExecuteLimiter executeLimiter2;
                int i = 0;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cf25a2c6", new Object[]{this, list, executeLimiter});
                } else if (list.size() == 1) {
                    StateManager.this.asyncTrans(new AsyncTransRunnable(list.get(0), executeLimiter, null));
                } else {
                    List split = ExecuteLimiter.DataListMergeSplit.split(list, new Function2<Action, Action, Boolean>() { // from class: com.taobao.message.lab.comfrm.inner2.StateManager.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public Boolean map(Action action, Action action2) {
                            boolean z2 = true;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (Boolean) ipChange2.ipc$dispatch("457d7840", new Object[]{this, action, action2});
                            }
                            if (action == null || action2 == null || !StdActions.UPDATE_ORIGINAL_DATA.equals(action.getName()) || !StdActions.UPDATE_ORIGINAL_DATA.equals(action2.getName())) {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        }
                    });
                    int i2 = 0;
                    while (i2 < split.size()) {
                        List list2 = (List) split.get(i2);
                        Action action = (Action) list2.get(list2.size() - 1);
                        Action action2 = (Action) list2.get(i);
                        Map map2 = (Map) action2.getContext().get("__originalDelta");
                        for (int i3 = 1; i3 < list2.size(); i3++) {
                            Map map3 = (Map) ((Action) list2.get(i3)).getContext().get("__originalDelta");
                            if (map3 != null) {
                                if (map2 == null) {
                                    map2 = map3;
                                } else {
                                    HashMap hashMap = new HashMap(map2);
                                    for (Map.Entry entry : map3.entrySet()) {
                                        Diff.mergeDeltaItem(hashMap, (String) entry.getKey(), (DeltaItem) entry.getValue(), str, z);
                                    }
                                    map2 = hashMap;
                                }
                            }
                        }
                        HashMap hashMap2 = new HashMap();
                        for (int i4 = 0; i4 < list2.size(); i4++) {
                            Action action3 = (Action) list2.get(i4);
                            if (action3.getContext() != null) {
                                hashMap2.putAll(action3.getContext());
                            }
                        }
                        hashMap2.put("__originalDelta", map2);
                        Action build = new Action.Build(action2.getName()).data(action.getData()).context(hashMap2).build();
                        StateManager stateManager = StateManager.this;
                        StateManager stateManager2 = StateManager.this;
                        if (i2 == split.size() - 1) {
                            executeLimiter2 = executeLimiter;
                        } else {
                            executeLimiter2 = null;
                        }
                        stateManager.asyncTrans(new AsyncTransRunnable(build, executeLimiter2, list2));
                        i2++;
                        i = 0;
                    }
                }
            }
        }, false);
    }

    public static /* synthetic */ JSTransformDispatcher access$000(StateManager stateManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSTransformDispatcher) ipChange.ipc$dispatch("94a6c52f", new Object[]{stateManager});
        }
        return stateManager.mJSTransformDispatcher;
    }

    public static /* synthetic */ Plugin access$100(StateManager stateManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Plugin) ipChange.ipc$dispatch("d0a7e8c9", new Object[]{stateManager});
        }
        return stateManager.mPlugin;
    }

    public static /* synthetic */ String access$200(StateManager stateManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88eb64f5", new Object[]{stateManager});
        }
        return stateManager.mContainerKey;
    }

    public static /* synthetic */ boolean access$300(StateManager stateManager, Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd5bea7", new Object[]{stateManager, action})).booleanValue();
        }
        return stateManager.handleActionImmediate(action);
    }

    public static /* synthetic */ void access$400(StateManager stateManager, Action action, List list, boolean z, boolean z2, boolean z3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5871585", new Object[]{stateManager, action, list, new Boolean(z), new Boolean(z2), new Boolean(z3), new Long(j)});
        } else {
            stateManager.mergeStateAndCallback(action, list, z, z2, z3, j);
        }
    }

    public static /* synthetic */ boolean access$500(StateManager stateManager, Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fec55a9", new Object[]{stateManager, action})).booleanValue();
        }
        return stateManager.handleAction(action);
    }

    public static /* synthetic */ boolean access$600(StateManager stateManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("847a838b", new Object[]{stateManager})).booleanValue();
        }
        return stateManager.strictImmediate;
    }

    private boolean handleAction(Action action) {
        SharedState sharedState;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43dcd1ec", new Object[]{this, action})).booleanValue();
        }
        rebuildAsyncTransformer(this.mTransformerInfo, this.mPlugin);
        SharedState resetDeltaAndInstant = this.mState.resetDeltaAndInstant();
        if (StdActions.UPDATE_ORIGINAL_DATA.equals(action.getName())) {
            sharedState = resetDeltaAndInstant.updateOriginalData((Map) action.getData(), (Map) action.getContext().get("__originalDelta"));
            HashMap hashMap = new HashMap(action.getContext());
            hashMap.remove("__originalDelta");
            action = new Action.Build(action.getName()).context(hashMap).build();
        } else {
            sharedState = resetDeltaAndInstant;
        }
        Plugin plugin = this.mPlugin;
        if (plugin != null) {
            plugin.onNativeTransformerStart(action);
        }
        SharedState transform = this.mNativeTransformDispatcher.transform(action, sharedState);
        Plugin plugin2 = this.mPlugin;
        if (plugin2 != null) {
            plugin2.onNativeTransformerEnd(action);
        }
        if (this.mJSTransformDispatcher != null) {
            Plugin plugin3 = this.mPlugin;
            if (plugin3 != null) {
                plugin3.onJSTransformerStart(action);
            }
            transform = this.mJSTransformDispatcher.transform(action, transform);
            Plugin plugin4 = this.mPlugin;
            if (plugin4 != null) {
                plugin4.onJSTransformerEnd(action);
            }
        }
        Plugin plugin5 = this.mPlugin;
        if (plugin5 != null) {
            plugin5.onFinalTransformerStart(action);
        }
        SharedState transform2 = this.mFinalTransformDispatcher.transform(action, transform);
        Plugin plugin6 = this.mPlugin;
        if (plugin6 != null) {
            plugin6.onFinalTransformerEnd(action);
        }
        if (resetDeltaAndInstant == transform2) {
            z = false;
        }
        if (z) {
            this.mState = transform2;
        }
        return z;
    }

    private boolean handleActionImmediate(Action action) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("203400f7", new Object[]{this, action})).booleanValue();
        }
        rebuildImmediateTransformer(this.mTransformerInfo, this.mPlugin);
        SharedState resetDeltaAndInstant = this.mImmediateState.resetDeltaAndInstant();
        SharedState transform = this.mImmediateTransformDispatcher.transform(action, resetDeltaAndInstant);
        if (resetDeltaAndInstant == transform) {
            z = false;
        }
        if (z) {
            this.mImmediateState = transform;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:7:0x0039, B:9:0x0052, B:17:0x005f, B:18:0x0061, B:19:0x0066, B:22:0x006c, B:23:0x0079, B:24:0x0085, B:28:0x0098, B:29:0x00a0, B:30:0x00a7, B:32:0x00b0, B:34:0x00bb, B:35:0x00be, B:37:0x00c0, B:39:0x00c4, B:40:0x00ca, B:42:0x00ce, B:43:0x00d3, B:44:0x00e5), top: B:52:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:7:0x0039, B:9:0x0052, B:17:0x005f, B:18:0x0061, B:19:0x0066, B:22:0x006c, B:23:0x0079, B:24:0x0085, B:28:0x0098, B:29:0x00a0, B:30:0x00a7, B:32:0x00b0, B:34:0x00bb, B:35:0x00be, B:37:0x00c0, B:39:0x00c4, B:40:0x00ca, B:42:0x00ce, B:43:0x00d3, B:44:0x00e5), top: B:52:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:7:0x0039, B:9:0x0052, B:17:0x005f, B:18:0x0061, B:19:0x0066, B:22:0x006c, B:23:0x0079, B:24:0x0085, B:28:0x0098, B:29:0x00a0, B:30:0x00a7, B:32:0x00b0, B:34:0x00bb, B:35:0x00be, B:37:0x00c0, B:39:0x00c4, B:40:0x00ca, B:42:0x00ce, B:43:0x00d3, B:44:0x00e5), top: B:52:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:7:0x0039, B:9:0x0052, B:17:0x005f, B:18:0x0061, B:19:0x0066, B:22:0x006c, B:23:0x0079, B:24:0x0085, B:28:0x0098, B:29:0x00a0, B:30:0x00a7, B:32:0x00b0, B:34:0x00bb, B:35:0x00be, B:37:0x00c0, B:39:0x00c4, B:40:0x00ca, B:42:0x00ce, B:43:0x00d3, B:44:0x00e5), top: B:52:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:7:0x0039, B:9:0x0052, B:17:0x005f, B:18:0x0061, B:19:0x0066, B:22:0x006c, B:23:0x0079, B:24:0x0085, B:28:0x0098, B:29:0x00a0, B:30:0x00a7, B:32:0x00b0, B:34:0x00bb, B:35:0x00be, B:37:0x00c0, B:39:0x00c4, B:40:0x00ca, B:42:0x00ce, B:43:0x00d3, B:44:0x00e5), top: B:52:0x0039 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void mergeStateAndCallback(com.taobao.message.lab.comfrm.core.Action r6, java.util.List<com.taobao.message.lab.comfrm.core.Action> r7, boolean r8, boolean r9, boolean r10, long r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.lab.comfrm.inner2.StateManager.mergeStateAndCallback(com.taobao.message.lab.comfrm.core.Action, java.util.List, boolean, boolean, boolean, long):void");
    }

    public void asyncTrans(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe92f11", new Object[]{this, runnable});
        } else if (!this.mTrans.isShutdown()) {
            this.mTrans.execute(new Schedules.MyRunnable(runnable));
        }
    }

    public void asyncTransOrMergePost(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362f2bdd", new Object[]{this, action});
        } else {
            this.mLimiter.tryExecute(action);
        }
    }

    public List<CI<TransformerItem, Transformer>> createObject(List<TransformerItem> list) {
        Iterator<TransformerItem> it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ffa7f694", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<TransformerItem> it2 = list.iterator();
            while (it2.hasNext()) {
                TransformerItem next = it2.next();
                if (next.type.equals(pg1.ATOM_EXT_iterator)) {
                    SplitTransformer splitTransformer = (SplitTransformer) ClassPool.instance().getInstance(next.iterator.split.type, SplitTransformer.class, this.mIdentifier, this.mUseRemote, this.mClassNamespace);
                    boolean z = splitTransformer instanceof TransformerItemAware;
                    if (z) {
                        ((TransformerItemAware) splitTransformer).setTransformerItem(next.iterator.split);
                    }
                    MergeTransformer mergeTransformer = (MergeTransformer) ClassPool.instance().getInstance(next.iterator.merge.type, MergeTransformer.class, this.mIdentifier, this.mUseRemote, this.mClassNamespace);
                    if (z) {
                        ((TransformerItemAware) splitTransformer).setTransformerItem(next.iterator.merge);
                    }
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, List<TransformerItem>> entry : next.iterator.pool.entrySet()) {
                        ArrayList arrayList2 = new ArrayList();
                        for (TransformerItem transformerItem : entry.getValue()) {
                            IteratorTransformer iteratorTransformer = (IteratorTransformer) ClassPool.instance().getInstance(transformerItem.type, IteratorTransformer.class, this.mIdentifier, this.mUseRemote, this.mClassNamespace);
                            if (iteratorTransformer instanceof TransformerItemAware) {
                                ((TransformerItemAware) iteratorTransformer).setTransformerItem(transformerItem);
                            }
                            arrayList2.add(iteratorTransformer);
                            it2 = it2;
                        }
                        hashMap.put(entry.getKey(), arrayList2);
                        it2 = it2;
                    }
                    it = it2;
                    arrayList.add(new CI(next, new IteratorDispatchTransformer(next, splitTransformer, mergeTransformer, hashMap)));
                } else {
                    it = it2;
                    Object instance = ClassPool.instance().getInstance(next.type, Object.class, this.mIdentifier, this.mUseRemote, this.mClassNamespace);
                    if (instance instanceof TransformerItemAware) {
                        ((TransformerItemAware) instance).setTransformerItem(next);
                    }
                    if (instance instanceof DiffTransfomer) {
                        arrayList.add(new CI(next, new DiffDispatchTransfomer((DiffTransfomer) instance)));
                    } else {
                        arrayList.add(new CI(next, (Transformer) instance));
                    }
                }
                it2 = it;
            }
        }
        return arrayList;
    }

    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            asyncTrans(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.StateManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (StateManager.access$000(StateManager.this) != null) {
                        StateManager.access$000(StateManager.this).destory();
                    }
                }
            });
        }
    }

    public SharedState getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("d6cbd298", new Object[]{this});
        }
        return this.mState;
    }

    public void initJSEnv(Context context, IResourceManager iResourceManager, Plugin plugin) {
        List<TransformerItem> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d28cbae7", new Object[]{this, context, iResourceManager, plugin});
        } else if (!ApplicationUtil.isDebug() || TextUtils.isEmpty(this.mTransformerInfo.jsFile) || ((list = this.mTransformerInfo.jsTransformerList) != null && !list.isEmpty())) {
            TraceUtil.beginSection("buildJsTransformer");
            if (!TextUtils.isEmpty(this.mTransformerInfo.jsFile)) {
                if (ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "enableJsPreload")) {
                    JSTransTransformerDispatcherCacheMap jSTransTransformerDispatcherCacheMap = JSTransTransformerDispatcherCacheMap.INSTANCE;
                    if (jSTransTransformerDispatcherCacheMap.get(this.mContainerKey) != null) {
                        TLog.loge("JSCacheMap", "jsTransformerDispatcherCacheMap hit, containerKey = " + this.mContainerKey);
                        this.mJSTransformDispatcher = jSTransTransformerDispatcherCacheMap.get(this.mContainerKey);
                        this.mJSTransformDispatcher.setPlugin(plugin);
                    } else {
                        TLog.loge("JSCacheMap", "jsTransformerDispatcherCacheMap missed, containerKey = " + this.mContainerKey);
                        this.mJSTransformDispatcher = new JSTransformDispatcher(context, this.mContainerKey, this.mTransformerInfo, iResourceManager, this.mTrans, this.mUseRemote, plugin, this.mClassNamespace);
                        jSTransTransformerDispatcherCacheMap.put(this.mContainerKey, this.mJSTransformDispatcher);
                    }
                } else {
                    this.mJSTransformDispatcher = new JSTransformDispatcher(context, this.mContainerKey, this.mTransformerInfo, iResourceManager, this.mTrans, this.mUseRemote, plugin, this.mClassNamespace);
                }
            }
            TraceUtil.endTrace();
        } else {
            throw new IllegalStateException("jsTransformerList为空时，不应配置jsFile");
        }
    }

    public boolean isJSAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3db981a1", new Object[]{this})).booleanValue();
        }
        if (this.mJSTransformDispatcher == null) {
            return false;
        }
        return this.mJSTransformDispatcher.isAvailable();
    }

    public void rebuildImmediateTransformer(TransformerInfo transformerInfo, Plugin plugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("619de031", new Object[]{this, transformerInfo, plugin});
        } else if (ApplicationUtil.isDebug() || this.mImmediateTransformDispatcher == null) {
            TraceUtil.beginSection("buildImmediateTransformer");
            List<TransformerItem> list = transformerInfo.immediateTransformerList;
            if (list == null || list.size() <= 0) {
                this.mImmediateTransformDispatcher = null;
            } else {
                this.mImmediateTransformDispatcher = new TransformDispatcher(createObject(transformerInfo.immediateTransformerList), StdActions.ACTION_OPT_IMMEDIATE, false, plugin);
            }
            TraceUtil.endTrace();
        }
    }

    public void setStateListener(StateListener stateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e563f179", new Object[]{this, stateListener});
        } else {
            this.mStateListener = stateListener;
        }
    }

    public void strictImmediate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bbadb6f", new Object[]{this});
        } else {
            this.strictImmediate = true;
        }
    }

    public void strictMerge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32589ff6", new Object[]{this});
        } else {
            this.strictMerge = true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class ImmediateTransRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Action action;
        private final boolean nextAsyncChanged;
        private final boolean silent;

        static {
            t2o.a(537919666);
        }

        public ImmediateTransRunnable(Action action, boolean z, boolean z2) {
            this.action = action;
            this.silent = z;
            this.nextAsyncChanged = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (StateManager.access$100(StateManager.this) != null) {
                StateManager.access$100(StateManager.this).onImmediateTransStart(this.action);
            }
            Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1006).ext("containerKey", StateManager.access$200(StateManager.this), "action", this.action.getName()).build());
            TraceUtil.beginSection(this.action.getName());
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap(this.action.getContext());
            hashMap.put("stateSubTraceId", hashMap.get("traceId") + StdActions.ACTION_OPT_IMMEDIATE);
            Action build = new Action.Build(this.action.getName()).data(this.action.getData()).context(hashMap).build();
            boolean access$300 = StateManager.access$300(StateManager.this, build);
            TraceUtil.endTrace();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1007).ext("containerKey", StateManager.access$200(StateManager.this), "action", build.getName(), "time", String.valueOf(currentTimeMillis2), StdActions.ACTION_OPT_IMMEDIATE, "1").build());
            if (this.nextAsyncChanged) {
                StateManager.this.asyncTrans(new AsyncTransRunnable(this.action, null, null));
            }
            StateManager.access$400(StateManager.this, build, null, this.silent, true, access$300, currentTimeMillis2);
            if (StateManager.access$100(StateManager.this) != null) {
                StateManager.access$100(StateManager.this).onImmediateTransEnd(this.action);
            }
        }
    }

    @Override // com.taobao.message.lab.comfrm.core.ActionDispatcher
    public void dispatch(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("865d606c", new Object[]{this, action});
            return;
        }
        if (action.getContext().get("traceId") == null) {
            HashMap hashMap = new HashMap(action.getContext());
            hashMap.put("traceId", Double.valueOf(SystemClock.uptimeMillis() + Math.random()));
            action = new Action.Build(action.getName()).data(action.getData()).context(hashMap).build();
        }
        if (this.strictMerge) {
            List<TransformerItem> list = this.mTransformerInfo.immediateTransformerList;
            if (list == null || list.isEmpty()) {
                asyncTransOrMergePost(action);
            } else if (StdActions.COMPONENT_FIRST.equals(action.getName())) {
                if (VExecutors.currentThread() != Looper.getMainLooper().getThread()) {
                    throw new IllegalArgumentException("firstAction应该运行在mainThread");
                } else if (this.firstDispatchMode == 1) {
                    Schedules.ui(new ImmediateTransRunnable(action, false, false));
                    if (this.mJSTransformDispatcher != null && !this.mJSTransformDispatcher.hasInit() && ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "msgOpenImmediateTransInitJS")) {
                        asyncTrans(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.StateManager.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    StateManager.access$000(StateManager.this).init();
                                }
                            }
                        });
                    }
                } else {
                    Schedules.ui(new ImmediateTransRunnable(action, true, false));
                    asyncTransOrMergePost(action);
                }
            } else if (StdActions.UPDATE_ORIGINAL_DATA.equals(action.getName())) {
                asyncTransOrMergePost(action);
            } else if (action.getContext() == null || !action.getContext().containsKey(StdActions.ACTION_OPT_IMMEDIATE)) {
                asyncTransOrMergePost(action);
            } else if (!ApplicationUtil.isDebug() || VExecutors.currentThread() == Looper.getMainLooper().getThread()) {
                Schedules.ui(new ImmediateTransRunnable(action, false, true ^ this.immediateOpt));
            } else {
                throw new IllegalArgumentException("immediate action应该运行在mainThread");
            }
        } else if (StdActions.UPDATE_ORIGINAL_DATA.equals(action.getName())) {
            this.mLimiter.tryExecute(action);
        } else {
            asyncTrans(new AsyncTransRunnable(action, null, null));
        }
    }

    public void rebuildAsyncTransformer(TransformerInfo transformerInfo, Plugin plugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa0f946", new Object[]{this, transformerInfo, plugin});
        } else if (ApplicationUtil.isDebug() || this.mNativeTransformDispatcher == null) {
            TraceUtil.beginSection("buildAsyncTransformer");
            this.mNativeTransformDispatcher = new TransformDispatcher(createObject(transformerInfo.nativeTransformerList), "native", false, plugin);
            this.mFinalTransformDispatcher = new TransformDispatcher(createObject(transformerInfo.finalTransformerList), "finial", true, plugin);
            TraceUtil.endTrace();
        }
    }
}
