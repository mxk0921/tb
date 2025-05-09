package com.taobao.tao.flexbox.layoutmanager.filter;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.JSONLexer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.d;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.core.r;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import tb.eq8;
import tb.hc8;
import tb.hnn;
import tb.ig8;
import tb.ir2;
import tb.iuo;
import tb.kq8;
import tb.nwv;
import tb.pg1;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class Utils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, Object> f12292a;

        static {
            t2o.a(503317254);
            t2o.a(503317255);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.filter.Utils.b
        public void a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e95f827", new Object[]{this, str, obj});
            } else if (!TextUtils.isEmpty(str) && obj != null) {
                if (this.f12292a == null) {
                    this.f12292a = new HashMap();
                }
                this.f12292a.put(str, obj);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.filter.Utils.b
        public Object b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("645ce260", new Object[]{this, str});
            }
            if (this.f12292a == null || TextUtils.isEmpty(str)) {
                return null;
            }
            return this.f12292a.get(str);
        }

        public void c(a aVar) {
            Map<String, Object> map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("714ca7b6", new Object[]{this, aVar});
                return;
            }
            if (aVar != null) {
                map = aVar.f12292a;
            } else {
                map = null;
            }
            if (!(map == null || map.isEmpty())) {
                if (this.f12292a == null) {
                    this.f12292a = new HashMap();
                }
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!this.f12292a.containsKey(key)) {
                        this.f12292a.put(key, value);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void a(String str, Object obj);

        Object b(String str);
    }

    static {
        t2o.a(503317253);
    }

    public static boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c444aa", new Object[]{obj, obj2})).booleanValue();
        }
        if (obj == obj2) {
            return true;
        }
        if (!(obj instanceof Boolean) || !(obj2 instanceof Boolean) || ((Boolean) obj).booleanValue() != ((Boolean) obj2).booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean b(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f819464b", new Object[]{obj, obj2})).booleanValue();
        }
        if (!(obj instanceof Number) || !(obj2 instanceof Number) || ((Number) obj).floatValue() != ((Number) obj2).floatValue()) {
            return false;
        }
        return true;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eb7b0e8", new Object[]{str})).booleanValue();
        }
        if (str == null || (str.length() != 7 && str.length() != 9)) {
            return true;
        }
        return false;
    }

    @FilterHandler(name = "compareVersion")
    public static int compareVersion(String str, String str2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9bbef41", new Object[]{str, str2})).intValue();
        }
        List<String> H = nwv.H(str, '.');
        List<String> H2 = nwv.H(str2, '.');
        int size = H.size();
        int size2 = H2.size();
        for (int i2 = 0; i < size && i2 < size2; i2++) {
            try {
                int i3 = (Long.parseLong(H.get(i)) > Long.parseLong(H2.get(i)) ? 1 : (Long.parseLong(H.get(i)) == Long.parseLong(H2.get(i)) ? 0 : -1));
                if (i3 > 0) {
                    return 1;
                }
                if (i3 < 0) {
                    return -1;
                }
                i++;
            } catch (Exception unused) {
                return 1;
            }
        }
        return size - size2;
    }

    @FilterHandler(name = "converToVideoModel")
    public static JSONObject converToVideoModel(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9230860d", new Object[]{obj});
        }
        if (obj == null || !(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(hnn.KEY_VIDEO_TYPE, (Object) "1");
        jSONObject2.put("src", (Object) jSONObject.getString("videoPath"));
        jSONObject2.put("cover", (Object) jSONObject.getString("path"));
        jSONObject2.put("feedId", (Object) jSONObject.getString("feedId"));
        jSONObject2.put("mode", (Object) "mute");
        if (jSONObject.containsKey("bizCode")) {
            jSONObject2.put("bizCode", (Object) jSONObject.getString("bizCode"));
        } else {
            jSONObject2.put("bizCode", (Object) "WEITAO");
        }
        jSONObject2.put("videoId", (Object) jSONObject.getString("videoId"));
        if (jSONObject.containsKey("interactiveId")) {
            jSONObject2.put("interactiveId", (Object) jSONObject.getString("interactiveId"));
        }
        if (jSONObject.containsKey("spmCnt")) {
            jSONObject2.put("spm-cnt", (Object) jSONObject.getString("spmCnt"));
        }
        if (jSONObject.containsKey("userId")) {
            jSONObject2.put("userId", (Object) jSONObject.getString("userId"));
        }
        jSONObject2.put("videoSource", (Object) "TBVideo");
        jSONObject2.put("isSimpleLayer", (Object) jSONObject.getString("isSimpleLayer"));
        jSONObject2.put("bizId", (Object) jSONObject.getString("WEITAO"));
        return jSONObject2;
    }

    @FilterHandler(name = "copy")
    public static Object copy(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("25a997da", new Object[]{obj});
        }
        if (obj instanceof Map) {
            return new JSONObject((Map) obj);
        }
        if (obj instanceof List) {
            return new JSONArray((List) obj);
        }
        return obj;
    }

    @FilterHandler(name = "deepCopy")
    public static JSON deepCopy(JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSON) ipChange.ipc$dispatch("91ed5f46", new Object[]{json});
        }
        if (json instanceof JSONObject) {
            return JSON.parseObject(json.toJSONString());
        }
        return JSON.parseArray(json.toJSONString());
    }

    public static String e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("241e649a", new Object[]{new Integer(i)});
        }
        String hexString = Integer.toHexString(i);
        if (hexString.length() == 1) {
            return "0".concat(hexString);
        }
        return hexString;
    }

    @FilterHandler(name = "env")
    public static JSONObject env(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bde00fdc", new Object[]{oVar});
        }
        if (oVar != null) {
            return ig8.d(oVar.M());
        }
        return ig8.c();
    }

    @FilterHandler(name = "exp")
    public static Object exp(String str, Object obj, iuo iuoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("851dbb8f", new Object[]{str, obj, iuoVar});
        }
        return eq8.e(str, obj, iuoVar);
    }

    public static int f(Map map, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c34d3bb1", new Object[]{map, obj, str})).intValue();
        }
        int intValue = Integer.valueOf(String.valueOf(obj)).intValue();
        if (map == null) {
            return 0;
        }
        int[] g = g(map);
        int i = g[0];
        int i2 = g[1];
        if (i <= 0 || i2 <= 0) {
            return 0;
        }
        if (str.equalsIgnoreCase("height")) {
            return (int) ((((intValue * i2) * 1.0d) / i) + 0.5d);
        }
        return (int) ((((intValue * i) * 1.0d) / i2) + 0.5d);
    }

    @FilterHandler(name = "filter")
    public static JSONArray filter(Object obj, Object obj2) {
        Object obj3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("78489227", new Object[]{obj, obj2});
        }
        JSONArray jSONArray = new JSONArray();
        if (obj != null && obj2 != null && (obj instanceof List) && (obj2 instanceof String)) {
            List list = (List) obj;
            for (int i = 0; i < list.size(); i++) {
                try {
                    obj3 = kq8.a((String) obj2, list.get(i));
                } catch (Exception unused) {
                    tfs.i("filter", obj2 + "  failed with value " + list.get(i).toString());
                    obj3 = null;
                }
                if (nwv.o(obj3, false)) {
                    jSONArray.add(list.get(i));
                }
            }
        }
        return jSONArray;
    }

    @FilterHandler(name = pg1.ATOM_EXT_flatMap)
    public static Map flatMap(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f84af33b", new Object[]{obj});
        }
        if (!(obj instanceof Map)) {
            return null;
        }
        Map map = (Map) obj;
        Set<String> keySet = map.keySet();
        JSONObject jSONObject = new JSONObject();
        for (String str : keySet) {
            Object obj2 = map.get(str);
            if (obj2 != null && (obj2 instanceof Map)) {
                jSONObject.putAll((Map) obj2);
            }
        }
        return jSONObject;
    }

    @FilterHandler(name = "playerHeight")
    public static int getScaleSize(Object obj, Object obj2, Object obj3, Object obj4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("534ca51f", new Object[]{obj, obj2, obj3, obj4})).intValue();
        }
        int t = nwv.t(obj, 0);
        int t2 = nwv.t(obj2, 0);
        int t3 = nwv.t(obj3, 0);
        int t4 = nwv.t(obj4, 0);
        if (t <= 0 || t2 <= 0 || t3 <= 0 || t4 <= 0) {
            return 0;
        }
        return Math.min((t3 * t2) / t, t4);
    }

    public static Object h(boolean z, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("34997ca2", new Object[]{new Boolean(z), obj, obj2});
        }
        if (z) {
            return obj;
        }
        return obj2;
    }

    @FilterHandler(name = "hasKey")
    public static boolean hasKey(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2997b416", new Object[]{obj, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (obj instanceof Map)) {
            return ((Map) obj).containsKey(str);
        }
        return false;
    }

    @FilterHandler(name = "imageHeight")
    public static int imageHeight(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eac91a14", new Object[]{obj, obj2})).intValue();
        }
        if (obj instanceof Map) {
            return f((Map) obj, obj2, "height");
        }
        return 0;
    }

    @FilterHandler(name = "isAndroid")
    public static boolean isAndroid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3c387f0", new Object[0])).booleanValue();
        }
        return true;
    }

    @FilterHandler(name = "isEmpty")
    public static boolean isEmpty(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcaeceaa", new Object[]{obj})).booleanValue();
        }
        return !isNotEmpty(obj);
    }

    @FilterHandler(name = "isEqual")
    public static boolean isEqual(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eeea4fed", new Object[]{obj, obj2})).booleanValue();
        }
        if (obj == obj2) {
            return true;
        }
        if (!(obj == null && obj2 == null)) {
            if ((obj instanceof Number) || (obj2 instanceof Number)) {
                if (obj == null) {
                    obj = 0;
                }
                if (obj2 == null) {
                    obj2 = 0;
                }
                return b(obj, obj2);
            } else if ((obj instanceof Boolean) || (obj2 instanceof Boolean)) {
                return a(obj, obj2);
            } else {
                try {
                    if (obj != null) {
                        return obj.equals(obj2);
                    }
                    if (obj2 != null) {
                        return obj2.equals(obj);
                    }
                } catch (Exception e) {
                    tfs.e("isEqual", e.getMessage());
                }
            }
        }
        return false;
    }

    @FilterHandler(name = "isIOS")
    public static boolean isIOS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b55918e", new Object[0])).booleanValue();
        }
        return false;
    }

    @FilterHandler(name = "isNotEmpty")
    public static boolean isNotEmpty(Object obj) {
        boolean isEmpty;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a57a32b", new Object[]{obj})).booleanValue();
        }
        if (obj instanceof Map) {
            isEmpty = ((Map) obj).isEmpty();
        } else if (obj instanceof List) {
            isEmpty = ((List) obj).isEmpty();
        } else if (obj instanceof String) {
            isEmpty = TextUtils.isEmpty((String) obj);
        } else {
            if (obj != null) {
                z = true;
            }
            return z;
        }
        return !isEmpty;
    }

    @FilterHandler(name = "isNull")
    public static boolean isNull(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a65fffb8", new Object[]{obj})).booleanValue();
        }
        if (obj == null) {
            return true;
        }
        return false;
    }

    @FilterHandler(name = "isSupportedComponent")
    public static boolean isSupportedComponent(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30ce9ea0", new Object[]{obj})).booleanValue();
        }
        return d.e(obj.toString());
    }

    @FilterHandler(name = "keys")
    public static Set<String> keys(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("5b98c746", new Object[]{obj});
        }
        if (obj instanceof Map) {
            return ((Map) obj).keySet();
        }
        return null;
    }

    @FilterHandler(name = "objectForKey")
    public static Object objectForKey(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d73ba3d0", new Object[]{obj, str});
        }
        if (!TextUtils.isEmpty(str) && (obj instanceof Map)) {
            Map map = (Map) obj;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        return null;
    }

    @FilterHandler(name = "objectForKeyPath")
    public static Object objectForKeyPath(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6e47b9ab", new Object[]{obj, str});
        }
        List<String> H = nwv.H(str, '.');
        int size = H.size();
        for (int i = 0; i < size && obj != null; i++) {
            String str2 = H.get(i);
            List<String> H2 = nwv.H(str2, '[');
            int size2 = H2.size();
            if (1 == size2) {
                if (obj instanceof Map) {
                    obj = ((Map) obj).get(str2);
                }
                obj = null;
            } else {
                if (obj instanceof Map) {
                    List list = (List) ((Map) obj).get(str2.substring(0, str2.indexOf(91)));
                    for (int i2 = 1; i2 < size2; i2++) {
                        int parseInt = Integer.parseInt(H2.get(i2).substring(0, H2.get(i2).length() - 1));
                        if (list == null || list.isEmpty() || parseInt >= list.size()) {
                            return null;
                        }
                        obj = list.get(parseInt);
                    }
                    continue;
                }
                obj = null;
            }
        }
        return obj;
    }

    @FilterHandler(name = "once")
    public static Object once(iuo iuoVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("63f93267", new Object[]{iuoVar, str, obj});
        }
        if (iuoVar != null && !TextUtils.isEmpty(str) && (iuoVar instanceof b)) {
            b bVar = (b) iuoVar;
            Object b2 = bVar.b(str);
            if (b2 != null) {
                return b2;
            }
            bVar.a(str, obj);
        }
        return obj;
    }

    @FilterHandler(name = "opt")
    public static Object opt(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("82517c00", new Object[]{obj, obj2});
        }
        if (nwv.o(obj, false)) {
            return obj;
        }
        return obj2;
    }

    @FilterHandler(name = "option")
    public static Object option(Object obj, Object obj2, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4fef5122", new Object[]{obj, obj2, obj3});
        }
        return h(nwv.o(obj, false), obj2, obj3);
    }

    @FilterHandler(name = "parseEmotion")
    public static String parseEmotion(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90c2bb99", new Object[]{obj, obj2});
        }
        int t = nwv.t(obj2, 25);
        if (obj instanceof String) {
            return hc8.k(String.valueOf(obj), t);
        }
        return "";
    }

    @FilterHandler(name = pg1.ATOM_EXT_parseFloat)
    public static float parseFloat(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8c56b3c", new Object[]{obj})).floatValue();
        }
        return nwv.r(obj, 0);
    }

    @FilterHandler(name = pg1.ATOM_EXT_parseInt)
    public static Object parseInt(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("21d7e133", new Object[]{obj});
        }
        if (obj instanceof Number) {
            return obj;
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) obj));
        } catch (Exception unused) {
            return Long.valueOf(nwv.y(obj, 0L));
        }
    }

    @FilterHandler(name = "parseJSON")
    public static JSON parseJSON(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSON) ipChange.ipc$dispatch("37b5409d", new Object[]{obj});
        }
        try {
            if (obj instanceof String) {
                return JSON.parseObject((String) obj);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @FilterHandler(name = "themeColor")
    public static int themeColor(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bfa5030", new Object[]{obj})).intValue();
        }
        if (obj != null) {
            return ir2.j(obj);
        }
        return 0;
    }

    @FilterHandler(name = "toJSONString")
    public static String toJSONString(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57f6b409", new Object[]{obj});
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).toJSONString();
        }
        if (obj instanceof JSONArray) {
            return ((JSONArray) obj).toJSONString();
        }
        if (obj != null) {
            return JSON.toJSONString(obj);
        }
        return null;
    }

    @FilterHandler(name = "toString")
    public static String toString(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3cf5fa71", new Object[]{obj});
        }
        if (!(obj instanceof JSONObject) && !(obj instanceof JSONArray) && (obj instanceof String)) {
            return obj.toString();
        }
        return null;
    }

    @FilterHandler(name = "transitionColor")
    public static String transitionColor(String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4fae67c9", new Object[]{str, str2, new Float(f)});
        }
        if (c(str) || c(str2)) {
            return "";
        }
        if (str.length() == 7) {
            StringBuilder sb = new StringBuilder(str);
            sb.insert(1, "ff");
            str = sb.toString();
        }
        if (str2.length() == 7) {
            StringBuilder sb2 = new StringBuilder(str2);
            sb2.insert(1, "ff");
            str2 = sb2.toString();
        }
        int parseInt = Integer.parseInt(str.substring(1, 3), 16);
        int parseInt2 = Integer.parseInt(str.substring(3, 5), 16);
        int parseInt3 = Integer.parseInt(str.substring(5, 7), 16);
        int parseInt4 = Integer.parseInt(str.substring(7), 16);
        int parseInt5 = Integer.parseInt(str2.substring(1, 3), 16);
        int parseInt6 = Integer.parseInt(str2.substring(3, 5), 16);
        int parseInt7 = Integer.parseInt(str2.substring(5, 7), 16);
        int parseInt8 = (int) (((Integer.parseInt(str2.substring(7), 16) - parseInt4) * f) + parseInt4);
        return "#" + e((int) (((parseInt5 - parseInt) * f) + parseInt)) + e((int) (((parseInt6 - parseInt2) * f) + parseInt2)) + e((int) (((parseInt7 - parseInt3) * f) + parseInt3)) + e(parseInt8);
    }

    @FilterHandler(name = "urlJoin")
    public static String urlJoin(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c56eafa", new Object[]{str, obj});
        }
        if (!(obj instanceof Map)) {
            return str;
        }
        Map map = (Map) obj;
        StringBuilder sb = new StringBuilder(str);
        if (sb.indexOf("?") == -1) {
            sb.append("?");
        }
        for (Map.Entry entry : map.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    public static int[] g(Map map) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("f36937d", new Object[]{map});
        }
        if (map.containsKey("width")) {
            i = nwv.t(map.get("width"), 0);
        } else if (map.containsKey("picWidth")) {
            i = nwv.t(map.get("picWidth"), 0);
        } else {
            i = map.containsKey("imageWidth") ? nwv.t(map.get("imageWidth"), 0) : 0;
        }
        if (map.containsKey("height")) {
            i2 = nwv.t(map.get("height"), 0);
        } else if (map.containsKey("picHeight")) {
            i2 = nwv.t(map.get("picHeight"), 0);
        } else if (map.containsKey("imageHeight")) {
            i2 = nwv.t(map.get("imageHeight"), 0);
        }
        return new int[]{i, i2};
    }

    @FilterHandler(name = "imageWidth")
    public static int imageWidth(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99f39bdd", new Object[]{obj, obj2})).intValue();
        }
        if (obj instanceof Map) {
            return f((Map) obj, obj2, "width");
        }
        return 0;
    }

    @FilterHandler(name = "formatCount")
    public static String formatCount(Object obj) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("698b9005", new Object[]{obj});
        }
        if (obj == null) {
            return "";
        }
        long parseLong = Long.parseLong(obj.toString());
        if (parseLong < 10000) {
            return String.valueOf(parseLong);
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = (int) (parseLong / 10000);
        i = (int) ((parseLong % 10000) / 1000);
        if (((int) ((parseLong % 1000) / 100)) >= 5 && (i = i + 1) > 9) {
            i2++;
        }
        stringBuffer.append(i2);
        if (i >= 0) {
            stringBuffer.append(".");
            stringBuffer.append(i);
        }
        stringBuffer.append("万");
        return stringBuffer.toString();
    }

    public static Object d(iuo iuoVar, String str, String str2, List list) {
        char c = 4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4c9cd94a", new Object[]{iuoVar, str, str2, list});
        }
        try {
            switch (str2.hashCode()) {
                case -1999577330:
                    if (str2.equals("transitionColor")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case -1833406949:
                    if (str2.equals("parseJSON")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -1776922004:
                    if (str2.equals("toString")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1658364683:
                    if (str2.equals("objectForKey")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1450494677:
                    if (str2.equals("imageWidth")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1441169947:
                    if (str2.equals("isAndroid")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case -1274492040:
                    if (str2.equals("filter")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case -1224452763:
                    if (str2.equals("hasKey")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1180261935:
                    if (str2.equals("isNull")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1010136971:
                    if (str2.equals("option")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case -1003958423:
                    if (str2.equals(pg1.ATOM_EXT_parseFloat)) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -809782598:
                    if (str2.equals("objectForKeyPath")) {
                        break;
                    }
                    c = 65535;
                    break;
                case -778842333:
                    if (str2.equals(pg1.ATOM_EXT_flatMap)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -745365046:
                    if (str2.equals("converToVideoModel")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case -581260440:
                    if (str2.equals("playerHeight")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case -292069703:
                    if (str2.equals("isSupportedComponent")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case -170473671:
                    if (str2.equals("urlJoin")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 100589:
                    if (str2.equals("env")) {
                        c = '\"';
                        break;
                    }
                    c = 65535;
                    break;
                case 100893:
                    if (str2.equals("exp")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case 110259:
                    if (str2.equals("opt")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 3059573:
                    if (str2.equals("copy")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 3288564:
                    if (str2.equals("keys")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3415681:
                    if (str2.equals("once")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3601339:
                    if (str2.equals("uuid")) {
                        c = '#';
                        break;
                    }
                    c = 65535;
                    break;
                case 100468355:
                    if (str2.equals("isIOS")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 523239194:
                    if (str2.equals("themeColor")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case 628017793:
                    if (str2.equals("deepCopy")) {
                        c = JSONLexer.EOI;
                        break;
                    }
                    c = 65535;
                    break;
                case 705281576:
                    if (str2.equals("parseEmotion")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 759061892:
                    if (str2.equals("isNotEmpty")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 949492787:
                    if (str2.equals("compareVersion")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 1187783740:
                    if (str2.equals(pg1.ATOM_EXT_parseInt)) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1432603480:
                    if (str2.equals("formatCount")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 1846310498:
                    if (str2.equals("imageHeight")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 2058039875:
                    if (str2.equals("isEmpty")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 2058163242:
                    if (str2.equals("isEqual")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 2079347668:
                    if (str2.equals("toJSONString")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
        } catch (Throwable th) {
            tfs.e("utils.filter", "error:" + str2 + th.getMessage());
        }
        switch (c) {
            case 0:
                return once(iuoVar, str, list.get(0));
            case 1:
                return keys(list.get(0));
            case 2:
                return Boolean.valueOf(hasKey(list.get(0), (String) list.get(1)));
            case 3:
                return objectForKey(list.get(0), (String) list.get(1));
            case 4:
                return objectForKeyPath(list.get(0), (String) list.get(1));
            case 5:
                return Integer.valueOf(imageHeight(list.get(0), list.get(1)));
            case 6:
                return Integer.valueOf(imageWidth(list.get(0), list.get(1)));
            case 7:
                return flatMap(list.get(0));
            case '\b':
                return parseEmotion(list.get(0), list.get(1));
            case '\t':
                return toJSONString(list.get(0));
            case '\n':
                return Float.valueOf(parseFloat(list.get(0)));
            case 11:
                return parseInt(list.get(0));
            case '\f':
                return toString(list.get(0));
            case '\r':
                return parseJSON(list.get(0));
            case 14:
                return Boolean.valueOf(isNull(list.get(0)));
            case 15:
                return Boolean.valueOf(isEqual(list.get(0), list.get(1)));
            case 16:
                return option(list.get(0), list.get(1), list.get(2));
            case 17:
                return opt(list.get(0), list.get(1));
            case 18:
                return formatCount(list.get(0));
            case 19:
                return Boolean.valueOf(isNotEmpty(list.get(0)));
            case 20:
                return Boolean.valueOf(isEmpty(list.get(0)));
            case 21:
                return Boolean.valueOf(isAndroid());
            case 22:
                return Boolean.valueOf(isIOS());
            case 23:
                return converToVideoModel(list.get(0));
            case 24:
                return Integer.valueOf(compareVersion((String) list.get(0), (String) list.get(1)));
            case 25:
                return urlJoin((String) list.get(0), list.get(1));
            case 26:
                return deepCopy((JSON) list.get(0));
            case 27:
                return Boolean.valueOf(isSupportedComponent(list.get(0)));
            case 28:
                return filter(list.get(0), list.get(1));
            case 29:
                return Integer.valueOf(getScaleSize(list.get(0), list.get(1), list.get(2), list.get(3)));
            case 30:
                return Integer.valueOf(themeColor(list.get(0)));
            case 31:
                return copy(list.get(0));
            case ' ':
                return transitionColor((String) list.get(0), (String) list.get(1), nwv.r(list.get(2), 1));
            case '!':
                if (list.size() > 1 && (list.get(1) instanceof iuo)) {
                    return exp(str, list.get(0), (iuo) list.get(1));
                }
                tfs.d("$.utils.exp args length < 2");
                return "";
            case '\"':
                return env((list.size() <= 0 || !(list.get(0) instanceof r)) ? null : ((r) list.get(0)).r());
            case '#':
                return UUID.randomUUID().toString();
            default:
                return "";
        }
    }
}
