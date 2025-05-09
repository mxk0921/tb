package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.favorite.export.FavoriteFacade;
import com.taobao.nanocompose.megability.ability.DeviceType;
import com.taobao.nanocompose.megability.ability.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class d39 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f17546a = "favorite_pop_fatigue";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements wio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ woh b;
        public final /* synthetic */ l5c c;

        public a(woh wohVar, l5c l5cVar) {
            this.b = wohVar;
            this.c = l5cVar;
        }

        @Override // tb.wio
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ((FavoriteFacade.d) this.c).a(d39.a(d39.this, this.b));
            } catch (Exception e) {
                l4s l4sVar = l4s.INSTANCE;
                l4sVar.c(null, "Error checking popup conditions: " + e.getMessage() + " biz=" + this.b.a());
                ((FavoriteFacade.d) this.c).a(false);
            }
        }
    }

    static {
        t2o.a(1007681538);
        t2o.a(1007681568);
    }

    public static final /* synthetic */ boolean a(d39 d39Var, woh wohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("986aab79", new Object[]{d39Var, wohVar})).booleanValue();
        }
        return d39Var.b(wohVar);
    }

    public final boolean b(woh wohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23af3fca", new Object[]{this, wohVar})).booleanValue();
        }
        if (!wohVar.b()) {
            l4s l4sVar = l4s.INSTANCE;
            l4sVar.e("Not showing popup - not a new favorite biz=" + wohVar.a());
            return false;
        } else if (com.taobao.nanocompose.megability.ability.a.Companion.b() != DeviceType.PHONE) {
            l4s l4sVar2 = l4s.INSTANCE;
            l4sVar2.e("Not showing popup - not a phone device biz=" + wohVar.a());
            return false;
        } else if (ckf.b(c.INSTANCE.a(), Boolean.FALSE)) {
            l4s l4sVar3 = l4s.INSTANCE;
            l4sVar3.e("Not showing popup - not Chinese version biz=" + wohVar.a());
            return false;
        } else {
            i29 i29Var = i29.INSTANCE;
            String b = srv.b();
            if (b == null) {
                b = "";
            }
            if (!i29Var.a(b)) {
                return false;
            }
            if (faj.b(this.f17546a, 0) >= 1) {
                l4s l4sVar4 = l4s.INSTANCE;
                l4sVar4.e("Not showing popup - disk fatigue >= 1 biz=" + wohVar.a());
                return false;
            }
            faj.d(this.f17546a, 1);
            return true;
        }
    }

    public void c(woh wohVar, l5c l5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7404780a", new Object[]{this, wohVar, l5cVar});
            return;
        }
        ckf.g(wohVar, "param");
        ckf.g(l5cVar, "callback");
        lrt.b(zqt.INSTANCE.e(), new a(wohVar, l5cVar));
    }
}
