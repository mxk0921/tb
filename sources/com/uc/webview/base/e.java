package com.uc.webview.base;

import android.os.StrictMode;
import android.text.TextUtils;
import com.uc.webview.base.SdkGlobalSettings;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class e implements SdkGlobalSettings.Interface {

    /* renamed from: a  reason: collision with root package name */
    private final ReentrantReadWriteLock f14265a = new ReentrantReadWriteLock(false);
    private final BitSet b = new BitSet(k.f14275a.length);

    public e() {
        if (EnvInfo.o()) {
            a();
        }
    }

    private void a() {
        int[] iArr = KeyIdMap.d;
        if (iArr.length > 0) {
            StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
            try {
                for (int i : iArr) {
                    String a2 = h.a("gs-" + KeyIdMap.f14251a[i], (String) null);
                    if (a2 != null) {
                        set(i, a2);
                    }
                }
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
            } catch (Throwable unused) {
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
            }
        }
    }

    @Override // com.uc.webview.base.SdkGlobalSettings.Interface
    public final String get(int i) {
        try {
            this.f14265a.readLock().lock();
            return k.f14275a[i];
        } finally {
            this.f14265a.readLock().unlock();
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.uc.webview.base.SdkGlobalSettings.Interface
    public final Map<Integer, String> getModified() {
        try {
            this.f14265a.readLock().lock();
            if (this.b.isEmpty()) {
                this.f14265a.readLock().unlock();
                return null;
            }
            HashMap hashMap = new HashMap();
            for (int i = 0; i < this.b.size(); i++) {
                if (this.b.get(i)) {
                    hashMap.put(Integer.valueOf(i), k.f14275a[i]);
                }
            }
            this.f14265a.readLock().unlock();
            return hashMap;
        } catch (Throwable th) {
            this.f14265a.readLock().unlock();
            throw th;
        }
    }

    @Override // com.uc.webview.base.SdkGlobalSettings.Interface
    public final boolean isAccessible(int i, String str) {
        try {
            this.f14265a.readLock().lock();
            return SdkGlobalSettings.isAccessible(str, k.f14275a[i]);
        } finally {
            this.f14265a.readLock().unlock();
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.uc.webview.base.SdkGlobalSettings.Interface
    public final boolean set(int i, String str) {
        try {
            this.f14265a.writeLock().lock();
            this.b.set(i);
            String[] strArr = k.f14275a;
            if (!TextUtils.equals(str, strArr[i])) {
                strArr[i] = str;
                this.f14265a.writeLock().unlock();
                return true;
            }
            this.f14265a.writeLock().unlock();
            return false;
        } catch (Throwable th) {
            this.f14265a.writeLock().unlock();
            throw th;
        }
    }
}
