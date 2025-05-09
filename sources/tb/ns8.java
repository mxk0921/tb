package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.taobao.R;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ns8 extends ici {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CARD_NAME = "扩展卡";
    private static final String H = "ExtensionCard";

    static {
        t2o.a(468713958);
    }

    public ns8(FluidContext fluidContext) {
        super(fluidContext);
    }

    public static /* synthetic */ Object ipc$super(ns8 ns8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/extension/ExtensionCard");
    }

    @Override // tb.ulb
    public int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a3ace76", new Object[]{this})).intValue();
        }
        return R.layout.fluid_sdk_ly_picture_album_card;
    }

    @Override // tb.ulb
    public int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5435485a", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.ici
    public void Z0(Boolean bool, Boolean bool2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f2f5f41", new Object[]{this, bool, bool2});
        }
    }

    @Override // tb.ici
    public void k(qy0 qy0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec31384", new Object[]{this, qy0Var});
        }
    }

    @Override // tb.ici
    public void u(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23daa75c", new Object[]{this, new Float(f)});
        }
    }

    @Override // tb.ici
    public void update12003UtParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aceb7f0", new Object[]{this, map});
        }
    }

    @Override // tb.ulb
    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc13a868", new Object[]{this});
        }
        return CARD_NAME;
    }
}
