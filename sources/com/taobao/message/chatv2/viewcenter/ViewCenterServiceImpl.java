package com.taobao.message.chatv2.viewcenter;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chatv2.viewcenter.IViewCenterService;
import com.taobao.message.chatv2.viewcenter.ViewCenterServiceImpl;
import com.taobao.message.chatv2.viewcenter.config.LayoutInfo;
import com.taobao.message.kit.threadpool.BaseRunnable;
import com.taobao.message.kit.threadpool.Coordinator;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner2.Plugins;
import com.taobao.message.lab.comfrm.render.RenderResult;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import com.taobao.message.lab.comfrm.render.WidgetInterface;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.unit.center.mdc.dinamicx.constants.DinamicxNativeConfig;
import com.taobao.unit.center.sync.constant.SyncConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.c21;
import tb.h9z;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ViewCenterServiceImpl implements IViewCenterService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ViewCenterService";
    private static boolean sRegisterMonitor;
    private boolean IS_DEVICE_LEVEL_2;
    private Context context;
    private long delayMonitorTime;
    private ViewCenterEnv env;
    private JSONObject envJSON;
    private IEventService eventService;
    private Plugins mPlugins;
    private ViewCenterProps props;
    private JSONObject propsJSON;
    private Map<String, Object> renderContext;
    private ITemplateService templateService = new TemplateInfoServiceImpl();
    private IRenderService renderService = new RenderServiceImpl();
    private Map<Integer, WidgetInterface> id2widgetInstance = new ConcurrentHashMap();
    private Set<Integer> viewDetected = new HashSet();
    private Map<Object, Map<String, Object>> cacheUIDataMap = new HashMap();

    static {
        t2o.a(552599610);
        t2o.a(552599601);
    }

    public ViewCenterServiceImpl(Context context, ViewCenterProps viewCenterProps, ViewCenterEnv viewCenterEnv) {
        this.delayMonitorTime = 2000L;
        this.props = viewCenterProps;
        this.context = context;
        this.propsJSON = (JSONObject) JSON.toJSON(viewCenterProps);
        this.env = viewCenterEnv;
        this.envJSON = (JSONObject) JSON.toJSON(viewCenterEnv);
        boolean z = true;
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
        eventServiceImpl.setViewCenterProvider(new IViewCenterProvider() { // from class: tb.ndw
            @Override // com.taobao.message.chatv2.viewcenter.IViewCenterProvider
            public final IViewCenterService getViewCenterService() {
                IViewCenterService lambda$new$0;
                lambda$new$0 = ViewCenterServiceImpl.this.lambda$new$0();
                return lambda$new$0;
            }
        });
        this.eventService = eventServiceImpl;
        this.IS_DEVICE_LEVEL_2 = c21.g().getInt("deviceLevel", -1) != 2 ? false : z;
        String value = ConfigUtil.getValue("tb_message_bubble_stable_probe", "message_bubble_analysis_interval_timeV2", "2000");
        if (TextUtils.isDigitsOnly(value)) {
            this.delayMonitorTime = Integer.parseInt(value);
        }
    }

    public static /* synthetic */ void access$000(ViewCenterServiceImpl viewCenterServiceImpl, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e876363", new Object[]{viewCenterServiceImpl, new Integer(i)});
        } else {
            viewCenterServiceImpl.onAnalysisView(i);
        }
    }

    public static /* synthetic */ long access$100(ViewCenterServiceImpl viewCenterServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226aff55", new Object[]{viewCenterServiceImpl})).longValue();
        }
        return viewCenterServiceImpl.delayMonitorTime;
    }

    public static /* synthetic */ Map access$200(ViewCenterServiceImpl viewCenterServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("920f69d7", new Object[]{viewCenterServiceImpl});
        }
        return viewCenterServiceImpl.cacheUIDataMap;
    }

    public static /* synthetic */ Set access$300(ViewCenterServiceImpl viewCenterServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("728b8992", new Object[]{viewCenterServiceImpl});
        }
        return viewCenterServiceImpl.viewDetected;
    }

    public static /* synthetic */ Map access$400(ViewCenterServiceImpl viewCenterServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("530215d9", new Object[]{viewCenterServiceImpl});
        }
        return viewCenterServiceImpl.id2widgetInstance;
    }

    public static /* synthetic */ ViewCenterEnv access$500(ViewCenterServiceImpl viewCenterServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewCenterEnv) ipChange.ipc$dispatch("e8ee6e82", new Object[]{viewCenterServiceImpl});
        }
        return viewCenterServiceImpl.env;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ IViewCenterService lambda$initEventManager$1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IViewCenterService) ipChange.ipc$dispatch("a4b9ae5e", new Object[]{this});
        }
        return this;
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
            Coordinator.doBackGroundTask(new BaseRunnable() { // from class: com.taobao.message.chatv2.viewcenter.ViewCenterServiceImpl.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/chatv2/viewcenter/ViewCenterServiceImpl$4");
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:48:0x015e  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0167  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x016e  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x01e0  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x0216  */
                /* JADX WARN: Type inference failed for: r3v10 */
                @Override // com.taobao.message.kit.threadpool.BaseRunnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void execute() {
                    /*
                        Method dump skipped, instructions count: 542
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.chatv2.viewcenter.ViewCenterServiceImpl.AnonymousClass4.execute():void");
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
        if (this.mPlugins != null) {
            HashMap hashMap = new HashMap();
            if (layoutInfo != null) {
                hashMap.put(SyncConstant.KEY_LAYOUTID, layoutInfo.layoutId);
            }
            this.mPlugins.onCreateSubViewStart(layoutInfo, hashMap);
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
            if (!this.IS_DEVICE_LEVEL_2) {
                final Runnable runnable = new Runnable() { // from class: com.taobao.message.chatv2.viewcenter.ViewCenterServiceImpl.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ViewCenterServiceImpl.access$000(ViewCenterServiceImpl.this, createWidget.hashCode());
                        }
                    }
                };
                createWidget.getView().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.taobao.message.chatv2.viewcenter.ViewCenterServiceImpl.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3d337638", new Object[]{this, view});
                        } else {
                            UIHandler.postDelayed(runnable, ViewCenterServiceImpl.access$100(ViewCenterServiceImpl.this));
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
        }
        if (createWidget != null) {
            this.id2widgetInstance.put(Integer.valueOf(createWidget.hashCode()), createWidget);
        }
        if (this.mPlugins != null) {
            HashMap hashMap2 = new HashMap();
            if (layoutInfo != null) {
                hashMap2.put(SyncConstant.KEY_LAYOUTID, layoutInfo.layoutId);
            }
            this.mPlugins.onCreateSubViewEnd(layoutInfo, hashMap2);
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
        for (Map.Entry<Integer, WidgetInterface> entry : this.id2widgetInstance.entrySet()) {
            entry.getValue().dispose();
        }
        this.id2widgetInstance.clear();
        this.viewDetected.clear();
        this.cacheUIDataMap.clear();
    }

    @Override // com.taobao.message.chatv2.viewcenter.IViewCenterService
    public View getView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c9ef8723", new Object[]{this, new Integer(i)});
        }
        WidgetInterface widgetInterface = this.id2widgetInstance.get(Integer.valueOf(i));
        if (widgetInterface != null) {
            return widgetInterface.getView();
        }
        return null;
    }

    public void initEventManager(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b7b771e", new Object[]{this, context});
            return;
        }
        this.context = context;
        IEventService iEventService = this.eventService;
        if (iEventService == null) {
            EventServiceImpl eventServiceImpl = new EventServiceImpl(this.props, context);
            eventServiceImpl.setViewCenterProvider(new IViewCenterProvider() { // from class: tb.odw
                @Override // com.taobao.message.chatv2.viewcenter.IViewCenterProvider
                public final IViewCenterService getViewCenterService() {
                    IViewCenterService lambda$initEventManager$1;
                    lambda$initEventManager$1 = ViewCenterServiceImpl.this.lambda$initEventManager$1();
                    return lambda$initEventManager$1;
                }
            });
            this.eventService = eventServiceImpl;
            return;
        }
        ((EventServiceImpl) iEventService).reInitEventManager(context);
    }

    @Override // com.taobao.message.chatv2.viewcenter.IViewCenterService
    public void postEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3784874", new Object[]{this, event});
            return;
        }
        for (Map.Entry entry : new HashMap(this.id2widgetInstance).entrySet()) {
            ((WidgetInterface) entry.getValue()).postEvent(event);
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
            TLog.loge(TAG, "renderview widget is null " + jSONObject);
        } else {
            final String string = jSONObject.getString("VC_UNI_ID");
            widgetInterface.getView().setTag(R.id.viewcenterUniqueKey, string);
            renderView(widgetInterface, jSONObject, new ActionDispatcher() { // from class: com.taobao.message.chatv2.viewcenter.ViewCenterServiceImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.lab.comfrm.core.ActionDispatcher
                public void dispatch(final Action action) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("865d606c", new Object[]{this, action});
                    } else {
                        UIHandler.post(new Runnable() { // from class: com.taobao.message.chatv2.viewcenter.ViewCenterServiceImpl.3.1
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
                                ViewCenterServiceImpl.access$200(ViewCenterServiceImpl.this).put(string, jSONObject2);
                                if (!TextUtils.equals(string, (String) widgetInterface.getView().getTag(R.id.viewcenterUniqueKey))) {
                                    TLog.loge("viewcenter", "refresh view with uniqueKey different");
                                    return;
                                }
                                AnonymousClass3 r0 = AnonymousClass3.this;
                                ViewCenterServiceImpl.this.renderView(widgetInterface, jSONObject2);
                            }
                        });
                    }
                }
            });
        }
    }

    public void setPlugin(Plugins plugins) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96463d2c", new Object[]{this, plugins});
            return;
        }
        this.mPlugins = plugins;
        this.renderService.setPlugin(plugins);
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
            ((RenderServiceImpl) iRenderService).setViewCenterProps(this.props);
            ((RenderServiceImpl) this.renderService).setRenderContext(map);
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
            if (this.mPlugins != null) {
                HashMap hashMap = new HashMap();
                if (layoutInfo != null) {
                    hashMap.put(SyncConstant.KEY_LAYOUTID, layoutInfo.layoutId);
                }
                this.mPlugins.onBindSubViewDataStart(layoutInfo, hashMap);
            }
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
            if (jSONObject4 == null) {
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
            }
            if (this.mPlugins != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(SyncConstant.KEY_LAYOUTID, layoutInfo.layoutId);
                this.mPlugins.onBindSubViewDataEnd(layoutInfo, hashMap2);
            }
        }
    }

    @Override // com.taobao.message.chatv2.viewcenter.IViewCenterService
    public WidgetInterface createView(int i) {
        LayoutInfo layoutInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetInterface) ipChange.ipc$dispatch("94be6a9c", new Object[]{this, new Integer(i)});
        }
        if (!this.IS_DEVICE_LEVEL_2 || (!(323001 == i || 333001 == i) || !TextUtils.equals("1", OrangeConfig.getInstance().getConfig("mpm_data_switch", "msgHeaderTopLocationSimple", "1")))) {
            layoutInfo = this.templateService.getLayoutInfo(i, null);
        } else {
            layoutInfo = this.templateService.getLayoutInfo(365002, null);
        }
        if (layoutInfo != null) {
            return createView(layoutInfo);
        }
        TLog.loge(TAG, "createView is error " + i);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("templateId", (Object) Integer.valueOf(i));
        AppMonitor.Alarm.commitFail("message", "viewCenterRenderRate", jSONObject.toJSONString(), "101", "视图协议为空");
        return null;
    }

    public ViewCenterServiceImpl(ViewCenterProps viewCenterProps, ViewCenterEnv viewCenterEnv) {
        this.delayMonitorTime = 2000L;
        this.props = viewCenterProps;
        this.propsJSON = (JSONObject) JSON.toJSON(viewCenterProps);
        this.env = viewCenterEnv;
        this.envJSON = (JSONObject) JSON.toJSON(viewCenterEnv);
        boolean z = true;
        if (!sRegisterMonitor) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("templateId");
            arrayList.add("templateVersion");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("time");
            AppMonitor.register("message", "viewCenterRendeTime", MeasureSet.create(arrayList2), DimensionSet.create(arrayList));
            sRegisterMonitor = true;
        }
        this.IS_DEVICE_LEVEL_2 = c21.g().getInt("deviceLevel", -1) != 2 ? false : z;
        String value = ConfigUtil.getValue("tb_message_bubble_stable_probe", "message_bubble_analysis_interval_timeV2", "2000");
        if (TextUtils.isDigitsOnly(value)) {
            this.delayMonitorTime = Integer.parseInt(value);
        }
    }
}
