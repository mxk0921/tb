package tb;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class o0i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean b;
    public int c;
    public String d;
    public String e;
    public int g;
    public boolean i;
    public final Context k;
    public boolean l;
    public boolean m;
    public boolean n;

    /* renamed from: a  reason: collision with root package name */
    public int f25065a = 400;
    public boolean f = true;
    public int h = -1;
    public float j = -1.0f;

    static {
        t2o.a(352322146);
    }

    public o0i(Context context) {
        this.k = context;
        this.c = ec7.a(context, 38.0f) / 2;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68a47a4f", new Object[]{this, str});
        }
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(c);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("236d4c76", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.m = "true".equals(jSONObject.getString("enableMainAutoSlide"));
            this.l = "true".equals(jSONObject.getString("gestureInteractiveOptimize"));
            this.n = "true".equals(jSONObject.getString("enableImageHeightScale"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("mainPicContainer");
            if (jSONObject2 != null) {
                String string = jSONObject2.getString("autoScrollGap");
                if (!TextUtils.isEmpty(string)) {
                    Integer.parseInt(string);
                }
                "false".equals(jSONObject2.getString("enableAutoScroll"));
                String string2 = jSONObject2.getString("autoScrollDuration");
                if (!TextUtils.isEmpty(string2)) {
                    this.f25065a = Integer.parseInt(string2);
                }
                this.b = "true".equals(jSONObject2.getString("enableImagePullLeftTips"));
                String string3 = jSONObject2.getString("imagePullLeftDistance");
                if (!TextUtils.isEmpty(string3)) {
                    int parseInt = Integer.parseInt(string3);
                    this.c = parseInt;
                    this.c = ec7.a(this.k, parseInt) / 2;
                }
                String string4 = jSONObject2.getString("imagePullLeftDragText");
                this.d = string4;
                this.d = a(string4);
                String string5 = jSONObject2.getString("imagePullLeftReleaseText");
                this.e = string5;
                this.e = a(string5);
                String string6 = jSONObject2.getString("enableBlurImage");
                if (!TextUtils.isEmpty(string6)) {
                    this.f = true ^ "false".equals(string6);
                }
                String string7 = jSONObject2.getString("bottomAreaBasic");
                if (!TextUtils.isEmpty(string7)) {
                    this.g = Integer.parseInt(string7);
                }
                this.i = "true".equals(jSONObject2.getString("enableBlurMask"));
                String string8 = jSONObject2.getString("blurMaskColor");
                String string9 = jSONObject2.getString("blurMaskAlpha");
                if (string8 != null) {
                    try {
                        this.h = Color.parseColor(string8);
                    } catch (Exception e) {
                        txj.f(txj.TAG_RENDER, "blurMask解析异常", e);
                        return;
                    }
                }
                if (string9 != null) {
                    this.j = Float.parseFloat(string9);
                }
            }
        }
    }
}
