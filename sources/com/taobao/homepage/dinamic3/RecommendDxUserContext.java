package com.taobao.homepage.dinamic3;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.fl6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RecommendDxUserContext extends fl6 implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject mContext = new JSONObject();

    static {
        t2o.a(729808993);
    }

    private RecommendDxUserContext() {
    }

    public static /* synthetic */ Object ipc$super(RecommendDxUserContext recommendDxUserContext, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/RecommendDxUserContext");
    }

    public static RecommendDxUserContext newInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecommendDxUserContext) ipChange.ipc$dispatch("8cebf2fc", new Object[0]);
        }
        return new RecommendDxUserContext();
    }

    public RecommendDxUserContext addContext(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecommendDxUserContext) ipChange.ipc$dispatch("95d38d1b", new Object[]{this, str, obj});
        }
        this.mContext.put(str, obj);
        return this;
    }

    public int getIntValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8b0a4bc", new Object[]{this, str})).intValue();
        }
        return this.mContext.getIntValue(str);
    }

    public Object getObject(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c26088ec", new Object[]{this, str});
        }
        return this.mContext.get(str);
    }

    public String getStringValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f60d845", new Object[]{this, str});
        }
        return this.mContext.getString(str);
    }
}
