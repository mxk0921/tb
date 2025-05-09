package com.taobao.browser.jsbridge;

import android.app.Activity;
import android.content.Intent;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.api.WVCamera;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.jsbridge.ui.CameraActivity;
import com.taobao.browser.jsbridge.ui.chooseImg.ImgFileListActivity;
import com.taobao.browser.utils.BrowserUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONObject;
import tb.kpw;
import tb.nsw;
import tb.opw;
import tb.ql7;
import tb.t2o;
import tb.t4p;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WVCameraPlus extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int REQUEST_CAMERA = 4003;
    private static final int REQUEST_CHOOSE_PHOTO = 4004;
    private static final String TAG = "WVCameraPlus";
    private WVCallBackContext mCallback = null;
    private String mPath = "";
    private String mParams = "";

    static {
        t2o.a(619708524);
    }

    private void copyfile(File file, File file2, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8e56867", new Object[]{this, file, file2, bool});
        } else if (file.exists() && file.isFile() && file.canRead()) {
            if (!file2.getParentFile().exists()) {
                file2.getParentFile().mkdirs();
            }
            if (file2.exists() && bool.booleanValue()) {
                file2.delete();
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileInputStream.close();
                        fileOutputStream.close();
                        return;
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static /* synthetic */ Object ipc$super(WVCameraPlus wVCameraPlus, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/WVCameraPlus");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"takePhotoPlus".equals(str)) {
            return false;
        }
        String str3 = BrowserUtil.f10259a;
        IWVWebView iWVWebView = this.mWebView;
        BrowserUtil.b(TAG, str3, str, iWVWebView != null ? iWVWebView.getUrl() : null, null);
        takePhotoPlus(wVCallBackContext, str2);
        return true;
    }

    @Override // tb.kpw
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        if (v7t.h()) {
            v7t.a(TAG, "takePhoto callback, requestCode: " + i + ";resultCode: " + i2);
        }
        if (i != 4003) {
            if (i == 4004) {
                if (i2 == -1) {
                    ArrayList arrayList = (ArrayList) intent.getExtras().get("fileList");
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        WVCamera wVCamera = new WVCamera();
                        wVCamera.initialize(this.mContext, this.mWebView);
                        String str = "//127.0.0.1/wvcache/photo.jpg?_wvcrc=1&t=" + System.currentTimeMillis();
                        this.mPath = opw.e().b(true) + File.separator + ql7.c(str);
                        copyfile(new File((String) arrayList.get(i3)), new File(this.mPath), Boolean.TRUE);
                        try {
                            JSONObject jSONObject = new JSONObject(this.mParams);
                            jSONObject.put("localUrl", str);
                            wVCamera.takePhotoPlus(this.mCallback, this.mPath, jSONObject.toString());
                        } catch (Exception unused) {
                            v7t.n(TAG, "call takePhoto fail. params error : " + this.mParams);
                            this.mCallback.error();
                            return;
                        }
                    }
                    v7t.l(TAG, intent.getExtras().get("fileList").toString());
                    return;
                }
                v7t.n(TAG, "call takePhoto fail. resultCode: " + i2);
                this.mCallback.error();
            }
        } else if (i2 == -1) {
            WVCamera wVCamera2 = new WVCamera();
            wVCamera2.initialize(this.mContext, this.mWebView);
            wVCamera2.takePhotoPlus(this.mCallback, this.mPath, this.mParams);
        } else {
            v7t.n(TAG, "call takePhotoInteract fail. resultCode: " + i2);
            this.mCallback.error(new nsw());
        }
    }

    public void takePhotoPlus(WVCallBackContext wVCallBackContext, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f53bef3", new Object[]{this, wVCallBackContext, str});
        } else if (this.mContext.getPackageManager().checkPermission(t4p.CAMERA, this.mContext.getPackageName()) == 0) {
            this.mParams = str;
            Intent intent = new Intent();
            this.mCallback = wVCallBackContext;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optString("mode", "camera").equals("camera")) {
                    this.mPath = opw.e().b(true) + File.separator + ql7.c(str2);
                    jSONObject.put("localUrl", "//127.0.0.1/wvcache/photo.jpg?_wvcrc=1&t=" + System.currentTimeMillis());
                    String optString = jSONObject.optString(CameraActivity.CAMERA_TYPE);
                    String optString2 = jSONObject.optString("maskImg");
                    String optString3 = jSONObject.optString(CameraActivity.MASK_WIDTH);
                    String optString4 = jSONObject.optString(CameraActivity.MASK_HEIGHT);
                    intent.setClass(this.mContext, CameraActivity.class);
                    intent.putExtra(CameraActivity.CAMERA_TYPE, optString);
                    intent.putExtra(CameraActivity.MASK_URL, optString2);
                    intent.putExtra(CameraActivity.MASK_WIDTH, optString3);
                    intent.putExtra(CameraActivity.MASK_HEIGHT, optString4);
                    intent.putExtra("path", this.mPath);
                    this.mParams = jSONObject.toString();
                    ((Activity) this.mContext).startActivityForResult(intent, 4003);
                } else if (jSONObject.optInt("mutipleSelection", 0) != 0) {
                    intent.setClass(this.mContext, ImgFileListActivity.class);
                    ((Activity) this.mContext).startActivityForResult(intent, 4004);
                } else {
                    throw new Exception();
                }
            } catch (Exception unused) {
                v7t.d(TAG, "takePhotoPlus fail, params: " + str);
                nsw nswVar = new nsw();
                nswVar.j("HY_PARAM_ERR");
                this.mCallback.error(nswVar);
            }
        } else if (this.mCallback != null) {
            nsw nswVar2 = new nsw();
            nswVar2.b("msg", "NO_PERMISSON");
            this.mCallback.error(nswVar2);
        }
    }
}
