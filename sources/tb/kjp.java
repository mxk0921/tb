package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.statistic.TBS;
import com.ut.share.business.ShareTargetType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kjp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static HashMap<String, a> f22708a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final xhp f22709a;
        public final String b;
        public final String c;

        static {
            t2o.a(666894416);
        }

        public a(xhp xhpVar, String str, String str2) {
            this.f22709a = xhpVar;
            this.b = str;
            this.c = str2;
        }
    }

    static {
        t2o.a(666894415);
    }

    public static HashMap<String, a> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ced9d5c4", new Object[0]);
        }
        if (f22708a == null) {
            HashMap<String, a> hashMap = new HashMap<>();
            f22708a = hashMap;
            hashMap.put(ShareTargetType.Share2Copy.getValue(), new a(new pxr(), "Copy", "copy"));
            f22708a.put(ShareTargetType.Share2QQ.getValue(), new a(new pxr(), "TaoPassword-QQ", "taopassword_qq"));
            HashMap<String, a> hashMap2 = f22708a;
            ShareTargetType shareTargetType = ShareTargetType.Share2Weixin;
            hashMap2.put(shareTargetType.getValue(), new a(new pxr(), "TaoPassword-WeiXin", "taopassword_weixin"));
            HashMap<String, a> hashMap3 = f22708a;
            hashMap3.put(shareTargetType.getValue() + "_SDK", new a(new hwr(), "WeChatSDK_Chat", "wxfriend"));
            f22708a.put(ShareTargetType.Share2WeixinTimeline.getValue(), new a(new hwr(), "WeChatSDK_Quan", "wxtimeline"));
            f22708a.put(ShareTargetType.Share2Alipay.getValue(), new a(new hwr(), "Alipay", "alipay"));
            f22708a.put(ShareTargetType.Share2SinaWeibo.getValue(), new a(new hwr(), "SinaWeibo", tn1.KEY_SHARE_CONFIG_SINAWEIBO));
            f22708a.put(ShareTargetType.Share2Wangxin.getValue(), new a(new hwr(), "WangXin", tn1.KEY_SHARE_CONFIG_WANGXIN));
            f22708a.put(ShareTargetType.Share2DingTalk.getValue(), new a(new hwr(), "DingTalk", "dingtalk"));
            f22708a.put(ShareTargetType.Share2Contact.getValue(), new a(new cwr(), "Contacts", "contacts"));
            f22708a.put(ShareTargetType.Share2QRCode.getValue(), new a(new tur(), "QRCode", "QRCode"));
            f22708a.put(ShareTargetType.Share2ScanCode.getValue(), new a(new sur(), "QRCode-Scan", "QRCode-Scan"));
            f22708a.put(ShareTargetType.Share2IShopping.getValue(), new a(new jwr(), "Guangjie", "guangjie"));
            f22708a.put(ShareTargetType.Share2IPresent.getValue(), new a(new jwr(), "Present", "present"));
            f22708a.put(ShareTargetType.Share2SMS.getValue(), new a(new pxr(), "taopassword-sms", "taopassword-sms"));
            f22708a.put(ShareTargetType.Share2Messenger.getValue(), new a(new dwr(), "Messenger", "Messenger"));
            f22708a.put(ShareTargetType.Share2Telegram.getValue(), new a(new dwr(), "Telegram", "Telegram"));
            f22708a.put(ShareTargetType.Share2WeChat.getValue(), new a(new dwr(), "WeChat", "WeChat"));
            f22708a.put(ShareTargetType.Share2WhatsApp.getValue(), new a(new dwr(), "WhatsApp", "WhatsApp"));
            f22708a.put(ShareTargetType.Share2Instagram.getValue(), new a(new dwr(), "Instagram", "Instagram"));
            f22708a.put(ShareTargetType.Share2Facebook.getValue(), new a(new dwr(), "Facebook", "Facebook"));
            f22708a.put(ShareTargetType.Share2I18Napp.getValue(), new a(new dwr(), "I18Napp", "I18Napp"));
            f22708a.put(ShareTargetType.Share2Line.getValue(), new a(new dwr(), "Line", "Line"));
        }
        return f22708a;
    }

    public static a b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3085c110", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap<String, a> a2 = a();
        if (!ShareTargetType.Share2Weixin.getValue().equals(str) || !bwr.h().c) {
            return a2.get(str);
        }
        return a2.get(str + "_SDK");
    }

    public static void c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de08c55", new Object[]{str, map});
            return;
        }
        a b = b(str);
        if (b != null) {
            d(str, b.b, b.c);
            b.f22709a.a(str, map);
            return;
        }
        fwr.b("ShareHandlerAdapter", "share err handlers null");
    }

    public static void d(String str, String str2, String str3) {
        TBShareContent e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36793b1f", new Object[]{str, str2, str3});
        } else if (!TextUtils.isEmpty(str) && (e = bwr.h().e()) != null) {
            String str4 = e.businessId;
            if (!ShareTargetType.Share2Contact.getValue().equals(str)) {
                Properties properties = new Properties();
                if (!TextUtils.isEmpty(str3)) {
                    properties.put("Type", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    properties.put("bizID", str4);
                }
                e.fillUTProperties(properties);
                TBS.Ext.commitEvent("ShareTypes", properties);
            }
        }
    }
}
