package com.taobao.search.mmd.uikit.shopinfo;

import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.search.mmd.uikit.shopinfo.ShopInfoItemBean;
import java.util.Map;
import kotlin.a;
import kotlin.jvm.internal.PropertyReference1Impl;
import tb.a0g;
import tb.ckf;
import tb.d1a;
import tb.dun;
import tb.g1a;
import tb.njg;
import tb.p1p;
import tb.srl;
import tb.t2o;
import tb.u3i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ShopInfoItemBean {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f11555a;
    public final njg b;
    public final njg f;
    public final njg g;
    public final njg h;
    public final njg i;

    public ShopInfoItemBean(final Map<String, ? extends Object> map) {
        ckf.g(map, "props");
        this.f11555a = u3i.b(map, new g1a() { // from class: tb.qnz
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                Object w;
                w = ShopInfoItemBean.w((String) obj);
                return w;
            }
        });
        this.b = a.b(new d1a() { // from class: tb.rnz
            @Override // tb.d1a
            public final Object invoke() {
                int x;
                x = ShopInfoItemBean.x(map);
                return Integer.valueOf(x);
            }
        });
        this.f = a.b(new d1a() { // from class: tb.snz
            @Override // tb.d1a
            public final Object invoke() {
                int y;
                y = ShopInfoItemBean.y(map);
                return Integer.valueOf(y);
            }
        });
        this.g = a.b(new d1a() { // from class: tb.tnz
            @Override // tb.d1a
            public final Object invoke() {
                int v;
                v = ShopInfoItemBean.v(map);
                return Integer.valueOf(v);
            }
        });
        this.h = a.b(new d1a() { // from class: tb.unz
            @Override // tb.d1a
            public final Object invoke() {
                int u;
                u = ShopInfoItemBean.u(map);
                return Integer.valueOf(u);
            }
        });
        this.i = a.b(new d1a() { // from class: tb.vnz
            @Override // tb.d1a
            public final Object invoke() {
                int t;
                t = ShopInfoItemBean.t(map);
                return Integer.valueOf(t);
            }
        });
    }

    public static final int t(Map map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("578ee3f2", new Object[]{map})).intValue();
        }
        ckf.g(map, "$props");
        Object obj = map.get("height");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        return p1p.a(srl.e(str, 0));
    }

    public static final int u(Map map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d5e475a", new Object[]{map})).intValue();
        }
        ckf.g(map, "$props");
        Object obj = map.get("iconHeight");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        return srl.e(str, 0);
    }

    public static final int v(Map map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b9d3534e", new Object[]{map})).intValue();
        }
        ckf.g(map, "$props");
        Object obj = map.get("iconWidth");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        return srl.e(str, 0);
    }

    public static final Object w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1bea5c6a", new Object[]{str});
        }
        ckf.g(str, AdvanceSetting.NETWORK_TYPE);
        return "";
    }

    public static final int y(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("627e838e", new Object[]{map})).intValue();
        }
        ckf.g(map, "$props");
        Object obj = map.get("textSize");
        return srl.e(obj instanceof String ? (String) obj : null, 12);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("822c976c", new Object[]{this});
        }
        return (String) u3i.a(this.f11555a, $$delegatedProperties[0].getName());
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return ((Number) this.i.getValue()).intValue();
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("759cdb3f", new Object[]{this});
        }
        return (String) u3i.a(this.f11555a, $$delegatedProperties[3].getName());
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e32456a", new Object[]{this});
        }
        return (String) u3i.a(this.f11555a, $$delegatedProperties[1].getName());
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef1b8c70", new Object[]{this})).intValue();
        }
        return ((Number) this.h.getValue()).intValue();
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bffa1e37", new Object[]{this});
        }
        return (String) u3i.a(this.f11555a, $$delegatedProperties[6].getName());
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85d5f711", new Object[]{this})).intValue();
        }
        return ((Number) this.g.getValue()).intValue();
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return (String) u3i.a(this.f11555a, $$delegatedProperties[2].getName());
    }

    public final int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("835f3abe", new Object[]{this})).intValue();
        }
        return ((Number) this.f.getValue()).intValue();
    }

    public final boolean j() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42a09bda", new Object[]{this})).booleanValue();
        }
        Object obj = this.f11555a.get("isBold");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        return srl.b(str, false);
    }

    public final String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b0a7bf4", new Object[]{this});
        }
        return (String) u3i.a(this.f11555a, $$delegatedProperties[5].getName());
    }

    public final String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e038dfae", new Object[]{this});
        }
        return (String) u3i.a(this.f11555a, $$delegatedProperties[4].getName());
    }

    public final int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c33be607", new Object[]{this})).intValue();
        }
        return ((Number) this.b.getValue()).intValue();
    }

    public static final int x(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4a78406", new Object[]{map})).intValue();
        }
        ckf.g(map, "$props");
        Object obj = map.get("suffixLength");
        return srl.e(obj instanceof String ? (String) obj : null, 0);
    }

    static {
        t2o.a(815792573);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ShopInfoItemBean.class, "color", "getColor()Ljava/lang/String;", 0);
        dun.i(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(ShopInfoItemBean.class, "icon", "getIcon()Ljava/lang/String;", 0);
        dun.i(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(ShopInfoItemBean.class, "text", "getText()Ljava/lang/String;", 0);
        dun.i(propertyReference1Impl3);
        PropertyReference1Impl propertyReference1Impl4 = new PropertyReference1Impl(ShopInfoItemBean.class, "hiddenType", "getHiddenType()Ljava/lang/String;", 0);
        dun.i(propertyReference1Impl4);
        PropertyReference1Impl propertyReference1Impl5 = new PropertyReference1Impl(ShopInfoItemBean.class, "highLightText", "getHighLightText()Ljava/lang/String;", 0);
        dun.i(propertyReference1Impl5);
        PropertyReference1Impl propertyReference1Impl6 = new PropertyReference1Impl(ShopInfoItemBean.class, "highLightColor", "getHighLightColor()Ljava/lang/String;", 0);
        dun.i(propertyReference1Impl6);
        PropertyReference1Impl propertyReference1Impl7 = new PropertyReference1Impl(ShopInfoItemBean.class, "iconStyle", "getIconStyle()Ljava/lang/String;", 0);
        dun.i(propertyReference1Impl7);
        $$delegatedProperties = new a0g[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3, propertyReference1Impl4, propertyReference1Impl5, propertyReference1Impl6, propertyReference1Impl7};
    }
}
