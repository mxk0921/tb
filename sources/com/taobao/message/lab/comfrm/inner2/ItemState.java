package com.taobao.message.lab.comfrm.inner2;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ItemState<INDEX> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, Object> data;
    private INDEX index;

    static {
        t2o.a(537919618);
    }

    public ItemState(ItemState<INDEX> itemState) {
        this.data = new HashMap(itemState.data);
        this.index = itemState.index;
    }

    public ItemState<INDEX> copy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemState) ipChange.ipc$dispatch("d7ffee2c", new Object[]{this});
        }
        return new ItemState<>((ItemState) this);
    }

    public <T> T getData(String str, Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("472f86aa", new Object[]{this, str, cls, t});
        }
        T t2 = (T) this.data.get(str);
        if (t2 == null) {
            return t;
        }
        return t2;
    }

    public INDEX getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INDEX) ipChange.ipc$dispatch("77774bef", new Object[]{this});
        }
        return this.index;
    }

    public ItemState<INDEX> updateData(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemState) ipChange.ipc$dispatch("6d7c769d", new Object[]{this, map});
        }
        ItemState<INDEX> copy = copy();
        copy.data.putAll(map);
        return copy;
    }

    public ItemState(INDEX index) {
        this.data = new HashMap();
        this.index = index;
    }
}
