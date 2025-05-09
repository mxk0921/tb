package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.ju.track.server.JTrackParams;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HintGuideBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.MuiseActivateCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.WeexActivateCellBean;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ha0 extends g5p<ja0> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String b;
    public final yzd c;
    public final boolean d;

    static {
        t2o.a(815793186);
    }

    public ha0(String str) {
        this.c = new bpw();
        this.d = false;
        this.b = str;
    }

    public static /* synthetic */ Object ipc$super(ha0 ha0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/data/ActivateTppConverter");
    }

    /* renamed from: h */
    public ja0 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ja0) ipChange.ipc$dispatch("2bb7fcc4", new Object[]{this});
        }
        return new ja0();
    }

    public final void i(ja0 ja0Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6b18be", new Object[]{this, ja0Var, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("camera");
        if (optJSONObject != null) {
            dy2 dy2Var = new dy2();
            dy2Var.f18146a = optJSONObject.optInt("n");
            dy2Var.b = optJSONObject.optInt("m");
            dy2Var.c = optJSONObject.optString(DxContainerActivity.PARAMS_NAMESPACE);
            dy2Var.d = optJSONObject.optString("lottieUrl");
            ja0Var.r = dy2Var;
        }
    }

    public final void j(ja0 ja0Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b72d0945", new Object[]{this, ja0Var, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("guideBubble");
        if (optJSONObject != null) {
            HintGuideBean hintGuideBean = new HintGuideBean();
            hintGuideBean.setTotalCount(optJSONObject.optInt("m"));
            hintGuideBean.setShowInterval(optJSONObject.optInt("n"));
            hintGuideBean.setNameSpace(optJSONObject.optString(DxContainerActivity.PARAMS_NAMESPACE));
            hintGuideBean.setShowText(optJSONObject.optString("showText"));
            ja0Var.q = hintGuideBean;
        }
    }

    public final void k(JSONObject jSONObject, ja0 ja0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29503cc", new Object[]{this, jSONObject, ja0Var});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("review");
        if (optJSONObject != null) {
            i2p i2pVar = new i2p();
            ja0Var.h = i2pVar;
            i2pVar.j(Boolean.valueOf(optJSONObject.optBoolean("show")));
            ja0Var.h.g(optJSONObject.optString("h5Url"));
            ja0Var.h.h(optJSONObject.optString("iconUrl"));
            ja0Var.h.k(optJSONObject.optString("showText"));
            ja0Var.h.i(i2p.TYPE_ACTIVATE);
        }
    }

    public final void l(ja0 ja0Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("199a6267", new Object[]{this, ja0Var, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("switchWhiteList");
        if (optJSONObject != null) {
            ja0Var.s = optJSONObject.optBoolean("openNewVoiceService");
            ja0Var.t = optJSONObject.optBoolean("openNewVoiceStyle");
            if (optJSONObject.has("openMainSearchAi")) {
                ja0Var.u = Boolean.valueOf(optJSONObject.optBoolean("openMainSearchAi"));
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject(HorizontalXslComponent.ATTR_PAGE_INFO);
        if (optJSONObject2 != null) {
            ja0Var.v = JSON.parseObject(optJSONObject2.toString());
        }
    }

    public final Map<String, TemplateBean> m(JSONObject jSONObject, a9u a9uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a54a8268", new Object[]{this, jSONObject, a9uVar});
        }
        String optString = jSONObject.optString("templates");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        return qit.c(JSON.parseArray(optString), a9uVar, yak.f31939a);
    }

    public final void n(Map<String, TemplateBean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc6e0df", new Object[]{this, map});
        } else if (o4p.H1() && map != null && !map.isEmpty() && this.d) {
            map.remove("ms_tb-webb-widget-cloud_search_door_trending_hot_textList");
            map.remove("ms_tb-webb-widget_search_door_guess_discovery");
        }
    }

    /* renamed from: e */
    public ja0 b(JSONObject jSONObject, v5p v5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ja0) ipChange.ipc$dispatch("61bbd5e5", new Object[]{this, jSONObject, v5pVar});
        }
        ja0 ja0Var = new ja0();
        if (jSONObject == null) {
            v5p.b(v5pVar, "DataConvert", "-1", "JSON is empty");
            return ja0Var;
        }
        ja0Var.p = jSONObject.toString();
        l(ja0Var, jSONObject);
        o(ja0Var, jSONObject);
        String optString = jSONObject.optString(yj4.PARAM_PVID);
        String optString2 = jSONObject.optString("tpp_trace");
        k(jSONObject, ja0Var);
        HashMap hashMap = new HashMap();
        hashMap.put("pvId", optString);
        hashMap.put("tppTrace", optString2);
        JSONArray optJSONArray = jSONObject.optJSONArray("result");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            hashMap.put("errCode", "-1");
            hashMap.put("errMsg", "result array is empty");
            v5p.c(v5pVar, "DataConvert", hashMap);
            return ja0Var;
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            hashMap.put("errCode", "-1");
            hashMap.put("errMsg", mx8.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR);
            v5p.c(v5pVar, "DataConvert", hashMap);
            return ja0Var;
        }
        ja0Var.e = this.b;
        String optString3 = optJSONObject.optString(h1p.KEY_SUGGEST_RN);
        ja0Var.d = optString3;
        hashMap.put("suggestRn", optString3);
        ja0Var.o = optJSONObject;
        a9u a9uVar = new a9u();
        g(optJSONObject, ja0Var, a9uVar);
        hashMap.put("pageStruct", a9uVar.f15618a);
        ja0Var.i = n3p.c(optJSONObject.optJSONObject(ia0.PARAM_SEARCH_HINT), ja0Var.d);
        a9u a9uVar2 = new a9u();
        Map<String, TemplateBean> m = m(jSONObject, a9uVar2);
        ja0Var.j = m;
        n(m);
        ((bpw) this.c).a(ja0Var.j);
        hashMap.put("templates", a9uVar2.f15618a);
        ja0Var.m = optJSONObject.optString("searchDoorWeexUrl");
        if (!TextUtils.isEmpty(optString)) {
            ((HashMap) ja0Var.l).put(yj4.PARAM_PVID, optString);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject(JTrackParams.TRACK_PARAMS);
        if (optJSONObject2 != null) {
            Iterator<String> keys = optJSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString4 = optJSONObject2.optString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString4)) {
                    ((HashMap) ja0Var.l).put(next, optString4);
                }
            }
        }
        j(ja0Var, optJSONObject);
        i(ja0Var, optJSONObject);
        v5p.d(v5pVar, "DataConvert", hashMap);
        return ja0Var;
    }

    public ja0 d(com.alibaba.fastjson.JSONObject jSONObject) {
        com.alibaba.fastjson.JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ja0) ipChange.ipc$dispatch("b53fcb24", new Object[]{this, jSONObject});
        }
        ja0 ja0Var = new ja0();
        ja0Var.w = true;
        if (jSONObject == null) {
            return ja0Var;
        }
        String string = jSONObject.getString(yj4.PARAM_PVID);
        String string2 = jSONObject.getString("tpp_trace");
        HashMap hashMap = new HashMap();
        hashMap.put("pvId", string);
        hashMap.put("tppTrace", string2);
        com.alibaba.fastjson.JSONArray jSONArray = jSONObject.getJSONArray("result");
        if (jSONArray == null || jSONArray.size() == 0 || (jSONObject2 = jSONArray.getJSONObject(0)) == null) {
            return ja0Var;
        }
        ja0Var.e = this.b;
        String string3 = jSONObject2.getString(h1p.KEY_SUGGEST_RN);
        ja0Var.d = string3;
        hashMap.put("suggestRn", string3);
        f(jSONObject2, ja0Var, null);
        if (!TextUtils.isEmpty(string)) {
            ((HashMap) ja0Var.l).put(yj4.PARAM_PVID, string);
        }
        return ja0Var;
    }

    public final void f(com.alibaba.fastjson.JSONObject jSONObject, ja0 ja0Var, a9u a9uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95e59a7", new Object[]{this, jSONObject, ja0Var, a9uVar});
        } else if (jSONObject != null) {
            com.alibaba.fastjson.JSONArray jSONArray = jSONObject.getJSONArray("searchdoor");
            if (jSONArray != null && jSONArray.size() != 0) {
                ja0Var.g = new ArrayList();
                ga0 b = s1p.c().b();
                if (b != null) {
                    StringBuilder sb = new StringBuilder();
                    boolean z = false;
                    for (int i = 0; i < jSONArray.size(); i++) {
                        com.alibaba.fastjson.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2 != null) {
                            if (jSONObject2.getString("tItemType").equals("ms_tb-webb-widget-cloud_search_door_trending_hot_textList")) {
                                jSONObject2.put("tItemType", "nt_hot_spots");
                            } else if (jSONObject2.getString("tItemType").equals("ms_tb-webb-widget_search_door_guess_discovery")) {
                                jSONObject2.put("tItemType", "nt_search_door_guess_discovery");
                            }
                            ActivateTypedBean a2 = b.a(jSONObject2, ja0Var);
                            if (a2 != null) {
                                if ((a2 instanceof MuiseActivateCellBean) || (a2 instanceof WeexActivateCellBean)) {
                                    z = true;
                                }
                                sb.append(a2.type);
                                sb.append("/");
                                if ((a2 instanceof HistoryCellBean) && ja0Var.f == null) {
                                    ja0Var.f = (HistoryCellBean) a2;
                                }
                                ja0Var.g.add(a2);
                            }
                        }
                    }
                    ja0Var.x = z;
                    if (a9uVar != null) {
                        a9uVar.f15618a = sb.toString();
                    }
                } else if (a9uVar != null) {
                    a9uVar.f15618a = "parser is null";
                }
            } else if (a9uVar != null) {
                a9uVar.f15618a = "searchdoor array is empty";
            }
        } else if (a9uVar != null) {
            a9uVar.f15618a = mx8.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR;
        }
    }

    public final void g(JSONObject jSONObject, ja0 ja0Var, a9u a9uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ee5375", new Object[]{this, jSONObject, ja0Var, a9uVar});
        } else if (jSONObject != null) {
            JSONArray optJSONArray = jSONObject.optJSONArray("searchdoor");
            if (optJSONArray != null && optJSONArray.length() != 0) {
                ja0Var.g = new ArrayList();
                ga0 b = s1p.c().b();
                if (b != null) {
                    StringBuilder sb = new StringBuilder();
                    boolean z = false;
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(optJSONArray.optString(i));
                        if (parseObject != null) {
                            if (this.d) {
                                if (parseObject.getString("tItemType").equals("ms_tb-webb-widget-cloud_search_door_trending_hot_textList")) {
                                    parseObject.put("tItemType", (Object) "nt_hot_spots");
                                } else if (parseObject.getString("tItemType").equals("ms_tb-webb-widget_search_door_guess_discovery")) {
                                    parseObject.put("tItemType", (Object) "nt_search_door_guess_discovery");
                                }
                            }
                            ActivateTypedBean a2 = b.a(parseObject, ja0Var);
                            if (a2 != null) {
                                if ((a2 instanceof MuiseActivateCellBean) || (a2 instanceof WeexActivateCellBean)) {
                                    z = true;
                                }
                                sb.append(a2.type);
                                sb.append("/");
                                if ((a2 instanceof HistoryCellBean) && ja0Var.f == null) {
                                    ja0Var.f = (HistoryCellBean) a2;
                                }
                                ja0Var.g.add(a2);
                            }
                        }
                    }
                    ja0Var.x = z;
                    if (a9uVar != null) {
                        a9uVar.f15618a = sb.toString();
                    }
                } else if (a9uVar != null) {
                    a9uVar.f15618a = "parser is null";
                }
            } else if (a9uVar != null) {
                a9uVar.f15618a = "searchdoor array is empty";
            }
        } else if (a9uVar != null) {
            a9uVar.f15618a = mx8.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR;
        }
    }

    public final void o(ja0 ja0Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf80bcc7", new Object[]{this, ja0Var, jSONObject});
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("pageTraceArgs");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            HashMap hashMap = new HashMap();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                String optString = optJSONObject.optString("key");
                String optString2 = optJSONObject.optString("value");
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                    hashMap.put(optString, optString2);
                }
            }
            ja0Var.y = hashMap;
        }
    }

    public ha0(String str, boolean z) {
        this.c = new bpw();
        this.b = str;
        this.d = z;
    }
}
