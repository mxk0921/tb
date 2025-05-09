package com.taobao.android.opencart.check;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.navigation.NavigationTabMsgMode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CheckHoldManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BADGE_NUMBER_EXCEEDED = "99+";
    public static final int CART_NAVIGATION_TAB = 3;
    public static final int KEEP_CHECK_ACTION_TYPE_ADD_CART = 3;
    public static final int KEEP_CHECK_ACTION_TYPE_CHECK = 0;
    public static final int KEEP_CHECK_ACTION_TYPE_REPLACE = 2;
    public static final int KEEP_CHECK_ACTION_TYPE_UNCHECK = 1;
    public static final CheckHoldManager f = new CheckHoldManager();
    public static final Handler g = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    public volatile Set<String> f9066a = new HashSet();
    public volatile Set<String> b = new HashSet();
    public final List<b> c = new ArrayList();
    public volatile String d;
    public volatile String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface ActionType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f9067a;

        public a(int i) {
            this.f9067a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                CheckHoldManager.a(CheckHoldManager.this, this.f9067a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void a(int i);
    }

    public static /* synthetic */ void a(CheckHoldManager checkHoldManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59cf213c", new Object[]{checkHoldManager, new Integer(i)});
        } else {
            checkHoldManager.t(i);
        }
    }

    public static CheckHoldManager i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CheckHoldManager) ipChange.ipc$dispatch("feb851f4", new Object[0]);
        }
        return f;
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c816f0", new Object[]{this, jSONObject});
            return;
        }
        c(jSONObject);
        o();
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("332bcb8c", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("cartId");
            if (!TextUtils.isEmpty(string)) {
                synchronized (this) {
                    try {
                        if (m(jSONObject)) {
                            ((HashSet) this.b).add(string);
                        } else {
                            ((HashSet) this.f9066a).add(string);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public void d(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7250415d", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject != null) {
            if (z) {
                b(jSONObject);
            } else {
                p(jSONObject);
            }
        }
    }

    public synchronized int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("acc2e6d7", new Object[]{this})).intValue();
        }
        return ((HashSet) this.f9066a).size() + ((HashSet) this.b).size();
    }

    public synchronized Set<String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("21585d45", new Object[]{this});
        }
        return this.f9066a;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57a7e37e", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        synchronized (this) {
            try {
                Iterator it = ((HashSet) this.f9066a).iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                    sb.append(",");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8751c51a", new Object[]{this});
        }
        return this.e;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77c60943", new Object[]{this});
        }
        return this.d;
    }

    public synchronized Set<String> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("59bca405", new Object[]{this});
        }
        return this.b;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ecc680a3", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        synchronized (this) {
            try {
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                    sb.append(",");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r8 != 3) goto L_0x0095;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n(int r8, java.util.Set<java.lang.String> r9, java.util.Set<java.lang.String> r10, boolean r11) {
        /*
            r7 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.opencart.check.CheckHoldManager.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0028
            java.lang.String r4 = "557ba203"
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r8)
            java.lang.Boolean r8 = new java.lang.Boolean
            r8.<init>(r11)
            r11 = 5
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r6 = 0
            r11[r6] = r7
            r11[r2] = r5
            r11[r1] = r9
            r11[r0] = r10
            r9 = 4
            r11[r9] = r8
            r3.ipc$dispatch(r4, r11)
            return
        L_0x0028:
            if (r9 != 0) goto L_0x002f
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
        L_0x002f:
            if (r10 != 0) goto L_0x0036
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
        L_0x0036:
            monitor-enter(r7)
            if (r8 == 0) goto L_0x008b
            if (r8 == r2) goto L_0x005b
            if (r8 == r1) goto L_0x0040
            if (r8 == r0) goto L_0x008b
            goto L_0x0095
        L_0x0040:
            java.util.Set<java.lang.String> r8 = r7.f9066a     // Catch: all -> 0x0059
            java.util.HashSet r8 = (java.util.HashSet) r8     // Catch: all -> 0x0059
            r8.clear()     // Catch: all -> 0x0059
            java.util.Set<java.lang.String> r8 = r7.b     // Catch: all -> 0x0059
            java.util.HashSet r8 = (java.util.HashSet) r8     // Catch: all -> 0x0059
            r8.clear()     // Catch: all -> 0x0059
            java.util.Set<java.lang.String> r8 = r7.f9066a     // Catch: all -> 0x0059
            r8.addAll(r9)     // Catch: all -> 0x0059
            java.util.Set<java.lang.String> r8 = r7.b     // Catch: all -> 0x0059
            r8.addAll(r10)     // Catch: all -> 0x0059
            goto L_0x0095
        L_0x0059:
            r8 = move-exception
            goto L_0x009c
        L_0x005b:
            java.util.Iterator r8 = r9.iterator()     // Catch: all -> 0x0059
        L_0x005f:
            boolean r9 = r8.hasNext()     // Catch: all -> 0x0059
            if (r9 == 0) goto L_0x0073
            java.lang.Object r9 = r8.next()     // Catch: all -> 0x0059
            java.lang.String r9 = (java.lang.String) r9     // Catch: all -> 0x0059
            java.util.Set<java.lang.String> r0 = r7.f9066a     // Catch: all -> 0x0059
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch: all -> 0x0059
            r0.remove(r9)     // Catch: all -> 0x0059
            goto L_0x005f
        L_0x0073:
            java.util.Iterator r8 = r10.iterator()     // Catch: all -> 0x0059
        L_0x0077:
            boolean r9 = r8.hasNext()     // Catch: all -> 0x0059
            if (r9 == 0) goto L_0x0095
            java.lang.Object r9 = r8.next()     // Catch: all -> 0x0059
            java.lang.String r9 = (java.lang.String) r9     // Catch: all -> 0x0059
            java.util.Set<java.lang.String> r10 = r7.b     // Catch: all -> 0x0059
            java.util.HashSet r10 = (java.util.HashSet) r10     // Catch: all -> 0x0059
            r10.remove(r9)     // Catch: all -> 0x0059
            goto L_0x0077
        L_0x008b:
            java.util.Set<java.lang.String> r8 = r7.f9066a     // Catch: all -> 0x0059
            r8.addAll(r9)     // Catch: all -> 0x0059
            java.util.Set<java.lang.String> r8 = r7.b     // Catch: all -> 0x0059
            r8.addAll(r10)     // Catch: all -> 0x0059
        L_0x0095:
            monitor-exit(r7)     // Catch: all -> 0x0059
            if (r11 == 0) goto L_0x009b
            r7.o()
        L_0x009b:
            return
        L_0x009c:
            monitor-exit(r7)     // Catch: all -> 0x0059
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.opencart.check.CheckHoldManager.n(int, java.util.Set, java.util.Set, boolean):void");
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80309dc3", new Object[]{this});
            return;
        }
        int e = e();
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(e);
        }
        g.postDelayed(new a(e), 100L);
    }

    public void p(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707b24d3", new Object[]{this, jSONObject});
            return;
        }
        q(jSONObject);
        o();
    }

    public final void q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50b4f389", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("cartId");
            if (!TextUtils.isEmpty(string)) {
                synchronized (this) {
                    try {
                        if (m(jSONObject)) {
                            ((HashSet) this.b).remove(string);
                        } else {
                            ((HashSet) this.f9066a).remove(string);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b8999c", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db3b3ffb", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public final void t(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e0a0752", new Object[]{this, new Integer(i)});
            return;
        }
        String valueOf = String.valueOf(i);
        com.taobao.tao.navigation.b q = com.taobao.tao.navigation.a.q(3);
        if (q != null) {
            str = q.n();
        } else {
            str = null;
        }
        if (!valueOf.equals(str)) {
            com.taobao.tao.navigation.a.i0("cart", NavigationTabMsgMode.DEFAULT, valueOf);
        }
    }

    public final boolean m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("992ddb0c", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.getBooleanValue("isRepeatBuy");
    }
}
