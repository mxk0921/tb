package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.container.GalleryCore;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tua extends qql<wua> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final fos b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements GalleryCore.l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.detail.ttdetail.container.GalleryCore.l
        public void a(sx9 sx9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5be11d1", new Object[]{this, sx9Var});
                return;
            }
            if (!tua.b(tua.this)) {
                tua.this.mDetailContext.i().f("propPath", r3q.o((String) tua.this.mDetailContext.i().c("propPath"), yc4.l(sx9Var)));
            }
            tua.this.mDetailContext.i().f("galleryFrameGroupId", yc4.m(sx9Var));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements bvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.bvk
        public void a(Object obj, Object obj2) {
            List list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8705021", new Object[]{this, obj, obj2});
                return;
            }
            if (obj2 != null) {
                list = uug.a(obj2.toString().split(";"));
            } else {
                list = null;
            }
            tua tuaVar = tua.this;
            tua.c(tua.this).C(tua.d(tuaVar, list, tua.c(tuaVar).p()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements bvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.bvk
        public void a(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8705021", new Object[]{this, obj, obj2});
            } else if (obj2 != null) {
                tua.c(tua.this).D(obj2.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements bvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.bvk
        public void a(Object obj, Object obj2) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8705021", new Object[]{this, obj, obj2});
                return;
            }
            if (obj2 != null) {
                str = obj2.toString();
            } else {
                str = null;
            }
            tua.c(tua.this).K(str);
        }
    }

    static {
        t2o.a(912261421);
    }

    public tua(Context context, ze7 ze7Var, wua wuaVar, DataEntry... dataEntryArr) {
        super(context, ze7Var, wuaVar, dataEntryArr);
        fos fosVar = new fos(context, ze7Var.i().b(), ze7Var);
        this.b = fosVar;
        fosVar.E(new a());
        this.mDetailContext.i().e("propPath", new b());
        this.mDetailContext.i().e("galleryFrameGroupId", new c());
        this.mDetailContext.i().e("price_model", new d());
    }

    public static /* synthetic */ boolean b(tua tuaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7d9b85c", new Object[]{tuaVar})).booleanValue();
        }
        return tuaVar.m();
    }

    public static /* synthetic */ fos c(tua tuaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fos) ipChange.ipc$dispatch("6999c926", new Object[]{tuaVar});
        }
        return tuaVar.b;
    }

    public static /* synthetic */ String d(tua tuaVar, List list, List list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52e5f0a8", new Object[]{tuaVar, list, list2});
        }
        return tuaVar.C(list, list2);
    }

    public static /* synthetic */ Object ipc$super(tua tuaVar, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/component/module/HeaderComponent");
    }

    public void A(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee22207d", new Object[]{this, viewGroup});
        } else {
            this.b.k(viewGroup);
        }
    }

    public void B(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd03736f", new Object[]{this, viewGroup});
        } else {
            this.b.l(viewGroup);
        }
    }

    public final String C(List<String> list, List<sx9> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8edfb31a", new Object[]{this, list, list2});
        }
        if (!(list == null || list2 == null)) {
            for (String str : list) {
                for (sx9 sx9Var : list2) {
                    if (TextUtils.equals(str, yc4.l(sx9Var))) {
                        return str;
                    }
                }
            }
        }
        return null;
    }

    public int[] D() {
        View q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("be603220", new Object[]{this});
        }
        int[] iArr = new int[2];
        fos fosVar = this.b;
        if (!(fosVar == null || (q = fosVar.q()) == null)) {
            iArr[0] = q.getWidth();
            iArr[1] = q.getHeight();
        }
        return iArr;
    }

    public String E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("856294ce", new Object[]{this, new Integer(i)});
        }
        fos fosVar = this.b;
        if (fosVar != null) {
            return fosVar.o(i);
        }
        return null;
    }

    public void F(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e7ae6", new Object[]{this, new Boolean(z)});
        } else {
            this.b.u(z);
        }
    }

    public void G(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b47111", new Object[]{this, new Boolean(z)});
        } else {
            this.b.v(z);
        }
    }

    public void H(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("572812fc", new Object[]{this, new Float(f)});
        } else {
            this.b.A(f);
        }
    }

    public void I(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908bb2d1", new Object[]{this, new Float(f)});
        } else {
            this.b.B(f);
        }
    }

    public void J(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c04418", new Object[]{this, new Integer(i)});
        } else {
            this.b.H(i);
        }
    }

    @Override // tb.qql, tb.oa4
    public <C extends oa4> C findComponent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("78948b87", new Object[]{this, str}));
        }
        return (C) this.b.m(str);
    }

    @Override // tb.qql, tb.oa4
    public <C extends oa4> C findComponentByUltronName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("97436efd", new Object[]{this, str}));
        }
        return (C) this.b.n(str);
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be4ca8c6", new Object[]{this})).booleanValue();
        }
        b8z L = this.b.L();
        if (L == null || !L.f16258a) {
            return false;
        }
        return true;
    }

    @Override // tb.oa4
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.b.g();
        super.onDestroy();
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        this.b.t();
        return this.b.q();
    }
}
