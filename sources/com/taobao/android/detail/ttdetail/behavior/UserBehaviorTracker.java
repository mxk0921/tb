package com.taobao.android.detail.ttdetail.behavior;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.b5m;
import tb.hjh;
import tb.t2o;
import tb.vbl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class UserBehaviorTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f6696a = new HashSet<String>() { // from class: com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker.1
        {
            add("disappear");
            add("userTrack");
            add("user_track");
            add("track");
            add("ut_exposure");
        }
    };
    public static final Set<String> b = new HashSet<String>() { // from class: com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker.2
        {
            add("user_id");
            add("unique_id");
            add("start_time");
            add("report_time");
        }
    };
    public static final Map<Integer, JSONObject> c = new ConcurrentHashMap();
    public static final UBF d = new UBF();
    public static final Map<Integer, Integer> e = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class UBF {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<Integer, String> f6697a;
        public final Map<Integer, String> b;
        public final b5m.v c;

        static {
            t2o.a(912261303);
        }

        public UBF() {
            this.f6697a = new ConcurrentHashMap();
            this.b = new ConcurrentHashMap();
            this.c = vbl.Y0() ? g() : null;
        }

        public void a(Context context, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8732cde1", new Object[]{this, context, str, str2});
            } else if (this.c != null) {
                String str3 = (String) ((ConcurrentHashMap) this.b).get(Integer.valueOf(context.hashCode()));
                if (str3 != null) {
                    this.c.h(str, str3, str2);
                }
            }
        }

        public void b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32fe9949", new Object[]{this, context});
            } else if (this.c != null) {
                int hashCode = context.hashCode();
                String str = (String) ((ConcurrentHashMap) this.b).get(Integer.valueOf(hashCode));
                if (str == null) {
                    str = this.c.k((Activity) context);
                    ((ConcurrentHashMap) this.b).put(Integer.valueOf(hashCode), str);
                }
                this.c.e(str, "Page_Detail");
            }
        }

        public void c(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("110fb511", new Object[]{this, context});
            } else if (this.c != null) {
                int hashCode = context.hashCode();
                String str = (String) ((ConcurrentHashMap) this.f6697a).get(Integer.valueOf(hashCode));
                if (str == null) {
                    str = this.c.a();
                    ((ConcurrentHashMap) this.f6697a).put(Integer.valueOf(hashCode), str);
                }
                this.c.l(str, "detail");
            }
        }

        public void d(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af191e09", new Object[]{this, context, str});
            } else if (this.c != null) {
                String str2 = (String) ((ConcurrentHashMap) this.b).get(Integer.valueOf(context.hashCode()));
                if (str2 != null) {
                    this.c.b(str, str2);
                }
            }
        }

        public void e(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6a7d757", new Object[]{this, context});
            } else if (this.c != null) {
                String str = (String) ((ConcurrentHashMap) this.b).get(Integer.valueOf(context.hashCode()));
                if (str != null) {
                    this.c.j(str);
                }
            }
        }

        public void f(Context context, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c490ddf1", new Object[]{this, context, new Boolean(z)});
            } else if (this.c != null) {
                int hashCode = context.hashCode();
                String str = (String) ((ConcurrentHashMap) this.f6697a).remove(Integer.valueOf(hashCode));
                ((ConcurrentHashMap) this.b).remove(Integer.valueOf(hashCode));
                if (str != null) {
                    if (z) {
                        this.c.i(str, new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker.UBF.1
                            {
                                put("validDetailUBF", "true");
                            }
                        });
                    }
                    this.c.g(str);
                }
            }
        }

        public final b5m.v g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b5m.v) ipChange.ipc$dispatch("889bba1e", new Object[]{this});
            }
            b5m.v P = b5m.P();
            if (P != null) {
                return P.m();
            }
            return null;
        }

        public String h(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("971afef3", new Object[]{this, context});
            }
            if (this.c == null) {
                return null;
            }
            return (String) ((ConcurrentHashMap) this.f6697a).get(Integer.valueOf(context.hashCode()));
        }

        public String i(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b43ff224", new Object[]{this, context});
            }
            if (this.c == null) {
                return null;
            }
            return (String) ((ConcurrentHashMap) this.b).get(Integer.valueOf(context.hashCode()));
        }

        public void j(Context context, String str, String str2, String str3, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6828b4d8", new Object[]{this, context, str, str2, str3, map});
            } else if (this.c != null) {
                String str4 = (String) ((ConcurrentHashMap) this.b).get(Integer.valueOf(context.hashCode()));
                if (str4 != null) {
                    this.c.d(str, str4, str2, str3, map);
                }
            }
        }

        public void k(Context context, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3b4b79d", new Object[]{this, context, str, str2, obj});
            } else if (this.c != null) {
                String str3 = (String) ((ConcurrentHashMap) this.b).get(Integer.valueOf(context.hashCode()));
                if (str3 != null) {
                    this.c.c(str, str3, new HashMap<String, String>(str2, obj) { // from class: com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker.UBF.3
                        public final /* synthetic */ String val$key;
                        public final /* synthetic */ Object val$value;

                        {
                            this.val$key = str2;
                            this.val$value = obj;
                            put(str2, JSON.toJSONString(obj));
                        }
                    });
                }
            }
        }

        public void l(Context context, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("439cf1bd", new Object[]{this, context, str, str2});
            } else if (this.c != null) {
                String str3 = (String) ((ConcurrentHashMap) this.b).get(Integer.valueOf(context.hashCode()));
                if (str3 != null) {
                    this.c.f(str3, new HashMap<String, String>(str, str2) { // from class: com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker.UBF.2
                        public final /* synthetic */ String val$key;
                        public final /* synthetic */ String val$value;

                        {
                            this.val$key = str;
                            this.val$value = str2;
                            put(str, str2);
                        }
                    });
                }
            }
        }
    }

    static {
        t2o.a(912261296);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a534eda", new Object[]{context, str});
        } else if (!Boolean.FALSE.equals(DevFeature.mFeature.get(DevFeature.sEnableNewUserBehavior)) || vbl.X0()) {
            ((ConcurrentHashMap) c).put(Integer.valueOf(context.hashCode()), new JSONObject(10, str) { // from class: com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker.3
                public final /* synthetic */ String val$pageToken;

                {
                    this.val$pageToken = str;
                    put("user_id", (Object) hjh.b());
                    put("unique_id", (Object) str);
                    put("start_time", (Object) String.valueOf(System.currentTimeMillis()));
                }
            });
            d.c(context);
        }
    }

    public static void b(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ff65c42", new Object[]{context, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = (JSONObject) ((ConcurrentHashMap) c).remove(Integer.valueOf(context.hashCode()));
        if (z && jSONObject != null && !jSONObject.isEmpty()) {
            jSONObject.put("report_time", (Object) String.valueOf(System.currentTimeMillis()));
            UtUtils.f(19999, "Page_Detail_NewUserBehavior", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker.6
                {
                    put("new_user_behavior", (Object) URLEncoder.encode(JSONObject.this.toJSONString()));
                }
            });
        }
        d.f(context, z);
    }

    public static JSONObject c(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fe0b9f08", new Object[]{context, str, new Boolean(z)});
        }
        JSONObject d2 = d(context);
        if (d2 == null) {
            return null;
        }
        JSONObject jSONObject = d2.getJSONObject("components");
        if (jSONObject == null) {
            jSONObject = new JSONObject(10, true);
            d2.put("components", (Object) jSONObject);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        if (jSONObject2 != null || z) {
            return jSONObject2;
        }
        JSONObject jSONObject3 = new JSONObject(2);
        jSONObject.put(str, (Object) jSONObject3);
        return jSONObject3;
    }

    public static JSONObject d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6797c75", new Object[]{context});
        }
        return (JSONObject) ((ConcurrentHashMap) c).get(Integer.valueOf(context.hashCode()));
    }

    public static String e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("880e86a6", new Object[]{context});
        }
        return d.h(context);
    }

    public static String f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bf26857", new Object[]{context});
        }
        return d.i(context);
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1884b3be", new Object[]{context});
            return;
        }
        int hashCode = context.hashCode();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) e;
        Object obj = concurrentHashMap.get(Integer.valueOf(hashCode));
        concurrentHashMap.put(Integer.valueOf(hashCode), 1);
        if (obj == null || ((Integer) obj).intValue() != 1) {
            d.b(context);
        }
    }

    public static void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30c5e30c", new Object[]{context});
            return;
        }
        int hashCode = context.hashCode();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) e;
        Object obj = concurrentHashMap.get(Integer.valueOf(hashCode));
        concurrentHashMap.put(Integer.valueOf(hashCode), 2);
        if (obj == null || ((Integer) obj).intValue() != 2) {
            d.e(context);
        }
    }

    public static void i(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8de354", new Object[]{context, str, str2});
        } else if (((HashSet) b).contains(str)) {
            d.l(context, str, str2);
        } else {
            JSONObject d2 = d(context);
            if (d2 != null) {
                d2.put(str, (Object) str2);
            }
            d.l(context, str, str2);
        }
    }

    public static void j(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13610939", new Object[]{context, str, new Integer(i)});
            return;
        }
        boolean a2 = BehaviorChainGenerator.a(i);
        JSONObject c2 = c(context, str, a2);
        if (c2 != null) {
            JSONArray jSONArray = c2.getJSONArray("behavior_chain");
            if ((jSONArray != null && !jSONArray.isEmpty()) || !a2) {
                if (jSONArray == null) {
                    jSONArray = new JSONArray(2);
                    c2.put("behavior_chain", (Object) jSONArray);
                }
                if (!UserBehaviorUtils.a(jSONArray, i)) {
                    jSONArray.add(BehaviorChainGenerator.b(i));
                    if (i == 1) {
                        b5m.A().c("Page_Detail", BehaviorChainGenerator.e(i), null, null, UtUtils.i(new HashMap<String, String>(str) { // from class: com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker.4
                            public final /* synthetic */ String val$componentName;

                            {
                                this.val$componentName = str;
                                put("_cName", str);
                            }
                        }));
                    } else if (i == 2) {
                        b5m.A().a("Page_Detail", BehaviorChainGenerator.e(i), null, null, UtUtils.i(new HashMap<String, String>(str) { // from class: com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker.5
                            public final /* synthetic */ String val$componentName;

                            {
                                this.val$componentName = str;
                                put("_cName", str);
                            }
                        }));
                    }
                    if (i == 1) {
                        UBF ubf = d;
                        ubf.a(context, str, "name: " + str);
                    } else if (i == 2) {
                        d.d(context, str);
                    }
                }
            }
        }
    }

    public static void k(Context context, String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90359878", new Object[]{context, str, str2, obj});
            return;
        }
        JSONObject c2 = c(context, str, false);
        if (c2 != null) {
            JSONObject jSONObject = c2.getJSONObject("content_info");
            if (jSONObject == null) {
                jSONObject = new JSONObject(2);
                c2.put("content_info", (Object) jSONObject);
            }
            jSONObject.put(str2, obj);
        }
        d.k(context, str, str2, obj);
    }

    public static void l(Context context, String str, String str2, Map<String, String> map) {
        JSONObject d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("131135e6", new Object[]{context, str, str2, map});
        } else if (!((HashSet) f6696a).contains(str2) && (d2 = d(context)) != null) {
            JSONArray jSONArray = d2.getJSONArray("event_chain");
            if (jSONArray == null) {
                jSONArray = new JSONArray(2);
                d2.put("event_chain", (Object) jSONArray);
            }
            jSONArray.add(BehaviorChainGenerator.c(str, str2, map));
            UBF ubf = d;
            ubf.j(context, str, "name: " + str, str2, map);
        }
    }

    public static void m(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36282655", new Object[]{context, str, str2});
        } else {
            n(context, str, str2, true);
        }
    }

    public static void n(Context context, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8edd571f", new Object[]{context, str, str2, new Boolean(z)});
            return;
        }
        JSONObject d2 = d(context);
        if (d2 != null) {
            JSONObject jSONObject = d2.getJSONObject("global_info");
            if (jSONObject == null) {
                jSONObject = new JSONObject(2);
                d2.put("global_info", (Object) jSONObject);
            }
            jSONObject.put(str, (Object) str2);
        }
        if (z) {
            d.l(context, str, str2);
        }
    }
}
