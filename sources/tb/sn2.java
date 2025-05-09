package tb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sn2 extends sz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final z9e CREATOR = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements z9e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.z9e
        public sz a(ViewEngine viewEngine) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sz) ipChange.ipc$dispatch("345e20e7", new Object[]{this, viewEngine});
            }
            return new sn2(viewEngine);
        }
    }

    static {
        t2o.a(157286748);
    }

    public sn2(ViewEngine viewEngine) {
        super(viewEngine);
    }

    public static /* synthetic */ Object ipc$super(sn2 sn2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/viewholder/BundleLineViewHolder");
    }

    @Override // tb.sz
    public void d(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fbfb67", new Object[]{this, iDMComponent});
        }
    }

    @Override // tb.sz
    public View e(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("14914f88", new Object[]{this, viewGroup});
        }
        return LayoutInflater.from(this.f28365a.K()).inflate(R.layout.bundle_line_layout, viewGroup, false);
    }
}
