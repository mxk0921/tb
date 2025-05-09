package tb;

import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x7w extends v4w {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final LruCache<String, vx1> g = new a(3);
    public String h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends LruCache<String, vx1> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(int i) {
            super(i);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/containerframe/frames/VideoGoodsListFrame$1");
        }

        /* renamed from: a */
        public void entryRemoved(boolean z, String str, vx1 vx1Var, vx1 vx1Var2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2fa8af2f", new Object[]{this, new Boolean(z), str, vx1Var, vx1Var2});
                return;
            }
            IMessageService iMessageService = (IMessageService) x7w.this.f31608a.getService(IMessageService.class);
            if (iMessageService != null) {
                iMessageService.unRegisterMessageHandler(vx1Var);
            }
        }

        /* renamed from: b */
        public int sizeOf(String str, vx1 vx1Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bfc47cbf", new Object[]{this, str, vx1Var})).intValue();
            }
            return 1;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                x7w.this.k();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IMessageService f31199a;
        public final /* synthetic */ vx1 b;

        public c(IMessageService iMessageService, vx1 vx1Var) {
            this.f31199a = iMessageService;
            this.b = vx1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f31199a.registerMessageHandler(this.b);
            }
        }
    }

    static {
        t2o.a(468713492);
    }

    public x7w(FluidContext fluidContext) {
        super(fluidContext);
    }

    public static /* synthetic */ Object ipc$super(x7w x7wVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1775111991) {
            super.a();
            return null;
        } else if (hashCode == -674814284) {
            super.j((a.d) objArr[0]);
            return null;
        } else if (hashCode == -340027132) {
            super.d();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/business/containerframe/frames/VideoGoodsListFrame");
        }
    }

    @Override // tb.xu1
    public void a() {
        enc lockListListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        super.a();
        if (pto.o(this.f31608a) && (lockListListener = ((ISceneConfigService) this.f31608a.getService(ISceneConfigService.class)).getLockListListener()) != null) {
            lockListListener.a(false);
        }
    }

    @Override // tb.xu1
    public void d() {
        enc lockListListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.d();
        if (pto.o(this.f31608a) && (lockListListener = ((ISceneConfigService) this.f31608a.getService(ISceneConfigService.class)).getLockListListener()) != null) {
            lockListListener.a(true);
        }
    }

    @Override // tb.v4w
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bac8720d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.v4w
    public void j(a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7c726b4", new Object[]{this, dVar});
        } else if (dVar != null) {
            a.d dVar2 = this.d;
            if (dVar2 == null || !dVar2.f().equals(dVar.f())) {
                String m = m();
                vx1 vx1Var = this.g.get(m);
                IMessageService iMessageService = (IMessageService) this.f31608a.getService(IMessageService.class);
                if (vx1Var == null) {
                    if (!TextUtils.isEmpty(this.h)) {
                        vx1Var = new lga(this.f31608a, (ViewGroup) this.c, this.h);
                    }
                    this.g.put(m, vx1Var);
                    nwv.y0(new c(iMessageService, vx1Var));
                }
                vx1Var.r(dVar.c);
                iMessageService.sendMessage(new vrp("VSMSG_updateGoodsListData", dVar.c, dVar.h(this.f31608a)));
                super.j(dVar);
            }
        }
    }

    public final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.h)) {
            return "WeexUrl";
        }
        return this.h;
    }

    public void n(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
            return;
        }
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.fluid_sdk_ly_common_weex);
            this.c = viewStub.inflate();
        }
        ViewProxy.setOnClickListener(this.c, new b());
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }
}
