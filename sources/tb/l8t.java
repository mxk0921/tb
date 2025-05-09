package tb;

import android.app.Dialog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.popupcenter.strategy.PopStrategy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class l8t implements xad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Dialog f23184a;

    static {
        t2o.a(666894362);
    }

    public l8t(Dialog dialog) {
        this.f23184a = dialog;
    }

    @Override // tb.xad
    public boolean isShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d57d5b12", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.xad
    public long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea8707e9", new Object[]{this})).longValue();
        }
        return 0L;
    }

    @Override // tb.xad
    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f996fc7", new Object[]{this});
        }
        return PopStrategy.IDENTIFIER_TAO_PASSWORD;
    }

    @Override // tb.xad
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        fwr.d("TaoPasswordPopOperation#show");
        Dialog dialog = this.f23184a;
        if (dialog != null) {
            dialog.show();
        }
    }
}
