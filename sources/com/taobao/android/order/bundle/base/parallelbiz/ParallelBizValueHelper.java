package com.taobao.android.order.bundle.base.parallelbiz;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.constants.OrderBizCode;
import tb.dbv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ParallelBizValueHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum PageType {
        order_list,
        order_detail,
        order_search,
        logistics_detail;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(PageType pageType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/base/parallelbiz/ParallelBizValueHelper$PageType");
        }

        public static PageType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PageType) ipChange.ipc$dispatch("b905c47a", new Object[]{str});
            }
            return (PageType) Enum.valueOf(PageType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$order$bundle$base$parallelbiz$ParallelBizValueHelper$PageType;

        static {
            int[] iArr = new int[PageType.values().length];
            $SwitchMap$com$taobao$android$order$bundle$base$parallelbiz$ParallelBizValueHelper$PageType = iArr;
            try {
                iArr[PageType.order_list.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$order$bundle$base$parallelbiz$ParallelBizValueHelper$PageType[PageType.order_detail.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$order$bundle$base$parallelbiz$ParallelBizValueHelper$PageType[PageType.order_search.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$order$bundle$base$parallelbiz$ParallelBizValueHelper$PageType[PageType.logistics_detail.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        t2o.a(713031738);
    }

    public static String c(PageType pageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1305a7ac", new Object[]{pageType});
        }
        boolean o = Localization.o();
        int i = a.$SwitchMap$com$taobao$android$order$bundle$base$parallelbiz$ParallelBizValueHelper$PageType[pageType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "";
                    }
                    if (!o) {
                        return "Page_NewLogisticsDetail";
                    }
                    return "Page_Overseas_NewLogisticsDetail";
                } else if (!o) {
                    return "Page_OrderSearch";
                } else {
                    return "Page_Overseas_OrderSearch";
                }
            } else if (!o) {
                return dbv.BIZ_ORDER_DETAIL;
            } else {
                return "Page_Overseas_OrderDetail";
            }
        } else if (!o) {
            return dbv.BIZ_ORDER_LIST;
        } else {
            return "Page_Overseas_OrderList";
        }
    }

    public static String d(PageType pageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("586b3211", new Object[]{pageType});
        }
        Localization.o();
        int i = a.$SwitchMap$com$taobao$android$order$bundle$base$parallelbiz$ParallelBizValueHelper$PageType[pageType.ordinal()];
        if (i == 1) {
            return CoreConstants.UT_ORDER_LIST_SPM_CNT;
        }
        if (i == 2) {
            return "a2141.7631730.0.0";
        }
        if (i != 4) {
            return "";
        }
        return "a2141.26898204.0.0";
    }

    public static String a(PageType pageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f0badd4", new Object[]{pageType});
        }
        boolean o = Localization.o();
        int i = a.$SwitchMap$com$taobao$android$order$bundle$base$parallelbiz$ParallelBizValueHelper$PageType[pageType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return "";
                }
                if (!o) {
                    return "物流详情";
                }
                return "海外物流详情";
            } else if (!o) {
                return "订单详情";
            } else {
                return "海外订单详情";
            }
        } else if (!o) {
            return "订单列表";
        } else {
            return "海外订单列表";
        }
    }

    public static String b(PageType pageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("727b5295", new Object[]{pageType});
        }
        int i = a.$SwitchMap$com$taobao$android$order$bundle$base$parallelbiz$ParallelBizValueHelper$PageType[pageType.ordinal()];
        if (i == 1) {
            return OrderBizCode.orderList;
        }
        if (i == 2) {
            return OrderBizCode.orderDetail;
        }
        if (i != 4) {
            return "";
        }
        return OrderBizCode.logisticsDetail;
    }
}
