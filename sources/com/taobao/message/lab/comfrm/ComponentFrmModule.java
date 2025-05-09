package com.taobao.message.lab.comfrm;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.inner2.event.FinishPageEventHandler;
import com.taobao.message.lab.comfrm.inner2.event.JsEventHandler;
import com.taobao.message.lab.comfrm.inner2.event.NavEventHandler;
import com.taobao.message.lab.comfrm.inner2.event.PoplayerEventHandler;
import com.taobao.message.lab.comfrm.inner2.event.UpdateStateEventHandler;
import com.taobao.message.lab.comfrm.inner2.plugin.ISnapshotCenter;
import com.taobao.message.lab.comfrm.inner2.plugin.SnapshotCenter;
import com.taobao.message.lab.comfrm.render.ClassPool;
import com.taobao.message.lab.comfrm.support.CustomResourceDeltaItemMerger;
import com.taobao.message.lab.comfrm.support.SimpleMapDeltaItemMerger;
import com.taobao.message.lab.comfrm.support.dinamic.CommonRecyclerRefreshHandler;
import com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance;
import com.taobao.message.lab.comfrm.support.list.ListItemInstance;
import com.taobao.message.lab.comfrm.support.list.SectionListWidgetInstance;
import com.taobao.message.lab.comfrm.support.list.SectionListWidgetInstanceV2;
import com.taobao.message.lab.comfrm.support.list.SimpleListWidgetInstance;
import com.taobao.message.lab.comfrm.support.mtop.NotifySourceEventHandler;
import com.taobao.message.lab.comfrm.support.page.PageWidgetInstance;
import com.taobao.message.lab.comfrm.support.vertical.VerticalWidgetInstance;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ComponentFrmModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile String sAbId;
    public static volatile boolean sFixInputAndroid13;
    public static volatile Map<String, Object> sOptSwitchGroup;
    public static boolean ENABLE_DEBUG = false;
    public static volatile int sItemPrefetchSize = 0;
    public static volatile int sOptSwitchGapWorkerSize = 0;
    public static volatile boolean sDXEnginePrefetch = false;
    public static volatile boolean sDXRefreshAfterScroll = false;
    public static volatile boolean sDXTemplateSnapshot = true;
    private static final HashMap<String, String> initStates = new HashMap<>();
    private static int sNextKey = 0;

    static {
        t2o.a(537919500);
    }

    public static synchronized boolean getUseNativeBean() {
        synchronized (ComponentFrmModule.class) {
            IpChange ipChange = $ipChange;
            if (!(ipChange instanceof IpChange)) {
                return true;
            }
            return ((Boolean) ipChange.ipc$dispatch("23da4e23", new Object[0])).booleanValue();
        }
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            initWithNamespace(null);
        }
    }

    public static synchronized void setUseNativeBean(boolean z) {
        synchronized (ComponentFrmModule.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9baaa1", new Object[]{new Boolean(z)});
            }
        }
    }

    public static synchronized int uniqueKey() {
        synchronized (ComponentFrmModule.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("28182a48", new Object[0])).intValue();
            }
            int i = sNextKey;
            sNextKey = i + 1;
            return i;
        }
    }

    public static void init(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc73a1", new Object[]{str});
        } else {
            GlobalContainer.getInstance().register(ISnapshotCenter.class, str, "", new SnapshotCenter());
        }
    }

    public static void initWithNamespace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce1500d6", new Object[]{str});
            return;
        }
        HashMap<String, String> hashMap = initStates;
        if (!"true".equalsIgnoreCase(hashMap.get(String.valueOf(str)))) {
            synchronized (ComponentFrmModule.class) {
                try {
                    if (!"true".equalsIgnoreCase(hashMap.get(String.valueOf(str)))) {
                        hashMap.put(String.valueOf(str), String.valueOf(true));
                        ClassPool.instance().put("deltaItemMerger.message.common.map", SimpleMapDeltaItemMerger.class, str);
                        ClassPool.instance().put("deltaItemMerger.message.custom.resource", CustomResourceDeltaItemMerger.class, str);
                        ClassPool.instance().put("__dinamicX", DXWidgetInstance.class, str);
                        ClassPool.instance().put(Constants.Widget.VERTICAL, VerticalWidgetInstance.class, str);
                        ClassPool.instance().put("widget.message.common.page", PageWidgetInstance.class, str);
                        ClassPool.instance().put("widget.message.common.simpleList", SimpleListWidgetInstance.class, str);
                        ClassPool.instance().put("widget.message.common.sectionList", SectionListWidgetInstance.class, str);
                        ClassPool.instance().put("widget.message.common.sectionListV2", SectionListWidgetInstanceV2.class, str);
                        ClassPool.instance().put("widget.message.common.itemwrapper", ListItemInstance.class, str);
                        ClassPool.instance().put("widget.message.common.itemwrapper2", ListItemInstance.class, str);
                        com.taobao.message.lab.comfrm.inner2.ClassPool.instance().put("dxPartRefreshHandler.common.list.diff", CommonRecyclerRefreshHandler.class);
                        com.taobao.message.lab.comfrm.inner2.ClassPool.instance().put("eventhandler.message.common.updateState", UpdateStateEventHandler.class, str);
                        com.taobao.message.lab.comfrm.inner2.ClassPool.instance().put("eventhandler.message.common.finishPage", FinishPageEventHandler.class, str);
                        com.taobao.message.lab.comfrm.inner2.ClassPool.instance().put("eventhandler.message.common.nav", NavEventHandler.class, str);
                        com.taobao.message.lab.comfrm.inner2.ClassPool.instance().put("eventhandler.message.common.poplayer", PoplayerEventHandler.class, str);
                        com.taobao.message.lab.comfrm.inner2.ClassPool.instance().put("eventhandler.message.common.notifySource", NotifySourceEventHandler.class, str);
                        com.taobao.message.lab.comfrm.inner2.ClassPool.instance().put(StdActions.JS_EVENT_HANDLE_TYPE, JsEventHandler.class, str);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Constants.Monitor.JSSTATE_BUILD_TIME);
                        arrayList.add(Constants.Monitor.EXECUTE_TIME);
                        AppMonitor.register(Constants.Monitor.MODULE_MONITOR, Constants.Monitor.POINT_JSTRANSFORME_TIME, MeasureSet.create(arrayList), DimensionSet.create(Collections.singleton("successCount")));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
