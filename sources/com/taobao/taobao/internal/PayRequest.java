package com.taobao.taobao.internal;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.export.CashdeskConstants;
import java.io.Serializable;
import java.util.Map;
import tb.g1p;
import tb.if3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PayRequest implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALL_ALIPAY_SDK = "CALL_ALIPAY_SDK";
    public static final String CALL_ASYNC_QUERY = "CALL_ASYNC_QUERY";
    public static final String CALL_LAUNCH_CASHIER_PAGE = "CALL_LAUNCH_CASHIER_FRONT";
    public static final String CALL_WEIXIN_SDK = "CALL_WEIXIN_SDK";
    private static final String KEY_NUM_TRUE = "1";
    private static final String KEY_TRUE = "true";
    private String actionParams;
    private if3 cashierParam;
    private Map<String, String> extAttrMap;
    private String from;
    private String institutionCode = "alipay";
    private String loadingText;
    private String nextAction;
    private String orderIds;
    private String payMethod;
    private g1p searchConfig;
    private String successUrl;
    private String unSuccessUrl;

    public String getActionParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80cd7067", new Object[]{this});
        }
        return this.actionParams;
    }

    public if3 getCashierParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (if3) ipChange.ipc$dispatch("18796830", new Object[]{this});
        }
        return this.cashierParam;
    }

    public Map<String, String> getExtAttrMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("852f9ebc", new Object[]{this});
        }
        return this.extAttrMap;
    }

    public String getFrom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df3302d9", new Object[]{this});
        }
        return this.from;
    }

    public String getInstitutionCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("699c90ca", new Object[]{this});
        }
        return this.institutionCode;
    }

    public String getLoadingText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccfead86", new Object[]{this});
        }
        return this.loadingText;
    }

    public String getNextAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a62e95a", new Object[]{this});
        }
        return this.nextAction;
    }

    public String getOrderIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f5584f9", new Object[]{this});
        }
        return this.orderIds;
    }

    public String getPayMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("340693e6", new Object[]{this});
        }
        return this.payMethod;
    }

    public g1p getSearchConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1p) ipChange.ipc$dispatch("1f1b5830", new Object[]{this});
        }
        return this.searchConfig;
    }

    public String getSuccessUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("267fbdd7", new Object[]{this});
        }
        return this.successUrl;
    }

    public String getUnSuccessUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b72c97e", new Object[]{this});
        }
        return this.unSuccessUrl;
    }

    public boolean isCallAlipaySDK() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15ad6053", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(this.nextAction, CALL_ALIPAY_SDK);
    }

    public boolean isCallWXSDK() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f3ff3fc", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(this.nextAction, CALL_WEIXIN_SDK);
    }

    public void setActionParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297f10ef", new Object[]{this, str});
        } else {
            this.actionParams = str;
        }
    }

    public void setCashierParam(if3 if3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84790c86", new Object[]{this, if3Var});
        } else {
            this.cashierParam = if3Var;
        }
    }

    public void setExtAttrMap(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac8de52", new Object[]{this, map});
        } else {
            this.extAttrMap = map;
        }
    }

    public void setFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bac98bd", new Object[]{this, str});
        } else {
            this.from = str;
        }
    }

    public void setInstitutionCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("841d5d54", new Object[]{this, str});
        } else {
            this.institutionCode = str;
        }
    }

    public void setLoadingText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea8e3218", new Object[]{this, str});
        } else {
            this.loadingText = str;
        }
    }

    public void setNextAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78e3c95c", new Object[]{this, str});
        } else {
            this.nextAction = str;
        }
    }

    public void setOrderIds(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2638749d", new Object[]{this, str});
        } else {
            this.orderIds = str;
        }
    }

    public void setPayMethod(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf09a4b8", new Object[]{this, str});
        } else {
            this.payMethod = str;
        }
    }

    public void setSearchConfig(g1p g1pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c953dd86", new Object[]{this, g1pVar});
        } else {
            this.searchConfig = g1pVar;
        }
    }

    public void setSuccessUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2061847f", new Object[]{this, str});
        } else {
            this.successUrl = str;
        }
    }

    public void setUnSuccessUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7384dab8", new Object[]{this, str});
        } else {
            this.unSuccessUrl = str;
        }
    }

    public boolean isUseStandardSdk() {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37af548b", new Object[]{this})).booleanValue();
        }
        if3 if3Var = this.cashierParam;
        if (if3Var == null || (d = if3Var.d()) == null) {
            return false;
        }
        return d.getBooleanValue("useStandardSdk");
    }

    public boolean isNeedPop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65c49d5c", new Object[]{this})).booleanValue();
        }
        Map<String, String> map = this.extAttrMap;
        if (map == null) {
            return false;
        }
        String str = map.get(CashdeskConstants.KEY_NEED_POP);
        return "true".equals(str) || "1".equals(str);
    }

    public boolean isSingleTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9b41cee", new Object[]{this})).booleanValue();
        }
        Map<String, String> map = this.extAttrMap;
        if (map == null) {
            return false;
        }
        String str = map.get(CashdeskConstants.KEY_SINGLE_TOP);
        return "true".equals(str) || "1".equals(str);
    }
}
