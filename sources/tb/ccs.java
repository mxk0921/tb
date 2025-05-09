package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ccs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String KEY_CUSTOM_SET_TITLE = "customSetTitle";
    public static final String KEY_ENABLE_WEB_ASYNC_WEB_BRIDGE = "enableWebASycBridge";
    public static final String KEY_IS_HEADER_PAGE = "isHeaderPage";
    public static final String KEY_IS_HOME_PAGE = "isHomePage";
    public static final String KEY_IS_PRE_RENDER = "isPreRender";
    public static final String KEY_IS_PUSH_PAGE = "isPushPage";
    public static final String KEY_IS_TAB_ITEM_PAGE = "isTabItemPage";
    public static final String KEY_IS_VIRTUAL_TAB_PAGE = "isVirtualTabPage";
    public static final String KEY_PAGE_PROPS = "pageProps";
    public static final String KEY_RIGHT_ITEM_DARK_IMAGE_URL = "darkImageUrl";
    public static final String KEY_RIGHT_ITEM_LIGHT_IMAGE_URL = "lightImageUrl";
    public static final String KEY_RIGHT_ITEM_ON_CLICK = "onClick";
    public static final String KEY_STATUS_BAR_IMMERSIVE_ENABLE = "statusBarImmersiveEnable";
    public static final String KEY_WEEX_INIT_DATA = "weexInitData";

    /* renamed from: a  reason: collision with root package name */
    public final unl f16975a;
    public final JSONObject b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909534);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public static final /* synthetic */ boolean a(a aVar, JSONObject jSONObject, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9550625c", new Object[]{aVar, jSONObject, str, new Boolean(z)})).booleanValue();
            }
            return aVar.b(jSONObject, str, z);
        }

        public a() {
        }

        public final boolean b(JSONObject jSONObject, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ff32a45a", new Object[]{this, jSONObject, str, new Boolean(z)})).booleanValue();
            }
            Boolean valueOf = jSONObject == null ? null : Boolean.valueOf(jSONObject.getBooleanValue(str));
            if (valueOf == null) {
                return z;
            }
            if (ckf.b("false", valueOf.toString())) {
                return false;
            }
            return ckf.b("true", valueOf.toString());
        }
    }

    static {
        t2o.a(839909533);
    }

    public ccs(unl unlVar, JSONObject jSONObject) {
        ckf.g(unlVar, "pageModel");
        ckf.g(jSONObject, "extraParams");
        this.f16975a = unlVar;
        this.b = jSONObject;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("647d8ca8", new Object[]{this})).booleanValue();
        }
        return a.a(Companion, this.b, KEY_CUSTOM_SET_TITLE, false);
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("61da8827", new Object[]{this});
        }
        return this.b;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9500cea9", new Object[]{this});
        }
        return this.b.getString("navigationBarBackgroundBg");
    }

    public final unl e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (unl) ipChange.ipc$dispatch("43b69ca", new Object[]{this});
        }
        return this.f16975a;
    }

    public final Map<String, Object> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e3ac6327", new Object[]{this});
        }
        Object obj = this.b.get(KEY_PAGE_PROPS);
        if (kqu.m(obj)) {
            return (Map) obj;
        }
        return null;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12c4cb49", new Object[]{this});
        }
        return this.b.getString("mixRenderType");
    }

    public final Object h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("57636d53", new Object[]{this});
        }
        return this.b.get("rightItem");
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29d2d0d9", new Object[]{this})).booleanValue();
        }
        return a.a(Companion, this.b, KEY_IS_HOME_PAGE, false);
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55937f9e", new Object[]{this})).booleanValue();
        }
        return a.a(Companion, this.b, KEY_STATUS_BAR_IMMERSIVE_ENABLE, false);
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3491f911", new Object[]{this})).booleanValue();
        }
        return a.a(Companion, this.b, KEY_IS_HEADER_PAGE, false);
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3d4411a", new Object[]{this})).booleanValue();
        }
        return a.a(Companion, this.b, "isPreRender", false);
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6caa531e", new Object[]{this})).booleanValue();
        }
        return a.a(Companion, this.b, KEY_IS_PUSH_PAGE, false);
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bcbf178", new Object[]{this})).booleanValue();
        }
        return a.a(Companion, this.b, KEY_IS_TAB_ITEM_PAGE, false);
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb019d0e", new Object[]{this})).booleanValue();
        }
        return a.a(Companion, this.b, KEY_IS_VIRTUAL_TAB_PAGE, false);
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("889b7ca9", new Object[]{this})).booleanValue();
        }
        return a.a(Companion, this.b, "isPreRender", false);
    }
}
