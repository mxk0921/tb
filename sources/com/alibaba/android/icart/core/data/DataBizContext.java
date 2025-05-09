package com.alibaba.android.icart.core.data;

import android.app.Application;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.Globals;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.dqs;
import tb.ei8;
import tb.et6;
import tb.h0r;
import tb.na3;
import tb.oxd;
import tb.t2o;
import tb.tc3;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DataBizContext {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LOAD_NEXT_PAGE_COUNT_MAX = 6;

    /* renamed from: a  reason: collision with root package name */
    public CartGroupContext f2189a;
    public boolean b;
    public String d;
    public String e;
    public boolean g;
    public boolean h;
    public int l;
    public boolean m;
    public String n;
    public String o;
    public boolean p;
    public RequestConfig.RequestType q;
    public int r;
    public boolean s;
    public boolean u;
    public Object v;
    public boolean w;
    public et6 x;
    public boolean y;
    public final Map<String, oxd> c = new HashMap();
    public String f = "";
    public String i = "";
    public String j = "";
    public final AtomicInteger k = new AtomicInteger();
    public final ShareContext t = new ShareContext();
    public final JSONObject z = new JSONObject();
    public int A = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class CartGroupContext implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int GROUP_TYPE_BUNDLE_HEADER = 1;
        public static final int GROUP_TYPE_EMPTY = 2;
        public static final int GROUP_TYPE_ITEM = 0;
        private boolean isExpanded;
        private boolean isHandleExpanded;
        private boolean isRecommendTitleShow;
        private List<String> items;
        private List<String> itemsInOtherGroup;
        private String mDefaultFilterItem;
        private String name;
        private List<String> originItems;
        private String triggerComponentKey;
        private int type;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public @interface CartGroupType {
        }

        static {
            t2o.a(479199267);
        }

        public String getDefaultFilterItem() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c97ebda3", new Object[]{this});
            }
            return this.mDefaultFilterItem;
        }

        public boolean getIsExpanded() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a230ec04", new Object[]{this})).booleanValue();
            }
            return this.isExpanded;
        }

        public boolean getIsRecommendTitleShow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f0922764", new Object[]{this})).booleanValue();
            }
            return this.isRecommendTitleShow;
        }

        public List<String> getItems() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("46e3e096", new Object[]{this});
            }
            return this.items;
        }

        public List<String> getItemsInOtherGroup() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("c6d05ea2", new Object[]{this});
            }
            return this.itemsInOtherGroup;
        }

        public String getName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
            }
            return this.name;
        }

        public List<String> getOriginItems() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("6c10b15c", new Object[]{this});
            }
            return this.originItems;
        }

        public String getTriggerComponentKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a4dd92b5", new Object[]{this});
            }
            return this.triggerComponentKey;
        }

        public int getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
            }
            return this.type;
        }

        public boolean isHandleExpanded() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("92ba85d6", new Object[]{this})).booleanValue();
            }
            return this.isHandleExpanded;
        }

        public void setDefaultFilterItem(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63d7fe9b", new Object[]{this, str});
            } else {
                this.mDefaultFilterItem = str;
            }
        }

        public void setHandleExpanded(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7e7bd0a", new Object[]{this, new Boolean(z)});
            } else {
                this.isHandleExpanded = z;
            }
        }

        public void setIsExpanded(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dac3e048", new Object[]{this, new Boolean(z)});
            } else {
                this.isExpanded = z;
            }
        }

        public void setIsRecommendTitleShow(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b7fcfe8", new Object[]{this, new Boolean(z)});
            } else {
                this.isRecommendTitleShow = z;
            }
        }

        public void setItems(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba1ea0f6", new Object[]{this, list});
            } else {
                this.items = list;
            }
        }

        public void setItemsInOtherGroup(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35cd66a", new Object[]{this, list});
            } else {
                this.itemsInOtherGroup = list;
            }
        }

        public void setName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
            } else {
                this.name = str;
            }
        }

        public void setOriginItems(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce3cc1f0", new Object[]{this, list});
            } else {
                this.originItems = list;
            }
        }

        public void setTriggerComponentKey(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("beaa3ec9", new Object[]{this, str});
            } else {
                this.triggerComponentKey = str;
            }
        }

        public void setType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
            } else {
                this.type = i;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class ShareContext implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String ENABLE_PREFETCH_VIEW = "enablePrefetchView";
        private static final String ENABLE_SHOW_CUSHION_VIEW = "needShowCushionView";
        private static boolean enablePrefetchView;
        private static boolean isHideAddress;
        private static boolean needShowCushionView;

        static {
            t2o.a(479199269);
            initSpValue();
        }

        public static boolean enablePrefetchView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e291e76a", new Object[0])).booleanValue();
            }
            return enablePrefetchView;
        }

        private static void initSpValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a88b586b", new Object[0]);
                return;
            }
            try {
                Application application = Globals.getApplication();
                isHideAddress = tc3.b(application, "isHideAddress", false);
                needShowCushionView = tc3.b(application, ENABLE_SHOW_CUSHION_VIEW, true);
                if (h0r.k()) {
                    boolean h = h0r.h();
                    putBooleanValue(ENABLE_PREFETCH_VIEW, h);
                    enablePrefetchView = h;
                } else {
                    enablePrefetchView = tc3.b(application, ENABLE_PREFETCH_VIEW, true);
                }
            } catch (Exception e) {
                ei8.a("initSpValueError", e);
            }
        }

        public static boolean needShowCushionView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c7876efe", new Object[0])).booleanValue();
            }
            return needShowCushionView;
        }

        private static void putBooleanValue(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c87f208b", new Object[]{str, new Boolean(z)});
                return;
            }
            try {
                tc3.f(Globals.getApplication(), str, z);
            } catch (Exception e) {
                UnifyLog.e("CartShareContext", z9u.ARG_TAOKE_ERROR + e.getMessage());
            }
        }

        public static void updateOnlySPForOrangeChange() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("409d6d5c", new Object[0]);
                return;
            }
            putBooleanValue(ENABLE_PREFETCH_VIEW, h0r.h());
            putBooleanValue(ENABLE_SHOW_CUSHION_VIEW, h0r.m());
        }

        public boolean getIsHideAddress() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ec994c9d", new Object[]{this})).booleanValue();
            }
            return isHideAddress;
        }

        public void setHideAddress(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3520d69d", new Object[]{this, new Boolean(z)});
                return;
            }
            isHideAddress = z;
            putBooleanValue("isHideAddress", z);
        }
    }

    static {
        t2o.a(479199266);
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a9b163e", new Object[]{this})).booleanValue();
        }
        return this.u;
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5931ce5c", new Object[]{this})).booleanValue();
        }
        return this.y;
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4474ea54", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    public void D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60c505d3", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b76e293", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void F(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca160ae", new Object[]{this, obj});
        } else {
            this.v = obj;
        }
    }

    public void G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc6ad47a", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad919c3e", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void I(CartGroupContext cartGroupContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cc3d6", new Object[]{this, cartGroupContext});
        } else {
            this.f2189a = cartGroupContext;
        }
    }

    public void J(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a892c30b", new Object[]{this, new Boolean(z)});
        } else {
            this.w = z;
        }
    }

    public void K(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f53bff86", new Object[]{this, new Integer(i)});
        } else {
            this.l = i;
        }
    }

    public void L(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f72b8211", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public void M(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0d6182", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    public void N(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209a3dae", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void O(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad2bd4a5", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void P(et6 et6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1279c881", new Object[]{this, et6Var});
        } else {
            this.x = et6Var;
        }
    }

    public void Q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f998e7", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void R(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64fdeb12", new Object[]{this, new Boolean(z)});
        } else {
            this.u = z;
        }
    }

    public void S(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a54ab4", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    public void T(RequestConfig.RequestType requestType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c54e78", new Object[]{this, requestType});
        } else {
            this.q = requestType;
        }
    }

    public void U(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f19abbc", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    public void V(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec1662b2", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public void W(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c2fdee", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public void X(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4acbf9d0", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public int Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe160693", new Object[]{this})).intValue();
        }
        int i = this.A;
        this.A = 1 + i;
        return i;
    }

    public void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297d271e", new Object[]{this});
        } else {
            this.A = 0;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcc16ff7", new Object[]{this});
        } else {
            ((HashMap) this.c).clear();
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13b7ef6b", new Object[]{this});
        }
        return this.e;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8f060ab", new Object[]{this});
        }
        return this.d;
    }

    public Object d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7ad554ac", new Object[]{this});
        }
        return this.v;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7437c", new Object[]{this});
        }
        return this.f;
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1eba9980", new Object[]{this});
        }
        return this.z;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1dce638", new Object[]{this});
        }
        return this.i;
    }

    public CartGroupContext h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartGroupContext) ipChange.ipc$dispatch("d69c348c", new Object[]{this});
        }
        return this.f2189a;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d26a979c", new Object[]{this})).intValue();
        }
        return this.l;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e9289ba", new Object[]{this})).intValue();
        }
        return this.r;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d4c8995", new Object[]{this})).intValue();
        }
        return this.k.get();
    }

    public et6 l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (et6) ipChange.ipc$dispatch("7fdf86f9", new Object[]{this});
        }
        return this.x;
    }

    public RequestConfig.RequestType m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig.RequestType) ipChange.ipc$dispatch("1b9cf2a6", new Object[]{this});
        }
        return this.q;
    }

    public ShareContext n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContext) ipChange.ipc$dispatch("b6fa784c", new Object[]{this});
        }
        return this.t;
    }

    public oxd o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oxd) ipChange.ipc$dispatch("1045d4f3", new Object[]{this, str});
        }
        if (((HashMap) this.c).get(str) == null) {
            ((HashMap) this.c).put(str, new dqs());
        }
        return (oxd) ((HashMap) this.c).get(str);
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6082b444", new Object[]{this});
        }
        return this.o;
    }

    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8312b388", new Object[]{this});
        }
        if (this.n == null) {
            this.n = na3.a();
        }
        return this.n;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4aa74ce", new Object[]{this});
        }
        return this.j;
    }

    public int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb39c59d", new Object[]{this})).intValue();
        }
        return this.k.incrementAndGet();
    }

    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c2d6ed", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.r = 200;
        }
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a00eb725", new Object[]{this})).booleanValue();
        }
        return this.w;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9ad475f", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96f063ce", new Object[]{this})).booleanValue();
        }
        return this.s;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba0c18b2", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de7e5c4b", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f34ea859", new Object[]{this})).booleanValue();
        }
        return this.b;
    }
}
