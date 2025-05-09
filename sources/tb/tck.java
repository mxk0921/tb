package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class tck extends khj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DETECT_HEIGHT = 320;
    public static final int DETECT_WIDTH = 192;
    public float e;
    public float f;
    public String[] g;
    public int h;
    public int i;
    public float[][] j;
    public float[] k;
    public float[] l;
    public String m;

    static {
        t2o.a(482344996);
    }

    public tck(String str) {
        this.e = 0.3f;
        float f = 0.5f;
        this.f = 0.5f;
        this.h = DETECT_WIDTH;
        this.i = 320;
        this.f22670a = "object_detect";
        String e2 = lg4.e2(str, "");
        f();
        this.d = 0;
        if (!TextUtils.isEmpty(e2)) {
            c4p.C("自动识别", e2, new Object[0]);
            try {
                JSONObject parseObject = JSON.parseObject(e2);
                this.b = parseObject.getString("url");
                JSONArray jSONArray = parseObject.getJSONArray("anchors");
                JSONArray jSONArray2 = parseObject.getJSONArray("tensors");
                JSONArray jSONArray3 = parseObject.getJSONArray("norms");
                JSONArray jSONArray4 = parseObject.getJSONArray("means");
                o(jSONArray);
                r(jSONArray2);
                q(jSONArray3);
                p(jSONArray4);
                this.h = parseObject.getIntValue("detectWidth");
                this.i = parseObject.getIntValue("detectHeight");
                Float f2 = parseObject.getFloat("detThreshold");
                this.e = f2 == null ? 0.2f : f2.floatValue();
                Float f3 = parseObject.getFloat("detNmsThreshold");
                if (f3 != null) {
                    f = f3.floatValue();
                }
                this.f = f;
                this.c = parseObject.getString("md5");
            } catch (Exception unused) {
                f();
            }
        }
    }

    public static /* synthetic */ Object ipc$super(tck tckVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/model/ObjectDetectConfig");
    }

    @Override // tb.khj
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4213feae", new Object[]{this});
        }
        return this.m;
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
        return "6002";
    }

    @Override // tb.khj
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39216805", new Object[]{this});
        }
        return "object_detect";
    }

    public float[][] g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[][]) ipChange.ipc$dispatch("ddc6aeff", new Object[]{this});
        }
        return this.j;
    }

    public float h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("caacb02b", new Object[]{this})).floatValue();
        }
        return this.f;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb7de49a", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f112f1a7", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public float[] k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("4e9d80a2", new Object[]{this});
        }
        return this.l;
    }

    public float[] l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("bea10759", new Object[]{this});
        }
        return this.k;
    }

    public String[] m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("e833a49a", new Object[]{this});
        }
        return this.g;
    }

    public float n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ba8f7ac", new Object[]{this})).floatValue();
        }
        return this.e;
    }

    public final void o(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777e3a5a", new Object[]{this, jSONArray});
            return;
        }
        int size = jSONArray.size();
        int size2 = jSONArray.getJSONArray(0).size();
        this.j = (float[][]) Array.newInstance(Float.TYPE, size, size2);
        for (int i = 0; i < size; i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            for (int i2 = 0; i2 < size2; i2++) {
                this.j[i][i2] = jSONArray2.getFloatValue(i2);
            }
        }
    }

    public final void p(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2516c28a", new Object[]{this, jSONArray});
            return;
        }
        this.l = new float[jSONArray.size()];
        for (int i = 0; i < jSONArray.size(); i++) {
            this.l[i] = jSONArray.getFloatValue(i);
        }
    }

    public final void q(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a024f3", new Object[]{this, jSONArray});
            return;
        }
        this.k = new float[jSONArray.size()];
        for (int i = 0; i < jSONArray.size(); i++) {
            this.k[i] = jSONArray.getFloatValue(i);
        }
    }

    public final void r(JSONArray jSONArray) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5c736", new Object[]{this, jSONArray});
            return;
        }
        this.g = new String[jSONArray.size()];
        while (true) {
            String[] strArr = this.g;
            if (i < strArr.length) {
                strArr[i] = jSONArray.getString(i);
                i++;
            } else {
                return;
            }
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95a2ea69", new Object[]{this});
            return;
        }
        this.g = new String[]{"output_p3", "output_p4", "output_p5"};
        this.h = DETECT_WIDTH;
        this.i = 320;
        this.b = "https://files.alicdn.com/tpsservice/424912c59932fd011f24dc17a2cd92ce.zip";
        this.c = "05f400a84da1e359789ead2363b7f2b8";
        this.m = "OPVhtHNuV5Mu0O/TPNV8ZSF/1OHV0YACFek/JGOGVYtMAlcwBWOCbk/9Imgyr5+XOVSoXcjrwMUEo93MCeVGJD0yym1d06BAmz2oME6EipI=";
        this.e = 0.6f;
        this.f = 0.5f;
        this.j = new float[][]{new float[]{10.0f, 13.0f, 16.0f, 30.0f, 33.0f, 23.0f}, new float[]{30.0f, 61.0f, 62.0f, 45.0f, 59.0f, 119.0f}, new float[]{116.0f, 90.0f, 156.0f, 198.0f, 373.0f, 326.0f}};
        this.k = new float[]{0.003921569f, 0.003921569f, 0.003921569f};
        this.l = new float[]{0.0f, 0.0f, 0.0f};
    }
}
