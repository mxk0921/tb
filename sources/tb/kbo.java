package tb;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class kbo extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_RETAIN_FLAG = "retain:show";

    /* renamed from: a  reason: collision with root package name */
    public final View f22542a;
    public final Handler b = new a(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/view/RetainDialog$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what == 1) {
                kbo.a(kbo.this);
                jzu.e("AutoCloseRetainDialog", new String[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            jzu.e("CloseRetainDialog", new String[0]);
            kbo.a(kbo.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            jzu.e("CancelRetainDialog", new String[0]);
            kbo.this.setOnDismissListener(null);
            kbo.a(kbo.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                kbo.a(kbo.this);
            }
        }
    }

    static {
        t2o.a(481297684);
    }

    public kbo(Context context) {
        super(context, R.style.popupDialog);
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        View inflate = LayoutInflater.from(context).inflate(R.layout.feis_view_retain_dialog, (ViewGroup) null, false);
        this.f22542a = inflate;
        e(inflate);
        setOnShowListener(new b(context));
    }

    public static /* synthetic */ void a(kbo kboVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e085f7e", new Object[]{kboVar});
        } else {
            kboVar.d();
        }
    }

    public static /* synthetic */ Handler b(kbo kboVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("166e6ee7", new Object[]{kboVar});
        }
        return kboVar.b;
    }

    public static /* synthetic */ Object ipc$super(kbo kboVar, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/view/RetainDialog");
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7441e7", new Object[]{this});
            return;
        }
        dismiss();
        this.b.removeMessages(1);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        getWindow().requestFeature(1);
        setContentView(this.f22542a);
        getWindow().setLayout(-1, -1);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements DialogInterface.OnShowListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f22544a;

        public b(Context context) {
            this.f22544a = context;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d64de6c3", new Object[]{this, dialogInterface});
                return;
            }
            kbo.b(kbo.this).removeMessages(1);
            kbo.b(kbo.this).sendEmptyMessageDelayed(1, 5000L);
            jzu.q("PhotoSearchTake", "RetainDialog", new String[0]);
            mno.e(this.f22544a, kbo.KEY_RETAIN_FLAG, true);
        }
    }

    public final void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        ((TUrlImageView) view.findViewById(R.id.iv_background)).setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01ZgKvPl21aVXaRgVZM_!!6000000007001-2-tps-1000-1202.png");
        int i = R.id.iv_close;
        ((TUrlImageView) view.findViewById(i)).setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01Rmuu6D1NXE4QHiz8P_!!6000000001579-2-tps-160-160.png");
        SpannableString spannableString = new SpannableString(Localization.q(R.string.taobao_app_1007_1_19022));
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FF5B00")), 1, 9, 33);
        ((TextView) view.findViewById(R.id.tv_title)).setText(spannableString);
        ViewProxy.setOnClickListener(view.findViewById(R.id.btn_confirm), new c());
        ViewProxy.setOnClickListener(view.findViewById(i), new d());
        ViewProxy.setOnClickListener(view, new e());
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea89958", new Object[]{context})).booleanValue();
        }
        return !eno.b(context, KEY_RETAIN_FLAG, false);
    }
}
