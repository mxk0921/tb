package com.taobao.android.tschedule.strategy;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.db1;
import tb.dms;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public db1 f9711a = null;
    public final List<AbstractC0503a> b = new ArrayList();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.tschedule.strategy.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface AbstractC0503a {
        void a(db1 db1Var, db1 db1Var2);
    }

    static {
        t2o.a(329252960);
    }

    public void a(AbstractC0503a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df0286a", new Object[]{this, aVar});
        } else {
            ((ArrayList) this.b).add(aVar);
        }
    }

    public void b(db1 db1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("799ad511", new Object[]{this, db1Var});
            return;
        }
        db1 db1Var2 = this.f9711a;
        if (db1Var2 != null && !db1Var2.equals(db1Var)) {
            Iterator it = ((ArrayList) this.b).iterator();
            while (it.hasNext()) {
                ((AbstractC0503a) it.next()).a(db1Var2, db1Var);
            }
        }
        this.f9711a = db1Var;
        HashMap hashMap = new HashMap();
        hashMap.put("bizCode", db1Var.b);
        dms.b("downgrade", this.f9711a.f17702a, "1.0", "TSchedule", "ArbitrateResult", hashMap);
    }
}
