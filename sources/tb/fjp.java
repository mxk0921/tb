package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.tao.sharegift.SharePasteImageConfig;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fjp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(666894541);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55287a57", new Object[0]);
        }
        String f = mip.f("shareGiftConfig", null);
        if (TextUtils.isEmpty(f)) {
            return null;
        }
        try {
            List<SharePasteImageConfig> parseArray = JSON.parseArray(f, SharePasteImageConfig.class);
            TBShareContent e = bwr.h().e();
            if (parseArray == null) {
                return null;
            }
            for (SharePasteImageConfig sharePasteImageConfig : parseArray) {
                if (TextUtils.equals(sharePasteImageConfig.bizID, e.businessId)) {
                    return sharePasteImageConfig.sharepasteimage;
                }
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
