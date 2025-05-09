package mtopsdk.mtop.upload;

import android.content.Context;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SDKConfig;
import mtopsdk.mtop.upload.domain.UploadConstants;
import mtopsdk.mtop.upload.domain.UploadFileInfo;
import mtopsdk.mtop.upload.util.FileUploadThreadPoolExecutorFactory;
import tb.omv;
import tb.pmv;
import tb.t2o;
import tb.umv;
import tb.wmv;
import tb.x6e;
import tb.z6e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class FileUploadMgr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.FileUploadMgr";
    private ConcurrentHashMap<UploadFileInfo, Pair<DefaultFileUploadListenerWrapper, z6e>> uploadTasks;
    private x6e uploaderManager;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class FileUploadMgrHolder {
        public static final FileUploadMgr instance = new FileUploadMgr();

        static {
            t2o.a(595591177);
        }

        private FileUploadMgrHolder() {
        }
    }

    static {
        t2o.a(595591173);
    }

    public static /* synthetic */ ConcurrentHashMap access$100(FileUploadMgr fileUploadMgr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("e944bd54", new Object[]{fileUploadMgr});
        }
        return fileUploadMgr.uploadTasks;
    }

    public static /* synthetic */ x6e access$200(FileUploadMgr fileUploadMgr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x6e) ipChange.ipc$dispatch("a633b3f6", new Object[]{fileUploadMgr});
        }
        return fileUploadMgr.uploaderManager;
    }

    public static final FileUploadMgr getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileUploadMgr) ipChange.ipc$dispatch("c61b600c", new Object[0]);
        }
        return FileUploadMgrHolder.instance;
    }

    @Deprecated
    public void addTask(UploadFileInfo uploadFileInfo, FileUploadListener fileUploadListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ae151c", new Object[]{this, uploadFileInfo, fileUploadListener});
        } else if (fileUploadListener == null) {
            TBSdkLog.e(TAG, "add upload task failed,listener is invalid");
        } else {
            addTask(uploadFileInfo, (FileUploadBaseListener) new DefaultFileUploadListener(fileUploadListener));
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.uploadTasks.clear();
        }
    }

    public void removeArupTask(final UploadFileInfo uploadFileInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88078eb3", new Object[]{this, uploadFileInfo});
            return;
        }
        try {
            FileUploadThreadPoolExecutorFactory.submitRemoveTask(new Runnable() { // from class: mtopsdk.mtop.upload.FileUploadMgr.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    UploadFileInfo uploadFileInfo2 = uploadFileInfo;
                    if (uploadFileInfo2 == null || !uploadFileInfo2.isValid()) {
                        TBSdkLog.e(FileUploadMgr.TAG, "remove upload task failed,fileInfo is invalid");
                    } else {
                        FileUploadMgr.access$100(FileUploadMgr.this).remove(uploadFileInfo);
                    }
                }
            });
        } catch (Exception e) {
            TBSdkLog.e(TAG, "add removeTask to removeTaskPool error", e);
        }
    }

    public void removeTask(final UploadFileInfo uploadFileInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2b9badf", new Object[]{this, uploadFileInfo});
            return;
        }
        try {
            FileUploadThreadPoolExecutorFactory.submitRemoveTask(new Runnable() { // from class: mtopsdk.mtop.upload.FileUploadMgr.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    UploadFileInfo uploadFileInfo2 = uploadFileInfo;
                    if (uploadFileInfo2 == null || !uploadFileInfo2.isValid()) {
                        TBSdkLog.e(FileUploadMgr.TAG, "remove upload task failed,fileInfo is invalid");
                    } else if (FileUploadMgr.access$100(FileUploadMgr.this).containsKey(uploadFileInfo)) {
                        Pair pair = (Pair) FileUploadMgr.access$100(FileUploadMgr.this).get(uploadFileInfo);
                        ((DefaultFileUploadListenerWrapper) pair.first).cancel();
                        FileUploadMgr.access$100(FileUploadMgr.this).remove(uploadFileInfo);
                        z6e z6eVar = (z6e) pair.second;
                        if (z6eVar != null) {
                            FileUploadMgr.access$200(FileUploadMgr.this).cancelAsync(z6eVar);
                        }
                        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                            TBSdkLog.d(FileUploadMgr.TAG, "remove upload task succeed." + uploadFileInfo.toString());
                        }
                    }
                }
            });
        } catch (Exception e) {
            TBSdkLog.e(TAG, "add removeTask to removeTaskPool error", e);
        }
    }

    private FileUploadMgr() {
        this.uploaderManager = null;
        if (this.uploadTasks == null) {
            this.uploadTasks = new ConcurrentHashMap<>();
        }
        if (this.uploaderManager == null) {
            try {
                Context globalContext = SDKConfig.getInstance().getGlobalContext();
                x6e a2 = omv.a();
                this.uploaderManager = a2;
                if (!a2.isInitialized()) {
                    umv umvVar = new umv();
                    umvVar.c(RemoteConfig.getInstance().enableArupTlog);
                    this.uploaderManager.initialize(globalContext, new pmv(globalContext, new UploaderEnvironmentAdapter(globalContext), umvVar, new wmv()));
                }
            } catch (Exception e) {
                TBSdkLog.e(TAG, "init IUploaderMananger error.", e);
            }
        }
    }

    public void addTask(final UploadFileInfo uploadFileInfo, FileUploadBaseListener fileUploadBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2084f58b", new Object[]{this, uploadFileInfo, fileUploadBaseListener});
        } else if (fileUploadBaseListener == null) {
            TBSdkLog.e(TAG, "add upload task failed,listener is invalid");
        } else if (uploadFileInfo == null || !uploadFileInfo.isValid()) {
            TBSdkLog.e(TAG, "add upload task failed,fileInfo is invalid");
            fileUploadBaseListener.onError(UploadConstants.ERRTYPE_ILLEGAL_FILE_ERROR, UploadConstants.ERRCODE_FILE_INVALID, UploadConstants.ERRMSG_FILE_INVALID);
        } else {
            DefaultFileUploadListenerWrapper defaultFileUploadListenerWrapper = new DefaultFileUploadListenerWrapper(fileUploadBaseListener);
            if (!RemoteConfig.getInstance().degradeBizcodeSets.contains(uploadFileInfo.getBizCode())) {
                z6e z6eVar = new z6e() { // from class: mtopsdk.mtop.upload.FileUploadMgr.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.z6e
                    public String getBizType() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (String) ipChange2.ipc$dispatch("9c07dca2", new Object[]{this});
                        }
                        return uploadFileInfo.getBizCode();
                    }

                    @Override // tb.z6e
                    public String getFilePath() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (String) ipChange2.ipc$dispatch("1bcb7a22", new Object[]{this});
                        }
                        return uploadFileInfo.getFilePath();
                    }

                    @Override // tb.z6e
                    public String getFileType() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (String) ipChange2.ipc$dispatch("105a7e2d", new Object[]{this});
                        }
                        return null;
                    }

                    @Override // tb.z6e
                    public Map<String, String> getMetaInfo() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Map) ipChange2.ipc$dispatch("8d01c005", new Object[]{this});
                        }
                        return null;
                    }
                };
                if (!this.uploadTasks.containsKey(uploadFileInfo)) {
                    this.uploadTasks.put(uploadFileInfo, new Pair<>(defaultFileUploadListenerWrapper, z6eVar));
                    this.uploaderManager.uploadAsync(z6eVar, new TaskListenerAdapter(uploadFileInfo, defaultFileUploadListenerWrapper), null);
                }
            } else if (!this.uploadTasks.containsKey(uploadFileInfo)) {
                this.uploadTasks.put(uploadFileInfo, new Pair<>(defaultFileUploadListenerWrapper, null));
                FileUploadThreadPoolExecutorFactory.submitUploadTask(new FileUploadTask(uploadFileInfo, defaultFileUploadListenerWrapper));
            }
        }
    }

    @Deprecated
    public void addTask(UploadFileInfo uploadFileInfo, FileUploadBaseListener fileUploadBaseListener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f01a6ea9", new Object[]{this, uploadFileInfo, fileUploadBaseListener, new Boolean(z)});
        } else {
            addTask(uploadFileInfo, fileUploadBaseListener);
        }
    }

    public void addTask(List<UploadFileInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d96e3e", new Object[]{this, list});
        } else if (list == null || list.size() < 1) {
            TBSdkLog.e(TAG, "add upload task failed,fileInfoList is invalid");
        } else {
            for (UploadFileInfo uploadFileInfo : list) {
                if (uploadFileInfo != null) {
                    addTask(uploadFileInfo, uploadFileInfo.getListener());
                }
            }
        }
    }
}
