package com.taobao.message.lab.comfrm.support.list;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.MPGapWorker;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.video.c;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.ComponentFrmModule;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import com.taobao.message.lab.comfrm.util.ExtentionFunctionKt;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.SmoothRecyclerScrollFeature;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
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
public abstract class AbsListWidgetInstance extends BaseAbsListWidgetInstance<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EMPTY = 2;
    public static final String KEY_SECTION_EXPAND = "expand";
    public static final int LOADING = 1;
    public static final int NORMAL = 0;
    public static final String SLOT_EMPTY = "empty";
    public static final String SLOT_FOOTER = "footer";
    public static final String SLOT_HEADER = "header";
    public static final String SLOT_LIST = "content";
    public static final String SLOT_SECTION = "section";
    private static final String TAG = "ListWidgetInstance";
    public static long sScrollUniqueID = 0;
    private RecyclerView.Adapter adapter;
    private boolean bindVHDryNext;
    private int clipFirst;
    private View emptyView;
    private EventDispatcher eventDispatcher;
    private View footerView;
    private MPGapWorker gapWorker;
    private View headerView;
    private LinearLayoutManager layoutManager;
    private WidgetInstance mHeader;
    private Monitor monitor;
    private JSONObject nextBindData;
    private Runnable nextRefreshRunnable;
    private Runnable nextRunnable;
    private boolean onRefreshAfterScroll;
    private TRecyclerView recyclerView;
    private ViewObject renderViewObject;
    private ScrollMonitor scrollMonitor;
    private boolean isFirst = true;
    private Set<ViewObject> lastExporedSet = new HashSet();
    private volatile boolean forgroundVisible = true;
    private List<Runnable> prefectRunnableList = new ArrayList();
    private Rect screenRect = new Rect(0, 0, DisplayUtil.getScreenWidth(), DisplayUtil.getScreenHeight());

    /* compiled from: Taobao */
    /* renamed from: com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance$4  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class AnonymousClass4 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                UIHandler.postDelayed(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance.4.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (AbsListWidgetInstance.access$1400(AbsListWidgetInstance.this)) {
                            AbsListWidgetInstance.access$800(AbsListWidgetInstance.this, "onReady");
                            if (AbsListWidgetInstance.access$1500(AbsListWidgetInstance.this) != null) {
                                int integer = ValueUtil.getInteger(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, c.ATTR_DELAY_TIME, "0"), 1000);
                                if (integer > 0) {
                                    AbsListWidgetInstance.access$100(AbsListWidgetInstance.this).postDelayed(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance.4.1.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            } else {
                                                AbsListWidgetInstance.access$1500(AbsListWidgetInstance.this).prefetch();
                                            }
                                        }
                                    }, integer);
                                } else {
                                    AbsListWidgetInstance.access$1500(AbsListWidgetInstance.this).prefetch();
                                }
                            }
                            AbsListWidgetInstance.access$1402(AbsListWidgetInstance.this, false);
                        } else {
                            AbsListWidgetInstance.access$800(AbsListWidgetInstance.this, "onLoad");
                        }
                    }
                }, 500L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class GapBindDataRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(537919814);
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
            JSONObject access$2200 = AbsListWidgetInstance.access$2200(AbsListWidgetInstance.this);
            AbsListWidgetInstance.access$2202(AbsListWidgetInstance.this, null);
            AbsListWidgetInstance.access$2302(AbsListWidgetInstance.this, null);
            AbsListWidgetInstance absListWidgetInstance = AbsListWidgetInstance.this;
            AbsListWidgetInstance.access$2400(absListWidgetInstance, access$2200, AbsListWidgetInstance.access$600(absListWidgetInstance));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class Monitor {
        public String abId;
        public int recyclerItemPrefetchSize;
        public List<ScrollMonitor> scrollMonitors = new ArrayList();

        static {
            t2o.a(537919815);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class ScrollMonitor {
        public int endScrollPos;
        public long endScrollTime;
        public long exposeEndScrollTime;
        public long flingScrollTime;
        public int scrollBindDataCount;
        public int scrollBindVHCount;
        public int scrollCreateVHCount;
        public int scrollDistance;
        public int scrollFindViewObjectCount;
        public int scrollReBuildSectionCount;
        public long scrollUniqueID;
        public int startScrollPos;
        public long startScrollTime;

        static {
            t2o.a(537919816);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class SimpleAdapter extends RecyclerView.Adapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int nextType = 0;
        public Map<RenderTemplate, Integer> template2Type = new HashMap(2);
        public Map<Integer, RenderTemplate> type2Template = new HashMap(2);

        static {
            t2o.a(537919818);
        }

        public SimpleAdapter() {
        }

        public static /* synthetic */ Object ipc$super(SimpleAdapter simpleAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/list/AbsListWidgetInstance$SimpleAdapter");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            return AbsListWidgetInstance.this.getViewAdapterCount("content");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
            }
            RenderTemplate viewAdapterTemplate = AbsListWidgetInstance.this.getViewAdapterTemplate("content", i);
            Integer num = this.template2Type.get(viewAdapterTemplate);
            if (num == null) {
                int i2 = this.nextType;
                this.nextType = 1 + i2;
                Integer valueOf = Integer.valueOf(i2);
                this.template2Type.put(viewAdapterTemplate, valueOf);
                this.type2Template.put(valueOf, viewAdapterTemplate);
                AbsListWidgetInstance.access$100(AbsListWidgetInstance.this).getRecycledViewPool().setMaxRecycledViews(i2, ComponentFrmModule.sOptSwitchGapWorkerSize + 20);
                num = valueOf;
            }
            return num.intValue();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
                return;
            }
            AbsListWidgetInstance.this.bindViewAdapterData(((ViewHolder) viewHolder).instance, "content", i);
            AbsListWidgetInstance.access$200(AbsListWidgetInstance.this).scrollBindVHCount++;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
            }
            WidgetInstance access$2000 = AbsListWidgetInstance.access$2000(AbsListWidgetInstance.this, this.type2Template.get(Integer.valueOf(i)));
            AbsListWidgetInstance.access$200(AbsListWidgetInstance.this).scrollCreateVHCount++;
            return new ViewHolder(access$2000.getView(), access$2000);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public WidgetInstance instance;

        static {
            t2o.a(537919819);
        }

        public ViewHolder(View view, WidgetInstance widgetInstance) {
            super(view);
            this.instance = widgetInstance;
        }
    }

    static {
        t2o.a(537919803);
    }

    public static /* synthetic */ int access$000(AbsListWidgetInstance absListWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce9cd98f", new Object[]{absListWidgetInstance})).intValue();
        }
        return absListWidgetInstance.clipFirst;
    }

    public static /* synthetic */ TRecyclerView access$100(AbsListWidgetInstance absListWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TRecyclerView) ipChange.ipc$dispatch("8887c4c7", new Object[]{absListWidgetInstance});
        }
        return absListWidgetInstance.recyclerView;
    }

    public static /* synthetic */ List access$1000(AbsListWidgetInstance absListWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b39c3bdc", new Object[]{absListWidgetInstance});
        }
        return absListWidgetInstance.prefectRunnableList;
    }

    public static /* synthetic */ ViewObject access$1100(AbsListWidgetInstance absListWidgetInstance, SectionAdapter sectionAdapter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("6d1152c1", new Object[]{absListWidgetInstance, sectionAdapter, new Integer(i)});
        }
        return absListWidgetInstance.findViewObjectByVisiblePosition(sectionAdapter, i);
    }

    public static /* synthetic */ void access$1200(AbsListWidgetInstance absListWidgetInstance, ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6024a12", new Object[]{absListWidgetInstance, viewObject});
        } else {
            absListWidgetInstance.dryRunSlotWidget(viewObject);
        }
    }

    public static /* synthetic */ boolean access$1400(AbsListWidgetInstance absListWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f7db13", new Object[]{absListWidgetInstance})).booleanValue();
        }
        return absListWidgetInstance.isFirst;
    }

    public static /* synthetic */ boolean access$1402(AbsListWidgetInstance absListWidgetInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c99a367", new Object[]{absListWidgetInstance, new Boolean(z)})).booleanValue();
        }
        absListWidgetInstance.isFirst = z;
        return z;
    }

    public static /* synthetic */ MPGapWorker access$1500(AbsListWidgetInstance absListWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MPGapWorker) ipChange.ipc$dispatch("dafb0b69", new Object[]{absListWidgetInstance});
        }
        return absListWidgetInstance.gapWorker;
    }

    public static /* synthetic */ WidgetInstance access$1600(AbsListWidgetInstance absListWidgetInstance, RenderTemplate renderTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetInstance) ipChange.ipc$dispatch("8a57b02a", new Object[]{absListWidgetInstance, renderTemplate});
        }
        return absListWidgetInstance.createSubView(renderTemplate);
    }

    public static /* synthetic */ boolean access$1700(AbsListWidgetInstance absListWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac1b9016", new Object[]{absListWidgetInstance})).booleanValue();
        }
        return absListWidgetInstance.bindVHDryNext;
    }

    public static /* synthetic */ void access$1800(AbsListWidgetInstance absListWidgetInstance, ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a16b4c", new Object[]{absListWidgetInstance, viewObject});
        } else {
            absListWidgetInstance.dryRunSlotWidget(viewObject);
        }
    }

    public static /* synthetic */ ViewObject access$1900(AbsListWidgetInstance absListWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("dcbe2303", new Object[]{absListWidgetInstance});
        }
        return absListWidgetInstance.getRenderFinishViewObject();
    }

    public static /* synthetic */ ScrollMonitor access$200(AbsListWidgetInstance absListWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollMonitor) ipChange.ipc$dispatch("6991b134", new Object[]{absListWidgetInstance});
        }
        return absListWidgetInstance.scrollMonitor;
    }

    public static /* synthetic */ WidgetInstance access$2000(AbsListWidgetInstance absListWidgetInstance, RenderTemplate renderTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetInstance) ipChange.ipc$dispatch("d1917931", new Object[]{absListWidgetInstance, renderTemplate});
        }
        return absListWidgetInstance.createSubView(renderTemplate);
    }

    public static /* synthetic */ ScrollMonitor access$202(AbsListWidgetInstance absListWidgetInstance, ScrollMonitor scrollMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollMonitor) ipChange.ipc$dispatch("c9581a76", new Object[]{absListWidgetInstance, scrollMonitor});
        }
        absListWidgetInstance.scrollMonitor = scrollMonitor;
        return scrollMonitor;
    }

    public static /* synthetic */ void access$2100(AbsListWidgetInstance absListWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c451f2b", new Object[]{absListWidgetInstance});
        } else {
            absListWidgetInstance.onRefreshImpl();
        }
    }

    public static /* synthetic */ JSONObject access$2200(AbsListWidgetInstance absListWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("70c014c", new Object[]{absListWidgetInstance});
        }
        return absListWidgetInstance.nextBindData;
    }

    public static /* synthetic */ JSONObject access$2202(AbsListWidgetInstance absListWidgetInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ed8bf22", new Object[]{absListWidgetInstance, jSONObject});
        }
        absListWidgetInstance.nextBindData = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ Runnable access$2302(AbsListWidgetInstance absListWidgetInstance, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("202af3c7", new Object[]{absListWidgetInstance, runnable});
        }
        absListWidgetInstance.nextRunnable = runnable;
        return runnable;
    }

    public static /* synthetic */ void access$2400(AbsListWidgetInstance absListWidgetInstance, JSONObject jSONObject, EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8911ee", new Object[]{absListWidgetInstance, jSONObject, eventDispatcher});
        } else {
            absListWidgetInstance.bindDataImpl(jSONObject, eventDispatcher);
        }
    }

    public static /* synthetic */ int access$300(AbsListWidgetInstance absListWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23c08e92", new Object[]{absListWidgetInstance})).intValue();
        }
        return absListWidgetInstance.firstVisiblePosition();
    }

    public static /* synthetic */ int access$400(AbsListWidgetInstance absListWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eacc7593", new Object[]{absListWidgetInstance})).intValue();
        }
        return absListWidgetInstance.lastVisiblePosition();
    }

    public static /* synthetic */ int access$500(AbsListWidgetInstance absListWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1d85c94", new Object[]{absListWidgetInstance})).intValue();
        }
        return absListWidgetInstance.getHeaderViewsCount();
    }

    public static /* synthetic */ EventDispatcher access$600(AbsListWidgetInstance absListWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventDispatcher) ipChange.ipc$dispatch("40b9ea20", new Object[]{absListWidgetInstance});
        }
        return absListWidgetInstance.eventDispatcher;
    }

    public static /* synthetic */ RecyclerView.Adapter access$700(AbsListWidgetInstance absListWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.Adapter) ipChange.ipc$dispatch("4f9798df", new Object[]{absListWidgetInstance});
        }
        return absListWidgetInstance.adapter;
    }

    public static /* synthetic */ void access$800(AbsListWidgetInstance absListWidgetInstance, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54659a6e", new Object[]{absListWidgetInstance, str});
        } else {
            absListWidgetInstance.expose(str);
        }
    }

    public static /* synthetic */ Monitor access$900(AbsListWidgetInstance absListWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Monitor) ipChange.ipc$dispatch("c94976a0", new Object[]{absListWidgetInstance});
        }
        return absListWidgetInstance.monitor;
    }

    private ViewObject findViewObjectByVisiblePosition(SectionAdapter sectionAdapter, int i) {
        WidgetInstance widgetInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("223ee0c3", new Object[]{this, sectionAdapter, new Integer(i)});
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

    private int firstCurrentVisiblePosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8c3b4c", new Object[]{this})).intValue();
        }
        return this.layoutManager.findFirstVisibleItemPosition();
    }

    private int firstVisiblePosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9c6a1e5", new Object[]{this})).intValue();
        }
        return this.recyclerView.getChildAdapterPosition(this.recyclerView.getChildAt(0));
    }

    private int getFooterViewsCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68376a2c", new Object[]{this})).intValue();
        }
        return this.recyclerView.getFooterViewsCount();
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

    public static /* synthetic */ Object ipc$super(AbsListWidgetInstance absListWidgetInstance, String str, Object... objArr) {
        if (str.hashCode() == -1283962764) {
            super.postEvent((Event) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/list/AbsListWidgetInstance");
    }

    private int lastCurrentVisiblePosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe8447b2", new Object[]{this})).intValue();
        }
        return this.layoutManager.findLastVisibleItemPosition();
    }

    private int lastVisiblePosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30db1c3f", new Object[]{this})).intValue();
        }
        TRecyclerView tRecyclerView = this.recyclerView;
        return this.recyclerView.getChildAdapterPosition(tRecyclerView.getChildAt((tRecyclerView.getChildCount() - 1) - this.recyclerView.getFooterViewsCount()));
    }

    private void notifyDataChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd821ca8", new Object[]{this});
            return;
        }
        try {
            this.adapter.notifyDataSetChanged();
        } catch (Throwable th) {
            Logger.e(TAG, "notifyDataChanged error " + th.getMessage());
        }
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

    public void bindViewAdapterData(WidgetInstance widgetInstance, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("180395b6", new Object[]{this, widgetInstance, str, new Integer(i)});
        } else {
            widgetInstance.bindViewObject((ViewObject) ((List) getRenderFinishViewObject().children.get(str)).get(i), this.eventDispatcher);
        }
    }

    public abstract boolean enableSection();

    @Override // com.taobao.message.lab.comfrm.support.list.BaseAbsListWidgetInstance
    public WidgetInstance getHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetInstance) ipChange.ipc$dispatch("d761af5b", new Object[]{this});
        }
        return this.mHeader;
    }

    public int getViewAdapterCount(String str) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("afce09ff", new Object[]{this, str})).intValue();
        }
        ViewObject renderFinishViewObject = getRenderFinishViewObject();
        if (renderFinishViewObject == null || (list = (List) renderFinishViewObject.children.get(str)) == null) {
            return 0;
        }
        return list.size();
    }

    public RenderTemplate getViewAdapterTemplate(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderTemplate) ipChange.ipc$dispatch("379751fe", new Object[]{this, str, new Integer(i)});
        }
        return ((ViewObject) ((List) getRenderFinishViewObject().children.get(str)).get(i)).info.renderTemplate;
    }

    public abstract boolean isEmpty(JSONObject jSONObject);

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
            t2o.a(537919817);
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/list/AbsListWidgetInstance$SectionAdapter");
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
                AbsListWidgetInstance.access$100(AbsListWidgetInstance.this).getRecycledViewPool().setMaxRecycledViews(i2, ComponentFrmModule.sOptSwitchGapWorkerSize + 20);
                num = valueOf;
            }
            return num.intValue();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ViewObject findViewObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
                return;
            }
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            ViewObject findViewObject2 = findViewObject(i);
            if (AbsListWidgetInstance.access$1700(AbsListWidgetInstance.this) && (findViewObject = findViewObject(i + 3)) != null) {
                AbsListWidgetInstance.access$1800(AbsListWidgetInstance.this, findViewObject);
            }
            viewHolder2.instance.bindViewObject(findViewObject2, AbsListWidgetInstance.access$600(AbsListWidgetInstance.this));
            AbsListWidgetInstance.access$200(AbsListWidgetInstance.this).scrollBindVHCount++;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
            }
            WidgetInstance access$1600 = AbsListWidgetInstance.access$1600(AbsListWidgetInstance.this, this.type2Template.get(Integer.valueOf(i)));
            AbsListWidgetInstance.access$200(AbsListWidgetInstance.this).scrollCreateVHCount++;
            return new ViewHolder(access$1600.getView(), access$1600);
        }

        private void build() {
            List list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac6c63f5", new Object[]{this});
                return;
            }
            ViewObject access$1900 = AbsListWidgetInstance.access$1900(AbsListWidgetInstance.this);
            if (access$1900 != this.lastViewObject) {
                this.lastViewObject = access$1900;
                this.count = 0;
                if (!(access$1900 == null || (list = (List) access$1900.children.get("section")) == null)) {
                    AbsListWidgetInstance.access$200(AbsListWidgetInstance.this).scrollReBuildSectionCount++;
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
                    Logger.ftl(new Logger.FormatLog.Builder().type(2).module(16).point(2001).ext("count", String.valueOf(this.count)).build());
                }
            }
        }

        public ViewObject findViewObject(int i) {
            ViewObject viewObject;
            ViewObject viewObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewObject) ipChange.ipc$dispatch("6aab524e", new Object[]{this, new Integer(i)});
            }
            AbsListWidgetInstance.access$200(AbsListWidgetInstance.this).scrollFindViewObjectCount++;
            int i2 = 0;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            while (true) {
                int[] iArr = this.index;
                if (i2 >= iArr.length) {
                    break;
                }
                int i6 = i2 == 0 ? 0 : iArr[i2 - 1];
                int i7 = iArr[i2];
                if (i >= i6 && i < i7) {
                    i4 = i - i6;
                    i3 = i2;
                    i5 = i7;
                }
                i2++;
            }
            if (i3 >= 0) {
                List list = (List) AbsListWidgetInstance.access$1900(AbsListWidgetInstance.this).children.get("section");
                ViewObject viewObject3 = i3 < list.size() ? (ViewObject) list.get(i3) : null;
                if (viewObject3 != null) {
                    viewObject2 = (ViewObject) viewObject3.children.get("header");
                    viewObject = (ViewObject) viewObject3.children.get("footer");
                } else {
                    viewObject2 = null;
                    viewObject = null;
                }
                List list2 = (List) viewObject3.children.get("content");
                if (viewObject2 != null && i4 == 0) {
                    return viewObject2;
                }
                if (viewObject != null && i4 == i5 - 1) {
                    return viewObject;
                }
                if (list2 != null) {
                    if (viewObject2 != null) {
                        i4--;
                    }
                    if (i4 < list2.size()) {
                        return (ViewObject) list2.get(i4);
                    }
                    Logger.e(AbsListWidgetInstance.TAG, "findViewObject|error|dataOffset|" + i4 + "|itemList|" + list2.size());
                }
            }
            return null;
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
                Runnable runnable = new Runnable() { // from class: com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            AbsListWidgetInstance.access$2100(AbsListWidgetInstance.this);
                        }
                    }
                };
                this.nextRefreshRunnable = runnable;
                this.gapWorker.postNextScrollGap(runnable);
            }
        }
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public View createView(Context context, RenderTemplate renderTemplate) {
        RecyclerView.Adapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1049360c", new Object[]{this, context, renderTemplate});
        }
        TRecyclerView tRecyclerView = new TRecyclerView(context);
        this.recyclerView = tRecyclerView;
        tRecyclerView.setId(R.id.viewCenterSectionList);
        this.recyclerView.setHasFixedSize(true);
        Monitor monitor = new Monitor();
        this.monitor = monitor;
        monitor.abId = ComponentFrmModule.sAbId;
        this.monitor.recyclerItemPrefetchSize = ComponentFrmModule.sItemPrefetchSize;
        this.scrollMonitor = new ScrollMonitor();
        this.recyclerView.setTag(R.id.auraSectionListMonitor, this.monitor);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context) { // from class: com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == -579854207) {
                    super.onLayoutCompleted((RecyclerView.State) objArr[0]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/list/AbsListWidgetInstance$1");
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
                if (AbsListWidgetInstance.access$000(AbsListWidgetInstance.this) == 1) {
                    int headerViewsCount = AbsListWidgetInstance.access$100(AbsListWidgetInstance.this).getHeaderViewsCount();
                    while (headerViewsCount < AbsListWidgetInstance.access$100(AbsListWidgetInstance.this).getAdapter().getItemCount() - AbsListWidgetInstance.access$100(AbsListWidgetInstance.this).getFooterViewsCount() && headerViewsCount < state.getItemCount() && (findViewHolderForAdapterPosition = AbsListWidgetInstance.access$100(AbsListWidgetInstance.this).findViewHolderForAdapterPosition(headerViewsCount)) != null) {
                        if (findViewHolderForAdapterPosition.itemView.getHeight() != 0) {
                            break;
                        }
                        headerViewsCount++;
                    }
                    headerViewsCount = 0;
                    for (int i = 0; i < AbsListWidgetInstance.access$100(AbsListWidgetInstance.this).getChildCount(); i++) {
                        final View childAt = AbsListWidgetInstance.access$100(AbsListWidgetInstance.this).getChildAt(i);
                        if (AbsListWidgetInstance.access$100(AbsListWidgetInstance.this).getChildAdapterPosition(childAt) == headerViewsCount) {
                            childAt.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                public static /* synthetic */ Object ipc$super(C06091 r2, String str, Object... objArr) {
                                    str.hashCode();
                                    int hashCode = str.hashCode();
                                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/list/AbsListWidgetInstance$1$1");
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
        } else {
            this.layoutManager.setItemPrefetchEnabled(false);
        }
        try {
            int intValue = Integer.valueOf(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "smoothRecyclerScrollLeft", "2")).intValue();
            if (intValue >= 0 && c21.g().getInt("deviceLevel", -1) >= intValue) {
                this.recyclerView.addFeature(new SmoothRecyclerScrollFeature());
            }
        } catch (Throwable unused) {
        }
        this.recyclerView.setLayoutManager(this.layoutManager);
        this.recyclerView.setItemAnimator(null);
        this.recyclerView.setItemViewCacheSize(0);
        this.recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance.2
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private boolean isScrollUp = false;
            private long exposeTime = 0;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/list/AbsListWidgetInstance$2");
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
                    AbsListWidgetInstance.access$800(AbsListWidgetInstance.this, "onScrolling");
                }
                AbsListWidgetInstance.access$200(AbsListWidgetInstance.this).scrollDistance += Math.abs(i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                } else if (i == 0) {
                    AbsListWidgetInstance.access$200(AbsListWidgetInstance.this).endScrollTime = SystemClock.uptimeMillis();
                    int access$300 = AbsListWidgetInstance.access$300(AbsListWidgetInstance.this);
                    int access$400 = AbsListWidgetInstance.access$400(AbsListWidgetInstance.this);
                    if (!this.isScrollUp) {
                        if (access$300 == AbsListWidgetInstance.access$500(AbsListWidgetInstance.this)) {
                            AbsListWidgetInstance.access$600(AbsListWidgetInstance.this).dispatch(new Event.Build(ListActions.EVENT_PULL_DOWN).build());
                        }
                    } else if (access$400 == AbsListWidgetInstance.access$700(AbsListWidgetInstance.this).getItemCount() - 1) {
                        AbsListWidgetInstance.access$600(AbsListWidgetInstance.this).dispatch(new Event.Build(ListActions.EVENT_PULL_UP).build());
                    }
                    AbsListWidgetInstance.access$800(AbsListWidgetInstance.this, "onEndScrolling");
                    AbsListWidgetInstance.access$200(AbsListWidgetInstance.this).exposeEndScrollTime = SystemClock.uptimeMillis();
                    AbsListWidgetInstance.access$200(AbsListWidgetInstance.this).endScrollPos = access$300;
                } else if (i == 2) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.exposeTime = SystemClock.uptimeMillis();
                    AbsListWidgetInstance.access$200(AbsListWidgetInstance.this).flingScrollTime = uptimeMillis;
                } else if (i == 1) {
                    if (AbsListWidgetInstance.access$900(AbsListWidgetInstance.this).scrollMonitors.size() > 8) {
                        AbsListWidgetInstance.access$900(AbsListWidgetInstance.this).scrollMonitors.remove(0);
                    }
                    AbsListWidgetInstance.access$202(AbsListWidgetInstance.this, new ScrollMonitor());
                    AbsListWidgetInstance.access$900(AbsListWidgetInstance.this).scrollMonitors.add(AbsListWidgetInstance.access$200(AbsListWidgetInstance.this));
                    ScrollMonitor access$200 = AbsListWidgetInstance.access$200(AbsListWidgetInstance.this);
                    long j = AbsListWidgetInstance.sScrollUniqueID + 1;
                    AbsListWidgetInstance.sScrollUniqueID = j;
                    access$200.scrollUniqueID = j;
                    AbsListWidgetInstance.access$200(AbsListWidgetInstance.this).startScrollTime = SystemClock.uptimeMillis();
                    AbsListWidgetInstance.access$200(AbsListWidgetInstance.this).startScrollPos = AbsListWidgetInstance.access$300(AbsListWidgetInstance.this);
                }
            }
        });
        if (enableSection()) {
            adapter = new SectionAdapter();
        } else {
            adapter = new SimpleAdapter();
        }
        this.adapter = adapter;
        this.recyclerView.setAdapter(adapter);
        int i = ComponentFrmModule.sOptSwitchGapWorkerSize;
        if (MPGapWorker.isAllowThreadGapWork() && i > 0) {
            MPGapWorker mPGapWorker = new MPGapWorker();
            this.gapWorker = mPGapWorker;
            mPGapWorker.attach(this.recyclerView, i);
            if (ComponentFrmModule.sDXEnginePrefetch && (this.adapter instanceof SectionAdapter)) {
                this.gapWorker.setResetRangePrefetchListener(new MPGapWorker.ResetRangePrefetchListener() { // from class: com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // androidx.appcompat.widget.MPGapWorker.ResetRangePrefetchListener
                    public void resetRangePrefetch(final int i2, int i3, int i4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("67bf3d7", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4)});
                            return;
                        }
                        for (Runnable runnable : AbsListWidgetInstance.access$1000(AbsListWidgetInstance.this)) {
                            UIHandler.removeCallbacks(runnable);
                        }
                        AbsListWidgetInstance.access$1000(AbsListWidgetInstance.this).clear();
                        while (i2 < i3) {
                            Runnable runnable2 = new Runnable() { // from class: com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance.3.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (i2 < AbsListWidgetInstance.access$100(AbsListWidgetInstance.this).getAdapter().getItemCount()) {
                                        AbsListWidgetInstance absListWidgetInstance = AbsListWidgetInstance.this;
                                        ViewObject access$1100 = AbsListWidgetInstance.access$1100(absListWidgetInstance, (SectionAdapter) AbsListWidgetInstance.access$700(absListWidgetInstance), i2);
                                        if (access$1100 != null) {
                                            AbsListWidgetInstance.access$1200(AbsListWidgetInstance.this, access$1100);
                                        }
                                    }
                                }
                            };
                            AbsListWidgetInstance.access$1000(AbsListWidgetInstance.this).add(runnable2);
                            UIHandler.postDelayed(runnable2, 0L);
                            i2++;
                        }
                    }
                });
            }
        }
        this.onRefreshAfterScroll = "1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "onRefreshAfterScroll", "1"));
        this.bindVHDryNext = "1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "bindVHDryNext", "1"));
        return this.recyclerView;
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

    private void bindDataImpl(JSONObject jSONObject, EventDispatcher eventDispatcher) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c5f4ce", new Object[]{this, jSONObject, eventDispatcher});
            return;
        }
        if (this.isFirst) {
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
        this.renderViewObject = getViewObject();
        this.clipFirst = ValueUtil.getInteger(jSONObject, "clipFirst", 0);
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
        if (isEmpty(jSONObject)) {
            WidgetInstance createSlotWidgetIfNotExist2 = createSlotWidgetIfNotExist("footer");
            if (createSlotWidgetIfNotExist2 != null) {
                bindSubViewData(createSlotWidgetIfNotExist2, "footer");
                if (this.footerView == null && createSlotWidgetIfNotExist2.getView() != null) {
                    this.footerView = createSlotWidgetIfNotExist2.getView();
                    this.footerView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    this.recyclerView.removeFooterView(this.footerView);
                    this.recyclerView.addFooterView(0, this.footerView);
                }
                View view = this.footerView;
                if (view != null) {
                    view.setVisibility(0);
                }
            }
        } else {
            View view2 = this.footerView;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        notifyDataChanged();
        this.eventDispatcher = eventDispatcher;
        if (this.recyclerView.isAttachedToWindow() && this.recyclerView.getGlobalVisibleRect(this.screenRect)) {
            this.recyclerView.post(new AnonymousClass4());
        }
        if (ValueUtil.getInteger(jSONObject, "scrollToUnread", 0) >= 0 && (string = ValueUtil.getString(jSONObject, "locatedUnreadUniqueId")) != null && (this.adapter instanceof SectionAdapter)) {
            for (int i2 = 0; i2 < this.adapter.getItemCount(); i2++) {
                ViewObject findViewObject2 = ((SectionAdapter) this.adapter).findViewObject(i2);
                Logger.e(TAG, "locatedUnreadUniqueId|" + string + "|index|" + i2);
                if (findViewObject2 != null && string.equals(findViewObject2.uniqueId)) {
                    if ("1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "useLinearSmooth", "0"))) {
                        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(this.recyclerView.getContext()) { // from class: com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance.5
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
                                str.hashCode();
                                int hashCode = str.hashCode();
                                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/list/AbsListWidgetInstance$5");
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
                        linearSmoothScroller.setTargetPosition(i2);
                        this.recyclerView.getLayoutManager().startSmoothScroll(linearSmoothScroller);
                    } else {
                        this.layoutManager.scrollToPositionWithOffset(i2, 0);
                    }
                }
            }
        }
        this.scrollMonitor.scrollBindDataCount++;
    }
}
