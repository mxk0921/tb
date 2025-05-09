package com.taobao.message.lab.comfrm.inner2.resource;

import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ApplicationBuildInfo;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.FileUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.inner2.config.PatchInfo;
import com.taobao.message.lab.comfrm.util.DownloadUtil;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.Observer;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.orange.OrangeConfig;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipFile;
import tb.obk;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ResourcePatchCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean sEnable = true;
    private String mAppVersionKey;
    private PatchInfo mUsePatch;
    private final Set<String> sPatchDownLoadSet = new HashSet(4);
    private volatile String sLastVersion = "0";
    private volatile String sLastPatchInfoStr = null;
    private final List<WeakReference<Observer<PatchInfo>>> sCallbackList = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SingletonHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static ResourcePatchCenter instance = new ResourcePatchCenter();

        static {
            t2o.a(537919747);
        }

        private SingletonHolder() {
        }

        public static /* synthetic */ ResourcePatchCenter access$000() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ResourcePatchCenter) ipChange.ipc$dispatch("2af43b59", new Object[0]);
            }
            return instance;
        }
    }

    static {
        t2o.a(537919741);
    }

    public ResourcePatchCenter() {
        init();
    }

    public static /* synthetic */ String access$100(ResourcePatchCenter resourcePatchCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38dc9166", new Object[]{resourcePatchCenter});
        }
        return resourcePatchCenter.sLastVersion;
    }

    public static /* synthetic */ String access$102(ResourcePatchCenter resourcePatchCenter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2395cde", new Object[]{resourcePatchCenter, str});
        }
        resourcePatchCenter.sLastVersion = str;
        return str;
    }

    public static /* synthetic */ String access$200(ResourcePatchCenter resourcePatchCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff071a27", new Object[]{resourcePatchCenter});
        }
        return resourcePatchCenter.getConfigStr();
    }

    public static /* synthetic */ String access$300(ResourcePatchCenter resourcePatchCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c531a2e8", new Object[]{resourcePatchCenter});
        }
        return resourcePatchCenter.sLastPatchInfoStr;
    }

    public static /* synthetic */ String access$302(ResourcePatchCenter resourcePatchCenter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b451d1e0", new Object[]{resourcePatchCenter, str});
        }
        resourcePatchCenter.sLastPatchInfoStr = str;
        return str;
    }

    public static /* synthetic */ void access$400(ResourcePatchCenter resourcePatchCenter, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("561bdfcd", new Object[]{resourcePatchCenter, new Long(j)});
        } else {
            resourcePatchCenter.syncResourceFile(j);
        }
    }

    public static /* synthetic */ boolean access$500(ResourcePatchCenter resourcePatchCenter, PatchInfo patchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54e1a665", new Object[]{resourcePatchCenter, patchInfo})).booleanValue();
        }
        return resourcePatchCenter.checkFile(patchInfo);
    }

    public static /* synthetic */ void access$600(ResourcePatchCenter resourcePatchCenter, PatchInfo patchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38a09662", new Object[]{resourcePatchCenter, patchInfo});
        } else {
            resourcePatchCenter.tryUpdatePatch(patchInfo);
        }
    }

    public static /* synthetic */ void access$700(ResourcePatchCenter resourcePatchCenter, PatchInfo patchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c5f8663", new Object[]{resourcePatchCenter, patchInfo});
        } else {
            resourcePatchCenter.downloadAndUnzipPatch(patchInfo);
        }
    }

    private void callback(PatchInfo patchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("623a6e4b", new Object[]{this, patchInfo});
            return;
        }
        synchronized (this.sCallbackList) {
            try {
                for (WeakReference<Observer<PatchInfo>> weakReference : this.sCallbackList) {
                    Observer<PatchInfo> observer = weakReference.get();
                    if (observer != null) {
                        observer.onData(patchInfo);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean checkFile(PatchInfo patchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2793c90", new Object[]{this, patchInfo})).booleanValue();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = patchInfo.fileList.iterator();
        while (it.hasNext()) {
            File file = new File(PatchUtil.getDir(patchInfo) + File.separator + it.next());
            if (file.exists()) {
                arrayList.add(file);
            }
        }
        if (arrayList.size() == patchInfo.fileList.size()) {
            return true;
        }
        return false;
    }

    private void downloadAndUnzipPatch(final PatchInfo patchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e822eb81", new Object[]{this, patchInfo});
            return;
        }
        synchronized (this.sPatchDownLoadSet) {
            try {
                if (!this.sPatchDownLoadSet.contains(patchInfo.patchVersion)) {
                    this.sPatchDownLoadSet.add(patchInfo.patchVersion);
                    DownloadUtil.download(patchInfo.url, new DownloadUtil.DownloadCallback() { // from class: com.taobao.message.lab.comfrm.inner2.resource.ResourcePatchCenter.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.message.lab.comfrm.util.DownloadUtil.DownloadCallback
                        public void onFinish(final String str, final String str2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("79746b6d", new Object[]{this, str, str2});
                            } else {
                                Schedules.io(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.resource.ResourcePatchCenter.2.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        } else if (!TextUtils.equals(patchInfo.url, str) || TextUtils.isEmpty(str2)) {
                                            Logger.ftl(new Logger.FormatLog.Builder().type(1).module(16).point(1015).errCode("-1").errMsg("asyncGetRemotePath failed").ext("pathKey", str, "path", str2).build());
                                        } else {
                                            try {
                                                final boolean unzip = FileUtil.unzip(new ZipFile(str2), PatchUtil.getDir(patchInfo));
                                                if (ApplicationUtil.isDebug()) {
                                                    Schedules.ui(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.resource.ResourcePatchCenter.2.1.1
                                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                                        @Override // java.lang.Runnable
                                                        public void run() {
                                                            String str3;
                                                            IpChange ipChange4 = $ipChange;
                                                            if (ipChange4 instanceof IpChange) {
                                                                ipChange4.ipc$dispatch("5c510192", new Object[]{this});
                                                                return;
                                                            }
                                                            if (unzip) {
                                                                str3 = "DOJO 资源替换成功";
                                                            } else {
                                                                str3 = "DOJO 资源替换失败";
                                                            }
                                                            Toast.makeText(ApplicationUtil.getApplication(), str3, 1).show();
                                                        }
                                                    });
                                                }
                                                AnonymousClass2 r0 = AnonymousClass2.this;
                                                if (ResourcePatchCenter.access$500(ResourcePatchCenter.this, patchInfo)) {
                                                    AnonymousClass2 r02 = AnonymousClass2.this;
                                                    ResourcePatchCenter.access$600(ResourcePatchCenter.this, patchInfo);
                                                }
                                            } catch (IOException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                    }
                                });
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private String getConfigStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20a88bc0", new Object[]{this});
        }
        return ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "dojo_resources_patch_config" + this.mAppVersionKey, null);
    }

    public static ResourcePatchCenter getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResourcePatchCenter) ipChange.ipc$dispatch("9cd43a34", new Object[0]);
        }
        return SingletonHolder.access$000();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        String appVersionName = ApplicationBuildInfo.getAppVersionName();
        if (appVersionName != null) {
            this.mAppVersionKey = "_" + appVersionName.replace('.', '_');
        }
        initListenerOrange();
        syncResourceFile(0L);
    }

    private void syncResourceFile(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3415f558", new Object[]{this, new Long(j)});
            return;
        }
        final PatchInfo patchInfo = getPatchInfo();
        if (patchInfo == null) {
            tryUpdatePatch(null);
        } else if (!checkFile(patchInfo)) {
            Schedules.getIO().schedule(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.resource.ResourcePatchCenter.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ResourcePatchCenter.access$700(ResourcePatchCenter.this, patchInfo);
                    }
                }
            }, j, TimeUnit.MILLISECONDS);
            PatchUtil.commitMonitor(patchInfo.patchVersion, "4-localPatchUnAvailable", "", false, "-1104");
        } else {
            tryUpdatePatch(patchInfo);
        }
    }

    private synchronized void tryUpdatePatch(PatchInfo patchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe3a2ec", new Object[]{this, patchInfo});
            return;
        }
        if (PatchUtil.equals(this.mUsePatch, patchInfo)) {
            this.mUsePatch = patchInfo;
            callback(patchInfo);
        }
    }

    public void addCallback(Observer<PatchInfo> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc53f23", new Object[]{this, observer});
            return;
        }
        synchronized (this.sCallbackList) {
            this.sCallbackList.add(new WeakReference<>(observer));
        }
    }

    public synchronized PatchInfo getUsePatch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PatchInfo) ipChange.ipc$dispatch("35f9eb45", new Object[]{this});
        }
        return this.mUsePatch;
    }

    public void removeCallback(Observer<PatchInfo> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("115020a0", new Object[]{this, observer});
        } else if (observer != null) {
            synchronized (this.sCallbackList) {
                try {
                    for (int size = this.sCallbackList.size() - 1; size >= 0; size--) {
                        Observer<PatchInfo> observer2 = this.sCallbackList.get(size).get();
                        if (observer2 == null) {
                            this.sCallbackList.remove(size);
                        } else if (observer2 == observer) {
                            this.sCallbackList.remove(size);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void initListenerOrange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b9c30b9", new Object[]{this});
            return;
        }
        obk obkVar = new obk() { // from class: com.taobao.message.lab.comfrm.inner2.resource.ResourcePatchCenter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.obk
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    return;
                }
                synchronized (ResourcePatchCenter.class) {
                    try {
                        String str2 = map.get("configVersion");
                        if (!str2.equals(ResourcePatchCenter.access$100(ResourcePatchCenter.this)) && "false".equals(map.get("fromCache"))) {
                            ResourcePatchCenter.access$102(ResourcePatchCenter.this, str2);
                            if (ResourcePatchCenter.sEnable) {
                                String access$200 = ResourcePatchCenter.access$200(ResourcePatchCenter.this);
                                if (!TextUtils.equals(ResourcePatchCenter.access$300(ResourcePatchCenter.this), access$200)) {
                                    ResourcePatchCenter.access$302(ResourcePatchCenter.this, access$200);
                                    ResourcePatchCenter.access$400(ResourcePatchCenter.this, (long) (Math.random() * 5.0d * 60.0d * 1000.0d));
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.sLastPatchInfoStr = getConfigStr();
        OrangeConfig.getInstance().registerListener(new String[]{"mpm_business_switch"}, obkVar, false);
    }

    private PatchInfo getPatchInfo() {
        PatchInfo patchInfo;
        String str;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PatchInfo) ipChange.ipc$dispatch("dbee07ee", new Object[]{this});
        }
        String configStr = getConfigStr();
        if (!TextUtils.isEmpty(configStr)) {
            try {
                patchInfo = (PatchInfo) JSON.parseObject(configStr, PatchInfo.class);
            } catch (Exception unused) {
                Logger.ftl(new Logger.FormatLog.Builder().type(1).module(16).point(1015).errCode("-1").ext("filePartName", "", "configStr", configStr).build());
                patchInfo = null;
            }
            if (patchInfo != null && !TextUtils.isEmpty(patchInfo.patchVersion) && !TextUtils.isEmpty(patchInfo.url) && (list = patchInfo.fileList) != null && !list.isEmpty()) {
                return patchInfo;
            }
            if (patchInfo == null) {
                str = "unknow";
            } else {
                str = patchInfo.patchVersion;
            }
            PatchUtil.commitMonitor(str, "3-orangeConfigNotMatch", "", false, "-1103");
            return null;
        }
        PatchUtil.commitMonitor(null, "2-orangeSwitchNotExists", "", false, null);
        return null;
    }
}
