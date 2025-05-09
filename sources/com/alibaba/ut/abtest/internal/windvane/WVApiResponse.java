package com.alibaba.ut.abtest.internal.windvane;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.rb;
import tb.t2o;
import tb.uwf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class WVApiResponse<T> implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "code")
    private int code;
    @JSONField(name = "data")
    private T data;
    @JSONField(name = "message")
    private String message;
    @JSONField(name = rb.RESULT_KEY)
    private String ret;

    static {
        t2o.a(961544406);
    }

    public WVApiResponse() {
        this.code = 0;
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.code;
    }

    public T getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
        }
        return this.data;
    }

    public String getMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
        }
        return this.message;
    }

    public String getRet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a33666e", new Object[]{this});
        }
        return this.ret;
    }

    public void setCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15beaf4d", new Object[]{this, new Integer(i)});
        } else {
            this.code = i;
        }
    }

    public void setData(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f836cf", new Object[]{this, t});
        } else {
            this.data = t;
        }
    }

    public void setMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a65216", new Object[]{this, str});
        } else {
            this.message = str;
        }
    }

    public void setRet(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac64a30", new Object[]{this, str});
        } else {
            this.ret = str;
        }
    }

    public String toJsonString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d4e3785", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.ret)) {
            this.ret = "HY_SUCCESS";
        }
        return uwf.d(this);
    }

    public WVApiResponse(int i) {
        this.code = i;
    }

    public WVApiResponse(int i, String str) {
        this.code = i;
        this.message = str;
    }

    public WVApiResponse(T t) {
        this.code = 0;
        this.data = t;
    }
}
