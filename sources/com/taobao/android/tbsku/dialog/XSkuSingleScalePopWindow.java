package com.taobao.android.tbsku.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.AliXSkuCore;
import com.taobao.android.tbsku.preview.ImagePreview;
import com.taobao.taobao.R;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.b3q;
import tb.bt8;
import tb.pr0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class XSkuSingleScalePopWindow {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public bt8 f9590a;
    public ImagePreview b;
    public AliXSkuCore c;
    public JSONObject d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements DialogInterface.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            } else {
                XSkuSingleScalePopWindow.e(XSkuSingleScalePopWindow.this);
            }
        }
    }

    static {
        t2o.a(785383511);
    }

    public XSkuSingleScalePopWindow(Context context, b3q b3qVar, JSONArray jSONArray, pr0 pr0Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("icon", (Object) b3qVar.f16160a);
        jSONObject.put("title", (Object) b3qVar.b);
        jSONObject.put("pvId", (Object) b3qVar.c);
        g(context);
        f(context, jSONObject, jSONArray, pr0Var);
    }

    public static /* synthetic */ bt8 a(XSkuSingleScalePopWindow xSkuSingleScalePopWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bt8) ipChange.ipc$dispatch("490374d", new Object[]{xSkuSingleScalePopWindow});
        }
        return xSkuSingleScalePopWindow.f9590a;
    }

    public static /* synthetic */ JSONObject b(XSkuSingleScalePopWindow xSkuSingleScalePopWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("df9e0fcf", new Object[]{xSkuSingleScalePopWindow});
        }
        return xSkuSingleScalePopWindow.d;
    }

    public static /* synthetic */ JSONObject c(XSkuSingleScalePopWindow xSkuSingleScalePopWindow, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d8be6aff", new Object[]{xSkuSingleScalePopWindow, jSONObject});
        }
        xSkuSingleScalePopWindow.d = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ void d(XSkuSingleScalePopWindow xSkuSingleScalePopWindow, JSONObject jSONObject, int i, pr0 pr0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c857928", new Object[]{xSkuSingleScalePopWindow, jSONObject, new Integer(i), pr0Var});
        } else {
            xSkuSingleScalePopWindow.i(jSONObject, i, pr0Var);
        }
    }

    public static /* synthetic */ void e(XSkuSingleScalePopWindow xSkuSingleScalePopWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be4d0b1", new Object[]{xSkuSingleScalePopWindow});
        } else {
            xSkuSingleScalePopWindow.h();
        }
    }

    public final void f(Context context, JSONObject jSONObject, JSONArray jSONArray, pr0 pr0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60175757", new Object[]{this, context, jSONObject, jSONArray, pr0Var});
            return;
        }
        this.c = pr0Var.c();
        this.d = jSONObject;
        ImagePreview imagePreview = new ImagePreview(context, jSONObject, jSONArray);
        this.b = imagePreview;
        imagePreview.j(new a(pr0Var));
    }

    public final void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("196ab850", new Object[]{this, context});
            return;
        }
        bt8 bt8Var = new bt8(context, R.style.Alix_Sku_PopupDialog_ImagePreview);
        this.f9590a = bt8Var;
        bt8Var.setOnDismissListener(new b());
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5985ef7", new Object[]{this});
        } else {
            this.c.Z(new JSONObject() { // from class: com.taobao.android.tbsku.dialog.XSkuSingleScalePopWindow.3
                {
                    put("action", "dart_curtain_close");
                }
            });
        }
    }

    public final void i(JSONObject jSONObject, int i, pr0 pr0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd47312", new Object[]{this, jSONObject, new Integer(i), pr0Var});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            String string = jSONObject.getString("viewId");
            if (!TextUtils.isEmpty(string)) {
                pr0Var.b().put(string, Integer.valueOf((int) (((i / 6) * 348.5f) - 1.0f)));
            }
            pr0Var.c().Z(new JSONObject(jSONObject) { // from class: com.taobao.android.tbsku.dialog.XSkuSingleScalePopWindow.2
                public final /* synthetic */ JSONObject val$selected;

                {
                    this.val$selected = jSONObject;
                    put("action", "pv_sku_update");
                    put("params", (Object) jSONObject);
                }
            });
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            this.f9590a.b(this.b.d(), -1, -1, 80);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ImagePreview.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pr0 f9591a;

        public a(pr0 pr0Var) {
            this.f9591a = pr0Var;
        }

        @Override // com.taobao.android.tbsku.preview.ImagePreview.a
        public void a(JSONObject jSONObject, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4184af4", new Object[]{this, jSONObject, new Integer(i)});
                return;
            }
            XSkuSingleScalePopWindow.c(XSkuSingleScalePopWindow.this, jSONObject);
            XSkuSingleScalePopWindow.d(XSkuSingleScalePopWindow.this, jSONObject, i, this.f9591a);
        }

        @Override // com.taobao.android.tbsku.preview.ImagePreview.a
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            try {
                if (XSkuSingleScalePopWindow.a(XSkuSingleScalePopWindow.this) != null && XSkuSingleScalePopWindow.a(XSkuSingleScalePopWindow.this).isShowing()) {
                    XSkuSingleScalePopWindow.a(XSkuSingleScalePopWindow.this).dismiss();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // com.taobao.android.tbsku.preview.ImagePreview.a
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            if (this.f9591a == null) {
                AdapterForTLog.loge("[share]SKULightOff", "onLongClick:feedback null");
                return false;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("actionFrom", (Object) "IMG_PREVIEW_LONG_CLK");
            jSONObject.put("image", (Object) XSkuSingleScalePopWindow.b(XSkuSingleScalePopWindow.this));
            jSONObject.put("dialog", (Object) XSkuSingleScalePopWindow.a(XSkuSingleScalePopWindow.this));
            this.f9591a.h(jSONObject);
            return true;
        }
    }

    public XSkuSingleScalePopWindow(Context context, JSONObject jSONObject, JSONArray jSONArray, pr0 pr0Var) {
        g(context);
        f(context, jSONObject, jSONArray, pr0Var);
    }
}
