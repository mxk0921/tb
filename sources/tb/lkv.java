package tb;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.update.framework.UpdateRuntime;
import com.taobao.update.instantpatch.InstantPatchUpdater;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lkv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f23388a = "UpdateSwitcherConfig";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements y8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ df4 val$config;

        /* compiled from: Taobao */
        /* renamed from: tb.lkv$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class C0982a extends TypeReference<Map<String, List<String>>> {
            public C0982a() {
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class b extends TypeReference<Map<String, List<String>>> {
            public b() {
            }
        }

        public a(df4 df4Var) {
            this.val$config = df4Var;
        }

        @Override // tb.y8l
        public void onConfigUpdate(String str) {
            String[] split;
            List parseArray;
            List parseArray2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
                return;
            }
            String config = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.DISABLED_PATCH_CLASSES, "");
            if (!TextUtils.isEmpty(config)) {
                InstantPatchUpdater.instance().setDisabledPatchClazzes(config);
            }
            String config2 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.UPDATE_ENABLED_INTERCEPROT, "");
            if (TextUtils.equals(config2, "false") || TextUtils.equals(config2, "true")) {
                PreferenceManager.getDefaultSharedPreferences(this.val$config.application).edit().putString(gjv.UPDATE_ENABLED_INTERCEPROT, config2).apply();
            }
            String config3 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.UPDATE_DIALOG_UI_V2, "true");
            if (!TextUtils.isEmpty(config3)) {
                PreferenceManager.getDefaultSharedPreferences(this.val$config.application).edit().putString(gjv.UPDATE_DIALOG_UI_V2, config3).apply();
            }
            String config4 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.FLEXA_ENABLED, "true");
            if (TextUtils.equals(config4, "false") || TextUtils.equals(config4, "true")) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("flexa_enabled_" + nkv.getVersionName(), Boolean.parseBoolean(config4)).apply();
            }
            String config5 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.DISABLE_FEATURES_KEY, "");
            if (!TextUtils.isEmpty(config5)) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putString("disableFeatures_" + nkv.getVersionName(), config5).apply();
            }
            String config6 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.DOWNLOAD_FEATURES_ENABLED, "true");
            if (TextUtils.equals(config6, "false") || TextUtils.equals(config6, "true")) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("download_feature_enabled_" + nkv.getVersionName(), Boolean.parseBoolean(config6)).apply();
            }
            String config7 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.INVALID_HISTORY_FEATURES_KEY, "");
            if (!TextUtils.isEmpty(config7)) {
                for (String str2 : config7.split(",")) {
                    o49.b().c().a(nkv.getVersionName(), str2);
                }
            }
            String config8 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.MERGE_HISTORY_FEATURES_ENABLED, "true");
            if (TextUtils.equals(config8, "false") || TextUtils.equals(config8, "true")) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("merge_history_feature_enabled_" + nkv.getVersionName(), Boolean.parseBoolean(config8)).apply();
            }
            String config9 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, "features_should_remote_download", "");
            if (!TextUtils.isEmpty(config9)) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putStringSet("features_should_remote_download_" + nkv.getVersionName(), new HashSet(Arrays.asList(config9.split(",")))).apply();
            }
            if (TextUtils.equals(OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.DISABLE_FEATUREUPDATE, ""), "true")) {
                com.taobao.update.dynamicfeature.a.instance().rollBack();
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("disable_featureupdate_" + nkv.getVersionName(), true).apply();
            } else {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("disable_featureupdate_" + nkv.getVersionName(), false).apply();
            }
            try {
                String config10 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, n1r.CAN_USE_PRELOAD_FEATURES, "");
                if (!TextUtils.isEmpty(config10) && (parseArray2 = JSON.parseArray(config10, String.class)) != null && parseArray2.size() > 0) {
                    Iterator it = parseArray2.iterator();
                    while (it.hasNext()) {
                        n1r.z(this.val$config.application, "can_use_preload_features_" + ((String) it.next()), false);
                    }
                }
            } catch (Exception unused) {
            }
            try {
                String config11 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, n1r.CAN_USE_HISTORY_FEATURES, "");
                if (!TextUtils.isEmpty(config11) && (parseArray = JSON.parseArray(config11, String.class)) != null && parseArray.size() > 0) {
                    Iterator it2 = parseArray.iterator();
                    while (it2.hasNext()) {
                        n1r.A(this.val$config.application, "can_use_history_features_" + ((String) it2.next()), false);
                    }
                }
            } catch (Exception unused2) {
            }
            try {
                String config12 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, n1r.DISABLED_USE_PRELOAD_FEATURES, "");
                if (!TextUtils.isEmpty(config12)) {
                    Log.e(lkv.access$000(), "onreceive:" + config12);
                    Map map = (Map) JSON.parseObject(config12, new C0982a(), new Feature[0]);
                    if (map != null && map.size() > 0) {
                        for (Map.Entry entry : map.entrySet()) {
                            n1r.y(this.val$config.application, "disabled_use_preload_features_" + ((String) entry.getKey()), new HashSet((Collection) entry.getValue()));
                        }
                    }
                }
            } catch (Exception unused3) {
            }
            try {
                String config13 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, n1r.DISABLED_USE_HISTORY_FEATURES, "");
                if (!TextUtils.isEmpty(config13)) {
                    Log.e(lkv.access$000(), "onreceive:" + config13);
                    Map map2 = (Map) JSON.parseObject(config13, new b(), new Feature[0]);
                    if (map2 != null && map2.size() > 0) {
                        for (Map.Entry entry2 : map2.entrySet()) {
                            n1r.x(this.val$config.application, "disabled_use_history_features_" + ((String) entry2.getKey()), new HashSet((Collection) entry2.getValue()));
                        }
                    }
                }
            } catch (Exception unused4) {
            }
            String config14 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.DISABLE_FEATURE_DOWNLOAD, "");
            if (!TextUtils.isEmpty(config14)) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("disable_feature_download_" + nkv.getVersionName(), Boolean.parseBoolean(config14)).commit();
            }
            String config15 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, "auto_feature_download", "");
            if (!TextUtils.isEmpty(config15)) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putStringSet("auto_feature_download_" + nkv.getVersionName(), new HashSet(Arrays.asList(config15.split(",")))).commit();
            }
            String config16 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.NEW_FEATUREUPDATE_OPENED, "");
            if (!TextUtils.isEmpty(config16)) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("new_featureupdate_opened_" + nkv.getVersionName(), Boolean.parseBoolean(config16)).commit();
            }
            String config17 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.FLEXA_CLOSE_ACTIVITY_INSTALL_RESOURCES, "");
            if (!TextUtils.isEmpty(config17)) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putStringSet(gjv.FLEXA_CLOSE_ACTIVITY_INSTALL_RESOURCES, new HashSet(Arrays.asList(config17.split(",")))).commit();
            }
            String config18 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.FLEXA_ANR_OPT_ENABLED, "");
            if (!TextUtils.isEmpty(config18)) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("flexa_anr_opt_enabled_" + nkv.getVersionName(), Boolean.parseBoolean(config18)).commit();
            }
            String config19 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.FLEXA_PRE_COMPILE_FEATURES, "");
            if (!TextUtils.isEmpty(config19)) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putStringSet("flexa_pre_compile_features_" + nkv.getVersionName(), new HashSet(Arrays.asList(config19.split(",")))).commit();
            }
            String config20 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.FLEXA_CLEAN_HISFEATURES_FEATURES, "");
            if (!TextUtils.isEmpty(config20)) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("flexa_clean_hisfeatures_features_" + nkv.getVersionName(), Boolean.parseBoolean(config20)).commit();
            }
            String config21 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, "flexa_install_feature_from_channel", "");
            if (!TextUtils.isEmpty(config21)) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("flexa_install_feature_from_channel_" + nkv.getVersionName(), Boolean.parseBoolean(config21)).commit();
            }
            String config22 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, "disabled_his_patch_versions", "");
            if (!TextUtils.isEmpty(config22)) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putStringSet("disabled_his_patch_versions_" + nkv.getVersionName(), new HashSet(Arrays.asList(config22.split(",")))).commit();
            }
            String config23 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.FLEXA_ADD_SPLIT_TO_LOADEDAPK, "");
            if (!TextUtils.isEmpty(config23)) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("flexa_add_split_to_loadedapk_" + nkv.getVersionName(), Boolean.parseBoolean(config23)).commit();
            }
            String config24 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.FLEXA_FEATURE_DIFF_CLOSED, "");
            if (!TextUtils.isEmpty(config24)) {
                for (String str3 : config24.split(",")) {
                    this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("flexa_feature_diff_opened_" + nkv.getVersionName() + "_" + str3, false).commit();
                }
            }
            String config25 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.FLEXA_OPT_SERVICE, "");
            if (!TextUtils.isEmpty(config25)) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("flexa_opt_service_" + nkv.getVersionName(), Boolean.parseBoolean(config25)).commit();
            }
            String config26 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.FLEXA_DISABLED_VERIFY, "");
            if (!TextUtils.isEmpty(config26)) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("flexa_disabled_verify_" + nkv.getVersionName(), Boolean.parseBoolean(config26)).commit();
            }
            String config27 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.OPEN_FLEXA_SCENE, "");
            if (!TextUtils.isEmpty(config27)) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("open_flexa_scene_" + nkv.getVersionName(), Boolean.parseBoolean(config27)).commit();
            }
            String config28 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.NEW_PATCH_UPDATE, "false");
            if (!TextUtils.isEmpty(config28)) {
                this.val$config.application.getSharedPreferences(gjv.UPDATE_CONFIG_GROUP, 0).edit().putBoolean(gjv.NEW_PATCH_UPDATE + "_" + nkv.getVersionName(), Boolean.parseBoolean(config28)).commit();
            }
            String config29 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.INIT_FLEXA_ALL, "false");
            if (!TextUtils.isEmpty(config29)) {
                this.val$config.application.getSharedPreferences(gjv.UPDATE_CONFIG_GROUP, 0).edit().putBoolean(gjv.INIT_FLEXA_ALL + "_" + nkv.getVersionName(), Boolean.parseBoolean(config29)).commit();
            }
            String config30 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.BLACK_POP_ACTIVITIES, "");
            if (!TextUtils.isEmpty(config30)) {
                List asList = Arrays.asList(config30.split(","));
                df4.blackDialogActivity.addAll(asList);
                this.val$config.application.getSharedPreferences(gjv.UPDATE_CONFIG_GROUP, 0).edit().putStringSet(gjv.BLACK_POP_ACTIVITIES, new HashSet(asList)).commit();
            }
            String config31 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.BLACK_POP_TAGS, "");
            if (!TextUtils.isEmpty(config31)) {
                List asList2 = Arrays.asList(config31.split(","));
                df4.blackDialogFragment.addAll(asList2);
                this.val$config.application.getSharedPreferences(gjv.UPDATE_CONFIG_GROUP, 0).edit().putStringSet(gjv.BLACK_POP_TAGS, new HashSet(asList2)).commit();
            }
            String config32 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.BACKGROUND_UPDATE_ENABLED, "");
            if (!TextUtils.isEmpty(config32)) {
                this.val$config.application.getSharedPreferences(gjv.UPDATE_CONFIG_GROUP, 0).edit().putBoolean(gjv.BACKGROUND_UPDATE_ENABLED, Boolean.parseBoolean(config32)).commit();
            }
            String config33 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.TAB_NOTIFY_ENABLED, "");
            if (!TextUtils.isEmpty(config33)) {
                this.val$config.application.getSharedPreferences(gjv.UPDATE_CONFIG_GROUP, 0).edit().putBoolean(gjv.TAB_NOTIFY_ENABLED, Boolean.parseBoolean(config33)).commit();
            }
            String config34 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.NAV_LOAD_FEATURES_KEY, "");
            if (!TextUtils.isEmpty(config34)) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putStringSet(gjv.NAV_LOAD_FEATURES_KEY, new HashSet(Arrays.asList(config34.split(",")))).commit();
            }
            String config35 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.FLEXA_OPEN_INJECT_ACTIVITIES, "");
            if (!TextUtils.isEmpty(config35)) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putStringSet("flexa_open_inject_activities_" + nkv.getVersionName(), new HashSet(Arrays.asList(config35.split(",")))).commit();
            }
            String config36 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.SO_LOAD_FEATURES_KEY, "");
            if (!TextUtils.isEmpty(config36)) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean(gjv.SO_LOAD_FEATURES_KEY, Boolean.parseBoolean(config36)).commit();
            }
            String config37 = OrangeConfig.getInstance().getConfig(gjv.UPDATE_CONFIG_GROUP, "deffered_download_feature_enabled", "");
            if (!TextUtils.isEmpty(config37)) {
                this.val$config.application.getSharedPreferences("dynamic_features_config", 0).edit().putBoolean("deffered_download_feature_enabled", Boolean.parseBoolean(config37)).commit();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ df4 val$config;

        public b(df4 df4Var) {
            this.val$config = df4Var;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Log.e("MiniConfig", "onConfigUpdate: start update config!");
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
            JSONObject jSONObject = new JSONObject();
            if (configs.containsKey("sevendays_update")) {
                UpdateRuntime.sSevenDaysUpdate = Boolean.parseBoolean(configs.get("sevendays_update"));
            }
            try {
                for (Map.Entry<String, String> entry : configs.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                    Log.e("MiniConfig", "onConfigUpdate: put key " + entry.getKey() + " value " + entry.getValue());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            String access$000 = lkv.access$000();
            Log.e(access$000, "onConfigUpdate: config json :" + jSONObject.toString());
            lkv.toFile(this.val$config.application, "minitb_configs", jSONObject.toString());
        }
    }

    static {
        t2o.a(954204173);
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return f23388a;
    }

    public static void toFile(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6d1dfe", new Object[]{context, str, str2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getDir("tombstone", 0).getAbsolutePath());
        String str3 = File.separator;
        sb.append(str3);
        sb.append("minisafemode");
        sb.append(str3);
        sb.append(str);
        File file = new File(sb.toString());
        try {
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                if (!file.createNewFile()) {
                    Log.e(f23388a, "toFile: file is not exit!");
                    return;
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(str2.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Throwable th) {
            String str4 = f23388a;
            Log.e(str4, "toFile: occur throwable: " + th.toString());
            th.printStackTrace();
        }
    }

    public void initSwitchConfig(df4 df4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e17b2fc7", new Object[]{this, df4Var});
            return;
        }
        OrangeConfig.getInstance().registerListener(new String[]{gjv.UPDATE_CONFIG_GROUP}, new a(df4Var));
        OrangeConfig.getInstance().registerListener(new String[]{"minitb_jijian"}, new b(df4Var), true);
    }
}
