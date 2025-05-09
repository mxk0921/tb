package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.TBWXSDKEngine;
import com.taobao.weex.WXEnvironment;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareBusinessListener;
import com.ut.share.business.ShareContent;
import com.ut.share.business.ShareTargetType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class sqp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements ShareBusinessListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.ut.share.business.ShareBusinessListener
        public void onFinished(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff43b50d", new Object[]{this, map});
            }
        }

        @Override // com.ut.share.business.ShareBusinessListener
        public void onShare(ShareContent shareContent, ShareTargetType shareTargetType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a481375", new Object[]{this, shareContent, shareTargetType});
            }
        }
    }

    static {
        t2o.a(766509086);
    }

    public static void a(Context context, ShareContent shareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858a050f", new Object[]{context, shareContent, str});
            return;
        }
        if (TextUtils.equals("weex", shareContent.templateId) && !WXEnvironment.JsFrameworkInit) {
            TBWXSDKEngine.initSDKEngine();
            while (!WXEnvironment.JsFrameworkInit) {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        ShareBusiness.share((Activity) context, shareContent, new a());
    }
}
