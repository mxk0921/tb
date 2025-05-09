package com.taobao.android.weex_framework.module.builtin;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.module.WeexInnerModule;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import tb.hxh;
import tb.q6x;
import tb.qvh;
import tb.t2o;
import tb.vvh;
import tb.yio;
import tb.zbf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WXDevModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String[] METHODS = {"getInstanceLocationOnScreen", "switchForceThemis", "getSnapshotByElementId"};
    public static final String NAME = "weexdebug";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXDevModule$1");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WXDevModule.this.switchForceThemis();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements q6x.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeexInstanceImpl f9971a;

        public b(WeexInstanceImpl weexInstanceImpl) {
            this.f9971a = weexInstanceImpl;
        }

        @Override // tb.q6x.b
        public void a(Bitmap bitmap, int i, int i2, double d, double d2, double d3, double d4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f6d3284", new Object[]{this, bitmap, new Integer(i), new Integer(i2), new Double(d), new Double(d2), new Double(d3), new Double(d4)});
                return;
            }
            WXDevModule wXDevModule = WXDevModule.this;
            Context context = this.f9971a.getContext();
            wXDevModule.saveImageToGallery(context, bitmap, System.currentTimeMillis() + "");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ FutureTask d;

        public d(FutureTask futureTask) {
            this.d = futureTask;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXDevModule$4");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                this.d.run();
            }
        }
    }

    public static /* synthetic */ Object ipc$super(WXDevModule wXDevModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXDevModule");
    }

    public JSONObject getInstanceLocationOnScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("38b9052", new Object[]{this});
        }
        FutureTask futureTask = new FutureTask(new c());
        hxh.d(new d(futureTask));
        try {
            return (JSONObject) futureTask.get(Constants.STARTUP_TIME_LEVEL_1, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
            return null;
        }
    }

    public void saveImageToGallery(Context context, Bitmap bitmap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f9547d0", new Object[]{this, context, bitmap, str});
            return;
        }
        OutputStream outputStream = null;
        try {
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", str + ".jpg");
                    contentValues.put("mime_type", "image/jpeg");
                    contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
                    Uri insert = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                    if (insert != null) {
                        outputStream = context.getContentResolver().openOutputStream(insert);
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream);
                        outputStream.flush();
                        context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", insert));
                    }
                } catch (Throwable th) {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                if (outputStream != null) {
                    outputStream.close();
                } else {
                    return;
                }
            }
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Callable<JSONObject> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public JSONObject call() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("31a17705", new Object[]{this});
            }
            View rootView = WXDevModule.this.getWeexInstance().getRootView();
            if (!rootView.isAttachedToWindow()) {
                return null;
            }
            int[] iArr = new int[2];
            rootView.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("x", (Object) Integer.valueOf(iArr[0]));
            jSONObject.put("y", (Object) Integer.valueOf(iArr[1]));
            jSONObject.put("width", (Object) Integer.valueOf(rootView.getWidth()));
            jSONObject.put("height", (Object) Integer.valueOf(rootView.getHeight()));
            return jSONObject;
        }
    }

    public void switchForceThemis() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5ab6544", new Object[]{this});
        } else if (vvh.m() || zbf.a()) {
            Boolean bool = qvh.f26956a;
            if (bool == null) {
                qvh.f26956a = Boolean.TRUE;
            } else {
                qvh.f26956a = Boolean.valueOf(true ^ bool.booleanValue());
            }
            Context context = getWeexInstance().getContext();
            if (qvh.f26956a.booleanValue()) {
                str = "开";
            } else {
                str = "关";
            }
            Toast.makeText(context, "强制使用Themis: ".concat(str), 0).show();
        }
    }

    static {
        t2o.a(982516112);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r9.equals("switchForceThemis") == false) goto L_0x002d;
     */
    @Override // com.taobao.android.weex.module.WeexInnerModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.weex.WeexValue callModuleMethod(com.taobao.android.weex.WeexInstanceImpl r7, java.lang.String r8, java.lang.String r9, com.taobao.android.weex.WeexValue[] r10) throws java.lang.Exception {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.weex_framework.module.builtin.WXDevModule.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0021
            java.lang.String r4 = "ffafd8f7"
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r7 = 3
            r5[r7] = r9
            r7 = 4
            r5[r7] = r10
            java.lang.Object r7 = r3.ipc$dispatch(r4, r5)
            com.taobao.android.weex.WeexValue r7 = (com.taobao.android.weex.WeexValue) r7
            return r7
        L_0x0021:
            r9.hashCode()
            r8 = 0
            r3 = -1
            int r4 = r9.hashCode()
            switch(r4) {
                case -1153004794: goto L_0x0044;
                case -1099581909: goto L_0x0039;
                case -260716739: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            r0 = -1
            goto L_0x004e
        L_0x002f:
            java.lang.String r4 = "switchForceThemis"
            boolean r9 = r9.equals(r4)
            if (r9 != 0) goto L_0x004e
            goto L_0x002d
        L_0x0039:
            java.lang.String r0 = "getInstanceLocationOnScreen"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0042
            goto L_0x002d
        L_0x0042:
            r0 = 1
            goto L_0x004e
        L_0x0044:
            java.lang.String r0 = "getSnapshotByElementId"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x004d
            goto L_0x002d
        L_0x004d:
            r0 = 0
        L_0x004e:
            switch(r0) {
                case 0: goto L_0x0064;
                case 1: goto L_0x005b;
                case 2: goto L_0x0052;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x005a
        L_0x0052:
            com.taobao.android.weex_framework.module.builtin.WXDevModule$a r7 = new com.taobao.android.weex_framework.module.builtin.WXDevModule$a
            r7.<init>()
            r6.executeInMain(r7)
        L_0x005a:
            return r8
        L_0x005b:
            com.alibaba.fastjson.JSONObject r7 = r6.getInstanceLocationOnScreen()
            com.taobao.android.weex.WeexValueImpl r7 = com.taobao.android.weex.WeexValueImpl.ofJSON(r7)
            return r7
        L_0x0064:
            com.taobao.android.weex.WeexValue r9 = r6.getArg(r10, r2)
            java.lang.String r9 = r9.toStringValueOrNull()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.taobao.android.weex.WeexValue r10 = r6.getArg(r10, r1)
            java.lang.String r10 = r10.toStringValue()
            java.lang.String r1 = "isLongScreenShot"
            r0.put(r1, r10)
            java.lang.Class<tb.q6x> r10 = tb.q6x.class
            java.lang.Object r10 = r7.getExtend(r10)
            tb.q6x r10 = (tb.q6x) r10
            com.taobao.android.weex_framework.module.builtin.WXDevModule$b r1 = new com.taobao.android.weex_framework.module.builtin.WXDevModule$b
            r1.<init>(r7)
            r10.i(r9, r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_framework.module.builtin.WXDevModule.callModuleMethod(com.taobao.android.weex.WeexInstanceImpl, java.lang.String, java.lang.String, com.taobao.android.weex.WeexValue[]):com.taobao.android.weex.WeexValue");
    }
}
