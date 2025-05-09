package tb;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.kakalib.express.ExpressResult;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.express.activity.ExpressDialogFragment;
import com.taobao.taobao.scancode.huoyan.ui.KakaLibLoadingDialogFragment;
import com.taobao.taobao.scancode.huoyan.ui.KakaLibTextDialogFragment;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jp1 extends gp1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                jp1.this.startPreview();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                jp1.this.startPreview();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                jp1.this.startPreview();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements eic {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.eic
        public void onCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379d4540", new Object[]{this});
            } else {
                jp1.this.startPreview();
            }
        }

        @Override // tb.eic
        public void onDismiss() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(760217628);
    }

    public jp1(hvm hvmVar) {
        super(hvmVar);
    }

    public static /* synthetic */ Object ipc$super(jp1 jp1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/barcode/util/BarcodeProductsDialogHelper");
    }

    public void g(FragmentActivity fragmentActivity, String str, ArrayList<ExpressResult> arrayList, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c14332e", new Object[]{this, fragmentActivity, str, arrayList, new Integer(i)});
            return;
        }
        ExpressDialogFragment z2 = ExpressDialogFragment.z2(str, arrayList, i);
        z2.s2(new b());
        d(fragmentActivity, z2, "REQUEST_PRODUCT");
        ey3.g().h("Dialog_show_express");
    }

    public void h(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e7a68f", new Object[]{this, fragmentActivity});
            return;
        }
        KakaLibTextDialogFragment u2 = KakaLibTextDialogFragment.u2(fragmentActivity.getString(R.string.kakalib_network_error));
        u2.s2(new a());
        d(fragmentActivity, u2, "REQUEST_PRODUCT");
        ey3.g().h("Dialog_show_net_work_error");
    }

    public void i(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("943472aa", new Object[]{this, fragmentActivity});
            return;
        }
        KakaLibLoadingDialogFragment u2 = KakaLibLoadingDialogFragment.u2();
        u2.s2(new c());
        e(fragmentActivity, u2, "REQUEST_PRODUCT", new d());
        ey3.g().h("Dialog_show_request_loading");
    }
}
