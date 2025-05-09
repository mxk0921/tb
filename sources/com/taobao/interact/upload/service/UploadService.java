package com.taobao.interact.upload.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.interact.upload.service.IUploadService;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.upload.FileUploadBaseListener;
import mtopsdk.mtop.upload.FileUploadMgr;
import mtopsdk.mtop.upload.domain.UploadFileInfo;
import tb.gf9;
import tb.z8j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UploadService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public UploadCallBack f10855a;
    public final List<UploadFileInfo> b = new ArrayList();
    public final IUploadService.Stub c = new IUploadService.Stub() { // from class: com.taobao.interact.upload.service.UploadService.1

        /* compiled from: Taobao */
        /* renamed from: com.taobao.interact.upload.service.UploadService$1$a */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements gf9 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ FileUploadBaseListener f10856a;

            public a(AnonymousClass1 r1, FileUploadBaseListener fileUploadBaseListener) {
                this.f10856a = fileUploadBaseListener;
            }

            public void a(String str, String str2, String str3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ffe51d4e", new Object[]{this, str, str2, str3});
                    return;
                }
                FileUploadBaseListener fileUploadBaseListener = this.f10856a;
                if (fileUploadBaseListener != null) {
                    try {
                        fileUploadBaseListener.onError(str, str2, str3);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }

            public void b(UploadFileInfo uploadFileInfo, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57d514e0", new Object[]{this, uploadFileInfo, str});
                    return;
                }
                FileUploadBaseListener fileUploadBaseListener = this.f10856a;
                if (fileUploadBaseListener != null) {
                    try {
                        fileUploadBaseListener.onFinish(uploadFileInfo.getFilePath(), str);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }

            public void c(long j, long j2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7a56ab73", new Object[]{this, new Long(j), new Long(j2)});
                    return;
                }
                try {
                    FileUploadBaseListener fileUploadBaseListener = this.f10856a;
                    if (fileUploadBaseListener != null) {
                        fileUploadBaseListener.onProgress(j, j2);
                    }
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            public void d() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
                    return;
                }
                try {
                    FileUploadBaseListener fileUploadBaseListener = this.f10856a;
                    if (fileUploadBaseListener != null) {
                        fileUploadBaseListener.onStart();
                    }
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.taobao.interact.upload.service.IUploadService
        public void cancelAll() throws RemoteException {
            if (!UploadService.a(UploadService.this).isEmpty()) {
                for (UploadFileInfo uploadFileInfo : UploadService.a(UploadService.this)) {
                    FileUploadMgr.getInstance().removeTask(uploadFileInfo);
                }
            }
        }

        @Override // com.taobao.interact.upload.service.IUploadService
        public void registerCallback(UploadCallBack uploadCallBack) throws RemoteException {
            UploadService.d(UploadService.this, uploadCallBack);
        }

        @Override // com.taobao.interact.upload.service.IUploadService
        public void uploadFile(String str, MtopInfo mtopInfo, FileUploadBaseListener fileUploadBaseListener) throws RemoteException {
            if (!TextUtils.isEmpty(str)) {
                FileUploadListenerAdapter fileUploadListenerAdapter = new FileUploadListenerAdapter(new a(this, fileUploadBaseListener), str);
                UploadFileInfo uploadFileInfo = new UploadFileInfo();
                uploadFileInfo.setBizCode(mtopInfo.getBizCode());
                uploadFileInfo.setOwnerNick(mtopInfo.getOwnerNick());
                uploadFileInfo.setFilePath(str);
                FileUploadMgr.getInstance().addTask(uploadFileInfo, (FileUploadBaseListener) fileUploadListenerAdapter);
            }
        }

        @Override // com.taobao.interact.upload.service.IUploadService
        public void uploadFiles(List<String> list, MtopInfo mtopInfo) throws RemoteException {
            if (!(list == null || list.isEmpty())) {
                UploadService.a(UploadService.this).clear();
                MultiFileUploadAdapter multiFileUploadAdapter = new MultiFileUploadAdapter(UploadService.b(UploadService.this), list);
                for (String str : list) {
                    UploadFileInfo uploadFileInfo = new UploadFileInfo();
                    uploadFileInfo.setBizCode(mtopInfo.getBizCode());
                    uploadFileInfo.setOwnerNick(mtopInfo.getOwnerNick());
                    uploadFileInfo.setFilePath(str);
                    uploadFileInfo.setListener((FileUploadBaseListener) multiFileUploadAdapter);
                    UploadService.a(UploadService.this).add(uploadFileInfo);
                }
                FileUploadMgr.getInstance().addTask(UploadService.a(UploadService.this));
            }
        }

        @Override // com.taobao.interact.upload.service.IUploadService
        public void uploadNewFiles(List<String> list, MtopInfo mtopInfo, UploadCallBack uploadCallBack) throws RemoteException {
            if (!(list == null || list.isEmpty())) {
                MultiFileUploadAdapter multiFileUploadAdapter = new MultiFileUploadAdapter(new b(UploadService.this, uploadCallBack), list);
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    UploadFileInfo uploadFileInfo = new UploadFileInfo();
                    uploadFileInfo.setBizCode(mtopInfo.getBizCode());
                    uploadFileInfo.setOwnerNick(mtopInfo.getOwnerNick());
                    uploadFileInfo.setFilePath(str);
                    uploadFileInfo.setListener((FileUploadBaseListener) multiFileUploadAdapter);
                    arrayList.add(uploadFileInfo);
                }
                FileUploadMgr.getInstance().addTask(arrayList);
            }
        }
    };
    public final z8j d = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements z8j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.z8j
        public void onError(String str, String str2, List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fbd9175", new Object[]{this, str, str2, list});
            } else if (UploadService.c(UploadService.this) != null) {
                try {
                    UploadService.c(UploadService.this).onError(str, str2, list);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // tb.z8j
        public void onFinish(List<UploadFileInfo> list, List<String> list2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e38362bb", new Object[]{this, list, list2});
            } else if (UploadService.c(UploadService.this) != null && list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (UploadFileInfo uploadFileInfo : list) {
                    arrayList.add(uploadFileInfo.getFilePath());
                }
                try {
                    UploadService.c(UploadService.this).onFinish(arrayList, list2);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // tb.z8j
        public void onProgress(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a56ab73", new Object[]{this, new Long(j), new Long(j2)});
            } else if (UploadService.c(UploadService.this) != null) {
                try {
                    UploadService.c(UploadService.this).onProgress(j, j2);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // tb.z8j
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            } else if (UploadService.c(UploadService.this) != null) {
                try {
                    UploadService.c(UploadService.this).onStart();
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements z8j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final UploadCallBack f10858a;

        public b(UploadService uploadService, UploadCallBack uploadCallBack) {
            this.f10858a = uploadCallBack;
        }

        @Override // tb.z8j
        public void onError(String str, String str2, List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fbd9175", new Object[]{this, str, str2, list});
                return;
            }
            UploadCallBack uploadCallBack = this.f10858a;
            if (uploadCallBack != null) {
                try {
                    uploadCallBack.onError(str, str2, list);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // tb.z8j
        public void onFinish(List<UploadFileInfo> list, List<String> list2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e38362bb", new Object[]{this, list, list2});
            } else if (this.f10858a != null && list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (UploadFileInfo uploadFileInfo : list) {
                    arrayList.add(uploadFileInfo.getFilePath());
                }
                try {
                    this.f10858a.onFinish(arrayList, list2);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // tb.z8j
        public void onProgress(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a56ab73", new Object[]{this, new Long(j), new Long(j2)});
                return;
            }
            UploadCallBack uploadCallBack = this.f10858a;
            if (uploadCallBack != null) {
                try {
                    uploadCallBack.onProgress(j, j2);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // tb.z8j
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
                return;
            }
            UploadCallBack uploadCallBack = this.f10858a;
            if (uploadCallBack != null) {
                try {
                    uploadCallBack.onStart();
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static /* synthetic */ List a(UploadService uploadService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5ebe3b33", new Object[]{uploadService});
        }
        return uploadService.b;
    }

    public static /* synthetic */ z8j b(UploadService uploadService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z8j) ipChange.ipc$dispatch("31928768", new Object[]{uploadService});
        }
        return uploadService.d;
    }

    public static /* synthetic */ UploadCallBack c(UploadService uploadService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UploadCallBack) ipChange.ipc$dispatch("fac906df", new Object[]{uploadService});
        }
        return uploadService.f10855a;
    }

    public static /* synthetic */ UploadCallBack d(UploadService uploadService, UploadCallBack uploadCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UploadCallBack) ipChange.ipc$dispatch("6268200a", new Object[]{uploadService, uploadCallBack});
        }
        uploadService.f10855a = uploadCallBack;
        return uploadCallBack;
    }

    public static /* synthetic */ Object ipc$super(UploadService uploadService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/interact/upload/service/UploadService");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return this.c;
    }
}
