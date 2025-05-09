package tb;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.alibaba.android.ultron.common.page.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class q6h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public dl4 f26545a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements DialogInterface.OnCancelListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f26546a;

        public a(q6h q6hVar, Context context) {
            this.f26546a = context;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                return;
            }
            dialogInterface.dismiss();
            Context context = this.f26546a;
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
        }
    }

    static {
        t2o.a(153092109);
        t2o.a(153092105);
    }

    public void a(b bVar, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e20dbd", new Object[]{this, bVar, context, new Integer(i)});
            return;
        }
        dl4 dl4Var = this.f26545a;
        if (dl4Var != null) {
            dl4Var.dismiss();
            this.f26545a = null;
        }
    }

    public void b(b bVar, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd96d3d3", new Object[]{this, bVar, context, new Integer(i)});
        } else if (i != 2 && this.f26545a == null) {
            dl4 dl4Var = new dl4(context, R.style.Dialog_Status_Container);
            this.f26545a = dl4Var;
            dl4Var.setContentView(View.inflate(context, R.layout.common_progressbar_layout, null));
            this.f26545a.c();
            this.f26545a.setOnCancelListener(new a(this, context));
            this.f26545a.show();
        }
    }
}
