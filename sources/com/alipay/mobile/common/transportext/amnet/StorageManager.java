package com.alipay.mobile.common.transportext.amnet;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.amnet.Storage;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class StorageManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Storage f4173a = new DftStorage();
    public final Map<String, byte[]> b = new TreeMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class DftStorage implements Storage {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, byte[]> f4174a;
        public final Map<String, byte[]> b;

        public DftStorage() {
            this.f4174a = new TreeMap();
            this.b = new TreeMap();
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Storage
        public byte[] getBigData(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("66cda36e", new Object[]{this, str, new Boolean(z)});
            }
            return null;
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Storage
        public void getBigDataAsync(String str, boolean z, int i, Storage.Result result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa2f1a4a", new Object[]{this, str, new Boolean(z), new Integer(i), result});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Storage
        public byte[] getCommon(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("633ede6b", new Object[]{this, str});
            }
            return (byte[]) ((TreeMap) this.f4174a).get(str);
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Storage
        public byte[] getSecure(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("1235af5f", new Object[]{this, str});
            }
            return (byte[]) ((TreeMap) this.b).get(str);
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Storage
        public void putBigDataAsync(String str, byte[] bArr, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bba5a15b", new Object[]{this, str, bArr, new Boolean(z)});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Storage
        public void putCommit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89582ad", new Object[]{this});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Storage
        public void putCommon(String str, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f44ce2f2", new Object[]{this, str, bArr});
            } else {
                ((TreeMap) this.f4174a).put(str, bArr);
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Storage
        public void putCommonAsync(String str, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce21d1da", new Object[]{this, str, bArr});
            } else {
                ((TreeMap) this.f4174a).put(str, bArr);
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Storage
        public void putCommonTransmit(String str, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12002fc2", new Object[]{this, str, bArr});
            } else {
                ((TreeMap) this.f4174a).put(str, bArr);
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Storage
        public void putSecure(String str, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2430307e", new Object[]{this, str, bArr});
            } else {
                ((TreeMap) this.b).put(str, bArr);
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Storage
        public void putSecureAsync(String str, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("682d1bce", new Object[]{this, str, bArr});
            } else {
                ((TreeMap) this.b).put(str, bArr);
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Storage
        public void putSecureTransmit(String str, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59b3314e", new Object[]{this, str, bArr});
            } else {
                ((TreeMap) this.b).put(str, bArr);
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Storage
        public void removeBigData(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7957db7", new Object[]{this, str});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Storage
        public void removeCommon(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77a530e0", new Object[]{this, str});
            } else if (str != null) {
                ((TreeMap) this.f4174a).remove(str);
                ((TreeMap) this.b).remove(str);
            }
        }
    }

    public byte[] getBigData(String str, boolean z) {
        byte[] bigData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("66cda36e", new Object[]{this, str, new Boolean(z)});
        }
        try {
            if (!TextUtils.isEmpty(str) && (bigData = this.f4173a.getBigData(str, z)) != null) {
                if (bigData.length > 0) {
                    return bigData;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public void getBigDataAsync(String str, boolean z, int i, Storage.Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa2f1a4a", new Object[]{this, str, new Boolean(z), new Integer(i), result});
        } else if (!TextUtils.isEmpty(str) && result != null) {
            this.f4173a.getBigDataAsync(str, z, i, result);
        }
    }

    public byte[] getCommon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("633ede6b", new Object[]{this, str});
        }
        try {
            byte[] bArr = (byte[]) ((TreeMap) this.b).get(str);
            if (bArr != null && bArr.length > 0) {
                return bArr;
            }
            byte[] common = this.f4173a.getCommon(str);
            if (common == null || common.length <= 0) {
                return null;
            }
            ((TreeMap) this.b).put(str, common);
            return common;
        } catch (Throwable th) {
            LogCatUtil.error("StorageManager", "getCommon ex= " + th.toString());
            return null;
        }
    }

    public byte[] getSecure(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1235af5f", new Object[]{this, str});
        }
        try {
            byte[] bArr = (byte[]) ((TreeMap) this.b).get(str);
            if (bArr != null && bArr.length > 0) {
                return bArr;
            }
            byte[] secure = this.f4173a.getSecure(str);
            if (secure == null || secure.length <= 0) {
                return null;
            }
            ((TreeMap) this.b).put(str, secure);
            return secure;
        } catch (Throwable th) {
            LogCatUtil.error("StorageManager", "getSecure ex= " + th.toString());
            return null;
        }
    }

    public void putBigDataAsync(String str, byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bba5a15b", new Object[]{this, str, bArr, new Boolean(z)});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                if (bArr != null && bArr.length > 0) {
                    this.f4173a.putBigDataAsync(str, bArr, z);
                }
                removeBigData(str);
            }
        } catch (Throwable unused) {
        }
    }

    public void putCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89582ad", new Object[]{this});
        } else {
            this.f4173a.putCommit();
        }
    }

    public void putCommonAsync(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce21d1da", new Object[]{this, str, bArr});
            return;
        }
        ((TreeMap) this.b).put(str, bArr);
        if (bArr == null || bArr.length <= 0) {
            this.f4173a.removeCommon(str);
        } else {
            this.f4173a.putCommonAsync(str, bArr);
        }
    }

    public void putCommonTransmit(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12002fc2", new Object[]{this, str, bArr});
            return;
        }
        ((TreeMap) this.b).put(str, bArr);
        if (bArr == null || bArr.length <= 0) {
            this.f4173a.removeCommon(str);
        } else {
            this.f4173a.putCommonTransmit(str, bArr);
        }
    }

    public void putSecureAsync(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("682d1bce", new Object[]{this, str, bArr});
            return;
        }
        ((TreeMap) this.b).put(str, bArr);
        if (bArr == null || bArr.length <= 0) {
            this.f4173a.removeCommon(str);
        } else {
            this.f4173a.putSecureAsync(str, bArr);
        }
    }

    public void putSecureTransmit(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59b3314e", new Object[]{this, str, bArr});
            return;
        }
        ((TreeMap) this.b).put(str, bArr);
        if (bArr == null || bArr.length <= 0) {
            this.f4173a.removeCommon(str);
        } else {
            this.f4173a.putSecureTransmit(str, bArr);
        }
    }

    public void register(Storage storage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e903683", new Object[]{this, storage});
        } else if (storage != null) {
            this.f4173a = storage;
        }
    }

    public void removeBigData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7957db7", new Object[]{this, str});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f4173a.removeBigData(str);
            }
        } catch (Throwable unused) {
        }
    }

    public void removeCommon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77a530e0", new Object[]{this, str});
        } else if (str != null && !str.isEmpty()) {
            this.f4173a.removeCommon(str);
        }
    }
}
