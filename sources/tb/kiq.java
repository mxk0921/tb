package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.b;
import com.taobao.android.ucp.bridge.NativeDelegate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kiq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SWITCH_NAME = "enableUCPActionOpt";

    /* renamed from: a  reason: collision with root package name */
    public static final List<b.a> f22693a = new CopyOnWriteArrayList();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/stash/StashesManager$1");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                NativeDelegate.fetchColdStartData();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static final boolean sSwitchOpen = gwv.k(kiq.SWITCH_NAME);

        static {
            t2o.a(404750619);
        }
    }

    static {
        t2o.a(404750617);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        List<b.a> list = f22693a;
        ArrayList arrayList = new ArrayList(list);
        ((CopyOnWriteArrayList) list).clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.taobao.android.behavir.util.b.b((b.a) it.next());
        }
    }

    public static void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else if (b.sSwitchOpen) {
            if (b.compareAndSet(false, true)) {
                a();
            }
            com.taobao.android.behavir.util.b.b(new a());
        }
    }

    public static void c(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbe43bf6", new Object[]{aVar});
        } else if (!b.sSwitchOpen) {
            aVar.run();
        } else if (b.get()) {
            aVar.run();
        } else {
            ((CopyOnWriteArrayList) f22693a).add(aVar);
        }
    }
}
