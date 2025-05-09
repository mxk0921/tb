package com.taobao.themis.canvas.canvas;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.themis.graphics.JNIBridge;
import com.taobao.themis.kernel.ability.TMSJSAPIHandler;
import com.taobao.themis.kernel.page.ITMSPage;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import tb.gbs;
import tb.t2o;
import tb.wi3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CanvasJSAPIBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static List<String> ARRAY_BUFFER_API_LIST;
    private volatile boolean mActive = true;
    private WeakReference<ITMSPage> mRenderRef;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements TMSJSAPIHandler.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f13467a;
        public final /* synthetic */ JNIBridge.h b;
        public final /* synthetic */ boolean c;

        public a(JSONObject jSONObject, JNIBridge.h hVar, boolean z) {
            this.f13467a = jSONObject;
            this.b = hVar;
            this.c = z;
        }

        @Override // com.taobao.themis.kernel.ability.TMSJSAPIHandler.c
        public void a(JSONObject jSONObject, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2885e1d1", new Object[]{this, jSONObject, bArr});
                return;
            }
            try {
                if (CanvasJSAPIBridge.access$000(CanvasJSAPIBridge.this)) {
                    this.f13467a.put("responseData", (Object) jSONObject);
                    this.b.c(this.f13467a, bArr, this.c);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override // com.taobao.themis.kernel.ability.TMSJSAPIHandler.c
        public void onCallBack(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99ed7a65", new Object[]{this, jSONObject});
                return;
            }
            try {
                if (CanvasJSAPIBridge.access$000(CanvasJSAPIBridge.this)) {
                    this.f13467a.put("responseData", (Object) jSONObject);
                    this.b.c(this.f13467a, null, this.c);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public CanvasJSAPIBridge(ITMSPage iTMSPage) {
        this.mRenderRef = new WeakReference<>(iTMSPage);
    }

    public static /* synthetic */ boolean access$000(CanvasJSAPIBridge canvasJSAPIBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("920b16a2", new Object[]{canvasJSAPIBridge})).booleanValue();
        }
        return canvasJSAPIBridge.mActive;
    }

    public JSONObject callAriverAPISync(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("edf8649d", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        ITMSPage iTMSPage = this.mRenderRef.get();
        if (iTMSPage == null || iTMSPage.getInstance().I() == null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("success", (Object) Boolean.FALSE);
            jSONObject2.put("responseData", (Object) jSONObject3);
            return jSONObject2;
        } else if (!this.mActive) {
            return jSONObject2;
        } else {
            String string = jSONObject.getString("callbackId");
            String string2 = jSONObject.getString("handlerName");
            JSONObject jSONObject4 = jSONObject.getJSONObject("data");
            if (jSONObject4 == null) {
                jSONObject4 = new JSONObject();
            }
            jSONObject2.put(wi3.ResponseId, (Object) string);
            jSONObject2.put("responseData", (Object) iTMSPage.z().callTMSAbilitySync(string2, jSONObject4));
            return jSONObject2;
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.mActive = false;
        }
    }

    public void callAriverAPI(JSONObject jSONObject, JNIBridge.h hVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beaad18f", new Object[]{this, jSONObject, hVar});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            ITMSPage iTMSPage = this.mRenderRef.get();
            if (!(this.mRenderRef == null || iTMSPage == null || iTMSPage.getInstance().I() == null)) {
                if (this.mActive) {
                    String string = jSONObject.getString("callbackId");
                    String string2 = jSONObject.getString("handlerName");
                    JSONObject jSONObject3 = jSONObject.getJSONObject("data");
                    if (jSONObject3 == null) {
                        jSONObject3 = new JSONObject();
                    }
                    jSONObject2.put(wi3.ResponseId, (Object) string);
                    JSONObject c = gbs.c(jSONObject, "data", null);
                    if (c != null && c.containsKey("keepAlive")) {
                        z = c.getBoolean("keepAlive").booleanValue();
                    }
                    iTMSPage.z().callTMSAbilityAsync(string2, jSONObject3, new a(jSONObject2, hVar, z));
                    return;
                }
                return;
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("success", (Object) Boolean.FALSE);
            jSONObject2.put("responseData", (Object) jSONObject4);
            hVar.c(jSONObject2, null, false);
        } catch (Throwable unused) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("success", (Object) Boolean.FALSE);
            jSONObject2.put("responseData", (Object) jSONObject5);
            try {
                hVar.a(jSONObject2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    static {
        t2o.a(834666505);
        ArrayList arrayList = new ArrayList();
        ARRAY_BUFFER_API_LIST = arrayList;
        arrayList.add("readFile");
    }
}
