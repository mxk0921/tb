package com.taobao.message.lab.comfrm.inner2.lazy;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LazyInitObjectRef<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private T object;

    static {
        t2o.a(537919723);
    }

    public T get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
        }
        T t = this.object;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("需要先初始化，才能调用get方法");
    }

    public void initObject(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fd85bd2", new Object[]{this, t});
        } else if (this.object == null) {
            this.object = t;
        } else {
            throw new IllegalStateException("禁止重复初始化");
        }
    }

    public boolean isInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a588e5", new Object[]{this})).booleanValue();
        }
        if (this.object != null) {
            return true;
        }
        return false;
    }
}
