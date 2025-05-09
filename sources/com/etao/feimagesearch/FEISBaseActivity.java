package com.etao.feimagesearch;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Map;
import tb.aod;
import tb.b8m;
import tb.c4p;
import tb.hx8;
import tb.jzu;
import tb.k1p;
import tb.lg4;
import tb.mzu;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FEISBaseActivity extends ISBaseActivity implements aod {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4619a = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            hx8.j().k(hashCode());
            try {
                k1p.d();
            } catch (Throwable unused) {
                c4p.n("FEISBaseActivity", "update country code error");
            }
        }
    }

    static {
        t2o.a(730857475);
        t2o.a(993001695);
    }

    public static /* synthetic */ Object ipc$super(FEISBaseActivity fEISBaseActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/FEISBaseActivity");
        }
    }

    @Override // tb.aod
    public void D2(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f36968", new Object[]{this, str, map});
        } else {
            TLogTracker.k(str, map);
        }
    }

    @Override // com.etao.feimagesearch.ISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        b8m b8mVar = b8m.INSTANCE;
        b8mVar.b();
        b8mVar.c();
        super.onCreate(bundle);
        boolean B = lg4.B();
        jzu.p(B);
        mzu.o(B);
    }

    @Override // com.etao.feimagesearch.ISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        hx8.j().n(hashCode());
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (!this.f4619a) {
            this.f4619a = true;
            VExecutors.defaultSharedThreadPool().submit(new a());
        }
    }
}
