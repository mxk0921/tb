package com.alibaba.ability.impl.barcode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.taobao.scancode.v2.result.MaResult;
import com.taobao.taobao.scancode.v2.result.MaType;
import java.nio.charset.Charset;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.cu;
import tb.eji;
import tb.jpu;
import tb.kdb;
import tb.kts;
import tb.t2o;
import tb.v3i;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class BarCodeAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_DECODE_QR = "decodeQR";
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final eji f1928a = new eji("QR-DECODE", 3);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(99614722);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(99614721);
    }

    public static final /* synthetic */ eji access$getDecodeScheduler$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eji) ipChange.ipc$dispatch("95a9212", new Object[0]);
        }
        return f1928a;
    }

    public static /* synthetic */ Object ipc$super(BarCodeAbility barCodeAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/barcode/BarCodeAbility");
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        if (str.hashCode() != 570808463 || !str.equals(API_DECODE_QR)) {
            return ErrorResult.a.Companion.a("能力没找到");
        }
        String w = MegaUtils.w(map, "imageData", "");
        if (w == null || w.length() == 0) {
            vqVar.b(ErrorResult.a.Companion.g("imageData 为空"));
            return null;
        }
        eji.j(f1928a, new b(w, vqVar), 0L, null, 6, null);
        return null;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f1929a;
        public final /* synthetic */ vq b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.this.b.b(new ErrorResult("DecodeError", "没有可用识别结果", (Map) null, 4, (a07) null));
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.ability.impl.barcode.BarCodeAbility$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class RunnableC0044b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ JSONObject b;

            public RunnableC0044b(JSONObject jSONObject) {
                this.b = jSONObject;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.this.b.a(new FinishResult(this.b, "onSuccess"));
                }
            }
        }

        public b(String str, vq vqVar) {
            this.f1929a = str;
            this.b = vqVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String str = this.f1929a;
            Charset forName = Charset.forName("utf-8");
            ckf.f(forName, "Charset.forName(charsetName)");
            if (str != null) {
                byte[] bytes = str.getBytes(forName);
                ckf.f(bytes, "(this as java.lang.String).getBytes(charset)");
                byte[] decode = Base64.decode(bytes, 2);
                ckf.f(decode, "byteArray");
                if (decode.length == 0) {
                    this.b.b(ErrorResult.a.Companion.g("byteArray 为空"));
                    return;
                }
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                if (decodeByteArray == null) {
                    this.b.b(ErrorResult.a.Companion.g("bitmap 为空"));
                    return;
                }
                MaResult[] a2 = kts.a(decodeByteArray);
                JSONArray jSONArray = new JSONArray();
                if (!(a2 == null || a2.length == 0)) {
                    for (MaResult maResult : a2) {
                        ckf.f(maResult, AdvanceSetting.NETWORK_TYPE);
                        if (maResult.getType() == MaType.QR) {
                            String text = maResult.getText();
                            if (text == null) {
                                text = "unknown";
                            }
                            jSONArray.add(new JSONObject(v3i.f(jpu.a("code", text))));
                        }
                    }
                }
                if (jSONArray.isEmpty()) {
                    MegaUtils.A(new a(), 0L, 2, null);
                } else {
                    MegaUtils.A(new RunnableC0044b(new JSONObject(v3i.f(jpu.a("result", jSONArray)))), 0L, 2, null);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
    }
}
