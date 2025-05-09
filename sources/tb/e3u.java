package tb;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.service.lifecycle.EngineState;
import com.taobao.android.turbo.model.PageModel;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.android.turbo.model.UserModel;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.at4;
import tb.r6o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class e3u extends xv1<PageModel, FrameLayout> implements o2c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public in1 c;
    public szm d;
    public z0p e;
    public fr3 f;
    public c4n g;
    public fip h;
    public final List<qr1<?, ?>> i = new ArrayList();
    public ops j;
    public mr3 k;
    public c3u l;
    public d1p m;
    public m4n n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public FrameLayout t;
    public final l3u u;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455698);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455697);
        t2o.a(919601295);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3u(qpu qpuVar, l3u l3uVar) {
        super(qpuVar);
        ckf.g(qpuVar, "turboEngineContext");
        ckf.g(l3uVar, "topBarRegistry");
        this.u = l3uVar;
        at4.a aVar = at4.Companion;
        int c = at4.a.c(aVar, getContext(), 88, false, 4, null);
        this.o = c;
        r6o.a aVar2 = r6o.Companion;
        this.p = (aVar2.g(getContext()) + aVar2.a(getContext())) - c;
        this.q = at4.a.c(aVar, getContext(), 56, false, 4, null);
        this.r = at4.a.c(aVar, getContext(), 56, false, 4, null);
        this.s = at4.a.c(aVar, getContext(), 12, false, 4, null);
    }

    public static /* synthetic */ Object ipc$super(e3u e3uVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1502133455:
                super.onStart((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -560092455:
                super.onDestroy((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -258772824:
                super.onResume((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -128189347:
                super.onCreate(objArr[0], (IComponentLifecycle$TriggerType) objArr[1]);
                return null;
            case 316403507:
                super.onStop((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case 1484435997:
                super.onPause((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/topbar/component/TopBarComponent");
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a431c2", new Object[]{this});
            return;
        }
        fip fipVar = this.h;
        if (fipVar != null) {
            fipVar.b();
        } else {
            ckf.y("shareButtonComponent");
            throw null;
        }
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd697d2", new Object[]{this, str});
            return;
        }
        ckf.g(str, "iconUrl");
        fip fipVar = this.h;
        if (fipVar != null) {
            fipVar.c(str);
        } else {
            ckf.y("shareButtonComponent");
            throw null;
        }
    }

    public final View l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c74bee21", new Object[]{this});
        }
        mr3 mr3Var = this.k;
        if (mr3Var != null) {
            FrameLayout frameLayout = (FrameLayout) mr3Var.createView();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, GravityCompat.END);
            layoutParams.topMargin = this.o + this.p;
            layoutParams.setMarginEnd(at4.a.c(at4.Companion, getContext(), 6, false, 4, null));
            frameLayout.setLayoutParams(layoutParams);
            return frameLayout;
        }
        ckf.y("childTipBarComponent");
        throw null;
    }

    public final LinearLayout.LayoutParams n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout.LayoutParams) ipChange.ipc$dispatch("92e31045", new Object[]{this});
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.q, this.r);
        layoutParams.setMarginEnd(at4.a.c(at4.Companion, getContext(), Integer.valueOf(this.s), false, 4, null));
        return layoutParams;
    }

    public final LinearLayout.LayoutParams o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout.LayoutParams) ipChange.ipc$dispatch("39ac573c", new Object[]{this});
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.q, this.r);
        layoutParams.setMarginStart(at4.a.c(at4.Companion, getContext(), Integer.valueOf(this.s), false, 4, null));
        return layoutParams;
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onDestroy(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9daad9", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onDestroy(iComponentLifecycle$TriggerType);
        Iterator<T> it = this.i.iterator();
        while (it.hasNext()) {
            ((qr1) it.next()).onDestroy(iComponentLifecycle$TriggerType);
        }
        ((ArrayList) this.i).clear();
        ops opsVar = this.j;
        if (opsVar != null) {
            opsVar.onDestroy(iComponentLifecycle$TriggerType);
            mr3 mr3Var = this.k;
            if (mr3Var != null) {
                mr3Var.onDestroy(iComponentLifecycle$TriggerType);
            } else {
                ckf.y("childTipBarComponent");
                throw null;
            }
        } else {
            ckf.y("tabBarComponent");
            throw null;
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onPause(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587ab21d", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onPause(iComponentLifecycle$TriggerType);
        Iterator<T> it = this.i.iterator();
        while (it.hasNext()) {
            ((qr1) it.next()).onPause(iComponentLifecycle$TriggerType);
        }
        ops opsVar = this.j;
        if (opsVar != null) {
            opsVar.onPause(iComponentLifecycle$TriggerType);
            mr3 mr3Var = this.k;
            if (mr3Var != null) {
                mr3Var.onPause(iComponentLifecycle$TriggerType);
            } else {
                ckf.y("childTipBarComponent");
                throw null;
            }
        } else {
            ckf.y("tabBarComponent");
            throw null;
        }
    }

    @Override // tb.o2c
    public void onReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1a118b", new Object[]{this});
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onResume(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09370a8", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onResume(iComponentLifecycle$TriggerType);
        Iterator<T> it = this.i.iterator();
        while (it.hasNext()) {
            ((qr1) it.next()).onResume(iComponentLifecycle$TriggerType);
        }
        ops opsVar = this.j;
        if (opsVar != null) {
            opsVar.onResume(iComponentLifecycle$TriggerType);
            mr3 mr3Var = this.k;
            if (mr3Var != null) {
                mr3Var.onResume(iComponentLifecycle$TriggerType);
            } else {
                ckf.y("childTipBarComponent");
                throw null;
            }
        } else {
            ckf.y("tabBarComponent");
            throw null;
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onStart(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6774331", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onStart(iComponentLifecycle$TriggerType);
        Iterator<T> it = this.i.iterator();
        while (it.hasNext()) {
            ((qr1) it.next()).onStart(iComponentLifecycle$TriggerType);
        }
        ops opsVar = this.j;
        if (opsVar != null) {
            opsVar.onStart(iComponentLifecycle$TriggerType);
            mr3 mr3Var = this.k;
            if (mr3Var != null) {
                mr3Var.onStart(iComponentLifecycle$TriggerType);
            } else {
                ckf.y("childTipBarComponent");
                throw null;
            }
        } else {
            ckf.y("tabBarComponent");
            throw null;
        }
    }

    @Override // tb.o2c
    public void onStateChanged(EngineState engineState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66a0b34", new Object[]{this, engineState});
        } else {
            ckf.g(engineState, "state");
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onStop(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12dbef33", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onStop(iComponentLifecycle$TriggerType);
        Iterator<T> it = this.i.iterator();
        while (it.hasNext()) {
            ((qr1) it.next()).onStop(iComponentLifecycle$TriggerType);
        }
        ops opsVar = this.j;
        if (opsVar != null) {
            opsVar.onStop(iComponentLifecycle$TriggerType);
            mr3 mr3Var = this.k;
            if (mr3Var != null) {
                mr3Var.onStop(iComponentLifecycle$TriggerType);
            } else {
                ckf.y("childTipBarComponent");
                throw null;
            }
        } else {
            ckf.y("tabBarComponent");
            throw null;
        }
    }

    public final int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("765615ae", new Object[]{this})).intValue();
        }
        return this.o;
    }

    public final int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f287b0", new Object[]{this})).intValue();
        }
        return this.p;
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddb73ce6", new Object[]{this})).booleanValue();
        }
        in1 in1Var = this.c;
        if (in1Var != null) {
            return in1Var.hide();
        }
        ckf.y("backButtonComponent");
        throw null;
    }

    public final boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5182c40a", new Object[]{this})).booleanValue();
        }
        m4n m4nVar = this.n;
        if (m4nVar != null) {
            return m4nVar.a();
        }
        ckf.y("publishShareShowHideHelper");
        throw null;
    }

    /* renamed from: t */
    public void onCreate(PageModel pageModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b551a", new Object[]{this, pageModel, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onCreate(pageModel, iComponentLifecycle$TriggerType);
        in1 in1Var = new in1(k());
        this.c = in1Var;
        in1Var.onCreate(null, iComponentLifecycle$TriggerType);
        List<qr1<?, ?>> list = this.i;
        in1 in1Var2 = this.c;
        if (in1Var2 != null) {
            ((ArrayList) list).add(in1Var2);
            szm szmVar = new szm(k());
            this.d = szmVar;
            szmVar.onCreate(null, iComponentLifecycle$TriggerType);
            List<qr1<?, ?>> list2 = this.i;
            szm szmVar2 = this.d;
            if (szmVar2 != null) {
                ((ArrayList) list2).add(szmVar2);
                z0p z0pVar = new z0p(k());
                this.e = z0pVar;
                z0pVar.onCreate(null, iComponentLifecycle$TriggerType);
                List<qr1<?, ?>> list3 = this.i;
                z0p z0pVar2 = this.e;
                if (z0pVar2 != null) {
                    ((ArrayList) list3).add(z0pVar2);
                    fr3 fr3Var = new fr3(k());
                    this.f = fr3Var;
                    fr3Var.onCreate(null, iComponentLifecycle$TriggerType);
                    List<qr1<?, ?>> list4 = this.i;
                    fr3 fr3Var2 = this.f;
                    if (fr3Var2 != null) {
                        ((ArrayList) list4).add(fr3Var2);
                        c4n c4nVar = new c4n(k());
                        this.g = c4nVar;
                        c4nVar.onCreate(null, iComponentLifecycle$TriggerType);
                        List<qr1<?, ?>> list5 = this.i;
                        c4n c4nVar2 = this.g;
                        if (c4nVar2 != null) {
                            ((ArrayList) list5).add(c4nVar2);
                            fip fipVar = new fip(k());
                            this.h = fipVar;
                            fipVar.onCreate(null, iComponentLifecycle$TriggerType);
                            List<qr1<?, ?>> list6 = this.i;
                            fip fipVar2 = this.h;
                            if (fipVar2 != null) {
                                ((ArrayList) list6).add(fipVar2);
                                ops opsVar = new ops(k(), this.u);
                                this.j = opsVar;
                                opsVar.onCreate(null, iComponentLifecycle$TriggerType);
                                mr3 mr3Var = new mr3(k());
                                this.k = mr3Var;
                                mr3Var.onCreate(null, iComponentLifecycle$TriggerType);
                                List<qr1<?, ?>> list7 = this.i;
                                ops opsVar2 = this.j;
                                if (opsVar2 != null) {
                                    this.l = new c3u(list7, opsVar2);
                                    wwc Y = ((xwc) k().getService(xwc.class)).Y();
                                    c3u c3uVar = this.l;
                                    if (c3uVar != null) {
                                        Y.x(c3uVar);
                                        qpu k = k();
                                        z0p z0pVar3 = this.e;
                                        if (z0pVar3 != null) {
                                            fr3 fr3Var3 = this.f;
                                            if (fr3Var3 != null) {
                                                mr3 mr3Var2 = this.k;
                                                if (mr3Var2 != null) {
                                                    d1p d1pVar = new d1p(k, z0pVar3, fr3Var3, mr3Var2);
                                                    this.m = d1pVar;
                                                    fr3 fr3Var4 = this.f;
                                                    if (fr3Var4 != null) {
                                                        fr3Var4.o(d1pVar);
                                                        t2c t2cVar = (t2c) k().getService(t2c.class);
                                                        d1p d1pVar2 = this.m;
                                                        if (d1pVar2 != null) {
                                                            t2cVar.x(d1pVar2);
                                                            qpu k2 = k();
                                                            c4n c4nVar3 = this.g;
                                                            if (c4nVar3 != null) {
                                                                fip fipVar3 = this.h;
                                                                if (fipVar3 != null) {
                                                                    m4n m4nVar = new m4n(k2, c4nVar3, fipVar3);
                                                                    this.n = m4nVar;
                                                                    Y.u(m4nVar);
                                                                    ((q2c) k().getService(q2c.class)).r(this);
                                                                    return;
                                                                }
                                                                ckf.y("shareButtonComponent");
                                                                throw null;
                                                            }
                                                            ckf.y("publishButtonComponent");
                                                            throw null;
                                                        }
                                                        ckf.y("searchChildShowHideHelper");
                                                        throw null;
                                                    }
                                                    ckf.y("childButtonComponent");
                                                    throw null;
                                                }
                                                ckf.y("childTipBarComponent");
                                                throw null;
                                            }
                                            ckf.y("childButtonComponent");
                                            throw null;
                                        }
                                        ckf.y("searchButtonComponent");
                                        throw null;
                                    }
                                    ckf.y("topBarColorUpdater");
                                    throw null;
                                }
                                ckf.y("tabBarComponent");
                                throw null;
                            }
                            ckf.y("shareButtonComponent");
                            throw null;
                        }
                        ckf.y("publishButtonComponent");
                        throw null;
                    }
                    ckf.y("childButtonComponent");
                    throw null;
                }
                ckf.y("searchButtonComponent");
                throw null;
            }
            ckf.y("profileButtonComponent");
            throw null;
        }
        ckf.y("backButtonComponent");
        throw null;
    }

    public final boolean u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("481f48f3", new Object[]{this, new Integer(i)})).booleanValue();
        }
        ops opsVar = this.j;
        if (opsVar != null) {
            return opsVar.s(i);
        }
        ckf.y("tabBarComponent");
        throw null;
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2041761", new Object[]{this})).booleanValue();
        }
        in1 in1Var = this.c;
        if (in1Var != null) {
            return in1Var.show();
        }
        ckf.y("backButtonComponent");
        throw null;
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d0793af", new Object[]{this})).booleanValue();
        }
        m4n m4nVar = this.n;
        if (m4nVar != null) {
            return m4nVar.e();
        }
        ckf.y("publishShareShowHideHelper");
        throw null;
    }

    /* renamed from: x */
    public void updateDataImpl(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d033d9", new Object[]{this, pageModel});
            return;
        }
        ckf.g(pageModel, "data");
        UserModel user = pageModel.getUser();
        if (user != null) {
            szm szmVar = this.d;
            if (szmVar != null) {
                szmVar.updateData(user);
            } else {
                ckf.y("profileButtonComponent");
                throw null;
            }
        }
        List<TabModel> tabs = pageModel.getTabs();
        if (tabs != null) {
            ops opsVar = this.j;
            if (opsVar != null) {
                opsVar.updateData(tabs);
            } else {
                ckf.y("tabBarComponent");
                throw null;
            }
        }
        m4n m4nVar = this.n;
        if (m4nVar != null) {
            m4nVar.c(pageModel);
        } else {
            ckf.y("publishShareShowHideHelper");
            throw null;
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public FrameLayout createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b62bb851", new Object[]{this});
        }
        this.t = new FrameLayout(getContext());
        LinearLayout m = m();
        FrameLayout frameLayout = this.t;
        if (frameLayout != null) {
            frameLayout.addView(m);
            View l = l();
            FrameLayout frameLayout2 = this.t;
            if (frameLayout2 != null) {
                frameLayout2.addView(l);
                d1p d1pVar = this.m;
                if (d1pVar != null) {
                    d1pVar.b();
                    FrameLayout frameLayout3 = this.t;
                    if (frameLayout3 != null) {
                        return frameLayout3;
                    }
                    ckf.y("rootView");
                    throw null;
                }
                ckf.y("searchChildShowHideHelper");
                throw null;
            }
            ckf.y("rootView");
            throw null;
        }
        ckf.y("rootView");
        throw null;
    }

    public final LinearLayout m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("809fcaa5", new Object[]{this});
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.o);
        layoutParams.topMargin = this.p;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        at4.a aVar = at4.Companion;
        linearLayout.setPadding(at4.a.c(aVar, getContext(), 20, false, 4, null), 0, at4.a.c(aVar, getContext(), 20, false, 4, null), 0);
        linearLayout.setClipChildren(false);
        in1 in1Var = this.c;
        if (in1Var != null) {
            ImageView imageView = (ImageView) in1Var.createView();
            imageView.setLayoutParams(n());
            linearLayout.addView(imageView);
            szm szmVar = this.d;
            if (szmVar != null) {
                FrameLayout frameLayout = (FrameLayout) szmVar.createView();
                frameLayout.setLayoutParams(n());
                linearLayout.addView(frameLayout);
                ops opsVar = this.j;
                if (opsVar != null) {
                    FrameLayout frameLayout2 = (FrameLayout) opsVar.createView();
                    frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
                    linearLayout.addView(frameLayout2);
                    z0p z0pVar = this.e;
                    if (z0pVar != null) {
                        ImageView imageView2 = (ImageView) z0pVar.createView();
                        imageView2.setLayoutParams(o());
                        linearLayout.addView(imageView2);
                        fr3 fr3Var = this.f;
                        if (fr3Var != null) {
                            ImageView imageView3 = (ImageView) fr3Var.createView();
                            imageView3.setLayoutParams(o());
                            linearLayout.addView(imageView3);
                            c4n c4nVar = this.g;
                            if (c4nVar != null) {
                                FrameLayout frameLayout3 = (FrameLayout) c4nVar.createView();
                                frameLayout3.setLayoutParams(o());
                                linearLayout.addView(frameLayout3);
                                fip fipVar = this.h;
                                if (fipVar != null) {
                                    TUrlImageView tUrlImageView = (TUrlImageView) fipVar.createView();
                                    tUrlImageView.setLayoutParams(o());
                                    linearLayout.addView(tUrlImageView);
                                    return linearLayout;
                                }
                                ckf.y("shareButtonComponent");
                                throw null;
                            }
                            ckf.y("publishButtonComponent");
                            throw null;
                        }
                        ckf.y("childButtonComponent");
                        throw null;
                    }
                    ckf.y("searchButtonComponent");
                    throw null;
                }
                ckf.y("tabBarComponent");
                throw null;
            }
            ckf.y("profileButtonComponent");
            throw null;
        }
        ckf.y("backButtonComponent");
        throw null;
    }
}
