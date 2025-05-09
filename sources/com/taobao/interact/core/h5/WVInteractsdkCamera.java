package com.taobao.interact.core.h5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.interact.publish.service.AspectRatio;
import com.taobao.interact.publish.service.BitmapSize;
import com.taobao.interact.publish.service.IServiceCallBack;
import com.taobao.interact.publish.service.Image;
import com.taobao.interact.publish.service.PublishConfig;
import com.taobao.interact.publish.service.Ratio;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.frf;
import tb.gl4;
import tb.kpw;
import tb.nsw;
import tb.opw;
import tb.oqw;
import tb.pqw;
import tb.ql7;
import tb.t2o;
import tb.tep;
import tb.tvf;
import tb.voe;
import tb.vxv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class WVInteractsdkCamera extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_WRITE_WV_IMAGE_MAX = 640;
    private static final String INTERACT_ACTION = "takePhotoInteract";
    private static final String TAG = "WVInteractsdkCamera";
    private static final String TAKEPHOTO_EVENT_NAME = "WVPhoto.Event.takePhotoSuccess";
    private PublishConfig.b mBuilder;
    private WVCallBackContext mCallback;
    private ThreadPoolExecutor mExecutorService;
    private frf mJSONParams;
    private IntentFilter mIntentFilter = new IntentFilter();
    private BroadcastReceiver mBackReceiver = new BroadcastReceiver() { // from class: com.taobao.interact.core.h5.WVInteractsdkCamera.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/interact/core/h5/WVInteractsdkCamera$2");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (WVInteractsdkCamera.access$000(WVInteractsdkCamera.this) != null) {
                nsw nswVar = new nsw();
                nswVar.b("errorMsg", "PHOTO_CANCEL");
                WVInteractsdkCamera.access$000(WVInteractsdkCamera.this).error(nswVar);
            }
        }
    };
    private BroadcastReceiver mErrorReceiver = new BroadcastReceiver() { // from class: com.taobao.interact.core.h5.WVInteractsdkCamera.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/interact/core/h5/WVInteractsdkCamera$3");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            TLog.loge(WVInteractsdkCamera.TAG, "error receiver");
            if (WVInteractsdkCamera.access$000(WVInteractsdkCamera.this) != null && intent != null) {
                String a2 = tvf.a(intent.getStringExtra("errorCode"), intent.getIntExtra("subCode", 0), intent.getStringExtra("errorMsg"));
                WVInteractsdkCamera.access$000(WVInteractsdkCamera.this).error(a2);
                TLog.loge(WVInteractsdkCamera.TAG, "error = " + a2);
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(WVInteractsdkCamera wVInteractsdkCamera) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "TaopaiImageUploadThread");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f10842a;

        public b(List list) {
            this.f10842a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (WVInteractsdkCamera.access$200(WVInteractsdkCamera.this).b) {
                WVInteractsdkCamera.access$300(WVInteractsdkCamera.this, this.f10842a);
            } else {
                a();
            }
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20850d9a", new Object[]{this});
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                JSONArray jSONArray3 = new JSONArray();
                JSONArray jSONArray4 = new JSONArray();
                for (Image image : this.f10842a) {
                    JSONObject jSONObject = new JSONObject();
                    String path = image.getPath();
                    jSONObject.putOpt(gl4.CONFIG_LOCAL_PATH, path);
                    vxv.a a2 = vxv.a(path);
                    jSONObject.putOpt("width", Integer.valueOf(a2.f30328a));
                    jSONObject.putOpt("height", Integer.valueOf(a2.b));
                    jSONArray2.put(path);
                    String str = "//127.0.0.1/wvcache/photo.jpg?_wvcrc=1&t=" + System.currentTimeMillis();
                    String access$400 = WVInteractsdkCamera.access$400(WVInteractsdkCamera.this, path, str);
                    jSONObject.putOpt("url", str);
                    jSONObject.putOpt("wvcachepath", access$400);
                    jSONArray3.put(str);
                    jSONArray.put(jSONObject);
                }
                nsw nswVar = new nsw();
                nswVar.k();
                nswVar.c("images", jSONArray);
                WVInteractsdkCamera.access$000(WVInteractsdkCamera.this).fireEvent(WVInteractsdkCamera.TAKEPHOTO_EVENT_NAME, nswVar.m());
                if (WVInteractsdkCamera.access$200(WVInteractsdkCamera.this).f19485a) {
                    WVInteractsdkCamera.access$200(WVInteractsdkCamera.this).r = jSONArray2;
                    WVInteractsdkCamera.access$200(WVInteractsdkCamera.this).B = jSONArray3;
                    WVInteractsdkCamera.access$200(WVInteractsdkCamera.this).C = jSONArray4;
                    WVInteractsdkUpload wVInteractsdkUpload = new WVInteractsdkUpload();
                    wVInteractsdkUpload.initialize(WVInteractsdkCamera.access$500(WVInteractsdkCamera.this), WVInteractsdkCamera.access$600(WVInteractsdkCamera.this));
                    try {
                        wVInteractsdkUpload.uploadFiles(WVInteractsdkCamera.access$200(WVInteractsdkCamera.this), WVInteractsdkCamera.access$000(WVInteractsdkCamera.this));
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        WVInteractsdkCamera.access$000(WVInteractsdkCamera.this).error(e.getMessage());
                    }
                } else if (WVInteractsdkCamera.access$200(WVInteractsdkCamera.this).n || WVInteractsdkCamera.access$200(WVInteractsdkCamera.this).H != 0) {
                    WVInteractsdkCamera.access$000(WVInteractsdkCamera.this).success(nswVar);
                } else {
                    nsw nswVar2 = new nsw();
                    nswVar2.k();
                    JSONObject optJSONObject = jSONArray.optJSONObject(0);
                    nswVar2.b("url", optJSONObject.optString("url"));
                    nswVar2.c("watermarks", optJSONObject.optJSONArray("watermarks"));
                    nswVar2.b(gl4.CONFIG_LOCAL_PATH, optJSONObject.optString("wvcachepath"));
                    WVInteractsdkCamera.access$000(WVInteractsdkCamera.this).success(nswVar2);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    static {
        t2o.a(495976455);
    }

    public WVInteractsdkCamera() {
        this.mIntentFilter.addAction("com.taobao.interact.publish.action.BACK");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(100), new a(this), new ThreadPoolExecutor.DiscardPolicy());
        this.mExecutorService = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ WVCallBackContext access$000(WVInteractsdkCamera wVInteractsdkCamera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("d079431b", new Object[]{wVInteractsdkCamera});
        }
        return wVInteractsdkCamera.mCallback;
    }

    public static /* synthetic */ void access$100(WVInteractsdkCamera wVInteractsdkCamera, List list) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1539b5c8", new Object[]{wVInteractsdkCamera, list});
        } else {
            wVInteractsdkCamera.multiImageLogic(list);
        }
    }

    public static /* synthetic */ frf access$200(WVInteractsdkCamera wVInteractsdkCamera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (frf) ipChange.ipc$dispatch("4caf32c9", new Object[]{wVInteractsdkCamera});
        }
        return wVInteractsdkCamera.mJSONParams;
    }

    public static /* synthetic */ void access$300(WVInteractsdkCamera wVInteractsdkCamera, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19cf1f86", new Object[]{wVInteractsdkCamera, list});
        } else {
            wVInteractsdkCamera.packageDataToH5(list);
        }
    }

    public static /* synthetic */ String access$400(WVInteractsdkCamera wVInteractsdkCamera, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb011b18", new Object[]{wVInteractsdkCamera, str, str2});
        }
        return wVInteractsdkCamera.writeFile2WVCache(str, str2);
    }

    public static /* synthetic */ Context access$500(WVInteractsdkCamera wVInteractsdkCamera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("7df6584b", new Object[]{wVInteractsdkCamera});
        }
        return wVInteractsdkCamera.mContext;
    }

    public static /* synthetic */ IWVWebView access$600(WVInteractsdkCamera wVInteractsdkCamera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWVWebView) ipChange.ipc$dispatch("5afef2c8", new Object[]{wVInteractsdkCamera});
        }
        return wVInteractsdkCamera.mWebView;
    }

    public static /* synthetic */ Object ipc$super(WVInteractsdkCamera wVInteractsdkCamera, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 1743254097) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1], objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/interact/core/h5/WVInteractsdkCamera");
        }
    }

    private void multiImageLogic(List<Image> list) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56025254", new Object[]{this, list});
        } else {
            this.mExecutorService.execute(new b(list));
        }
    }

    private Ratio stringParseRatio(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ratio) ipChange.ipc$dispatch("1ab20080", new Object[]{this, str});
        }
        if ("1".equalsIgnoreCase(str)) {
            return Ratio.CROP_RATIO_FREE;
        }
        if ("2".equalsIgnoreCase(str)) {
            return Ratio.CROP_RATIO_3x4;
        }
        if ("3".equalsIgnoreCase(str)) {
            return Ratio.CROP_RATIO_4x3;
        }
        if ("4".equalsIgnoreCase(str)) {
            return Ratio.CROP_RATIO_9x16;
        }
        if ("5".equalsIgnoreCase(str)) {
            return Ratio.CROP_RATIO_16x9;
        }
        if ("6".equalsIgnoreCase(str)) {
            return Ratio.CROP_RATIO_1x1;
        }
        return Ratio.CROP_RATIO_1x1;
    }

    private String writeFile2WVCache(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec2ed2f9", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Bitmap c = voe.c(str, 640);
        byte[] a2 = voe.a(c, Bitmap.CompressFormat.JPEG);
        if (c != null && !c.isRecycled()) {
            c.recycle();
        }
        if (a2 == null || a2.length == 0) {
            return "";
        }
        oqw oqwVar = new oqw();
        oqwVar.c = ql7.c(str2);
        oqwVar.d = "image/jpeg";
        oqwVar.f25584a = System.currentTimeMillis() + pqw.DEFAULT_MAX_AGE;
        opw.e().i(oqwVar, a2);
        return opw.e().b(true) + File.separator + ql7.c(str2);
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e7f251", new Object[]{this, context, iWVWebView, obj});
            return;
        }
        super.initialize(context, iWVWebView, obj);
        LocalBroadcastManager.getInstance(context).registerReceiver(this.mBackReceiver, this.mIntentFilter);
        LocalBroadcastManager.getInstance(context).registerReceiver(this.mErrorReceiver, new IntentFilter("com.taobao.interact.publish.action.error"));
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        try {
            LocalBroadcastManager.getInstance(this.mContext).unregisterReceiver(this.mBackReceiver);
            LocalBroadcastManager.getInstance(this.mContext).unregisterReceiver(this.mErrorReceiver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void takePhotoInteract(String str) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9151912", new Object[]{this, str});
            return;
        }
        try {
            TLog.loge(TAG, "takePhotoInteract = " + str);
            this.mJSONParams = frf.a(new JSONObject(str));
            PublishConfig.b bVar = new PublishConfig.b();
            this.mBuilder = bVar;
            PublishConfig.b h0 = bVar.M(this.mJSONParams.c).N(this.mJSONParams.d).L(this.mJSONParams.q).W(this.mJSONParams.f).l0(this.mJSONParams.e).K(this.mJSONParams.f19485a).k0(this.mJSONParams.b).X(this.mJSONParams.o).R(this.mJSONParams.j).U(this.mJSONParams.i).V(this.mJSONParams.h).S(this.mJSONParams.g).b0(this.mJSONParams.l).c0(this.mJSONParams.m).Y(this.mJSONParams.n).h0(false);
            frf frfVar = this.mJSONParams;
            h0.i0(new BitmapSize(frfVar.s, frfVar.t)).T(this.mJSONParams.p).J(Ratio.parseRatio(stringParseRatio(this.mJSONParams.u))).g0(this.mJSONParams.D).d0(this.mJSONParams.E).f0(this.mJSONParams.F).Q(this.mJSONParams.G).Z(this.mJSONParams.A).e0(this.mJSONParams.z).O(this.mJSONParams.y).P(this.mJSONParams.x);
            frf frfVar2 = this.mJSONParams;
            if (!(frfVar2.v == 0 || frfVar2.w == 0)) {
                PublishConfig.b bVar2 = this.mBuilder;
                frf frfVar3 = this.mJSONParams;
                bVar2.J(new AspectRatio(frfVar3.v, frfVar3.w));
            }
            com.taobao.interact.publish.service.b bVar3 = new com.taobao.interact.publish.service.b(this.mContext, this.mBuilder.I());
            try {
                String str2 = this.mJSONParams.o;
                if (str2.equalsIgnoreCase(CredentialRpcData.ACTION_BOTH)) {
                    bVar3.n();
                } else if (str2.equalsIgnoreCase("photo")) {
                    bVar3.g();
                } else if (str2.equalsIgnoreCase("camera")) {
                    bVar3.f();
                }
            } catch (RemoteException e) {
                e.printStackTrace();
                this.mCallback.error(tvf.a("", -2, e.getMessage()));
                Log.e("Taopai", "Windvane  parse params error " + e.getMessage());
            }
            bVar3.l(new IServiceCallBack.Stub() { // from class: com.taobao.interact.core.h5.WVInteractsdkCamera.4
                @Override // com.taobao.interact.publish.service.IServiceCallBack
                public void onResult(List<Image> list) throws RemoteException {
                    if (list == null || list.isEmpty()) {
                        WVInteractsdkCamera.access$000(WVInteractsdkCamera.this).error(tvf.a("", -1, "无有效结果"));
                        return;
                    }
                    try {
                        WVInteractsdkCamera.access$100(WVInteractsdkCamera.this, list);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            });
        } catch (JSONException e2) {
            this.mCallback.error(tvf.a("", 0, e2.getMessage()));
            e2.printStackTrace();
            Log.e("Taopai", "Windvane json error " + e2.getMessage());
        }
    }

    private void packageDataToH5(List<Image> list) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27079d50", new Object[]{this, list});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.k();
        JSONArray jSONArray = new JSONArray();
        for (Image image : list) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mediaType", image.getMediaType());
                jSONObject.put("resourceURL", image.getResourceUrl());
                jSONObject.put(gl4.CONFIG_LOCAL_PATH, image.getPath());
                jSONObject.put("coverURL", image.getCoverUrl());
                jSONObject.put("coverPath", image.getCoverPath());
                jSONObject.put("width", image.getWidth());
                jSONObject.put("height", image.getHeight());
                jSONObject.put("duration", image.getDuration());
                jSONObject.put(tep.KEY_TP_RETURN_VIDEO_FILE_ID, image.getFileId());
                StringBuilder sb = new StringBuilder();
                sb.append("success data = ");
                sb.append(jSONArray.toString());
                if (TextUtils.isEmpty(image.getResourceUrl())) {
                    z = false;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            jSONArray.put(jSONObject);
        }
        nswVar.c("medias", jSONArray);
        if (!this.mJSONParams.f19485a || z) {
            this.mCallback.success(nswVar);
            return;
        }
        try {
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            for (Image image2 : list) {
                JSONObject jSONObject2 = new JSONObject();
                String path = image2.getPath();
                jSONObject2.putOpt(gl4.CONFIG_LOCAL_PATH, path);
                vxv.a a2 = vxv.a(path);
                jSONObject2.putOpt("width", Integer.valueOf(a2.f30328a));
                jSONObject2.putOpt("height", Integer.valueOf(a2.b));
                jSONArray2.put(path);
                String str = "//127.0.0.1/wvcache/photo.jpg?_wvcrc=1&t=" + System.currentTimeMillis();
                String writeFile2WVCache = writeFile2WVCache(path, str);
                jSONObject2.putOpt("url", str);
                jSONObject2.putOpt("wvcachepath", writeFile2WVCache);
                jSONArray3.put(str);
            }
            frf frfVar = this.mJSONParams;
            frfVar.r = jSONArray2;
            frfVar.B = jSONArray3;
            WVInteractsdkUpload wVInteractsdkUpload = new WVInteractsdkUpload();
            wVInteractsdkUpload.initialize(this.mContext, this.mWebView);
            try {
                wVInteractsdkUpload.uploadFiles(this.mJSONParams, this.mCallback);
            } catch (RemoteException e2) {
                e2.printStackTrace();
                this.mCallback.error(e2.getMessage());
            }
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        this.mCallback = wVCallBackContext;
        if (!INTERACT_ACTION.equals(str)) {
            return false;
        }
        try {
            takePhotoInteract(str2);
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.e("Taopai", "Windvane " + str + ", error " + e.getMessage());
            wVCallBackContext.error(tvf.a("", -3, e.getMessage()));
        }
        return true;
    }
}
