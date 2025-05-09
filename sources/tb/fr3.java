package tb;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class fr3 extends qr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public b c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            b n = fr3.this.n();
            if (n != null) {
                n.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void a();
    }

    static {
        t2o.a(916455671);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr3(qpu qpuVar) {
        super(qpuVar);
        ckf.g(qpuVar, "turboEngineContext");
    }

    public static /* synthetic */ Object ipc$super(fr3 fr3Var, String str, Object... objArr) {
        if (str.hashCode() == -41557118) {
            super.l(((Number) objArr[0]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/topbar/component/ChildButtonComponent");
    }

    @Override // tb.qr1
    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd85e382", new Object[]{this, new Integer(i)});
            return;
        }
        super.l(i);
        ImageView imageView = (ImageView) getView();
        if (imageView != null) {
            imageView.setImageTintList(ColorStateList.valueOf(i));
        }
    }

    /* renamed from: m */
    public ImageView createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("76f3ad08", new Object[]{this});
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.top_bar_child_icon);
        imageView.setContentDescription("未成年人模式，按钮");
        imageView.setOnClickListener(new a());
        return imageView;
    }

    public final b n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("31be223b", new Object[]{this});
        }
        return this.c;
    }

    public final void o(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f1641d", new Object[]{this, bVar});
        } else {
            this.c = bVar;
        }
    }
}
