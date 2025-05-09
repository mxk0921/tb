package tb;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.downgrade.Downgrade;
import com.taobao.downgrade.DowngradeStrategy;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import tb.hpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class klo implements jne {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, k83> f22745a;
    public static final float c;
    public static final a Companion = new a(null);
    public static final float b = o4p.L();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.klo$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static final class C0972a implements hpc.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public Object f22746a;
            public final /* synthetic */ int b;
            public final /* synthetic */ float c;
            public final /* synthetic */ int d;

            public C0972a(int i, float f, int i2) {
                this.b = i;
                this.c = f;
                this.d = i2;
            }

            @Override // tb.hpc.a
            public void c(Drawable drawable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56ebcd44", new Object[]{this, drawable});
                    return;
                }
                ckf.g(drawable, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS);
                if (drawable instanceof nx7) {
                    ((nx7) drawable).a();
                }
            }

            @Override // tb.hpc.a
            public void e() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c5e62fda", new Object[]{this});
                }
            }

            @Override // tb.hpc.a
            public void g(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e11aa67b", new Object[]{this, obj});
                    return;
                }
                ckf.g(obj, "tag");
                this.f22746a = obj;
            }

            @Override // tb.hpc.a
            public int getHeight() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
                }
                return (int) (this.d * this.c);
            }

            @Override // tb.hpc.a
            public Object getTag() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ipChange.ipc$dispatch("61e2c7a7", new Object[]{this});
                }
                Object obj = this.f22746a;
                ckf.d(obj);
                return obj;
            }

            @Override // tb.hpc.a
            public int getWidth() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
                }
                return (int) (this.b * this.c);
            }
        }

        static {
            t2o.a(815792849);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("13ea484c", new Object[]{this})).floatValue();
            }
            return klo.c();
        }

        public final void b(String str, int i, int i2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49b0bce", new Object[]{this, str, new Integer(i), new Integer(i2), new Boolean(z)});
            } else {
                c(str, i, i2, z, true);
            }
        }

        public final void c(String str, int i, int i2, boolean z, boolean z2) {
            float f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ec720c6", new Object[]{this, str, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2)});
            } else if (!TextUtils.isEmpty(str)) {
                float f2 = 1.0f;
                if (z2) {
                    f = a();
                } else {
                    f = 1.0f;
                }
                hpc e = uvh.f().e();
                if (e instanceof hie) {
                    hie hieVar = (hie) e;
                    Application application = Globals.getApplication();
                    if (z && z2) {
                        f2 = klo.b();
                    }
                    hieVar.e(application, str, new xsm(i, i2, f2, f), MUSImageQuality.AUTO);
                    return;
                }
                uvh.f().e().b(Globals.getApplication(), str, new C0972a(i, f, i2), MUSImageQuality.AUTO);
            }
        }

        public a() {
        }
    }

    public static final /* synthetic */ float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a682f4e3", new Object[0])).floatValue();
        }
        return c;
    }

    public static final /* synthetic */ float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b63cb853", new Object[0])).floatValue();
        }
        return b;
    }

    public void a(boolean z, ListStyle listStyle, List<BaseCellBean> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a83a520", new Object[]{this, new Boolean(z), listStyle, list, new Integer(i)});
            return;
        }
        ckf.g(listStyle, "style");
        if (list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!z || i2 < 6) {
                    BaseCellBean baseCellBean = list.get(i2);
                    String str = baseCellBean.type;
                    ckf.f(str, "type");
                    k83 k83Var = f22745a.get(str);
                    if (k83Var != null) {
                        if (!hashSet.contains(k83Var)) {
                            k83Var.b(i);
                            hashSet.add(k83Var);
                        }
                        k83Var.a(baseCellBean, listStyle, i);
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        t2o.a(815792848);
        t2o.a(815793403);
        String str = null;
        HashMap<String, k83> hashMap = new HashMap<>();
        f22745a = hashMap;
        inh inhVar = new inh();
        c = 1.0f;
        hashMap.put(a83.CARD_M3, inhVar);
        hashMap.put(a83.ELDER_M3, inhVar);
        hashMap.put(a83.CARD_I18_M1, inhVar);
        hashMap.put(a83.CARD_I18_LOCAL_M1, inhVar);
        hashMap.put(new mnh().c(), new pkj());
        hashMap.put(a83.CARD_HONG_BAO, new rpa());
        hashMap.put(a83.CARD_BABA_FARM, new ul1());
        hashMap.put(a83.CARD_TAO_FACTORY, new j2s());
        hashMap.put(a83.CARD_TJB, new l2s());
        hashMap.put(a83.CARD_TMGJ, new u7s());
        DowngradeStrategy downgradeStrategy = Downgrade.getInstance().getDowngradeStrategy("search");
        if (downgradeStrategy != null) {
            str = downgradeStrategy.getTacticsPerformance();
        }
        if (ckf.b(str, "degrade")) {
            c = 1 / o4p.z();
        }
    }
}
