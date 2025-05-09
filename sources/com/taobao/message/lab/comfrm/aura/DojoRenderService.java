package com.taobao.message.lab.comfrm.aura;

import android.app.Activity;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.inner2.Diff;
import com.taobao.message.lab.comfrm.inner2.lazy.LazyInitObjectRef;
import com.taobao.message.lab.comfrm.render.WidgetRenderImpl;
import com.taobao.message.lab.comfrm.support.dinamic.DXAsyncCacheManager;
import com.taobao.message.lab.comfrm.util.BlockingQueueSync;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.util.MessageNavProcessorV2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.c21;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DojoRenderService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Dispatcher mDispatcher;
    private final DojoContext mDojoContext;
    private final LazyInitObjectRef<DojoPageContext> mDojoPageContextRef;
    private volatile ViewObject mFirstInput;
    private ViewObject mPauseMergeVO;
    private WidgetRenderImpl mRender;
    private final BlockingQueueSync mViewFirstLock;
    private volatile boolean isRender = false;
    private boolean mPauseRender = false;
    private List<ViewObject> mPauseInputList = new ArrayList(4);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface Dispatcher {
        void dispatch(ViewObject viewObject, Event event);
    }

    static {
        t2o.a(537919525);
    }

    public DojoRenderService(DojoContext dojoContext, LazyInitObjectRef<DojoPageContext> lazyInitObjectRef, BlockingQueueSync blockingQueueSync, Dispatcher dispatcher) {
        this.mDojoContext = dojoContext;
        this.mDojoPageContextRef = lazyInitObjectRef;
        this.mViewFirstLock = blockingQueueSync;
        this.mDispatcher = dispatcher;
        if (lazyInitObjectRef.isInit()) {
            tryInitRender(false);
        }
    }

    public static /* synthetic */ void access$000(DojoRenderService dojoRenderService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6513fbc3", new Object[]{dojoRenderService, new Boolean(z)});
        } else {
            dojoRenderService.tryInitRender(z);
        }
    }

    public static /* synthetic */ boolean access$100(DojoRenderService dojoRenderService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("946dfdb6", new Object[]{dojoRenderService})).booleanValue();
        }
        return dojoRenderService.isRender;
    }

    public static /* synthetic */ DojoContext access$1000(DojoRenderService dojoRenderService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DojoContext) ipChange.ipc$dispatch("8224e8c0", new Object[]{dojoRenderService});
        }
        return dojoRenderService.mDojoContext;
    }

    public static /* synthetic */ boolean access$102(DojoRenderService dojoRenderService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55a0224", new Object[]{dojoRenderService, new Boolean(z)})).booleanValue();
        }
        dojoRenderService.isRender = z;
        return z;
    }

    public static /* synthetic */ Dispatcher access$1100(DojoRenderService dojoRenderService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dispatcher) ipChange.ipc$dispatch("4f7de81c", new Object[]{dojoRenderService});
        }
        return dojoRenderService.mDispatcher;
    }

    public static /* synthetic */ BlockingQueueSync access$1200(DojoRenderService dojoRenderService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BlockingQueueSync) ipChange.ipc$dispatch("87bc31e7", new Object[]{dojoRenderService});
        }
        return dojoRenderService.mViewFirstLock;
    }

    public static /* synthetic */ ViewObject access$200(DojoRenderService dojoRenderService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("c904e2", new Object[]{dojoRenderService});
        }
        return dojoRenderService.mFirstInput;
    }

    public static /* synthetic */ ViewObject access$202(DojoRenderService dojoRenderService, ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("a9e6b8d9", new Object[]{dojoRenderService, viewObject});
        }
        dojoRenderService.mFirstInput = viewObject;
        return viewObject;
    }

    public static /* synthetic */ void access$300(DojoRenderService dojoRenderService, ViewObject viewObject, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c4fafc", new Object[]{dojoRenderService, viewObject, new Integer(i), new Boolean(z)});
        } else {
            dojoRenderService.renderConsumeImpl(viewObject, i, z);
        }
    }

    public static /* synthetic */ boolean access$400(DojoRenderService dojoRenderService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3cedf39", new Object[]{dojoRenderService})).booleanValue();
        }
        return dojoRenderService.mPauseRender;
    }

    public static /* synthetic */ boolean access$402(DojoRenderService dojoRenderService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2155101", new Object[]{dojoRenderService, new Boolean(z)})).booleanValue();
        }
        dojoRenderService.mPauseRender = z;
        return z;
    }

    public static /* synthetic */ List access$500(DojoRenderService dojoRenderService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ac872fd1", new Object[]{dojoRenderService});
        }
        return dojoRenderService.mPauseInputList;
    }

    public static /* synthetic */ ViewObject access$600(DojoRenderService dojoRenderService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("1749fe6", new Object[]{dojoRenderService});
        }
        return dojoRenderService.mPauseMergeVO;
    }

    public static /* synthetic */ ViewObject access$602(DojoRenderService dojoRenderService, ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("61084555", new Object[]{dojoRenderService, viewObject});
        }
        dojoRenderService.mPauseMergeVO = viewObject;
        return viewObject;
    }

    public static /* synthetic */ WidgetRenderImpl access$700(DojoRenderService dojoRenderService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetRenderImpl) ipChange.ipc$dispatch("aa27ffa8", new Object[]{dojoRenderService});
        }
        return dojoRenderService.mRender;
    }

    public static /* synthetic */ LazyInitObjectRef access$800(DojoRenderService dojoRenderService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LazyInitObjectRef) ipChange.ipc$dispatch("dc1f5994", new Object[]{dojoRenderService});
        }
        return dojoRenderService.mDojoPageContextRef;
    }

    public static /* synthetic */ ViewObject access$900(DojoRenderService dojoRenderService, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("7c312f5a", new Object[]{dojoRenderService, list});
        }
        return dojoRenderService.mergeList(list);
    }

    private ViewObject mergeList(List<ViewObject> list) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("bb39f0dd", new Object[]{this, list});
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        if (list.size() <= 1) {
            return null;
        }
        ViewObject viewObject = new ViewObject(list.get(list.size() - 1));
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            Serializable serializable = list.get(i).data;
            if ((serializable instanceof JSONObject) && (jSONArray = (JSONArray) ValueUtil.getValue((JSONObject) serializable, "__DXCMD", JSONArray.class, null)) != null && !jSONArray.isEmpty()) {
                jSONArray2.addAll(jSONArray);
            }
        }
        if (viewObject.data instanceof JSONObject) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll((JSONObject) viewObject.data);
            jSONObject.put("__DXCMD", (Object) jSONArray2);
            viewObject.data = jSONObject;
        }
        Diff diff = list.get(0).diff;
        for (int i2 = 1; i2 < list.size(); i2++) {
            Diff diff2 = list.get(i2).diff;
            if (diff2 != null) {
                if (diff == null) {
                    diff = diff2;
                } else {
                    DojoContext dojoContext = this.mDojoContext;
                    diff = diff.merge(diff2, dojoContext.identifier, dojoContext.useRemote);
                }
            }
        }
        viewObject.diff = diff;
        return viewObject;
    }

    private void tryInitRender(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("985d6cec", new Object[]{this, new Boolean(z)});
        } else if (!this.mDojoPageContextRef.isInit()) {
            if (z) {
                throw new RuntimeException("请在操作页面前，绑定activity信息");
            }
        } else if (this.mRender == null) {
            this.mRender = this.mDojoPageContextRef.get().mainRender;
        }
    }

    public void dispatch(final Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e55a714", new Object[]{this, event});
            return;
        }
        TraceUtil.beginSection("AURA-Dispatch" + event.getName());
        if (StdActions.TRY_RENDER.equals(event.getName()) || "reRender".equals(event.getName())) {
            Schedules.ui(new Runnable() { // from class: com.taobao.message.lab.comfrm.aura.DojoRenderService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    DojoRenderService.access$000(DojoRenderService.this, true);
                    if (DojoRenderService.access$100(DojoRenderService.this)) {
                        return;
                    }
                    if (DojoRenderService.access$200(DojoRenderService.this) != null) {
                        DojoRenderService dojoRenderService = DojoRenderService.this;
                        DojoRenderService.access$300(dojoRenderService, DojoRenderService.access$200(dojoRenderService), 1, false);
                    } else if (ApplicationUtil.isDebug()) {
                        Logger.e("DojoRenderService", "not ready VO");
                    }
                }
            });
        } else if (StdActions.PAUSE_RENDER.equals(event.getName())) {
            Schedules.ui(new Runnable() { // from class: com.taobao.message.lab.comfrm.aura.DojoRenderService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (this) {
                        DojoRenderService.access$402(DojoRenderService.this, true);
                    }
                }
            });
        } else if (StdActions.RESUME_RENDER.equals(event.getName())) {
            Schedules.ui(new Runnable() { // from class: com.taobao.message.lab.comfrm.aura.DojoRenderService.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    DojoRenderService.access$000(DojoRenderService.this, true);
                    synchronized (this) {
                        try {
                            DojoRenderService.access$402(DojoRenderService.this, false);
                            if (!DojoRenderService.access$500(DojoRenderService.this).isEmpty() && DojoRenderService.access$600(DojoRenderService.this) != null) {
                                DojoRenderService dojoRenderService = DojoRenderService.this;
                                DojoRenderService.access$300(dojoRenderService, DojoRenderService.access$600(dojoRenderService), DojoRenderService.access$500(DojoRenderService.this).size(), false);
                                DojoRenderService.access$602(DojoRenderService.this, null);
                                DojoRenderService.access$500(DojoRenderService.this).clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        } else {
            Schedules.ui(new Runnable() { // from class: com.taobao.message.lab.comfrm.aura.DojoRenderService.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    DojoRenderService.access$000(DojoRenderService.this, true);
                    DojoRenderService.access$700(DojoRenderService.this).postEvent(event);
                }
            });
        }
        TraceUtil.endTrace();
    }

    public void renderConsume(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20854812", new Object[]{this, viewObject});
        } else {
            renderConsumeImpl(viewObject, 1, true);
        }
    }

    private void renderConsumeImpl(final ViewObject viewObject, final int i, boolean z) {
        BlockingQueueSync blockingQueueSync;
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de51083", new Object[]{this, viewObject, new Integer(i), new Boolean(z)});
            return;
        }
        if (!this.isRender && this.mFirstInput == null) {
            this.mFirstInput = viewObject;
        }
        if (DXAsyncCacheManager.isOpenPostBeforeParsePrefetch) {
            synchronized (this) {
                try {
                    if (!this.mDojoPageContextRef.isInit()) {
                        this.mPauseRender = true;
                    }
                    if (this.mPauseRender) {
                        TraceUtil.beginSection("PAUSE-RenderSkip");
                        this.mPauseInputList.add(viewObject);
                        this.mPauseMergeVO = mergeList(this.mPauseInputList);
                        TraceUtil.asyncTraceBegin("AURA-PAUSE_RENDER-" + this.mPauseInputList.size(), viewObject.hashCode());
                        TraceUtil.asyncTraceEnd("AURA-PAUSE_RENDER-" + this.mPauseInputList.size(), viewObject.hashCode());
                        if (z) {
                            if (this.mPauseInputList.size() != 1) {
                                if (viewObject.isStateLoadSourceReady) {
                                }
                            }
                            if (this.mDojoPageContextRef.isInit()) {
                                activity = this.mDojoPageContextRef.get().activity;
                            } else {
                                activity = c21.i();
                            }
                            if (activity != null) {
                                DXAsyncCacheManager.prefetchParseToInnerCache(activity, this.mPauseMergeVO);
                            }
                        }
                        TraceUtil.endTrace();
                        Logger.e("DojoRenderService", "runnable pause skip");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Runnable runnable = new Runnable() { // from class: com.taobao.message.lab.comfrm.aura.DojoRenderService.5
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private boolean isFinish = false;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (this.isFinish) {
                    Logger.e("DojoRenderService", "runnable skip");
                } else {
                    this.isFinish = true;
                    synchronized (DojoRenderService.this) {
                        try {
                            if (DojoRenderService.access$700(DojoRenderService.this) == null) {
                                if (DojoRenderService.access$800(DojoRenderService.this).isInit()) {
                                    DojoRenderService.access$000(DojoRenderService.this, false);
                                } else {
                                    DojoRenderService.access$402(DojoRenderService.this, true);
                                }
                            }
                            if (!DXAsyncCacheManager.isOpenPostBeforeParsePrefetch && DojoRenderService.access$400(DojoRenderService.this)) {
                                TraceUtil.beginSection("PAUSE-RenderSkip");
                                DojoRenderService.access$500(DojoRenderService.this).add(viewObject);
                                DojoRenderService dojoRenderService = DojoRenderService.this;
                                DojoRenderService.access$602(dojoRenderService, DojoRenderService.access$900(dojoRenderService, DojoRenderService.access$500(dojoRenderService)));
                                TraceUtil.endTrace();
                                Logger.e("DojoRenderService", "runnable pause skip");
                                return;
                            }
                            Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1011).ext("containerKey", DojoRenderService.access$1000(DojoRenderService.this).containerKey, MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, DojoRenderService.access$1000(DojoRenderService.this).bizConfigCode, "voListSize", String.valueOf(i)).build());
                            DojoRenderService.access$202(DojoRenderService.this, null);
                            DojoRenderService.access$102(DojoRenderService.this, true);
                            DojoRenderService.access$700(DojoRenderService.this).render(viewObject, new EventDispatcher() { // from class: com.taobao.message.lab.comfrm.aura.DojoRenderService.5.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.message.lab.comfrm.core.EventDispatcher
                                public void dispatch(Event event) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("4e55a714", new Object[]{this, event});
                                    } else {
                                        DojoRenderService.access$1100(DojoRenderService.this).dispatch(viewObject, event);
                                    }
                                }
                            });
                            if (viewObject.isStateLoadSourceReady && DojoRenderService.access$1200(DojoRenderService.this) != null) {
                                DojoRenderService.access$1200(DojoRenderService.this).finish("stateReady");
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        };
        Schedules.ui(runnable);
        BlockingQueueSync blockingQueueSync2 = this.mViewFirstLock;
        if (blockingQueueSync2 != null) {
            blockingQueueSync2.put(runnable);
        }
        if (viewObject == null && (blockingQueueSync = this.mViewFirstLock) != null) {
            blockingQueueSync.finish("null");
        }
    }
}
