package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.model.PicModel;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.at4;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class tps extends xv1<TabModel, FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public TUrlImageView c;
    public TextView d;
    public Boolean e;
    public Integer f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455696);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455695);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tps(qpu qpuVar) {
        super(qpuVar);
        ckf.g(qpuVar, "turboEngineContext");
    }

    public static /* synthetic */ Object ipc$super(tps tpsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/topbar/component/TabBarItemComponent");
    }

    public final void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd85e382", new Object[]{this, new Integer(i)});
            return;
        }
        tpu.a aVar = tpu.Companion;
        aVar.c("TabBarItemComponent", "更新颜色，color=" + i);
        this.f = Integer.valueOf(i);
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public final void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("547ac5c0", new Object[]{this, new Boolean(z)});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TabBarItemComponent", "更新选中样式，isSelected=" + z, null, 4, null);
        this.e = Boolean.valueOf(z);
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout != null) {
            m(frameLayout, z);
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public FrameLayout createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b62bb851", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        at4.a aVar = at4.Companion;
        frameLayout.setPadding(aVar.d(getContext(), 8, true), 0, aVar.d(getContext(), 8, true), 0);
        StringBuilder sb = new StringBuilder("未选中，");
        TabModel data = getData();
        String str = null;
        sb.append(data != null ? data.getName() : null);
        sb.append(sqj.BUTTON_DESC);
        frameLayout.setContentDescription(sb.toString());
        TabModel data2 = getData();
        PicModel tabPic = data2 != null ? data2.getTabPic() : null;
        if (tabPic != null) {
            TUrlImageView tUrlImageView = new TUrlImageView(getContext());
            tUrlImageView.setLayoutParams(new FrameLayout.LayoutParams(at4.a.c(aVar, getContext(), Integer.valueOf(tabPic.getWidth()), false, 4, null), at4.a.c(aVar, getContext(), Integer.valueOf(tabPic.getHeight()), false, 4, null), 16));
            tUrlImageView.setMinimumHeight(at4.a.c(aVar, getContext(), 36, false, 4, null));
            tUrlImageView.setImageUrl(tabPic.getUrl());
            frameLayout.addView(tUrlImageView);
            this.c = tUrlImageView;
        } else {
            TextView textView = new TextView(getContext());
            textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 16));
            TabModel data3 = getData();
            if (data3 != null) {
                str = data3.getName();
            }
            textView.setText(str);
            textView.setTextSize(0, at4.a.c(aVar, getContext(), 36, false, 4, null));
            frameLayout.addView(textView);
            Integer num = this.f;
            if (num != null) {
                ckf.d(num);
                textView.setTextColor(num.intValue());
            }
            this.d = textView;
        }
        Boolean bool = this.e;
        if (bool != null) {
            ckf.d(bool);
            m(frameLayout, bool.booleanValue());
        }
        return frameLayout;
    }

    public final void m(View view, boolean z) {
        PicModel tabPic;
        PicModel tabPic2;
        PicModel tabPic3;
        PicModel tabPic4;
        PicModel tabPic5;
        PicModel tabPic6;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca2380b2", new Object[]{this, view, new Boolean(z)});
            return;
        }
        TUrlImageView tUrlImageView = this.c;
        TextView textView = this.d;
        if (z) {
            StringBuilder sb = new StringBuilder("已选中，");
            TabModel data = getData();
            sb.append(data != null ? data.getName() : null);
            sb.append(sqj.BUTTON_DESC);
            view.setContentDescription(sb.toString());
            if (tUrlImageView != null) {
                ViewGroup.LayoutParams layoutParams = tUrlImageView.getLayoutParams();
                TabModel data2 = getData();
                layoutParams.width = (data2 == null || (tabPic6 = data2.getTabPic()) == null) ? 0 : tabPic6.getSelectedWidth();
                TabModel data3 = getData();
                if (!(data3 == null || (tabPic5 = data3.getTabPic()) == null)) {
                    i = tabPic5.getSelectedHeight();
                }
                layoutParams.width = i;
                TabModel data4 = getData();
                tUrlImageView.setImageUrl((data4 == null || (tabPic4 = data4.getTabPic()) == null) ? null : tabPic4.getSelectedUrl());
            }
            if (textView != null) {
                textView.setTypeface(null, 1);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("未选中，");
        TabModel data5 = getData();
        sb2.append(data5 != null ? data5.getName() : null);
        sb2.append(sqj.BUTTON_DESC);
        view.setContentDescription(sb2.toString());
        if (tUrlImageView != null) {
            ViewGroup.LayoutParams layoutParams2 = tUrlImageView.getLayoutParams();
            TabModel data6 = getData();
            layoutParams2.width = (data6 == null || (tabPic3 = data6.getTabPic()) == null) ? 0 : tabPic3.getWidth();
            TabModel data7 = getData();
            layoutParams2.width = (data7 == null || (tabPic2 = data7.getTabPic()) == null) ? 0 : tabPic2.getHeight();
            TabModel data8 = getData();
            tUrlImageView.setImageUrl((data8 == null || (tabPic = data8.getTabPic()) == null) ? null : tabPic.getUrl());
        }
        if (textView != null) {
            textView.setTypeface(null, 0);
        }
    }
}
