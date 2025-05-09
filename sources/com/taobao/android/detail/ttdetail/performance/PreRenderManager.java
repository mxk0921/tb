package com.taobao.android.detail.ttdetail.performance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ff1;
import tb.mr7;
import tb.t2o;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PreRenderManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AsyncViewManager";
    public static final Map<Integer, String> b = new ConcurrentHashMap(1);
    public static final Map<String, PreRenderManager> c = new ConcurrentHashMap(1);
    public static final ArrayList<Integer> d = new ArrayList<Integer>() { // from class: com.taobao.android.detail.ttdetail.performance.PreRenderManager.1
        {
            add(Integer.valueOf(R.layout.tt_detail_horizontal_page_manager));
            add(Integer.valueOf(R.layout.tt_detail_page_manager));
            int i = R.layout.tt_detail_action_bar_search_v3;
            add(Integer.valueOf(i));
            add(Integer.valueOf(i));
            add(Integer.valueOf(R.layout.tt_detail_main_screen_container));
            add(Integer.valueOf(R.layout.tt_detail_gallery_container));
            add(Integer.valueOf(R.layout.tt_detail_frame_component));
            int i2 = R.layout.tt_detail_image_component;
            add(Integer.valueOf(i2));
            add(Integer.valueOf(R.layout.tt_detail_video_controller));
            add(Integer.valueOf(R.layout.tt_detail_live_photo_video_controller));
            add(Integer.valueOf(R.layout.tt_detail_dinamicx_component));
            add(Integer.valueOf(R.layout.tt_detail_pull_start_holder));
            add(Integer.valueOf(R.layout.tt_detail_pull_end_tips));
            add(Integer.valueOf(R.layout.tt_detail_replace_live_float));
            add(Integer.valueOf(R.layout.tt_taodetail_loading_mask));
            int i3 = R.layout.tt_detail_container_divider;
            add(Integer.valueOf(i3));
            add(Integer.valueOf(i3));
            add(Integer.valueOf(R.layout.tt_detail_horizontal_page_manager_pad));
            add(Integer.valueOf(R.layout.tt_detail_divider_with_text_and_icon));
            add(Integer.valueOf(i2));
            add(Integer.valueOf(R.layout.tt_detail_mini_video_drag_wrapper));
            add(Integer.valueOf(R.layout.tt_detail_mini_video_container));
            add(Integer.valueOf(R.layout.tt_detail_biz_mini_video));
            add(Integer.valueOf(R.layout.tt_detail_hint_banner));
            add(Integer.valueOf(R.layout.tt_detail_indication_container));
            add(Integer.valueOf(R.layout.tt_detail_industry_divider));
            add(Integer.valueOf(R.layout.tt_detail_lightoff_container));
            add(Integer.valueOf(R.layout.i18n_tt_detail_lightoff_container));
            add(Integer.valueOf(R.layout.tt_detail_weex1_component));
            add(Integer.valueOf(R.layout.tt_detail_weex2_component));
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final ff1 f6871a;

    static {
        t2o.a(912262109);
    }

    public PreRenderManager(Context context) {
        this.f6871a = new ff1(context);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1265f7b6", new Object[]{str});
        } else {
            c(str, mr7.d());
        }
    }

    public static void c(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b9d8cd2", new Object[]{str, context});
            return;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c;
        if (((PreRenderManager) concurrentHashMap.get(str)) == null) {
            concurrentHashMap.put(str, new PreRenderManager(context));
        }
    }

    public static void d(ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38a55090", new Object[]{ze7Var});
            return;
        }
        int hashCode = ze7Var.c().hashCode();
        String b2 = ze7Var.i().b();
        ((ConcurrentHashMap) b).put(Integer.valueOf(hashCode), b2);
        c(b2, ze7Var.c());
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb874cda", new Object[]{context});
            return;
        }
        String str = (String) ((ConcurrentHashMap) b).remove(Integer.valueOf(context.hashCode()));
        if (str != null) {
            f(str);
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f69798f8", new Object[]{str});
        } else {
            ((ConcurrentHashMap) c).remove(str);
        }
    }

    public static PreRenderManager g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreRenderManager) ipChange.ipc$dispatch("1e966ae1", new Object[]{context});
        }
        String str = (String) ((ConcurrentHashMap) b).get(Integer.valueOf(context.hashCode()));
        if (str != null) {
            return (PreRenderManager) ((ConcurrentHashMap) c).get(str);
        }
        return null;
    }

    public static PreRenderManager h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreRenderManager) ipChange.ipc$dispatch("b583247", new Object[]{str});
        }
        return (PreRenderManager) ((ConcurrentHashMap) c).get(str);
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ca90b11", new Object[]{this, viewGroup});
        } else {
            this.f6871a.a(d, viewGroup);
        }
    }

    public View i(Context context, int i, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bb490b72", new Object[]{this, context, new Integer(i), viewGroup});
        }
        return this.f6871a.b(context, i, viewGroup);
    }

    public View j(Context context, int i, ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b813b0e6", new Object[]{this, context, new Integer(i), viewGroup, new Boolean(z)});
        }
        View b2 = this.f6871a.b(context, i, viewGroup);
        if (!z || b2 != null) {
            return b2;
        }
        return LayoutInflater.from(context).inflate(i, viewGroup, false);
    }
}
