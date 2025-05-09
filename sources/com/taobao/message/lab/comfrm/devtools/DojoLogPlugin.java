package com.taobao.message.lab.comfrm.devtools;

import android.text.TextUtils;
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
import com.taobao.message.util.MessageNavProcessorV2;
import com.taobao.unit.center.sync.constant.SyncConstant;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import tb.ckf;
import tb.d1i;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013JK\u0010\u0017\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b!\u0010 J\u0019\u0010\"\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\"\u0010 J\u0019\u0010%\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b'\u0010&J!\u0010%\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b%\u0010,J)\u0010'\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010-J\u001f\u00100\u001a\u00020\r2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J)\u00105\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\b\u00103\u001a\u0004\u0018\u0001022\u0006\u00104\u001a\u00020\u0002H\u0016¢\u0006\u0004\b5\u00106J3\u00109\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\b\u00103\u001a\u0004\u0018\u0001022\u0006\u00104\u001a\u00020\u00022\b\u00108\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b9\u0010:J!\u0010;\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b;\u0010<J+\u0010=\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\b\u00103\u001a\u0004\u0018\u0001022\b\u00108\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b?\u0010&J\u0017\u0010@\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b@\u0010&J\u0017\u0010A\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\bA\u0010&J\u0017\u0010B\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\bB\u0010&J\u0017\u0010;\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b;\u0010&J\u0017\u0010=\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b=\u0010&J\u0017\u0010C\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\bC\u0010&J\u0017\u0010D\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\bD\u0010&J#\u0010I\u001a\u00020\r2\b\u0010F\u001a\u0004\u0018\u00010E2\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bI\u0010JJ\u0019\u0010M\u001a\u00020\r2\b\u0010L\u001a\u0004\u0018\u00010KH\u0016¢\u0006\u0004\bM\u0010NJ#\u0010P\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010\u00022\b\u0010L\u001a\u0004\u0018\u00010KH\u0016¢\u0006\u0004\bP\u0010QJ#\u0010R\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010\u00022\b\u0010L\u001a\u0004\u0018\u00010KH\u0016¢\u0006\u0004\bR\u0010QJ#\u0010S\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010\u00022\b\u0010L\u001a\u0004\u0018\u00010KH\u0016¢\u0006\u0004\bS\u0010QJ#\u0010T\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010\u00022\b\u0010L\u001a\u0004\u0018\u00010KH\u0016¢\u0006\u0004\bT\u0010QJ/\u0010P\u001a\u00020\r2\b\u0010F\u001a\u0004\u0018\u00010E2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u0016¢\u0006\u0004\bP\u0010UJ/\u0010R\u001a\u00020\r2\b\u0010F\u001a\u0004\u0018\u00010E2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u0016¢\u0006\u0004\bR\u0010UJ/\u0010S\u001a\u00020\r2\b\u0010F\u001a\u0004\u0018\u00010E2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u0016¢\u0006\u0004\bS\u0010UJ/\u0010T\u001a\u00020\r2\b\u0010F\u001a\u0004\u0018\u00010E2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u0016¢\u0006\u0004\bT\u0010UJ\u0019\u0010V\u001a\u00020\r2\b\u0010L\u001a\u0004\u0018\u00010KH\u0016¢\u0006\u0004\bV\u0010NJ1\u0010[\u001a\u00020\r2\b\u0010L\u001a\u0004\u0018\u00010K2\b\u0010X\u001a\u0004\u0018\u00010W2\f\u0010Z\u001a\b\u0012\u0002\b\u0003\u0018\u00010YH\u0016¢\u0006\u0004\b[\u0010\\J!\u0010`\u001a\u00020\r2\b\u0010]\u001a\u0004\u0018\u00010\u00022\u0006\u0010_\u001a\u00020^H\u0016¢\u0006\u0004\b`\u0010aJ!\u0010c\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010b\u001a\u00020\u0014H\u0016¢\u0006\u0004\bc\u0010dJ!\u0010e\u001a\u00020\r2\b\u0010]\u001a\u0004\u0018\u00010\u00022\u0006\u0010_\u001a\u00020^H\u0016¢\u0006\u0004\be\u0010aJ!\u0010f\u001a\u00020\r2\b\u0010]\u001a\u0004\u0018\u00010\u00022\u0006\u0010_\u001a\u00020^H\u0016¢\u0006\u0004\bf\u0010aR\u0014\u0010g\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010i\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010hR\"\u0010j\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010m\u001a\u00020l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010o\u001a\u00020l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010hR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010hR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010k¨\u0006p"}, d2 = {"Lcom/taobao/message/lab/comfrm/devtools/DojoLogPlugin;", "Lcom/taobao/message/lab/comfrm/inner2/PluginAdapter;", "", "mContainerKey", "mBizConfigCode", "", "", "extMap", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "containerKey", MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, "version", "Ltb/xhv;", "onContainerStartStart", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/taobao/message/lab/comfrm/inner2/config/ConfigInfo;", "configInfo", "onContainerStartEnd", "(Lcom/taobao/message/lab/comfrm/inner2/config/ConfigInfo;)V", "", "endStep", "", "onContainerStepStart", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;)V", "onContainerStepEnd", "(ILcom/taobao/message/lab/comfrm/inner2/config/ConfigInfo;)V", "onLoadSnapshotStart", "()V", "Lcom/taobao/message/lab/comfrm/inner2/Snapshot$SnapshotData;", "snapshotData", "onLoadSnapshotEnd", "(Lcom/taobao/message/lab/comfrm/inner2/Snapshot$SnapshotData;)V", "onRenderSnapshotStart", "onRenderSnapshotEnd", "Lcom/taobao/message/lab/comfrm/core/Action;", "action", "onSourceStart", "(Lcom/taobao/message/lab/comfrm/core/Action;)V", "onSourceEnd", "Lcom/taobao/message/lab/comfrm/inner2/config/SourceItem;", "sourceItem", "Lcom/taobao/message/lab/comfrm/inner2/Command;", "command", "(Lcom/taobao/message/lab/comfrm/inner2/config/SourceItem;Lcom/taobao/message/lab/comfrm/inner2/Command;)V", "(Lcom/taobao/message/lab/comfrm/inner2/config/SourceItem;Lcom/taobao/message/lab/comfrm/inner2/Command;Lcom/taobao/message/lab/comfrm/core/Action;)V", "", "timeoutList", "onSourceTimeout", "(Ljava/util/List;)V", "Lcom/taobao/message/lab/comfrm/inner2/config/TransformerItem;", "transformerItem", "dispatcherType", "onTransformerStart", "(Lcom/taobao/message/lab/comfrm/core/Action;Lcom/taobao/message/lab/comfrm/inner2/config/TransformerItem;Ljava/lang/String;)V", "Lcom/taobao/message/lab/comfrm/inner2/Dependecy;", "runtimeDep", "onTransformerEnd", "(Lcom/taobao/message/lab/comfrm/core/Action;Lcom/taobao/message/lab/comfrm/inner2/config/TransformerItem;Ljava/lang/String;Lcom/taobao/message/lab/comfrm/inner2/Dependecy;)V", "onJSTransformerStart", "(Lcom/taobao/message/lab/comfrm/core/Action;Lcom/taobao/message/lab/comfrm/inner2/config/TransformerItem;)V", "onJSTransformerEnd", "(Lcom/taobao/message/lab/comfrm/core/Action;Lcom/taobao/message/lab/comfrm/inner2/config/TransformerItem;Lcom/taobao/message/lab/comfrm/inner2/Dependecy;)V", "onImmediateTransStart", "onImmediateTransEnd", "onNativeTransformerStart", "onNativeTransformerEnd", "onFinalTransformerStart", "onFinalTransformerEnd", "Lcom/taobao/message/lab/comfrm/inner2/config/LayoutInfo;", d1i.KEY_LAYOUT_INFO, "Lcom/taobao/message/lab/comfrm/inner2/SharedState;", "sharedState", "onBuildViewObjectDataStart", "(Lcom/taobao/message/lab/comfrm/inner2/config/LayoutInfo;Lcom/taobao/message/lab/comfrm/inner2/SharedState;)V", "Lcom/taobao/message/lab/comfrm/core/ViewObject;", "viewObject", "onBuildViewObjectDataEnd", "(Lcom/taobao/message/lab/comfrm/core/ViewObject;)V", "name", "onCreateSubViewStart", "(Ljava/lang/String;Lcom/taobao/message/lab/comfrm/core/ViewObject;)V", "onCreateSubViewEnd", "onBindSubViewDataStart", "onBindSubViewDataEnd", "(Lcom/taobao/message/lab/comfrm/inner2/config/LayoutInfo;Ljava/util/Map;)V", "onRenderBefore", "Landroid/view/ViewGroup;", "wrapperLayout", "Lcom/taobao/message/lab/comfrm/render/WidgetInstance;", "widgetInstance", "onRenderAfter", "(Lcom/taobao/message/lab/comfrm/core/ViewObject;Landroid/view/ViewGroup;Lcom/taobao/message/lab/comfrm/render/WidgetInstance;)V", "pageName", "", "time", "onPageStart", "(Ljava/lang/String;J)V", "count", "onGlobalLayout", "(Ljava/lang/String;I)V", "onPageVisible", "onPageInteractive", "tag", "Ljava/lang/String;", "mPageName", "pageRenderMap", "Ljava/util/Map;", "", "hasRenderSnapshot", "Z", "isPageVisible", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DojoLogPlugin extends PluginAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, Object> extMap;
    private boolean hasRenderSnapshot;
    private boolean isPageVisible;
    private final String mBizConfigCode;
    private final String mContainerKey;
    private final String mPageName;
    private final Map<String, String> pageRenderMap;
    private final String tag = "dojoLogPlugin";

    static {
        t2o.a(537919554);
    }

    public DojoLogPlugin(String str, String str2, Map<String, ? extends Object> map) {
        ckf.g(map, "extMap");
        this.mContainerKey = str;
        this.mBizConfigCode = str2;
        this.extMap = map;
        Object obj = map.get("pageName");
        this.mPageName = obj != null ? obj.toString() : null;
        this.pageRenderMap = new ConcurrentHashMap();
    }

    public static /* synthetic */ Object ipc$super(DojoLogPlugin dojoLogPlugin, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1990682282:
                super.onCreateSubViewStart((String) objArr[0], (ViewObject) objArr[1]);
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
            case -1708713547:
                super.onJSTransformerStart((Action) objArr[0]);
                return null;
            case -1371197619:
                super.onTransformerStart((Action) objArr[0], (TransformerItem) objArr[1], (String) objArr[2]);
                return null;
            case -1219614490:
                super.onGlobalLayout((String) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -1178849188:
                super.onJSTransformerEnd((Action) objArr[0]);
                return null;
            case -1108471043:
                super.onCreateSubViewEnd((String) objArr[0], (ViewObject) objArr[1]);
                return null;
            case -1006013493:
                super.onSourceEnd((SourceItem) objArr[0], (Command) objArr[1], (Action) objArr[2]);
                return null;
            case -828483449:
                super.onNativeTransformerStart((Action) objArr[0]);
                return null;
            case -483024250:
                super.onJSTransformerEnd((Action) objArr[0], (TransformerItem) objArr[1], (Dependecy) objArr[2]);
                return null;
            case -407638938:
                super.onFinalTransformerStart((Action) objArr[0]);
                return null;
            case -134238421:
                super.onRenderSnapshotEnd((Snapshot.SnapshotData) objArr[0]);
                return null;
            case -101811001:
                super.onContainerStartStart((String) objArr[0], (String) objArr[1], (String) objArr[2]);
                return null;
            case -71414542:
                super.onRenderSnapshotStart((Snapshot.SnapshotData) objArr[0]);
                return null;
            case -8210721:
                super.onPageInteractive((String) objArr[0], ((Number) objArr[1]).longValue());
                return null;
            case 27073100:
                super.onJSTransformerStart((Action) objArr[0], (TransformerItem) objArr[1]);
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
            case 310233602:
                super.onContainerStepEnd(((Number) objArr[0]).intValue(), (ConfigInfo) objArr[1]);
                return null;
            case 439942062:
                super.onNativeTransformerEnd((Action) objArr[0]);
                return null;
            case 739701755:
                super.onContainerStepStart((String) objArr[0], (String) objArr[1], (String) objArr[2], ((Number) objArr[3]).intValue(), (Map) objArr[4]);
                return null;
            case 806233887:
                super.onSourceTimeout((List) objArr[0]);
                return null;
            case 857791055:
                super.onPageVisible((String) objArr[0], ((Number) objArr[1]).longValue());
                return null;
            case 883179327:
                super.onBindSubViewDataStart((String) objArr[0], (ViewObject) objArr[1]);
                return null;
            case 958399305:
                super.onSourceStart((SourceItem) objArr[0], (Command) objArr[1]);
                return null;
            case 964578075:
                super.onBuildViewObjectDataStart((LayoutInfo) objArr[0], (SharedState) objArr[1]);
                return null;
            case 1046762427:
                super.onCreateSubViewStart((LayoutInfo) objArr[0], (Map) objArr[1]);
                return null;
            case 1113031332:
                super.onRenderBefore((ViewObject) objArr[0]);
                return null;
            case 1131131938:
                super.onCreateSubViewEnd((LayoutInfo) objArr[0], (Map) objArr[1]);
                return null;
            case 1257301408:
                super.onLoadSnapshotStart();
                return null;
            case 1392097237:
                super.onContainerStartEnd((ConfigInfo) objArr[0]);
                return null;
            case 1468452222:
                super.onSourceStart((Action) objArr[0]);
                return null;
            case 1498777393:
                super.onRenderAfter((ViewObject) objArr[0], (ViewGroup) objArr[1], (WidgetInstance) objArr[2]);
                return null;
            case 1547858394:
                super.onImmediateTransStart((Action) objArr[0]);
                return null;
            case 1604397242:
                super.onBuildViewObjectDataEnd((ViewObject) objArr[0]);
                return null;
            case 1750112007:
                super.onTransformerEnd((Action) objArr[0], (TransformerItem) objArr[1], (String) objArr[2], (Dependecy) objArr[3]);
                return null;
            case 1932541323:
                super.onBindSubViewDataEnd((LayoutInfo) objArr[0], (Map) objArr[1]);
                return null;
            case 1935403999:
                super.onPageStart((String) objArr[0], ((Number) objArr[1]).longValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/devtools/DojoLogPlugin");
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBindSubViewDataEnd(String str, ViewObject viewObject) {
        LayoutInfo layoutInfo;
        RenderTemplate renderTemplate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988c1f26", new Object[]{this, str, viewObject});
            return;
        }
        super.onBindSubViewDataEnd(str, viewObject);
        String str2 = this.tag;
        StringBuilder sb = new StringBuilder("onBindSubViewDataEnd|");
        sb.append(str);
        sb.append('|');
        sb.append((viewObject == null || (layoutInfo = viewObject.info) == null || (renderTemplate = layoutInfo.renderTemplate) == null) ? null : renderTemplate.name);
        Logger.e(str2, sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBindSubViewDataStart(String str, ViewObject viewObject) {
        LayoutInfo layoutInfo;
        RenderTemplate renderTemplate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34a43f3f", new Object[]{this, str, viewObject});
            return;
        }
        super.onBindSubViewDataStart(str, viewObject);
        String str2 = this.tag;
        StringBuilder sb = new StringBuilder("onBindSubViewDataStart|");
        sb.append(str);
        sb.append('|');
        sb.append((viewObject == null || (layoutInfo = viewObject.info) == null || (renderTemplate = layoutInfo.renderTemplate) == null) ? null : renderTemplate.name);
        Logger.e(str2, sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBuildViewObjectDataEnd(ViewObject viewObject) {
        LayoutInfo layoutInfo;
        RenderTemplate renderTemplate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa128ba", new Object[]{this, viewObject});
            return;
        }
        super.onBuildViewObjectDataEnd(viewObject);
        String str = this.tag;
        StringBuilder sb = new StringBuilder("onBuildViewObjectEnd|");
        sb.append((viewObject == null || (layoutInfo = viewObject.info) == null || (renderTemplate = layoutInfo.renderTemplate) == null) ? null : renderTemplate.name);
        Logger.e(str, sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBuildViewObjectDataStart(LayoutInfo layoutInfo, SharedState sharedState) {
        RenderTemplate renderTemplate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("397e4b1b", new Object[]{this, layoutInfo, sharedState});
            return;
        }
        super.onBuildViewObjectDataStart(layoutInfo, sharedState);
        String str = this.tag;
        StringBuilder sb = new StringBuilder("onBuildViewObjectStart|");
        sb.append((layoutInfo == null || (renderTemplate = layoutInfo.renderTemplate) == null) ? null : renderTemplate.name);
        Logger.e(str, sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStartEnd(ConfigInfo configInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f9b7d5", new Object[]{this, configInfo});
            return;
        }
        super.onContainerStartEnd(configInfo);
        Logger.e(this.tag, "onContainerStartEnd ");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStartStart(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ee7cc7", new Object[]{this, str, str2, str3});
            return;
        }
        super.onContainerStartStart(str, str2, str3);
        String str4 = this.tag;
        Logger.e(str4, "onContainerStartStart " + str + '|' + str2 + '|' + str3);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStepEnd(int i, ConfigInfo configInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127dca02", new Object[]{this, new Integer(i), configInfo});
            return;
        }
        super.onContainerStepEnd(i, configInfo);
        Logger.e(this.tag, "onContainerStepEnd ");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStepStart(String str, String str2, String str3, int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c16f3fb", new Object[]{this, str, str2, str3, new Integer(i), map});
            return;
        }
        super.onContainerStepStart(str, str2, str3, i, map);
        Logger.e(this.tag, "onContainerStepStart ");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onCreateSubViewEnd(String str, ViewObject viewObject) {
        LayoutInfo layoutInfo;
        RenderTemplate renderTemplate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdee12fd", new Object[]{this, str, viewObject});
            return;
        }
        super.onCreateSubViewEnd(str, viewObject);
        String str2 = this.tag;
        StringBuilder sb = new StringBuilder("onCreateSubViewEnd|");
        sb.append(str);
        sb.append('|');
        sb.append((viewObject == null || (layoutInfo = viewObject.info) == null || (renderTemplate = layoutInfo.renderTemplate) == null) ? null : renderTemplate.name);
        Logger.e(str2, sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onCreateSubViewStart(String str, ViewObject viewObject) {
        LayoutInfo layoutInfo;
        RenderTemplate renderTemplate;
        LayoutInfo layoutInfo2;
        RenderTemplate renderTemplate2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89589956", new Object[]{this, str, viewObject});
            return;
        }
        super.onCreateSubViewStart(str, viewObject);
        String str2 = this.tag;
        StringBuilder sb = new StringBuilder("onCreateSubViewStart|");
        sb.append(str);
        sb.append('|');
        Map<String, Object> map = null;
        sb.append((viewObject == null || (layoutInfo2 = viewObject.info) == null || (renderTemplate2 = layoutInfo2.renderTemplate) == null) ? null : renderTemplate2.name);
        sb.append((char) 65372);
        if (!(viewObject == null || (layoutInfo = viewObject.info) == null || (renderTemplate = layoutInfo.renderTemplate) == null)) {
            map = renderTemplate.renderData;
        }
        sb.append(map);
        Logger.e(str2, sb.toString());
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
        String str = this.tag;
        Logger.e(str, "onFinalTransformerEnd|" + action.getName());
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
        String str = this.tag;
        Logger.e(str, "onFinalTransformerStart|" + action.getName());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onGlobalLayout(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74e28e6", new Object[]{this, str, new Integer(i)});
            return;
        }
        super.onGlobalLayout(str, i);
        String str2 = this.tag;
        Logger.e(str2, "onGlobalLayout|" + i);
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
        String str = this.tag;
        Logger.e(str, "onImmediateTransEnd|" + action.getName());
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
        String str = this.tag;
        Logger.e(str, "onImmediateTransStart|" + action.getName());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onJSTransformerEnd(Action action, TransformerItem transformerItem, Dependecy dependecy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e335a286", new Object[]{this, action, transformerItem, dependecy});
            return;
        }
        ckf.g(action, "action");
        super.onJSTransformerEnd(action, transformerItem, dependecy);
        String str = this.tag;
        StringBuilder sb = new StringBuilder("onJSTransformerEnd|");
        sb.append(transformerItem != null ? transformerItem.name : null);
        sb.append('|');
        sb.append(action.getName());
        Logger.e(str, sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onJSTransformerStart(Action action, TransformerItem transformerItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d1a4c", new Object[]{this, action, transformerItem});
            return;
        }
        ckf.g(action, "action");
        super.onJSTransformerStart(action, transformerItem);
        String str = this.tag;
        StringBuilder sb = new StringBuilder("onJSTransformerStar|");
        sb.append(transformerItem != null ? transformerItem.name : null);
        sb.append('|');
        sb.append(action.getName());
        Logger.e(str, sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onLoadSnapshotEnd(Snapshot.SnapshotData snapshotData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ffe1b", new Object[]{this, snapshotData});
            return;
        }
        super.onLoadSnapshotEnd(snapshotData);
        String str = this.tag;
        Logger.e(str, "readSnapshotEnd " + this.mContainerKey);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onLoadSnapshotStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af0e5a0", new Object[]{this});
            return;
        }
        super.onLoadSnapshotStart();
        String str = this.tag;
        Logger.e(str, "readSnapshotStart " + this.mContainerKey);
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
        String str = this.tag;
        Logger.e(str, "onNativeTransformerEnd|" + action.getName());
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
        String str = this.tag;
        Logger.e(str, "onNativeTransformerStart|" + action.getName());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onPageInteractive(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff82b6df", new Object[]{this, str, new Long(j)});
            return;
        }
        super.onPageInteractive(str, j);
        String str2 = this.tag;
        Logger.e(str2, "onPageInteractive|" + str + '|' + j);
        this.pageRenderMap.put(ckf.p(str, "onPageInteractive"), String.valueOf(j));
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onPageStart(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("735bebdf", new Object[]{this, str, new Long(j)});
            return;
        }
        super.onPageStart(str, j);
        String str2 = this.tag;
        Logger.e(str2, "onPageStart|" + str + '|' + j);
        this.pageRenderMap.put(ckf.p(str, "onPageStart"), String.valueOf(j));
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderAfter(ViewObject viewObject, ViewGroup viewGroup, WidgetInstance<?> widgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59558731", new Object[]{this, viewObject, viewGroup, widgetInstance});
            return;
        }
        super.onRenderAfter(viewObject, viewGroup, widgetInstance);
        String str = this.tag;
        StringBuilder sb = new StringBuilder("onRenderAfter|");
        sb.append(viewObject != null ? Boolean.valueOf(viewObject.isSnapshot) : null);
        Logger.e(str, sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderBefore(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425782a4", new Object[]{this, viewObject});
            return;
        }
        super.onRenderBefore(viewObject);
        String str = this.tag;
        StringBuilder sb = new StringBuilder("onRenderBefore|");
        sb.append(viewObject != null ? Boolean.valueOf(viewObject.isSnapshot) : null);
        Logger.e(str, sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderSnapshotEnd(Snapshot.SnapshotData snapshotData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ffaf2b", new Object[]{this, snapshotData});
            return;
        }
        super.onRenderSnapshotEnd(snapshotData);
        String str = this.tag;
        Logger.e(str, "onRenderSnapshotEnd" + this.mContainerKey);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceEnd(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd84265", new Object[]{this, action});
            return;
        }
        super.onSourceEnd(action);
        String str = this.tag;
        StringBuilder sb = new StringBuilder("onSourceAllEnd|");
        sb.append(action != null ? action.getName() : null);
        Logger.e(str, sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceStart(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5786cd7e", new Object[]{this, action});
            return;
        }
        super.onSourceStart(action);
        if (this.hasRenderSnapshot) {
            Logger.e(this.tag, "首屏渲染调度完成,开始调度Source");
        }
        String str = this.tag;
        StringBuilder sb = new StringBuilder("onSourceStart|");
        sb.append(action != null ? action.getName() : null);
        Logger.e(str, sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceTimeout(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300e271f", new Object[]{this, list});
            return;
        }
        super.onSourceTimeout(list);
        String str = this.tag;
        Logger.e(str, "onSourceTimeout" + list);
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
        super.onTransformerEnd(action, transformerItem, str, dependecy);
        String str2 = this.tag;
        StringBuilder sb = new StringBuilder("onTransformerEnd|");
        sb.append(transformerItem != null ? transformerItem.type : null);
        sb.append('|');
        sb.append(action.getName());
        sb.append('|');
        sb.append(str);
        Logger.e(str2, sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onTransformerStart(Action action, TransformerItem transformerItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae452f4d", new Object[]{this, action, transformerItem, str});
            return;
        }
        ckf.g(action, "action");
        ckf.g(str, "dispatcherType");
        super.onTransformerStart(action, transformerItem, str);
        String str2 = this.tag;
        StringBuilder sb = new StringBuilder("onTransformerStart|");
        sb.append(transformerItem != null ? transformerItem.type : null);
        sb.append('|');
        sb.append(action.getName());
        sb.append('|');
        sb.append(str);
        Logger.e(str2, sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onPageVisible(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3320da4f", new Object[]{this, str, new Long(j)});
            return;
        }
        super.onPageVisible(str, j);
        if (!this.isPageVisible && TextUtils.equals(str, this.mPageName)) {
            this.isPageVisible = true;
            String str2 = this.pageRenderMap.get(ckf.p(str, "onPageStart"));
            if (str2 != null) {
                String str3 = this.tag;
                Logger.e(str3, "onPageVisible|" + str + "|$ useTime " + (j - Long.parseLong(str2)));
            }
            this.pageRenderMap.put(ckf.p(str, "onPageVisible"), String.valueOf(j));
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderSnapshotStart(Snapshot.SnapshotData snapshotData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbbe4cf2", new Object[]{this, snapshotData});
            return;
        }
        super.onRenderSnapshotStart(snapshotData);
        this.hasRenderSnapshot = true;
        String str = this.tag;
        Logger.e(str, "onRenderSnapshotStart" + this.mContainerKey);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBindSubViewDataEnd(LayoutInfo layoutInfo, Map<String, String> map) {
        RenderTemplate renderTemplate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73303d8b", new Object[]{this, layoutInfo, map});
            return;
        }
        super.onBindSubViewDataEnd(layoutInfo, map);
        String str = this.tag;
        StringBuilder sb = new StringBuilder("onBindSubViewDataEnd2|");
        String str2 = null;
        sb.append((layoutInfo == null || (renderTemplate = layoutInfo.renderTemplate) == null) ? null : renderTemplate.name);
        sb.append('|');
        if (map != null) {
            str2 = map.get(SyncConstant.KEY_LAYOUTID);
        }
        sb.append(str2);
        Logger.e(str, sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBindSubViewDataStart(LayoutInfo layoutInfo, Map<String, String> map) {
        RenderTemplate renderTemplate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2c26e4", new Object[]{this, layoutInfo, map});
            return;
        }
        super.onBindSubViewDataStart(layoutInfo, map);
        String str = this.tag;
        StringBuilder sb = new StringBuilder("onBindSubViewDataStart2|");
        String str2 = null;
        sb.append((layoutInfo == null || (renderTemplate = layoutInfo.renderTemplate) == null) ? null : renderTemplate.name);
        sb.append('|');
        if (map != null) {
            str2 = map.get(SyncConstant.KEY_LAYOUTID);
        }
        sb.append(str2);
        Logger.e(str, sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onCreateSubViewEnd(LayoutInfo layoutInfo, Map<String, String> map) {
        RenderTemplate renderTemplate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436bb422", new Object[]{this, layoutInfo, map});
            return;
        }
        super.onCreateSubViewEnd(layoutInfo, map);
        String str = this.tag;
        StringBuilder sb = new StringBuilder("onCreateSubViewEnd2|");
        String str2 = null;
        sb.append((layoutInfo == null || (renderTemplate = layoutInfo.renderTemplate) == null) ? null : renderTemplate.name);
        sb.append('|');
        if (map != null) {
            str2 = map.get(SyncConstant.KEY_LAYOUTID);
        }
        sb.append(str2);
        Logger.e(str, sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onCreateSubViewStart(LayoutInfo layoutInfo, Map<String, String> map) {
        RenderTemplate renderTemplate;
        RenderTemplate renderTemplate2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6453bb", new Object[]{this, layoutInfo, map});
            return;
        }
        super.onCreateSubViewStart(layoutInfo, map);
        String str = this.tag;
        StringBuilder sb = new StringBuilder("onCreateSubViewStart2|");
        String str2 = null;
        sb.append((layoutInfo == null || (renderTemplate2 = layoutInfo.renderTemplate) == null) ? null : renderTemplate2.name);
        sb.append('|');
        sb.append((layoutInfo == null || (renderTemplate = layoutInfo.renderTemplate) == null) ? null : renderTemplate.renderData);
        sb.append('|');
        if (map != null) {
            str2 = map.get(SyncConstant.KEY_LAYOUTID);
        }
        sb.append(str2);
        Logger.e(str, sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onJSTransformerEnd(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9bc305c", new Object[]{this, action});
            return;
        }
        ckf.g(action, "action");
        super.onJSTransformerEnd(action);
        String str = this.tag;
        Logger.e(str, "onJSTransformerEnd|" + action.getName());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onJSTransformerStart(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a2719b5", new Object[]{this, action});
            return;
        }
        ckf.g(action, "action");
        super.onJSTransformerStart(action);
        String str = this.tag;
        Logger.e(str, "onJSTransformerStart|" + action.getName());
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
        super.onSourceEnd(sourceItem, command, action);
        String str = this.tag;
        StringBuilder sb = new StringBuilder("onSourceEnd|");
        sb.append(sourceItem != null ? sourceItem.type : null);
        sb.append('|');
        sb.append(command.getName());
        Logger.e(str, sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceStart(SourceItem sourceItem, Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39200349", new Object[]{this, sourceItem, command});
            return;
        }
        ckf.g(command, "command");
        super.onSourceStart(sourceItem, command);
        String str = this.tag;
        StringBuilder sb = new StringBuilder("onSourceStart|");
        sb.append(sourceItem != null ? sourceItem.type : null);
        sb.append('|');
        sb.append(command.getName());
        Logger.e(str, sb.toString());
    }
}
