package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.android.ultron.common.page.UltronCommonActivity;
import com.alibaba.android.ultron.common.page.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pi8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f26110a;
    public TBErrorView b;
    public Boolean c = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f26111a;

        public a(pi8 pi8Var, b bVar) {
            this.f26111a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f26111a.n();
            }
        }
    }

    static {
        t2o.a(153092102);
        t2o.a(153092104);
    }

    public pi8(LinearLayout linearLayout, UltronCommonActivity ultronCommonActivity) {
        this.f26110a = linearLayout;
    }

    public void a(b bVar, Context context, int i, w6v w6vVar) {
        String str;
        TBErrorView tBErrorView;
        TBErrorView tBErrorView2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9d913f", new Object[]{this, bVar, context, new Integer(i), w6vVar});
        } else if (i != 1) {
            if (i == 2 && (tBErrorView2 = this.b) != null) {
                tBErrorView2.setVisibility(8);
            }
        } else if (!bVar.i()) {
            if (w6vVar != null) {
                z = w6vVar.e();
            }
            Boolean bool = this.c;
            if (!(bool == null || z == bool.booleanValue() || (tBErrorView = this.b) == null)) {
                this.f26110a.removeView(tBErrorView);
                this.b = null;
            }
            if (this.b == null) {
                TBErrorView tBErrorView3 = new TBErrorView(context);
                this.b = tBErrorView3;
                tBErrorView3.setBackgroundResource(R.color.COLOR_F2);
                this.f26110a.addView(this.b, new LinearLayout.LayoutParams(-1, -1));
                this.b.setButton(TBErrorView.ButtonType.BUTTON_LEFT, "重试", new a(this, bVar));
            }
            this.b.setVisibility(0);
            if (w6vVar != null) {
                Error fromMtopResponse = Error.Factory.fromMtopResponse(w6vVar.b(), w6vVar.a(), w6vVar.c(), w6vVar.d());
                this.b.setError(fromMtopResponse);
                this.c = Boolean.valueOf(z);
                if (z) {
                    this.b.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 0);
                    this.b.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 0);
                    return;
                }
                this.b.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
                this.b.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
                this.b.setTitle(w6vVar.d());
                fromMtopResponse.errorMsg = " ";
                this.b.setSubTitle(" ");
                return;
            }
            this.b.setError(Error.Factory.fromMtopResponse(-1, "-1", "-1", "unknow error"));
        } else {
            if (w6vVar == null || TextUtils.isEmpty(w6vVar.d())) {
                str = "亲，您的网络状况不太好哦!";
            } else {
                str = w6vVar.d();
            }
            z4v.a(context, str);
        }
    }
}
