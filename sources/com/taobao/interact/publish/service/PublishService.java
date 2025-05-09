package com.taobao.interact.publish.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.pissarro.external.AspectRatio;
import com.taobao.android.pissarro.external.BitmapSize;
import com.taobao.android.pissarro.external.Config;
import com.taobao.android.pissarro.external.Image;
import com.taobao.android.tao.pissarro.WrapperPissarroService;
import com.taobao.interact.publish.bean.ImageSnapshot;
import com.taobao.interact.publish.service.IPublishService;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.cy3;
import tb.q3m;
import tb.rod;
import tb.tv2;
import tb.wxv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PublishService extends Service implements tv2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ENABLE_POSTURE_KEY = "enable_posture";
    public static final String GROUP_NAME = "ocean";

    /* renamed from: a  reason: collision with root package name */
    public IServiceCallBack f10846a;
    public ImageResultReceiver b;
    public rod c;
    public boolean e;
    public Config d = Config.createDefault();
    public final IPublishService.Stub f = new IPublishService.Stub() { // from class: com.taobao.interact.publish.service.PublishService.1
        @Override // com.taobao.interact.publish.service.IPublishService
        public void callCamera() throws RemoteException {
            PublishService.e(PublishService.this).openCamera(PublishService.c(PublishService.this), PublishService.this);
        }

        @Override // com.taobao.interact.publish.service.IPublishService
        public void callGallery() throws RemoteException {
            PublishService.e(PublishService.this).openAlbum(PublishService.c(PublishService.this), PublishService.this);
        }

        @Override // com.taobao.interact.publish.service.IPublishService
        public void editImage(String str, PublishConfig publishConfig) throws RemoteException {
            initConfig(publishConfig);
            PublishService.e(PublishService.this).editPicture(PublishService.c(PublishService.this), str, PublishService.this);
            cy3.a("editImage");
        }

        @Override // com.taobao.interact.publish.service.IPublishService
        public void initConfig(PublishConfig publishConfig) throws RemoteException {
            PublishService publishService = PublishService.this;
            PublishService.d(publishService, PublishService.f(publishService, publishConfig));
            q3m.c().d(PublishService.c(PublishService.this));
        }

        @Override // com.taobao.interact.publish.service.IPublishService
        public void registerCallback(IServiceCallBack iServiceCallBack) throws RemoteException {
            PublishService.b(PublishService.this, iServiceCallBack);
        }

        @Override // com.taobao.interact.publish.service.IPublishService
        public void showChoiceDialog() throws RemoteException {
            PublishService.e(PublishService.this).openCameraOrAlbum(PublishService.c(PublishService.this), PublishService.this);
            cy3.a("showChoiceDialog");
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class ImageResultReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ImageResultReceiver() {
        }

        public static /* synthetic */ Object ipc$super(ImageResultReceiver imageResultReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/interact/publish/service/PublishService$ImageResultReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            cy3.a("image_snapshot");
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("KEY_IMAGESNAPSHOT");
            if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                Iterator it = parcelableArrayListExtra.iterator();
                while (it.hasNext()) {
                    ImageSnapshot imageSnapshot = (ImageSnapshot) it.next();
                    Image image = new Image();
                    image.setPath(imageSnapshot.getPath());
                    image.setCoverPath(imageSnapshot.getThumbnails());
                    arrayList.add(image);
                }
                try {
                    if (PublishService.a(PublishService.this) != null) {
                        PublishService.a(PublishService.this).onResult(arrayList);
                    }
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static /* synthetic */ IServiceCallBack a(PublishService publishService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IServiceCallBack) ipChange.ipc$dispatch("8c21a2d4", new Object[]{publishService});
        }
        return publishService.f10846a;
    }

    public static /* synthetic */ IServiceCallBack b(PublishService publishService, IServiceCallBack iServiceCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IServiceCallBack) ipChange.ipc$dispatch("6e4d0034", new Object[]{publishService, iServiceCallBack});
        }
        publishService.f10846a = iServiceCallBack;
        return iServiceCallBack;
    }

    public static /* synthetic */ Config c(PublishService publishService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("8edd4c81", new Object[]{publishService});
        }
        return publishService.d;
    }

    public static /* synthetic */ Config d(PublishService publishService, Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("6d8bdb8d", new Object[]{publishService, config});
        }
        publishService.d = config;
        return config;
    }

    public static /* synthetic */ rod e(PublishService publishService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rod) ipChange.ipc$dispatch("a65853f8", new Object[]{publishService});
        }
        return publishService.c;
    }

    public static /* synthetic */ Config f(PublishService publishService, PublishConfig publishConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("809df12d", new Object[]{publishService, publishConfig});
        }
        return publishService.g(publishConfig);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a14b54d6", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(PublishService publishService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else if (hashCode == 1992651935) {
            return new Integer(super.onStartCommand((Intent) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/interact/publish/service/PublishService");
        }
    }

    public final Config g(PublishConfig publishConfig) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("72fce176", new Object[]{this, publishConfig});
        }
        Config.b bVar = new Config.b();
        Config.b J = bVar.K(publishConfig.getBizLine()).L(publishConfig.getBizScene()).c0(publishConfig.getMode()).V(publishConfig.getFinishButtonText()).g0(publishConfig.getVideoBizCode()).Z(publishConfig.getMaxVideoDuration()).a0(publishConfig.getMaxVideoSize()).W(publishConfig.getMaxImageSize()).b0(publishConfig.getMediaType()).H(publishConfig.isAutoUpload()).f0(publishConfig.isUseNewUi()).d0(publishConfig.isMultiable()).X(publishConfig.getMaxMultiCount()).O(publishConfig.isRequestCrop()).P(publishConfig.isRequestFilter()).T(publishConfig.isRequestSticker()).Y(publishConfig.getMaxStickerCount()).Q(publishConfig.isRequestGraffiti()).R(publishConfig.isRequestMosaic()).U(publishConfig.getFacing()).J(publishConfig.getBizCode());
        if (!publishConfig.isEnablePosture() || !this.e || !wxv.a()) {
            z = false;
        }
        J.S(z).h0(publishConfig.getWindowMode()).e0(publishConfig);
        if (publishConfig.isRequestOriginal()) {
            bVar.M(2);
        } else {
            bVar.M(0);
        }
        AspectRatio aspectRatio = publishConfig.getAspectRatio();
        if (aspectRatio != null) {
            bVar.G(new AspectRatio(aspectRatio.getAspectRatioX(), aspectRatio.getAspectRatioY()));
        }
        BitmapSize targetSize = publishConfig.getTargetSize();
        if (targetSize != null) {
            bVar.I(new BitmapSize(targetSize.getWidth(), targetSize.getHeight()));
        }
        return bVar.F();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return this.f;
    }

    @Override // tb.tv2
    public void onCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379d4540", new Object[]{this});
        } else {
            wxv.b(getApplicationContext());
        }
    }

    @Override // tb.tv2
    public void onComplete(List<Image> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef32bb0", new Object[]{this, list});
        } else if (this.f10846a != null) {
            ArrayList arrayList = new ArrayList();
            for (Image image : list) {
                Image image2 = new Image();
                image2.setPath(image.getPath());
                image2.setCoverPath(image.getCoverPath());
                image2.setMediaType(image.getMediaType());
                image2.setResourceUrl(image.getResourceUrl());
                image2.setCoverUrl(image.getCoverUrl());
                image2.setWidth(image.getWidth());
                image2.setHeight(image.getHeight());
                image2.setDuration(image.getDuration());
                image2.setFileId(image.getFileId());
                arrayList.add(image2);
            }
            try {
                this.f10846a.onResult(arrayList);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        if (!h()) {
            NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
            builder.setPriority(-2);
            startForeground(100, builder.build());
        }
        this.b = new ImageResultReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.taobao.interact.publish.action.IMAGE_RESULT");
        registerReceiver(this.b, intentFilter);
        this.c = new WrapperPissarroService(this);
        this.e = "true".equals(OrangeConfig.getInstance().getConfig(GROUP_NAME, ENABLE_POSTURE_KEY, "true"));
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.f10846a = null;
        ImageResultReceiver imageResultReceiver = this.b;
        if (imageResultReceiver != null) {
            unregisterReceiver(imageResultReceiver);
        }
        if (!h()) {
            stopForeground(true);
        }
        super.onDestroy();
        rod rodVar = this.c;
        if (rodVar != null) {
            rodVar.onDestory();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        return super.onStartCommand(intent, i, i2);
    }
}
