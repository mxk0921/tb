package com.taobao.oversea.baobao;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import anet.channel.util.Utils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.orange.OrangeConfig;
import com.taobao.oversea.baobao.BaoBaoDo;
import com.taobao.oversea.baobao.view.MSProgress;
import com.taobao.oversea.baobao.view.WXProgress;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.arq;
import tb.dp1;
import tb.e0n;
import tb.fsw;
import tb.jpm;
import tb.lqw;
import tb.o78;
import tb.obk;
import tb.rg0;
import tb.xso;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BaobaoManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CART_ITEMCOUNTCHANGED_ACTION = "openCartItemCountChanged";
    private static final String CART_UPDATE_ACTION = "openCartUpdate";
    public static boolean IS_HARMONYOS = false;
    private static final String ORANGE_BAOBAO_GROUP = "tmgbaobao";
    private static BaobaoManager instance = null;
    private static volatile boolean isInit = false;
    public static String sDetail_Edition_Code = "";
    private final String TAG = "BaobaoManager";
    private HashMap<String, Object> paramsCache = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(BaobaoManager baobaoManager) {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else {
                OrangeConfig.getInstance().getConfigs(BaobaoManager.ORANGE_BAOBAO_GROUP);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends TypeReference<Map<String, String>> {
        public b(BaobaoManager baobaoManager) {
        }
    }

    public static /* synthetic */ void access$000(BaobaoManager baobaoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c99d125", new Object[]{baobaoManager});
        } else {
            baobaoManager.clearCache();
        }
    }

    public static /* synthetic */ HashMap access$100(BaobaoManager baobaoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("43926f67", new Object[]{baobaoManager});
        }
        return baobaoManager.paramsCache;
    }

    private void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
            return;
        }
        this.paramsCache.put("totalPrice", "0");
        this.paramsCache.put("totalQuantity", "0");
    }

    public static BaobaoManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaobaoManager) ipChange.ipc$dispatch("efe58bfe", new Object[0]);
        }
        if (instance == null) {
            instance = new BaobaoManager();
        }
        return instance;
    }

    public void doRequest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa16f629", new Object[]{this, new Boolean(z)});
        } else {
            doRequest(z, false);
        }
    }

    public String getCartType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8184d909", new Object[]{this});
        }
        String str = getCartTag().get(getEditionCode());
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getEditionCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7176de84", new Object[]{this});
        }
        String str = o78.i(Globals.getApplication()).countryCode;
        if (getCartTag().containsKey(str)) {
            return str;
        }
        if (!arq.a(sDetail_Edition_Code)) {
            return sDetail_Edition_Code;
        }
        return str;
    }

    public HashMap<String, Object> getParamsCacheAndRefreshData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3daee3fe", new Object[]{this});
        }
        doRequest(true);
        return this.paramsCache;
    }

    public boolean mainSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f425058", new Object[]{this})).booleanValue();
        }
        return Boolean.valueOf(OrangeConfig.getInstance().getConfig(ORANGE_BAOBAO_GROUP, "mainSwitch", "true")).booleanValue();
    }

    public boolean refreshSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9d55afa", new Object[]{this})).booleanValue();
        }
        return Boolean.valueOf(OrangeConfig.getInstance().getConfig(ORANGE_BAOBAO_GROUP, "refreshSwitch", "true")).booleanValue();
    }

    public void requestCompensate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b8e2ad", new Object[]{this});
        } else {
            new dp1().a(new IRemoteListener() { // from class: com.taobao.oversea.baobao.BaobaoManager.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        new StringBuilder("requestCompensate onError ").append(mtopResponse.toString());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    JSONObject dataJsonObject;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    try {
                        if (!jpm.a(mtopResponse) && mtopResponse.isApiSuccess() && !jpm.a(mtopResponse.getDataJsonObject()) && (dataJsonObject = mtopResponse.getDataJsonObject()) != null) {
                            int i2 = dataJsonObject.getInt("itemNum");
                            long j = dataJsonObject.getLong("totalFee");
                            BaobaoManager.access$100(BaobaoManager.this).put("totalPrice", String.valueOf(j));
                            BaobaoManager.access$100(BaobaoManager.this).put("totalQuantity", String.valueOf(i2));
                            HashMap hashMap = new HashMap();
                            hashMap.put("totalPrice", String.valueOf(j));
                            hashMap.put("totalQuantity", String.valueOf(i2));
                            e0n.b().g(hashMap);
                        }
                    } catch (Exception e) {
                        e.toString();
                    }
                }
            });
        }
    }

    public long requestInterval() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fcb66ef", new Object[]{this})).longValue();
        }
        return Long.valueOf(OrangeConfig.getInstance().getConfig(ORANGE_BAOBAO_GROUP, "refreshInterval", "0")).longValue();
    }

    private Map<String, String> getCartTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c40f11a0", new Object[]{this});
        }
        try {
            Map<String, String> map = (Map) JSON.parseObject(OrangeConfig.getInstance().getConfig(ORANGE_BAOBAO_GROUP, "sceneCartType", "{\"HK\":\"overseaCart_1518018\",\"MO\":\"overseaCart_2283970\",\"MY\":\"overseaCart_1518082\",\"SG\":\"overseaCart_1517698\",\"TW\":\"overseaCart_1727874\",\"KR\":\"overseaCart_2283842\",\"JP\":\"overseaCart_3322946\",\"TH\":\"overseaCart_3322818\",\"VN\":\"overseaCart_3322882\",\"KH\":\"overseaCart_3323010\",\"AU\":\"overseaCart_3330498\",\"CA\":\"overseaCart_3370626\",\"KZ\":\"overseaCart_3323266\",\"MN\":\"overseaCart_3413186\"}"), new b(this), new Feature[0]);
            return map == null ? new HashMap() : map;
        } catch (Exception unused) {
            return new HashMap();
        }
    }

    public void doRequest(boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c881cb", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (Login.checkSessionValid()) {
            if (z || e0n.b().e()) {
                new dp1().b(new IRemoteListener() { // from class: com.taobao.oversea.baobao.BaobaoManager.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else {
                            new StringBuilder("requestSinge onError ").append(mtopResponse.toString());
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        try {
                            HashMap hashMap = new HashMap();
                            if (baseOutDo != null) {
                                BaoBaoDo.BaobaoResult baobaoResult = (BaoBaoDo.BaobaoResult) baseOutDo.getData();
                                if (Boolean.valueOf(baobaoResult.callCartSuccess).booleanValue()) {
                                    BaobaoManager.access$100(BaobaoManager.this).put("totalPrice", String.valueOf(baobaoResult.totalPrice));
                                    BaobaoManager.access$100(BaobaoManager.this).put("totalQuantity", String.valueOf(baobaoResult.totalQuantity));
                                    hashMap.put("totalPrice", String.valueOf(baobaoResult.totalPrice));
                                    hashMap.put("totalQuantity", String.valueOf(baobaoResult.totalQuantity));
                                    hashMap.put("itemPic", baobaoResult.itemPic);
                                    hashMap.put("itemPrice", baobaoResult.itemPrice);
                                    hashMap.put("itemTitle", baobaoResult.itemTitle);
                                    hashMap.put("itemCurrency", baobaoResult.itemCurrency);
                                    hashMap.put("itemUrl", baobaoResult.itemUrl);
                                    hashMap.put(yj4.PARAM_PVID, baobaoResult.pvid);
                                    hashMap.put("recommend", baobaoResult.recommend);
                                    hashMap.put("backgroundPic", baobaoResult.backgroundPic);
                                    hashMap.put("firstPagePvid", baobaoResult.firstPagePvid);
                                    hashMap.put(rg0.JUMP_URL, baobaoResult.jumpUrl);
                                    hashMap.put("utLogMap", JSON.toJSONString(baobaoResult.utLogMap));
                                    hashMap.put("utParam", JSON.toJSONString(baobaoResult.utLogMap));
                                    hashMap.put("isSceneCartReload", String.valueOf(z2));
                                    e0n.b().g(hashMap);
                                } else {
                                    BaobaoManager.this.requestCompensate();
                                }
                            }
                        } catch (Exception e) {
                            new StringBuilder("requestSinge success error").append(e.toString());
                        }
                    }
                });
            }
        }
    }

    public void registerListener(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d02aa00a", new Object[]{this, context});
            return;
        }
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.oversea.baobao.BaobaoManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/baobao/BaobaoManager$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (intent != null && !arq.a(intent.getAction())) {
                    try {
                        String action = intent.getAction();
                        if (!BaobaoManager.CART_UPDATE_ACTION.equals(action) && !BaobaoManager.CART_ITEMCOUNTCHANGED_ACTION.equals(action)) {
                            return;
                        }
                        BaobaoManager.this.doRequest(false);
                    } catch (Exception e) {
                        Log.e("BaobaoManager", "mReceiver exp. Action: " + intent.getAction(), e);
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(CART_UPDATE_ACTION);
        intentFilter.addAction(CART_ITEMCOUNTCHANGED_ACTION);
        intentFilter.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(context).registerReceiver(broadcastReceiver, intentFilter);
        LocalBroadcastManager.getInstance(context).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.oversea.baobao.BaobaoManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/baobao/BaobaoManager$2");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if ("EDITON_SWITCHER_EDITTION_CODE_CHANGED".equals(intent.getAction())) {
                    BaobaoManager.access$000(BaobaoManager.this);
                }
            }
        }, new IntentFilter("EDITON_SWITCHER_EDITTION_CODE_CHANGED"));
        LoginBroadcastHelper.registerLoginReceiver(context, new BroadcastReceiver() { // from class: com.taobao.oversea.baobao.BaobaoManager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/baobao/BaobaoManager$3");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (intent != null && !arq.a(intent.getAction())) {
                    try {
                        LoginAction valueOf = LoginAction.valueOf(intent.getAction());
                        if (valueOf == LoginAction.NOTIFY_LOGIN_SUCCESS) {
                            BaobaoManager.this.doRequest(false);
                        } else if (valueOf == LoginAction.NOTIFY_LOGOUT) {
                            BaobaoManager.access$000(BaobaoManager.this);
                        }
                    } catch (Exception e) {
                        Log.e("BaobaoManager", "mReceiver exp. Action: " + intent.getAction(), e);
                    }
                }
            }
        });
        OrangeConfig.getInstance().registerListener(new String[]{ORANGE_BAOBAO_GROUP}, new a(this), true);
    }

    public boolean init() throws WXException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fede19b", new Object[]{this})).booleanValue();
        }
        if (!mainSwitch()) {
            return false;
        }
        if (isInit) {
            return true;
        }
        WXSDKEngine.registerComponent("tmgbaobaoprogress", WXProgress.class);
        MUSEngine.registerUINode("tmgbaobaoprogress", MSProgress.class);
        fsw.h("TMGBaobaoBridge", TMGBaobaoBridge.class);
        lqw.d().b(new xso());
        registerListener(Globals.getApplication());
        clearCache();
        IS_HARMONYOS = Utils.isHarmonyOS();
        isInit = true;
        return true;
    }
}
