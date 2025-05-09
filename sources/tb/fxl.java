package tb;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import com.taobao.android.detail.ttdetail.utils.PerformanceUtils;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fxl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f19611a;
    public final ze7 b;
    public final View c;

    static {
        t2o.a(912262108);
    }

    public fxl(Context context, ze7 ze7Var, View view) {
        this.f19611a = context;
        this.b = ze7Var;
        this.c = view;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            PerformanceUtils.h(this.b);
        }
    }

    public final ViewGroup c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("9dd8a4b9", new Object[]{this});
        }
        ViewStub viewStub = (ViewStub) this.c.findViewById(R.id.vs_performance_view_container);
        if (viewStub != null) {
            return (ViewGroup) viewStub.inflate();
        }
        return (ViewGroup) this.c.findViewById(R.id.performance_view_container);
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        if (c().getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public boolean e(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 24) {
            return h();
        }
        if (i != 25) {
            return false;
        }
        return b();
    }

    public final int f(List<Map.Entry<String, Long>> list, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9fb92d35", new Object[]{this, list, new Integer(i), new Integer(i2)})).intValue();
        }
        int i3 = i + 1;
        int i4 = i3;
        while (i3 <= i2) {
            if (list.get(i3).getValue().longValue() < list.get(i).getValue().longValue()) {
                k(list, i3, i4);
                i4++;
            }
            i3++;
        }
        int i5 = i4 - 1;
        k(list, i, i5);
        return i5;
    }

    public final List<Map.Entry<String, Long>> g(List<Map.Entry<String, Long>> list, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3971ff24", new Object[]{this, list, new Integer(i), new Integer(i2)});
        }
        if (i < i2) {
            int f = f(list, i, i2);
            g(list, i, f - 1);
            g(list, f + 1, i2);
        }
        return list;
    }

    public final List<Map.Entry<String, Long>> i(List<Map.Entry<String, Long>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("96ce0571", new Object[]{this, list});
        }
        return g(list, 0, list.size() - 1);
    }

    public final List<Map.Entry<String, Long>> j(Map<String, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("80ba08b0", new Object[]{this, map});
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.addAll(map.entrySet());
        return i(arrayList);
    }

    public final void k(List<Map.Entry<String, Long>> list, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3701d72b", new Object[]{this, list, new Integer(i), new Integer(i2)});
            return;
        }
        list.set(i, list.get(i2));
        list.set(i2, list.get(i));
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9631f0cd", new Object[]{this})).booleanValue();
        }
        if (Boolean.FALSE.equals(DevFeature.mFeature.get(DevFeature.sShowPerformancePanel)) || !d()) {
            return false;
        }
        c().setVisibility(8);
        return true;
    }

    public final boolean h() {
        String str;
        Long l;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebbb9908", new Object[]{this})).booleanValue();
        }
        if (Boolean.FALSE.equals(DevFeature.mFeature.get(DevFeature.sShowPerformancePanel)) || d()) {
            return false;
        }
        ViewGroup c = c();
        Map<String, Long> k = PerformanceUtils.k(this.b);
        if (k != null) {
            ViewGroup viewGroup = (ViewGroup) c.findViewById(R.id.performance_view_real_container);
            viewGroup.removeAllViews();
            long j = -1;
            long j2 = -1;
            for (Map.Entry<String, Long> entry : j(k)) {
                View inflate = LayoutInflater.from(this.f19611a).inflate(R.layout.tt_detail_performance_display_item, c, false);
                TextView textView = (TextView) inflate.findViewById(R.id.tv_performance_delta);
                long longValue = entry.getValue().longValue();
                ((TextView) inflate.findViewById(R.id.tv_performance_stage)).setText(entry.getKey());
                ((TextView) inflate.findViewById(R.id.tv_performance_value)).setText(String.valueOf(longValue));
                if (j <= 0) {
                    str2 = "0";
                } else {
                    str2 = String.valueOf(longValue - j);
                }
                textView.setText(str2);
                if (j2 <= 0) {
                    j2 = longValue;
                }
                viewGroup.addView(inflate);
                j = longValue;
            }
            Map<String, Long> i = PerformanceUtils.i(this.b);
            if (i == null || (l = i.get("lastDxRender")) == null) {
                str = "dx耗时: -1";
            } else {
                str = "dx耗时: " + l;
            }
            Map<String, Long> j3 = PerformanceUtils.j(this.b);
            String str3 = "preRt: -1";
            String str4 = "sRt: -1";
            if (j3 != null) {
                Long l2 = j3.get("preSRT");
                if (l2 != null) {
                    str3 = "preSRt: " + l2;
                }
                Long l3 = j3.get("SRT");
                if (l3 != null) {
                    str4 = "sRt: " + l3;
                }
            }
            ((TextView) this.c.findViewById(R.id.tv_pre_server_rt_time)).setText(str3);
            ((TextView) this.c.findViewById(R.id.tv_server_rt_time)).setText(str4);
            ((TextView) this.c.findViewById(R.id.tv_dx_total_time)).setText(str);
            ((TextView) this.c.findViewById(R.id.tv_tt_detail_total_time)).setText("总耗时: " + (j - j2));
        }
        c.setVisibility(0);
        return true;
    }
}
