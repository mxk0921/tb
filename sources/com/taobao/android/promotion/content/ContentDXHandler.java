package com.taobao.android.promotion.content;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import java.io.Serializable;
import tb.hxj;
import tb.odg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ContentDXHandler implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FUN_CLICK_CONTENT = "clickContent";
    private static final String FUN_CLICK_ELEVATOR_BACK_TOP = "backToTop";
    private static final String FUN_CLICK_ELEVATOR_EXPAND = "expand";
    private static final String FUN_CLICK_ELEVATOR_FLOOR = "clickFloor";
    private static final String FUN_FILTER = "filter";
    private static final String FUN_LOAD_DATA = "loadData";
    private static final String FUN_LOAD_MORE = "loadMoreData";
    private static final String FUN_OPEN_CONTENT = "openContent";
    private static final String FUN_OPEN_URL = "openUrl";
    private static final String TAG = "ContentDXHandler";

    static {
        t2o.a(629145604);
    }

    private static int findIndexByContentId(TTDContentController tTDContentController, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("417952ad", new Object[]{tTDContentController, str})).intValue();
        }
        return tTDContentController.i(str);
    }

    public static boolean handleEvent(Context context, TTDContentController tTDContentController, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98eb5749", new Object[]{context, tTDContentController, objArr})).booleanValue();
        }
        if (objArr == null || objArr.length == 0 || !(objArr[0] instanceof String)) {
            return false;
        }
        if (context instanceof ContentDetailActivity) {
            return handleContentDetailEvent(context, objArr);
        }
        return handleContentListDxEvent(context, tTDContentController, objArr);
    }

    private static void trackContentCardClick(Context context, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef89bba", new Object[]{context, objArr});
        } else if (objArr.length >= 6) {
            Object obj = objArr[5];
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
            }
        }
    }

    private static void trackContentFilterClick(Context context, Object[] objArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6cf611c", new Object[]{context, objArr, str});
        } else if (objArr.length >= 3) {
            Object obj = objArr[2];
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
            }
        }
    }

    private static boolean handleContentDetailEvent(Context context, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1671234c", new Object[]{context, objArr})).booleanValue();
        }
        ContentDetailActivity contentDetailActivity = (ContentDetailActivity) context;
        if (FUN_LOAD_MORE.equals((String) objArr[0])) {
            contentDetailActivity.F3();
        }
        return true;
    }

    private static boolean handleContentListDxEvent(Context context, TTDContentController tTDContentController, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77773d84", new Object[]{context, tTDContentController, objArr})).booleanValue();
        }
        String str = (String) objArr[0];
        if (FUN_CLICK_ELEVATOR_FLOOR.equals(str) && objArr.length >= 2) {
            odg.c(TAG, "content tab user clickFloor with locatorId: " + ((String) objArr[1]));
            return true;
        } else if (FUN_CLICK_ELEVATOR_BACK_TOP.equals(str)) {
            odg.c(TAG, "content tab user click backToTop");
            return true;
        } else if ("expand".equals(str)) {
            odg.c(TAG, "content tab user click floor to expand");
            return true;
        } else {
            if (FUN_LOAD_MORE.equals(str)) {
                tTDContentController.o();
            } else if (FUN_OPEN_CONTENT.equals(str)) {
                String str2 = (String) objArr[1];
                tTDContentController.E(findIndexByContentId(tTDContentController, str2));
                Bundle bundle = new Bundle();
                bundle.putString("dxName", (String) objArr[2]);
                bundle.putString("dxVersion", (String) objArr[3]);
                bundle.putString("dxUrl", (String) objArr[4]);
                bundle.putString(hxj.UNIQID, tTDContentController.k());
                Nav.from(context).withExtras(bundle).forResult(10).toUri("http://internal.tt.content.taobao.com/awp/core/detail/promotion.htm?contentId=" + str2);
                trackContentCardClick(context, objArr);
            } else if ("filter".equals(str)) {
                String str3 = (String) objArr[1];
                tTDContentController.g(str3);
                trackContentFilterClick(context, objArr, str3);
            } else if ("openUrl".equals(str)) {
                try {
                    Nav.from(context).toUri((String) objArr[1]);
                } catch (Throwable th) {
                    odg.c(TAG, "open url error : ", th);
                }
            } else if (FUN_LOAD_DATA.equals(str)) {
                tTDContentController.B();
            } else {
                "clickContent".equals(str);
            }
            return true;
        }
    }
}
