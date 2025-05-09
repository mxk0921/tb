package android.taobao.windvane.jsbridge.api;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.view.PopupWindowController;
import android.taobao.windvane.webview.IWVWebView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.message_open_api.ICallService;
import com.taobao.weex.common.Constants;
import java.io.File;
import java.io.FileOutputStream;
import org.json.JSONArray;
import tb.dqw;
import tb.gl4;
import tb.hzl;
import tb.itw;
import tb.kpw;
import tb.nsw;
import tb.og8;
import tb.opw;
import tb.oqw;
import tb.ql7;
import tb.qqw;
import tb.t2o;
import tb.t4p;
import tb.v7t;
import tb.voe;
import tb.vpw;
import tb.wpw;
import tb.x74;
import tb.xyl;
import tb.y71;
import tb.yaa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVCamera extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOCAL_IMAGE = "//127.0.0.1/wvcache/photo.jpg?_wvcrc=1&t=";
    private static final String TAG = "WVCamera";
    private g mParams;
    private PopupWindowController mPopupController;
    private android.taobao.windvane.jsbridge.api.b uploadService;
    public static int maxLength = 1024;
    private static String uploadServiceClass = null;
    private static String multiActivityClass = null;
    private WVCallBackContext mCallback = null;
    private String mLocalPath = null;
    private long lastAccess = 0;
    private boolean useCN = false;
    private String[] mPopupMenuTags = {"拍照", "从相册选择"};
    public View.OnClickListener popupClickListener = new e();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f1791a;
        public final /* synthetic */ String b;

        public a(WVCallBackContext wVCallBackContext, String str) {
            this.f1791a = wVCallBackContext;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            WVCamera.access$002(WVCamera.this, true);
            WVCamera.this.takePhoto(this.f1791a, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f1792a;
        public final /* synthetic */ String b;

        public b(WVCallBackContext wVCallBackContext, String str) {
            this.f1792a = wVCallBackContext;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            WVCamera.access$102(WVCamera.this, true);
            WVCamera.this.takePhoto(this.f1792a, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WVCamera.access$200(WVCamera.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WVCamera.access$300(WVCamera.this);
            }
        }
    }

    static {
        t2o.a(989856259);
    }

    public static /* synthetic */ boolean access$002(WVCamera wVCamera, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3075c942", new Object[]{wVCamera, new Boolean(z)})).booleanValue();
        }
        wVCamera.isAlive = z;
        return z;
    }

    public static /* synthetic */ boolean access$102(WVCamera wVCamera, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59ca1e83", new Object[]{wVCamera, new Boolean(z)})).booleanValue();
        }
        wVCamera.isAlive = z;
        return z;
    }

    public static /* synthetic */ void access$200(WVCamera wVCamera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f3f3cd6", new Object[]{wVCamera});
        } else {
            wVCamera.openCamaraInternal();
        }
    }

    public static /* synthetic */ void access$300(WVCamera wVCamera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995abb75", new Object[]{wVCamera});
        } else {
            wVCamera.chosePhotoInternal();
        }
    }

    public static /* synthetic */ PopupWindowController access$400(WVCamera wVCamera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindowController) ipChange.ipc$dispatch("6dbe58ff", new Object[]{wVCamera});
        }
        return wVCamera.mPopupController;
    }

    public static /* synthetic */ String[] access$500(WVCamera wVCamera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("8645e5c2", new Object[]{wVCamera});
        }
        return wVCamera.mPopupMenuTags;
    }

    public static /* synthetic */ void access$600(WVCamera wVCamera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ad3752", new Object[]{wVCamera});
        } else {
            wVCamera.openCamara();
        }
    }

    public static /* synthetic */ void access$700(WVCamera wVCamera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c8b5f1", new Object[]{wVCamera});
        } else {
            wVCamera.chosePhoto();
        }
    }

    public static /* synthetic */ WVCallBackContext access$800(WVCamera wVCamera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("ffb61b83", new Object[]{wVCamera});
        }
        return wVCamera.mCallback;
    }

    public static /* synthetic */ void access$900(WVCamera wVCamera, String str, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545a7faf", new Object[]{wVCamera, str, gVar});
        } else {
            wVCamera.takePhotoSuccess(str, gVar);
        }
    }

    private void chosePhotoInternal() {
        int i;
        Intent intent;
        IWVWebView iWVWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1addb6fa", new Object[]{this});
            return;
        }
        wpw wpwVar = vpw.commonConfig;
        if (!(!wpwVar.O1 || (iWVWebView = this.mWebView) == null || this.mParams == null)) {
            String url = iWVWebView.getUrl();
            g gVar = this.mParams;
            reportJSAPIParams("takePhoto", url, gVar.j, gVar.i);
        }
        v7t.a(TAG, "start to pick photo from system album.");
        if (!"1".equals(this.mParams.j)) {
            intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            i = 4002;
        } else if (wpwVar.R1) {
            nsw nswVar = new nsw();
            nswVar.b("msg", "mutipleSelection is disabled.");
            WVCallBackContext wVCallBackContext = this.mCallback;
            if (wVCallBackContext != null) {
                wVCallBackContext.error(nswVar);
                return;
            }
            return;
        } else if (!this.mContext.getPackageName().equals("com.taobao.taobao")) {
            nsw nswVar2 = new nsw();
            nswVar2.b("msg", "mutipleSelection only support in taobao!");
            WVCallBackContext wVCallBackContext2 = this.mCallback;
            if (wVCallBackContext2 != null) {
                wVCallBackContext2.error(nswVar2);
                return;
            }
            return;
        } else {
            intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setPackage(this.mContext.getPackageName());
            intent.setData(Uri.parse("taobao://go/ImgFileListActivity"));
            intent.putExtra("maxSelect", this.mParams.k);
            i = 4003;
        }
        Context context = this.mContext;
        if (context instanceof Activity) {
            try {
                ((Activity) context).startActivityForResult(intent, i);
                Intent intent2 = new Intent("WVCameraFilter");
                intent2.putExtra("from-webview-id", this.mWebView.hashCode());
                LocalBroadcastManager.getInstance(yaa.n).sendBroadcast(intent2);
            } catch (Throwable th) {
                th.printStackTrace();
                nsw nswVar3 = new nsw();
                nswVar3.j("ERROR_STARTACTIVITY");
                nswVar3.b("msg", "ERROR_STARTACTIVITY");
                WVCallBackContext wVCallBackContext3 = this.mCallback;
                if (wVCallBackContext3 != null) {
                    wVCallBackContext3.error(nswVar3);
                }
            }
        }
    }

    public static /* synthetic */ Object ipc$super(WVCamera wVCamera, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVCamera");
    }

    private boolean isHasCamaraPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8d10e8b", new Object[]{this})).booleanValue();
        }
        try {
            Camera.open().release();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private void openCamara() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77106e12", new Object[]{this});
        } else if (!this.mParams.q || !vpw.commonConfig.t0) {
            openCamaraInternal();
        } else {
            requestCameraPermission(new c(), new dqw(this.mCallback, "NO_PERMISSION"));
        }
    }

    public static void registerMultiActivity(Class<? extends Activity> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a903a131", new Object[]{cls});
        } else if (cls != null) {
            multiActivityClass = cls.getName();
        }
    }

    public static void registerMultiActivityName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59368041", new Object[]{str});
        } else if (str != null) {
            multiActivityClass = str;
        }
    }

    public static void registerUploadService(Class<? extends android.taobao.windvane.jsbridge.api.b> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cdbc6a5", new Object[]{cls});
        } else if (cls != null) {
            uploadServiceClass = cls.getName();
        }
    }

    private void reportJSAPIParams(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac09dc72", new Object[]{this, str, str2, str3, str4});
        } else if (vpw.commonConfig.O1) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) str2);
            jSONObject.put("apiName", (Object) str);
            jSONObject.put("mode", (Object) str4);
            jSONObject.put("multiSelection", (Object) str3);
            y71.commitSuccess("takePhoto", jSONObject.toJSONString());
        }
    }

    private void requestCameraPermission(Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c429686", new Object[]{this, runnable, runnable2});
        } else if (runnable != null && runnable2 != null) {
            try {
                hzl.b(this.mContext, new String[]{t4p.CAMERA}).i(runnable).h(runnable2).d();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x011c A[Catch: all -> 0x005c, TryCatch #5 {all -> 0x005c, blocks: (B:7:0x0026, B:9:0x002c, B:23:0x005f, B:25:0x0065, B:27:0x0070, B:28:0x0073, B:31:0x0081, B:33:0x009e, B:35:0x00a2, B:37:0x00a8, B:39:0x00bb, B:48:0x00fb, B:49:0x0108, B:51:0x011c, B:52:0x011f), top: B:65:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void zoomPicAndCallback(java.lang.String r12, java.lang.String r13, android.taobao.windvane.jsbridge.api.WVCamera.g r14) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.jsbridge.api.WVCamera.zoomPicAndCallback(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.api.WVCamera$g):void");
    }

    public void takePhotoPlus(WVCallBackContext wVCallBackContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a031fd", new Object[]{this, wVCallBackContext, str, str2});
        } else if (wVCallBackContext == null || str == null || str2 == null) {
            v7t.d(TAG, "takePhotoPlus fail, params error");
        } else {
            initTakePhoto(wVCallBackContext, str2);
            this.mLocalPath = str;
            zoomPicAndCallback(str, str, this.mParams);
        }
    }

    public void upload(g gVar) {
        String str;
        if (this.uploadService == null && (str = uploadServiceClass) != null) {
            try {
                Class<?> cls = Class.forName(str);
                if (android.taobao.windvane.jsbridge.api.b.class.isAssignableFrom(cls)) {
                    android.taobao.windvane.jsbridge.api.b bVar = (android.taobao.windvane.jsbridge.api.b) cls.newInstance();
                    this.uploadService = bVar;
                    bVar.initialize(this.mContext, this.mWebView);
                }
            } catch (Exception e2) {
                v7t.d(TAG, "create upload service error: " + uploadServiceClass + ". " + e2.getMessage());
            }
        }
        android.taobao.windvane.jsbridge.api.b bVar2 = this.uploadService;
        if (bVar2 != null) {
            bVar2.doUpload(gVar, this.mCallback);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            WVCamera.access$400(WVCamera.this).f(true);
            nsw nswVar = new nsw();
            if (WVCamera.access$500(WVCamera.this)[0].equals(view.getTag())) {
                WVCamera.access$600(WVCamera.this);
            } else if (WVCamera.access$500(WVCamera.this)[1].equals(view.getTag())) {
                WVCamera.access$700(WVCamera.this);
            } else {
                nswVar.b("msg", "CANCELED_BY_USER");
                v7t.n(WVCamera.TAG, "take photo cancel, and callback.");
                if (WVCamera.access$800(WVCamera.this) != null) {
                    WVCamera.access$800(WVCamera.this).error(nswVar);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f1796a;
        public final /* synthetic */ oqw b;
        public final /* synthetic */ String c;
        public final /* synthetic */ g d;

        public f(Bitmap bitmap, oqw oqwVar, String str, g gVar) {
            this.f1796a = bitmap;
            this.b = oqwVar;
            this.c = str;
            this.d = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            FileOutputStream fileOutputStream;
            Throwable th;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            nsw nswVar = new nsw();
            if (this.f1796a != null) {
                opw.e().i(this.b, new byte[]{0});
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        fileOutputStream = new FileOutputStream(new File(opw.e().b(true), this.b.c));
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                    }
                } catch (Exception unused) {
                }
                try {
                    this.f1796a.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    Bitmap bitmap = this.f1796a;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        this.f1796a.recycle();
                    }
                    try {
                        fileOutputStream.close();
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    fileOutputStream2 = fileOutputStream;
                    v7t.d(WVCamera.TAG, "fail to create bitmap file");
                    nswVar.b("msg", "fail to create bitmap file");
                    nswVar.j("CREATE_BITMAP_ERROR");
                    if (WVCamera.access$800(WVCamera.this) != null) {
                        WVCamera.access$800(WVCamera.this).error(nswVar);
                    }
                    Bitmap bitmap2 = this.f1796a;
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        this.f1796a.recycle();
                    }
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                            return;
                        } catch (Exception unused4) {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    Bitmap bitmap3 = this.f1796a;
                    if (bitmap3 != null && !bitmap3.isRecycled()) {
                        this.f1796a.recycle();
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception unused5) {
                        }
                    }
                    throw th;
                }
            }
            WVCamera.access$900(WVCamera.this, this.c, this.d);
            nswVar.k();
            nswVar.b("url", this.d.b);
            nswVar.b(gl4.CONFIG_LOCAL_PATH, this.c);
            v7t.a(WVCamera.TAG, "url:" + this.d.b + " localPath:" + this.c);
            WVCamera.access$800(WVCamera.this).fireEvent("WVPhoto.Event.takePhotoSuccess", nswVar.m());
        }
    }

    private void openCamaraInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac1f276f", new Object[]{this});
        } else if (isHasCamaraPermission()) {
            v7t.a(TAG, "start to open system camera.");
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            g gVar = this.mParams;
            gVar.b = "//127.0.0.1/wvcache/photo.jpg?_wvcrc=1&t=" + System.currentTimeMillis();
            String b2 = opw.e().b(true);
            if (b2 != null) {
                File file = new File(b2);
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.mLocalPath = b2 + File.separator + ql7.c(this.mParams.b);
                Uri c2 = qqw.c(this.mContext, new File(this.mLocalPath));
                if (c2 == null) {
                    nsw nswVar = new nsw();
                    nswVar.b("msg", "image uri is null,check provider auth");
                    nswVar.j("CAMERA_OPEN_ERROR");
                    WVCallBackContext wVCallBackContext = this.mCallback;
                    if (wVCallBackContext != null) {
                        wVCallBackContext.error(nswVar);
                        return;
                    }
                    return;
                }
                intent.putExtra("output", c2);
                intent.putExtra("from", this.mWebView.hashCode());
                Context context = this.mContext;
                if (context instanceof Activity) {
                    try {
                        ((Activity) context).startActivityForResult(intent, 4001);
                    } catch (ActivityNotFoundException e2) {
                        v7t.d(TAG, "activity not found " + x74.i(e2));
                    }
                }
                Intent intent2 = new Intent("WVCameraFilter");
                intent2.putExtra("from-webview-id", this.mWebView.hashCode());
                LocalBroadcastManager.getInstance(yaa.n).sendBroadcast(intent2);
            } else if (this.mCallback != null) {
                nsw nswVar2 = new nsw();
                nswVar2.b("msg", "NO_CACHEDIR");
                nswVar2.j("CAMERA_OPEN_ERROR");
                this.mCallback.error(nswVar2);
            }
        } else if (this.mCallback != null) {
            nsw nswVar3 = new nsw();
            nswVar3.b("msg", "NO_PERMISSION");
            this.mCallback.error(nswVar3);
        }
    }

    private void takePhotoSuccess(String str, g gVar) {
        Bitmap c2;
        Bitmap c3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbe749f", new Object[]{this, str, gVar});
        } else if (gVar.c == 1) {
            String b2 = opw.e().b(true);
            if (str == null || b2 == null || !str.startsWith(b2)) {
                nsw nswVar = new nsw();
                nswVar.j("PIC_PATH_ERROR");
                nswVar.b("msg", "PIC_PATH_ERROR");
                WVCallBackContext wVCallBackContext = this.mCallback;
                if (wVCallBackContext != null) {
                    wVCallBackContext.error(nswVar);
                    return;
                }
                return;
            }
            gVar.f1797a = str;
            upload(gVar);
        } else {
            nsw nswVar2 = new nsw();
            nswVar2.k();
            if (!"1".equals(gVar.j)) {
                nswVar2.b("url", gVar.b);
                nswVar2.b(gl4.CONFIG_LOCAL_PATH, str);
                if (gVar.p && (c2 = voe.c(str, 1024)) != null) {
                    nswVar2.b("base64Data", itw.a(c2));
                }
                v7t.a(TAG, "url:" + gVar.b + " localPath:" + str);
                this.mCallback.success(nswVar2);
            } else if (gVar.l) {
                JSONArray jSONArray = gVar.o;
                if (jSONArray == null) {
                    nswVar2.b("url", gVar.b);
                    nswVar2.b(gl4.CONFIG_LOCAL_PATH, str);
                    if (gVar.p && (c3 = voe.c(str, 1024)) != null) {
                        nswVar2.b("base64Data", itw.a(c3));
                    }
                } else {
                    nswVar2.c("images", jSONArray);
                }
                this.mCallback.success(nswVar2);
            } else {
                return;
            }
            if (v7t.h()) {
                v7t.a(TAG, "pic not upload and call success, retString: " + nswVar2.m());
            }
        }
    }

    public synchronized void confirmUploadPhoto(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e01eaf9f", new Object[]{this, wVCallBackContext, str});
            return;
        }
        this.mCallback = wVCallBackContext;
        g gVar = new g(this);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            String string = jSONObject.getString("path");
            gVar.h = jSONObject.optString("identifier");
            gVar.d = jSONObject.optString("v");
            gVar.e = jSONObject.optString("bizCode");
            gVar.g = jSONObject.optJSONObject("extraInfo");
            String b2 = opw.e().b(true);
            if (string == null || b2 == null || !string.startsWith(b2)) {
                wVCallBackContext.error(new nsw("HY_PARAM_ERR"));
            } else {
                gVar.f1797a = string;
                upload(gVar);
            }
        } catch (Exception e2) {
            v7t.d(TAG, "confirmUploadPhoto fail, params: " + str);
            nsw nswVar = new nsw();
            nswVar.j("HY_PARAM_ERR");
            nswVar.b("msg", "PARAM_ERROR :" + e2.getMessage());
            wVCallBackContext.error(nswVar);
        }
    }

    private void chosePhoto() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c90b89d", new Object[]{this});
            return;
        }
        if (this.mParams.q) {
            wpw wpwVar = vpw.commonConfig;
            if (wpwVar.t0) {
                if (!wpwVar.Q1 || Build.VERSION.SDK_INT < 34) {
                    hzl.b(this.mContext, Build.VERSION.SDK_INT >= 33 ? new String[]{xyl.READ_MEDIA_IMAGES, xyl.READ_MEDIA_VIDEO} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"}).i(new d()).h(new dqw(this.mCallback, "NO_PERMISSION")).d();
                    return;
                }
                v7t.d(TAG, "don't request any permission above android 14.");
                chosePhotoInternal();
                return;
            }
        }
        chosePhotoInternal();
    }

    private void initTakePhoto(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50892409", new Object[]{this, wVCallBackContext, str});
        } else if (this.isAlive) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.lastAccess;
            this.lastAccess = currentTimeMillis;
            if (j < 1000) {
                v7t.n(TAG, "takePhoto, call this method too frequent,  " + j);
                return;
            }
            this.mCallback = wVCallBackContext;
            this.mParams = new g(this);
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                this.mParams.c = jSONObject.optInt("type", 1);
                this.mParams.i = jSONObject.optString("mode");
                this.mParams.d = jSONObject.optString("v");
                this.mParams.e = jSONObject.optString("bizCode");
                this.mParams.f = jSONObject.optString("extraData");
                this.mParams.g = jSONObject.optJSONObject("extraInfo");
                this.mParams.h = jSONObject.optString("identifier");
                this.mParams.k = jSONObject.optInt("maxSelect");
                this.mParams.j = jSONObject.optString("mutipleSelection");
                this.mParams.m = jSONObject.optBoolean("needZoom", true);
                g gVar = this.mParams;
                gVar.l = true;
                gVar.n = jSONObject.optBoolean(ICallService.KEY_NEED_LOGIN, false);
                this.mParams.p = jSONObject.optBoolean("needBase64", false);
                this.mParams.q = jSONObject.optBoolean("reducePermission", false);
                maxLength = jSONObject.optInt(Constants.Name.MAX_LENGTH, 1024);
                this.useCN = jSONObject.optBoolean(MspGlobalDefine.LANG, false);
                if (jSONObject.has("localUrl")) {
                    this.mParams.b = jSONObject.optString("localUrl");
                }
            } catch (Exception unused) {
                v7t.d(TAG, "takePhoto fail, params: " + str);
                nsw nswVar = new nsw();
                nswVar.j("HY_PARAM_ERR");
                nswVar.b("msg", "PHOTO_INIT_ERROR ,params:" + str);
                this.mCallback.error(nswVar);
            }
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("takePhoto".equals(str)) {
            try {
                if (!vpw.commonConfig.t0) {
                    requestCameraPermission(new a(wVCallBackContext, str2), new dqw(wVCallBackContext, "NO_PERMISSION"));
                } else {
                    this.isAlive = true;
                    initTakePhoto(wVCallBackContext, str2);
                    if (this.mParams.q) {
                        takePhoto(wVCallBackContext, str2);
                    } else {
                        requestCameraPermission(new b(wVCallBackContext, str2), new dqw(wVCallBackContext, "NO_PERMISSION"));
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else if (!"confirmUploadPhoto".equals(str)) {
            return false;
        } else {
            confirmUploadPhoto(wVCallBackContext, str2);
        }
        return true;
    }

    public synchronized void takePhoto(WVCallBackContext wVCallBackContext, String str) {
        View peekDecorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa3fb39", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (!vpw.commonConfig.t0) {
            initTakePhoto(wVCallBackContext, str);
        }
        Context context = this.mContext;
        if ((context instanceof Activity) && (peekDecorView = ((Activity) context).getWindow().peekDecorView()) != null) {
            ((InputMethodManager) this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(peekDecorView.getWindowToken(), 0);
        }
        if ("camera".equals(this.mParams.i)) {
            openCamara();
        } else if ("photo".equals(this.mParams.i)) {
            chosePhoto();
        } else {
            try {
                if (!og8.c() && !this.useCN) {
                    String[] strArr = this.mPopupMenuTags;
                    strArr[0] = "Take pictures";
                    strArr[1] = "Select from album";
                }
                if (this.mPopupController == null) {
                    this.mPopupController = new PopupWindowController(this.mContext, this.mWebView.getView(), this.mPopupMenuTags, this.popupClickListener);
                }
                this.mPopupController.i();
            } catch (Exception e2) {
                v7t.n(TAG, e2.getMessage());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01bc, code lost:
        if (r9 == null) goto L_0x01e1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01be, code lost:
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d7, code lost:
        if (r9 == null) goto L_0x01e1;
     */
    @Override // tb.kpw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityResult(int r19, int r20, android.content.Intent r21) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.jsbridge.api.WVCamera.onActivityResult(int, int, android.content.Intent):void");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class g {

        /* renamed from: a  reason: collision with root package name */
        public String f1797a;
        public String b;
        public int c;
        public String d;
        public String e;
        public String f;
        public org.json.JSONObject g;
        public String h;
        public String i;
        public String j;
        public int k;
        public boolean l;
        public boolean m;
        public boolean n;
        public JSONArray o;
        public boolean p;
        public boolean q;
        public String r;
        public int s;

        static {
            t2o.a(989856266);
        }

        public g(WVCamera wVCamera) {
            this.h = "";
            this.i = CredentialRpcData.ACTION_BOTH;
            this.j = "0";
            this.k = 9;
            this.l = true;
            this.m = true;
            this.n = false;
            this.o = null;
            this.p = false;
            this.q = false;
            this.s = 0;
        }

        public g(WVCamera wVCamera, g gVar) {
            this.h = "";
            this.i = CredentialRpcData.ACTION_BOTH;
            this.j = "0";
            this.k = 9;
            this.l = true;
            this.m = true;
            this.n = false;
            this.o = null;
            this.p = false;
            this.q = false;
            this.s = 0;
            this.f1797a = gVar.f1797a;
            this.b = gVar.b;
            this.c = gVar.c;
            this.d = gVar.d;
            this.e = gVar.e;
            this.f = gVar.f;
            this.h = gVar.h;
            this.i = gVar.i;
            this.j = gVar.j;
            this.k = gVar.k;
            this.l = gVar.l;
            this.o = gVar.o;
            this.m = gVar.m;
            this.n = gVar.n;
            this.p = gVar.p;
            this.q = gVar.q;
        }
    }
}
