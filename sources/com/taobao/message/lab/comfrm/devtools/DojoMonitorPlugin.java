package com.taobao.message.lab.comfrm.devtools;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.Dependecy;
import com.taobao.message.lab.comfrm.inner2.PluginAdapter;
import com.taobao.message.lab.comfrm.inner2.Plugins;
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
import com.taobao.tao.infoflow.multitab.viewprovider.IMultiTabStabilityListener;
import com.taobao.unit.center.sync.constant.SyncConstant;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import tb.ckf;
import tb.d1i;
import tb.huh;
import tb.ouh;
import tb.t2o;
import tb.zoc;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J7\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u0016\u0010\u001bJ-\u0010\u001f\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\fH\u0016¢\u0006\u0004\b%\u0010\u000eJ\u0019\u0010(\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b*\u0010)J\u0019\u0010+\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b+\u0010)J\u0019\u0010.\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\fH\u0016¢\u0006\u0004\b0\u0010\u000eJ\u000f\u00101\u001a\u00020\fH\u0016¢\u0006\u0004\b1\u0010\u000eJ\u0019\u00102\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b2\u0010/J!\u0010.\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b.\u00107J)\u00102\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00106\u001a\u0002052\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b2\u00108J\u001f\u0010;\u001a\u00020\f2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000109H\u0016¢\u0006\u0004\b;\u0010<J)\u0010@\u001a\u00020\f2\u0006\u0010-\u001a\u00020,2\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010?\u001a\u00020\u0002H\u0016¢\u0006\u0004\b@\u0010AJ3\u0010D\u001a\u00020\f2\u0006\u0010-\u001a\u00020,2\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010?\u001a\u00020\u00022\b\u0010C\u001a\u0004\u0018\u00010BH\u0016¢\u0006\u0004\bD\u0010EJ!\u0010F\u001a\u00020\f2\u0006\u0010-\u001a\u00020,2\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\bF\u0010GJ+\u0010H\u001a\u00020\f2\u0006\u0010-\u001a\u00020,2\b\u0010>\u001a\u0004\u0018\u00010=2\b\u0010C\u001a\u0004\u0018\u00010BH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\bJ\u0010/J\u0017\u0010K\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\bK\u0010/J\u0017\u0010L\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\bL\u0010/J\u0017\u0010M\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\bM\u0010/J\u0017\u0010F\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\bF\u0010/J\u0017\u0010H\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\bH\u0010/J\u0017\u0010N\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\bN\u0010/J\u0017\u0010O\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\bO\u0010/J#\u0010R\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010Q\u001a\u0004\u0018\u00010PH\u0016¢\u0006\u0004\bR\u0010SJ\u0019\u0010T\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\bT\u0010UJ#\u0010V\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\bV\u0010WJ#\u0010X\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\bX\u0010WJ#\u0010Y\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\bY\u0010WJ#\u0010Z\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\bZ\u0010WJ/\u0010V\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u0016¢\u0006\u0004\bV\u0010[J/\u0010X\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u0016¢\u0006\u0004\bX\u0010[J/\u0010Y\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u0016¢\u0006\u0004\bY\u0010[J/\u0010Z\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u0016¢\u0006\u0004\bZ\u0010[J\u0019\u0010\\\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\\\u0010UJ1\u0010a\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010^\u001a\u0004\u0018\u00010]2\f\u0010`\u001a\b\u0012\u0002\b\u0003\u0018\u00010_H\u0016¢\u0006\u0004\ba\u0010bJ!\u0010f\u001a\u00020\f2\b\u0010c\u001a\u0004\u0018\u00010\u00022\u0006\u0010e\u001a\u00020dH\u0016¢\u0006\u0004\bf\u0010gJ!\u0010j\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010i\u001a\u00020hH\u0016¢\u0006\u0004\bj\u0010kJ!\u0010l\u001a\u00020\f2\b\u0010c\u001a\u0004\u0018\u00010\u00022\u0006\u0010e\u001a\u00020dH\u0016¢\u0006\u0004\bl\u0010gJ!\u0010m\u001a\u00020\f2\b\u0010c\u001a\u0004\u0018\u00010\u00022\u0006\u0010e\u001a\u00020dH\u0016¢\u0006\u0004\bm\u0010gR\u0014\u0010n\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010p\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\bp\u0010oR\u0014\u0010q\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\bq\u0010oR\u0016\u0010r\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010oR\u0016\u0010s\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010oR\"\u0010u\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010x\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010z\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010yR\u0016\u0010|\u001a\u00020{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0016\u0010~\u001a\u00020{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010}R\u0016\u0010\u007f\u001a\u00020{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010}R\u0018\u0010\u0080\u0001\u001a\u00020{8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010}R\u0018\u0010\u0081\u0001\u001a\u00020{8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010}R\u0018\u0010\u0082\u0001\u001a\u00020{8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010}R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010oR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010oR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010vR\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0083\u0001¨\u0006\u0084\u0001"}, d2 = {"Lcom/taobao/message/lab/comfrm/devtools/DojoMonitorPlugin;", "Lcom/taobao/message/lab/comfrm/inner2/PluginAdapter;", "", "mContainerKey", "mBizConfigCode", "", "", "extMap", "Lcom/taobao/message/lab/comfrm/inner2/Plugins;", "mPlugins", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/taobao/message/lab/comfrm/inner2/Plugins;)V", "Ltb/xhv;", "removePlugins", "()V", BaseMnnRunUnit.KEY_TASK_NAME, "beginTask", "(Ljava/lang/String;)V", "endTask", "taskNamePre", "Lcom/taobao/message/lab/comfrm/inner2/config/LayoutInfo;", d1i.KEY_LAYOUT_INFO, "getTaskName", "(Ljava/lang/String;Lcom/taobao/message/lab/comfrm/inner2/config/LayoutInfo;Ljava/util/Map;)Ljava/lang/String;", "name", "Lcom/taobao/message/lab/comfrm/core/ViewObject;", "viewObject", "(Ljava/lang/String;Ljava/lang/String;Lcom/taobao/message/lab/comfrm/core/ViewObject;)Ljava/lang/String;", "containerKey", MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, "version", "onContainerStartStart", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/taobao/message/lab/comfrm/inner2/config/ConfigInfo;", "configInfo", "onContainerStartEnd", "(Lcom/taobao/message/lab/comfrm/inner2/config/ConfigInfo;)V", "onLoadSnapshotStart", "Lcom/taobao/message/lab/comfrm/inner2/Snapshot$SnapshotData;", "snapshotData", "onLoadSnapshotEnd", "(Lcom/taobao/message/lab/comfrm/inner2/Snapshot$SnapshotData;)V", "onRenderSnapshotStart", "onRenderSnapshotEnd", "Lcom/taobao/message/lab/comfrm/core/Action;", "action", "onSourceStart", "(Lcom/taobao/message/lab/comfrm/core/Action;)V", "onLoadJSStart", "onLoadJSEnd", "onSourceEnd", "Lcom/taobao/message/lab/comfrm/inner2/config/SourceItem;", "sourceItem", "Lcom/taobao/message/lab/comfrm/inner2/Command;", "command", "(Lcom/taobao/message/lab/comfrm/inner2/config/SourceItem;Lcom/taobao/message/lab/comfrm/inner2/Command;)V", "(Lcom/taobao/message/lab/comfrm/inner2/config/SourceItem;Lcom/taobao/message/lab/comfrm/inner2/Command;Lcom/taobao/message/lab/comfrm/core/Action;)V", "", "timeoutList", "onSourceTimeout", "(Ljava/util/List;)V", "Lcom/taobao/message/lab/comfrm/inner2/config/TransformerItem;", "transformerItem", "dispatcherType", "onTransformerStart", "(Lcom/taobao/message/lab/comfrm/core/Action;Lcom/taobao/message/lab/comfrm/inner2/config/TransformerItem;Ljava/lang/String;)V", "Lcom/taobao/message/lab/comfrm/inner2/Dependecy;", "runtimeDep", "onTransformerEnd", "(Lcom/taobao/message/lab/comfrm/core/Action;Lcom/taobao/message/lab/comfrm/inner2/config/TransformerItem;Ljava/lang/String;Lcom/taobao/message/lab/comfrm/inner2/Dependecy;)V", "onJSTransformerStart", "(Lcom/taobao/message/lab/comfrm/core/Action;Lcom/taobao/message/lab/comfrm/inner2/config/TransformerItem;)V", "onJSTransformerEnd", "(Lcom/taobao/message/lab/comfrm/core/Action;Lcom/taobao/message/lab/comfrm/inner2/config/TransformerItem;Lcom/taobao/message/lab/comfrm/inner2/Dependecy;)V", "onImmediateTransStart", "onImmediateTransEnd", "onNativeTransformerStart", "onNativeTransformerEnd", "onFinalTransformerStart", "onFinalTransformerEnd", "Lcom/taobao/message/lab/comfrm/inner2/SharedState;", "sharedState", "onBuildViewObjectDataStart", "(Lcom/taobao/message/lab/comfrm/inner2/config/LayoutInfo;Lcom/taobao/message/lab/comfrm/inner2/SharedState;)V", "onBuildViewObjectDataEnd", "(Lcom/taobao/message/lab/comfrm/core/ViewObject;)V", "onCreateSubViewStart", "(Ljava/lang/String;Lcom/taobao/message/lab/comfrm/core/ViewObject;)V", "onCreateSubViewEnd", "onBindSubViewDataStart", "onBindSubViewDataEnd", "(Lcom/taobao/message/lab/comfrm/inner2/config/LayoutInfo;Ljava/util/Map;)V", "onRenderBefore", "Landroid/view/ViewGroup;", "wrapperLayout", "Lcom/taobao/message/lab/comfrm/render/WidgetInstance;", "widgetInstance", "onRenderAfter", "(Lcom/taobao/message/lab/comfrm/core/ViewObject;Landroid/view/ViewGroup;Lcom/taobao/message/lab/comfrm/render/WidgetInstance;)V", "pageName", "", "time", "onPageStart", "(Ljava/lang/String;J)V", "", "count", "onGlobalLayout", "(Ljava/lang/String;I)V", "onPageVisible", "onPageInteractive", "tag", "Ljava/lang/String;", "defaultMetricName", "secondMetricName", "sceneName", "mPageName", "", "pageRenderMap", "Ljava/util/Map;", "Ltb/zoc;", "firstPageMeterService", "Ltb/zoc;", "secondRefreshMeterService", "", "hasRenderSnapshot", "Z", "isSnapshotRenderEnd", "isStopSecondMonitor", "isStartSecondMonitor", "isStopFirstPageMonitor", "isPageVisible", "Lcom/taobao/message/lab/comfrm/inner2/Plugins;", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DojoMonitorPlugin extends PluginAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, Object> extMap;
    private zoc firstPageMeterService;
    private boolean hasRenderSnapshot;
    private boolean isPageVisible;
    private boolean isSnapshotRenderEnd;
    private boolean isStartSecondMonitor;
    private boolean isStopFirstPageMonitor;
    private boolean isStopSecondMonitor;
    private final String mBizConfigCode;
    private final String mContainerKey;
    private final String mPageName;
    private final Plugins mPlugins;
    private final Map<String, String> pageRenderMap;
    private final String sceneName;
    private zoc secondRefreshMeterService;
    private final String tag = "dojoPagePlugin";
    private final String defaultMetricName = "firstScreen";
    private final String secondMetricName = "secondRefresh";

    static {
        t2o.a(537919555);
    }

    public DojoMonitorPlugin(String str, String str2, Map<String, ? extends Object> map, Plugins plugins) {
        ckf.g(map, "extMap");
        ckf.g(plugins, "mPlugins");
        this.mContainerKey = str;
        this.mBizConfigCode = str2;
        this.extMap = map;
        this.mPlugins = plugins;
        Object obj = map.get("sceneName");
        String str3 = null;
        String obj2 = obj != null ? obj.toString() : null;
        this.sceneName = obj2;
        Object obj3 = map.get("pageName");
        this.mPageName = obj3 != null ? obj3.toString() : str3;
        this.pageRenderMap = new ConcurrentHashMap();
        if (obj2 != null) {
            this.firstPageMeterService = huh.h().i(obj2, "firstScreen");
        }
    }

    public static final /* synthetic */ zoc access$getFirstPageMeterService$p(DojoMonitorPlugin dojoMonitorPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zoc) ipChange.ipc$dispatch("9cf2aab6", new Object[]{dojoMonitorPlugin});
        }
        return dojoMonitorPlugin.firstPageMeterService;
    }

    public static final /* synthetic */ String access$getSceneName$p(DojoMonitorPlugin dojoMonitorPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("340f15c3", new Object[]{dojoMonitorPlugin});
        }
        return dojoMonitorPlugin.sceneName;
    }

    public static final /* synthetic */ String access$getSecondMetricName$p(DojoMonitorPlugin dojoMonitorPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a49adfdf", new Object[]{dojoMonitorPlugin});
        }
        return dojoMonitorPlugin.secondMetricName;
    }

    public static final /* synthetic */ boolean access$isStopFirstPageMonitor$p(DojoMonitorPlugin dojoMonitorPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41c5d167", new Object[]{dojoMonitorPlugin})).booleanValue();
        }
        return dojoMonitorPlugin.isStopFirstPageMonitor;
    }

    public static final /* synthetic */ void access$removePlugins(DojoMonitorPlugin dojoMonitorPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef1c92c", new Object[]{dojoMonitorPlugin});
        } else {
            dojoMonitorPlugin.removePlugins();
        }
    }

    public static final /* synthetic */ void access$setFirstPageMeterService$p(DojoMonitorPlugin dojoMonitorPlugin, zoc zocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1310790", new Object[]{dojoMonitorPlugin, zocVar});
        } else {
            dojoMonitorPlugin.firstPageMeterService = zocVar;
        }
    }

    public static final /* synthetic */ void access$setStopFirstPageMonitor$p(DojoMonitorPlugin dojoMonitorPlugin, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9efa819", new Object[]{dojoMonitorPlugin, new Boolean(z)});
        } else {
            dojoMonitorPlugin.isStopFirstPageMonitor = z;
        }
    }

    private final void beginTask(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad871df", new Object[]{this, str});
        } else if (!this.hasRenderSnapshot || !this.isSnapshotRenderEnd) {
            zoc zocVar = this.firstPageMeterService;
            if (zocVar != null) {
                str2 = zocVar.p(str);
            } else {
                str2 = null;
            }
            if (str2 != null) {
                Map<String, String> map = this.pageRenderMap;
                map.put(str + "_taskId", str2);
            }
        } else {
            zoc zocVar2 = this.secondRefreshMeterService;
            if (zocVar2 != null) {
                zocVar2.p(str);
            }
        }
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
        sb.append('_');
        if (str4 == null || (str2 = "_".concat(str4)) == null) {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ Object ipc$super(DojoMonitorPlugin dojoMonitorPlugin, String str, Object... objArr) {
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
            case 437084187:
                super.onLoadJSStart();
                return null;
            case 439942062:
                super.onNativeTransformerEnd((Action) objArr[0]);
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/devtools/DojoMonitorPlugin");
        }
    }

    private final void removePlugins() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af242103", new Object[]{this});
            return;
        }
        this.mPlugins.removePlugin(this);
        Logger.e(this.tag, "remove plugins");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBindSubViewDataEnd(String str, ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988c1f26", new Object[]{this, str, viewObject});
            return;
        }
        super.onBindSubViewDataEnd(str, viewObject);
        endTask(getTaskName("onBuildViewObject", str, viewObject));
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBindSubViewDataStart(String str, ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34a43f3f", new Object[]{this, str, viewObject});
            return;
        }
        super.onBindSubViewDataStart(str, viewObject);
        beginTask(getTaskName("onBuildViewObject", str, viewObject));
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBuildViewObjectDataEnd(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa128ba", new Object[]{this, viewObject});
            return;
        }
        super.onBuildViewObjectDataEnd(viewObject);
        endTask(getTaskName("onBuildViewObject", viewObject != null ? viewObject.info : null, (Map<String, String>) null));
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBuildViewObjectDataStart(LayoutInfo layoutInfo, SharedState sharedState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("397e4b1b", new Object[]{this, layoutInfo, sharedState});
            return;
        }
        super.onBuildViewObjectDataStart(layoutInfo, sharedState);
        beginTask(getTaskName("onBuildViewObject", layoutInfo, (Map<String, String>) null));
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStartEnd(ConfigInfo configInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f9b7d5", new Object[]{this, configInfo});
        } else {
            super.onContainerStartEnd(configInfo);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStartStart(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ee7cc7", new Object[]{this, str, str2, str3});
        } else {
            super.onContainerStartStart(str, str2, str3);
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
        endTask(getTaskName("onCreateView", str, viewObject));
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onCreateSubViewStart(String str, ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89589956", new Object[]{this, str, viewObject});
            return;
        }
        super.onCreateSubViewStart(str, viewObject);
        beginTask(getTaskName("onCreateView", str, viewObject));
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
        endTask("onFinalTransformerAll_" + action.getName());
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
        beginTask("onFinalTransformerAll_" + action.getName());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onGlobalLayout(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74e28e6", new Object[]{this, str, new Integer(i)});
            return;
        }
        super.onGlobalLayout(str, i);
        if (TextUtils.equals(str, this.mBizConfigCode)) {
            boolean z = this.hasRenderSnapshot;
            if (z) {
                this.isSnapshotRenderEnd = true;
            }
            if (!z && !this.isStopFirstPageMonitor) {
                UIHandler.postDelayed(new Runnable() { // from class: com.taobao.message.lab.comfrm.devtools.DojoMonitorPlugin$onGlobalLayout$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!DojoMonitorPlugin.access$isStopFirstPageMonitor$p(DojoMonitorPlugin.this)) {
                            DojoMonitorPlugin.access$setStopFirstPageMonitor$p(DojoMonitorPlugin.this, true);
                            zoc access$getFirstPageMeterService$p = DojoMonitorPlugin.access$getFirstPageMeterService$p(DojoMonitorPlugin.this);
                            if (access$getFirstPageMeterService$p != null) {
                                access$getFirstPageMeterService$p.q(true, "1001");
                            }
                            DojoMonitorPlugin.access$removePlugins(DojoMonitorPlugin.this);
                        }
                    }
                }, 2000L);
            }
        }
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
        endTask("onImmediateTrans_" + action.getName());
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
        beginTask("onImmediateTrans_" + action.getName());
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
        StringBuilder sb = new StringBuilder("onJSTransformer_");
        sb.append(transformerItem != null ? transformerItem.name : null);
        sb.append('_');
        sb.append(action.getName());
        endTask(sb.toString());
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
        StringBuilder sb = new StringBuilder("onJSTransformer_");
        sb.append(transformerItem != null ? transformerItem.name : null);
        sb.append('_');
        sb.append(action.getName());
        beginTask(sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onLoadJSEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cd7a494", new Object[]{this});
            return;
        }
        super.onLoadJSEnd();
        endTask("onLoadJSStart");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onLoadJSStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a0d601b", new Object[]{this});
            return;
        }
        super.onLoadJSStart();
        beginTask("onLoadJSStart");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onLoadSnapshotStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af0e5a0", new Object[]{this});
            return;
        }
        super.onLoadSnapshotStart();
        zoc zocVar = this.firstPageMeterService;
        if (zocVar != null) {
            zocVar.g("readSnapshot");
        }
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
        endTask("onNativeTransformerAll_" + action.getName());
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
        beginTask("onNativeTransformerAll" + action.getName());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onPageStart(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("735bebdf", new Object[]{this, str, new Long(j)});
            return;
        }
        super.onPageStart(str, j);
        this.pageRenderMap.put(ckf.p(str, "onPageStart"), String.valueOf(j));
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderBefore(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425782a4", new Object[]{this, viewObject});
            return;
        }
        super.onRenderBefore(viewObject);
        beginTask(IMultiTabStabilityListener.ON_RENDER);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceEnd(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd84265", new Object[]{this, action});
            return;
        }
        super.onSourceEnd(action);
        StringBuilder sb = new StringBuilder("onSourceAll_");
        sb.append(action != null ? action.getName() : null);
        endTask(sb.toString());
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
            if (!this.isStartSecondMonitor) {
                this.isStartSecondMonitor = true;
                zoc zocVar = this.secondRefreshMeterService;
                if (zocVar != null) {
                    zocVar.start();
                }
            }
        }
        StringBuilder sb = new StringBuilder("onSourceAll_");
        sb.append(action != null ? action.getName() : null);
        beginTask(sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceTimeout(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300e271f", new Object[]{this, list});
        } else {
            super.onSourceTimeout(list);
        }
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
        StringBuilder sb = new StringBuilder("onTransformer_");
        sb.append(transformerItem != null ? transformerItem.name : null);
        sb.append('_');
        sb.append(action.getName());
        endTask(sb.toString());
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
        StringBuilder sb = new StringBuilder("onTransformer_");
        sb.append(transformerItem != null ? transformerItem.name : null);
        sb.append('_');
        sb.append(action.getName());
        beginTask(sb.toString());
    }

    private final void endTask(String str) {
        zoc zocVar;
        zoc zocVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e6c791", new Object[]{this, str});
            return;
        }
        Map<String, String> map = this.pageRenderMap;
        String str2 = map.get(str + "_taskId");
        if (str2 == null && !TextUtils.isEmpty(this.sceneName)) {
            Logger.e(this.tag, "taskId is null");
        }
        if (!this.hasRenderSnapshot || !this.isSnapshotRenderEnd) {
            if (str2 != null && (zocVar = this.firstPageMeterService) != null) {
                zocVar.f(str2, true);
            }
        } else if (str2 != null && (zocVar2 = this.secondRefreshMeterService) != null) {
            zocVar2.f(str2, true);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onLoadSnapshotEnd(Snapshot.SnapshotData snapshotData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ffe1b", new Object[]{this, snapshotData});
            return;
        }
        super.onLoadSnapshotEnd(snapshotData);
        zoc zocVar = this.firstPageMeterService;
        if (zocVar != null) {
            zocVar.j("readSnapshot", true);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onPageInteractive(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff82b6df", new Object[]{this, str, new Long(j)});
            return;
        }
        super.onPageInteractive(str, j);
        this.pageRenderMap.put(ckf.p(str, "onPageInteractive"), String.valueOf(j));
        if (!this.isStopFirstPageMonitor && TextUtils.equals(str, this.mPageName)) {
            this.isStopFirstPageMonitor = true;
            if (!this.hasRenderSnapshot) {
                removePlugins();
            }
            zoc zocVar = this.firstPageMeterService;
            if (zocVar != null) {
                zocVar.n(true);
            }
        }
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
            if (this.hasRenderSnapshot) {
                this.isSnapshotRenderEnd = true;
            }
            String str2 = this.pageRenderMap.get(ckf.p(str, "onPageStart"));
            if (str2 != null) {
                String str3 = this.tag;
                Logger.e(str3, "onPageVisible|" + str + '|' + this.mContainerKey + "|useTime " + (j - Long.parseLong(str2)));
            }
            this.pageRenderMap.put(ckf.p(str, "onPageVisible"), String.valueOf(j));
        }
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
        endTask(IMultiTabStabilityListener.ON_RENDER);
        if (this.isSnapshotRenderEnd) {
            if (!this.isStopSecondMonitor) {
                this.isStopSecondMonitor = true;
                zoc zocVar = this.secondRefreshMeterService;
                if (zocVar != null) {
                    zocVar.n(true);
                }
            }
            UIHandler.postDelayed(new Runnable() { // from class: com.taobao.message.lab.comfrm.devtools.DojoMonitorPlugin$onRenderAfter$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    DojoMonitorPlugin.access$removePlugins(DojoMonitorPlugin.this);
                    huh.h().g(DojoMonitorPlugin.access$getSceneName$p(DojoMonitorPlugin.this), DojoMonitorPlugin.access$getSecondMetricName$p(DojoMonitorPlugin.this));
                }
            }, 2000L);
            Logger.e(this.tag, "二刷监控点结束");
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderSnapshotEnd(Snapshot.SnapshotData snapshotData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ffaf2b", new Object[]{this, snapshotData});
            return;
        }
        super.onRenderSnapshotEnd(snapshotData);
        zoc zocVar = this.firstPageMeterService;
        if (zocVar != null) {
            zocVar.j("renderSnapshot", true);
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
        zoc zocVar = this.firstPageMeterService;
        if (zocVar != null) {
            zocVar.g("renderSnapshot");
        }
        if (this.secondRefreshMeterService == null) {
            this.secondRefreshMeterService = huh.h().c(this.sceneName, this.secondMetricName, new ouh());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
        if (r5 != null) goto L_0x0070;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String getTaskName(java.lang.String r5, java.lang.String r6, com.taobao.message.lab.comfrm.core.ViewObject r7) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.message.lab.comfrm.devtools.DojoMonitorPlugin.$ipChange
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
            com.taobao.message.lab.comfrm.inner2.config.LayoutInfo r6 = r7.info
            if (r6 == 0) goto L_0x0055
            com.taobao.message.lab.comfrm.render.RenderTemplate r6 = r6.renderTemplate
            if (r6 == 0) goto L_0x0055
            java.lang.String r0 = r6.name
        L_0x0055:
            r2.append(r0)
            r2.append(r5)
            if (r1 == 0) goto L_0x006e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "_"
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            if (r5 == 0) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            java.lang.String r5 = ""
        L_0x0070:
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.lab.comfrm.devtools.DojoMonitorPlugin.getTaskName(java.lang.String, java.lang.String, com.taobao.message.lab.comfrm.core.ViewObject):java.lang.String");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBindSubViewDataEnd(LayoutInfo layoutInfo, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73303d8b", new Object[]{this, layoutInfo, map});
            return;
        }
        super.onBindSubViewDataEnd(layoutInfo, map);
        endTask(getTaskName("onBuildViewObject", layoutInfo, map));
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBindSubViewDataStart(LayoutInfo layoutInfo, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2c26e4", new Object[]{this, layoutInfo, map});
            return;
        }
        super.onBindSubViewDataStart(layoutInfo, map);
        beginTask(getTaskName("onBuildViewObject", layoutInfo, map));
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onCreateSubViewEnd(LayoutInfo layoutInfo, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436bb422", new Object[]{this, layoutInfo, map});
            return;
        }
        super.onCreateSubViewEnd(layoutInfo, map);
        endTask(getTaskName("onCreateView", layoutInfo, map));
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onCreateSubViewStart(LayoutInfo layoutInfo, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6453bb", new Object[]{this, layoutInfo, map});
            return;
        }
        super.onCreateSubViewStart(layoutInfo, map);
        beginTask(getTaskName("onCreateView", layoutInfo, map));
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
        endTask("onJSTransformerAll_" + action.getName());
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
        beginTask("onJSTransformerAll_" + action.getName());
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
        StringBuilder sb = new StringBuilder("onSource_");
        sb.append(sourceItem != null ? sourceItem.name : null);
        sb.append('_');
        sb.append(command.getName());
        endTask(sb.toString());
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
        StringBuilder sb = new StringBuilder("onSource_");
        sb.append(sourceItem != null ? sourceItem.name : null);
        sb.append('_');
        sb.append(command.getName());
        beginTask(sb.toString());
    }
}
