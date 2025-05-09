package com.taobao.android.detail.wrapper.msoa;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alittdetail.supermarket.a;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NewDetailMSOAImpl implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(443547660);
    }

    public void addSMCart(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b985aa", new Object[]{this, str, str2, str3, str4});
        } else {
            a.a(str, str2, str3, str4);
        }
    }
}
