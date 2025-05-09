package android.taobao.windvane.extra.jsbridge;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.extra.WVIAdapter;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.api.WVCamera;
import android.taobao.windvane.jsbridge.api.b;
import android.taobao.windvane.thread.WVThreadPool;
import android.taobao.windvane.util.MimeTypeEnum;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mtopsdk.mtop.upload.FileUploadBaseListener;
import mtopsdk.mtop.upload.FileUploadMgr;
import mtopsdk.mtop.upload.domain.UploadFileInfo;
import org.json.JSONArray;
import tb.gl4;
import tb.itw;
import tb.lex;
import tb.lf9;
import tb.mzd;
import tb.ndt;
import tb.nsw;
import tb.omv;
import tb.opw;
import tb.ozd;
import tb.t2o;
import tb.v7t;
import tb.vc9;
import tb.voe;
import tb.x74;
import tb.y71;
import tb.z6e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBUploadService extends b implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LAST_PIC = "\"isLastPic\":\"true\"";
    private static final String MUTI_SELECTION = "\"mutipleSelection\":\"1\"";
    private static final int NOTIFY_ERROR = 2003;
    private static final int NOTIFY_FINISH = 2002;
    private static final int NOTIFY_START = 2001;
    private static final String TAG = "TBUploadService";
    private int currentCount = 0;
    private WVCallBackContext mCallback;
    private Handler mHandler;
    private JSONArray multiPictureResult;

    static {
        t2o.a(989855947);
    }

    public TBUploadService() {
        this.mHandler = null;
        this.mHandler = new Handler(Looper.getMainLooper(), this);
    }

    public static /* synthetic */ void access$000(TBUploadService tBUploadService, WVCamera.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3648d410", new Object[]{tBUploadService, gVar});
        } else {
            tBUploadService.doMtopUpload(gVar);
        }
    }

    public static /* synthetic */ Handler access$100(TBUploadService tBUploadService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("39b52b8b", new Object[]{tBUploadService});
        }
        return tBUploadService.mHandler;
    }

    public static /* synthetic */ Object ipc$super(TBUploadService tBUploadService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/jsbridge/TBUploadService");
    }

    @Override // android.taobao.windvane.jsbridge.api.b
    public void doUpload(final WVCamera.g gVar, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cecb6326", new Object[]{this, gVar, wVCallBackContext});
        } else if (gVar == null) {
            v7t.a(TAG, "UploadParams is null.");
            wVCallBackContext.error(new nsw());
        } else {
            this.mCallback = wVCallBackContext;
            try {
                String url = wVCallBackContext.getWebview().getUrl();
                y71.commitOffMonitor(url, "TBUploadService bizCode:" + gVar.e, gVar.d);
            } catch (Throwable unused) {
            }
            if ("2.0".equals(gVar.d)) {
                WVIAdapter wVIAdapter = lex.b;
                if (wVIAdapter != null) {
                    wVIAdapter.getLoginInfo(null);
                }
                WVThreadPool.getInstance().execute(new Runnable() { // from class: android.taobao.windvane.extra.jsbridge.TBUploadService.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            TBUploadService.access$000(TBUploadService.this, gVar);
                        }
                    }
                });
                return;
            }
            nsw nswVar = new nsw();
            nswVar.b("msg", "1.0 will not supported, please use 2.0");
            wVCallBackContext.error(nswVar);
        }
    }

    @Override // android.taobao.windvane.jsbridge.api.b
    public void resetMultiPictureResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33741b8", new Object[]{this});
            return;
        }
        this.multiPictureResult = null;
        this.currentCount = 0;
    }

    private void doMtopUpload(final WVCamera.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b3784d1", new Object[]{this, gVar});
            return;
        }
        try {
            final File createTempFile = File.createTempFile("windvane", "." + MimeTypeEnum.JPG.getSuffix(), opw.e().f(true));
            gVar.r = createTempFile.getAbsolutePath();
            if (!vc9.a(new File(gVar.f1797a), createTempFile)) {
                nsw nswVar = new nsw();
                nswVar.b("errorInfo", "Failed to copy file!");
                this.mCallback.error(nswVar);
                return;
            }
            final nsw nswVar2 = new nsw();
            try {
                omv.a().uploadAsync(new z6e() { // from class: android.taobao.windvane.extra.jsbridge.TBUploadService.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.z6e
                    public String getBizType() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (String) ipChange2.ipc$dispatch("9c07dca2", new Object[]{this});
                        }
                        return gVar.e;
                    }

                    @Override // tb.z6e
                    public String getFilePath() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (String) ipChange2.ipc$dispatch("1bcb7a22", new Object[]{this});
                        }
                        return createTempFile.getAbsolutePath();
                    }

                    @Override // tb.z6e
                    public String getFileType() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (String) ipChange2.ipc$dispatch("105a7e2d", new Object[]{this});
                        }
                        return ".jpg";
                    }

                    @Override // tb.z6e
                    public Map<String, String> getMetaInfo() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Map) ipChange2.ipc$dispatch("8d01c005", new Object[]{this});
                        }
                        if (gVar.g == null) {
                            return null;
                        }
                        HashMap hashMap = new HashMap();
                        Iterator<String> keys = gVar.g.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            hashMap.put(next, gVar.g.optString(next));
                        }
                        return hashMap;
                    }
                }, new mzd() { // from class: android.taobao.windvane.extra.jsbridge.TBUploadService.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.mzd
                    public void onCancel(z6e z6eVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c7d021ed", new Object[]{this, z6eVar});
                        }
                    }

                    @Override // tb.mzd
                    public void onFailure(z6e z6eVar, ndt ndtVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7789334b", new Object[]{this, z6eVar, ndtVar});
                            return;
                        }
                        v7t.i(TBUploadService.TAG, "upload failed");
                        nswVar2.b("subCode", ndtVar.b);
                        nswVar2.b("errorCode", ndtVar.f24666a);
                        nswVar2.b("errorMsg", ndtVar.c);
                        nswVar2.b(gl4.CONFIG_LOCAL_PATH, gVar.f1797a);
                        nswVar2.b("tempFilePath", gVar.r);
                        nswVar2.a("selectSize", Integer.valueOf(gVar.s));
                        nswVar2.b("identifier", gVar.h);
                        Message.obtain(TBUploadService.access$100(TBUploadService.this), 2003, nswVar2).sendToTarget();
                    }

                    @Override // tb.mzd
                    public void onPause(z6e z6eVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c85aa60f", new Object[]{this, z6eVar});
                        }
                    }

                    @Override // tb.mzd
                    public void onProgress(z6e z6eVar, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("34b23fa9", new Object[]{this, z6eVar, new Integer(i)});
                            return;
                        }
                        String valueOf = String.valueOf(i);
                        v7t.d(TBUploadService.TAG, "uploadFile onProgress " + valueOf);
                    }

                    @Override // tb.mzd
                    public void onResume(z6e z6eVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e581d4da", new Object[]{this, z6eVar});
                        }
                    }

                    @Override // tb.mzd
                    public void onStart(z6e z6eVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f33e623", new Object[]{this, z6eVar});
                        }
                    }

                    @Override // tb.mzd
                    public void onWait(z6e z6eVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e3e24ed2", new Object[]{this, z6eVar});
                        }
                    }

                    @Override // tb.mzd
                    public void onSuccess(z6e z6eVar, ozd ozdVar) {
                        Bitmap c;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("10b3127c", new Object[]{this, z6eVar, ozdVar});
                            return;
                        }
                        v7t.i(TBUploadService.TAG, "upload success");
                        nswVar2.k();
                        nswVar2.b("url", gVar.b);
                        nswVar2.b(gl4.CONFIG_LOCAL_PATH, gVar.f1797a);
                        String a2 = ozdVar.a();
                        nswVar2.b("resourceURL", a2);
                        nswVar2.b("isLastPic", String.valueOf(gVar.l));
                        nswVar2.b("mutipleSelection", gVar.j);
                        nswVar2.b("tempFilePath", gVar.r);
                        nswVar2.a("selectSize", Integer.valueOf(gVar.s));
                        nswVar2.b("identifier", gVar.h);
                        WVCamera.g gVar2 = gVar;
                        if (gVar2.p && (c = voe.c(gVar2.f1797a, 1024)) != null) {
                            nswVar2.b("base64Data", itw.a(c));
                        }
                        int lastIndexOf = a2.lastIndexOf("/") + 1;
                        if (lastIndexOf != 0) {
                            nswVar2.b(lf9.KEY_TFS_KEY, a2.substring(lastIndexOf));
                        }
                        WVCamera.g gVar3 = gVar;
                        if (gVar3.l) {
                            nswVar2.c("images", gVar3.o);
                        }
                        Message.obtain(TBUploadService.access$100(TBUploadService.this), 2002, nswVar2).sendToTarget();
                    }
                }, this.mHandler);
                v7t.i(TAG, "do aus upload " + gVar.f1797a);
            } catch (Throwable th) {
                v7t.n(TAG, "try aus upload error : " + th.getMessage());
                try {
                    UploadFileInfo uploadFileInfo = new UploadFileInfo();
                    uploadFileInfo.setFilePath(createTempFile.getAbsolutePath());
                    uploadFileInfo.setBizCode(gVar.e);
                    uploadFileInfo.setPrivateData(gVar.f);
                    nswVar2.b("identifier", gVar.h);
                    nswVar2.b("isLastPic", String.valueOf(gVar.l));
                    nswVar2.b("mutipleSelection", gVar.j);
                    FileUploadMgr.getInstance().addTask(uploadFileInfo, new FileUploadBaseListener() { // from class: android.taobao.windvane.extra.jsbridge.TBUploadService.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // mtopsdk.mtop.upload.FileUploadListener
                        public void onError(String str, String str2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
                                return;
                            }
                            if (v7t.h()) {
                                v7t.n(TBUploadService.TAG, "mtop upload file error. code: " + str + ";msg: " + str2);
                            }
                            nswVar2.b("errorCode", str);
                            nswVar2.b("errorMsg", str2);
                            nswVar2.b(gl4.CONFIG_LOCAL_PATH, gVar.f1797a);
                            nswVar2.b("tempFilePath", gVar.r);
                            nswVar2.a("selectSize", Integer.valueOf(gVar.s));
                            nswVar2.b("identifier", gVar.h);
                            Message.obtain(TBUploadService.access$100(TBUploadService.this), 2003, nswVar2).sendToTarget();
                        }

                        @Override // mtopsdk.mtop.upload.FileUploadBaseListener, mtopsdk.mtop.upload.FileUploadListener
                        public void onFinish(UploadFileInfo uploadFileInfo2, String str) {
                            Bitmap c;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("57d514e0", new Object[]{this, uploadFileInfo2, str});
                                return;
                            }
                            nswVar2.k();
                            nswVar2.b("url", gVar.b);
                            nswVar2.b(gl4.CONFIG_LOCAL_PATH, gVar.f1797a);
                            nswVar2.b("resourceURL", str);
                            nswVar2.b("tempFilePath", gVar.r);
                            nswVar2.a("selectSize", Integer.valueOf(gVar.s));
                            nswVar2.b("identifier", gVar.h);
                            WVCamera.g gVar2 = gVar;
                            if (gVar2.p && (c = voe.c(gVar2.f1797a, 1024)) != null) {
                                nswVar2.b("base64Data", itw.a(c));
                            }
                            int lastIndexOf = str.lastIndexOf("/") + 1;
                            if (lastIndexOf != 0) {
                                nswVar2.b(lf9.KEY_TFS_KEY, str.substring(lastIndexOf));
                            }
                            WVCamera.g gVar3 = gVar;
                            if (gVar3.l) {
                                nswVar2.c("images", gVar3.o);
                            }
                            Message.obtain(TBUploadService.access$100(TBUploadService.this), 2002, nswVar2).sendToTarget();
                        }

                        @Override // mtopsdk.mtop.upload.FileUploadBaseListener, mtopsdk.mtop.upload.FileUploadListener
                        public void onProgress(int i) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
                            }
                        }

                        @Override // mtopsdk.mtop.upload.FileUploadBaseListener, mtopsdk.mtop.upload.FileUploadListener
                        public void onStart() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7f2d84ca", new Object[]{this});
                                return;
                            }
                            nswVar2.j("");
                            Message.obtain(TBUploadService.access$100(TBUploadService.this), 2001, nswVar2).sendToTarget();
                        }

                        @Override // mtopsdk.mtop.upload.FileUploadBaseListener
                        public void onError(String str, String str2, String str3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("ffe51d4e", new Object[]{this, str, str2, str3});
                                return;
                            }
                            if (v7t.h()) {
                                v7t.n(TBUploadService.TAG, "mtop upload file error. code: " + str2 + ";msg: " + str3 + ";type: " + str);
                            }
                            nswVar2.b("errorType", str);
                            nswVar2.b("errorCode", str2);
                            nswVar2.b("errorMsg", str3);
                            nswVar2.b(gl4.CONFIG_LOCAL_PATH, gVar.f1797a);
                            nswVar2.b("tempFilePath", gVar.r);
                            nswVar2.a("selectSize", Integer.valueOf(gVar.s));
                            nswVar2.b("identifier", gVar.h);
                            Message.obtain(TBUploadService.access$100(TBUploadService.this), 2003, nswVar2).sendToTarget();
                        }

                        @Override // mtopsdk.mtop.upload.FileUploadListener
                        public void onFinish(String str) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("99807463", new Object[]{this, str});
                                return;
                            }
                            nswVar2.k();
                            nswVar2.b("url", gVar.b);
                            nswVar2.b(gl4.CONFIG_LOCAL_PATH, gVar.f1797a);
                            nswVar2.b("resourceURL", str);
                            int lastIndexOf = str.lastIndexOf("/") + 1;
                            if (lastIndexOf != 0) {
                                nswVar2.b(lf9.KEY_TFS_KEY, str.substring(lastIndexOf));
                            }
                            WVCamera.g gVar2 = gVar;
                            if (gVar2.l) {
                                nswVar2.c("images", gVar2.o);
                            }
                            nswVar2.b("tempFilePath", gVar.r);
                            nswVar2.a("selectSize", Integer.valueOf(gVar.s));
                            nswVar2.b("identifier", gVar.h);
                            Message.obtain(TBUploadService.access$100(TBUploadService.this), 2002, nswVar2).sendToTarget();
                        }
                    }, gVar.n);
                    v7t.i(TAG, "do mtop upload " + gVar.f1797a);
                } catch (Throwable th2) {
                    v7t.d(TAG, "mtop sdk not exist." + th2.getMessage());
                }
            }
        } catch (IOException e) {
            v7t.d(TAG, x74.i(e));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:30|(1:32)|33|99|34|109|35|97|36|107|37|101|38|(10:117|39|105|40|103|41|113|42|(1:44)|47)|48|70|115|71|(1:73)|76|(1:78)(3:79|(2:81|(1:(1:84)(1:85)))(4:86|(1:88)|89|(1:91))|92)|93|94) */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017d, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017e, code lost:
        tb.v7t.d(android.taobao.windvane.extra.jsbridge.TBUploadService.TAG, tb.x74.i(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0179 A[Catch: JSONException -> 0x017d, TRY_LEAVE, TryCatch #9 {JSONException -> 0x017d, blocks: (B:71:0x0168, B:73:0x0179), top: B:115:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0199  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean handleMessage(android.os.Message r24) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.jsbridge.TBUploadService.handleMessage(android.os.Message):boolean");
    }
}
