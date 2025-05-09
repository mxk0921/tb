package com.taobao.message.lab.comfrm.inner2.resource;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.FileUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.inner2.config.PatchInfo;
import com.taobao.message.lab.comfrm.util.Observer;
import java.io.File;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PatchResourceProvider implements IResourceProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Observer<PatchInfo> mCallback;
    private volatile boolean mChangedFlag = false;
    private final PatchInfo mPatchInfo = ResourcePatchCenter.getInstance().getUsePatch();
    private IResourceChangeObserver resourceChangeObserver;

    static {
        t2o.a(537919731);
        t2o.a(537919730);
    }

    public PatchResourceProvider() {
        Observer<PatchInfo> observer = new Observer<PatchInfo>() { // from class: com.taobao.message.lab.comfrm.inner2.resource.PatchResourceProvider.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.util.Observer
            public void onComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                }
            }

            @Override // com.taobao.message.lab.comfrm.util.Observer
            public void onError(String str, String str2, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b263e360", new Object[]{this, str, str2, obj});
                }
            }

            public void onData(PatchInfo patchInfo) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ab3da5e7", new Object[]{this, patchInfo});
                    return;
                }
                PatchResourceProvider patchResourceProvider = PatchResourceProvider.this;
                PatchResourceProvider.access$002(patchResourceProvider, PatchUtil.equals(PatchResourceProvider.access$100(patchResourceProvider), patchInfo));
                if (PatchResourceProvider.access$200(PatchResourceProvider.this)) {
                    PatchResourceProvider.access$300(PatchResourceProvider.this);
                }
            }
        };
        this.mCallback = observer;
        ResourcePatchCenter.getInstance().addCallback(observer);
    }

    public static /* synthetic */ boolean access$002(PatchResourceProvider patchResourceProvider, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("639c6597", new Object[]{patchResourceProvider, new Boolean(z)})).booleanValue();
        }
        patchResourceProvider.mChangedFlag = z;
        return z;
    }

    public static /* synthetic */ PatchInfo access$100(PatchResourceProvider patchResourceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PatchInfo) ipChange.ipc$dispatch("15ef3f49", new Object[]{patchResourceProvider});
        }
        return patchResourceProvider.mPatchInfo;
    }

    public static /* synthetic */ boolean access$200(PatchResourceProvider patchResourceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c61fe1e5", new Object[]{patchResourceProvider})).booleanValue();
        }
        return patchResourceProvider.isResourceChanged();
    }

    public static /* synthetic */ void access$300(PatchResourceProvider patchResourceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8370f40", new Object[]{patchResourceProvider});
        } else {
            patchResourceProvider.notifyResourceChange();
        }
    }

    private synchronized void notifyResourceChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("483f1a0e", new Object[]{this});
            return;
        }
        IResourceChangeObserver iResourceChangeObserver = this.resourceChangeObserver;
        if (iResourceChangeObserver != null) {
            iResourceChangeObserver.notifyResourceChanged(new ResourceChangeSchema(0, null, getPriority()));
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        ResourcePatchCenter.getInstance().removeCallback(this.mCallback);
        this.resourceChangeObserver = null;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceProvider
    public String fetchResource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59f10447", new Object[]{this, str});
        }
        if (!ResourcePatchCenter.sEnable) {
            PatchUtil.commitMonitor(null, "1-masterSwitchClosed", str, false, "-1101");
            return null;
        } else if (this.mPatchInfo == null) {
            return null;
        } else {
            File file = new File(PatchUtil.getDir(this.mPatchInfo) + File.separator + str);
            if (!this.mPatchInfo.fileList.contains(str)) {
                return null;
            }
            if (!file.exists()) {
                PatchUtil.commitMonitor(this.mPatchInfo.patchVersion, "4-localPatchUnAvailable", str, false, "-1104");
                return null;
            }
            PatchUtil.commitMonitor(this.mPatchInfo.patchVersion, "5-usingLocalPatchSucc", str, true, null);
            return FileUtil.readTextFile(file.getAbsolutePath());
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceProvider
    public int getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return 10;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher
    public void subscribeResourceChange(IResourceChangeObserver iResourceChangeObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f0d3f5", new Object[]{this, iResourceChangeObserver});
            return;
        }
        this.resourceChangeObserver = iResourceChangeObserver;
        if (isResourceChanged()) {
            notifyResourceChange();
        }
    }

    private boolean isResourceChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ddea2c7", new Object[]{this})).booleanValue();
        }
        if ("0".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "dojo_resources_refresh", "1"))) {
            return false;
        }
        return this.mChangedFlag;
    }
}
