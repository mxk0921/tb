package com.taobao.message.lab.comfrm.inner2;

import android.view.ViewGroup;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner2.EventManager;
import com.taobao.message.lab.comfrm.inner2.Snapshot;
import com.taobao.message.lab.comfrm.inner2.SourceManager;
import com.taobao.message.lab.comfrm.inner2.StateManager;
import com.taobao.message.lab.comfrm.inner2.config.ConfigInfo;
import com.taobao.message.lab.comfrm.inner2.config.LayoutInfo;
import com.taobao.message.lab.comfrm.inner2.config.SourceItem;
import com.taobao.message.lab.comfrm.inner2.config.TransformerItem;
import com.taobao.message.lab.comfrm.inner2.event.EventHandleRuntime;
import com.taobao.message.lab.comfrm.render.RenderRuntimeInfo;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface Plugin {
    void onAwaitFinished(boolean z);

    void onBindSubViewDataEnd(LayoutInfo layoutInfo, Map<String, String> map);

    void onBindSubViewDataEnd(String str, ViewObject viewObject);

    void onBindSubViewDataStart(LayoutInfo layoutInfo, Map<String, String> map);

    void onBindSubViewDataStart(String str, ViewObject viewObject);

    void onBuildViewObjectDataEnd(ViewObject viewObject);

    void onBuildViewObjectDataStart(LayoutInfo layoutInfo, SharedState sharedState);

    void onContainerBasicInfo(String str, String str2, String str3);

    void onContainerConfigInfo(ConfigInfo configInfo);

    void onContainerDisposeFinished();

    void onContainerStartEnd(ConfigInfo configInfo);

    void onContainerStartStart(String str, String str2, String str3);

    void onContainerStepEnd(int i, ConfigInfo configInfo);

    void onContainerStepStart(String str, String str2, String str3, int i, Map<String, Object> map);

    void onCreateSubViewEnd(LayoutInfo layoutInfo, Map<String, String> map);

    void onCreateSubViewEnd(String str, ViewObject viewObject);

    void onCreateSubViewStart(LayoutInfo layoutInfo, Map<String, String> map);

    void onCreateSubViewStart(String str, ViewObject viewObject);

    void onEventHandleAwaitDependenceEnd(Action action, EventHandler eventHandler, String str, boolean z);

    void onEventHandleAwaitDependenceStart(Action action, EventHandler eventHandler, String str);

    void onEventHandlerExecuted(EventManager.EventRuntimeInfo eventRuntimeInfo, Action action, EventHandleRuntime eventHandleRuntime, EventManager.TraceSpan traceSpan);

    void onEventReceived(Event event);

    void onFinalTransformerEnd(Action action);

    void onFinalTransformerStart(Action action);

    void onGlobalLayout(String str, int i);

    void onImmediateTransEnd(Action action);

    void onImmediateTransStart(Action action);

    void onJSTransformerEnd(Action action);

    void onJSTransformerEnd(Action action, TransformerItem transformerItem, Dependecy dependecy);

    void onJSTransformerStart(Action action);

    void onJSTransformerStart(Action action, TransformerItem transformerItem);

    void onLoadJSEnd();

    void onLoadJSStart();

    void onLoadSnapshotEnd(Snapshot.SnapshotData snapshotData);

    void onLoadSnapshotStart();

    void onNativeTransformerEnd(Action action);

    void onNativeTransformerStart(Action action);

    void onPageInteractive(String str, long j);

    void onPageStart(String str, long j);

    void onPageVisible(String str, long j);

    void onRenderAfter(ViewObject viewObject, ViewGroup viewGroup, WidgetInstance widgetInstance);

    void onRenderBefore(ViewObject viewObject);

    void onRenderRuntimeChanged(RenderRuntimeInfo renderRuntimeInfo);

    void onRenderSnapshotEnd(Snapshot.SnapshotData snapshotData);

    void onRenderSnapshotStart(Snapshot.SnapshotData snapshotData);

    void onSourceEnd(Action action);

    void onSourceEnd(SourceItem sourceItem, Command command, Action action);

    void onSourceRuntimeChanged(Map<String, SourceManager.SourceRuntimeInfo> map);

    void onSourceStart(Action action);

    void onSourceStart(SourceItem sourceItem, Command command);

    void onSourceTimeout(List<String> list);

    void onStateRuntimeChanged(StateManager.StateRuntimeInfo stateRuntimeInfo, StateManager.StateTraceSpan stateTraceSpan);

    void onTransformerEnd(Action action, TransformerItem transformerItem, String str, Dependecy dependecy);

    void onTransformerStart(Action action, TransformerItem transformerItem, String str);
}
