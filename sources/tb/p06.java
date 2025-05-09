package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a;
import com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.DXHighlightScrollableLayoutWidgetNode;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class p06 extends v10 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HIGHLIGHTSCROLLABLEONLOADMORE = 3022236499765514152L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements a.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRuntimeContext f25780a;
        public final /* synthetic */ DinamicXEngine b;

        public a(DXRuntimeContext dXRuntimeContext, DinamicXEngine dinamicXEngine) {
            this.f25780a = dXRuntimeContext;
            this.b = dinamicXEngine;
        }

        @Override // com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a.c
        public void a(JSONObject jSONObject) {
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25db8289", new Object[]{this, jSONObject});
            } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("model")) != null) {
                ztt.c(jSONObject);
                JSONArray jSONArray = jSONObject2.getJSONArray("timeMovingList");
                if (jSONArray.size() > 0) {
                    p06 p06Var = p06.this;
                    p06.c(p06Var, jSONArray, p06Var.g(this.f25780a));
                    this.b.y0(this.f25780a.L(), p06.d(p06.this, jSONArray));
                    if (jSONArray.size() <= 0) {
                        this.b.y0(this.f25780a.L(), p06.e(p06.this, DXHighlightScrollableLayoutWidgetNode.LOAD_MORE_NO_DATA_STRING));
                    } else {
                        this.b.y0(this.f25780a.L(), p06.e(p06.this, DXHighlightScrollableLayoutWidgetNode.LOAD_MORE_END_STRING));
                    }
                } else {
                    this.b.y0(this.f25780a.L(), p06.e(p06.this, DXHighlightScrollableLayoutWidgetNode.LOAD_MORE_NO_DATA_STRING));
                }
            }
        }
    }

    static {
        t2o.a(779092627);
    }

    public static /* synthetic */ void c(p06 p06Var, JSONArray jSONArray, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f43c3f2", new Object[]{p06Var, jSONArray, list});
        } else {
            p06Var.i(jSONArray, list);
        }
    }

    public static /* synthetic */ JSONObject d(p06 p06Var, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2a831000", new Object[]{p06Var, jSONArray});
        }
        return p06Var.f(jSONArray);
    }

    public static /* synthetic */ JSONObject e(p06 p06Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e5e6acc1", new Object[]{p06Var, str});
        }
        return p06Var.h(str);
    }

    public static /* synthetic */ Object ipc$super(p06 p06Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/dx/handler/DXHighlightScrollableOnloadMoreEventHandler");
    }

    @Override // tb.v10
    public void b(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c45658f", new Object[]{this, dXEvent, objArr, dXRuntimeContext, ux9Var});
            return;
        }
        Log.e("shuiyu", "收到回调" + dXEvent.getClass() + " args " + JSON.toJSONString(objArr));
        DinamicXEngine f = dXRuntimeContext.s().f();
        m0e l = dxa.b(ux9Var).l();
        if (l != null && l.d() != null) {
            l.d().f(new a(dXRuntimeContext, f));
        }
    }

    public final JSONObject f(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d17d5896", new Object[]{this, jSONArray});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) "General");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("params", (Object) jSONObject2);
        jSONObject2.put("data", (Object) jSONArray);
        jSONObject2.put("targetId", (Object) "loadMoreWidget");
        jSONObject2.put("method", (Object) DXHighlightScrollableLayoutWidgetNode.MSG_METHOD_appendData);
        return jSONObject;
    }

    public List<LiveTimemovingModel> g(DXRuntimeContext dXRuntimeContext) {
        JSONArray jSONArray;
        List<LiveTimemovingModel> parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2945296d", new Object[]{this, dXRuntimeContext});
        }
        JSONObject data = dXRuntimeContext.L().getData();
        if (data.getJSONObject("model") == null || (jSONArray = data.getJSONObject("model").getJSONArray("timeMovingList")) == null || jSONArray.size() <= 0 || (parseArray = JSON.parseArray(jSONArray.toJSONString(), LiveTimemovingModel.class)) == null || parseArray.size() <= 0) {
            return null;
        }
        return parseArray;
    }

    public final JSONObject h(String str) {
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

    public final void i(JSONArray jSONArray, List<LiveTimemovingModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35073ca8", new Object[]{this, jSONArray, list});
        } else if (jSONArray != null && jSONArray.size() > 0 && list != null && list.size() > 0) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null && !TextUtils.isEmpty(jSONObject.getString("itemId"))) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        if (jSONObject.getString("itemId").equals(list.get(i2).itemId)) {
                            jSONArray.remove(i);
                        }
                    }
                }
            }
        }
    }
}
