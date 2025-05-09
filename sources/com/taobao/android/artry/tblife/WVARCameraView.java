package com.taobao.android.artry.tblife;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.hardware.Camera;
import android.media.ExifInterface;
import android.os.AsyncTask;
import android.os.Build;
import android.taobao.windvane.embed.BaseEmbedView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.dycontainer.WebViewContainer;
import com.taobao.android.artry.tblife.WVARCameraView;
import com.taobao.android.nav.Nav;
import com.taobao.android.tb3dspace.arskindetect.artryImpl.Person3DTakePhotoImpl;
import com.taobao.android.tb3dspace.arskindetect.artryImpl.RealPersonTakePhotoImpl;
import com.taobao.android.tb3dspace.camera.BasicCameraSession;
import com.taobao.android.tb3dspace.util.TB3DSpace;
import com.uc.webview.export.extension.EmbedViewConfig;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.clv;
import tb.dxv;
import tb.t2o;
import tb.uae;
import tb.vbq;
import tb.xyl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class WVARCameraView extends BaseEmbedView implements uae {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AR_CAMERA_WV_PLUGIN_TYPE = "WVARCamera";
    public static final String AR_CAMERA_WV_VIEW_TYPE = "wvarcamera";
    private static final String INIT_ACTIVE_KEY = "active";
    private static final String INIT_BIZID_KEY = "bizid";
    private static final String INIT_CONFIG_KEY = "config";
    private static final String INIT_DEVICE_POSITION = "devicePosition";
    private static final int REQUEST_CODE_GET_ALBUM_4_DECODE = 1;
    private static final String TAG = "WVARCameraView";
    private Activity mActivity;
    private int mCameraId;
    private boolean mIsCreateAREngine;
    private boolean mIsInAlbumMode;
    private JSONObject mPendingConfigJson;
    private Person3DTakePhotoImpl mPerson3DTakePhoto;
    private Bitmap mPictureFromAlbum;
    private RealPersonTakePhotoImpl mRealPersonTakePhoto;
    private FrameLayout mRootView;
    private BroadcastReceiver mTb3dSpaceInstallReceiver;
    private WebViewContainer mWebViewContainer;
    private boolean mIsFrontCamera = true;
    private String mCurrentType = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            WVARCameraView.access$100(WVARCameraView.this, 0);
            WVARCameraView.access$100(WVARCameraView.this, 100);
            WVARCameraView.access$200(WVARCameraView.this, true, new JSONObject());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Toast.makeText(WVARCameraView.this.getContext(), "请打开相册权限...", 0).show();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f6400a;

        public c(JSONObject jSONObject) {
            this.f6400a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WVARCameraView.access$302(WVARCameraView.this, this.f6400a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Camera.PictureCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a4928df", new Object[]{this, bArr, camera});
            } else if (bArr != null) {
                JSONObject jSONObject = new JSONObject();
                Bitmap o = dxv.o(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), -90);
                jSONObject.put("base64", (Object) dxv.e(o));
                HashMap hashMap = new HashMap();
                hashMap.put("output_video", o);
                List<clv> r = dxv.r(false, false, "tblife", WVARCameraView.access$400(WVARCameraView.this), hashMap);
                if (!dxv.h(r)) {
                    String i = r.get(0).i();
                    String h = r.get(0).h();
                    if (dxv.j(i)) {
                        jSONObject.put("url", (Object) i);
                        jSONObject.put("frame_oss_key", (Object) h);
                    }
                }
                WVStandardEventCenter.postNotificationToJS(WVARCameraView.this.webView, "ARCamera_TakePhoto", jSONObject.toString());
                o.recycle();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e extends AsyncTask<Pair<String, Integer>, Void, Bitmap> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(396361822);
        }

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/artry/tblife/WVARCameraView$ParseAlumbPictureTask");
        }

        /* renamed from: a */
        public Bitmap doInBackground(Pair<String, Integer>... pairArr) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("fdcece68", new Object[]{this, pairArr});
            }
            if (pairArr != null && pairArr.length > 0) {
                String str = (String) pairArr[0].first;
                if (!TextUtils.isEmpty(str) && new File(str).exists()) {
                    try {
                        int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
                        if (attributeInt == 3) {
                            i = 180;
                        } else if (attributeInt == 6) {
                            i = 90;
                        } else if (attributeInt == 8) {
                            i = 270;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Bitmap decodeFile = BitmapFactory.decodeFile(str, null);
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i);
                    Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
                    if (createBitmap != decodeFile && !decodeFile.isRecycled()) {
                        decodeFile.recycle();
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.postScale(960.0f / createBitmap.getWidth(), 1280.0f / createBitmap.getHeight());
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix2, true);
                    if (createBitmap != createBitmap2 && !createBitmap.isRecycled()) {
                        createBitmap.recycle();
                    }
                    return createBitmap2;
                }
            }
            return null;
        }

        /* renamed from: b */
        public void onPostExecute(Bitmap bitmap) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c38e7f1", new Object[]{this, bitmap});
                return;
            }
            if (bitmap == null) {
                WVARCameraView.access$600(WVARCameraView.this);
            }
            WVARCameraView.access$702(WVARCameraView.this, bitmap);
            if (dxv.i(WVARCameraView.access$300(WVARCameraView.this))) {
                WVARCameraView.access$800(WVARCameraView.this, true, false);
                return;
            }
            try {
                int size = WVARCameraView.access$300(WVARCameraView.this).size();
                String[] strArr = new String[size];
                String[] strArr2 = new String[size];
                int i = 0;
                for (String str2 : WVARCameraView.access$300(WVARCameraView.this).keySet()) {
                    strArr[i] = str2;
                    Object obj = WVARCameraView.access$300(WVARCameraView.this).get(str2);
                    if (obj == null) {
                        str = null;
                    } else {
                        str = obj.toString();
                    }
                    strArr2[i] = str;
                    i++;
                }
                WVARCameraView.access$902(WVARCameraView.this, true);
                if (!WVARCameraView.access$1000(WVARCameraView.this, strArr, strArr2)) {
                    WVARCameraView.access$800(WVARCameraView.this, true, false);
                }
            } catch (Throwable unused) {
                WVARCameraView.access$800(WVARCameraView.this, true, false);
            }
        }
    }

    static {
        t2o.a(396361816);
        t2o.a(396361782);
    }

    public static /* synthetic */ void access$000(WVARCameraView wVARCameraView, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90dbd7f", new Object[]{wVARCameraView, new Boolean(z), new Boolean(z2)});
        } else {
            wVARCameraView.realSetUpEnglne(z, z2);
        }
    }

    public static /* synthetic */ void access$100(WVARCameraView wVARCameraView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c578703", new Object[]{wVARCameraView, new Integer(i)});
        } else {
            wVARCameraView.sendPreloadEvent(i);
        }
    }

    public static /* synthetic */ boolean access$1000(WVARCameraView wVARCameraView, String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3743d12", new Object[]{wVARCameraView, strArr, strArr2})).booleanValue();
        }
        return wVARCameraView.checkChangedParam(strArr, strArr2);
    }

    public static /* synthetic */ void access$200(WVARCameraView wVARCameraView, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("523d639d", new Object[]{wVARCameraView, new Boolean(z), jSONObject});
        } else {
            wVARCameraView.sendSetupAREngineResult(z, jSONObject);
        }
    }

    public static /* synthetic */ JSONObject access$300(WVARCameraView wVARCameraView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("731339a2", new Object[]{wVARCameraView});
        }
        return wVARCameraView.mPendingConfigJson;
    }

    public static /* synthetic */ JSONObject access$302(WVARCameraView wVARCameraView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7489fd0c", new Object[]{wVARCameraView, jSONObject});
        }
        wVARCameraView.mPendingConfigJson = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ Activity access$400(WVARCameraView wVARCameraView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("be8a76c5", new Object[]{wVARCameraView});
        }
        return wVARCameraView.mActivity;
    }

    public static /* synthetic */ void access$600(WVARCameraView wVARCameraView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c11c1645", new Object[]{wVARCameraView});
        } else {
            wVARCameraView.notifyFailedToOpenAlbum();
        }
    }

    public static /* synthetic */ Bitmap access$702(WVARCameraView wVARCameraView, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6467184", new Object[]{wVARCameraView, bitmap});
        }
        wVARCameraView.mPictureFromAlbum = bitmap;
        return bitmap;
    }

    public static /* synthetic */ void access$800(WVARCameraView wVARCameraView, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35ae0587", new Object[]{wVARCameraView, new Boolean(z), new Boolean(z2)});
        } else {
            wVARCameraView.setupAREngine(z, z2);
        }
    }

    public static /* synthetic */ boolean access$902(WVARCameraView wVARCameraView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a415b0e", new Object[]{wVARCameraView, new Boolean(z)})).booleanValue();
        }
        wVARCameraView.mIsInAlbumMode = z;
        return z;
    }

    private boolean checkChangedParam(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38b4370c", new Object[]{this, strArr, strArr2})).booleanValue();
        }
        if (strArr == null || strArr2 == null) {
            return false;
        }
        String[] strArr3 = {INIT_DEVICE_POSITION, "active", "config", "bizid"};
        boolean z = false;
        for (int i = 0; i < 4; i++) {
            String str = strArr3[i];
            int paramIndex = getParamIndex(str, strArr);
            if (paramIndex >= 0 && paramIndex < strArr2.length) {
                this.params.mObjectParam.put(str, strArr2[paramIndex]);
                z = true;
            }
        }
        if (z) {
            setupAREngine(this.mIsInAlbumMode, false);
        }
        return z;
    }

    private int getParamIndex(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7e54d06", new Object[]{this, str, strArr})).intValue();
        }
        if (!TextUtils.isEmpty(str) && strArr != null && strArr.length > 0) {
            int i = -1;
            for (String str2 : strArr) {
                i++;
                if (TextUtils.equals(str2, str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    private void innerTakePicture(JSONObject jSONObject) {
        BasicCameraSession basicCameraSession;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8895a8", new Object[]{this, jSONObject});
            return;
        }
        RealPersonTakePhotoImpl realPersonTakePhotoImpl = this.mRealPersonTakePhoto;
        if (realPersonTakePhotoImpl != null) {
            basicCameraSession = realPersonTakePhotoImpl.getFaceDetect2DGlSurfaceView().getCameraSession();
        } else {
            basicCameraSession = this.mPerson3DTakePhoto.getFaceDetect2DGlSurfaceView().getCameraSession();
        }
        if (basicCameraSession != null) {
            basicCameraSession.takePhoto(new d());
        }
    }

    public static /* synthetic */ Object ipc$super(WVARCameraView wVARCameraView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/artry/tblife/WVARCameraView");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$null$10(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e957532", new Object[]{this, obj, new Boolean(z)});
            return;
        }
        if (this.mRealPersonTakePhoto == null) {
            Person3DTakePhotoImpl person3DTakePhotoImpl = this.mPerson3DTakePhoto;
            if (person3DTakePhotoImpl != null) {
                person3DTakePhotoImpl.onDestroy();
                this.mPerson3DTakePhoto = null;
            }
            RealPersonTakePhotoImpl realPersonTakePhotoImpl = new RealPersonTakePhotoImpl(this.mActivity);
            this.mRealPersonTakePhoto = realPersonTakePhotoImpl;
            realPersonTakePhotoImpl.initSkinDetectView(this.mRootView);
            this.mRealPersonTakePhoto.setWebView(this.webView);
            this.mRealPersonTakePhoto.setCurrentType(obj.toString());
        }
        this.mCameraId = z ? 1 : 0;
        this.mRealPersonTakePhoto.resumeCamera(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$null$12(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34dd354c", new Object[]{this, new Boolean(z)});
            return;
        }
        RealPersonTakePhotoImpl realPersonTakePhotoImpl = this.mRealPersonTakePhoto;
        if (realPersonTakePhotoImpl != null) {
            realPersonTakePhotoImpl.destroy();
            this.mRealPersonTakePhoto = null;
        }
        if (this.mPerson3DTakePhoto == null) {
            Person3DTakePhotoImpl person3DTakePhotoImpl = new Person3DTakePhotoImpl(this.mRootView, this.mActivity);
            this.mPerson3DTakePhoto = person3DTakePhotoImpl;
            person3DTakePhotoImpl.mWebView = this.webView;
        }
        this.mCameraId = z ? 1 : 0;
        this.mPerson3DTakePhoto.resumeCamera(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$realSetUpEnglne$11(final Object obj, final boolean z, boolean z2, org.json.JSONObject jSONObject) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99c0dd9e", new Object[]{this, obj, new Boolean(z), new Boolean(z2), jSONObject});
        } else if (z2 && (frameLayout = this.mRootView) != null) {
            frameLayout.post(new Runnable() { // from class: tb.epw
                @Override // java.lang.Runnable
                public final void run() {
                    WVARCameraView.this.lambda$null$10(obj, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$realSetUpEnglne$13(final boolean z, boolean z2, org.json.JSONObject jSONObject) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b22ab8", new Object[]{this, new Boolean(z), new Boolean(z2), jSONObject});
        } else if (z2 && (frameLayout = this.mRootView) != null) {
            frameLayout.post(new Runnable() { // from class: tb.fpw
                @Override // java.lang.Runnable
                public final void run() {
                    WVARCameraView.this.lambda$null$12(z);
                }
            });
        }
    }

    private void realSetUpEnglne(boolean z, boolean z2) {
        Map map;
        final boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c519044b", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.mIsInAlbumMode = z;
        EmbedViewConfig embedViewConfig = this.params;
        if (embedViewConfig != null && (map = embedViewConfig.mObjectParam) != null) {
            Object obj = map.get("active");
            Object obj2 = this.params.mObjectParam.get(INIT_DEVICE_POSITION);
            if (obj2 == null || !TextUtils.equals(obj2.toString(), "back")) {
                z3 = true;
            }
            if (!TextUtils.isEmpty(this.mCurrentType)) {
                boolean z4 = this.mIsFrontCamera;
            }
            final Object obj3 = this.params.mObjectParam.get("config");
            try {
                this.mCurrentType = (String) obj3;
            } catch (Throwable unused) {
            }
            if ("0".equals(obj)) {
                this.mCurrentType = null;
                Person3DTakePhotoImpl person3DTakePhotoImpl = this.mPerson3DTakePhoto;
                if (person3DTakePhotoImpl != null) {
                    person3DTakePhotoImpl.pause();
                }
                RealPersonTakePhotoImpl realPersonTakePhotoImpl = this.mRealPersonTakePhoto;
                if (realPersonTakePhotoImpl != null) {
                    realPersonTakePhotoImpl.pause();
                }
            }
            if ("facedetection2d".equals(this.mCurrentType)) {
                TB3DSpace.initSkinDetect(new vbq() { // from class: tb.gpw
                    @Override // tb.vbq
                    public final void onComplete(boolean z5, org.json.JSONObject jSONObject) {
                        WVARCameraView.this.lambda$realSetUpEnglne$11(obj3, z3, z5, jSONObject);
                    }
                });
            } else if ("facedetection3d".equals(this.mCurrentType)) {
                TB3DSpace.initSkinDetect(new vbq() { // from class: tb.hpw
                    @Override // tb.vbq
                    public final void onComplete(boolean z5, org.json.JSONObject jSONObject) {
                        WVARCameraView.this.lambda$realSetUpEnglne$13(z3, z5, jSONObject);
                    }
                });
            }
            this.mIsCreateAREngine = true;
            this.mIsFrontCamera = z3;
            this.mRootView.post(new a());
        }
    }

    private void sendPreloadEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60c2143", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("progress", (Object) Float.valueOf(i / 100.0f));
        jSONObject.put("completion", (Object) Boolean.TRUE);
        WVStandardEventCenter.postNotificationToJS(this.webView, "ARCamera_PreloadResource", jSONObject.toString());
    }

    private void sendSetupAREngineResult(boolean z, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe6ba888", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (z) {
            str = "ARCamera_Init";
        } else {
            str = "ARCamera_Error";
        }
        if (!z) {
            jSONObject2.putAll(jSONObject);
        }
        WVStandardEventCenter.postNotificationToJS(this.webView, str, jSONObject2.toString());
    }

    private void setupAREngine(final boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e39d097", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (dxv.m()) {
            realSetUpEnglne(z, z2);
        } else if (this.mTb3dSpaceInstallReceiver == null) {
            this.mTb3dSpaceInstallReceiver = new BroadcastReceiver() { // from class: com.taobao.android.artry.tblife.WVARCameraView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/artry/tblife/WVARCameraView$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent != null) {
                        WVARCameraView.access$000(WVARCameraView.this, z, z2);
                    }
                }
            };
            LocalBroadcastManager.getInstance(this.mActivity).registerReceiver(this.mTb3dSpaceInstallReceiver, new IntentFilter("TB3DSPACE_INSTALL_SUCCESS"));
            Nav.from(this.mActivity).toUri("https://go/installxrspace3d");
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public View generateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7334ca29", new Object[]{this, context});
        }
        if (!(context instanceof Activity)) {
            return null;
        }
        this.mActivity = (Activity) context;
        this.mRootView = new FrameLayout(this.mActivity);
        WebViewContainer webViewContainer = new WebViewContainer(this.webView);
        this.mWebViewContainer = webViewContainer;
        webViewContainer.f(this);
        WVStandardEventCenter.postNotificationToJS(this.webView, "ARCamera_Mounted", new JSONObject().toJSONString());
        return this.mRootView;
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public String getViewType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35692924", new Object[]{this});
        }
        return AR_CAMERA_WV_VIEW_TYPE;
    }

    @Override // tb.kpw
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i == 1) {
            if (i2 != -1) {
                notifyFailedToOpenAlbum();
                return;
            }
            new e().execute(dxv.g(this.mActivity, intent.getData()));
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mCurrentType = "";
        LocalBroadcastManager.getInstance(this.mActivity).unregisterReceiver(this.mTb3dSpaceInstallReceiver);
        WebViewContainer webViewContainer = this.mWebViewContainer;
        if (webViewContainer != null) {
            webViewContainer.e();
        }
        this.mActivity = null;
        Bitmap bitmap = this.mPictureFromAlbum;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.mPictureFromAlbum.recycle();
            this.mPictureFromAlbum = null;
        }
        Person3DTakePhotoImpl person3DTakePhotoImpl = this.mPerson3DTakePhoto;
        if (person3DTakePhotoImpl != null) {
            person3DTakePhotoImpl.onDestroy();
            this.mPerson3DTakePhoto = null;
        }
        RealPersonTakePhotoImpl realPersonTakePhotoImpl = this.mRealPersonTakePhoto;
        if (realPersonTakePhotoImpl != null) {
            realPersonTakePhotoImpl.destroy();
            this.mRealPersonTakePhoto = null;
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnParamChangedListener
    public void onParamChanged(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddb624d", new Object[]{this, strArr, strArr2});
        } else {
            checkChangedParam(strArr, strArr2);
        }
    }

    @Override // tb.kpw
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        Person3DTakePhotoImpl person3DTakePhotoImpl = this.mPerson3DTakePhoto;
        if (person3DTakePhotoImpl != null) {
            person3DTakePhotoImpl.pause();
        }
        RealPersonTakePhotoImpl realPersonTakePhotoImpl = this.mRealPersonTakePhoto;
        if (realPersonTakePhotoImpl != null) {
            realPersonTakePhotoImpl.pause();
        }
    }

    @Override // tb.kpw
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        Person3DTakePhotoImpl person3DTakePhotoImpl = this.mPerson3DTakePhoto;
        if (person3DTakePhotoImpl != null) {
            person3DTakePhotoImpl.resumeCamera(this.mCameraId);
        }
        RealPersonTakePhotoImpl realPersonTakePhotoImpl = this.mRealPersonTakePhoto;
        if (realPersonTakePhotoImpl != null) {
            realPersonTakePhotoImpl.resumeCamera(this.mCameraId);
        }
    }

    private void notifyFailedToOpenAlbum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e37933cb", new Object[]{this});
        } else {
            Toast.makeText(this.mActivity.getApplicationContext(), "从相册读取照片失败...", 0).show();
        }
    }

    @Override // tb.uae
    public boolean onAction(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5683d51", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(str, "preloadResource")) {
            setupAREngine(this.mIsInAlbumMode, true);
            return true;
        } else if (!this.mIsCreateAREngine) {
            return false;
        } else {
            try {
                jSONObject = JSON.parseObject(str2);
            } catch (Throwable unused) {
                jSONObject = null;
            }
            if (TextUtils.equals(str, "takePhoto")) {
                innerTakePicture(jSONObject);
                return true;
            } else if (TextUtils.equals(str, "snapshot") && jSONObject != null) {
                innerTakePicture(jSONObject);
                return true;
            } else if (!TextUtils.equals(str, "choosePhotoLibrary")) {
                return false;
            } else {
                com.taobao.runtimepermission.a.c(this.webView.getContext(), Build.VERSION.SDK_INT >= 33 ? new String[]{xyl.READ_MEDIA_IMAGES, xyl.READ_MEDIA_VIDEO} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"}).w("当您使用相册时需要用到读取权限").A(new c(jSONObject)).z(new b()).m();
                return true;
            }
        }
    }
}
