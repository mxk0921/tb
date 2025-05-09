package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.presenter.a;
import com.taobao.android.tbsku.TBXSkuActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c0s extends com.taobao.android.sku.presenter.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            try {
                ((TBXSkuActivity) c0s.H(c0s.this)).onBackPressed();
            } catch (Throwable unused) {
            }
        }
    }

    static {
        t2o.a(785383551);
    }

    public c0s(Context context) {
        super(context);
        E(new a());
    }

    public static /* synthetic */ Context H(c0s c0sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("13b25cb9", new Object[]{c0sVar});
        }
        return c0sVar.f9452a;
    }

    public static /* synthetic */ Object ipc$super(c0s c0sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbsku/presenter/TBXSkuPopupPresenter");
    }

    @Override // com.taobao.android.sku.presenter.a, tb.mfb
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6ec27c2", new Object[]{this});
            return;
        }
        try {
            ((TBXSkuActivity) this.f9452a).addSkuInRootContainer(this.b);
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.android.sku.presenter.a, tb.mfb
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        a.j jVar = this.k;
        if (jVar != null) {
            jVar.a(this);
        }
        try {
            ((TBXSkuActivity) this.f9452a).finish();
        } catch (Throwable unused) {
        }
    }
}
