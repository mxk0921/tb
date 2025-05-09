package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.model.MediaVideoResponse;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class e95 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements a9e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f18368a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Context d;
        public final /* synthetic */ int e;
        public final /* synthetic */ wbd f;
        public final /* synthetic */ HashMap g;

        public a(boolean z, boolean z2, String str, Context context, int i, wbd wbdVar, HashMap hashMap) {
            this.f18368a = z;
            this.b = z2;
            this.c = str;
            this.d = context;
            this.e = i;
            this.f = wbdVar;
            this.g = hashMap;
        }

        @Override // tb.a9e
        public void a(MediaVideoResponse mediaVideoResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90d149e9", new Object[]{this, mediaVideoResponse});
            }
        }

        @Override // tb.a9e
        public void b(MediaVideoResponse mediaVideoResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf7cd44e", new Object[]{this, mediaVideoResponse});
            } else if (mediaVideoResponse != null && mediaVideoResponse.data != null && "SUCCESS".equals(mediaVideoResponse.errorCode)) {
                if (this.f18368a && this.b) {
                    mfi.d(this.c, mediaVideoResponse.data);
                }
                qmm.k(this.d, mediaVideoResponse.data, this.e, this.f, this.g);
            }
        }
    }

    static {
        t2o.a(452984947);
    }

    public static boolean b(Context context, JSONObject jSONObject, HashMap<String, String> hashMap, int i, wbd wbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e6e27b9", new Object[]{context, jSONObject, hashMap, new Integer(i), wbdVar})).booleanValue();
        }
        if (hashMap == null || hashMap.size() == 0 || qmm.k(context, jSONObject, i, wbdVar, new HashMap(hashMap)) == null) {
            return false;
        }
        return true;
    }

    public static boolean a(Context context, String str, HashMap<String, String> hashMap, int i, wbd wbdVar) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3309351", new Object[]{context, str, hashMap, new Integer(i), wbdVar})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || hashMap == null || hashMap.size() == 0) {
            return false;
        }
        HashMap hashMap2 = new HashMap(hashMap);
        boolean s = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "enablePCCache", "true"));
        boolean n = ew0.n(hashMap.get("from"), OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_PLAY_CONTROL_RESULT_CACHE_SBT, "[\"newdetail_main\", \"newdetail_native\", \"myorder\"]"));
        if (((!s || !n || (a2 = mfi.a(str)) == null) ? null : qmm.k(context, a2, i, wbdVar, hashMap2)) == null) {
            new b95(str, hashMap).a(new a(s, n, str, context, i, wbdVar, hashMap2));
        }
        return true;
    }
}
