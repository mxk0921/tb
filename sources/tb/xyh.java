package tb;

import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.service.page.IPageBackLifecycle;
import com.taobao.android.turbo.model.PageModel;
import com.taobao.android.turbo.view.InterceptedMaskLayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class xyh extends xv1<PageModel, FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public k1e c;
    public xwc d;
    public InterceptedMaskLayer e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                ((c1c) xyh.l(xyh.this).getService(c1c.class)).D1();
            }
        }
    }

    static {
        t2o.a(916455533);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyh(qpu qpuVar) {
        super(qpuVar);
        ckf.g(qpuVar, "turboEngineContext");
    }

    public static /* synthetic */ Object ipc$super(xyh xyhVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1502133455:
                super.onStart((IComponentLifecycle$TriggerType) objArr[0]);
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/drawer/component/MainContainerComponent");
        }
    }

    public static final /* synthetic */ qpu l(xyh xyhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qpu) ipChange.ipc$dispatch("c515666a", new Object[]{xyhVar});
        }
        return xyhVar.k();
    }

    public final boolean handleBack(IPageBackLifecycle.TriggerType triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fa1481c", new Object[]{this, triggerType})).booleanValue();
        }
        ckf.g(triggerType, "triggerType");
        xwc xwcVar = this.d;
        if (xwcVar != null) {
            return xwcVar.K(triggerType);
        }
        ckf.y("multiTabService");
        throw null;
    }

    public final void handleOuterMessage(BaseOuterComponent.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be86f4e7", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "message");
        if (bVar.f() == BaseOuterComponent.OuterComponentType.TAB) {
            xwc xwcVar = this.d;
            if (xwcVar != null) {
                xwcVar.i(bVar);
            } else {
                ckf.y("multiTabService");
                throw null;
            }
        }
    }

    /* renamed from: m */
    public void onCreate(PageModel pageModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b551a", new Object[]{this, pageModel, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onCreate(pageModel, iComponentLifecycle$TriggerType);
        this.c = (k1e) k().getService(k1e.class);
        this.d = (xwc) k().getService(xwc.class);
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cd7f4cd", new Object[]{this});
            return;
        }
        k1e k1eVar = this.c;
        if (k1eVar != null) {
            k1eVar.show();
        } else {
            ckf.y("topBarService");
            throw null;
        }
    }

    public final void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f594a6bb", new Object[]{this, new Boolean(z)});
            return;
        }
        xwc xwcVar = this.d;
        if (xwcVar != null) {
            xwcVar.k(z);
        } else {
            ckf.y("multiTabService");
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
        k1e k1eVar = this.c;
        if (k1eVar != null) {
            k1eVar.H0(iComponentLifecycle$TriggerType);
            xwc xwcVar = this.d;
            if (xwcVar != null) {
                xwcVar.H0(iComponentLifecycle$TriggerType);
            } else {
                ckf.y("multiTabService");
                throw null;
            }
        } else {
            ckf.y("topBarService");
            throw null;
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
        k1e k1eVar = this.c;
        if (k1eVar != null) {
            k1eVar.I0(iComponentLifecycle$TriggerType);
            xwc xwcVar = this.d;
            if (xwcVar != null) {
                xwcVar.I0(iComponentLifecycle$TriggerType);
            } else {
                ckf.y("multiTabService");
                throw null;
            }
        } else {
            ckf.y("topBarService");
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
        k1e k1eVar = this.c;
        if (k1eVar != null) {
            k1eVar.r1(iComponentLifecycle$TriggerType);
            xwc xwcVar = this.d;
            if (xwcVar != null) {
                xwcVar.r1(iComponentLifecycle$TriggerType);
            } else {
                ckf.y("multiTabService");
                throw null;
            }
        } else {
            ckf.y("topBarService");
            throw null;
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
        k1e k1eVar = this.c;
        if (k1eVar != null) {
            k1eVar.H1(iComponentLifecycle$TriggerType);
            xwc xwcVar = this.d;
            if (xwcVar != null) {
                xwcVar.H1(iComponentLifecycle$TriggerType);
            } else {
                ckf.y("multiTabService");
                throw null;
            }
        } else {
            ckf.y("topBarService");
            throw null;
        }
    }

    public final void p(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b848055e", new Object[]{this, new Float(f)});
            return;
        }
        InterceptedMaskLayer interceptedMaskLayer = this.e;
        if (interceptedMaskLayer != null) {
            interceptedMaskLayer.setAlpha(f);
        }
    }

    /* renamed from: q */
    public void updateDataImpl(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d033d9", new Object[]{this, pageModel});
            return;
        }
        ckf.g(pageModel, "data");
        k1e k1eVar = this.c;
        if (k1eVar != null) {
            k1eVar.Z0(pageModel);
            xwc xwcVar = this.d;
            if (xwcVar != null) {
                xwcVar.Z0(pageModel);
            } else {
                ckf.y("multiTabService");
                throw null;
            }
        } else {
            ckf.y("topBarService");
            throw null;
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public FrameLayout createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b62bb851", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(k().getContext());
        xwc xwcVar = this.d;
        if (xwcVar != null) {
            View z = xwcVar.z();
            z.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(z);
            k1e k1eVar = this.c;
            if (k1eVar != null) {
                View z2 = k1eVar.z();
                z2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                frameLayout.addView(z2);
                InterceptedMaskLayer interceptedMaskLayer = new InterceptedMaskLayer(k().getContext());
                interceptedMaskLayer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                interceptedMaskLayer.setOnClickListener(new a());
                frameLayout.addView(interceptedMaskLayer);
                this.e = interceptedMaskLayer;
                return frameLayout;
            }
            ckf.y("topBarService");
            throw null;
        }
        ckf.y("multiTabService");
        throw null;
    }
}
