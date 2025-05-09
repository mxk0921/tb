package android.taobao.windvane.extra.uc;

import android.content.Context;
import android.taobao.windvane.extra.core.WVCore;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.extension.ExtImageDecoder;
import com.uc.webview.export.extension.GlobalSettings;
import com.uc.webview.export.extension.SettingKeys;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bzn;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.wpw;
import tb.x74;
import tb.y71;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ExtImgDecoder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ExtImgDecoder";
    private static volatile ExtImgDecoder sInstance;
    private boolean mUseAlphaChannelDecoder;
    private static boolean sUcDecoderEnable = true;
    private static final AtomicBoolean inited = new AtomicBoolean(false);
    private static int sDecodeErrorCount = 0;
    private DecoderListener heicDecodeListener = new DecoderListener("ftypheic");
    private DecoderListener mifDecodeListener = new DecoderListener("ftypmif1");

    static {
        t2o.a(989856061);
    }

    public static int getDecodeErrorCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fe4eee5", new Object[0])).intValue();
        }
        return sDecodeErrorCount;
    }

    public static ExtImgDecoder getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtImgDecoder) ipChange.ipc$dispatch("d93cbaf", new Object[0]);
        }
        if (sInstance == null) {
            synchronized (ExtImgDecoder.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new ExtImgDecoder();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public static void markDecodeError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33d89b4", new Object[0]);
        } else {
            sDecodeErrorCount++;
        }
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (inited.compareAndSet(false, true)) {
            initInternal(context);
        }
    }

    public void initDecoderSwitch(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ae24b9", new Object[]{this, context});
            return;
        }
        try {
            v7t.d(TAG, "initDocederSwitch enable:" + vpw.commonConfig.H);
            sUcDecoderEnable = isExtImgDecoderEnable();
            GlobalSettings.set(SettingKeys.ExtImgDecoderOn, sUcDecoderEnable);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean useAlphaChannelDecoder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25034643", new Object[]{this})).booleanValue();
        }
        return this.mUseAlphaChannelDecoder;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class DecoderListener implements ExtImageDecoder.ImageDecoderListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String format;
        private boolean imageDecodeSuccess = false;

        static {
            t2o.a(989856062);
        }

        public DecoderListener(String str) {
            this.format = str;
        }

        public static /* synthetic */ boolean access$000(DecoderListener decoderListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2abfbfd2", new Object[]{decoderListener})).booleanValue();
            }
            return decoderListener.imageDecodeSuccess;
        }

        @Override // com.uc.webview.base.IExtender
        public Object invoke(int i, Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("759fd805", new Object[]{this, new Integer(i), objArr});
            }
            v7t.d(ExtImgDecoder.TAG, "invoke() called with: methodID = [" + i + "], params = [" + objArr + "]");
            return null;
        }

        @Override // com.uc.webview.export.extension.ExtImageDecoder.ImageDecoderListener
        public void onDecode(String str, String str2, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4be3f23b", new Object[]{this, str, str2, new Integer(i)});
            } else if (i != 0) {
                v7t.d(ExtImgDecoder.TAG, "onDecode url = " + str + " format = " + str2 + " result = " + i);
                y71.commitFail(y71.MONITOR_POINT_DECODE_IMG_URL_TYPE, i, str2, str);
            } else {
                y71.commitCounter(y71.MONITOR_POINT_DECODE_IMG_TYPE, "success", 1.0d);
            }
        }

        @Override // com.uc.webview.export.extension.ExtImageDecoder.ImageDecoderListener
        public void onInit(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebf9012d", new Object[]{this, new Integer(i)});
                return;
            }
            v7t.d(ExtImgDecoder.TAG, "DecoderListener onInit " + i);
            if (i == 0) {
                v7t.d(ExtImgDecoder.TAG, "ok");
                this.imageDecodeSuccess = true;
                y71.commitSuccess(y71.MONITOR_POINT_DECODER_INIT_TYPE, this.format);
            } else if (i == 1) {
                v7t.d(ExtImgDecoder.TAG, "can't load library");
                y71.commitFail(y71.MONITOR_POINT_DECODER_INIT_TYPE, i, "can't load library", this.format);
            } else if (i == 2) {
                v7t.d(ExtImgDecoder.TAG, "can't load function");
                y71.commitFail(y71.MONITOR_POINT_DECODER_INIT_TYPE, i, "can't load function", this.format);
            } else if (i != 3) {
                v7t.d(ExtImgDecoder.TAG, "unknown");
                y71.commitFail(y71.MONITOR_POINT_DECODER_INIT_TYPE, i, "unknown", this.format);
            } else {
                v7t.d(ExtImgDecoder.TAG, "uc core not support");
                y71.commitFail(y71.MONITOR_POINT_DECODER_INIT_TYPE, i, "uc core not support", this.format);
            }
        }
    }

    public boolean isExchangeImgUrlEnable() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d48b9fe7", new Object[]{this})).booleanValue();
        }
        try {
            vpw.b();
            z = vpw.commonConfig.I;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (!z) {
            v7t.d(TAG, "enableExchangeImgUrl: " + z);
        }
        return z;
    }

    public boolean isExtImgDecoderEnable() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69a7f9a6", new Object[]{this})).booleanValue();
        }
        try {
            vpw.b();
            z = vpw.commonConfig.H;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (!z) {
            v7t.d(TAG, "isExtImgDecoderEnable: " + z);
        }
        return z;
    }

    private boolean isExtImgDecoderSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ac64f6", new Object[]{this})).booleanValue();
        }
        return DecoderListener.access$000(this.heicDecodeListener) && DecoderListener.access$000(this.mifDecodeListener);
    }

    public boolean canExtImgDecoder() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e361f99d", new Object[]{this})).booleanValue();
        }
        try {
            z = isExtImgDecoderEnable();
        } catch (Throwable th) {
            th.printStackTrace();
            z = true;
        }
        return z && isExtImgDecoderSuccess();
    }

    public void initInternal(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db22054", new Object[]{this, context});
            return;
        }
        try {
            v7t.d(TAG, "init");
            if (!isExtImgDecoderEnable()) {
                v7t.d(TAG, "NOT enableExtImgDecoder");
                if (isExtImgDecoderSuccess()) {
                    v7t.d(TAG, "Close image decoder");
                    GlobalSettings.set(SettingKeys.ExtImgDecoderOn, false);
                }
            } else if (!sUcDecoderEnable) {
                v7t.d(TAG, "ucDecoder not Enable, abort");
            } else if (isExtImgDecoderSuccess()) {
                v7t.d(TAG, "setExtImageDecoderSuccessed, abort");
            } else {
                String str = "ucheif";
                wpw wpwVar = vpw.commonConfig;
                if (wpwVar.s1) {
                    if (wpwVar.m3) {
                        str = "ucheif_alpha1";
                    } else {
                        str = "ucheif_alpha";
                    }
                    this.mUseAlphaChannelDecoder = true;
                }
                v7t.d(TAG, "supportAlphaChannel: " + this.mUseAlphaChannelDecoder + " soName: " + str);
                String d = bzn.b().d(str).d();
                if (TextUtils.isEmpty(d)) {
                    inited.set(false);
                    v7t.d(TAG, "so don't exist");
                } else if (!WVCore.getInstance().isUCSupport()) {
                    inited.set(false);
                    v7t.d(TAG, "uc core not ready");
                } else {
                    String[] strArr = {context.getApplicationInfo().nativeLibraryDir + "/libc++_shared.so"};
                    if (new File(d).exists()) {
                        ExtImageDecoder.ExtImageDecoderParam extImageDecoderParam = new ExtImageDecoder.ExtImageDecoderParam();
                        extImageDecoderParam.format = "ftypheic";
                        extImageDecoderParam.version = "0.1.0";
                        extImageDecoderParam.filenameExtension = "heic";
                        extImageDecoderParam.headerLength = 20;
                        extImageDecoderParam.progressiveDecode = true;
                        extImageDecoderParam.mime = "image/heic";
                        extImageDecoderParam.sniffOffset = 4;
                        extImageDecoderParam.decoderPath = d;
                        extImageDecoderParam.dependedPath = strArr;
                        ExtImageDecoder.ExtImageDecoderParam extImageDecoderParam2 = new ExtImageDecoder.ExtImageDecoderParam();
                        extImageDecoderParam2.format = "ftypmif1";
                        extImageDecoderParam2.version = "0.1.0";
                        extImageDecoderParam2.filenameExtension = "heic";
                        extImageDecoderParam2.headerLength = 20;
                        extImageDecoderParam2.progressiveDecode = true;
                        extImageDecoderParam2.mime = "image/heif";
                        extImageDecoderParam2.sniffOffset = 4;
                        extImageDecoderParam2.decoderPath = d;
                        extImageDecoderParam2.dependedPath = strArr;
                        ExtImageDecoder.setExtImageDecoder(extImageDecoderParam, this.heicDecodeListener);
                        ExtImageDecoder.setExtImageDecoder(extImageDecoderParam2, this.mifDecodeListener);
                        v7t.d(TAG, "setExtImageDecoder over");
                        return;
                    }
                    inited.set(false);
                    v7t.d(TAG, "!! error " + d);
                }
            }
        } catch (Throwable th) {
            inited.set(false);
            v7t.d(TAG, x74.i(th));
        }
    }
}
