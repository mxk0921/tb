package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.BitmapUtil;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.taobao.R;
import com.ut.share.ShareApi;
import com.ut.share.SharePlatform;
import com.ut.share.ShareResponse;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareTargetType;
import com.ut.share.data.ShareData;
import com.ut.share.inter.ShareListener;
import com.ut.share.utils.Constants;
import com.ut.share.utils.ShareUtils;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.lkp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hwr implements xhp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ShareListener f20929a = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareData f20930a;
        public final /* synthetic */ String b;

        public a(ShareData shareData, String str) {
            this.f20930a = shareData;
            this.b = str;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            hwr.b(hwr.this, this.f20930a, this.b);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20931a;
        public final /* synthetic */ ShareData b;

        public b(String str, ShareData shareData) {
            this.f20931a = str;
            this.b = shareData;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            return hwr.c(hwr.this, succPhenixEvent, this.f20931a, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] $SwitchMap$com$ut$share$ShareResponse$ErrorCode;

        static {
            int[] iArr = new int[ShareResponse.ErrorCode.values().length];
            $SwitchMap$com$ut$share$ShareResponse$ErrorCode = iArr;
            try {
                iArr[ShareResponse.ErrorCode.ERR_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ut$share$ShareResponse$ErrorCode[ShareResponse.ErrorCode.ERR_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ut$share$ShareResponse$ErrorCode[ShareResponse.ErrorCode.ERR_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ut$share$ShareResponse$ErrorCode[ShareResponse.ErrorCode.ERR_FAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        t2o.a(666894424);
        t2o.a(666894439);
    }

    public static /* synthetic */ void b(hwr hwrVar, ShareData shareData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb177042", new Object[]{hwrVar, shareData, str});
        } else {
            hwrVar.k(shareData, str);
        }
    }

    public static /* synthetic */ boolean c(hwr hwrVar, SuccPhenixEvent succPhenixEvent, String str, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f35452ab", new Object[]{hwrVar, succPhenixEvent, str, shareData})).booleanValue();
        }
        return hwrVar.i(succPhenixEvent, str, shareData);
    }

    public static /* synthetic */ void d(hwr hwrVar, ShareResponse shareResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87bc6752", new Object[]{hwrVar, shareResponse});
        } else {
            hwrVar.n(shareResponse);
        }
    }

    public static /* synthetic */ void e(hwr hwrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59c27dd0", new Object[]{hwrVar});
        } else {
            hwrVar.l();
        }
    }

    public static /* synthetic */ void f(hwr hwrVar, ShareResponse shareResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e51f3b90", new Object[]{hwrVar, shareResponse});
        } else {
            hwrVar.m(shareResponse);
        }
    }

    @Override // tb.xhp
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de08c55", new Object[]{this, str, map});
            return;
        }
        TBShareContent e = bwr.h().e();
        ShareData shareData = new ShareData();
        shareData.setBusinessId(e.businessId);
        shareData.setTitle(e.title);
        Map<String, String> map2 = e.extraParams;
        if (map2 != null && !TextUtils.isEmpty(map2.get("bizType"))) {
            shareData.setBizType(e.extraParams.get("bizType"));
        }
        shareData.setText(e.description);
        shareData.setSourceType(e.shareScene);
        if (!TextUtils.isEmpty(e.imgPath)) {
            shareData.setImagePath(e.imgPath);
            e.imageUrl = e.imgPath;
            shareData.setSourceType("");
            shareData.setType(ShareData.MessageType.IMAGE);
        } else {
            shareData.setLink(e.url);
        }
        shareData.setUserInfo(e.activityParams);
        if (!TextUtils.isEmpty(e.imageUrl)) {
            if (e.imageUrl.startsWith(h1p.HTTP_PREFIX) || e.imageUrl.startsWith(h1p.HTTPS_PREFIX)) {
                shareData.setImageUrl(e.imageUrl);
            } else {
                shareData.setImagePath(e.imageUrl);
            }
        } else if (ShareTargetType.Share2SinaWeibo.getValue().equals(str)) {
            String k = lkp.b.k();
            if (TextUtils.isEmpty(k)) {
                k = hjp.a().getString(R.string.share_weibo_default_image);
            }
            e.imageUrl = k;
            shareData.setImageUrl(k);
        }
        g(e, shareData, str);
    }

    public final void g(TBShareContent tBShareContent, ShareData shareData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ca82a3", new Object[]{this, tBShareContent, shareData, str});
            return;
        }
        akp.h(str);
        if (ShareTargetType.Share2Wangxin.getValue().equals(str)) {
            ShareData.MessageType type = shareData.getType();
            ShareData.MessageType messageType = ShareData.MessageType.TEXT;
            if (type == messageType || TextUtils.equals("item", bwr.h().o())) {
                shareData.setText(shareData.getLink());
                shareData.setImagePath(null);
                shareData.setImageUrl(null);
                shareData.setLink(null);
                shareData.setTitle(null);
                shareData.setType(messageType);
            }
        }
        if (!j(shareData, str)) {
            akp.g(hjp.a().getApplicationContext(), str, shareData, this.f20929a);
        }
    }

    public final void h(String str, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21faa91", new Object[]{this, str, shareData});
        } else {
            s0m.B().N0(hjp.a().getApplicationContext()).T(shareData.getImageUrl()).succListener(new b(str, shareData)).failListener(new a(shareData, str)).fetch();
        }
    }

    public final boolean j(ShareData shareData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dcde064", new Object[]{this, shareData, str})).booleanValue();
        }
        SharePlatform i = akp.i(str);
        if (SharePlatform.Other.equals(i) || !ShareApi.getInstance().supportImageShare(i) || !TextUtils.isEmpty(shareData.getImagePath()) || TextUtils.isEmpty(shareData.getImageUrl())) {
            return false;
        }
        if (ShareTargetType.Share2SinaWeibo.getValue().equals(str) || ShareTargetType.Share2Weixin.getValue().equals(str) || ShareTargetType.Share2WeixinTimeline.getValue().equals(str)) {
            h(str, shareData);
        } else {
            String decideUrl = ImageStrategyDecider.decideUrl(shareData.getImageUrl(), 100, 100, ImageStrategyConfig.v("default", 67).a());
            if (!TextUtils.isEmpty(decideUrl)) {
                shareData.setImageUrl(decideUrl);
            }
            h(str, shareData);
        }
        return true;
    }

    public final void k(ShareData shareData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1964677", new Object[]{this, shareData, str});
        } else {
            akp.g(hjp.a().getApplicationContext(), str, shareData, this.f20929a);
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("553ce21f", new Object[]{this});
        } else {
            Toast.makeText(hjp.a().getApplicationContext(), Localization.q(R.string.taobao_app_1010_1_17842), 0).show();
        }
    }

    public final void m(ShareResponse shareResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9efc6ca4", new Object[]{this, shareResponse});
        } else {
            Toast.makeText(hjp.a().getApplicationContext(), Localization.q(R.string.taobao_app_1010_1_17832), 0).show();
        }
    }

    public final void n(ShareResponse shareResponse) {
        SharePlatform sharePlatform;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b9a10b", new Object[]{this, shareResponse});
        } else if (shareResponse == null || (sharePlatform = shareResponse.platform) == null || !(sharePlatform == SharePlatform.Messenger || sharePlatform == SharePlatform.Facebook || sharePlatform == SharePlatform.Instagram || sharePlatform == SharePlatform.Line || sharePlatform == SharePlatform.Telegram || sharePlatform == SharePlatform.WeChat || sharePlatform == SharePlatform.WhatsApp)) {
            Toast.makeText(hjp.a().getApplicationContext(), Localization.q(R.string.taobao_app_1010_1_17872), 0).show();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements ShareListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.ut.share.inter.ShareListener
        public void onResponse(ShareResponse shareResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5dc66e8", new Object[]{this, shareResponse});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("platform", akp.f(shareResponse.platform).getValue());
            int i = d.$SwitchMap$com$ut$share$ShareResponse$ErrorCode[shareResponse.errorCode.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    hwr.d(hwr.this, shareResponse);
                    hashMap.put(rb.RESULT_KEY, "success");
                } else if (i == 3) {
                    hwr.e(hwr.this);
                    hashMap.put(rb.RESULT_KEY, "cancel");
                } else if (i == 4) {
                    hwr.f(hwr.this, shareResponse);
                    hashMap.put(rb.RESULT_KEY, "fail");
                    hashMap.put("errorMessage", shareResponse.errorMessage);
                }
                ShareBusiness.getInstance().onShareFinished(hashMap);
            }
        }
    }

    public final boolean i(SuccPhenixEvent succPhenixEvent, String str, ShareData shareData) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3db1e06", new Object[]{this, succPhenixEvent, str, shareData})).booleanValue();
        }
        if (!(succPhenixEvent.getDrawable() == null || succPhenixEvent.getDrawable().getBitmap() == null)) {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                Context applicationContext = hjp.a().getApplicationContext();
                if (applicationContext.getExternalCacheDirs().length > 0) {
                    file = applicationContext.getExternalCacheDirs()[0];
                } else {
                    file = applicationContext.getExternalCacheDir() != null ? applicationContext.getExternalCacheDir() : null;
                }
                Bitmap drawWaterMark = BitmapUtil.drawWaterMark(succPhenixEvent.getDrawable().getBitmap());
                if (file != null && ShareUtils.saveBitmap(drawWaterMark, file, Constants.SHARE_IMAGE_FILE_NAME, Bitmap.CompressFormat.JPEG)) {
                    shareData.setImagePath(file + "/share_image_temp.jpg");
                }
            }
            k(shareData, str);
        }
        return true;
    }
}
