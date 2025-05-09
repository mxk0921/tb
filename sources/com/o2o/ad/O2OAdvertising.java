package com.o2o.ad;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import java.io.Serializable;
import java.util.HashMap;
import tb.jbk;
import tb.kbk;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class O2OAdvertising implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static volatile O2OAdvertising f5977a = new O2OAdvertising();

        static {
            t2o.a(1019215878);
        }
    }

    static {
        t2o.a(1019215876);
    }

    public static O2OAdvertising instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (O2OAdvertising) ipChange.ipc$dispatch("726cc8da", new Object[0]);
        }
        return b.f5977a;
    }

    public kbk buildIfsExposure(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kbk) ipChange.ipc$dispatch("92f21126", new Object[]{this, str});
        }
        return new kbk(str);
    }

    public String handleAdClickForClickid(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ddca706e", new Object[]{this, str, str2});
        }
        return jbk.a().b(str, str2);
    }

    public String handleAdUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0744cab", new Object[]{this, str});
        }
        return jbk.a().c(str);
    }

    public String handleAdUrlForClickid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5438d0b1", new Object[]{this, str});
        }
        return jbk.a().d(str);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (application != null) {
            Global.setApplication(application);
        } else {
            throw new NullPointerException("application is can not be null");
        }
    }

    private O2OAdvertising() {
    }
}
