package com.ali.user.mobile.rpc;

import android.util.Pair;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.filter.IAfterFilter;
import com.ali.user.mobile.rpc.filter.IBeforeFilter;
import com.ali.user.mobile.utils.CommonUtil;
import com.alipay.mobile.common.rpc.RpcException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import mtopsdk.common.util.StringUtils;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RpcRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String API_NAME;
    public String dailyDomain;
    public String onlineDomain;
    public String preDomain;
    public int requestSite;
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;
    public int timeoutMilliSecond = RpcException.ErrorCode.PUBLIC_KEY_NOT_FOUND;
    public boolean SHOW_LOGIN_UI = true;
    public ArrayList<String> paramNames = new ArrayList<>();
    public ArrayList<Object> paramValues = new ArrayList<>();
    public final List<IBeforeFilter> beforeFilters = new LinkedList();
    public final List<IAfterFilter> afterFilters = new LinkedList();
    public int connectionTimeoutMilliSecond = RpcException.ErrorCode.PUBLIC_KEY_NOT_FOUND;
    public int socketTimeoutMilliSecond = RpcException.ErrorCode.PUBLIC_KEY_NOT_FOUND;

    static {
        t2o.a(68157563);
    }

    public void addAfter(IAfterFilter iAfterFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0919a6f", new Object[]{this, iAfterFilter});
        } else {
            this.afterFilters.add(iAfterFilter);
        }
    }

    public void addParam(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b71899", new Object[]{this, str, obj});
            return;
        }
        this.paramNames.add(str);
        this.paramValues.add(obj);
    }

    public List<IAfterFilter> getAfterFilters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cb833fcb", new Object[]{this});
        }
        return this.afterFilters;
    }

    public void setNewMtopApi() {
        Pair<String, String> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dad209fb", new Object[]{this});
        } else if (!StringUtils.isBlank(this.API_NAME) && useNewApi(this.API_NAME) && (pair = ApiConstants.ApiName.NEW_API.get(this.API_NAME)) != null) {
            this.API_NAME = (String) pair.first;
            this.VERSION = (String) pair.second;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RpcRequest{API_NAME='" + this.API_NAME + "', VERSION='" + this.VERSION + "', dailyDomain='" + this.dailyDomain + "', preDomain='" + this.preDomain + "', onlineDomain='" + this.onlineDomain + "'}";
    }

    public static boolean useNewApi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17506896", new Object[]{str})).booleanValue();
        }
        return ApiConstants.ApiName.NEW_API.containsKey(str) && CommonUtil.isInABTestRegion("user_new_mtop_api", -1);
    }
}
