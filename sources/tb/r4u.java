package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.InteractLocationData;
import com.taobao.tao.Globals;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class r4u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f27100a = Globals.getApplication();
    public final p1e b;

    static {
        t2o.a(491782707);
    }

    public r4u(p1e p1eVar) {
        this.b = p1eVar;
    }

    public float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c34be7b4", new Object[]{this})).floatValue();
        }
        return pb6.f(this.f27100a, 17.5f);
    }

    public InteractLocationData e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractLocationData) ipChange.ipc$dispatch("321dcea", new Object[]{this, str, str2});
        }
        if (this.b == null) {
            return null;
        }
        if (!"DXSearchBar".equals(str) || TextUtils.isEmpty(str2)) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "getNaviBarLocation-> 必传参数有误，获取搜索栏坐标失败。bizCode:" + str + " viewTag:" + str2);
            return null;
        }
        Map<String, Integer> i = ((cpj) this.b).i("DXSearchBar", str2);
        if (i != null) {
            InteractLocationData interactLocationData = new InteractLocationData();
            Integer num = i.get("width");
            if (num == null) {
                return null;
            }
            interactLocationData.width = num.intValue();
            Integer num2 = i.get("height");
            if (num2 == null) {
                return null;
            }
            interactLocationData.height = num2.intValue();
            Integer num3 = i.get("positionX");
            if (num3 == null) {
                return null;
            }
            interactLocationData.positionX = num3.intValue();
            Integer num4 = i.get("positionY");
            if (num4 == null) {
                return null;
            }
            interactLocationData.positionY = num4.intValue();
            fve.e(obq.SPLASH_BUSINESS_TAG, "getNaviBarLocation-> 搜索框坐标信息：" + i);
            return interactLocationData;
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "getNaviBarLocation-> 没有找到搜索框坐标信息！！！");
        return null;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bda0e116", new Object[]{this})).booleanValue();
        }
        p1e p1eVar = this.b;
        if (p1eVar == null) {
            return false;
        }
        return ((m4u) p1eVar).d();
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2f2672c", new Object[]{this})).booleanValue();
        }
        p1e p1eVar = this.b;
        if (p1eVar == null) {
            return false;
        }
        return ((m4u) p1eVar).a();
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecc97c76", new Object[]{this})).booleanValue();
        }
        p1e p1eVar = this.b;
        if (p1eVar == null) {
            return false;
        }
        return ((m4u) p1eVar).b();
    }

    public final void m(String str, Object obj, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26504bd2", new Object[]{this, str, obj, jSONObject});
        } else if (obj != null && !TextUtils.isEmpty(str)) {
            jSONObject.put(str, obj);
        }
    }

    public JSONObject k(JSONObject jSONObject) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("91610c8f", new Object[]{this, jSONObject});
        }
        if (this.b == null) {
            return null;
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "keepAdSearchData-> 新手村保护的广告底纹词是：" + jSONObject);
        JSONObject k = ((cpj) this.b).k();
        StringBuilder sb = new StringBuilder("keepAdSearchData-> subTabSearchBarData———————————— size  = ");
        sb.append(k == null ? 0 : k.size());
        fve.e(obq.SPLASH_BUSINESS_TAG, sb.toString());
        JSONObject j = ((cpj) this.b).j();
        StringBuilder sb2 = new StringBuilder("keepAdSearchData-> subTabSearchBarData searchBoxSubData———————————— size  = ");
        if (j != null) {
            i = j.size();
        }
        sb2.append(i);
        fve.e(obq.SPLASH_BUSINESS_TAG, sb2.toString());
        boolean f = f(j, jSONObject);
        fve.e(obq.SPLASH_BUSINESS_TAG, "keepAdSearchData-> 底纹词保持首位结果————————————" + f);
        if (f) {
            return k;
        }
        return null;
    }

    public final boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbe5d9d2", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        try {
            Object k = a3b.k(jSONObject, "content.searchText");
            Object k2 = a3b.k(jSONObject2, "item.0.content");
            Object k3 = a3b.k(jSONObject2, "item.0.targetUrl");
            Object k4 = a3b.k(jSONObject2, "item.1.targetUrl");
            if (!(k2 instanceof JSONObject)) {
                fve.e(obq.SPLASH_BUSINESS_TAG, "searchText不是JSONObject");
                return false;
            }
            m("searchBoxUrl", k3, (JSONObject) k2);
            m("searchButtonUrl", k4, (JSONObject) k2);
            JSONObject c = c(k2, k);
            if (c == null) {
                fve.e(obq.SPLASH_BUSINESS_TAG, "newSearchTextData == null");
                return false;
            }
            ((JSONObject) k).putAll(c);
            return true;
        } catch (JSONException e) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "assembleContent-> JSONException: " + e.getMessage());
            return false;
        }
    }

    public final boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9181ca4", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        try {
            JSONObject jSONObject3 = jSONObject2.getJSONObject(i2b.TRACK_EXPOSURE_PARAM);
            Object k = a3b.k(jSONObject2, "item.0.clickParam");
            Object k2 = a3b.k(jSONObject2, "item.1.clickParam");
            Object k3 = a3b.k(jSONObject, "track.searchText");
            JSONObject jSONObject4 = new JSONObject();
            m("clickParam", k, jSONObject4);
            m(i2b.TRACK_EXPOSURE_PARAM, jSONObject3, jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            m("clickParam", k2, jSONObject5);
            m(i2b.TRACK_EXPOSURE_PARAM, jSONObject3, jSONObject5);
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("text", (Object) jSONObject4);
            jSONObject6.put(pg1.ATOM_EXT_button, (Object) jSONObject5);
            JSONObject c = c(jSONObject6, k3);
            if (c == null) {
                fve.e(obq.SPLASH_BUSINESS_TAG, "newSearchTextTrack == null");
                return false;
            }
            ((JSONObject) k3).putAll(c);
            return true;
        } catch (JSONException e) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "assembleTrack-> JSONException: " + e.getMessage());
            return false;
        }
    }

    public final JSONObject c(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8e24bb39", new Object[]{this, obj, obj2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("0", obj);
        JSONArray l = l(obj2);
        if (l == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "oldSearchTextArray == null");
            return null;
        }
        for (int i = 0; i < l.size(); i++) {
            JSONObject jSONObject2 = l.getJSONObject(i);
            if (jSONObject2 != null) {
                jSONObject.put(String.valueOf(i + 1), (Object) jSONObject2);
            }
        }
        return jSONObject;
    }

    public final boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ede6b67e", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        if (f0p.a()) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "keepAdSearchData-> subTabSearchBarData———————————— 尝试处理新协议");
            return g(jSONObject, jSONObject2);
        } else if (jSONObject == null || !jSONObject.containsKey("subSection")) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "keepAdSearchData-> subTabSearchBarData———————————— searchBoxData is null");
            return false;
        } else {
            JSONObject jSONObject3 = jSONObject.getJSONObject("subSection");
            if (jSONObject3 == null) {
                fve.e(obq.SPLASH_BUSINESS_TAG, "keepAdSearchData-> subTabSearchBarData———————————— oldSearchBarSubData is null");
                return false;
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("0", (Object) jSONObject2);
            try {
                int i = 1;
                for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
                    Object value = entry.getValue();
                    if (!JSON.parseObject(value.toString()).containsKey("traceId")) {
                        jSONObject4.put(String.valueOf(i), value);
                        i++;
                    }
                }
                jSONObject.put("subSection", (Object) jSONObject4);
                return true;
            } catch (NumberFormatException e) {
                fve.e(obq.SPLASH_BUSINESS_TAG, "updateSearchTextData-> 处理搜索框原始数据时发生异常，更新数据失败。具体异常为：" + Log.getStackTraceString(e));
                return false;
            }
        }
    }

    public final boolean g(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78c08a2c", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject2 == null || jSONObject == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "insertAdv2SearchBarBySlimProto-> advData or searchBoxData is null");
            return false;
        }
        boolean a2 = a(jSONObject, jSONObject2);
        fve.e(obq.SPLASH_BUSINESS_TAG, "insertAdv2SearchBarBySlimProto-> Assemble content success: " + a2);
        boolean b = b(jSONObject, jSONObject2);
        fve.e(obq.SPLASH_BUSINESS_TAG, "insertAdv2SearchBarBySlimProto-> Assemble track success: " + b);
        return a2 && b;
    }

    public final JSONArray l(Object obj) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("2dd78bb0", new Object[]{this, obj});
        }
        if (!(obj instanceof JSONObject)) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "parseToArray oldSearchTextData不是JSONObject");
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        JSONArray jSONArray = new JSONArray();
        while (true) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(String.valueOf(i));
            if (jSONObject2 == null) {
                return jSONArray;
            }
            jSONArray.add(jSONObject2);
            i++;
        }
    }

    public boolean n(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f5506e5", new Object[]{this, jSONObject})).booleanValue();
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "updateSearchTextData-> 需要塞入的广告底纹词是：" + jSONObject);
        p1e p1eVar = this.b;
        if (p1eVar == null) {
            return false;
        }
        if (f(((cpj) p1eVar).j(), jSONObject)) {
            ((cpj) this.b).l();
            fve.e(obq.SPLASH_BUSINESS_TAG, "updateSearchTextData-> 底纹词刷新成功————————————");
            return true;
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "updateSearchTextData-> 获取搜索框数据异常，更新数据失败。naviBarData 为空，或者没有subSection字段");
        return false;
    }
}
