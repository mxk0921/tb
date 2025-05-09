package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant.SmartLayerConstant$SmartErrorCode;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant.SmartLayerConstant$SmartLayerStage;
import com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.q6q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u6q implements ISmartLayerServiceProxy.a, ISmartLayerServiceProxy.c, ISmartLayerServiceProxy.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SmartLayerService";

    /* renamed from: a  reason: collision with root package name */
    public boolean f29183a;
    public final HashMap<String, ArrayList<j6q>> b = new HashMap<>();
    public final HashMap<String, Boolean> c = new HashMap<>();
    public ub5 d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements zqd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(j6q j6qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b257a3e1", new Object[]{this, j6qVar});
            } else {
                u6q.n(u6q.this, j6qVar);
            }
        }

        public void b(j6q j6qVar, SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage, String str, String str2) {
            l6q l6qVar;
            g6q g6qVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25408a5e", new Object[]{this, j6qVar, smartLayerConstant$SmartLayerStage, str, str2});
                return;
            }
            if (!(j6qVar == null || (l6qVar = j6qVar.f21799a) == null || (g6qVar = j6qVar.b) == null)) {
                b7q.d(g6qVar, l6qVar, smartLayerConstant$SmartLayerStage, str, str2);
                ISmartLayerServiceProxy.b bVar = j6qVar.f;
                if (bVar != null) {
                    ((q6q.a) bVar).a(smartLayerConstant$SmartLayerStage.stage, str, str2);
                }
            }
            u6q.n(u6q.this, j6qVar);
        }

        public void c(j6q j6qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a85fc78f", new Object[]{this, j6qVar});
            } else {
                u6q.m(u6q.this, j6qVar);
            }
        }
    }

    static {
        t2o.a(295699742);
        t2o.a(806355257);
        t2o.a(806355259);
        t2o.a(806355260);
    }

    public static /* synthetic */ void m(u6q u6qVar, j6q j6qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeb957b3", new Object[]{u6qVar, j6qVar});
        } else {
            u6qVar.o(j6qVar);
        }
    }

    public static /* synthetic */ void n(u6q u6qVar, j6q j6qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af4e6df4", new Object[]{u6qVar, j6qVar});
        } else {
            u6qVar.w(j6qVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy.a
    public void a(ub5 ub5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3adb84ce", new Object[]{this, ub5Var});
        } else {
            this.d = ub5Var;
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy.a
    public void b(String str, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, Activity activity, Object obj, ViewGroup viewGroup, ISmartLayerServiceProxy.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db529a4c", new Object[]{this, str, hashMap, hashMap2, activity, obj, viewGroup, bVar});
        } else {
            v(str, hashMap, hashMap2, activity, obj, viewGroup, false, bVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy.a
    public void c(String str, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, Activity activity, ViewGroup viewGroup, ISmartLayerServiceProxy.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20943134", new Object[]{this, str, hashMap, hashMap2, activity, viewGroup, bVar});
        } else {
            v(str, hashMap, hashMap2, activity, null, viewGroup, true, bVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy.d
    public void d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8de9bae", new Object[]{this, obj});
        } else {
            p(obj, false);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy.c
    public void e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4671eba5", new Object[]{this, activity});
        } else {
            q(activity, true);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy.c
    public void f(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5e6b21", new Object[]{this, activity});
        } else {
            p(activity, false);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy.d
    public void g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f3452", new Object[]{this, obj});
        } else {
            p(obj, false);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy.d
    public void h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65a53ac", new Object[]{this, obj});
        } else {
            p(obj, true);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy.a
    public void i(HashMap<String, Object> hashMap, Activity activity, Object obj) {
        ArrayList<j6q> t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11c38714", new Object[]{this, hashMap, activity, obj});
        } else if (hashMap != null && activity != null && obj != null && !this.b.isEmpty() && (t = t(b7q.c(activity), null)) != null && t.size() != 0) {
            Iterator<j6q> it = t.iterator();
            while (it.hasNext()) {
                j6q next = it.next();
                l6q l6qVar = next.f21799a;
                if (l6qVar != null && l6qVar.v) {
                    w(next);
                    next.f21799a.d(hashMap, activity, obj, false);
                    o(next);
                    n6q n6qVar = next.d;
                    if (n6qVar != null) {
                        n6qVar.q();
                    }
                }
            }
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy.d
    public void j(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b9afa1b", new Object[]{this, obj});
        } else {
            p(obj, true);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy.d
    public void k(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4972e972", new Object[]{this, obj});
        } else {
            q(obj, false);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy.c
    public void l(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1988e8b4", new Object[]{this, activity});
        } else {
            p(activity, true);
        }
    }

    public final void o(j6q j6qVar) {
        l6q l6qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed44ce6", new Object[]{this, j6qVar});
        } else if (j6qVar != null && (l6qVar = j6qVar.f21799a) != null && !TextUtils.isEmpty(l6qVar.f23140a)) {
            String str = j6qVar.f21799a.f23140a;
            ArrayList<j6q> arrayList = this.b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.b.put(str, arrayList);
            }
            arrayList.add(j6qVar);
        }
    }

    public final void p(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ced8812e", new Object[]{this, obj, new Boolean(z)});
            return;
        }
        String c = b7q.c(obj);
        if (!TextUtils.isEmpty(c)) {
            this.c.put(c, Boolean.valueOf(z));
            ArrayList<j6q> t = t(c, null);
            if (t != null) {
                Iterator<j6q> it = t.iterator();
                while (it.hasNext()) {
                    n6q n6qVar = it.next().d;
                    if (n6qVar != null) {
                        if (z) {
                            n6qVar.y();
                        } else {
                            n6qVar.k();
                        }
                    }
                }
            }
        }
    }

    public final void q(Object obj, boolean z) {
        ArrayList<j6q> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777ed422", new Object[]{this, obj, new Boolean(z)});
            return;
        }
        if (!z || !(obj instanceof Activity)) {
            arrayList = s(obj);
        } else {
            arrayList = r((Activity) obj);
        }
        if (arrayList != null) {
            Iterator<j6q> it = arrayList.iterator();
            while (it.hasNext()) {
                n6q n6qVar = it.next().d;
                if (n6qVar != null) {
                    SmartLayerConstant$SmartErrorCode smartLayerConstant$SmartErrorCode = SmartLayerConstant$SmartErrorCode.ERROR_CONTROLLER_DESTROY;
                    n6qVar.d(smartLayerConstant$SmartErrorCode.errorCode, smartLayerConstant$SmartErrorCode.errorMessage);
                }
            }
        }
    }

    public ArrayList<j6q> r(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("f12be7c4", new Object[]{this, activity});
        }
        if (activity == null || this.b.isEmpty()) {
            return null;
        }
        ArrayList<j6q> arrayList = new ArrayList<>();
        for (String str : this.b.keySet()) {
            ArrayList<j6q> arrayList2 = this.b.get(str);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                Iterator<j6q> it = arrayList2.iterator();
                while (it.hasNext()) {
                    j6q next = it.next();
                    if (next.f21799a.a() == activity) {
                        arrayList.add(next);
                    }
                }
            }
        }
        return arrayList;
    }

    public ArrayList<j6q> s(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("af341ae3", new Object[]{this, obj});
        }
        if (obj == null) {
            return null;
        }
        String c = b7q.c(obj);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        return t(c, null);
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy.a
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (nh4.J0() && !this.f29183a) {
            this.f29183a = true;
            z6q.a().b();
        }
    }

    public ArrayList<j6q> t(String str, String str2) {
        ArrayList<j6q> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e5dc930f", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str) || this.b.size() == 0 || (arrayList = this.b.get(str)) == null) {
            return null;
        }
        ArrayList<j6q> arrayList2 = new ArrayList<>();
        Iterator<j6q> it = arrayList.iterator();
        while (it.hasNext()) {
            j6q next = it.next();
            if (TextUtils.isEmpty(str2) || TextUtils.equals(next.b.d, str2)) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.size() > 0) {
            return arrayList2;
        }
        return null;
    }

    public ub5 u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ub5) ipChange.ipc$dispatch("99953258", new Object[]{this});
        }
        return this.d;
    }

    public final void w(j6q j6qVar) {
        l6q l6qVar;
        String str;
        ArrayList<j6q> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba221ba3", new Object[]{this, j6qVar});
        } else if (j6qVar != null && (l6qVar = j6qVar.f21799a) != null && !TextUtils.isEmpty(l6qVar.f23140a) && (arrayList = this.b.get((str = j6qVar.f21799a.f23140a))) != null && arrayList.contains(j6qVar)) {
            arrayList.remove(j6qVar);
            if (arrayList.size() == 0) {
                this.b.remove(str);
            }
        }
    }

    public final void x(ISmartLayerServiceProxy.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf51b8f", new Object[]{this, bVar});
        } else if (bVar != null) {
            String str = SmartLayerConstant$SmartLayerStage.SMART_TRIGGER.stage;
            String str2 = SmartLayerConstant$SmartErrorCode.ERROR_CONTAINER_SHOW_LAYER_FAIL.errorCode;
            ((q6q.a) bVar).a(str, str2, str2);
        }
    }

    public final void v(String str, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, Activity activity, Object obj, ViewGroup viewGroup, boolean z, ISmartLayerServiceProxy.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bef55a4", new Object[]{this, str, hashMap, hashMap2, activity, obj, viewGroup, new Boolean(z), bVar});
            return;
        }
        start();
        if (TextUtils.isEmpty(str)) {
            p6q.b(SmartLayerConstant$SmartLayerStage.SMART_TRIGGER, TAG, "SmartBizId为空");
            x(bVar);
        } else if (z6q.a().f32575a == null) {
            p6q.b(SmartLayerConstant$SmartLayerStage.SMART_TRIGGER, TAG, "SmartConfig4Biz为空");
            x(bVar);
        } else {
            g6q g6qVar = z6q.a().f32575a.get(str);
            if (g6qVar == null) {
                p6q.b(SmartLayerConstant$SmartLayerStage.SMART_TRIGGER, TAG, "TargetConfig为空");
                x(bVar);
                return;
            }
            l6q l6qVar = new l6q(hashMap2, activity, obj, this, z);
            try {
                g6q b = g6qVar.clone();
                b.g(hashMap);
                SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage = SmartLayerConstant$SmartLayerStage.SMART_TRIGGER;
                l6qVar.e(smartLayerConstant$SmartLayerStage);
                j6q j6qVar = null;
                b7q.e(b, l6qVar, smartLayerConstant$SmartLayerStage, smartLayerConstant$SmartLayerStage, null);
                if (!b.a(activity)) {
                    p6q.c(smartLayerConstant$SmartLayerStage, b, TAG, "不符合pop环境（横屏直播间或大屏设备），不展示");
                    x(bVar);
                    SmartLayerConstant$SmartErrorCode smartLayerConstant$SmartErrorCode = SmartLayerConstant$SmartErrorCode.ERROR_CONTROLLER_RESUME_NO_ENABLE_ENVIRONMENT;
                    b7q.d(b, l6qVar, smartLayerConstant$SmartLayerStage, smartLayerConstant$SmartErrorCode.errorCode, smartLayerConstant$SmartErrorCode.errorMessage);
                    return;
                }
                if (b.d()) {
                    j6qVar = new j6q(l6qVar, b, viewGroup);
                }
                if (j6qVar == null) {
                    p6q.c(smartLayerConstant$SmartLayerStage, b, TAG, "创建Container为空");
                    x(bVar);
                    return;
                }
                if (bVar != null) {
                    j6qVar.f = bVar;
                }
                j6qVar.c = new a();
                p6q.d(smartLayerConstant$SmartLayerStage, b, TAG, "SmartLayerContainer创建成功");
                j6qVar.e();
            } catch (Exception e) {
                e.printStackTrace();
                x(bVar);
            }
        }
    }
}
