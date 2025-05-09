package com.alibaba.triver.triver_shop.newShop.event.broadcast;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.brf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String A_PLUS = "aplus.";
    public static final String BX_TO_SHOP = "shop.bx.sequence";
    public static final String FRAMEWORK_UI_STATUS = "framework.ui.status";
    public static final String HIDE_STATUS = "HIDE";
    public static final String LIVE_FINISH_STATUS = "FINISH";
    public static final String MSG_FOLLOWED = "followed";
    public static final String MSG_FOLLOW_ACTION = "followAction";
    public static final String MSG_FOLLOW_ACTION_CLICK = "followClick";
    public static final String MSG_FOLLOW_ACTION_REFRESH = "followRefresh";
    public static final String MSG_FOLLOW_STATUS = "status";
    public static final String MSG_HOME_LIVE_ROOM_STATUS = "homelive.liveroom.stream.status.update";
    public static final String MSG_ON_SHOW = "onShow";
    public static final String MSG_SHOP_FOLLOW_SETSTATUS = "shophead.follow.setStatus";
    public static final String MSG_SHOP_HEADER_COLLAPSED = "shophead.collapsed";
    public static final String MSG_SHOP_HEADER_UNCOLLAPSED = "shophead.uncollapsed";
    public static final String MSG_SHOP_PAGE_APPEAR = "page.appear";
    public static final String MSG_SHOP_PAGE_DISAPPEAR = "page.disappear";
    public static final String MSG_SOURCE_PARENT = "parent";
    public static final String MSG_UNFOLLOWED = "unfollow";
    public static final String SHOP_TAB_SWITCH = "shoptab.switch";
    public static final String SHOP_TO_UCP = "shop.shop2ucp";
    public static final String SHOW_STATUS = "SHOW";
    public static final String TYPE_FULLSCREEN = "FULLSCREEN";
    public static final String TYPE_NORMAL = "NORMAL";
    public static final String UCP_TO_SHOP = "shop.behavior.sequence";
    public static final String WIDGET_NAME = "widgetName";

    /* renamed from: a  reason: collision with root package name */
    public final String f3092a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final JSONObject i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f3093a;
        public String b;
        public String c;
        public String d;
        public String e;

        static {
            t2o.a(766509476);
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("107026a", new Object[]{this});
            }
            return new a(this.f3093a, this.b, this.c, this.d, this.e);
        }

        public b b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("639a7bad", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4e5bf3dd", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public b d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("63f33727", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public b e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("1a064b1d", new Object[]{this, str});
            }
            this.f3093a = str;
            return this;
        }

        public b f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e7132fde", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }
    }

    static {
        t2o.a(766509474);
    }

    public Map<String, Object> a() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6bdd17bb", new Object[]{this});
        }
        JSONObject jSONObject2 = this.i;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("params")) == null) {
            return null;
        }
        return jSONObject.getInnerMap();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f62c73ca", new Object[]{this});
        }
        String str = this.b;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if (split.length < 2) {
            return null;
        }
        return split[1];
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1281f3a", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_msg_name", (Object) this.c);
        jSONObject.put("_msg_source", (Object) this.d);
        jSONObject.put("_msg_target", (Object) this.e);
        jSONObject.put("_msg_token", (Object) this.f3092a);
        jSONObject.put("_msg_type", (Object) this.b);
        jSONObject.put("_msg_fromNative", (Object) this.f);
        jSONObject.put("type", (Object) this.g);
        jSONObject.put("status", (Object) this.h);
        return jSONObject;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("65c92963", new Object[]{this});
        }
        return this.i;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7f5baf6a", new Object[]{this});
        }
        JSONObject jSONObject = this.i.getJSONObject("data");
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject("data");
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1bcda31", new Object[]{this});
        }
        JSONObject jSONObject = this.i.getJSONObject("data");
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.getString(WIDGET_NAME);
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7bf4ddfc", new Object[]{this});
        }
        if (FRAMEWORK_UI_STATUS.equals(this.b) && this.i != null) {
            if ("shopTabSwitch".equals(this.h)) {
                return this.i.getString("targetTab");
            }
            JSONObject jSONObject = this.i.getJSONObject("params");
            if (jSONObject != null && "shopTabSwitch".equals(jSONObject.getString("status"))) {
                return jSONObject.getString("targetTab");
            }
        }
        if (SHOP_TAB_SWITCH.equals(this.b)) {
            return this.i.getString("tabkey");
        }
        return null;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96608dd6", new Object[]{this});
        }
        if (!FRAMEWORK_UI_STATUS.equals(this.b) || this.i == null || !"shopTabSwitch".equals(this.h)) {
            return null;
        }
        return this.i.getString("params");
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4516bee7", new Object[]{this});
        }
        return this.c;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea71e917", new Object[]{this});
        }
        return this.d;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f778561", new Object[]{this});
        }
        return this.e;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dcf2bd98", new Object[]{this});
        }
        return this.b;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("465b7694", new Object[]{this})).booleanValue();
        }
        String str = this.b;
        if (str == null) {
            return false;
        }
        return str.contains(A_PLUS);
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e717232d", new Object[]{this})).booleanValue();
        }
        return MSG_SHOP_PAGE_APPEAR.equals(this.b);
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e5b5bb3", new Object[]{this})).booleanValue();
        }
        return MSG_SHOP_PAGE_DISAPPEAR.equals(this.b);
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8a4f541", new Object[]{this})).booleanValue();
        }
        return "2.0.0".equals(this.d);
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85fd6792", new Object[]{this})).booleanValue();
        }
        if (!"HIDE".equals(this.h) || !TYPE_FULLSCREEN.equals(this.g)) {
            return false;
        }
        return true;
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a63616e3", new Object[]{this})).booleanValue();
        }
        if (!LIVE_FINISH_STATUS.equals(this.c) || !LIVE_FINISH_STATUS.equals(this.h)) {
            return false;
        }
        return true;
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42c51dbb", new Object[]{this})).booleanValue();
        }
        return SHOP_TO_UCP.equals(this.c);
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa4a420d", new Object[]{this})).booleanValue();
        }
        if (!"SHOW".equals(this.h) || !TYPE_FULLSCREEN.equals(this.g)) {
            return false;
        }
        return true;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7afcc28d", new Object[]{this})).booleanValue();
        }
        return MSG_SHOP_FOLLOW_SETSTATUS.equals(this.c);
    }

    public a(String str, String str2, String str3, String str4, String str5) {
        this.f3092a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = "1";
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26130d31", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.i;
        if (jSONObject != null) {
            return MSG_FOLLOWED.equals(jSONObject.getString("status"));
        }
        return false;
    }

    public a(Object obj) {
        JSONObject k = obj instanceof JSONObject ? (JSONObject) obj : obj instanceof String ? brf.k((String) obj) : null;
        if (k != null) {
            this.i = k;
            this.c = k.getString("_msg_name");
            this.d = k.getString("_msg_source");
            this.e = k.getString("_msg_target");
            this.f3092a = k.getString("_msg_token");
            this.b = k.getString("_msg_type");
            this.f = k.getString("_msg_fromNative");
            this.g = k.getString("type");
            this.h = k.getString("status");
        }
    }
}
