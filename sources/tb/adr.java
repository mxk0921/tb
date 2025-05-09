package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.tao.tbmainfragment.TBMainFragment;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class adr implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946383);
        t2o.a(578814049);
    }

    public final boolean a(FragmentManager fragmentManager, Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe180d13", new Object[]{this, fragmentManager, intent})).booleanValue();
        }
        ISupportFragment h = qxq.h(fragmentManager);
        if (!(h instanceof TBMainFragment)) {
            return true;
        }
        Fragment currentFragment = ((TBMainFragment) h).getCurrentFragment();
        if (currentFragment == null || !"com.taobao.tao.homepage.HomepageFragment".equals(currentFragment.getClass().getName()) || (data = intent.getData()) == null) {
            return false;
        }
        return hnv.b(data.toString());
    }

    public final Bundle b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("2776af8b", new Object[]{this, intent});
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        Object obj = extras.get(qxq.KEY_FRAGMENT_ARGS);
        if (obj instanceof Bundle) {
            return (Bundle) obj;
        }
        return null;
    }

    public final Bundle c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("32e674f0", new Object[]{this, intent});
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        Object obj = extras.get(qxq.KEY_FRAGMENT_BUNDLE);
        if (obj instanceof Bundle) {
            return (Bundle) obj;
        }
        return null;
    }

    public final String d(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6b7e60b", new Object[]{this, intent});
        }
        Bundle c = c(intent);
        if (c == null) {
            return null;
        }
        Object obj = c.get(qxq.KEY_FRAGMENT_NAME);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "TBFragmentHookProcessor";
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final boolean e(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0d474f", new Object[]{this, intent})).booleanValue();
        }
        Bundle c = c(intent);
        if (c == null) {
            return false;
        }
        Object obj = c.get(qxq.KEY_FRAGMENT_JUMP);
        if (obj instanceof String) {
            return "true".equals(obj);
        }
        return false;
    }

    public final boolean f(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eccba701", new Object[]{this, intent, context})).booleanValue();
        }
        Bundle c = c(intent);
        if (c == null) {
            return false;
        }
        Object obj = c.get(qxq.SUB_KEY_FRAGMENT_JUMP);
        if (!(obj instanceof String)) {
            return false;
        }
        if (!nx9.r(context) || !qxq.KEY_NEW_DETAIL_IMMERSIVE.equals(obj)) {
            return nx9.n(context, (String) obj);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        if ((r4 instanceof com.taobao.tao.tbmainfragment.SupportActivity) == false) goto L_0x0063;
     */
    @Override // tb.xnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean process(android.content.Intent r13, tb.zmj r14) {
        /*
            r12 = this;
            r0 = 2
            r1 = 1
            r2 = 3
            com.android.alibaba.ip.runtime.IpChange r3 = tb.adr.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001f
            java.lang.String r4 = "b3ebca67"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r5 = 0
            r2[r5] = r12
            r2[r1] = r13
            r2[r0] = r14
            java.lang.Object r13 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L_0x001f:
            boolean r3 = r12.e(r13)
            if (r3 != 0) goto L_0x0026
            return r1
        L_0x0026:
            android.content.Context r3 = r14.d()
            boolean r3 = tb.nx9.q(r3)
            if (r3 != 0) goto L_0x003b
            android.content.Context r3 = r14.d()
            boolean r3 = tb.nx9.r(r3)
            if (r3 != 0) goto L_0x003b
            return r1
        L_0x003b:
            android.content.Context r3 = r14.d()
            boolean r3 = r12.f(r13, r3)
            if (r3 != 0) goto L_0x0046
            return r1
        L_0x0046:
            java.lang.String r3 = r12.d(r13)
            if (r3 != 0) goto L_0x004d
            return r1
        L_0x004d:
            android.content.Context r4 = r14.d()
            boolean r5 = r4 instanceof com.taobao.tao.tbmainfragment.SupportActivity
            if (r5 != 0) goto L_0x0064
            boolean r5 = r4 instanceof tb.bew
            if (r5 == 0) goto L_0x0063
            tb.bew r4 = (tb.bew) r4
            android.content.Context r4 = r4.b()
            boolean r5 = r4 instanceof com.taobao.tao.tbmainfragment.SupportActivity
            if (r5 != 0) goto L_0x0064
        L_0x0063:
            return r1
        L_0x0064:
            r5 = r4
            com.taobao.tao.tbmainfragment.SupportActivity r5 = (com.taobao.tao.tbmainfragment.SupportActivity) r5
            androidx.fragment.app.FragmentManager r6 = r5.getSupportFragmentManager()
            int r7 = tb.qxq.f(r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "fragment count is "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "TBFragmentHookProcessor"
            com.taobao.tao.util.TBMainLog.tlog(r9, r8)
            boolean r4 = tb.nx9.x(r4)
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.String r8 = "tbMainFragment"
            if (r4 == 0) goto L_0x0097
            if (r7 < r2) goto L_0x009a
            java.lang.String r13 = "threeFloorsCount"
            com.alibaba.mtl.appmonitor.AppMonitor.Counter.commit(r8, r13, r10)
            return r1
        L_0x0097:
            if (r7 < r0) goto L_0x009a
            return r1
        L_0x009a:
            boolean r0 = r12.a(r6, r13)
            if (r0 != 0) goto L_0x00a1
            return r1
        L_0x00a1:
            android.os.Bundle r0 = r12.b(r13)
            boolean r13 = tb.hx9.b(r5, r13, r3, r0)
            if (r13 == 0) goto L_0x00b7
            java.lang.String r13 = "jumpToFragment"
            com.alibaba.mtl.appmonitor.AppMonitor.Counter.commit(r8, r13, r10)
            r14.B(r1, r9)
            r14.A(r1, r9)
        L_0x00b7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.adr.process(android.content.Intent, tb.zmj):boolean");
    }
}
