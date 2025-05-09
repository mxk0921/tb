package tb;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.c;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class oso extends zio {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Bitmap c;
    public final /* synthetic */ kso[] d;
    public final /* synthetic */ Rect[] e;
    public final /* synthetic */ c f;

    public oso(c cVar, Bitmap bitmap, kso[] ksoVarArr, Rect[] rectArr) {
        this.f = cVar;
        this.c = bitmap;
        this.d = ksoVarArr;
        this.e = rectArr;
    }

    public static /* synthetic */ Object ipc$super(oso osoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/scan/ScancodeBizManager$4");
    }

    @Override // tb.zio
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            return;
        }
        String g = mld.g(caa.c(), this.c, "scan_sampling");
        if (!TextUtils.isEmpty(g)) {
            HashMap<String, String> hashMap = new HashMap<>(10);
            hashMap.put(upx.SCAN_RESULT, JSON.toJSONString(this.d));
            hashMap.put("scanCodeRects", JSON.toJSONString(this.e));
            hashMap.put(ivv.LOCAL_FILE_PATH, g);
            ivv.Companion.f(ivv.BIZ_TYPE_SCAN_FRAME, g, hashMap, ryp.FILE_TYPE_IMAGE_JPG);
        }
    }
}
