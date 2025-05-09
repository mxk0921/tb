package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.subscriber.data.OperateFields;
import com.taobao.taobao.R;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class z6l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f32572a;
    public PopupWindow b;
    public View c;
    public final View.OnClickListener d;
    public LinearLayout e;
    public LinearLayout f;
    public int g;
    public float h;

    static {
        t2o.a(614465773);
    }

    public z6l(Context context, ArrayList<OperateFields> arrayList, View.OnClickListener onClickListener) {
        this.f32572a = context;
        this.d = onClickListener;
        c();
        b(arrayList);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else {
            this.b.dismiss();
        }
    }

    public final void b(ArrayList<OperateFields> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f381f3de", new Object[]{this, arrayList});
        } else if (this.f32572a != null) {
            kor.a("OperationPopWindow", "initByOrderList", arrayList.toString());
            View inflate = LayoutInflater.from(this.f32572a).inflate(R.layout.order_popupwindow_core, (ViewGroup) null);
            this.c = inflate;
            this.e = (LinearLayout) inflate.findViewById(R.id.popwindow_layout_core);
            this.f = (LinearLayout) this.c.findViewById(R.id.popwindow_content_core);
            for (int i = 0; i < arrayList.size(); i++) {
                Button c = c2u.c(this.f32572a, arrayList.get(i), 0, this.d);
                c.setBackgroundColor(0);
                c.setAllCaps(false);
                c.setTextColor(this.f32572a.getResources().getColor(R.color.order_b_e));
                float f = this.h;
                c.setPadding((int) (f * 15.0f), (int) (f * 10.0f), (int) (15.0f * f), (int) (f * 10.0f));
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) c.getLayoutParams();
                int dimensionPixelSize = this.f32572a.getResources().getDimensionPixelSize(R.dimen.order_batch_btn_h);
                int dimensionPixelSize2 = this.f32572a.getResources().getDimensionPixelSize(R.dimen.order_list_more_pop_width);
                layoutParams.width = -2;
                layoutParams.height = dimensionPixelSize;
                c.setMinWidth(dimensionPixelSize2);
                c.setGravity(19);
                this.f.addView(c);
            }
            PopupWindow popupWindow = new PopupWindow(this.c, -2, -2, true);
            this.b = popupWindow;
            popupWindow.setTouchable(true);
            this.b.setOutsideTouchable(true);
            this.b.setBackgroundDrawable(new BitmapDrawable(this.f32572a.getResources(), (Bitmap) null));
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        this.g = c2u.h(this.f32572a);
        this.h = c2u.g(this.f32572a);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        return this.b.isShowing();
    }

    public void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc9d94e", new Object[]{this, view});
            return;
        }
        Context context = this.f32572a;
        if (context != null) {
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                int[] iArr = new int[2];
                int dimensionPixelSize = this.f32572a.getResources().getDimensionPixelSize(R.dimen.operate_btn_height);
                int dimensionPixelSize2 = this.f32572a.getResources().getDimensionPixelSize(R.dimen.order_batch_btn_padding);
                view.getLocationInWindow(iArr);
                try {
                    if (this.g - iArr[1] > this.h * 120.0f) {
                        this.e.setBackgroundResource(R.drawable.order_more_op_down_bg);
                        LinearLayout linearLayout = this.e;
                        float f = this.h;
                        linearLayout.setPadding(((int) f) * 3, ((int) f) * 6, ((int) f) * 3, ((int) f) * 3);
                        this.b.showAtLocation(view, 51, iArr[0] - (dimensionPixelSize2 * 2), iArr[1] + (dimensionPixelSize / 2));
                    } else {
                        this.e.setBackgroundResource(R.drawable.order_more_op_up_bg);
                        LinearLayout linearLayout2 = this.e;
                        float f2 = this.h;
                        linearLayout2.setPadding(((int) f2) * 3, 0, ((int) f2) * 3, ((int) f2) * 9);
                        this.c.measure(-2, -2);
                        this.b.showAtLocation(view, 83, 0, this.g - iArr[1]);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
