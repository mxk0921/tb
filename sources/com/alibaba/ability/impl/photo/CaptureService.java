package com.alibaba.ability.impl.photo;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.abilityidl.ability.PhotoTakeFromScreenSuccessResult;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.a07;
import tb.aig;
import tb.ckf;
import tb.e73;
import tb.iih;
import tb.lw3;
import tb.t2o;
import tb.x8d;
import tb.xhv;
import tb.y1m;
import tb.ywo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class CaptureService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, x8d> f2003a = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(126877699);
        }

        public a() {
        }

        @JvmStatic
        public final void a(Intent intent, Context context, x8d x8dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfa3adc6", new Object[]{this, intent, context, x8dVar});
                return;
            }
            ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            ckf.g(context, "context");
            String uuid = UUID.randomUUID().toString();
            ckf.f(uuid, "UUID.randomUUID().toString()");
            CaptureService.a().put(uuid, x8dVar);
            intent.putExtra("cb_uuid", uuid);
            context.startForegroundService(intent);
        }

        @JvmStatic
        public final void b(Intent intent, Context context, x8d x8dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4066bde3", new Object[]{this, intent, context, x8dVar});
                return;
            }
            ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            ckf.g(context, "context");
            ckf.g(x8dVar, "abilityCallBack");
            String uuid = UUID.randomUUID().toString();
            ckf.f(uuid, "UUID.randomUUID().toString()");
            CaptureService.a().put(uuid, x8dVar);
            intent.putExtra("cb_uuid", uuid);
            context.startService(intent);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements ImageReader.OnImageAvailableListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2004a = true;
        public final /* synthetic */ Ref$BooleanRef c;
        public final /* synthetic */ Ref$BooleanRef d;
        public final /* synthetic */ x8d e;
        public final /* synthetic */ Ref$ObjectRef f;
        public final /* synthetic */ MediaProjection g;
        public final /* synthetic */ Context h;
        public final /* synthetic */ boolean i;

        public b(Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, x8d x8dVar, Ref$ObjectRef ref$ObjectRef, MediaProjection mediaProjection, Context context, boolean z) {
            this.c = ref$BooleanRef;
            this.d = ref$BooleanRef2;
            this.e = x8dVar;
            this.f = ref$ObjectRef;
            this.g = mediaProjection;
            this.h = context;
            this.i = z;
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ ImageReader b;

            /* compiled from: Taobao */
            /* renamed from: com.alibaba.ability.impl.photo.CaptureService$b$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
            public static final class RunnableC0050a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ int b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ ByteBuffer f;
                public final /* synthetic */ Image g;

                /* compiled from: Taobao */
                /* renamed from: com.alibaba.ability.impl.photo.CaptureService$b$a$a$a  reason: collision with other inner class name */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
                public static final class RunnableC0051a implements Runnable {
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    public final /* synthetic */ Ref$ObjectRef b;

                    public RunnableC0051a(Ref$ObjectRef ref$ObjectRef) {
                        this.b = ref$ObjectRef;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        x8d x8dVar = b.this.e;
                        if (x8dVar != null) {
                            PhotoTakeFromScreenSuccessResult photoTakeFromScreenSuccessResult = new PhotoTakeFromScreenSuccessResult();
                            photoTakeFromScreenSuccessResult.url = null;
                            photoTakeFromScreenSuccessResult.localPath = (String) this.b.element;
                            xhv xhvVar = xhv.INSTANCE;
                            x8dVar.a1(photoTakeFromScreenSuccessResult);
                        }
                    }
                }

                /* compiled from: Taobao */
                /* renamed from: com.alibaba.ability.impl.photo.CaptureService$b$a$a$b  reason: collision with other inner class name */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
                public static final class RunnableC0052b implements Runnable {
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    public final /* synthetic */ Exception b;

                    public RunnableC0052b(Exception exc) {
                        this.b = exc;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        x8d x8dVar = b.this.e;
                        if (x8dVar != null) {
                            x8dVar.O(new ErrorResult(y1m.ERROR_CODE_CAPTURE_ERROR, "parse screen img error " + this.b, (Map) null, 4, (a07) null));
                        }
                    }
                }

                public RunnableC0050a(int i, int i2, int i3, int i4, ByteBuffer byteBuffer, Image image) {
                    this.b = i;
                    this.c = i2;
                    this.d = i3;
                    this.e = i4;
                    this.f = byteBuffer;
                    this.g = image;
                }

                /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.String] */
                /* JADX WARN: Type inference failed for: r8v6, types: [T, java.lang.String] */
                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(this.b + (this.c / this.d), this.e, Bitmap.Config.ARGB_8888);
                        createBitmap.copyPixelsFromBuffer(this.f);
                        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, this.b, this.e);
                        this.g.close();
                        if (createBitmap2 != null) {
                            String str = String.valueOf(SystemClock.elapsedRealtime()) + ".jpg";
                            StringBuilder sb = new StringBuilder();
                            File externalCacheDir = b.this.h.getExternalCacheDir();
                            sb.append(externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null);
                            String str2 = File.separator;
                            sb.append(str2);
                            sb.append("megaImage");
                            sb.append(str2);
                            sb.append(str);
                            File file = new File(sb.toString());
                            if (file.exists()) {
                                file.delete();
                            }
                            if (!file.getParentFile().exists()) {
                                file.getParentFile().mkdirs();
                            }
                            file.createNewFile();
                            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                            ref$ObjectRef.element = file.getAbsolutePath();
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            createBitmap2.compress(Bitmap.CompressFormat.JPEG, 60, byteArrayOutputStream);
                            byteArrayOutputStream.writeTo(fileOutputStream);
                            byteArrayOutputStream.flush();
                            xhv xhvVar = xhv.INSTANCE;
                            lw3.a(byteArrayOutputStream, null);
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            lw3.a(fileOutputStream, null);
                            b bVar = b.this;
                            if (bVar.i) {
                                try {
                                    ref$ObjectRef.element = MediaStore.Images.Media.insertImage(bVar.h.getContentResolver(), (String) ref$ObjectRef.element, str, (String) null);
                                    Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                                    intent.setData(Uri.fromFile(file));
                                    b.this.h.sendBroadcast(intent);
                                } catch (FileNotFoundException unused) {
                                }
                            }
                            MegaUtils.A(new RunnableC0051a(ref$ObjectRef), 0L, 2, null);
                        }
                    } catch (Exception e) {
                        MegaUtils.A(new RunnableC0052b(e), 0L, 2, null);
                        iih.INSTANCE.a(y1m.TAG_IMG, "parse screen img error = " + e);
                    }
                }
            }

            public a(ImageReader imageReader) {
                this.b = imageReader;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    ImageReader imageReader = this.b;
                    Image acquireLatestImage = imageReader != null ? imageReader.acquireLatestImage() : null;
                    if (acquireLatestImage != null) {
                        Log.e(y1m.TAG_IMG, "acquireLatestImage is not null ");
                        this.b.setOnImageAvailableListener(null, null);
                        int width = acquireLatestImage.getWidth();
                        int height = acquireLatestImage.getHeight();
                        Image.Plane[] planes = acquireLatestImage.getPlanes();
                        if (!(planes == null || planes.length == 0)) {
                            Image.Plane plane = planes[0];
                            ckf.f(plane, "planes[0]");
                            ByteBuffer buffer = plane.getBuffer();
                            Image.Plane plane2 = planes[0];
                            ckf.f(plane2, "planes[0]");
                            int pixelStride = plane2.getPixelStride();
                            Image.Plane plane3 = planes[0];
                            ckf.f(plane3, "planes[0]");
                            int rowStride = plane3.getRowStride() - (pixelStride * width);
                            VirtualDisplay virtualDisplay = (VirtualDisplay) b.this.f.element;
                            if (virtualDisplay != null) {
                                virtualDisplay.release();
                            }
                            b bVar = b.this;
                            bVar.f.element = null;
                            MediaProjection mediaProjection = bVar.g;
                            if (mediaProjection != null) {
                                mediaProjection.stop();
                            }
                            CaptureService.this.stopForeground(true);
                            MegaUtils.C(new RunnableC0050a(width, rowStride, pixelStride, height, buffer, acquireLatestImage));
                            return;
                        }
                        x8d x8dVar = b.this.e;
                        if (x8dVar != null) {
                            x8dVar.O(new ErrorResult(y1m.ERROR_CODE_CAPTURE_ERROR, "pixel planes is null", (Map) null, 4, (a07) null));
                            return;
                        }
                        return;
                    }
                    x8d x8dVar2 = b.this.e;
                    if (x8dVar2 != null) {
                        x8dVar2.O(new ErrorResult(y1m.ERROR_CODE_CAPTURE_ERROR, "image is null", (Map) null, 4, (a07) null));
                    }
                    VirtualDisplay virtualDisplay2 = (VirtualDisplay) b.this.f.element;
                    if (virtualDisplay2 != null) {
                        virtualDisplay2.release();
                    }
                    b bVar2 = b.this;
                    bVar2.f.element = null;
                    MediaProjection mediaProjection2 = bVar2.g;
                    if (mediaProjection2 != null) {
                        mediaProjection2.stop();
                    }
                    CaptureService.this.stopForeground(true);
                } catch (Throwable th) {
                    x8d x8dVar3 = b.this.e;
                    if (x8dVar3 != null) {
                        x8dVar3.O(new ErrorResult(y1m.ERROR_CODE_CAPTURE_ERROR, "onImageAvailable error " + th, (Map) null, 4, (a07) null));
                    }
                    try {
                        VirtualDisplay virtualDisplay3 = (VirtualDisplay) b.this.f.element;
                        if (virtualDisplay3 != null) {
                            virtualDisplay3.release();
                        }
                        b bVar3 = b.this;
                        bVar3.f.element = null;
                        MediaProjection mediaProjection3 = bVar3.g;
                        if (mediaProjection3 != null) {
                            mediaProjection3.stop();
                        }
                        CaptureService.this.stopForeground(true);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a1c131a", new Object[]{this, imageReader});
                return;
            }
            Log.e(y1m.TAG_IMG, "setOnImageAvailableListener");
            this.c.element = true;
            if (this.f2004a && !this.d.element) {
                this.f2004a = false;
                MegaUtils.z(new a(imageReader), 500L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref$BooleanRef b;
        public final /* synthetic */ Ref$BooleanRef c;
        public final /* synthetic */ MediaProjection d;
        public final /* synthetic */ ImageReader e;
        public final /* synthetic */ Ref$ObjectRef f;
        public final /* synthetic */ x8d g;

        public c(Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, MediaProjection mediaProjection, ImageReader imageReader, Ref$ObjectRef ref$ObjectRef, x8d x8dVar) {
            this.b = ref$BooleanRef;
            this.c = ref$BooleanRef2;
            this.d = mediaProjection;
            this.e = imageReader;
            this.f = ref$ObjectRef;
            this.g = x8dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.b.element) {
                this.c.element = true;
                try {
                    MediaProjection mediaProjection = this.d;
                    if (mediaProjection != null) {
                        mediaProjection.stop();
                    }
                    this.e.setOnImageAvailableListener(null, null);
                    this.e.close();
                } catch (Exception unused) {
                }
                VirtualDisplay virtualDisplay = (VirtualDisplay) this.f.element;
                if (virtualDisplay != null) {
                    virtualDisplay.release();
                    this.f.element = null;
                    CaptureService.this.stopForeground(true);
                    x8d x8dVar = this.g;
                    if (x8dVar != null) {
                        x8dVar.O(new ErrorResult(y1m.ERROR_CODE_CAPTURE_ERROR, "screen capture timeout", (Map) null, 4, (a07) null));
                    }
                }
            }
        }
    }

    static {
        t2o.a(126877698);
    }

    public static final /* synthetic */ HashMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("2dee34c3", new Object[0]);
        }
        return f2003a;
    }

    public static /* synthetic */ Object ipc$super(CaptureService captureService, String str, Object... objArr) {
        if (str.hashCode() == 1992651935) {
            return new Integer(super.onStartCommand((Intent) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/photo/CaptureService");
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("437d9183", new Object[]{this});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            Object systemService = getSystemService(RemoteMessageConst.NOTIFICATION);
            if (systemService != null) {
                e73.a();
                ((NotificationManager) systemService).createNotificationChannel(aig.a("mega_screen_capture", "mega_screen_capture", 2));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(), "mega_screen_capture");
        builder.setContentText("").setWhen(System.currentTimeMillis()).setSmallIcon(17629184);
        if (i >= 26) {
            builder.setChannelId("mega_screen_capture");
        }
        startForeground(110, builder.build());
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String stringExtra;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        Intent intent2 = null;
        x8d remove = (intent == null || (stringExtra = intent.getStringExtra("cb_uuid")) == null) ? null : f2003a.remove(stringExtra);
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                b();
            } catch (Throwable th) {
                if (remove != null) {
                    remove.O(new ErrorResult(y1m.ERROR_CODE_CAPTURE_ERROR, "start foreground service error = " + th, (Map) null, 4, (a07) null));
                }
                return super.onStartCommand(intent, i, i2);
            }
        }
        Intent intent3 = intent != null ? (Intent) intent.getParcelableExtra("data") : null;
        if (intent3 instanceof Intent) {
            intent2 = intent3;
        }
        if (intent != null) {
            z = intent.getBooleanExtra("saveToAlbum", false);
        }
        if (intent2 != null) {
            try {
                Object systemService = getSystemService("media_projection");
                if (systemService != null) {
                    MediaProjection mediaProjection = ((MediaProjectionManager) systemService).getMediaProjection(-1, intent2);
                    Context applicationContext = getApplicationContext();
                    ckf.f(applicationContext, "applicationContext");
                    c(mediaProjection, applicationContext, remove, z);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
                }
            } catch (Throwable th2) {
                stopForeground(true);
                iih iihVar = iih.INSTANCE;
                iihVar.a(y1m.TAG_IMG, "parse screen capture Data error " + th2);
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(MediaProjection mediaProjection, Context context, x8d x8dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b9f2f", new Object[]{this, mediaProjection, context, x8dVar, new Boolean(z)});
            return;
        }
        ckf.g(context, "ctx");
        int i = ywo.b(context).widthPixels;
        int i2 = ywo.b(context).heightPixels;
        ImageReader newInstance = ImageReader.newInstance(i, i2, 1, 1);
        ckf.f(newInstance, "ImageReader.newInstance(…at.RGBA_8888, 1\n        )");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        T t = 0;
        t = 0;
        if (mediaProjection != null) {
            try {
                Resources system = Resources.getSystem();
                ckf.f(system, "Resources.getSystem()");
                t = mediaProjection.createVirtualDisplay("screen-capture", i, i2, system.getDisplayMetrics().densityDpi, 16, newInstance.getSurface(), null, null);
            } catch (Throwable th) {
                stopForeground(true);
                if (x8dVar != null) {
                    x8dVar.O(new ErrorResult(y1m.ERROR_CODE_CAPTURE_ERROR, "create virtual display error = " + th, (Map) null, 4, (a07) null));
                }
                iih iihVar = iih.INSTANCE;
                iihVar.a(y1m.TAG_IMG, "createVirtualDisplay error = " + th);
            }
        }
        if (t != 0) {
            ref$ObjectRef.element = t;
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.element = false;
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            ref$BooleanRef2.element = false;
            newInstance.setOnImageAvailableListener(new b(ref$BooleanRef2, ref$BooleanRef, x8dVar, ref$ObjectRef, mediaProjection, context, z), new Handler(Looper.getMainLooper()));
            MegaUtils.z(new c(ref$BooleanRef2, ref$BooleanRef, mediaProjection, newInstance, ref$ObjectRef, x8dVar), 1500L);
        }
    }
}
