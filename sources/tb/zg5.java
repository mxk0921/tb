package tb;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.android.SystemUtils;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zg5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_INFORMATIONFLOW_WHITE_LIST = "m_h_v5_slider_icons_tag_bindingx_d3,m_r_item_universal_ump_2024,m_home_horizontal_uone_gongge_facex_triple,m_home_horizontal_uone_gongge,m_r_v5_item_d3_ump_2024,cai_ad_ketuo_42_2024,m_r_item_video_2024_d3,m_r_universal_card_2024_d3";
    public static List<String> H0;
    public static Boolean R;
    public static List<String> T;
    public static List<String> V0;
    public static boolean W;
    public static boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public static List<String> f32743a;
    public static List<String> b0;
    public static List<String> b2;
    public static List<String> e;
    public static List<String> h0;
    public static List<String> i;
    public static List<String> j0;
    public static List<String> j2;
    public static boolean k0;
    public static List<String> l0;
    public static JSONObject m0;
    public static List<String> q;
    public static Map<String, Integer> q0;
    public static List<String> s0;
    public static List<String> t;
    public static Boolean t0;
    public static Boolean u0;
    public static Boolean v0;
    public static List<String> x;
    public static List<String> y;
    public static List<String> y0;
    public static List<String> z;
    public static List<String> z0;
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static boolean f = true;
    public static boolean g = true;
    public static boolean h = true;
    public static Boolean j = null;
    public static boolean k = false;
    public static int l = 5;
    public static boolean m = true;
    public static boolean n = true;
    public static boolean o = true;
    public static Boolean p = null;
    public static boolean r = true;
    public static Boolean s = null;
    public static boolean u = true;
    public static boolean v = true;
    public static boolean w = true;
    public static boolean A = true;
    public static boolean B = true;
    public static boolean C = false;
    public static boolean D = true;
    public static List<String> E = new ArrayList();
    public static int F = 30;
    public static boolean G = true;
    public static boolean H = false;
    public static boolean I = true;
    public static boolean J = true;
    public static boolean K = false;
    public static boolean L = true;
    public static boolean M = true;
    public static boolean N = true;
    public static boolean O = true;
    public static boolean P = true;
    public static boolean Q = true;
    public static boolean S = true;
    public static boolean U = true;
    public static List<String> V = new ArrayList();
    public static List<String> X = new ArrayList();
    public static List<String> Y = new ArrayList();
    public static boolean a0 = true;
    public static List<String> c0 = new ArrayList();
    public static boolean d0 = true;
    public static int e0 = 28;
    public static boolean f0 = true;
    public static boolean g0 = true;
    public static boolean i0 = true;
    public static Double n0 = null;
    public static Set<String> o0 = null;
    public static Double p0 = null;
    public static boolean r0 = true;
    public static boolean w0 = true;
    public static boolean x0 = true;
    public static Boolean A0 = null;
    public static Boolean B0 = null;
    public static Boolean C0 = null;
    public static Integer D0 = 3;
    public static Boolean E0 = null;
    public static Boolean F0 = null;
    public static Boolean G0 = null;
    public static Boolean I0 = null;
    public static Boolean J0 = null;
    public static Boolean K0 = null;
    public static Boolean L0 = null;
    public static Boolean M0 = null;
    public static Boolean N0 = null;
    public static Boolean O0 = null;
    public static Boolean P0 = null;
    public static Boolean Q0 = null;
    public static Boolean R0 = null;
    public static Boolean S0 = null;
    public static Boolean T0 = null;
    public static Boolean U0 = null;
    public static Boolean W0 = null;
    public static Boolean X0 = null;
    public static Boolean Y0 = null;
    public static List<String> Z0 = null;
    public static List<String> a1 = null;
    public static JSONArray b1 = null;
    public static int c1 = 20;
    public static Boolean d1 = null;
    public static JSONObject e1 = null;
    public static JSONArray f1 = null;
    public static Boolean g1 = null;
    public static Boolean h1 = null;
    public static Boolean i1 = null;
    public static Boolean j1 = null;
    public static Boolean k1 = null;
    public static Boolean l1 = null;
    public static Boolean m1 = null;
    public static Boolean n1 = null;
    public static Boolean o1 = null;
    public static Boolean p1 = null;
    public static Boolean q1 = null;
    public static Boolean r1 = null;
    public static Boolean s1 = null;
    public static Boolean t1 = null;
    public static Boolean u1 = null;
    public static Boolean v1 = null;
    public static Boolean w1 = null;
    public static Boolean x1 = null;
    public static Boolean y1 = null;
    public static Boolean z1 = null;
    public static Boolean A1 = null;
    public static Boolean B1 = null;
    public static Boolean C1 = null;
    public static Boolean D1 = null;
    public static Boolean E1 = null;
    public static Boolean F1 = null;
    public static List<String> G1 = null;
    public static Boolean H1 = null;
    public static Boolean I1 = null;
    public static Boolean J1 = null;
    public static Boolean K1 = null;
    public static Boolean L1 = null;
    public static Boolean M1 = null;
    public static Boolean N1 = null;
    public static Boolean O1 = null;
    public static Boolean P1 = null;
    public static Boolean Q1 = null;
    public static Boolean R1 = null;
    public static Boolean S1 = null;
    public static Boolean T1 = null;
    public static Boolean U1 = null;
    public static Boolean V1 = null;
    public static Boolean W1 = null;
    public static Boolean k2 = null;
    public static Boolean X1 = null;
    public static Boolean Y1 = null;
    public static Boolean Z1 = null;
    public static Boolean a2 = null;
    public static Boolean c2 = null;
    public static Boolean d2 = null;
    public static Boolean e2 = null;
    public static Boolean f2 = null;
    public static Boolean g2 = null;
    public static Boolean h2 = null;
    public static Boolean i2 = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements rpb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zub f32744a;

        public a(zub zubVar) {
            this.f32744a = zubVar;
        }

        @Override // tb.rpb
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if ("group_dinamicX_common_android".equals(str)) {
                try {
                    zg5.a(Arrays.asList(this.f32744a.getConfig(str, "dinamic_image_impl", "subscription").trim().split(",")));
                    zg5.e(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_image_new_interface", "false").trim()));
                    zg5.A0();
                    zg5.M0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_enable_remote_download_distinct", "true").trim()));
                    zg5.X0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_enable_event_chain_full_trace", "true").trim()));
                    zg5.i1(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_video_control_switch", "true").trim()));
                    zg5.t1(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_remove_all_children", "false").trim()));
                    zg5.E1(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_recycler_layout_prefetch_switch", "true").trim()));
                    zg5.P1(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_image_decide_url", "true").trim()));
                    zg5.a2(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_new_order_skip_auto_size", "true").trim()));
                    zg5.c(Integer.parseInt(this.f32744a.getConfig(str, "dinamic_recycler_layout_sticky_offset", "5").trim()));
                    zg5.o(Arrays.asList(this.f32744a.getConfig(str, "dinamic_dx_expr_vm_biz_list", "guangguang").trim().split(",")));
                    zg5.z(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_enable_widget_view_create_null", "true").trim()));
                    zg5.K(Arrays.asList(this.f32744a.getConfig(str, "dinamic_dx_new_query_node_by_id_white_biz_list", "subscription").trim().split(",")));
                    zg5.V(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_open_fix_tmall_temp_scroll", "true").trim()));
                    zg5.g0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_diff_rate_fix", "true").trim()));
                    zg5.r0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_fix_tab_state", "true").trim()));
                    zg5.x0(Arrays.asList(this.f32744a.getConfig(str, "dinamic_rl_load_more_gone_black_biz_list", "").trim().split(",")));
                    zg5.y0(Arrays.asList(this.f32744a.getConfig(str, "dinamic_video_control_expand_black_biz_list", "guess,homepage,mytaobao").trim().split(",")));
                    zg5.P0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_fix_image_api_sequence", "true").trim()));
                    zg5.B0(Arrays.asList(this.f32744a.getConfig(str, "dinamic_fix_nested_scroll_state_black_biz_list", "").trim().split(",")));
                    zg5.C0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_renderManagerIndexOut", "true").trim()));
                    zg5.D0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_useNewEventChainContext", "false").trim()));
                    zg5.E0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_use_new_eventchain_list", "true").trim()));
                    zg5.F0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_fix_event_chain_data_parser_reflection", "true").trim()));
                    zg5.G0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_checkEventChainExecuteThread", "true").trim()));
                    zg5.H = Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_needThrowException", "false").trim());
                    zg5.H0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_fix_viewpager_broadcast", "true").trim()));
                    zg5.I0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_enable_textview_font_padding", "true").trim()));
                    zg5.J0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_enable_block_metric", "false").trim()));
                    zg5.K0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_optimiseUpdateWithActions", "true").trim()));
                    zg5.L0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_supportUpdateItemWithDataOption", "true").trim()));
                    zg5.N0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_fixGridLayoutPartRefresh", "true").trim()));
                    zg5.O0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_supportOtherContainerParser", "true").trim()));
                    zg5.S0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_engineContextWeak", "true").trim()));
                    zg5.Q0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_optimiseTemplateManager", "true").trim()));
                    zg5.R0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_optimiseTemplateData", "true").trim()));
                    zg5.f1(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_openGoneViewRecycle", "false").trim()));
                    zg5.T0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_openFoldDevicesScreenType", "true").trim()));
                    zg5.U0(Arrays.asList(this.f32744a.getConfig(str, "dinamic_supportViewReuseList", "subscription,alimp_message,iCart,mytaobao,live_channel_flexalocal,live_channel_flexaremote").trim().split(",")));
                    zg5.V0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_enable_video_play_validate", "true").trim()));
                    zg5.W0(Arrays.asList(this.f32744a.getConfig(str, "dinamic_rl_refresh_perf_white_list", "alimp_message").trim().split(",")));
                    zg5.Y0(Arrays.asList(this.f32744a.getConfig(str, "dinamic_reload_temp_root_not_layout_white_list", "").trim().split(",")));
                    zg5.Z0(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_report_root_not_layout", "false").trim()));
                    zg5.a1(Arrays.asList(this.f32744a.getConfig(str, "dinamic_sync_widget_map_white_list", "").trim().split(",")));
                    zg5.b1(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_enable_read_write_widget_map", "false").trim()));
                    zg5.c1(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_sync_report_widget_map", "true").trim()));
                    zg5.d1(Arrays.asList(this.f32744a.getConfig(str, "dinamic_dx2_pre_render_black_list", "").trim().split(",")));
                    zg5.e1(Arrays.asList(this.f32744a.getConfig(str, "dinamic_dx3_pre_render_black_list", "").trim().split(",")));
                    zg5.A1(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_enable_dx2_pre_render", "true").trim()));
                    zg5.g1(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_enable_dx3_pre_render", "true").trim()));
                    zg5.h1(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_clearTextViewLeakCache", "true").trim()));
                    zg5.j1(Integer.parseInt(this.f32744a.getConfig(str, "dinamic_pre_render_min_os_version", String.valueOf(28)).trim()));
                    zg5.k1(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_opt_expose_logic", "true").trim()));
                    zg5.l1(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_optimizeScrollTouch", "true").trim()));
                    zg5.m1(Arrays.asList(this.f32744a.getConfig(str, "dinamic_fix_tab_render_scroll_white_list", "subscription").trim().split(",")));
                    zg5.n1(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_fix_gif_corner", "true").trim()));
                    zg5.o1(Arrays.asList(this.f32744a.getConfig(str, "dinamic_fix_scroll_conflict_with_angle_white_list", "subscription").trim().split(",")));
                    zg5.p1(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_fix_tmall_multi_tab_sticky", "true").trim()));
                    zg5.q1(Arrays.asList(this.f32744a.getConfig(str, "dinamic_render_view_child_empty_monitor_white_list", "subscription").trim().split(",")));
                    zg5.r1(Arrays.asList(this.f32744a.getConfig(str, "dinamic_fix_part_refresh_error", "subscription").trim().split(",")));
                    zg5.s1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_dx_cancel_old_event_chain", "true").trim())));
                    zg5.u1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "supportSourceAutoId", "true").trim())));
                    hc6.e(DinamicXEngine.x(), "dinamic_original_widget_cache_white_list", this.f32744a.getConfig(str, "dinamic_original_widget_cache_white_list", "").trim());
                    zg5.v1(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_fix_view_reuse_pool_config_null", "true").trim()));
                    zg5.w1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_fix_security", "true").trim())));
                    zg5.x1(Integer.valueOf(Integer.parseInt(this.f32744a.getConfig(str, "dinamic_viewpager_low_memory_keep_size", "3").trim())));
                    zg5.y1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "config_image_enable_size_in_layout_params", "false").trim())));
                    zg5.z1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "config_container_expose_state_store", "true").trim())));
                    zg5.e4(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "config_fix_datasource_manager_clone", "true").trim())));
                    zg5.B1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "config_fix_measure_on_layout", "true").trim())));
                    zg5.C1(Arrays.asList(this.f32744a.getConfig(str, "dinamic_fix_swipe_refresh_reach_top", "live_channel").trim().split(",")));
                    zg5.D1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_fixControlEventCenterCrash", "true").trim())));
                    zg5.F1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_fixSimplePipelineViewRef", "true").trim())));
                    zg5.G1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_fixVideoControlFindViewPositionCrash", "true").trim())));
                    zg5.H1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_fix_vp_refresh_bug", "true").trim())));
                    zg5.I1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_fix_simple_parse_bug", "true").trim())));
                    zg5.J1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_fix_nestedscorllview_scroll", "true").trim())));
                    zg5.K1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_rl_event_cancel_not_same_node", "true").trim())));
                    zg5.L1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_fix_scroll_listener_rl_instance", "true").trim())));
                    zg5.M1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_fix_sticky_bug", "true").trim())));
                    zg5.N1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "needCheckPreRenderManufacturer", "true").trim())));
                    zg5.O1(Arrays.asList(this.f32744a.getConfig(str, "dinamic_template_reuse_auto_white_list", "alimp_message").trim().split(",")));
                    zg5.Q1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_fix_refresh_layout_load_more_gesture", "true").trim())));
                    zg5.R1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_fix_sticky_nested_scroll", "true").trim())));
                    zg5.S1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_stop_signal_background", "true").trim())));
                    zg5.T1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_enable_auto_play_control_for_rLEvent", "true").trim())));
                    zg5.U1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_deep_clone_bindingx_args", "true").trim())));
                    zg5.V1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_support_rl_update_items_refresh_part", "true").trim())));
                    zg5.W1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_bugfix_for_download", "true").trim())));
                    zg5.X1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_bugfix_for_viewpager", "true").trim())));
                    zg5.Y1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_bugfix_for_post_event_concurrent_modify", "true").trim())));
                    zg5.Z1(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_const_fix_refresh_vp_nest", "true").trim())));
                    zg5.b2(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_thread_optimize", "true").trim())));
                    zg5.c2(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_new_rich_text_image_interface", "true").trim())));
                    zg5.d2(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_node_parser_on_process_remote_templte", "true").trim())));
                    zg5.e2(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_need_check_sdk_init", "true").trim())));
                    zg5.f2(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_open_optimize_ab", "true").trim())));
                    zg5.g2(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_open_optimize_ab", "true").trim())));
                    zg5.h2(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_open_optimize_launcher", "true").trim())));
                    zg5.i2(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_open_fetch_template_log", "true").trim())));
                    zg5.j2(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_fix_sticky_holder_scrap", "true").trim())));
                    zg5.b(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_close_low_phone_app_monitor", "true").trim())));
                    zg5.d(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_close_low_phone_app_monitor_2", "false").trim())));
                    zg5.f(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_bugfix_for_download_file_write", "true").trim())));
                    zg5.g(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_bugfix_for_countdown", "true").trim())));
                    zg5.h(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_download_optimize", "true").trim())));
                    zg5.i(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_prerender_recyclerlayout", "true").trim())));
                    zg5.j(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_enable_imageSpan_adaptive_radio", "true").trim())));
                    zg5.k(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_merge_download_optimize", "true").trim())));
                    zg5.l(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_virtual_thread_access", "true").trim())));
                    zg5.m(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_tabheader_optimize", "true").trim())));
                    zg5.n(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_embad_template_bugfix", "true").trim())));
                    zg5.p(Arrays.asList(this.f32744a.getConfig(str, "dinamic_fix_update_rl_gap", "live_channel_flexaremote,live_channel_flexalocal,live_channel").trim().split(",")));
                    zg5.q(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamicRecyclerlayoutSaveinstanceBugfix", "true").trim())));
                    zg5.r(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamicFixThreadLocalPipeline", "true").trim())));
                    zg5.s(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamic_fix_preRender_judgment", "true").trim())));
                    zg5.t(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamicNeedClosePrefetch", "true").trim())));
                    zg5.u(Boolean.valueOf(Boolean.parseBoolean(this.f32744a.getConfig(str, "dinamicAutoLoopLongTime", "true").trim())));
                    hc6.e(DinamicXEngine.x(), "dx_butter_enable", this.f32744a.getConfig(str, "dx_butter_enable", "true").trim());
                } catch (Throwable th) {
                    xv5.b(th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements rpb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zub f32745a;

        public b(zub zubVar) {
            this.f32745a = zubVar;
        }

        @Override // tb.rpb
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if ("group_dinamicx_textview".equals(str)) {
                zg5.v(Boolean.parseBoolean(this.f32745a.getConfig("group_dinamicx_textview", "dx_textview_font_ut_switch", "false")));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements rpb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zub f32746a;

        public c(zub zubVar) {
            this.f32746a = zubVar;
        }

        @Override // tb.rpb
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if ("group_dinamicx_elder".equals(str)) {
                try {
                    zg5.w(Arrays.asList(this.f32746a.getConfig(str, "dinamic_elder_white_list", "purchase").trim().split(",")));
                } catch (Throwable th) {
                    xv5.b(th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements rpb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zub f32747a;

        public d(zub zubVar) {
            this.f32747a = zubVar;
        }

        @Override // tb.rpb
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if ("group_dinamicx_image_corner".equals(str)) {
                try {
                    zg5.x(Boolean.parseBoolean(this.f32747a.getConfig(str, "dinamic_fix_image_corner", "false").trim()));
                } catch (Throwable th) {
                    xv5.b(th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e implements rpb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zub f32748a;

        public e(zub zubVar) {
            this.f32748a = zubVar;
        }

        @Override // tb.rpb
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if ("group_dinamicx_rl_mem_perf".equals(str)) {
                try {
                    zg5.y(Arrays.asList(this.f32748a.getConfig(str, "dinamic_rl_mem_perf_white_list", "").trim().split(",")));
                    zg5.A(Integer.parseInt(this.f32748a.getConfig(str, "dinamic_rl_mem_perf_lru_count", "30").trim()));
                    hc6.e(DinamicXEngine.x(), "dinamic_enable_enable_life_cycle_monitor", this.f32748a.getConfig("group_dinamicx_rl_mem_perf", "dinamic_enable_enable_life_cycle_monitor", "false").trim());
                    hc6.e(DinamicXEngine.x(), "dinamic_enable_low_memory_monitor", this.f32748a.getConfig("group_dinamicx_rl_mem_perf", "dinamic_enable_low_memory_monitor", "false").trim());
                    hc6.e(DinamicXEngine.x(), "dinamic_enable_low_memory_callback", this.f32748a.getConfig("group_dinamicx_rl_mem_perf", "dinamic_enable_low_memory_callback", "false").trim());
                } catch (Throwable th) {
                    xv5.b(th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class f implements rpb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zub f32749a;

        public f(zub zubVar) {
            this.f32749a = zubVar;
        }

        @Override // tb.rpb
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if ("group_dinamicx_new_refresh_layout".equals(str)) {
                try {
                    zg5.B(Arrays.asList(this.f32749a.getConfig(str, "dinamic_new_refresh_layout_white_list", "alimp_message").trim().split(",")));
                } catch (Throwable th) {
                    xv5.b(th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class g implements rpb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zub f32750a;

        public g(zub zubVar) {
            this.f32750a = zubVar;
        }

        @Override // tb.rpb
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if ("group_dinamicx_new_pipeline_cache".equals(str)) {
                try {
                    zg5.C(Boolean.parseBoolean(this.f32750a.getConfig(str, "dinamic_enable_open_pipline_cache", "false").trim()));
                    zg5.D(Arrays.asList(this.f32750a.getConfig(str, "dinamic_new_pipeline_cache_white_list", "").trim().split(",")));
                    String trim = this.f32750a.getConfig(str, "dinamic_sub_biztype_config", "").trim();
                    if (!TextUtils.isEmpty(trim)) {
                        zg5.E(JSON.parseObject(trim));
                    }
                } catch (Throwable th) {
                    xv5.b(th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class h implements rpb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zub f32751a;

        public h(zub zubVar) {
            this.f32751a = zubVar;
        }

        @Override // tb.rpb
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if ("group_dinamicx_storage_perf".equals(str)) {
                try {
                    zg5.F(Boolean.valueOf(Boolean.parseBoolean(this.f32751a.getConfig(str, "dinamic_enable_storage_perf", "false").trim())));
                    zg5.G(Arrays.asList(this.f32751a.getConfig(str, "dinamic_storage_perf_white_list", "").trim().split(",")));
                    zg5.H(Arrays.asList(this.f32751a.getConfig(str, "dinamic_storage_perf_dirty_biztype_white_list", "").trim().split(",")));
                    zg5.I(Boolean.valueOf(Boolean.parseBoolean(this.f32751a.getConfig(str, "dinamic_filter_dirty_template", "true").trim())));
                    zg5.J(JSON.parseObject(this.f32751a.getConfig(str, "dinamic_global_config", "{}").trim()));
                    String trim = this.f32751a.getConfig(str, "dinamic_storage_perf_black_list", "{}").trim();
                    if (trim != null) {
                        zg5.L(JSON.parseArray(trim));
                    }
                    String trim2 = this.f32751a.getConfig(str, "dinamic_template_clear_white_list", "{}").trim();
                    if (trim2 != null) {
                        zg5.M(JSON.parseArray(trim2));
                    }
                    zg5.N(Integer.parseInt(this.f32751a.getConfig(str, "dinamic_storage_template_report_size", ct2.COLOR_TAG_NOT_ZCACHE_RESOURCE).trim()));
                    zg5.O(Boolean.valueOf(Boolean.parseBoolean(this.f32751a.getConfig(str, "dinamic_storage_perf_clean", "false").trim())));
                } catch (Throwable th) {
                    xv5.b(th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class i implements rpb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zub f32752a;

        public i(zub zubVar) {
            this.f32752a = zubVar;
        }

        @Override // tb.rpb
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if ("group_dinamicX_common_android_2".equals(str)) {
                zg5.P(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamicFixRepeatRender", "false").trim())));
                zg5.Q(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamicFixRLInsertUserId", "true").trim())));
                zg5.R(Double.valueOf(Double.parseDouble(this.f32752a.getConfig(str, "dinamic_dxappmonitor_sample", "0.001").trim())));
                zg5.S(new HashSet(Arrays.asList(this.f32752a.getConfig(str, "dinamic_target_performance_template_list", "").trim().split(","))));
                zg5.T(Double.valueOf(Double.parseDouble(this.f32752a.getConfig(str, "dinamic_target_performance_template_sample", "0.001").trim())));
                zg5.U(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamicFixSliderExpose", "true").trim())));
                zg5.W(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamicFlattenOpt", "true").trim())));
                zg5.X(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamicLanguageOpt", "false").trim())));
                zg5.Y(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamicFixScrollChildVideo", "true").trim())));
                zg5.Z(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamicLanguagebugfix", "true").trim())));
                zg5.a0(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamicLanguagePerfOpt", "true").trim())));
                zg5.b0(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamicLanguageLogSwitch", "false").trim())));
                zg5.c0(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamicLanguageLoaderSwitch", "false").trim())));
                zg5.d0(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamicThrowImageCrash", "true").trim())));
                zg5.e0(Arrays.asList(this.f32752a.getConfig(str, "dinamic_image_black_list", "informationFlow,homepage,live_channel_flexalocal,live_channel_flexaremote").trim().split(",")));
                zg5.f0(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamic_enable_measurecache", "true").trim())));
                zg5.h0(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamic_uikit_iconfont_mapping", "true").trim())));
                zg5.i0(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamic_fix_mega_thread", "true").trim())));
                zg5.j0(Arrays.asList(this.f32752a.getConfig(str, "dinamic_video_view_switch_control_list", "").trim().split(",")));
                zg5.k0(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamicDataExpressionOpt", "false").trim())));
                zg5.l0(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamic_zoomable_imageview_control", "true").trim())));
                zg5.m0(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamicRemoveAKDependency", "true").trim())));
                zg5.n0(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamicPreDownloadOpen", "true").trim())));
                zg5.o0(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "removeWhenFileIsInvalid", "true").trim())));
                zg5.p0(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "closeAsynRenderPrefetch", "true").trim())));
                zg5.q0(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamic_bugfixForSearch", "true").trim())));
                zg5.s0(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamicLanguageLoaderSwitch", "true").trim())));
                zg5.t0(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamicAsyncMeasureOpt", "true").trim())));
                zg5.u0(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamicAsyncLayoutOpt", "true").trim())));
                zg5.v0(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamicOpenGrayOpt", "true").trim())));
                zg5.w0(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamicLayoutOpt", "true").trim())));
                zg5.z0(Boolean.valueOf(Boolean.parseBoolean(this.f32752a.getConfig(str, "dinamicOpenTmpLifecycle", "true").trim())));
                zg5.V4(Arrays.asList(this.f32752a.getConfig(str, "enableImageHeightScaleBizTypeList", "").trim().split(",")));
            }
        }
    }

    static {
        t2o.a(444596652);
        new ArrayList();
    }

    public static /* synthetic */ int A(int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e91bd9d", new Object[]{new Integer(i3)})).intValue();
        }
        F = i3;
        return i3;
    }

    public static /* synthetic */ void A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a27df9", new Object[0]);
        } else {
            i3();
        }
    }

    public static /* synthetic */ boolean A1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76b4b82b", new Object[]{new Boolean(z2)})).booleanValue();
        }
        return z2;
    }

    public static boolean A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("999ca47e", new Object[0])).booleanValue();
        }
        if (h2 == null) {
            h2 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamicLanguageLoaderSwitch", "true").trim()));
        }
        return h2.booleanValue();
    }

    public static boolean A3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b183565f", new Object[0])).booleanValue();
        }
        if (K1 == null) {
            K1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamicNeedClosePrefetch", "true").trim()));
        }
        return K1.booleanValue();
    }

    public static boolean A4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e305d408", new Object[0])).booleanValue();
        }
        return w;
    }

    public static boolean A5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24448b8b", new Object[0])).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ List B(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("560ae3c", new Object[]{list});
        }
        h0 = list;
        return list;
    }

    public static /* synthetic */ List B0(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("35ff03cf", new Object[]{list});
        }
        z = list;
        return list;
    }

    public static /* synthetic */ Boolean B1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("b9c3245f", new Object[]{bool});
        }
        G0 = bool;
        return bool;
    }

    public static final boolean B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5925b190", new Object[0])).booleanValue();
        }
        if (z1 == null) {
            z1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_download_optimize", "true").trim()));
        }
        return z1.booleanValue();
    }

    public static boolean B3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ca1eec4", new Object[0])).booleanValue();
        }
        if (p1 == null) {
            p1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_node_parser_on_process_remote_templte", "true").trim()));
        }
        return p1.booleanValue();
    }

    public static boolean B4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adc9a7d3", new Object[0])).booleanValue();
        }
        return u;
    }

    public static boolean B5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d218caa7", new Object[0])).booleanValue();
        }
        if (k2 == null) {
            k2 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamicOpenGrayOpt", "true").trim()));
        }
        return k2.booleanValue();
    }

    public static /* synthetic */ boolean C(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de54573d", new Object[]{new Boolean(z2)})).booleanValue();
        }
        k0 = z2;
        return z2;
    }

    public static /* synthetic */ boolean C0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7703a010", new Object[]{new Boolean(z2)})).booleanValue();
        }
        A = z2;
        return z2;
    }

    public static /* synthetic */ List C1(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c5ea626a", new Object[]{list});
        }
        H0 = list;
        return list;
    }

    public static boolean C2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d15a6d9", new Object[0])).booleanValue();
        }
        if (T0 == null) {
            T0 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_enable_auto_play_control_for_rLEvent", "true").trim()));
        }
        return T0.booleanValue();
    }

    public static boolean C3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16c3e99d", new Object[0])).booleanValue();
        }
        if (Z1 == null) {
            Z1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamicLanguageLogSwitch", "false").trim()));
        }
        return Z1.booleanValue();
    }

    public static boolean C4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4ed478f", new Object[0])).booleanValue();
        }
        return I;
    }

    public static /* synthetic */ List D(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c805e77a", new Object[]{list});
        }
        l0 = list;
        return list;
    }

    public static /* synthetic */ boolean D0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dee4ccef", new Object[]{new Boolean(z2)})).booleanValue();
        }
        C = z2;
        return z2;
    }

    public static /* synthetic */ Boolean D1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("3d009be8", new Object[]{bool});
        }
        I0 = bool;
        return bool;
    }

    public static boolean D3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c03a28f", new Object[0])).booleanValue();
        }
        if (Y1 == null) {
            Y1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamicLanguagePerfOpt", "true").trim()));
        }
        return Y1.booleanValue();
    }

    public static boolean D4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1fa3bd9", new Object[0])).booleanValue();
        }
        return S;
    }

    public static /* synthetic */ JSONObject E(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2a188c33", new Object[]{jSONObject});
        }
        m0 = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ boolean E0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46c5f9ce", new Object[]{new Boolean(z2)})).booleanValue();
        }
        B = z2;
        return z2;
    }

    public static /* synthetic */ boolean E1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b87d8598", new Object[]{new Boolean(z2)})).booleanValue();
        }
        m = z2;
        return z2;
    }

    public static boolean E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a36c252e", new Object[0])).booleanValue();
        }
        return N;
    }

    public static boolean E3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45b296b7", new Object[0])).booleanValue();
        }
        if (o1 == null) {
            o1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_thread_optimize", "true").trim()));
        }
        return o1.booleanValue();
    }

    public static boolean E4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52d860b", new Object[0])).booleanValue();
        }
        return n;
    }

    public static /* synthetic */ Boolean F(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("af8fd98c", new Object[]{bool});
        }
        Y0 = bool;
        return bool;
    }

    public static /* synthetic */ boolean F0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aea726ad", new Object[]{new Boolean(z2)})).booleanValue();
        }
        G = z2;
        return z2;
    }

    public static /* synthetic */ Boolean F1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("ffed0547", new Object[]{bool});
        }
        J0 = bool;
        return bool;
    }

    public static boolean F2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8403171c", new Object[0])).booleanValue();
        }
        if (E1 == null) {
            E1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamic_fix_mega_thread", "true").trim()));
        }
        return E1.booleanValue();
    }

    public static boolean F3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf2e14b4", new Object[0])).booleanValue();
        }
        if (D1 == null) {
            D1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamic_uikit_iconfont_mapping", "true").trim()));
        }
        return D1.booleanValue();
    }

    public static boolean F4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("108b965c", new Object[0])).booleanValue();
        }
        return o;
    }

    public static /* synthetic */ List G(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ebfdbd57", new Object[]{list});
        }
        Z0 = list;
        return list;
    }

    public static /* synthetic */ boolean G0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1688538c", new Object[]{new Boolean(z2)})).booleanValue();
        }
        D = z2;
        return z2;
    }

    public static /* synthetic */ Boolean G1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("c2d96ea6", new Object[]{bool});
        }
        K0 = bool;
        return bool;
    }

    public static boolean G2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c2e407c", new Object[0])).booleanValue();
        }
        if (N0 == null) {
            N0 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_fix_nestedscorllview_scroll", "true").trim()));
        }
        return N0.booleanValue();
    }

    public static boolean G3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57186ff0", new Object[0])).booleanValue();
        }
        if (p == null) {
            p = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamic_enable_measurecache", "true").trim()));
        }
        return p.booleanValue();
    }

    public static boolean G4(String str) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ad9076d", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (list = x) == null || list.isEmpty()) {
            return true;
        }
        return !x.contains(str);
    }

    public static /* synthetic */ List H(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4d5059f6", new Object[]{list});
        }
        a1 = list;
        return list;
    }

    public static /* synthetic */ boolean H0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e69806b", new Object[]{new Boolean(z2)})).booleanValue();
        }
        I = z2;
        return z2;
    }

    public static /* synthetic */ Boolean H1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("85c5d805", new Object[]{bool});
        }
        L0 = bool;
        return bool;
    }

    public static boolean H2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("684e9309", new Object[0])).booleanValue();
        }
        if (W0 == null) {
            W0 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_fix_refresh_layout_load_more_gesture", "true").trim()));
        }
        return W0.booleanValue();
    }

    public static boolean H3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6363b39b", new Object[0])).booleanValue();
        }
        return K;
    }

    public static boolean H4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59938b9f", new Object[0])).booleanValue();
        }
        return m;
    }

    public static /* synthetic */ Boolean I(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("f85515a9", new Object[]{bool});
        }
        g1 = bool;
        return bool;
    }

    public static /* synthetic */ boolean I0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e64aad4a", new Object[]{new Boolean(z2)})).booleanValue();
        }
        J = z2;
        return z2;
    }

    public static /* synthetic */ Boolean I1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("48b24164", new Object[]{bool});
        }
        M0 = bool;
        return bool;
    }

    public static boolean I2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92a89b", new Object[0])).booleanValue();
        }
        if (m1 == null) {
            m1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_const_fix_refresh_vp_nest", "true").trim()));
        }
        return m1.booleanValue();
    }

    public static boolean I3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a061a1b8", new Object[0])).booleanValue();
        }
        if (i2 == null) {
            i2 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dx_butter_enable", "true").trim()));
        }
        return i2.booleanValue();
    }

    public static boolean I4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb0c1aa1", new Object[0])).booleanValue();
        }
        return h;
    }

    public static /* synthetic */ JSONObject J(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("65aeead9", new Object[]{jSONObject});
        }
        e1 = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ boolean J0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e2bda29", new Object[]{new Boolean(z2)})).booleanValue();
        }
        K = z2;
        return z2;
    }

    public static /* synthetic */ Boolean J1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("b9eaac3", new Object[]{bool});
        }
        N0 = bool;
        return bool;
    }

    public static boolean J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78b4c480", new Object[0])).booleanValue();
        }
        if (C0 == null) {
            C0 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_fix_security", "true").trim()));
        }
        return C0.booleanValue();
    }

    public static boolean J3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d40202f", new Object[0])).booleanValue();
        }
        if (S1 == null) {
            S1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamicDataExpressionOpt", "false").trim()));
        }
        return S1.booleanValue();
    }

    public static boolean J4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7b286d6", new Object[0])).booleanValue();
        }
        return i0;
    }

    public static /* synthetic */ List K(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("90f5e26b", new Object[]{list});
        }
        t = list;
        return list;
    }

    public static /* synthetic */ boolean K0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b60d0708", new Object[]{new Boolean(z2)})).booleanValue();
        }
        L = z2;
        return z2;
    }

    public static /* synthetic */ Boolean K1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("ce8b1422", new Object[]{bool});
        }
        O0 = bool;
        return bool;
    }

    public static boolean K2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fbd1e93", new Object[0])).booleanValue();
        }
        if (M0 == null) {
            M0 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_fix_simple_parse_bug", "true").trim()));
        }
        return M0.booleanValue();
    }

    public static boolean K3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d431d394", new Object[]{str})).booleanValue();
        }
        if (a1 == null) {
            a1 = Arrays.asList(hc6.a("group_dinamicx_storage_perf", "dinamic_storage_perf_dirty_biztype_white_list", "").trim().split(","));
        }
        return a1.contains(str);
    }

    public static boolean K4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6e6c814", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (X == null) {
            X = new ArrayList();
        }
        return X.contains(str);
    }

    public static /* synthetic */ JSONArray L(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("2a26dfbe", new Object[]{jSONArray});
        }
        b1 = jSONArray;
        return jSONArray;
    }

    public static /* synthetic */ boolean L0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a366e232", new Object[]{new Boolean(z2)})).booleanValue();
        }
        M = z2;
        return z2;
    }

    public static /* synthetic */ Boolean L1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("91777d81", new Object[]{bool});
        }
        P0 = bool;
        return bool;
    }

    public static boolean L2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("790d74c1", new Object[0])).booleanValue();
        }
        if (Q0 == null) {
            Q0 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_fix_sticky_bug", "true").trim()));
        }
        return Q0.booleanValue();
    }

    public static boolean L3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc1b9fc", new Object[]{str})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= e0) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return d0;
        }
        if (c0 == null) {
            c0 = new ArrayList();
        }
        if (!d0 || c0.contains(str)) {
            return false;
        }
        return true;
    }

    public static boolean L4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd4571d", new Object[0])).booleanValue();
        }
        return k;
    }

    public static /* synthetic */ JSONArray M(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("6307405d", new Object[]{jSONArray});
        }
        f1 = jSONArray;
        return jSONArray;
    }

    public static /* synthetic */ boolean M0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18f8d21c", new Object[]{new Boolean(z2)})).booleanValue();
        }
        f = z2;
        return z2;
    }

    public static /* synthetic */ Boolean M1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("5463e6e0", new Object[]{bool});
        }
        Q0 = bool;
        return bool;
    }

    public static boolean M2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a773fad", new Object[0])).booleanValue();
        }
        if (X0 == null) {
            X0 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_fix_sticky_nested_scroll", "true").trim()));
        }
        return X0.booleanValue();
    }

    public static boolean M3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffd599ca", new Object[0])).booleanValue();
        }
        if (eb5.E()) {
            return true;
        }
        Boolean bool = v0;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(Boolean.parseBoolean(hc6.c(DinamicXEngine.x(), "dinamic_enable_enable_life_cycle_monitor", "false")));
            v0 = valueOf;
            return valueOf.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean M4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eaaabaa5", new Object[0])).booleanValue();
        }
        return a0;
    }

    public static /* synthetic */ int N(int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7298865c", new Object[]{new Integer(i3)})).intValue();
        }
        c1 = i3;
        return i3;
    }

    public static /* synthetic */ boolean N0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b480f11", new Object[]{new Boolean(z2)})).booleanValue();
        }
        N = z2;
        return z2;
    }

    public static /* synthetic */ Boolean N1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("1750503f", new Object[]{bool});
        }
        R0 = bool;
        return bool;
    }

    public static boolean N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ae02b3d", new Object[0])).booleanValue();
        }
        if (R == null) {
            R = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_fix_sticky_holder_scrap", "true").trim()));
        }
        return R.booleanValue();
    }

    public static boolean N3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f14af793", new Object[0])).booleanValue();
        }
        return G;
    }

    public static boolean N4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78d766d9", new Object[0])).booleanValue();
        }
        return r;
    }

    public static /* synthetic */ Boolean O(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("c457c94f", new Object[]{bool});
        }
        d1 = bool;
        return bool;
    }

    public static /* synthetic */ boolean O0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73293bf0", new Object[]{new Boolean(z2)})).booleanValue();
        }
        O = z2;
        return z2;
    }

    public static /* synthetic */ List O1(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ec04cf55", new Object[]{list});
        }
        V0 = list;
        return list;
    }

    public static boolean O2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d4ec479", new Object[0])).booleanValue();
        }
        if (J1 == null) {
            J1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamicFixThreadLocalPipeline", "true").trim()));
        }
        return J1.booleanValue();
    }

    public static boolean O3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7d06c8a", new Object[0])).booleanValue();
        }
        return g;
    }

    public static boolean O4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e524ca5b", new Object[0])).booleanValue();
        }
        if (A0 == null) {
            A0 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_dx_cancel_old_event_chain", "true").trim()));
        }
        return A0.booleanValue();
    }

    public static /* synthetic */ Boolean P(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("874432ae", new Object[]{bool});
        }
        M1 = bool;
        return bool;
    }

    public static /* synthetic */ boolean P0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21c89807", new Object[]{new Boolean(z2)})).booleanValue();
        }
        return z2;
    }

    public static /* synthetic */ boolean P1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("205eb277", new Object[]{new Boolean(z2)})).booleanValue();
        }
        n = z2;
        return z2;
    }

    public static boolean P2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c5ebd3", new Object[]{str})).booleanValue();
        }
        if (G1 == null) {
            G1 = Arrays.asList(hc6.a("group_dinamicX_common_android", "dinamic_fix_update_rl_gap", "live_channel_flexaremote,live_channel_flexalocal,live_channel").trim().split(","));
        }
        return G1.contains(str);
    }

    public static boolean P3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c137198", new Object[0])).booleanValue();
        }
        if (s == null) {
            s = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_enable_imageSpan_adaptive_radio", "true").trim()));
        }
        return s.booleanValue();
    }

    public static boolean P4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d651656", new Object[0])).booleanValue();
        }
        if (O0 == null) {
            O0 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_rl_event_cancel_not_same_node", "true").trim()));
        }
        return O0.booleanValue();
    }

    public static /* synthetic */ Boolean Q(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("4a309c0d", new Object[]{bool});
        }
        N1 = bool;
        return bool;
    }

    public static /* synthetic */ boolean Q0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42eb95ae", new Object[]{new Boolean(z2)})).booleanValue();
        }
        P = z2;
        return z2;
    }

    public static /* synthetic */ Boolean Q1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("9a8dc7c8", new Object[]{bool});
        }
        W0 = bool;
        return bool;
    }

    public static JSONObject Q2(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8215e9ca", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || (jSONObject = m0) == null || !jSONObject.containsKey(str)) {
            return null;
        }
        try {
            return m0.getJSONObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean Q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e072ff18", new Object[0])).booleanValue();
        }
        if (eb5.E()) {
            return true;
        }
        Boolean bool = t0;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(Boolean.parseBoolean(hc6.c(DinamicXEngine.x(), "dinamic_enable_low_memory_callback", "false")));
            t0 = valueOf;
            return valueOf.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean Q4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40dcbadc", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (V == null) {
            ArrayList arrayList = new ArrayList();
            V = arrayList;
            arrayList.add("alimp_message");
        }
        return V.contains(str);
    }

    public static /* synthetic */ Double R(Double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("700cfe78", new Object[]{d3});
        }
        n0 = d3;
        return d3;
    }

    public static /* synthetic */ boolean R0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aaccc28d", new Object[]{new Boolean(z2)})).booleanValue();
        }
        Q = z2;
        return z2;
    }

    public static /* synthetic */ Boolean R1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("5d7a3127", new Object[]{bool});
        }
        X0 = bool;
        return bool;
    }

    public static Double R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("10d017ac", new Object[0]);
        }
        try {
            if (n0 == null) {
                n0 = Double.valueOf(Double.parseDouble(hc6.a("group_dinamicX_common_android_2", "dinamic_dxappmonitor_sample", "0.001").trim()));
            }
            if (n0.doubleValue() < vu3.b.GEO_NOT_SUPPORT || n0.doubleValue() > 1.0d) {
                n0 = Double.valueOf(0.001d);
            }
        } catch (Throwable unused) {
            n0 = Double.valueOf(0.001d);
        }
        return n0;
    }

    public static boolean R3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc97471d", new Object[0])).booleanValue();
        }
        Boolean bool = u0;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(Boolean.parseBoolean(hc6.c(DinamicXEngine.x(), "dinamic_enable_low_memory_monitor", "false")));
            u0 = valueOf;
            return valueOf.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean R4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbe201ed", new Object[0])).booleanValue();
        }
        if (eb5.E()) {
            return true;
        }
        if (U0 == null) {
            U0 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_stop_signal_background", "true").trim()));
        }
        return U0.booleanValue();
    }

    public static /* synthetic */ Set S(Set set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("2d8478af", new Object[]{set});
        }
        o0 = set;
        return set;
    }

    public static /* synthetic */ boolean S0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db0a68cf", new Object[]{new Boolean(z2)})).booleanValue();
        }
        return z2;
    }

    public static /* synthetic */ Boolean S1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("20669a86", new Object[]{bool});
        }
        U0 = bool;
        return bool;
    }

    public static boolean S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66af9dd", new Object[0])).booleanValue();
        }
        if (L0 == null) {
            L0 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_fix_vp_refresh_bug", "true").trim()));
        }
        return L0.booleanValue();
    }

    public static boolean S3(String str) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0d6c082", new Object[]{str})).booleanValue();
        }
        if (k0) {
            return true;
        }
        if (TextUtils.isEmpty(str) || (list = l0) == null) {
            return false;
        }
        return list.contains(str);
    }

    public static boolean S4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63b9e6fa", new Object[0])).booleanValue();
        }
        if (d1 == null) {
            d1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicx_storage_perf", "dinamic_storage_perf_clean", "false").trim()));
        }
        return d1.booleanValue();
    }

    public static /* synthetic */ Double T(Double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("7ed768b6", new Object[]{d3});
        }
        p0 = d3;
        return d3;
    }

    public static /* synthetic */ boolean T0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a8f1c4b", new Object[]{new Boolean(z2)})).booleanValue();
        }
        S = z2;
        return z2;
    }

    public static /* synthetic */ Boolean T1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("e35303e5", new Object[]{bool});
        }
        T0 = bool;
        return bool;
    }

    public static boolean T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d98a594a", new Object[0])).booleanValue();
        }
        if (K0 == null) {
            K0 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_fixVideoControlFindViewPositionCrash", "true").trim()));
        }
        return K0.booleanValue();
    }

    public static boolean T3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cd39651", new Object[]{str})).booleanValue();
        }
        if (!Y3(str) || !Z) {
            return false;
        }
        return true;
    }

    public static boolean T4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31aff921", new Object[0])).booleanValue();
        }
        if (i1 == null) {
            i1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_support_rl_update_items_refresh_part", "true").trim()));
        }
        return i1.booleanValue();
    }

    public static /* synthetic */ Boolean U(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("5346e654", new Object[]{bool});
        }
        O1 = bool;
        return bool;
    }

    public static /* synthetic */ List U0(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("994e008", new Object[]{list});
        }
        T = list;
        return list;
    }

    public static /* synthetic */ Boolean U1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("a63f6d44", new Object[]{bool});
        }
        h1 = bool;
        return bool;
    }

    public static JSONObject U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b3e37ff4", new Object[0]);
        }
        if (e1 == null) {
            try {
                e1 = JSON.parseObject(hc6.a("group_dinamicx_storage_perf", "dinamic_global_config", "{}").trim());
            } catch (Throwable unused) {
                e1 = new JSONObject();
            }
        }
        return e1;
    }

    public static boolean U3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("612ab0c2", new Object[0])).booleanValue();
        }
        return f;
    }

    public static /* synthetic */ boolean V(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a62b7ac", new Object[]{new Boolean(z2)})).booleanValue();
        }
        u = z2;
        return z2;
    }

    public static /* synthetic */ boolean V0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a517609", new Object[]{new Boolean(z2)})).booleanValue();
        }
        U = z2;
        return z2;
    }

    public static /* synthetic */ Boolean V1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("692bd6a3", new Object[]{bool});
        }
        i1 = bool;
        return bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:10:0x0018, B:13:0x0035, B:14:0x003c, B:16:0x0042, B:18:0x0050, B:20:0x005c, B:22:0x0066, B:24:0x006c, B:25:0x0071, B:26:0x0074), top: B:29:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, java.lang.Integer> V2() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.zg5.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "742eff6e"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.ipc$dispatch(r1, r2)
            java.util.Map r0 = (java.util.Map) r0
            return r0
        L_0x0012:
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tb.zg5.q0
            if (r0 == 0) goto L_0x0017
            return r0
        L_0x0017:
            r0 = 0
            android.content.Context r1 = com.taobao.android.dinamicx.DinamicXEngine.x()     // Catch: all -> 0x0076
            java.lang.String r3 = "dinamic_original_widget_cache_white_list"
            java.lang.String r4 = ""
            java.lang.String r1 = tb.hc6.c(r1, r3, r4)     // Catch: all -> 0x0076
            java.lang.String r3 = ","
            java.lang.String[] r1 = r1.split(r3)     // Catch: all -> 0x0076
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch: all -> 0x0076
            boolean r3 = r1.isEmpty()     // Catch: all -> 0x0076
            if (r3 == 0) goto L_0x0035
            return r0
        L_0x0035:
            java.util.HashMap r3 = new java.util.HashMap     // Catch: all -> 0x0076
            r3.<init>()     // Catch: all -> 0x0076
            tb.zg5.q0 = r3     // Catch: all -> 0x0076
        L_0x003c:
            int r3 = r1.size()     // Catch: all -> 0x0076
            if (r2 >= r3) goto L_0x0074
            java.lang.Object r3 = r1.get(r2)     // Catch: all -> 0x0076
            java.lang.String r3 = (java.lang.String) r3     // Catch: all -> 0x0076
            int r4 = r2 + 1
            int r5 = r1.size()     // Catch: all -> 0x0076
            if (r4 >= r5) goto L_0x0065
            java.lang.Object r4 = r1.get(r4)     // Catch: all -> 0x0076
            java.lang.String r4 = (java.lang.String) r4     // Catch: all -> 0x0076
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: all -> 0x0076
            if (r5 != 0) goto L_0x0065
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: all -> 0x0076
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: all -> 0x0076
            goto L_0x0066
        L_0x0065:
            r4 = r0
        L_0x0066:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: all -> 0x0076
            if (r5 != 0) goto L_0x0071
            java.util.Map<java.lang.String, java.lang.Integer> r5 = tb.zg5.q0     // Catch: all -> 0x0076
            r5.put(r3, r4)     // Catch: all -> 0x0076
        L_0x0071:
            int r2 = r2 + 2
            goto L_0x003c
        L_0x0074:
            java.util.Map<java.lang.String, java.lang.Integer> r0 = tb.zg5.q0     // Catch: all -> 0x0076
        L_0x0076:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zg5.V2():java.util.Map");
    }

    public static /* synthetic */ List V4(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("10019a5b", new Object[]{list});
        }
        j2 = list;
        return list;
    }

    public static /* synthetic */ Boolean W(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("16334fb3", new Object[]{bool});
        }
        P1 = bool;
        return bool;
    }

    public static /* synthetic */ List W0(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c800f251", new Object[]{list});
        }
        V = list;
        return list;
    }

    public static /* synthetic */ Boolean W1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("2c184002", new Object[]{bool});
        }
        j1 = bool;
        return bool;
    }

    public static int W2(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22b95ce9", new Object[]{str, str2})).intValue();
        }
        try {
            JSONObject Q2 = Q2(str);
            if (Q2 == null) {
                return 100;
            }
            int intValue = Q2.getIntValue("dxCacheCount");
            if (intValue <= 0) {
                intValue = 100;
            }
            JSONObject c3 = c3(str, str2);
            if (c3 == null) {
                return intValue;
            }
            int intValue2 = c3.getIntValue("dxCacheCount");
            if (intValue2 > 0) {
                return intValue2;
            }
            return intValue;
        } catch (Throwable unused) {
            return 100;
        }
    }

    public static boolean W3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83fe3745", new Object[0])).booleanValue();
        }
        return W;
    }

    public static boolean W4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c6a1c79", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (o0 == null) {
            o0 = new HashSet(Arrays.asList(hc6.a("group_dinamicX_common_android_2", "dinamic_target_performance_template_list", "").trim().split(",")));
        }
        return o0.contains(str);
    }

    public static /* synthetic */ Boolean X(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("d91fb912", new Object[]{bool});
        }
        R1 = bool;
        return bool;
    }

    public static /* synthetic */ boolean X0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80d9fefb", new Object[]{new Boolean(z2)})).booleanValue();
        }
        g = z2;
        return z2;
    }

    public static /* synthetic */ Boolean X1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("ef04a961", new Object[]{bool});
        }
        k1 = bool;
        return bool;
    }

    public static int X2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f479e80", new Object[0])).intValue();
        }
        return F;
    }

    public static boolean X4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("758eaf6f", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (V0 == null) {
            V0 = Arrays.asList(hc6.a("group_dinamicX_common_android", "dinamic_template_reuse_auto_white_list", "alimp_message").trim().split(","));
        }
        return V0.contains(str);
    }

    public static /* synthetic */ Boolean Y(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("9c0c2271", new Object[]{bool});
        }
        Q1 = bool;
        return bool;
    }

    public static /* synthetic */ List Y0(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("29538ef0", new Object[]{list});
        }
        X = list;
        return list;
    }

    public static /* synthetic */ Boolean Y1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("b1f112c0", new Object[]{bool});
        }
        l1 = bool;
        return bool;
    }

    public static int Y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7adf5b5", new Object[0])).intValue();
        }
        return l;
    }

    public static boolean Y3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5175c65", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (Y == null) {
            Y = new ArrayList();
        }
        return Y.contains(str);
    }

    public static boolean Y4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99ac5049", new Object[0])).booleanValue();
        }
        return c;
    }

    public static /* synthetic */ Boolean Z(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("5ef88bd0", new Object[]{bool});
        }
        X1 = bool;
        return bool;
    }

    public static /* synthetic */ boolean Z0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76daaf1", new Object[]{new Boolean(z2)})).booleanValue();
        }
        W = z2;
        return z2;
    }

    public static /* synthetic */ Boolean Z1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("724220ea", new Object[]{bool});
        }
        m1 = bool;
        return bool;
    }

    public static JSONArray Z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("aee98868", new Object[0]);
        }
        if (b1 == null) {
            try {
                b1 = JSON.parseArray(hc6.a("group_dinamicx_storage_perf", "dinamic_storage_perf_black_list", "{}").trim());
            } catch (Throwable unused) {
                b1 = new JSONArray();
            }
        }
        return b1;
    }

    public static boolean Z3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c189e6e", new Object[0])).booleanValue();
        }
        return J;
    }

    public static boolean Z4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50f196de", new Object[0])).booleanValue();
        }
        if (c2 == null) {
            c2 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamicThrowImageCrash", "true").trim()));
        }
        return c2.booleanValue();
    }

    public static /* synthetic */ List a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6c94df9d", new Object[]{list});
        }
        f32743a = list;
        return list;
    }

    public static /* synthetic */ Boolean a0(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("21e4f52f", new Object[]{bool});
        }
        Y1 = bool;
        return bool;
    }

    public static /* synthetic */ List a1(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ebf8c82e", new Object[]{list});
        }
        Y = list;
        return list;
    }

    public static /* synthetic */ boolean a2(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("883fdf56", new Object[]{new Boolean(z2)})).booleanValue();
        }
        o = z2;
        return z2;
    }

    public static JSONObject a3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf8c1561", new Object[]{str});
        }
        return U2();
    }

    public static boolean a4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("684b9143", new Object[0])).booleanValue();
        }
        return U;
    }

    public static boolean a5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a60d9dad", new Object[0])).booleanValue();
        }
        return d;
    }

    public static /* synthetic */ Boolean b(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("e8c3dc50", new Object[]{bool});
        }
        v1 = bool;
        return bool;
    }

    public static /* synthetic */ Boolean b0(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("e4d15e8e", new Object[]{bool});
        }
        Z1 = bool;
        return bool;
    }

    public static /* synthetic */ boolean b1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d73004af", new Object[]{new Boolean(z2)})).booleanValue();
        }
        Z = z2;
        return z2;
    }

    public static /* synthetic */ Boolean b2(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("352e8a49", new Object[]{bool});
        }
        o1 = bool;
        return bool;
    }

    public static int b3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b660f50e", new Object[0])).intValue();
        }
        return c1;
    }

    public static boolean b4(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("991667b3", new Object[]{dXWidgetNode})).booleanValue();
        }
        if (dXWidgetNode == null) {
            return false;
        }
        if ((dXWidgetNode instanceof ei6) || (dXWidgetNode instanceof y06) || (dXWidgetNode instanceof ny5)) {
            return r;
        }
        return false;
    }

    public static boolean b5(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69e99a3e", new Object[]{str, str2})).booleanValue();
        }
        return g3(str, str2);
    }

    public static /* synthetic */ int c(int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7addc44e", new Object[]{new Integer(i3)})).intValue();
        }
        l = i3;
        return i3;
    }

    public static /* synthetic */ Boolean c0(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("a7bdc7ed", new Object[]{bool});
        }
        a2 = bool;
        return bool;
    }

    public static /* synthetic */ boolean c1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f11318e", new Object[]{new Boolean(z2)})).booleanValue();
        }
        a0 = z2;
        return z2;
    }

    public static /* synthetic */ Boolean c2(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("f81af3a8", new Object[]{bool});
        }
        n1 = bool;
        return bool;
    }

    public static JSONObject c3(String str, String str2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f1e82de0", new Object[]{str, str2});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject Q2 = Q2(str);
                if (Q2 == null || !Q2.containsKey("subBiz") || (jSONObject = Q2.getJSONObject("subBiz")) == null) {
                    return null;
                }
                return jSONObject.getJSONObject(str2);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static boolean c4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af9abfd5", new Object[0])).booleanValue();
        }
        if (g1 == null) {
            g1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicx_storage_perf", "dinamic_filter_dirty_template", "true").trim()));
        }
        return g1.booleanValue();
    }

    public static /* synthetic */ Boolean d(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("abb045af", new Object[]{bool});
        }
        w1 = bool;
        return bool;
    }

    public static /* synthetic */ Boolean d0(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("6aaa314c", new Object[]{bool});
        }
        c2 = bool;
        return bool;
    }

    public static /* synthetic */ List d1(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ff09e0b", new Object[]{list});
        }
        b0 = list;
        return list;
    }

    public static /* synthetic */ Boolean d2(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("bb075d07", new Object[]{bool});
        }
        p1 = bool;
        return bool;
    }

    public static Double d3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("1b0fd90c", new Object[0]);
        }
        try {
            if (p0 == null) {
                p0 = Double.valueOf(Double.parseDouble(hc6.a("group_dinamicX_common_android_2", "dinamic_target_performance_template_sample", "0.001").trim()));
            }
            if (p0.doubleValue() < vu3.b.GEO_NOT_SUPPORT || p0.doubleValue() > 1.0d) {
                p0 = Double.valueOf(0.001d);
            }
        } catch (Throwable unused) {
            p0 = Double.valueOf(0.001d);
        }
        return p0;
    }

    public static boolean d4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ac11155", new Object[0])).booleanValue();
        }
        if (I0 == null) {
            I0 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_fixControlEventCenterCrash", "true").trim()));
        }
        return I0.booleanValue();
    }

    public static boolean d5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("130fd63a", new Object[0])).booleanValue();
        }
        if (B1 == null) {
            B1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_virtual_thread_access", "true").trim()));
        }
        return B1.booleanValue();
    }

    public static /* synthetic */ boolean e(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z2)})).booleanValue();
        }
        b = z2;
        return z2;
    }

    public static /* synthetic */ List e0(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("40a4e517", new Object[]{list});
        }
        b2 = list;
        return list;
    }

    public static /* synthetic */ List e1(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("71433aaa", new Object[]{list});
        }
        c0 = list;
        return list;
    }

    public static /* synthetic */ Boolean e2(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("7df3c666", new Object[]{bool});
        }
        q1 = bool;
        return bool;
    }

    public static JSONArray e3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("c034dded", new Object[0]);
        }
        if (f1 == null) {
            try {
                f1 = JSON.parseArray(hc6.a("group_dinamicx_storage_perf", "dinamic_template_clear_white_list", "{}").trim());
            } catch (Throwable unused) {
                f1 = new JSONArray();
            }
        }
        return f1;
    }

    public static /* synthetic */ Boolean e4(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("f6d6bb00", new Object[]{bool});
        }
        return bool;
    }

    public static boolean e5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1666d63f", new Object[0])).booleanValue();
        }
        if (j == null) {
            j = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamic_zoomable_imageview_control", "true").trim()));
        }
        return j.booleanValue();
    }

    public static /* synthetic */ Boolean f(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("6e9caf0e", new Object[]{bool});
        }
        x1 = bool;
        return bool;
    }

    public static /* synthetic */ Boolean f0(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("ede7a8d5", new Object[]{bool});
        }
        p = bool;
        return bool;
    }

    public static /* synthetic */ boolean f1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12adef6c", new Object[]{new Boolean(z2)})).booleanValue();
        }
        return z2;
    }

    public static /* synthetic */ Boolean f2(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("40e02fc5", new Object[]{bool});
        }
        r1 = bool;
        return bool;
    }

    public static int f3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65462c2d", new Object[0])).intValue();
        }
        if (D0 == null) {
            D0 = Integer.valueOf(Integer.parseInt(hc6.a("group_dinamicX_common_android", "dinamic_viewpager_low_memory_keep_size", "3").trim()));
        }
        return D0.intValue();
    }

    public static boolean f4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf1cb679", new Object[0])).booleanValue();
        }
        return r0;
    }

    public static boolean f5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6be884af", new Object[0])).booleanValue();
        }
        if (a2 == null) {
            a2 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamicLanguageLoaderSwitch", "false").trim()));
        }
        return a2.booleanValue();
    }

    public static /* synthetic */ Boolean g(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("3189186d", new Object[]{bool});
        }
        y1 = bool;
        return bool;
    }

    public static /* synthetic */ boolean g0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8243e48b", new Object[]{new Boolean(z2)})).booleanValue();
        }
        v = z2;
        return z2;
    }

    public static /* synthetic */ boolean g1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de95e50a", new Object[]{new Boolean(z2)})).booleanValue();
        }
        d0 = z2;
        return z2;
    }

    public static /* synthetic */ Boolean g2(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("3cc9924", new Object[]{bool});
        }
        s1 = bool;
        return bool;
    }

    public static boolean g4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bb785e7", new Object[0])).booleanValue();
        }
        if (G0 == null) {
            G0 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "config_fix_measure_on_layout", "true").trim()));
        }
        return G0.booleanValue();
    }

    public static boolean g5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0572d6b", new Object[0])).booleanValue();
        }
        if (A1 == null) {
            A1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_merge_download_optimize", "true").trim()));
        }
        return A1.booleanValue();
    }

    public static /* synthetic */ Boolean h(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("f47581cc", new Object[]{bool});
        }
        z1 = bool;
        return bool;
    }

    public static /* synthetic */ Boolean h0(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("b0d41234", new Object[]{bool});
        }
        D1 = bool;
        return bool;
    }

    public static /* synthetic */ boolean h1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbefc034", new Object[]{new Boolean(z2)})).booleanValue();
        }
        g0 = z2;
        return z2;
    }

    public static /* synthetic */ Boolean h2(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("c6b90283", new Object[]{bool});
        }
        t1 = bool;
        return bool;
    }

    public static void h3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6811c3f9", new Object[0]);
            return;
        }
        try {
            if (com.taobao.android.dinamicx.g.c() != null) {
                Boolean.parseBoolean(com.taobao.android.dinamicx.g.c().getConfig("group_dinamicx_textview", "dx_textview_font_ut_switch", "false"));
                i3();
            }
        } catch (Throwable th) {
            if (DinamicXEngine.j0()) {
                th.printStackTrace();
            }
        }
    }

    public static boolean h4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c5736e5", new Object[0])).booleanValue();
        }
        if (H1 == null) {
            H1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_fix_preRender_judgment", "true").trim()));
        }
        return H1.booleanValue();
    }

    public static boolean h5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95a0d683", new Object[0])).booleanValue();
        }
        if (q1 == null) {
            q1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_need_check_sdk_init", "true").trim()));
        }
        return q1.booleanValue();
    }

    public static /* synthetic */ Boolean i(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("b761eb2b", new Object[]{bool});
        }
        return bool;
    }

    public static /* synthetic */ Boolean i0(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("73c07b93", new Object[]{bool});
        }
        E1 = bool;
        return bool;
    }

    public static /* synthetic */ boolean i1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8bb2bda", new Object[]{new Boolean(z2)})).booleanValue();
        }
        h = z2;
        return z2;
    }

    public static /* synthetic */ Boolean i2(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("89a56be2", new Object[]{bool});
        }
        u1 = bool;
        return bool;
    }

    public static void i3() {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e93f7fba", new Object[0]);
            return;
        }
        zub c3 = com.taobao.android.dinamicx.g.c();
        if (c3 != null) {
            boolean parseBoolean = Boolean.parseBoolean(c3.getConfig("group_dinamicX_common_android", "dx_textview_font_switch", "false"));
            Map<String, Set<Object>> o2 = o2(c3.getConfig("group_dinamicX_common_android", "dx_textview_font_config", ""));
            Map<String, Set<Object>> o22 = o2(c3.getConfig("group_dinamicX_common_android", "dx_textview_font_rom_config", ""));
            Set<String> p2 = p2(c3.getConfig("group_dinamicX_common_android", "dx_textview_font_phone_config", ""));
            if (parseBoolean) {
                d = true;
                return;
            }
            if (p2 != null && (p2.contains(ybk.a()) || p2.contains("ALL"))) {
                if (o22 == null || o22.size() <= 0) {
                    d = true;
                    return;
                } else if (o22.containsKey(ybk.d()) && o22.get(ybk.d()).contains(ybk.e())) {
                    d = true;
                    return;
                }
            }
            if (o2 == null || !o2.containsKey(ybk.f()) || o2.get(ybk.f()) == null) {
                d = false;
                return;
            }
            Set<Object> set = o2.get(ybk.f());
            if (set.contains("ALL") || set.contains(ybk.c())) {
                z2 = true;
            }
            d = z2;
        }
    }

    public static boolean i4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c492a33", new Object[0])).booleanValue();
        }
        return A;
    }

    public static boolean i5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4179c51", new Object[0])).booleanValue();
        }
        if (W1 == null) {
            W1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamicOpenTmpLifecycle", "true").trim()));
        }
        return W1.booleanValue();
    }

    public static /* synthetic */ Boolean j(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("7a4e548a", new Object[]{bool});
        }
        s = bool;
        return bool;
    }

    public static /* synthetic */ List j0(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c1b6309e", new Object[]{list});
        }
        i = list;
        return list;
    }

    public static /* synthetic */ int j1(int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33d0ad31", new Object[]{new Integer(i3)})).intValue();
        }
        e0 = i3;
        return i3;
    }

    public static /* synthetic */ Boolean j2(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("4c91d541", new Object[]{bool});
        }
        R = bool;
        return bool;
    }

    public static boolean j5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3987b3f3", new Object[0])).booleanValue();
        }
        return Q;
    }

    public static /* synthetic */ Boolean k(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("3d3abde9", new Object[]{bool});
        }
        A1 = bool;
        return bool;
    }

    public static /* synthetic */ Boolean k0(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("f9994e51", new Object[]{bool});
        }
        S1 = bool;
        return bool;
    }

    public static /* synthetic */ boolean k1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bb219f2", new Object[]{new Boolean(z2)})).booleanValue();
        }
        f0 = z2;
        return z2;
    }

    public static boolean k2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c96a5c3b", new Object[0])).booleanValue();
        }
        if (g2 == null) {
            g2 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamic_bugfixForSearch", "true").trim()));
        }
        return g2.booleanValue();
    }

    public static boolean k3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("105ae4e2", new Object[0])).booleanValue();
        }
        if (U1 == null) {
            U1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamicAsyncLayoutOpt", "true").trim()));
        }
        return U1.booleanValue();
    }

    public static boolean k4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be580706", new Object[0])).booleanValue();
        }
        if (P0 == null) {
            P0 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_fix_scroll_listener_rl_instance", "true").trim()));
        }
        return P0.booleanValue();
    }

    public static boolean k5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cca1b03a", new Object[0])).booleanValue();
        }
        return P;
    }

    public static /* synthetic */ Boolean l(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("272748", new Object[]{bool});
        }
        B1 = bool;
        return bool;
    }

    public static /* synthetic */ Boolean l0(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("bc85b7b0", new Object[]{bool});
        }
        j = bool;
        return bool;
    }

    public static /* synthetic */ boolean l1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39346d1", new Object[]{new Boolean(z2)})).booleanValue();
        }
        i0 = z2;
        return z2;
    }

    public static boolean l2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("615d33b", new Object[0])).booleanValue();
        }
        return D;
    }

    public static boolean l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2203fa92", new Object[0])).booleanValue();
        }
        if (T1 == null) {
            T1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamicAsyncMeasureOpt", "true").trim()));
        }
        return T1.booleanValue();
    }

    public static boolean l4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f9271da", new Object[0])).booleanValue();
        }
        if (J0 == null) {
            J0 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_fixSimplePipelineViewRef", "true").trim()));
        }
        return J0.booleanValue();
    }

    public static boolean l5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1301c2b5", new Object[0])).booleanValue();
        }
        return L;
    }

    public static /* synthetic */ Boolean m(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("c31390a7", new Object[]{bool});
        }
        C1 = bool;
        return bool;
    }

    public static /* synthetic */ Boolean m0(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("7f72210f", new Object[]{bool});
        }
        return bool;
    }

    public static /* synthetic */ List m1(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("164c5c0e", new Object[]{list});
        }
        j0 = list;
        return list;
    }

    public static boolean m2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aea8c24b", new Object[0])).booleanValue();
        }
        return g0;
    }

    public static boolean m3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de75aa5c", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        List<String> list = q;
        if (list == null) {
            return "guangguang".equals(str);
        }
        return list.contains(str);
    }

    public static boolean m4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53463383", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (H0 == null) {
            H0 = Arrays.asList(hc6.a("group_dinamicX_common_android", "dinamic_fix_swipe_refresh_reach_top", "live_channel").trim().split(","));
        }
        return H0.contains(str);
    }

    public static boolean m5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e02beb40", new Object[0])).booleanValue();
        }
        if (d2 == null) {
            d2 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamicPreDownloadOpen", "true").trim()));
        }
        return d2.booleanValue();
    }

    public static /* synthetic */ Boolean n(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("83649ed1", new Object[]{bool});
        }
        F1 = bool;
        return bool;
    }

    public static /* synthetic */ Boolean n0(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("425e8a6e", new Object[]{bool});
        }
        d2 = bool;
        return bool;
    }

    public static /* synthetic */ boolean n1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d355a08f", new Object[]{new Boolean(z2)})).booleanValue();
        }
        r0 = z2;
        return z2;
    }

    public static boolean n2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("581a66f7", new Object[0])).booleanValue();
        }
        if (f2 == null) {
            f2 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "closeAsynRenderPrefetch", "true").trim()));
        }
        return f2.booleanValue() && Build.VERSION.SDK_INT < 28;
    }

    public static boolean n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfe0ee11", new Object[0])).booleanValue();
        }
        if (j1 == null) {
            j1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_bugfix_for_download", "true").trim()));
        }
        return j1.booleanValue();
    }

    public static void n5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("598b7ba0", new Object[0]);
            return;
        }
        ch5 ch5Var = new ch5();
        ch5Var.a(new String[]{"group_dinamicX_common_android"}, new a(ch5Var), true);
        ch5Var.a(new String[]{"group_dinamicx_textview"}, new b(ch5Var), true);
        ch5Var.a(new String[]{"group_dinamicx_elder"}, new c(ch5Var), true);
        ch5Var.a(new String[]{"group_dinamicx_image_corner"}, new d(ch5Var), true);
        ch5Var.a(new String[]{"group_dinamicx_rl_mem_perf"}, new e(ch5Var), true);
        ch5Var.a(new String[]{"group_dinamicx_new_refresh_layout"}, new f(ch5Var), true);
        ch5Var.a(new String[]{"group_dinamicx_new_pipeline_cache"}, new g(ch5Var), true);
        ch5Var.a(new String[]{"group_dinamicx_storage_perf"}, new h(ch5Var), true);
        ch5Var.a(new String[]{"group_dinamicX_common_android_2"}, new i(ch5Var), true);
    }

    public static /* synthetic */ List o(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ce50a92d", new Object[]{list});
        }
        q = list;
        return list;
    }

    public static /* synthetic */ Boolean o0(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("54af3cd", new Object[]{bool});
        }
        e2 = bool;
        return bool;
    }

    public static /* synthetic */ List o1(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d8f1954c", new Object[]{list});
        }
        s0 = list;
        return list;
    }

    public static Map<String, Set<Object>> o2(String str) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("24396bed", new Object[]{str});
        }
        ConcurrentHashMap concurrentHashMap = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject == null && parseObject.size() <= 0) {
                return null;
            }
            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
            try {
                for (String str2 : parseObject.keySet()) {
                    JSONArray jSONArray = parseObject.getJSONArray(str2);
                    if (jSONArray != null && jSONArray.size() > 0) {
                        concurrentHashMap2.put(str2, new HashSet(jSONArray));
                    }
                }
                return concurrentHashMap2;
            } catch (Throwable th2) {
                th = th2;
                concurrentHashMap = concurrentHashMap2;
                h36.g("DXConfigCenter", "convertToMapSet error" + th.getMessage());
                return concurrentHashMap;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean o3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c29b2118", new Object[0])).booleanValue();
        }
        if (l1 == null) {
            l1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_bugfix_for_post_event_concurrent_modify", "true").trim()));
        }
        return l1.booleanValue();
    }

    public static boolean o4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2047e24d", new Object[0])).booleanValue();
        }
        return x0;
    }

    public static boolean o5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b60051e", new Object[0])).booleanValue();
        }
        if (e2 == null) {
            e2 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "removeWhenFileIsInvalid", "true").trim()));
        }
        return e2.booleanValue();
    }

    public static /* synthetic */ List p(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("db0d1a5c", new Object[]{list});
        }
        G1 = list;
        return list;
    }

    public static /* synthetic */ Boolean p0(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("c8375d2c", new Object[]{bool});
        }
        f2 = bool;
        return bool;
    }

    public static /* synthetic */ boolean p1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a317fa4d", new Object[]{new Boolean(z2)})).booleanValue();
        }
        x0 = z2;
        return z2;
    }

    public static Set<String> p2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("489945e3", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            List parseArray = JSON.parseArray(str, String.class);
            if (parseArray == null || parseArray.size() <= 0) {
                return null;
            }
            return new HashSet(parseArray);
        } catch (Throwable th) {
            h36.g("DXConfigCenter", "convertToStringSet error" + th.getMessage());
            return null;
        }
    }

    public static boolean p3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ed8646b", new Object[0])).booleanValue();
        }
        if (k1 == null) {
            k1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_bugfix_for_viewpager", "true").trim()));
        }
        return k1.booleanValue();
    }

    public static boolean p4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("102102d4", new Object[0])).booleanValue();
        }
        return w0;
    }

    public static boolean p5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8af40a4a", new Object[0])).booleanValue();
        }
        return O;
    }

    public static /* synthetic */ Boolean q(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("93d718f", new Object[]{bool});
        }
        I1 = bool;
        return bool;
    }

    public static /* synthetic */ Boolean q0(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("88886b56", new Object[]{bool});
        }
        g2 = bool;
        return bool;
    }

    public static /* synthetic */ List q1(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9b96ce8a", new Object[]{list});
        }
        y0 = list;
        return list;
    }

    public static final boolean q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a890463", new Object[0])).booleanValue();
        }
        if (y1 == null) {
            y1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_bugfix_for_countdown", "true").trim()));
        }
        return y1.booleanValue();
    }

    public static boolean q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b7eed56", new Object[0])).booleanValue();
        }
        if (F0 == null) {
            F0 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "config_container_expose_state_store", "true").trim()));
        }
        return F0.booleanValue();
    }

    public static boolean q4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45bd547b", new Object[0])).booleanValue();
        }
        if (R0 == null) {
            R0 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "needCheckPreRenderManufacturer", "true").trim()));
        }
        if (!R0.booleanValue()) {
            return false;
        }
        Boolean bool = S0;
        if (bool != null) {
            return bool.booleanValue();
        }
        int i3 = Build.VERSION.SDK_INT;
        if ((i3 == 28 || i3 == 29) && SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(ybk.a())) {
            S0 = Boolean.TRUE;
            return true;
        }
        S0 = Boolean.FALSE;
        return false;
    }

    public static boolean q5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7af17b1f", new Object[0])).booleanValue();
        }
        if (B0 == null) {
            B0 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "supportSourceAutoId", "true").trim()));
        }
        return B0.booleanValue();
    }

    public static /* synthetic */ Boolean r(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("cc29daee", new Object[]{bool});
        }
        J1 = bool;
        return bool;
    }

    public static /* synthetic */ boolean r0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea25116a", new Object[]{new Boolean(z2)})).booleanValue();
        }
        w = z2;
        return z2;
    }

    public static /* synthetic */ List r1(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fce96b29", new Object[]{list});
        }
        z0 = list;
        return list;
    }

    public static final boolean r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6315824d", new Object[0])).booleanValue();
        }
        if (x1 == null) {
            x1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_bugfix_for_download_file_write", "true").trim()));
        }
        return x1.booleanValue();
    }

    public static boolean r3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ff1e82", new Object[0])).booleanValue();
        }
        if (h1 == null) {
            h1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_deep_clone_bindingx_args", "true").trim()));
        }
        return h1.booleanValue();
    }

    public static boolean r4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33664f55", new Object[0])).booleanValue();
        }
        if (E0 == null) {
            E0 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "config_image_enable_size_in_layout_params", "false").trim()));
        }
        return E0.booleanValue();
    }

    public static boolean r5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d964fc3b", new Object[0])).booleanValue();
        }
        return M;
    }

    public static /* synthetic */ Boolean s(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("8f16444d", new Object[]{bool});
        }
        H1 = bool;
        return bool;
    }

    public static /* synthetic */ Boolean s0(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("4b74d4b5", new Object[]{bool});
        }
        h2 = bool;
        return bool;
    }

    public static /* synthetic */ Boolean s1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("a25fd967", new Object[]{bool});
        }
        A0 = bool;
        return bool;
    }

    public static final boolean s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c91a967", new Object[0])).booleanValue();
        }
        if (v1 == null) {
            v1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_close_low_phone_app_monitor", "true").trim()));
        }
        return v1.booleanValue();
    }

    public static boolean s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17677d6c", new Object[0])).booleanValue();
        }
        if (L1 == null) {
            L1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamicAutoLoopLongTime", "true").trim()));
        }
        return L1.booleanValue();
    }

    public static boolean s4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87c7dbc6", new Object[]{str})).booleanValue();
        }
        if (b2 != null) {
            return false;
        }
        List<String> asList = Arrays.asList(hc6.a("group_dinamicX_common_android_2", "dinamic_image_black_list", "informationFlow,homepage,live_channel_flexalocal,live_channel_flexaremote").trim().split(","));
        b2 = asList;
        return asList.contains(str);
    }

    public static boolean s5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("accc4c4b", new Object[0])).booleanValue();
        }
        if (C1 == null) {
            C1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_tabheader_optimize", "true").trim()));
        }
        return C1.booleanValue();
    }

    public static /* synthetic */ Boolean t(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("5202adac", new Object[]{bool});
        }
        K1 = bool;
        return bool;
    }

    public static /* synthetic */ Boolean t0(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("e613e14", new Object[]{bool});
        }
        T1 = bool;
        return bool;
    }

    public static /* synthetic */ boolean t1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("509c58b9", new Object[]{new Boolean(z2)})).booleanValue();
        }
        k = z2;
        return z2;
    }

    public static final boolean t2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55de9261", new Object[0])).booleanValue();
        }
        if (w1 == null) {
            w1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_close_low_phone_app_monitor_2", "false").trim()));
        }
        return w1.booleanValue();
    }

    public static boolean t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddb385d4", new Object[0])).booleanValue();
        }
        if (N1 == null) {
            N1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamicFixRLInsertUserId", "true").trim()));
        }
        return N1.booleanValue();
    }

    public static boolean t5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b445bada", new Object[0])).booleanValue();
        }
        return C;
    }

    public static /* synthetic */ Boolean u(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("14ef170b", new Object[]{bool});
        }
        L1 = bool;
        return bool;
    }

    public static /* synthetic */ Boolean u0(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("d14da773", new Object[]{bool});
        }
        U1 = bool;
        return bool;
    }

    public static /* synthetic */ Boolean u1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("654c42c6", new Object[]{bool});
        }
        B0 = bool;
        return bool;
    }

    public static boolean u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9c45334", new Object[0])).booleanValue();
        }
        if (F1 == null) {
            F1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_embad_template_bugfix", "true").trim()));
        }
        return F1.booleanValue();
    }

    public static boolean u3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1056974c", new Object[0])).booleanValue();
        }
        if (M1 == null) {
            M1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamicFixRepeatRender", "false").trim()));
        }
        return M1.booleanValue();
    }

    public static boolean u4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44b8922a", new Object[0])).booleanValue();
        }
        if (V1 == null) {
            V1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamicLayoutOpt", "true").trim()));
        }
        return V1.booleanValue();
    }

    public static boolean u5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6fc3a09", new Object[0])).booleanValue();
        }
        return B;
    }

    public static /* synthetic */ boolean v(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9949bb8", new Object[]{new Boolean(z2)})).booleanValue();
        }
        c = z2;
        return z2;
    }

    public static /* synthetic */ Boolean v0(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("943a10d2", new Object[]{bool});
        }
        k2 = bool;
        return bool;
    }

    public static /* synthetic */ boolean v1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ff688f3", new Object[]{new Boolean(z2)})).booleanValue();
        }
        w0 = z2;
        return z2;
    }

    public static final boolean v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("587cc8b4", new Object[0])).booleanValue();
        }
        if (u1 == null) {
            u1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_open_fetch_template_log", "true").trim()));
        }
        return u1.booleanValue();
    }

    public static boolean v3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cacc4627", new Object[0])).booleanValue();
        }
        if (Q1 == null) {
            Q1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamicFixScrollChildVideo", "true").trim()));
        }
        return Q1.booleanValue();
    }

    public static boolean v4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a44db352", new Object[0])).booleanValue();
        }
        return f0;
    }

    public static /* synthetic */ List w(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("844f62b5", new Object[]{list});
        }
        e = list;
        return list;
    }

    public static /* synthetic */ Boolean w0(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("57267a31", new Object[]{bool});
        }
        V1 = bool;
        return bool;
    }

    public static /* synthetic */ Boolean w1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("eb251584", new Object[]{bool});
        }
        C0 = bool;
        return bool;
    }

    public static final boolean w2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("903af2e2", new Object[0])).booleanValue();
        }
        if (r1 == null) {
            r1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_open_optimize_ab", "true").trim()));
        }
        return r1.booleanValue();
    }

    public static boolean w3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67f0e40", new Object[0])).booleanValue();
        }
        if (O1 == null) {
            O1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamicFixSliderExpose", "true").trim()));
        }
        return O1.booleanValue();
    }

    public static boolean w4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b71ad14", new Object[0])).booleanValue();
        }
        return H;
    }

    public static boolean w5(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("420a62c6", new Object[]{dXRuntimeContext})).booleanValue();
        }
        if (dXRuntimeContext == null || dXRuntimeContext.s() == null) {
            return false;
        }
        return dXRuntimeContext.s().q();
    }

    public static /* synthetic */ boolean x(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b956f576", new Object[]{new Boolean(z2)})).booleanValue();
        }
        return z2;
    }

    public static /* synthetic */ List x0(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("164054e7", new Object[]{list});
        }
        x = list;
        return list;
    }

    public static /* synthetic */ Integer x1(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("5bad2137", new Object[]{num});
        }
        D0 = num;
        return num;
    }

    public static final boolean x2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ff9831", new Object[0])).booleanValue();
        }
        if (s1 == null) {
            s1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_open_optimize_image_ab", "true").trim()));
        }
        return s1.booleanValue();
    }

    public static boolean x3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d73383f", new Object[0])).booleanValue();
        }
        if (P1 == null) {
            P1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamicFlattenOpt", "true").trim()));
        }
        return P1.booleanValue();
    }

    public static boolean x4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d84a6068", new Object[0])).booleanValue();
        }
        if (n1 == null) {
            n1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_new_rich_text_image_interface", "true").trim()));
        }
        return n1.booleanValue();
    }

    public static boolean x5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d8c0961", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        List<String> list = h0;
        if (list == null) {
            return "alimp_message".equals(str);
        }
        return list.contains(str);
    }

    public static /* synthetic */ List y(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("42bb74fe", new Object[]{list});
        }
        E = list;
        return list;
    }

    public static /* synthetic */ List y0(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7792f186", new Object[]{list});
        }
        y = list;
        return list;
    }

    public static /* synthetic */ Boolean y1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("70fde842", new Object[]{bool});
        }
        E0 = bool;
        return bool;
    }

    public static final boolean y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bb71681", new Object[0])).booleanValue();
        }
        if (t1 == null) {
            t1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamic_open_optimize_launcher", "true").trim()));
        }
        return t1.booleanValue();
    }

    public static boolean y3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59790949", new Object[0])).booleanValue();
        }
        if (X1 == null) {
            X1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamicLanguagebugfix", "true").trim()));
        }
        return X1.booleanValue();
    }

    public static boolean y4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7851ea7", new Object[0])).booleanValue();
        }
        return v;
    }

    public static boolean y5(String str) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7a3af48", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (list = E) != null && !list.isEmpty()) {
            return E.contains(str);
        }
        return false;
    }

    public static /* synthetic */ boolean z(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4aa05dee", new Object[]{new Boolean(z2)})).booleanValue();
        }
        r = z2;
        return z2;
    }

    public static /* synthetic */ Boolean z0(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("1a12e390", new Object[]{bool});
        }
        W1 = bool;
        return bool;
    }

    public static /* synthetic */ Boolean z1(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("33ea51a1", new Object[]{bool});
        }
        F0 = bool;
        return bool;
    }

    public static boolean z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41578256", new Object[0])).booleanValue();
        }
        if (I1 == null) {
            I1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android", "dinamicRecyclerlayoutSaveinstanceBugfix", "true").trim()));
        }
        return I1.booleanValue();
    }

    public static boolean z3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ec86ac1", new Object[0])).booleanValue();
        }
        if (R1 == null) {
            R1 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicX_common_android_2", "dinamicLanguageOpt", "false").trim()));
        }
        return R1.booleanValue();
    }

    public static boolean z4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf0f0301", new Object[]{str})).booleanValue();
        }
        if (eb5.k() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (z == null) {
            z = new ArrayList();
        }
        return !z.contains(str);
    }

    public static boolean z5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("660cf9d7", new Object[]{str})).booleanValue();
        }
        if (j2 == null) {
            j2 = Arrays.asList(hc6.a("group_dinamicX_common_android_2", "enableImageHeightScaleBizTypeList", "").trim().split(","));
        }
        return j2.contains(str);
    }

    public static boolean D2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("851b9a8b", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (z0 == null) {
            ArrayList arrayList = new ArrayList();
            z0 = arrayList;
            arrayList.add("subscription");
        }
        return z0.contains(str);
    }

    public static boolean U4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("802081f", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (T == null) {
            T = Arrays.asList(hc6.a("group_dinamicX_common_android", "dinamic_supportViewReuseList", "subscription,alimp_message,iCart,mytaobao,live_channel_flexalocal,live_channel_flexaremote").trim().split(","));
        }
        return T.contains(str);
    }

    public static boolean V3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1b34eb6", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (y0 == null) {
            y0 = Arrays.asList(hc6.a("group_dinamicX_common_android", "dinamic_render_view_child_empty_monitor_white_list", "subscription").trim().split(","));
        }
        return y0.contains(str);
    }

    public static boolean c5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f01638c1", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (y == null) {
            ArrayList arrayList = new ArrayList();
            y = arrayList;
            arrayList.add("guess");
            y.add("homepage");
            y.add("mytaobao");
        }
        return !y.contains(str);
    }

    public static boolean g3(String str, String str2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51d1ea08", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject Q2 = Q2(str);
                if (Q2 == null || !Q2.containsKey("subBiz") || (jSONObject = Q2.getJSONObject("subBiz")) == null) {
                    return false;
                }
                return jSONObject.containsKey(str2);
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean j3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("166de9cf", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        List<String> list = t;
        if (list == null) {
            return "subscription".equals(str);
        }
        return list.contains(str);
    }

    public static boolean j4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5616bf8", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        List<String> list = s0;
        if (list == null) {
            return "subscription".equals(str);
        }
        return list.contains(str);
    }

    public static boolean n4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb28502", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (j0 == null) {
            ArrayList arrayList = new ArrayList();
            j0 = arrayList;
            arrayList.add("subscription");
        }
        return j0.contains(str);
    }

    public static boolean t4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ce2265", new Object[]{str})).booleanValue();
        }
        List<String> list = e;
        if (list != null) {
            return list.contains(str);
        }
        zub c3 = com.taobao.android.dinamicx.g.c();
        if (c3 == null) {
            return false;
        }
        e = Arrays.asList(c3.getConfig("group_dinamicx_elder", "dinamic_elder_white_list", "purchase").trim().split(","));
        return false;
    }

    public static boolean X3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5f059cc", new Object[]{str})).booleanValue();
        }
        if (Y0 == null) {
            Y0 = Boolean.valueOf(Boolean.parseBoolean(hc6.a("group_dinamicx_storage_perf", "dinamic_enable_storage_perf", "true").trim()));
        }
        if (Z0 == null) {
            Z0 = Arrays.asList(hc6.a("group_dinamicx_storage_perf", "dinamic_storage_perf_white_list", "").trim().split(","));
        }
        return Y0.booleanValue() || Z0.contains(str);
    }

    public static boolean v5(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ff0ad13", new Object[]{dXRuntimeContext})).booleanValue();
        }
        if (dXRuntimeContext == null) {
            return false;
        }
        if (f32743a == null) {
            ArrayList arrayList = new ArrayList();
            f32743a = arrayList;
            arrayList.add("subscription");
        }
        return f32743a.contains(dXRuntimeContext.c()) || b;
    }
}
