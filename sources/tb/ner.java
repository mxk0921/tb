package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import tb.dkb;
import tb.rdc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ner {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ner INSTANCE = new ner();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void onResult(boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void onFailed(String str);

        void onSuccess(JSONObject jSONObject);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void onResult(JSONObject jSONObject);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24685a;
        public final /* synthetic */ c b;

        public e(Context context, c cVar) {
            this.f24685a = context;
            this.b = cVar;
        }

        @Override // tb.ner.b
        public void onFailed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616e008d", new Object[]{this, str});
                return;
            }
            TMSLogger.b("TBHomeUtils", ckf.p("miniApp.request error: ", str));
            c cVar = this.b;
            if (cVar != null) {
                cVar.onResult(null);
            }
        }

        @Override // tb.ner.b
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                return;
            }
            ckf.g(jSONObject, "data");
            if (o9s.h(this.f24685a)) {
                TMSLogger.b("TBHomeUtils", ckf.p("miniApp.request: ", jSONObject.toJSONString()));
            }
            c cVar = this.b;
            if (cVar != null) {
                cVar.onResult(jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class f implements IJsBridgeService.a.AbstractC0565a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24686a;
        public final /* synthetic */ b b;

        public f(String str, b bVar) {
            this.f24686a = str;
            this.b = bVar;
        }

        @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a.AbstractC0565a
        public void a(Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3981b3b", new Object[]{this, map});
            } else if (map != null && this.b != null) {
                Object obj = map.get("data");
                if (obj == null) {
                    this.b.onFailed(null);
                } else if (obj instanceof JSONObject) {
                    TMSLogger.a("TBHomeUtils", "action: " + this.f24686a + ", result: " + obj);
                    this.b.onSuccess((JSONObject) obj);
                } else {
                    TMSLogger.a("TBHomeUtils", "action: " + this.f24686a + ", result: " + obj);
                    TMSLogger.a("TBHomeUtils", map.toString());
                    b bVar = this.b;
                    JSONObject parseObject = JSON.parseObject(obj.toString());
                    ckf.f(parseObject, "parseObject(dataObj.toString())");
                    bVar.onSuccess(parseObject);
                }
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a.AbstractC0565a
        public void error(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72e35699", new Object[]{this, str});
                return;
            }
            TMSLogger.b("TBHomeUtils", "action: " + this.f24686a + ", result: " + ((Object) str));
            b bVar = this.b;
            if (bVar != null) {
                bVar.onFailed(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class g implements dkb.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24687a;
        public final /* synthetic */ JSONObject b;

        public g(String str, JSONObject jSONObject) {
            this.f24687a = str;
            this.b = jSONObject;
        }

        @Override // tb.dkb.b
        public String getAction() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e81f414d", new Object[]{this});
            }
            return this.f24687a;
        }

        @Override // tb.dkb.b
        public String getContainerId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("94b5b673", new Object[]{this});
            }
            return "newface_home_sub";
        }

        @Override // tb.dkb.b
        public JSONObject getParams() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("cf36e223", new Object[]{this});
            }
            return this.b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class h implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.ner.b
        public void onFailed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616e008d", new Object[]{this, str});
            } else {
                TMSLogger.b("TBHomeUtils", ckf.p("iconBackAnime.setBitmap error: ", str));
            }
        }

        @Override // tb.ner.b
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
            } else {
                ckf.g(jSONObject, "data");
            }
        }
    }

    static {
        t2o.a(845152387);
    }

    @JvmStatic
    public static final void c(Context context, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dd9d39", new Object[]{context, str, aVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) rdc.a.ICON_CONTAINER_SECTION_BIZ_CODE, "icon_and_miniapp_nomore_2019_v1");
        jSONObject.put((JSONObject) rdc.a.TARGET_MINI_APP_ID, str);
        jSONObject.put((JSONObject) rdc.a.DEFAULT_SECTION_BIZ_CODE, "qbpd");
        INSTANCE.m("miniApp.canPlayBackAnimation", jSONObject, new d(context, aVar));
    }

    @JvmStatic
    public static final JSONArray i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b01f21cc", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONArray("homePagePopDatas");
    }

    @JvmStatic
    public static final void j(Context context, String str, JSONObject jSONObject, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c0cd36", new Object[]{context, str, jSONObject, cVar});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) rdc.a.LOCATION_REPLACE, str);
        jSONObject2.put((JSONObject) "backHomeAnimeParams", (String) jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "miniAppBizParam", jSONObject2.toJSONString());
        jSONObject3.put((JSONObject) "business", "miniApp");
        INSTANCE.m("miniApp.request", jSONObject3, new e(context, cVar));
    }

    public static /* synthetic */ void q(Context context, String str, boolean z, boolean z2, Bitmap bitmap, String str2, Integer num, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f79188", new Object[]{context, str, new Boolean(z), new Boolean(z2), bitmap, str2, num, new Integer(i), obj});
            return;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            num = 500;
        }
        p(context, str, z, z2, bitmap, str2, num);
    }

    public final JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3209d332", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
            if (jSONObject2 == null) {
                return null;
            }
            return jSONObject2.getJSONObject("backHomeAnim");
        } catch (Throwable th) {
            TMSLogger.c("TBHomeUtils", ckf.p("backHomeAnim: ", th.getMessage()), th);
            return null;
        }
    }

    public final JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5cc48b73", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
            if (jSONObject2 == null) {
                return null;
            }
            return jSONObject2.getJSONObject("beforeBackRevisitEducation");
        } catch (Throwable th) {
            TMSLogger.c("TBHomeUtils", ckf.p("beforeBackRevisitEducation: ", th.getMessage()), th);
            return null;
        }
    }

    public final boolean e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52ed21c5", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
            if (jSONObject2 == null) {
                return false;
            }
            Boolean bool = jSONObject2.getBoolean("enableServerControlAnim");
            ckf.f(bool, "ext.getBoolean(\"enableServerControlAnim\")");
            return bool.booleanValue();
        } catch (Throwable th) {
            TMSLogger.c("TBHomeUtils", ckf.p("enableServerControlAnim: ", th.getMessage()), th);
            return false;
        }
    }

    public final void m(String str, JSONObject jSONObject, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a99b4c", new Object[]{this, str, jSONObject, bVar});
        } else {
            xue.c().a().b(xve.INFO_FLOW_WV_PLUGIN_NAME, new g(str, jSONObject), new f(str, bVar));
        }
    }

    @JvmStatic
    public static final void p(Context context, String str, boolean z, boolean z2, Bitmap bitmap, String str2, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8492674", new Object[]{context, str, new Boolean(z), new Boolean(z2), bitmap, str2, num});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, "appId");
        Uri.Builder buildUpon = ies.g("http://m.taobao.com/index.htm?scrollto=recmd&target=guess").buildUpon();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("itemId", (Object) 0);
        xhv xhvVar = xhv.INSTANCE;
        buildUpon.appendQueryParameter("_afc_params_json", jSONObject.toJSONString());
        buildUpon.appendQueryParameter("launchType", "COLD");
        buildUpon.appendQueryParameter("isNeedHome", "0");
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter(rdc.a.BACK_HOME_LOCATION, str2);
        ckf.f(appendQueryParameter, "http://m.taobao.com/inde…meLocation)\n            }");
        if (bitmap == null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "jump_ani", "scrollToAFace");
            appendQueryParameter.appendQueryParameter("recmdparams", jSONObject2.toJSONString());
            Nav.from(context).toUri(appendQueryParameter.build());
            return;
        }
        String valueOf = String.valueOf(bitmap.hashCode());
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("bitmapSession", (Object) valueOf);
        jSONObject3.put("bitmapValue", (Object) bitmap);
        INSTANCE.m("iconBackAnime.setBitmap", jSONObject3, new h());
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put((JSONObject) "jump_ani", "scrollToAFace");
        jSONObject4.put(rdc.a.ICON_CONTAINER_SECTION_BIZ_CODE, (Object) "icon_and_miniapp_nomore_2019_v1");
        jSONObject4.put(rdc.a.TARGET_MINI_APP_ID, (Object) str);
        jSONObject4.put(rdc.a.IS_OUT_LINK_BACK_GUIDE_ANIME, (Object) Boolean.valueOf(z));
        jSONObject4.put(rdc.a.IS_LIGHTING_ICON_ANIME, (Object) Boolean.valueOf(z2));
        jSONObject4.put(rdc.a.DEFAULT_SECTION_BIZ_CODE, (Object) "qbpd");
        jSONObject4.put(rdc.a.ICON_ANIME_PARENT_IMG, (Object) valueOf);
        jSONObject4.put(rdc.a.ICON_ANIME_DURATION, (Object) num);
        jSONObject4.put(rdc.a.BACK_HOME_LOCATION, (Object) str2);
        appendQueryParameter.appendQueryParameter("recmdparams", jSONObject4.toJSONString());
        Uri build = appendQueryParameter.build();
        TMSLogger.f("TBHomeUtils", build.toString());
        Nav.from(context).toUri(build);
    }

    public final boolean d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc855841", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
            if (jSONObject2 == null) {
                return false;
            }
            Boolean bool = jSONObject2.getBoolean(rdc.a.IS_OUT_LINK_BACK_GUIDE_ANIME);
            ckf.f(bool, "ext.getBoolean(\"isOutLinkBackGuideAnime\")");
            return bool.booleanValue();
        } catch (Throwable th) {
            TMSLogger.c("TBHomeUtils", ckf.p("enableLightingIconAnime: ", th.getMessage()), th);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24684a;
        public final /* synthetic */ a b;

        public d(Context context, a aVar) {
            this.f24684a = context;
            this.b = aVar;
        }

        @Override // tb.ner.b
        public void onFailed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616e008d", new Object[]{this, str});
                return;
            }
            TMSLogger.b("TBHomeUtils", ckf.p("canPlayBackAnimation error: ", str));
            if (TextUtils.equals("1002", str)) {
                a aVar = this.b;
                if (aVar != null) {
                    aVar.onResult(true);
                    return;
                }
                return;
            }
            a aVar2 = this.b;
            if (aVar2 != null) {
                aVar2.onResult(false);
            }
        }

        @Override // tb.ner.b
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                return;
            }
            ckf.g(jSONObject, "data");
            if (o9s.h(this.f24684a)) {
                TMSLogger.b("TBHomeUtils", ckf.p("canPlayBackAnimation: ", jSONObject.toJSONString()));
            }
            String jSONString = jSONObject.toJSONString();
            ckf.f(jSONString, "data.toJSONString()");
            if (wsq.O(jSONString, "true", false, 2, null)) {
                a aVar = this.b;
                if (aVar != null) {
                    aVar.onResult(true);
                    return;
                }
                return;
            }
            a aVar2 = this.b;
            if (aVar2 != null) {
                aVar2.onResult(false);
            }
        }
    }

    @JvmStatic
    public static final boolean h(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e93b5f7", new Object[]{jSONArray})).booleanValue();
        }
        if (jSONArray == null) {
            return false;
        }
        try {
            int size = jSONArray.size();
            int i = 0;
            while (i < size) {
                i++;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                ckf.f(jSONObject, "homePagePopDataList.getJSONObject(i)");
                if (ckf.b(jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID), "iconLayOut")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
                    return ckf.b("singleRow", jSONObject2 == null ? null : jSONObject2.getString("iconVersion"));
                }
            }
        } catch (Throwable th) {
            TMSLogger.c("TBHomeUtils", th.getMessage(), th);
        }
        return false;
    }

    @JvmStatic
    public static final boolean k(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fc11362", new Object[]{jSONArray})).booleanValue();
        }
        if (jSONArray == null) {
            return false;
        }
        try {
            int size = jSONArray.size();
            int i = 0;
            while (i < size) {
                i++;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                ckf.f(jSONObject, "homePagePopDataList.getJSONObject(i)");
                if (ckf.b(jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID), "iconLayOut")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
                    return ckf.b("true", jSONObject2 == null ? null : jSONObject2.getString("isAlogrim"));
                }
            }
        } catch (Throwable th) {
            TMSLogger.c("TBHomeUtils", th.getMessage(), th);
        }
        return false;
    }

    @JvmStatic
    public static final String l(JSONArray jSONArray, String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69507972", new Object[]{jSONArray, str});
        }
        ckf.g(str, "type");
        if (jSONArray == null) {
            return null;
        }
        try {
            int size = jSONArray.size();
            while (i < size) {
                i++;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                ckf.f(jSONObject, "homePagePopDataList.getJSONObject(i)");
                if (ckf.b(str, "iconChangeGuidePopup") && ckf.b(jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID), "replaceIconBusiness")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
                    if (jSONObject2 == null) {
                        return null;
                    }
                    return jSONObject2.getString("miniGuideReplacePopType");
                } else if (ckf.b(str, "userActiveIconChangeGuidePopup") && ckf.b(jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID), "replaceIconCustomBusiness")) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("ext");
                    if (jSONObject3 == null) {
                        return null;
                    }
                    return jSONObject3.getString("miniGuideReplacePopType");
                }
            }
        } catch (Throwable th) {
            TMSLogger.c("TBHomeUtils", th.getMessage(), th);
        }
        return null;
    }

    @JvmStatic
    public static final boolean n(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b730c7", new Object[]{jSONArray})).booleanValue();
        }
        if (jSONArray == null) {
            return false;
        }
        try {
            int size = jSONArray.size();
            int i = 0;
            while (i < size) {
                i++;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                ckf.f(jSONObject, "homePagePopDataList.getJSONObject(i)");
                if (ckf.b(jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID), "iconLayOut")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
                    return ckf.b("true", jSONObject2 == null ? null : jSONObject2.getString("isHaveAllChannelsBiz"));
                }
            }
        } catch (Throwable th) {
            TMSLogger.c("TBHomeUtils", th.getMessage(), th);
        }
        return false;
    }

    @JvmStatic
    public static final boolean o(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c51b81ee", new Object[]{jSONArray})).booleanValue();
        }
        if (jSONArray == null) {
            return false;
        }
        try {
            int size = jSONArray.size();
            int i = 0;
            while (i < size) {
                i++;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                ckf.f(jSONObject, "homePagePopDataList.getJSONObject(i)");
                if (ckf.b(jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID), "iconLayOut")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
                    return ckf.b("true", jSONObject2 == null ? null : jSONObject2.getString("isHaveMiniAppBiz"));
                }
            }
        } catch (Throwable th) {
            TMSLogger.c("TBHomeUtils", th.getMessage(), th);
        }
        return false;
    }

    public final boolean f(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffaf38c6", new Object[]{this, jSONArray})).booleanValue();
        }
        if (jSONArray == null) {
            return false;
        }
        try {
            int size = jSONArray.size();
            int i = 0;
            while (i < size) {
                i++;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                ckf.f(jSONObject, "homePagePopDataList.getJSONObject(i)");
                if (ckf.b(jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID), "replaceIconCustomBusiness")) {
                    return true;
                }
            }
        } catch (Throwable th) {
            TMSLogger.c("TBHomeUtils", th.getMessage(), th);
        }
        return false;
    }

    public final boolean g(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bef55ed", new Object[]{this, jSONArray})).booleanValue();
        }
        if (jSONArray == null) {
            return false;
        }
        try {
            int size = jSONArray.size();
            int i = 0;
            while (i < size) {
                i++;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                ckf.f(jSONObject, "homePagePopDataList.getJSONObject(i)");
                if (ckf.b(jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID), "replaceIconBusiness")) {
                    return true;
                }
            }
        } catch (Throwable th) {
            TMSLogger.c("TBHomeUtils", th.getMessage(), th);
        }
        return false;
    }
}
