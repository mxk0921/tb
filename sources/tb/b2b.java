package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.business.FeedListResponse;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.DinamicDataObject;
import com.taobao.tao.log.TLog;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b2b extends t0b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String g = b2b.class.getSimpleName();
    public DXRootView e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements wl7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(b2b b2bVar) {
        }

        @Override // tb.wl7
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67253d14", new Object[]{this});
            } else {
                TLog.loge(b2b.d(), "onCreateError");
            }
        }

        @Override // tb.wl7
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fc7a84f", new Object[]{this});
            } else {
                TLog.loge(b2b.d(), "onCreateSuccess");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements yl7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(b2b b2bVar) {
        }

        @Override // tb.yl7
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
            } else {
                TLog.loge(b2b.d(), sxl.RENDER_SUCCESS_TIME);
            }
        }

        @Override // tb.yl7
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ac1a9ba", new Object[]{this});
            } else {
                TLog.loge(b2b.d(), "onRenderError");
            }
        }
    }

    static {
        t2o.a(310378741);
    }

    public b2b(ViewGroup viewGroup, Context context, b0h b0hVar) {
        super(viewGroup, context, b0hVar);
    }

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return g;
    }

    public static /* synthetic */ Object ipc$super(b2b b2bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/component/HomeMainTopView");
    }

    @Override // tb.t0b
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        return this.e;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6c91ab", new Object[]{this});
            return;
        }
        DXRootView dXRootView = this.e;
        if (dXRootView != null && dXRootView.getExpandWidgetNode() != null) {
            DXWidgetNode queryWidgetNodeByUserId = this.e.getExpandWidgetNode().queryWidgetNodeByUserId("live_JellyMarquee");
            if (queryWidgetNodeByUserId instanceof bg6) {
                DXEvent dXEvent = new DXEvent(20001L);
                HashMap hashMap = new HashMap();
                hashMap.put("newState", mw5.K(0L));
                dXEvent.setArgs(hashMap);
                queryWidgetNodeByUserId.postEvent(dXEvent);
            }
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f68065b", new Object[]{this, new Boolean(z)});
            return;
        }
        DXRootView dXRootView = this.e;
        if (dXRootView != null && dXRootView.getExpandWidgetNode() != null) {
            DXWidgetNode queryWidgetNodeByUserId = this.e.getExpandWidgetNode().queryWidgetNodeByUserId("live_JellyMarquee");
            if (queryWidgetNodeByUserId instanceof bg6) {
                DXEvent dXEvent = new DXEvent(20002L);
                HashMap hashMap = new HashMap();
                hashMap.put("isAppear", mw5.G(z));
                dXEvent.setArgs(hashMap);
                queryWidgetNodeByUserId.postEvent(dXEvent);
            }
        }
    }

    public void e(Object obj, boolean z) {
        JSONObject jSONObject;
        String str;
        DinamicDataObject dinamicDataObject;
        HashMap<String, JSONObject> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8358cb4b", new Object[]{this, obj, new Boolean(z)});
            return;
        }
        String str2 = g;
        TLog.loge(str2, "BindData");
        if (this.b != null) {
            if (!z || (jSONObject = iza.f21660a) == null) {
                if (obj instanceof FeedListResponse) {
                    FeedListResponse feedListResponse = (FeedListResponse) obj;
                    if (!(feedListResponse.getData() == null || (hashMap = (dinamicDataObject = (DinamicDataObject) feedListResponse.getData().headData).data) == null || hashMap.get("data") == null)) {
                        jSONObject = dinamicDataObject.data.get("data");
                    }
                }
                jSONObject = null;
            }
            if (jSONObject == null || TextUtils.isEmpty(jSONObject.getString(yh6.CONFIG_KEY_TEMPLATE_NAME)) || jSONObject.getJSONArray("cardData") == null || jSONObject.getJSONArray("cardData").size() <= 0) {
                this.b.setVisibility(8);
                return;
            }
            this.b.setVisibility(0);
            DXRootView createDX = this.c.q().getDinamicSdkManager().createDX(this.d, jSONObject.getString(yh6.CONFIG_KEY_TEMPLATE_NAME), new a(this));
            this.e = createDX;
            if (createDX != null) {
                TLog.loge(str2, "CardData is not null");
                if (z) {
                    str = "homeMain_cache_headArea_render_start";
                } else {
                    str = "homeMain_mtop_headArea_render_start";
                }
                mbu.b(str, this.c);
                this.b.removeAllViews();
                if (this.c.q().getDinamicSdkManager().renderDX(this.e, jSONObject, new b(this))) {
                    if (h(jSONObject)) {
                        this.b.setPadding(0, 0, 0, qw0.d(this.d, 6.0f));
                    } else {
                        this.b.setPadding(0, 0, 0, qw0.d(this.d, 8.0f));
                    }
                    this.b.addView(this.e);
                }
            }
        }
    }

    public final boolean h(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c96aacba", new Object[]{this, jSONObject})).booleanValue();
        }
        JSONArray jSONArray = jSONObject.getJSONArray("cardTypes");
        if (!nvs.v0() || jSONArray == null || jSONArray.indexOf("liveSmartIsLandCard") < 0 || jSONObject.getJSONArray("cardData") == null || jSONObject.getJSONArray("cardData").size() < jSONArray.indexOf("liveSmartIsLandCard") || (jSONObject2 = jSONObject.getJSONArray("cardData").getJSONObject(jSONArray.indexOf("liveSmartIsLandCard"))) == null || !(jSONObject2.get("newSmartIsland") instanceof String)) {
            return false;
        }
        return Boolean.parseBoolean(jSONObject2.getString("newSmartIsland"));
    }
}
