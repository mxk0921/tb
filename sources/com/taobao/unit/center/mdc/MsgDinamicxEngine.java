package com.taobao.unit.center.mdc;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.recycler.loadmore.DXAbsOnLoadMoreView;
import com.taobao.message.kit.util.BizTagUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserBetween;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpCopyList;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpCurrentThemeStatus;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpCurrentThemeStyle;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpCurrentTimestamp;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpGetBottomSafeAreaHeight;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpGetStatusBarHeight;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpIconFontValue;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpLongFormatTime;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpSplitAndGetSubString;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpWidgetSupported;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXTsKVDataParser;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DataParseElderFont;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DataParseFontSize;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DataParseFontSizeList;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DataParseInteractFormatNumber;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DataParseInteractFormatTime;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DataParseRelationOp;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DataParseUrlEncode;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DataParserMpFormatTime;
import com.taobao.unit.center.mdc.dinamicx.widget.DXMPMXMsgBoxFastTextWidgetNode;
import com.taobao.unit.center.mdc.view.CustomLoadingView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cvb;
import tb.evb;
import tb.ih5;
import tb.k06;
import tb.mvb;
import tb.qub;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MsgDinamicxEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZTYPE = "alimp_message";
    public static final String DX_SUB_BIZTYPE_MESSAGE_CHAT = "message_chat";
    public static final String DX_SUB_BIZTYPE_MESSAGE_CHAT_COMPAT = "message_chat_compat";
    public static final String DX_SUB_BIZTYPE_MESSAGE_TAB = "message_tab";
    public static final String KEY_DX_SUB_BIZTYPE = "dxSubBizType";
    private static final String TAG = "MsgDinamicxEngine";
    public static final String DX_SUB_BIZTYPE_MESSAGE_CHAT_COMMON = null;
    private static final Map<Long, Class<? extends qub>> dxWidgetMap = new HashMap();
    private static final Map<Long, Class<? extends qub>> dxLowLevelWidgetMap = new HashMap();
    private static final Map<Long, Class<? extends mvb>> dxEventHandler = new HashMap();
    private static final Map<Long, Class<? extends mvb>> dxLowLevelEventHandler = new HashMap();
    private static final Map<Long, Class<? extends evb>> dxDataParserMap = new HashMap();
    private static final List<DXEngineProcessor> dxEngineProcessor = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface DXEngineProcessor {
        void process(DinamicXEngine dinamicXEngine);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class MsgContainerConfig extends ih5 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(529531107);
        }

        public static /* synthetic */ Object ipc$super(MsgContainerConfig msgContainerConfig, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/MsgDinamicxEngine$MsgContainerConfig");
        }

        @Override // tb.ih5
        public DXAbsOnLoadMoreView getOnRefreshLoadMoreView(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXAbsOnLoadMoreView) ipChange.ipc$dispatch("ce97201f", new Object[]{this, context, str});
            }
            return new MyDXAbsOnLoadMoreView(context);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class MyDXAbsOnLoadMoreView extends DXAbsOnLoadMoreView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private CustomLoadingView customLoadingView;

        static {
            t2o.a(529531108);
        }

        public MyDXAbsOnLoadMoreView(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(MyDXAbsOnLoadMoreView myDXAbsOnLoadMoreView, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/MsgDinamicxEngine$MyDXAbsOnLoadMoreView");
        }

        @Override // com.taobao.android.dinamicx.widget.recycler.loadmore.DXAbsOnLoadMoreView
        public void onLoadMoreStatusUpdate(int i, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49b6d829", new Object[]{this, new Integer(i), jSONObject});
            } else if (i == 2) {
                if (this.customLoadingView == null) {
                    CustomLoadingView customLoadingView = new CustomLoadingView(getContext());
                    this.customLoadingView = customLoadingView;
                    customLoadingView.getProgressBar().startLoadingAnimaton();
                    addView(this.customLoadingView);
                }
                setVisibility(0);
            } else {
                setVisibility(8);
            }
        }
    }

    static {
        t2o.a(529531104);
    }

    private MsgDinamicxEngine() {
    }

    public static void addProcessor(DXEngineProcessor dXEngineProcessor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33e2f08", new Object[]{dXEngineProcessor});
        } else if (dXEngineProcessor != null) {
            dxEngineProcessor.add(dXEngineProcessor);
        }
    }

    public static DinamicXEngine createNewEngine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("a05599fa", new Object[0]) : createNewEngine(null, DX_SUB_BIZTYPE_MESSAGE_CHAT_COMPAT);
    }

    public static void registerDataParseer(long j, Class<? extends evb> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47f2a73", new Object[]{new Long(j), cls});
            return;
        }
        synchronized (MsgDinamicxEngine.class) {
            dxDataParserMap.put(Long.valueOf(j), cls);
        }
    }

    public static void registerEventHandler(long j, Class<? extends mvb> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d58f313", new Object[]{new Long(j), cls});
            return;
        }
        synchronized (MsgDinamicxEngine.class) {
            dxEventHandler.put(Long.valueOf(j), cls);
        }
    }

    public static void registerLowLevelEventHandler(long j, Class<? extends mvb> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a94c3", new Object[]{new Long(j), cls});
            return;
        }
        synchronized (MsgDinamicxEngine.class) {
            dxLowLevelEventHandler.put(Long.valueOf(j), cls);
        }
    }

    public static void registerLowLevelWidget(long j, Class<? extends qub> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e64c6f7", new Object[]{new Long(j), cls});
            return;
        }
        synchronized (MsgDinamicxEngine.class) {
            dxLowLevelWidgetMap.put(Long.valueOf(j), cls);
        }
    }

    public static void registerWidget(long j, Class<? extends qub> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6bc2147", new Object[]{new Long(j), cls});
            return;
        }
        synchronized (MsgDinamicxEngine.class) {
            dxWidgetMap.put(Long.valueOf(j), cls);
        }
    }

    public static void removeProcessor(DXEngineProcessor dXEngineProcessor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("553e7005", new Object[]{dXEngineProcessor});
        } else if (dXEngineProcessor != null) {
            dxEngineProcessor.remove(dXEngineProcessor);
        }
    }

    public static void setupDXEngine(DinamicXEngine dinamicXEngine) {
        dinamicXEngine.V0(k06.a("relationOp"), new DataParseRelationOp());
        dinamicXEngine.V0(k06.a("mpSplitAndGetSubString"), new DXDataParserMpSplitAndGetSubString());
        dinamicXEngine.V0(k06.a("mpFormatTime"), new DataParserMpFormatTime());
        dinamicXEngine.V0(k06.a("mpLongFormatTime"), new DXDataParserMpLongFormatTime());
        dinamicXEngine.V0(k06.a("mpUrlEncode"), new DataParseUrlEncode());
        dinamicXEngine.V0(k06.a("mpCurrentTimestamp"), new DXDataParserMpCurrentTimestamp());
        dinamicXEngine.V0(k06.a("mpWidgetSupported"), new DXDataParserMpWidgetSupported());
        dinamicXEngine.V0(k06.a("mpInteractNumberFormat"), new DataParseInteractFormatNumber());
        dinamicXEngine.V0(k06.a("mpInteractFormatTime"), new DataParseInteractFormatTime());
        dinamicXEngine.V0(k06.a("mpElderFont"), new DataParseElderFont());
        dinamicXEngine.V0(k06.a("imAdaptiveFontSize"), new DataParseFontSize());
        dinamicXEngine.V0(k06.a("imAdaptiveFontSizeList"), new DataParseFontSizeList());
        dinamicXEngine.V0(k06.a("mpIconFontValue"), DXDataParserMpIconFontValue.INSTANCE);
        dinamicXEngine.V0(k06.a("mpGetBottomSafeAreaHeight"), new DXDataParserMpGetBottomSafeAreaHeight());
        dinamicXEngine.V0(k06.a("mpGetStatusBarHeight"), new DXDataParserMpGetStatusBarHeight());
        dinamicXEngine.V0(DXDataParserMpCopyList.DX_PARSER_MPCOPYLIST, new DXDataParserMpCopyList());
        dinamicXEngine.V0(DXDataParserBetween.DX_PARSER_BETWEEN, new DXDataParserBetween());
        dinamicXEngine.V0(DXDataParserMpCurrentThemeStatus.DX_PARSER_MPCURRENTTHEMESTATUS, new DXDataParserMpCurrentThemeStatus());
        dinamicXEngine.V0(DXDataParserMpCurrentThemeStyle.DX_PARSER_MPCURRENTTHEMESTYLE, new DXDataParserMpCurrentThemeStyle());
        dinamicXEngine.e1(DXMPMXMsgBoxFastTextWidgetNode.DXMPMXMSGBOXFASTTEXT_MPMXMSGBOXFASTTEXT, new DXMPMXMsgBoxFastTextWidgetNode.Builder());
        dinamicXEngine.V0(DXTsKVDataParser.DX_PARSER_TSKV, new DXTsKVDataParser());
        synchronized (MsgDinamicxEngine.class) {
            for (Map.Entry<Long, Class<? extends evb>> entry : dxDataParserMap.entrySet()) {
                try {
                    dinamicXEngine.V0(entry.getKey().longValue(), (evb) entry.getValue().newInstance());
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static DinamicXEngine createNewEngine(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("a00654ac", new Object[]{context}) : createNewEngine(context, DX_SUB_BIZTYPE_MESSAGE_CHAT_COMPAT);
    }

    public static DinamicXEngine createNewEngine(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("c310b162", new Object[]{context, str}) : createNewEngine(context, str, BIZTYPE);
    }

    public static DinamicXEngine createNewEngine(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("69dd8c98", new Object[]{context, str, str2}) : createNewEngine(context, str, str2, false);
    }

    public static DinamicXEngine createNewEngine(Context context, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("8ca85642", new Object[]{context, str, str2, new Boolean(z)}) : createNewEngine(context, str, str2, null, -1, z);
    }

    public static DinamicXEngine createNewEngine(Context context, String str, String str2, BizTagUtil.BizTag bizTag, int i, boolean z) {
        Activity activityFromContext;
        if (bizTag == null) {
            bizTag = BizTagUtil.getBizTag(context);
        }
        DXEngineConfig.b bVar = new DXEngineConfig.b(str2);
        if (i > 0) {
            bVar.g0(true);
            bVar.d0(i);
        }
        if (z && !DisplayUtil.isLargeScreen(ApplicationUtil.getApplication())) {
            bVar.M(new cvb() { // from class: com.taobao.unit.center.mdc.MsgDinamicxEngine.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str3, Object... objArr) {
                    str3.hashCode();
                    int hashCode = str3.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str3 + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/MsgDinamicxEngine$1");
                }

                @Override // tb.cvb
                public int ap2Px(DinamicXEngine dinamicXEngine, Context context2, float f) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Number) ipChange.ipc$dispatch("207edfae", new Object[]{this, dinamicXEngine, context2, new Float(f)})).intValue();
                    }
                    return DisplayUtil.dip2px(f);
                }

                @Override // tb.cvb
                public int px2Ap(DinamicXEngine dinamicXEngine, Context context2, float f) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Number) ipChange.ipc$dispatch("d721afdc", new Object[]{this, dinamicXEngine, context2, new Float(f)})).intValue();
                    }
                    return DisplayUtil.px2dip(context2, f);
                }
            });
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                bVar.f0(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else if (bizTag != null && !TextUtils.isEmpty(bizTag.dxSubBizType())) {
            try {
                bVar.f0(str);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        if (DisplayUtil.isLargeScreen(context)) {
            bVar.H(true, true);
        }
        if (bizTag != null) {
            bVar.X(bizTag.bizId());
            bVar.Y(bizTag.bizName());
        }
        try {
            bVar.T(true);
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        try {
            bVar.N(new MsgContainerConfig());
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        if (ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "enableDXPreRender")) {
            try {
                bVar.a0(1);
            } catch (Throwable th5) {
                th5.printStackTrace();
            }
        }
        DinamicXEngine dinamicXEngine = new DinamicXEngine(bVar.F());
        if (DisplayUtil.isLargeScreen(ApplicationUtil.getApplication()) && (activityFromContext = DisplayUtil.getActivityFromContext(context)) != null) {
            dinamicXEngine.l1(activityFromContext);
        }
        synchronized (MsgDinamicxEngine.class) {
            for (Map.Entry<Long, Class<? extends qub>> entry : dxWidgetMap.entrySet()) {
                try {
                    dinamicXEngine.e1(entry.getKey().longValue(), (qub) entry.getValue().newInstance());
                } catch (Throwable unused) {
                }
            }
            for (Map.Entry<Long, Class<? extends qub>> entry2 : dxLowLevelWidgetMap.entrySet()) {
                Class<? extends qub> cls = dxWidgetMap.get(entry2.getKey());
                if (cls == null) {
                    dinamicXEngine.e1(entry2.getKey().longValue(), (qub) entry2.getValue().newInstance());
                } else {
                    dinamicXEngine.e1(entry2.getKey().longValue(), (qub) cls.newInstance());
                }
            }
            for (Map.Entry<Long, Class<? extends mvb>> entry3 : dxEventHandler.entrySet()) {
                dinamicXEngine.W0(entry3.getKey().longValue(), (mvb) entry3.getValue().newInstance());
            }
            for (Map.Entry<Long, Class<? extends mvb>> entry4 : dxLowLevelEventHandler.entrySet()) {
                Class<? extends mvb> cls2 = dxLowLevelEventHandler.get(entry4.getKey());
                if (cls2 == null) {
                    dinamicXEngine.W0(entry4.getKey().longValue(), (mvb) entry4.getValue().newInstance());
                } else {
                    dinamicXEngine.W0(entry4.getKey().longValue(), (mvb) cls2.newInstance());
                }
            }
        }
        for (DXEngineProcessor dXEngineProcessor : dxEngineProcessor) {
            if (dXEngineProcessor != null) {
                dXEngineProcessor.process(dinamicXEngine);
            }
        }
        setupDXEngine(dinamicXEngine);
        return dinamicXEngine;
    }
}
