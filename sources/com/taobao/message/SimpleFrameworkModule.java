package com.taobao.message;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.message.chat.component.chatinput.node.DXGrowingTextInputViewWidgetNode;
import com.taobao.message.chat.input.uieventhandler.KeyboardUIEventHandler;
import com.taobao.message.kit.core.DelayInitContainer;
import com.taobao.message.kit.threadpool.BaseRunnable;
import com.taobao.message.kit.threadpool.Coordinator;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.inner2.ClassPool;
import com.taobao.message.lab.comfrm.support.list.ListItemInstance;
import com.taobao.unit.center.mdc.MsgDinamicxEngine;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpKeyboardHeightAp;
import com.taobao.unit.center.mdc.dinamicx.widget.DXBooleanTriggerWidgetNode;
import com.taobao.unit.center.mdc.dinamicx.widget.DXMPCacheImageViewWidgetNode;
import com.taobao.unit.center.mdc.dinamicx.widget.DXMPIndicatorViewWidgetNode;
import com.taobao.unit.center.mdc.dinamicx.widget.DXMPMXMsgBoxRichTextWidgetNode;
import com.taobao.unit.center.mdc.dinamicx.widget.DXMPRecyclerCompanionWidgetNode;
import com.taobao.unit.center.mdc.dinamicx.widget.DXMPTextViewWidgetNode;
import com.taobao.unit.center.mdc.dinamicx.widget.DXMsgDXWrapperWidgetNodeV2;
import com.taobao.unit.center.mdc.dinamicx.widget.DXMsgSelectableLinearLayoutWidgetNode;
import com.taobao.unit.center.mdc.dinamicx.widget.DXMsgTextViewWidgetNode;
import com.taobao.unit.center.mdc.dinamicx.widget.DXObjectTriggerWidgetNode;
import com.taobao.unit.center.mdc.dinamicx.widget.DXPageLifecyclerWidgetNode;
import com.taobao.unit.center.sync.LayoutSyncManager;
import com.taobao.unit.center.sync.TemplateSyncManager;
import com.taobao.unit.center.templatesync.ILayoutSyncService;
import com.taobao.unit.center.templatesync.ITemplateSyncService;
import tb.k06;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SimpleFrameworkModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPT_DX_MSG_WRAPPER_ONLY_AI = "onlyAI";
    public static final String OPT_DX_MSG_WRAPPER_OPEN = "1";
    public static final String SIMPLE_CLASS_NAMESPACE = "mp_simple";
    public static String optDXMsgDXWrapper = ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "optDXMsgDXWrapper", "1");
    public static boolean useNewActionDispatcher = "1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "useDXNewActionDispatcher", "1"));
    public static boolean noActionPostEvent = "1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "noActionPostEvent", "1"));

    public static void injectDependencies(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("496846b", new Object[]{str});
            return;
        }
        DelayInitContainer.getInstance().register(ITemplateSyncService.class, TemplateSyncManager.Companion.getInstance());
        DelayInitContainer.getInstance().register(ILayoutSyncService.class, LayoutSyncManager.Companion.getInstance());
        Coordinator.doBackGroundTask(new BaseRunnable() { // from class: com.taobao.message.SimpleFrameworkModule.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str2, Object... objArr) {
                str2.hashCode();
                int hashCode = str2.hashCode();
                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/message/SimpleFrameworkModule$1");
            }

            @Override // com.taobao.message.kit.threadpool.BaseRunnable
            public void execute() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e48bb97c", new Object[]{this});
                    return;
                }
                TemplateSyncManager.Companion.getInstance().init();
                LayoutSyncManager.Companion.getInstance().init();
            }
        });
        MsgDinamicxEngine.registerWidget(DXMPRecyclerCompanionWidgetNode.DXMPRECYCLERCOMPANION_MPRECYCLERCOMPANION, DXMPRecyclerCompanionWidgetNode.Builder.class);
        MsgDinamicxEngine.registerWidget(DXPageLifecyclerWidgetNode.DXPAGELIFECYCLER_PAGELIFECYCLER, DXPageLifecyclerWidgetNode.Builder.class);
        MsgDinamicxEngine.registerWidget(DXMPCacheImageViewWidgetNode.DXMPCACHEIMAGEVIEW_MPCACHEIMAGEVIEW, DXMPCacheImageViewWidgetNode.Builder.class);
        MsgDinamicxEngine.registerWidget(DXMPIndicatorViewWidgetNode.DXMPINDICATORVIEW_MPINDICATORVIEW, DXMPIndicatorViewWidgetNode.Builder.class);
        MsgDinamicxEngine.registerWidget(DXGrowingTextInputViewWidgetNode.DXGROWINGTEXTINPUTVIEW_GROWINGTEXTINPUTVIEW, DXGrowingTextInputViewWidgetNode.Builder.class);
        MsgDinamicxEngine.registerEventHandler(-5014283512456773345L, KeyboardUIEventHandler.class);
        MsgDinamicxEngine.registerLowLevelWidget(5097129097335320146L, DXWidgetNode.c.class);
        MsgDinamicxEngine.registerLowLevelWidget(-2255684619141437144L, DXWidgetNode.c.class);
        MsgDinamicxEngine.registerLowLevelWidget(6504647686291508113L, DXWidgetNode.c.class);
        MsgDinamicxEngine.registerLowLevelWidget(-4310797695740294405L, DXWidgetNode.c.class);
        MsgDinamicxEngine.registerLowLevelWidget(7837920599054599646L, DXWidgetNode.c.class);
        MsgDinamicxEngine.registerLowLevelWidget(-9221910176183608783L, DXWidgetNode.c.class);
        ClassPool.instance().put("widget.message.common.operationArea", ListItemInstance.class, SIMPLE_CLASS_NAMESPACE);
        MsgDinamicxEngine.addProcessor(new MsgDinamicxEngine.DXEngineProcessor() { // from class: com.taobao.message.SimpleFrameworkModule.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.unit.center.mdc.MsgDinamicxEngine.DXEngineProcessor
            public void process(DinamicXEngine dinamicXEngine) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("107827a7", new Object[]{this, dinamicXEngine});
                    return;
                }
                dinamicXEngine.V0(k06.a(DXDataParserMpKeyboardHeightAp.NAME), DXDataParserMpKeyboardHeightAp.INSTANCE);
                dinamicXEngine.e1(DXMsgTextViewWidgetNode.DXWIDGET_MsgTextView.longValue(), new DXMsgTextViewWidgetNode.Builder());
                dinamicXEngine.e1(DXMPMXMsgBoxRichTextWidgetNode.DXMPMXMSGBOXRICHTEXT_MPMXMSGBOXRICHTEXT, new DXMPMXMsgBoxRichTextWidgetNode.Builder());
                dinamicXEngine.e1(DXMsgDXWrapperWidgetNodeV2.DXMSGDXWRAPPER_MSGDXWRAPPER, new DXMsgDXWrapperWidgetNodeV2.Builder());
                dinamicXEngine.e1(DXMsgSelectableLinearLayoutWidgetNode.DXMSGSELECTABLELINEARLAYOUT_MSGSELECTABLELINEARLAYOUT, new DXMsgSelectableLinearLayoutWidgetNode.Builder());
                dinamicXEngine.e1(DXBooleanTriggerWidgetNode.DXBOOLEANTRIGGER_BOOLEANTRIGGER, new DXBooleanTriggerWidgetNode.Builder());
                dinamicXEngine.e1(DXObjectTriggerWidgetNode.DXOBJECTTRIGGER_OBJECTTRIGGER, new DXObjectTriggerWidgetNode.Builder());
                dinamicXEngine.e1(DXMPTextViewWidgetNode.DXMPTEXTVIEW_MPTEXTVIEW, new DXMPTextViewWidgetNode.Builder());
            }
        });
    }

    static {
        t2o.a(552599553);
    }
}
