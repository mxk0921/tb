package com.etao.feimagesearch.capture.dynamic.bean;

import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.utils.ProductDataHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.pipline.node.ImageDetectNode;
import com.taobao.weex.common.Constants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.URLDecoder;
import java.util.Map;
import tb.bme;
import tb.bql;
import tb.cke;
import tb.fke;
import tb.h19;
import tb.l63;
import tb.nme;
import tb.t2o;
import tb.v7m;
import tb.w7m;
import tb.wne;
import tb.wxi;
import tb.yy1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DynCaptureImgGotConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;

    /* renamed from: a  reason: collision with root package name */
    public v7m f4633a = null;
    public l63 c = null;

    /* compiled from: Taobao */
    @Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public @interface AlbumSupportMediaType {
    }

    static {
        t2o.a(481296502);
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a285740", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str) && "image".equals(str)) {
            return "image";
        }
        return "all";
    }

    public l63 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l63) ipChange.ipc$dispatch("16aab0d7", new Object[]{this});
        }
        return this.c;
    }

    public v7m f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v7m) ipChange.ipc$dispatch("2177f0fe", new Object[]{this});
        }
        return this.f4633a;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7720c390", new Object[]{this})).booleanValue();
        }
        return "all".equals(this.b);
    }

    public void i(l63 l63Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48f2aecb", new Object[]{this, l63Var});
        } else {
            this.c = l63Var;
        }
    }

    public void j(v7m v7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0f3d54", new Object[]{this, v7mVar});
        } else {
            this.f4633a = v7mVar;
        }
    }

    public static DynCaptureImgGotConfig b(JSONObject jSONObject, l63 l63Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynCaptureImgGotConfig) ipChange.ipc$dispatch("ec2e5e80", new Object[]{jSONObject, l63Var});
        }
        if (jSONObject == null) {
            return null;
        }
        DynCaptureImgGotConfig dynCaptureImgGotConfig = new DynCaptureImgGotConfig();
        dynCaptureImgGotConfig.i(l63Var);
        dynCaptureImgGotConfig.b = h(h19.i(jSONObject, "mediaType", "all"));
        v7m v7mVar = new v7m(new w7m());
        bme bmeVar = new bme();
        v7m.c(v7m.c(a(v7m.c(null, bmeVar), h19.i(jSONObject, "checkProcessor", "")), new wne(true, true, null, (int) (h19.f(jSONObject, "compressionQuality", 0.7f) * 100.0f), h19.g(jSONObject, Constants.Name.MAX_LENGTH, 640), null)), new nme("", "", "", false));
        v7mVar.i(bmeVar, false);
        dynCaptureImgGotConfig.j(v7mVar);
        return dynCaptureImgGotConfig;
    }

    public static DynCaptureImgGotConfig c(JSONObject jSONObject, l63 l63Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynCaptureImgGotConfig) ipChange.ipc$dispatch("90b69e23", new Object[]{jSONObject, l63Var});
        }
        if (jSONObject == null) {
            return null;
        }
        String i = h19.i(jSONObject, "cropRect", "[0f,1.0f,0f,1.0f]");
        if (!i.startsWith("[")) {
            i = "[" + i + "]";
        }
        RectF a2 = cke.a(i);
        if (a2 == null) {
            return null;
        }
        DynCaptureImgGotConfig dynCaptureImgGotConfig = new DynCaptureImgGotConfig();
        dynCaptureImgGotConfig.i(l63Var);
        v7m v7mVar = new v7m(new w7m());
        fke fkeVar = new fke(a2);
        v7m.c(v7m.c(a(v7m.c(null, fkeVar), h19.i(jSONObject, "checkProcessor", "")), new wne(true, true, null, (int) (h19.f(jSONObject, "compressionQuality", 0.7f) * 100.0f), h19.g(jSONObject, Constants.Name.MAX_LENGTH, 640), null)), new nme("", "", "", false));
        v7mVar.i(fkeVar, false);
        dynCaptureImgGotConfig.j(v7mVar);
        return dynCaptureImgGotConfig;
    }

    public static DynCaptureImgGotConfig d(JSONObject jSONObject, l63 l63Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynCaptureImgGotConfig) ipChange.ipc$dispatch("62ec967e", new Object[]{jSONObject, l63Var});
        }
        if (jSONObject == null) {
            return null;
        }
        String i = h19.i(jSONObject, "routerUrl", "");
        if (TextUtils.isEmpty(i)) {
            return null;
        }
        DynCaptureImgGotConfig dynCaptureImgGotConfig = new DynCaptureImgGotConfig();
        dynCaptureImgGotConfig.i(l63Var);
        w7m w7mVar = new w7m();
        Map<String, String> e = bql.e(Uri.parse(i));
        w7mVar.H(e);
        v7m v7mVar = new v7m(w7mVar);
        try {
            str = URLDecoder.decode(e.get(wxi.KEY_PIC_URL), "UTF-8");
        } catch (Exception unused) {
            str = "";
        }
        w7mVar.G(Uri.parse(str));
        bme bmeVar = new bme();
        v7m.c(v7m.c(a(v7m.c(null, bmeVar), h19.i(jSONObject, "checkProcessor", "")), new wne(true, true, null, (int) (h19.f(jSONObject, "compressionQuality", 0.7f) * 100.0f), h19.g(jSONObject, Constants.Name.MAX_LENGTH, 640), null)), new nme("", "", "", false));
        v7mVar.i(bmeVar, false);
        dynCaptureImgGotConfig.j(v7mVar);
        return dynCaptureImgGotConfig;
    }

    public static yy1 a(yy1 yy1Var, String str) {
        boolean z;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yy1) ipChange.ipc$dispatch("2ad6e722", new Object[]{yy1Var, str});
        }
        if (TextUtils.isEmpty(str)) {
            return yy1Var;
        }
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(",");
            int length = split.length;
            int i2 = 0;
            z = false;
            while (i < length) {
                String str2 = split[i];
                if (ProductDataHelper.VAL_PRODUCT_FACE.equals(str2)) {
                    i2 = 1;
                } else if ("watermark".equals(str2)) {
                    z = true;
                }
                i++;
            }
            i = i2;
        } else {
            z = false;
        }
        return (i != 0 || z) ? v7m.c(yy1Var, new ImageDetectNode(z, z)) : yy1Var;
    }
}
