package com.taobao.android.tschedule;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<AbstractC0502a> f9707a = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.tschedule.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface AbstractC0502a {
        void d(String str, String str2);
    }

    static {
        t2o.a(329252869);
    }

    public static boolean a(AbstractC0502a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f437e38f", new Object[]{aVar})).booleanValue();
        }
        return ((CopyOnWriteArrayList) f9707a).add(aVar);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3526e380", new Object[]{str, str2});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) f9707a).iterator();
        while (it.hasNext()) {
            ((AbstractC0502a) it.next()).d(str, str2);
        }
    }
}
