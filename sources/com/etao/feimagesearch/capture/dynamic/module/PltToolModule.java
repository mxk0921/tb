package com.etao.feimagesearch.capture.dynamic.module;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ImageSearchMtopUtil;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.a07;
import tb.ckf;
import tb.gd2;
import tb.lg4;
import tb.pvh;
import tb.t2o;
import tb.z7m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class PltToolModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String MODULE_NAME = "TBPltToolModule";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481296652);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(481296651);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PltToolModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
        ckf.g(str, AliFestivalWVPlugin.PARAMS_MODULE_NAME);
    }

    public static /* synthetic */ Object ipc$super(PltToolModule pltToolModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/module/PltToolModule");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4658a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ pvh c;

        public b(String str, JSONObject jSONObject, pvh pvhVar) {
            this.f4658a = str;
            this.b = jSONObject;
            this.c = pvhVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Bitmap bitmap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String schemeSpecificPart = Uri.parse(this.f4658a).getSchemeSpecificPart();
            ckf.f(schemeSpecificPart, "parse(key).schemeSpecificPart");
            String substring = schemeSpecificPart.substring(2);
            ckf.f(substring, "this as java.lang.String).substring(startIndex)");
            Bitmap b = gd2.b(substring, false);
            if (b == null) {
                this.b.put((JSONObject) "isSuccess", (String) Boolean.FALSE);
                this.b.put((JSONObject) "errMsg", "LoadBitmapFailure");
                this.c.b(this.b);
                return;
            }
            try {
                bitmap = b.copy(b.getConfig(), true);
            } catch (OutOfMemoryError unused) {
                bitmap = null;
            }
            if (bitmap == null) {
                this.b.put((JSONObject) "isSuccess", (String) Boolean.FALSE);
                this.b.put((JSONObject) "errMsg", "CopyBitmapError");
                this.c.b(this.b);
                return;
            }
            String c = gd2.c(bitmap, Bitmap.CompressFormat.JPEG, 75);
            if (c == null) {
                c = "";
            }
            if (TextUtils.isEmpty(c)) {
                this.b.put((JSONObject) "isSuccess", (String) Boolean.FALSE);
                this.b.put((JSONObject) "errMsg", "EncodeBitmapFailure");
                this.c.b(this.b);
                return;
            }
            this.b.put((JSONObject) "isSuccess", (String) Boolean.TRUE);
            this.b.put((JSONObject) ImageSearchMtopUtil.KEY_IMG, c);
            this.b.put((JSONObject) "imgWidth", (String) Integer.valueOf(bitmap.getWidth()));
            this.b.put((JSONObject) "imgHeight", (String) Integer.valueOf(bitmap.getHeight()));
            this.c.b(this.b);
            bitmap.recycle();
        }
    }

    @MUSMethod
    public final void getChituConfigValue(String str, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f30e969a", new Object[]{this, str, pvhVar});
        } else if (pvhVar != null) {
            JSONObject jSONObject = new JSONObject();
            if (TextUtils.isEmpty(str)) {
                jSONObject.put((JSONObject) "value", "");
                pvhVar.b(jSONObject);
                return;
            }
            jSONObject.put((JSONObject) "value", lg4.Y1(str));
            pvhVar.b(jSONObject);
        }
    }

    @MUSMethod
    public final void getOrangeConfigValue(String str, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac09645", new Object[]{this, str, pvhVar});
        } else if (pvhVar != null) {
            JSONObject jSONObject = new JSONObject();
            if (TextUtils.isEmpty(str)) {
                jSONObject.put((JSONObject) "value", "");
                pvhVar.b(jSONObject);
                return;
            }
            jSONObject.put((JSONObject) "value", lg4.e2(str, ""));
            pvhVar.b(jSONObject);
        }
    }

    @MUSMethod
    public final void getRainbowConfigValue(String str, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("823fc269", new Object[]{this, str, pvhVar});
        } else if (pvhVar != null) {
            JSONObject jSONObject = new JSONObject();
            if (TextUtils.isEmpty(str)) {
                jSONObject.put((JSONObject) "value", "");
                pvhVar.b(jSONObject);
                return;
            }
            jSONObject.put((JSONObject) "value", lg4.d3(str));
            pvhVar.b(jSONObject);
        }
    }

    @MUSMethod
    public final void loadWeexCacheImg(String str, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd9a0f42", new Object[]{this, str, pvhVar});
        } else if (pvhVar != null) {
            JSONObject jSONObject = new JSONObject();
            if (str == null || TextUtils.isEmpty(str)) {
                jSONObject.put((JSONObject) "isSuccess", (String) Boolean.FALSE);
                jSONObject.put((JSONObject) "errMsg", "InvalidCacheKey");
                pvhVar.b(jSONObject);
                return;
            }
            z7m.c(new b(str, jSONObject, pvhVar));
        }
    }
}
