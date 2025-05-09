package com.alibaba.android.aura.datamodel;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Topic<T extends Serializable> implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final T data;
    private final String name;

    static {
        t2o.a(79691854);
    }

    public Topic(String str, T t) {
        this.name = str;
        this.data = t;
    }

    public T getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((Serializable) ipChange.ipc$dispatch("9c7e95a3", new Object[]{this}));
        }
        return this.data;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }
}
