package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a4u extends dz1 implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093293);
    }

    public a4u(Context context) {
        super(context, R.style.taolive_top_dialog);
        getWindow().setDimAmount(0.0f);
    }

    public static /* synthetic */ Object ipc$super(a4u a4uVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ui/view/TopMoreBtnPopupWindow");
    }

    @Override // tb.dz1
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a20e10cc", new Object[]{this});
        }
        View inflate = LayoutInflater.from(this.f18168a).inflate(R.layout.taolive_top_more_btn_layout, (ViewGroup) null);
        if (up6.p0(vx9.d())) {
            inflate.findViewById(R.id.taolive_top_more_report).setVisibility(8);
        } else {
            ((AliUrlImageView) inflate.findViewById(R.id.taolive_top_more_report_img)).setImageUrl("https://gw.alicdn.com/tfs/TB1OBQVNAL0gK0jSZFtXXXQCXXa-128-128.png");
            ViewProxy.setOnClickListener(inflate.findViewById(R.id.taolive_top_more_report), this);
        }
        ((AliUrlImageView) inflate.findViewById(R.id.taolive_top_more_tobehost_img)).setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01VDHOlI1gZx6ci3QyD_!!6000000004157-2-tps-128-128.png");
        ViewProxy.setOnClickListener(inflate.findViewById(R.id.taolive_top_more_close_btn), this);
        ViewProxy.setOnClickListener(inflate.findViewById(R.id.taolive_top_more_tobehost), this);
        rbu.c0(vx9.d(), "Show-more_anchor", null);
        return inflate;
    }

    @Override // tb.dz1
    public WindowManager.LayoutParams b(DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager.LayoutParams) ipChange.ipc$dispatch("c9bf7551", new Object[]{this, displayMetrics});
        }
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.gravity = 48;
        attributes.width = displayMetrics.widthPixels;
        attributes.height = hw0.b(getContext(), 171.0f);
        attributes.flags |= 1024;
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        return attributes;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.taolive_top_more_report) {
            if (v2s.o().u() != null && v2s.o().u().checkSessionValid()) {
                sjr.g().c("com.taobao.taolive.room.start_report_from_btns", null, vx9.e());
            } else if (v2s.o().u() != null) {
                try {
                    v2s.o().u().a((Activity) this.f18168a, null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            dismiss();
        } else if (view.getId() == R.id.taolive_top_more_close_btn) {
            dismiss();
        } else if (view.getId() == R.id.taolive_top_more_tobehost) {
            Context context = this.f18168a;
            voj.a(context, pvs.C2(context));
            dismiss();
            rbu.L(vx9.d(), "more_anchor", new String[0]);
        }
    }
}
