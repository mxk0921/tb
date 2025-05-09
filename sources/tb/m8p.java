package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m8p implements god {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f23848a;
    public final olk<itk> b = new olk<>();

    static {
        t2o.a(468714016);
        t2o.a(468714018);
    }

    public m8p(FluidContext fluidContext) {
        this.f23848a = fluidContext;
    }

    @Override // tb.itk
    public void G(RangeSeekBar rangeSeekBar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb5ae2ff", new Object[]{this, rangeSeekBar, new Boolean(z)});
            return;
        }
        for (itk itkVar : this.b.b()) {
            try {
                itkVar.G(rangeSeekBar, z);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f23848a, itkVar, "onStartTrackingTouch", e);
            }
        }
    }

    @Override // tb.itk
    public void I(RangeSeekBar rangeSeekBar, float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ee0930", new Object[]{this, rangeSeekBar, new Float(f), new Float(f2), new Boolean(z)});
            return;
        }
        for (itk itkVar : this.b.b()) {
            try {
                itkVar.I(rangeSeekBar, f, f2, z);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f23848a, itkVar, "onRangeChanged", e);
            }
        }
    }

    @Override // tb.hod
    public void a(itk itkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e80cbf19", new Object[]{this, itkVar});
        } else if (itkVar != null) {
            this.b.a(itkVar);
        }
    }

    @Override // tb.itk
    public void m(RangeSeekBar rangeSeekBar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aca2b081", new Object[]{this, rangeSeekBar, new Boolean(z)});
            return;
        }
        for (itk itkVar : this.b.b()) {
            try {
                itkVar.m(rangeSeekBar, z);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f23848a, itkVar, "onStopTrackingTouch", e);
            }
        }
    }
}
