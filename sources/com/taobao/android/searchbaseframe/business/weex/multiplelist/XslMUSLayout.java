package com.taobao.android.searchbaseframe.business.weex.multiplelist;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.xsl.module.XslDatasource;
import com.taobao.android.searchbaseframe.xsl.module.XslModule;
import com.taobao.android.searchbaseframe.xsl.module.XslSearchResult;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import tb.c4p;
import tb.dwh;
import tb.fxh;
import tb.gy;
import tb.oox;
import tb.rb;
import tb.rox;
import tb.sox;
import tb.t2o;
import tb.tee;
import tb.vee;
import tb.wee;
import tb.x96;
import tb.y5p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class XslMUSLayout extends FrameLayout implements XslModule.f, vee {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EVENT_COMBO_LOAD_MORE = "comboloadmore";
    private com.taobao.android.weex_framework.a instance;
    private boolean nestedMod;
    private int nodeId;
    private XslModule recommendModule;
    private d scrollAction;
    private List<ScrollRangeEventItem> scrollRangeEventItems;
    private rox stats;
    private XslMUSComponent target;
    private boolean sticky = false;
    private int currentIndex = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements tee {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void b(int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c1eb5590", new Object[]{this, new Integer(i), new Integer(i2), str});
            } else if (XslMUSLayout.access$000(XslMUSLayout.this, XslMUSComponent.EVENT_ITEM_DISAPPEAR)) {
                XslMUSLayout xslMUSLayout = XslMUSLayout.this;
                XslMUSLayout.access$200(xslMUSLayout, XslMUSComponent.EVENT_ITEM_DISAPPEAR, XslMUSLayout.access$100(xslMUSLayout, i, i2, str));
            }
        }

        public void c(int i, int i2, int i3, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa5b5b1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Long(j)});
            } else if (XslMUSLayout.access$000(XslMUSLayout.this, XslMUSLayout.EVENT_COMBO_LOAD_MORE)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("index", (Object) String.valueOf(i3));
                jSONObject.put("tabIndex", (Object) String.valueOf(i2));
                jSONObject.put("id", (Object) Long.valueOf(j));
                jSONObject.put("speedRatio", (Object) String.valueOf(i2));
                jSONObject.put(TBImageFlowMonitor.SPEED_MEASURE, (Object) Float.valueOf(i / ((Activity) XslMUSLayout.this.getContext()).getWindow().getDecorView().getMeasuredHeight()));
                XslMUSLayout.access$200(XslMUSLayout.this, XslMUSLayout.EVENT_COMBO_LOAD_MORE, jSONObject);
            }
        }

        public void a(int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b950d2d2", new Object[]{this, new Integer(i), new Integer(i2), str});
                return;
            }
            if (XslMUSLayout.access$000(XslMUSLayout.this, XslMUSComponent.EVENT_ITEM_APPEAR)) {
                XslMUSLayout xslMUSLayout = XslMUSLayout.this;
                XslMUSLayout.access$200(xslMUSLayout, XslMUSComponent.EVENT_ITEM_APPEAR, XslMUSLayout.access$100(xslMUSLayout, i, i2, str));
            }
            if (XslMUSLayout.access$300(XslMUSLayout.this) != null && XslMUSLayout.access$300(XslMUSLayout.this).b > 0 && XslMUSLayout.access$300(XslMUSLayout.this).f9337a == i) {
                XslMUSLayout.access$400(XslMUSLayout.this).w("list", XslMUSLayout.access$300(XslMUSLayout.this).b, false, XslMUSLayout.access$300(XslMUSLayout.this).c);
                XslMUSLayout.access$302(XslMUSLayout.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements wee {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(int i, int i2, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c78f517e", new Object[]{this, new Integer(i), new Integer(i2), new Long(j)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tabIndex", (Object) String.valueOf(i));
            jSONObject.put("index", (Object) String.valueOf(i2));
            jSONObject.put("id", (Object) Long.valueOf(j));
            XslMUSLayout.access$200(XslMUSLayout.this, XslMUSComponent.EVENT_SECTION_STICKY_CHANGE, jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements XslModule.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e265db21", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tabIndex", (Object) Integer.valueOf(i));
            jSONObject.put("page", (Object) Integer.valueOf(i2));
            XslMUSLayout.access$500(XslMUSLayout.this, "paging", jSONObject);
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1dbaabf", new Object[]{this, new Integer(i)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tabIndex", (Object) Integer.valueOf(i));
            XslMUSLayout.access$500(XslMUSLayout.this, "beforetabrequest", jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f9337a;
        public final int b;
        public final int c;

        static {
            t2o.a(993001717);
        }

        public d(int i, int i2, int i3) {
            this.f9337a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    static {
        t2o.a(993001713);
        t2o.a(993002055);
        t2o.a(993002068);
    }

    public XslMUSLayout(Context context) {
        super(context);
        if (context instanceof sox) {
            this.stats = ((sox) context).e2();
        }
    }

    public static /* synthetic */ boolean access$000(XslMUSLayout xslMUSLayout, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ec2609c", new Object[]{xslMUSLayout, str})).booleanValue();
        }
        return xslMUSLayout.hasEvent(str);
    }

    public static /* synthetic */ JSONObject access$100(XslMUSLayout xslMUSLayout, int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f186e3d9", new Object[]{xslMUSLayout, new Integer(i), new Integer(i2), str});
        }
        return xslMUSLayout.assembleExposeData(i, i2, str);
    }

    public static /* synthetic */ void access$200(XslMUSLayout xslMUSLayout, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342c1e96", new Object[]{xslMUSLayout, str, jSONObject});
        } else {
            xslMUSLayout.fireWithoutCheck(str, jSONObject);
        }
    }

    public static /* synthetic */ d access$300(XslMUSLayout xslMUSLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("20a58958", new Object[]{xslMUSLayout});
        }
        return xslMUSLayout.scrollAction;
    }

    public static /* synthetic */ d access$302(XslMUSLayout xslMUSLayout, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("d40201eb", new Object[]{xslMUSLayout, dVar});
        }
        xslMUSLayout.scrollAction = dVar;
        return dVar;
    }

    public static /* synthetic */ XslModule access$400(XslMUSLayout xslMUSLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XslModule) ipChange.ipc$dispatch("539d7e3d", new Object[]{xslMUSLayout});
        }
        return xslMUSLayout.recommendModule;
    }

    public static /* synthetic */ void access$500(XslMUSLayout xslMUSLayout, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238fd873", new Object[]{xslMUSLayout, str, jSONObject});
        } else {
            xslMUSLayout.fire(str, jSONObject);
        }
    }

    private JSONObject assembleExposeData(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d84551", new Object[]{this, new Integer(i), new Integer(i2), str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("index", (Object) String.valueOf(i2));
        jSONObject.put("tabIndex", (Object) String.valueOf(i));
        jSONObject.put("group", (Object) str);
        return jSONObject;
    }

    private void fire(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca91b89", new Object[]{this, str, jSONObject});
            return;
        }
        XslMUSComponent xslMUSComponent = this.target;
        if (xslMUSComponent != null && xslMUSComponent.hasEvent(str)) {
            fireWithoutCheck(str, jSONObject);
        }
    }

    private void fireEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f0e3fb", new Object[]{this, str, jSONObject});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.instance;
        if (aVar != null) {
            aVar.fireEventOnNode(this.nodeId, str, jSONObject);
        }
    }

    private void fireWithoutCheck(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d9b6f49", new Object[]{this, str, jSONObject});
        } else {
            fireEvent(str, jSONObject);
        }
    }

    private int getPaddingValue(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8430a9b0", new Object[]{this, jSONObject, str})).intValue() : getPaddingValue(jSONObject, str, 0);
    }

    private boolean hasEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d65e2b5", new Object[]{this, str})).booleanValue();
        }
        XslMUSComponent xslMUSComponent = this.target;
        if (xslMUSComponent == null || !xslMUSComponent.hasEvent(str)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(XslMUSLayout xslMUSLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/business/weex/multiplelist/XslMUSLayout");
    }

    private void setRequestApi(JSONObject jSONObject, XslDatasource xslDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef238826", new Object[]{this, jSONObject, xslDatasource});
            return;
        }
        String string = jSONObject.getString("api");
        String string2 = jSONObject.getString("version");
        String string3 = jSONObject.getString("alias");
        if (xslDatasource == null) {
            return;
        }
        if (TextUtils.isEmpty(string3)) {
            xslDatasource.setApi(string, string2);
        } else {
            xslDatasource.setApi(string, string2, string3);
        }
    }

    public void appendListItems(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb6caa2", new Object[]{this, jSONObject, new Integer(i)});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(jSONObject);
        jSONObject2.put("result", (Object) jSONArray);
        this.recommendModule.b(i, jSONObject2);
    }

    public void endRefresh(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b040e9dc", new Object[]{this, new Integer(i)});
            return;
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule != null) {
            xslModule.k(i);
        }
    }

    public void insertListItems(JSONObject jSONObject, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a539640", new Object[]{this, jSONObject, new Integer(i), new Integer(i2)});
        } else {
            this.recommendModule.p(i, i2, jSONObject);
        }
    }

    public boolean isNestedMod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59dbb48c", new Object[]{this})).booleanValue();
        }
        return this.nestedMod;
    }

    public boolean isReachBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37b2447f", new Object[]{this})).booleanValue();
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule == null) {
            return true;
        }
        return xslModule.s();
    }

    public boolean isReachTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36ef4cb7", new Object[]{this})).booleanValue();
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule == null) {
            return true;
        }
        return xslModule.t();
    }

    public void jumpTo(String str, int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9943b198", new Object[]{this, str, new Integer(i), new Boolean(z), new Integer(i2)});
            return;
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule != null) {
            xslModule.w(str, i, z, i2);
        }
    }

    public void jumpToTop(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48495dc2", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule != null) {
            xslModule.x(z, i);
        }
    }

    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule != null) {
            xslModule.z();
        }
    }

    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule != null) {
            xslModule.A();
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.f
    public void onDataLoaded(gy<?, ?, ?> gyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d7c349", new Object[]{this, gyVar});
            return;
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule != null) {
            if (xslModule.o() != null) {
                XslDatasource xslDatasource = (XslDatasource) gyVar;
                int currentTabIndex = xslDatasource.getCurrentTabIndex();
                if (!this.recommendModule.r()) {
                    XslSearchResult xslSearchResult = (XslSearchResult) xslDatasource.getLastSearchResult();
                    JSONObject jSONObject = new JSONObject();
                    if (xslSearchResult == null) {
                        jSONObject.put("data", (Object) new JSONObject());
                    } else if (xslSearchResult.getCurrentData() != null) {
                        jSONObject.put("data", (Object) xslSearchResult.getCurrentData());
                    } else {
                        jSONObject.put("data", (Object) new JSONObject());
                        JSONArray jSONArray = new JSONArray();
                        if (xslSearchResult.getError() != null) {
                            jSONArray.add(xslSearchResult.getError().getErrorMsg());
                        }
                        jSONObject.put(rb.RESULT_KEY, (Object) jSONArray);
                    }
                    jSONObject.put("tabIndex", (Object) Integer.valueOf(currentTabIndex));
                    fireEvent(XslMUSComponent.EVENT_DATA_LOADED, jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("tabIndex", (Object) Integer.valueOf(currentTabIndex));
                fireEvent(XslMUSComponent.EVENT_DATA_RENDERED, jSONObject2);
            }
            if (this.stats != null) {
                y5p firstRequestPerf = gyVar.getFirstRequestPerf();
                this.stats.k(firstRequestPerf.f);
                this.stats.p((int) firstRequestPerf.s);
                this.stats.d(System.currentTimeMillis());
            }
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.f
    public void onDataLoadedMeta(gy<?, ?, ?> gyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d947484", new Object[]{this, gyVar});
            return;
        }
        XslDatasource xslDatasource = (XslDatasource) gyVar;
        int currentTabIndex = xslDatasource.getCurrentTabIndex();
        XslSearchResult xslSearchResult = (XslSearchResult) xslDatasource.getLastSearchResult();
        JSONObject jSONObject = new JSONObject();
        if (xslSearchResult == null) {
            jSONObject.put("data", (Object) new JSONObject());
        } else if (xslSearchResult.getCurrentData() != null) {
            jSONObject.put("data", (Object) xslSearchResult.getCurrentData());
        } else {
            jSONObject.put("data", (Object) new JSONObject());
            JSONArray jSONArray = new JSONArray();
            if (xslSearchResult.getError() != null) {
                jSONArray.add(xslSearchResult.getError().getErrorMsg());
            }
            jSONObject.put(rb.RESULT_KEY, (Object) jSONArray);
        }
        jSONObject.put("tabIndex", (Object) Integer.valueOf(currentTabIndex));
        fireEvent(XslMUSComponent.EVENT_DATA_LOADED, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("tabIndex", (Object) Integer.valueOf(currentTabIndex));
        fireEvent(XslMUSComponent.EVENT_DATA_RENDERED, jSONObject2);
        if (this.stats != null) {
            y5p firstRequestPerf = gyVar.getFirstRequestPerf();
            if (firstRequestPerf != null) {
                this.stats.k(firstRequestPerf.f);
                this.stats.p((int) firstRequestPerf.s);
            }
            this.stats.d(System.currentTimeMillis());
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.f
    public void onPageScrollStateChange(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e481c", new Object[]{this, new Boolean(z), new Integer(i)});
        } else if ((z && this.target.hasEvent("scrollstart")) || (!z && this.target.hasEvent("scrollend"))) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tabIndex", (Object) String.valueOf(this.currentIndex));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("x", (Object) "0");
            jSONObject2.put("y", (Object) String.valueOf(i));
            jSONObject.put(Constants.Name.CONTENT_OFFSET, (Object) jSONObject2);
            if (z) {
                fireEvent("scrollstart", jSONObject);
            } else {
                fireEvent("scrollend", jSONObject);
            }
        }
    }

    @Override // tb.vee
    public void onPullRefreshTrigger(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9733bb", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tabIndex", (Object) String.valueOf(i));
        fireEvent(XslMUSComponent.EVENT_PULL_DOWN_REFRESH, jSONObject);
    }

    @Override // tb.vee
    public void onReachTopTrigger(oox ooxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e881d3b", new Object[]{this, ooxVar});
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.f
    public void onTabChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62d6597e", new Object[]{this, new Integer(i)});
            return;
        }
        this.currentIndex = i;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("index", (Object) Integer.valueOf(i));
        fire("tabchanged", jSONObject);
    }

    public void setApi(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1254903", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject == null && z) {
        } else {
            if (jSONObject == null) {
                this.recommendModule.I("", "", "");
            } else {
                this.recommendModule.I(jSONObject.getString("api"), jSONObject.getString("version"), jSONObject.getString("alias"));
            }
        }
    }

    public void setDegradedConfig(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f10483d", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject != null || !z) {
            if (jSONObject == null) {
                this.recommendModule.T(new HashMap());
                return;
            }
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                if (entry.getValue() instanceof String) {
                    hashMap.put(entry.getKey(), (String) entry.getValue());
                }
            }
            this.recommendModule.T(hashMap);
        }
    }

    public void setDisableDrag(Boolean bool, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e5544a8", new Object[]{this, bool, new Boolean(z)});
        } else if (bool != null || !z) {
            XslModule xslModule = this.recommendModule;
            if (bool == null || !bool.booleanValue()) {
                z2 = false;
            }
            xslModule.Q(z2);
        }
    }

    public void setExtraStatus(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7146f0b", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject == null && z) {
        } else {
            if (jSONObject == null) {
                this.recommendModule.S(null);
            } else {
                this.recommendModule.S(jSONObject);
            }
        }
    }

    public void setItemBackground(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864a8c0e", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject != null || !z) {
            this.recommendModule.Z(jSONObject);
        }
    }

    public void setNestedMod(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f17e3c84", new Object[]{this, new Boolean(z)});
        } else {
            this.nestedMod = z;
        }
    }

    public void setPreloadKey(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6ae9cb", new Object[]{this, str, new Boolean(z)});
        } else if (!TextUtils.isEmpty(str) || !z) {
            this.recommendModule.m0(str);
        }
    }

    public void setPreventRequest(Boolean bool, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5cf3c7", new Object[]{this, bool, new Boolean(z)});
        } else if (!z || bool != null) {
            XslModule xslModule = this.recommendModule;
            if (bool == null || !bool.booleanValue()) {
                z2 = false;
            }
            xslModule.n0(z2);
        }
    }

    public void setRequestParams(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4ae1e", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (!z || jSONObject != null) {
            boolean booleanValue = jSONObject.getBooleanValue("isFlatParams");
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (String str : jSONObject.keySet()) {
                if (!TextUtils.equals("isFlatParams", str)) {
                    if ("params".equals(str)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                        for (String str2 : jSONObject2.keySet()) {
                            if (booleanValue) {
                                hashMap.put(str2, jSONObject2.get(str2) + "");
                            } else {
                                hashMap2.put(str2, jSONObject2.get(str2) + "");
                            }
                        }
                    } else {
                        hashMap.put(str, jSONObject.get(str) + "");
                    }
                }
            }
            this.recommendModule.U(booleanValue);
            this.recommendModule.z0(hashMap);
            this.recommendModule.A0(hashMap2);
        }
    }

    public void setScrollRangeEventItems(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94de1f4f", new Object[]{this, str, new Boolean(z)});
        } else if (!TextUtils.isEmpty(str) || !z) {
            if (str == null) {
                this.scrollRangeEventItems = null;
                return;
            }
            List<ScrollRangeEventItem> parseArray = JSON.parseArray(str, ScrollRangeEventItem.class);
            this.scrollRangeEventItems = parseArray;
            for (ScrollRangeEventItem scrollRangeEventItem : parseArray) {
                for (int i = 0; i < scrollRangeEventItem.params.size(); i++) {
                    scrollRangeEventItem.pxParams.add(Integer.valueOf((int) fxh.e(scrollRangeEventItem.params.get(i))));
                }
            }
        }
    }

    public void setSectionStart(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d5b9184", new Object[]{this, str, new Boolean(z)});
        } else if (TextUtils.isEmpty(str) && z) {
        } else {
            if (TextUtils.isEmpty(str)) {
                this.recommendModule.t0(0);
            } else {
                this.recommendModule.t0((int) fxh.e(str));
            }
        }
    }

    public void setStickyStart(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f5964c", new Object[]{this, str, new Boolean(z)});
        } else if (TextUtils.isEmpty(str) && z) {
        } else {
            if (TextUtils.isEmpty(str)) {
                this.recommendModule.v0(0);
            } else {
                this.recommendModule.v0((int) fxh.e(str));
            }
        }
    }

    public void switchTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("210663ed", new Object[]{this, new Integer(i)});
        } else {
            this.recommendModule.D0(i);
        }
    }

    public void unmount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4059a7", new Object[]{this});
            return;
        }
        this.target = null;
        this.nodeId = -1;
        this.currentIndex = 0;
        this.instance = null;
        this.scrollRangeEventItems = null;
        this.recommendModule.i();
        this.recommendModule = null;
        removeAllViews();
    }

    public void updateDisableLoading(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bfc50a4", new Object[]{this, uINode});
        } else {
            this.recommendModule.R(TextUtils.equals((String) uINode.getAttribute(XslMUSComponent.KEY_DISABLE_LOADING), "true"));
        }
    }

    public void updateListItems(JSONObject jSONObject, int i, int i2, int i3, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2a24a73", new Object[]{this, jSONObject, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Boolean(z2)});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(jSONObject);
        jSONObject2.put("result", (Object) jSONArray);
        this.recommendModule.H0(i, i2, jSONObject2, i3, z, z2);
    }

    private int getPaddingValue(JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e500d9", new Object[]{this, jSONObject, str, new Integer(i)})).intValue();
        }
        if (jSONObject == null) {
            return i;
        }
        String string = jSONObject.getString(str);
        return TextUtils.isEmpty(string) ? i : (int) fxh.e(string);
    }

    private void updateProperty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("927e1745", new Object[]{this});
            return;
        }
        setAreaPadding((JSONObject) this.target.getAttribute(XslMUSComponent.KEY_AREA_PADDING), true);
        setRequestParams((JSONObject) this.target.getAttribute("requestParams"), true);
        setPreventRequest((Boolean) this.target.getAttribute(XslMUSComponent.KEY_PREVENT_REQUEST), true);
        setApi((JSONObject) this.target.getAttribute(XslMUSComponent.KEY_REQUEST_API), true);
        setAtmosphere((JSONObject) this.target.getAttribute("atmosphere"), true);
        setScrollRangeEventItems((String) this.target.getAttribute(XslMUSComponent.KEY_EVENT_LISTENER), true);
        setPreloadKey((String) this.target.getAttribute(XslMUSComponent.KEY_PRELOAD_KEY), true);
        setStickyStart((String) this.target.getAttribute(XslMUSComponent.KEY_STICKY_START), true);
        setSectionStart((String) this.target.getAttribute(XslMUSComponent.KEY_SECTION_START), true);
        setDegradedConfig((JSONObject) this.target.getAttribute(XslMUSComponent.KEY_DEGRADED_CONFIG), true);
        setExtraStatus((JSONObject) this.target.getAttribute(XslMUSComponent.KEY_EXTRA_STATUS), true);
        setDisableDrag((Boolean) this.target.getAttribute(XslMUSComponent.KEY_DISABLE_DRAG), true);
        setItemBackground((JSONObject) this.target.getAttribute(XslMUSComponent.KEY_LIST_ITEM_BACKGROUND), true);
        updateStickyTransparent(this.target);
        updateListTopRadius(this.target);
        updateDisableLoading(this.target);
        this.recommendModule.M((Integer) this.target.getAttribute(XslMUSComponent.KEY_CELL_COLOR));
    }

    public void setAreaPadding(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b01c2d", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (z && jSONObject == null) {
        } else {
            if (jSONObject == null) {
                this.recommendModule.y0(0);
                this.recommendModule.x0(0);
                this.recommendModule.W(0);
                this.recommendModule.V(0);
                this.recommendModule.e0(0);
                this.recommendModule.d0(0);
                this.recommendModule.g0(0);
                this.recommendModule.f0(0);
                this.recommendModule.c0(0);
                this.recommendModule.b0(0);
                return;
            }
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("topHeader");
                this.recommendModule.y0(getPaddingValue(jSONObject2, "topPadding"));
                this.recommendModule.x0(getPaddingValue(jSONObject2, "bottomPadding"));
                JSONObject jSONObject3 = jSONObject.getJSONObject("foldHeader");
                this.recommendModule.W(getPaddingValue(jSONObject3, "topPadding"));
                this.recommendModule.V(getPaddingValue(jSONObject3, "bottomPadding"));
                JSONObject jSONObject4 = jSONObject.getJSONObject("listHeader");
                this.recommendModule.e0(getPaddingValue(jSONObject4, "topPadding"));
                this.recommendModule.d0(getPaddingValue(jSONObject4, "bottomPadding"));
                JSONObject jSONObject5 = jSONObject.getJSONObject("listItems");
                this.recommendModule.X(getPaddingValue(jSONObject5, "itemMargin", -1));
                this.recommendModule.Y(getPaddingValue(jSONObject5, HorizontalXslComponent.ATTR_ITEM_SPACING, -1));
                this.recommendModule.g0(getPaddingValue(jSONObject5, "topPadding"));
                this.recommendModule.f0(getPaddingValue(jSONObject5, "bottomPadding"));
                Integer integer = jSONObject5.getInteger(Constants.Name.COLUMN_COUNT);
                if (integer != null) {
                    this.recommendModule.O(integer.intValue());
                }
                JSONObject jSONObject6 = jSONObject.getJSONObject("listFooter");
                this.recommendModule.c0(getPaddingValue(jSONObject6, "topPadding"));
                this.recommendModule.b0(getPaddingValue(jSONObject6, "bottomPadding"));
            } catch (Exception e) {
                dwh.g("XSearchList", "set padding format error", e);
            }
        }
    }

    public void setAtmosphere(JSONObject jSONObject, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f82360cf", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject == null && z) {
        } else {
            if (jSONObject == null) {
                this.recommendModule.J("", "");
                this.recommendModule.K(true);
                this.recommendModule.a0(null);
                return;
            }
            String string = jSONObject.getString("type");
            String string2 = jSONObject.getString("url");
            this.recommendModule.a0(jSONObject.getString("listBgColor"));
            Boolean bool = jSONObject.getBoolean("animate");
            if (bool != null) {
                z2 = bool.booleanValue();
            }
            if (string != null && string2 != null) {
                this.recommendModule.J(string, string2);
                this.recommendModule.K(z2);
            }
        }
    }

    public void switchTo(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc6cc87", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            this.recommendModule.E0(i, z);
        }
    }

    public void updateListTopRadius(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("623a62e1", new Object[]{this, uINode});
            return;
        }
        JSONObject jSONObject = (JSONObject) uINode.getAttribute(XslMUSComponent.KEY_LIST_CLIP);
        if (jSONObject == null) {
            this.recommendModule.h0(0);
            return;
        }
        try {
            this.recommendModule.h0((int) fxh.e(jSONObject.getString("topRadius")));
        } catch (Exception unused) {
            this.recommendModule.h0(0);
        }
    }

    public void mount(XslMUSComponent xslMUSComponent, com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6c692b", new Object[]{this, xslMUSComponent, aVar});
            return;
        }
        this.target = xslMUSComponent;
        this.instance = aVar;
        this.nodeId = xslMUSComponent.getNodeId();
        if (this.recommendModule == null) {
            XslModule xslModule = new XslModule((Activity) getContext());
            this.recommendModule = xslModule;
            xslModule.j0(isNestedMod());
            this.recommendModule.i0(aVar);
            this.recommendModule.B0("mus_xsearchlist");
            this.recommendModule.L(aVar.getMonitorInfo().e());
            this.recommendModule.getCore().l().c("XSPerfTimestamp", "XslComponentCreate: %d", Long.valueOf(System.currentTimeMillis()));
            this.recommendModule.P(this);
            this.recommendModule.p0(this);
            this.recommendModule.o0(xslMUSComponent.hasEvent(XslMUSComponent.EVENT_PULL_DOWN_REFRESH));
            this.recommendModule.k0(xslMUSComponent.hasEvent(XslMUSComponent.EVENT_SECTION_STICKY_CHANGE));
            this.recommendModule.N(new a());
            this.recommendModule.u0(new b());
            this.recommendModule.r0(new c());
            updateProperty();
            addView(this.recommendModule.h(), -1, -1);
            this.recommendModule.j();
        }
        if (this.stats != null) {
            this.stats.e((int) ((MUSDKInstance) aVar).getMonitor().c().get(MUSMonitor.KEY_PAGE_WLM_DOWNLOAD).a());
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.f
    public void onPageScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6d86c1", new Object[]{this, new Integer(i)});
        } else if (this.recommendModule != null) {
            try {
                if (this.target.hasEvent("scroll")) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("tabIndex", (Object) String.valueOf(this.currentIndex));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("x", (Object) "0");
                    jSONObject2.put("y", (Object) String.valueOf(i));
                    jSONObject.put(Constants.Name.CONTENT_OFFSET, (Object) jSONObject2);
                    fireEvent("scroll", jSONObject);
                }
            } catch (Exception unused) {
            }
            List<ScrollRangeEventItem> list = this.scrollRangeEventItems;
            if (list != null) {
                for (ScrollRangeEventItem scrollRangeEventItem : list) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= scrollRangeEventItem.pxParams.size()) {
                            break;
                        } else if (i < scrollRangeEventItem.pxParams.get(i2).intValue()) {
                            if (scrollRangeEventItem.currentPosition != i2) {
                                scrollRangeEventItem.currentPosition = i2;
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("type", (Object) scrollRangeEventItem.type);
                                jSONObject3.put(x96.REFRESH_TYPE_RANGE, (Object) Integer.valueOf(scrollRangeEventItem.currentPosition));
                                fire("triggercallback", jSONObject3);
                            }
                        } else if (i2 == scrollRangeEventItem.pxParams.size() - 1) {
                            int i3 = i2 + 1;
                            if (scrollRangeEventItem.currentPosition != i3) {
                                scrollRangeEventItem.currentPosition = i3;
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("type", (Object) scrollRangeEventItem.type);
                                jSONObject4.put(x96.REFRESH_TYPE_RANGE, (Object) Integer.valueOf(scrollRangeEventItem.currentPosition));
                                fire("triggercallback", jSONObject4);
                            }
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
    }

    public void setData(JSONObject jSONObject, int i, JSONArray jSONArray, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f268e50e", new Object[]{this, jSONObject, new Integer(i), jSONArray, new Integer(i2), new Integer(i3)});
            return;
        }
        this.scrollAction = new d(i, i2, i3);
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.add(jSONObject);
        jSONObject2.put("result", (Object) jSONArray2);
        this.recommendModule.G();
        if (jSONArray == null || jSONArray.isEmpty()) {
            this.recommendModule.s0(i, jSONObject2);
        } else {
            HashSet hashSet = new HashSet();
            for (int i4 = 0; i4 < jSONArray.size(); i4++) {
                hashSet.add(jSONArray.getString(i4));
            }
            this.recommendModule.l0(i, jSONObject2, hashSet);
        }
        rox roxVar = this.stats;
        if (roxVar != null) {
            roxVar.m(System.currentTimeMillis());
        }
    }

    public void updateStickyTransparent(UINode uINode) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bef1201", new Object[]{this, uINode});
            return;
        }
        Boolean bool = (Boolean) uINode.getAttribute(XslMUSComponent.KEY_STICKY_TRANSPARENT);
        XslModule xslModule = this.recommendModule;
        if (bool != null && !bool.booleanValue()) {
            z = false;
        }
        xslModule.w0(z);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.f
    public void onDynamicError(String str, Object obj, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b2afb49", new Object[]{this, str, obj, str2, str3});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("message", (Object) ("" + str2 + str3));
        fire("error", jSONObject);
        c4p.C("[XS.xsl]", "Error: card error, code: %s, msg: %s", str2, str3);
    }

    private void setRequestParams(JSONObject jSONObject, XslDatasource xslDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e2c6b4c", new Object[]{this, jSONObject, xslDatasource});
            return;
        }
        for (String str : jSONObject.keySet()) {
            if ("params".equals(str)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                for (String str2 : jSONObject2.keySet()) {
                    xslDatasource.addTppParam(str2, jSONObject2.get(str2) + "");
                }
            } else {
                xslDatasource.setParam(str, jSONObject.get(str) + "");
            }
        }
    }

    public void setRequestParams(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8e281d", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        XslDatasource l = this.recommendModule.l(i);
        setRequestParams(JSON.parseObject(str2), l);
        setRequestApi(JSON.parseObject(str), l);
        this.recommendModule.q0(null, null, null, null, i);
    }
}
