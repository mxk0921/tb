package com.taobao.message.lab.comfrm.inner2;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SplitPart<T, INDEX> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private T data;
    private INDEX index;
    private String type;

    static {
        t2o.a(537919657);
    }

    public SplitPart() {
    }

    public T getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
        }
        return this.data;
    }

    public INDEX getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INDEX) ipChange.ipc$dispatch("77774bef", new Object[]{this});
        }
        return this.index;
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.type;
    }

    public SplitPart(String str, T t, INDEX index) {
        this.type = str;
        this.data = t;
        this.index = index;
    }
}
