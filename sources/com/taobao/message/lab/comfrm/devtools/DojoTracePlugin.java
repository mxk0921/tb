package com.taobao.message.lab.comfrm.devtools;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.Dependecy;
import com.taobao.message.lab.comfrm.inner2.PluginAdapter;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.inner2.Snapshot;
import com.taobao.message.lab.comfrm.inner2.config.ConfigInfo;
import com.taobao.message.lab.comfrm.inner2.config.LayoutInfo;
import com.taobao.message.lab.comfrm.inner2.config.SourceItem;
import com.taobao.message.lab.comfrm.inner2.config.TransformerItem;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.util.MessageNavProcessorV2;
import com.taobao.unit.center.sync.constant.SyncConstant;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import tb.ckf;
import tb.d1i;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000b\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J)\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J1\u0010#\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010\u0013J\u000f\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010\u0013J!\u0010'\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b'\u0010(J+\u0010)\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b-\u0010,J\u0019\u0010.\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b.\u0010/J1\u00104\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u00101\u001a\u0004\u0018\u0001002\f\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J-\u00108\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u00106\u001a\u0004\u0018\u00010\u00022\b\u00107\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b8\u00109J\u0019\u0010<\u001a\u00020\u00112\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010>\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b>\u0010,J\u0019\u0010?\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b?\u0010,J!\u0010>\u001a\u00020\u00112\b\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\b>\u0010DJ)\u0010?\u001a\u00020\u00112\b\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010C\u001a\u00020B2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b?\u0010EJ\u0017\u0010F\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\bF\u0010,J\u0017\u0010G\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\bG\u0010,J\u0017\u0010H\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\bH\u0010,J\u0017\u0010I\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\bI\u0010,J#\u0010L\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010K\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\bL\u0010MJ\u0019\u0010N\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\bN\u0010/J#\u0010O\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\bO\u0010PJ#\u0010Q\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\bQ\u0010PJ#\u0010R\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\bR\u0010PJ#\u0010S\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\bS\u0010PJ/\u0010O\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tH\u0016¢\u0006\u0004\bO\u0010TJ/\u0010Q\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tH\u0016¢\u0006\u0004\bQ\u0010TJ/\u0010R\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tH\u0016¢\u0006\u0004\bR\u0010TJ/\u0010S\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tH\u0016¢\u0006\u0004\bS\u0010TJ!\u0010W\u001a\u00020\u00112\b\u00106\u001a\u0004\u0018\u00010\u00022\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ!\u0010\\\u001a\u00020\u00112\b\u0010Y\u001a\u0004\u0018\u00010\u00022\u0006\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b\\\u0010]J!\u0010^\u001a\u00020\u00112\b\u0010Y\u001a\u0004\u0018\u00010\u00022\u0006\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b^\u0010]J!\u0010_\u001a\u00020\u00112\b\u0010Y\u001a\u0004\u0018\u00010\u00022\u0006\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b_\u0010]R\"\u0010a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010d\u001a\u00020c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010f¨\u0006g"}, d2 = {"Lcom/taobao/message/lab/comfrm/devtools/DojoTracePlugin;", "Lcom/taobao/message/lab/comfrm/inner2/PluginAdapter;", "", "containerKey", "<init>", "(Ljava/lang/String;)V", "taskNamePre", "Lcom/taobao/message/lab/comfrm/inner2/config/LayoutInfo;", d1i.KEY_LAYOUT_INFO, "", "extMap", "getTaskName", "(Ljava/lang/String;Lcom/taobao/message/lab/comfrm/inner2/config/LayoutInfo;Ljava/util/Map;)Ljava/lang/String;", "name", "Lcom/taobao/message/lab/comfrm/core/ViewObject;", "viewObject", "(Ljava/lang/String;Ljava/lang/String;Lcom/taobao/message/lab/comfrm/core/ViewObject;)Ljava/lang/String;", "Ltb/xhv;", "onLoadSnapshotStart", "()V", "Lcom/taobao/message/lab/comfrm/inner2/Snapshot$SnapshotData;", "snapshotData", "onLoadSnapshotEnd", "(Lcom/taobao/message/lab/comfrm/inner2/Snapshot$SnapshotData;)V", "onRenderSnapshotStart", "onRenderSnapshotEnd", "Lcom/taobao/message/lab/comfrm/core/Action;", "action", "Lcom/taobao/message/lab/comfrm/inner2/config/TransformerItem;", "transformerItem", "dispatcherType", "onTransformerStart", "(Lcom/taobao/message/lab/comfrm/core/Action;Lcom/taobao/message/lab/comfrm/inner2/config/TransformerItem;Ljava/lang/String;)V", "Lcom/taobao/message/lab/comfrm/inner2/Dependecy;", "runtimeDep", "onTransformerEnd", "(Lcom/taobao/message/lab/comfrm/core/Action;Lcom/taobao/message/lab/comfrm/inner2/config/TransformerItem;Ljava/lang/String;Lcom/taobao/message/lab/comfrm/inner2/Dependecy;)V", "onLoadJSStart", "onLoadJSEnd", "onJSTransformerStart", "(Lcom/taobao/message/lab/comfrm/core/Action;Lcom/taobao/message/lab/comfrm/inner2/config/TransformerItem;)V", "onJSTransformerEnd", "(Lcom/taobao/message/lab/comfrm/core/Action;Lcom/taobao/message/lab/comfrm/inner2/config/TransformerItem;Lcom/taobao/message/lab/comfrm/inner2/Dependecy;)V", "onNativeTransformerStart", "(Lcom/taobao/message/lab/comfrm/core/Action;)V", "onNativeTransformerEnd", "onRenderBefore", "(Lcom/taobao/message/lab/comfrm/core/ViewObject;)V", "Landroid/view/ViewGroup;", "wrapperLayout", "Lcom/taobao/message/lab/comfrm/render/WidgetInstance;", "widgetInstance", "onRenderAfter", "(Lcom/taobao/message/lab/comfrm/core/ViewObject;Landroid/view/ViewGroup;Lcom/taobao/message/lab/comfrm/render/WidgetInstance;)V", MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, "version", "onContainerStartStart", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/taobao/message/lab/comfrm/inner2/config/ConfigInfo;", "configInfo", "onContainerStartEnd", "(Lcom/taobao/message/lab/comfrm/inner2/config/ConfigInfo;)V", "onSourceStart", "onSourceEnd", "Lcom/taobao/message/lab/comfrm/inner2/config/SourceItem;", "sourceItem", "Lcom/taobao/message/lab/comfrm/inner2/Command;", "command", "(Lcom/taobao/message/lab/comfrm/inner2/config/SourceItem;Lcom/taobao/message/lab/comfrm/inner2/Command;)V", "(Lcom/taobao/message/lab/comfrm/inner2/config/SourceItem;Lcom/taobao/message/lab/comfrm/inner2/Command;Lcom/taobao/message/lab/comfrm/core/Action;)V", "onImmediateTransStart", "onImmediateTransEnd", "onFinalTransformerStart", "onFinalTransformerEnd", "Lcom/taobao/message/lab/comfrm/inner2/SharedState;", "sharedState", "onBuildViewObjectDataStart", "(Lcom/taobao/message/lab/comfrm/inner2/config/LayoutInfo;Lcom/taobao/message/lab/comfrm/inner2/SharedState;)V", "onBuildViewObjectDataEnd", "onCreateSubViewStart", "(Ljava/lang/String;Lcom/taobao/message/lab/comfrm/core/ViewObject;)V", "onCreateSubViewEnd", "onBindSubViewDataStart", "onBindSubViewDataEnd", "(Lcom/taobao/message/lab/comfrm/inner2/config/LayoutInfo;Ljava/util/Map;)V", "", "count", "onGlobalLayout", "(Ljava/lang/String;I)V", "pageName", "", "time", "onPageStart", "(Ljava/lang/String;J)V", "onPageVisible", "onPageInteractive", "", "pageRenderMap", "Ljava/util/Map;", "", "isPageVisible", "Z", "Ljava/lang/String;", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DojoTracePlugin extends PluginAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String containerKey;
    private boolean isPageVisible;
    private final Map<String, String> pageRenderMap = new ConcurrentHashMap();

    static {
        t2o.a(537919558);
    }

    public DojoTracePlugin(String str) {
        this.containerKey = str;
    }

    private final String getTaskName(String str, LayoutInfo layoutInfo, Map<String, String> map) {
        String str2;
        RenderTemplate renderTemplate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1f1013d", new Object[]{this, str, layoutInfo, map});
        }
        String str3 = null;
        String str4 = map != null ? map.get(SyncConstant.KEY_LAYOUTID) : null;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        if (!(layoutInfo == null || (renderTemplate = layoutInfo.renderTemplate) == null)) {
            str3 = renderTemplate.name;
        }
        sb.append(str3);
        if (str4 == null || (str2 = "|".concat(str4)) == null) {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ Object ipc$super(DojoTracePlugin dojoTracePlugin, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1990682282:
                super.onCreateSubViewStart((String) objArr[0], (ViewObject) objArr[1]);
                return null;
            case -1932024684:
                super.onLoadJSEnd();
                return null;
            case -1928332467:
                super.onFinalTransformerEnd((Action) objArr[0]);
                return null;
            case -1892931868:
                super.onBindSubViewDataStart((LayoutInfo) objArr[0], (Map) objArr[1]);
                return null;
            case -1735647450:
                super.onBindSubViewDataEnd((String) objArr[0], (ViewObject) objArr[1]);
                return null;
            case -1219614490:
                super.onGlobalLayout((String) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -1108471043:
                super.onCreateSubViewEnd((String) objArr[0], (ViewObject) objArr[1]);
                return null;
            case -828483449:
                super.onNativeTransformerStart((Action) objArr[0]);
                return null;
            case -407638938:
                super.onFinalTransformerStart((Action) objArr[0]);
                return null;
            case -134238421:
                super.onRenderSnapshotEnd((Snapshot.SnapshotData) objArr[0]);
                return null;
            case -71414542:
                super.onRenderSnapshotStart((Snapshot.SnapshotData) objArr[0]);
                return null;
            case -8210721:
                super.onPageInteractive((String) objArr[0], ((Number) objArr[1]).longValue());
                return null;
            case 44649921:
                super.onImmediateTransEnd((Action) objArr[0]);
                return null;
            case 58719771:
                super.onLoadSnapshotEnd((Snapshot.SnapshotData) objArr[0]);
                return null;
            case 232276581:
                super.onSourceEnd((Action) objArr[0]);
                return null;
            case 437084187:
                super.onLoadJSStart();
                return null;
            case 439942062:
                super.onNativeTransformerEnd((Action) objArr[0]);
                return null;
            case 857791055:
                super.onPageVisible((String) objArr[0], ((Number) objArr[1]).longValue());
                return null;
            case 883179327:
                super.onBindSubViewDataStart((String) objArr[0], (ViewObject) objArr[1]);
                return null;
            case 964578075:
                super.onBuildViewObjectDataStart((LayoutInfo) objArr[0], (SharedState) objArr[1]);
                return null;
            case 1046762427:
                super.onCreateSubViewStart((LayoutInfo) objArr[0], (Map) objArr[1]);
                return null;
            case 1131131938:
                super.onCreateSubViewEnd((LayoutInfo) objArr[0], (Map) objArr[1]);
                return null;
            case 1257301408:
                super.onLoadSnapshotStart();
                return null;
            case 1468452222:
                super.onSourceStart((Action) objArr[0]);
                return null;
            case 1547858394:
                super.onImmediateTransStart((Action) objArr[0]);
                return null;
            case 1604397242:
                super.onBuildViewObjectDataEnd((ViewObject) objArr[0]);
                return null;
            case 1932541323:
                super.onBindSubViewDataEnd((LayoutInfo) objArr[0], (Map) objArr[1]);
                return null;
            case 1935403999:
                super.onPageStart((String) objArr[0], ((Number) objArr[1]).longValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/devtools/DojoTracePlugin");
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBindSubViewDataEnd(String str, ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988c1f26", new Object[]{this, str, viewObject});
            return;
        }
        super.onBindSubViewDataEnd(str, viewObject);
        TraceUtil.endTrace();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBindSubViewDataStart(String str, ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34a43f3f", new Object[]{this, str, viewObject});
            return;
        }
        super.onBindSubViewDataStart(str, viewObject);
        TraceUtil.beginSection(getTaskName("onBindViewObject", str, viewObject));
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBuildViewObjectDataEnd(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa128ba", new Object[]{this, viewObject});
            return;
        }
        super.onBuildViewObjectDataEnd(viewObject);
        TraceUtil.endTrace();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBuildViewObjectDataStart(LayoutInfo layoutInfo, SharedState sharedState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("397e4b1b", new Object[]{this, layoutInfo, sharedState});
            return;
        }
        super.onBuildViewObjectDataStart(layoutInfo, sharedState);
        TraceUtil.beginSection(getTaskName("onBuildViewObjectData", layoutInfo, (Map<String, String>) null));
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStartEnd(ConfigInfo configInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f9b7d5", new Object[]{this, configInfo});
        } else {
            TraceUtil.endTrace();
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStartStart(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ee7cc7", new Object[]{this, str, str2, str3});
        } else {
            TraceUtil.beginSection("ContainerStart");
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onCreateSubViewEnd(String str, ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdee12fd", new Object[]{this, str, viewObject});
            return;
        }
        super.onCreateSubViewEnd(str, viewObject);
        TraceUtil.endTrace();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onCreateSubViewStart(String str, ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89589956", new Object[]{this, str, viewObject});
            return;
        }
        super.onCreateSubViewStart(str, viewObject);
        TraceUtil.beginSection(getTaskName("onCreateView", str, viewObject));
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onFinalTransformerEnd(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d0ffb4d", new Object[]{this, action});
            return;
        }
        ckf.g(action, "action");
        super.onFinalTransformerEnd(action);
        TraceUtil.endTrace();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onFinalTransformerStart(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7b3ec66", new Object[]{this, action});
            return;
        }
        ckf.g(action, "action");
        super.onFinalTransformerStart(action);
        TraceUtil.beginSection("onFinalTransformer");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onGlobalLayout(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74e28e6", new Object[]{this, str, new Integer(i)});
            return;
        }
        super.onGlobalLayout(str, i);
        TraceUtil.beginSection("onGlobalLayout_" + i);
        TraceUtil.endTrace();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onImmediateTransEnd(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a94dc1", new Object[]{this, action});
            return;
        }
        ckf.g(action, "action");
        super.onImmediateTransEnd(action);
        TraceUtil.endTrace();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onImmediateTransStart(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4271da", new Object[]{this, action});
            return;
        }
        ckf.g(action, "action");
        super.onImmediateTransStart(action);
        TraceUtil.beginSection("onImmediateTrans");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onJSTransformerEnd(Action action, TransformerItem transformerItem, Dependecy dependecy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e335a286", new Object[]{this, action, transformerItem, dependecy});
            return;
        }
        ckf.g(action, "action");
        TraceUtil.endTrace();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onJSTransformerStart(Action action, TransformerItem transformerItem) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d1a4c", new Object[]{this, action, transformerItem});
            return;
        }
        ckf.g(action, "action");
        if (transformerItem != null) {
            str = transformerItem.name;
        } else {
            str = null;
        }
        TraceUtil.beginSection(str);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onLoadJSEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cd7a494", new Object[]{this});
            return;
        }
        super.onLoadJSEnd();
        TraceUtil.endTrace();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onLoadJSStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a0d601b", new Object[]{this});
            return;
        }
        super.onLoadJSStart();
        TraceUtil.beginSection("loadJS");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onLoadSnapshotEnd(Snapshot.SnapshotData snapshotData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ffe1b", new Object[]{this, snapshotData});
            return;
        }
        super.onLoadSnapshotEnd(snapshotData);
        TraceUtil.endTrace();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onLoadSnapshotStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af0e5a0", new Object[]{this});
            return;
        }
        super.onLoadSnapshotStart();
        TraceUtil.beginSection("loadSnapshot|" + this.containerKey);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onNativeTransformerEnd(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a38fbae", new Object[]{this, action});
            return;
        }
        ckf.g(action, "action");
        super.onNativeTransformerEnd(action);
        Logger.e("dojoTracePlugin", "onNativeTransformerEnd");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onNativeTransformerStart(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e5887", new Object[]{this, action});
            return;
        }
        ckf.g(action, "action");
        super.onNativeTransformerStart(action);
        Logger.e("dojoTracePlugin", "onNativeTransformerStart");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onPageInteractive(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff82b6df", new Object[]{this, str, new Long(j)});
            return;
        }
        super.onPageInteractive(str, j);
        TraceUtil.beginSection("onPageInteractive|" + str);
        Logger.e("dojoTracePlugin", "onPageInteractive|" + str + '|' + j);
        TraceUtil.endTrace();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onPageStart(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("735bebdf", new Object[]{this, str, new Long(j)});
            return;
        }
        super.onPageStart(str, j);
        Logger.e("dojoTracePlugin", "onPageStart|" + str + '|' + j);
        this.pageRenderMap.put(ckf.p(str, "onPageStart"), String.valueOf(j));
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderAfter(ViewObject viewObject, ViewGroup viewGroup, WidgetInstance<?> widgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59558731", new Object[]{this, viewObject, viewGroup, widgetInstance});
            return;
        }
        TraceUtil.endTrace();
        Logger.e("dojoTracePlugin", "onRenderAfter");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderBefore(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425782a4", new Object[]{this, viewObject});
            return;
        }
        TraceUtil.beginSection("RenderVO");
        Logger.e("dojoTracePlugin", "onRenderBefore");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderSnapshotEnd(Snapshot.SnapshotData snapshotData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ffaf2b", new Object[]{this, snapshotData});
            return;
        }
        super.onRenderSnapshotEnd(snapshotData);
        TraceUtil.endTrace();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderSnapshotStart(Snapshot.SnapshotData snapshotData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbbe4cf2", new Object[]{this, snapshotData});
            return;
        }
        super.onRenderSnapshotStart(snapshotData);
        TraceUtil.beginSection("renderSnapshot");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceEnd(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd84265", new Object[]{this, action});
            return;
        }
        super.onSourceEnd(action);
        StringBuilder sb = new StringBuilder("onSourceEnd|");
        sb.append(action != null ? action.getName() : null);
        Logger.e("dojoTracePlugin", sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceStart(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5786cd7e", new Object[]{this, action});
            return;
        }
        super.onSourceStart(action);
        StringBuilder sb = new StringBuilder("onSourceStart|");
        sb.append(action != null ? action.getName() : null);
        Logger.e("dojoTracePlugin", sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onTransformerEnd(Action action, TransformerItem transformerItem, String str, Dependecy dependecy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68509707", new Object[]{this, action, transformerItem, str, dependecy});
            return;
        }
        ckf.g(action, "action");
        ckf.g(str, "dispatcherType");
        ckf.g(dependecy, "runtimeDep");
        TraceUtil.endTrace();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onTransformerStart(Action action, TransformerItem transformerItem, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae452f4d", new Object[]{this, action, transformerItem, str});
            return;
        }
        ckf.g(action, "action");
        ckf.g(str, "dispatcherType");
        if (transformerItem != null) {
            str2 = transformerItem.name;
        } else {
            str2 = null;
        }
        TraceUtil.beginSection(str2);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onPageVisible(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3320da4f", new Object[]{this, str, new Long(j)});
            return;
        }
        super.onPageVisible(str, j);
        if (!this.isPageVisible) {
            this.isPageVisible = true;
            String str2 = this.pageRenderMap.get(ckf.p(str, "onPageStart"));
            if (str2 != null) {
                Logger.e("dojoTracePlugin", "onPageVisible|" + str + "|$ useTime " + (j - Long.parseLong(str2)));
            }
            this.pageRenderMap.put(ckf.p(str, "onPageVisible"), String.valueOf(j));
        }
        TraceUtil.beginSection("onPageVisible|" + str);
        TraceUtil.endTrace();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
        if (r5 != null) goto L_0x0073;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String getTaskName(java.lang.String r5, java.lang.String r6, com.taobao.message.lab.comfrm.core.ViewObject r7) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.message.lab.comfrm.devtools.DojoTracePlugin.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001e
            java.lang.String r1 = "513adf02"
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r5 = 2
            r2[r5] = r6
            r5 = 3
            r2[r5] = r7
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L_0x001e:
            r0 = 0
            if (r7 == 0) goto L_0x0035
            com.taobao.message.lab.comfrm.inner2.config.LayoutInfo r1 = r7.info
            if (r1 == 0) goto L_0x0035
            com.taobao.message.lab.comfrm.render.RenderTemplate r1 = r1.renderTemplate
            if (r1 == 0) goto L_0x0035
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.renderData
            if (r1 == 0) goto L_0x0035
            java.lang.String r2 = "version"
            java.lang.Object r1 = r1.get(r2)
            goto L_0x0036
        L_0x0035:
            r1 = r0
        L_0x0036:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r5 = 95
            r2.append(r5)
            r2.append(r6)
            r2.append(r5)
            if (r7 == 0) goto L_0x0055
            com.taobao.message.lab.comfrm.inner2.config.LayoutInfo r5 = r7.info
            if (r5 == 0) goto L_0x0055
            com.taobao.message.lab.comfrm.render.RenderTemplate r5 = r5.renderTemplate
            if (r5 == 0) goto L_0x0055
            java.lang.String r0 = r5.name
        L_0x0055:
            r2.append(r0)
            r5 = 124(0x7c, float:1.74E-43)
            r2.append(r5)
            if (r1 == 0) goto L_0x0071
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "|"
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            if (r5 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            java.lang.String r5 = ""
        L_0x0073:
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.lab.comfrm.devtools.DojoTracePlugin.getTaskName(java.lang.String, java.lang.String, com.taobao.message.lab.comfrm.core.ViewObject):java.lang.String");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBindSubViewDataEnd(LayoutInfo layoutInfo, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73303d8b", new Object[]{this, layoutInfo, map});
            return;
        }
        super.onBindSubViewDataEnd(layoutInfo, map);
        TraceUtil.endTrace();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBindSubViewDataStart(LayoutInfo layoutInfo, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2c26e4", new Object[]{this, layoutInfo, map});
            return;
        }
        super.onBindSubViewDataStart(layoutInfo, map);
        TraceUtil.beginSection(getTaskName("onBindViewObject", layoutInfo, map));
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onCreateSubViewEnd(LayoutInfo layoutInfo, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436bb422", new Object[]{this, layoutInfo, map});
            return;
        }
        super.onCreateSubViewEnd(layoutInfo, map);
        TraceUtil.endTrace();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onCreateSubViewStart(LayoutInfo layoutInfo, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6453bb", new Object[]{this, layoutInfo, map});
            return;
        }
        super.onCreateSubViewStart(layoutInfo, map);
        TraceUtil.beginSection(getTaskName("onCreateView", layoutInfo, map));
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceEnd(SourceItem sourceItem, Command command, Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40973cb", new Object[]{this, sourceItem, command, action});
            return;
        }
        ckf.g(command, "command");
        ckf.g(action, "action");
        ckf.d(sourceItem);
        if (sourceItem.defaultLoad) {
            TraceUtil.asyncTraceEnd("AURA-DefaultLoadSource-" + sourceItem.name, sourceItem.hashCode());
            return;
        }
        TraceUtil.asyncTraceEnd("AURA-Source-" + sourceItem.name, sourceItem.hashCode());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceStart(SourceItem sourceItem, Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39200349", new Object[]{this, sourceItem, command});
            return;
        }
        ckf.g(command, "command");
        ckf.d(sourceItem);
        if (sourceItem.defaultLoad) {
            TraceUtil.asyncTraceBegin("AURA-DefaultLoadSource-" + sourceItem.name, sourceItem.hashCode());
            return;
        }
        TraceUtil.asyncTraceBegin("AURA-Source-" + sourceItem.name, sourceItem.hashCode());
    }
}
