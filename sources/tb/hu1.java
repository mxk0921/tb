package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class hu1<T> implements u1c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Stack<T> f20899a = new Stack<>();
    public final Stack<T> b = new Stack<>();
    public pee<T> c;

    static {
        t2o.a(511705461);
        t2o.a(511705357);
    }

    @Override // tb.u1c
    public p1c<T> D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p1c) ipChange.ipc$dispatch("4992c4c7", new Object[]{this});
        }
        return this.c.a();
    }

    public pee<T> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pee) ipChange.ipc$dispatch("a491596c", new Object[]{this});
        }
        return this.c;
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            p(new l97(new f78()));
        }
    }

    public void p(pee<T> peeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a12a82", new Object[]{this, peeVar});
        } else {
            this.c = peeVar;
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c867d84b", new Object[]{this});
            return;
        }
        this.b.push(v());
        this.f20899a.clear();
    }

    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [T] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T v() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.hu1.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0013
            java.lang.String r1 = "e5af66ab"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r0 = r0.ipc$dispatch(r1, r2)
            return r0
        L_0x0013:
            tb.p1c r0 = r4.D()
            java.lang.Object r0 = r0.get()
            boolean r1 = r0 instanceof com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
            if (r1 == 0) goto L_0x0027
            r1 = r0
            com.taobao.android.litecreator.sdk.editor.data.base.EditableBean r1 = (com.taobao.android.litecreator.sdk.editor.data.base.EditableBean) r1
            java.lang.Object r1 = r1.clone()
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            boolean r2 = r0 instanceof java.util.List
            if (r2 == 0) goto L_0x004f
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0037:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004f
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof com.taobao.android.litecreator.sdk.editor.data.base.EditableBean
            if (r3 == 0) goto L_0x0037
            com.taobao.android.litecreator.sdk.editor.data.base.EditableBean r2 = (com.taobao.android.litecreator.sdk.editor.data.base.EditableBean) r2
            java.lang.Object r2 = r2.clone()
            r1.add(r2)
            goto L_0x0037
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hu1.v():java.lang.Object");
    }
}
