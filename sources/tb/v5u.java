package tb;

import android.graphics.Rect;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.android.alibaba.ip.runtime.IpChange;
import com.ap.zlz.toyger.zdoc.DocBlobManagerJson;
import com.ap.zlz.toyger.zdoc.ToygerDocBlobConfig;
import com.ap.zlz.toyger.zdoc.ToygerDocInfo;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class v5u {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BLOB_META_BIS_TOKEN = "bis_token";
    public static final String BLOB_META_INVTP_TYPE = "invtp_type";
    public static final String BLOB_META_RETRY = "blob_meta_retry";

    static {
        t2o.a(245366794);
    }

    public static HashMap<String, Object> a(TGFrame tGFrame, ToygerDocBlobConfig toygerDocBlobConfig, Rect rect, int i, String str, String str2) {
        try {
            IpChange ipChange = DocBlobManagerJson.$ipChange;
            Constructor declaredConstructor = DocBlobManagerJson.class.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            ls7 ls7Var = (ls7) declaredConstructor.newInstance(new Object[0]);
            ls7Var.setCropRect(rect);
            ls7Var.setBlobConfig(toygerDocBlobConfig);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ToygerDocInfo(tGFrame, new u5u()));
            byte[] generateBlob = ls7Var.generateBlob(arrayList, null);
            byte[] key = ls7Var.getKey();
            HashMap<String, Object> hashMap = new HashMap<>(6);
            hashMap.put("content", generateBlob);
            hashMap.put("key", key);
            hashMap.put("isUTF8", Boolean.TRUE);
            hashMap.put(upx.PAGE_NUMBER, Integer.toString(toygerDocBlobConfig.pageNo));
            hashMap.put(upx.PRE_COMPRESS_SIZE, Long.toString(tGFrame.data.length));
            hashMap.put(upx.POST_COMPRESS_SIZE, Long.toString(ls7Var.getPicSize()));
            return hashMap;
        } catch (Throwable unused) {
            return null;
        }
    }
}
