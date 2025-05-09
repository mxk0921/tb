package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nja extends gr9 implements itk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String f = "GrayMaskLayer";
    private static final String g = "GrayMaskLayer";
    private final prp e;

    static {
        t2o.a(468714009);
        t2o.a(468714021);
    }

    public nja(FluidContext fluidContext, prp prpVar) {
        super(fluidContext, prpVar);
        this.e = prpVar;
    }

    public static /* synthetic */ Object ipc$super(nja njaVar, String str, Object... objArr) {
        if (str.hashCode() == 2063982600) {
            super.onCreateView((uq9) objArr[0], (RecyclerViewHolder) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/layer/mask/GrayMaskLayer");
    }

    @Override // tb.itk
    public void G(RangeSeekBar rangeSeekBar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb5ae2ff", new Object[]{this, rangeSeekBar, new Boolean(z)});
            return;
        }
        this.e.V().R().v(false);
        if (((IDataService) this.e.U().getService(IDataService.class)).getConfig().j().C) {
            Boolean bool = Boolean.TRUE;
            Q(bool, bool);
        }
    }

    @Override // tb.ojc
    public String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17e2e1f3", new Object[]{this});
        }
        return "GrayMaskLayer";
    }

    @Override // tb.itk
    public void I(RangeSeekBar rangeSeekBar, float f2, float f3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ee0930", new Object[]{this, rangeSeekBar, new Float(f2), new Float(f3), new Boolean(z)});
        }
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2037c84", new Object[]{this});
            return;
        }
        RecyclerViewHolder f0 = this.e.f0();
        ncp j = ((IDataService) this.e.U().getService(IDataService.class)).getConfig().j();
        if (f0 != null && j != null) {
            ir9.a("changfeng", " ShortVideoCard.updateGraymaskView " + j.C + " tnodeVersion :0 weexVersion :0");
            if (j.C) {
                f0.b0(R.id.v_graymask_bottom).setVisibility(4);
                View b0 = f0.b0(R.id.v_graymask_top);
                ViewGroup.LayoutParams layoutParams = b0.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = pr9.c(b0.getContext(), 50);
                    b0.setLayoutParams(layoutParams);
                }
            } else if (pto.h(this.e.U())) {
                View b02 = f0.b0(R.id.v_graymask_bottom);
                ViewGroup.LayoutParams layoutParams2 = b02.getLayoutParams();
                if (layoutParams2 != null) {
                    if (f2k.d(this.b)) {
                        layoutParams2.height = pr9.q(360);
                    } else {
                        layoutParams2.height = s6o.S(b02.getContext(), 360);
                    }
                    b02.setLayoutParams(layoutParams2);
                }
                View b03 = f0.b0(R.id.v_graymask_top);
                ViewGroup.LayoutParams layoutParams3 = b03.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = pr9.c(b03.getContext(), 50);
                    b03.setLayoutParams(layoutParams3);
                }
            }
        }
    }

    public void Q(Boolean bool, Boolean bool2) {
        View b0;
        View b02;
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f2f5f41", new Object[]{this, bool, bool2});
        } else if (this.e.f0() != null) {
            if (!(bool == null || (b02 = this.e.f0().b0(R.id.v_graymask_top)) == null)) {
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 4;
                }
                b02.setVisibility(i);
            }
            if (bool2 != null && (b0 = this.e.f0().b0(R.id.v_graymask_bottom)) != null) {
                if (!bool2.booleanValue()) {
                    i2 = 4;
                }
                b0.setVisibility(i2);
            }
        }
    }

    @Override // tb.itk
    public void m(RangeSeekBar rangeSeekBar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aca2b081", new Object[]{this, rangeSeekBar, new Boolean(z)});
            return;
        }
        this.e.V().R().v(true);
        if (((IDataService) this.e.U().getService(IDataService.class)).getConfig().j().C) {
            Q(Boolean.TRUE, Boolean.FALSE);
        }
    }

    @Override // tb.gr9, tb.ojc, tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
            return;
        }
        super.onCreateView(uq9Var, recyclerViewHolder);
        this.e.y1().Z().a(this);
        P();
    }
}
