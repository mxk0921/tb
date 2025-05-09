package tb;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class r6h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void onCancel();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends Dialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final a f27140a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements DialogInterface.OnCancelListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                } else if (b.a(b.this) != null) {
                    b.a(b.this).onCancel();
                }
            }
        }

        static {
            t2o.a(817889295);
        }

        public b(Context context, a aVar) {
            super(context, R.style.Theme_CommentDialog);
            this.f27140a = aVar;
            b(context);
        }

        public static /* synthetic */ a a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cff130c5", new Object[]{bVar});
            }
            return bVar.f27140a;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ask/LoadingHelper$LoadingDialog");
        }

        public final void b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
                return;
            }
            View inflate = LayoutInflater.from(context).inflate(R.layout.comment_dialog_loading, (ViewGroup) null);
            Window window = getWindow();
            if (window != null) {
                window.setContentView(inflate);
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.setLayout(-1, -1);
                zc1.d(window, true);
            }
            setCancelable(true);
            setCanceledOnTouchOutside(true);
            setOnCancelListener(new a());
        }

        @Override // android.app.Dialog
        public boolean onTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
            }
            if (isShowing()) {
                cancel();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final b f27142a;

        static {
            t2o.a(817889297);
        }

        public c(b bVar) {
            this.f27142a = bVar;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
                return;
            }
            b bVar = this.f27142a;
            if (bVar != null && bVar.isShowing()) {
                this.f27142a.dismiss();
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
                return;
            }
            b bVar = this.f27142a;
            if (bVar != null && !bVar.isShowing()) {
                this.f27142a.show();
            }
        }
    }

    static {
        t2o.a(817889293);
    }

    public static c a(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("df7e12b8", new Object[]{context, aVar});
        }
        c cVar = new c(new b(context, aVar));
        cVar.b();
        return cVar;
    }
}
