package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.movehighlight.bussiness.highlight.newModel.HighlightRowResponseData;
import com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.DXHighlightScrollableLayoutWidgetNode;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dwt implements o0e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f18118a;
    public final DXRootView b;
    public final ux9 c;
    public final TBLiveDataModel d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DinamicXEngine f18119a;
        public final /* synthetic */ DXRuntimeContext b;
        public final /* synthetic */ int c;

        public a(DinamicXEngine dinamicXEngine, DXRuntimeContext dXRuntimeContext, int i) {
            this.f18119a = dinamicXEngine;
            this.b = dXRuntimeContext;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f18119a.y0(this.b.L(), dwt.e(dwt.this, this.c));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DinamicXEngine f18120a;
        public final /* synthetic */ DXRuntimeContext b;
        public final /* synthetic */ int c;

        public b(DinamicXEngine dinamicXEngine, DXRuntimeContext dXRuntimeContext, int i) {
            this.f18120a = dinamicXEngine;
            this.b = dXRuntimeContext;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f18120a.y0(this.b.L(), dwt.f(dwt.this, this.c));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DinamicXEngine f18121a;
        public final /* synthetic */ DXRuntimeContext b;
        public final /* synthetic */ int c;

        public c(DinamicXEngine dinamicXEngine, DXRuntimeContext dXRuntimeContext, int i) {
            this.f18121a = dinamicXEngine;
            this.b = dXRuntimeContext;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f18121a.y0(this.b.L(), dwt.e(dwt.this, this.c));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DinamicXEngine f18122a;
        public final /* synthetic */ DXRuntimeContext b;
        public final /* synthetic */ int c;

        public d(DinamicXEngine dinamicXEngine, DXRuntimeContext dXRuntimeContext, int i) {
            this.f18122a = dinamicXEngine;
            this.b = dXRuntimeContext;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f18122a.y0(this.b.L(), dwt.f(dwt.this, this.c));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DinamicXEngine f18123a;
        public final /* synthetic */ DXRuntimeContext b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;

        public e(DinamicXEngine dinamicXEngine, DXRuntimeContext dXRuntimeContext, String str, int i) {
            this.f18123a = dinamicXEngine;
            this.b = dXRuntimeContext;
            this.c = str;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f18123a.y0(this.b.L(), dwt.g(dwt.this, this.c, this.d));
            }
        }
    }

    static {
        t2o.a(779092551);
        t2o.a(779092543);
    }

    public dwt(Context context, DXRootView dXRootView, ux9 ux9Var, TBLiveDataModel tBLiveDataModel) {
        this.f18118a = context;
        this.b = dXRootView;
        this.c = ux9Var;
        this.d = tBLiveDataModel;
    }

    public static /* synthetic */ JSONObject e(dwt dwtVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("798393b0", new Object[]{dwtVar, new Integer(i)});
        }
        return dwtVar.t(i);
    }

    public static /* synthetic */ JSONObject f(dwt dwtVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6cb58b4f", new Object[]{dwtVar, new Integer(i)});
        }
        return dwtVar.v(i);
    }

    public static /* synthetic */ JSONObject g(dwt dwtVar, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("726bbda4", new Object[]{dwtVar, str, new Integer(i)});
        }
        return dwtVar.h(str, i);
    }

    @Override // tb.o0e
    public void a(LiveTimemovingModel liveTimemovingModel, int i, DXRuntimeContext dXRuntimeContext) {
        String str;
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48a74565", new Object[]{this, liveTimemovingModel, new Integer(i), dXRuntimeContext});
        } else if (liveTimemovingModel != null) {
            LiveItem.Ext ext = liveTimemovingModel.extendVal;
            if (!(ext == null || TextUtils.isEmpty(ext.timeMovingPlayInfo) || (timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) fkx.f(liveTimemovingModel.extendVal.timeMovingPlayInfo, LiveItem.TimeMovingPlayInfo.class)) == null)) {
                cxa.a(gxa.b(timeMovingPlayInfo, liveTimemovingModel.extendVal.playUrl, this.c), this.f18118a, this.c);
                exa.b(this.c, this.d, liveTimemovingModel);
                sjr g = sjr.g();
                Boolean valueOf = Boolean.valueOf(timeMovingPlayInfo.isSpeaking);
                ux9 ux9Var = this.c;
                g.c(uyg.EVENT_HIGHLIGHT_SWITCH_PLAY_RATE, valueOf, ux9Var != null ? ux9Var.C() : null);
            }
            r(liveTimemovingModel, i, dXRuntimeContext);
            HashMap hashMap = new HashMap();
            hashMap.put("item_id", liveTimemovingModel.itemId);
            LiveItem.Ext ext2 = liveTimemovingModel.extendVal;
            if (ext2 == null || ext2.secKillInfo == null) {
                str = "1";
            } else {
                str = "2";
            }
            hashMap.put("timemove_item_type", str);
            sbu.f(this.c, "timeshiftlayer-toitem", hashMap);
        }
    }

    @Override // tb.o0e
    public void b(String str, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("148b9f10", new Object[]{this, str, dXRuntimeContext});
            return;
        }
        int k = k(str, null);
        if (k != -1 && dXRuntimeContext != null && dXRuntimeContext.s() != null) {
            dXRuntimeContext.L().post(new b(dXRuntimeContext.s().f(), dXRuntimeContext, k));
        }
    }

    @Override // tb.o0e
    public void c(String str, Map<String, String> map, DXRuntimeContext dXRuntimeContext) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe7c641", new Object[]{this, str, map, dXRuntimeContext});
            return;
        }
        int k = k(str, null);
        if (k != -1 && dXRuntimeContext != null && dXRuntimeContext.s() != null) {
            JSONObject data = this.b.getData();
            if (!(data == null || (jSONObject = data.getJSONObject("model")) == null || (jSONArray = jSONObject.getJSONArray("timeMovingList")) == null || jSONArray.size() <= 0 || (jSONObject2 = (JSONObject) jSONArray.get(k)) == null || (jSONObject3 = jSONObject2.getJSONObject("personalityData")) == null)) {
                jSONObject3.putAll(map);
            }
            dXRuntimeContext.L().post(new d(dXRuntimeContext.s().f(), dXRuntimeContext, k));
        }
    }

    public void d(String str) {
        DXRuntimeContext dXRuntimeContext;
        DinamicXEngine f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b5557", new Object[]{this, str});
            return;
        }
        DXRootView dXRootView = this.b;
        if (dXRootView != null && dXRootView.getExpandWidgetNode() != null && (dXRuntimeContext = this.b.getExpandWidgetNode().getDXRuntimeContext()) != null && dXRuntimeContext.s() != null && (f = dXRuntimeContext.s().f()) != null) {
            f.y0(this.b, l(str));
        }
    }

    public final JSONObject h(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7f4f155d", new Object[]{this, str, new Integer(i)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) "General");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("itemId", (Object) str);
        jSONObject2.put("subDataIndex", (Object) Integer.valueOf(i));
        jSONObject2.put("targetId", (Object) "loadMoreWidget");
        jSONObject2.put("method", (Object) DXHighlightScrollableLayoutWidgetNode.MSG_METHOD_change_selected_data);
        jSONObject.put("params", (Object) jSONObject2);
        return jSONObject;
    }

    public List<LiveTimemovingModel> i() {
        HighlightRowResponseData.HighlightRow highlightRow;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e86e3d4a", new Object[]{this});
        }
        HighlightRowResponseData j = j();
        if (j == null || (highlightRow = j.model) == null) {
            return null;
        }
        return highlightRow.timeMovingList;
    }

    public HighlightRowResponseData j() {
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HighlightRowResponseData) ipChange.ipc$dispatch("b93fde49", new Object[]{this});
        }
        DXRootView dXRootView = this.b;
        if (dXRootView == null || (data = dXRootView.getData()) == null) {
            return null;
        }
        return (HighlightRowResponseData) JSON.parseObject(data.toJSONString(), HighlightRowResponseData.class);
    }

    public int k(String str, String str2) {
        List<LiveTimemovingModel> i;
        String str3;
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("803f4172", new Object[]{this, str, str2})).intValue();
        }
        if ((TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) || (i = i()) == null) {
            return -1;
        }
        if (!TextUtils.isEmpty(str)) {
            while (i2 < i.size()) {
                if (!str.equals(i.get(i2).itemId)) {
                    i2++;
                }
            }
            return -1;
        } else if (TextUtils.isEmpty(str2)) {
            return -1;
        } else {
            while (i2 < i.size()) {
                LiveItem.Ext ext = i.get(i2).extendVal;
                if (ext == null || (str3 = ext.timeMovingPlayInfo) == null || (timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) fkx.f(str3, LiveItem.TimeMovingPlayInfo.class)) == null || !str2.equals(timeMovingPlayInfo.timeMovingId)) {
                    i2++;
                }
            }
            return -1;
        }
        return i2;
    }

    public final JSONObject l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("473f2ae1", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) "General");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("params", (Object) jSONObject2);
        jSONObject2.put("targetId", (Object) "loadMoreWidget");
        jSONObject2.put("method", (Object) DXHighlightScrollableLayoutWidgetNode.MSG_METHOD_updateLoadMoreStatus);
        jSONObject2.put("status", (Object) str);
        return jSONObject;
    }

    public void m(int i) {
        List<LiveTimemovingModel> i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42b65fb2", new Object[]{this, new Integer(i)});
        } else if (i >= 0 && (i2 = i()) != null) {
            LiveTimemovingModel liveTimemovingModel = i2.get(i);
            DXRootView dXRootView = this.b;
            if (dXRootView != null && dXRootView.getExpandWidgetNode() != null) {
                r(liveTimemovingModel, i, this.b.getExpandWidgetNode().getDXRuntimeContext());
            }
        }
    }

    public final void n(LiveTimemovingModel liveTimemovingModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dbc192f", new Object[]{this, liveTimemovingModel});
            return;
        }
        dxa b2 = dxa.b(this.c);
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) fkx.f(liveTimemovingModel.extendVal.timeMovingPlayInfo, LiveItem.TimeMovingPlayInfo.class);
        if (b2.i() != null) {
            b2.i().a(timeMovingPlayInfo);
        }
    }

    public void o(LiveTimemovingModel liveTimemovingModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("882da45e", new Object[]{this, liveTimemovingModel});
            return;
        }
        n(liveTimemovingModel);
        s(liveTimemovingModel);
        if (nwa.a(this.c).c() != null) {
            nwa.a(this.c).c().h(this.c, this.f18118a);
        }
    }

    public final void p(String str) {
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596e76f4", new Object[]{this, str});
            return;
        }
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) fkx.f(str, LiveItem.TimeMovingPlayInfo.class);
        DXRootView dXRootView = this.b;
        if (dXRootView != null && dXRootView.getExpandWidgetNode() != null && timeMovingPlayInfo != null && (data = this.b.getData()) != null) {
            data.put("itemIsSpeaking", (Object) Boolean.valueOf(timeMovingPlayInfo.isSpeaking));
            data.put("hideStructList", (Object) Boolean.valueOf(ztt.b(JSON.toJSONString(timeMovingPlayInfo)).isEmpty()));
            ux9 ux9Var = this.c;
            if (ux9Var != null && ux9Var.h() != null) {
                this.c.h().e(uyg.EVENT_HIGHLIGHT_CHANGE_BOTTOM_STATUS, data);
            }
        }
    }

    public final void q(String str, int i, DXRuntimeContext dXRuntimeContext, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1823915e", new Object[]{this, str, new Integer(i), dXRuntimeContext, dinamicXEngine});
        } else {
            dXRuntimeContext.L().post(new e(dinamicXEngine, dXRuntimeContext, str, i));
        }
    }

    public void r(LiveTimemovingModel liveTimemovingModel, int i, DXRuntimeContext dXRuntimeContext) {
        DinamicXEngine f;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab8813d", new Object[]{this, liveTimemovingModel, new Integer(i), dXRuntimeContext});
        } else if (liveTimemovingModel != null && dXRuntimeContext != null && i != -1 && dXRuntimeContext.s() != null && (f = dXRuntimeContext.s().f()) != null && dXRuntimeContext.L() != null) {
            LiveItem.Ext ext = liveTimemovingModel.extendVal;
            if (!(ext == null || (str = ext.timeMovingPlayInfo) == null)) {
                p(str);
            }
            q(liveTimemovingModel.itemId, i, dXRuntimeContext, f);
            dXRuntimeContext.L().post(new a(f, dXRuntimeContext, i));
            o(liveTimemovingModel);
            ux9 ux9Var = this.c;
            if (ux9Var != null && (ux9Var.l() instanceof wwa)) {
                ((wwa) this.c.l()).d = liveTimemovingModel.itemId;
            }
            ux9 ux9Var2 = this.c;
            if (ux9Var2 != null && ux9Var2.h() != null) {
                this.c.h().e("replay_play_status_change", "play");
                w();
            }
        }
    }

    public void s(LiveTimemovingModel liveTimemovingModel) {
        LiveItem.Ext ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d499c32e", new Object[]{this, liveTimemovingModel});
        } else if (liveTimemovingModel != null && (ext = liveTimemovingModel.extendVal) != null && !TextUtils.isEmpty(ext.timeMovingPlayInfo)) {
            cxa.b = liveTimemovingModel.itemId;
            LiveItem.TimeMovingPlayInfo timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) fkx.f(liveTimemovingModel.extendVal.timeMovingPlayInfo, LiveItem.TimeMovingPlayInfo.class);
            if (timeMovingPlayInfo != null) {
                up6.N0(timeMovingPlayInfo.timeMovingId, this.c);
            }
        }
    }

    public final JSONObject t(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3f77a799", new Object[]{this, new Integer(i)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) "General");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("data", (Object) Integer.valueOf(i));
        jSONObject2.put("targetId", (Object) "loadMoreWidget");
        jSONObject2.put("method", (Object) DXHighlightScrollableLayoutWidgetNode.MSG_METHOD_scroll_refreshData);
        jSONObject.put("params", (Object) jSONObject2);
        return jSONObject;
    }

    public void u(int i) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56d9a6e", new Object[]{this, new Integer(i)});
            return;
        }
        DXRootView dXRootView = this.b;
        if (dXRootView != null && dXRootView.getExpandWidgetNode() != null && (dXRuntimeContext = this.b.getExpandWidgetNode().getDXRuntimeContext()) != null && dXRuntimeContext.s() != null) {
            DinamicXEngine f = dXRuntimeContext.s().f();
            if (dXRuntimeContext.L() != null) {
                dXRuntimeContext.L().post(new c(f, dXRuntimeContext, i));
            }
        }
    }

    public final JSONObject v(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b587fce", new Object[]{this, new Integer(i)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) "General");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("subDataIndex", (Object) Integer.valueOf(i));
        jSONObject2.put("method", (Object) DXHighlightScrollableLayoutWidgetNode.MSG_METHOD_UPDATE_SELETED_DATA);
        jSONObject.put("params", (Object) jSONObject2);
        return jSONObject;
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4be392b", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", "1.0");
        hashMap.put("needRecord", String.valueOf(false));
        sjr.g().c(uyg.EVENT_PLAY_RATE_CHANGED, hashMap, this.c.C());
    }
}
