package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class wbw extends khj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public int k;
    public float[] l = {123.675f, 116.28f, 103.53f};
    public float[] m = {0.017124753f, 0.017507004f, 0.017429193f};

    static {
        t2o.a(482345001);
    }

    public wbw() {
        this.e = 0.95f;
        this.j = 224;
        this.k = 224;
        JSONObject H3 = lg4.H3();
        if (H3 == null) {
            f();
        } else {
            try {
                this.b = H3.getString("url");
                this.c = H3.getString("md5");
                this.d = H3.getInt("mode");
                this.j = H3.getInt("detectWidth");
                this.k = H3.getInt("detectHeight");
                this.f = (float) H3.getDouble("vipDetectThreshold");
                this.g = (float) H3.getDouble("vipAreaRatio");
                this.h = (float) H3.getDouble("vipTrackletOverallRatio");
                this.i = (float) H3.getDouble("vipTrackletFirstSecondRatio");
                this.e = (float) H3.getDouble("threshold");
                JSONArray jSONArray = H3.getJSONArray("norms");
                p(H3.getJSONArray("means"));
                q(jSONArray);
            } catch (Exception unused) {
                f();
            }
        }
        this.f22670a = "video_track";
    }

    public static /* synthetic */ Object ipc$super(wbw wbwVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/model/VideoTrackConfig");
    }

    @Override // tb.khj
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4213feae", new Object[]{this});
        }
        return "jiQbKdmJeaNhfamRe/pHiu0X2D3PCpDM8tKVDvknyoQTWh7NX+UMB2sTOQ1nMyWN+WAUkug8jaQ9T+bxDD5yXMGPQXfDEdyOCibERaZibr4=";
    }

    @Override // tb.khj
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6334b4b2", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.khj
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f1bfd55", new Object[]{this});
        }
        return "5002";
    }

    @Override // tb.khj
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39216805", new Object[]{this});
        }
        return "video_track";
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb7de49a", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f112f1a7", new Object[]{this})).intValue();
        }
        return this.j;
    }

    public float[] i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("4e9d80a2", new Object[]{this});
        }
        return this.l;
    }

    public float[] j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("bea10759", new Object[]{this});
        }
        return this.m;
    }

    public float k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ba8f7ac", new Object[]{this})).floatValue();
        }
        return this.e;
    }

    public float l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23791b4e", new Object[]{this})).floatValue();
        }
        return this.g;
    }

    public float m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d942518", new Object[]{this})).floatValue();
        }
        return this.f;
    }

    public float n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ad1e5b5", new Object[]{this})).floatValue();
        }
        return this.i;
    }

    public float o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a64064c", new Object[]{this})).floatValue();
        }
        return this.h;
    }

    public final void p(JSONArray jSONArray) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fba3cfc", new Object[]{this, jSONArray});
            return;
        }
        this.l = new float[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            this.l[i] = (float) jSONArray.getDouble(i);
        }
    }

    public final void q(JSONArray jSONArray) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbd34e5", new Object[]{this, jSONArray});
            return;
        }
        this.m = new float[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            this.m[i] = (float) jSONArray.getDouble(i);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95a2ea69", new Object[]{this});
            return;
        }
        this.b = "https://files.alicdn.com/tpsservice/1ebc2946399d979137e79711fadcf76e.zip";
        this.c = "6e770dd00962be9680fe820a2a7d6d80";
        this.d = 0;
        this.e = 0.95f;
        this.f = 0.8f;
        this.g = 0.5f;
        this.h = 0.5f;
        this.i = 2.0f;
        this.j = 224;
        this.k = 224;
        this.l = new float[]{123.675f, 116.28f, 103.53f};
        this.m = new float[]{0.017124753f, 0.017507004f, 0.017429193f};
    }
}
