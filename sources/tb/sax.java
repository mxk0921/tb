package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sax implements r1r, obk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Set<String> d;

    /* renamed from: a  reason: collision with root package name */
    public volatile SharedPreferences f27917a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Set<String> c = new HashSet();

    static {
        HashSet hashSet = new HashSet(255);
        d = hashSet;
        hashSet.add("tbsearch_non_video");
        hashSet.add("tbsearch_non_intelligent_end");
        hashSet.add("tbsearch_dynamic_pic_degraded");
        hashSet.add("detail_activity_precreate");
        hashSet.add("detail_ts_prefetch");
        hashSet.add("detail_main_pic_transmit");
        hashSet.add("detail_reuse_component");
        hashSet.add("detail_sku_async");
        hashSet.add("detail_log_optimize");
        hashSet.add("home_openHVideoViewPerformance");
        hashSet.add("home_openRecyclerViewPreload");
        hashSet.add("home_openDXPrefetch");
        hashSet.add("home_openSwipingLoad");
        hashSet.add("image_device_scale");
        hashSet.add("image_post_front_ui");
        hashSet.add("image_cache_fuzzy_match");
        hashSet.add("image_reporter_async");
        hashSet.add("enableMultiExecutor");
        hashSet.add("br_performance");
        hashSet.add("detail_mtop_handler");
        hashSet.add("alivfs_lsm");
        hashSet.add("tbsearch_fps_perf");
        hashSet.add("tbsearch_first_screen_perf");
        hashSet.add("home_openCallbackNotOnMainThread");
        hashSet.add("home_openColdReqOpt");
        hashSet.add("home_openJSONOpt");
        hashSet.add("home_openLoadCacheOpt");
        hashSet.add("home_openDXPreRender");
        hashSet.add("home_openLowDeviceDowngrade");
        hashSet.add("home_openFlingVelocity");
        hashSet.add("link_opt_open");
        hashSet.add("link_opt_open_julang");
        hashSet.add("link_url_rewrite");
        hashSet.add("ApmReceiveOuterEvent");
        hashSet.add("enable_wv_prefetch");
        hashSet.add("consume_wvprefetch");
        hashSet.add("link_opt_src_growth_dhh");
        hashSet.add("sendUtInit");
        hashSet.add("linkInOrder");
        hashSet.add("afc_new_link_info_opt");
        hashSet.add("afc_login_token_opt");
        hashSet.add("mtop_long_param_optimize");
        hashSet.add("launchTurbo");
        hashSet.add("turbotBootBackground");
        hashSet.add("invokedAsFinish");
        hashSet.add("ApmInitPerformanceOpt");
        hashSet.add("BXLaunchOpt");
        hashSet.add("POPCallWeex2InitOpt");
        hashSet.add("POPCallWeexInitOpt");
        hashSet.add("android_poplayer_page_ready_api");
        hashSet.add("apmPingPongUseFront");
        hashSet.add("cmtCommitOpt");
        hashSet.add(kiq.SWITCH_NAME);
        hashSet.add("image_notify_launch_finish");
        hashSet.add("image_opt_init");
        hashSet.add("journal_mode_truncate");
        hashSet.add("key_huawei_content_provider_load_on_demand");
        hashSet.add("key_pre_load_indicator_view");
        hashSet.add("link_launch_opt");
        hashSet.add("mtop_delay_init");
        hashSet.add("navigationOpt");
        hashSet.add("network_launch_optimize");
        hashSet.add("network_launch_optimize_v2");
        hashSet.add("newdetail_enable_weex_init_when_need");
        hashSet.add("orange_load_config_optimize");
        hashSet.add("orange_regexp_optimize");
        hashSet.add("poplayer_launch_task_opt");
        hashSet.add("poplayer_launch_task_opt_v3");
        hashSet.add("start_public_menu_init_delay");
        hashSet.add("use_bcontroller_without_downgrade");
        hashSet.add("version_switch_opt");
        hashSet.add("weexOpt_weex1_delay");
        hashSet.add("weexOpt_weex2_delay");
        hashSet.add("welBreak");
        hashSet.add(wms.DEFER_INIT_PREFETCH_CONFIG);
        hashSet.add("OptInitWindVane");
        hashSet.add("OptUCSoInject");
        hashSet.add("weex_init_process_opt_v2");
        hashSet.add("poplayer_launch_task_net_intercept_remove");
        hashSet.add("OptInitWvParam");
        hashSet.add("weex_init_process_opt");
    }

    @Override // tb.r1r
    public void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb13d969", new Object[]{this, context, str, new Boolean(z)});
        }
    }

    @Override // tb.r1r
    public void b(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67ec839", new Object[]{this, context, map});
            return;
        }
        d(context);
        OrangeConfig.getInstance().getConfigs("ab_watcher_indices");
        OrangeConfig.getInstance().registerListener(new String[]{"ab_watcher_indices"}, this, true);
    }

    @Override // tb.r1r
    public Map<String, tij> c(Context context) throws UnsupportedOperationException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8d448ddf", new Object[]{this, context});
        }
        throw new UnsupportedOperationException("unsupported operation");
    }

    @Override // tb.r1r
    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6cf9289", new Object[]{this, context});
        } else if (this.b.compareAndSet(false, true)) {
            this.f27917a = context.getSharedPreferences("ab_watcher_indices_switches", 0);
            Set<String> stringSet = this.f27917a.getStringSet("age_black_list", Collections.emptySet());
            if (stringSet != null) {
                this.c.addAll(stringSet);
            }
        }
    }

    @Override // tb.r1r
    public Boolean e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("ed4b7600", new Object[]{this, context, str});
        }
        if (!((HashSet) this.c).contains(str) && ((HashSet) d).contains(str)) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // tb.r1r
    public r2w f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r2w) ipChange.ipc$dispatch("3cb9ab1b", new Object[]{this, context});
        }
        ifj b = t2w.b(g(), -1L, -1L, -1L, -1L);
        Iterator it = ((HashSet) d).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!((HashSet) this.c).contains(str)) {
                b.b(t2w.e(str, Boolean.TRUE.toString(), g()));
            }
        }
        return b;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return "WhiteList";
    }

    @Override // tb.obk
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
        } else if (map == null || Boolean.parseBoolean(map.get("fromCache"))) {
            kva.d("WhiteListSwitchesImpl", "discard this update because of it is from cache");
        } else {
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
            if (configs == null) {
                kva.d("WhiteListSwitchesImpl", "no config found for " + str + " in orange");
            } else if (this.f27917a == null) {
                kva.d("WhiteListSwitchesImpl", "sp is null, maybe not it, something went wrong");
            } else {
                HashSet hashSet = new HashSet(Arrays.asList(((String) kva.g(configs, "age_black_list", "")).split(",")));
                if (!hashSet.isEmpty()) {
                    kva.d("WhiteListSwitchesImpl", "black list size: " + hashSet);
                    this.f27917a.edit().putStringSet("age_black_list", hashSet).commit();
                }
            }
        }
    }
}
