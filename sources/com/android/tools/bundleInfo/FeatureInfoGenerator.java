package com.android.tools.bundleInfo;

import com.alipay.mobile.verifyidentity.utils.DynamicBundleHelper;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.appbundle.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import tb.jm9;
import tb.jz7;
import tb.kpu;
import tb.u58;
import tb.yq0;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes11.dex */
public class FeatureInfoGenerator {
    public static String appVersion = "10.48.30";
    private static DynamicFeatureInfo bundleInfo;

    public static ConcurrentHashMap<String, DynamicFeatureInfo> generate() {
        ConcurrentHashMap<String, DynamicFeatureInfo> concurrentHashMap = new ConcurrentHashMap<>();
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "tbsearch_remote";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.1
        };
        bundleInfo.version = "10.48.30@1.0.59.42";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "20aa801a0df09d0099a42d1a8f6efd09";
        bundleInfo.size = 211978L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/20aa801a0df09d0099a42d1a8f6efd09/tbsearch_remote.so";
        bundleInfo.priority = 5;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.2
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.3
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.4
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.5
            {
                put("com.taobao.search.sf.remote.RemoteWidgetFactory", "com.taobao.search.sf.remote.RemoteWidgetFactoryImpl");
            }
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.6
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.7
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("tbsearch_remote", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "TBSubscribe";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.8
        };
        bundleInfo.version = "10.48.30@0.0.24.2";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "7b7f115eeb50ef56d4d4e1f9392d38e1";
        bundleInfo.size = 405952L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/7b7f115eeb50ef56d4d4e1f9392d38e1/TBSubscribe.so";
        bundleInfo.priority = 8;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.9
            {
                add("taobao_weex_adapter");
            }
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.10
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.11
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.12
            {
                put("com.taobao.tao.topmultitab.protocol.IHomeSubTabController", "com.taobao.android.dinamicx.subscribe.protocol.SubscribeTabController");
            }
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.13
            {
                add("com.taobao.android.dinamicx.subscribe.protocol.shop.weex.ShopSubscribeWeexComponent");
            }
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.14
            {
                add("com.taobao.android.dinamicx.subscribe.ui.SubscribeCommentFragment");
            }
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("TBSubscribe", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "left_sdk";
        bundleInfo.featureInitalClass = "com.taobao.leftsdk.LeftSDKInitializerInternal";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.15
        };
        bundleInfo.version = "10.48.30@1.0.3.56";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "ed93c83fd8459353b7077a7b57bb110c";
        bundleInfo.size = 102874L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/ed93c83fd8459353b7077a7b57bb110c/left_sdk.so";
        bundleInfo.priority = 10;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.16
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.17
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.18
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.19
            {
                put("com.taobao.leftsdk.triver.StepCountBridgeApi", "com.taobao.leftsdk.triver.TBStepCountBridgeExtensionInternal");
            }
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.20
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.21
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("left_sdk", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "elemeadapter_android";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.22
        };
        bundleInfo.version = "10.48.30@1.3.7.8";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "a55f9de5bb97d273e54efbe4794f0984";
        bundleInfo.size = 45451L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/a55f9de5bb97d273e54efbe4794f0984/elemeadapter_android.so";
        bundleInfo.priority = 10;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.23
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.24
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.25
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.26
            {
                put("me.ele.bridge.PizzaApi", "me.ele.bridge.NetService");
            }
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.27
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.28
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("elemeadapter_android", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "TB3DSpace";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.29
        };
        bundleInfo.version = "10.48.30@1.0.180";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "b0a9263b29a169ca403cb2aa69336eea";
        bundleInfo.size = 9169513L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/b0a9263b29a169ca403cb2aa69336eea/TB3DSpace.so";
        bundleInfo.priority = -1;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.30
            {
                add(a.TAOPAI_FEATURE);
            }
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.31
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.32
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.33
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.34
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.35
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("TB3DSpace", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = MainRequestParams.INDUSTRY;
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.36
        };
        bundleInfo.version = "10.48.30@1.0.68";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "d46418ebb3fcd45c5a609acde8d6d9b9";
        bundleInfo.size = 228692L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/d46418ebb3fcd45c5a609acde8d6d9b9/industry.so";
        bundleInfo.priority = 5;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.37
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.38
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.39
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.40
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.41
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.42
        };
        bundleInfo.status = 0;
        concurrentHashMap.put(MainRequestParams.INDUSTRY, bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "fm_android";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.43
        };
        bundleInfo.version = "10.48.30@0.0.1.0";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "7daf67baa2e030259fce8f07267535a9";
        bundleInfo.size = 99888L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/7daf67baa2e030259fce8f07267535a9/fm_android.so";
        bundleInfo.priority = -1;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.44
            {
                add(MainRequestParams.INDUSTRY);
            }
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.45
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.46
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.47
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.48
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.49
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("fm_android", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "tmallgeniefortaobao";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.50
        };
        bundleInfo.version = "10.48.30@1.0.3";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "863e4074bcd39aae3ba4e8f1ec72af54";
        bundleInfo.size = 37259L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/863e4074bcd39aae3ba4e8f1ec72af54/tmallgeniefortaobao.so";
        bundleInfo.priority = 10;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.51
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.52
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.53
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.54
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.55
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.56
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("tmallgeniefortaobao", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = jm9.ARTIFACT_ID;
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.57
        };
        bundleInfo.version = "10.48.30@1.0.45";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "f9e37aecbdf09568baeb0eea02d5bca4";
        bundleInfo.size = 271043L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/f9e37aecbdf09568baeb0eea02d5bca4/fliggy_vacation_ttdetail.so";
        bundleInfo.priority = 2;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.58
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.59
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.60
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.61
            {
                put("com.taobao.android.detail.ttdetail.platformization.business.BizLifecycle", "com.taobao.android.detail.ttdetail.platformization.business.BizContext");
            }
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.62
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.63
        };
        bundleInfo.status = 0;
        concurrentHashMap.put(jm9.ARTIFACT_ID, bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "tmgdelivery";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.64
        };
        bundleInfo.version = "10.48.30@1.0.6.11";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "85c00192e5b5b06ee9b491f50724b041";
        bundleInfo.size = 42292L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/85c00192e5b5b06ee9b491f50724b041/tmgdelivery.so";
        bundleInfo.priority = 5;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.65
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.66
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.67
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.68
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.69
            {
                add("com.taobao.android.tmgdelivery.TMGDeliveryPurchaseFragment");
            }
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.70
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("tmgdelivery", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "tbsocialsdk";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.71
        };
        bundleInfo.version = "10.48.30@2.1.1.98";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "0c3651d134d350ee8bc57a498282a1b1";
        bundleInfo.size = 205868L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/0c3651d134d350ee8bc57a498282a1b1/tbsocialsdk.so";
        bundleInfo.priority = 6;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.72
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.73
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.74
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.75
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.76
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.77
            {
                add("com.taobao.vividsocial.dialog.CmtDialogFragment");
                add("com.taobao.vividsocial.dialog.CmtReplyFragment");
                add("com.taobao.android.commentpanel.container.CommentPanelFragment");
            }
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("tbsocialsdk", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "tbvsvideofeature";
        bundleInfo.featureInitalClass = "com.taobao.android.interactive.InteractiveApplication";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.78
        };
        bundleInfo.version = "10.48.30@1.0.52";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "087afa0807ad26c54c96008bf248fa77";
        bundleInfo.size = 426852L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/087afa0807ad26c54c96008bf248fa77/tbvsvideofeature.so";
        bundleInfo.priority = 5;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.79
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.80
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.81
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.82
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.83
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.84
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("tbvsvideofeature", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "taobao_wangxin";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.85
        };
        bundleInfo.version = "10.48.30@3.5.7.92";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "5db11a3fef03a1cd4265b8a8ddf3f6ef";
        bundleInfo.size = 5376820L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/5db11a3fef03a1cd4265b8a8ddf3f6ef/taobao_wangxin.so";
        bundleInfo.priority = 0;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.86
            {
                add("messagesdkwrapper");
                add("rxandroid");
            }
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.87
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.88
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.89
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.90
            {
                add("com.taobao.message.kit.tools.event.EventListener");
                add("com.taobao.message.conversation.DefaultMessageTabHost");
                add("com.taobao.message.message_open_api.core.CallManager");
            }
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.91
            {
                add("com.taobao.message.chat.dojo.AuraFragment");
                add("com.taobao.message.container.common.custom.lifecycle.PageLifecycleDispatchFragment");
            }
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("taobao_wangxin", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "applicationmonitor_olympic";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.92
        };
        bundleInfo.version = "10.48.30@1.0.4.90";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "be5007606f18649cb5fbdda0cb2eb8d0";
        bundleInfo.size = 45451L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/be5007606f18649cb5fbdda0cb2eb8d0/applicationmonitor_olympic.so";
        bundleInfo.priority = 10;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.93
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.94
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.95
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.96
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.97
            {
                add("com.taobao.monitor.olympic.OlympicLauncher");
                add("com.taobao.monitor.olympic.OlympicOrangeLauncher");
            }
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.98
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("applicationmonitor_olympic", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = FlexaLiveX.TAOLIVE_HOMEPAGE;
        bundleInfo.featureInitalClass = "com.taobao.android.livehome.plugin.atype.flexaremote.LiveHomeInitial";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.99
        };
        bundleInfo.version = "10.48.30@1.3.99.195";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "659c40feb2150ebeb7bfedb0aa2e8be5";
        bundleInfo.size = 539824L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/659c40feb2150ebeb7bfedb0aa2e8be5/LivehomeAtype.so";
        bundleInfo.priority = 0;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.100
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.101
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.102
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.103
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.104
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.105
            {
                add("com.taobao.android.livehome.plugin.atype.flexaremote.homepage2.fragment.HomeSubChannelFragment");
            }
        };
        bundleInfo.status = 0;
        concurrentHashMap.put(FlexaLiveX.TAOLIVE_HOMEPAGE, bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = FlexaLiveX.ATYPE;
        bundleInfo.featureInitalClass = "com.taobao.android.live.plugin.atype.flexaremote.ATypeInitial";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.106
        };
        bundleInfo.version = "10.48.30@1.2.1210.dynamic";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "b6fca7e31f032e4ef78165e8dbcebda4";
        bundleInfo.size = 1099988L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/b6fca7e31f032e4ef78165e8dbcebda4/liveroom_android_plugin_AType.so";
        bundleInfo.priority = 7;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.107
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.108
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.109
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.110
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.111
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.112
            {
                add("com.taobao.android.live.plugin.atype.flexaremote.tbliveinteractive.container.h5.TaoLiveWebBottomFragment");
            }
        };
        bundleInfo.status = 0;
        concurrentHashMap.put(FlexaLiveX.ATYPE, bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = FlexaLiveX.BTYPE;
        bundleInfo.featureInitalClass = "com.taobao.android.live.plugin.btype.flexaremote.BTypeInitial";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.113
        };
        bundleInfo.version = "10.48.30@1.0.4734.33";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "094ffbd3b0644f4ebd76c85605d23e02";
        bundleInfo.size = 738382L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/094ffbd3b0644f4ebd76c85605d23e02/liveroom_android_plugin_BType.so";
        bundleInfo.priority = 4;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.114
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.115
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.116
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.117
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.118
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.119
        };
        bundleInfo.status = 0;
        concurrentHashMap.put(FlexaLiveX.BTYPE, bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = FlexaLiveX.TBLIVE_GIFT;
        bundleInfo.featureInitalClass = "com.taobao.android.live.plugin.btype.flexaremote.TBLiveGiftInitial";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.120
        };
        bundleInfo.version = "10.48.30@3.72.1.10241444";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "7b8fe6b801f5b4c53cc8017d6ea140d7";
        bundleInfo.size = 58234L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/7b8fe6b801f5b4c53cc8017d6ea140d7/tblive_gift_android.so";
        bundleInfo.priority = 4;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.121
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.122
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.123
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.124
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.125
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.126
        };
        bundleInfo.status = 0;
        concurrentHashMap.put(FlexaLiveX.TBLIVE_GIFT, bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "taowise_android_aar";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.127
        };
        bundleInfo.version = "10.48.30@1.5.87";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "e790290d95d521acecab6bf21e6710d0";
        bundleInfo.size = 1329188L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/e790290d95d521acecab6bf21e6710d0/taowise_android_aar.so";
        bundleInfo.priority = 6;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.128
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.129
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.130
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.131
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.132
            {
                add("com.taobao.taowise.extension.TaoWiseInit");
            }
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.133
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("taowise_android_aar", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "ratefeature";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.134
        };
        bundleInfo.version = "10.48.30@1.0.90";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "62535055c7d93282ce57416dda8d9bad";
        bundleInfo.size = 187852L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/62535055c7d93282ce57416dda8d9bad/ratefeature.so";
        bundleInfo.priority = 3;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.135
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.136
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.137
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.138
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.139
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.140
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("ratefeature", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "tb_imagesearch_remote";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.141
        };
        bundleInfo.version = "10.48.30@2.0.24";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "e87b9b2b1f8e2bffea488563d53b0477";
        bundleInfo.size = 209744L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/e87b9b2b1f8e2bffea488563d53b0477/tb_imagesearch_remote.so";
        bundleInfo.priority = 3;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.142
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.143
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.144
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.145
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.146
            {
                add("com.etao.feimagesearch.capture.v3.CaptureV3Controller");
            }
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.147
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("tb_imagesearch_remote", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "voice_assistant";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.148
        };
        bundleInfo.version = "10.48.30@1.1.0.7";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "bc5b722a2d1b68ec844da1175732acc0";
        bundleInfo.size = 1072952L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/bc5b722a2d1b68ec844da1175732acc0/voice_assistant.so";
        bundleInfo.priority = 5;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.149
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.150
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.151
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.152
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.153
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.154
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("voice_assistant", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "metrickit_honor";
        bundleInfo.featureInitalClass = "com.taobao.metrickit.honor.FlexaLauncher";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.155
        };
        bundleInfo.version = "10.48.30@3.0.7";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "bea53642bbb025bc895bcc3d6c2af4a4";
        bundleInfo.size = 53643L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/bea53642bbb025bc895bcc3d6c2af4a4/metrickit_honor.so";
        bundleInfo.priority = -1;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.156
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.157
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.158
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.159
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.160
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.161
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("metrickit_honor", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "rocket_megability_kit";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.162
        };
        bundleInfo.version = "10.48.30@0.0.1";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "2720ac3228937f722efbcc0814319752";
        bundleInfo.size = 12683L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/2720ac3228937f722efbcc0814319752/rocket_megability_kit.so";
        bundleInfo.priority = 8;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.163
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.164
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.165
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.166
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.167
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.168
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("rocket_megability_kit", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "taobao_shake_sdk";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.169
        };
        bundleInfo.version = "10.48.30@1.1.32.26";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "912ce1255a0ba7080f15ae65ff216f19";
        bundleInfo.size = 41566L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/912ce1255a0ba7080f15ae65ff216f19/taobao_shake_sdk.so";
        bundleInfo.priority = 5;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.170
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.171
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.172
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.173
            {
                put("com.taobao.android.shake.remote.IShakeRemoteApi", "com.taobao.android.shake.ShakeRemoteApiImpl");
            }
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.174
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.175
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("taobao_shake_sdk", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "layoutmanager_feature";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.176
        };
        bundleInfo.version = "10.48.30@1.0.1569";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "04377eb2a4173504ea985bde24ec5820";
        bundleInfo.size = 275426L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/04377eb2a4173504ea985bde24ec5820/layoutmanager_feature.so";
        bundleInfo.priority = 6;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.177
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.178
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.179
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.180
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.181
            {
                add("com.taobao.tao.flexbox.layoutmanager.tool.ToolManager");
                add("com.efs.sdk.base.EfsTracker");
                add("com.taobao.cursor.CursorManager");
                add("com.taobao.tao.flexbox.layoutmanager.tool.Debugger");
                add("com.taobao.tao.flexbox.layoutmanager.component.BottomSheetComponent");
                add("com.taobao.tao.flexbox.layoutmanager.component.ImageScannerComponent");
                add("com.taobao.tao.flexbox.layoutmanager.component.OpacityComponent");
                add("com.taobao.tao.flexbox.layoutmanager.component.PhotoViewComponent");
                add("com.taobao.tao.flexbox.layoutmanager.component.NavComponent");
                add("com.taobao.tao.flexbox.layoutmanager.component.GoTopComponent");
                add("com.taobao.tao.flexbox.layoutmanager.component.ExposureComponent");
                add("com.taobao.tao.flexbox.layoutmanager.component.DragButtonComponent");
                add("com.taobao.tao.flexbox.layoutmanager.component.CheckBoxComponent");
                add("com.taobao.user.context.UCCollectEntry");
            }
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.182
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("layoutmanager_feature", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "tmallandroid_MirrorLifeAndroid";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.183
        };
        bundleInfo.version = "10.48.30@1.0.71";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "4f2f9f1fa94aa57675781e23a85b6240";
        bundleInfo.size = 144674L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/4f2f9f1fa94aa57675781e23a85b6240/tmallandroid_MirrorLifeAndroid.so";
        bundleInfo.priority = -1;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.184
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.185
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.186
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.187
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.188
            {
                add("com.tmall.wireless.mirrorlife.main.MirrorMainFragment");
            }
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.189
            {
                add("com.tmall.wireless.mirrorlife.main.MirrorMainFragment");
            }
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("tmallandroid_MirrorLifeAndroid", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "tblive_opensdk";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.190
        };
        bundleInfo.version = "10.48.30@0.0.0.101.60.28";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "3ffdb34763cb8afe0288b70c826989a5";
        bundleInfo.size = 3604817L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/3ffdb34763cb8afe0288b70c826989a5/tblive_opensdk.so";
        bundleInfo.priority = -1;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.191
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.192
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.193
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.194
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.195
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.196
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("tblive_opensdk", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "tmgbusiness4androidremote";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.197
        };
        bundleInfo.version = "10.48.30@1.0.25";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "674d01d4f0a877881787dde9bbe30388";
        bundleInfo.size = 83042L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/674d01d4f0a877881787dde9bbe30388/tmgbusiness4androidremote.so";
        bundleInfo.priority = 10;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.198
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.199
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.200
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.201
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.202
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.203
            {
                add("com.taobao.oversea.live.homepage.ContainerFragment");
                add("com.taobao.oversea.discovery.TmgDiscoveryRemoteFragment");
            }
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("tmgbusiness4androidremote", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "inside_weex_plugin";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.204
        };
        bundleInfo.version = "10.48.30@1.0.2";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "c2c83eb99a8c94413e3888498759e33a";
        bundleInfo.size = 284144L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/c2c83eb99a8c94413e3888498759e33a/inside_weex_plugin.so";
        bundleInfo.priority = 10;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.205
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.206
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.207
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.208
            {
                put("com.taobao.ma.api.ITBInsideService", "com.taobao.android.inside.plugin.AlipayInsideServiceImpl");
            }
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.209
            {
                add("com.alipay.android.phone.inside.service.InsideOperationService");
            }
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.210
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("inside_weex_plugin", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "quality_remote_android";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.211
        };
        bundleInfo.version = "10.48.30@1.0.14";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "6d1365266c71109c41dc97b4d4cfbab8";
        bundleInfo.size = 12683L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/6d1365266c71109c41dc97b4d4cfbab8/quality_remote_android.so";
        bundleInfo.priority = -1;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.212
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.213
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.214
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.215
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.216
            {
                add("com.taobao.android.qualityremote.adapter.Initializer");
            }
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.217
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("quality_remote_android", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "triver_taobao";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.218
            {
                put("10.48.20", "a3ec88f76a4d8bf026a012b3cb2182d2");
            }
        };
        bundleInfo.version = "10.48.30@1.3.1.75";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "7dd1a9c505167a003c54e66f710dfe8a";
        bundleInfo.size = 5020892L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/7dd1a9c505167a003c54e66f710dfe8a/triver_taobao.so";
        bundleInfo.priority = 8;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.219
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.220
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.221
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.222
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.223
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.224
            {
                add("com.alibaba.ariver.app.api.ui.fragment.RVFragment");
                add("com.alibaba.triver.fragment.TRFragment");
            }
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("triver_taobao", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "tucaobafeature";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.225
        };
        bundleInfo.version = "10.48.30@1.0.68";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "b11c8b45517aa602626e4273a1d2be5c";
        bundleInfo.size = 92994L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/b11c8b45517aa602626e4273a1d2be5c/tucaobafeature.so";
        bundleInfo.priority = 10;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.226
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.227
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.228
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.229
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.230
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.231
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("tucaobafeature", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = u58.DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC;
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.232
            {
                put("10.48.20", "c17d2116a6a9ed74c8b57738c9a7d64d");
            }
        };
        bundleInfo.version = "10.48.30@1.2.20";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "ef8a367c34b56286675d2eddf92f7c1f";
        bundleInfo.size = 11709581L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/ef8a367c34b56286675d2eddf92f7c1f/order_map.so";
        bundleInfo.priority = 8;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.233
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.234
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.235
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.236
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.237
            {
                add("com.taobao.android.order.bundle.weex2.view.AMapPlatformView");
                add("com.taobao.android.order.map.common.dx.DXBabelAMapViewV4WidgetNode");
                add("com.taobao.android.order.core.dinamicX.view.DXAMapViewWidgetNode");
                add("com.taobao.android.order.bundle.dinamicX.view.DXBabelAMapViewWidgetNode");
                add("com.taobao.android.order.bundle.dinamicX.view.amap.utils.LogisticDetailDataUtil");
            }
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.238
        };
        bundleInfo.status = 0;
        concurrentHashMap.put(u58.DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC, bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = a.TAOPAI_FEATURE;
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.239
        };
        bundleInfo.version = "10.48.30@6.21.6.24";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "9aebfac713697eb2e91cd8817b9ea160";
        bundleInfo.size = 1162147L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/9aebfac713697eb2e91cd8817b9ea160/taopai_business.so";
        bundleInfo.priority = 0;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.240
            {
                add(a.TAOPAI_SDK_FEATURE);
                add("rxandroid");
            }
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.241
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.242
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.243
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.244
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.245
        };
        bundleInfo.status = 0;
        concurrentHashMap.put(a.TAOPAI_FEATURE, bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = a.TAOPAI_SDK_FEATURE;
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.246
        };
        bundleInfo.version = "10.48.30@6.20.3.136";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "493168b8ca7ff1d698f10c8269875df7";
        bundleInfo.size = 6996182L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/493168b8ca7ff1d698f10c8269875df7/taopai_sdk.so";
        bundleInfo.priority = -1;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.247
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.248
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.249
            {
                add("com.taobao.taopai.business.view.NoGestureViewPager");
            }
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.250
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.251
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.252
        };
        bundleInfo.status = 0;
        concurrentHashMap.put(a.TAOPAI_SDK_FEATURE, bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "litecreator";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.253
        };
        bundleInfo.version = "10.48.30@1.1.8.496";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "7359b8956389c74a70c012fd41ba74e3";
        bundleInfo.size = 1866455L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/7359b8956389c74a70c012fd41ba74e3/litecreator.so";
        bundleInfo.priority = -1;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.254
            {
                add(a.TAOPAI_SDK_FEATURE);
                add("rxandroid");
                add("umipublish");
            }
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.255
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.256
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.257
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.258
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.259
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("litecreator", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "taobao_after_buy_ai";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.260
        };
        bundleInfo.version = "10.48.30@1.0.9";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "ab86138cab28bafad0114bcf849e70f5";
        bundleInfo.size = 37259L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/ab86138cab28bafad0114bcf849e70f5/taobao_after_buy_ai.so";
        bundleInfo.priority = 10;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.261
            {
                add("information_flow_ai");
            }
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.262
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.263
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.264
            {
                put("com.taobao.android.ai.api.IAfterBuyAiApi", "com.taobao.android.ai.AfterBuyAiApi");
            }
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.265
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.266
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("taobao_after_buy_ai", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "fluid_remote";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.267
        };
        bundleInfo.version = "10.48.30@1.0.128";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "61e54cfa1a630971c4711b8f4ea054aa";
        bundleInfo.size = 49547L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/61e54cfa1a630971c4711b8f4ea054aa/fluid_remote.so";
        bundleInfo.priority = 0;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.268
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.269
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.270
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.271
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.272
            {
                add("com.taobao.android.fluid.remote.FluidRemoteVersion");
                add("com.taobao.android.fluid.remote.precache.PreCacheService");
            }
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.273
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("fluid_remote", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = yq0.PRELOAD_LITE_DETAIL_FEATURE_NAME;
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.274
        };
        bundleInfo.version = "10.48.30@1.0.212";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "18430a7194eddc617d8c997aee51c803";
        bundleInfo.size = 604345L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/18430a7194eddc617d8c997aee51c803/ugc_imagecontent_detailpage.so";
        bundleInfo.priority = -1;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.275
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.276
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.277
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.278
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.279
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.280
        };
        bundleInfo.status = 0;
        concurrentHashMap.put(yq0.PRELOAD_LITE_DETAIL_FEATURE_NAME, bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "image_search_xr_aar";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.281
        };
        bundleInfo.version = "10.48.30@1.0.51";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "7f243677400d8e0eeec22e1e8b23bdc0";
        bundleInfo.size = 127534L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/7f243677400d8e0eeec22e1e8b23bdc0/image_search_xr_aar.so";
        bundleInfo.priority = -1;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.282
            {
                add("TB3DSpace");
            }
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.283
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.284
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.285
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.286
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.287
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("image_search_xr_aar", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "information_flow_ai";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.288
        };
        bundleInfo.version = "10.48.30@1.1.0.60";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "9315874cf32646e2a8601889ffb43a8a";
        bundleInfo.size = 45451L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/9315874cf32646e2a8601889ffb43a8a/information_flow_ai.so";
        bundleInfo.priority = 0;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.289
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.290
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.291
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.292
            {
                put("com.taobao.android.information.ai.api.IInformationFlowAiApi", "com.taobao.informationflowai.InfoFlowAiProvider");
            }
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.293
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.294
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("information_flow_ai", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "ugc_component_rate";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.295
        };
        bundleInfo.version = "10.48.30@1.0.5.250";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "a7dac66d63312d81f0a651fc4d38f44c";
        bundleInfo.size = 253357L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/a7dac66d63312d81f0a651fc4d38f44c/ugc_component_rate.so";
        bundleInfo.priority = 0;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.296
            {
                add("ugc_core");
            }
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.297
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.298
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.299
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.300
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.301
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("ugc_component_rate", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "ugc_core";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.302
        };
        bundleInfo.version = "10.48.30@1.2.3.250";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "1229fbc068800c4c4ce445f383055727";
        bundleInfo.size = 391318L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/1229fbc068800c4c4ce445f383055727/ugc_core.so";
        bundleInfo.priority = 0;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.303
            {
                add("ugc_component_rate");
            }
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.304
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.305
            {
                add("com.taobao.ugc.widget.ZoomImageView");
            }
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.306
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.307
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.308
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("ugc_core", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "rocket_mega_design";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.309
        };
        bundleInfo.version = "10.48.30@0.0.4.51";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "4e78a315ec62b2f63fb5712d33b05f1e";
        bundleInfo.size = 112538L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/4e78a315ec62b2f63fb5712d33b05f1e/rocket_mega_design.so";
        bundleInfo.priority = 0;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.310
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.311
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.312
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.313
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.314
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.315
            {
                add("com.taobao.android.rocketmegadesign.imagepreview.DarkPagePreviewFragment");
                add("com.taobao.android.rocketmegadesign.imagepreview.DarkPagePreviewFragmentV2");
            }
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("rocket_mega_design", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = kpu.BUNDLE_TURBOFLOW_BIZ_REMOTE;
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.316
        };
        bundleInfo.version = "10.48.30@1.0.90";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "2be0176ee68d6c3e7cf300d0466f051f";
        bundleInfo.size = 214649L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/2be0176ee68d6c3e7cf300d0466f051f/turboflow_biz_remote.so";
        bundleInfo.priority = 6;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.317
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.318
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.319
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.320
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.321
            {
                add("com.taobao.android.turbo.flexaremote.Tab2ServiceRegistry");
            }
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.322
        };
        bundleInfo.status = 0;
        concurrentHashMap.put(kpu.BUNDLE_TURBOFLOW_BIZ_REMOTE, bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = jz7.BUNDLE_TURBOFLOW_DRESSUP_REMOTE;
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.323
        };
        bundleInfo.version = "10.48.30@1.0.28";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "a976c03e3458c85546acd26997899685";
        bundleInfo.size = 222916L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/a976c03e3458c85546acd26997899685/turboflow_dressup_remote.so";
        bundleInfo.priority = 6;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.324
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.325
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.326
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.327
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.328
            {
                add("com.taobao.android.dressup.flexaremote.feeds.DressUpFeedServiceRegistry");
            }
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.329
        };
        bundleInfo.status = 0;
        concurrentHashMap.put(jz7.BUNDLE_TURBOFLOW_DRESSUP_REMOTE, bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "taobao_weex_adapter";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.330
        };
        bundleInfo.version = "10.48.30@2.0.2.70";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "48cee6ab1297b7ea401b1d13a26b1410";
        bundleInfo.size = 1102401L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/48cee6ab1297b7ea401b1d13a26b1410/taobao_weex_adapter.so";
        bundleInfo.priority = -1;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.331
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.332
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.333
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.334
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.335
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.336
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("taobao_weex_adapter", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = FlexaLiveX.TAOLIVE_CROSSPLATFORM;
        bundleInfo.featureInitalClass = "com.taobao.taolive.crossplatformfoundation.flexaremote.TLCrossPlatformInitial";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.337
        };
        bundleInfo.version = "10.48.30@0.2.146.1-dynamic";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "3aba7e4c84ae8317743a7cf3d1aaefc1";
        bundleInfo.size = 127371L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/3aba7e4c84ae8317743a7cf3d1aaefc1/tao_live_crossplatform_foundation_remote_android.so";
        bundleInfo.priority = 0;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.338
            {
                add(FlexaLiveX.TAOLIVE_NEXUS);
            }
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.339
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.340
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.341
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.342
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.343
        };
        bundleInfo.status = 0;
        concurrentHashMap.put(FlexaLiveX.TAOLIVE_CROSSPLATFORM, bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "android_ace_wrapper";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.344
        };
        bundleInfo.version = "10.48.30@1.0.9";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "69c07b2217c19b9a6621c83a42ea7b8e";
        bundleInfo.size = 57824L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/69c07b2217c19b9a6621c83a42ea7b8e/android_ace_wrapper.so";
        bundleInfo.priority = -1;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.345
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.346
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.347
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.348
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.349
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.350
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("android_ace_wrapper", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "SNPE4Android";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.351
        };
        bundleInfo.version = "10.48.30@1.0.0-android-taobao";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "e14e4934105b0834d3432138a71704a6";
        bundleInfo.size = 20089025L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/e14e4934105b0834d3432138a71704a6/SNPE4Android.so";
        bundleInfo.priority = -1;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.352
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.353
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.354
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.355
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.356
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.357
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("SNPE4Android", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "messagesdkwrapper";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.358
            {
                put("10.48.20", "c5e76ad6298518ef15c932d07bf6ffc7");
            }
        };
        bundleInfo.version = "10.48.30@5.0.3.0-ANDROID";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "298b2e4c301ab0501d4785670124fb91";
        bundleInfo.size = 5591662L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/298b2e4c301ab0501d4785670124fb91/messagesdkwrapper.so";
        bundleInfo.priority = 0;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.359
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.360
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.361
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.362
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.363
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.364
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("messagesdkwrapper", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "trade_dynamic_uikit";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.365
        };
        bundleInfo.version = "10.48.30@0.0.0.10";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "2b79619affeac089c40bbede367c9397";
        bundleInfo.size = 74797L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/2b79619affeac089c40bbede367c9397/trade_dynamic_uikit.so";
        bundleInfo.priority = 0;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.366
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.367
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.368
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.369
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.370
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.371
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("trade_dynamic_uikit", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "dtao_liveshop_ttdetail";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.372
        };
        bundleInfo.version = "10.48.30@1.2.9";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "490d2a9c442ac8c0af152278429ee0a0";
        bundleInfo.size = 67462L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/490d2a9c442ac8c0af152278429ee0a0/dtao_liveshop_ttdetail.so";
        bundleInfo.priority = 0;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.373
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.374
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.375
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.376
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.377
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.378
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("dtao_liveshop_ttdetail", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "rxandroid";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.379
            {
                put("10.48.20", "fc9ea12641a0e8525c1c1beec16a24f3");
            }
        };
        bundleInfo.version = "10.48.30@2.0.2";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "d2b011fcfa950212f2bbdd942d6daf2d";
        bundleInfo.size = 373203L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/d2b011fcfa950212f2bbdd942d6daf2d/rxandroid.so";
        bundleInfo.priority = 0;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.380
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.381
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.382
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.383
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.384
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.385
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("rxandroid", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "tbmobilesmart";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.386
        };
        bundleInfo.version = "10.48.30@1.0.42";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "10dbba12b825dc61aed443ba9ecb6d83";
        bundleInfo.size = 53643L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/10dbba12b825dc61aed443ba9ecb6d83/tbmobilesmart.so";
        bundleInfo.priority = 0;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.387
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.388
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.389
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.390
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.391
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.392
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("tbmobilesmart", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "umipublish";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.393
        };
        bundleInfo.version = "10.48.30@1.2.9.99";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "b3c49afd2cc79d41769e7d5664f1ce7a";
        bundleInfo.size = 301672L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/b3c49afd2cc79d41769e7d5664f1ce7a/umipublish.so";
        bundleInfo.priority = 0;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.394
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.395
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.396
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.397
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.398
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.399
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("umipublish", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = FlexaLiveX.TAOLIVE_NEXUS;
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.400
        };
        bundleInfo.version = "10.48.30@0.2.146.1-dynamic";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "4789dbc4772cc7790eed257141f8780a";
        bundleInfo.size = 237963L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/4789dbc4772cc7790eed257141f8780a/nexus_remote_android.so";
        bundleInfo.priority = 0;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.401
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.402
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.403
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.404
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.405
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.406
        };
        bundleInfo.status = 0;
        concurrentHashMap.put(FlexaLiveX.TAOLIVE_NEXUS, bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = DynamicBundleHelper.BUNDLE_KEY_ZFACE;
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.407
        };
        bundleInfo.version = "10.48.30@3.73.7.20250331";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "a3967cf45d97a75f3391eeaa62d836d3";
        bundleInfo.size = 2040348L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/a3967cf45d97a75f3391eeaa62d836d3/biometric.so";
        bundleInfo.priority = 0;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.408
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.409
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.410
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.411
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.412
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.413
        };
        bundleInfo.status = 0;
        concurrentHashMap.put(DynamicBundleHelper.BUNDLE_KEY_ZFACE, bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = "order_remote";
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.414
        };
        bundleInfo.version = "10.48.30@1.0.2";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "02b0904e23580011c8c646d6c8686a1c";
        bundleInfo.size = 557742L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/02b0904e23580011c8c646d6c8686a1c/order_remote.so";
        bundleInfo.priority = 0;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.415
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.416
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.417
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.418
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.419
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.420
        };
        bundleInfo.status = 0;
        concurrentHashMap.put("order_remote", bundleInfo);
        bundleInfo = new DynamicFeatureInfo();
        bundleInfo.featureName = u58.DYNAMIC_NAME_TAOBAO_ANDROID_ADDRESS_DYNAMIC;
        bundleInfo.featureInitalClass = "";
        bundleInfo.matchedAppVersion = "";
        bundleInfo.matchedFeatureMd5 = "";
        bundleInfo.matchedAppFeatureMd5 = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.421
        };
        bundleInfo.version = "10.48.30@5.4.5";
        bundleInfo.appVersion = "10.48.30";
        bundleInfo.md5 = "83c97a4bb39a7f9164282a9ea727769e";
        bundleInfo.size = 83316L;
        bundleInfo.url = "https://mtlexternal.alibabausercontent.com/feature/83c97a4bb39a7f9164282a9ea727769e/taobao_android_address_dynamic.so";
        bundleInfo.priority = 0;
        bundleInfo.dependencies = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.422
        };
        bundleInfo.bindingActivities = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.423
        };
        bundleInfo.views = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.424
        };
        bundleInfo.implServices = new HashMap<String, String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.425
        };
        bundleInfo.classes = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.426
        };
        bundleInfo.fragments = new ArrayList<String>() { // from class: com.android.tools.bundleInfo.FeatureInfoGenerator.427
        };
        bundleInfo.status = 0;
        concurrentHashMap.put(u58.DYNAMIC_NAME_TAOBAO_ANDROID_ADDRESS_DYNAMIC, bundleInfo);
        return concurrentHashMap;
    }
}
