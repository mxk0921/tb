package tb;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tzj implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f29044a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
            String h = f4b.h("promotionFailedTipContent", tzj.b(tzj.this).getResources().getString(R.string.homepage_promote_tab_switch_error_toast));
            if (!TextUtils.isEmpty(h)) {
                TBToast.makeText(tzj.b(tzj.this), h, 2000L).show();
            }
        }
    }

    static {
        t2o.a(729809788);
        t2o.a(475004944);
    }

    public tzj(Context context) {
        this.f29044a = null;
        this.f29044a = context.getApplicationContext();
    }

    public static /* synthetic */ Context b(tzj tzjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("fb318990", new Object[]{tzjVar});
        }
        return tzjVar.f29044a;
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
            return;
        }
        if (this.f29044a == null && (context = q4a.b) != null) {
            this.f29044a = context.getApplicationContext();
        }
        if (this.f29044a != null) {
            new Handler(this.f29044a.getMainLooper()).post(new a());
        }
    }
}
