package tb;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Ltb/vvl;", "Landroid/app/Dialog;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "a", "cashdesk_aar_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class vvl extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String LOADING_IMAGE_URL = "https://img.alicdn.com/imgextra/i1/O1CN01YWO1pU1qARYDSJlq5_!!6000000005455-54-tps-144-24.apng";

    /* renamed from: a  reason: collision with root package name */
    public TextView f30281a;
    public String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvl(Context context) {
        super(context, R.style.TranslucentDialog);
        ckf.g(context, "context");
    }

    public static /* synthetic */ Object ipc$super(vvl vvlVar, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/alipay/cashdesk/loading/PayLoadingDialog");
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
            return;
        }
        ckf.g(str, "text");
        this.b = str;
        TextView textView = this.f30281a;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        requestWindowFeature(1);
        TextView textView = null;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.custom_loading_dialog, (ViewGroup) null);
        ckf.f(inflate, "LayoutInflater.from(cont…tom_loading_dialog, null)");
        View findViewById = inflate.findViewById(R.id.loading_anim);
        if (!(findViewById instanceof TUrlImageView)) {
            findViewById = null;
        }
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById;
        if (tUrlImageView != null) {
            tUrlImageView.setSkipAutoSize(true);
        }
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(LOADING_IMAGE_URL);
        }
        setContentView(inflate);
        View findViewById2 = inflate.findViewById(R.id.loading_text);
        if (findViewById2 instanceof TextView) {
            textView = findViewById2;
        }
        TextView textView2 = textView;
        this.f30281a = textView2;
        String str = this.b;
        if (str != null && textView2 != null) {
            textView2.setText(str);
        }
    }
}
