package com.taobao.share.core.share.interceptor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.jpd;
import tb.spd;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<jpd> f11755a = new ArrayList();
    public final ArrayList<String> b;
    public final TBShareContent c;
    public final String d;

    static {
        t2o.a(664797269);
    }

    public a(ArrayList<String> arrayList, TBShareContent tBShareContent, String str) {
        this.b = arrayList;
        this.c = tBShareContent;
        this.d = str;
    }

    public a a(jpd jpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2f3035b5", new Object[]{this, jpdVar});
        }
        ((ArrayList) this.f11755a).add(jpdVar);
        return this;
    }

    public a b(spd spdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3ec2445b", new Object[]{this, spdVar});
        }
        ((ArrayList) this.f11755a).add(spdVar);
        return this;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("592addc7", new Object[]{this})).booleanValue();
        }
        Iterator it = ((ArrayList) this.f11755a).iterator();
        while (it.hasNext()) {
            if (((jpd) it.next()).a(this.b, this.c, this.d)) {
                return true;
            }
        }
        return false;
    }
}
