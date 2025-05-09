package com.taobao.android.icart.broadcast.cartRefresh;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.tao.tbmainfragment.SupportFragment;
import com.taobao.tao.tbmainfragment.TBFragmentLifecycleCallbacks;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.c9x;
import tb.cb4;
import tb.fsb;
import tb.gsb;
import tb.hav;
import tb.hd3;
import tb.hu;
import tb.kmb;
import tb.lcu;
import tb.t2o;
import tb.u55;
import tb.ux;
import tb.vav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ModalOrderRefreshProcessor extends hu<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class MyTBFragmentLifecycleCallbacks extends TBFragmentLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<kmb> f7948a;
        public final String b;
        public final Handler c = new Handler(Looper.getMainLooper());

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    MyTBFragmentLifecycleCallbacks.a(MyTBFragmentLifecycleCallbacks.this);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b extends ux {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ List f7950a;
            public final /* synthetic */ kmb b;

            public b(MyTBFragmentLifecycleCallbacks myTBFragmentLifecycleCallbacks, List list, kmb kmbVar) {
                this.f7950a = list;
                this.b = kmbVar;
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/broadcast/cartRefresh/ModalOrderRefreshProcessor$MyTBFragmentLifecycleCallbacks$2");
            }

            @Override // tb.ojd
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                }
            }

            @Override // tb.ojd
            public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                    return;
                }
                for (String str : this.f7950a) {
                    this.b.d().Q(fsbVar.getComponentByName(str));
                }
                this.b.V().g();
            }
        }

        static {
            t2o.a(478150679);
        }

        public MyTBFragmentLifecycleCallbacks(kmb kmbVar, String str) {
            this.f7948a = new WeakReference<>(kmbVar);
            this.b = str;
        }

        public static /* synthetic */ void a(MyTBFragmentLifecycleCallbacks myTBFragmentLifecycleCallbacks) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3e0b567", new Object[]{myTBFragmentLifecycleCallbacks});
            } else {
                myTBFragmentLifecycleCallbacks.c();
            }
        }

        public static /* synthetic */ Object ipc$super(MyTBFragmentLifecycleCallbacks myTBFragmentLifecycleCallbacks, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/broadcast/cartRefresh/ModalOrderRefreshProcessor$MyTBFragmentLifecycleCallbacks");
        }

        public final List<String> b(String str, kmb kmbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("424853c9", new Object[]{this, str, kmbVar});
            }
            ArrayList arrayList = new ArrayList();
            List asList = Arrays.asList(str.split(","));
            List<IDMComponent> n = ((u55) kmbVar.j()).n();
            if (n == null) {
                return arrayList;
            }
            for (IDMComponent iDMComponent : n) {
                if (asList.contains(cb4.r(iDMComponent))) {
                    arrayList.add(iDMComponent.getKey());
                    if (asList.size() == 1) {
                        break;
                    }
                }
            }
            return arrayList;
        }

        public final void c() {
            IDMComponent u;
            Map<String, List<gsb>> eventMap;
            List<gsb> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1111252a", new Object[]{this});
                return;
            }
            kmb kmbVar = this.f7948a.get();
            if (!(kmbVar == null || kmbVar.getContext().isFinishing() || this.b == null || (u = kmbVar.d().u("submit")) == null || (eventMap = u.getEventMap()) == null || (list = eventMap.get("deleteAfterModalBuy")) == null)) {
                for (gsb gsbVar : list) {
                    if (gsbVar != null && "deleteAfterModalBuy".equals(gsbVar.getType())) {
                        List<String> b2 = b(this.b, kmbVar);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.addAll(b2);
                        u.getFields().put("operateItems", (Object) jSONArray);
                        lcu d = kmbVar.g().d();
                        d.l(gsbVar.getType());
                        d.i(u);
                        d.q("deleteAfterModalBuy");
                        d.m("operateItems", b2);
                        d.k(gsbVar);
                        kmbVar.k0(u, d, true, new b(this, b2, kmbVar), null);
                        hav.d(c9x.CART_BIZ_NAME, "触发极简下单删除，cartIds=" + this.b);
                        return;
                    }
                }
            }
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("953163f4", new Object[]{this, fragmentManager, fragment});
                return;
            }
            SupportFragment.unRegisterTBLifecycleCallbacks(this);
            long e = vav.e(c9x.CART_BIZ_NAME, "modalBuyUpdateDelayTime", 0);
            if (e > 0) {
                this.c.postDelayed(new a(), e);
            } else {
                c();
            }
        }
    }

    static {
        t2o.a(478150678);
    }

    public ModalOrderRefreshProcessor(kmb kmbVar) {
        super(kmbVar);
    }

    public static /* synthetic */ Object ipc$super(ModalOrderRefreshProcessor modalOrderRefreshProcessor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/broadcast/cartRefresh/ModalOrderRefreshProcessor");
    }

    /* renamed from: b */
    public boolean a(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b26344da", new Object[]{this, intent})).booleanValue();
        }
        String str2 = hd3.e;
        if (intent.hasExtra(str2)) {
            str = intent.getStringExtra(str2);
        } else if (intent.hasExtra("from")) {
            str = intent.getStringExtra("from");
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) || !TextUtils.equals(hd3.g, str)) {
            return false;
        }
        String stringExtra = intent.getStringExtra("cartIds");
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        SupportFragment.registerTBLifecycleCallbacks(new MyTBFragmentLifecycleCallbacks(this.f20898a, stringExtra));
        return true;
    }
}
