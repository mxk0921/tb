package tb;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ISBaseActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class nv8 implements ta0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ISBaseActivity f24973a;

    static {
        t2o.a(730857474);
        t2o.a(481296411);
    }

    public nv8(ISBaseActivity iSBaseActivity) {
        this.f24973a = iSBaseActivity;
    }

    @Override // tb.ta0
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b33269ae", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            qc0.a(this.f24973a, z, z2);
        }
    }

    @Override // tb.ta0
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fd59013", new Object[]{this, str});
        } else {
            this.f24973a.updateUTPageName(str);
        }
    }

    @Override // tb.ta0
    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.f24973a;
    }

    @Override // tb.ta0
    public Intent getIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("cdc34bda", new Object[]{this});
        }
        return this.f24973a.getIntent();
    }
}
