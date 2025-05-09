package com.taobao.browser.jsbridge.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.jsbridge.ui.TMCameraPreviewView;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import tb.s0m;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CameraController extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mCtx;
    private RelativeLayout mLayout = null;
    private TMCameraPreviewView cameraView = null;
    private String mPath = "";

    static {
        t2o.a(619708556);
    }

    public CameraController(Context context) {
        super(context);
        this.mCtx = context;
        init();
    }

    public static /* synthetic */ void access$000(CameraController cameraController, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6abb378", new Object[]{cameraController, bArr});
        } else {
            cameraController.saveImg(bArr);
        }
    }

    public static /* synthetic */ TMCameraPreviewView access$100(CameraController cameraController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMCameraPreviewView) ipChange.ipc$dispatch("51cc86be", new Object[]{cameraController});
        }
        return cameraController.cameraView;
    }

    public static /* synthetic */ Context access$200(CameraController cameraController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("4430dea7", new Object[]{cameraController});
        }
        return cameraController.mCtx;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.mCtx).inflate(R.layout.camera, (ViewGroup) null);
        this.mLayout = relativeLayout;
        TMCameraPreviewView tMCameraPreviewView = (TMCameraPreviewView) relativeLayout.findViewById(R.id.sf_carema_preview);
        this.cameraView = tMCameraPreviewView;
        tMCameraPreviewView.hasFlash();
        this.cameraView.setOnCameraStatusListener(new TMCameraPreviewView.OnCameraStatusListener() { // from class: com.taobao.browser.jsbridge.ui.CameraController.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.browser.jsbridge.ui.TMCameraPreviewView.OnCameraStatusListener
            public void onAutoFocus(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7490423", new Object[]{this, new Boolean(z)});
                }
            }

            @Override // com.taobao.browser.jsbridge.ui.TMCameraPreviewView.OnCameraStatusListener
            public void onCameraStopped(final byte[] bArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51320017", new Object[]{this, bArr});
                } else {
                    AsyncTask.execute(new Runnable() { // from class: com.taobao.browser.jsbridge.ui.CameraController.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                CameraController.access$000(CameraController.this, bArr);
                            }
                        }
                    });
                }
            }
        });
        this.cameraView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.browser.jsbridge.ui.CameraController.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    CameraController.access$100(CameraController.this).autoFocus();
                }
            }
        });
        ViewProxy.setOnClickListener(this.mLayout.findViewById(R.id.ib_take_picture), new View.OnClickListener() { // from class: com.taobao.browser.jsbridge.ui.CameraController.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    CameraController.access$100(CameraController.this).takePicture();
                }
            }
        });
        ViewProxy.setOnClickListener(this.mLayout.findViewById(R.id.tm_camera_back), new View.OnClickListener() { // from class: com.taobao.browser.jsbridge.ui.CameraController.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                ((Activity) CameraController.access$200(CameraController.this)).setResult(0);
                ((Activity) CameraController.access$200(CameraController.this)).finish();
            }
        });
        ViewProxy.setOnClickListener(this.mLayout.findViewById(R.id.tm_camera_change), new View.OnClickListener() { // from class: com.taobao.browser.jsbridge.ui.CameraController.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    CameraController.access$100(CameraController.this).setCameraFront(true ^ CameraController.access$100(CameraController.this).isFrontCamera());
                }
            }
        });
        addView(this.mLayout);
    }

    public static /* synthetic */ Object ipc$super(CameraController cameraController, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/ui/CameraController");
    }

    private void saveImg(byte[] bArr) {
        Throwable th;
        IOException e;
        FileOutputStream fileOutputStream;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d722814", new Object[]{this, bArr});
            return;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        if (i2 <= i3) {
            if (i3 > 720) {
                i = i3 / 720;
            }
        } else if (i2 > 720) {
            i = i2 / 720;
        }
        options.inSampleSize = i;
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        Matrix matrix = new Matrix();
        if (this.cameraView.isFrontCamera()) {
            matrix.postRotate(270.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else {
            matrix.postRotate(90.0f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
        if (decodeByteArray != createBitmap) {
            decodeByteArray.recycle();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(new File(this.mPath));
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        try {
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 40, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            ((Activity) this.mCtx).setResult(-1);
            ((Activity) this.mCtx).finish();
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
        ((Activity) this.mCtx).setResult(-1);
        ((Activity) this.mCtx).finish();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.mCtx = null;
        }
    }

    public void initData(String str, String str2, String str3, String str4, String str5) {
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a116f913", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        this.mPath = str;
        if ("front".equalsIgnoreCase(str2)) {
            this.cameraView.setCameraFront(true);
        } else {
            this.cameraView.setCameraFront(false);
        }
        try {
            i = Integer.valueOf(str4).intValue();
        } catch (NumberFormatException unused) {
            i = 0;
        }
        try {
            i3 = Integer.valueOf(str5).intValue();
        } catch (NumberFormatException unused2) {
        }
        StringBuilder sb = new StringBuilder("width_origin=[");
        sb.append(i);
        sb.append("];height_origin=[");
        sb.append(i3);
        sb.append("]");
        int i4 = this.mCtx.getResources().getDisplayMetrics().widthPixels;
        int i5 = this.mCtx.getResources().getDisplayMetrics().heightPixels;
        float f = i5 / (i4 * 1.0f);
        if (i == i3) {
            i2 = i4;
        } else {
            if (i > i3) {
                int i6 = i ^ i3;
                i3 ^= i6;
                i = i6 ^ i3;
            }
            float f2 = i3;
            float f3 = i * 1.0f;
            if (f2 / f3 < f) {
                i2 = (int) ((i3 * i4) / f3);
            } else {
                i4 = (int) ((i * i5) / (f2 * 1.0f));
                i2 = i5;
            }
        }
        StringBuilder sb2 = new StringBuilder("width_modify=[");
        sb2.append(i4);
        sb2.append("];height_modify=[");
        sb2.append(i2);
        sb2.append("]");
        ImageView imageView = (ImageView) this.mLayout.findViewById(R.id.iv_mask_picture);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i4;
        imageView.setLayoutParams(layoutParams);
        try {
            s0m.B().T(str3).into(imageView);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
    }
}
