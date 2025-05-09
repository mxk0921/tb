package tb;

import android.content.Context;
import android.text.TextUtils;
import androidx.appcompat.taobao.util.Globals;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.taopassword.TBShareContentStoreService;
import com.taobao.taobao.R;
import com.ut.share.ShareApi;
import com.ut.share.SharePlatform;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import com.ut.share.business.ShareTargetType;
import com.ut.share.data.ShareData;
import com.ut.share.inter.ShareListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class akp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$ut$share$SharePlatform;

        static {
            int[] iArr = new int[SharePlatform.values().length];
            $SwitchMap$com$ut$share$SharePlatform = iArr;
            try {
                iArr[SharePlatform.Copy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.SinaWeibo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.Weixin.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.WeixinPengyouquan.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.Wangxin.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.LaiwangChat.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.Alipay.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.SMS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.Messenger.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.Facebook.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.Line.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.Telegram.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.WeChat.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.WhatsApp.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.Instagram.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    static {
        t2o.a(665845840);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb18ac3", new Object[0]);
            return;
        }
        ShareBusiness.getInstance().cacheLastShareContent(Globals.getApplication().getApplicationContext(), d());
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b6c50201", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || str.indexOf("http") < 0) {
            return str;
        }
        int indexOf = str.indexOf("http");
        String substring = str.substring(0, indexOf);
        String g = ehs.j().g(str.substring(indexOf));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(substring);
        stringBuffer.append(g);
        return stringBuffer.toString();
    }

    public static String c(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a546563", new Object[]{str});
        }
        String str3 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("http");
        if (indexOf < 0) {
            return str;
        }
        if (indexOf < 0) {
            str2 = str;
        } else {
            str2 = str.substring(0, indexOf);
        }
        if (indexOf >= 0) {
            str3 = str.substring(indexOf);
        }
        String g = ehs.j().g(str3);
        return str2 + g + " " + Localization.q(R.string.taobao_app_1010_1_18108);
    }

    public static ShareContent d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("897c4b17", new Object[0]);
        }
        TBShareContent e = bwr.h().e();
        if (e == null) {
            return null;
        }
        ShareContent shareContent = new ShareContent();
        shareContent.businessId = e.businessId;
        shareContent.shareId = e.shareId;
        shareContent.suId = e.suId;
        shareContent.isActivity = e.isActivity;
        shareContent.needSaveContent = e.needSaveContent;
        shareContent.weixinAppId = e.weixinAppId;
        shareContent.weixinMsgType = e.weixinMsgType;
        shareContent.shareScene = e.shareScene;
        shareContent.title = e.title;
        shareContent.description = e.description;
        shareContent.imageUrl = e.imageUrl;
        shareContent.url = e.url;
        shareContent.imageSoure = e.imageSoure;
        shareContent.wwMsgType = e.wwMsgType;
        shareContent.activityParams = e.activityParams;
        shareContent.extraParams = e.extraParams;
        return shareContent;
    }

    public static void e(ShareTargetType shareTargetType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d7de838", new Object[]{shareTargetType});
        } else {
            ShareBusiness.getInstance().targetSelectedNotify(d(), shareTargetType);
        }
    }

    public static ShareTargetType f(SharePlatform sharePlatform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareTargetType) ipChange.ipc$dispatch("34a05244", new Object[]{sharePlatform});
        }
        switch (a.$SwitchMap$com$ut$share$SharePlatform[sharePlatform.ordinal()]) {
            case 1:
                return ShareTargetType.Share2Copy;
            case 2:
                return ShareTargetType.Share2SinaWeibo;
            case 3:
                return ShareTargetType.Share2Weixin;
            case 4:
                return ShareTargetType.Share2WeixinTimeline;
            case 5:
                return ShareTargetType.Share2Wangxin;
            case 6:
                return ShareTargetType.Share2Laiwang;
            case 7:
                return ShareTargetType.Share2Alipay;
            case 8:
                return ShareTargetType.Share2SMS;
            case 9:
                return ShareTargetType.Share2Messenger;
            case 10:
                return ShareTargetType.Share2Facebook;
            case 11:
                return ShareTargetType.Share2Line;
            case 12:
                return ShareTargetType.Share2Telegram;
            case 13:
                return ShareTargetType.Share2WeChat;
            case 14:
                return ShareTargetType.Share2WhatsApp;
            case 15:
                return ShareTargetType.Share2Instagram;
            default:
                return ShareTargetType.Share2Other;
        }
    }

    public static void g(Context context, String str, ShareData shareData, ShareListener shareListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa74342", new Object[]{context, str, shareData, shareListener});
            return;
        }
        SharePlatform i = i(str);
        if (!SharePlatform.Other.equals(i)) {
            ShareApi.getInstance().share(context, i, shareData, shareListener);
        }
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c8cc683", new Object[]{str});
        } else {
            new TBShareContentStoreService(str).request();
        }
    }

    public static SharePlatform i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharePlatform) ipChange.ipc$dispatch("96aef6d7", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return SharePlatform.Other;
        }
        if (ShareTargetType.Share2Alipay.getValue().equals(str)) {
            return SharePlatform.Alipay;
        }
        if (ShareTargetType.Share2Copy.getValue().equals(str)) {
            return SharePlatform.Copy;
        }
        if (ShareTargetType.Share2QQ.getValue().equals(str)) {
            return SharePlatform.QQ;
        }
        if (ShareTargetType.Share2Qzone.getValue().equals(str)) {
            return SharePlatform.QZone;
        }
        if (ShareTargetType.Share2Wangxin.getValue().equals(str)) {
            return SharePlatform.Wangxin;
        }
        if (ShareTargetType.Share2Weixin.getValue().equals(str)) {
            return SharePlatform.Weixin;
        }
        if (ShareTargetType.Share2WeixinTimeline.getValue().equals(str)) {
            return SharePlatform.WeixinPengyouquan;
        }
        if (ShareTargetType.Share2SinaWeibo.getValue().equals(str)) {
            return SharePlatform.SinaWeibo;
        }
        if (ShareTargetType.Share2DingTalk.getValue().equals(str)) {
            return SharePlatform.DingTalk;
        }
        if (ShareTargetType.Share2SMS.getValue().equals(str)) {
            return SharePlatform.SMS;
        }
        if (ShareTargetType.Share2Messenger.getValue().equals(str)) {
            return SharePlatform.Messenger;
        }
        if (ShareTargetType.Share2Line.getValue().equals(str)) {
            return SharePlatform.Line;
        }
        if (ShareTargetType.Share2Telegram.getValue().equals(str)) {
            return SharePlatform.Telegram;
        }
        if (ShareTargetType.Share2WeChat.getValue().equals(str)) {
            return SharePlatform.WeChat;
        }
        if (ShareTargetType.Share2WhatsApp.getValue().equals(str)) {
            return SharePlatform.WhatsApp;
        }
        if (ShareTargetType.Share2Instagram.getValue().equals(str)) {
            return SharePlatform.Instagram;
        }
        if (ShareTargetType.Share2Facebook.getValue().equals(str)) {
            return SharePlatform.Facebook;
        }
        return SharePlatform.Other;
    }
}
