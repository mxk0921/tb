package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dov {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALGO_BIZ_CODE_UPLOAD_VIDEO = "guangguang_algo_video";
    public static final String BIZ_CODE_UPLOAD_IMAGE = "m_tb_svideo_preimg";
    public static final String DEFAULT_BIZ_LINE = "guangguang";
    public static final String DEFAULT_BIZ_SCENE = "guangguang";
    public static final String KEY_BACK_PARAMS = "back_params";
    public static final String KEY_BIZ_LINE = "biz_line";
    public static final String KEY_DEFAULT_TAB = "default_tab";
    public static final String KEY_DISABLE_TAB = "disable_tab";
    public static final String KEY_ENABLE_AWARD_FUN_ATMOSPHERE = "enable_award_fun_atmosphere";
    public static final String KEY_ENABLE_IMAGE_MUSIC = "image_music_enable";
    public static final String KEY_ENABLE_TAB = "enable_tab";
    public static final String KEY_GOODS_ID = "goods_id";
    public static final String KEY_HIGHLIGHT_ICON_URL = "highlight_icon";
    public static final String KEY_HIGHLIGHT_TAB_TYPE = "highlight_tab_type";
    public static final String KEY_IS_CONTENT_ULTRA = "is_content_ultra";
    public static final String KEY_IS_USE_NEW_PUBLISHER = "is_rcmd_publisher";
    public static final String KEY_MATERIAL_TAB = "material_tab";
    public static final String KEY_MEDIA_ID = "mediaId";
    public static final String KEY_MEDIA_TYPE = "media_type";
    public static final String KEY_ONIOLN_FITTING_ROOM_SCENE = "ugc_scene";
    public static final String KEY_RECOMMEND_CONTENTIDS = "recommendContentIds";
    public static final String KEY_REF_ID = "ref_id";
    public static final String KEY_REF_NAME = "ref_name";
    public static final String KEY_SHOW_HISTORY = "show_history";
    public static final String KEY_TEXT_PARAMS = "text_params";
    public static final String KEY_UMI_PUB_TRACE_ID = "umi_pub_trace_id";
    public static final String KEY_XGC_APPEND_MODE = "xgc_append_mode";
    public static final String KEY_X_ACTIVITY_ID = "x_activity_id";
    public static final String KEY_X_TASK_TYPE = "x_task_type";
    public static final String K_BIZ_SCENE = "biz_scene";
    public static final String K_DEVICE_SCORE = "device_score";
    public static final String TAG = "UrlParams";
    public static final String URL_KEY_ALGO_PHOTO_UPLOAD_CODE = "algo_photo_upload_code";
    public static final String URL_KEY_ALGO_VIDEO_UPLOAD_CODE = "algo_video_upload_code";
    public static final String URL_KEY_BIZ_LINE = "bizLine";
    public static final String URL_KEY_PHOTO_BIZ_CODE = "photo_biz_code";
    public static final String URL_KEY_PHOTO_UPLOAD_CODE = "photo_upload_code";
    public static final String URL_KEY_VIDEO_BIZ_CODE = "video_biz_code";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, a> f17990a = new HashMap();
    public static final a b = new a();

    static {
        t2o.a(511705306);
    }

    public static void a(String str, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a83608", new Object[]{str, uri});
        } else if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = (HashMap) f17990a;
            if (!hashMap.containsKey(str)) {
                a aVar = new a(uri);
                a.a(aVar).put(l4n.f23108a, str);
                hashMap.put(str, aVar);
            }
        }
    }

    public static a b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("cbce23fe", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return b;
        }
        a aVar = (a) ((HashMap) f17990a).get(str);
        if (aVar == null) {
            return b;
        }
        return aVar;
    }

    public static a c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("70458b2b", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (a) ((HashMap) f17990a).remove(str);
    }

    public static a d(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f055a2e2", new Object[]{str, aVar});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (a) ((HashMap) f17990a).put(str, aVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, String> f17991a = new HashMap();

        static {
            t2o.a(511705307);
        }

        public a() {
        }

        public static /* synthetic */ Map a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("8f0a8584", new Object[]{aVar});
            }
            return aVar.f17991a;
        }

        public boolean b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("320d0eb0", new Object[]{this, str, str2})).booleanValue();
            }
            return TextUtils.equals(str2, this.f17991a.get(str));
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("51a26602", new Object[]{this});
            }
            String m = m(dov.URL_KEY_ALGO_PHOTO_UPLOAD_CODE);
            return TextUtils.isEmpty(m) ? dov.BIZ_CODE_UPLOAD_IMAGE : m;
        }

        public String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("71f50699", new Object[]{this});
            }
            String m = m(dov.URL_KEY_ALGO_VIDEO_UPLOAD_CODE);
            if (TextUtils.isEmpty(m)) {
                return dov.ALGO_BIZ_CODE_UPLOAD_VIDEO;
            }
            return m;
        }

        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("26095428", new Object[]{this});
            }
            return m(dov.KEY_BIZ_LINE);
        }

        public String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e69425aa", new Object[]{this});
            }
            return m("biz_scene");
        }

        public int h(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7584686e", new Object[]{this, str, new Integer(i)})).intValue();
            }
            String str2 = (String) ((HashMap) this.f17991a).get(str);
            if (TextUtils.isEmpty(str2)) {
                return i;
            }
            return v(str2, i);
        }

        public long i(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5c8bfed7", new Object[]{this, str, new Long(j)})).longValue();
            }
            String str2 = (String) ((HashMap) this.f17991a).get(str);
            if (TextUtils.isEmpty(str2)) {
                return j;
            }
            return w(str2, j);
        }

        public String j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4d0500f", new Object[]{this});
            }
            String m = m(dov.URL_KEY_PHOTO_UPLOAD_CODE);
            return TextUtils.isEmpty(m) ? dov.BIZ_CODE_UPLOAD_IMAGE : m;
        }

        public String l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ef978b28", new Object[]{this});
            }
            return m(dov.KEY_ONIOLN_FITTING_ROOM_SCENE);
        }

        public String m(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8bc339db", new Object[]{this, str});
            }
            return this.f17991a.get(str);
        }

        public String n(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e64ee491", new Object[]{this, str, str2});
            }
            String str3 = this.f17991a.get(str);
            if (TextUtils.isEmpty(str3)) {
                return str2;
            }
            return str3;
        }

        public Map<String, String> o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("908941db", new Object[]{this});
            }
            return this.f17991a;
        }

        public String p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a2c1babe", new Object[]{this});
            }
            return m(dov.URL_KEY_VIDEO_BIZ_CODE);
        }

        public void q(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c623490", new Object[]{this, uri});
                return;
            }
            this.f17991a.clear();
            for (String str : uri.getQueryParameterNames()) {
                this.f17991a.put(str, uri.getQueryParameter(str));
            }
        }

        public void r(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c97d2839", new Object[]{this, jSONObject});
                return;
            }
            this.f17991a.clear();
            if (jSONObject != null) {
                for (String str : jSONObject.keySet()) {
                    this.f17991a.put(str, jSONObject.getString(str));
                }
            }
        }

        public void s(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1cfb90e", new Object[]{this, map});
                return;
            }
            this.f17991a.clear();
            if (map != null) {
                this.f17991a.putAll(map);
            }
        }

        public void t(org.json.JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("437d0487", new Object[]{this, jSONObject});
                return;
            }
            this.f17991a.clear();
            if (jSONObject != null) {
                try {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!TextUtils.isEmpty(next)) {
                            this.f17991a.put(next, jSONObject.get(next).toString());
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        public void u(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("363a7899", new Object[]{this, str, str2});
            } else {
                this.f17991a.put(str, str2);
            }
        }

        public a(Uri uri) {
            q(uri);
        }

        public boolean g(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7eddb8c9", new Object[]{this, str, new Boolean(z)})).booleanValue();
            }
            String str2 = this.f17991a.get(str);
            return TextUtils.isEmpty(str2) ? z : str2.equalsIgnoreCase("true") || str2.equalsIgnoreCase("1");
        }

        public int[] k(String str, int[] iArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (int[]) ipChange.ipc$dispatch("a4211ece", new Object[]{this, str, iArr});
            }
            String str2 = this.f17991a.get(str);
            if (!TextUtils.isEmpty(str2) && str2.contains("x")) {
                int indexOf = str2.indexOf("x");
                int[] iArr2 = new int[2];
                try {
                    iArr2[0] = Integer.parseInt(str2.substring(0, indexOf));
                    int parseInt = Integer.parseInt(str2.substring(indexOf + 1));
                    iArr2[1] = parseInt;
                    if (iArr2[0] > 0 && parseInt > 0) {
                        return iArr2;
                    }
                } catch (Exception unused) {
                }
            }
            return iArr;
        }

        public final int v(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("232b0a28", new Object[]{this, str, new Integer(i)})).intValue();
            }
            try {
                return Integer.parseInt(str);
            } catch (Exception e) {
                odg.c(dov.TAG, "string2Integer Exception v=" + str + " d=" + i, e);
                return i;
            }
        }

        public final long w(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ad61214a", new Object[]{this, str, new Long(j)})).longValue();
            }
            try {
                return Long.parseLong(str);
            } catch (Exception e) {
                odg.c(dov.TAG, "string2Long Exception v=" + str + " d=" + j, e);
                return j;
            }
        }
    }
}
