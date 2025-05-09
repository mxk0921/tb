package androidx.constraintlayout.core.state;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Registry {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Registry sRegistry = new Registry();
    private HashMap<String, RegistryCallback> mCallbacks = new HashMap<>();

    public static Registry getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Registry) ipChange.ipc$dispatch("5573b83a", new Object[0]);
        }
        return sRegistry;
    }

    public String currentContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("370b916f", new Object[]{this, str});
        }
        RegistryCallback registryCallback = this.mCallbacks.get(str);
        if (registryCallback != null) {
            return registryCallback.currentMotionScene();
        }
        return null;
    }

    public String currentLayoutInformation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4be35ae6", new Object[]{this, str});
        }
        RegistryCallback registryCallback = this.mCallbacks.get(str);
        if (registryCallback != null) {
            return registryCallback.currentLayoutInformation();
        }
        return null;
    }

    public long getLastModified(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfbbbaba", new Object[]{this, str})).longValue();
        }
        RegistryCallback registryCallback = this.mCallbacks.get(str);
        if (registryCallback != null) {
            return registryCallback.getLastModified();
        }
        return Long.MAX_VALUE;
    }

    public Set<String> getLayoutList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a37adf94", new Object[]{this});
        }
        return this.mCallbacks.keySet();
    }

    public void register(String str, RegistryCallback registryCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eec913f", new Object[]{this, str, registryCallback});
        } else {
            this.mCallbacks.put(str, registryCallback);
        }
    }

    public void setDrawDebug(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65a5b2c5", new Object[]{this, str, new Integer(i)});
            return;
        }
        RegistryCallback registryCallback = this.mCallbacks.get(str);
        if (registryCallback != null) {
            registryCallback.setDrawDebug(i);
        }
    }

    public void setLayoutInformationMode(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1cb7e0f", new Object[]{this, str, new Integer(i)});
            return;
        }
        RegistryCallback registryCallback = this.mCallbacks.get(str);
        if (registryCallback != null) {
            registryCallback.setLayoutInformationMode(i);
        }
    }

    public void unregister(String str, RegistryCallback registryCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adf21446", new Object[]{this, str, registryCallback});
        } else {
            this.mCallbacks.remove(str);
        }
    }

    public void updateContent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcebe18b", new Object[]{this, str, str2});
            return;
        }
        RegistryCallback registryCallback = this.mCallbacks.get(str);
        if (registryCallback != null) {
            registryCallback.onNewMotionScene(str2);
        }
    }

    public void updateDimensions(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1806627", new Object[]{this, str, new Integer(i), new Integer(i2)});
            return;
        }
        RegistryCallback registryCallback = this.mCallbacks.get(str);
        if (registryCallback != null) {
            registryCallback.onDimensions(i, i2);
        }
    }

    public void updateProgress(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d058079", new Object[]{this, str, new Float(f)});
            return;
        }
        RegistryCallback registryCallback = this.mCallbacks.get(str);
        if (registryCallback != null) {
            registryCallback.onProgress(f);
        }
    }
}
