package com.etao.feimagesearch;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.disk.IStorageClearService;
import tb.c2v;
import tb.fy3;
import tb.pei;
import tb.q2r;
import tb.t2o;
import tb.z8d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CaptureBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REQUEST_CODE = 999;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements q2r.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(z8d z8dVar) {
        }

        public void a(pei peiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adf59e74", new Object[]{this, peiVar});
            } else if (!peiVar.p()) {
                peiVar.b().toString();
                peiVar.f();
                throw null;
            }
        }
    }

    static {
        t2o.a(481296385);
    }

    public static void openAlbumPage(Activity activity, z8d z8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee73c47b", new Object[]{activity, z8dVar});
        } else if (z8dVar != null && (activity instanceof FragmentActivity)) {
            fy3.a(c2v.getInstance().getCurrentPageName(), CaptureBridge.class.getSimpleName());
            q2r.c((FragmentActivity) activity, false, new a(z8dVar), IStorageClearService.Keys.OUTER);
        }
    }
}
