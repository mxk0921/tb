package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kza {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CACHE_DOUBLE = "mtop_response_cache_videolist";
    public static final String KEY_CACHE_SINGLE = "mtop_response_cache_videolist_single";

    /* renamed from: a  reason: collision with root package name */
    public static final String f23020a = kza.class.getSimpleName();
    public static volatile Object b = null;
    public static volatile Object c = null;
    public static volatile JSONObject d = null;
    public static volatile JSONObject e = null;
    public static final String f = "channel_faxian_realExpoInfo0221";
    public static final String g = "channel_faxian_last_realExpoInfo0221";
    public static volatile Object h = null;
    public static volatile Object i = null;

    static {
        t2o.a(310378675);
    }

    public static Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7737e72c", new Object[0]);
        }
        if (b == null) {
            b = nwg.b(KEY_CACHE_DOUBLE);
        }
        return b;
    }

    public static Object b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b693cb35", new Object[0]);
        }
        if (h == null) {
            h = nwg.b(f);
        }
        return h;
    }

    public static Object c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3496a4fc", new Object[0]);
        }
        if (i == null) {
            i = nwg.b(g);
        }
        return i;
    }

    public static Object d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("94f811e3", new Object[0]);
        }
        if (c == null) {
            c = nwg.b(KEY_CACHE_SINGLE);
        }
        return c;
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a340e7", new Object[]{str});
        } else if (!orq.a(str)) {
            try {
                Coordinator.postTask(new a("writeDoubleFeedListCache", str));
            } catch (Exception e2) {
                String str2 = f23020a;
                r0h.b(str2, "writeDoubleFeedListCache ERROR" + e2.getMessage());
            }
        }
    }

    public static void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4460e2ca", new Object[]{jSONObject});
        } else if (jSONObject != null) {
            nwg.d(f, jSONObject);
        }
    }

    public static void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9d4e91", new Object[]{jSONObject});
        } else if (jSONObject != null) {
            nwg.d(g, jSONObject);
        }
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e86d10", new Object[]{str});
        } else if (!orq.a(str)) {
            Coordinator.postTask(new b("writeSingleFeedListCache", str));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23021a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(str);
            this.f23021a = str2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/HomeCacheUtils$1");
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject parseObject = JSON.parseObject(this.f23021a);
            if (!(parseObject == null || (jSONObject = parseObject.getJSONObject("data")) == null)) {
                JSONArray jSONArray = jSONObject.getJSONArray("cardList");
                if (jSONArray.size() == 3) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                    boolean z = sj7.t() && nvs.e0();
                    if (qw0.b() && nvs.g0()) {
                        z = true;
                    }
                    if (sj7.a() && nvs.f0()) {
                        z = true;
                    }
                    if (z) {
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("cardTypes");
                        JSONArray jSONArray3 = jSONObject2.getJSONArray("cardData");
                        if (!(jSONArray2 == null || jSONArray3 == null)) {
                            jSONObject2.put("cardData", (Object) null);
                            jSONObject2.put("cardTypes", (Object) null);
                            jSONObject2.put("background", "");
                        }
                        jSONArray.remove(0);
                        jSONArray.add(0, jSONObject2);
                    }
                    JSONObject jSONObject3 = jSONArray.getJSONObject(2);
                    if (!(jSONObject3 == null || jSONObject3.getJSONArray("cardData") == null)) {
                        JSONArray jSONArray4 = jSONObject3.getJSONArray("cardData");
                        int b0 = nvs.b0();
                        if (!(b0 == -1 || jSONArray4 == null)) {
                            int size = jSONArray4.size();
                            if (size > b0) {
                                for (int i = size - 1; i > b0 - 1 && i > 0; i--) {
                                    jSONArray4.remove(i);
                                }
                            }
                            jSONObject3.put("cardData", (Object) jSONArray4);
                        }
                    }
                    jSONArray.remove(2);
                    jSONArray.add(2, jSONObject3);
                    JSONObject jSONObject4 = jSONArray.getJSONObject(1);
                    if (!(jSONObject4 == null || jSONObject4.getJSONArray("cardData") == null)) {
                        JSONArray jSONArray5 = jSONObject4.getJSONArray("cardData");
                        int h0 = nvs.h0();
                        if (!(h0 == -1 || jSONArray5 == null)) {
                            int size2 = jSONArray5.size();
                            if (size2 > h0) {
                                for (int i2 = size2 - 1; i2 > h0 - 1 && i2 > 0; i2--) {
                                    jSONArray5.remove(i2);
                                }
                            }
                            jSONObject4.put("cardData", (Object) jSONArray5);
                        }
                    }
                    jSONArray.remove(1);
                    jSONArray.add(1, jSONObject4);
                    jSONObject.put("cardList", (Object) jSONArray);
                    parseObject.put("data", (Object) jSONObject);
                    nwg.d(kza.KEY_CACHE_DOUBLE, JSON.toJSONString(parseObject));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23022a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(str);
            this.f23022a = str2;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/HomeCacheUtils$2");
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject parseObject = JSON.parseObject(this.f23022a);
            if (!(parseObject == null || (jSONObject = parseObject.getJSONObject("data")) == null)) {
                JSONArray jSONArray = jSONObject.getJSONArray("cardList");
                if (jSONArray.size() == 3) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                    boolean z = sj7.t() && nvs.e0();
                    if (qw0.b() && nvs.g0()) {
                        z = true;
                    }
                    if (sj7.a() && nvs.f0()) {
                        z = true;
                    }
                    if (z) {
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("cardTypes");
                        JSONArray jSONArray3 = jSONObject2.getJSONArray("cardData");
                        if (!(jSONArray2 == null || jSONArray3 == null)) {
                            jSONObject2.put("cardData", (Object) null);
                            jSONObject2.put("cardTypes", (Object) null);
                            jSONObject2.put("background", "");
                        }
                        jSONArray.remove(0);
                        jSONArray.add(0, jSONObject2);
                    }
                    JSONObject jSONObject3 = jSONArray.getJSONObject(1);
                    if (!(jSONObject3 == null || jSONObject3.getJSONArray("cardData") == null)) {
                        JSONArray jSONArray4 = jSONObject3.getJSONArray("cardData");
                        int h0 = nvs.h0();
                        if (!(h0 == -1 || jSONArray4 == null)) {
                            int size = jSONArray4.size();
                            if (size > h0) {
                                for (int i = size - 1; i > h0 - 1 && i > 0; i--) {
                                    jSONArray4.remove(i);
                                }
                            }
                            jSONObject3.put("cardData", (Object) jSONArray4);
                        }
                    }
                    jSONArray.remove(1);
                    jSONArray.add(1, jSONObject3);
                    JSONObject jSONObject4 = jSONArray.getJSONObject(2);
                    if (!(jSONObject4 == null || jSONObject4.getJSONArray("cardData") == null)) {
                        JSONArray jSONArray5 = jSONObject4.getJSONArray("cardData");
                        int c0 = nvs.c0();
                        if (!(c0 == -1 || jSONArray5 == null)) {
                            int size2 = jSONArray5.size();
                            if (size2 > c0) {
                                for (int i2 = size2 - 1; i2 > c0 - 1 && i2 > 0; i2--) {
                                    jSONArray5.remove(i2);
                                }
                            }
                            jSONObject4.put("cardData", (Object) jSONArray5);
                        }
                    }
                    jSONArray.remove(2);
                    jSONArray.add(2, jSONObject4);
                    jSONObject.put("cardList", (Object) jSONArray);
                    parseObject.put("data", (Object) jSONObject);
                    nwg.d(kza.KEY_CACHE_SINGLE, JSON.toJSONString(parseObject));
                }
            }
        }
    }
}
