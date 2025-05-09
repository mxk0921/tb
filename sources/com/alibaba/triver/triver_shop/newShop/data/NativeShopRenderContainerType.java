package com.alibaba.triver.triver_shop.newShop.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.ckf;
import tb.t2o;
import tb.wsq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class NativeShopRenderContainerType extends Enum<NativeShopRenderContainerType> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final NativeShopRenderContainerType TYPE_WEEX = new NativeShopRenderContainerType("TYPE_WEEX", 0);
    public static final NativeShopRenderContainerType TYPE_H5 = new NativeShopRenderContainerType("TYPE_H5", 1);
    public static final NativeShopRenderContainerType TYPE_MINI_APP = new NativeShopRenderContainerType("TYPE_MINI_APP", 2);
    public static final NativeShopRenderContainerType TYPE_SUBSCRIBE = new NativeShopRenderContainerType("TYPE_SUBSCRIBE", 3);
    public static final NativeShopRenderContainerType TYPE_WIDGET = new NativeShopRenderContainerType("TYPE_WIDGET", 4);
    public static final NativeShopRenderContainerType TYPE_ALL_ITEMS = new NativeShopRenderContainerType("TYPE_ALL_ITEMS", 5);
    public static final NativeShopRenderContainerType TYPE_LIVE = new NativeShopRenderContainerType("TYPE_LIVE", 6);
    public static final NativeShopRenderContainerType TYPE_WEEX_V2_WIDGET = new NativeShopRenderContainerType("TYPE_WEEX_V2_WIDGET", 7);
    public static final NativeShopRenderContainerType TYPE_WEEX_V2 = new NativeShopRenderContainerType("TYPE_WEEX_V2", 8);
    public static final NativeShopRenderContainerType TYPE_UNKNOWN = new NativeShopRenderContainerType("TYPE_UNKNOWN", 9);
    private static final /* synthetic */ NativeShopRenderContainerType[] $VALUES = $values();
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766509446);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fc24602f", new Object[]{this, str})).booleanValue();
            }
            return ckf.b("miniappContainer", str);
        }

        public final String c(NativeShopRenderContainerType nativeShopRenderContainerType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c8717be6", new Object[]{this, nativeShopRenderContainerType});
            }
            ckf.g(nativeShopRenderContainerType, "containerType");
            if (nativeShopRenderContainerType == NativeShopRenderContainerType.TYPE_WEEX) {
                return "weex";
            }
            if (nativeShopRenderContainerType == NativeShopRenderContainerType.TYPE_H5) {
                return "h5";
            }
            if (nativeShopRenderContainerType == NativeShopRenderContainerType.TYPE_MINI_APP) {
                return "miniapp";
            }
            if (nativeShopRenderContainerType == NativeShopRenderContainerType.TYPE_SUBSCRIBE) {
                return "subscribe";
            }
            if (nativeShopRenderContainerType == NativeShopRenderContainerType.TYPE_WIDGET) {
                return "widgetContainer";
            }
            return "unknown";
        }

        public a() {
        }

        @JvmStatic
        public final NativeShopRenderContainerType b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NativeShopRenderContainerType) ipChange.ipc$dispatch("d57745a5", new Object[]{this, str, str2});
            }
            if (str == null) {
                return NativeShopRenderContainerType.TYPE_UNKNOWN;
            }
            if (ckf.b("nativeAllItemContainer", str)) {
                return NativeShopRenderContainerType.TYPE_ALL_ITEMS;
            }
            if (ckf.b("shopWidgetContainer", str)) {
                return NativeShopRenderContainerType.TYPE_WIDGET;
            }
            if (ckf.b("weexExtContainer", str)) {
                if (str2 == null || !wsq.O(str2, "wh_weex=true", false, 2, null)) {
                    return NativeShopRenderContainerType.TYPE_H5;
                }
                return NativeShopRenderContainerType.TYPE_WEEX;
            } else if (ckf.b("miniappContainer", str)) {
                return NativeShopRenderContainerType.TYPE_MINI_APP;
            } else {
                if (ckf.b("dongtai", str)) {
                    return NativeShopRenderContainerType.TYPE_SUBSCRIBE;
                }
                if (ckf.b("nativeLiveContainer", str)) {
                    return NativeShopRenderContainerType.TYPE_LIVE;
                }
                if (ckf.b("widgetGroupContainer", str)) {
                    return NativeShopRenderContainerType.TYPE_WEEX_V2_WIDGET;
                }
                if (ckf.b("weexV2Container", str)) {
                    return NativeShopRenderContainerType.TYPE_WEEX_V2;
                }
                return NativeShopRenderContainerType.TYPE_UNKNOWN;
            }
        }
    }

    private static final /* synthetic */ NativeShopRenderContainerType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NativeShopRenderContainerType[]) ipChange.ipc$dispatch("4c617761", new Object[0]) : new NativeShopRenderContainerType[]{TYPE_WEEX, TYPE_H5, TYPE_MINI_APP, TYPE_SUBSCRIBE, TYPE_WIDGET, TYPE_ALL_ITEMS, TYPE_LIVE, TYPE_WEEX_V2_WIDGET, TYPE_WEEX_V2, TYPE_UNKNOWN};
    }

    private NativeShopRenderContainerType(String str, int i) {
    }

    public static /* synthetic */ Object ipc$super(NativeShopRenderContainerType nativeShopRenderContainerType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/data/NativeShopRenderContainerType");
    }

    @JvmStatic
    public static final NativeShopRenderContainerType isWhichType(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NativeShopRenderContainerType) ipChange.ipc$dispatch("d57745a5", new Object[]{str, str2});
        }
        return Companion.b(str, str2);
    }

    public static NativeShopRenderContainerType valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("2687ba16", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(NativeShopRenderContainerType.class, str);
        }
        return (NativeShopRenderContainerType) valueOf;
    }

    public static NativeShopRenderContainerType[] values() {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            clone = ipChange.ipc$dispatch("81b41905", new Object[0]);
        } else {
            clone = $VALUES.clone();
        }
        return (NativeShopRenderContainerType[]) clone;
    }
}
