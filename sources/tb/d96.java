package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.tao.recommend4.manager.a;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class d96 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_RTABITEMTAP = 305530556085745992L;

    static {
        t2o.a(729809026);
    }

    public static /* synthetic */ Object ipc$super(d96 d96Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/eventhandler/DXRTabItemTapEventHandler");
    }

    public final void a(List list, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5587cb8f", new Object[]{this, list, jSONObject});
            return;
        }
        if (list.get(4) instanceof JSONObject) {
            jSONObject2 = (JSONObject) list.get(4);
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 != null) {
            r5a.e(jSONObject, jSONObject2.getJSONObject("item"), jSONObject2.getJSONObject("custom"));
        }
    }

    public final void b(List list, JSONObject jSONObject, View view, String str) {
        JSONObject jSONObject2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8548f528", new Object[]{this, list, jSONObject, view, str});
        } else if (!e(list, 3)) {
            bqa.d("RTabItemTapEventHandler", "doRequest isAllowParamsIndex false. index : INDEX_NEED_REQUEST");
        } else {
            if (list.get(3) instanceof String) {
                z = Boolean.parseBoolean((String) list.get(3));
            }
            if (z) {
                if (!e(list, 2)) {
                    bqa.d("RTabItemTapEventHandler", "doRequest isAllowParamsIndex false. index : INDEX_REQUEST_PARAM");
                    return;
                }
                if (list.get(2) instanceof JSONObject) {
                    jSONObject2 = (JSONObject) list.get(2);
                } else {
                    jSONObject2 = null;
                }
                Object tag = view.getTag(R.id.tag_recommend_datasource);
                Object tag2 = view.getTag(R.id.tag_recommend_container);
                if (tag == null && (tag2 instanceof a)) {
                    f((a) tag2, jSONObject, jSONObject2, str);
                } else if (tag instanceof a) {
                    f((a) tag, jSONObject, jSONObject2, str);
                } else if (tag == null) {
                    c(jSONObject, view, jSONObject2, str);
                }
            }
        }
    }

    public final String d(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("198a4c09", new Object[]{this, list});
        }
        if (!e(list, 5)) {
            bqa.d("RTabItemTapEventHandler", "getRefreshType isAllowParamsIndex false. index : 5");
            return null;
        } else if (list.get(5) instanceof String) {
            return (String) list.get(5);
        } else {
            return null;
        }
    }

    public final boolean e(List list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54580882", new Object[]{this, list, new Integer(i)})).booleanValue();
        }
        if (i < list.size()) {
            return true;
        }
        return false;
    }

    public void h(String str, rjj rjjVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6810b844", new Object[]{this, str, rjjVar, jSONObject});
        } else if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                jSONObject2.putAll(jSONObject);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("bizParam", (Object) jSONObject2);
            jSONObject3.put("forceRequest", (Object) "true");
            jSONObject3.put("nativeCustomParams", (Object) rjjVar);
            if (yyj.p(str)) {
                kmn.w("ViewClick", yyj.i, new String[]{str}, jSONObject3);
                return;
            }
            JSONObject l = von.l(str);
            kmn.v("ViewClick", kmn.b, l, von.n(l), jSONObject3);
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        sfh.f("RTabItemTapEventHandler", "d3 handleEvent");
        if (objArr == null || objArr.length < 1) {
            uqa.b("RTabItemTapEventHandler", "argsObj check", "argsObj :" + Arrays.toString(objArr));
            return;
        }
        View s = von.s(dXRuntimeContext.L());
        JSONObject i = dXRuntimeContext.i();
        List asList = Arrays.asList(objArr);
        if (i != null && s != null) {
            i(asList, i);
            g(asList, dXRuntimeContext);
            b(asList, i, s, d(asList));
            a(asList, i);
        }
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    public final void i(List list, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57f88f2a", new Object[]{this, list, jSONObject});
        } else if (!e(list, 0)) {
            bqa.d("RTabItemTapEventHandler", "selectStatus isAllowParamsIndex false. index : 0");
        } else {
            JSONObject jSONObject2 = list.get(0) instanceof JSONObject ? (JSONObject) list.get(0) : null;
            if (jSONObject.getJSONObject("_recmdStatus") == null) {
                jSONObject.put("_recmdStatus", (Object) jSONObject2);
                bqa.d("RTabItemTapEventHandler", "current status json is " + jSONObject2);
                return;
            }
            jSONObject.getJSONObject("_recmdStatus").putAll(jSONObject2);
            bqa.d("RTabItemTapEventHandler", "current status json is " + jSONObject.getJSONObject("_recmdStatus"));
        }
    }

    public final void c(JSONObject jSONObject, View view, JSONObject jSONObject2, String str) {
        int f;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d11850", new Object[]{this, jSONObject, view, jSONObject2, str});
            return;
        }
        Object tag = view.getTag(R.id.tag_recommend_containerId);
        String obj = tag == null ? null : tag.toString();
        if (!TextUtils.equals("all", str)) {
            i = ((str == null || TextUtils.equals("afterSelf", str)) && (f = kmn.f(jSONObject.getString("sectionBizCode"), zza.d(obj).H(obj))) != -1) ? f + 1 : -1;
        }
        if (i != -1) {
            h(obj, new rjj(i, -1), jSONObject2);
        }
    }

    public final void f(a aVar, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        int f;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4e5f82", new Object[]{this, aVar, jSONObject, jSONObject2, str});
        } else if (aVar != null) {
            bqa.d("RTabItemTapEventHandler", "r4ReplaceRequest  refreshType :" + str);
            if (!TextUtils.equals("all", str)) {
                i = ((str == null || TextUtils.equals("afterSelf", str)) && (f = kmn.f(jSONObject.getString("sectionBizCode"), new ArrayList(aVar.o()))) != -1) ? f + 1 : -1;
            }
            if (i != -1) {
                aVar.l(new rjj(i, -1), jSONObject2);
            }
        }
    }

    public final void g(List list, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("170a93f8", new Object[]{this, list, dXRuntimeContext});
        } else if (!e(list, 1)) {
            bqa.d("RTabItemTapEventHandler", "refreshUi isAllowParamsIndex false. index : 1");
        } else {
            if (list.get(1) instanceof String ? Boolean.parseBoolean((String) list.get(1)) : false) {
                dXRuntimeContext.r().I0(dXRuntimeContext.W().queryRootWidgetNode(), 0, new DXWidgetRefreshOption.a().d(true).c(3).a());
            }
        }
    }
}
