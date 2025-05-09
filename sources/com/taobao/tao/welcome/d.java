package com.taobao.tao.welcome;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.welcome.a;
import com.taobao.taobao.R;
import tb.i1k;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a c;

    static {
        t2o.a(734003240);
    }

    public d(Activity activity, a.d dVar) {
        super(activity, dVar);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/welcome/ProvisionPlan4");
    }

    @Override // com.taobao.tao.welcome.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("298508db", new Object[]{this});
        } else {
            b();
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903293e2", new Object[]{this});
            return;
        }
        if (this.c == null) {
            i1k i1kVar = new i1k(this.b, R.string.provision_title_exit_view_mode, R.string.plan1_page2_content_3, new int[]{R.id.provision_negative_button_view_mode, R.id.provision_positive_button}, new int[]{R.string.privacy_text_disagree_continue_view_mode, R.string.privacy_text_agree_exit_view_mode});
            this.c = i1kVar;
            i1kVar.j(new c(this));
        }
        this.c.show();
    }
}
