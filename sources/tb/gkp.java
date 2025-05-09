package tb;

import android.app.Activity;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.ThreadMode;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import com.ut.share.business.WWMessageType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cjp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gkp implements rl8<cjp> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f20063a;

    static {
        t2o.a(352321545);
        t2o.a(723517460);
    }

    public gkp(Activity activity) {
        this.f20063a = activity;
    }

    @Override // tb.rl8
    public ThreadMode R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    /* renamed from: a */
    public gl8 h(cjp cjpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gl8) ipChange.ipc$dispatch("632a79ec", new Object[]{this, cjpVar});
        }
        ShareContent shareContent = new ShareContent();
        shareContent.businessId = "1";
        cjp.a aVar = cjpVar.f;
        shareContent.description = aVar.f17102a;
        shareContent.snapshotImages = aVar.b;
        Uri.Builder buildUpon = Uri.parse(bwr.NAV_URL_DETAIL_BASE + cjpVar.f.d + ".htm").buildUpon();
        Map<String, String> map = cjpVar.e;
        if (map != null) {
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                if (entry != null) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } else {
            buildUpon.appendQueryParameter("price", cjpVar.f.c);
            buildUpon.appendQueryParameter("original_price", cjpVar.f.e);
        }
        buildUpon.appendQueryParameter("sourceType", "item");
        shareContent.url = buildUpon.toString();
        shareContent.imageSoure = null;
        shareContent.shareScene = "item";
        shareContent.wwMsgType = WWMessageType.WWMessageTypeDetail;
        shareContent.templateId = "detail";
        HashMap hashMap = new HashMap();
        hashMap.put("price", cjpVar.f.c);
        shareContent.extendParams = hashMap;
        List<String> list = cjpVar.f.b;
        if (list != null && list.size() > 0) {
            shareContent.imageUrl = cjpVar.f.b.get(0);
        }
        ShareBusiness.share(this.f20063a, "想告诉谁", shareContent);
        return null;
    }
}
