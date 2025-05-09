package tb;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.taobao.R;
import tb.sgc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zja implements sgc.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782807);
        t2o.a(488636482);
    }

    public static boolean b(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c14d80b", new Object[]{new Float(f), new Float(f2)})).booleanValue();
        }
        if (Math.abs(f - f2) <= Math.max(Math.abs(f), Math.abs(f2)) * 1.0E-6f) {
            return true;
        }
        return false;
    }

    @Override // tb.sgc.b
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
        }
    }

    public final View c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7e47029a", new Object[]{this, view});
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof RecyclerView)) {
            view = (View) parent;
            parent = view.getParent();
        }
        return view;
    }

    public final float d(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bfcdc46", new Object[]{this, baseSectionModel})).floatValue();
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext == null) {
            return 0.0f;
        }
        try {
            return ext.getFloatValue("greySaturation");
        } catch (Throwable th) {
            fve.c("GreyFilterServiceImpl", "greySaturation error.", th);
            return 0.0f;
        }
    }

    public boolean e(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4590ae2", new Object[]{this, baseSectionModel})).booleanValue();
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext == null) {
            return false;
        }
        if (ext.getBooleanValue("globalGrey") || ext.getBooleanValue("itemGrey")) {
            return true;
        }
        return false;
    }

    @Override // tb.sgc.b
    public void h(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab94fc2e", new Object[]{this, new Integer(i), view, baseSectionModel});
        }
    }

    @Override // tb.sgc.b
    public void i(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe58018e", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
            return;
        }
        View c = c(view);
        boolean e = e(baseSectionModel);
        float d = d(baseSectionModel);
        int i2 = R.id.grey_view_tag;
        Float f = (Float) c.getTag(i2);
        if (f == null) {
            f = Float.valueOf(1.0f);
        }
        if (e && !b(f.floatValue(), d)) {
            fve.e("GreyFilterServiceImpl", "置灰，position ： " + i + "， saturation :" + d);
            c.setTag(i2, Float.valueOf(d));
            ufw.b(c, d);
        }
        if (!e && !b(f.floatValue(), 1.0f)) {
            fve.e("GreyFilterServiceImpl", "去除置灰，position ： " + i);
            ufw.a(c);
            c.setTag(i2, Float.valueOf(1.0f));
        }
    }

    @Override // tb.sgc.b
    public void o(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4bbbcc6", new Object[]{this, new Integer(i), view, baseSectionModel});
        }
    }
}
