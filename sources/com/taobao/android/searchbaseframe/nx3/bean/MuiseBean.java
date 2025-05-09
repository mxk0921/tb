package com.taobao.android.searchbaseframe.nx3.bean;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.parse.TypedBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MuiseBean extends BaseTypedBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mDegradeType;
    public JSONObject pageInfoExtraStatus;
    public JSONObject model = new JSONObject();
    public JSONObject status = new JSONObject();
    public JSONObject extraStatus = new JSONObject();
    public final Map<String, Object> mExtraObj = new HashMap();
    public final Map<String, Object> mStorage = new HashMap();
    private int mCachedWfHeight = -1;
    private int mCachedListHeight = -1;

    static {
        t2o.a(993001909);
    }

    public static /* synthetic */ Object ipc$super(MuiseBean muiseBean, String str, Object... objArr) {
        if (str.hashCode() == -2073377637) {
            super.copy((TypedBean) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/nx3/bean/MuiseBean");
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean, com.taobao.android.searchbaseframe.parse.TypedBean
    public <T extends TypedBean> void copy(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846ac49b", new Object[]{this, t});
            return;
        }
        super.copy(t);
        MuiseBean muiseBean = (MuiseBean) t;
        muiseBean.model.putAll(this.model);
        muiseBean.status.putAll(this.status);
        muiseBean.pageInfoExtraStatus = this.pageInfoExtraStatus;
        muiseBean.mStorage.putAll(this.mStorage);
        muiseBean.mCachedListHeight = this.mCachedListHeight;
        muiseBean.mCachedWfHeight = this.mCachedWfHeight;
        muiseBean.mDegradeType = this.mDegradeType;
        muiseBean.mExtraObj.putAll(this.mExtraObj);
    }

    public int getCachedHeight(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46a2b49a", new Object[]{this, listStyle})).intValue();
        }
        if (listStyle == ListStyle.LIST) {
            return this.mCachedListHeight;
        }
        return this.mCachedWfHeight;
    }

    public String getdItemType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("231dc6fe", new Object[]{this});
        }
        return this.mDegradeType;
    }

    public void setdItemType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d8d4a0", new Object[]{this, str});
        } else {
            this.mDegradeType = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MuiseBean{type='" + this.type + "'}";
    }

    public void updateCachedHeight(ListStyle listStyle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c11f32f", new Object[]{this, listStyle, new Integer(i)});
        } else if (listStyle == ListStyle.LIST) {
            this.mCachedListHeight = i;
        } else {
            this.mCachedWfHeight = i;
        }
    }
}
