package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.mrt.task.desc.MRTFilesDescription;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import tb.dv7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class av7 implements adt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements dv7.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nqh f16023a;
        public final /* synthetic */ CountDownLatch b;
        public final /* synthetic */ String c;
        public final /* synthetic */ MRTFilesDescription d;

        public a(av7 av7Var, nqh nqhVar, CountDownLatch countDownLatch, String str, MRTFilesDescription mRTFilesDescription) {
            this.f16023a = nqhVar;
            this.b = countDownLatch;
            this.c = str;
            this.d = mRTFilesDescription;
        }

        @Override // tb.dv7.a
        public void a(boolean z, Exception exc, String str) {
            boolean z2;
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aff9c19e", new Object[]{this, new Boolean(z), exc, str});
                return;
            }
            this.f16023a.b(str);
            try {
                z2 = this.f16023a.c();
            } catch (Exception e) {
                e.printStackTrace();
                z2 = false;
            }
            CountDownLatch countDownLatch = this.b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
                return;
            }
            String str2 = this.c;
            MRTFilesDescription mRTFilesDescription = this.d;
            if (exc != null) {
                i = -1;
            }
            ewv.e(str2, mRTFilesDescription, i, z2);
        }
    }

    static {
        t2o.a(1034944708);
        t2o.a(1034944593);
    }

    @Override // tb.adt
    public Map<String, String> a(Map<String, String> map) {
        MRTFilesDescription mRTFilesDescription;
        Map<String, String> map2;
        String d;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e53be4f", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        if (map == null) {
            hashMap.put("success", "0");
            hashMap.put("path", "");
            return hashMap;
        }
        String str = map.get(AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        String str2 = map.get("fileName");
        if (Integer.valueOf(map.get("async")).intValue() == 1) {
            z = true;
        }
        kgh.a("DownloadResourceTask", r4p.KEY_MODEL_NAME + str + ",fileName:" + str2 + ",async:" + z);
        MRTTaskDescription e = oqh.d().e(str);
        if (e == null || (mRTFilesDescription = e.optResource) == null || (map2 = mRTFilesDescription.files) == null || !map2.containsKey(str2)) {
            hashMap.put("success", "0");
            hashMap.put("path", "");
            return hashMap;
        }
        MRTFilesDescription mRTFilesDescription2 = e.optResource;
        vqh vqhVar = mRTFilesDescription2.resourceOperation;
        if (vqhVar == null || !(vqhVar instanceof nqh)) {
            hashMap.put("success", "0");
            hashMap.put("path", "");
            return hashMap;
        }
        nqh nqhVar = (nqh) vqhVar;
        String d2 = nqhVar.d(str2);
        if (!TextUtils.isEmpty(d2)) {
            hashMap.put("success", "1");
            hashMap.put("path", d2);
            return hashMap;
        }
        CountDownLatch countDownLatch = !z ? new CountDownLatch(1) : null;
        iqh.b().a(mRTFilesDescription2, new a(this, nqhVar, countDownLatch, str, mRTFilesDescription2));
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            d = nqhVar.d(str2);
        } else {
            d = d2;
        }
        hashMap.put("success", "1");
        hashMap.put("path", d);
        return hashMap;
    }
}
