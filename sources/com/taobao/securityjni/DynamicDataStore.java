package com.taobao.securityjni;

import android.content.ContextWrapper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class DynamicDataStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IDynamicDataStoreComponent proxy;

    static {
        t2o.a(421527563);
    }

    public DynamicDataStore(ContextWrapper contextWrapper) {
        SecurityGuardManager instance = SecurityGuardManager.getInstance(contextWrapper);
        if (instance != null) {
            this.proxy = instance.getDynamicDataStoreComp();
        }
    }

    public boolean getBoolean(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("685f8107", new Object[]{this, str})).booleanValue();
        }
        IDynamicDataStoreComponent iDynamicDataStoreComponent = this.proxy;
        if (iDynamicDataStoreComponent == null) {
            return false;
        }
        return iDynamicDataStoreComponent.getBoolean(str);
    }

    public byte[] getByteArray(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d341e691", new Object[]{this, str});
        }
        IDynamicDataStoreComponent iDynamicDataStoreComponent = this.proxy;
        if (iDynamicDataStoreComponent == null) {
            return null;
        }
        return iDynamicDataStoreComponent.getByteArray(str);
    }

    public byte[] getByteArrayDDp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f6a96637", new Object[]{this, str});
        }
        return null;
    }

    public float getFloat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("676c62a7", new Object[]{this, str})).floatValue();
        }
        IDynamicDataStoreComponent iDynamicDataStoreComponent = this.proxy;
        if (iDynamicDataStoreComponent == null) {
            return -1.0f;
        }
        return iDynamicDataStoreComponent.getFloat(str);
    }

    public int getInt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c755427d", new Object[]{this, str})).intValue();
        }
        IDynamicDataStoreComponent iDynamicDataStoreComponent = this.proxy;
        if (iDynamicDataStoreComponent == null) {
            return -1;
        }
        return iDynamicDataStoreComponent.getInt(str);
    }

    public long getLong(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7149c7f7", new Object[]{this, str})).longValue();
        }
        IDynamicDataStoreComponent iDynamicDataStoreComponent = this.proxy;
        if (iDynamicDataStoreComponent == null) {
            return -1L;
        }
        return iDynamicDataStoreComponent.getLong(str);
    }

    public long getLongCompat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e884499", new Object[]{this, str})).longValue();
        }
        return getLong(str);
    }

    public String getString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba42c148", new Object[]{this, str});
        }
        IDynamicDataStoreComponent iDynamicDataStoreComponent = this.proxy;
        if (iDynamicDataStoreComponent == null) {
            return null;
        }
        return iDynamicDataStoreComponent.getString(str);
    }

    public String getStringCompat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ee5b8a6", new Object[]{this, str});
        }
        return getString(str);
    }

    public String getStringDDp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf84c286", new Object[]{this, str});
        }
        return null;
    }

    public int putBoolean(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("932aec1d", new Object[]{this, str, new Boolean(z)})).intValue();
        }
        IDynamicDataStoreComponent iDynamicDataStoreComponent = this.proxy;
        if (iDynamicDataStoreComponent == null) {
            return -1;
        }
        return iDynamicDataStoreComponent.putBoolean(str, z);
    }

    public int putByteArray(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18d63ced", new Object[]{this, str, bArr})).intValue();
        }
        IDynamicDataStoreComponent iDynamicDataStoreComponent = this.proxy;
        if (iDynamicDataStoreComponent == null) {
            return -1;
        }
        return iDynamicDataStoreComponent.putByteArray(str, bArr);
    }

    public int putByteArrayDDp(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4cc35d9", new Object[]{this, str, bArr})).intValue();
        }
        return 0;
    }

    public int putFloat(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d1a2015", new Object[]{this, str, new Float(f)})).intValue();
        }
        IDynamicDataStoreComponent iDynamicDataStoreComponent = this.proxy;
        if (iDynamicDataStoreComponent == null) {
            return -1;
        }
        return iDynamicDataStoreComponent.putFloat(str, f);
    }

    public int putInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4330025", new Object[]{this, str, new Integer(i)})).intValue();
        }
        IDynamicDataStoreComponent iDynamicDataStoreComponent = this.proxy;
        if (iDynamicDataStoreComponent == null) {
            return -1;
        }
        return iDynamicDataStoreComponent.putInt(str, i);
    }

    public int putLong(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52ffffbb", new Object[]{this, str, new Long(j)})).intValue();
        }
        IDynamicDataStoreComponent iDynamicDataStoreComponent = this.proxy;
        if (iDynamicDataStoreComponent == null) {
            return -1;
        }
        return iDynamicDataStoreComponent.putLong(str, j);
    }

    public int putString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb567a0e", new Object[]{this, str, str2})).intValue();
        }
        IDynamicDataStoreComponent iDynamicDataStoreComponent = this.proxy;
        if (iDynamicDataStoreComponent == null) {
            return -1;
        }
        return iDynamicDataStoreComponent.putString(str, str2);
    }

    public int putStringDDp(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab2361fe", new Object[]{this, str, str2})).intValue();
        }
        return 0;
    }

    public void removeBoolean(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82218e95", new Object[]{this, str});
            return;
        }
        IDynamicDataStoreComponent iDynamicDataStoreComponent = this.proxy;
        if (iDynamicDataStoreComponent != null) {
            iDynamicDataStoreComponent.removeBoolean(str);
        }
    }

    public void removeByteArray(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b84584de", new Object[]{this, str});
            return;
        }
        IDynamicDataStoreComponent iDynamicDataStoreComponent = this.proxy;
        if (iDynamicDataStoreComponent != null) {
            iDynamicDataStoreComponent.removeByteArray(str);
        }
    }

    public void removeByteArrayDDp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e92514", new Object[]{this, str});
        }
    }

    public void removeFloat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb18acc9", new Object[]{this, str});
            return;
        }
        IDynamicDataStoreComponent iDynamicDataStoreComponent = this.proxy;
        if (iDynamicDataStoreComponent != null) {
            iDynamicDataStoreComponent.removeFloat(str);
        }
    }

    public void removeInt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b50e91c", new Object[]{this, str});
            return;
        }
        IDynamicDataStoreComponent iDynamicDataStoreComponent = this.proxy;
        if (iDynamicDataStoreComponent != null) {
            iDynamicDataStoreComponent.removeInt(str);
        }
    }

    public void removeLong(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cc2f3b1", new Object[]{this, str});
            return;
        }
        IDynamicDataStoreComponent iDynamicDataStoreComponent = this.proxy;
        if (iDynamicDataStoreComponent != null) {
            iDynamicDataStoreComponent.removeLong(str);
        }
    }

    public void removeString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("986ba686", new Object[]{this, str});
            return;
        }
        IDynamicDataStoreComponent iDynamicDataStoreComponent = this.proxy;
        if (iDynamicDataStoreComponent != null) {
            iDynamicDataStoreComponent.removeString(str);
        }
    }

    public void removeStringDDp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f4fc26c", new Object[]{this, str});
        }
    }
}
