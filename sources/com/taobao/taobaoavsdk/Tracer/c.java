package com.taobao.taobaoavsdk.Tracer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.Tracer.BaseAnalysis;
import java.util.ArrayList;
import java.util.List;
import tb.ew0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c extends BaseAnalysis {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(774897856);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobaoavsdk/Tracer/VideoAnalysis");
    }

    @Override // tb.tfb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ab72718", new Object[]{this});
        }
        return "VIDEO";
    }

    @Override // tb.tfb
    public List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31a3eb1a", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (BaseAnalysis.Stage stage : BaseAnalysis.Stage.values()) {
            arrayList.add(stage.name());
        }
        return arrayList;
    }

    @Override // tb.tfb
    public boolean enable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70c6308e", new Object[]{this})).booleanValue();
        }
        return ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "fullSpanAnalysis", "true"));
    }
}
