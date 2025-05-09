package com.taobao.interact.core.h5;

import android.content.Context;
import android.os.RemoteException;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.interact.upload.service.FileUploadBaseListener;
import com.taobao.interact.upload.service.MtopInfo;
import com.taobao.interact.upload.service.a;
import com.taobao.interact.upload.service.b;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.frf;
import tb.gl4;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.vxv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class WVInteractsdkUpload extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String UPLOAD_ACTION = "InteractSDKUpload";
    private static final String UPLOAD_FAILED_EVENT_NAME = "WVPhoto.Event.uploadPhotoFailed";
    private static final String UPLOAD_PROGRESS_EVENT_NAME = "WVPhoto.Event.V2.progress";
    private static final String UPLOAD_START_EVENT_NAME = "WVPhoto.Event.prepareUploadPhotoSuccess";
    private static final String UPLOAD_SUCCESS_EVENT_NAME = "WVPhoto.Event.uploadPhotoSuccess";
    private long mBytesTotal;
    private WVCallBackContext mCallback;
    private a mIUpload;
    private int mUploadIndex;
    private int mUploadSuccessCounts;
    private Object mProgressLock = new Object();
    private JSONArray mUploadSuccessArray = new JSONArray();

    static {
        t2o.a(495976461);
    }

    public static /* synthetic */ int access$000(WVInteractsdkUpload wVInteractsdkUpload) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ed4db8f", new Object[]{wVInteractsdkUpload})).intValue();
        }
        return wVInteractsdkUpload.mUploadIndex;
    }

    public static /* synthetic */ WVCallBackContext access$100(WVInteractsdkUpload wVInteractsdkUpload) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("c9cc37b8", new Object[]{wVInteractsdkUpload});
        }
        return wVInteractsdkUpload.mCallback;
    }

    public static /* synthetic */ long access$200(WVInteractsdkUpload wVInteractsdkUpload) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8141814e", new Object[]{wVInteractsdkUpload})).longValue();
        }
        return wVInteractsdkUpload.mBytesTotal;
    }

    public static /* synthetic */ Object access$300(WVInteractsdkUpload wVInteractsdkUpload) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c49d1c19", new Object[]{wVInteractsdkUpload});
        }
        return wVInteractsdkUpload.mProgressLock;
    }

    public static /* synthetic */ int access$400(WVInteractsdkUpload wVInteractsdkUpload) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83ae270b", new Object[]{wVInteractsdkUpload})).intValue();
        }
        return wVInteractsdkUpload.mUploadSuccessCounts;
    }

    public static /* synthetic */ int access$408(WVInteractsdkUpload wVInteractsdkUpload) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("548a1c03", new Object[]{wVInteractsdkUpload})).intValue();
        }
        int i = wVInteractsdkUpload.mUploadSuccessCounts;
        wVInteractsdkUpload.mUploadSuccessCounts = 1 + i;
        return i;
    }

    public static /* synthetic */ JSONArray access$500(WVInteractsdkUpload wVInteractsdkUpload) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("77cb1f59", new Object[]{wVInteractsdkUpload});
        }
        return wVInteractsdkUpload.mUploadSuccessArray;
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            this.mIUpload = new b(context);
        }
    }

    public static /* synthetic */ Object ipc$super(WVInteractsdkUpload wVInteractsdkUpload, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        } else if (hashCode == 1743254097) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1], objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/interact/core/h5/WVInteractsdkUpload");
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (UPLOAD_ACTION.equalsIgnoreCase(str)) {
            try {
                uploadFiles(frf.a(new JSONObject(str2)), wVCallBackContext);
                return true;
            } catch (RemoteException e) {
                e.printStackTrace();
                wVCallBackContext.error(e.getMessage());
            } catch (JSONException e2) {
                e2.printStackTrace();
                wVCallBackContext.error(e2.getMessage());
            }
        }
        return false;
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        init(context);
    }

    public void uploadFiles(frf frfVar, final WVCallBackContext wVCallBackContext) throws RemoteException {
        WVInteractsdkUpload wVInteractsdkUpload = this;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("457840a3", new Object[]{wVInteractsdkUpload, frfVar, wVCallBackContext});
            return;
        }
        wVInteractsdkUpload.mCallback = wVCallBackContext;
        JSONArray jSONArray = frfVar.r;
        if (jSONArray != null) {
            final JSONArray jSONArray2 = frfVar.B;
            final JSONArray jSONArray3 = frfVar.C;
            MtopInfo mtopInfo = new MtopInfo();
            mtopInfo.setBizCode(frfVar.q);
            String str = frfVar.k;
            if (!TextUtils.isEmpty(str)) {
                mtopInfo.setOwnerNick(str);
            }
            final int length = jSONArray.length();
            final long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                wVInteractsdkUpload.mBytesTotal += new File(jSONArray.optString(i)).length();
            }
            int i2 = 0;
            while (i2 < length) {
                wVInteractsdkUpload.mUploadIndex = i2;
                ((b) wVInteractsdkUpload.mIUpload).i(jSONArray.optString(i2), mtopInfo, new FileUploadBaseListener.Stub() { // from class: com.taobao.interact.core.h5.WVInteractsdkUpload.1
                    private int index;
                    private nsw mProgressResult = new nsw();

                    {
                        this.index = WVInteractsdkUpload.access$000(WVInteractsdkUpload.this);
                    }

                    @Override // com.taobao.interact.upload.service.FileUploadBaseListener
                    public void onError(String str2, String str3, String str4) throws RemoteException {
                        nsw nswVar = new nsw();
                        nswVar.k();
                        nswVar.b("errorType", str2);
                        nswVar.b("errorCode", str3);
                        nswVar.b("errorMsg", str4);
                        WVInteractsdkUpload.access$100(WVInteractsdkUpload.this).fireEvent(WVInteractsdkUpload.UPLOAD_FAILED_EVENT_NAME, nswVar.m());
                        wVCallBackContext.error(nswVar);
                    }

                    @Override // com.taobao.interact.upload.service.FileUploadBaseListener
                    public void onFinish(String str2, String str3) throws RemoteException {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.putOpt("resourceURL", str3);
                            jSONObject.putOpt(gl4.CONFIG_LOCAL_PATH, str2);
                            vxv.a a2 = vxv.a(str2);
                            jSONObject.putOpt("width", Integer.valueOf(a2.f30328a));
                            jSONObject.putOpt("height", Integer.valueOf(a2.b));
                            JSONArray jSONArray4 = jSONArray2;
                            if (!(jSONArray4 == null || jSONArray4.length() == 0)) {
                                jSONObject.putOpt("url", jSONArray2.optString(this.index));
                            }
                            JSONArray jSONArray5 = jSONArray3;
                            if (!(jSONArray5 == null || jSONArray5.length() == 0)) {
                                jSONObject.putOpt("watermarks", jSONArray3.optJSONArray(this.index));
                            }
                            WVInteractsdkUpload.access$100(WVInteractsdkUpload.this).fireEvent(WVInteractsdkUpload.UPLOAD_SUCCESS_EVENT_NAME, jSONObject.toString());
                            synchronized (this) {
                                try {
                                    WVInteractsdkUpload.access$408(WVInteractsdkUpload.this);
                                    WVInteractsdkUpload.access$500(WVInteractsdkUpload.this).put(this.index, jSONObject);
                                    if (WVInteractsdkUpload.access$400(WVInteractsdkUpload.this) == length) {
                                        nsw nswVar = new nsw();
                                        nswVar.k();
                                        nswVar.c("images", WVInteractsdkUpload.access$500(WVInteractsdkUpload.this));
                                        WVInteractsdkUpload.access$100(WVInteractsdkUpload.this).success(nswVar);
                                    }
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                    WVInteractsdkUpload.access$100(WVInteractsdkUpload.this).error(e.getMessage());
                                }
                            }
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                            WVInteractsdkUpload.access$100(WVInteractsdkUpload.this).error(e2.getMessage());
                        }
                    }

                    @Override // com.taobao.interact.upload.service.FileUploadBaseListener
                    public void onProgress(long j, long j2) throws RemoteException {
                        this.mProgressResult.k();
                        this.mProgressResult.b("bytesTotal", Long.toString(WVInteractsdkUpload.access$200(WVInteractsdkUpload.this)));
                        synchronized (WVInteractsdkUpload.access$300(WVInteractsdkUpload.this)) {
                            try {
                                long[] jArr2 = jArr;
                                jArr2[this.index] = j;
                                long j3 = 0;
                                for (long j4 : jArr2) {
                                    j3 += j4;
                                }
                                this.mProgressResult.b("bytesWritten", Long.toString(j3));
                                WVInteractsdkUpload.access$100(WVInteractsdkUpload.this).fireEvent(WVInteractsdkUpload.UPLOAD_PROGRESS_EVENT_NAME, this.mProgressResult.m());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }

                    @Override // com.taobao.interact.upload.service.FileUploadBaseListener
                    public void onStart() throws RemoteException {
                        nsw nswVar = new nsw();
                        nswVar.k();
                        WVInteractsdkUpload.access$100(WVInteractsdkUpload.this).fireEvent(WVInteractsdkUpload.UPLOAD_START_EVENT_NAME, nswVar.m());
                    }
                });
                i2++;
                wVInteractsdkUpload = this;
            }
        }
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e7f251", new Object[]{this, context, iWVWebView, obj});
            return;
        }
        super.initialize(context, iWVWebView, obj);
        init(context);
    }
}
