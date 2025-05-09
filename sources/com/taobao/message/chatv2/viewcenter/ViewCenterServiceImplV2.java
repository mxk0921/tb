package com.taobao.message.chatv2.viewcenter;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chatv2.viewcenter.IViewCenterService;
import com.taobao.message.chatv2.viewcenter.ViewCenterServiceImplV2;
import com.taobao.message.chatv2.viewcenter.config.LayoutInfo;
import com.taobao.message.kit.threadpool.BaseRunnable;
import com.taobao.message.kit.threadpool.Coordinator;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.render.RenderResult;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import com.taobao.message.lab.comfrm.render.WidgetInterface;
import com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.unit.center.mdc.dinamicx.constants.DinamicxNativeConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.h9z;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ViewCenterServiceImplV2 implements IViewCenterService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean sRegisterMonitor;
    private Context context;
    private ViewCenterEnv env;
    private JSONObject envJSON;
    private IEventService eventService;
    private ViewCenterProps props;
    private JSONObject propsJSON;
    private Map<String, Object> renderContext;
    private boolean useSingleProps;
    private ITemplateService templateService = new TemplateInfoServiceImpl();
    private IRenderService renderService = new RenderServiceImpl();
    private Map<Integer, WeakReference<WidgetInterface>> weakId2widgetInstance = new ConcurrentHashMap();
    private Map<Integer, WidgetInterface> dxId2widgetInstance = new ConcurrentHashMap();
    private Set<Integer> viewDetected = new HashSet();
    private Map<Object, Map<String, Object>> cacheUIDataMap = new HashMap();

    static {
        t2o.a(552599616);
        t2o.a(552599601);
    }

    public ViewCenterServiceImplV2(Context context, ViewCenterProps viewCenterProps, ViewCenterEnv viewCenterEnv) {
        this.props = viewCenterProps;
        this.context = context;
        this.propsJSON = (JSONObject) JSON.toJSON(viewCenterProps);
        this.env = viewCenterEnv;
        this.envJSON = (JSONObject) JSON.toJSON(viewCenterEnv);
        if (!sRegisterMonitor) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("templateId");
            arrayList.add("templateVersion");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("time");
            AppMonitor.register("message", "viewCenterRendeTime", MeasureSet.create(arrayList2), DimensionSet.create(arrayList));
            sRegisterMonitor = true;
        }
        EventServiceImpl eventServiceImpl = new EventServiceImpl(viewCenterProps, context);
        eventServiceImpl.setViewCenterProvider(new IViewCenterProvider() { // from class: tb.pdw
            @Override // com.taobao.message.chatv2.viewcenter.IViewCenterProvider
            public final IViewCenterService getViewCenterService() {
                IViewCenterService lambda$new$0;
                lambda$new$0 = ViewCenterServiceImplV2.this.lambda$new$0();
                return lambda$new$0;
            }
        });
        this.eventService = eventServiceImpl;
        this.useSingleProps = "1".equals(ConfigUtil.getValue("mpm_business_switch", "useSingleProps", "1"));
    }

    public static /* synthetic */ void access$000(ViewCenterServiceImplV2 viewCenterServiceImplV2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3712d5ff", new Object[]{viewCenterServiceImplV2, new Integer(i)});
        } else {
            viewCenterServiceImplV2.onAnalysisView(i);
        }
    }

    public static /* synthetic */ Map access$100(ViewCenterServiceImplV2 viewCenterServiceImplV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b0dd427a", new Object[]{viewCenterServiceImplV2});
        }
        return viewCenterServiceImplV2.cacheUIDataMap;
    }

    public static /* synthetic */ Set access$200(ViewCenterServiceImplV2 viewCenterServiceImplV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("585be5f5", new Object[]{viewCenterServiceImplV2});
        }
        return viewCenterServiceImplV2.viewDetected;
    }

    public static /* synthetic */ Map access$300(ViewCenterServiceImplV2 viewCenterServiceImplV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ffd4f5fc", new Object[]{viewCenterServiceImplV2});
        }
        return viewCenterServiceImplV2.weakId2widgetInstance;
    }

    public static /* synthetic */ ViewCenterEnv access$400(ViewCenterServiceImplV2 viewCenterServiceImplV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewCenterEnv) ipChange.ipc$dispatch("e50bcc7f", new Object[]{viewCenterServiceImplV2});
        }
        return viewCenterServiceImplV2.env;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ IViewCenterService lambda$new$0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IViewCenterService) ipChange.ipc$dispatch("95aa61c0", new Object[]{this});
        }
        return this;
    }

    private void onAnalysisView(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7773543c", new Object[]{this, new Integer(i)});
        } else {
            Coordinator.doBackGroundTask(new BaseRunnable() { // from class: com.taobao.message.chatv2.viewcenter.ViewCenterServiceImplV2.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/chatv2/viewcenter/ViewCenterServiceImplV2$4");
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0167  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0170  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0177  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x01e9  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x021f  */
                /* JADX WARN: Type inference failed for: r3v10 */
                @Override // com.taobao.message.kit.threadpool.BaseRunnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void execute() {
                    /*
                        Method dump skipped, instructions count: 551
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.chatv2.viewcenter.ViewCenterServiceImplV2.AnonymousClass4.execute():void");
                }
            });
        }
    }

    @Override // com.taobao.message.chatv2.viewcenter.IViewCenterService
    public WidgetInterface createView(LayoutInfo layoutInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetInterface) ipChange.ipc$dispatch("5d31bd90", new Object[]{this, layoutInfo});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (layoutInfo != null && layoutInfo.renderTemplate == null && TextUtils.isDigitsOnly(layoutInfo.layoutId)) {
            layoutInfo = this.templateService.getLayoutInfo(Integer.parseInt(layoutInfo.layoutId), null);
        }
        final WidgetInterface createWidget = this.renderService.createWidget(this.context, this.props.identifier, layoutInfo);
        if (createWidget == null) {
            TLog.loge("viewcenter", "createView widgetInterface is null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("templateId", (Object) layoutInfo.layoutId);
            jSONObject.put("tempateVersion", (Object) layoutInfo.version);
            AppMonitor.Alarm.commitFail("message", "viewCenterRenderRate", jSONObject.toJSONString(), "201", "aura widget 为空");
        } else if (createWidget.getView() != null) {
            createWidget.getView().setTag(R.id.viewcenterPerformance, Long.valueOf(elapsedRealtime));
            final Runnable runnable = new Runnable() { // from class: com.taobao.message.chatv2.viewcenter.ViewCenterServiceImplV2.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ViewCenterServiceImplV2.access$000(ViewCenterServiceImplV2.this, createWidget.hashCode());
                    }
                }
            };
            createWidget.getView().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.taobao.message.chatv2.viewcenter.ViewCenterServiceImplV2.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    int parseInt;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3d337638", new Object[]{this, view});
                        return;
                    }
                    String value = ConfigUtil.getValue("tb_message_bubble_stable_probe", "message_bubble_analysis_interval_timeV2", "2000");
                    if (TextUtils.isDigitsOnly(value) && (parseInt = Integer.parseInt(value)) > 0) {
                        UIHandler.postDelayed(runnable, parseInt);
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view});
                    } else {
                        UIHandler.removeCallbacks(runnable);
                    }
                }
            });
        }
        if (createWidget != null) {
            this.weakId2widgetInstance.put(Integer.valueOf(createWidget.hashCode()), new WeakReference<>(createWidget));
            if (createWidget instanceof DXWidgetInstance) {
                this.dxId2widgetInstance.put(Integer.valueOf(createWidget.hashCode()), createWidget);
            }
        }
        return createWidget;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Disposable
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        this.eventService.dispose();
        for (Map.Entry<Integer, WeakReference<WidgetInterface>> entry : this.weakId2widgetInstance.entrySet()) {
            WidgetInterface widgetInterface = entry.getValue().get();
            if (widgetInterface != null) {
                widgetInterface.dispose();
            }
        }
        this.weakId2widgetInstance.clear();
        this.viewDetected.clear();
        this.cacheUIDataMap.clear();
        this.dxId2widgetInstance.clear();
    }

    @Override // com.taobao.message.chatv2.viewcenter.IViewCenterService
    public View getView(int i) {
        WidgetInterface widgetInterface;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c9ef8723", new Object[]{this, new Integer(i)});
        }
        WeakReference<WidgetInterface> weakReference = this.weakId2widgetInstance.get(Integer.valueOf(i));
        if (weakReference == null || (widgetInterface = weakReference.get()) == null) {
            return null;
        }
        return widgetInterface.getView();
    }

    @Override // com.taobao.message.chatv2.viewcenter.IViewCenterService
    public void postEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3784874", new Object[]{this, event});
            return;
        }
        for (Map.Entry entry : new HashMap(this.weakId2widgetInstance).entrySet()) {
            WidgetInterface widgetInterface = (WidgetInterface) ((WeakReference) entry.getValue()).get();
            if (widgetInterface != null) {
                widgetInterface.postEvent(event);
            }
        }
    }

    @Override // com.taobao.message.chatv2.viewcenter.IViewCenterService
    public <T> void registerService(Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84aaa520", new Object[]{this, cls, t});
        } else {
            this.eventService.registerService(cls, t);
        }
    }

    @Override // com.taobao.message.chatv2.viewcenter.IViewCenterService
    public void renderView(final WidgetInterface widgetInterface, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c215bd8d", new Object[]{this, widgetInterface, jSONObject});
        } else if (widgetInterface == null) {
            TLog.loge("viewcenter", "renderview widget is null");
        } else {
            final String string = jSONObject.getString("VC_UNI_ID");
            widgetInterface.getView().setTag(R.id.viewcenterUniqueKey, string);
            renderView(widgetInterface, jSONObject, new ActionDispatcher() { // from class: com.taobao.message.chatv2.viewcenter.ViewCenterServiceImplV2.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.lab.comfrm.core.ActionDispatcher
                public void dispatch(final Action action) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("865d606c", new Object[]{this, action});
                    } else {
                        UIHandler.post(new Runnable() { // from class: com.taobao.message.chatv2.viewcenter.ViewCenterServiceImplV2.3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.putAll((Map) action.getContext().get("originData"));
                                jSONObject2.putAll((Map) action.getData());
                                if (TextUtils.isEmpty(string)) {
                                    TLog.loge("viewcenter", "refresh view with uniqueKey empty");
                                    return;
                                }
                                ViewCenterServiceImplV2.access$100(ViewCenterServiceImplV2.this).put(string, jSONObject2);
                                if (!TextUtils.equals(string, (String) widgetInterface.getView().getTag(R.id.viewcenterUniqueKey))) {
                                    TLog.loge("viewcenter", "refresh view with uniqueKey different");
                                    return;
                                }
                                AnonymousClass3 r0 = AnonymousClass3.this;
                                ViewCenterServiceImplV2.this.renderView(widgetInterface, jSONObject2);
                            }
                        });
                    }
                }
            });
        }
    }

    public void setRenderContext(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("659d34c7", new Object[]{this, map});
            return;
        }
        this.renderContext = map;
        IRenderService iRenderService = this.renderService;
        if (iRenderService instanceof RenderServiceImpl) {
            ((RenderServiceImpl) iRenderService).setRenderContext(map);
        }
    }

    @Override // com.taobao.message.chatv2.viewcenter.IViewCenterService
    public void renderView(WidgetInterface widgetInterface, JSONObject jSONObject, ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac788139", new Object[]{this, widgetInterface, jSONObject, actionDispatcher});
        } else if (widgetInterface == null) {
            TLog.loge("viewcenter", "renderview widget is null");
        } else {
            WidgetInstance widgetInstance = (WidgetInstance) widgetInterface;
            LayoutInfo layoutInfo = (LayoutInfo) widgetInstance.getView().getTag(R.id.viewcenterLayoutInfo);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("templateId", (Object) layoutInfo.layoutId);
            jSONObject2.put("tempateVersion", (Object) layoutInfo.version);
            if (jSONObject == null) {
                TLog.loge("viewcenter", "renderview data is null");
                AppMonitor.Alarm.commitFail("message", "viewCenterRenderRate", jSONObject2.toJSONString(), "102", "视图协议为空");
                return;
            }
            ViewObject viewObject = new ViewObject();
            viewObject.info = layoutInfo;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putAll(jSONObject);
            JSONObject jSONObject4 = jSONObject3.getJSONObject("props");
            if (!this.useSingleProps) {
                if (jSONObject4 == null) {
                    jSONObject4 = new JSONObject();
                }
                jSONObject4.putAll(this.propsJSON);
            } else if (jSONObject4 == null) {
                jSONObject4 = new JSONObject();
                jSONObject4.putAll(this.propsJSON);
            }
            jSONObject3.put("env", (Object) this.envJSON);
            jSONObject3.put("props", (Object) jSONObject4);
            jSONObject3.put(DinamicxNativeConfig.DINAMICX_SDK_VERSION_NAME, (Object) this.env.dinamicxSDKVersion);
            if (jSONObject3.containsKey("VC_UNI_ID") && this.cacheUIDataMap.containsKey(jSONObject3.getString("VC_UNI_ID"))) {
                jSONObject3.putAll(this.cacheUIDataMap.get(jSONObject3.getString("VC_UNI_ID")));
            }
            viewObject.data = jSONObject3;
            widgetInstance.bindViewObject(viewObject, this.eventService.createEventDispatcher(layoutInfo, jSONObject3, actionDispatcher));
            View view = widgetInterface.getView();
            int i = R.id.viewcenterRefresh;
            if (view.getTag(i) == null) {
                widgetInterface.postEvent(new Event.Build(h9z.EVENT_ON_APPEAR).build());
                widgetInterface.getView().setTag(i, Boolean.TRUE);
            }
            RenderResult renderResult = widgetInstance.getRenderResult();
            if (renderResult == null || !renderResult.hasError()) {
                AppMonitor.Alarm.commitSuccess("message", "viewCenterRenderRate", jSONObject2.toJSONString());
            } else {
                jSONObject2.put("detail", (Object) renderResult.getError().getDetail());
                AppMonitor.Alarm.commitFail("message", "viewCenterRenderRate", jSONObject2.toJSONString(), renderResult.getError().getErrorCode(), renderResult.getError().getErrorMsg());
            }
            View view2 = widgetInstance.getView();
            int i2 = R.id.viewcenterPerformance;
            Long l = (Long) view2.getTag(i2);
            if (l != null && l.longValue() > 0) {
                widgetInstance.getView().setTag(i2, -1L);
                HashMap hashMap = new HashMap(2);
                hashMap.put("templateId", layoutInfo.layoutId);
                hashMap.put("tempateVersion", layoutInfo.version);
                HashMap hashMap2 = new HashMap(1);
                hashMap2.put("time", Double.valueOf(SystemClock.elapsedRealtime() - l.longValue()));
                AppMonitor.Stat.commit("message", "viewCenterRendeTime", DimensionValueSet.fromStringMap(hashMap), MeasureValueSet.create(hashMap2));
            }
        }
    }

    @Override // com.taobao.message.chatv2.viewcenter.IViewCenterService
    public WidgetInterface createView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetInterface) ipChange.ipc$dispatch("94be6a9c", new Object[]{this, new Integer(i)});
        }
        LayoutInfo layoutInfo = this.templateService.getLayoutInfo(i, null);
        if (layoutInfo != null) {
            return createView(layoutInfo);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("templateId", (Object) Integer.valueOf(i));
        AppMonitor.Alarm.commitFail("message", "viewCenterRenderRate", jSONObject.toJSONString(), "101", "视图协议为空");
        return null;
    }
}
