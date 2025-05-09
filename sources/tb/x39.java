package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.update.dynamicfeature.FeatureUpdateData;
import com.taobao.update.dynamicfeature.utils.Constants;
import com.taobao.update.framework.UpdateRuntime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import tb.tu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class x39 implements czm<q49> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final gdh f31112a = fih.getLog(x39.class, (gdh) null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements tu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ CountDownLatch val$countDownLatch;
        public final /* synthetic */ q49 val$updateContext;

        public a(q49 q49Var, CountDownLatch countDownLatch) {
            this.val$updateContext = q49Var;
            this.val$countDownLatch = countDownLatch;
        }

        @Override // tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
            } else {
                this.val$updateContext.downloadPath = str2;
            }
        }

        @Override // tb.tu7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.tu7
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            }
        }

        @Override // tb.tu7
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                return;
            }
            gdh access$000 = x39.access$000(x39.this);
            access$000.w("onFinish:  " + z);
            this.val$updateContext.success = z;
            this.val$countDownLatch.countDown();
        }

        @Override // tb.tu7
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
            }
        }

        @Override // tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            gdh access$000 = x39.access$000(x39.this);
            access$000.w("onDownloadError   errorCode:" + i + " errorMsg:" + str2);
            q49 q49Var = this.val$updateContext;
            q49Var.success = false;
            q49Var.errorCode = i;
            q49Var.errorMsg = str2;
        }
    }

    static {
        t2o.a(951058454);
        t2o.a(947912754);
    }

    public static /* synthetic */ gdh access$000(x39 x39Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gdh) ipChange.ipc$dispatch("682fb6c9", new Object[]{x39Var});
        }
        return x39Var.f31112a;
    }

    public final List<onf> a(FeatureUpdateData featureUpdateData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ed471ad6", new Object[]{this, featureUpdateData});
        }
        if (featureUpdateData == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(1);
        onf onfVar = new onf();
        onfVar.f25507a = featureUpdateData.getDownloadUrl();
        onfVar.c = featureUpdateData.md5;
        onfVar.b = featureUpdateData.size;
        arrayList.add(onfVar);
        return arrayList;
    }

    public void execute(q49 q49Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("211c1f10", new Object[]{this, q49Var});
            return;
        }
        this.f31112a.w("start download");
        q49Var.stage = "download";
        FeatureUpdateData featureUpdateData = q49Var.featureUpdateData;
        List<onf> a2 = a(featureUpdateData);
        if (a2 == null || a2.isEmpty()) {
            q49Var.success = false;
            q49Var.errorCode = -3;
            q49Var.errorMsg = Constants.getMsg(-3);
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        a aVar = new a(q49Var, countDownLatch);
        zu7 zu7Var = new zu7();
        zu7Var.f33016a = a2;
        upl uplVar = new upl();
        uplVar.g = q49Var.downloadDir;
        uplVar.d = 0;
        zu7Var.b = uplVar;
        uplVar.b = 20;
        uplVar.f29547a = "featureupdate";
        rv7.e().b(zu7Var, aVar);
        try {
            countDownLatch.await();
            if (q49Var.success && !TextUtils.isEmpty(q49Var.downloadPath) && !cbi.isMd5Same(featureUpdateData.md5, q49Var.downloadPath)) {
                UpdateRuntime.log("check md5 file error");
                q49Var.success = false;
                q49Var.errorMsg = "md5校验失败";
                q49Var.errorCode = AConstants.ArtcErrorIceCandidateGatheringTimeOut;
                q49Var.downloadPath = "";
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
