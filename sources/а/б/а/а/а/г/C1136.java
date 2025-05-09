package а.б.а.а.а.г;

import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent;

/* renamed from: а.б.а.а.а.г.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1136 implements IDynamicDataStoreComponent {

    /* renamed from: а  reason: contains not printable characters */
    private com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent f1739;

    public C1136(ISecurityGuardPlugin iSecurityGuardPlugin) {
        this.f1739 = (com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent) iSecurityGuardPlugin.getInterface(com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent.class);
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public boolean getBoolean(String str) {
        try {
            return this.f1739.getBoolean(str);
        } catch (SecException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public byte[] getByteArray(String str) {
        try {
            return this.f1739.getByteArray(str);
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public byte[] getByteArrayDDp(String str) {
        try {
            return this.f1739.getByteArrayDDp(str);
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public byte[] getByteArrayDDpEx(String str, int i) {
        try {
            return this.f1739.getByteArrayDDpEx(str, i);
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public float getFloat(String str) {
        try {
            return this.f1739.getFloat(str);
        } catch (SecException e) {
            e.printStackTrace();
            return -1.0f;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public int getInt(String str) {
        try {
            return this.f1739.getInt(str);
        } catch (SecException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public long getLong(String str) {
        try {
            return this.f1739.getLong(str);
        } catch (SecException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public String getString(String str) {
        try {
            return this.f1739.getString(str);
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public String getStringDDp(String str) {
        try {
            return this.f1739.getStringDDp(str);
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public String getStringDDpEx(String str, int i) {
        try {
            return this.f1739.getStringDDpEx(str, i);
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public int putBoolean(String str, boolean z) {
        try {
            return this.f1739.putBoolean(str, z);
        } catch (SecException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public int putByteArray(String str, byte[] bArr) {
        try {
            return this.f1739.putByteArray(str, bArr);
        } catch (SecException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public int putByteArrayDDp(String str, byte[] bArr) {
        try {
            return this.f1739.putByteArrayDDp(str, bArr);
        } catch (SecException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public boolean putByteArrayDDpEx(String str, byte[] bArr, int i) {
        try {
            return this.f1739.putByteArrayDDpEx(str, bArr, i);
        } catch (SecException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public int putFloat(String str, float f) {
        try {
            return this.f1739.putFloat(str, f);
        } catch (SecException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public int putInt(String str, int i) {
        try {
            return this.f1739.putInt(str, i);
        } catch (SecException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public int putLong(String str, long j) {
        try {
            return this.f1739.putLong(str, j);
        } catch (SecException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public int putString(String str, String str2) {
        try {
            return this.f1739.putString(str, str2);
        } catch (SecException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public int putStringDDp(String str, String str2) {
        try {
            return this.f1739.putStringDDp(str, str2);
        } catch (SecException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public boolean putStringDDpEx(String str, String str2, int i) {
        try {
            return this.f1739.putStringDDpEx(str, str2, i);
        } catch (SecException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public void removeBoolean(String str) {
        try {
            this.f1739.removeBoolean(str);
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public void removeByteArray(String str) {
        try {
            this.f1739.removeByteArray(str);
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public void removeByteArrayDDp(String str) {
        try {
            this.f1739.removeByteArrayDDp(str);
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public void removeByteArrayDDpEx(String str, int i) {
        try {
            this.f1739.removeByteArrayDDpEx(str, i);
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public void removeFloat(String str) {
        try {
            this.f1739.removeFloat(str);
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public void removeInt(String str) {
        try {
            this.f1739.removeInt(str);
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public void removeLong(String str) {
        try {
            this.f1739.removeLong(str);
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public void removeString(String str) {
        try {
            this.f1739.removeString(str);
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public void removeStringDDp(String str) {
        try {
            this.f1739.removeStringDDp(str);
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent
    public void removeStringDDpEx(String str, int i) {
        try {
            this.f1739.removeStringDDpEx(str, i);
        } catch (SecException e) {
            e.printStackTrace();
        }
    }
}
