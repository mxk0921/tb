package com.taobao.taolive.sdk.adapter.network;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class NetBaseOutDo implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String api;
    private String[] ret;
    private String v;

    static {
        t2o.a(806355933);
        t2o.a(806355930);
    }

    public String getApi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
        }
        return this.api;
    }

    public abstract Object getData();

    public String[] getRet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("64c49bc1", new Object[]{this});
        }
        return this.ret;
    }

    public String getV() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22bdab39", new Object[]{this});
        }
        return this.v;
    }

    public void setApi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b780bae9", new Object[]{this, str});
        } else {
            this.api = str;
        }
    }

    public void setRet(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("923179", new Object[]{this, strArr});
        } else {
            this.ret = strArr;
        }
    }

    public void setV(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe82bc5", new Object[]{this, str});
        } else {
            this.v = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "NetBaseOutDo{api='" + this.api + "', v='" + this.v + "', ret=" + Arrays.toString(this.ret) + '}';
    }
}
