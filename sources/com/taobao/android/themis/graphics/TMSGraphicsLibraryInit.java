package com.taobao.android.themis.graphics;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.b79;
import tb.bzn;
import tb.l6h;
import tb.lcn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TMSGraphicsLibraryInit {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ReentrantReadWriteLock.WriteLock b;
    public static final ReentrantReadWriteLock.ReadLock c;

    /* renamed from: a  reason: collision with root package name */
    public static volatile FetchStatus f9648a = FetchStatus.NOT_LOAD;
    public static boolean d = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum FetchStatus {
        NOT_LOAD,
        LOADING,
        LOAD_SUCCESS,
        LOAD_FAILURE
    }

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        b = reentrantReadWriteLock.writeLock();
        c = reentrantReadWriteLock.readLock();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19e69d67", new Object[0])).booleanValue();
        }
        FetchStatus b2 = b();
        FetchStatus fetchStatus = FetchStatus.LOAD_SUCCESS;
        if (b2 == fetchStatus) {
            return true;
        }
        try {
            f(FetchStatus.LOADING);
            b79 c2 = bzn.b().c("themis_gfx");
            if (c2.i()) {
                f(fetchStatus);
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, "themis|soInit", "themis_gfxremote sync fetch success, path: " + c2.d());
            } else if (d()) {
                f(fetchStatus);
                lcn.f(RVLLevel.Error, "themis|soInit", "themis_gfx load from system success");
            } else {
                f(FetchStatus.LOAD_FAILURE);
                if (c2.c() != null) {
                    RVLLevel rVLLevel2 = RVLLevel.Error;
                    lcn.f(rVLLevel2, "themis|soInit", "Remote So failed to sync fetch libthemis_gfx.so because of " + c2.c().toString());
                }
            }
        } catch (Throwable th) {
            f(FetchStatus.LOAD_FAILURE);
            RVLLevel rVLLevel3 = RVLLevel.Error;
            lcn.f(rVLLevel3, "themis|soInit", "Remote So failed to sync fetch libthemis_gfx.so because of " + th.getMessage());
        }
        return FetchStatus.LOAD_SUCCESS == b();
    }

    public static FetchStatus b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FetchStatus) ipChange.ipc$dispatch("9bb9c863", new Object[0]);
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = c;
            readLock.lock();
            FetchStatus fetchStatus = f9648a;
            readLock.unlock();
            return fetchStatus;
        } catch (Throwable th) {
            c.unlock();
            throw th;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0c1e4bc", new Object[0])).booleanValue();
        }
        return d;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("828c72d9", new Object[0])).booleanValue();
        }
        try {
            System.loadLibrary("themis_gfx");
            return true;
        } catch (Throwable th) {
            RVLLevel rVLLevel = RVLLevel.Error;
            lcn.f(rVLLevel, "themis|soInit", "failed to load libthemis_gfx.so because of " + th.getMessage());
            return false;
        }
    }

    public static boolean e() {
        l6h c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("709f41bb", new Object[0])).booleanValue();
        }
        try {
            c2 = bzn.d().c("themis_gfx");
            d = c2.h().contains("resolve");
        } catch (Throwable th) {
            RVLLevel rVLLevel = RVLLevel.Error;
            lcn.f(rVLLevel, "themis|soInit", "failed to remote load libthemis_gfx.so because of " + th.getMessage());
            f(FetchStatus.LOAD_FAILURE);
        }
        if (!c2.i()) {
            return d();
        }
        f(FetchStatus.LOAD_SUCCESS);
        return true;
    }

    public static void f(FetchStatus fetchStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3094cb", new Object[]{fetchStatus});
            return;
        }
        try {
            ReentrantReadWriteLock.WriteLock writeLock = b;
            writeLock.lock();
            f9648a = fetchStatus;
            writeLock.unlock();
        } catch (Throwable th) {
            b.unlock();
            throw th;
        }
    }
}
