package com.alibaba.android.ultron.vfw.weex2.highPerformance.widget;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.h6e;
import tb.rgv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class TradeHybridBaseFragment extends DialogFragment implements h6e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public rgv f2380a;

    static {
        t2o.a(157286948);
        t2o.a(157286907);
    }

    public static /* synthetic */ Object ipc$super(TradeHybridBaseFragment tradeHybridBaseFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1589549411) {
            super.onAttach((Context) objArr[0]);
            return null;
        } else if (hashCode == 797441118) {
            super.onPause();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/ultron/vfw/weex2/highPerformance/widget/TradeHybridBaseFragment");
        }
    }

    @Override // tb.h6e
    public rgv D0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgv) ipChange.ipc$dispatch("9c85efa3", new Object[]{this, str});
        }
        return null;
    }

    @Override // tb.h6e
    public rgv M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgv) ipChange.ipc$dispatch("e33438b6", new Object[]{this});
        }
        if (this.f2380a == null) {
            this.f2380a = new rgv();
        }
        return this.f2380a;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        M0().q();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        M0().e(p2());
    }

    public abstract String p2();
}
