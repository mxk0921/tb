package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class e9n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList<String> f18379a;
    public static final e9n INSTANCE = new e9n();
    public static final ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();

    public static final void e(String str, Ref$ObjectRef ref$ObjectRef) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6dcead2", new Object[]{str, ref$ObjectRef});
            return;
        }
        ckf.g(str, "$testName");
        ckf.g(ref$ObjectRef, "$value");
        yko ykoVar = yak.f31939a;
        if (ykoVar == null) {
            return;
        }
        if (ykoVar.e().a() || ykoVar.e().b()) {
            b.put(str, y4p.e(str));
            v4p.h(str, (String) ref$ObjectRef.element);
        }
    }

    public static final void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ddf21a3", new Object[]{str, str2});
            return;
        }
        ckf.g(str, "$name");
        v4p.h(str, str2);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.lang.String] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b(final java.lang.String r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.e9n.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "2403c4c6"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L_0x0018:
            java.lang.String r0 = "testName"
            tb.ckf.g(r5, r0)
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = tb.e9n.b
            java.lang.Object r1 = r1.get(r5)
            r0.element = r1
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x003b
            java.lang.String r1 = "empty"
            java.lang.String r1 = tb.v4p.e(r5, r1)
            r0.element = r1
        L_0x003b:
            java.util.concurrent.ExecutorService r1 = tb.le1.a()
            tb.skz r2 = new tb.skz
            r2.<init>()
            r1.execute(r2)
            T r5 = r0.element
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x004f
            java.lang.String r5 = ""
        L_0x004f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.e9n.b(java.lang.String):java.lang.String");
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
            return;
        }
        Iterator<String> it = f18379a.iterator();
        while (it.hasNext()) {
            final String next = it.next();
            final String e = y4p.e(next);
            b.put(next, e);
            le1.a().execute(new Runnable() { // from class: tb.tkz
                @Override // java.lang.Runnable
                public final void run() {
                    e9n.f(next, e);
                }
            });
        }
    }

    static {
        t2o.a(815792216);
        ArrayList<String> arrayList = new ArrayList<>();
        f18379a = arrayList;
        arrayList.add("tbAndroidTB2024StyleV3");
    }
}
