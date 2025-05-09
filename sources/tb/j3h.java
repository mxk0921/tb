package tb;

import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.net.FaceDetectionNet;
import com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl.b;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class j3h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String A;
    public long c;
    public String d;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int m;
    public int n;
    public int o;
    public int p;
    public Rect s;

    /* renamed from: a  reason: collision with root package name */
    public String f21737a = "0";
    public String b = "0";
    public final CopyOnWriteArrayList<PointF> e = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<Float> k = new CopyOnWriteArrayList<>();
    public int l = 0;
    public float q = 1.0f;
    public float r = 1.0f;
    public boolean t = false;
    public boolean u = false;
    public long v = 10;
    public int w = -1;
    public int x = 0;
    public boolean y = false;
    public boolean z = false;

    static {
        t2o.a(491782348);
    }

    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4a4dcbf", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("queryParams")) != null) {
            this.f21737a = jSONObject2.getString("accountId");
            this.b = jSONObject2.getString("feedId");
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("accea72e", new Object[]{this});
        } else if (!this.y) {
            this.y = true;
            HashMap hashMap = new HashMap();
            hashMap.put(mx8.LIVE_ALGO_NUMBER, String.valueOf(this.f));
            hashMap.put(mx8.LIVE_ALGO_SUCCESS_NUMBER, String.valueOf(this.h));
            hashMap.put(mx8.LIVE_ALGO_FAILURE_NUMBER, String.valueOf(this.g));
            hashMap.put("live_algo_hasPeople_number", String.valueOf(this.i));
            hashMap.put("live_algo_farApart_number", String.valueOf(this.j));
            hashMap.put("live_algo_firstOpen_number", String.valueOf(this.w));
            hashMap.put("live_algo_zoom_change_number", String.valueOf(this.x));
            float a2 = b.a(this.k);
            hashMap.put("live_algo_figure_area_ratio_mean", String.valueOf(a2));
            hashMap.put("live_first_frame_rendered", String.valueOf(this.z));
            hashMap.put("live_algo_figure_area_ratio_sd", String.valueOf(b.c(this.k, a2)));
            float[] b = b.b(this.e);
            if (b != null) {
                hashMap.put("live_algo_figure_center_x", String.valueOf(b[0]));
                hashMap.put("live_algo_figure_center_y", String.valueOf(b[1]));
                hashMap.put("live_algo_figure_center_x_sd", String.valueOf(b[2]));
                hashMap.put("live_algo_figure_center_y_sd", String.valueOf(b[3]));
            }
            hashMap.put("accountId", this.f21737a);
            hashMap.put("feedId", this.b);
            hashMap.put("liveDuration", String.valueOf(System.currentTimeMillis() - this.c));
            if (!TextUtils.isEmpty(this.A)) {
                hashMap.put("errorCode", this.A);
            }
            if (cw6.b()) {
                fve.e(FaceDetectionNet.BIZ_NAME, "utdata: " + JSON.toJSONString(hashMap));
            }
            mx8.b(mx8.LIVE_ALGO_STATISTICS, null, hashMap);
        }
    }
}
