package com.taobao.tao.flexbox.layoutmanager.player.videodecide;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.model.MediaVideoInfoRequestV2;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.c4o;
import tb.nwv;
import tb.prj;
import tb.qp0;
import tb.t2o;
import tb.tfs;
import tb.z5r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class VideoControllerManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARRAY_KEY_CACHES = "caches";
    public static final String ARRAY_KEY_CONFIGURATION = "configuration";
    public static final String ARRAY_KEY_DEFINITIONPRIORITY = "definitionPriority";
    public static final String ARRAY_KEY_ENABLEVODABR = "enableVodAbr";
    public static final String ARRAY_KEY_RESOURCES = "resources";
    public static final int HD_AB_STRATEGY1 = 1;
    public static final int HD_AB_STRATEGY2 = 2;
    public static final String KEY_BITRATE = "bitrate";
    public static final String KEY_CACHEKEY = "cacheKey";
    public static final String KEY_DEFINITION = "definition";
    public static final String KEY_ID = "id";
    public static final String TAG = "VideoControllerManager";
    public static final long UPDATE_CONFIG_INTERNAL = 5000;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, String> f12348a;
    public static prj b;
    public static Map<String, a> c;
    public static long d = 0;
    public static final b e = new b();
    public static float f;

    static {
        t2o.a(502268311);
    }

    public static String a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("64ef75ed", new Object[]{str, new Boolean(z)});
        }
        if (!z) {
            return str;
        }
        return "newDetail" + str;
    }

    public static JSONObject c(JSONObject jSONObject, prj prjVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("94ab2ebd", new Object[]{jSONObject, prjVar, new Boolean(z), new Boolean(z2)});
        }
        return d(jSONObject, prjVar, z, z2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #3 {all -> 0x004c, blocks: (B:9:0x0041, B:12:0x0047, B:17:0x0052, B:20:0x0059, B:58:0x0122, B:62:0x0130, B:68:0x014c, B:71:0x0153, B:73:0x017f, B:75:0x0188, B:78:0x0193, B:80:0x019c, B:82:0x01c0, B:84:0x01c6, B:89:0x01ce, B:90:0x01d0, B:92:0x01e0, B:94:0x01e5, B:96:0x0204, B:97:0x0206, B:100:0x020f, B:102:0x0232, B:66:0x013d), top: B:109:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013d A[Catch: all -> 0x0142, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x004c, blocks: (B:9:0x0041, B:12:0x0047, B:17:0x0052, B:20:0x0059, B:58:0x0122, B:62:0x0130, B:68:0x014c, B:71:0x0153, B:73:0x017f, B:75:0x0188, B:78:0x0193, B:80:0x019c, B:82:0x01c0, B:84:0x01c6, B:89:0x01ce, B:90:0x01d0, B:92:0x01e0, B:94:0x01e5, B:96:0x0204, B:97:0x0206, B:100:0x020f, B:102:0x0232, B:66:0x013d), top: B:109:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0152 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0153 A[Catch: all -> 0x004c, TryCatch #3 {all -> 0x004c, blocks: (B:9:0x0041, B:12:0x0047, B:17:0x0052, B:20:0x0059, B:58:0x0122, B:62:0x0130, B:68:0x014c, B:71:0x0153, B:73:0x017f, B:75:0x0188, B:78:0x0193, B:80:0x019c, B:82:0x01c0, B:84:0x01c6, B:89:0x01ce, B:90:0x01d0, B:92:0x01e0, B:94:0x01e5, B:96:0x0204, B:97:0x0206, B:100:0x020f, B:102:0x0232, B:66:0x013d), top: B:109:0x0041 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject d(org.json.JSONObject r24, tb.prj r25, boolean r26, boolean r27, java.util.Map<java.lang.String, java.lang.String> r28) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager.d(org.json.JSONObject, tb.prj, boolean, boolean, java.util.Map):org.json.JSONObject");
    }

    public static JSONObject e(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c7376c7d", new Object[]{jSONObject, new Boolean(z)});
        }
        if (!m(null)) {
            return jSONObject;
        }
        return c(jSONObject, null, z, false);
    }

    public static String f(float f2, float f3, JSONArray jSONArray) throws JSONException {
        float f4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9a5c27", new Object[]{new Float(f2), new Float(f3), jSONArray});
        }
        if (jSONArray == null) {
            return null;
        }
        tfs.e(TAG, "cflog 开始网速码率匹配，netSpeed=" + f2 + " abRatio=" + f3);
        JSONObject jSONObject = null;
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            int i3 = jSONObject2.getInt(KEY_BITRATE);
            String string = jSONObject2.getString("definition");
            if (i2 != 1) {
                if (i3 > 0) {
                    f4 = f2 / i3;
                } else {
                    f4 = 0.0f;
                }
                tfs.e(TAG, "cflog --》i " + i2 + " ratio=" + f4 + " definition = " + string);
                if (i2 == 0) {
                    if (f4 >= f3) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (f4 >= f3) {
                    if (!z || i3 > i) {
                        jSONObject = jSONObject2;
                        i = i3;
                    }
                    z = true;
                } else if (!z) {
                    if (i3 >= i) {
                    }
                }
                jSONObject = jSONObject2;
                i = i3;
            }
        }
        if (jSONObject != null) {
            return jSONObject.getString(KEY_CACHEKEY);
        }
        return null;
    }

    public static a g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("cb13720", new Object[]{str});
        }
        return h(str, null, false);
    }

    public static a h(String str, prj prjVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d2cd87e2", new Object[]{str, prjVar, new Boolean(z)});
        }
        if (!m(prjVar)) {
            return null;
        }
        try {
            if (c == null) {
                c = new HashMap();
            }
            return c.get(a(str, z));
        } catch (Throwable th) {
            tfs.e(TAG, th.getMessage());
            return null;
        }
    }

    public static float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e89be1d", new Object[0])).floatValue();
        }
        if (f <= 0.0f) {
            f = qp0.c();
        }
        return f;
    }

    public static boolean k(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d81c510", new Object[]{jSONObject, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(ARRAY_KEY_CACHES);
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getJSONObject(i).getString(KEY_CACHEKEY);
                if (string != null && string.equalsIgnoreCase(str)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f05517b", new Object[0])).booleanValue();
        }
        return m(null);
    }

    public static boolean m(prj prjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c60963a5", new Object[]{prjVar})).booleanValue();
        }
        if (prjVar == null) {
            prjVar = j(false);
        }
        if (prjVar == null || !prjVar.a()) {
            return false;
        }
        return true;
    }

    public static boolean n(TBVideoComponent.u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48f81f17", new Object[]{uVar})).booleanValue();
        }
        if (uVar.f1 == 2) {
            return true;
        }
        return false;
    }

    public static boolean o(TBVideoComponent.u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("920687e0", new Object[]{uVar})).booleanValue();
        }
        if (p(uVar) || n(uVar)) {
            return true;
        }
        return false;
    }

    public static boolean p(TBVideoComponent.u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ede783b8", new Object[]{uVar})).booleanValue();
        }
        if (uVar.f1 == 1) {
            return true;
        }
        return false;
    }

    public static void q(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f96f884", new Object[]{str, new Boolean(z)});
        } else if (m(null)) {
            r(str, z, false);
        }
    }

    public static void r(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c348cad0", new Object[]{str, new Boolean(z), new Boolean(z2)});
            return;
        }
        try {
            if (c == null) {
                c = new HashMap();
            }
            String a2 = a(str, z2);
            a aVar = c.get(a2);
            if (aVar == null) {
                aVar = new a();
            }
            aVar.h = z;
            c.put(a2, aVar);
        } catch (Throwable th) {
            tfs.e(TAG, th.getMessage());
        }
    }

    public static String t(JSONObject jSONObject, String str, String str2) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4705d7b1", new Object[]{jSONObject, str, str2});
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            if (jSONArray == null || jSONArray.length() <= 2) {
                return "";
            }
            JSONObject jSONObject3 = jSONArray.getJSONObject(1);
            int i = 0;
            while (true) {
                if (i >= jSONArray.length()) {
                    jSONObject2 = null;
                    break;
                }
                jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString(KEY_CACHEKEY);
                if (string != null && string.equalsIgnoreCase(str2)) {
                    break;
                }
                i++;
            }
            if (jSONObject2 == null) {
                return "";
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(0, jSONObject2);
            jSONArray2.put(1, jSONObject3);
            jSONObject.put(str, jSONArray2);
            return jSONObject2.getString("definition");
        } catch (Throwable th) {
            tfs.e(TAG, th.getMessage());
            return "";
        }
    }

    public static a v(String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5b9b34e9", new Object[]{str, jSONObject, new Boolean(z)});
        }
        if (jSONObject == null) {
            return null;
        }
        if (c == null) {
            c = new HashMap();
        }
        String a2 = a(str, z);
        a aVar = c.get(a2);
        if (aVar == null) {
            aVar = new a();
        }
        aVar.b(jSONObject);
        if (!z) {
            c.put(a2, aVar);
        }
        return aVar;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f12349a;
        public String b;
        public String c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public int i;
        public a j;
        public String k = "";
        public String l;

        static {
            t2o.a(502268313);
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("834f8fab", new Object[]{this});
            }
            return this.l;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "DecidedVideoResModel{videoId='" + this.f12349a + "', downCacheKey='" + this.b + "', definition='" + this.c + "', downBitrate=" + this.d + ", downSize=" + this.e + '}';
        }

        public void b(JSONObject jSONObject) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6efea2ee", new Object[]{this, jSONObject});
            } else if (jSONObject != null) {
                try {
                    String string = jSONObject.getString("id");
                    JSONArray optJSONArray = jSONObject.optJSONArray(VideoControllerManager.ARRAY_KEY_RESOURCES);
                    String str = "";
                    String str2 = str;
                    if (optJSONArray != null) {
                        String str3 = str2;
                        int i2 = 0;
                        while (i < optJSONArray.length()) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("definition");
                            this.k += optString;
                            if (i < optJSONArray.length() - 1) {
                                this.k += "#";
                            }
                            if (i == 0) {
                                i2 = jSONObject2.getInt(VideoControllerManager.KEY_BITRATE);
                                str3 = jSONObject2.getString(VideoControllerManager.KEY_CACHEKEY);
                                str2 = optString;
                            }
                            i++;
                        }
                        i = i2;
                        str = str3;
                    }
                    this.b = str;
                    this.d = i;
                    this.c = str2;
                    this.f12349a = string;
                } catch (Throwable th) {
                    tfs.e(VideoControllerManager.TAG, th.getMessage());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f12350a;

        static {
            t2o.a(502268314);
        }

        public b() {
            this.f12350a = "";
        }

        public b a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8e680992", new Object[]{this, str, str2});
            }
            this.f12350a += str + ":" + str2 + ",";
            return this;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c5d594b", new Object[]{this});
            }
            return this.f12350a;
        }

        public b d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("679435f1", new Object[]{this});
            }
            this.f12350a = "";
            return this;
        }

        public b b(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9464e740", new Object[]{this, str, jSONObject});
            }
            String str2 = "";
            try {
                JSONArray jSONArray = jSONObject.getJSONArray(VideoControllerManager.ARRAY_KEY_RESOURCES);
                if (jSONArray != null && jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        int i2 = jSONObject2.getInt(VideoControllerManager.KEY_BITRATE);
                        str2 = str2 + jSONObject2.getString("definition") + "@" + i2 + "|";
                    }
                }
            } catch (Throwable unused) {
            }
            a(str, str2);
            return this;
        }
    }

    public static prj j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (prj) ipChange.ipc$dispatch("10ef8d04", new Object[]{new Boolean(z)});
        }
        try {
            if (b == null || z) {
                prj prjVar = new prj();
                b = prjVar;
                Map<String, String> map = f12348a;
                if (map != null) {
                    prjVar.f26257a = nwv.o(map.get("enable"), false);
                    b.b = nwv.q(f12348a.get("p_t"), 0.5f);
                    b.c = nwv.r(f12348a.get("nb_t"), 3);
                    b.d = nwv.t(f12348a.get("nspeed_t"), 0);
                    b.e = nwv.t(f12348a.get("limitDeviceScore"), -1);
                }
            }
            return b;
        } catch (Throwable th) {
            tfs.e(TAG, th.getMessage());
            return null;
        }
    }

    public static void s(final IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10067255", new Object[]{iRemoteBaseListener});
            return;
        }
        MediaVideoInfoRequestV2 mediaVideoInfoRequestV2 = new MediaVideoInfoRequestV2();
        mediaVideoInfoRequestV2.videoId = 0L;
        mediaVideoInfoRequestV2.source = "guangguang";
        mediaVideoInfoRequestV2.type = "prefetch_bitopti";
        try {
            HashMap hashMap = new HashMap(1);
            hashMap.put(c4o.KEY_NETWORK_SPEED, Integer.valueOf(z5r.l()));
            hashMap.put(c4o.KEY_ENABLE_SERVER_ABR, "true");
            mediaVideoInfoRequestV2.extendParameters = JSON.toJSONString(hashMap);
        } catch (Exception unused) {
        }
        tfs.c(TAG, "开始请求");
        MtopModule.requestWithParser(new d.j(null, mediaVideoInfoRequestV2.toJsonObject(), null), new IRemoteBaseListener() { // from class: com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    VideoControllerManager.u(nwv.I(JSON.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data").getJSONObject("config").get("bitrateOptiConfig"), null));
                    IRemoteBaseListener iRemoteBaseListener2 = IRemoteBaseListener.this;
                    if (iRemoteBaseListener2 != null) {
                        iRemoteBaseListener2.onSuccess(i, mtopResponse, baseOutDo, obj);
                    }
                } catch (Throwable th) {
                    tfs.e(VideoControllerManager.TAG, "requestVideoInfo failed: " + th);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                IRemoteBaseListener iRemoteBaseListener2 = IRemoteBaseListener.this;
                if (iRemoteBaseListener2 != null) {
                    iRemoteBaseListener2.onSystemError(i, mtopResponse, obj);
                }
            }
        }, null);
    }

    public static void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9046cd7", new Object[]{str});
        } else if (str != null) {
            try {
                com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
                f12348a = new HashMap();
                if (parseObject.getString("enable") != null) {
                    f12348a.put("enable", parseObject.getString("enable"));
                    f12348a.put("p_t", parseObject.getString("p_t"));
                    f12348a.put("nb_t", parseObject.getString("nb_t"));
                    f12348a.put("nspeed_t", parseObject.getString("nspeed_t"));
                    f12348a.put("pr_e", parseObject.getString("pr_e"));
                    f12348a.put("prt_e", parseObject.getString("prt_e"));
                    f12348a.put("limitDeviceScore", parseObject.getString("limitDeviceScore"));
                    j(true);
                }
            } catch (Throwable th) {
                tfs.e(TAG, "updateBitrateConfig failed: " + th);
            }
        }
    }

    public static void w(JSONObject jSONObject, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82145e6a", new Object[]{jSONObject, new Integer(i), new Boolean(z)});
        } else if (m(null) && jSONObject != null) {
            try {
                String string = jSONObject.getString("id");
                JSONArray jSONArray = jSONObject.getJSONArray(ARRAY_KEY_RESOURCES);
                if (jSONArray != null && jSONArray.length() > 0) {
                    String string2 = jSONArray.getJSONObject(0).getString(KEY_CACHEKEY);
                    a h = h(string, null, false);
                    if (h != null && TextUtils.equals(h.b, string2)) {
                        h.e = i;
                        h.f = z;
                    }
                }
            } catch (Throwable th) {
                tfs.e(TAG, th.getMessage());
            }
        }
    }

    public static int b(JSONObject jSONObject, float f2, a aVar, float f3, float f4, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d799cf26", new Object[]{jSONObject, new Float(f2), aVar, new Float(f3), new Float(f4), new Boolean(z)})).intValue();
        }
        if (jSONObject == null) {
            return -2;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(ARRAY_KEY_CONFIGURATION);
            if (optJSONObject != null && optJSONObject.optBoolean(ARRAY_KEY_ENABLEVODABR)) {
                tfs.e(TAG, " 决策 enableVodAbr=true，不决策，直接透传给播放器");
                return -9;
            } else if (f2 == 0.0f) {
                tfs.e(TAG, "cflog 决策 网速0，不决策");
                return -1;
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray(ARRAY_KEY_RESOURCES);
                if (optJSONArray != null && optJSONArray.length() > 2) {
                    if (aVar != null && aVar.h) {
                        return -7;
                    }
                    int i = aVar != null ? aVar.d : 0;
                    int i2 = aVar != null ? aVar.e : 0;
                    if (aVar != null) {
                        str = aVar.b;
                    } else {
                        str = "";
                    }
                    if (z && i2 > 0) {
                        tfs.e(TAG, "cflog 决策。 预下载逻辑。 非首次下载，则不再决策，直接使用当前下载的策略。bestCacheKey=" + str);
                    } else if (aVar == null || !aVar.g || !k(jSONObject, aVar.b)) {
                        float f5 = i > 0 ? (i2 * 8.0f) / (i * 1000) : 0.0f;
                        if (f5 < f4 || !k(jSONObject, str)) {
                            str = f(f2, f3, optJSONArray);
                        } else {
                            tfs.e(TAG, "cflog 决策。 当前码率已经下载足够了，则不再重新决策。downTime=" + f5 + " bestCacheKey=" + str);
                        }
                    }
                    if (TextUtils.isEmpty(str)) {
                        return -2;
                    }
                    String t = t(jSONObject, ARRAY_KEY_CACHES, str);
                    t(jSONObject, ARRAY_KEY_RESOURCES, str);
                    JSONArray optJSONArray2 = jSONObject.optJSONArray(ARRAY_KEY_DEFINITIONPRIORITY);
                    if (optJSONArray2 == null || optJSONArray2.length() <= 2 || !(optJSONArray2.get(0) instanceof String)) {
                        return 1;
                    }
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(0, t);
                    jSONArray.put(1, optJSONArray2.getString(1));
                    jSONObject.put(ARRAY_KEY_DEFINITIONPRIORITY, jSONArray);
                    return 1;
                }
                tfs.e(TAG, "cflog 决策 单流码率，走老逻辑，不决策");
                return -4;
            }
        } catch (Throwable th) {
            tfs.e(TAG, th.getMessage());
            return -2;
        }
    }
}
