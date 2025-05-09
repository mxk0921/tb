package tb;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.flowout.data.FloutNewConfigData;
import com.taobao.linkmanager.flowout.data.FloutWhiteListBean;
import com.taobao.linkmanager.flowout.data.FlowOutConfigData;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gq9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f20167a = "{\"floutEnable\":true,\"floutWhiteList\":[{\"name\":\"支付宝\",\"packageName\":\"com.eg.android.AlipayGphone\",\"schemes\":[\"alipays\",\"alipay\",\"alipayshare\",\"alipayhk\"]},{\"name\":\"天猫\",\"packageName\":\"com.tmall.wireless\",\"schemes\":[\"tmall\"],\"supportAfcLink\":true,\"link\":\"tmall://page.tm/appLink?h5Url=${url}\"},{\"name\":\"优酷\",\"packageName\":\"com.youku.phone\",\"schemes\":[\"youku\"]},{\"name\":\"UC浏览器\",\"packageName\":\"com.UCMobile\",\"schemes\":[\"uclink\"],\"link\":\"uclink://www.uc.cn/cc77796ca7c25dff9607d31b29effc07?action=open_url&src_pkg=com.taobao.taobao&src_ch=tbmessagepull&url=${url}\"},{\"name\":\"闲鱼\",\"packageName\":\"com.taobao.fleamarket\",\"schemes\":[\"fleamarket\"]},{\"name\":\"考拉\",\"packageName\":\"com.kaola\",\"schemes\":[\"kaola\"]},{\"name\":\"微信\",\"packageName\":\"com.tencent.mm\",\"schemes\":[\"weixin\"]},{\"name\":\"今日头条\",\"packageName\":\"com.ss.android.article.news\",\"schemes\":[\"tbopen23261993\",\"bytedance\"]},{\"name\":\"新浪微博\",\"packageName\":\"com.sina.weibo\",\"schemes\":[\"tbopen23208668\",\"sinaweibo\",\"weibosdk\",\"weibosdk2.5\",\"sinaweibohd\"]},{\"name\":\"手机 QQ\",\"packageName\":\"com.tencent.mobileqq\",\"schemes\":[\"mqq\"]},{\"name\":\"上汽名爵\",\"packageName\":\"com.saicmotor.mg\",\"schemes\":[\"mgtocapp\"]},{\"name\":\"斑马网络\",\"packageName\":\"com.cloudy.jun\",\"schemes\":[\"baojun\"]},{\"name\":\"子弹短信\",\"packageName\":\"com.bullet.messenger\",\"schemes\":[\"bulletmessage\"]},{\"name\":\"飞聊\",\"packageName\":\"com.feiliao.flipchat.android\",\"schemes\":[\"imrocketshare\"]},{\"name\":\"AppStore\",\"packageName\":\"com.itms-apps\",\"schemes\":[\"itms-apps\"]},{\"name\":\"虎扑识货\",\"packageName\":\"com.hupu.shihuo\",\"schemes\":[\"tbopen23022129\",\"shihuo\"]},{\"name\":\"淘宝旅行\",\"packageName\":\"com.taobao.travel\",\"schemes\":[\"taobaotravel\"]},{\"name\":\"1688\",\"packageName\":\"com.alibaba.wireless\",\"schemes\":[\"wireless1688\"]},{\"name\":\"斑马智行\",\"packageName\":\"org.zxq.teleri\",\"schemes\":[\"smarttravel\"]},{\"name\":\"手机淘宝\",\"packageName\":\"com.taobao.taobao4iphone\",\"schemes\":[]},{\"name\":\"百度云\",\"packageName\":\"com.downloading.main.baiduyundownload\",\"schemes\":[\"baiduyunmbox\",\"baidunetdisk\",\"baiduyun\"]},{\"name\":\"阿里云\",\"packageName\":\"com.alibaba.aliyun\",\"schemes\":[\"aliyun\"]},{\"name\":\"爱奇艺\",\"packageName\":\"com.qiyi.video\",\"schemes\":[\"iqiyi\"]},{\"name\":\"旺信\",\"packageName\":\"com.alibaba.mobileim\",\"schemes\":[\"wangxin\",\"wangxinshare\",\"wangxincomm\"]},{\"name\":\"大众点评\",\"packageName\":\"com.dianping.v1\",\"schemes\":[\"dianping\"]},{\"name\":\"陌陌\",\"packageName\":\"com.immomo.momo\",\"schemes\":[\"momochat\"]},{\"name\":\"钱盾\",\"packageName\":\"com.ali.money.shield\",\"schemes\":[\"qiandun\"]},{\"name\":\"虾米音乐\",\"packageName\":\"fm.xiami.main\",\"schemes\":[\"xiami\"]},{\"name\":\"e淘\",\"packageName\":\"com.taobao.etao\",\"schemes\":[\"etao\"]},{\"name\":\"阿里小号\",\"packageName\":\"com.alicom.smartdail\",\"schemes\":[\"mytel\"]},{\"name\":\"钉钉\",\"packageName\":\"com.alibaba.android.rimet\",\"schemes\":[\"dingtalk\",\"dingtalk-open\"]},{\"name\":\"飞猪\",\"packageName\":\"com.taobao.trip\",\"schemes\":[\"alitrip\"]},{\"name\":\"千牛\",\"packageName\":\"com.taobao.qianniu\",\"schemes\":[\"dingoair3dtesxirmqpncn\",\"topmobile\"]},{\"name\":\"亲淘app\",\"packageName\":\"com.taobao.litetao\",\"schemes\":[\"taobaolite\"]},{\"name\":\"荣威\",\"packageName\":\"com.saicmotor.tocapp\",\"schemes\":[\"tocappforbindcar\"]},{\"name\":\"Test-flight\",\"packageName\":\"Test-flight\",\"schemes\":[\"itms-beta\"]}],\"floutIdEnable\":false,\"floutIdWhiteList\":[\"b9b3c5093a1971de\",\"8617ab96f88d12c0\",\"a8537b2b2b9ac2ba\"],\"floutIdList\":[{\"floutId\":\"browser_dp\",\"scene\":\"browser\",\"packageNames\":[\"com.UCMobile\"]}],\"systemActions\":[\"tel\"],\"androidActions\":[\"com.android.systemui\",\"com.android.settings\",\"android.intent.action.MAIN\",\"android.intent.action.CREATE_DOCUMENT\",\"android.content.pm.action.REQUEST_PERMISSIONS\",\"android.media.action.IMAGE_CAPTURE\",\"android.intent.action.DIAL\",\"android.intent.action.CALL\",\"android.intent.action.SENDTO\",\"android.intent.action.SEND\",\"android.intent.action.CAMERA_BUTTON\",\"android.media.action.IMAGE_CAPTURE\",\"android.intent.action.GET_CONTENT\",\"android.intent.action.PICK\",\"android.intent.action.chooser\",\"android.intent.action.CHOOSER\",\"android.intent.action.WEB_SEARCH\",\"android.intent.action.web_search\",\"android.intent.action.taobao.address.editor\",\"android.intent.action.taobao.address.book\",\"android.intent.action.taobao.address.area\",\"android.intent.action.taobao.address.add\",\"android.intent.action.INSERT_OR_EDIT\",\"android.bluetooth.adapter.action.REQUEST_ENABLE\",\"android.settings.action.MANAGE_OVERLAY_PERMISSION\",\"android.intent.action.VIEW\",\"com.huawei.intent.action.hwCHOOSER\",\"android.intent.action.hwCHOOSER\",\"android.settings.APPLICATION_DETAILS_SETTINGS\"],\"floutDisplaceEnable\":true,\"floutDiplaceData\":{\"defaultApp\":\"com.UCMobile\",\"displaceRules\":[{}],\"blackUrlList\":[{\"type\":\"host\",\"url\":\"\"},{\"type\":\"hostAndPath\",\"url\":\"\"}]},\"blockTip\":\"正在努力尝试跳转，请先逛逛其他内容~\"}";
    public static Application b;
    public static Map<String, String> c;
    public static FloutNewConfigData d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            gq9.b(OrangeConfig.getInstance().getConfigs(str));
            if (gq9.a() != null) {
                cmp.b(gq9.c()).e(hq9.LOCAL_OUT_CONFIG, gq9.a());
            }
            vp9.a("linkx", "FlowOutConfig === initConfig === 获取到的配置：" + gq9.a());
            String str2 = (String) gq9.a().get("newFloutConfig");
            if (!TextUtils.isEmpty(str2)) {
                gq9.d((FloutNewConfigData) JSON.parseObject(str2, FloutNewConfigData.class));
            }
            gq9.e();
        }
    }

    public static /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c8ee3d6c", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ Map b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6d458921", new Object[]{map});
        }
        c = map;
        return map;
    }

    public static /* synthetic */ Application c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("57e7de87", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ FloutNewConfigData d(FloutNewConfigData floutNewConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloutNewConfigData) ipChange.ipc$dispatch("872d703b", new Object[]{floutNewConfigData});
        }
        d = floutNewConfigData;
        return floutNewConfigData;
    }

    public static /* synthetic */ void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b88b93a", new Object[0]);
        } else {
            n();
        }
    }

    public static FlowOutConfigData f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlowOutConfigData) ipChange.ipc$dispatch("41e463f", new Object[0]);
        }
        Map<String, String> map = c;
        if (map == null || map.size() == 0) {
            c = cmp.b(b).c(hq9.LOCAL_OUT_CONFIG);
        }
        Map<String, String> map2 = c;
        if (map2 == null || map2.size() == 0) {
            String str = f20167a;
            FlowOutConfigData flowOutConfigData = (FlowOutConfigData) JSON.parseObject(str, FlowOutConfigData.class);
            vp9.a("linkx", "FlowOutConfig === getFlowOutConfig === 获取到的本地默认配置为：" + str);
            return flowOutConfigData;
        }
        FlowOutConfigData flowOutConfigData2 = (FlowOutConfigData) JSON.parseObject(c.get("config"), FlowOutConfigData.class);
        vp9.a("linkx", "FlowOutConfig === getFlowOutConfig === 获取到的数据map：" + c);
        return flowOutConfigData2;
    }

    public static FloutNewConfigData g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloutNewConfigData) ipChange.ipc$dispatch("204819f3", new Object[0]);
        }
        FloutNewConfigData floutNewConfigData = d;
        if (floutNewConfigData != null) {
            return floutNewConfigData;
        }
        Map<String, String> c2 = cmp.b(b).c(hq9.LOCAL_OUT_CONFIG);
        if (c2 == null) {
            return null;
        }
        String str = c2.get("newFloutConfig");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        FloutNewConfigData floutNewConfigData2 = (FloutNewConfigData) JSON.parseObject(str, FloutNewConfigData.class);
        vp9.a("linkx", "FlowOutConfig === getNewFloutConfig === SP获取到的数据：" + str);
        return floutNewConfigData2;
    }

    public static int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("badd4c5c", new Object[0])).intValue();
        }
        FloutNewConfigData g = g();
        if (g != null) {
            return g.securityControlLevel;
        }
        return 0;
    }

    public static long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de748f9f", new Object[0])).longValue();
        }
        FloutNewConfigData g = g();
        if (g != null) {
            return g.securityControlSecs;
        }
        return 0L;
    }

    public static void j(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce180d06", new Object[]{application});
            return;
        }
        b = application;
        OrangeConfig.getInstance().registerListener(new String[]{hq9.CUSTOM_OUT_CONFIG_V2}, new a(), false);
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f6aa41a", new Object[0])).booleanValue();
        }
        FloutNewConfigData g = g();
        if (g != null) {
            return g.defaultInterruptEnable;
        }
        return false;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b99b9c4", new Object[0])).booleanValue();
        }
        FloutNewConfigData g = g();
        if (g != null) {
            return g.securityControlEnable;
        }
        return false;
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c103c343", new Object[0])).booleanValue();
        }
        FloutNewConfigData g = g();
        if (g != null) {
            return g.shareEnable;
        }
        return true;
    }

    public static void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cb4647c", new Object[0]);
            return;
        }
        FlowOutConfigData f = f();
        if (f == null) {
            vp9.a("linkx", "FlowOutConfig === refreshCacheMap === flowOutConfig为空，不更新内存缓存");
            return;
        }
        Set<String> keySet = jq9.f22157a.keySet();
        if (keySet.size() == 0) {
            vp9.a("linkx", "FlowOutConfig === refreshCacheMap === cacheList为空，不更新内存缓存");
            return;
        }
        for (String str : keySet) {
            for (FloutWhiteListBean floutWhiteListBean : f.floutWhiteList) {
                String[] strArr = floutWhiteListBean.schemes;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (TextUtils.equals(str, strArr[i])) {
                        String str2 = floutWhiteListBean.packageName;
                        HashMap<String, String> hashMap = jq9.f22157a;
                        if (!TextUtils.equals(str2, hashMap.get(str))) {
                            hashMap.put(str, floutWhiteListBean.packageName);
                            break;
                        }
                    }
                    i++;
                }
            }
        }
    }

    static {
        t2o.a(744489074);
    }
}
