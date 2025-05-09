package com.taobao.themis.open.ability.image;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import tb.a07;
import tb.bbs;
import tb.ckf;
import tb.h1p;
import tb.j8s;
import tb.t2o;
import tb.tsq;
import tb.ws4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J/\u0010\r\u001a\u00020\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/taobao/themis/open/ability/image/TMSImageBridge;", "Ltb/j8s;", "<init>", "()V", "Ltb/xhv;", "onInitialized", "onFinalized", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "bridgeCallback", "", "src", "getImageInfo", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;Ljava/lang/String;)V", "Companion", "a", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSImageBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "TMSImageBridge";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(843055226);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(843055225);
        t2o.a(839909427);
    }

    @Override // tb.j8s
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // tb.j8s
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
        if (tb.wsq.O(r5, r7, false, 2, null) != false) goto L_0x005e;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.fastjson.JSONObject a(java.io.InputStream r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            java.lang.String r3 = "up"
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.themis.open.ability.image.TMSImageBridge.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001b
            java.lang.String r3 = "ceb53b73"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r10
            r2[r0] = r11
            java.lang.Object r11 = r4.ipc$dispatch(r3, r2)
            com.alibaba.fastjson.JSONObject r11 = (com.alibaba.fastjson.JSONObject) r11
            return r11
        L_0x001b:
            com.alibaba.fastjson.JSONObject r4 = new com.alibaba.fastjson.JSONObject
            r4.<init>()
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
            r5.<init>()
            r5.inJustDecodeBounds = r0
            r0 = 0
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r11, r0, r5)
            int r7 = r5.outWidth
            int r8 = r5.outHeight
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r9 = "width"
            r4.put(r9, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            java.lang.String r8 = "height"
            r4.put(r8, r7)
            java.lang.String r5 = r5.outMimeType
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r8 = "type"
            if (r7 == 0) goto L_0x0052
            java.lang.String r5 = "unknown"
            goto L_0x007d
        L_0x0052:
            tb.ckf.f(r5, r8)
            java.lang.String r7 = "jpg"
            boolean r9 = tb.wsq.O(r5, r7, r1, r2, r0)
            if (r9 == 0) goto L_0x0060
        L_0x005e:
            r5 = r7
            goto L_0x007d
        L_0x0060:
            java.lang.String r7 = "png"
            boolean r9 = tb.wsq.O(r5, r7, r1, r2, r0)
            if (r9 == 0) goto L_0x006a
            goto L_0x005e
        L_0x006a:
            java.lang.String r7 = "gif"
            boolean r9 = tb.wsq.O(r5, r7, r1, r2, r0)
            if (r9 == 0) goto L_0x0073
            goto L_0x005e
        L_0x0073:
            java.lang.String r7 = "jpeg"
            boolean r1 = tb.wsq.O(r5, r7, r1, r2, r0)
            if (r1 == 0) goto L_0x007d
            goto L_0x005e
        L_0x007d:
            r4.put(r8, r5)
            androidx.exifinterface.media.ExifInterface r1 = new androidx.exifinterface.media.ExifInterface     // Catch: all -> 0x00a4
            r1.<init>(r11)     // Catch: all -> 0x00a4
            java.lang.String r11 = "Orientation"
            java.lang.String r11 = r1.getAttribute(r11)     // Catch: all -> 0x00a4
            if (r11 != 0) goto L_0x008e
            goto L_0x0096
        L_0x008e:
            int r11 = java.lang.Integer.parseInt(r11)     // Catch: all -> 0x00a4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch: all -> 0x00a4
        L_0x0096:
            if (r0 != 0) goto L_0x0099
            goto L_0x00a6
        L_0x0099:
            int r11 = r0.intValue()     // Catch: all -> 0x00a4
            r1 = 6
            if (r11 != r1) goto L_0x00a6
            java.lang.String r3 = "right"
            goto L_0x00d2
        L_0x00a4:
            r11 = move-exception
            goto L_0x00c2
        L_0x00a6:
            if (r0 != 0) goto L_0x00a9
            goto L_0x00b3
        L_0x00a9:
            int r11 = r0.intValue()     // Catch: all -> 0x00a4
            r1 = 3
            if (r11 != r1) goto L_0x00b3
            java.lang.String r3 = "down"
            goto L_0x00d2
        L_0x00b3:
            if (r0 != 0) goto L_0x00b6
            goto L_0x00d2
        L_0x00b6:
            int r11 = r0.intValue()     // Catch: all -> 0x00a4
            r0 = 8
            if (r11 != r0) goto L_0x00d2
            java.lang.String r3 = "left"
            goto L_0x00d2
        L_0x00c2:
            java.lang.String r0 = "parse image orientation info error : "
            java.lang.String r11 = r11.getMessage()
            java.lang.String r11 = tb.ckf.p(r0, r11)
            java.lang.String r0 = "getImageInfo"
            com.taobao.themis.kernel.basic.TMSLogger.b(r0, r11)
        L_0x00d2:
            java.lang.String r11 = "orientation"
            r4.put(r11, r3)
            if (r6 != 0) goto L_0x00db
            goto L_0x00de
        L_0x00db:
            r6.recycle()
        L_0x00de:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.ability.image.TMSImageBridge.a(java.io.InputStream):com.alibaba.fastjson.JSONObject");
    }

    @APIMethod
    public final void getImageInfo(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback, @BindingParam(name = {"src"}) String str) {
        Throwable th;
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceab0ef", new Object[]{this, apiContext, bridgeCallback, str});
            return;
        }
        ckf.g(bridgeCallback, "bridgeCallback");
        ckf.g(str, "src");
        if (TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "error", "src is empty");
            bridgeCallback.sendJSONResponse(jSONObject);
            return;
        }
        HttpURLConnection httpURLConnection = null;
        if (tsq.I(str, h1p.HTTPS_PREFIX, false, 2, null) || tsq.I(str, h1p.HTTP_PREFIX, false, 2, null) || tsq.I(str, "apml", false, 2, null)) {
            if ((apiContext == null ? null : apiContext.b()) == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                return;
            }
            try {
                if (tsq.I(str, "https://resource/", false, 2, null)) {
                    bbs b = apiContext.b();
                    ckf.d(b);
                    try {
                        FileInputStream fileInputStream = new FileInputStream(new File(ws4.b(TMSInstanceExtKt.f(b), str, null, 4, null)));
                        JSONObject a2 = a(fileInputStream);
                        a2.put((JSONObject) "success", "true");
                        a2.put((JSONObject) "path", str);
                        bridgeCallback.sendJSONResponse(a2);
                        fileInputStream.close();
                    } catch (Exception e2) {
                        TMSLogger.g(TAG, Log.getStackTraceString(e2));
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put((JSONObject) "error", "parse error!");
                        bridgeCallback.sendJSONResponse(jSONObject2);
                    }
                } else {
                    try {
                        URLConnection openConnection = new URL(str).openConnection();
                        if (openConnection != null) {
                            HttpURLConnection httpURLConnection2 = (HttpURLConnection) openConnection;
                            try {
                                httpURLConnection2.setRequestMethod("GET");
                                httpURLConnection2.setConnectTimeout(5000);
                                int responseCode = httpURLConnection2.getResponseCode();
                                if (responseCode == 200) {
                                    InputStream inputStream = httpURLConnection2.getInputStream();
                                    ckf.f(inputStream, "inputStream");
                                    JSONObject a3 = a(inputStream);
                                    a3.put((JSONObject) "success", "true");
                                    a3.put((JSONObject) "path", str);
                                    bridgeCallback.sendJSONResponse(a3);
                                    inputStream.close();
                                    httpURLConnection2.disconnect();
                                } else {
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put((JSONObject) "error", ckf.p("network error , code is ", Integer.valueOf(responseCode)));
                                    bridgeCallback.sendJSONResponse(jSONObject3);
                                }
                                httpURLConnection2.disconnect();
                            } catch (MalformedURLException unused) {
                                httpURLConnection = httpURLConnection2;
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put((JSONObject) "error", "url error");
                                bridgeCallback.sendJSONResponse(jSONObject4);
                                if (httpURLConnection == null) {
                                    return;
                                }
                                httpURLConnection.disconnect();
                            } catch (IOException unused2) {
                                httpURLConnection = httpURLConnection2;
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put((JSONObject) "error", "io error");
                                bridgeCallback.sendJSONResponse(jSONObject5);
                                if (httpURLConnection == null) {
                                    return;
                                }
                                httpURLConnection.disconnect();
                            } catch (Exception e3) {
                                e = e3;
                                httpURLConnection = httpURLConnection2;
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put((JSONObject) "error", ckf.p("unknown error : ", e.getMessage()));
                                bridgeCallback.sendJSONResponse(jSONObject6);
                                if (httpURLConnection == null) {
                                    return;
                                }
                                httpURLConnection.disconnect();
                            } catch (Throwable th2) {
                                th = th2;
                                httpURLConnection = httpURLConnection2;
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                throw th;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                        }
                    } catch (MalformedURLException unused3) {
                    } catch (IOException unused4) {
                    } catch (Exception e4) {
                        e = e4;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put((JSONObject) "error", "src is not support!");
            bridgeCallback.sendJSONResponse(jSONObject7);
        }
    }
}
