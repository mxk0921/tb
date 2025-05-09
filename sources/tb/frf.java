package tb;

import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class frf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int A;
    public JSONArray B;
    public JSONArray C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;

    /* renamed from: a  reason: collision with root package name */
    public boolean f19485a;
    public String c;
    public String d;
    public String e;
    public String j;
    public String k;
    public boolean l;
    public boolean m;
    public String o;
    public int p;
    public String q;
    public JSONArray r;
    public int s;
    public int t;
    public String u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public boolean b = false;
    public String f = "image";
    public int g = 0;
    public int h = 104857600;
    public int i = -1;
    public boolean n = false;

    static {
        t2o.a(495976451);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "JSONParams{hasCrop=" + this.l + ", hasFilter=" + this.m + ", isMultiable=" + this.n + ", isAutoUpload=" + this.f19485a + ", isUseNewUi=" + this.b + ", videoBizCode='" + this.e + "', mode='" + this.o + "', maxSelect=" + this.p + ", bizCode='" + this.q + "', files=" + this.r + ", targetWidth=" + this.s + ", targetHeight=" + this.t + ", enumRatio='" + this.u + "', ratioX=" + this.v + ", ratioY=" + this.w + ", wvFiles=" + this.B + ", stickerIdsArray=" + this.C + ", isUseOriginalSize=" + this.D + ", hasGraffiti=" + this.E + ", hasMosaic=" + this.F + ", orientation=" + this.G + '}';
    }

    public static frf a(JSONObject jSONObject) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (frf) ipChange.ipc$dispatch("6b36a702", new Object[]{jSONObject});
        }
        frf frfVar = new frf();
        frfVar.f19485a = jSONObject.optInt("type", 0) == 1;
        frfVar.b = jSONObject.optInt("isUseNewUi", 0) == 1;
        frfVar.d = jSONObject.optString(z9u.KEY_TAOKE_BIZSCENE);
        frfVar.c = jSONObject.optString(dov.URL_KEY_BIZ_LINE);
        frfVar.q = jSONObject.optString("bizCode");
        frfVar.e = jSONObject.optString("videoBizCode");
        frfVar.f = jSONObject.optString("mediaType");
        frfVar.h = jSONObject.optInt("videoMaxSize");
        if (jSONObject.optInt("maxPhotoFileSize") > 0) {
            frfVar.g = jSONObject.optInt("maxPhotoFileSize");
        } else {
            frfVar.g = jSONObject.optInt("imageMaxSize") > 0 ? jSONObject.optInt("imageMaxSize") : 5000000;
        }
        frfVar.i = jSONObject.optInt("videoMaxDuration");
        frfVar.j = jSONObject.optString("finishButtonText");
        String optString = jSONObject.optString("crop");
        frfVar.l = !"0".equalsIgnoreCase(optString) && !"false".equalsIgnoreCase(optString);
        frfVar.u = jSONObject.optString("crop");
        frfVar.m = "true".equalsIgnoreCase(jSONObject.optString("filter"));
        frfVar.n = "1".equalsIgnoreCase(jSONObject.optString("mutipleSelection"));
        frfVar.p = jSONObject.optInt("maxSelect", 6);
        frfVar.o = jSONObject.optString("mode", CredentialRpcData.ACTION_BOTH);
        frfVar.H = jSONObject.optInt("isdkv");
        frfVar.k = jSONObject.optString("usernick");
        frfVar.r = jSONObject.optJSONArray(vs3.FILES_DIR_NAME);
        JSONObject optJSONObject = jSONObject.optJSONObject("maxsize");
        if (optJSONObject != null) {
            frfVar.s = optJSONObject.optInt("width", 0);
            frfVar.t = optJSONObject.optInt("height", 0);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("ratio");
        if (optJSONObject2 != null) {
            frfVar.v = optJSONObject2.optInt("x", 0);
            frfVar.w = optJSONObject2.optInt("y", 0);
        }
        frfVar.D = jSONObject.optInt("useOriginalSize", 0) == 1;
        frfVar.E = jSONObject.optInt("graffiti", 0) == 1;
        frfVar.F = jSONObject.optInt("mosaic", 0) == 1;
        frfVar.G = jSONObject.optInt("orientation");
        frfVar.x = (int) (jSONObject.optDouble("compressQuality") * 100.0d);
        frfVar.y = jSONObject.optInt("compressImageMinSide");
        frfVar.z = jSONObject.optInt("requestImageMinSide");
        String optString2 = jSONObject.optString("originImageEnable", "1");
        if ("1".equalsIgnoreCase(optString2) || "true".equalsIgnoreCase(optString2)) {
            i = 1;
        }
        frfVar.A = i;
        return frfVar;
    }
}
