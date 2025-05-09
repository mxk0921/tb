package com.taobao.message.lab.comfrm.inner2;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
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
import java.util.concurrent.CopyOnWriteArrayList;
import tb.c21;
import tb.t2o;
import tb.w11;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class Plugins implements Plugin, w11 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mBizConfigCode;
    private final ConfigInfo mConfigInfo;
    private final String mContainerKey;
    private final String mIdentifier;
    private final String mVersion;
    private List<Plugin> plugins = new CopyOnWriteArrayList();

    static {
        t2o.a(537919635);
        t2o.a(537919633);
    }

    public Plugins(String str, String str2, String str3, String str4, ConfigInfo configInfo) {
        this.mContainerKey = str;
        this.mIdentifier = str2;
        this.mBizConfigCode = str3;
        this.mVersion = str4;
        this.mConfigInfo = configInfo;
        c21.e(this);
    }

    public void addPlugin(Plugin plugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8e2512", new Object[]{this, plugin});
            return;
        }
        this.plugins.add(plugin);
        plugin.onContainerBasicInfo(this.mContainerKey, this.mBizConfigCode, this.mVersion);
        plugin.onContainerConfigInfo(this.mConfigInfo);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onAwaitFinished(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8883884", new Object[]{this, new Boolean(z)});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onAwaitFinished(z);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBindSubViewDataEnd(String str, ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988c1f26", new Object[]{this, str, viewObject});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onBindSubViewDataEnd(str, viewObject);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBindSubViewDataStart(String str, ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34a43f3f", new Object[]{this, str, viewObject});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onBindSubViewDataStart(str, viewObject);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBuildViewObjectDataEnd(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa128ba", new Object[]{this, viewObject});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onBuildViewObjectDataEnd(viewObject);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBuildViewObjectDataStart(LayoutInfo layoutInfo, SharedState sharedState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("397e4b1b", new Object[]{this, layoutInfo, sharedState});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onBuildViewObjectDataStart(layoutInfo, sharedState);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerBasicInfo(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a38695f", new Object[]{this, str, str2, str3});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerConfigInfo(ConfigInfo configInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a058ccc", new Object[]{this, configInfo});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerDisposeFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f56faef6", new Object[]{this});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onContainerDisposeFinished();
        }
        c21.m(this);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStartEnd(ConfigInfo configInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f9b7d5", new Object[]{this, configInfo});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onContainerStartEnd(configInfo);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStartStart(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ee7cc7", new Object[]{this, str, str2, str3});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onContainerStartStart(str, str2, str3);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStepEnd(int i, ConfigInfo configInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127dca02", new Object[]{this, new Integer(i), configInfo});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onContainerStepEnd(i, configInfo);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStepStart(String str, String str2, String str3, int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c16f3fb", new Object[]{this, str, str2, str3, new Integer(i), map});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onContainerStepStart(str, str2, str3, i, map);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onCreateSubViewEnd(String str, ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdee12fd", new Object[]{this, str, viewObject});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onCreateSubViewEnd(str, viewObject);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onCreateSubViewStart(String str, ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89589956", new Object[]{this, str, viewObject});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onCreateSubViewStart(str, viewObject);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onEventHandleAwaitDependenceEnd(Action action, EventHandler eventHandler, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6cc110f", new Object[]{this, action, eventHandler, str, new Boolean(z)});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onEventHandleAwaitDependenceEnd(action, eventHandler, str, z);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onEventHandleAwaitDependenceStart(Action action, EventHandler eventHandler, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511ae6ec", new Object[]{this, action, eventHandler, str});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onEventHandleAwaitDependenceStart(action, eventHandler, str);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onEventHandlerExecuted(EventManager.EventRuntimeInfo eventRuntimeInfo, Action action, EventHandleRuntime eventHandleRuntime, EventManager.TraceSpan traceSpan) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e42cb0c2", new Object[]{this, eventRuntimeInfo, action, eventHandleRuntime, traceSpan});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onEventHandlerExecuted(eventRuntimeInfo, action, eventHandleRuntime, traceSpan);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onEventReceived(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e5ba16", new Object[]{this, event});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onEventReceived(event);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onFinalTransformerEnd(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d0ffb4d", new Object[]{this, action});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onFinalTransformerEnd(action);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onFinalTransformerStart(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7b3ec66", new Object[]{this, action});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onFinalTransformerStart(action);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onGlobalLayout(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74e28e6", new Object[]{this, str, new Integer(i)});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onGlobalLayout(str, i);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onImmediateTransEnd(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a94dc1", new Object[]{this, action});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onImmediateTransEnd(action);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onImmediateTransStart(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4271da", new Object[]{this, action});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onImmediateTransStart(action);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onJSTransformerEnd(Action action, TransformerItem transformerItem, Dependecy dependecy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e335a286", new Object[]{this, action, transformerItem, dependecy});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onJSTransformerEnd(action, transformerItem, dependecy);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onJSTransformerStart(Action action, TransformerItem transformerItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d1a4c", new Object[]{this, action, transformerItem});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onJSTransformerStart(action, transformerItem);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onLoadJSEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cd7a494", new Object[]{this});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onLoadJSEnd();
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onLoadJSStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a0d601b", new Object[]{this});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onLoadJSStart();
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onLoadSnapshotEnd(Snapshot.SnapshotData snapshotData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ffe1b", new Object[]{this, snapshotData});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onLoadSnapshotEnd(snapshotData);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onLoadSnapshotStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af0e5a0", new Object[]{this});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onLoadSnapshotStart();
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onNativeTransformerEnd(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a38fbae", new Object[]{this, action});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onNativeTransformerEnd(action);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onNativeTransformerStart(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e5887", new Object[]{this, action});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onNativeTransformerStart(action);
        }
    }

    @Override // com.taobao.application.common.IPageListener
    public void onPageChanged(String str, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf1be38", new Object[]{this, str, new Integer(i), new Long(j)});
        } else if (i == 1) {
            onPageStart(str, j);
        } else if (i == 2) {
            onPageVisible(str, j);
        } else if (i == 3) {
            onPageInteractive(str, j);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onPageInteractive(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff82b6df", new Object[]{this, str, new Long(j)});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onPageInteractive(str, j);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onPageStart(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("735bebdf", new Object[]{this, str, new Long(j)});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onPageStart(str, j);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onPageVisible(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3320da4f", new Object[]{this, str, new Long(j)});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onPageVisible(str, j);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderAfter(ViewObject viewObject, ViewGroup viewGroup, WidgetInstance widgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59558731", new Object[]{this, viewObject, viewGroup, widgetInstance});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onRenderAfter(viewObject, viewGroup, widgetInstance);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderBefore(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425782a4", new Object[]{this, viewObject});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onRenderBefore(viewObject);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderRuntimeChanged(RenderRuntimeInfo renderRuntimeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8352d31e", new Object[]{this, renderRuntimeInfo});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onRenderRuntimeChanged(renderRuntimeInfo);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderSnapshotEnd(Snapshot.SnapshotData snapshotData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ffaf2b", new Object[]{this, snapshotData});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onRenderSnapshotEnd(snapshotData);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderSnapshotStart(Snapshot.SnapshotData snapshotData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbbe4cf2", new Object[]{this, snapshotData});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onRenderSnapshotStart(snapshotData);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceEnd(SourceItem sourceItem, Command command, Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40973cb", new Object[]{this, sourceItem, command, action});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onSourceEnd(sourceItem, command, action);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceRuntimeChanged(Map<String, SourceManager.SourceRuntimeInfo> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f88c328", new Object[]{this, map});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onSourceRuntimeChanged(map);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceStart(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5786cd7e", new Object[]{this, action});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onSourceStart(action);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceTimeout(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300e271f", new Object[]{this, list});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onSourceTimeout(list);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onStateRuntimeChanged(StateManager.StateRuntimeInfo stateRuntimeInfo, StateManager.StateTraceSpan stateTraceSpan) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41fec3d2", new Object[]{this, stateRuntimeInfo, stateTraceSpan});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onStateRuntimeChanged(stateRuntimeInfo, stateTraceSpan);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onTransformerEnd(Action action, TransformerItem transformerItem, String str, Dependecy dependecy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68509707", new Object[]{this, action, transformerItem, str, dependecy});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onTransformerEnd(action, transformerItem, str, dependecy);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onTransformerStart(Action action, TransformerItem transformerItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae452f4d", new Object[]{this, action, transformerItem, str});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onTransformerStart(action, transformerItem, str);
        }
    }

    public void removePlugin(Plugin plugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e6d41cf", new Object[]{this, plugin});
        } else {
            this.plugins.remove(plugin);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBindSubViewDataEnd(LayoutInfo layoutInfo, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73303d8b", new Object[]{this, layoutInfo, map});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onBindSubViewDataEnd(layoutInfo, map);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBindSubViewDataStart(LayoutInfo layoutInfo, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2c26e4", new Object[]{this, layoutInfo, map});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onBindSubViewDataStart(layoutInfo, map);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onCreateSubViewEnd(LayoutInfo layoutInfo, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436bb422", new Object[]{this, layoutInfo, map});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onCreateSubViewEnd(layoutInfo, map);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onCreateSubViewStart(LayoutInfo layoutInfo, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6453bb", new Object[]{this, layoutInfo, map});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onCreateSubViewStart(layoutInfo, map);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onJSTransformerEnd(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9bc305c", new Object[]{this, action});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onJSTransformerEnd(action);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onJSTransformerStart(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a2719b5", new Object[]{this, action});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onJSTransformerStart(action);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceEnd(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd84265", new Object[]{this, action});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onSourceEnd(action);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceStart(SourceItem sourceItem, Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39200349", new Object[]{this, sourceItem, command});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onSourceStart(sourceItem, command);
        }
    }
}
