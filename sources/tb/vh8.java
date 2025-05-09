package tb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.publishinsert.IPublishInsertService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vh8 extends gr9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String h = "ErrorLayer";
    private static final String i = "ErrorLayer";
    private static final String j = "https://img.alicdn.com/tfs/TB1xdTfRhD1gK0jSZFsXXbldVXa-636-636.png";
    private View e;
    private TUrlImageView f;
    private TextView g;

    static {
        t2o.a(468713903);
    }

    public vh8(FluidContext fluidContext, uq9 uq9Var) {
        super(fluidContext, uq9Var);
    }

    public static /* synthetic */ Object ipc$super(vh8 vh8Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 610311722) {
            super.onBindData((uq9) objArr[0], (a) objArr[1], ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode == 2063982600) {
            super.onCreateView((uq9) objArr[0], (RecyclerViewHolder) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/framework/card/cards/base/layer/error/ErrorLayer");
        }
    }

    @Override // tb.ojc
    public String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17e2e1f3", new Object[]{this});
        }
        return "ErrorLayer";
    }

    public void P(int i2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98bc630c", new Object[]{this, new Integer(i2)});
        } else if (this.c.W() != null && !((IPublishInsertService) this.b.getService(IPublishInsertService.class)).isPublishIInsertEnable() && (this.c.W() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) this.c.W();
            if (this.e == null) {
                View inflate = LayoutInflater.from(this.c.W().getContext()).inflate(R.layout.fluid_sdk_content_error, (ViewGroup) this.c.W(), false);
                this.e = inflate;
                this.f = (TUrlImageView) inflate.findViewById(R.id.imv_content_error);
                this.g = (TextView) this.e.findViewById(R.id.txtv_error_msg);
            }
            if (hn4.b()) {
                ir9.b("ErrorLayer", "NewContentErrorStatus 异常内容，展示下发文案/icon");
                TUrlImageView tUrlImageView = this.f;
                String str2 = "";
                if (this.c.Y() != null) {
                    str = this.c.Y().n();
                } else {
                    str = str2;
                }
                tUrlImageView.setImageUrl(str);
                TextView textView = this.g;
                if (this.c.Y() != null) {
                    str2 = this.c.Y().m();
                }
                textView.setText(str2);
            } else {
                this.f.setImageUrl(j);
                this.g.setText(a6o.a(i2));
            }
            if (this.e.getParent() == null) {
                viewGroup.addView(this.e, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    public void hideErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b100b2", new Object[]{this});
            return;
        }
        View view = this.e;
        if (view != null && view.getParent() != null) {
            ((ViewGroup) this.c.W()).removeView(this.e);
        }
    }

    @Override // tb.gr9, tb.ojc, tb.wlb
    public void onBindData(uq9 uq9Var, a aVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i2)});
            return;
        }
        super.onBindData(uq9Var, aVar, i2);
        a.d e = aVar.e();
        if (e == null || !e.y()) {
            P(e.l());
        } else {
            hideErrorView();
        }
    }

    @Override // tb.gr9, tb.ojc, tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
        } else {
            super.onCreateView(uq9Var, recyclerViewHolder);
        }
    }
}
