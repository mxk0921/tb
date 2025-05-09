package com.taobao.message.lab.comfrm.support.list;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.MPGapWorker;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.video.c;
import com.taobao.message.datasdk.facade.model.ResultChange;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.ComponentFrmModule;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner2.DeltaItem;
import com.taobao.message.lab.comfrm.inner2.Diff;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.message.lab.comfrm.util.ExtentionFunctionKt;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.SmoothRecyclerScrollFeature;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.c21;
import tb.h9z;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SectionListWidgetInstanceV2 extends BaseAbsListWidgetInstance<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DIFF_RENDER = 1;
    private static final int FULL_RENDER = 0;
    public static final String KEY_SECTION_EXPAND = "expand";
    private static final int MAX_STAT_COUNT = 10;
    public static final String SLOT_FOOTER = "footer";
    public static final String SLOT_HEADER = "header";
    public static final String SLOT_LIST = "content";
    public static final String SLOT_SECTION = "section";
    private static final String TAG = "SectionListV2";
    private static long sScrollUniqueID = 0;
    private RecyclerView.Adapter adapter;
    private boolean bindVHDryNext;
    private int clipFirst;
    private EventDispatcher eventDispatcher;
    private View footerView;
    private MPGapWorker gapWorker;
    private View headerView;
    private LinearLayoutManager layoutManager;
    private WidgetInstance mHeader;
    private AbsListWidgetInstance.Monitor monitor;
    private ICustomNestedScrollView nestedScrollParent;
    private JSONObject nextBindData;
    private Runnable nextRefreshRunnable;
    private Runnable nextRunnable;
    private boolean onRefreshAfterScroll;
    private TRecyclerView recyclerView;
    private ViewObject renderViewObject;
    private AbsListWidgetInstance.ScrollMonitor scrollMonitor;
    private int currentOffsetY = 0;
    private int mFlingVelocityY = 0;
    private boolean isFirst = true;
    private Set<ViewObject> lastExporedSet = new HashSet();
    private volatile boolean forgroundVisible = true;
    private List<Runnable> prefectRunnableList = new ArrayList();
    private Rect screenRect = new Rect(0, 0, DisplayUtil.getScreenWidth(), DisplayUtil.getScreenHeight());
    private boolean isForceFullUpdate = false;
    private boolean isEnableSmoothScroll = false;
    private int reloadCount = 0;
    private int mStatCount = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class GapBindDataRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(537919847);
        }

        private GapBindDataRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject access$2700 = SectionListWidgetInstanceV2.access$2700(SectionListWidgetInstanceV2.this);
            SectionListWidgetInstanceV2.access$2702(SectionListWidgetInstanceV2.this, null);
            SectionListWidgetInstanceV2.access$2802(SectionListWidgetInstanceV2.this, null);
            SectionListWidgetInstanceV2 sectionListWidgetInstanceV2 = SectionListWidgetInstanceV2.this;
            SectionListWidgetInstanceV2.access$2900(sectionListWidgetInstanceV2, access$2700, SectionListWidgetInstanceV2.access$1100(sectionListWidgetInstanceV2));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class SectionAdapter extends RecyclerView.Adapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int[] index;
        public ViewObject lastViewObject;
        public int nextType = 0;
        public Map<String, Integer> template2Type = new HashMap(2);
        public Map<Integer, RenderTemplate> type2Template = new HashMap(2);
        public int count = 0;

        static {
            t2o.a(537919848);
        }

        public SectionAdapter() {
        }

        private String getTemplateKey(ViewObject viewObject, RenderTemplate renderTemplate) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("493b807f", new Object[]{this, viewObject, renderTemplate});
            }
            String str = renderTemplate.name;
            Serializable serializable = viewObject.data;
            if (!(serializable instanceof JSONObject)) {
                return str;
            }
            JSONObject jSONObject = (JSONObject) serializable;
            if (!jSONObject.containsKey("reuseId") || TextUtils.isEmpty(jSONObject.getString("reuseId"))) {
                return str;
            }
            return jSONObject.getString("reuseId") + "|" + renderTemplate.name;
        }

        public static /* synthetic */ Object ipc$super(SectionAdapter sectionAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/list/SectionListWidgetInstanceV2$SectionAdapter");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            build();
            return this.count;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
            }
            ViewObject findViewObject = findViewObject(i);
            RenderTemplate renderTemplate = findViewObject.info.renderTemplate;
            String templateKey = getTemplateKey(findViewObject, renderTemplate);
            Integer num = this.template2Type.get(templateKey);
            if (num == null) {
                int i2 = this.nextType;
                this.nextType = 1 + i2;
                Integer valueOf = Integer.valueOf(i2);
                this.template2Type.put(templateKey, valueOf);
                this.type2Template.put(valueOf, renderTemplate);
                SectionListWidgetInstanceV2.access$100(SectionListWidgetInstanceV2.this).getRecycledViewPool().setMaxRecycledViews(i2, ComponentFrmModule.sOptSwitchGapWorkerSize + 20);
                num = valueOf;
            }
            return num.intValue();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
            }
            WidgetInstance access$2200 = SectionListWidgetInstanceV2.access$2200(SectionListWidgetInstanceV2.this, this.type2Template.get(Integer.valueOf(i)));
            SectionListWidgetInstanceV2.access$800(SectionListWidgetInstanceV2.this).scrollCreateVHCount++;
            return new ViewHolder(access$2200.getView(), access$2200);
        }

        private void degradeToTree() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2463fd56", new Object[]{this});
                return;
            }
            SharedPreferencesUtil.addBooleanSharedPreference("messageCenterTabDegradeToTree", true);
            UIHandler.postDelayed(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.list.SectionListWidgetInstanceV2.SectionAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    throw new IllegalStateException("BindData Error!!");
                }
            }, 50L);
        }

        private void build() {
            List list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac6c63f5", new Object[]{this});
                return;
            }
            ViewObject access$2500 = SectionListWidgetInstanceV2.access$2500(SectionListWidgetInstanceV2.this);
            if (access$2500 != this.lastViewObject) {
                this.lastViewObject = access$2500;
                this.count = 0;
                if (!(access$2500 == null || (list = (List) access$2500.children.get("section")) == null)) {
                    SectionListWidgetInstanceV2.access$800(SectionListWidgetInstanceV2.this).scrollReBuildSectionCount++;
                    this.index = new int[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        ViewObject viewObject = (ViewObject) list.get(i);
                        ViewObject viewObject2 = (ViewObject) viewObject.children.get("header");
                        ViewObject viewObject3 = (ViewObject) viewObject.children.get("footer");
                        List list2 = (List) viewObject.children.get("content");
                        if (list2 != null) {
                            if (viewObject2 != null) {
                                this.count++;
                            }
                            Serializable serializable = viewObject.data;
                            if (serializable == null || ValueUtil.getInteger((JSONObject) serializable, "expand", 0) == 0) {
                                this.count += list2.size();
                            }
                            if (viewObject3 != null) {
                                this.count++;
                            }
                            this.index[i] = this.count;
                        }
                    }
                    SectionListWidgetInstanceV2.access$800(SectionListWidgetInstanceV2.this).scrollReBuildSectionCount++;
                    Logger.ftl(new Logger.FormatLog.Builder().type(2).module(16).point(2001).ext("count", String.valueOf(this.count)).build());
                }
            }
        }

        public ViewObject findViewObject(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewObject) ipChange.ipc$dispatch("6aab524e", new Object[]{this, new Integer(i)});
            }
            SectionListWidgetInstanceV2.access$800(SectionListWidgetInstanceV2.this).scrollFindViewObjectCount++;
            List list = (List) ((ViewObject) ((List) SectionListWidgetInstanceV2.access$2500(SectionListWidgetInstanceV2.this).children.get("section")).get(0)).children.get("content");
            if (i < 0 || i >= list.size()) {
                return null;
            }
            return (ViewObject) list.get(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String str;
            ViewObject findViewObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
                return;
            }
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            ViewObject findViewObject2 = findViewObject(i);
            if (SectionListWidgetInstanceV2.access$2300(SectionListWidgetInstanceV2.this) && (findViewObject = findViewObject(i + 3)) != null) {
                SectionListWidgetInstanceV2.access$2400(SectionListWidgetInstanceV2.this, findViewObject);
            }
            viewHolder2.instance.bindViewObject(findViewObject2, SectionListWidgetInstanceV2.access$1100(SectionListWidgetInstanceV2.this));
            SectionListWidgetInstanceV2.access$800(SectionListWidgetInstanceV2.this).scrollBindVHCount++;
            if (findViewObject2 != null && (str = findViewObject2.uniqueId) != null && str.startsWith("@bindData{")) {
                TLog.loge(SectionListWidgetInstanceV2.TAG, "view bindData --- error = " + JSON.toJSONString(findViewObject2));
                degradeToTree();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public WidgetInstance instance;

        static {
            t2o.a(537919850);
        }

        public ViewHolder(View view, WidgetInstance widgetInstance) {
            super(view);
            this.instance = widgetInstance;
        }
    }

    static {
        t2o.a(537919834);
    }

    public static /* synthetic */ List access$000(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7ddd9c7a", new Object[]{sectionListWidgetInstanceV2});
        }
        return sectionListWidgetInstanceV2.prefectRunnableList;
    }

    public static /* synthetic */ TRecyclerView access$100(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TRecyclerView) ipChange.ipc$dispatch("19f1a718", new Object[]{sectionListWidgetInstanceV2});
        }
        return sectionListWidgetInstanceV2.recyclerView;
    }

    public static /* synthetic */ int access$1000(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a90cc4f", new Object[]{sectionListWidgetInstanceV2})).intValue();
        }
        return sectionListWidgetInstanceV2.getHeaderViewsCount();
    }

    public static /* synthetic */ EventDispatcher access$1100(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventDispatcher) ipChange.ipc$dispatch("ad0f9b45", new Object[]{sectionListWidgetInstanceV2});
        }
        return sectionListWidgetInstanceV2.eventDispatcher;
    }

    public static /* synthetic */ void access$1200(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e47f28", new Object[]{sectionListWidgetInstanceV2, str});
        } else {
            sectionListWidgetInstanceV2.expose(str);
        }
    }

    public static /* synthetic */ AbsListWidgetInstance.Monitor access$1300(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsListWidgetInstance.Monitor) ipChange.ipc$dispatch("335f566", new Object[]{sectionListWidgetInstanceV2});
        }
        return sectionListWidgetInstanceV2.monitor;
    }

    public static /* synthetic */ long access$1404() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19bc3fa2", new Object[0])).longValue();
        }
        long j = sScrollUniqueID + 1;
        sScrollUniqueID = j;
        return j;
    }

    public static /* synthetic */ int access$1500(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e5d3794", new Object[]{sectionListWidgetInstanceV2})).intValue();
        }
        return sectionListWidgetInstanceV2.currentOffsetY;
    }

    public static /* synthetic */ int access$1502(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf4cd2b3", new Object[]{sectionListWidgetInstanceV2, new Integer(i)})).intValue();
        }
        sectionListWidgetInstanceV2.currentOffsetY = i;
        return i;
    }

    public static /* synthetic */ int access$1600(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("458619d5", new Object[]{sectionListWidgetInstanceV2})).intValue();
        }
        return sectionListWidgetInstanceV2.clipFirst;
    }

    public static /* synthetic */ boolean access$1800(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53d7de68", new Object[]{sectionListWidgetInstanceV2})).booleanValue();
        }
        return sectionListWidgetInstanceV2.isFirst;
    }

    public static /* synthetic */ boolean access$1802(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59274432", new Object[]{sectionListWidgetInstanceV2, new Boolean(z)})).booleanValue();
        }
        sectionListWidgetInstanceV2.isFirst = z;
        return z;
    }

    public static /* synthetic */ MPGapWorker access$1900(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MPGapWorker) ipChange.ipc$dispatch("6dd9723e", new Object[]{sectionListWidgetInstanceV2});
        }
        return sectionListWidgetInstanceV2.gapWorker;
    }

    public static /* synthetic */ RecyclerView.Adapter access$200(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.Adapter) ipChange.ipc$dispatch("b50c0deb", new Object[]{sectionListWidgetInstanceV2});
        }
        return sectionListWidgetInstanceV2.adapter;
    }

    public static /* synthetic */ WidgetInstance access$2000(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetInstance) ipChange.ipc$dispatch("24cf0a8c", new Object[]{sectionListWidgetInstanceV2});
        }
        return sectionListWidgetInstanceV2.mHeader;
    }

    public static /* synthetic */ void access$2100(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffad147c", new Object[]{sectionListWidgetInstanceV2});
        } else {
            sectionListWidgetInstanceV2.safeFullUpdate();
        }
    }

    public static /* synthetic */ WidgetInstance access$2200(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2, RenderTemplate renderTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetInstance) ipChange.ipc$dispatch("94313fe", new Object[]{sectionListWidgetInstanceV2, renderTemplate});
        }
        return sectionListWidgetInstanceV2.createSubView(renderTemplate);
    }

    public static /* synthetic */ boolean access$2300(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfed902", new Object[]{sectionListWidgetInstanceV2})).booleanValue();
        }
        return sectionListWidgetInstanceV2.bindVHDryNext;
    }

    public static /* synthetic */ void access$2400(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2, ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27479a0", new Object[]{sectionListWidgetInstanceV2, viewObject});
        } else {
            sectionListWidgetInstanceV2.dryRunSlotWidget(viewObject);
        }
    }

    public static /* synthetic */ ViewObject access$2500(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("330d456f", new Object[]{sectionListWidgetInstanceV2});
        }
        return sectionListWidgetInstanceV2.getRenderFinishViewObject();
    }

    public static /* synthetic */ void access$2600(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23797fc1", new Object[]{sectionListWidgetInstanceV2});
        } else {
            sectionListWidgetInstanceV2.onRefreshImpl();
        }
    }

    public static /* synthetic */ JSONObject access$2700(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ac888522", new Object[]{sectionListWidgetInstanceV2});
        }
        return sectionListWidgetInstanceV2.nextBindData;
    }

    public static /* synthetic */ JSONObject access$2702(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("29a7c78c", new Object[]{sectionListWidgetInstanceV2, jSONObject});
        }
        sectionListWidgetInstanceV2.nextBindData = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ Runnable access$2802(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("4da18971", new Object[]{sectionListWidgetInstanceV2, runnable});
        }
        sectionListWidgetInstanceV2.nextRunnable = runnable;
        return runnable;
    }

    public static /* synthetic */ void access$2900(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2, JSONObject jSONObject, EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff616158", new Object[]{sectionListWidgetInstanceV2, jSONObject, eventDispatcher});
        } else {
            sectionListWidgetInstanceV2.bindDataImpl(jSONObject, eventDispatcher);
        }
    }

    public static /* synthetic */ ViewObject access$300(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2, SectionAdapter sectionAdapter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("f166cfb6", new Object[]{sectionListWidgetInstanceV2, sectionAdapter, new Integer(i)});
        }
        return sectionListWidgetInstanceV2.findViewObjectByVisiblePosition(sectionAdapter, i);
    }

    public static /* synthetic */ void access$400(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2, ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd1db6e", new Object[]{sectionListWidgetInstanceV2, viewObject});
        } else {
            sectionListWidgetInstanceV2.dryRunSlotWidget(viewObject);
        }
    }

    public static /* synthetic */ int access$500(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("193de165", new Object[]{sectionListWidgetInstanceV2})).intValue();
        }
        return sectionListWidgetInstanceV2.mFlingVelocityY;
    }

    public static /* synthetic */ int access$502(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40816302", new Object[]{sectionListWidgetInstanceV2, new Integer(i)})).intValue();
        }
        sectionListWidgetInstanceV2.mFlingVelocityY = i;
        return i;
    }

    public static /* synthetic */ ICustomNestedScrollView access$600(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ICustomNestedScrollView) ipChange.ipc$dispatch("2df4266e", new Object[]{sectionListWidgetInstanceV2});
        }
        return sectionListWidgetInstanceV2.nestedScrollParent;
    }

    public static /* synthetic */ int access$700(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("278fa5e7", new Object[]{sectionListWidgetInstanceV2})).intValue();
        }
        return sectionListWidgetInstanceV2.firstVisiblePosition();
    }

    public static /* synthetic */ AbsListWidgetInstance.ScrollMonitor access$800(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsListWidgetInstance.ScrollMonitor) ipChange.ipc$dispatch("6ce2e7bd", new Object[]{sectionListWidgetInstanceV2});
        }
        return sectionListWidgetInstanceV2.scrollMonitor;
    }

    public static /* synthetic */ AbsListWidgetInstance.ScrollMonitor access$802(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2, AbsListWidgetInstance.ScrollMonitor scrollMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsListWidgetInstance.ScrollMonitor) ipChange.ipc$dispatch("424bf07f", new Object[]{sectionListWidgetInstanceV2, scrollMonitor});
        }
        sectionListWidgetInstanceV2.scrollMonitor = scrollMonitor;
        return scrollMonitor;
    }

    public static /* synthetic */ int access$900(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("35e16a69", new Object[]{sectionListWidgetInstanceV2})).intValue();
        }
        return sectionListWidgetInstanceV2.lastVisiblePosition();
    }

    private void addScrollListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86abed29", new Object[]{this});
            return;
        }
        this.recyclerView.setOnFlingListener(new RecyclerView.OnFlingListener() { // from class: com.taobao.message.lab.comfrm.support.list.SectionListWidgetInstanceV2.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/list/SectionListWidgetInstanceV2$2");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnFlingListener
            public boolean onFling(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("8af30028", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
                }
                SectionListWidgetInstanceV2.access$502(SectionListWidgetInstanceV2.this, i2);
                return false;
            }
        });
        this.recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.message.lab.comfrm.support.list.SectionListWidgetInstanceV2.3
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private boolean isScrollUp = false;
            private long exposeTime = 0;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/list/SectionListWidgetInstanceV2$3");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                boolean z = true;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                if (i2 <= 0) {
                    z = false;
                }
                this.isScrollUp = z;
                long uptimeMillis = SystemClock.uptimeMillis();
                if (uptimeMillis - this.exposeTime > 500) {
                    this.exposeTime = uptimeMillis;
                    SectionListWidgetInstanceV2.access$1200(SectionListWidgetInstanceV2.this, "onScrolling");
                }
                SectionListWidgetInstanceV2 sectionListWidgetInstanceV2 = SectionListWidgetInstanceV2.this;
                SectionListWidgetInstanceV2.access$1502(sectionListWidgetInstanceV2, SectionListWidgetInstanceV2.access$1500(sectionListWidgetInstanceV2) + i2);
                SectionListWidgetInstanceV2.access$800(SectionListWidgetInstanceV2.this).scrollDistance += Math.abs(i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                } else if (i == 0) {
                    if (SectionListWidgetInstanceV2.access$500(SectionListWidgetInstanceV2.this) < 0 && SectionListWidgetInstanceV2.access$600(SectionListWidgetInstanceV2.this) != null && SectionListWidgetInstanceV2.access$700(SectionListWidgetInstanceV2.this) == 0) {
                        SectionListWidgetInstanceV2.access$600(SectionListWidgetInstanceV2.this).flingY(SectionListWidgetInstanceV2.access$500(SectionListWidgetInstanceV2.this));
                        SectionListWidgetInstanceV2.access$502(SectionListWidgetInstanceV2.this, 0);
                    }
                    SectionListWidgetInstanceV2.access$800(SectionListWidgetInstanceV2.this).endScrollTime = SystemClock.uptimeMillis();
                    int access$700 = SectionListWidgetInstanceV2.access$700(SectionListWidgetInstanceV2.this);
                    int access$900 = SectionListWidgetInstanceV2.access$900(SectionListWidgetInstanceV2.this);
                    if (!this.isScrollUp) {
                        if (access$700 == SectionListWidgetInstanceV2.access$1000(SectionListWidgetInstanceV2.this)) {
                            SectionListWidgetInstanceV2.access$1100(SectionListWidgetInstanceV2.this).dispatch(new Event.Build(ListActions.EVENT_PULL_DOWN).build());
                        }
                    } else if (access$900 == SectionListWidgetInstanceV2.access$200(SectionListWidgetInstanceV2.this).getItemCount() - 1) {
                        SectionListWidgetInstanceV2.access$1100(SectionListWidgetInstanceV2.this).dispatch(new Event.Build(ListActions.EVENT_PULL_UP).build());
                    }
                    SectionListWidgetInstanceV2.access$1200(SectionListWidgetInstanceV2.this, "onEndScrolling");
                    SectionListWidgetInstanceV2.access$800(SectionListWidgetInstanceV2.this).exposeEndScrollTime = SystemClock.uptimeMillis();
                    SectionListWidgetInstanceV2.access$800(SectionListWidgetInstanceV2.this).endScrollPos = access$700;
                } else if (i == 2) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.exposeTime = SystemClock.uptimeMillis();
                    SectionListWidgetInstanceV2.access$800(SectionListWidgetInstanceV2.this).flingScrollTime = uptimeMillis;
                } else if (i == 1) {
                    if (SectionListWidgetInstanceV2.access$1300(SectionListWidgetInstanceV2.this).scrollMonitors.size() > 8) {
                        SectionListWidgetInstanceV2.access$1300(SectionListWidgetInstanceV2.this).scrollMonitors.remove(0);
                    }
                    SectionListWidgetInstanceV2.access$802(SectionListWidgetInstanceV2.this, new AbsListWidgetInstance.ScrollMonitor());
                    SectionListWidgetInstanceV2.access$1300(SectionListWidgetInstanceV2.this).scrollMonitors.add(SectionListWidgetInstanceV2.access$800(SectionListWidgetInstanceV2.this));
                    SectionListWidgetInstanceV2.access$800(SectionListWidgetInstanceV2.this).scrollUniqueID = SectionListWidgetInstanceV2.access$1404();
                    SectionListWidgetInstanceV2.access$800(SectionListWidgetInstanceV2.this).startScrollTime = SystemClock.uptimeMillis();
                    SectionListWidgetInstanceV2.access$800(SectionListWidgetInstanceV2.this).startScrollPos = SectionListWidgetInstanceV2.access$700(SectionListWidgetInstanceV2.this);
                }
            }
        });
    }

    private void bindDataImpl(JSONObject jSONObject, EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c5f4ce", new Object[]{this, jSONObject, eventDispatcher});
            return;
        }
        firstRenderOptimize();
        this.renderViewObject = getViewObject();
        this.clipFirst = ValueUtil.getInteger(jSONObject, "clipFirst", 0);
        setHeader();
        setFooter();
        doRender(jSONObject);
        this.eventDispatcher = eventDispatcher;
        statExpose();
        handleScroll(jSONObject);
    }

    private void doRender(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ffa99e8", new Object[]{this, jSONObject});
        } else {
            executeRender(calcRenderStrategy(jSONObject));
        }
    }

    private ViewObject findViewObjectByVisiblePosition(SectionAdapter sectionAdapter, int i) {
        WidgetInstance widgetInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("e24c5854", new Object[]{this, sectionAdapter, new Integer(i)});
        }
        int headerViewsCount = i - getHeaderViewsCount();
        if (headerViewsCount >= 0) {
            return sectionAdapter.findViewObject(headerViewsCount);
        }
        if (headerViewsCount != -1 || (widgetInstance = this.mHeader) == null) {
            return null;
        }
        return widgetInstance.getViewObject();
    }

    private void firstRenderOptimize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82f8486a", new Object[]{this});
        } else if (this.isFirst) {
            RecyclerView.Adapter adapter = this.adapter;
            if (adapter instanceof SectionAdapter) {
                int min = Math.min(adapter.getItemCount(), 7);
                for (int i = 2; i < min; i++) {
                    ViewObject findViewObject = ((SectionAdapter) this.adapter).findViewObject(i);
                    if (findViewObject != null) {
                        dryRunSlotWidget(findViewObject);
                    }
                }
            }
        }
    }

    private int firstVisiblePosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9c6a1e5", new Object[]{this})).intValue();
        }
        return this.recyclerView.getChildAdapterPosition(this.recyclerView.getChildAt(0));
    }

    private int getHeaderViewsCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("643b079e", new Object[]{this})).intValue();
        }
        return this.recyclerView.getHeaderViewsCount();
    }

    private ViewObject getRenderFinishViewObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("16353159", new Object[]{this});
        }
        ViewObject viewObject = this.renderViewObject;
        if (viewObject != null) {
            return viewObject;
        }
        return getViewObject();
    }

    private void initGapWorker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca63c54b", new Object[]{this});
            return;
        }
        int i = ComponentFrmModule.sOptSwitchGapWorkerSize;
        if (MPGapWorker.isAllowThreadGapWork() && i > 0) {
            MPGapWorker mPGapWorker = new MPGapWorker();
            this.gapWorker = mPGapWorker;
            mPGapWorker.attach(this.recyclerView, i);
            if (ComponentFrmModule.sDXEnginePrefetch && (this.adapter instanceof SectionAdapter)) {
                this.gapWorker.setResetRangePrefetchListener(new MPGapWorker.ResetRangePrefetchListener() { // from class: com.taobao.message.lab.comfrm.support.list.SectionListWidgetInstanceV2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // androidx.appcompat.widget.MPGapWorker.ResetRangePrefetchListener
                    public void resetRangePrefetch(final int i2, int i3, int i4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("67bf3d7", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4)});
                            return;
                        }
                        for (Runnable runnable : SectionListWidgetInstanceV2.access$000(SectionListWidgetInstanceV2.this)) {
                            UIHandler.removeCallbacks(runnable);
                        }
                        SectionListWidgetInstanceV2.access$000(SectionListWidgetInstanceV2.this).clear();
                        while (i2 < i3) {
                            Runnable runnable2 = new Runnable() { // from class: com.taobao.message.lab.comfrm.support.list.SectionListWidgetInstanceV2.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (i2 < SectionListWidgetInstanceV2.access$100(SectionListWidgetInstanceV2.this).getAdapter().getItemCount()) {
                                        SectionListWidgetInstanceV2 sectionListWidgetInstanceV2 = SectionListWidgetInstanceV2.this;
                                        ViewObject access$300 = SectionListWidgetInstanceV2.access$300(sectionListWidgetInstanceV2, (SectionAdapter) SectionListWidgetInstanceV2.access$200(sectionListWidgetInstanceV2), i2);
                                        if (access$300 != null) {
                                            SectionListWidgetInstanceV2.access$400(SectionListWidgetInstanceV2.this, access$300);
                                        }
                                    }
                                }
                            };
                            SectionListWidgetInstanceV2.access$000(SectionListWidgetInstanceV2.this).add(runnable2);
                            UIHandler.postDelayed(runnable2, 0L);
                            i2++;
                        }
                    }
                });
            }
        }
    }

    private void initLayoutManager(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2034380e", new Object[]{this, context});
            return;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context) { // from class: com.taobao.message.lab.comfrm.support.list.SectionListWidgetInstanceV2.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 r5, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -579854207) {
                    super.onLayoutCompleted((RecyclerView.State) objArr[0]);
                    return null;
                } else if (hashCode == 1027840325) {
                    super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
                    return null;
                } else if (hashCode == 1579636234) {
                    super.measureChildWithMargins((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/message/lab/comfrm/support/list/SectionListWidgetInstanceV2$4");
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, com.alibaba.android.ultron.ext.vlayout.b
            public void measureChildWithMargins(View view, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5e27560a", new Object[]{this, view, new Integer(i), new Integer(i2)});
                    return;
                }
                try {
                    super.measureChildWithMargins(view, i, i2);
                } catch (Throwable th) {
                    TLog.loge(SectionListWidgetInstanceV2.TAG, " measureChildWithMargins error " + th.getMessage());
                }
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3d439945", new Object[]{this, recycler, state});
                    return;
                }
                try {
                    super.onLayoutChildren(recycler, state);
                } catch (Throwable th) {
                    TLog.loge(SectionListWidgetInstanceV2.TAG, " onLayoutChildren error " + th.getMessage());
                }
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void onLayoutCompleted(RecyclerView.State state) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dd702081", new Object[]{this, state});
                    return;
                }
                super.onLayoutCompleted(state);
                if (SectionListWidgetInstanceV2.access$1600(SectionListWidgetInstanceV2.this) == 1) {
                    int headerViewsCount = SectionListWidgetInstanceV2.access$100(SectionListWidgetInstanceV2.this).getHeaderViewsCount();
                    while (headerViewsCount < SectionListWidgetInstanceV2.access$100(SectionListWidgetInstanceV2.this).getAdapter().getItemCount() - SectionListWidgetInstanceV2.access$100(SectionListWidgetInstanceV2.this).getFooterViewsCount() && headerViewsCount < state.getItemCount() && (findViewHolderForAdapterPosition = SectionListWidgetInstanceV2.access$100(SectionListWidgetInstanceV2.this).findViewHolderForAdapterPosition(headerViewsCount)) != null) {
                        if (findViewHolderForAdapterPosition.itemView.getHeight() != 0) {
                            break;
                        }
                        headerViewsCount++;
                    }
                    headerViewsCount = 0;
                    for (int i = 0; i < SectionListWidgetInstanceV2.access$100(SectionListWidgetInstanceV2.this).getChildCount(); i++) {
                        final View childAt = SectionListWidgetInstanceV2.access$100(SectionListWidgetInstanceV2.this).getChildAt(i);
                        if (SectionListWidgetInstanceV2.access$100(SectionListWidgetInstanceV2.this).getChildAdapterPosition(childAt) == headerViewsCount) {
                            childAt.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.message.lab.comfrm.support.list.SectionListWidgetInstanceV2.4.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                                    str.hashCode();
                                    int hashCode = str.hashCode();
                                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/list/SectionListWidgetInstanceV2$4$1");
                                }

                                @Override // android.view.ViewOutlineProvider
                                public void getOutline(View view, Outline outline) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                                    } else {
                                        outline.setRoundRect(0, 0, childAt.getWidth(), 1000, 58.0f);
                                    }
                                }
                            });
                            childAt.setClipToOutline(true);
                        } else {
                            childAt.setOutlineProvider(null);
                            childAt.setClipToOutline(false);
                        }
                    }
                }
            }
        };
        this.layoutManager = linearLayoutManager;
        linearLayoutManager.setOrientation(1);
        if (ComponentFrmModule.sItemPrefetchSize > 0) {
            this.layoutManager.setItemPrefetchEnabled(true);
            this.layoutManager.setInitialPrefetchItemCount(ComponentFrmModule.sItemPrefetchSize);
            return;
        }
        this.layoutManager.setItemPrefetchEnabled(false);
    }

    private void initOrangeConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd77c0c7", new Object[]{this});
            return;
        }
        this.onRefreshAfterScroll = "1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "onRefreshAfterScroll", "1"));
        this.bindVHDryNext = "1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "bindVHDryNext", "1"));
        this.isForceFullUpdate = "0".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "enablePartRefresh", "1"));
        this.isEnableSmoothScroll = "1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "useLinearSmooth", "0"));
    }

    private void initScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a756a04", new Object[]{this});
            return;
        }
        try {
            int intValue = Integer.valueOf(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "smoothRecyclerScrollLeft", "2")).intValue();
            if (intValue >= 0 && c21.g().getInt("deviceLevel", -1) >= intValue) {
                this.recyclerView.addFeature(new SmoothRecyclerScrollFeature());
            }
        } catch (Throwable th) {
            TLog.loge(TAG, "error" + th.getMessage());
        }
    }

    public static /* synthetic */ Object ipc$super(SectionListWidgetInstanceV2 sectionListWidgetInstanceV2, String str, Object... objArr) {
        if (str.hashCode() == -1283962764) {
            super.postEvent((Event) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/list/SectionListWidgetInstanceV2");
    }

    private int lastVisiblePosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30db1c3f", new Object[]{this})).intValue();
        }
        TRecyclerView tRecyclerView = this.recyclerView;
        return this.recyclerView.getChildAdapterPosition(tRecyclerView.getChildAt((tRecyclerView.getChildCount() - 1) - this.recyclerView.getFooterViewsCount()));
    }

    private void onRefreshImpl() {
        WidgetInstance widgetInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d612c3", new Object[]{this});
            return;
        }
        for (RecyclerView.ViewHolder viewHolder : ExtentionFunctionKt.findVisibleViewHolderList(this.recyclerView)) {
            if ((viewHolder instanceof ViewHolder) && (widgetInstance = ((ViewHolder) viewHolder).instance) != null) {
                widgetInstance.refreshView();
            }
        }
    }

    private void partUpdate(final List<ResultChange<Object, Integer>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16544414", new Object[]{this, list});
        } else {
            this.recyclerView.post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.list.SectionListWidgetInstanceV2.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    int i = 0;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (SectionListWidgetInstanceV2.access$2000(SectionListWidgetInstanceV2.this) != null) {
                            i = 1;
                        }
                        for (ResultChange resultChange : list) {
                            if (resultChange.getType() == 0) {
                                SectionListWidgetInstanceV2.access$200(SectionListWidgetInstanceV2.this).notifyItemInserted(((Integer) resultChange.getIndex()).intValue() + i);
                            } else if (resultChange.getType() == 1) {
                                SectionListWidgetInstanceV2.access$200(SectionListWidgetInstanceV2.this).notifyItemChanged(((Integer) resultChange.getIndex()).intValue() + i);
                            } else if (resultChange.getType() == 2) {
                                SectionListWidgetInstanceV2.access$200(SectionListWidgetInstanceV2.this).notifyItemRemoved(((Integer) resultChange.getIndex()).intValue() + i);
                            } else if (resultChange.getType() == 5) {
                                SectionListWidgetInstanceV2.access$200(SectionListWidgetInstanceV2.this).notifyItemMoved(((Integer) resultChange.getLastIndex()).intValue() + i, ((Integer) resultChange.getIndex()).intValue() + i);
                            }
                        }
                    } catch (Throwable th) {
                        TLog.loge(SectionListWidgetInstanceV2.TAG, "partUpdate error " + th.getMessage());
                        AppMonitor.Alarm.commitFail("MPMMessage", "TabViewRenderFail", "102", th.getMessage());
                        SectionListWidgetInstanceV2.access$2100(SectionListWidgetInstanceV2.this);
                    }
                }
            });
        }
    }

    private void safeFullUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aa559ac", new Object[]{this});
            return;
        }
        try {
            if (!this.recyclerView.isComputingLayout()) {
                this.adapter.notifyDataSetChanged();
                TLog.loge(TAG, "full update view success ");
            } else {
                this.recyclerView.post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.list.SectionListWidgetInstanceV2.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            if (!SectionListWidgetInstanceV2.access$100(SectionListWidgetInstanceV2.this).isComputingLayout()) {
                                SectionListWidgetInstanceV2.access$200(SectionListWidgetInstanceV2.this).notifyDataSetChanged();
                            } else {
                                TLog.loge(SectionListWidgetInstanceV2.TAG, "full update view fail ,isComputingLayout");
                            }
                        } catch (Throwable th) {
                            AppMonitor.Alarm.commitFail("MPMMessage", "TabViewRenderFail", "101", th.getMessage());
                            TLog.loge(SectionListWidgetInstanceV2.TAG, "full update view,post fail " + th.getMessage());
                        }
                    }
                });
            }
        } catch (Throwable th) {
            AppMonitor.Alarm.commitFail("MPMMessage", "TabViewRenderFail", "100", th.getMessage());
            TLog.loge(TAG, " update view fail " + th.getMessage());
        }
    }

    private void scrollToUnreadTargetPos(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("783a7a10", new Object[]{this, new Integer(i)});
            return;
        }
        ICustomNestedScrollView iCustomNestedScrollView = this.nestedScrollParent;
        if (iCustomNestedScrollView != null) {
            iCustomNestedScrollView.scrollToStickerHeader();
        }
        if (this.isEnableSmoothScroll) {
            LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(this.recyclerView.getContext()) { // from class: com.taobao.message.lab.comfrm.support.list.SectionListWidgetInstanceV2.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/list/SectionListWidgetInstanceV2$6");
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public int getVerticalSnapPreference() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("ecfe2c4b", new Object[]{this})).intValue();
                    }
                    return -1;
                }
            };
            linearSmoothScroller.setTargetPosition(i);
            this.recyclerView.getLayoutManager().startSmoothScroll(linearSmoothScroller);
            return;
        }
        this.layoutManager.scrollToPositionWithOffset(i, 0);
    }

    private void setFooter() {
        ViewObject viewObject;
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70fefaa4", new Object[]{this});
            return;
        }
        WidgetInstance createSlotWidgetIfNotExist = createSlotWidgetIfNotExist("footer");
        if (createSlotWidgetIfNotExist != null && (viewObject = this.renderViewObject) != null && (map = viewObject.children) != null && (map.get("footer") instanceof ViewObject) && (((ViewObject) this.renderViewObject.children.get("footer")).data instanceof JSONObject)) {
            bindSubViewData(createSlotWidgetIfNotExist, "footer");
            if (this.footerView == null && createSlotWidgetIfNotExist.getView() != null) {
                this.footerView = createSlotWidgetIfNotExist.getView();
                this.footerView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                this.recyclerView.addFooterView(0, this.footerView);
            }
        }
    }

    private void setHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92315e96", new Object[]{this});
            return;
        }
        WidgetInstance createSlotWidgetIfNotExist = createSlotWidgetIfNotExist("header");
        this.mHeader = createSlotWidgetIfNotExist;
        if (createSlotWidgetIfNotExist != null) {
            bindSubViewData(createSlotWidgetIfNotExist, "header");
            if (this.headerView == null && this.mHeader.getView() != null) {
                this.headerView = this.mHeader.getView();
                this.headerView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                this.recyclerView.addHeaderView(this.headerView);
            }
        }
    }

    private void statExpose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("700a1fbf", new Object[]{this});
        } else if (this.recyclerView.isAttachedToWindow() && this.recyclerView.getGlobalVisibleRect(this.screenRect)) {
            this.recyclerView.post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.list.SectionListWidgetInstanceV2.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (SectionListWidgetInstanceV2.access$1800(SectionListWidgetInstanceV2.this)) {
                        SectionListWidgetInstanceV2.access$1200(SectionListWidgetInstanceV2.this, "onReady");
                        if (SectionListWidgetInstanceV2.access$1900(SectionListWidgetInstanceV2.this) != null) {
                            int integer = ValueUtil.getInteger(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, c.ATTR_DELAY_TIME, "0"), 0);
                            if (integer > 0) {
                                SectionListWidgetInstanceV2.access$100(SectionListWidgetInstanceV2.this).postDelayed(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.list.SectionListWidgetInstanceV2.5.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        } else {
                                            SectionListWidgetInstanceV2.access$1900(SectionListWidgetInstanceV2.this).prefetch();
                                        }
                                    }
                                }, integer);
                            } else {
                                SectionListWidgetInstanceV2.access$1900(SectionListWidgetInstanceV2.this).prefetch();
                            }
                        }
                        SectionListWidgetInstanceV2.access$1802(SectionListWidgetInstanceV2.this, false);
                    } else {
                        SectionListWidgetInstanceV2.access$1200(SectionListWidgetInstanceV2.this, "onLoad");
                    }
                }
            });
        }
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public View createView(Context context, RenderTemplate renderTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1049360c", new Object[]{this, context, renderTemplate});
        }
        initOrangeConfig();
        TRecyclerView tRecyclerView = new TRecyclerView(context);
        this.recyclerView = tRecyclerView;
        tRecyclerView.setId(R.id.viewCenterSectionList);
        AbsListWidgetInstance.Monitor monitor = new AbsListWidgetInstance.Monitor();
        this.monitor = monitor;
        monitor.abId = ComponentFrmModule.sAbId;
        this.monitor.recyclerItemPrefetchSize = ComponentFrmModule.sItemPrefetchSize;
        this.scrollMonitor = new AbsListWidgetInstance.ScrollMonitor();
        this.recyclerView.setTag(R.id.auraSectionListMonitor, this.monitor);
        initLayoutManager(context);
        initScroll();
        this.recyclerView.setLayoutManager(this.layoutManager);
        this.recyclerView.setItemAnimator(null);
        this.recyclerView.setItemViewCacheSize(0);
        addScrollListener();
        SectionAdapter sectionAdapter = new SectionAdapter();
        this.adapter = sectionAdapter;
        this.recyclerView.setAdapter(sectionAdapter);
        initGapWorker();
        return this.recyclerView;
    }

    public int getCurrentOffsetY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3064865d", new Object[]{this})).intValue();
        }
        return this.currentOffsetY;
    }

    @Override // com.taobao.message.lab.comfrm.support.list.BaseAbsListWidgetInstance
    public WidgetInstance getHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetInstance) ipChange.ipc$dispatch("d761af5b", new Object[]{this});
        }
        return this.mHeader;
    }

    public void scrollerToInitPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca954d5", new Object[]{this});
            return;
        }
        TRecyclerView tRecyclerView = this.recyclerView;
        if (tRecyclerView != null) {
            tRecyclerView.scrollToPosition(0);
        }
    }

    public void setNestedScrollParent(ICustomNestedScrollView iCustomNestedScrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2f5022", new Object[]{this, iCustomNestedScrollView});
        } else {
            this.nestedScrollParent = iCustomNestedScrollView;
        }
    }

    private void executeRender(int i) {
        List<ResultChange<Object, Integer>> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f8b0d1", new Object[]{this, new Integer(i)});
            return;
        }
        Diff diff = this.renderViewObject.diff;
        DeltaItem deltaItem = diff == null ? null : diff.runtimeDiff.get("nodeViewObjects");
        if (deltaItem == null) {
            list = Collections.emptyList();
        } else {
            list = (List) deltaItem.getDataChange();
        }
        int i2 = this.mStatCount;
        if (i2 < 10) {
            this.mStatCount = i2 + 1;
            HashMap hashMap = new HashMap();
            hashMap.put("strategy", String.valueOf(i));
            AppMonitor.Counter.commit("MPMMessage", "ListWidgetInstance", JSON.toJSONString(hashMap), 1.0d);
        }
        TLog.loge(TAG, "view render strategy: " + i + ", allCnt: " + this.adapter.getItemCount() + ", changeCnt: " + list.size() + ", fullReloadCnt: " + this.reloadCount);
        if (i == 0) {
            safeFullUpdate();
        } else if (i == 1) {
            partUpdate(list);
        }
    }

    private void expose(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("519d6355", new Object[]{this, str});
        } else if (this.forgroundVisible || !"onLoad".equals(str)) {
            if ("onLoad".equals(str) || h9z.EVENT_ON_APPEAR.equals(str)) {
                this.lastExporedSet.clear();
            }
            RecyclerView.Adapter adapter = this.adapter;
            if (adapter instanceof SectionAdapter) {
                SectionAdapter sectionAdapter = (SectionAdapter) adapter;
                int firstVisiblePosition = firstVisiblePosition();
                int lastVisiblePosition = lastVisiblePosition();
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (firstVisiblePosition >= 0 && lastVisiblePosition >= firstVisiblePosition) {
                    while (firstVisiblePosition <= lastVisiblePosition) {
                        ViewObject findViewObjectByVisiblePosition = findViewObjectByVisiblePosition(sectionAdapter, firstVisiblePosition);
                        if (findViewObjectByVisiblePosition != null) {
                            hashSet.add(findViewObjectByVisiblePosition);
                            if (!this.lastExporedSet.contains(findViewObjectByVisiblePosition)) {
                                arrayList.add(findViewObjectByVisiblePosition);
                            } else {
                                arrayList2.add(findViewObjectByVisiblePosition);
                            }
                        }
                        firstVisiblePosition++;
                    }
                }
                this.lastExporedSet = hashSet;
                if (!arrayList.isEmpty()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("scene", str);
                    hashMap.put("viewObjects", arrayList);
                    hashMap.put("holdViewObjects", arrayList2);
                    this.eventDispatcher.dispatch(new Event.Build(ListActions.EVENT_EXPOSED).data(hashMap).build());
                }
            }
        }
    }

    public void bindData(JSONObject jSONObject, EventDispatcher eventDispatcher) {
        MPGapWorker mPGapWorker;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b185178e", new Object[]{this, jSONObject, eventDispatcher});
        } else if (!ComponentFrmModule.sDXRefreshAfterScroll || (mPGapWorker = this.gapWorker) == null || mPGapWorker.isInScrollGap()) {
            bindDataImpl(jSONObject, eventDispatcher);
        } else {
            this.eventDispatcher = eventDispatcher;
            this.nextBindData = jSONObject;
            if (this.nextRunnable == null) {
                GapBindDataRunnable gapBindDataRunnable = new GapBindDataRunnable();
                this.nextRunnable = gapBindDataRunnable;
                this.gapWorker.postNextScrollGap(gapBindDataRunnable);
            }
        }
    }

    public void onRefresh(JSONObject jSONObject, EventDispatcher eventDispatcher) {
        MPGapWorker mPGapWorker;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57cd0ab9", new Object[]{this, jSONObject, eventDispatcher});
        } else if (this.recyclerView != null) {
            if (!ComponentFrmModule.sDXRefreshAfterScroll || !this.onRefreshAfterScroll || (mPGapWorker = this.gapWorker) == null || mPGapWorker.isInScrollGap()) {
                onRefreshImpl();
            } else if (this.nextRefreshRunnable == null) {
                Runnable runnable = new Runnable() { // from class: com.taobao.message.lab.comfrm.support.list.SectionListWidgetInstanceV2.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            SectionListWidgetInstanceV2.access$2600(SectionListWidgetInstanceV2.this);
                        }
                    }
                };
                this.nextRefreshRunnable = runnable;
                this.gapWorker.postNextScrollGap(runnable);
            }
        }
    }

    private void handleScroll(JSONObject jSONObject) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58fa5954", new Object[]{this, jSONObject});
            return;
        }
        if (ValueUtil.getInteger(jSONObject, "scrollToUnread", 0) >= 0) {
            int integer = ValueUtil.getInteger(jSONObject, "locatedRowIndex", -1);
            if (integer > -1) {
                scrollToUnreadTargetPos(integer);
            } else {
                String string = ValueUtil.getString(jSONObject, "locatedUnreadUniqueId");
                if (string != null && (this.adapter instanceof SectionAdapter)) {
                    while (true) {
                        if (i >= this.adapter.getItemCount()) {
                            break;
                        }
                        ViewObject findViewObject = ((SectionAdapter) this.adapter).findViewObject(i);
                        Logger.e(TAG, "locatedUnreadUniqueId|" + string + "|index|" + i);
                        if (findViewObject != null && string.equals(findViewObject.uniqueId)) {
                            scrollToUnreadTargetPos(i);
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        this.scrollMonitor.scrollBindDataCount++;
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance, com.taobao.message.lab.comfrm.render.WidgetInterface
    public void postEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3784874", new Object[]{this, event});
            return;
        }
        super.postEvent(event);
        if ("onDisappear".equals(event.getName())) {
            this.forgroundVisible = false;
            MPGapWorker mPGapWorker = this.gapWorker;
            if (mPGapWorker != null) {
                mPGapWorker.pause();
            }
        } else if (h9z.EVENT_ON_APPEAR.equals(event.getName())) {
            this.forgroundVisible = true;
            expose(h9z.EVENT_ON_APPEAR);
            MPGapWorker mPGapWorker2 = this.gapWorker;
            if (mPGapWorker2 != null) {
                mPGapWorker2.resume();
            }
        }
    }

    private int calcRenderStrategy(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed6a151e", new Object[]{this, jSONObject})).intValue();
        }
        if (this.isForceFullUpdate || Build.VERSION.SDK_INT <= 29) {
            return 0;
        }
        int i = this.reloadCount;
        if (i < 2) {
            this.reloadCount = i + 1;
            return 0;
        } else if (TextUtils.equals(jSONObject.getString("enableIncRefresh"), "0")) {
            return 0;
        } else {
            Diff diff = this.renderViewObject.diff;
            if (diff == null) {
                this.reloadCount++;
                return 0;
            }
            DeltaItem deltaItem = diff.runtimeDiff.get("nodeViewObjects");
            if (deltaItem == null) {
                this.reloadCount++;
                return 0;
            }
            List<ResultChange> list = (List) deltaItem.getDataChange();
            if (list == null || list.isEmpty() || list.size() > 8) {
                this.reloadCount++;
                return 0;
            }
            for (ResultChange resultChange : list) {
                int type = resultChange.getType();
                if (type != 0) {
                    if (!(type == 1 || type == 2 || type == 5)) {
                        this.reloadCount++;
                        return 0;
                    }
                } else if (((Integer) resultChange.getIndex()).intValue() == 0) {
                    this.reloadCount++;
                    return 0;
                }
                Logger.e(TAG, "DataChangeType=" + resultChange.getType() + " index=" + resultChange.getIndex());
            }
            return 1;
        }
    }
}
