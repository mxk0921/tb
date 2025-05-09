package com.alibaba.android.ultron.engine.protocol;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Data extends BaseProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Component> components;

    static {
        t2o.a(157286454);
    }

    private Data(Map<String, Component> map) {
        this.components = map;
    }

    public static /* synthetic */ Object ipc$super(Data data, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/engine/protocol/Data");
    }

    public static Data of(Map<String, Component> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("220dc62a", new Object[]{map});
        }
        return new Data(map);
    }
}
