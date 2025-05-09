package com.taobao.themis.pub_kit.foot;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.pub_kit.foot.AddFootClient;
import tb.t2o;
import tb.z54;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(845152273);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f6be00", new Object[]{str});
        } else {
            new AddFootClient(new AddFootClient.AddFootprintParam(str), null).a();
        }
    }

    public static void b(String str, z54<Boolean, Boolean> z54Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ea69a5", new Object[]{str, z54Var});
        } else {
            new AddFootClient(new AddFootClient.AddFootprintParam(str), z54Var).a();
        }
    }
}
