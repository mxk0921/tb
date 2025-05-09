package tb;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Vibrator;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.module.WeexInnerModule;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_framework.widget.FontDO;
import com.taobao.weex.ui.component.WXComponent;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bvw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INSTANCE_ID = "instanceId";
    public static final String LOG_TAG = "WXNativeApiModel";
    public static final String MSG_FAILED = "MUS_FAILED";
    public static final String MSG_SUCCESS = "MUS_SUCCESS";
    public static final String MUS = "com.taobao.android.intent.category.MUS";
    public static final String WEEX_POP_ID = "wx_popId";

    /* renamed from: a  reason: collision with root package name */
    public static final Object f16666a = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f4x f16667a;
        public final /* synthetic */ String b;

        public a(f4x f4xVar, String str) {
            this.f16667a = f4xVar;
            this.b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            f4x f4xVar = this.f16667a;
            if (f4xVar != null) {
                f4xVar.b(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f4x f16668a;
        public final /* synthetic */ String b;

        public b(f4x f4xVar, String str) {
            this.f16668a = f4xVar;
            this.b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            f4x f4xVar = this.f16668a;
            if (f4xVar != null) {
                f4xVar.b(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f4x f16671a;
        public final /* synthetic */ String b;

        public e(f4x f4xVar, String str) {
            this.f16671a = f4xVar;
            this.b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            f4x f4xVar = this.f16671a;
            if (f4xVar != null) {
                f4xVar.b(this.b);
            }
        }
    }

    static {
        t2o.a(982516120);
    }

    public static void a(WeexInnerModule weexInnerModule, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f3afcc", new Object[]{weexInnerModule, str, jSONObject});
            return;
        }
        tvh adapterMUSInstance = ((WeexInstanceImpl) weexInnerModule.getWeexInstance()).getAdapterMUSInstance();
        if (adapterMUSInstance != null && !adapterMUSInstance.isDestroyed() && TextUtils.equals("fontFace", str)) {
            if (adapterMUSInstance.getInstanceConfig() == null || adapterMUSInstance.getInstanceConfig().d() != MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn) {
                FontDO g = g(jSONObject, adapterMUSInstance);
                if (g != null && !TextUtils.isEmpty(g.b())) {
                    synchronized (f16666a) {
                        try {
                            FontDO e2 = pu9.g().e(g.b());
                            if (e2 != null && TextUtils.equals(e2.f(), g.f())) {
                                pu9.g().j(e2, true);
                            }
                            pu9.g().l(g);
                            pu9.g().j(g, true);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            }
            adapterMUSInstance.registerCSSRule(str, jSONObject);
        }
    }

    public static JSONObject e(WeexInnerModule weexInnerModule, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1127b190", new Object[]{weexInnerModule, str});
        }
        tvh adapterMUSInstance = ((WeexInstanceImpl) weexInnerModule.getWeexInstance()).getAdapterMUSInstance();
        FutureTask futureTask = new FutureTask(new f(str, adapterMUSInstance));
        adapterMUSInstance.postTaskToMain(futureTask);
        try {
            return (JSONObject) futureTask.get(500L, TimeUnit.MILLISECONDS);
        } catch (Throwable unused) {
            dwh.e("nativeApi.getGlobalVisibleRect err: timeout");
            return null;
        }
    }

    public static FontDO g(JSONObject jSONObject, MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FontDO) ipChange.ipc$dispatch("83abfde2", new Object[]{jSONObject, mUSDKInstance});
        }
        if (jSONObject == null) {
            return null;
        }
        return new FontDO(jSONObject.getString("fontFamily"), jSONObject.getString("src"), mUSDKInstance);
    }

    public static void h(WeexInnerModule weexInnerModule, String str, f4x f4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7d2b26", new Object[]{weexInnerModule, str, f4xVar});
        } else {
            yuw.a(weexInnerModule.getWeexInstance(), str, f4xVar);
        }
    }

    public static void i(WeexInnerModule weexInnerModule, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("affb259e", new Object[]{weexInnerModule, str, jSONObject});
            return;
        }
        Intent intent = new Intent(str);
        for (String str2 : jSONObject.keySet()) {
            intent.putExtra(str2, jSONObject.getString(str2));
        }
        LocalBroadcastManager.getInstance(weexInnerModule.getWeexInstance().getContext()).sendBroadcast(intent);
        try {
            WVStandardEventCenter.postNotificationToJS(str, jSONObject.toJSONString());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void l(WeexInnerModule weexInnerModule, String str, f4x f4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f2cb09", new Object[]{weexInnerModule, str, f4xVar});
        } else {
            yuw.b(weexInnerModule.getWeexInstance(), str, f4xVar);
        }
    }

    public static void n(WeexInnerModule weexInnerModule, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d72596b", new Object[]{weexInnerModule, num});
        } else if (weexInnerModule.getWeexInstance().getContext() != null) {
            ((Vibrator) weexInnerModule.getWeexInstance().getContext().getSystemService("vibrator")).vibrate(num.intValue());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f4x f16669a;
        public final /* synthetic */ String b;
        public final /* synthetic */ EditText c;

        public c(f4x f4xVar, String str, EditText editText) {
            this.f16669a = f4xVar;
            this.b = str;
            this.c = editText;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else if (this.f16669a != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", (Object) this.b);
                jSONObject.put("data", (Object) this.c.getText().toString());
                this.f16669a.b(jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f4x f16670a;
        public final /* synthetic */ String b;
        public final /* synthetic */ EditText c;

        public d(f4x f4xVar, String str, EditText editText) {
            this.f16670a = f4xVar;
            this.b = str;
            this.c = editText;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else if (this.f16670a != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", (Object) this.b);
                jSONObject.put("data", (Object) this.c.getText().toString());
                this.f16670a.b(jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class f implements Callable<JSONObject> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16672a;
        public final /* synthetic */ MUSDKInstance b;

        public f(String str, MUSDKInstance mUSDKInstance) {
            this.f16672a = str;
            this.b = mUSDKInstance;
        }

        /* renamed from: a */
        public JSONObject call() throws Exception {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            Rect globalVisibleRect;
            View attachedView;
            int i8 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("31a17705", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            if (WXComponent.ROOT.equals(this.f16672a)) {
                View renderRoot = this.b.getRenderRoot();
                int measuredWidth = renderRoot.getMeasuredWidth();
                int measuredHeight = renderRoot.getMeasuredHeight();
                int[] iArr = new int[2];
                renderRoot.getLocationOnScreen(iArr);
                i6 = iArr[0];
                i7 = iArr[1];
                i5 = i6 + measuredWidth;
                i = i7 + measuredHeight;
                i2 = measuredHeight;
                i3 = measuredWidth;
                i4 = 0;
            } else {
                try {
                    INode findNodeById = this.b.findNodeById(Integer.parseInt(this.f16672a));
                    if (findNodeById == null || (globalVisibleRect = findNodeById.getGlobalVisibleRect()) == null || (attachedView = findNodeById.getAttachedView()) == null) {
                        return null;
                    }
                    int[] iArr2 = new int[2];
                    attachedView.getLocationOnScreen(iArr2);
                    int i9 = iArr2[0] + globalVisibleRect.left;
                    i7 = iArr2[1] + globalVisibleRect.top;
                    int right = findNodeById.getRight() - findNodeById.getLeft();
                    int bottom = findNodeById.getBottom() - findNodeById.getTop();
                    i5 = i9 + right;
                    i = i7 + bottom;
                    int left = findNodeById.getLeft();
                    i4 = findNodeById.getTop();
                    i6 = i9;
                    i8 = left;
                    i2 = bottom;
                    i3 = right;
                } catch (NumberFormatException e) {
                    dwh.h("nativeApi.getGlobalVisibleRect err: ref format not a number", e);
                    return null;
                }
            }
            float m = fxh.m(this.b.getUIContext(), i6);
            float m2 = fxh.m(this.b.getUIContext(), i7);
            float m3 = fxh.m(this.b.getUIContext(), i3);
            float m4 = fxh.m(this.b.getUIContext(), i2);
            float m5 = fxh.m(this.b.getUIContext(), i5);
            float m6 = fxh.m(this.b.getUIContext(), i);
            float m7 = fxh.m(this.b.getUIContext(), i8);
            float m8 = fxh.m(this.b.getUIContext(), i4);
            jSONObject.put("x", (Object) Float.valueOf(m));
            jSONObject.put("y", (Object) Float.valueOf(m2));
            jSONObject.put("left", (Object) Float.valueOf(m));
            jSONObject.put("top", (Object) Float.valueOf(m2));
            jSONObject.put("right", (Object) Float.valueOf(m5));
            jSONObject.put("bottom", (Object) Float.valueOf(m6));
            jSONObject.put("width", (Object) Float.valueOf(m3));
            jSONObject.put("height", (Object) Float.valueOf(m4));
            jSONObject.put("relativeX", (Object) Float.valueOf(m7));
            jSONObject.put("relativeY", (Object) Float.valueOf(m8));
            return jSONObject;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(com.taobao.android.weex.module.WeexInnerModule r6, com.alibaba.fastjson.JSONObject r7, tb.f4x r8, tb.egl<android.app.Dialog> r9) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.bvw.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001b
            java.lang.String r2 = "bd6fe24a"
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r6
            r6 = 1
            r3[r6] = r7
            r6 = 2
            r3[r6] = r8
            r6 = 3
            r3[r6] = r9
            r1.ipc$dispatch(r2, r3)
            return
        L_0x001b:
            com.taobao.android.weex.WeexInstance r1 = r6.getWeexInstance()
            android.content.Context r1 = r1.getContext()
            boolean r1 = r1 instanceof android.app.Activity
            java.lang.String r2 = "WXNativeApiModel"
            if (r1 == 0) goto L_0x0081
            java.lang.String r1 = "OK"
            java.lang.String r3 = ""
            if (r7 == 0) goto L_0x0049
            java.lang.String r4 = "message"
            java.lang.String r4 = r7.getString(r4)     // Catch: Exception -> 0x0040
            java.lang.String r5 = "okTitle"
            java.lang.String r7 = r7.getString(r5)     // Catch: Exception -> 0x003e
            goto L_0x004b
        L_0x003e:
            r7 = move-exception
            goto L_0x0042
        L_0x0040:
            r7 = move-exception
            r4 = r3
        L_0x0042:
            java.lang.String r5 = "alert param parse error "
            tb.dwh.g(r2, r5, r7)
            r7 = r1
            goto L_0x004b
        L_0x0049:
            r7 = r1
            r4 = r3
        L_0x004b:
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r3 = r4
        L_0x0053:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            com.taobao.android.weex.WeexInstance r6 = r6.getWeexInstance()
            android.content.Context r6 = r6.getContext()
            r2.<init>(r6)
            r2.setMessage(r3)
            boolean r6 = android.text.TextUtils.isEmpty(r7)
            if (r6 == 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r1 = r7
        L_0x006b:
            tb.bvw$e r6 = new tb.bvw$e
            r6.<init>(r8, r1)
            r2.setPositiveButton(r1, r6)
            android.app.AlertDialog r6 = r2.create()
            r6.setCanceledOnTouchOutside(r0)
            r6.show()
            r9.c(r6)
            goto L_0x0087
        L_0x0081:
            java.lang.String r6 = "when call alert mWXSDKInstance.getContext() must instanceof Activity"
            tb.dwh.f(r2, r6)
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bvw.b(com.taobao.android.weex.module.WeexInnerModule, com.alibaba.fastjson.JSONObject, tb.f4x, tb.egl):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(com.taobao.android.weex.module.WeexInnerModule r8, com.alibaba.fastjson.JSONObject r9, tb.f4x r10, tb.egl<android.app.Dialog> r11) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.bvw.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001b
            java.lang.String r2 = "d33802ae"
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r8
            r8 = 1
            r3[r8] = r9
            r8 = 2
            r3[r8] = r10
            r8 = 3
            r3[r8] = r11
            r1.ipc$dispatch(r2, r3)
            return
        L_0x001b:
            com.taobao.android.weex.WeexInstance r1 = r8.getWeexInstance()
            android.content.Context r1 = r1.getContext()
            boolean r1 = r1 instanceof android.app.Activity
            java.lang.String r2 = "WXNativeApiModel"
            if (r1 == 0) goto L_0x009e
            java.lang.String r1 = "Cancel"
            java.lang.String r3 = "OK"
            java.lang.String r4 = ""
            if (r9 == 0) goto L_0x0055
            java.lang.String r5 = "message"
            java.lang.String r5 = r9.getString(r5)     // Catch: Exception -> 0x004b
            java.lang.String r6 = "okTitle"
            java.lang.String r6 = r9.getString(r6)     // Catch: Exception -> 0x0048
            java.lang.String r7 = "cancelTitle"
            java.lang.String r9 = r9.getString(r7)     // Catch: Exception -> 0x0046
            goto L_0x0058
        L_0x0046:
            r9 = move-exception
            goto L_0x004e
        L_0x0048:
            r9 = move-exception
            r6 = r3
            goto L_0x004e
        L_0x004b:
            r9 = move-exception
            r6 = r3
            r5 = r4
        L_0x004e:
            java.lang.String r7 = "confirm param parse error "
            tb.dwh.g(r2, r7, r9)
            r9 = r1
            goto L_0x0058
        L_0x0055:
            r9 = r1
            r6 = r3
            r5 = r4
        L_0x0058:
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r4 = r5
        L_0x0060:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            com.taobao.android.weex.WeexInstance r8 = r8.getWeexInstance()
            android.content.Context r8 = r8.getContext()
            r2.<init>(r8)
            r2.setMessage(r4)
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r3 = r6
        L_0x0078:
            boolean r8 = android.text.TextUtils.isEmpty(r9)
            if (r8 == 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r1 = r9
        L_0x0080:
            tb.bvw$a r8 = new tb.bvw$a
            r8.<init>(r10, r3)
            r2.setPositiveButton(r3, r8)
            tb.bvw$b r8 = new tb.bvw$b
            r8.<init>(r10, r1)
            r2.setNegativeButton(r1, r8)
            android.app.AlertDialog r8 = r2.create()
            r8.setCanceledOnTouchOutside(r0)
            r8.show()
            r11.c(r8)
            goto L_0x00a4
        L_0x009e:
            java.lang.String r8 = "when call confirm mWXSDKInstance.getContext() must instanceof Activity"
            tb.dwh.f(r2, r8)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bvw.d(com.taobao.android.weex.module.WeexInnerModule, com.alibaba.fastjson.JSONObject, tb.f4x, tb.egl):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void j(com.taobao.android.weex.module.WeexInnerModule r9, com.alibaba.fastjson.JSONObject r10, tb.f4x r11, tb.egl<android.app.Dialog> r12) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.bvw.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001b
            java.lang.String r2 = "325ea852"
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r9
            r9 = 1
            r3[r9] = r10
            r9 = 2
            r3[r9] = r11
            r9 = 3
            r3[r9] = r12
            r1.ipc$dispatch(r2, r3)
            return
        L_0x001b:
            com.taobao.android.weex.WeexInstance r1 = r9.getWeexInstance()
            android.content.Context r1 = r1.getContext()
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L_0x00be
            java.lang.String r1 = "Cancel"
            java.lang.String r2 = "OK"
            java.lang.String r3 = ""
            if (r10 == 0) goto L_0x0060
            java.lang.String r4 = "message"
            java.lang.String r4 = r10.getString(r4)     // Catch: Exception -> 0x0053
            java.lang.String r5 = "okTitle"
            java.lang.String r5 = r10.getString(r5)     // Catch: Exception -> 0x004f
            java.lang.String r6 = "cancelTitle"
            java.lang.String r6 = r10.getString(r6)     // Catch: Exception -> 0x004c
            java.lang.String r7 = "default"
            java.lang.String r10 = r10.getString(r7)     // Catch: Exception -> 0x004a
            goto L_0x0064
        L_0x004a:
            r10 = move-exception
            goto L_0x0057
        L_0x004c:
            r10 = move-exception
            r6 = r1
            goto L_0x0057
        L_0x004f:
            r10 = move-exception
            r6 = r1
            r5 = r2
            goto L_0x0057
        L_0x0053:
            r10 = move-exception
            r6 = r1
            r5 = r2
            r4 = r3
        L_0x0057:
            java.lang.String r7 = "WXNativeApiModel"
            java.lang.String r8 = "confirm param parse error "
            tb.dwh.g(r7, r8, r10)
            r10 = r3
            goto L_0x0064
        L_0x0060:
            r6 = r1
            r5 = r2
            r10 = r3
            r4 = r10
        L_0x0064:
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            if (r7 == 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r3 = r4
        L_0x006c:
            android.app.AlertDialog$Builder r4 = new android.app.AlertDialog$Builder
            com.taobao.android.weex.WeexInstance r7 = r9.getWeexInstance()
            android.content.Context r7 = r7.getContext()
            r4.<init>(r7)
            r4.setMessage(r3)
            android.widget.EditText r3 = new android.widget.EditText
            com.taobao.android.weex.WeexInstance r9 = r9.getWeexInstance()
            android.content.Context r9 = r9.getContext()
            r3.<init>(r9)
            r3.setText(r10)
            r4.setView(r3)
            boolean r9 = android.text.TextUtils.isEmpty(r5)
            if (r9 == 0) goto L_0x0096
            goto L_0x0097
        L_0x0096:
            r2 = r5
        L_0x0097:
            boolean r9 = android.text.TextUtils.isEmpty(r6)
            if (r9 == 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r1 = r6
        L_0x009f:
            tb.bvw$d r9 = new tb.bvw$d
            r9.<init>(r11, r2, r3)
            android.app.AlertDialog$Builder r9 = r4.setPositiveButton(r2, r9)
            tb.bvw$c r10 = new tb.bvw$c
            r10.<init>(r11, r1, r3)
            r9.setNegativeButton(r1, r10)
            android.app.AlertDialog r9 = r4.create()
            r9.setCanceledOnTouchOutside(r0)
            r9.show()
            r12.c(r9)
            goto L_0x00c4
        L_0x00be:
            java.lang.String r9 = "when call prompt mWXSDKInstance.getContext() must instanceof Activity"
            tb.dwh.e(r9)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bvw.j(com.taobao.android.weex.module.WeexInnerModule, com.alibaba.fastjson.JSONObject, tb.f4x, tb.egl):void");
    }

    public static void c(WeexInnerModule weexInnerModule, JSONObject jSONObject, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5091fdd7", new Object[]{weexInnerModule, jSONObject, f4xVar, f4xVar2});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (weexInnerModule.getWeexInstance().getContext() instanceof Activity) {
            ((Activity) weexInnerModule.getWeexInstance().getContext()).finish();
        } else {
            jSONObject2.put("result", (Object) "MUS_FAILED");
            jSONObject2.put("message", (Object) "Close page failed.");
            f4xVar = f4xVar2;
        }
        if (f4xVar != null) {
            f4xVar.b(jSONObject2);
        }
    }

    public static void f(WeexInnerModule weexInnerModule, JSONObject jSONObject, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d0ca7c5", new Object[]{weexInnerModule, jSONObject, f4xVar2, f4xVar2});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("url");
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(string)) {
                Uri parse = Uri.parse(string);
                String scheme = parse.getScheme();
                if (TextUtils.isEmpty(scheme) || "http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    k(weexInnerModule, jSONObject.toJSONString(), f4xVar2);
                } else {
                    try {
                        weexInnerModule.getWeexInstance().getContext().startActivity(new Intent("android.intent.action.VIEW", parse));
                        jSONObject2.put("result", (Object) "MUS_SUCCESS");
                    } catch (Throwable th) {
                        dwh.h(LOG_TAG, th);
                        jSONObject2.put("result", (Object) "MUS_FAILED");
                        jSONObject2.put("message", (Object) "Open page failed.");
                        f4xVar2 = f4xVar2;
                    }
                }
            } else {
                jSONObject2.put("result", (Object) "MUS_PARAM_ERR");
                jSONObject2.put("message", (Object) "The URL parameter is empty.");
            }
            if (f4xVar2 != null) {
                f4xVar2.b(jSONObject2);
            }
        }
    }

    public static void k(WeexInnerModule weexInnerModule, String str, f4x f4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e0166f", new Object[]{weexInnerModule, str, f4xVar});
            return;
        }
        WeexInstance weexInstance = weexInnerModule.getWeexInstance();
        if (!TextUtils.isEmpty(str)) {
            if (r3x.j() == null || !r3x.j().a(weexInnerModule.getWeexInstance().getContext(), ((WeexInstanceImpl) weexInnerModule.getWeexInstance()).getAdapterMUSInstance(), str)) {
                try {
                    String string = JSON.parseObject(str).getString("url");
                    if (!TextUtils.isEmpty(string)) {
                        Uri parse = Uri.parse(string);
                        String scheme = parse.getScheme();
                        Uri.Builder buildUpon = parse.buildUpon();
                        if (TextUtils.isEmpty(scheme)) {
                            buildUpon.scheme("http");
                        }
                        Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
                        intent.addCategory("com.taobao.android.intent.category.MUS");
                        intent.putExtra("instanceId", weexInstance.getInstanceId());
                        weexInstance.getContext().startActivity(intent);
                        if (f4xVar != null) {
                            f4xVar.b("MUS_SUCCESS");
                        }
                    }
                } catch (Exception e2) {
                    dwh.h(LOG_TAG, e2);
                    if (f4xVar != null) {
                        f4xVar.b("MUS_FAILED");
                    }
                }
            } else if (f4xVar != null) {
                f4xVar.b("MUS_SUCCESS");
            }
        } else if (f4xVar != null) {
            f4xVar.b("MUS_FAILED");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m(com.taobao.android.weex.module.WeexInnerModule r6, com.alibaba.fastjson.JSONObject r7) {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "duration"
            com.android.alibaba.ip.runtime.IpChange r3 = tb.bvw.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0017
            java.lang.String r2 = "308d812c"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            r4[r0] = r7
            r3.ipc$dispatch(r2, r4)
            return
        L_0x0017:
            com.taobao.android.weex.WeexInstance r3 = r6.getWeexInstance()
            android.content.Context r3 = r3.getContext()
            if (r3 != 0) goto L_0x0022
            return
        L_0x0022:
            java.lang.String r3 = "WXNativeApiModel"
            java.lang.String r4 = ""
            if (r7 == 0) goto L_0x0044
            java.lang.String r5 = "message"
            java.lang.String r4 = r7.getString(r5)     // Catch: Exception -> 0x003e
            boolean r5 = r7.containsKey(r2)     // Catch: Exception -> 0x003e
            if (r5 == 0) goto L_0x0044
            java.lang.Integer r7 = r7.getInteger(r2)     // Catch: Exception -> 0x003e
            int r7 = r7.intValue()     // Catch: Exception -> 0x003e
            goto L_0x0045
        L_0x003e:
            r7 = move-exception
            java.lang.String r2 = "alert param parse error "
            tb.dwh.g(r3, r2, r7)
        L_0x0044:
            r7 = 0
        L_0x0045:
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto L_0x0052
            java.lang.String r6 = "toast param parse is null "
            tb.dwh.f(r3, r6)
            return
        L_0x0052:
            r2 = 3
            if (r7 <= r2) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            com.taobao.android.weex.WeexInstance r6 = r6.getWeexInstance()
            android.content.Context r6 = r6.getContext()
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r4, r0)
            r6.setDuration(r0)
            r6.setText(r4)
            r7 = 17
            r6.setGravity(r7, r1, r1)
            r6.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bvw.m(com.taobao.android.weex.module.WeexInnerModule, com.alibaba.fastjson.JSONObject):void");
    }
}
