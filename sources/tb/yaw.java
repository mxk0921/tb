package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareBusinessListener;
import com.ut.share.business.ShareContent;
import com.ut.share.business.ShareTargetType;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yaw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f31948a;
    public final ShareBusinessListener b = new a();
    public fpd c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ShareBusinessListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.ut.share.business.ShareBusinessListener
        public void onFinished(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff43b50d", new Object[]{this, map});
            } else if (yaw.a(yaw.this) != null) {
                yaw.a(yaw.this).b(map);
                yaw.b(yaw.this, null);
            }
        }

        @Override // com.ut.share.business.ShareBusinessListener
        public void onShare(ShareContent shareContent, ShareTargetType shareTargetType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a481375", new Object[]{this, shareContent, shareTargetType});
            } else if (yaw.a(yaw.this) != null) {
                yaw.a(yaw.this).a(shareTargetType.toString());
            }
        }
    }

    public yaw(Activity activity) {
        this.f31948a = activity;
    }

    public static /* synthetic */ fpd a(yaw yawVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fpd) ipChange.ipc$dispatch("c8531dee", new Object[]{yawVar});
        }
        return yawVar.c;
    }

    public static /* synthetic */ fpd b(yaw yawVar, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fpd) ipChange.ipc$dispatch("5920ee43", new Object[]{yawVar, fpdVar});
        }
        yawVar.c = fpdVar;
        return fpdVar;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.c = null;
        }
    }

    public void d(ykp ykpVar, String str, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a34dc89", new Object[]{this, ykpVar, str, fpdVar});
            return;
        }
        ShareContent shareContent = new ShareContent();
        shareContent.title = ykpVar.f32155a;
        shareContent.description = ykpVar.b;
        shareContent.imageUrl = ykpVar.c;
        shareContent.url = ykpVar.d;
        shareContent.businessId = ykpVar.e;
        shareContent.wwMsgType = ykpVar.f;
        shareContent.disableBackToClient = false;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        this.c = fpdVar;
        ShareBusiness.share(this.f31948a, arrayList, shareContent, this.b);
    }
}
